package com.maximus.osbtransform.config.document;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

import com.maximus.osbtransform.config.common.WebServiceConfig;

@EnableWs
@Configuration
public class DocumentWebServiceConfig extends WebServiceConfig {
		
	public DocumentWebServiceConfig() {
		super();
		ENDPOINT_URI= "FLHKServices/DocumentService";
	}
		

	@Bean(name = "osbdocumentservice")
	public SimpleWsdl11Definition osbdocumentservicews() {
		return new SimpleWsdl11Definition(new ClassPathResource("/wsdl/osbdocumentservices.wsdl"));
	}
}
