
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
    "DefaultCPUTime",
    "DefaultStorageService",
    "DefaultWallTime",
    "EstimatedAverageWaitingTime",
    "EstimatedWorstWaitingTime",
    "FreeSlots",
    "FreeSlotsWithDuration",
    "GuaranteedMainMemory",
    "GuaranteedVirtualMemory",
    "LocalRunningJobs",
    "LocalSuspendedJobs",
    "LocalWaitingJobs",
    "MappingQueue",
    "MaxCPUTime",
    "MaxDiskSpace",
    "MaxMainMemory",
    "MaxMultiSlotWallTime",
    "MaxPreLRMSWaitingJobs",
    "MaxRunningJobs",
    "MaxSlotsPerJob",
    "MaxStageInStreams",
    "MaxStageOutStreams",
    "MaxTotalCPUTime",
    "MaxTotalJobs",
    "MaxUserRunningJobs",
    "MaxVirtualMemory",
    "MaxWaitingJobs",
    "MaxWallTime",
    "MinCPUTime",
    "PreLRMSWaitingJobs",
    "Preemption",
    "RequestedSlots",
    "ReservationPolicy",
    "RunningJobs",
    "ScheduingPolicy",
    "ServingState",
    "StagingJobs",
    "SuspendedJobs",
    "Tag",
    "TotalJobs",
    "UsedSlots",
    "WaitingJobs"
})
public class ComputingShare extends Share {

