//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.15 at 05:33:56 PM CST 
//


package com.psi.vida.services.documentservices._1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for inboundDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inboundDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceBatchReference" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="envelopeControlNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentControlNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inboundDocumentSource" type="{http://services.vida.psi.com/DocumentServices/1.0}inboundDocumentSourceEnum"/&gt;
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="webConfirmationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="scanDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="unreadable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="missingPages" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="alreadyWorked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="envelopeContainsRenewalDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="envelopeContainsApplicationDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="forwardingAddressPresent" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="letterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imageFormat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="webEnvNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webUploadDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inboundDocument", propOrder = {
    "sourceBatchReference",
    "envelopeControlNumber",
    "documentControlNumber",
    "documentType",
    "inboundDocumentSource",
    "accountNumber",
    "webConfirmationId",
    "receivedDate",
    "scanDate",
    "unreadable",
    "missingPages",
    "alreadyWorked",
    "envelopeContainsRenewalDocument",
    "envelopeContainsApplicationDocument",
    "forwardingAddressPresent",
    "letterId",
    "paymentAmount",
    "checkNumber",
    "imageLocation",
    "imageFormat",
    "webEnvNumber",
    "imageRefId",
    "webUploadDate"
})
public class InboundDocument {

    @XmlElement(required = true)
    protected String sourceBatchReference;
    @XmlElement(required = true)
    protected String envelopeControlNumber;
    @XmlElement(required = true)
    protected String documentControlNumber;
    @XmlElement(required = true)
    protected String documentType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InboundDocumentSourceEnum inboundDocumentSource;
    protected Long accountNumber;
    protected String webConfirmationId;
    @XmlElement(required = true)
    protected String receivedDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scanDate;
    protected boolean unreadable;
    protected boolean missingPages;
    protected boolean alreadyWorked;
    protected boolean envelopeContainsRenewalDocument;
    protected boolean envelopeContainsApplicationDocument;
    protected boolean forwardingAddressPresent;
    protected Long letterId;
    protected BigDecimal paymentAmount;
    protected String checkNumber;
    @XmlElement(required = true)
    protected String imageLocation;
    @XmlElement(required = true)
    protected String imageFormat;
    protected String webEnvNumber;
    protected String imageRefId;
    protected String webUploadDate;

    /**
     * Gets the value of the sourceBatchReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceBatchReference() {
        return sourceBatchReference;
    }

    /**
     * Sets the value of the sourceBatchReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceBatchReference(String value) {
        this.sourceBatchReference = value;
    }

    /**
     * Gets the value of the envelopeControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvelopeControlNumber() {
        return envelopeControlNumber;
    }

    /**
     * Sets the value of the envelopeControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvelopeControlNumber(String value) {
        this.envelopeControlNumber = value;
    }

    /**
     * Gets the value of the documentControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentControlNumber() {
        return documentControlNumber;
    }

    /**
     * Sets the value of the documentControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentControlNumber(String value) {
        this.documentControlNumber = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the inboundDocumentSource property.
     * 
     * @return
     *     possible object is
     *     {@link InboundDocumentSourceEnum }
     *     
     */
    public InboundDocumentSourceEnum getInboundDocumentSource() {
        return inboundDocumentSource;
    }

    /**
     * Sets the value of the inboundDocumentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundDocumentSourceEnum }
     *     
     */
    public void setInboundDocumentSource(InboundDocumentSourceEnum value) {
        this.inboundDocumentSource = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the webConfirmationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebConfirmationId() {
        return webConfirmationId;
    }

    /**
     * Sets the value of the webConfirmationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebConfirmationId(String value) {
        this.webConfirmationId = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedDate(String value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the scanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScanDate() {
        return scanDate;
    }

    /**
     * Sets the value of the scanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScanDate(XMLGregorianCalendar value) {
        this.scanDate = value;
    }

    /**
     * Gets the value of the unreadable property.
     * 
     */
    public boolean isUnreadable() {
        return unreadable;
    }

    /**
     * Sets the value of the unreadable property.
     * 
     */
    public void setUnreadable(boolean value) {
        this.unreadable = value;
    }

    /**
     * Gets the value of the missingPages property.
     * 
     */
    public boolean isMissingPages() {
        return missingPages;
    }

    /**
     * Sets the value of the missingPages property.
     * 
     */
    public void setMissingPages(boolean value) {
        this.missingPages = value;
    }

    /**
     * Gets the value of the alreadyWorked property.
     * 
     */
    public boolean isAlreadyWorked() {
        return alreadyWorked;
    }

    /**
     * Sets the value of the alreadyWorked property.
     * 
     */
    public void setAlreadyWorked(boolean value) {
        this.alreadyWorked = value;
    }

    /**
     * Gets the value of the envelopeContainsRenewalDocument property.
     * 
     */
    public boolean isEnvelopeContainsRenewalDocument() {
        return envelopeContainsRenewalDocument;
    }

    /**
     * Sets the value of the envelopeContainsRenewalDocument property.
     * 
     */
    public void setEnvelopeContainsRenewalDocument(boolean value) {
        this.envelopeContainsRenewalDocument = value;
    }

    /**
     * Gets the value of the envelopeContainsApplicationDocument property.
     * 
     */
    public boolean isEnvelopeContainsApplicationDocument() {
        return envelopeContainsApplicationDocument;
    }

    /**
     * Sets the value of the envelopeContainsApplicationDocument property.
     * 
     */
    public void setEnvelopeContainsApplicationDocument(boolean value) {
        this.envelopeContainsApplicationDocument = value;
    }

    /**
     * Gets the value of the forwardingAddressPresent property.
     * 
     */
    public boolean isForwardingAddressPresent() {
        return forwardingAddressPresent;
    }

    /**
     * Sets the value of the forwardingAddressPresent property.
     * 
     */
    public void setForwardingAddressPresent(boolean value) {
        this.forwardingAddressPresent = value;
    }

    /**
     * Gets the value of the letterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLetterId() {
        return letterId;
    }

    /**
     * Sets the value of the letterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLetterId(Long value) {
        this.letterId = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmount(BigDecimal value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the imageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * Sets the value of the imageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageLocation(String value) {
        this.imageLocation = value;
    }

    /**
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFormat(String value) {
        this.imageFormat = value;
    }

    /**
     * Gets the value of the webEnvNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebEnvNumber() {
        return webEnvNumber;
    }

    /**
     * Sets the value of the webEnvNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebEnvNumber(String value) {
        this.webEnvNumber = value;
    }

    /**
     * Gets the value of the imageRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRefId() {
        return imageRefId;
    }

    /**
     * Sets the value of the imageRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRefId(String value) {
        this.imageRefId = value;
    }

    /**
     * Gets the value of the webUploadDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUploadDate() {
        return webUploadDate;
    }

    /**
     * Sets the value of the webUploadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUploadDate(String value) {
        this.webUploadDate = value;
    }

}