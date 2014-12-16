
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
    "ActivityID",
    "EndpointID",
    "MappingPolicyID",
    "ResourceID",
    "ServiceID"
})
public class ShareAssociations {

    /**
     * The ID(s) of Activities consuming from this Share
     * 
     */
    @JsonProperty("ActivityID")
    private List<String> ActivityID = new ArrayList<String>();
    /**
     * The ID(s) of the Endpoints that can be used to access this Share
     * 
     */
    @JsonProperty("EndpointID")
    private List<String> EndpointID = new ArrayList<String>();
    /**
     * ID(s) of MappingPolicies associated with this Share
     * 
     */
    @JsonProperty("MappingPolicyID")
    private List<String> MappingPolicyID = new ArrayList<String>();
    /**
     * The ID(s) of the Resources associated with this Share
     * 
     */
    @JsonProperty("ResourceID")
    private List<String> ResourceID = new ArrayList<String>();
    /**
     * The ID of the Service this Share participates in
     * 
     */
    @JsonProperty("ServiceID")
    private String ServiceID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID(s) of Activities consuming from this Share
     * 
     * @return
     *     The ActivityID
     */
    @JsonProperty("ActivityID")
    public List<String> getActivityID() {
        return ActivityID;
    }

    /**
     * The ID(s) of Activities consuming from this Share
     * 
     * @param ActivityID
     *     The ActivityID
     */
    @JsonProperty("ActivityID")
    public void setActivityID(List<String> ActivityID) {
        this.ActivityID = ActivityID;
    }

    /**
     * The ID(s) of the Endpoints that can be used to access this Share
     * 
     * @return
     *     The EndpointID
     */
    @JsonProperty("EndpointID")
    public List<String> getEndpointID() {
        return EndpointID;
    }

    /**
     * The ID(s) of the Endpoints that can be used to access this Share
     * 
     * @param EndpointID
     *     The EndpointID
     */
    @JsonProperty("EndpointID")
    public void setEndpointID(List<String> EndpointID) {
        this.EndpointID = EndpointID;
    }

    /**
     * ID(s) of MappingPolicies associated with this Share
     * 
     * @return
     *     The MappingPolicyID
     */
    @JsonProperty("MappingPolicyID")
    public List<String> getMappingPolicyID() {
        return MappingPolicyID;
    }

    /**
     * ID(s) of MappingPolicies associated with this Share
     * 
     * @param MappingPolicyID
     *     The MappingPolicyID
     */
    @JsonProperty("MappingPolicyID")
    public void setMappingPolicyID(List<String> MappingPolicyID) {
        this.MappingPolicyID = MappingPolicyID;
    }

    /**
     * The ID(s) of the Resources associated with this Share
     * 
     * @return
     *     The ResourceID
     */
    @JsonProperty("ResourceID")
    public List<String> getResourceID() {
        return ResourceID;
    }

    /**
     * The ID(s) of the Resources associated with this Share
     * 
     * @param ResourceID
     *     The ResourceID
     */
    @JsonProperty("ResourceID")
    public void setResourceID(List<String> ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * The ID of the Service this Share participates in
     * 
     * @return
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public String getServiceID() {
        return ServiceID;
    }

    /**
     * The ID of the Service this Share participates in
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
        return new HashCodeBuilder().append(ActivityID).append(EndpointID).append(MappingPolicyID).append(ResourceID).append(ServiceID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShareAssociations) == false) {
            return false;
        }
        ShareAssociations rhs = ((ShareAssociations) other);
        return new EqualsBuilder().append(ActivityID, rhs.ActivityID).append(EndpointID, rhs.EndpointID).append(MappingPolicyID, rhs.MappingPolicyID).append(ResourceID, rhs.ResourceID).append(ServiceID, rhs.ServiceID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
