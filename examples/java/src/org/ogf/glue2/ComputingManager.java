
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
    "ApplicationDir",
    "Associations",
    "BulkSubmission",
    "CacheFree",
    "CacheTotal",
    "Homogeneous",
    "LocalCPUDistribution",
    "NetworkInfo",
    "Reservation",
    "ScratchDir",
    "SlotsUsedByGridJobs",
    "SlotsUsedByLocalJobs",
    "TmpDir",
    "TotalLogicalCPUs",
    "TotalPhysicalCPUs",
    "TotalSlots",
    "WorkingAreaFree",
    "WorkingAreaGuaranteed",
    "WorkingAreaLifeTime",
    "WorkingAreaMultiSlotFree",
    "WorkingAreaMultiSlotLifeTime",
    "WorkingAreaMultiSlotTotal",
    "WorkingAreaShared",
    "WorkingAreaTotal"
})
public class ComputingManager extends Manager {

    /**
     * The absolute path of a directory available for installation of persistent application software
     * 
     */
    @JsonProperty("ApplicationDir")
    private String ApplicationDir;
    @JsonProperty("Associations")
    private ComputingManagerAssociations Associations;
    /**
     * Whether multiple jobs can be submitted at once (no value implies undefined in ExtendedBoolean_t)
     * 
     */
    @JsonProperty("BulkSubmission")
    private Boolean BulkSubmission;
    /**
     * If local caching of input files is supported, the available size of the area they may be stored in
     * 
     */
    @JsonProperty("CacheFree")
    private Long CacheFree;
    /**
     * If local caching of input files is supported, the total size of the area they may be stored in
     * 
     */
    @JsonProperty("CacheTotal")
    private Long CacheTotal;
    /**
     * Whether this ComputingManager manages only one type of ExecutionEnvironment
     * 
     */
    @JsonProperty("Homogeneous")
    private Boolean Homogeneous;
    /**
     * Classification of the managed ExecutionEnvironments aggregated by the number of logical CPUs
     * 
     */
    @JsonProperty("LocalCPUDistribution")
    private Boolean LocalCPUDistribution;
    /**
     * The types of internal network connections between ExecutionEnvironments (NetworkInfo_t)
     * 
     */
    @JsonProperty("NetworkInfo")
    private List<String> NetworkInfo = new ArrayList<String>();
    /**
     * Whether advance reservation is supported (no value implies undefined in ExtendedBoolean_t)
     * 
     */
    @JsonProperty("Reservation")
    private Boolean Reservation;
    /**
     * The absolute path of a shared directory available for application data
     * 
     */
    @JsonProperty("ScratchDir")
    private String ScratchDir;
    /**
     * The number of slots currently used by jobs submitted via a non-Grid interface
     * 
     */
    @JsonProperty("SlotsUsedByGridJobs")
    private Long SlotsUsedByGridJobs;
    /**
     * The number of slots currently used by jobs submitted via a non-Grid interface
     * 
     */
    @JsonProperty("SlotsUsedByLocalJobs")
    private Long SlotsUsedByLocalJobs;
    /**
     * The absolute path of a temporary directory local to an ExecutionEnvironment
     * 
     */
    @JsonProperty("TmpDir")
    private String TmpDir;
    /**
     * The total number of logical CPUs managed by this ComputingManager
     * 
     */
    @JsonProperty("TotalLogicalCPUs")
    private Long TotalLogicalCPUs;
    /**
     * The total number of physical CPUs managed by this ComputingManager
     * 
     */
    @JsonProperty("TotalPhysicalCPUs")
    private Long TotalPhysicalCPUs;
    /**
     * The total number of slots managed by this ComputingManager
     * 
     */
    @JsonProperty("TotalSlots")
    private Long TotalSlots;
    /**
     * The amount of free space in the working area (GB)
     * 
     */
    @JsonProperty("WorkingAreaFree")
    private Long WorkingAreaFree;
    /**
     * True if the job is guaranteed all of WorkingAreaTotal
     * 
     */
    @JsonProperty("WorkingAreaGuaranteed")
    private Boolean WorkingAreaGuaranteed;
    /**
     * The minimum guaranteed lifetime of files created in the working area (seconds)
     * 
     */
    @JsonProperty("WorkingAreaLifeTime")
    private Long WorkingAreaLifeTime;
    /**
     * The available space in the working area across all ExecutionEnvironments (GB)
     * 
     */
    @JsonProperty("WorkingAreaMultiSlotFree")
    private Long WorkingAreaMultiSlotFree;
    /**
     * The minimum guaranteed lifetime of files created in the working area (seconds)
     * 
     */
    @JsonProperty("WorkingAreaMultiSlotLifeTime")
    private Long WorkingAreaMultiSlotLifeTime;
    /**
     * The total size of the working area across all ExecutionEnvironments (GB)
     * 
     */
    @JsonProperty("WorkingAreaMultiSlotTotal")
    private Long WorkingAreaMultiSlotTotal;
    /**
     * True if the working area is shared across different ExecutionEnvironments
     * 
     */
    @JsonProperty("WorkingAreaShared")
    private Boolean WorkingAreaShared;
    /**
     * Total size of the working area available to single slot jobs (GB)
     * 
     */
    @JsonProperty("WorkingAreaTotal")
    private Long WorkingAreaTotal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The absolute path of a directory available for installation of persistent application software
     * 
     * @return
     *     The ApplicationDir
     */
    @JsonProperty("ApplicationDir")
    public String getApplicationDir() {
        return ApplicationDir;
    }

