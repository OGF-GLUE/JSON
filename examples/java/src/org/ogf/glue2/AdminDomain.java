
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
    "Distributed",
    "Owner"
})
public class AdminDomain extends Domain {

    /**
     * 
     */
    @JsonProperty("Associations")
    private AdminDomainAssociations Associations;
    /**
     * true if the services managed by the AdminDomain are geographically distributed
     * 
     */
    @JsonProperty("Distributed")
    private Boolean Distributed;
    /**
     * Identification of persons or legal entities that own the resources in this AdminDomain
     * 
     */
    @JsonProperty("Owner")
    private List<String> Owner = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public AdminDomainAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(AdminDomainAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * true if the services managed by the AdminDomain are geographically distributed
     * 
     * @return
     *     The Distributed
     */
    @JsonProperty("Distributed")
    public Boolean getDistributed() {
        return Distributed;
    }

    /**
     * true if the services managed by the AdminDomain are geographically distributed
     * 
     * @param Distributed
     *     The Distributed
     */
    @JsonProperty("Distributed")
    public void setDistributed(Boolean Distributed) {
        this.Distributed = Distributed;
    }

    /**
     * Identification of persons or legal entities that own the resources in this AdminDomain
     * 
     * @return
     *     The Owner
     */
    @JsonProperty("Owner")
    public List<String> getOwner() {
        return Owner;
    }

    /**
     * Identification of persons or legal entities that own the resources in this AdminDomain
     * 
     * @param Owner
     *     The Owner
     */
    @JsonProperty("Owner")
    public void setOwner(List<String> Owner) {
        this.Owner = Owner;
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
        return new HashCodeBuilder().append(Associations).append(Distributed).append(Owner).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdminDomain) == false) {
            return false;
        }
        AdminDomain rhs = ((AdminDomain) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Distributed, rhs.Distributed).append(Owner, rhs.Owner).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
