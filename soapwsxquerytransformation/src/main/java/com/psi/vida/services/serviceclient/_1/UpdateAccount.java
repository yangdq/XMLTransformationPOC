//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.22 at 11:47:15 AM CST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateAccountData" type="{http://services.vida.psi.com/ServiceClient/1.0}updateAccountData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateAccount", propOrder = {
    "updateAccountData"
})
@XmlRootElement(name = "updateAccount")
public class UpdateAccount {

    protected UpdateAccountData updateAccountData;

    /**
     * Gets the value of the updateAccountData property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAccountData }
     *     
     */
    public UpdateAccountData getUpdateAccountData() {
        return updateAccountData;
    }

    /**
     * Sets the value of the updateAccountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAccountData }
     *     
     */
    public void setUpdateAccountData(UpdateAccountData value) {
        this.updateAccountData = value;
    }

}
