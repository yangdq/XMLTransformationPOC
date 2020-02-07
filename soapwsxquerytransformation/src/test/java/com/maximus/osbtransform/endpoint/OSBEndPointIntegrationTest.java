package com.maximus.osbtransform.endpoint;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.noFault;
import static org.springframework.ws.test.server.ResponseMatchers.payload;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
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
public class OSBEndPointIntegrationTest {
    @Autowired
    private ApplicationContext applicationContext;

    private MockWebServiceClient mockClient;
    //private Resource xsdSchema = new ClassPathResource("xsd/beers.xsd");

    @Before
    public void init(){
        mockClient = MockWebServiceClient.createClient(applicationContext);
    }

    @Test
    public void processInsertLetterPdfLinksRequest_Success() throws IOException {
        Source requestPayload = new StringSource(
                "<ns:insertLetterPDFLinks xmlns:ns=\"http://webservice.flhk.com/FLHKWebService/1.0\">" +
                "<transactionId>10000000000000004</transactionId>" + 
                "<fileName>14.pdf</fileName>" +
                "<filePath>https://imgpd0.corp.psi/DOCUMENT/2013/12/28/8467764.pdf</filePath>" +
                "</ns:insertLetterPDFLinks>");

        Source responsePayload = new StringSource(
        	      "<ns3:insertLetterPDFLinksResponse xmlns:ns3=\"http://webservice.flhk.com/FLHKWebService/1.0\">" +
        	         "<return>" +
        	            "<message>success</message>" +
        	            "<serviceReply>SUCCESS</serviceReply>" +
        	         "</return>" +
        	      "</ns3:insertLetterPDFLinksResponse>");

        mockClient
                .sendRequest(withPayload(requestPayload))
                .andExpect(noFault())
                .andExpect(payload(responsePayload));
    }
    
    
    @Test
    public void transformDocumentArrivedOsbRequest_Success() throws IOException {
        Source requestPayload = new StringSource(
                "<ns:documentArrivedRequest xmlns:ns=\"http://webservice.flhk.com/DocumentServices/1.0\">" +
                	"<ns:documentMetadata>" +
	                   "<batchNumber>1233457</batchNumber>" +
	                   "<ecn>1112242</ecn>" +
	                   "<dcn>2223334</dcn>" +
	                   "<documentType>ADDRESS_CHANGE</documentType>" +
	                   "<mediaSource>MAIL</mediaSource>" +
	                   "<accountNumber>800000020</accountNumber>" +
	                   "<webConfirmationId>232435454</webConfirmationId>" +
	                   "<receiveDate>2020-01-12T09:00:00</receiveDate>" +
	                   "<scanDate>2020-01-12T11:00:00</scanDate>" +
	                   "<unreadable>false</unreadable>" +
	                   "<missingPages>false</missingPages>" +
	                   "<alreadyWorked>false</alreadyWorked>" +
	                   "<hasForwardingAddress>false</hasForwardingAddress>" +
	                   "<envelopeHasRenewalDocument>false</envelopeHasRenewalDocument>" +
	                   "<envelopeHasApplicationDocument>false</envelopeHasApplicationDocument>" +
	                   "<letterId>837443</letterId>" +
	                   "<paymentAmount>?</paymentAmount>" +
	                   "<checkNumber>1000086</checkNumber>" +
	                   "<imageLocation>?</imageLocation>" +
	                   "<imageFormat>PDF</imageFormat>" +
	                   "<webEnvNumber>233445664</webEnvNumber>" +
	                   "<imageRefId>?</imageRefId>" +
	                   "<webUploadDate>2020-01-13T09:00:00</webUploadDate>" +
	              "</ns:documentMetadata>" +
             "</ns:documentArrivedRequest>" );

        Source sampleResponsePayload = new StringSource(
        	      "<ns3:documentArrivedResponse xmlns:ns3=\"http://webservice.flhk.com/DocumentServices/1.0\">" +
        	         "<serviceReply xmlns=\"http://webservice.flhk.com/Service/1.0\">" +
        	            "<serviceReplyStatus>FAILURE</serviceReplyStatus>" +
        	            "<message>EJB Exception: ; nested exception is:" + 
        		"javax.persistence.PersistenceException: Exception [EclipseLink-4002] (Eclipse Persistence Services - 2.5.2.v20140319-9ad6abd): org.eclipse.persistence.exceptions.DatabaseException" +
        	"Internal Exception: java.sql.SQLIntegrityConstraintViolationException: ORA-00001: unique constraint (FLCPD0_VIDA.UQ_INBOUND_DOCMNT_DOC_CNTRL_NU) violated" +
        	"Error Code: 1" +
        	"Call: INSERT INTO INBOUND_DOCUMENT (DOCUMENT_ID, ACCOUNT_ID, ACCOUNT_LINK_STATUS, ACCOUNT_NUMBER, ALREADY_WORKED_FLAG, APP_SENT_STATUS_DATE, APPLICATION_ID, CHECK_NUMBER, DOCUMENT_CONTROL_NUMBER, DOCUMENT_SOURCE_SYSTEM, ENV_HAS_APP_DOC_FLAG, ENV_HAS_RENEW_DOC_FLAG, ENVELOPE_CONTROL_NUMBER, FORWARD_ADDRESS_PRESENT_FLAG, IMAGE_FORMAT, IMAGE_LOCATION, APP_SENT_STATUS, INBOUND_DOCUMENT_SOURCE, JPA_VERSION, LETTER_ID, MISSING_PAGES_FLAG, PAYMENT_AMOUNT, RECEIVED_DATE, SCAN_DATE, SOURCE_BATCH_REFERENCE, UNREADABLE_FLAG, UPDATE_DATE, WEB_CONFIRMATION_ID, WEB_ENVELOPE_NUMBER, WEB_UPLOAD_DATE, INBOUND_DOCUMENT_TYPE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)" +
        		"bind => [1000201, null, NEVER_LINKED_TO_ACCOUNT, 800000020, false, null, null, 1000086, 2223334, DCU, false, false, 1112242, false, PDF, ?, null, MAIL, 1, 837443, false, null, 2020-01-12 09:00:00.953, 2020-01-12 11:00:00.0, 1233457, false, null, 232435454, null, 2020-01-13 09:00:00.953, ADDRESS_CHANGE]" +
        	"Query: InsertObjectQuery(com.psi.vida.domain.InboundDocument@6c1a9c1d)</message>" +
        	         "</serviceReply>" +
        	      "</ns3:documentArrivedResponse>");
        
        Map<String, String> namespaces = new HashMap<String, String>();
        namespaces.put("ns3", "http://webservice.flhk.com/DocumentServices/1.0");
        namespaces.put("svc", "http://webservice.flhk.com/Service/1.0");

        mockClient
                .sendRequest(withPayload(requestPayload))
                .andExpect(noFault())
                .andExpect(ResponseMatchers
                        .xpath("/ns3:documentArrivedResponse/svc:serviceReplyStatus",
                                namespaces)
                        .exists());//.andExpect(payload(responsePayload));
    }
    
