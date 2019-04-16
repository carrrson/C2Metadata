//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.21 at 05:55:46 PM EDT 
//


package edu.umich.icpsr.ddi2.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xhtml:div xmlns:xhtml="http://www.w3.org/1999/xhtml" xmlns="ddi:codebook:2_5" xmlns:dc="http://purl.org/dc/terms/" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:saxon="http://xml.apache.org/xslt" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
 * 					&lt;xhtml:h1 class="element_title"&gt;Phrase Type&lt;/xhtml:h1&gt;
 * 					&lt;xhtml:div&gt;&lt;xhtml:h2 class="section_header"&gt;Description&lt;/xhtml:h2&gt;&lt;xhtml:div class="description"&gt;This type restricts the simpleTextType to allow for only child elements from the PHRASE content group. It still allows for mixed content (text and child elements).&lt;/xhtml:div&gt;
 * 					&lt;/xhtml:div&gt;
 * 				&lt;/xhtml:div&gt;
 * </pre>
 * 
 *          
 * 
 * <p>Java class for phraseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phraseType">
 *   &lt;complexContent>
 *     &lt;extension base="{ddi:codebook:2_5}simpleTextType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{ddi:codebook:2_5}PHRASE"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phraseType", namespace = "ddi:codebook:2_5")
@XmlSeeAlso({
    MiType.class
})
public class PhraseType
    extends SimpleTextType
{


}
