
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strFHName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strDOB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strFName",
    "strFHName",
    "strLName",
    "strDOB"
})
@XmlRootElement(name = "GetsecondvehiclecheckforotsiDealer")
public class GetsecondvehiclecheckforotsiDealer {

    protected String strFName;
    protected String strFHName;
    protected String strLName;
    protected String strDOB;

    /**
     * Gets the value of the strFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFName() {
        return strFName;
    }

    /**
     * Sets the value of the strFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFName(String value) {
        this.strFName = value;
    }

    /**
     * Gets the value of the strFHName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrFHName() {
        return strFHName;
    }

    /**
     * Sets the value of the strFHName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrFHName(String value) {
        this.strFHName = value;
    }

    /**
     * Gets the value of the strLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrLName() {
        return strLName;
    }

    /**
     * Sets the value of the strLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrLName(String value) {
        this.strLName = value;
    }

    /**
     * Gets the value of the strDOB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrDOB() {
        return strDOB;
    }

    /**
     * Sets the value of the strDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrDOB(String value) {
        this.strDOB = value;
    }

}
