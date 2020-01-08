<xsl:stylesheet version='2.0' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' xmlns:ns="http://webservice.flhk.com/FLHKWebService/1.0"
xmlns:ns3="http://services.vida.psi.com/LetterManagement/1.0"> 
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