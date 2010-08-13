//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.02.16 at 01:15:02 AM EET 
//


package org.richfaces.taglib.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * 				The tag defines a unique tag in this tag library.
 * 				It has one
 * 				attribute, id.
 * 
 * 				The tag element may have several subelements
 * 				defining:
 * 
 * 				description Optional tag-specific information
 * 
 * 				display-name A
 * 				short name that is intended to be
 * 				displayed by tools
 * 
 * 				icon Optional
 * 				icon element that can be used
 * 				by tools
 * 
 * 				name The unique action name
 * 
 * 				tag-class The tag handler class implementing
 * 				javax.servlet.jsp.tagext.JspTag
 * 
 * 				tei-class An optional subclass of
 * 				javax.servlet.jsp.tagext.TagExtraInfo
 * 
 * 				body-content The body content
 * 				type
 * 
 * 				variable Optional scripting variable information
 * 
 * 				attribute All
 * 				attributes of this action that are
 * 				evaluated prior to invocation.
 * 
 * 				dynamic-attributes Whether this tag supports additional
 * 				attributes
 * 				with dynamic names. If
 * 				true, the tag-class must implement the
 * 				javax.servlet.jsp.tagext.DynamicAttributes
 * 				interface. Defaults to
 * 				false.
 * 
 * 				example Optional informal description of an
 * 				example of a use of
 * 				this tag
 * 
 * 				tag-extension Zero or more extensions that provide extra
 * 				information about this tag, for tool
 * 				consumption
 * 
 *       
 * 
 * <p>Java class for tagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://java.sun.com/xml/ns/javaee}descriptionGroup"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/>
 *         &lt;element name="tag-class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tei-class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="body-content" type="{http://java.sun.com/xml/ns/javaee}body-contentType"/>
 *         &lt;element name="attribute" type="{http://java.sun.com/xml/ns/javaee}tld-attributeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dynamic-attributes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="example" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag-extension" type="{http://java.sun.com/xml/ns/javaee}tld-extensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tagType", propOrder = {
    "description",
    "displayName",
    "icon",
    "name",
    "tagClass",
    "teiClass",
    "bodyContent",
    "attribute",
    "dynamicAttributes",
    "example",
    "tagExtension"
})
public class TagType {

    @XmlElementWrapper(name = "description")
    @XmlAnyElement(lax = true)
    @XmlMixed
    protected List<Object> description;
    @XmlElement(name = "display-name")
    protected List<String> displayName;
    protected List<IconType> icon;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;
    @XmlElement(name = "tag-class", required = true)
    protected String tagClass;
    @XmlElement(name = "tei-class")
    protected String teiClass;
    @XmlElement(name = "body-content", required = true)
    protected BodyContent bodyContent = BodyContent.JSP;
    protected List<TldAttributeType> attribute;
    @XmlElement(name = "dynamic-attributes")
    protected Boolean dynamicAttributes;
    protected String example;
    @XmlElement(name = "tag-extension")
    protected List<TldExtensionType> tagExtension;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     * 
     * 
     */
    public List<Object> getDescription() {
        if (description == null) {
            description = new ArrayList<Object>();
        }
        return this.description;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayNameType }
     * 
     * 
     */
    public List<String> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<String>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the icon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IconType }
     * 
     * 
     */
    public List<IconType> getIcon() {
        if (icon == null) {
            icon = new ArrayList<IconType>();
        }
        return this.icon;
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
     * Gets the value of the tagClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagClass() {
        return tagClass;
    }

    /**
     * Sets the value of the tagClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagClass(String value) {
        this.tagClass = value;
    }

    /**
     * Gets the value of the teiClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeiClass() {
        return teiClass;
    }

    /**
     * Sets the value of the teiClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeiClass(String value) {
        this.teiClass = value;
    }

    /**
     * Gets the value of the bodyContent property.
     * 
     * @return
     *     possible object is
     *     {@link BodyContentType }
     *     
     */
    public BodyContent getBodyContent() {
        return bodyContent;
    }

    /**
     * Sets the value of the bodyContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyContentType }
     *     
     */
    public void setBodyContent(BodyContent value) {
        this.bodyContent = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TldAttributeType }
     * 
     * 
     */
    public List<TldAttributeType> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<TldAttributeType>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the dynamicAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDynamicAttributes() {
        return dynamicAttributes;
    }

    /**
     * Sets the value of the dynamicAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDynamicAttributes(Boolean value) {
        this.dynamicAttributes = value;
    }

    /**
     * Gets the value of the example property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExample() {
        return example;
    }

    /**
     * Sets the value of the example property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExample(String value) {
        this.example = value;
    }

    /**
     * Gets the value of the tagExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TldExtensionType }
     * 
     * 
     */
    public List<TldExtensionType> getTagExtension() {
        if (tagExtension == null) {
            tagExtension = new ArrayList<TldExtensionType>();
        }
        return this.tagExtension;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}