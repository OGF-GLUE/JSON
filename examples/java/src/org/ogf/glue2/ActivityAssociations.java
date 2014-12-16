
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
    "ResourceID",
    "ShareID",
    "UserDomainID"
})
public class ActivityAssociations {

    /**
     * The IDs of other Activities related to this one
     * 
     */
    @JsonProperty("ActivityID")
    private List<String> ActivityID = new ArrayList<String>();
    /**
     * The ID of the Endpoint managing this Activity
     * 
     */
    @JsonProperty("EndpointID")
    private String EndpointID;
    /**
     * The ID of the Resource executing this Activity
     * 
     */
    @JsonProperty("ResourceID")
    private String ResourceID;
    /**
     * The ID of the Share servicing this Activity
     * 
     */
    @JsonProperty("ShareID")
    private String ShareID;
    /**
     * The ID of the UserDomain managing this Activity
     * 
     */
    @JsonProperty("UserDomainID")
    private String UserDomainID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The IDs of other Activities related to this one
     * 
     * @return
     *     The ActivityID
     */
    @JsonProperty("ActivityID")
    public List<String> getActivityID() {
        return ActivityID;
    }

    /**
     * The IDs of other Activities related to this one
     * 
     * @param ActivityID
     *     The ActivityID
     */
    @JsonProperty("ActivityID")
    public void setActivityID(List<String> ActivityID) {
        this.ActivityID = ActivityID;
    }

    /**
     * The ID of the Endpoint managing this Activity
     * 
     * @return
     *     The EndpointID
     */
    @JsonProperty("EndpointID")
    public String getEndpointID() {
        return EndpointID;
    }

    /**
     * The ID of the Endpoint managing this Activity
     * 
     * @param EndpointID
     *     The EndpointID
     */
    @JsonProperty("EndpointID")
    public void setEndpointID(String EndpointID) {
        this.EndpointID = EndpointID;
    }

    /**
     * The ID of the Resource executing this Activity
     * 
     * @return
     *     The ResourceID
     */
    @JsonProperty("ResourceID")
    public String getResourceID() {
        return ResourceID;
    }

    /**
     * The ID of the Resource executing this Activity
     * 
     * @param ResourceID
     *     The ResourceID
     */
    @JsonProperty("ResourceID")
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * The ID of the Share servicing this Activity
     * 
     * @return
     *     The ShareID
     */
    @JsonProperty("ShareID")
    public String getShareID() {
        return ShareID;
    }

    /**
     * The ID of the Share servicing this Activity
     * 
     * @param ShareID
     *     The ShareID
     */
    @JsonProperty("ShareID")
    public void setShareID(String ShareID) {
        this.ShareID = ShareID;
    }

    /**
     * The ID of the UserDomain managing this Activity
     * 
     * @return
     *     The UserDomainID
     */
    @JsonProperty("UserDomainID")
    public String getUserDomainID() {
        return UserDomainID;
    }

    /**
     * The ID of the UserDomain managing this Activity
     * 
     * @param UserDomainID
     *     The UserDomainID
     */
    @JsonProperty("UserDomainID")
    public void setUserDomainID(String UserDomainID) {
        this.UserDomainID = UserDomainID;
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
        return new HashCodeBuilder().append(ActivityID).append(EndpointID).append(ResourceID).append(ShareID).append(UserDomainID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ActivityAssociations) == false) {
            return false;
        }
        ActivityAssociations rhs = ((ActivityAssociations) other);
        return new EqualsBuilder().append(ActivityID, rhs.ActivityID).append(EndpointID, rhs.EndpointID).append(ResourceID, rhs.ResourceID).append(ShareID, rhs.ShareID).append(UserDomainID, rhs.UserDomainID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
