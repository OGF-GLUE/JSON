
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
public class Benchmark extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private BenchmarkAssociations Associations;
    /**
     * The type of the benchmark - Benchmark_t (open enumeration)
     * 
     */
    @JsonProperty("Type")
    private String Type;
    /**
     * The value of the benchmark
     * 
     */
    @JsonProperty("Value")
    private Double Value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public BenchmarkAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(BenchmarkAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The type of the benchmark - Benchmark_t (open enumeration)
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * The type of the benchmark - Benchmark_t (open enumeration)
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * The value of the benchmark
     * 
     * @return
     *     The Value
     */
    @JsonProperty("Value")
    public Double getValue() {
        return Value;
    }

    /**
     * The value of the benchmark
     * 
     * @param Value
     *     The Value
     */
    @JsonProperty("Value")
    public void setValue(Double Value) {
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
        if ((other instanceof Benchmark) == false) {
            return false;
        }
        Benchmark rhs = ((Benchmark) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Type, rhs.Type).append(Value, rhs.Value).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
