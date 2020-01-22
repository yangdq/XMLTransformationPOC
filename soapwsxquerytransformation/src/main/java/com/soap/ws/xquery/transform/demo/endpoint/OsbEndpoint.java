package com.soap.ws.xquery.transform.demo.endpoint;

import java.io.StringWriter;

import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.psi.vida.logging.ws.services.LogMessage;
import com.psi.vida.logging.ws.services.WsAuditStatusEnum;
import com.psi.vida.services.documentservices._1.DocumentArrived;
import com.psi.vida.services.documentservices._1.DocumentArrivedResponse;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinks;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinksResponse;
import com.soap.ws.xquery.transform.demo.async.AsyncService;
import com.soap.ws.xquery.transform.demo.resource.VidaSOAPService;

import lombok.extern.slf4j.Slf4j;

@Endpoint
@Slf4j
public class OsbEndpoint {
	
//	@Autowired
//	FileService fileService;

	@Autowired
	VidaSOAPService vidaSOAPService;
	
	@Autowired
	AsyncService asyncService;
	  
	@Autowired
	Marshaller jaxbMarshaller;

	@PayloadRoot(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", localPart = "insertLetterPDFLinks")
	@ResponsePayload
	public InsertLetterPDFLinksResponse processInsertLetterPdfLinksOsbRequest(
			@RequestPayload InsertLetterPDFLinks insertLetterPdfLinksOsbRequest, MessageContext mc)
			throws Exception {
		
		InsertLetterPDFLinksResponse response = vidaSOAPService.callVidaPDFLinksEndPoint(insertLetterPdfLinksOsbRequest);
		// WS Call for request logging
		requestPostToWSAuditLog(insertLetterPdfLinksOsbRequest, insertLetterPdfLinksOsbRequest.getTransactionId());		
		return response;
	}
	
	@PayloadRoot(namespace = "http://webservice.flhk.com/DocumentServices/1.0", localPart = "documentArrivedRequest")
	@ResponsePayload
	public DocumentArrivedResponse processDocumentArrivedOsbRequest(
			@RequestPayload DocumentArrived documentArrivedRequest, MessageContext mc)
			throws Exception {
		
		DocumentArrivedResponse response = vidaSOAPService.callVidaDocumentEndPoint(documentArrivedRequest);
		// WS Call for request logging
		requestPostToWSAuditLog(documentArrivedRequest, null);				
		return response;
	}
	
	private void requestPostToWSAuditLog(Object request, String transactionId) throws Exception {
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(request, sw);
		String requestPayloadStr = sw.toString();
		
		// Log payload to Vida logging service
		LogMessage logMsgRequest = new LogMessage();
		logMsgRequest.setPayload(requestPayloadStr);
		logMsgRequest.setStatus(WsAuditStatusEnum.REQUEST_RECEIVED);
		logMsgRequest.setTransactionName("StateAccountTransfer");
		logMsgRequest.setTransactionId(transactionId);	
		
		log.trace("\nrequestPostToWSAuditLog\n" + requestPayloadStr);
		asyncService.callVidaLoggerEndPoint(logMsgRequest);
				
//		Future<LogMessageResponse> asyncResponse = asyncService.callVidaLoggerEndPointWithResponse(logMsgRequest);
//		try {
//			LogMessageResponse logResponse = asyncResponse.get(5, TimeUnit.SECONDS);
//            System.out.println("Result from asynchronous process - " + logResponse);
//    		System.out.println("Log server response "+ logResponse.toString());	
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	    while (true) {
//	        if (asyncResponse.isDone()) {
//	        	LogMessageResponse logResponse = asyncResponse.get(5, TimeUnit.SECONDS);
//	            System.out.println("Result from asynchronous process - " + logResponse);
//	    		System.out.println("Log server response "+ logResponse.toString());		
//	            break;
//	        }
//	        System.out.println("\nWaiting Asynchronous call to complete. ");
//	        System.out.println("\n....................................... ");
//	        Thread.sleep(1000);
//	    }
	}

}
