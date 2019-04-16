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
 * <p>Java class for fileTxtType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fileTxtType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:codebook:2_5}baseElementType">
 *       &lt;sequence>
 *         &lt;element ref="{ddi:codebook:2_5}fileName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}fileCitation" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}dataFingerprint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}fileCont" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}fileStrc" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}dimensns" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}fileType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}format" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}filePlac" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}dataChck" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}ProcStat" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}dataMsng" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}software" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{ddi:codebook:2_5}verStmt" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileTxtType", namespace = "ddi:codebook:2_5", propOrder = {
    "fileName",
    "fileCitation",
    "dataFingerprint",
    "fileCont",
    "fileStrc",
    "dimensns",
    "fileType",
    "format",
    "filePlac",
    "dataChck",
    "procStat",
    "dataMsng",
    "software",
    "verStmt"
})
public class FileTxtType
    extends BaseElementType
{

    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<SimpleTextType> fileName;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected CitationType fileCitation;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<DataFingerprintType> dataFingerprint;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected SimpleTextType fileCont;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected FileStrcType fileStrc;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected DimensnsType dimensns;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<FileTypeType> fileType;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<SimpleTextType> format;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<SimpleTextType> filePlac;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<SimpleTextType> dataChck;
    @XmlElement(name = "ProcStat", namespace = "ddi:codebook:2_5")
    protected List<SimpleTextType> procStat;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<SimpleTextType> dataMsng;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<SoftwareType> software;
    @XmlElement(namespace = "ddi:codebook:2_5")
    protected List<VerStmtType> verStmt;

    /**
     * Gets the value of the fileName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleTextType }
     * 
     * 
     */
    public List<SimpleTextType> getFileName() {
        if (fileName == null) {
            fileName = new ArrayList<SimpleTextType>();
        }
        return this.fileName;
    }

    /**
     * Gets the value of the fileCitation property.
     * 
     * @return
     *     possible object is
     *     {@link CitationType }
     *     
     */
    public CitationType getFileCitation() {
        return fileCitation;
    }

    /**
     * Sets the value of the fileCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitationType }
     *     
     */
    public void setFileCitation(CitationType value) {
        this.fileCitation = value;
    }

    /**
     * Gets the value of the dataFingerprint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFingerprint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFingerprint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataFingerprintType }
     * 
     * 
     */
    public List<DataFingerprintType> getDataFingerprint() {
        if (dataFingerprint == null) {
            dataFingerprint = new ArrayList<DataFingerprintType>();
        }
        return this.dataFingerprint;
    }

    /**
     * Gets the value of the fileCont property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleTextType }
     *     
     */
    public SimpleTextType getFileCont() {
        return fileCont;
    }

    /**
     * Sets the value of the fileCont property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleTextType }
     *     
     */
    public void setFileCont(SimpleTextType value) {
        this.fileCont = value;
    }

    /**
     * Gets the value of the fileStrc property.
     * 
     * @return
     *     possible object is
     *     {@link FileStrcType }
     *     
     */
    public FileStrcType getFileStrc() {
        return fileStrc;
    }

    /**
     * Sets the value of the fileStrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileStrcType }
     *     
     */
    public void setFileStrc(FileStrcType value) {
        this.fileStrc = value;
    }

    /**
     * Gets the value of the dimensns property.
     * 
     * @return
     *     possible object is
     *     {@link DimensnsType }
     *     
     */
    public DimensnsType getDimensns() {
        return dimensns;
    }

    /**
     * Sets the value of the dimensns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensnsType }
     *     
     */
    public void setDimensns(DimensnsType value) {
        this.dimensns = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileTypeType }
     * 
     * 
     */
    public List<FileTypeType> getFileType() {
        if (fileType == null) {
            fileType = new ArrayList<FileTypeType>();
        }
        return this.fileType;
    }

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleTextType }
     * 
     * 
     */
    public List<SimpleTextType> getFormat() {
        if (format == null) {
            format = new ArrayList<SimpleTextType>();
        }
        return this.format;
    }

    /**
     * Gets the value of the filePlac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filePlac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilePlac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleTextType }
     * 
     * 
     */
    public List<SimpleTextType> getFilePlac() {
        if (filePlac == null) {
            filePlac = new ArrayList<SimpleTextType>();
        }
        return this.filePlac;
    }

    /**
     * Gets the value of the dataChck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataChck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataChck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleTextType }
     * 
     * 
     */
    public List<SimpleTextType> getDataChck() {
        if (dataChck == null) {
            dataChck = new ArrayList<SimpleTextType>();
        }
        return this.dataChck;
    }

    /**
     * Gets the value of the procStat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procStat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcStat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleTextType }
     * 
     * 
     */
    public List<SimpleTextType> getProcStat() {
        if (procStat == null) {
            procStat = new ArrayList<SimpleTextType>();
        }
        return this.procStat;
    }

    /**
     * Gets the value of the dataMsng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataMsng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataMsng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleTextType }
     * 
     * 
     */
    public List<SimpleTextType> getDataMsng() {
        if (dataMsng == null) {
            dataMsng = new ArrayList<SimpleTextType>();
        }
        return this.dataMsng;
    }

    /**
     * Gets the value of the software property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the software property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareType }
     * 
     * 
     */
    public List<SoftwareType> getSoftware() {
        if (software == null) {
            software = new ArrayList<SoftwareType>();
        }
        return this.software;
    }

    /**
     * Gets the value of the verStmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the verStmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerStmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerStmtType }
     * 
     * 
     */
    public List<VerStmtType> getVerStmt() {
        if (verStmt == null) {
            verStmt = new ArrayList<VerStmtType>();
        }
        return this.verStmt;
    }

}