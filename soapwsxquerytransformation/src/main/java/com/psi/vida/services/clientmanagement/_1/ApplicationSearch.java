//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicationSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicationSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchCriteria" type="{http://services.vida.psi.com/ClientManagement/1.0}appSearchCriteria" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicationSearch", propOrder = {
    "searchCriteria"
})
@XmlRootElement(name = "applicationSearch")
public class ApplicationSearch {

    protected AppSearchCriteria searchCriteria;

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AppSearchCriteria }
     *     
     */
    public AppSearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppSearchCriteria }
     *     
     */
    public void setSearchCriteria(AppSearchCriteria value) {
        this.searchCriteria = value;
    }

}