    /**
     * The absolute path of a directory available for installation of persistent application software
     * 
     * @param ApplicationDir
     *     The ApplicationDir
     */
    @JsonProperty("ApplicationDir")
    public void setApplicationDir(String ApplicationDir) {
        this.ApplicationDir = ApplicationDir;
    }

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ComputingManagerAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ComputingManagerAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * Whether multiple jobs can be submitted at once (no value implies undefined in ExtendedBoolean_t)
     * 
     * @return
     *     The BulkSubmission
     */
    @JsonProperty("BulkSubmission")
    public Boolean getBulkSubmission() {
        return BulkSubmission;
    }

    /**
     * Whether multiple jobs can be submitted at once (no value implies undefined in ExtendedBoolean_t)
     * 
     * @param BulkSubmission
     *     The BulkSubmission
     */
    @JsonProperty("BulkSubmission")
    public void setBulkSubmission(Boolean BulkSubmission) {
        this.BulkSubmission = BulkSubmission;
    }

    /**
     * If local caching of input files is supported, the available size of the area they may be stored in
     * 
     * @return
     *     The CacheFree
     */
    @JsonProperty("CacheFree")
    public Long getCacheFree() {
        return CacheFree;
    }

    /**
     * If local caching of input files is supported, the available size of the area they may be stored in
     * 
     * @param CacheFree
     *     The CacheFree
     */
    @JsonProperty("CacheFree")
    public void setCacheFree(Long CacheFree) {
        this.CacheFree = CacheFree;
    }

    /**
     * If local caching of input files is supported, the total size of the area they may be stored in
     * 
     * @return
     *     The CacheTotal
     */
    @JsonProperty("CacheTotal")
    public Long getCacheTotal() {
        return CacheTotal;
    }

    /**
     * If local caching of input files is supported, the total size of the area they may be stored in
     * 
     * @param CacheTotal
     *     The CacheTotal
     */
    @JsonProperty("CacheTotal")
    public void setCacheTotal(Long CacheTotal) {
        this.CacheTotal = CacheTotal;
    }

    /**
     * Whether this ComputingManager manages only one type of ExecutionEnvironment
     * 
     * @return
     *     The Homogeneous
     */
    @JsonProperty("Homogeneous")
    public Boolean getHomogeneous() {
        return Homogeneous;
    }

    /**
     * Whether this ComputingManager manages only one type of ExecutionEnvironment
     * 
     * @param Homogeneous
     *     The Homogeneous
     */
    @JsonProperty("Homogeneous")
    public void setHomogeneous(Boolean Homogeneous) {
        this.Homogeneous = Homogeneous;
    }

    /**
     * Classification of the managed ExecutionEnvironments aggregated by the number of logical CPUs
     * 
     * @return
     *     The LocalCPUDistribution
     */
    @JsonProperty("LocalCPUDistribution")
    public Boolean getLocalCPUDistribution() {
        return LocalCPUDistribution;
    }

    /**
     * Classification of the managed ExecutionEnvironments aggregated by the number of logical CPUs
     * 
     * @param LocalCPUDistribution
     *     The LocalCPUDistribution
     */
    @JsonProperty("LocalCPUDistribution")
    public void setLocalCPUDistribution(Boolean LocalCPUDistribution) {
        this.LocalCPUDistribution = LocalCPUDistribution;
    }

    /**
     * The types of internal network connections between ExecutionEnvironments (NetworkInfo_t)
     * 
     * @return
     *     The NetworkInfo
     */
    @JsonProperty("NetworkInfo")
    public List<String> getNetworkInfo() {
        return NetworkInfo;
    }

