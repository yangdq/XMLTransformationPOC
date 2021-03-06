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


/**
 * <p>Java class for typesInclusionHelper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typesInclusionHelper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ii" type="{http://services.vida.psi.com/ClientManagement/1.0}insuranceInfo" minOccurs="0"/&gt;
 *         &lt;element name="pte" type="{http://services.vida.psi.com/ClientManagement/1.0}parentTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="race" type="{http://services.vida.psi.com/ClientManagement/1.0}raceEnum" minOccurs="0"/&gt;
 *         &lt;element name="rtpar" type="{http://services.vida.psi.com/ClientManagement/1.0}relationshipToPersonEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typesInclusionHelper", propOrder = {
    "ii",
    "pte",
    "race",
    "rtpar"
})
public class TypesInclusionHelper {

    protected InsuranceInfo ii;
    @XmlSchemaType(name = "string")
    protected ParentTypeEnum pte;
    @XmlSchemaType(name = "string")
    protected RaceEnum race;
    @XmlSchemaType(name = "string")
    protected RelationshipToPersonEnum rtpar;

    /**
     * Gets the value of the ii property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceInfo }
     *     
     */
    public InsuranceInfo getIi() {
        return ii;
    }

    /**
     * Sets the value of the ii property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceInfo }
     *     
     */
    public void setIi(InsuranceInfo value) {
        this.ii = value;
    }

    /**
     * Gets the value of the pte property.
     * 
     * @return
     *     possible object is
     *     {@link ParentTypeEnum }
     *     
     */
    public ParentTypeEnum getPte() {
        return pte;
    }

    /**
     * Sets the value of the pte property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentTypeEnum }
     *     
     */
    public void setPte(ParentTypeEnum value) {
        this.pte = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link RaceEnum }
     *     
     */
    public RaceEnum getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceEnum }
     *     
     */
    public void setRace(RaceEnum value) {
        this.race = value;
    }

    /**
     * Gets the value of the rtpar property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipToPersonEnum }
     *     
     */
    public RelationshipToPersonEnum getRtpar() {
        return rtpar;
    }

    /**
     * Sets the value of the rtpar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipToPersonEnum }
     *     
     */
    public void setRtpar(RelationshipToPersonEnum value) {
        this.rtpar = value;
    }

}
