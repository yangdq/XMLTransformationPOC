package com.maximus.osbtransform.endpoint;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.clientOrSenderFault;
import static org.springframework.ws.test.server.ResponseMatchers.serverOrReceiverFault;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import javax.xml.transform.Source;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.ws.test.server.ResponseMatchers;
import org.springframework.xml.transform.StringSource;

/**
 * Spring-boot Integration test on the OSB endpoints.
 * @author daniel
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, 
properties = { "vida.letterWSServiceEndpoint=http://localhost:7001/notavailable",
		"vida.loggerWSServiceEndpoint=http://localhost:7001/notavailable",
		"vida.documentWSServiceEndpoint=http://localhost:7001/notavailable"})
public class OSBEndPointServerFaultTest {
    @Autowired
    private ApplicationContext applicationContext;

    private MockWebServiceClient mockClient;
    //private Resource xsdSchema = new ClassPathResource("xsd/beers.xsd");

    @Before
    public void init(){
        mockClient = MockWebServiceClient.createClient(applicationContext);
    }

    @Test
    public void processInsertLetterPdfLinksRequest_ServerFault() throws IOException {
        Source requestPayload = new StringSource(
                "<ns:insertLetterPDFLinks xmlns:ns=\"http://webservice.flhk.com/FLHKWebService/1.0\">" +
                "<transactionId>10000000000000004</transactionId>" + 
                "<fileName>406.pdf</fileName>" +
                "<filePath>https://imgpd0.corp.psi/DOCUMENT/2013/12/28/8467764.pdf</filePath>" +
                "</ns:insertLetterPDFLinks>");

        Source sampleResponsePayload = new StringSource(
        	      "     <SOAP-ENV:Fault xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">" + 
        	      "         <faultcode>SOAP-ENV:Server</faultcode>" + 
        	      "         <faultstring xml:lang=\"en\">I/O error: flcsvc01qf3.corp.psi; nested exception is java.net.UnknownHostException: flcsvc01qf3.corp.psi</faultstring>" + 
        	      "      </SOAP-ENV:Fault>");
        
        Map<String, String> namespaces = Collections.singletonMap("SOAP-ENV",
                "http://schemas.xmlsoap.org/soap/envelope/");

        mockClient
                .sendRequest(withPayload(requestPayload))
                .andExpect(serverOrReceiverFault())
                .andExpect(ResponseMatchers
                        .xpath("/SOAP-ENV:Fault/faultstring",namespaces).exists());
    }

}