    /**
     * The types of internal network connections between ExecutionEnvironments (NetworkInfo_t)
     * 
     * @param NetworkInfo
     *     The NetworkInfo
     */
    @JsonProperty("NetworkInfo")
    public void setNetworkInfo(List<String> NetworkInfo) {
        this.NetworkInfo = NetworkInfo;
    }

    /**
     * Whether advance reservation is supported (no value implies undefined in ExtendedBoolean_t)
     * 
     * @return
     *     The Reservation
     */
    @JsonProperty("Reservation")
    public Boolean getReservation() {
        return Reservation;
    }

    /**
     * Whether advance reservation is supported (no value implies undefined in ExtendedBoolean_t)
     * 
     * @param Reservation
     *     The Reservation
     */
    @JsonProperty("Reservation")
    public void setReservation(Boolean Reservation) {
        this.Reservation = Reservation;
    }

    /**
     * The absolute path of a shared directory available for application data
     * 
     * @return
     *     The ScratchDir
     */
    @JsonProperty("ScratchDir")
    public String getScratchDir() {
        return ScratchDir;
    }

    /**
     * The absolute path of a shared directory available for application data
     * 
     * @param ScratchDir
     *     The ScratchDir
     */
    @JsonProperty("ScratchDir")
    public void setScratchDir(String ScratchDir) {
        this.ScratchDir = ScratchDir;
    }

    /**
     * The number of slots currently used by jobs submitted via a non-Grid interface
     * 
     * @return
     *     The SlotsUsedByGridJobs
     */
    @JsonProperty("SlotsUsedByGridJobs")
    public Long getSlotsUsedByGridJobs() {
        return SlotsUsedByGridJobs;
    }

    /**
     * The number of slots currently used by jobs submitted via a non-Grid interface
     * 
     * @param SlotsUsedByGridJobs
     *     The SlotsUsedByGridJobs
     */
    @JsonProperty("SlotsUsedByGridJobs")
    public void setSlotsUsedByGridJobs(Long SlotsUsedByGridJobs) {
        this.SlotsUsedByGridJobs = SlotsUsedByGridJobs;
    }

    /**
     * The number of slots currently used by jobs submitted via a non-Grid interface
     * 
     * @return
     *     The SlotsUsedByLocalJobs
     */
    @JsonProperty("SlotsUsedByLocalJobs")
    public Long getSlotsUsedByLocalJobs() {
        return SlotsUsedByLocalJobs;
    }

    /**
     * The number of slots currently used by jobs submitted via a non-Grid interface
     * 
     * @param SlotsUsedByLocalJobs
     *     The SlotsUsedByLocalJobs
     */
    @JsonProperty("SlotsUsedByLocalJobs")
    public void setSlotsUsedByLocalJobs(Long SlotsUsedByLocalJobs) {
        this.SlotsUsedByLocalJobs = SlotsUsedByLocalJobs;
    }

    /**
     * The absolute path of a temporary directory local to an ExecutionEnvironment
     * 
     * @return
     *     The TmpDir
     */
    @JsonProperty("TmpDir")
    public String getTmpDir() {
        return TmpDir;
    }

    /**
     * The absolute path of a temporary directory local to an ExecutionEnvironment
     * 
     * @param TmpDir
     *     The TmpDir
     */
    @JsonProperty("TmpDir")
    public void setTmpDir(String TmpDir) {
        this.TmpDir = TmpDir;
    }

    /**
     * The total number of logical CPUs managed by this ComputingManager
     * 
     * @return
     *     The TotalLogicalCPUs
     */
    @JsonProperty("TotalLogicalCPUs")
    public Long getTotalLogicalCPUs() {
        return TotalLogicalCPUs;
    }

    /**
     * The total number of logical CPUs managed by this ComputingManager
     * 
     * @param TotalLogicalCPUs
     *     The TotalLogicalCPUs
     */
    @JsonProperty("TotalLogicalCPUs")
    public void setTotalLogicalCPUs(Long TotalLogicalCPUs) {
        this.TotalLogicalCPUs = TotalLogicalCPUs;
    }

    /**
     * The total number of physical CPUs managed by this ComputingManager
     * 
     * @return
     *     The TotalPhysicalCPUs
     */
    @JsonProperty("TotalPhysicalCPUs")
    public Long getTotalPhysicalCPUs() {
        return TotalPhysicalCPUs;
    }

