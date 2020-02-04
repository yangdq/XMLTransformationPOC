package com.maximus.osbtransform.interceptor;

import javax.xml.transform.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.SoapMessage;

import com.maximus.osbtransform.interceptor.util.SoapUtil;
import com.maximus.osbtransform.service.async.AsyncService;
import com.psi.vida.logging.ws.services.LogMessage;
import com.psi.vida.logging.ws.services.WsAuditStatusEnum;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InsertPDFLinkLoggingInterceptor implements EndpointInterceptor
{
	public static final String TRANSACTION_ID = "transactionId";
	
	@Autowired
	AsyncService asyncService;	
	
    @Override
    public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
    	SoapMessage message = (SoapMessage) messageContext.getRequest();
		String soapMsgString = SoapUtil.convertSoapMsgToString(message);
		String transactionId = SoapUtil.findSOAPFieldValue(soapMsgString, TRANSACTION_ID);
		requestPostToWSAuditLog(soapMsgString, transactionId);
		log.debug("handleRequest requestPostToWSAuditLog\n " + soapMsgString);
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext, Object endpoint) throws Exception {
        log.debug("Global Response Handling");
        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext, Object endpoint) throws Exception {
        log.debug("Global Exception Handling");
        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Object endpoint, Exception ex) throws Exception {
        log.debug("Execute Code After Completion");
    }
    
	private void requestPostToWSAuditLog(String soapMessageStr, String transactionId) throws Exception {
		
		// Log payload to Vida logging service
		LogMessage logMsgRequest = new LogMessage();
		logMsgRequest.setPayload(soapMessageStr);
		logMsgRequest.setStatus(WsAuditStatusEnum.REQUEST_RECEIVED);
		logMsgRequest.setTransactionName("StateAccountTransfer");
		logMsgRequest.setTransactionId(transactionId);	
		
		log.trace("\nrequestPostToWSAuditLog\n" + soapMessageStr);
		asyncService.callVidaLoggerEndPoint(logMsgRequest);
			
	}

	public AsyncService getAsyncService() {
		return asyncService;
	}

	public void setAsyncService(AsyncService asyncService) {
		this.asyncService = asyncService;
	}
	
	
}


	
