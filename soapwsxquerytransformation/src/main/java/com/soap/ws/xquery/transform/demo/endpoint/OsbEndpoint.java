package com.soap.ws.xquery.transform.demo.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.flhk.webservice.flhkwebservice._1.ViewAccountData;
import com.flhk.webservice.flhkwebservice._1.ViewAccountDataResponse;
import com.soap.ws.xquery.transform.demo.resource.TransformationService;

@Endpoint
public class OsbEndpoint {

	@Autowired
	TransformationService transformService;

	@PayloadRoot(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", localPart = "viewAccountData")
	@ResponsePayload
	public ViewAccountDataResponse processOsbRequest(@RequestPayload ViewAccountData request,
			MessageContext mc) throws Exception {

		boolean writeStatus = false;
		String transformedXmlData = null;
		boolean writeTransformedXmlStatus = false;
		
		// Write Request XML to file system
		writeStatus = transformService.writeRequest(mc);
		System.out.println("Status of Write Request xml to file system: " + writeStatus);

		if (writeStatus) {
			// Execute XQuery against the XML
			transformedXmlData = transformService.executeTransformation();
		} else {
			System.out.println("Write Request xml was not successful, hence skipped Transformation");
		}

		if (transformedXmlData != null) {
			System.out.println("XML Transformation successful, begin to write the Transformed XML to file system");
			writeTransformedXmlStatus = transformService.writeTransformedXmlData(transformedXmlData);
			System.out.println("Status of Write Transformed xml to file system: " + writeTransformedXmlStatus);
		} else {
			System.out.println("Status of Write Transformed xml to file system: " + writeTransformedXmlStatus);
		}
		
		if (writeTransformedXmlStatus) {
			// bind the transformed XML to another Message and then fire the call to soap service2
			System.out.println("Call Soap Web Service 2 with the transformed xml data from file system");

		} 
		ViewAccountDataResponse response = new ViewAccountDataResponse();
		return response;
	}

}