    /**
     * The total number of physical CPUs managed by this ComputingManager
     * 
     * @param TotalPhysicalCPUs
     *     The TotalPhysicalCPUs
     */
    @JsonProperty("TotalPhysicalCPUs")
    public void setTotalPhysicalCPUs(Long TotalPhysicalCPUs) {
        this.TotalPhysicalCPUs = TotalPhysicalCPUs;
    }

    /**
     * The total number of slots managed by this ComputingManager
     * 
     * @return
     *     The TotalSlots
     */
    @JsonProperty("TotalSlots")
    public Long getTotalSlots() {
        return TotalSlots;
    }

    /**
     * The total number of slots managed by this ComputingManager
     * 
     * @param TotalSlots
     *     The TotalSlots
     */
    @JsonProperty("TotalSlots")
    public void setTotalSlots(Long TotalSlots) {
        this.TotalSlots = TotalSlots;
    }

    /**
     * The amount of free space in the working area (GB)
     * 
     * @return
     *     The WorkingAreaFree
     */
    @JsonProperty("WorkingAreaFree")
    public Long getWorkingAreaFree() {
        return WorkingAreaFree;
    }

    /**
     * The amount of free space in the working area (GB)
     * 
     * @param WorkingAreaFree
     *     The WorkingAreaFree
     */
    @JsonProperty("WorkingAreaFree")
    public void setWorkingAreaFree(Long WorkingAreaFree) {
        this.WorkingAreaFree = WorkingAreaFree;
    }

    /**
     * True if the job is guaranteed all of WorkingAreaTotal
     * 
     * @return
     *     The WorkingAreaGuaranteed
     */
    @JsonProperty("WorkingAreaGuaranteed")
    public Boolean getWorkingAreaGuaranteed() {
        return WorkingAreaGuaranteed;
    }

    /**
     * True if the job is guaranteed all of WorkingAreaTotal
     * 
     * @param WorkingAreaGuaranteed
     *     The WorkingAreaGuaranteed
     */
    @JsonProperty("WorkingAreaGuaranteed")
    public void setWorkingAreaGuaranteed(Boolean WorkingAreaGuaranteed) {
        this.WorkingAreaGuaranteed = WorkingAreaGuaranteed;
    }

    /**
     * The minimum guaranteed lifetime of files created in the working area (seconds)
     * 
     * @return
     *     The WorkingAreaLifeTime
     */
    @JsonProperty("WorkingAreaLifeTime")
    public Long getWorkingAreaLifeTime() {
        return WorkingAreaLifeTime;
    }

    /**
     * The minimum guaranteed lifetime of files created in the working area (seconds)
     * 
     * @param WorkingAreaLifeTime
     *     The WorkingAreaLifeTime
     */
    @JsonProperty("WorkingAreaLifeTime")
    public void setWorkingAreaLifeTime(Long WorkingAreaLifeTime) {
        this.WorkingAreaLifeTime = WorkingAreaLifeTime;
    }

    /**
     * The available space in the working area across all ExecutionEnvironments (GB)
     * 
     * @return
     *     The WorkingAreaMultiSlotFree
     */
    @JsonProperty("WorkingAreaMultiSlotFree")
    public Long getWorkingAreaMultiSlotFree() {
        return WorkingAreaMultiSlotFree;
    }

    /**
     * The available space in the working area across all ExecutionEnvironments (GB)
     * 
     * @param WorkingAreaMultiSlotFree
     *     The WorkingAreaMultiSlotFree
     */
    @JsonProperty("WorkingAreaMultiSlotFree")
    public void setWorkingAreaMultiSlotFree(Long WorkingAreaMultiSlotFree) {
        this.WorkingAreaMultiSlotFree = WorkingAreaMultiSlotFree;
    }

    /**
     * The minimum guaranteed lifetime of files created in the working area (seconds)
     * 
     * @return
     *     The WorkingAreaMultiSlotLifeTime
     */
    @JsonProperty("WorkingAreaMultiSlotLifeTime")
    public Long getWorkingAreaMultiSlotLifeTime() {
        return WorkingAreaMultiSlotLifeTime;
    }

    /**
     * The minimum guaranteed lifetime of files created in the working area (seconds)
     * 
     * @param WorkingAreaMultiSlotLifeTime
     *     The WorkingAreaMultiSlotLifeTime
     */
    @JsonProperty("WorkingAreaMultiSlotLifeTime")
    public void setWorkingAreaMultiSlotLifeTime(Long WorkingAreaMultiSlotLifeTime) {
        this.WorkingAreaMultiSlotLifeTime = WorkingAreaMultiSlotLifeTime;
    }