    /**
     * The default CPU time limit assumed by the LRMS if a maximum time is not specified (seconds)
     * 
     */
    @JsonProperty("DefaultCPUTime")
    private Long DefaultCPUTime;
    /**
     * The ID of the default StorageService used to store files
     * 
     */
    @JsonProperty("DefaultStorageService")
    private String DefaultStorageService;
    /**
     * The default wall clock per slot assumed by the LRMS if a maximum time is not specified (seconds)
     * 
     */
    @JsonProperty("DefaultWallTime")
    private Long DefaultWallTime;
    /**
     * An estimate of the average time a job will wait before it starts to execute (seconds)
     * 
     */
    @JsonProperty("EstimatedAverageWaitingTime")
    private Long EstimatedAverageWaitingTime;
    /**
     * An estimate of the worst-case time a job will wait before it starts to execute (seconds)
     * 
     */
    @JsonProperty("EstimatedWorstWaitingTime")
    private Long EstimatedWorstWaitingTime;
    /**
     * The number of slots which are currently available for use
     * 
     */
    @JsonProperty("FreeSlots")
    private Long FreeSlots;
    /**
     * The number of slots which are currently available for use and how long they are available
     * 
     */
    @JsonProperty("FreeSlotsWithDuration")
    private String FreeSlotsWithDuration;
    /**
     * The amount of physical RAM that a job will have available (MB)
     * 
     */
    @JsonProperty("GuaranteedMainMemory")
    private Long GuaranteedMainMemory;
    /**
     * The amount of memory (RAM+swap) that a job will have available (MB)
     * 
     */
    @JsonProperty("GuaranteedVirtualMemory")
    private Long GuaranteedVirtualMemory;
    /**
     * The number of running jobs submitted using non-Grid interfaces
     * 
     */
    @JsonProperty("LocalRunningJobs")
    private Long LocalRunningJobs;
    /**
     * The number of suspended jobs submitted using non-Grid interfaces
     * 
     */
    @JsonProperty("LocalSuspendedJobs")
    private Long LocalSuspendedJobs;
    /**
     * The number of waiting jobs submitted using non-Grid interfaces
     * 
     */
    @JsonProperty("LocalWaitingJobs")
    private Long LocalWaitingJobs;
    /**
     * The name of the queue in the LRMS where jobs in this share are submitted
     * 
     */
    @JsonProperty("MappingQueue")
    private String MappingQueue;
    /**
     * The maximum pre-slot CPU time that a job can request (seconds)
     * 
     */
    @JsonProperty("MaxCPUTime")
    private Long MaxCPUTime;
    /**
     * The maximum disk space that a job can use in the working area (GB)
     * 
     */
    @JsonProperty("MaxDiskSpace")
    private Long MaxDiskSpace;
    /**
     * The maximum amount of physical RAM that a job can use (MB)
     * 
     */
    @JsonProperty("MaxMainMemory")
    private Long MaxMainMemory;
    /**
     * The maximum wall clock time that a multi-slot job can run (seconds)
     * 
     */
    @JsonProperty("MaxMultiSlotWallTime")
    private Long MaxMultiSlotWallTime;
    /**
     * The maximum number of jobs that can be waiting in the Grid layer for this Share
     * 
     */
    @JsonProperty("MaxPreLRMSWaitingJobs")
    private Long MaxPreLRMSWaitingJobs;
    /**
     * The maximum number of jobs that can be running in this Share
     * 
     */
    @JsonProperty("MaxRunningJobs")
    private Long MaxRunningJobs;
    /**
     * The maximum number of slots that can be allocated to a single job in this Share
     * 
     */
    @JsonProperty("MaxSlotsPerJob")
    private Long MaxSlotsPerJob;
    /**
     * The maximum number of streams available to stage files in
     * 
     */
    @JsonProperty("MaxStageInStreams")
    private Long MaxStageInStreams;
    /**
     * The maximum number of streams available to stage files out
     * 
     */
    @JsonProperty("MaxStageOutStreams")
    private Long MaxStageOutStreams;
    /**
     * The maximum amount of CPU time that a job can request across all slots assigned to it (seconds)
     * 
     */
    @JsonProperty("MaxTotalCPUTime")
    private Long MaxTotalCPUTime;
    /**
     * The maximum number of jobs that can be in this Share
     * 
     */
    @JsonProperty("MaxTotalJobs")
    private Long MaxTotalJobs;
    /**
     * The maximum number of jobs that can be running in this Share per user
     * 
     */
    @JsonProperty("MaxUserRunningJobs")
    private Long MaxUserRunningJobs;
    /**
     * The maximum amount memory (RAM+swap) that a job can use (MB)
     * 
     */
    @JsonProperty("MaxVirtualMemory")
    private Long MaxVirtualMemory;
    /**
     * The maximum number of jobs that can be waiting in this Share
     * 
     */
    @JsonProperty("MaxWaitingJobs")
    private Long MaxWaitingJobs;
    /**
     * The maximum wall clock time that a single-slot job can run (seconds)
     * 
     */
    @JsonProperty("MaxWallTime")
    private Long MaxWallTime;
    /**
     * The minimum pre-slot CPU time that a job can request (seconds)
     * 
     */
    @JsonProperty("MinCPUTime")
    private Long MinCPUTime;
    /**
     * The number of Grid jobs which have not yet been passed to the LRMS
     * 
     */
    @JsonProperty("PreLRMSWaitingJobs")
    private Long PreLRMSWaitingJobs;
    /**
     * Whether jobs can be preempted and resumed (no value implies undefined in ExtendedBoolean_t)
     * 
     */
    @JsonProperty("Preemption")
    private Boolean Preemption;
    /**
     * The number of slots needd to execute all waiting and staging jobs
     * 
     */
    @JsonProperty("RequestedSlots")
    private Long RequestedSlots;
    /**
     * The policy used for advance reservation - ReservationPolicy_t
     * 
     */
    @JsonProperty("ReservationPolicy")
    private ComputingShare.ReservationPolicy ReservationPolicy;
    /**
     * The number of running jobs submitted through Grid or non-Grid interfaces
     * 
     */
    @JsonProperty("RunningJobs")
    private Long RunningJobs;
    /**
     * The scheduling policy used by the share - SchedulingPolicy_t (open enumeration)
     * 
     */
    @JsonProperty("ScheduingPolicy")
    private String ScheduingPolicy;
    /**
     * How the Share is currently serving jobs
     * 
     */
    @JsonProperty("ServingState")
    private ComputingShare.ServingState ServingState;
    /**
     * The number of jobs staging files before or after execution
     * 
     */
    @JsonProperty("StagingJobs")
    private Long StagingJobs;
    /**
     * The number of suspended jobs submitted through Grid or non-Grid interfaces
     * 
     */
    @JsonProperty("SuspendedJobs")
    private Long SuspendedJobs;
    /**
     * UserDomain-defined tags for this Share
     * 
     */
    @JsonProperty("Tag")
    private List<String> Tag = new ArrayList<String>();
    /**
     * The total number of jobs in any state
     * 
     */
    @JsonProperty("TotalJobs")
    private Long TotalJobs;
    /**
     * The number of slots currently in use
     * 
     */
    @JsonProperty("UsedSlots")
    private Long UsedSlots;
    /**
     * The number of waiting jobs submitted through Grid or non-Grid interfaces
     * 
     */
    @JsonProperty("WaitingJobs")
    private Long WaitingJobs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The default CPU time limit assumed by the LRMS if a maximum time is not specified (seconds)
     * 
     * @return
     *     The DefaultCPUTime
     */
    @JsonProperty("DefaultCPUTime")
    public Long getDefaultCPUTime() {
        return DefaultCPUTime;
    }

    /**
     * The default CPU time limit assumed by the LRMS if a maximum time is not specified (seconds)
     * 
     * @param DefaultCPUTime
     *     The DefaultCPUTime
     */
    @JsonProperty("DefaultCPUTime")
    public void setDefaultCPUTime(Long DefaultCPUTime) {
        this.DefaultCPUTime = DefaultCPUTime;
    }

    /**
     * The ID of the default StorageService used to store files
     * 
     * @return
     *     The DefaultStorageService
     */
    @JsonProperty("DefaultStorageService")
    public String getDefaultStorageService() {
        return DefaultStorageService;
    }

    /**
     * The ID of the default StorageService used to store files
     * 
     * @param DefaultStorageService
     *     The DefaultStorageService
     */
    @JsonProperty("DefaultStorageService")
    public void setDefaultStorageService(String DefaultStorageService) {
        this.DefaultStorageService = DefaultStorageService;
    }

