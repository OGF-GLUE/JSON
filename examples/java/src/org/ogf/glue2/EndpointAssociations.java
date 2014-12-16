
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
    "AccessPolicyID",
    "ActivityID",
    "ServiceID",
    "ShareID"
})
public class EndpointAssociations {

    /**
     * IDs of AccessPolicies associated with this Endpoint
     * 
     */
    @JsonProperty("AccessPolicyID")
    private List<String> AccessPolicyID = new ArrayList<String>();
    /**
     * IDs of Activities being managed through this Endpoint
     * 
     */
    @JsonProperty("ActivityID")
    private List<String> ActivityID = new ArrayList<String>();
    /**
     * The ID of the Service associated with this Endpoint
     * 
     */
    @JsonProperty("ServiceID")
    private String ServiceID;
    /**
     * The IDs of the Shares accessible from this Endpoint
     * 
     */
    @JsonProperty("ShareID")
    private List<String> ShareID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * IDs of AccessPolicies associated with this Endpoint
     * 
     * @return
     *     The AccessPolicyID
     */
    @JsonProperty("AccessPolicyID")
    public List<String> getAccessPolicyID() {
        return AccessPolicyID;
    }

    /**
     * IDs of AccessPolicies associated with this Endpoint
     * 
     * @param AccessPolicyID
     *     The AccessPolicyID
     */
    @JsonProperty("AccessPolicyID")
    public void setAccessPolicyID(List<String> AccessPolicyID) {
        this.AccessPolicyID = AccessPolicyID;
    }

    /**
     * IDs of Activities being managed through this Endpoint
     * 
     * @return
     *     The ActivityID
     */
    @JsonProperty("ActivityID")
    public List<String> getActivityID() {
        return ActivityID;
    }

    /**
     * IDs of Activities being managed through this Endpoint
     * 
     * @param ActivityID
     *     The ActivityID
     */
    @JsonProperty("ActivityID")
    public void setActivityID(List<String> ActivityID) {
        this.ActivityID = ActivityID;
    }

    /**
     * The ID of the Service associated with this Endpoint
     * 
     * @return
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public String getServiceID() {
        return ServiceID;
    }

    /**
     * The ID of the Service associated with this Endpoint
     * 
     * @param ServiceID
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * The IDs of the Shares accessible from this Endpoint
     * 
     * @return
     *     The ShareID
     */
    @JsonProperty("ShareID")
    public List<String> getShareID() {
        return ShareID;
    }

    /**
     * The IDs of the Shares accessible from this Endpoint
     * 
     * @param ShareID
     *     The ShareID
     */
    @JsonProperty("ShareID")
    public void setShareID(List<String> ShareID) {
        this.ShareID = ShareID;
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
        return new HashCodeBuilder().append(AccessPolicyID).append(ActivityID).append(ServiceID).append(ShareID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointAssociations) == false) {
            return false;
        }
        EndpointAssociations rhs = ((EndpointAssociations) other);
        return new EqualsBuilder().append(AccessPolicyID, rhs.AccessPolicyID).append(ActivityID, rhs.ActivityID).append(ServiceID, rhs.ServiceID).append(ShareID, rhs.ShareID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
