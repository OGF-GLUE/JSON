
package org.ogf.glue2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "JobDescription",
    "PreLRMSWaitingJobs",
    "RunningJobs",
    "Staging",
    "StagingJobs",
    "SuspendedJobs",
    "TotalJobs",
    "WaitingJobs"
})
public class ComputingEndpoint extends Endpoint {

    /**
     * Supported job description languages - JobDescription_t (open Enumeration)
     * 
     */
    @JsonProperty("JobDescription")
    private List<String> JobDescription = new ArrayList<String>();
    /**
     * The number of Grid jobs managed by the Grid software, but not yet passed to the LRMS
     * 
     */
    @JsonProperty("PreLRMSWaitingJobs")
    private Long PreLRMSWaitingJobs;
    /**
     * The number of Grid jobs which are running in an ExecutionEnvironment
     * 
     */
    @JsonProperty("RunningJobs")
    private Long RunningJobs;
    /**
     * Supported file staging functionality - Staging_t
     * 
     */
    @JsonProperty("Staging")
    private ComputingEndpoint.Staging Staging;
    /**
     * The number of Grid jobs staging files before or after execution
     * 
     */
    @JsonProperty("StagingJobs")
    private Long StagingJobs;
    /**
     * The number of Grid jobs that started to execute, but are now suspended
     * 
     */
    @JsonProperty("SuspendedJobs")
    private Long SuspendedJobs;
    /**
     * The total number of Grid jobs known to the system
     * 
     */
    @JsonProperty("TotalJobs")
    private Long TotalJobs;
    /**
     * The number of Grid jobs which are waiting to start executing
     * 
     */
    @JsonProperty("WaitingJobs")
    private Long WaitingJobs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Supported job description languages - JobDescription_t (open Enumeration)
     * 
     * @return
     *     The JobDescription
     */
    @JsonProperty("JobDescription")
    public List<String> getJobDescription() {
        return JobDescription;
    }

    /**
     * Supported job description languages - JobDescription_t (open Enumeration)
     * 
     * @param JobDescription
     *     The JobDescription
     */
    @JsonProperty("JobDescription")
    public void setJobDescription(List<String> JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * The number of Grid jobs managed by the Grid software, but not yet passed to the LRMS
     * 
     * @return
     *     The PreLRMSWaitingJobs
     */
    @JsonProperty("PreLRMSWaitingJobs")
    public Long getPreLRMSWaitingJobs() {
        return PreLRMSWaitingJobs;
    }

    /**
     * The number of Grid jobs managed by the Grid software, but not yet passed to the LRMS
     * 
     * @param PreLRMSWaitingJobs
     *     The PreLRMSWaitingJobs
     */
    @JsonProperty("PreLRMSWaitingJobs")
    public void setPreLRMSWaitingJobs(Long PreLRMSWaitingJobs) {
        this.PreLRMSWaitingJobs = PreLRMSWaitingJobs;
    }

    /**
     * The number of Grid jobs which are running in an ExecutionEnvironment
     * 
     * @return
     *     The RunningJobs
     */
    @JsonProperty("RunningJobs")
    public Long getRunningJobs() {
        return RunningJobs;
    }

    /**
     * The number of Grid jobs which are running in an ExecutionEnvironment
     * 
     * @param RunningJobs
     *     The RunningJobs
     */
    @JsonProperty("RunningJobs")
    public void setRunningJobs(Long RunningJobs) {
        this.RunningJobs = RunningJobs;
    }

    /**
     * Supported file staging functionality - Staging_t
     * 
     * @return
     *     The Staging
     */
    @JsonProperty("Staging")
    public ComputingEndpoint.Staging getStaging() {
        return Staging;
    }

    /**
     * Supported file staging functionality - Staging_t
     * 
     * @param Staging
     *     The Staging
     */
    @JsonProperty("Staging")
    public void setStaging(ComputingEndpoint.Staging Staging) {
        this.Staging = Staging;
    }

    /**
     * The number of Grid jobs staging files before or after execution
     * 
     * @return
     *     The StagingJobs
     */
    @JsonProperty("StagingJobs")
    public Long getStagingJobs() {
        return StagingJobs;
    }

    /**
     * The number of Grid jobs staging files before or after execution
     * 
     * @param StagingJobs
     *     The StagingJobs
     */
    @JsonProperty("StagingJobs")
    public void setStagingJobs(Long StagingJobs) {
        this.StagingJobs = StagingJobs;
    }

    /**
     * The number of Grid jobs that started to execute, but are now suspended
     * 
     * @return
     *     The SuspendedJobs
     */
    @JsonProperty("SuspendedJobs")
    public Long getSuspendedJobs() {
        return SuspendedJobs;
    }

    /**
     * The number of Grid jobs that started to execute, but are now suspended
     * 
     * @param SuspendedJobs
     *     The SuspendedJobs
     */
    @JsonProperty("SuspendedJobs")
    public void setSuspendedJobs(Long SuspendedJobs) {
        this.SuspendedJobs = SuspendedJobs;
    }

    /**
     * The total number of Grid jobs known to the system
     * 
     * @return
     *     The TotalJobs
     */
    @JsonProperty("TotalJobs")
    public Long getTotalJobs() {
        return TotalJobs;
    }

    /**
     * The total number of Grid jobs known to the system
     * 
     * @param TotalJobs
     *     The TotalJobs
     */
    @JsonProperty("TotalJobs")
    public void setTotalJobs(Long TotalJobs) {
        this.TotalJobs = TotalJobs;
    }

    /**
     * The number of Grid jobs which are waiting to start executing
     * 
     * @return
     *     The WaitingJobs
     */
    @JsonProperty("WaitingJobs")
    public Long getWaitingJobs() {
        return WaitingJobs;
    }

    /**
     * The number of Grid jobs which are waiting to start executing
     * 
     * @param WaitingJobs
     *     The WaitingJobs
     */
    @JsonProperty("WaitingJobs")
    public void setWaitingJobs(Long WaitingJobs) {
        this.WaitingJobs = WaitingJobs;
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
        return new HashCodeBuilder().append(JobDescription).append(PreLRMSWaitingJobs).append(RunningJobs).append(Staging).append(StagingJobs).append(SuspendedJobs).append(TotalJobs).append(WaitingJobs).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComputingEndpoint) == false) {
            return false;
        }
        ComputingEndpoint rhs = ((ComputingEndpoint) other);
        return new EqualsBuilder().append(JobDescription, rhs.JobDescription).append(PreLRMSWaitingJobs, rhs.PreLRMSWaitingJobs).append(RunningJobs, rhs.RunningJobs).append(Staging, rhs.Staging).append(StagingJobs, rhs.StagingJobs).append(SuspendedJobs, rhs.SuspendedJobs).append(TotalJobs, rhs.TotalJobs).append(WaitingJobs, rhs.WaitingJobs).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Staging {

        NONE("none"),
        STAGINGIN("stagingin"),
        STAGINGINOUT("staginginout"),
        STAGINGOUT("stagingout");
        private final String value;
        private static Map<String, ComputingEndpoint.Staging> constants = new HashMap<String, ComputingEndpoint.Staging>();

        static {
            for (ComputingEndpoint.Staging c: values()) {
                constants.put(c.value, c);
            }
        }

        private Staging(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static ComputingEndpoint.Staging fromValue(String value) {
            ComputingEndpoint.Staging constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