    /**
     * The default wall clock per slot assumed by the LRMS if a maximum time is not specified (seconds)
     * 
     * @return
     *     The DefaultWallTime
     */
    @JsonProperty("DefaultWallTime")
    public Long getDefaultWallTime() {
        return DefaultWallTime;
    }

    /**
     * The default wall clock per slot assumed by the LRMS if a maximum time is not specified (seconds)
     * 
     * @param DefaultWallTime
     *     The DefaultWallTime
     */
    @JsonProperty("DefaultWallTime")
    public void setDefaultWallTime(Long DefaultWallTime) {
        this.DefaultWallTime = DefaultWallTime;
    }

    /**
     * An estimate of the average time a job will wait before it starts to execute (seconds)
     * 
     * @return
     *     The EstimatedAverageWaitingTime
     */
    @JsonProperty("EstimatedAverageWaitingTime")
    public Long getEstimatedAverageWaitingTime() {
        return EstimatedAverageWaitingTime;
    }

    /**
     * An estimate of the average time a job will wait before it starts to execute (seconds)
     * 
     * @param EstimatedAverageWaitingTime
     *     The EstimatedAverageWaitingTime
     */
    @JsonProperty("EstimatedAverageWaitingTime")
    public void setEstimatedAverageWaitingTime(Long EstimatedAverageWaitingTime) {
        this.EstimatedAverageWaitingTime = EstimatedAverageWaitingTime;
    }

    /**
     * An estimate of the worst-case time a job will wait before it starts to execute (seconds)
     * 
     * @return
     *     The EstimatedWorstWaitingTime
     */
    @JsonProperty("EstimatedWorstWaitingTime")
    public Long getEstimatedWorstWaitingTime() {
        return EstimatedWorstWaitingTime;
    }

    /**
     * An estimate of the worst-case time a job will wait before it starts to execute (seconds)
     * 
     * @param EstimatedWorstWaitingTime
     *     The EstimatedWorstWaitingTime
     */
    @JsonProperty("EstimatedWorstWaitingTime")
    public void setEstimatedWorstWaitingTime(Long EstimatedWorstWaitingTime) {
        this.EstimatedWorstWaitingTime = EstimatedWorstWaitingTime;
    }

    /**
     * The number of slots which are currently available for use
     * 
     * @return
     *     The FreeSlots
     */
    @JsonProperty("FreeSlots")
    public Long getFreeSlots() {
        return FreeSlots;
    }

    /**
     * The number of slots which are currently available for use
     * 
     * @param FreeSlots
     *     The FreeSlots
     */
    @JsonProperty("FreeSlots")
    public void setFreeSlots(Long FreeSlots) {
        this.FreeSlots = FreeSlots;
    }

    /**
     * The number of slots which are currently available for use and how long they are available
     * 
     * @return
     *     The FreeSlotsWithDuration
     */
    @JsonProperty("FreeSlotsWithDuration")
    public String getFreeSlotsWithDuration() {
        return FreeSlotsWithDuration;
    }

    /**
     * The number of slots which are currently available for use and how long they are available
     * 
     * @param FreeSlotsWithDuration
     *     The FreeSlotsWithDuration
     */
    @JsonProperty("FreeSlotsWithDuration")
    public void setFreeSlotsWithDuration(String FreeSlotsWithDuration) {
        this.FreeSlotsWithDuration = FreeSlotsWithDuration;
    }

    /**
     * The amount of physical RAM that a job will have available (MB)
     * 
     * @return
     *     The GuaranteedMainMemory
     */
    @JsonProperty("GuaranteedMainMemory")
    public Long getGuaranteedMainMemory() {
        return GuaranteedMainMemory;
    }

    /**
     * The amount of physical RAM that a job will have available (MB)
     * 
     * @param GuaranteedMainMemory
     *     The GuaranteedMainMemory
     */
    @JsonProperty("GuaranteedMainMemory")
    public void setGuaranteedMainMemory(Long GuaranteedMainMemory) {
        this.GuaranteedMainMemory = GuaranteedMainMemory;
    }

    /**
     * The amount of memory (RAM+swap) that a job will have available (MB)
     * 
     * @return
     *     The GuaranteedVirtualMemory
     */
    @JsonProperty("GuaranteedVirtualMemory")
    public Long getGuaranteedVirtualMemory() {
        return GuaranteedVirtualMemory;
    }

    /**
     * The amount of memory (RAM+swap) that a job will have available (MB)
     * 
     * @param GuaranteedVirtualMemory
     *     The GuaranteedVirtualMemory
     */
    @JsonProperty("GuaranteedVirtualMemory")
    public void setGuaranteedVirtualMemory(Long GuaranteedVirtualMemory) {
        this.GuaranteedVirtualMemory = GuaranteedVirtualMemory;
    }

