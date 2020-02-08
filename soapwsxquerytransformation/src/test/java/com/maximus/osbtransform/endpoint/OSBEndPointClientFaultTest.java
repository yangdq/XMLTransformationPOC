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
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OSBEndPointClientFaultTest {
    @Autowired
    private ApplicationContext applicationContext;

    private MockWebServiceClient mockClient;
    //private Resource xsdSchema = new ClassPathResource("xsd/beers.xsd");

    @Before
    public void init(){
        mockClient = MockWebServiceClient.createClient(applicationContext);
    }

   
    @Test
    public void processInsertLetterPdfLinksRequest_ClientFault() throws IOException {
        Source requestPayload = new StringSource(
                "<ns:insertLetterPDFLinks xmlns:ns=\"http://webservice.flhk.com/FLHKWebService/1.0\">" +
                "<transactionId2222>10000000000000004</transactionId2222>" + 
                "<fileName>14.pdf</fileName>" +
                "<filePath>https://imgpd0.corp.psi/DOCUMENT/2013/12/28/8467764.pdf</filePath>" +
                "</ns:insertLetterPDFLinks>");

        Source sampleResponsePayload = new StringSource(
        	      "     <SOAP-ENV:Fault xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">" + 
        	      "         <faultcode>SOAP-ENV:Client</faultcode>" + 
        	      "         <faultstring xml:lang=\"en\">Validation error</faultstring>\n" + 
        	      "      </SOAP-ENV:Fault>");
        
        Map<String, String> namespaces = Collections.singletonMap("SOAP-ENV",
                "http://schemas.xmlsoap.org/soap/envelope/");

        mockClient
                .sendRequest(withPayload(requestPayload))
                .andExpect(clientOrSenderFault())
                .andExpect(ResponseMatchers
                        .xpath("/SOAP-ENV:Fault/faultstring",namespaces).exists());
    }
   
}
