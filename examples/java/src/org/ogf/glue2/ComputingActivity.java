
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
    "ComputingManagerEndTime",
    "ComputingManagerExitCode",
    "ComputingManagerSubmissionTime",
    "EndTime",
    "Error",
    "ExecutionNode",
    "ExitCode",
    "IDFromEndpoint",
    "JobDescription",
    "LocalIDFromManager",
    "LocalOwner",
    "LogDir",
    "OtherMessages",
    "Owner",
    "ProxyExpirationTime",
    "Queue",
    "RequestedApplicationEnvironment",
    "RequestedSlots",
    "RequestedTotalCPUTime",
    "RequestedTotalWallTime",
    "RestartState",
    "StartTime",
    "State",
    "StdErr",
    "StdIn",
    "StdOut",
    "SubmissionClientName",
    "SubmissionHost",
    "SubmissionTime",
    "Type",
    "UsedMainMemory",
    "UsedTotalCpuTime",
    "UsedTotalWallTime",
    "WaitingPosition",
    "WorkingAreaEraseTime"
})
public class ComputingActivity extends Activity {

    /**
     * The time when the job ended according to the ComputingManager (DateTime_t)
     * 
     */
    @JsonProperty("ComputingManagerEndTime")
    private String ComputingManagerEndTime;
    /**
     * The exit code provided by the ComputingManager
     * 
     */
    @JsonProperty("ComputingManagerExitCode")
    private String ComputingManagerExitCode;
    /**
     * The time when the job was submitted to the ComputingManager (DateTime_t)
     * 
     */
    @JsonProperty("ComputingManagerSubmissionTime")
    private String ComputingManagerSubmissionTime;
    /**
     * The time when the job ended in the Grid layer (DateTime_t)
     * 
     */
    @JsonProperty("EndTime")
    private String EndTime;
    /**
     * The error messages as provided by the software components involved in the management of the job
     * 
     */
    @JsonProperty("Error")
    private List<String> Error = new ArrayList<String>();
    /**
     * Hostnames associated with the ExecutionEnvironments running the job
     * 
     */
    @JsonProperty("ExecutionNode")
    private List<String> ExecutionNode = new ArrayList<String>();
    /**
     * The exit code as returned by the main executable code or script of the job
     * 
     */
    @JsonProperty("ExitCode")
    private Long ExitCode;
    /**
     * The ID assigned by the ComputingEndpoint
     * 
     */
    @JsonProperty("IDFromEndpoint")
    private String IDFromEndpoint;
    /**
     * open enumeration JobDescription_t
     * 
     */
    @JsonProperty("JobDescription")
    private String JobDescription;
    /**
     * The local ID assigned by the ComputingManager
     * 
     */
    @JsonProperty("LocalIDFromManager")
    private String LocalIDFromManager;
    /**
     * The local user name of the job's owner
     * 
     */
    @JsonProperty("LocalOwner")
    private String LocalOwner;
    /**
     * The name of the directory which contains job logs
     * 
     */
    @JsonProperty("LogDir")
    private String LogDir;
    /**
     * Optional messages provided by either the Grid layer or the ComputingManager
     * 
     */
    @JsonProperty("OtherMessages")
    private List<String> OtherMessages = new ArrayList<String>();
    /**
     * The Grid identity of the job's owner
     * 
     */
    @JsonProperty("Owner")
    private String Owner;
    /**
     * The expiration time of the Grid proxy associated with the job (DateTime_t)
     * 
     */
    @JsonProperty("ProxyExpirationTime")
    private String ProxyExpirationTime;
    /**
     * The name of the ComputingManager queue that held the job before execution
     * 
     */
    @JsonProperty("Queue")
    private String Queue;
    /**
     * The AppName and Version of the requested ApplicationEnvironments
     * 
     */
    @JsonProperty("RequestedApplicationEnvironment")
    private List<String> RequestedApplicationEnvironment = new ArrayList<String>();
    /**
     * The number of slots requested for the job
     * 
     */
    @JsonProperty("RequestedSlots")
    private Long RequestedSlots;
    /**
     * The total CPU time requested by the job
     * 
     */
    @JsonProperty("RequestedTotalCPUTime")
    private Long RequestedTotalCPUTime;
    /**
     * The total wall clock time requested by the job
     * 
     */
    @JsonProperty("RequestedTotalWallTime")
    private Long RequestedTotalWallTime;
    /**
     * open enumeration ComputingActivityState_t
     * 
     */
    @JsonProperty("RestartState")
    private List<String> RestartState = new ArrayList<String>();
    /**
     * The time when the ComputingManager started the job (DateTime_t)
     * 
     */
    @JsonProperty("StartTime")
    private String StartTime;
    /**
     * open enumeration ComputingActivityState_t
     * 
     */
    @JsonProperty("State")
    private List<String> State = new ArrayList<String>();
    /**
     * The name of the file used for standard error
     * 
     */
    @JsonProperty("StdErr")
    private String StdErr;
    /**
     * The name of the file used for standard input
     * 
     */
    @JsonProperty("StdIn")
    private String StdIn;
    /**
     * The name of the file used for standard output
     * 
     */
    @JsonProperty("StdOut")
    private String StdOut;
    /**
     * The name of the software client used to submit the job
     * 
     */
    @JsonProperty("SubmissionClientName")
    private String SubmissionClientName;
    /**
     * The name of the host from which the job was submitted
     * 
     */
    @JsonProperty("SubmissionHost")
    private String SubmissionHost;
    /**
     * The time when the job was submitted to the ComputingEndpoint (DateTime_t)
     * 
     */
    @JsonProperty("SubmissionTime")
    private String SubmissionTime;
    /**
     * closed enumeration ComputingActivityType_t
     * 
     */
    @JsonProperty("Type")
    private ComputingActivity.Type Type;
    /**
     * The physical RAM currently used by the job (MB)
     * 
     */
    @JsonProperty("UsedMainMemory")
    private Long UsedMainMemory;
    /**
     * The total CPU time consumed by the job so far (seconds)
     * 
     */
    @JsonProperty("UsedTotalCpuTime")
    private Long UsedTotalCpuTime;
    /**
     * The total wall clock time consumed by the job so far (slots*seconds)
     * 
     */
    @JsonProperty("UsedTotalWallTime")
    private Long UsedTotalWallTime;
    /**
     * The position of the job in the queue, if the job is waiting
     * 
     */
    @JsonProperty("WaitingPosition")
    private Long WaitingPosition;
    /**
     * The time when working area will be removed from storage (DateTime_t)
     * 
     */
    @JsonProperty("WorkingAreaEraseTime")
    private String WorkingAreaEraseTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The time when the job ended according to the ComputingManager (DateTime_t)
     * 
     * @return
     *     The ComputingManagerEndTime
     */
    @JsonProperty("ComputingManagerEndTime")
    public String getComputingManagerEndTime() {
        return ComputingManagerEndTime;
    }