    /**
     * The number of running jobs submitted using non-Grid interfaces
     * 
     * @return
     *     The LocalRunningJobs
     */
    @JsonProperty("LocalRunningJobs")
    public Long getLocalRunningJobs() {
        return LocalRunningJobs;
    }

    /**
     * The number of running jobs submitted using non-Grid interfaces
     * 
     * @param LocalRunningJobs
     *     The LocalRunningJobs
     */
    @JsonProperty("LocalRunningJobs")
    public void setLocalRunningJobs(Long LocalRunningJobs) {
        this.LocalRunningJobs = LocalRunningJobs;
    }

    /**
     * The number of suspended jobs submitted using non-Grid interfaces
     * 
     * @return
     *     The LocalSuspendedJobs
     */
    @JsonProperty("LocalSuspendedJobs")
    public Long getLocalSuspendedJobs() {
        return LocalSuspendedJobs;
    }

    /**
     * The number of suspended jobs submitted using non-Grid interfaces
     * 
     * @param LocalSuspendedJobs
     *     The LocalSuspendedJobs
     */
    @JsonProperty("LocalSuspendedJobs")
    public void setLocalSuspendedJobs(Long LocalSuspendedJobs) {
        this.LocalSuspendedJobs = LocalSuspendedJobs;
    }

    /**
     * The number of waiting jobs submitted using non-Grid interfaces
     * 
     * @return
     *     The LocalWaitingJobs
     */
    @JsonProperty("LocalWaitingJobs")
    public Long getLocalWaitingJobs() {
        return LocalWaitingJobs;
    }

    /**
     * The number of waiting jobs submitted using non-Grid interfaces
     * 
     * @param LocalWaitingJobs
     *     The LocalWaitingJobs
     */
    @JsonProperty("LocalWaitingJobs")
    public void setLocalWaitingJobs(Long LocalWaitingJobs) {
        this.LocalWaitingJobs = LocalWaitingJobs;
    }

    /**
     * The name of the queue in the LRMS where jobs in this share are submitted
     * 
     * @return
     *     The MappingQueue
     */
    @JsonProperty("MappingQueue")
    public String getMappingQueue() {
        return MappingQueue;
    }

    /**
     * The name of the queue in the LRMS where jobs in this share are submitted
     * 
     * @param MappingQueue
     *     The MappingQueue
     */
    @JsonProperty("MappingQueue")
    public void setMappingQueue(String MappingQueue) {
        this.MappingQueue = MappingQueue;
    }

    /**
     * The maximum pre-slot CPU time that a job can request (seconds)
     * 
     * @return
     *     The MaxCPUTime
     */
    @JsonProperty("MaxCPUTime")
    public Long getMaxCPUTime() {
        return MaxCPUTime;
    }

    /**
     * The maximum pre-slot CPU time that a job can request (seconds)
     * 
     * @param MaxCPUTime
     *     The MaxCPUTime
     */
    @JsonProperty("MaxCPUTime")
    public void setMaxCPUTime(Long MaxCPUTime) {
        this.MaxCPUTime = MaxCPUTime;
    }

    /**
     * The maximum disk space that a job can use in the working area (GB)
     * 
     * @return
     *     The MaxDiskSpace
     */
    @JsonProperty("MaxDiskSpace")
    public Long getMaxDiskSpace() {
        return MaxDiskSpace;
    }

    /**
     * The maximum disk space that a job can use in the working area (GB)
     * 
     * @param MaxDiskSpace
     *     The MaxDiskSpace
     */
    @JsonProperty("MaxDiskSpace")
    public void setMaxDiskSpace(Long MaxDiskSpace) {
        this.MaxDiskSpace = MaxDiskSpace;
    }

    /**
     * The maximum amount of physical RAM that a job can use (MB)
     * 
     * @return
     *     The MaxMainMemory
     */
    @JsonProperty("MaxMainMemory")
    public Long getMaxMainMemory() {
        return MaxMainMemory;
    }

    /**
     * The maximum amount of physical RAM that a job can use (MB)
     * 
     * @param MaxMainMemory
     *     The MaxMainMemory
     */
    @JsonProperty("MaxMainMemory")
    public void setMaxMainMemory(Long MaxMainMemory) {
        this.MaxMainMemory = MaxMainMemory;
    }

    /**
     * The maximum wall clock time that a multi-slot job can run (seconds)
     * 
     * @return
     *     The MaxMultiSlotWallTime
     */
    @JsonProperty("MaxMultiSlotWallTime")
    public Long getMaxMultiSlotWallTime() {
        return MaxMultiSlotWallTime;
    }

    /**
     * The maximum wall clock time that a multi-slot job can run (seconds)
     * 
     * @param MaxMultiSlotWallTime
     *     The MaxMultiSlotWallTime
     */
    @JsonProperty("MaxMultiSlotWallTime")
    public void setMaxMultiSlotWallTime(Long MaxMultiSlotWallTime) {
        this.MaxMultiSlotWallTime = MaxMultiSlotWallTime;
    }

