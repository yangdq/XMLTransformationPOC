package com.maximus.customerdetails.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.maximus.customerdetails.details.XmlRequest;
import com.maximus.customerdetails.details.XmlResponse;
import com.maximus.customerdetails.detailsservice.DetailsService;

@Endpoint
public class DetailsEndpoint {

	private static final String TEST_URL = "http://www.maximus.com/customerdetails/sambha";
	@Autowired
	private DetailsService service;

	@PayloadRoot(namespace = TEST_URL, localPart = "XmlRequest")
	@ResponsePayload
	public XmlResponse getXmlResponse(@RequestPayload XmlRequest request) {
		return service.getXmlResponse(request);
	}

}
