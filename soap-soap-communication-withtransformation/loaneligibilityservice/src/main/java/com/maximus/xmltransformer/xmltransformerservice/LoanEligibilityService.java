package com.maximus.xmltransformer.xmltransformerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maximus.xmltransformer.endpoint.SOAPConnector;
import com.maximus.xmltransformer.loaneligibility.PersonDetailsResponse;
import com.maximus.xmltransformer.loaneligibility.XmlRequest;
import com.maximus.xmltransformer.loaneligibility.XmlResponse;

@Service
public class LoanEligibilityService {

	@Autowired
	SOAPConnector connector;

	public PersonDetailsResponse soapApiCall(String detailsRequest) {

		XmlRequest request = new XmlRequest();
		request.setXmlRequest(detailsRequest);

		XmlResponse response = (XmlResponse) connector.callWebService("http://localhost:9090/ws/customerdetails/sambha",
				request);
		PersonDetailsResponse presponse = new PersonDetailsResponse();
		presponse.setResponse(response.getXmlResponse());

		return presponse;

	}

}
