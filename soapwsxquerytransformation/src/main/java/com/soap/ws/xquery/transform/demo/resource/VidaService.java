package com.soap.ws.xquery.transform.demo.resource;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Service;

import com.psi.vida.logging.ws.services.LogMessage;
import com.psi.vida.logging.ws.services.LogMessageResponse;
import com.psi.vida.services.documentservices._1.DocumentArrived;
import com.psi.vida.services.documentservices._1.DocumentArrivedResponse;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinks;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinksResponse;
import com.soap.ws.xquery.transform.demo.SOAPConnector;

@Service
public class VidaService {

	@Autowired
	SOAPConnector connector;
	
    @Value("${vida.letterWSServiceEndpoint}")
    private String letterWSServiceEndpoint;
    
    @Value("${vida.loggerWSServiceEndpoint}")
    private String loggerWSServiceEndpoint;
    
    @Value("${vida.documentWSServiceEndpoint}")
    private String documentWSServiceEndpoint;

	public InsertLetterPDFLinksResponse callVidaPDFLinksEndPoint(InsertLetterPDFLinks insertLetterPdfLinksVidaRequest) throws XmlMappingException, IOException, JAXBException {

		javax.xml.bind.JAXBElement<InsertLetterPDFLinksResponse> jaxbElement = (javax.xml.bind.JAXBElement<InsertLetterPDFLinksResponse>) connector.callWebService(
				letterWSServiceEndpoint,
				insertLetterPdfLinksVidaRequest);

		InsertLetterPDFLinksResponse insertLetterPDFLinksVidaResponse = (InsertLetterPDFLinksResponse) jaxbElement
				.getValue();
		
		return insertLetterPDFLinksVidaResponse;
	}
	
	public DocumentArrivedResponse callVidaDocumentEndPoint(DocumentArrived documentArrivedVidaRequest) throws XmlMappingException, IOException, JAXBException {

		javax.xml.bind.JAXBElement<DocumentArrivedResponse> jaxbElement = (javax.xml.bind.JAXBElement<DocumentArrivedResponse>) connector.callWebService(
				documentWSServiceEndpoint,
				documentArrivedVidaRequest);

		DocumentArrivedResponse documentArrivedVidaResponse = (DocumentArrivedResponse) jaxbElement
				.getValue();
		
		return documentArrivedVidaResponse;
	}

	public LogMessageResponse callVidaLoggerEndPoint(LogMessage logMessageRequest) throws XmlMappingException, IOException, JAXBException {

		javax.xml.bind.JAXBElement<LogMessageResponse> jaxbElement = (javax.xml.bind.JAXBElement<LogMessageResponse>) connector.callWebService(
				loggerWSServiceEndpoint,
				logMessageRequest);

		LogMessageResponse logMessageVidaResponse = (LogMessageResponse) jaxbElement
				.getValue();
		
		return logMessageVidaResponse;
	}

}