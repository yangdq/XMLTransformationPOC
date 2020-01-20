<xsl:stylesheet version='2.0' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' xmlns:ns="http://webservice.flhk.com/FLHKWebService/1.0" 
xmlns:document="http://webservice.flhk.com/DocumentServices/1.0"> 
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