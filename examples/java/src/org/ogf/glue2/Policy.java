
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
    "Rule",
    "Scheme"
})
public class Policy extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private PolicyAssociations Associations;
    /**
     * Policy rules
     * 
     */
    @JsonProperty("Rule")
    private List<String> Rule = new ArrayList<String>();
    /**
     * PolicyScheme_t (open enumeration)
     * 
     */
    @JsonProperty("Scheme")
    private String Scheme;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public PolicyAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(PolicyAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * Policy rules
     * 
     * @return
     *     The Rule
     */
    @JsonProperty("Rule")
    public List<String> getRule() {
        return Rule;
    }

    /**
     * Policy rules
     * 
     * @param Rule
     *     The Rule
     */
    @JsonProperty("Rule")
    public void setRule(List<String> Rule) {
        this.Rule = Rule;
    }

    /**
     * PolicyScheme_t (open enumeration)
     * 
     * @return
     *     The Scheme
     */
    @JsonProperty("Scheme")
    public String getScheme() {
        return Scheme;
    }

    /**
     * PolicyScheme_t (open enumeration)
     * 
     * @param Scheme
     *     The Scheme
     */
    @JsonProperty("Scheme")
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
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
        return new HashCodeBuilder().append(Associations).append(Rule).append(Scheme).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Policy) == false) {
            return false;
        }
        Policy rhs = ((Policy) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Rule, rhs.Rule).append(Scheme, rhs.Scheme).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
