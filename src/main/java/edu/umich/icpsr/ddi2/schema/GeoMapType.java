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
 * <p>Java class for geoMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geoMapType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:codebook:2_5}baseElementType">
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mapformat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="levelno" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geoMapType", namespace = "ddi:codebook:2_5")
public class GeoMapType
    extends BaseElementType
{

    @XmlAttribute(name = "URI")
    protected String uri;
    @XmlAttribute(name = "mapformat")
    protected String mapformat;
    @XmlAttribute(name = "levelno")
    protected String levelno;

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURI() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURI(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the mapformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapformat() {
        return mapformat;
    }

    /**
     * Sets the value of the mapformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapformat(String value) {
        this.mapformat = value;
    }

    /**
     * Gets the value of the levelno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelno() {
        return levelno;
    }

    /**
     * Sets the value of the levelno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelno(String value) {
        this.levelno = value;
    }

}
