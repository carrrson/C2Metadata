//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.21 at 05:55:46 PM EDT 
//


package edu.umich.icpsr.ddi2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for commandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commandType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:codebook:2_5}stringType">
 *       &lt;attribute name="formalLanguage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commandType", namespace = "ddi:codebook:2_5")
public class CommandType
    extends StringType
{

    @XmlAttribute(name = "formalLanguage")
    protected String formalLanguage;

    /**
     * Gets the value of the formalLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormalLanguage() {
        return formalLanguage;
    }

    /**
     * Sets the value of the formalLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormalLanguage(String value) {
        this.formalLanguage = value;
    }

}
