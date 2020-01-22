package com.maximus.osbtransform.service.async;

import java.io.IOException;
import java.util.concurrent.Future;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.XmlMappingException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.maximus.osbtransform.soapclient.SOAPConnector;
import com.psi.vida.logging.ws.services.LogMessage;
import com.psi.vida.logging.ws.services.LogMessageResponse;

@Service
public class AsyncService {
	@Autowired
	SOAPConnector connector;
    
    @Value("${vida.loggerWSServiceEndpoint}")
    private String loggerWSServiceEndpoint;


    @Async
	public void callVidaLoggerEndPoint(LogMessage logMessageRequest) throws XmlMappingException, IOException, JAXBException {

    	connector.callWebService(
				loggerWSServiceEndpoint,
				logMessageRequest);
	}
    
    @Async
	@SuppressWarnings("unchecked")
	public Future<LogMessageResponse> callVidaLoggerEndPointWithResponse(LogMessage logMessageRequest) 
			throws XmlMappingException, IOException, JAXBException {

		javax.xml.bind.JAXBElement<LogMessageResponse> jaxbElement = (javax.xml.bind.JAXBElement<LogMessageResponse>) connector.callWebService(
				loggerWSServiceEndpoint,
				logMessageRequest);

		LogMessageResponse logMessageVidaResponse = (LogMessageResponse) jaxbElement
				.getValue();
		
		return new AsyncResult<LogMessageResponse>(logMessageVidaResponse);
	}
}
