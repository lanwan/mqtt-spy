//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.09 at 08:26:32 PM BST 
//


package pl.baczkowicz.spy.ui.generated.versions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ReleaseStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ToVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UpdateTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UpdateDetails" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UpdateStatus" type="{http://baczkowicz.pl/spy-versions}UpdateStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseStatus", propOrder = {
    "fromVersion",
    "toVersion",
    "updateTitle",
    "updateDetails",
    "updateStatus"
})
public class ReleaseStatus
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElement(name = "FromVersion", required = true)
    protected String fromVersion;
    @XmlElement(name = "ToVersion", required = true)
    protected String toVersion;
    @XmlElement(name = "UpdateTitle", required = true)
    protected String updateTitle;
    @XmlElement(name = "UpdateDetails", required = true)
    protected String updateDetails;
    @XmlElement(name = "UpdateStatus", required = true)
    @XmlSchemaType(name = "string")
    protected UpdateStatus updateStatus;

    /**
     * Gets the value of the fromVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromVersion() {
        return fromVersion;
    }

    /**
     * Sets the value of the fromVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromVersion(String value) {
        this.fromVersion = value;
    }

    /**
     * Gets the value of the toVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToVersion() {
        return toVersion;
    }

    /**
     * Sets the value of the toVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToVersion(String value) {
        this.toVersion = value;
    }

    /**
     * Gets the value of the updateTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateTitle() {
        return updateTitle;
    }

    /**
     * Sets the value of the updateTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateTitle(String value) {
        this.updateTitle = value;
    }

    /**
     * Gets the value of the updateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDetails() {
        return updateDetails;
    }

    /**
     * Sets the value of the updateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDetails(String value) {
        this.updateDetails = value;
    }

    /**
     * Gets the value of the updateStatus property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStatus }
     *     
     */
    public UpdateStatus getUpdateStatus() {
        return updateStatus;
    }

    /**
     * Sets the value of the updateStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStatus }
     *     
     */
    public void setUpdateStatus(UpdateStatus value) {
        this.updateStatus = value;
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
            String theFromVersion;
            theFromVersion = this.getFromVersion();
            strategy.appendField(locator, this, "fromVersion", buffer, theFromVersion);
        }
        {
            String theToVersion;
            theToVersion = this.getToVersion();
            strategy.appendField(locator, this, "toVersion", buffer, theToVersion);
        }
        {
            String theUpdateTitle;
            theUpdateTitle = this.getUpdateTitle();
            strategy.appendField(locator, this, "updateTitle", buffer, theUpdateTitle);
        }
        {
            String theUpdateDetails;
            theUpdateDetails = this.getUpdateDetails();
            strategy.appendField(locator, this, "updateDetails", buffer, theUpdateDetails);
        }
        {
            UpdateStatus theUpdateStatus;
            theUpdateStatus = this.getUpdateStatus();
            strategy.appendField(locator, this, "updateStatus", buffer, theUpdateStatus);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReleaseStatus)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReleaseStatus that = ((ReleaseStatus) object);
        {
            String lhsFromVersion;
            lhsFromVersion = this.getFromVersion();
            String rhsFromVersion;
            rhsFromVersion = that.getFromVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fromVersion", lhsFromVersion), LocatorUtils.property(thatLocator, "fromVersion", rhsFromVersion), lhsFromVersion, rhsFromVersion)) {
                return false;
            }
        }
        {
            String lhsToVersion;
            lhsToVersion = this.getToVersion();
            String rhsToVersion;
            rhsToVersion = that.getToVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "toVersion", lhsToVersion), LocatorUtils.property(thatLocator, "toVersion", rhsToVersion), lhsToVersion, rhsToVersion)) {
                return false;
            }
        }
        {
            String lhsUpdateTitle;
            lhsUpdateTitle = this.getUpdateTitle();
            String rhsUpdateTitle;
            rhsUpdateTitle = that.getUpdateTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateTitle", lhsUpdateTitle), LocatorUtils.property(thatLocator, "updateTitle", rhsUpdateTitle), lhsUpdateTitle, rhsUpdateTitle)) {
                return false;
            }
        }
        {
            String lhsUpdateDetails;
            lhsUpdateDetails = this.getUpdateDetails();
            String rhsUpdateDetails;
            rhsUpdateDetails = that.getUpdateDetails();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateDetails", lhsUpdateDetails), LocatorUtils.property(thatLocator, "updateDetails", rhsUpdateDetails), lhsUpdateDetails, rhsUpdateDetails)) {
                return false;
            }
        }
        {
            UpdateStatus lhsUpdateStatus;
            lhsUpdateStatus = this.getUpdateStatus();
            UpdateStatus rhsUpdateStatus;
            rhsUpdateStatus = that.getUpdateStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "updateStatus", lhsUpdateStatus), LocatorUtils.property(thatLocator, "updateStatus", rhsUpdateStatus), lhsUpdateStatus, rhsUpdateStatus)) {
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
            String theFromVersion;
            theFromVersion = this.getFromVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromVersion", theFromVersion), currentHashCode, theFromVersion);
        }
        {
            String theToVersion;
            theToVersion = this.getToVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toVersion", theToVersion), currentHashCode, theToVersion);
        }
        {
            String theUpdateTitle;
            theUpdateTitle = this.getUpdateTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateTitle", theUpdateTitle), currentHashCode, theUpdateTitle);
        }
        {
            String theUpdateDetails;
            theUpdateDetails = this.getUpdateDetails();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateDetails", theUpdateDetails), currentHashCode, theUpdateDetails);
        }
        {
            UpdateStatus theUpdateStatus;
            theUpdateStatus = this.getUpdateStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "updateStatus", theUpdateStatus), currentHashCode, theUpdateStatus);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof ReleaseStatus) {
            final ReleaseStatus copy = ((ReleaseStatus) draftCopy);
            if (this.fromVersion!= null) {
                String sourceFromVersion;
                sourceFromVersion = this.getFromVersion();
                String copyFromVersion = ((String) strategy.copy(LocatorUtils.property(locator, "fromVersion", sourceFromVersion), sourceFromVersion));
                copy.setFromVersion(copyFromVersion);
            } else {
                copy.fromVersion = null;
            }
            if (this.toVersion!= null) {
                String sourceToVersion;
                sourceToVersion = this.getToVersion();
                String copyToVersion = ((String) strategy.copy(LocatorUtils.property(locator, "toVersion", sourceToVersion), sourceToVersion));
                copy.setToVersion(copyToVersion);
            } else {
                copy.toVersion = null;
            }
            if (this.updateTitle!= null) {
                String sourceUpdateTitle;
                sourceUpdateTitle = this.getUpdateTitle();
                String copyUpdateTitle = ((String) strategy.copy(LocatorUtils.property(locator, "updateTitle", sourceUpdateTitle), sourceUpdateTitle));
                copy.setUpdateTitle(copyUpdateTitle);
            } else {
                copy.updateTitle = null;
            }
            if (this.updateDetails!= null) {
                String sourceUpdateDetails;
                sourceUpdateDetails = this.getUpdateDetails();
                String copyUpdateDetails = ((String) strategy.copy(LocatorUtils.property(locator, "updateDetails", sourceUpdateDetails), sourceUpdateDetails));
                copy.setUpdateDetails(copyUpdateDetails);
            } else {
                copy.updateDetails = null;
            }
            if (this.updateStatus!= null) {
                UpdateStatus sourceUpdateStatus;
                sourceUpdateStatus = this.getUpdateStatus();
                UpdateStatus copyUpdateStatus = ((UpdateStatus) strategy.copy(LocatorUtils.property(locator, "updateStatus", sourceUpdateStatus), sourceUpdateStatus));
                copy.setUpdateStatus(copyUpdateStatus);
            } else {
                copy.updateStatus = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ReleaseStatus();
    }

}
