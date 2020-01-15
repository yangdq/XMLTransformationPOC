package com.soap.ws.xquery.transform.demo.endpoint;

import java.io.StringWriter;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.psi.vida.logging.ws.services.LogMessage;
import com.psi.vida.logging.ws.services.LogMessageResponse;
import com.psi.vida.logging.ws.services.WsAuditStatusEnum;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinks;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinksResponse;
import com.soap.ws.xquery.transform.demo.resource.FileService;
import com.soap.ws.xquery.transform.demo.resource.VidaService;

@Endpoint
public class OsbEndpoint {

//	@Autowired
//	TransformationService transformService;

	@Autowired
	FileService fileService;

	@Autowired
	VidaService vidaService;
	  
	@Autowired
	Marshaller jaxbMarshaller;

	@PayloadRoot(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", localPart = "insertLetterPDFLinks")
	@ResponsePayload
	public InsertLetterPDFLinksResponse processOsbRequest(
			@RequestPayload InsertLetterPDFLinks insertLetterPdfLinksOsbRequest, MessageContext mc)
			throws Exception {

//		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//		File inputXmlFile = new File("data/InsertLetterPDFLinksRequestInput.xml");
//		jaxbMarshaller.marshal(insertLetterPdfLinksOsbRequest, inputXmlFile);
		InsertLetterPDFLinksResponse response = vidaService.callVidaPDFLinksEndPoint(insertLetterPdfLinksOsbRequest);
		
		// WS Call for request logging
		requestPostToWSAuditLog(insertLetterPdfLinksOsbRequest, insertLetterPdfLinksOsbRequest.getTransactionId());		
		return response;
	}
	
	private void requestPostToWSAuditLog(Object request, String transactionId) throws Exception {
//		Marshaller mar = marshaller.createMarshaller();
//		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(request, sw);
		String requestPayloadStr = sw.toString();
		
		// Log payload to Vida logging service
		LogMessage logMsgRequest = new LogMessage();
		logMsgRequest.setPayload(requestPayloadStr);
		logMsgRequest.setStatus(WsAuditStatusEnum.REQUEST_RECEIVED);
		logMsgRequest.setTransactionName("StateAccountTransfer");
		logMsgRequest.setTransactionId(transactionId);	
				
		LogMessageResponse logResponse = vidaService.callVidaLoggerEndPoint(logMsgRequest);
		System.out.println("Log server response "+ logResponse.toString());		
	}

}
