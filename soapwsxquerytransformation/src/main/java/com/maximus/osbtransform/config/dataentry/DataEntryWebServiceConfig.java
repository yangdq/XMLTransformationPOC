package com.maximus.osbtransform.config.dataentry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;

@EnableWs
@Configuration
public class DataEntryWebServiceConfig //extends CommonWebServiceConfig 
{
		
	public DataEntryWebServiceConfig() {
		super();
		//TODO:  Enable this line once the project is separated into multiple modules
//		ENDPOINT_URI= "FLHKServices/ProxyServices/DataEntryDailyBatchProxyService";
	}
		
	
	@Bean(name = "osbdataentryservices")
	public SimpleWsdl11Definition osblettermanagerws() {
		return new SimpleWsdl11Definition(new ClassPathResource("/wsdl/osbdataentryservices.wsdl"));
	}
	    
}