    /**
     * The time when the job ended according to the ComputingManager (DateTime_t)
     * 
     * @param ComputingManagerEndTime
     *     The ComputingManagerEndTime
     */
    @JsonProperty("ComputingManagerEndTime")
    public void setComputingManagerEndTime(String ComputingManagerEndTime) {
        this.ComputingManagerEndTime = ComputingManagerEndTime;
    }

    /**
     * The exit code provided by the ComputingManager
     * 
     * @return
     *     The ComputingManagerExitCode
     */
    @JsonProperty("ComputingManagerExitCode")
    public String getComputingManagerExitCode() {
        return ComputingManagerExitCode;
    }

    /**
     * The exit code provided by the ComputingManager
     * 
     * @param ComputingManagerExitCode
     *     The ComputingManagerExitCode
     */
    @JsonProperty("ComputingManagerExitCode")
    public void setComputingManagerExitCode(String ComputingManagerExitCode) {
        this.ComputingManagerExitCode = ComputingManagerExitCode;
    }

    /**
     * The time when the job was submitted to the ComputingManager (DateTime_t)
     * 
     * @return
     *     The ComputingManagerSubmissionTime
     */
    @JsonProperty("ComputingManagerSubmissionTime")
    public String getComputingManagerSubmissionTime() {
        return ComputingManagerSubmissionTime;
    }

