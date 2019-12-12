package com.maximus.customerdetails.detailsservice;

import org.springframework.stereotype.Service;

import com.maximus.customerdetails.details.XmlRequest;
import com.maximus.customerdetails.details.XmlResponse;

@Service
public class DetailsService {

	public XmlResponse getXmlResponse(XmlRequest request) {
		System.out.println(request.getXmlRequest());
		XmlResponse response = new XmlResponse();
		response.setXmlResponse("Response Recieved");
		return response;
	}
}
