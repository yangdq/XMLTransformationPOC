<xsl:stylesheet version='2.0' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' 
xmlns:document="http://services.vida.psi.com/DocumentServices/1.0"
xmlns:ns3="http://services.vida.psi.com/LetterManagement/1.0" 
xmlns:tns="http://services.vida.psi.com/ClientManagement/1.0"> 
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
      <xsl:apply-templates/>
    </xsl:element>
  </xsl:template>  
  
  <xsl:template match="tns:accountSearchResponse">
    <xsl:element name="accountSearchResponse" namespace="http://webservice.flhk.com/DocumentServices/1.0">
    	<xsl:for-each select = "searchResult"> 
	    	<searchResult>
	            <accountNumber><xsl:value-of select = "accountNumber"/></accountNumber>
	            <webConfirmationId><xsl:value-of select = "webConfirmationId"/></webConfirmationId>
	            <homeAddress1><xsl:value-of select = "homeAddress1"/></homeAddress1>
	            <homeCity><xsl:value-of select = "homeCity"/></homeCity>
	            <homeZipCode><xsl:value-of select = "homeZipCode"/></homeZipCode>
	            <members></members>	 
	    	</searchResult>
	    </xsl:for-each> 
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