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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fileDscrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fileDscrType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:codebook:2_5}baseElementType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:codebook:2_5}fileTxt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}locMap" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}notes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sdatrefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="methrefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="pubrefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileDscrType", namespace = "ddi:codebook:2_5", propOrder = {
    "fileTxt",
    "locMap",
    "notes"
})
public class FileDscrType
    extends BaseElementType
{

    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<FileTxtType> fileTxt;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected LocMapType locMap;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<NotesType> notes;
    @XmlAttribute(name = "URI")
    protected String uri;
    @XmlAttribute(name = "sdatrefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> sdatrefs;
    @XmlAttribute(name = "methrefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> methrefs;
    @XmlAttribute(name = "pubrefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> pubrefs;
    @XmlAttribute(name = "access")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> access;

    /**
     * Gets the value of the fileTxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileTxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileTxtType }
     * 
     * 
     */
    public List<FileTxtType> getFileTxt() {
        if (fileTxt == null) {
            fileTxt = new ArrayList<FileTxtType>();
        }
        return this.fileTxt;
    }

    /**
     * Gets the value of the locMap property.
     * 
     * @return
     *     possible object is
     *     {@link LocMapType }
     *     
     */
    public LocMapType getLocMap() {
        return locMap;
    }

    /**
     * Sets the value of the locMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocMapType }
     *     
     */
    public void setLocMap(LocMapType value) {
        this.locMap = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesType }
     * 
     * 
     */
    public List<NotesType> getNotes() {
        if (notes == null) {
            notes = new ArrayList<NotesType>();
        }
        return this.notes;
    }

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
     * Gets the value of the sdatrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sdatrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSdatrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getSdatrefs() {
        if (sdatrefs == null) {
            sdatrefs = new ArrayList<Object>();
        }
        return this.sdatrefs;
    }

    /**
     * Gets the value of the methrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getMethrefs() {
        if (methrefs == null) {
            methrefs = new ArrayList<Object>();
        }
        return this.methrefs;
    }

    /**
     * Gets the value of the pubrefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pubrefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubrefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPubrefs() {
        if (pubrefs == null) {
            pubrefs = new ArrayList<Object>();
        }
        return this.pubrefs;
    }

    /**
     * Gets the value of the access property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the access property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAccess() {
        if (access == null) {
            access = new ArrayList<Object>();
        }
        return this.access;
    }

}
