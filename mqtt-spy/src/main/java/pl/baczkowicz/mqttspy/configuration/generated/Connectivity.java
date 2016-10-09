//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.09 at 08:26:38 PM BST 
//


package pl.baczkowicz.mqttspy.configuration.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for Connectivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Connectivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="ConnectionV2" type="{http://baczkowicz.pl/mqtt-spy-configuration}UserInterfaceMqttConnectionDetails"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Connectivity", propOrder = {
    "connectionV2"
})
public class Connectivity implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionV2")
    protected List<UserInterfaceMqttConnectionDetails> connectionV2;

    /**
     * Default no-arg constructor
     * 
     */
    public Connectivity() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Connectivity(final List<UserInterfaceMqttConnectionDetails> connectionV2) {
        this.connectionV2 = connectionV2;
    }

    /**
     * Gets the value of the connectionV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterfaceMqttConnectionDetails }
     * 
     * 
     */
    public List<UserInterfaceMqttConnectionDetails> getConnectionV2() {
        if (connectionV2 == null) {
            connectionV2 = new ArrayList<UserInterfaceMqttConnectionDetails>();
        }
        return this.connectionV2;
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
            List<UserInterfaceMqttConnectionDetails> theConnectionV2;
            theConnectionV2 = (((this.connectionV2 != null)&&(!this.connectionV2 .isEmpty()))?this.getConnectionV2():null);
            strategy.appendField(locator, this, "connectionV2", buffer, theConnectionV2);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Connectivity)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Connectivity that = ((Connectivity) object);
        {
            List<UserInterfaceMqttConnectionDetails> lhsConnectionV2;
            lhsConnectionV2 = (((this.connectionV2 != null)&&(!this.connectionV2 .isEmpty()))?this.getConnectionV2():null);
            List<UserInterfaceMqttConnectionDetails> rhsConnectionV2;
            rhsConnectionV2 = (((that.connectionV2 != null)&&(!that.connectionV2 .isEmpty()))?that.getConnectionV2():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionV2", lhsConnectionV2), LocatorUtils.property(thatLocator, "connectionV2", rhsConnectionV2), lhsConnectionV2, rhsConnectionV2)) {
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
            List<UserInterfaceMqttConnectionDetails> theConnectionV2;
            theConnectionV2 = (((this.connectionV2 != null)&&(!this.connectionV2 .isEmpty()))?this.getConnectionV2():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionV2", theConnectionV2), currentHashCode, theConnectionV2);
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
        if (draftCopy instanceof Connectivity) {
            final Connectivity copy = ((Connectivity) draftCopy);
            if ((this.connectionV2 != null)&&(!this.connectionV2 .isEmpty())) {
                List<UserInterfaceMqttConnectionDetails> sourceConnectionV2;
                sourceConnectionV2 = (((this.connectionV2 != null)&&(!this.connectionV2 .isEmpty()))?this.getConnectionV2():null);
                @SuppressWarnings("unchecked")
                List<UserInterfaceMqttConnectionDetails> copyConnectionV2 = ((List<UserInterfaceMqttConnectionDetails> ) strategy.copy(LocatorUtils.property(locator, "connectionV2", sourceConnectionV2), sourceConnectionV2));
                copy.connectionV2 = null;
                if (copyConnectionV2 != null) {
                    List<UserInterfaceMqttConnectionDetails> uniqueConnectionV2l = copy.getConnectionV2();
                    uniqueConnectionV2l.addAll(copyConnectionV2);
                }
            } else {
                copy.connectionV2 = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Connectivity();
    }

}
