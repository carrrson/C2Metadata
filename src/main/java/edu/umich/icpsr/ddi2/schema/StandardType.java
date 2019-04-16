//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.21 at 05:55:46 PM EDT 
//


package edu.umich.icpsr.ddi2.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for standardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="standardType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:codebook:2_5}baseElementType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:codebook:2_5}standardName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}producer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standardType", namespace = "ddi:codebook:2_5", propOrder = {
    "standardName",
    "producer"
})
public class StandardType
    extends BaseElementType
{

    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<StandardNameType> standardName;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<ProducerType> producer;

    /**
     * Gets the value of the standardName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardNameType }
     * 
     * 
     */
    public List<StandardNameType> getStandardName() {
        if (standardName == null) {
            standardName = new ArrayList<StandardNameType>();
        }
        return this.standardName;
    }

    /**
     * Gets the value of the producer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerType }
     * 
     * 
     */
    public List<ProducerType> getProducer() {
        if (producer == null) {
            producer = new ArrayList<ProducerType>();
        }
        return this.producer;
    }

}
