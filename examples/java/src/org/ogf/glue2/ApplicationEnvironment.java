
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
    "AppName",
    "AppVersion",
    "Associations",
    "BestBenchmark",
    "Description",
    "FreeJobs",
    "FreeSlots",
    "FreeUserSeats",
    "License",
    "MaxJobs",
    "MaxSlots",
    "MaxUserSeats",
    "ParallelSupport",
    "RemovalDate",
    "State"
})
public class ApplicationEnvironment extends Entity {

    /**
     * The name of the application
     * 
     */
    @JsonProperty("AppName")
    private String AppName;
    /**
     * The version of the application
     * 
     */
    @JsonProperty("AppVersion")
    private String AppVersion;
    /**
     * 
     */
    @JsonProperty("Associations")
    private ApplicationEnvironmentAssociations Associations;
    /**
     * The type(s) of the benchmarks which best describe the sensitivity of this application to the performance of the ExecutionEnvironment - Benchmark_t
     * 
     */
    @JsonProperty("BestBenchmark")
    private List<String> BestBenchmark = new ArrayList<String>();
    /**
     * A human-readable description of the application
     * 
     */
    @JsonProperty("Description")
    private String Description;
    /**
     * The maximum number of additional jobs that can run the application
     * 
     */
    @JsonProperty("FreeJobs")
    private Long FreeJobs;
    /**
     * The maximum number slots currently available to run the application
     * 
     */
    @JsonProperty("FreeSlots")
    private Long FreeSlots;
    /**
     * The maximum number of additional users that can run the application
     * 
     */
    @JsonProperty("FreeUserSeats")
    private Long FreeUserSeats;
    /**
     * The license under which the application is usable - License_t
     * 
     */
    @JsonProperty("License")
    private String License;
    /**
     * The maximum number of concurrent jobs that can run the application
     * 
     */
    @JsonProperty("MaxJobs")
    private Long MaxJobs;
    /**
     * The maximum number of concurrent slots that may be used to run the application
     * 
     */
    @JsonProperty("MaxSlots")
    private Long MaxSlots;
    /**
     * The maximum number of concurrent users that can run the application
     * 
     */
    @JsonProperty("MaxUserSeats")
    private Long MaxUserSeats;
    /**
     * The type of supported parallel execution - ParallelSupport_t
     * 
     */
    @JsonProperty("ParallelSupport")
    private String ParallelSupport;
    /**
     * The date/time after which the application may be removed - DateTime_t
     * 
     */
    @JsonProperty("RemovalDate")
    private String RemovalDate;
    /**
     * The current installation state of the application - AppEnvState_t
     * 
     */
    @JsonProperty("State")
    private String State;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The name of the application
     * 
     * @return
     *     The AppName
     */
    @JsonProperty("AppName")
    public String getAppName() {
        return AppName;
    }

    /**
     * The name of the application
     * 
     * @param AppName
     *     The AppName
     */
    @JsonProperty("AppName")
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * The version of the application
     * 
     * @return
     *     The AppVersion
     */
    @JsonProperty("AppVersion")
    public String getAppVersion() {
        return AppVersion;
    }

    /**
     * The version of the application
     * 
     * @param AppVersion
     *     The AppVersion
     */
    @JsonProperty("AppVersion")
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ApplicationEnvironmentAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ApplicationEnvironmentAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The type(s) of the benchmarks which best describe the sensitivity of this application to the performance of the ExecutionEnvironment - Benchmark_t
     * 
     * @return
     *     The BestBenchmark
     */
    @JsonProperty("BestBenchmark")
    public List<String> getBestBenchmark() {
        return BestBenchmark;
    }

    /**
     * The type(s) of the benchmarks which best describe the sensitivity of this application to the performance of the ExecutionEnvironment - Benchmark_t
     * 
     * @param BestBenchmark
     *     The BestBenchmark
     */
    @JsonProperty("BestBenchmark")
    public void setBestBenchmark(List<String> BestBenchmark) {
        this.BestBenchmark = BestBenchmark;
    }

    /**
     * A human-readable description of the application
     * 
     * @return
     *     The Description
     */
    @JsonProperty("Description")
    public String getDescription() {
        return Description;
    }

    /**
     * A human-readable description of the application
     * 
     * @param Description
     *     The Description
     */
    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * The maximum number of additional jobs that can run the application
     * 
     * @return
     *     The FreeJobs
     */
    @JsonProperty("FreeJobs")
    public Long getFreeJobs() {
        return FreeJobs;
    }

    /**
     * The maximum number of additional jobs that can run the application
     * 
     * @param FreeJobs
     *     The FreeJobs
     */
    @JsonProperty("FreeJobs")
    public void setFreeJobs(Long FreeJobs) {
        this.FreeJobs = FreeJobs;
    }

    /**
     * The maximum number slots currently available to run the application
     * 
     * @return
     *     The FreeSlots
     */
    @JsonProperty("FreeSlots")
    public Long getFreeSlots() {
        return FreeSlots;
    }

