
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
    "ApplicationHandleID",
    "ComputingManagerID",
    "ExecutionEnvironmentID"
})
public class ApplicationEnvironmentAssociations {

    /**
     * ID(s) of the ApplicationHandles that can be used to refer to this environment
     * 
     */
    @JsonProperty("ApplicationHandleID")
    private List<String> ApplicationHandleID = new ArrayList<String>();
    /**
     * ID of the ComputingManager this ApplicationEnvironment is associated with
     * 
     */
    @JsonProperty("ComputingManagerID")
    private String ComputingManagerID;
    /**
     * ID(s) of ExecutionEnvironments where this ApplicationEnvironment can be used
     * 
     */
    @JsonProperty("ExecutionEnvironmentID")
    private List<String> ExecutionEnvironmentID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID(s) of the ApplicationHandles that can be used to refer to this environment
     * 
     * @return
     *     The ApplicationHandleID
     */
    @JsonProperty("ApplicationHandleID")
    public List<String> getApplicationHandleID() {
        return ApplicationHandleID;
    }

    /**
     * ID(s) of the ApplicationHandles that can be used to refer to this environment
     * 
     * @param ApplicationHandleID
     *     The ApplicationHandleID
     */
    @JsonProperty("ApplicationHandleID")
    public void setApplicationHandleID(List<String> ApplicationHandleID) {
        this.ApplicationHandleID = ApplicationHandleID;
    }

    /**
     * ID of the ComputingManager this ApplicationEnvironment is associated with
     * 
     * @return
     *     The ComputingManagerID
     */
    @JsonProperty("ComputingManagerID")
    public String getComputingManagerID() {
        return ComputingManagerID;
    }

    /**
     * ID of the ComputingManager this ApplicationEnvironment is associated with
     * 
     * @param ComputingManagerID
     *     The ComputingManagerID
     */
    @JsonProperty("ComputingManagerID")
    public void setComputingManagerID(String ComputingManagerID) {
        this.ComputingManagerID = ComputingManagerID;
    }

    /**
     * ID(s) of ExecutionEnvironments where this ApplicationEnvironment can be used
     * 
     * @return
     *     The ExecutionEnvironmentID
     */
    @JsonProperty("ExecutionEnvironmentID")
    public List<String> getExecutionEnvironmentID() {
        return ExecutionEnvironmentID;
    }

    /**
     * ID(s) of ExecutionEnvironments where this ApplicationEnvironment can be used
     * 
     * @param ExecutionEnvironmentID
     *     The ExecutionEnvironmentID
     */
    @JsonProperty("ExecutionEnvironmentID")
    public void setExecutionEnvironmentID(List<String> ExecutionEnvironmentID) {
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
        return new HashCodeBuilder().append(ApplicationHandleID).append(ComputingManagerID).append(ExecutionEnvironmentID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationEnvironmentAssociations) == false) {
            return false;
        }
        ApplicationEnvironmentAssociations rhs = ((ApplicationEnvironmentAssociations) other);
        return new EqualsBuilder().append(ApplicationHandleID, rhs.ApplicationHandleID).append(ComputingManagerID, rhs.ComputingManagerID).append(ExecutionEnvironmentID, rhs.ExecutionEnvironmentID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
