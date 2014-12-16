
package org.ogf.glue2;

import java.util.HashMap;
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
    "EndpointID"
})
public class AccessPolicyAssociations extends PolicyAssociations {

    /**
     * The ID of the Endpoint this AccessPolicy is for
     * 
     */
    @JsonProperty("EndpointID")
    private String EndpointID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID of the Endpoint this AccessPolicy is for
     * 
     * @return
     *     The EndpointID
     */
    @JsonProperty("EndpointID")
    public String getEndpointID() {
        return EndpointID;
    }

    /**
     * The ID of the Endpoint this AccessPolicy is for
     * 
     * @param EndpointID
     *     The EndpointID
     */
    @JsonProperty("EndpointID")
    public void setEndpointID(String EndpointID) {
        this.EndpointID = EndpointID;
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
        return new HashCodeBuilder().append(EndpointID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessPolicyAssociations) == false) {
            return false;
        }
        AccessPolicyAssociations rhs = ((AccessPolicyAssociations) other);
        return new EqualsBuilder().append(EndpointID, rhs.EndpointID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
