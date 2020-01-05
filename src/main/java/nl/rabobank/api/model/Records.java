//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.31 at 11:58:19 AM CET 
//


package nl.rabobank.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="record" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="startBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="mutation" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="endBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "record"
})
@XmlRootElement(name = "records")
public class Records
    implements Equals, HashCode, ToString
{

    @XmlElement(required = true)
    protected List<Records.Record> record;

    /**
     * Gets the value of the record property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the record property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Records.Record }
     * 
     * 
     */
    public List<Records.Record> getRecord() {
        if (record == null) {
            record = new ArrayList<Records.Record>();
        }
        return this.record;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Records)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Records that = ((Records) object);
        {
            List<Records.Record> lhsRecord;
            lhsRecord = (((this.record!= null)&&(!this.record.isEmpty()))?this.getRecord():null);
            List<Records.Record> rhsRecord;
            rhsRecord = (((that.record!= null)&&(!that.record.isEmpty()))?that.getRecord():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "record", lhsRecord), LocatorUtils.property(thatLocator, "record", rhsRecord), lhsRecord, rhsRecord)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Records.Record> theRecord;
            theRecord = (((this.record!= null)&&(!this.record.isEmpty()))?this.getRecord():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "record", theRecord), currentHashCode, theRecord);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<Records.Record> theRecord;
            theRecord = (((this.record!= null)&&(!this.record.isEmpty()))?this.getRecord():null);
            strategy.appendField(locator, this, "record", buffer, theRecord);
        }
        return buffer;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="startBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="mutation" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="endBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="reference" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountNumber",
        "description",
        "startBalance",
        "mutation",
        "endBalance"
    })
    public static class Record
        implements Equals, HashCode, ToString
    {

        @XmlElement(required = true)
        protected String accountNumber;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(required = true)
        protected BigDecimal startBalance;
        @XmlElement(required = true)
        protected BigDecimal mutation;
        @XmlElement(required = true)
        protected BigDecimal endBalance;
        @XmlAttribute(name = "reference")
        protected Integer reference;

        /**
         * Gets the value of the accountNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the startBalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getStartBalance() {
            return startBalance;
        }

        /**
         * Sets the value of the startBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setStartBalance(BigDecimal value) {
            this.startBalance = value;
        }

        /**
         * Gets the value of the mutation property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMutation() {
            return mutation;
        }

        /**
         * Sets the value of the mutation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMutation(BigDecimal value) {
            this.mutation = value;
        }

        /**
         * Gets the value of the endBalance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEndBalance() {
            return endBalance;
        }

        /**
         * Sets the value of the endBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEndBalance(BigDecimal value) {
            this.endBalance = value;
        }

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setReference(Integer value) {
            this.reference = value;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof Records.Record)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Records.Record that = ((Records.Record) object);
            {
                String lhsAccountNumber;
                lhsAccountNumber = this.getAccountNumber();
                String rhsAccountNumber;
                rhsAccountNumber = that.getAccountNumber();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "accountNumber", lhsAccountNumber), LocatorUtils.property(thatLocator, "accountNumber", rhsAccountNumber), lhsAccountNumber, rhsAccountNumber)) {
                    return false;
                }
            }
            {
                String lhsDescription;
                lhsDescription = this.getDescription();
                String rhsDescription;
                rhsDescription = that.getDescription();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription)) {
                    return false;
                }
            }
            {
                BigDecimal lhsStartBalance;
                lhsStartBalance = this.getStartBalance();
                BigDecimal rhsStartBalance;
                rhsStartBalance = that.getStartBalance();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "startBalance", lhsStartBalance), LocatorUtils.property(thatLocator, "startBalance", rhsStartBalance), lhsStartBalance, rhsStartBalance)) {
                    return false;
                }
            }
            {
                BigDecimal lhsMutation;
                lhsMutation = this.getMutation();
                BigDecimal rhsMutation;
                rhsMutation = that.getMutation();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "mutation", lhsMutation), LocatorUtils.property(thatLocator, "mutation", rhsMutation), lhsMutation, rhsMutation)) {
                    return false;
                }
            }
            {
                BigDecimal lhsEndBalance;
                lhsEndBalance = this.getEndBalance();
                BigDecimal rhsEndBalance;
                rhsEndBalance = that.getEndBalance();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "endBalance", lhsEndBalance), LocatorUtils.property(thatLocator, "endBalance", rhsEndBalance), lhsEndBalance, rhsEndBalance)) {
                    return false;
                }
            }
            {
                Integer lhsReference;
                lhsReference = this.getReference();
                Integer rhsReference;
                rhsReference = that.getReference();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
            int currentHashCode = 1;
            {
                String theAccountNumber;
                theAccountNumber = this.getAccountNumber();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountNumber", theAccountNumber), currentHashCode, theAccountNumber);
            }
            {
                String theDescription;
                theDescription = this.getDescription();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription);
            }
            {
                BigDecimal theStartBalance;
                theStartBalance = this.getStartBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startBalance", theStartBalance), currentHashCode, theStartBalance);
            }
            {
                BigDecimal theMutation;
                theMutation = this.getMutation();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mutation", theMutation), currentHashCode, theMutation);
            }
            {
                BigDecimal theEndBalance;
                theEndBalance = this.getEndBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endBalance", theEndBalance), currentHashCode, theEndBalance);
            }
            {
                Integer theReference;
                theReference = this.getReference();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reference", theReference), currentHashCode, theReference);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public String toString() {
            final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
            {
                String theAccountNumber;
                theAccountNumber = this.getAccountNumber();
                strategy.appendField(locator, this, "accountNumber", buffer, theAccountNumber);
            }
            {
                String theDescription;
                theDescription = this.getDescription();
                strategy.appendField(locator, this, "description", buffer, theDescription);
            }
            {
                BigDecimal theStartBalance;
                theStartBalance = this.getStartBalance();
                strategy.appendField(locator, this, "startBalance", buffer, theStartBalance);
            }
            {
                BigDecimal theMutation;
                theMutation = this.getMutation();
                strategy.appendField(locator, this, "mutation", buffer, theMutation);
            }
            {
                BigDecimal theEndBalance;
                theEndBalance = this.getEndBalance();
                strategy.appendField(locator, this, "endBalance", buffer, theEndBalance);
            }
            {
                Integer theReference;
                theReference = this.getReference();
                strategy.appendField(locator, this, "reference", buffer, theReference);
            }
            return buffer;
        }

    }

}