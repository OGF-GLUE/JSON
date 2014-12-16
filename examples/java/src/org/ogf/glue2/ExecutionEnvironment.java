
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
    "Associations",
    "CPUClockSpeed",
    "CPUModel",
    "CPUMultiplicity",
    "CPUTimeScalingFactor",
    "CPUVendor",
    "CPUVersion",
    "ConnectivityIn",
    "ConnectivityOut",
    "LogicalCPUs",
    "MainMemorySize",
    "NetworkInfo",
    "OSFamily",
    "OSName",
    "OSVersion",
    "PhysicalCPUs",
    "Platform",
    "TotalInstances",
    "UnavailableInstances",
    "UsedInstances",
    "VirtualMachine",
    "VirtualMemorySize",
    "WallTimeScalingFactor"
})
public class ExecutionEnvironment extends Resource {

    @JsonProperty("Associations")
    private ExecutionEnvironmentAssociations Associations;
    /**
     * The clock speed of the CPU (MHz)
     * 
     */
    @JsonProperty("CPUClockSpeed")
    private Long CPUClockSpeed;
    /**
     * The model of the CPU, as defined by the vendor
     * 
     */
    @JsonProperty("CPUModel")
    private String CPUModel;
    /**
     * Information about the CPUs and cores in an execution environment
     * 
     */
    @JsonProperty("CPUMultiplicity")
    private ExecutionEnvironment.CPUMultiplicity CPUMultiplicity;
    /**
     * The factor used by the ComputingManager to scale the CPU time limit
     * 
     */
    @JsonProperty("CPUTimeScalingFactor")
    private Object CPUTimeScalingFactor;
    /**
     * The name of the manufacturer of the CPU
     * 
     */
    @JsonProperty("CPUVendor")
    private String CPUVendor;
    /**
     * The specific version name of the CPU, as defined by the vendor
     * 
     */
    @JsonProperty("CPUVersion")
    private String CPUVersion;
    /**
     * True if direct inbound network connectiity is available to a running job
     * 
     */
    @JsonProperty("ConnectivityIn")
    private Boolean ConnectivityIn;
    /**
     * True if direct outbound network connectiity is available to a running job
     * 
     */
    @JsonProperty("ConnectivityOut")
    private Boolean ConnectivityOut;
    /**
     * The number of logical CPUs in one ExecutionEnvironment instance
     * 
     */
    @JsonProperty("LogicalCPUs")
    private Long LogicalCPUs;
    /**
     * The total amount of physical RAM in one ExecutionEnvironment instance (MB)
     * 
     */
    @JsonProperty("MainMemorySize")
    private Long MainMemorySize;
    /**
     * The types of internal network connections between ExecutionEnvironments - NetworkInfo_t (open enumeration)
     * 
     */
    @JsonProperty("NetworkInfo")
    private List<String> NetworkInfo = new ArrayList<String>();
    /**
     * The general family of the operating system - OSFamily_t (open enumeration)
     * 
     */
    @JsonProperty("OSFamily")
    private String OSFamily;
    /**
     * The specific name of the operating system - OSName_t (open enumeration)
     * 
     */
    @JsonProperty("OSName")
    private String OSName;
    /**
     * The version of the operating system, as defined by the vendor
     * 
     */
    @JsonProperty("OSVersion")
    private String OSVersion;
    /**
     * The number of physical CPUs in one ExecutionEnvironment instance
     * 
     */
    @JsonProperty("PhysicalCPUs")
    private Long PhysicalCPUs;
    /**
     * The platform architecture - Platform_t (open enumeration)
     * 
     */
    @JsonProperty("Platform")
    private String Platform;
    /**
     * The total number of ExecutionEnvironment instances
     * 
     */
    @JsonProperty("TotalInstances")
    private Long TotalInstances;
    /**
     * The number of ExecutionEnvironment instances that are unavailable
     * 
     */
    @JsonProperty("UnavailableInstances")
    private Long UnavailableInstances;
    /**
     * The number of ExecutionEnvironment instances in use
     * 
     */
    @JsonProperty("UsedInstances")
    private Long UsedInstances;
    /**
     * True if the ExecutionEnvironment is a virtual machine
     * 
     */
    @JsonProperty("VirtualMachine")
    private Boolean VirtualMachine;
    /**
     * The total amount of virtual memory (RAM+swap) in one ExecutionEnvironment instance (MB)
     * 
     */
    @JsonProperty("VirtualMemorySize")
    private Long VirtualMemorySize;
    /**
     * The factor used by the ComputingManager to scale the wallclock time limit
     * 
     */
    @JsonProperty("WallTimeScalingFactor")
    private Object WallTimeScalingFactor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ExecutionEnvironmentAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ExecutionEnvironmentAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The clock speed of the CPU (MHz)
     * 
     * @return
     *     The CPUClockSpeed
     */
    @JsonProperty("CPUClockSpeed")
    public Long getCPUClockSpeed() {
        return CPUClockSpeed;
    }