    /**
     * The maximum number of jobs that can be waiting in the Grid layer for this Share
     * 
     * @return
     *     The MaxPreLRMSWaitingJobs
     */
    @JsonProperty("MaxPreLRMSWaitingJobs")
    public Long getMaxPreLRMSWaitingJobs() {
        return MaxPreLRMSWaitingJobs;
    }

    /**
     * The maximum number of jobs that can be waiting in the Grid layer for this Share
     * 
     * @param MaxPreLRMSWaitingJobs
     *     The MaxPreLRMSWaitingJobs
     */
    @JsonProperty("MaxPreLRMSWaitingJobs")
    public void setMaxPreLRMSWaitingJobs(Long MaxPreLRMSWaitingJobs) {
        this.MaxPreLRMSWaitingJobs = MaxPreLRMSWaitingJobs;
    }

    /**
     * The maximum number of jobs that can be running in this Share
     * 
     * @return
     *     The MaxRunningJobs
     */
    @JsonProperty("MaxRunningJobs")
    public Long getMaxRunningJobs() {
        return MaxRunningJobs;
    }

    /**
     * The maximum number of jobs that can be running in this Share
     * 
     * @param MaxRunningJobs
     *     The MaxRunningJobs
     */
    @JsonProperty("MaxRunningJobs")
    public void setMaxRunningJobs(Long MaxRunningJobs) {
        this.MaxRunningJobs = MaxRunningJobs;
    }

    /**
     * The maximum number of slots that can be allocated to a single job in this Share
     * 
     * @return
     *     The MaxSlotsPerJob
     */
    @JsonProperty("MaxSlotsPerJob")
    public Long getMaxSlotsPerJob() {
        return MaxSlotsPerJob;
    }

    /**
     * The maximum number of slots that can be allocated to a single job in this Share
     * 
     * @param MaxSlotsPerJob
     *     The MaxSlotsPerJob
     */
    @JsonProperty("MaxSlotsPerJob")
    public void setMaxSlotsPerJob(Long MaxSlotsPerJob) {
        this.MaxSlotsPerJob = MaxSlotsPerJob;
    }

    /**
     * The maximum number of streams available to stage files in
     * 
     * @return
     *     The MaxStageInStreams
     */
    @JsonProperty("MaxStageInStreams")
    public Long getMaxStageInStreams() {
        return MaxStageInStreams;
    }

    /**
     * The maximum number of streams available to stage files in
     * 
     * @param MaxStageInStreams
     *     The MaxStageInStreams
     */
    @JsonProperty("MaxStageInStreams")
    public void setMaxStageInStreams(Long MaxStageInStreams) {
        this.MaxStageInStreams = MaxStageInStreams;
    }

    /**
     * The maximum number of streams available to stage files out
     * 
     * @return
     *     The MaxStageOutStreams
     */
    @JsonProperty("MaxStageOutStreams")
    public Long getMaxStageOutStreams() {
        return MaxStageOutStreams;
    }

    /**
     * The maximum number of streams available to stage files out
     * 
     * @param MaxStageOutStreams
     *     The MaxStageOutStreams
     */
    @JsonProperty("MaxStageOutStreams")
    public void setMaxStageOutStreams(Long MaxStageOutStreams) {
        this.MaxStageOutStreams = MaxStageOutStreams;
    }

    /**
     * The maximum amount of CPU time that a job can request across all slots assigned to it (seconds)
     * 
     * @return
     *     The MaxTotalCPUTime
     */
    @JsonProperty("MaxTotalCPUTime")
    public Long getMaxTotalCPUTime() {
        return MaxTotalCPUTime;
    }

    /**
     * The maximum amount of CPU time that a job can request across all slots assigned to it (seconds)
     * 
     * @param MaxTotalCPUTime
     *     The MaxTotalCPUTime
     */
    @JsonProperty("MaxTotalCPUTime")
    public void setMaxTotalCPUTime(Long MaxTotalCPUTime) {
        this.MaxTotalCPUTime = MaxTotalCPUTime;
    }

    /**
     * The maximum number of jobs that can be in this Share
     * 
     * @return
     *     The MaxTotalJobs
     */
    @JsonProperty("MaxTotalJobs")
    public Long getMaxTotalJobs() {
        return MaxTotalJobs;
    }

    /**
     * The maximum number of jobs that can be in this Share
     * 
     * @param MaxTotalJobs
     *     The MaxTotalJobs
     */
    @JsonProperty("MaxTotalJobs")
    public void setMaxTotalJobs(Long MaxTotalJobs) {
        this.MaxTotalJobs = MaxTotalJobs;
    }

    /**
     * The maximum number of jobs that can be running in this Share per user
     * 
     * @return
     *     The MaxUserRunningJobs
     */
    @JsonProperty("MaxUserRunningJobs")
    public Long getMaxUserRunningJobs() {
        return MaxUserRunningJobs;
    }