    /**
     * The total size of the working area across all ExecutionEnvironments (GB)
     * 
     * @return
     *     The WorkingAreaMultiSlotTotal
     */
    @JsonProperty("WorkingAreaMultiSlotTotal")
    public Long getWorkingAreaMultiSlotTotal() {
        return WorkingAreaMultiSlotTotal;
    }

    /**
     * The total size of the working area across all ExecutionEnvironments (GB)
     * 
     * @param WorkingAreaMultiSlotTotal
     *     The WorkingAreaMultiSlotTotal
     */
    @JsonProperty("WorkingAreaMultiSlotTotal")
    public void setWorkingAreaMultiSlotTotal(Long WorkingAreaMultiSlotTotal) {
        this.WorkingAreaMultiSlotTotal = WorkingAreaMultiSlotTotal;
    }

    /**
     * True if the working area is shared across different ExecutionEnvironments
     * 
     * @return
     *     The WorkingAreaShared
     */
    @JsonProperty("WorkingAreaShared")
    public Boolean getWorkingAreaShared() {
        return WorkingAreaShared;
    }

    /**
     * True if the working area is shared across different ExecutionEnvironments
     * 
     * @param WorkingAreaShared
     *     The WorkingAreaShared
     */
    @JsonProperty("WorkingAreaShared")
    public void setWorkingAreaShared(Boolean WorkingAreaShared) {
        this.WorkingAreaShared = WorkingAreaShared;
    }

    /**
     * Total size of the working area available to single slot jobs (GB)
     * 
     * @return
     *     The WorkingAreaTotal
     */
    @JsonProperty("WorkingAreaTotal")
    public Long getWorkingAreaTotal() {
        return WorkingAreaTotal;
    }

    /**
     * Total size of the working area available to single slot jobs (GB)
     * 
     * @param WorkingAreaTotal
     *     The WorkingAreaTotal
     */
    @JsonProperty("WorkingAreaTotal")
    public void setWorkingAreaTotal(Long WorkingAreaTotal) {
        this.WorkingAreaTotal = WorkingAreaTotal;
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
        return new HashCodeBuilder().append(ApplicationDir).append(Associations).append(BulkSubmission).append(CacheFree).append(CacheTotal).append(Homogeneous).append(LocalCPUDistribution).append(NetworkInfo).append(Reservation).append(ScratchDir).append(SlotsUsedByGridJobs).append(SlotsUsedByLocalJobs).append(TmpDir).append(TotalLogicalCPUs).append(TotalPhysicalCPUs).append(TotalSlots).append(WorkingAreaFree).append(WorkingAreaGuaranteed).append(WorkingAreaLifeTime).append(WorkingAreaMultiSlotFree).append(WorkingAreaMultiSlotLifeTime).append(WorkingAreaMultiSlotTotal).append(WorkingAreaShared).append(WorkingAreaTotal).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComputingManager) == false) {
            return false;
        }
        ComputingManager rhs = ((ComputingManager) other);
        return new EqualsBuilder().append(ApplicationDir, rhs.ApplicationDir).append(Associations, rhs.Associations).append(BulkSubmission, rhs.BulkSubmission).append(CacheFree, rhs.CacheFree).append(CacheTotal, rhs.CacheTotal).append(Homogeneous, rhs.Homogeneous).append(LocalCPUDistribution, rhs.LocalCPUDistribution).append(NetworkInfo, rhs.NetworkInfo).append(Reservation, rhs.Reservation).append(ScratchDir, rhs.ScratchDir).append(SlotsUsedByGridJobs, rhs.SlotsUsedByGridJobs).append(SlotsUsedByLocalJobs, rhs.SlotsUsedByLocalJobs).append(TmpDir, rhs.TmpDir).append(TotalLogicalCPUs, rhs.TotalLogicalCPUs).append(TotalPhysicalCPUs, rhs.TotalPhysicalCPUs).append(TotalSlots, rhs.TotalSlots).append(WorkingAreaFree, rhs.WorkingAreaFree).append(WorkingAreaGuaranteed, rhs.WorkingAreaGuaranteed).append(WorkingAreaLifeTime, rhs.WorkingAreaLifeTime).append(WorkingAreaMultiSlotFree, rhs.WorkingAreaMultiSlotFree).append(WorkingAreaMultiSlotLifeTime, rhs.WorkingAreaMultiSlotLifeTime).append(WorkingAreaMultiSlotTotal, rhs.WorkingAreaMultiSlotTotal).append(WorkingAreaShared, rhs.WorkingAreaShared).append(WorkingAreaTotal, rhs.WorkingAreaTotal).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