    /**
     * The maximum number slots currently available to run the application
     * 
     * @param FreeSlots
     *     The FreeSlots
     */
    @JsonProperty("FreeSlots")
    public void setFreeSlots(Long FreeSlots) {
        this.FreeSlots = FreeSlots;
    }

    /**
     * The maximum number of additional users that can run the application
     * 
     * @return
     *     The FreeUserSeats
     */
    @JsonProperty("FreeUserSeats")
    public Long getFreeUserSeats() {
        return FreeUserSeats;
    }

    /**
     * The maximum number of additional users that can run the application
     * 
     * @param FreeUserSeats
     *     The FreeUserSeats
     */
    @JsonProperty("FreeUserSeats")
    public void setFreeUserSeats(Long FreeUserSeats) {
        this.FreeUserSeats = FreeUserSeats;
    }

    /**
     * The license under which the application is usable - License_t
     * 
     * @return
     *     The License
     */
    @JsonProperty("License")
    public String getLicense() {
        return License;
    }

    /**
     * The license under which the application is usable - License_t
     * 
     * @param License
     *     The License
     */
    @JsonProperty("License")
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * The maximum number of concurrent jobs that can run the application
     * 
     * @return
     *     The MaxJobs
     */
    @JsonProperty("MaxJobs")
    public Long getMaxJobs() {
        return MaxJobs;
    }

    /**
     * The maximum number of concurrent jobs that can run the application
     * 
     * @param MaxJobs
     *     The MaxJobs
     */
    @JsonProperty("MaxJobs")
    public void setMaxJobs(Long MaxJobs) {
        this.MaxJobs = MaxJobs;
    }

    /**
     * The maximum number of concurrent slots that may be used to run the application
     * 
     * @return
     *     The MaxSlots
     */
    @JsonProperty("MaxSlots")
    public Long getMaxSlots() {
        return MaxSlots;
    }

    /**
     * The maximum number of concurrent slots that may be used to run the application
     * 
     * @param MaxSlots
     *     The MaxSlots
     */
    @JsonProperty("MaxSlots")
    public void setMaxSlots(Long MaxSlots) {
        this.MaxSlots = MaxSlots;
    }

    /**
     * The maximum number of concurrent users that can run the application
     * 
     * @return
     *     The MaxUserSeats
     */
    @JsonProperty("MaxUserSeats")
    public Long getMaxUserSeats() {
        return MaxUserSeats;
    }

    /**
     * The maximum number of concurrent users that can run the application
     * 
     * @param MaxUserSeats
     *     The MaxUserSeats
     */
    @JsonProperty("MaxUserSeats")
    public void setMaxUserSeats(Long MaxUserSeats) {
        this.MaxUserSeats = MaxUserSeats;
    }

    /**
     * The type of supported parallel execution - ParallelSupport_t
     * 
     * @return
     *     The ParallelSupport
     */
    @JsonProperty("ParallelSupport")
    public String getParallelSupport() {
        return ParallelSupport;
    }

    /**
     * The type of supported parallel execution - ParallelSupport_t
     * 
     * @param ParallelSupport
     *     The ParallelSupport
     */
    @JsonProperty("ParallelSupport")
    public void setParallelSupport(String ParallelSupport) {
        this.ParallelSupport = ParallelSupport;
    }

    /**
     * The date/time after which the application may be removed - DateTime_t
     * 
     * @return
     *     The RemovalDate
     */
    @JsonProperty("RemovalDate")
    public String getRemovalDate() {
        return RemovalDate;
    }

    /**
     * The date/time after which the application may be removed - DateTime_t
     * 
     * @param RemovalDate
     *     The RemovalDate
     */
    @JsonProperty("RemovalDate")
    public void setRemovalDate(String RemovalDate) {
        this.RemovalDate = RemovalDate;
    }

    /**
     * The current installation state of the application - AppEnvState_t
     * 
     * @return
     *     The State
     */
    @JsonProperty("State")
    public String getState() {
        return State;
    }

    /**
     * The current installation state of the application - AppEnvState_t
     * 
     * @param State
     *     The State
     */
    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
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
        return new HashCodeBuilder().append(AppName).append(AppVersion).append(Associations).append(BestBenchmark).append(Description).append(FreeJobs).append(FreeSlots).append(FreeUserSeats).append(License).append(MaxJobs).append(MaxSlots).append(MaxUserSeats).append(ParallelSupport).append(RemovalDate).append(State).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationEnvironment) == false) {
            return false;
        }
        ApplicationEnvironment rhs = ((ApplicationEnvironment) other);
        return new EqualsBuilder().append(AppName, rhs.AppName).append(AppVersion, rhs.AppVersion).append(Associations, rhs.Associations).append(BestBenchmark, rhs.BestBenchmark).append(Description, rhs.Description).append(FreeJobs, rhs.FreeJobs).append(FreeSlots, rhs.FreeSlots).append(FreeUserSeats, rhs.FreeUserSeats).append(License, rhs.License).append(MaxJobs, rhs.MaxJobs).append(MaxSlots, rhs.MaxSlots).append(MaxUserSeats, rhs.MaxUserSeats).append(ParallelSupport, rhs.ParallelSupport).append(RemovalDate, rhs.RemovalDate).append(State, rhs.State).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