    /**
     * The maximum number of jobs that can be running in this Share per user
     * 
     * @param MaxUserRunningJobs
     *     The MaxUserRunningJobs
     */
    @JsonProperty("MaxUserRunningJobs")
    public void setMaxUserRunningJobs(Long MaxUserRunningJobs) {
        this.MaxUserRunningJobs = MaxUserRunningJobs;
    }

    /**
     * The maximum amount memory (RAM+swap) that a job can use (MB)
     * 
     * @return
     *     The MaxVirtualMemory
     */
    @JsonProperty("MaxVirtualMemory")
    public Long getMaxVirtualMemory() {
        return MaxVirtualMemory;
    }

    /**
     * The maximum amount memory (RAM+swap) that a job can use (MB)
     * 
     * @param MaxVirtualMemory
     *     The MaxVirtualMemory
     */
    @JsonProperty("MaxVirtualMemory")
    public void setMaxVirtualMemory(Long MaxVirtualMemory) {
        this.MaxVirtualMemory = MaxVirtualMemory;
    }

    /**
     * The maximum number of jobs that can be waiting in this Share
     * 
     * @return
     *     The MaxWaitingJobs
     */
    @JsonProperty("MaxWaitingJobs")
    public Long getMaxWaitingJobs() {
        return MaxWaitingJobs;
    }

    /**
     * The maximum number of jobs that can be waiting in this Share
     * 
     * @param MaxWaitingJobs
     *     The MaxWaitingJobs
     */
    @JsonProperty("MaxWaitingJobs")
    public void setMaxWaitingJobs(Long MaxWaitingJobs) {
        this.MaxWaitingJobs = MaxWaitingJobs;
    }

    /**
     * The maximum wall clock time that a single-slot job can run (seconds)
     * 
     * @return
     *     The MaxWallTime
     */
    @JsonProperty("MaxWallTime")
    public Long getMaxWallTime() {
        return MaxWallTime;
    }

    /**
     * The maximum wall clock time that a single-slot job can run (seconds)
     * 
     * @param MaxWallTime
     *     The MaxWallTime
     */
    @JsonProperty("MaxWallTime")
    public void setMaxWallTime(Long MaxWallTime) {
        this.MaxWallTime = MaxWallTime;
    }

    /**
     * The minimum pre-slot CPU time that a job can request (seconds)
     * 
     * @return
     *     The MinCPUTime
     */
    @JsonProperty("MinCPUTime")
    public Long getMinCPUTime() {
        return MinCPUTime;
    }

    /**
     * The minimum pre-slot CPU time that a job can request (seconds)
     * 
     * @param MinCPUTime
     *     The MinCPUTime
     */
    @JsonProperty("MinCPUTime")
    public void setMinCPUTime(Long MinCPUTime) {
        this.MinCPUTime = MinCPUTime;
    }

    /**
     * The number of Grid jobs which have not yet been passed to the LRMS
     * 
     * @return
     *     The PreLRMSWaitingJobs
     */
    @JsonProperty("PreLRMSWaitingJobs")
    public Long getPreLRMSWaitingJobs() {
        return PreLRMSWaitingJobs;
    }

    /**
     * The number of Grid jobs which have not yet been passed to the LRMS
     * 
     * @param PreLRMSWaitingJobs
     *     The PreLRMSWaitingJobs
     */
    @JsonProperty("PreLRMSWaitingJobs")
    public void setPreLRMSWaitingJobs(Long PreLRMSWaitingJobs) {
        this.PreLRMSWaitingJobs = PreLRMSWaitingJobs;
    }

    /**
     * Whether jobs can be preempted and resumed (no value implies undefined in ExtendedBoolean_t)
     * 
     * @return
     *     The Preemption
     */
    @JsonProperty("Preemption")
    public Boolean getPreemption() {
        return Preemption;
    }

    /**
     * Whether jobs can be preempted and resumed (no value implies undefined in ExtendedBoolean_t)
     * 
     * @param Preemption
     *     The Preemption
     */
    @JsonProperty("Preemption")
    public void setPreemption(Boolean Preemption) {
        this.Preemption = Preemption;
    }

    /**
     * The number of slots needd to execute all waiting and staging jobs
     * 
     * @return
     *     The RequestedSlots
     */
    @JsonProperty("RequestedSlots")
    public Long getRequestedSlots() {
        return RequestedSlots;
    }

    /**
     * The number of slots needd to execute all waiting and staging jobs
     * 
     * @param RequestedSlots
     *     The RequestedSlots
     */
    @JsonProperty("RequestedSlots")
    public void setRequestedSlots(Long RequestedSlots) {
        this.RequestedSlots = RequestedSlots;
    }

    /**
     * The policy used for advance reservation - ReservationPolicy_t
     * 
     * @return
     *     The ReservationPolicy
     */
    @JsonProperty("ReservationPolicy")
    public ComputingShare.ReservationPolicy getReservationPolicy() {
        return ReservationPolicy;
    }

