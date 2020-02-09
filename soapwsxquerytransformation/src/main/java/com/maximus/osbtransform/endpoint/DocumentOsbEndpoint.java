package com.maximus.osbtransform.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.maximus.osbtransform.endpoint.common.OsbEndpointBase;
import com.psi.vida.services.clientmanagement._1.AccountSearch;
import com.psi.vida.services.clientmanagement._1.AccountSearchResponse;
import com.psi.vida.services.documentservices._1.DocumentArrived;
import com.psi.vida.services.documentservices._1.DocumentArrivedResponse;

import lombok.extern.slf4j.Slf4j;

@Endpoint
@Slf4j
public class DocumentOsbEndpoint extends OsbEndpointBase{
	
    @Value("${vida.documentWSServiceEndpoint}")
    private String documentWSServiceEndpoint;
    
    @Value("${vida.clientManagWSServiceEndPoint}")
    private String clientManagWSServiceEndPoint; 

	@PayloadRoot(namespace = "http://webservice.flhk.com/DocumentServices/1.0", localPart = "documentArrivedRequest")
	@ResponsePayload
	public DocumentArrivedResponse processDocumentArrivedOsbRequest(
			@RequestPayload DocumentArrived documentArrivedRequest, MessageContext mc)
			throws Exception {
		
		// WS Call for request logging
		String dcn = documentArrivedRequest.getDocumentMetadata().getDocumentControlNumber();
		requestPostToWSAuditLog(documentArrivedRequest, null, dcn);		
		
		DocumentArrivedResponse response = vidaSOAPService.callVidaWSEndPoint(documentWSServiceEndpoint, documentArrivedRequest);	
		return response;
	}
	
	@PayloadRoot(namespace = "http://webservice.flhk.com/DocumentServices/1.0", localPart = "accountSearchRequest")
	@ResponsePayload
	public AccountSearchResponse processAccountSeearchOsbRequest(
			@RequestPayload AccountSearch accountSearchRequest, MessageContext mc)
			throws Exception {
		
		AccountSearchResponse response = vidaSOAPService.callVidaWSEndPoint(clientManagWSServiceEndPoint, accountSearchRequest);
		// No need to log WS Call for account search only				
		return response;
	}
	

}
