//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addAccountNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAccountNote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNote" type="{http://services.vida.psi.com/ClientManagement/1.0}accountNote" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAccountNote", propOrder = {
    "accountNote"
})
@XmlRootElement(name = "addAccountNote")
public class AddAccountNote {

    protected AccountNote accountNote;

    /**
     * Gets the value of the accountNote property.
     * 
     * @return
     *     possible object is
     *     {@link AccountNote }
     *     
     */
    public AccountNote getAccountNote() {
        return accountNote;
    }

    /**
     * Sets the value of the accountNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountNote }
     *     
     */
    public void setAccountNote(AccountNote value) {
        this.accountNote = value;
    }

}
