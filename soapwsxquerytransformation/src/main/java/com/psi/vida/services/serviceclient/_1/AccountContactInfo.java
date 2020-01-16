//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:54 PM CST 
//


package com.psi.vida.services.serviceclient._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountContactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountContactInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="defaultLanguage" type="{http://services.vida.psi.com/ServiceClient/1.0}languagePreferenceEnum"/&gt;
 *         &lt;element name="emailBadAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doNotCallFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="homeAddress" type="{http://services.vida.psi.com/ServiceClient/1.0}address" minOccurs="0"/&gt;
 *         &lt;element name="homeAndMailingAddressAreSame" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jpaVersion" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="mailingAddress" type="{http://services.vida.psi.com/ServiceClient/1.0}address" minOccurs="0"/&gt;
 *         &lt;element name="noPhoneNumberProvided" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferredContactMethod" type="{http://services.vida.psi.com/ServiceClient/1.0}preferredContactMethod" minOccurs="0"/&gt;
 *         &lt;element name="smsContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountContactInfo", propOrder = {
    "defaultLanguage",
    "emailBadAddress",
    "accountId",
    "cellPhone",
    "doNotCallFlag",
    "emailAddress",
    "emailContactFlag",
    "homeAddress",
    "homeAndMailingAddressAreSame",
    "homePhone",
    "jpaVersion",
    "mailingAddress",
    "noPhoneNumberProvided",
    "password",
    "preferredContactMethod",
    "smsContactFlag"
})
public class AccountContactInfo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LanguagePreferenceEnum defaultLanguage;
    protected Boolean emailBadAddress;
    protected Long accountId;
    protected String cellPhone;
    protected boolean doNotCallFlag;
    protected String emailAddress;
    protected boolean emailContactFlag;
    protected Address homeAddress;
    protected boolean homeAndMailingAddressAreSame;
    protected String homePhone;
    protected Long jpaVersion;
    protected Address mailingAddress;
    protected boolean noPhoneNumberProvided;
    protected String password;
    @XmlSchemaType(name = "string")
    protected PreferredContactMethod preferredContactMethod;
    protected boolean smsContactFlag;

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguagePreferenceEnum }
     *     
     */
    public LanguagePreferenceEnum getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagePreferenceEnum }
     *     
     */
    public void setDefaultLanguage(LanguagePreferenceEnum value) {
        this.defaultLanguage = value;
    }

    /**
     * Gets the value of the emailBadAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmailBadAddress() {
        return emailBadAddress;
    }

    /**
     * Sets the value of the emailBadAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmailBadAddress(Boolean value) {
        this.emailBadAddress = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountId(Long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the cellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Sets the value of the cellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone(String value) {
        this.cellPhone = value;
    }

    /**
     * Gets the value of the doNotCallFlag property.
     * 
     */
    public boolean isDoNotCallFlag() {
        return doNotCallFlag;
    }

    /**
     * Sets the value of the doNotCallFlag property.
     * 
     */
    public void setDoNotCallFlag(boolean value) {
        this.doNotCallFlag = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailContactFlag property.
     * 
     */
    public boolean isEmailContactFlag() {
        return emailContactFlag;
    }

    /**
     * Sets the value of the emailContactFlag property.
     * 
     */
    public void setEmailContactFlag(boolean value) {
        this.emailContactFlag = value;
    }

    /**
     * Gets the value of the homeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the value of the homeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setHomeAddress(Address value) {
        this.homeAddress = value;
    }

    /**
     * Gets the value of the homeAndMailingAddressAreSame property.
     * 
     */
    public boolean isHomeAndMailingAddressAreSame() {
        return homeAndMailingAddressAreSame;
    }

    /**
     * Sets the value of the homeAndMailingAddressAreSame property.
     * 
     */
    public void setHomeAndMailingAddressAreSame(boolean value) {
        this.homeAndMailingAddressAreSame = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the jpaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getJpaVersion() {
        return jpaVersion;
    }

    /**
     * Sets the value of the jpaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setJpaVersion(Long value) {
        this.jpaVersion = value;
    }

    /**
     * Gets the value of the mailingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getMailingAddress() {
        return mailingAddress;
    }

    /**
     * Sets the value of the mailingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setMailingAddress(Address value) {
        this.mailingAddress = value;
    }

    /**
     * Gets the value of the noPhoneNumberProvided property.
     * 
     */
    public boolean isNoPhoneNumberProvided() {
        return noPhoneNumberProvided;
    }

    /**
     * Sets the value of the noPhoneNumberProvided property.
     * 
     */
    public void setNoPhoneNumberProvided(boolean value) {
        this.noPhoneNumberProvided = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the preferredContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredContactMethod }
     *     
     */
    public PreferredContactMethod getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Sets the value of the preferredContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredContactMethod }
     *     
     */
    public void setPreferredContactMethod(PreferredContactMethod value) {
        this.preferredContactMethod = value;
    }

    /**
     * Gets the value of the smsContactFlag property.
     * 
     */
    public boolean isSmsContactFlag() {
        return smsContactFlag;
    }

    /**
     * Sets the value of the smsContactFlag property.
     * 
     */
    public void setSmsContactFlag(boolean value) {
        this.smsContactFlag = value;
    }

}
