
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
    "ContactID",
    "LocationID"
})
public class DomainAssociations {

    /**
     * IDs of Contacts for this Domain
     * 
     */
    @JsonProperty("ContactID")
    private List<String> ContactID = new ArrayList<String>();
    /**
     * The ID of the primary Location for this Domain
     * 
     */
    @JsonProperty("LocationID")
    private String LocationID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * IDs of Contacts for this Domain
     * 
     * @return
     *     The ContactID
     */
    @JsonProperty("ContactID")
    public List<String> getContactID() {
        return ContactID;
    }

    /**
     * IDs of Contacts for this Domain
     * 
     * @param ContactID
     *     The ContactID
     */
    @JsonProperty("ContactID")
    public void setContactID(List<String> ContactID) {
        this.ContactID = ContactID;
    }

    /**
     * The ID of the primary Location for this Domain
     * 
     * @return
     *     The LocationID
     */
    @JsonProperty("LocationID")
    public String getLocationID() {
        return LocationID;
    }

    /**
     * The ID of the primary Location for this Domain
     * 
     * @param LocationID
     *     The LocationID
     */
    @JsonProperty("LocationID")
    public void setLocationID(String LocationID) {
        this.LocationID = LocationID;
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
        return new HashCodeBuilder().append(ContactID).append(LocationID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainAssociations) == false) {
            return false;
        }
        DomainAssociations rhs = ((DomainAssociations) other);
        return new EqualsBuilder().append(ContactID, rhs.ContactID).append(LocationID, rhs.LocationID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
