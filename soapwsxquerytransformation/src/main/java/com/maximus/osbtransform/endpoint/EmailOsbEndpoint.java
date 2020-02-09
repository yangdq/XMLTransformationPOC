package com.maximus.osbtransform.endpoint;

import java.io.PrintWriter;

import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.flhk.webservice.service._1.ServiceReply;
import com.flhk.webservice.service._1.ServiceReplyEnum;
import com.maximus.osbtransform.endpoint.common.OsbEndpointBase;
import com.psi.vida.services.email._1.SendEmail;

import lombok.extern.slf4j.Slf4j;

@Endpoint
@Slf4j
public class EmailOsbEndpoint extends OsbEndpointBase{

	@PayloadRoot(namespace = "http://services.vida.psi.com/email/1.0", localPart = "SendEmail")
	@ResponsePayload
	public ServiceReply emailServiceOsbRequest(
			@RequestPayload SendEmail emailRequest, MessageContext mc)
			throws Exception {
		log.debug("emailServiceOsbRequest:\n");
		jaxbMarshaller.marshal( emailRequest, new PrintWriter( System.out ) );
		
		emailService.sendEmail(emailRequest);
		
		ServiceReply response = new com.flhk.webservice.service._1.ObjectFactory().createServiceReply();
		response.setMessage("Email Delivered");
		response.setReply(ServiceReplyEnum.SUCCESS);
		// No need to log WS Call for account search only				
		return response;
	}

}