    /**
     * The policy used for advance reservation - ReservationPolicy_t
     * 
     * @param ReservationPolicy
     *     The ReservationPolicy
     */
    @JsonProperty("ReservationPolicy")
    public void setReservationPolicy(ComputingShare.ReservationPolicy ReservationPolicy) {
        this.ReservationPolicy = ReservationPolicy;
    }

    /**
     * The number of running jobs submitted through Grid or non-Grid interfaces
     * 
     * @return
     *     The RunningJobs
     */
    @JsonProperty("RunningJobs")
    public Long getRunningJobs() {
        return RunningJobs;
    }

    /**
     * The number of running jobs submitted through Grid or non-Grid interfaces
     * 
     * @param RunningJobs
     *     The RunningJobs
     */
    @JsonProperty("RunningJobs")
    public void setRunningJobs(Long RunningJobs) {
        this.RunningJobs = RunningJobs;
    }

    /**
     * The scheduling policy used by the share - SchedulingPolicy_t (open enumeration)
     * 
     * @return
     *     The ScheduingPolicy
     */
    @JsonProperty("ScheduingPolicy")
    public String getScheduingPolicy() {
        return ScheduingPolicy;
    }

    /**
     * The scheduling policy used by the share - SchedulingPolicy_t (open enumeration)
     * 
     * @param ScheduingPolicy
     *     The ScheduingPolicy
     */
    @JsonProperty("ScheduingPolicy")
    public void setScheduingPolicy(String ScheduingPolicy) {
        this.ScheduingPolicy = ScheduingPolicy;
    }

    /**
     * How the Share is currently serving jobs
     * 
     * @return
     *     The ServingState
     */
    @JsonProperty("ServingState")
    public ComputingShare.ServingState getServingState() {
        return ServingState;
    }

    /**
     * How the Share is currently serving jobs
     * 
     * @param ServingState
     *     The ServingState
     */
    @JsonProperty("ServingState")
    public void setServingState(ComputingShare.ServingState ServingState) {
        this.ServingState = ServingState;
    }

    /**
     * The number of jobs staging files before or after execution
     * 
     * @return
     *     The StagingJobs
     */
    @JsonProperty("StagingJobs")
    public Long getStagingJobs() {
        return StagingJobs;
    }

    /**
     * The number of jobs staging files before or after execution
     * 
     * @param StagingJobs
     *     The StagingJobs
     */
    @JsonProperty("StagingJobs")
    public void setStagingJobs(Long StagingJobs) {
        this.StagingJobs = StagingJobs;
    }

    /**
     * The number of suspended jobs submitted through Grid or non-Grid interfaces
     * 
     * @return
     *     The SuspendedJobs
     */
    @JsonProperty("SuspendedJobs")
    public Long getSuspendedJobs() {
        return SuspendedJobs;
    }

    /**
     * The number of suspended jobs submitted through Grid or non-Grid interfaces
     * 
     * @param SuspendedJobs
     *     The SuspendedJobs
     */
    @JsonProperty("SuspendedJobs")
    public void setSuspendedJobs(Long SuspendedJobs) {
        this.SuspendedJobs = SuspendedJobs;
    }

    /**
     * UserDomain-defined tags for this Share
     * 
     * @return
     *     The Tag
     */
    @JsonProperty("Tag")
    public List<String> getTag() {
        return Tag;
    }

    /**
     * UserDomain-defined tags for this Share
     * 
     * @param Tag
     *     The Tag
     */
    @JsonProperty("Tag")
    public void setTag(List<String> Tag) {
        this.Tag = Tag;
    }

    /**
     * The total number of jobs in any state
     * 
     * @return
     *     The TotalJobs
     */
    @JsonProperty("TotalJobs")
    public Long getTotalJobs() {
        return TotalJobs;
    }

    /**
     * The total number of jobs in any state
     * 
     * @param TotalJobs
     *     The TotalJobs
     */
    @JsonProperty("TotalJobs")
    public void setTotalJobs(Long TotalJobs) {
        this.TotalJobs = TotalJobs;
    }

    /**
     * The number of slots currently in use
     * 
     * @return
     *     The UsedSlots
     */
    @JsonProperty("UsedSlots")
    public Long getUsedSlots() {
        return UsedSlots;
    }

    /**
     * The number of slots currently in use
     * 
     * @param UsedSlots
     *     The UsedSlots
     */
    @JsonProperty("UsedSlots")
    public void setUsedSlots(Long UsedSlots) {
        this.UsedSlots = UsedSlots;
    }

    /**
     * The number of waiting jobs submitted through Grid or non-Grid interfaces
     * 
     * @return
     *     The WaitingJobs
     */
    @JsonProperty("WaitingJobs")
    public Long getWaitingJobs() {
        return WaitingJobs;
    }

