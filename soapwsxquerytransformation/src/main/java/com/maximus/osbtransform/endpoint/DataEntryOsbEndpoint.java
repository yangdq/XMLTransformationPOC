package com.maximus.osbtransform.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.maximus.osbtransform.endpoint.common.OsbEndpointBase;
import com.psi.vida.services.documentservices._1.SearchDataEntryDocuments;
import com.psi.vida.services.documentservices._1.SearchDataEntryDocumentsResponse;
import com.psi.vida.services.lettermanagement._1.InsertLetterPDFLinksResponse;

import lombok.extern.slf4j.Slf4j;

@Endpoint
@Slf4j
public class DataEntryOsbEndpoint extends OsbEndpointBase {

	
    @Value("${vida.documentWSServiceEndpoint}")
    private String documentWSServiceEndpoint;

	@PayloadRoot(namespace = "http://webservice.flhk.com/DataEntryDailyBatchSchema/1.0", localPart = "viewDataEntryDailyBatchRequest")
	@ResponsePayload
	public SearchDataEntryDocumentsResponse processInsertLetterPdfLinksOsbRequest(
			@RequestPayload SearchDataEntryDocuments dataEntrySearchRequest, MessageContext mc)
			throws Exception {
		
		SearchDataEntryDocumentsResponse response = vidaSOAPService.callVidaWSEndPoint(documentWSServiceEndpoint, dataEntrySearchRequest);
		// WS Call for request logging
//		requestPostToWSAuditLog(insertLetterPdfLinksOsbRequest, insertLetterPdfLinksOsbRequest.getTransactionId());		
		return response;
	}

}
