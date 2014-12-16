
package org.ogf.glue2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "DomainID",
    "ServiceID"
})
public class ContactAssociations {

    /**
     * The IDs of Domains associated with this Contact
     * 
     */
    @JsonProperty("DomainID")
    private List<String> DomainID = new ArrayList<String>();
    /**
     * The IDs of Services associated with this Contact
     * 
     */
    @JsonProperty("ServiceID")
    private List<String> ServiceID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The IDs of Domains associated with this Contact
     * 
     * @return
     *     The DomainID
     */
    @JsonProperty("DomainID")
    public List<String> getDomainID() {
        return DomainID;
    }

    /**
     * The IDs of Domains associated with this Contact
     * 
     * @param DomainID
     *     The DomainID
     */
    @JsonProperty("DomainID")
    public void setDomainID(List<String> DomainID) {
        this.DomainID = DomainID;
    }

    /**
     * The IDs of Services associated with this Contact
     * 
     * @return
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public List<String> getServiceID() {
        return ServiceID;
    }

    /**
     * The IDs of Services associated with this Contact
     * 
     * @param ServiceID
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public void setServiceID(List<String> ServiceID) {
        this.ServiceID = ServiceID;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(DomainID).append(ServiceID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContactAssociations) == false) {
            return false;
        }
        ContactAssociations rhs = ((ContactAssociations) other);
        return new EqualsBuilder().append(DomainID, rhs.DomainID).append(ServiceID, rhs.ServiceID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
