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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This structure has been altered from 
 * 			its original declaration of:
 * 			
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://purl.org/dc/elements/1.1/" name="SimpleLiteral"&gt;
 * 				&lt;xs:complexContent mixed="true"&gt;
 * 					&lt;xs:restriction base="xs:anyType"&gt;
 * 						&lt;xs:sequence&gt;
 * 							&lt;xs:any maxOccurs="0" minOccurs="0" processContents="lax"/&gt;
 * 						&lt;/xs:sequence&gt;
 * 						&lt;xs:attribute ref="xml:lang" use="optional"/&gt;
 * 					&lt;/xs:restriction&gt;
 * 				&lt;/xs:complexContent&gt;
 * 			&lt;/xs:complexType&gt;
 * </pre>
 * 		
 * 			Such a restriction from the xs:anyType is unnecessary, as this is 
 * 			implicit in all types. Further, the xs:any element with a minOccurs="0" 
 * 			causes issues with Apache Xml Beans. This declaration allows for an 
 * 			equivalent content model while still allowing extensions from this type
 * 			to declare elements to allow for true mixed content.
 * 		
 * 
 * <p>Java class for SimpleLiteral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleLiteral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleLiteral", namespace = "http://purl.org/dc/elements/1.1/", propOrder = {
    "content"
})
@XmlSeeAlso({
    DDC.class,
    ISO6392 .class,
    MESH.class,
    Period.class,
    Box.class,
    Point.class,
    W3CDTF.class,
    RFC1766 .class,
    LCC.class,
    URI.class,
    LCSH.class,
    IMT.class,
    UDC.class,
    DCMIType.class,
    RFC3066 .class,
    ISO3166 .class,
    TGN.class
})
public class SimpleLiteral {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * This structure has been altered from 
     * 			its original declaration of:
     * 			
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns="http://purl.org/dc/elements/1.1/" name="SimpleLiteral"&gt;
     * 				&lt;xs:complexContent mixed="true"&gt;
     * 					&lt;xs:restriction base="xs:anyType"&gt;
     * 						&lt;xs:sequence&gt;
     * 							&lt;xs:any maxOccurs="0" minOccurs="0" processContents="lax"/&gt;
     * 						&lt;/xs:sequence&gt;
     * 						&lt;xs:attribute ref="xml:lang" use="optional"/&gt;
     * 					&lt;/xs:restriction&gt;
     * 				&lt;/xs:complexContent&gt;
     * 			&lt;/xs:complexType&gt;
     * </pre>
     * 		
     * 			Such a restriction from the xs:anyType is unnecessary, as this is 
     * 			implicit in all types. Further, the xs:any element with a minOccurs="0" 
     * 			causes issues with Apache Xml Beans. This declaration allows for an 
     * 			equivalent content model while still allowing extensions from this type
     * 			to declare elements to allow for true mixed content.
     * 		
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