    /**
     * The clock speed of the CPU (MHz)
     * 
     * @param CPUClockSpeed
     *     The CPUClockSpeed
     */
    @JsonProperty("CPUClockSpeed")
    public void setCPUClockSpeed(Long CPUClockSpeed) {
        this.CPUClockSpeed = CPUClockSpeed;
    }

    /**
     * The model of the CPU, as defined by the vendor
     * 
     * @return
     *     The CPUModel
     */
    @JsonProperty("CPUModel")
    public String getCPUModel() {
        return CPUModel;
    }

    /**
     * The model of the CPU, as defined by the vendor
     * 
     * @param CPUModel
     *     The CPUModel
     */
    @JsonProperty("CPUModel")
    public void setCPUModel(String CPUModel) {
        this.CPUModel = CPUModel;
    }

    /**
     * Information about the CPUs and cores in an execution environment
     * 
     * @return
     *     The CPUMultiplicity
     */
    @JsonProperty("CPUMultiplicity")
    public ExecutionEnvironment.CPUMultiplicity getCPUMultiplicity() {
        return CPUMultiplicity;
    }

    /**
     * Information about the CPUs and cores in an execution environment
     * 
     * @param CPUMultiplicity
     *     The CPUMultiplicity
     */
    @JsonProperty("CPUMultiplicity")
    public void setCPUMultiplicity(ExecutionEnvironment.CPUMultiplicity CPUMultiplicity) {
        this.CPUMultiplicity = CPUMultiplicity;
    }

    /**
     * The factor used by the ComputingManager to scale the CPU time limit
     * 
     * @return
     *     The CPUTimeScalingFactor
     */
    @JsonProperty("CPUTimeScalingFactor")
    public Object getCPUTimeScalingFactor() {
        return CPUTimeScalingFactor;
    }

    /**
     * The factor used by the ComputingManager to scale the CPU time limit
     * 
     * @param CPUTimeScalingFactor
     *     The CPUTimeScalingFactor
     */
    @JsonProperty("CPUTimeScalingFactor")
    public void setCPUTimeScalingFactor(Object CPUTimeScalingFactor) {
        this.CPUTimeScalingFactor = CPUTimeScalingFactor;
    }

    /**
     * The name of the manufacturer of the CPU
     * 
     * @return
     *     The CPUVendor
     */
    @JsonProperty("CPUVendor")
    public String getCPUVendor() {
        return CPUVendor;
    }

    /**
     * The name of the manufacturer of the CPU
     * 
     * @param CPUVendor
     *     The CPUVendor
     */
    @JsonProperty("CPUVendor")
    public void setCPUVendor(String CPUVendor) {
        this.CPUVendor = CPUVendor;
    }

    /**
     * The specific version name of the CPU, as defined by the vendor
     * 
     * @return
     *     The CPUVersion
     */
    @JsonProperty("CPUVersion")
    public String getCPUVersion() {
        return CPUVersion;
    }

