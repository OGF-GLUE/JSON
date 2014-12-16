
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
    "ComputingManagerID",
    "ExecutionEnvironmentID"
})
public class BenchmarkAssociations {

    /**
     * The ID of the ComputingManager this benchmark is for
     * 
     */
    @JsonProperty("ComputingManagerID")
    private String ComputingManagerID;
    /**
     * ID of the ExecutionEnvironment this benchmark is for
     * 
     */
    @JsonProperty("ExecutionEnvironmentID")
    private String ExecutionEnvironmentID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID of the ComputingManager this benchmark is for
     * 
     * @return
     *     The ComputingManagerID
     */
    @JsonProperty("ComputingManagerID")
    public String getComputingManagerID() {
        return ComputingManagerID;
    }

    /**
     * The ID of the ComputingManager this benchmark is for
     * 
     * @param ComputingManagerID
     *     The ComputingManagerID
     */
    @JsonProperty("ComputingManagerID")
    public void setComputingManagerID(String ComputingManagerID) {
        this.ComputingManagerID = ComputingManagerID;
    }

    /**
     * ID of the ExecutionEnvironment this benchmark is for
     * 
     * @return
     *     The ExecutionEnvironmentID
     */
    @JsonProperty("ExecutionEnvironmentID")
    public String getExecutionEnvironmentID() {
        return ExecutionEnvironmentID;
    }

    /**
     * ID of the ExecutionEnvironment this benchmark is for
     * 
     * @param ExecutionEnvironmentID
     *     The ExecutionEnvironmentID
     */
    @JsonProperty("ExecutionEnvironmentID")
    public void setExecutionEnvironmentID(String ExecutionEnvironmentID) {
        this.ExecutionEnvironmentID = ExecutionEnvironmentID;
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
        return new HashCodeBuilder().append(ComputingManagerID).append(ExecutionEnvironmentID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BenchmarkAssociations) == false) {
            return false;
        }
        BenchmarkAssociations rhs = ((BenchmarkAssociations) other);
        return new EqualsBuilder().append(ComputingManagerID, rhs.ComputingManagerID).append(ExecutionEnvironmentID, rhs.ExecutionEnvironmentID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
