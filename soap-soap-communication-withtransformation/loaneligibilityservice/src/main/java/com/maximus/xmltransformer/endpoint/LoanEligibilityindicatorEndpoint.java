package com.maximus.xmltransformer.endpoint;

import java.io.ByteArrayOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.maximus.xmltransformer.loaneligibility.PersonDetailsRequest;
import com.maximus.xmltransformer.loaneligibility.PersonDetailsResponse;
import com.maximus.xmltransformer.xmltransformerservice.LoanEligibilityService;
import com.maximus.xmltransformer.xmltransformerservice.TransformationService;

@Endpoint
public class LoanEligibilityindicatorEndpoint {

	public static final String UPDATEACCOUNTDATAURL = "http://www.maximus.com/loaneligibility/person";

	@Autowired
	private LoanEligibilityService service;
	
	@Autowired
	private TransformationService transformationService;

	@PayloadRoot(namespace = UPDATEACCOUNTDATAURL, localPart = "PersonDetailsRequest")
	@ResponsePayload
	public PersonDetailsResponse getAccountData(@RequestPayload PersonDetailsRequest person,
			MessageContext messageContext) throws Exception {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		messageContext.getRequest().writeTo(outputStream);
		
		String toTransform = outputStream.toString();
		System.out.println("toTransform = "+toTransform);
		String transformedXmlData = transformationService.execute(toTransform);
		
		System.out.println("LoanEligibilityindicatorEndpoint transformedXmlData= "+transformedXmlData);
		return service.soapApiCall(outputStream.toString());
	}

}
