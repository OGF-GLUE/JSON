
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
    "ResourceID",
    "ServiceID"
})
public class ManagerAssociations {

    /**
     * ID(s) of Resources associated with this Manager
     * 
     */
    @JsonProperty("ResourceID")
    private List<String> ResourceID = new ArrayList<String>();
    /**
     * The ID of the Service this Manager participates in
     * 
     */
    @JsonProperty("ServiceID")
    private String ServiceID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID(s) of Resources associated with this Manager
     * 
     * @return
     *     The ResourceID
     */
    @JsonProperty("ResourceID")
    public List<String> getResourceID() {
        return ResourceID;
    }

    /**
     * ID(s) of Resources associated with this Manager
     * 
     * @param ResourceID
     *     The ResourceID
     */
    @JsonProperty("ResourceID")
    public void setResourceID(List<String> ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * The ID of the Service this Manager participates in
     * 
     * @return
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public String getServiceID() {
        return ServiceID;
    }

    /**
     * The ID of the Service this Manager participates in
     * 
     * @param ServiceID
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public void setServiceID(String ServiceID) {
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
        return new HashCodeBuilder().append(ResourceID).append(ServiceID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManagerAssociations) == false) {
            return false;
        }
        ManagerAssociations rhs = ((ManagerAssociations) other);
        return new EqualsBuilder().append(ResourceID, rhs.ResourceID).append(ServiceID, rhs.ServiceID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
