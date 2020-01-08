<xsl:stylesheet version='2.0' xmlns:xsl='http://www.w3.org/1999/XSL/Transform' xmlns:ns="http://webservice.flhk.com/FLHKWebService/1.0"> 
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