    /**
     * The specific version name of the CPU, as defined by the vendor
     * 
     * @param CPUVersion
     *     The CPUVersion
     */
    @JsonProperty("CPUVersion")
    public void setCPUVersion(String CPUVersion) {
        this.CPUVersion = CPUVersion;
    }

    /**
     * True if direct inbound network connectiity is available to a running job
     * 
     * @return
     *     The ConnectivityIn
     */
    @JsonProperty("ConnectivityIn")
    public Boolean getConnectivityIn() {
        return ConnectivityIn;
    }

    /**
     * True if direct inbound network connectiity is available to a running job
     * 
     * @param ConnectivityIn
     *     The ConnectivityIn
     */
    @JsonProperty("ConnectivityIn")
    public void setConnectivityIn(Boolean ConnectivityIn) {
        this.ConnectivityIn = ConnectivityIn;
    }

    /**
     * True if direct outbound network connectiity is available to a running job
     * 
     * @return
     *     The ConnectivityOut
     */
    @JsonProperty("ConnectivityOut")
    public Boolean getConnectivityOut() {
        return ConnectivityOut;
    }

    /**
     * True if direct outbound network connectiity is available to a running job
     * 
     * @param ConnectivityOut
     *     The ConnectivityOut
     */
    @JsonProperty("ConnectivityOut")
    public void setConnectivityOut(Boolean ConnectivityOut) {
        this.ConnectivityOut = ConnectivityOut;
    }

    /**
     * The number of logical CPUs in one ExecutionEnvironment instance
     * 
     * @return
     *     The LogicalCPUs
     */
    @JsonProperty("LogicalCPUs")
    public Long getLogicalCPUs() {
        return LogicalCPUs;
    }

    /**
     * The number of logical CPUs in one ExecutionEnvironment instance
     * 
     * @param LogicalCPUs
     *     The LogicalCPUs
     */
    @JsonProperty("LogicalCPUs")
    public void setLogicalCPUs(Long LogicalCPUs) {
        this.LogicalCPUs = LogicalCPUs;
    }

    /**
     * The total amount of physical RAM in one ExecutionEnvironment instance (MB)
     * 
     * @return
     *     The MainMemorySize
     */
    @JsonProperty("MainMemorySize")
    public Long getMainMemorySize() {
        return MainMemorySize;
    }

    /**
     * The total amount of physical RAM in one ExecutionEnvironment instance (MB)
     * 
     * @param MainMemorySize
     *     The MainMemorySize
     */
    @JsonProperty("MainMemorySize")
    public void setMainMemorySize(Long MainMemorySize) {
        this.MainMemorySize = MainMemorySize;
    }

    /**
     * The types of internal network connections between ExecutionEnvironments - NetworkInfo_t (open enumeration)
     * 
     * @return
     *     The NetworkInfo
     */
    @JsonProperty("NetworkInfo")
    public List<String> getNetworkInfo() {
        return NetworkInfo;
    }

    /**
     * The types of internal network connections between ExecutionEnvironments - NetworkInfo_t (open enumeration)
     * 
     * @param NetworkInfo
     *     The NetworkInfo
     */
    @JsonProperty("NetworkInfo")
    public void setNetworkInfo(List<String> NetworkInfo) {
        this.NetworkInfo = NetworkInfo;
    }

    /**
     * The general family of the operating system - OSFamily_t (open enumeration)
     * 
     * @return
     *     The OSFamily
     */
    @JsonProperty("OSFamily")
    public String getOSFamily() {
        return OSFamily;
    }

    /**
     * The general family of the operating system - OSFamily_t (open enumeration)
     * 
     * @param OSFamily
     *     The OSFamily
     */
    @JsonProperty("OSFamily")
    public void setOSFamily(String OSFamily) {
        this.OSFamily = OSFamily;
    }

    /**
     * The specific name of the operating system - OSName_t (open enumeration)
     * 
     * @return
     *     The OSName
     */
    @JsonProperty("OSName")
    public String getOSName() {
        return OSName;
    }

