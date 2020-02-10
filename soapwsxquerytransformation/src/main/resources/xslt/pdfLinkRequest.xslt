<xsl:stylesheet version='2.0' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' xmlns:ns="http://webservice.flhk.com/FLHKWebService/1.0" 
xmlns:document="http://webservice.flhk.com/DocumentServices/1.0"
xmlns:vidadoc="http://services.vida.psi.com/DocumentServices/1.0"
xmlns:client="http://services.vida.psi.com/ClientManagement/1.0"
xmlns:dedb="http://webservice.flhk.com/DataEntryDailyBatchSchema/1.0"
xmlns:xs="http://www.w3.org/2001/XMLSchema"> 
    <xsl:output encoding='UTF-8' indent='yes' method='xml'/>

    <!-- copy everything into the output -->
    <!-- xsl:template match='@*|node()'>
        <xsl:copy>
            <xsl:apply-templates select='@*|node()'/>
        </xsl:copy>
    </xsl:template-->
    
  <!-- xsl:template match="*">
    <xsl:element name="{name()}" namespace="http://services.vida.psi.com/LetterManagement/1.0">
      <xsl:apply-templates/>
    </xsl:element>
  </xsl:template-->
  
  <!-- Working Example xsl:template match="*">
    <xsl:if test="node-name(.) = QName('http://webservice.flhk.com/FLHKWebService/1.0', 'insertLetterPDFLinks') ">
        <xsl:element name="{name()}" namespace="http://services.vida.psi.com/LetterManagement/1.0">
      		<xsl:apply-templates/>
    	</xsl:element>
    </xsl:if>
     <xsl:if test="node-name(.) != QName('http://webservice.flhk.com/FLHKWebService/1.0', 'insertLetterPDFLinks') ">
        <xsl:element name="{name()}">
      		<xsl:apply-templates/>
    	</xsl:element>
    </xsl:if>

  </xsl:template-->
  
  <!-- xsl:template match="*">
	<xsl:element name="insertLetterPDFLinks" namespace="http://services.vida.psi.com/LetterManagement/1.0">
		 <transactionId>1000</transactionId>
         <fileName>1000</fileName>
         <filePath>1000</filePath>		
	</xsl:element>
  </xsl:template-->
  
  <xsl:template match="document:documentArrivedRequest">
    <xsl:element name="documentArrived" namespace="http://services.vida.psi.com/DocumentServices/1.0">
	    <documentMetadata>
	    	<sourceBatchReference><xsl:value-of select = "document:documentMetadata/batchNumber"/></sourceBatchReference>
	    	<envelopeControlNumber><xsl:value-of select = "document:documentMetadata/ecn"/></envelopeControlNumber>
	    	<documentControlNumber><xsl:value-of select = "document:documentMetadata/dcn"/></documentControlNumber>
	    	<documentType><xsl:value-of select = "document:documentMetadata/documentType"/></documentType>
	    	<inboundDocumentSource><xsl:value-of select = "document:documentMetadata/mediaSource"/></inboundDocumentSource>
	        <accountNumber><xsl:value-of select = "document:documentMetadata/accountNumber"/></accountNumber>
	        <webConfirmationId><xsl:value-of select = "document:documentMetadata/webConfirmationId"/></webConfirmationId>
	        <receivedDate><xsl:value-of select = "document:documentMetadata/receiveDate"/></receivedDate>
	        <scanDate><xsl:value-of select = "document:documentMetadata/scanDate"/></scanDate>
	        <unreadable><xsl:value-of select = "document:documentMetadata/unreadable"/></unreadable>
	        <missingPages><xsl:value-of select = "document:documentMetadata/missingPages"/></missingPages>
	        <alreadyWorked><xsl:value-of select = "document:documentMetadata/alreadyWorked"/></alreadyWorked>
	        <envelopeContainsRenewalDocument><xsl:value-of select = "document:documentMetadata/envelopeHasRenewalDocument"/></envelopeContainsRenewalDocument>
	        <envelopeContainsApplicationDocument><xsl:value-of select = "document:documentMetadata/envelopeHasApplicationDocument"/></envelopeContainsApplicationDocument>
	        <forwardingAddressPresent><xsl:value-of select = "document:documentMetadata/hasForwardingAddress"/></forwardingAddressPresent>
	        <letterId><xsl:value-of select = "document:documentMetadata/letterId"/></letterId>
	        <paymentAmount><xsl:value-of select = "document:documentMetadata/paymentAmount"/></paymentAmount>
	        <checkNumber><xsl:value-of select = "document:documentMetadata/checkNumber"/></checkNumber>
	        <imageLocation><xsl:value-of select = "document:documentMetadata/imageLocation"/></imageLocation>
	        <imageFormat><xsl:value-of select = "document:documentMetadata/imageFormat"/></imageFormat>
	        <webEnvNumber><xsl:value-of select = "document:documentMetadata/webEnvNumber"/></webEnvNumber>
	        <imageRefId><xsl:value-of select = "document:documentMetadata/imageRefId"/></imageRefId>
	        <webUploadDate><xsl:value-of select = "document:documentMetadata/webUploadDate"/></webUploadDate>
	    </documentMetadata> 
    </xsl:element>
  </xsl:template>
  
  <xsl:template match="document:accountSearchRequest">
    <xsl:element name="accountSearch" namespace="http://services.vida.psi.com/ClientManagement/1.0">
	    <searchCriteria>
            <accountNumber><xsl:value-of select = "searchCriteria/accountNumber"/></accountNumber>
            <city><xsl:value-of select = "searchCriteria/city"/></city>
            <firstName><xsl:value-of select = "searchCriteria/firstName"/></firstName>
            <lastName><xsl:value-of select = "searchCriteria/lastName"/></lastName>
            <line1><xsl:value-of select = "searchCriteria/line1"/></line1>
            <memberType><xsl:value-of select = "searchCriteria/memberType"/></memberType>
            <ssn><xsl:value-of select = "searchCriteria/ssn"/></ssn>
            <webConfirmationId><xsl:value-of select = "searchCriteria/webConfirmationId"/></webConfirmationId>
            <zipCode><xsl:value-of select = "searchCriteria/zipCode"/></zipCode>	    
	    </searchCriteria> 
    </xsl:element>
  </xsl:template>
  
  <xsl:template match="dedb:viewDataEntryDailyBatchRequest">
    <xsl:variable name="batchOnDate" as="xs:date" select="dedb:onDate"/>
    <xsl:element name="searchDataEntryDocuments" namespace="http://services.vida.psi.com/DocumentServices/1.0">
	    <selectApplications>True</selectApplications>
	    <createdOn>
	      <day><xsl:value-of select="day-from-date($batchOnDate)"/></day>
	      <month><xsl:value-of select="month-from-date($batchOnDate)"/></month>
	      <year><xsl:value-of select="year-from-date($batchOnDate)"/></year>	    
	    </createdOn>
    </xsl:element>
  </xsl:template>
   
  
  <xsl:template match="ns:insertLetterPDFLinks">
    <xsl:element name="{name()}" namespace="http://services.vida.psi.com/LetterManagement/1.0">
      <xsl:apply-templates/>
    </xsl:element>
  </xsl:template>
  
  <xsl:template match="*">
    <xsl:element name="{name()}">
      <xsl:apply-templates/>
    </xsl:element>
  </xsl:template>
</xsl:stylesheet>