    /**
     * The time when the job was submitted to the ComputingManager (DateTime_t)
     * 
     * @param ComputingManagerSubmissionTime
     *     The ComputingManagerSubmissionTime
     */
    @JsonProperty("ComputingManagerSubmissionTime")
    public void setComputingManagerSubmissionTime(String ComputingManagerSubmissionTime) {
        this.ComputingManagerSubmissionTime = ComputingManagerSubmissionTime;
    }

    /**
     * The time when the job ended in the Grid layer (DateTime_t)
     * 
     * @return
     *     The EndTime
     */
    @JsonProperty("EndTime")
    public String getEndTime() {
        return EndTime;
    }

    /**
     * The time when the job ended in the Grid layer (DateTime_t)
     * 
     * @param EndTime
     *     The EndTime
     */
    @JsonProperty("EndTime")
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * The error messages as provided by the software components involved in the management of the job
     * 
     * @return
     *     The Error
     */
    @JsonProperty("Error")
    public List<String> getError() {
        return Error;
    }

    /**
     * The error messages as provided by the software components involved in the management of the job
     * 
     * @param Error
     *     The Error
     */
    @JsonProperty("Error")
    public void setError(List<String> Error) {
        this.Error = Error;
    }

    /**
     * Hostnames associated with the ExecutionEnvironments running the job
     * 
     * @return
     *     The ExecutionNode
     */
    @JsonProperty("ExecutionNode")
    public List<String> getExecutionNode() {
        return ExecutionNode;
    }

    /**
     * Hostnames associated with the ExecutionEnvironments running the job
     * 
     * @param ExecutionNode
     *     The ExecutionNode
     */
    @JsonProperty("ExecutionNode")
    public void setExecutionNode(List<String> ExecutionNode) {
        this.ExecutionNode = ExecutionNode;
    }

    /**
     * The exit code as returned by the main executable code or script of the job
     * 
     * @return
     *     The ExitCode
     */
    @JsonProperty("ExitCode")
    public Long getExitCode() {
        return ExitCode;
    }

