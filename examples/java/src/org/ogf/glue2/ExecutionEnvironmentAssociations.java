
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
    "ApplicationEnvironmentID",
    "BenchmarkID"
})
public class ExecutionEnvironmentAssociations extends ResourceAssociations {

    /**
     * ID(s) of ApplicationEnvironments available in this ExecutionEnvironment
     * 
     */
    @JsonProperty("ApplicationEnvironmentID")
    private List<String> ApplicationEnvironmentID = new ArrayList<String>();
    /**
     * ID(s) of Benchmarks associated with this ExecutionEnvironment
     * 
     */
    @JsonProperty("BenchmarkID")
    private List<String> BenchmarkID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID(s) of ApplicationEnvironments available in this ExecutionEnvironment
     * 
     * @return
     *     The ApplicationEnvironmentID
     */
    @JsonProperty("ApplicationEnvironmentID")
    public List<String> getApplicationEnvironmentID() {
        return ApplicationEnvironmentID;
    }

    /**
     * ID(s) of ApplicationEnvironments available in this ExecutionEnvironment
     * 
     * @param ApplicationEnvironmentID
     *     The ApplicationEnvironmentID
     */
    @JsonProperty("ApplicationEnvironmentID")
    public void setApplicationEnvironmentID(List<String> ApplicationEnvironmentID) {
        this.ApplicationEnvironmentID = ApplicationEnvironmentID;
    }

    /**
     * ID(s) of Benchmarks associated with this ExecutionEnvironment
     * 
     * @return
     *     The BenchmarkID
     */
    @JsonProperty("BenchmarkID")
    public List<String> getBenchmarkID() {
        return BenchmarkID;
    }

    /**
     * ID(s) of Benchmarks associated with this ExecutionEnvironment
     * 
     * @param BenchmarkID
     *     The BenchmarkID
     */
    @JsonProperty("BenchmarkID")
    public void setBenchmarkID(List<String> BenchmarkID) {
        this.BenchmarkID = BenchmarkID;
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
        return new HashCodeBuilder().append(ApplicationEnvironmentID).append(BenchmarkID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExecutionEnvironmentAssociations) == false) {
            return false;
        }
        ExecutionEnvironmentAssociations rhs = ((ExecutionEnvironmentAssociations) other);
        return new EqualsBuilder().append(ApplicationEnvironmentID, rhs.ApplicationEnvironmentID).append(BenchmarkID, rhs.BenchmarkID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
