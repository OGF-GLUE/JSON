
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
    "Associations",
    "Level",
    "Member",
    "UserManager"
})
public class UserDomain extends Domain {

    @JsonProperty("Associations")
    private UserDomainAssociations Associations;
    /**
     * the number of hops to reach the root of the hierarchy of UserDomains
     * 
     */
    @JsonProperty("Level")
    private Long Level;
    /**
     * Identifiers for users in this UserDomain
     * 
     */
    @JsonProperty("Member")
    private List<String> Member = new ArrayList<String>();
    /**
     * ID for the Endpoint of a Service managing users in this UserDomain
     * 
     */
    @JsonProperty("UserManager")
    private List<String> UserManager = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public UserDomainAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(UserDomainAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * the number of hops to reach the root of the hierarchy of UserDomains
     * 
     * @return
     *     The Level
     */
    @JsonProperty("Level")
    public Long getLevel() {
        return Level;
    }

    /**
     * the number of hops to reach the root of the hierarchy of UserDomains
     * 
     * @param Level
     *     The Level
     */
    @JsonProperty("Level")
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Identifiers for users in this UserDomain
     * 
     * @return
     *     The Member
     */
    @JsonProperty("Member")
    public List<String> getMember() {
        return Member;
    }

    /**
     * Identifiers for users in this UserDomain
     * 
     * @param Member
     *     The Member
     */
    @JsonProperty("Member")
    public void setMember(List<String> Member) {
        this.Member = Member;
    }

    /**
     * ID for the Endpoint of a Service managing users in this UserDomain
     * 
     * @return
     *     The UserManager
     */
    @JsonProperty("UserManager")
    public List<String> getUserManager() {
        return UserManager;
    }

    /**
     * ID for the Endpoint of a Service managing users in this UserDomain
     * 
     * @param UserManager
     *     The UserManager
     */
    @JsonProperty("UserManager")
    public void setUserManager(List<String> UserManager) {
        this.UserManager = UserManager;
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
        return new HashCodeBuilder().append(Associations).append(Level).append(Member).append(UserManager).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserDomain) == false) {
            return false;
        }
        UserDomain rhs = ((UserDomain) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Level, rhs.Level).append(Member, rhs.Member).append(UserManager, rhs.UserManager).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