    /**
     * The specific name of the operating system - OSName_t (open enumeration)
     * 
     * @param OSName
     *     The OSName
     */
    @JsonProperty("OSName")
    public void setOSName(String OSName) {
        this.OSName = OSName;
    }

    /**
     * The version of the operating system, as defined by the vendor
     * 
     * @return
     *     The OSVersion
     */
    @JsonProperty("OSVersion")
    public String getOSVersion() {
        return OSVersion;
    }

    /**
     * The version of the operating system, as defined by the vendor
     * 
     * @param OSVersion
     *     The OSVersion
     */
    @JsonProperty("OSVersion")
    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
    }

    /**
     * The number of physical CPUs in one ExecutionEnvironment instance
     * 
     * @return
     *     The PhysicalCPUs
     */
    @JsonProperty("PhysicalCPUs")
    public Long getPhysicalCPUs() {
        return PhysicalCPUs;
    }

    /**
     * The number of physical CPUs in one ExecutionEnvironment instance
     * 
     * @param PhysicalCPUs
     *     The PhysicalCPUs
     */
    @JsonProperty("PhysicalCPUs")
    public void setPhysicalCPUs(Long PhysicalCPUs) {
        this.PhysicalCPUs = PhysicalCPUs;
    }

    /**
     * The platform architecture - Platform_t (open enumeration)
     * 
     * @return
     *     The Platform
     */
    @JsonProperty("Platform")
    public String getPlatform() {
        return Platform;
    }

    /**
     * The platform architecture - Platform_t (open enumeration)
     * 
     * @param Platform
     *     The Platform
     */
    @JsonProperty("Platform")
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * The total number of ExecutionEnvironment instances
     * 
     * @return
     *     The TotalInstances
     */
    @JsonProperty("TotalInstances")
    public Long getTotalInstances() {
        return TotalInstances;
    }

    /**
     * The total number of ExecutionEnvironment instances
     * 
     * @param TotalInstances
     *     The TotalInstances
     */
    @JsonProperty("TotalInstances")
    public void setTotalInstances(Long TotalInstances) {
        this.TotalInstances = TotalInstances;
    }

    /**
     * The number of ExecutionEnvironment instances that are unavailable
     * 
     * @return
     *     The UnavailableInstances
     */
    @JsonProperty("UnavailableInstances")
    public Long getUnavailableInstances() {
        return UnavailableInstances;
    }

    /**
     * The number of ExecutionEnvironment instances that are unavailable
     * 
     * @param UnavailableInstances
     *     The UnavailableInstances
     */
    @JsonProperty("UnavailableInstances")
    public void setUnavailableInstances(Long UnavailableInstances) {
        this.UnavailableInstances = UnavailableInstances;
    }

    /**
     * The number of ExecutionEnvironment instances in use
     * 
     * @return
     *     The UsedInstances
     */
    @JsonProperty("UsedInstances")
    public Long getUsedInstances() {
        return UsedInstances;
    }

    /**
     * The number of ExecutionEnvironment instances in use
     * 
     * @param UsedInstances
     *     The UsedInstances
     */
    @JsonProperty("UsedInstances")
    public void setUsedInstances(Long UsedInstances) {
        this.UsedInstances = UsedInstances;
    }

    /**
     * True if the ExecutionEnvironment is a virtual machine
     * 
     * @return
     *     The VirtualMachine
     */
    @JsonProperty("VirtualMachine")
    public Boolean getVirtualMachine() {
        return VirtualMachine;
    }

    /**
     * True if the ExecutionEnvironment is a virtual machine
     * 
     * @param VirtualMachine
     *     The VirtualMachine
     */
    @JsonProperty("VirtualMachine")
    public void setVirtualMachine(Boolean VirtualMachine) {
        this.VirtualMachine = VirtualMachine;
    }

    /**
     * The total amount of virtual memory (RAM+swap) in one ExecutionEnvironment instance (MB)
     * 
     * @return
     *     The VirtualMemorySize
     */
    @JsonProperty("VirtualMemorySize")
    public Long getVirtualMemorySize() {
        return VirtualMemorySize;
    }

    /**
     * The total amount of virtual memory (RAM+swap) in one ExecutionEnvironment instance (MB)
     * 
     * @param VirtualMemorySize
     *     The VirtualMemorySize
     */
    @JsonProperty("VirtualMemorySize")
    public void setVirtualMemorySize(Long VirtualMemorySize) {
        this.VirtualMemorySize = VirtualMemorySize;
    }

    /**
     * The factor used by the ComputingManager to scale the wallclock time limit
     * 
     * @return
     *     The WallTimeScalingFactor
     */
    @JsonProperty("WallTimeScalingFactor")
    public Object getWallTimeScalingFactor() {
        return WallTimeScalingFactor;
    }

    /**
     * The factor used by the ComputingManager to scale the wallclock time limit
     * 
     * @param WallTimeScalingFactor
     *     The WallTimeScalingFactor
     */
    @JsonProperty("WallTimeScalingFactor")
    public void setWallTimeScalingFactor(Object WallTimeScalingFactor) {
        this.WallTimeScalingFactor = WallTimeScalingFactor;
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
        return new HashCodeBuilder().append(Associations).append(CPUClockSpeed).append(CPUModel).append(CPUMultiplicity).append(CPUTimeScalingFactor).append(CPUVendor).append(CPUVersion).append(ConnectivityIn).append(ConnectivityOut).append(LogicalCPUs).append(MainMemorySize).append(NetworkInfo).append(OSFamily).append(OSName).append(OSVersion).append(PhysicalCPUs).append(Platform).append(TotalInstances).append(UnavailableInstances).append(UsedInstances).append(VirtualMachine).append(VirtualMemorySize).append(WallTimeScalingFactor).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExecutionEnvironment) == false) {
            return false;
        }
        ExecutionEnvironment rhs = ((ExecutionEnvironment) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(CPUClockSpeed, rhs.CPUClockSpeed).append(CPUModel, rhs.CPUModel).append(CPUMultiplicity, rhs.CPUMultiplicity).append(CPUTimeScalingFactor, rhs.CPUTimeScalingFactor).append(CPUVendor, rhs.CPUVendor).append(CPUVersion, rhs.CPUVersion).append(ConnectivityIn, rhs.ConnectivityIn).append(ConnectivityOut, rhs.ConnectivityOut).append(LogicalCPUs, rhs.LogicalCPUs).append(MainMemorySize, rhs.MainMemorySize).append(NetworkInfo, rhs.NetworkInfo).append(OSFamily, rhs.OSFamily).append(OSName, rhs.OSName).append(OSVersion, rhs.OSVersion).append(PhysicalCPUs, rhs.PhysicalCPUs).append(Platform, rhs.Platform).append(TotalInstances, rhs.TotalInstances).append(UnavailableInstances, rhs.UnavailableInstances).append(UsedInstances, rhs.UsedInstances).append(VirtualMachine, rhs.VirtualMachine).append(VirtualMemorySize, rhs.VirtualMemorySize).append(WallTimeScalingFactor, rhs.WallTimeScalingFactor).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum CPUMultiplicity {

        MULTICPU_MULTICORE("multicpu-multicore"),
        MULTICPU_SINGLECORE("multicpu-singlecore"),
        SINGLECPU_MULTICORE("singlecpu-multicore"),
        SINGLECPU_SINGLECORE("singlecpu-singlecore");
        private final String value;
        private static Map<String, ExecutionEnvironment.CPUMultiplicity> constants = new HashMap<String, ExecutionEnvironment.CPUMultiplicity>();

        static {
            for (ExecutionEnvironment.CPUMultiplicity c: values()) {
                constants.put(c.value, c);
            }
        }

        private CPUMultiplicity(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static ExecutionEnvironment.CPUMultiplicity fromValue(String value) {
            ExecutionEnvironment.CPUMultiplicity constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
