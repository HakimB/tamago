//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.23 at 06:50:34 PM CET 
//


package fr.lacl.tamago.aca.xmlterm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obl">
 *   &lt;complexContent>
 *     &lt;extension base="{}ACATerm">
 *       &lt;sequence>
 *         &lt;element name="left" type="{}Term"/>
 *         &lt;element name="right" type="{}Term"/>
 *       &lt;/sequence>
 *       &lt;attribute name="on" type="{}onenum" />
 *       &lt;attribute name="variable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obl", propOrder = {
    "left",
    "right"
})
public class Obl
    extends ACATerm
{

    @XmlElement(required = true)
    protected Term left;
    @XmlElement(required = true)
    protected Term right;
    @XmlAttribute
    protected Onenum on;
    @XmlAttribute
    protected String variable;

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link Term }
     *     
     */
    public Term getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link Term }
     *     
     */
    public void setLeft(Term value) {
        this.left = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link Term }
     *     
     */
    public Term getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link Term }
     *     
     */
    public void setRight(Term value) {
        this.right = value;
    }

    /**
     * Gets the value of the on property.
     * 
     * @return
     *     possible object is
     *     {@link Onenum }
     *     
     */
    public Onenum getOn() {
        return on;
    }

    /**
     * Sets the value of the on property.
     * 
     * @param value
     *     allowed object is
     *     {@link Onenum }
     *     
     */
    public void setOn(Onenum value) {
        this.on = value;
    }

    /**
     * Gets the value of the variable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariable() {
        return variable;
    }

    /**
     * Sets the value of the variable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariable(String value) {
        this.variable = value;
    }

}