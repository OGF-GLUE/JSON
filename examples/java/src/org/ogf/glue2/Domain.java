
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
    "Description",
    "WWW"
})
public class Domain extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private DomainAssociations Associations;
    /**
     * A description of the Domain
     * 
     */
    @JsonProperty("Description")
    private String Description;
    /**
     * URLs of web pages with more information about the Domain
     * 
     */
    @JsonProperty("WWW")
    private List<String> WWW = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public DomainAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(DomainAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * A description of the Domain
     * 
     * @return
     *     The Description
     */
    @JsonProperty("Description")
    public String getDescription() {
        return Description;
    }

    /**
     * A description of the Domain
     * 
     * @param Description
     *     The Description
     */
    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * URLs of web pages with more information about the Domain
     * 
     * @return
     *     The WWW
     */
    @JsonProperty("WWW")
    public List<String> getWWW() {
        return WWW;
    }

    /**
     * URLs of web pages with more information about the Domain
     * 
     * @param WWW
     *     The WWW
     */
    @JsonProperty("WWW")
    public void setWWW(List<String> WWW) {
        this.WWW = WWW;
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
        return new HashCodeBuilder().append(Associations).append(Description).append(WWW).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Domain) == false) {
            return false;
        }
        Domain rhs = ((Domain) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Description, rhs.Description).append(WWW, rhs.WWW).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
