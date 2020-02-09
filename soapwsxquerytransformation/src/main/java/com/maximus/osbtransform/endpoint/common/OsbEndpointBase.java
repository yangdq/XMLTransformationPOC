package com.maximus.osbtransform.endpoint.common;

import java.io.StringWriter;
import java.util.UUID;

import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;

import com.maximus.osbtransform.service.EmailService;
import com.maximus.osbtransform.service.VidaSOAPService;
import com.maximus.osbtransform.service.async.AsyncService;
import com.psi.vida.logging.ws.services.LogMessage;
import com.psi.vida.logging.ws.services.WsAuditStatusEnum;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public abstract class OsbEndpointBase {

	@Autowired
	protected VidaSOAPService vidaSOAPService;
	
	@Autowired
	protected EmailService emailService;
	
	@Autowired
	protected AsyncService asyncService;
	  
	@Autowired
	protected Marshaller jaxbMarshaller;
	

	
	protected void requestPostToWSAuditLog(Object request, String transactionId, String dcn) throws Exception {
		UUID uuid = UUID.randomUUID();
        String correlationId = uuid.toString();
		StringWriter sw = new StringWriter();
		jaxbMarshaller.marshal(request, sw);
		String requestPayloadStr = sw.toString();
		
		// Log payload to Vida logging service
		LogMessage logMsgRequest = new LogMessage();
		logMsgRequest.setPayload(requestPayloadStr);
		logMsgRequest.setStatus(WsAuditStatusEnum.REQUEST_RECEIVED);
		logMsgRequest.setTransactionName("StateAccountTransfer");
		logMsgRequest.setTransactionId(transactionId != null? transactionId : correlationId );	
		logMsgRequest.setCorrelationId(correlationId);
		logMsgRequest.setObjectType("DCN");
		logMsgRequest.setPrimaryObjectId(dcn);
		
		log.trace("\nrequestPostToWSAuditLog\n" + requestPayloadStr);
		asyncService.callVidaLoggerEndPoint(logMsgRequest);
				
//		Future<LogMessageResponse> asyncResponse = asyncService.callVidaLoggerEndPointWithResponse(logMsgRequest);
//		try {
//			LogMessageResponse logResponse = asyncResponse.get(5, TimeUnit.SECONDS);
//            System.out.println("Result from asynchronous process - " + logResponse);
//    		System.out.println("Log server response "+ logResponse.toString());	
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	    while (true) {
//	        if (asyncResponse.isDone()) {
//	        	LogMessageResponse logResponse = asyncResponse.get(5, TimeUnit.SECONDS);
//	            System.out.println("Result from asynchronous process - " + logResponse);
//	    		System.out.println("Log server response "+ logResponse.toString());		
//	            break;
//	        }
//	        System.out.println("\nWaiting Asynchronous call to complete. ");
//	        System.out.println("\n....................................... ");
//	        Thread.sleep(1000);
//	    }
	}

}
