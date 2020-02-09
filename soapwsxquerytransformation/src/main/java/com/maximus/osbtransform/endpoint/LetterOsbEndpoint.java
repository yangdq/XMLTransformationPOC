package com.maximus.osbtransform.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.maximus.osbtransform.endpoint.common.OsbEndpointBase;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinks;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinksResponse;

import lombok.extern.slf4j.Slf4j;

@Endpoint
@Slf4j
public class LetterOsbEndpoint extends OsbEndpointBase {

	
    @Value("${vida.letterWSServiceEndpoint}")
    private String letterWSServiceEndpoint;

	@PayloadRoot(namespace = "http://webservice.flhk.com/FLHKWebService/1.0", localPart = "insertLetterPDFLinks")
	@ResponsePayload
	public InsertLetterPDFLinksResponse processInsertLetterPdfLinksOsbRequest(
			@RequestPayload InsertLetterPDFLinks insertLetterPdfLinksOsbRequest, MessageContext mc)
			throws Exception {
		
		InsertLetterPDFLinksResponse response = vidaSOAPService.callVidaWSEndPoint(letterWSServiceEndpoint, insertLetterPdfLinksOsbRequest);
		// WS Call for request logging
//		requestPostToWSAuditLog(insertLetterPdfLinksOsbRequest, insertLetterPdfLinksOsbRequest.getTransactionId());		
		return response;
	}

}
