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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for varGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="varGrpType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:codebook:2_5}baseElementType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:codebook:2_5}labl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}txt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}concept" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}defntn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}universe" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}notes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" default="other">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="section"/>
 *             &lt;enumeration value="multipleResp"/>
 *             &lt;enumeration value="grid"/>
 *             &lt;enumeration value="display"/>
 *             &lt;enumeration value="repetition"/>
 *             &lt;enumeration value="subject"/>
 *             &lt;enumeration value="version"/>
 *             &lt;enumeration value="iteration"/>
 *             &lt;enumeration value="analysis"/>
 *             &lt;enumeration value="pragmatic"/>
 *             &lt;enumeration value="record"/>
 *             &lt;enumeration value="file"/>
 *             &lt;enumeration value="randomized"/>
 *             &lt;enumeration value="other"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="otherType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="var" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="varGrp" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sdatrefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="methrefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="pubrefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *       &lt;attribute name="nCube" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "varGrpType", namespace = "ddi:codebook:2_5", propOrder = {
    "labl",
    "txt",
    "concept",
    "defntn",
    "universe",
    "notes"
})
public class VarGrpType
    extends BaseElementType
{

    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<LablType> labl;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<TxtType> txt;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<ConceptType> concept;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<SimpleTextType> defntn;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<UniverseType> universe;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<NotesType> notes;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "otherType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String otherType;
    @XmlAttribute(name = "var")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> var;
    @XmlAttribute(name = "varGrp")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> varGrp;
    @XmlAttribute(name = "name")
    protected String name;
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
    @XmlAttribute(name = "nCube")
    protected String nCube;

    /**
     * Gets the value of the labl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LablType }
     * 
     * 
     */
    public List<LablType> getLabl() {
        if (labl == null) {
            labl = new ArrayList<LablType>();
        }
        return this.labl;
    }

    /**
     * Gets the value of the txt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TxtType }
     * 
     * 
     */
    public List<TxtType> getTxt() {
        if (txt == null) {
            txt = new ArrayList<TxtType>();
        }
        return this.txt;
    }

    /**
     * Gets the value of the concept property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the concept property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConcept().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptType }
     * 
     * 
     */
    public List<ConceptType> getConcept() {
        if (concept == null) {
            concept = new ArrayList<ConceptType>();
        }
        return this.concept;
    }

    /**
     * Gets the value of the defntn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defntn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefntn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleTextType }
     * 
     * 
     */
    public List<SimpleTextType> getDefntn() {
        if (defntn == null) {
            defntn = new ArrayList<SimpleTextType>();
        }
        return this.defntn;
    }

    /**
     * Gets the value of the universe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniverse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniverseType }
     * 
     * 
     */
    public List<UniverseType> getUniverse() {
        if (universe == null) {
            universe = new ArrayList<UniverseType>();
        }
        return this.universe;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "other";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherType() {
        return otherType;
    }

    /**
     * Sets the value of the otherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherType(String value) {
        this.otherType = value;
    }

    /**
     * Gets the value of the var property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the var property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getVar() {
        if (var == null) {
            var = new ArrayList<Object>();
        }
        return this.var;
    }

    /**
     * Gets the value of the varGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the varGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVarGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getVarGrp() {
        if (varGrp == null) {
            varGrp = new ArrayList<Object>();
        }
        return this.varGrp;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

    /**
     * Gets the value of the nCube property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCube() {
        return nCube;
    }

    /**
     * Sets the value of the nCube property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCube(String value) {
        this.nCube = value;
    }

}
