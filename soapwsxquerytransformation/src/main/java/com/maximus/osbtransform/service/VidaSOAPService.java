package com.maximus.osbtransform.service;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Service;

import com.maximus.osbtransform.soapclient.SOAPConnector;

@Service
public class VidaSOAPService {

	@Autowired
	SOAPConnector connector;
	
	@SuppressWarnings("unchecked")
	public <T1, T2> T2 callVidaWSEndPoint(String endpoint, T1 request) throws XmlMappingException, IOException, JAXBException {

		javax.xml.bind.JAXBElement<T2> jaxbElement = (javax.xml.bind.JAXBElement<T2>) connector.callWebService(
				endpoint,
				request);

		T2 response =  (T2) jaxbElement.getValue();
		return response;
	}

}
