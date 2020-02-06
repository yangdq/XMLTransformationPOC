<xsl:stylesheet version='2.0' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' 
xmlns:document="http://services.vida.psi.com/DocumentServices/1.0"
xmlns:ns3="http://services.vida.psi.com/LetterManagement/1.0" 
xmlns:tns="http://services.vida.psi.com/ClientManagement/1.0"
xmlns:svc="http://webservice.flhk.com/Service/1.0"> 
    <xsl:output encoding='UTF-8' indent='yes' method='xml'/>

  <!-- xsl:template match="*">
    <xsl:element name="{name()}" namespace="http://webservice.flhk.com/FLHKWebService/1.0">
      <xsl:apply-templates/>
    </xsl:element>
  </xsl:template-->
  
  <!-- xsl:template match="*">
    <xsl:if test="node-name(.) = QName('http://services.vida.psi.com/LetterManagement/1.0', 'insertLetterPDFLinksResponse') ">
        <xsl:element name="{name()}" namespace="http://webservice.flhk.com/FLHKWebService/1.0">
      		<xsl:apply-templates/>
    	</xsl:element>
    </xsl:if>
     <xsl:if test="node-name(.) != QName('http://services.vida.psi.com/LetterManagement/1.0', 'insertLetterPDFLinksResponse') ">
        <xsl:element name="{name()}">
      		<xsl:apply-templates/>
    	</xsl:element>
    </xsl:if>

  </xsl:template-->
  
  <xsl:template match="document:documentArrivedResponse">
    <xsl:element name="{name()}" namespace="http://webservice.flhk.com/DocumentServices/1.0">
		<serviceReply xmlns="http://webservice.flhk.com/Service/1.0">
			<serviceReplyStatus><xsl:value-of select = "serviceReply/serviceReplyStatus"/></serviceReplyStatus>
			<message><xsl:value-of select = "serviceReply/message"/></message>
		</serviceReply>
    </xsl:element>
  </xsl:template>  
  
  
  <xsl:template match="tns:accountSearchResponse">
    <xsl:element name="accountSearchResponse" namespace="http://webservice.flhk.com/DocumentServices/1.0">
    	<xsl:for-each-group select="searchResult" group-by="accountNumber">
    	  <searchResult>
    		<accountNumber><xsl:value-of select="current-grouping-key()"/></accountNumber>
    		<webConfirmationId><xsl:value-of select = "current-group()[1]/webConfirmationId"/></webConfirmationId>
	        <homeAddress1><xsl:value-of select = "current-group()[1]/homeAddress1"/></homeAddress1>
	        <homeCity><xsl:value-of select = "current-group()[1]/homeCity"/></homeCity>
	        <homeZipCode><xsl:value-of select = "current-group()[1]/homeZipCode"/></homeZipCode>
			<xsl:for-each select="current-group()">
				<members>
					<firstName><xsl:value-of select="firstName"/></firstName>
      				<lastName><xsl:value-of select="lastName"/></lastName>
				    <ssn><xsl:value-of select="ssn"/></ssn>
				    <memberType><xsl:value-of select="memberType"/></memberType>				
				</members>	
		    </xsl:for-each>
		  </searchResult>
	    </xsl:for-each-group> 
    </xsl:element>
  </xsl:template>  
  
  <xsl:template match="ns3:insertLetterPDFLinksResponse">
    <xsl:element name="{name()}" namespace="http://webservice.flhk.com/FLHKWebService/1.0">
      <xsl:apply-templates/>
    </xsl:element>
  </xsl:template>
  
  <xsl:template match="*">
    <xsl:element name="{name()}">
      <xsl:apply-templates/>
    </xsl:element>
  </xsl:template>
</xsl:stylesheet>