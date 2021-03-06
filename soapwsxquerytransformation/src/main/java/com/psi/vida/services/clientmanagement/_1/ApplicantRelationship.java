//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.09 at 12:57:55 PM CST 
//


package com.psi.vida.services.clientmanagement._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for applicantRelationship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="applicantRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicant" type="{http://services.vida.psi.com/ClientManagement/1.0}applicantRef"/&gt;
 *         &lt;element name="relatedToApplicant" type="{http://services.vida.psi.com/ClientManagement/1.0}applicantRef"/&gt;
 *         &lt;element name="relationship" type="{http://services.vida.psi.com/ClientManagement/1.0}relationshipToPersonEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicantRelationship", propOrder = {
    "applicant",
    "relatedToApplicant",
    "relationship"
})
public class ApplicantRelationship {

    @XmlElement(required = true)
    protected ApplicantRef applicant;
    @XmlElement(required = true)
    protected ApplicantRef relatedToApplicant;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RelationshipToPersonEnum relationship;

    /**
     * Gets the value of the applicant property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantRef }
     *     
     */
    public ApplicantRef getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantRef }
     *     
     */
    public void setApplicant(ApplicantRef value) {
        this.applicant = value;
    }

    /**
     * Gets the value of the relatedToApplicant property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantRef }
     *     
     */
    public ApplicantRef getRelatedToApplicant() {
        return relatedToApplicant;
    }

    /**
     * Sets the value of the relatedToApplicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantRef }
     *     
     */
    public void setRelatedToApplicant(ApplicantRef value) {
        this.relatedToApplicant = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipToPersonEnum }
     *     
     */
    public RelationshipToPersonEnum getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipToPersonEnum }
     *     
     */
    public void setRelationship(RelationshipToPersonEnum value) {
        this.relationship = value;
    }

}