    /**
     * The exit code as returned by the main executable code or script of the job
     * 
     * @param ExitCode
     *     The ExitCode
     */
    @JsonProperty("ExitCode")
    public void setExitCode(Long ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * The ID assigned by the ComputingEndpoint
     * 
     * @return
     *     The IDFromEndpoint
     */
    @JsonProperty("IDFromEndpoint")
    public String getIDFromEndpoint() {
        return IDFromEndpoint;
    }

    /**
     * The ID assigned by the ComputingEndpoint
     * 
     * @param IDFromEndpoint
     *     The IDFromEndpoint
     */
    @JsonProperty("IDFromEndpoint")
    public void setIDFromEndpoint(String IDFromEndpoint) {
        this.IDFromEndpoint = IDFromEndpoint;
    }

    /**
     * open enumeration JobDescription_t
     * 
     * @return
     *     The JobDescription
     */
    @JsonProperty("JobDescription")
    public String getJobDescription() {
        return JobDescription;
    }

    /**
     * open enumeration JobDescription_t
     * 
     * @param JobDescription
     *     The JobDescription
     */
    @JsonProperty("JobDescription")
    public void setJobDescription(String JobDescription) {
        this.JobDescription = JobDescription;
    }

    /**
     * The local ID assigned by the ComputingManager
     * 
     * @return
     *     The LocalIDFromManager
     */
    @JsonProperty("LocalIDFromManager")
    public String getLocalIDFromManager() {
        return LocalIDFromManager;
    }

    /**
     * The local ID assigned by the ComputingManager
     * 
     * @param LocalIDFromManager
     *     The LocalIDFromManager
     */
    @JsonProperty("LocalIDFromManager")
    public void setLocalIDFromManager(String LocalIDFromManager) {
        this.LocalIDFromManager = LocalIDFromManager;
    }

    /**
     * The local user name of the job's owner
     * 
     * @return
     *     The LocalOwner
     */
    @JsonProperty("LocalOwner")
    public String getLocalOwner() {
        return LocalOwner;
    }

    /**
     * The local user name of the job's owner
     * 
     * @param LocalOwner
     *     The LocalOwner
     */
    @JsonProperty("LocalOwner")
    public void setLocalOwner(String LocalOwner) {
        this.LocalOwner = LocalOwner;
    }

    /**
     * The name of the directory which contains job logs
     * 
     * @return
     *     The LogDir
     */
    @JsonProperty("LogDir")
    public String getLogDir() {
        return LogDir;
    }

    /**
     * The name of the directory which contains job logs
     * 
     * @param LogDir
     *     The LogDir
     */
    @JsonProperty("LogDir")
    public void setLogDir(String LogDir) {
        this.LogDir = LogDir;
    }

    /**
     * Optional messages provided by either the Grid layer or the ComputingManager
     * 
     * @return
     *     The OtherMessages
     */
    @JsonProperty("OtherMessages")
    public List<String> getOtherMessages() {
        return OtherMessages;
    }

    /**
     * Optional messages provided by either the Grid layer or the ComputingManager
     * 
     * @param OtherMessages
     *     The OtherMessages
     */
    @JsonProperty("OtherMessages")
    public void setOtherMessages(List<String> OtherMessages) {
        this.OtherMessages = OtherMessages;
    }

    /**
     * The Grid identity of the job's owner
     * 
     * @return
     *     The Owner
     */
    @JsonProperty("Owner")
    public String getOwner() {
        return Owner;
    }

    /**
     * The Grid identity of the job's owner
     * 
     * @param Owner
     *     The Owner
     */
    @JsonProperty("Owner")
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * The expiration time of the Grid proxy associated with the job (DateTime_t)
     * 
     * @return
     *     The ProxyExpirationTime
     */
    @JsonProperty("ProxyExpirationTime")
    public String getProxyExpirationTime() {
        return ProxyExpirationTime;
    }

    /**
     * The expiration time of the Grid proxy associated with the job (DateTime_t)
     * 
     * @param ProxyExpirationTime
     *     The ProxyExpirationTime
     */
    @JsonProperty("ProxyExpirationTime")
    public void setProxyExpirationTime(String ProxyExpirationTime) {
        this.ProxyExpirationTime = ProxyExpirationTime;
    }

    /**
     * The name of the ComputingManager queue that held the job before execution
     * 
     * @return
     *     The Queue
     */
    @JsonProperty("Queue")
    public String getQueue() {
        return Queue;
    }

    /**
     * The name of the ComputingManager queue that held the job before execution
     * 
     * @param Queue
     *     The Queue
     */
    @JsonProperty("Queue")
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * The AppName and Version of the requested ApplicationEnvironments
     * 
     * @return
     *     The RequestedApplicationEnvironment
     */
    @JsonProperty("RequestedApplicationEnvironment")
    public List<String> getRequestedApplicationEnvironment() {
        return RequestedApplicationEnvironment;
    }

    /**
     * The AppName and Version of the requested ApplicationEnvironments
     * 
     * @param RequestedApplicationEnvironment
     *     The RequestedApplicationEnvironment
     */
    @JsonProperty("RequestedApplicationEnvironment")
    public void setRequestedApplicationEnvironment(List<String> RequestedApplicationEnvironment) {
        this.RequestedApplicationEnvironment = RequestedApplicationEnvironment;
    }

    /**
     * The number of slots requested for the job
     * 
     * @return
     *     The RequestedSlots
     */
    @JsonProperty("RequestedSlots")
    public Long getRequestedSlots() {
        return RequestedSlots;
    }

    /**
     * The number of slots requested for the job
     * 
     * @param RequestedSlots
     *     The RequestedSlots
     */
    @JsonProperty("RequestedSlots")
    public void setRequestedSlots(Long RequestedSlots) {
        this.RequestedSlots = RequestedSlots;
    }

    /**
     * The total CPU time requested by the job
     * 
     * @return
     *     The RequestedTotalCPUTime
     */
    @JsonProperty("RequestedTotalCPUTime")
    public Long getRequestedTotalCPUTime() {
        return RequestedTotalCPUTime;
    }

    /**
     * The total CPU time requested by the job
     * 
     * @param RequestedTotalCPUTime
     *     The RequestedTotalCPUTime
     */
    @JsonProperty("RequestedTotalCPUTime")
    public void setRequestedTotalCPUTime(Long RequestedTotalCPUTime) {
        this.RequestedTotalCPUTime = RequestedTotalCPUTime;
    }

    /**
     * The total wall clock time requested by the job
     * 
     * @return
     *     The RequestedTotalWallTime
     */
    @JsonProperty("RequestedTotalWallTime")
    public Long getRequestedTotalWallTime() {
        return RequestedTotalWallTime;
    }

    /**
     * The total wall clock time requested by the job
     * 
     * @param RequestedTotalWallTime
     *     The RequestedTotalWallTime
     */
    @JsonProperty("RequestedTotalWallTime")
    public void setRequestedTotalWallTime(Long RequestedTotalWallTime) {
        this.RequestedTotalWallTime = RequestedTotalWallTime;
    }

    /**
     * open enumeration ComputingActivityState_t
     * 
     * @return
     *     The RestartState
     */
    @JsonProperty("RestartState")
    public List<String> getRestartState() {
        return RestartState;
    }

    /**
     * open enumeration ComputingActivityState_t
     * 
     * @param RestartState
     *     The RestartState
     */
    @JsonProperty("RestartState")
    public void setRestartState(List<String> RestartState) {
        this.RestartState = RestartState;
    }

    /**
     * The time when the ComputingManager started the job (DateTime_t)
     * 
     * @return
     *     The StartTime
     */
    @JsonProperty("StartTime")
    public String getStartTime() {
        return StartTime;
    }

    /**
     * The time when the ComputingManager started the job (DateTime_t)
     * 
     * @param StartTime
     *     The StartTime
     */
    @JsonProperty("StartTime")
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * open enumeration ComputingActivityState_t
     * 
     * @return
     *     The State
     */
    @JsonProperty("State")
    public List<String> getState() {
        return State;
    }

    /**
     * open enumeration ComputingActivityState_t
     * 
     * @param State
     *     The State
     */
    @JsonProperty("State")
    public void setState(List<String> State) {
        this.State = State;
    }

    /**
     * The name of the file used for standard error
     * 
     * @return
     *     The StdErr
     */
    @JsonProperty("StdErr")
    public String getStdErr() {
        return StdErr;
    }

    /**
     * The name of the file used for standard error
     * 
     * @param StdErr
     *     The StdErr
     */
    @JsonProperty("StdErr")
    public void setStdErr(String StdErr) {
        this.StdErr = StdErr;
    }

    /**
     * The name of the file used for standard input
     * 
     * @return
     *     The StdIn
     */
    @JsonProperty("StdIn")
    public String getStdIn() {
        return StdIn;
    }

    /**
     * The name of the file used for standard input
     * 
     * @param StdIn
     *     The StdIn
     */
    @JsonProperty("StdIn")
    public void setStdIn(String StdIn) {
        this.StdIn = StdIn;
    }

    /**
     * The name of the file used for standard output
     * 
     * @return
     *     The StdOut
     */
    @JsonProperty("StdOut")
    public String getStdOut() {
        return StdOut;
    }

    /**
     * The name of the file used for standard output
     * 
     * @param StdOut
     *     The StdOut
     */
    @JsonProperty("StdOut")
    public void setStdOut(String StdOut) {
        this.StdOut = StdOut;
    }

    /**
     * The name of the software client used to submit the job
     * 
     * @return
     *     The SubmissionClientName
     */
    @JsonProperty("SubmissionClientName")
    public String getSubmissionClientName() {
        return SubmissionClientName;
    }

    /**
     * The name of the software client used to submit the job
     * 
     * @param SubmissionClientName
     *     The SubmissionClientName
     */
    @JsonProperty("SubmissionClientName")
    public void setSubmissionClientName(String SubmissionClientName) {
        this.SubmissionClientName = SubmissionClientName;
    }

    /**
     * The name of the host from which the job was submitted
     * 
     * @return
     *     The SubmissionHost
     */
    @JsonProperty("SubmissionHost")
    public String getSubmissionHost() {
        return SubmissionHost;
    }

    /**
     * The name of the host from which the job was submitted
     * 
     * @param SubmissionHost
     *     The SubmissionHost
     */
    @JsonProperty("SubmissionHost")
    public void setSubmissionHost(String SubmissionHost) {
        this.SubmissionHost = SubmissionHost;
    }

    /**
     * The time when the job was submitted to the ComputingEndpoint (DateTime_t)
     * 
     * @return
     *     The SubmissionTime
     */
    @JsonProperty("SubmissionTime")
    public String getSubmissionTime() {
        return SubmissionTime;
    }

    /**
     * The time when the job was submitted to the ComputingEndpoint (DateTime_t)
     * 
     * @param SubmissionTime
     *     The SubmissionTime
     */
    @JsonProperty("SubmissionTime")
    public void setSubmissionTime(String SubmissionTime) {
        this.SubmissionTime = SubmissionTime;
    }

    /**
     * closed enumeration ComputingActivityType_t
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public ComputingActivity.Type getType() {
        return Type;
    }

    /**
     * closed enumeration ComputingActivityType_t
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(ComputingActivity.Type Type) {
        this.Type = Type;
    }

    /**
     * The physical RAM currently used by the job (MB)
     * 
     * @return
     *     The UsedMainMemory
     */
    @JsonProperty("UsedMainMemory")
    public Long getUsedMainMemory() {
        return UsedMainMemory;
    }

    /**
     * The physical RAM currently used by the job (MB)
     * 
     * @param UsedMainMemory
     *     The UsedMainMemory
     */
    @JsonProperty("UsedMainMemory")
    public void setUsedMainMemory(Long UsedMainMemory) {
        this.UsedMainMemory = UsedMainMemory;
    }

    /**
     * The total CPU time consumed by the job so far (seconds)
     * 
     * @return
     *     The UsedTotalCpuTime
     */
    @JsonProperty("UsedTotalCpuTime")
    public Long getUsedTotalCpuTime() {
        return UsedTotalCpuTime;
    }

    /**
     * The total CPU time consumed by the job so far (seconds)
     * 
     * @param UsedTotalCpuTime
     *     The UsedTotalCpuTime
     */
    @JsonProperty("UsedTotalCpuTime")
    public void setUsedTotalCpuTime(Long UsedTotalCpuTime) {
        this.UsedTotalCpuTime = UsedTotalCpuTime;
    }

    /**
     * The total wall clock time consumed by the job so far (slots*seconds)
     * 
     * @return
     *     The UsedTotalWallTime
     */
    @JsonProperty("UsedTotalWallTime")
    public Long getUsedTotalWallTime() {
        return UsedTotalWallTime;
    }

    /**
     * The total wall clock time consumed by the job so far (slots*seconds)
     * 
     * @param UsedTotalWallTime
     *     The UsedTotalWallTime
     */
    @JsonProperty("UsedTotalWallTime")
    public void setUsedTotalWallTime(Long UsedTotalWallTime) {
        this.UsedTotalWallTime = UsedTotalWallTime;
    }

    /**
     * The position of the job in the queue, if the job is waiting
     * 
     * @return
     *     The WaitingPosition
     */
    @JsonProperty("WaitingPosition")
    public Long getWaitingPosition() {
        return WaitingPosition;
    }

    /**
     * The position of the job in the queue, if the job is waiting
     * 
     * @param WaitingPosition
     *     The WaitingPosition
     */
    @JsonProperty("WaitingPosition")
    public void setWaitingPosition(Long WaitingPosition) {
        this.WaitingPosition = WaitingPosition;
    }

    /**
     * The time when working area will be removed from storage (DateTime_t)
     * 
     * @return
     *     The WorkingAreaEraseTime
     */
    @JsonProperty("WorkingAreaEraseTime")
    public String getWorkingAreaEraseTime() {
        return WorkingAreaEraseTime;
    }

    /**
     * The time when working area will be removed from storage (DateTime_t)
     * 
     * @param WorkingAreaEraseTime
     *     The WorkingAreaEraseTime
     */
    @JsonProperty("WorkingAreaEraseTime")
    public void setWorkingAreaEraseTime(String WorkingAreaEraseTime) {
        this.WorkingAreaEraseTime = WorkingAreaEraseTime;
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
        return new HashCodeBuilder().append(ComputingManagerEndTime).append(ComputingManagerExitCode).append(ComputingManagerSubmissionTime).append(EndTime).append(Error).append(ExecutionNode).append(ExitCode).append(IDFromEndpoint).append(JobDescription).append(LocalIDFromManager).append(LocalOwner).append(LogDir).append(OtherMessages).append(Owner).append(ProxyExpirationTime).append(Queue).append(RequestedApplicationEnvironment).append(RequestedSlots).append(RequestedTotalCPUTime).append(RequestedTotalWallTime).append(RestartState).append(StartTime).append(State).append(StdErr).append(StdIn).append(StdOut).append(SubmissionClientName).append(SubmissionHost).append(SubmissionTime).append(Type).append(UsedMainMemory).append(UsedTotalCpuTime).append(UsedTotalWallTime).append(WaitingPosition).append(WorkingAreaEraseTime).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComputingActivity) == false) {
            return false;
        }
        ComputingActivity rhs = ((ComputingActivity) other);
        return new EqualsBuilder().append(ComputingManagerEndTime, rhs.ComputingManagerEndTime).append(ComputingManagerExitCode, rhs.ComputingManagerExitCode).append(ComputingManagerSubmissionTime, rhs.ComputingManagerSubmissionTime).append(EndTime, rhs.EndTime).append(Error, rhs.Error).append(ExecutionNode, rhs.ExecutionNode).append(ExitCode, rhs.ExitCode).append(IDFromEndpoint, rhs.IDFromEndpoint).append(JobDescription, rhs.JobDescription).append(LocalIDFromManager, rhs.LocalIDFromManager).append(LocalOwner, rhs.LocalOwner).append(LogDir, rhs.LogDir).append(OtherMessages, rhs.OtherMessages).append(Owner, rhs.Owner).append(ProxyExpirationTime, rhs.ProxyExpirationTime).append(Queue, rhs.Queue).append(RequestedApplicationEnvironment, rhs.RequestedApplicationEnvironment).append(RequestedSlots, rhs.RequestedSlots).append(RequestedTotalCPUTime, rhs.RequestedTotalCPUTime).append(RequestedTotalWallTime, rhs.RequestedTotalWallTime).append(RestartState, rhs.RestartState).append(StartTime, rhs.StartTime).append(State, rhs.State).append(StdErr, rhs.StdErr).append(StdIn, rhs.StdIn).append(StdOut, rhs.StdOut).append(SubmissionClientName, rhs.SubmissionClientName).append(SubmissionHost, rhs.SubmissionHost).append(SubmissionTime, rhs.SubmissionTime).append(Type, rhs.Type).append(UsedMainMemory, rhs.UsedMainMemory).append(UsedTotalCpuTime, rhs.UsedTotalCpuTime).append(UsedTotalWallTime, rhs.UsedTotalWallTime).append(WaitingPosition, rhs.WaitingPosition).append(WorkingAreaEraseTime, rhs.WorkingAreaEraseTime).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        COLLECTIONELEMENT("collectionelement"),
        PARALLELELEMENT("parallelelement"),
        SINGLE("single"),
        WORKFLOWNODE("workflownode");
        private final String value;
        private static Map<String, ComputingActivity.Type> constants = new HashMap<String, ComputingActivity.Type>();

        static {
            for (ComputingActivity.Type c: values()) {
                constants.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static ComputingActivity.Type fromValue(String value) {
            ComputingActivity.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
