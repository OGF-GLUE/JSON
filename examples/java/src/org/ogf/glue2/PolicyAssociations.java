
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
    "UserDomainID"
})
public class PolicyAssociations {

    /**
     * The ID(s) of the UserDomains this Policy applies to
     * 
     */
    @JsonProperty("UserDomainID")
    private List<String> UserDomainID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID(s) of the UserDomains this Policy applies to
     * 
     * @return
     *     The UserDomainID
     */
    @JsonProperty("UserDomainID")
    public List<String> getUserDomainID() {
        return UserDomainID;
    }

    /**
     * The ID(s) of the UserDomains this Policy applies to
     * 
     * @param UserDomainID
     *     The UserDomainID
     */
    @JsonProperty("UserDomainID")
    public void setUserDomainID(List<String> UserDomainID) {
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
        return new HashCodeBuilder().append(UserDomainID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PolicyAssociations) == false) {
            return false;
        }
        PolicyAssociations rhs = ((PolicyAssociations) other);
        return new EqualsBuilder().append(UserDomainID, rhs.UserDomainID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
