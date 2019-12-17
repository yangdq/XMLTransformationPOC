package com.soap.ws.xquery.transform.demo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
		MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
		messageDispatcherServlet.setApplicationContext(context);
		messageDispatcherServlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean<>(messageDispatcherServlet, "/osbws/*");
	}

//	@Bean(name = "transform")
//	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema transformSchema) {
//		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
//		definition.setPortTypeName("TransformPort");
//		definition.setTargetNamespace("http://webservice.flhk.com/FLHKWebService/1.0");
//		definition.setLocationUri("/osbws");
//		definition.setSchema(transformSchema);
//		return definition;
//	}
	
	@Bean(name = "transform")
	public SimpleWsdl11Definition orders() {
		return new SimpleWsdl11Definition(new ClassPathResource("transform.wsdl"));
	}

	@Bean
	public XsdSchema transformSchema() {
		return new SimpleXsdSchema(new ClassPathResource("transform-details.xsd"));
	}
}