    /**
     * The number of waiting jobs submitted through Grid or non-Grid interfaces
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
        return new HashCodeBuilder().append(DefaultCPUTime).append(DefaultStorageService).append(DefaultWallTime).append(EstimatedAverageWaitingTime).append(EstimatedWorstWaitingTime).append(FreeSlots).append(FreeSlotsWithDuration).append(GuaranteedMainMemory).append(GuaranteedVirtualMemory).append(LocalRunningJobs).append(LocalSuspendedJobs).append(LocalWaitingJobs).append(MappingQueue).append(MaxCPUTime).append(MaxDiskSpace).append(MaxMainMemory).append(MaxMultiSlotWallTime).append(MaxPreLRMSWaitingJobs).append(MaxRunningJobs).append(MaxSlotsPerJob).append(MaxStageInStreams).append(MaxStageOutStreams).append(MaxTotalCPUTime).append(MaxTotalJobs).append(MaxUserRunningJobs).append(MaxVirtualMemory).append(MaxWaitingJobs).append(MaxWallTime).append(MinCPUTime).append(PreLRMSWaitingJobs).append(Preemption).append(RequestedSlots).append(ReservationPolicy).append(RunningJobs).append(ScheduingPolicy).append(ServingState).append(StagingJobs).append(SuspendedJobs).append(Tag).append(TotalJobs).append(UsedSlots).append(WaitingJobs).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComputingShare) == false) {
            return false;
        }
        ComputingShare rhs = ((ComputingShare) other);
        return new EqualsBuilder().append(DefaultCPUTime, rhs.DefaultCPUTime).append(DefaultStorageService, rhs.DefaultStorageService).append(DefaultWallTime, rhs.DefaultWallTime).append(EstimatedAverageWaitingTime, rhs.EstimatedAverageWaitingTime).append(EstimatedWorstWaitingTime, rhs.EstimatedWorstWaitingTime).append(FreeSlots, rhs.FreeSlots).append(FreeSlotsWithDuration, rhs.FreeSlotsWithDuration).append(GuaranteedMainMemory, rhs.GuaranteedMainMemory).append(GuaranteedVirtualMemory, rhs.GuaranteedVirtualMemory).append(LocalRunningJobs, rhs.LocalRunningJobs).append(LocalSuspendedJobs, rhs.LocalSuspendedJobs).append(LocalWaitingJobs, rhs.LocalWaitingJobs).append(MappingQueue, rhs.MappingQueue).append(MaxCPUTime, rhs.MaxCPUTime).append(MaxDiskSpace, rhs.MaxDiskSpace).append(MaxMainMemory, rhs.MaxMainMemory).append(MaxMultiSlotWallTime, rhs.MaxMultiSlotWallTime).append(MaxPreLRMSWaitingJobs, rhs.MaxPreLRMSWaitingJobs).append(MaxRunningJobs, rhs.MaxRunningJobs).append(MaxSlotsPerJob, rhs.MaxSlotsPerJob).append(MaxStageInStreams, rhs.MaxStageInStreams).append(MaxStageOutStreams, rhs.MaxStageOutStreams).append(MaxTotalCPUTime, rhs.MaxTotalCPUTime).append(MaxTotalJobs, rhs.MaxTotalJobs).append(MaxUserRunningJobs, rhs.MaxUserRunningJobs).append(MaxVirtualMemory, rhs.MaxVirtualMemory).append(MaxWaitingJobs, rhs.MaxWaitingJobs).append(MaxWallTime, rhs.MaxWallTime).append(MinCPUTime, rhs.MinCPUTime).append(PreLRMSWaitingJobs, rhs.PreLRMSWaitingJobs).append(Preemption, rhs.Preemption).append(RequestedSlots, rhs.RequestedSlots).append(ReservationPolicy, rhs.ReservationPolicy).append(RunningJobs, rhs.RunningJobs).append(ScheduingPolicy, rhs.ScheduingPolicy).append(ServingState, rhs.ServingState).append(StagingJobs, rhs.StagingJobs).append(SuspendedJobs, rhs.SuspendedJobs).append(Tag, rhs.Tag).append(TotalJobs, rhs.TotalJobs).append(UsedSlots, rhs.UsedSlots).append(WaitingJobs, rhs.WaitingJobs).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum ReservationPolicy {

        MANDATORY("mandatory"),
        NONE("none"),
        OPTIONAL("optional");
        private final String value;
        private static Map<String, ComputingShare.ReservationPolicy> constants = new HashMap<String, ComputingShare.ReservationPolicy>();

        static {
            for (ComputingShare.ReservationPolicy c: values()) {
                constants.put(c.value, c);
            }
        }

        private ReservationPolicy(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static ComputingShare.ReservationPolicy fromValue(String value) {
            ComputingShare.ReservationPolicy constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum ServingState {

        CLOSED("closed"),
        DRAINING("draining"),
        PRODUCTION("production"),
        QUEUEING("queueing");
        private final String value;
        private static Map<String, ComputingShare.ServingState> constants = new HashMap<String, ComputingShare.ServingState>();

        static {
            for (ComputingShare.ServingState c: values()) {
                constants.put(c.value, c);
            }
        }

        private ServingState(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static ComputingShare.ServingState fromValue(String value) {
            ComputingShare.ServingState constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
