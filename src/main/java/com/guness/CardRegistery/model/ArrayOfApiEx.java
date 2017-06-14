
package com.guness.CardRegistery.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfApiEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfApiEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApiEx" type="{http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common}ApiEx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApiEx", namespace = "http://schemas.datacontract.org/2004/07/F2M.Api.Soap.CardService.Contracts.Response.Common", propOrder = {
    "apiEx"
})
public class ArrayOfApiEx {

    @XmlElement(name = "ApiEx", nillable = true)
    protected List<ApiEx> apiEx;

    /**
     * Gets the value of the apiEx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apiEx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApiEx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApiEx }
     * 
     * 
     */
    public List<ApiEx> getApiEx() {
        if (apiEx == null) {
            apiEx = new ArrayList<ApiEx>();
        }
        return this.apiEx;
    }

}
