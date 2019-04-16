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
 * <p>Java class for stdyDscrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stdyDscrType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:codebook:2_5}baseElementType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:codebook:2_5}citation" maxOccurs="unbounded"/>
 *         &lt;element ref="{ddi:codebook:2_5}studyAuthorization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}stdyInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}studyDevelopment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}method" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}dataAccs" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}othrStdyMat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}notes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stdyDscrType", namespace = "ddi:codebook:2_5", propOrder = {
    "citation",
    "studyAuthorization",
    "stdyInfo",
    "studyDevelopment",
    "method",
    "dataAccs",
    "othrStdyMat",
    "notes"
})
public class StdyDscrType
    extends BaseElementType
{

    @XmlElement(namespace = "ddi:codebook:2_5", required = true)
    protected List<CitationType> citation;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<StudyAuthorizationType> studyAuthorization;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<StdyInfoType> stdyInfo;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<StudyDevelopmentType> studyDevelopment;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<MethodType> method;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<DataAccsType> dataAccs;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<OthrStdyMatType> othrStdyMat;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<NotesType> notes;
    @XmlAttribute(name = "access")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> access;

    /**
     * Gets the value of the citation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitationType }
     * 
     * 
     */
    public List<CitationType> getCitation() {
        if (citation == null) {
            citation = new ArrayList<CitationType>();
        }
        return this.citation;
    }

    /**
     * Gets the value of the studyAuthorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyAuthorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudyAuthorizationType }
     * 
     * 
     */
    public List<StudyAuthorizationType> getStudyAuthorization() {
        if (studyAuthorization == null) {
            studyAuthorization = new ArrayList<StudyAuthorizationType>();
        }
        return this.studyAuthorization;
    }

    /**
     * Gets the value of the stdyInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stdyInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdyInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StdyInfoType }
     * 
     * 
     */
    public List<StdyInfoType> getStdyInfo() {
        if (stdyInfo == null) {
            stdyInfo = new ArrayList<StdyInfoType>();
        }
        return this.stdyInfo;
    }

    /**
     * Gets the value of the studyDevelopment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyDevelopment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyDevelopment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudyDevelopmentType }
     * 
     * 
     */
    public List<StudyDevelopmentType> getStudyDevelopment() {
        if (studyDevelopment == null) {
            studyDevelopment = new ArrayList<StudyDevelopmentType>();
        }
        return this.studyDevelopment;
    }

    /**
     * Gets the value of the method property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the method property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MethodType }
     * 
     * 
     */
    public List<MethodType> getMethod() {
        if (method == null) {
            method = new ArrayList<MethodType>();
        }
        return this.method;
    }

    /**
     * Gets the value of the dataAccs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataAccs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataAccs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataAccsType }
     * 
     * 
     */
    public List<DataAccsType> getDataAccs() {
        if (dataAccs == null) {
            dataAccs = new ArrayList<DataAccsType>();
        }
        return this.dataAccs;
    }

    /**
     * Gets the value of the othrStdyMat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrStdyMat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrStdyMat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OthrStdyMatType }
     * 
     * 
     */
    public List<OthrStdyMatType> getOthrStdyMat() {
        if (othrStdyMat == null) {
            othrStdyMat = new ArrayList<OthrStdyMatType>();
        }
        return this.othrStdyMat;
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
