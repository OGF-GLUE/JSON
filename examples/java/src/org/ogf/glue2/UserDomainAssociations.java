
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
    "ChildDomainID",
    "MappingPolicyID",
    "ParentDomainID",
    "PolicyID"
})
public class UserDomainAssociations extends DomainAssociations {

    /**
     * IDs of AccessPolicies associated with this UserDomain
     * 
     */
    @JsonProperty("AccessPolicyID")
    private List<String> AccessPolicyID = new ArrayList<String>();
    /**
     * IDs of UserDomains aggregated by this UserDomain
     * 
     */
    @JsonProperty("ChildDomainID")
    private List<String> ChildDomainID = new ArrayList<String>();
    /**
     * IDs of MappingPolicies associated with this UserDomain
     * 
     */
    @JsonProperty("MappingPolicyID")
    private List<String> MappingPolicyID = new ArrayList<String>();
    /**
     * The ID of the UserDomain that this UserDomain participates in
     * 
     */
    @JsonProperty("ParentDomainID")
    private String ParentDomainID;
    /**
     * IDs for Policies associated with this UserDomain
     * 
     */
    @JsonProperty("PolicyID")
    private List<String> PolicyID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * IDs of AccessPolicies associated with this UserDomain
     * 
     * @return
     *     The AccessPolicyID
     */
    @JsonProperty("AccessPolicyID")
    public List<String> getAccessPolicyID() {
        return AccessPolicyID;
    }

    /**
     * IDs of AccessPolicies associated with this UserDomain
     * 
     * @param AccessPolicyID
     *     The AccessPolicyID
     */
    @JsonProperty("AccessPolicyID")
    public void setAccessPolicyID(List<String> AccessPolicyID) {
        this.AccessPolicyID = AccessPolicyID;
    }

    /**
     * IDs of UserDomains aggregated by this UserDomain
     * 
     * @return
     *     The ChildDomainID
     */
    @JsonProperty("ChildDomainID")
    public List<String> getChildDomainID() {
        return ChildDomainID;
    }

    /**
     * IDs of UserDomains aggregated by this UserDomain
     * 
     * @param ChildDomainID
     *     The ChildDomainID
     */
    @JsonProperty("ChildDomainID")
    public void setChildDomainID(List<String> ChildDomainID) {
        this.ChildDomainID = ChildDomainID;
    }

    /**
     * IDs of MappingPolicies associated with this UserDomain
     * 
     * @return
     *     The MappingPolicyID
     */
    @JsonProperty("MappingPolicyID")
    public List<String> getMappingPolicyID() {
        return MappingPolicyID;
    }

    /**
     * IDs of MappingPolicies associated with this UserDomain
     * 
     * @param MappingPolicyID
     *     The MappingPolicyID
     */
    @JsonProperty("MappingPolicyID")
    public void setMappingPolicyID(List<String> MappingPolicyID) {
        this.MappingPolicyID = MappingPolicyID;
    }

    /**
     * The ID of the UserDomain that this UserDomain participates in
     * 
     * @return
     *     The ParentDomainID
     */
    @JsonProperty("ParentDomainID")
    public String getParentDomainID() {
        return ParentDomainID;
    }

    /**
     * The ID of the UserDomain that this UserDomain participates in
     * 
     * @param ParentDomainID
     *     The ParentDomainID
     */
    @JsonProperty("ParentDomainID")
    public void setParentDomainID(String ParentDomainID) {
        this.ParentDomainID = ParentDomainID;
    }

    /**
     * IDs for Policies associated with this UserDomain
     * 
     * @return
     *     The PolicyID
     */
    @JsonProperty("PolicyID")
    public List<String> getPolicyID() {
        return PolicyID;
    }

    /**
     * IDs for Policies associated with this UserDomain
     * 
     * @param PolicyID
     *     The PolicyID
     */
    @JsonProperty("PolicyID")
    public void setPolicyID(List<String> PolicyID) {
        this.PolicyID = PolicyID;
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
        return new HashCodeBuilder().append(AccessPolicyID).append(ChildDomainID).append(MappingPolicyID).append(ParentDomainID).append(PolicyID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserDomainAssociations) == false) {
            return false;
        }
        UserDomainAssociations rhs = ((UserDomainAssociations) other);
        return new EqualsBuilder().append(AccessPolicyID, rhs.AccessPolicyID).append(ChildDomainID, rhs.ChildDomainID).append(MappingPolicyID, rhs.MappingPolicyID).append(ParentDomainID, rhs.ParentDomainID).append(PolicyID, rhs.PolicyID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
