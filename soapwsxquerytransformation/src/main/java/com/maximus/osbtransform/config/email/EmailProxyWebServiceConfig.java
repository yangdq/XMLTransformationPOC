package com.maximus.osbtransform.config.email;

import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

import com.maximus.osbtransform.soapclient.SOAPConnector;

@EnableWs
@Configuration
public class EmailProxyWebServiceConfig //extends CommonWebServiceConfig 
{
		
	public EmailProxyWebServiceConfig() {
		super();
		//TODO:  Enable this line once the project is separated into multiple modules
		//ENDPOINT_URI= "FLHKServices/ProxyServices/EmailWSProxyService";
	}	

	
	@Bean(name = "osbemailservice")
	public SimpleWsdl11Definition osbemailservicews() {
		return new SimpleWsdl11Definition(new ClassPathResource("/wsdl/emailWebService.wsdl"));
	}

}