    @Test
    public void accountSearchOsbRequest_Success() throws IOException {
        Source requestPayload = new StringSource(
                "<ns:accountSearchRequest xmlns:ns=\"http://webservice.flhk.com/DocumentServices/1.0\">" + 
                "         <searchCriteria>\n" + 
                "            <accountNumber>8200000053</accountNumber>\n" + 
                "            <zipCode></zipCode>\n" + 
                "         </searchCriteria>\n" + 
                " </ns:accountSearchRequest>");

        Source sampleResponsePayload = new StringSource(
        	      "<accountSearchResponse xmlns=\"http://webservice.flhk.com/DocumentServices/1.0\">\n" + 
        	      "         <searchResult xmlns=\"\" xmlns:document=\"http://services.vida.psi.com/DocumentServices/1.0\" xmlns:ns3=\"http://services.vida.psi.com/LetterManagement/1.0\" xmlns:tns=\"http://services.vida.psi.com/ClientManagement/1.0\">\n" + 
        	      "            <accountNumber>8200000053</accountNumber>\n" + 
        	      "            <webConfirmationId>FLWA9655871580464038</webConfirmationId>\n" + 
        	      "            <homeAddress1>1327 CHARLES CT</homeAddress1>\n" + 
        	      "            <homeCity>STARKE</homeCity>\n" + 
        	      "            <homeZipCode>32091-2006</homeZipCode>\n" + 
        	      "            <members>\n" + 
        	      "               <firstName>MOI</firstName>\n" + 
        	      "               <lastName>ROY</lastName>\n" + 
        	      "               <ssn>567567575</ssn>\n" + 
        	      "               <memberType/>\n" + 
        	      "            </members>\n" + 
        	      "            <members>\n" + 
        	      "               <firstName>RIL</firstName>\n" + 
        	      "               <lastName>ROY</lastName>\n" + 
        	      "               <ssn>567756485</ssn>\n" + 
        	      "               <memberType>PARENT1</memberType>\n" + 
        	      "            </members>\n" + 
        	      "         </searchResult>\n" + 
        	      "      </accountSearchResponse>\n");
        
        Map<String, String> namespaces = Collections.singletonMap("ns3",
                "http://webservice.flhk.com/DocumentServices/1.0");

        mockClient
                .sendRequest(withPayload(requestPayload))
                .andExpect(noFault())
                .andExpect(ResponseMatchers
                        .xpath("/ns3:accountSearchResponse/searchResult/accountNumber",
                                namespaces).evaluatesTo("8200000053")//.exists()
                        );//.andExpect(payload(responsePayload));
    }
}
