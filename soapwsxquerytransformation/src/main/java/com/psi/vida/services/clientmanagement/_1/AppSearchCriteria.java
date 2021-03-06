//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for appSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appSearchCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.vida.psi.com/ClientManagement/1.0}searchBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountNumberString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationEnteredTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="applicationSource" type="{http://services.vida.psi.com/ClientManagement/1.0}applicationSourceEnum" minOccurs="0"/&gt;
 *         &lt;element name="applicationStatus" type="{http://services.vida.psi.com/ClientManagement/1.0}applicationStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="applicationType" type="{http://services.vida.psi.com/ClientManagement/1.0}applicationTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://services.vida.psi.com/ClientManagement/1.0}calendarDay" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchBothAddresses" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="memberType" type="{http://services.vida.psi.com/ClientManagement/1.0}memberTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="middleInitial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="receivedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ssn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appSearchCriteria", propOrder = {
    "accountNumberString",
    "applicationEnteredTimestamp",
    "applicationSource",
    "applicationStatus",
    "applicationType",
    "city",
    "dateOfBirth",
    "firstName",
    "lastName",
    "line1",
    "matchBothAddresses",
    "memberType",
    "middleInitial",
    "receivedDate",
    "receivedEndDate",
    "ssn",
    "webApplicationId",
    "zipCode"
})
public class AppSearchCriteria
    extends SearchBase
{

    protected String accountNumberString;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar applicationEnteredTimestamp;
    @XmlSchemaType(name = "string")
    protected ApplicationSourceEnum applicationSource;
    @XmlSchemaType(name = "string")
    protected ApplicationStatusEnum applicationStatus;
    @XmlSchemaType(name = "string")
    protected ApplicationTypeEnum applicationType;
    protected String city;
    protected CalendarDay dateOfBirth;
    protected String firstName;
    protected String lastName;
    protected String line1;
    protected boolean matchBothAddresses;
    @XmlSchemaType(name = "string")
    protected MemberTypeEnum memberType;
    protected String middleInitial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedEndDate;
    protected String ssn;
    protected String webApplicationId;
    protected String zipCode;

    /**
     * Gets the value of the accountNumberString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberString() {
        return accountNumberString;
    }

    /**
     * Sets the value of the accountNumberString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberString(String value) {
        this.accountNumberString = value;
    }

    /**
     * Gets the value of the applicationEnteredTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplicationEnteredTimestamp() {
        return applicationEnteredTimestamp;
    }

    /**
     * Sets the value of the applicationEnteredTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplicationEnteredTimestamp(XMLGregorianCalendar value) {
        this.applicationEnteredTimestamp = value;
    }

    /**
     * Gets the value of the applicationSource property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationSourceEnum }
     *     
     */
    public ApplicationSourceEnum getApplicationSource() {
        return applicationSource;
    }

    /**
     * Sets the value of the applicationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationSourceEnum }
     *     
     */
    public void setApplicationSource(ApplicationSourceEnum value) {
        this.applicationSource = value;
    }

    /**
     * Gets the value of the applicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationStatusEnum }
     *     
     */
    public ApplicationStatusEnum getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Sets the value of the applicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationStatusEnum }
     *     
     */
    public void setApplicationStatus(ApplicationStatusEnum value) {
        this.applicationStatus = value;
    }

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationTypeEnum }
     *     
     */
    public ApplicationTypeEnum getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationTypeEnum }
     *     
     */
    public void setApplicationType(ApplicationTypeEnum value) {
        this.applicationType = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDay }
     *     
     */
    public CalendarDay getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDay }
     *     
     */
    public void setDateOfBirth(CalendarDay value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the matchBothAddresses property.
     * 
     */
    public boolean isMatchBothAddresses() {
        return matchBothAddresses;
    }

    /**
     * Sets the value of the matchBothAddresses property.
     * 
     */
    public void setMatchBothAddresses(boolean value) {
        this.matchBothAddresses = value;
    }

    /**
     * Gets the value of the memberType property.
     * 
     * @return
     *     possible object is
     *     {@link MemberTypeEnum }
     *     
     */
    public MemberTypeEnum getMemberType() {
        return memberType;
    }

    /**
     * Sets the value of the memberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberTypeEnum }
     *     
     */
    public void setMemberType(MemberTypeEnum value) {
        this.memberType = value;
    }

    /**
     * Gets the value of the middleInitial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleInitial() {
        return middleInitial;
    }

    /**
     * Sets the value of the middleInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDate(XMLGregorianCalendar value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the receivedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedEndDate() {
        return receivedEndDate;
    }

    /**
     * Sets the value of the receivedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedEndDate(XMLGregorianCalendar value) {
        this.receivedEndDate = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsn(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the webApplicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebApplicationId() {
        return webApplicationId;
    }

    /**
     * Sets the value of the webApplicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebApplicationId(String value) {
        this.webApplicationId = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
