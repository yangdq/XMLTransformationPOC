package com.soap.ws.xquery.transform.demo.resource;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Service;

import com.soap.ws.xquery.transform.demo.SOAPConnector;
import com.soap.ws.xquery.transformer.vidaJaxbclasses.Confirmation;
import com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks;
import com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinksResponse;

@Service
public class VidaService {

	@Autowired
	SOAPConnector connector;
	Confirmation confirmation = new Confirmation();
	
    @Value("${vida.letterWSServiceEndpoint}")
    private String letterWSServiceEndpoint;

	public InsertLetterPDFLinksResponse callVidaEndPoint(InsertLetterPDFLinks insertLetterPdfLinksVidaRequest) throws XmlMappingException, IOException, JAXBException {

//		File transformedXmlInputFile = new File("data/InsertLetterPDFLinksRequestInput.xml");
//
//		JAXBContext jaxbContext = JAXBContext
//				.newInstance(com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks.class);
//		javax.xml.bind.Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//		com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks insertLetterPdfLinksVidaRequest = (com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks) jaxbUnmarshaller
//				.unmarshal(transformedXmlInputFile);

//		com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks convertedInsertLetterPdfLinksVidaRequest = convertReqToVidaEndPointRequest(
//				insertLetterPdfLinksVidaRequest);

		/*
		 * javax.xml.bind.JAXBElement jaxbElement = (javax.xml.bind.JAXBElement)
		 * connector.callWebService(
		 * "http://localhost:9090/ws/CustomerDetails/lettermanagerwsschema",
		 * convertedInsertLetterPdfLinksVidaRequest);
		 */

		// Service call to QF3
		javax.xml.bind.JAXBElement<InsertLetterPDFLinksResponse> jaxbElement = (javax.xml.bind.JAXBElement<InsertLetterPDFLinksResponse>) connector.callWebService(
				letterWSServiceEndpoint,
				insertLetterPdfLinksVidaRequest);

		InsertLetterPDFLinksResponse insertLetterPDFLinksVidaResponse = (InsertLetterPDFLinksResponse) jaxbElement
				.getValue();

//		InsertLetterPDFLinksResponse insertLetterPDFLinksOsbResponse = new InsertLetterPDFLinksResponse();
//		confirmation.setMessage(insertLetterPDFLinksVidaResponse.getReturn().getMessage());
//		confirmation.setServiceReply(ServiceReplyEnum.SUCCESS);
//
//		insertLetterPDFLinksOsbResponse.setReturn(confirmation);
//
//		return insertLetterPDFLinksOsbResponse;
		

		return insertLetterPDFLinksVidaResponse;

	}

//	private com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks convertReqToVidaEndPointRequest(
//			com.soap.ws.xquery.transformer.jaxbclasses.InsertLetterPDFLinks links) {
//		com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks vidaLink = new com.soap.ws.xquery.transformer.vidaJaxbclasses.InsertLetterPDFLinks();
//		vidaLink.setFileName(links.getFileName());
//		vidaLink.setFilePath(links.getFilePath());
//		return vidaLink;
//	}
}
