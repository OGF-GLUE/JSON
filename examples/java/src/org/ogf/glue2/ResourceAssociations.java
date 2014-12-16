
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
    "ManagerID",
    "ShareID"
})
public class ResourceAssociations {

    /**
     * The ID(s) of Activities consuming from this Share
     * 
     */
    @JsonProperty("ActivityID")
    private List<String> ActivityID = new ArrayList<String>();
    /**
     * The ID of the Manager for this Resource
     * 
     */
    @JsonProperty("ManagerID")
    private String ManagerID;
    /**
     * The ID(s) of the Shares this Resource is part of
     * 
     */
    @JsonProperty("ShareID")
    private List<String> ShareID = new ArrayList<String>();
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
     * The ID of the Manager for this Resource
     * 
     * @return
     *     The ManagerID
     */
    @JsonProperty("ManagerID")
    public String getManagerID() {
        return ManagerID;
    }

    /**
     * The ID of the Manager for this Resource
     * 
     * @param ManagerID
     *     The ManagerID
     */
    @JsonProperty("ManagerID")
    public void setManagerID(String ManagerID) {
        this.ManagerID = ManagerID;
    }

    /**
     * The ID(s) of the Shares this Resource is part of
     * 
     * @return
     *     The ShareID
     */
    @JsonProperty("ShareID")
    public List<String> getShareID() {
        return ShareID;
    }

    /**
     * The ID(s) of the Shares this Resource is part of
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
        return new HashCodeBuilder().append(ActivityID).append(ManagerID).append(ShareID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceAssociations) == false) {
            return false;
        }
        ResourceAssociations rhs = ((ResourceAssociations) other);
        return new EqualsBuilder().append(ActivityID, rhs.ActivityID).append(ManagerID, rhs.ManagerID).append(ShareID, rhs.ShareID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
