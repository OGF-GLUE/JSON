
package org.ogf.glue2;

import java.util.HashMap;
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
    "Type",
    "Value"
})
public class ApplicationHandle extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private ApplicationHandleAssociations Associations;
    /**
     * The type of method used to set up an ApplicationEnvironment - ApplicationHandle_t (open enumeration)
     * 
     */
    @JsonProperty("Type")
    private String Type;
    /**
     * How to set up the ApplicationEnvironment in the context of the Type
     * 
     */
    @JsonProperty("Value")
    private String Value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ApplicationHandleAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ApplicationHandleAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The type of method used to set up an ApplicationEnvironment - ApplicationHandle_t (open enumeration)
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * The type of method used to set up an ApplicationEnvironment - ApplicationHandle_t (open enumeration)
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * How to set up the ApplicationEnvironment in the context of the Type
     * 
     * @return
     *     The Value
     */
    @JsonProperty("Value")
    public String getValue() {
        return Value;
    }

    /**
     * How to set up the ApplicationEnvironment in the context of the Type
     * 
     * @param Value
     *     The Value
     */
    @JsonProperty("Value")
    public void setValue(String Value) {
        this.Value = Value;
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
        return new HashCodeBuilder().append(Associations).append(Type).append(Value).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationHandle) == false) {
            return false;
        }
        ApplicationHandle rhs = ((ApplicationHandle) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Type, rhs.Type).append(Value, rhs.Value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
