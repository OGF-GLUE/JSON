
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
    "Capability",
    "DowntimeAnnounce",
    "DowntimeEnd",
    "DowntimeInfo",
    "DowntimeStart",
    "HealthState",
    "HealthStateInfo",
    "ImplementationName",
    "ImplementationVersion",
    "Implementor",
    "InterfaceExtension",
    "InterfaceName",
    "InterfaceVersion",
    "IssuerCA",
    "QualityLevel",
    "Semantics",
    "ServingState",
    "StartTime",
    "SupportedProfile",
    "Technology",
    "TrustedCA",
    "URL",
    "WSDL"
})
public class Endpoint extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private EndpointAssociations Associations;
    /**
     * Capability_t (open enumeration)
     * 
     */
    @JsonProperty("Capability")
    private List<String> Capability = new ArrayList<String>();
    /**
     * When the next scheduled downtime was announced (DateTime_t)
     * 
     */
    @JsonProperty("DowntimeAnnounce")
    private String DowntimeAnnounce;
    /**
     * When the next scheduled downtime will end (DateTime_t)
     * 
     */
    @JsonProperty("DowntimeEnd")
    private String DowntimeEnd;
    /**
     * Human-readable of the next scheduled downtime
     * 
     */
    @JsonProperty("DowntimeInfo")
    private String DowntimeInfo;
    /**
     * When the next scheduled downtime will start (DateTime_t)
     * 
     */
    @JsonProperty("DowntimeStart")
    private String DowntimeStart;
    /**
     * The operational status of the Endpoint
     * 
     */
    @JsonProperty("HealthState")
    private Endpoint.HealthState HealthState;
    /**
     * A human-readable explanation of the HealthState of this Endpoint
     * 
     */
    @JsonProperty("HealthStateInfo")
    private String HealthStateInfo;
    /**
     * The name of the implementation of the Endpoint
     * 
     */
    @JsonProperty("ImplementationName")
    private String ImplementationName;
    /**
     * The version of the implementation of the Endpoint
     * 
     */
    @JsonProperty("ImplementationVersion")
    private String ImplementationVersion;
    /**
     * The name of the main organization implementing the Endpoint
     * 
     */
    @JsonProperty("Implementor")
    private String Implementor;
    /**
     * URIs identifying supported extensions to the interface protocol
     * 
     */
    @JsonProperty("InterfaceExtension")
    private List<String> InterfaceExtension = new ArrayList<String>();
    /**
     * InterfaceName_t
     * 
     */
    @JsonProperty("InterfaceName")
    private String InterfaceName;
    /**
     * The version of the primary interface protocol (free format)
     * 
     */
    @JsonProperty("InterfaceVersion")
    private String InterfaceVersion;
    /**
     * The DN of the CA issuing the certificate presented by this Endpoint
     * 
     */
    @JsonProperty("IssuerCA")
    private String IssuerCA;
    /**
     * QualityLevel_t
     * 
     */
    @JsonProperty("QualityLevel")
    private Endpoint.QualityLevel QualityLevel;
    /**
     * URL(s) of documents providing human-readable descriptions of the semantics of the Endpoint
     * 
     */
    @JsonProperty("Semantics")
    private List<String> Semantics = new ArrayList<String>();
    /**
     * If the endpoint is accepting and serving requests
     * 
     */
    @JsonProperty("ServingState")
    private Endpoint.ServingState ServingState;
    /**
     * The start time of the Service associated with this Endpoint (DateTime_t)
     * 
     */
    @JsonProperty("StartTime")
    private String StartTime;
    /**
     * URI(s) identifying supported profiles for the Endpoint
     * 
     */
    @JsonProperty("SupportedProfile")
    private List<String> SupportedProfile = new ArrayList<String>();
    /**
     * EndpointTechnology_t
     * 
     */
    @JsonProperty("Technology")
    private String Technology;
    /**
     * DN(s) of CAs trusted by this Endpoint
     * 
     */
    @JsonProperty("TrustedCA")
    private List<String> TrustedCA = new ArrayList<String>();
    /**
     * Network location of the endpoint
     * 
     */
    @JsonProperty("URL")
    private String URL;
    /**
     * URLs of WSDL document(s) describing the interface
     * 
     */
    @JsonProperty("WSDL")
    private List<String> WSDL = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public EndpointAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(EndpointAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * Capability_t (open enumeration)
     * 
     * @return
     *     The Capability
     */
    @JsonProperty("Capability")
    public List<String> getCapability() {
        return Capability;
    }

    /**
     * Capability_t (open enumeration)
     * 
     * @param Capability
     *     The Capability
     */
    @JsonProperty("Capability")
    public void setCapability(List<String> Capability) {
        this.Capability = Capability;
    }

    /**
     * When the next scheduled downtime was announced (DateTime_t)
     * 
     * @return
     *     The DowntimeAnnounce
     */
    @JsonProperty("DowntimeAnnounce")
    public String getDowntimeAnnounce() {
        return DowntimeAnnounce;
    }

    /**
     * When the next scheduled downtime was announced (DateTime_t)
     * 
     * @param DowntimeAnnounce
     *     The DowntimeAnnounce
     */
    @JsonProperty("DowntimeAnnounce")
    public void setDowntimeAnnounce(String DowntimeAnnounce) {
        this.DowntimeAnnounce = DowntimeAnnounce;
    }

    /**
     * When the next scheduled downtime will end (DateTime_t)
     * 
     * @return
     *     The DowntimeEnd
     */
    @JsonProperty("DowntimeEnd")
    public String getDowntimeEnd() {
        return DowntimeEnd;
    }

    /**
     * When the next scheduled downtime will end (DateTime_t)
     * 
     * @param DowntimeEnd
     *     The DowntimeEnd
     */
    @JsonProperty("DowntimeEnd")
    public void setDowntimeEnd(String DowntimeEnd) {
        this.DowntimeEnd = DowntimeEnd;
    }

    /**
     * Human-readable of the next scheduled downtime
     * 
     * @return
     *     The DowntimeInfo
     */
    @JsonProperty("DowntimeInfo")
    public String getDowntimeInfo() {
        return DowntimeInfo;
    }

    /**
     * Human-readable of the next scheduled downtime
     * 
     * @param DowntimeInfo
     *     The DowntimeInfo
     */
    @JsonProperty("DowntimeInfo")
    public void setDowntimeInfo(String DowntimeInfo) {
        this.DowntimeInfo = DowntimeInfo;
    }

    /**
     * When the next scheduled downtime will start (DateTime_t)
     * 
     * @return
     *     The DowntimeStart
     */
    @JsonProperty("DowntimeStart")
    public String getDowntimeStart() {
        return DowntimeStart;
    }

    /**
     * When the next scheduled downtime will start (DateTime_t)
     * 
     * @param DowntimeStart
     *     The DowntimeStart
     */
    @JsonProperty("DowntimeStart")
    public void setDowntimeStart(String DowntimeStart) {
        this.DowntimeStart = DowntimeStart;
    }

    /**
     * The operational status of the Endpoint
     * 
     * @return
     *     The HealthState
     */
    @JsonProperty("HealthState")
    public Endpoint.HealthState getHealthState() {
        return HealthState;
    }

    /**
     * The operational status of the Endpoint
     * 
     * @param HealthState
     *     The HealthState
     */
    @JsonProperty("HealthState")
    public void setHealthState(Endpoint.HealthState HealthState) {
        this.HealthState = HealthState;
    }

    /**
     * A human-readable explanation of the HealthState of this Endpoint
     * 
     * @return
     *     The HealthStateInfo
     */
    @JsonProperty("HealthStateInfo")
    public String getHealthStateInfo() {
        return HealthStateInfo;
    }

    /**
     * A human-readable explanation of the HealthState of this Endpoint
     * 
     * @param HealthStateInfo
     *     The HealthStateInfo
     */
    @JsonProperty("HealthStateInfo")
    public void setHealthStateInfo(String HealthStateInfo) {
        this.HealthStateInfo = HealthStateInfo;
    }

    /**
     * The name of the implementation of the Endpoint
     * 
     * @return
     *     The ImplementationName
     */
    @JsonProperty("ImplementationName")
    public String getImplementationName() {
        return ImplementationName;
    }

    /**
     * The name of the implementation of the Endpoint
     * 
     * @param ImplementationName
     *     The ImplementationName
     */
    @JsonProperty("ImplementationName")
    public void setImplementationName(String ImplementationName) {
        this.ImplementationName = ImplementationName;
    }

    /**
     * The version of the implementation of the Endpoint
     * 
     * @return
     *     The ImplementationVersion
     */
    @JsonProperty("ImplementationVersion")
    public String getImplementationVersion() {
        return ImplementationVersion;
    }

    /**
     * The version of the implementation of the Endpoint
     * 
     * @param ImplementationVersion
     *     The ImplementationVersion
     */
    @JsonProperty("ImplementationVersion")
    public void setImplementationVersion(String ImplementationVersion) {
        this.ImplementationVersion = ImplementationVersion;
    }

    /**
     * The name of the main organization implementing the Endpoint
     * 
     * @return
     *     The Implementor
     */
    @JsonProperty("Implementor")
    public String getImplementor() {
        return Implementor;
    }

    /**
     * The name of the main organization implementing the Endpoint
     * 
     * @param Implementor
     *     The Implementor
     */
    @JsonProperty("Implementor")
    public void setImplementor(String Implementor) {
        this.Implementor = Implementor;
    }

    /**
     * URIs identifying supported extensions to the interface protocol
     * 
     * @return
     *     The InterfaceExtension
     */
    @JsonProperty("InterfaceExtension")
    public List<String> getInterfaceExtension() {
        return InterfaceExtension;
    }

    /**
     * URIs identifying supported extensions to the interface protocol
     * 
     * @param InterfaceExtension
     *     The InterfaceExtension
     */
    @JsonProperty("InterfaceExtension")
    public void setInterfaceExtension(List<String> InterfaceExtension) {
        this.InterfaceExtension = InterfaceExtension;
    }

    /**
     * InterfaceName_t
     * 
     * @return
     *     The InterfaceName
     */
    @JsonProperty("InterfaceName")
    public String getInterfaceName() {
        return InterfaceName;
    }

    /**
     * InterfaceName_t
     * 
     * @param InterfaceName
     *     The InterfaceName
     */
    @JsonProperty("InterfaceName")
    public void setInterfaceName(String InterfaceName) {
        this.InterfaceName = InterfaceName;
    }

    /**
     * The version of the primary interface protocol (free format)
     * 
     * @return
     *     The InterfaceVersion
     */
    @JsonProperty("InterfaceVersion")
    public String getInterfaceVersion() {
        return InterfaceVersion;
    }

    /**
     * The version of the primary interface protocol (free format)
     * 
     * @param InterfaceVersion
     *     The InterfaceVersion
     */
    @JsonProperty("InterfaceVersion")
    public void setInterfaceVersion(String InterfaceVersion) {
        this.InterfaceVersion = InterfaceVersion;
    }

    /**
     * The DN of the CA issuing the certificate presented by this Endpoint
     * 
     * @return
     *     The IssuerCA
     */
    @JsonProperty("IssuerCA")
    public String getIssuerCA() {
        return IssuerCA;
    }

    /**
     * The DN of the CA issuing the certificate presented by this Endpoint
     * 
     * @param IssuerCA
     *     The IssuerCA
     */
    @JsonProperty("IssuerCA")
    public void setIssuerCA(String IssuerCA) {
        this.IssuerCA = IssuerCA;
    }

    /**
     * QualityLevel_t
     * 
     * @return
     *     The QualityLevel
     */
    @JsonProperty("QualityLevel")
    public Endpoint.QualityLevel getQualityLevel() {
        return QualityLevel;
    }

    /**
     * QualityLevel_t
     * 
     * @param QualityLevel
     *     The QualityLevel
     */
    @JsonProperty("QualityLevel")
    public void setQualityLevel(Endpoint.QualityLevel QualityLevel) {
        this.QualityLevel = QualityLevel;
    }

    /**
     * URL(s) of documents providing human-readable descriptions of the semantics of the Endpoint
     * 
     * @return
     *     The Semantics
     */
    @JsonProperty("Semantics")
    public List<String> getSemantics() {
        return Semantics;
    }

    /**
     * URL(s) of documents providing human-readable descriptions of the semantics of the Endpoint
     * 
     * @param Semantics
     *     The Semantics
     */
    @JsonProperty("Semantics")
    public void setSemantics(List<String> Semantics) {
        this.Semantics = Semantics;
    }

    /**
     * If the endpoint is accepting and serving requests
     * 
     * @return
     *     The ServingState
     */
    @JsonProperty("ServingState")
    public Endpoint.ServingState getServingState() {
        return ServingState;
    }

    /**
     * If the endpoint is accepting and serving requests
     * 
     * @param ServingState
     *     The ServingState
     */
    @JsonProperty("ServingState")
    public void setServingState(Endpoint.ServingState ServingState) {
        this.ServingState = ServingState;
    }

    /**
     * The start time of the Service associated with this Endpoint (DateTime_t)
     * 
     * @return
     *     The StartTime
     */
    @JsonProperty("StartTime")
    public String getStartTime() {
        return StartTime;
    }

    /**
     * The start time of the Service associated with this Endpoint (DateTime_t)
     * 
     * @param StartTime
     *     The StartTime
     */
    @JsonProperty("StartTime")
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * URI(s) identifying supported profiles for the Endpoint
     * 
     * @return
     *     The SupportedProfile
     */
    @JsonProperty("SupportedProfile")
    public List<String> getSupportedProfile() {
        return SupportedProfile;
    }

    /**
     * URI(s) identifying supported profiles for the Endpoint
     * 
     * @param SupportedProfile
     *     The SupportedProfile
     */
    @JsonProperty("SupportedProfile")
    public void setSupportedProfile(List<String> SupportedProfile) {
        this.SupportedProfile = SupportedProfile;
    }

    /**
     * EndpointTechnology_t
     * 
     * @return
     *     The Technology
     */
    @JsonProperty("Technology")
    public String getTechnology() {
        return Technology;
    }

    /**
     * EndpointTechnology_t
     * 
     * @param Technology
     *     The Technology
     */
    @JsonProperty("Technology")
    public void setTechnology(String Technology) {
        this.Technology = Technology;
    }

    /**
     * DN(s) of CAs trusted by this Endpoint
     * 
     * @return
     *     The TrustedCA
     */
    @JsonProperty("TrustedCA")
    public List<String> getTrustedCA() {
        return TrustedCA;
    }

    /**
     * DN(s) of CAs trusted by this Endpoint
     * 
     * @param TrustedCA
     *     The TrustedCA
     */
    @JsonProperty("TrustedCA")
    public void setTrustedCA(List<String> TrustedCA) {
        this.TrustedCA = TrustedCA;
    }

    /**
     * Network location of the endpoint
     * 
     * @return
     *     The URL
     */
    @JsonProperty("URL")
    public String getURL() {
        return URL;
    }

    /**
     * Network location of the endpoint
     * 
     * @param URL
     *     The URL
     */
    @JsonProperty("URL")
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * URLs of WSDL document(s) describing the interface
     * 
     * @return
     *     The WSDL
     */
    @JsonProperty("WSDL")
    public List<String> getWSDL() {
        return WSDL;
    }

    /**
     * URLs of WSDL document(s) describing the interface
     * 
     * @param WSDL
     *     The WSDL
     */
    @JsonProperty("WSDL")
    public void setWSDL(List<String> WSDL) {
        this.WSDL = WSDL;
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
        return new HashCodeBuilder().append(Associations).append(Capability).append(DowntimeAnnounce).append(DowntimeEnd).append(DowntimeInfo).append(DowntimeStart).append(HealthState).append(HealthStateInfo).append(ImplementationName).append(ImplementationVersion).append(Implementor).append(InterfaceExtension).append(InterfaceName).append(InterfaceVersion).append(IssuerCA).append(QualityLevel).append(Semantics).append(ServingState).append(StartTime).append(SupportedProfile).append(Technology).append(TrustedCA).append(URL).append(WSDL).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endpoint) == false) {
            return false;
        }
        Endpoint rhs = ((Endpoint) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Capability, rhs.Capability).append(DowntimeAnnounce, rhs.DowntimeAnnounce).append(DowntimeEnd, rhs.DowntimeEnd).append(DowntimeInfo, rhs.DowntimeInfo).append(DowntimeStart, rhs.DowntimeStart).append(HealthState, rhs.HealthState).append(HealthStateInfo, rhs.HealthStateInfo).append(ImplementationName, rhs.ImplementationName).append(ImplementationVersion, rhs.ImplementationVersion).append(Implementor, rhs.Implementor).append(InterfaceExtension, rhs.InterfaceExtension).append(InterfaceName, rhs.InterfaceName).append(InterfaceVersion, rhs.InterfaceVersion).append(IssuerCA, rhs.IssuerCA).append(QualityLevel, rhs.QualityLevel).append(Semantics, rhs.Semantics).append(ServingState, rhs.ServingState).append(StartTime, rhs.StartTime).append(SupportedProfile, rhs.SupportedProfile).append(Technology, rhs.Technology).append(TrustedCA, rhs.TrustedCA).append(URL, rhs.URL).append(WSDL, rhs.WSDL).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum HealthState {

        CRITICAL("critical"),
        OK("ok"),
        OTHER("other"),
        UNKNOWN("unknown"),
        WARNING("warning");
        private final String value;
        private static Map<String, Endpoint.HealthState> constants = new HashMap<String, Endpoint.HealthState>();

        static {
            for (Endpoint.HealthState c: values()) {
                constants.put(c.value, c);
            }
        }

        private HealthState(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Endpoint.HealthState fromValue(String value) {
            Endpoint.HealthState constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum QualityLevel {

        DEVELOPMENT("development"),
        PRE_PRODUCTION("pre-production"),
        PRODUCTION("production"),
        TESTING("testing");
        private final String value;
        private static Map<String, Endpoint.QualityLevel> constants = new HashMap<String, Endpoint.QualityLevel>();

        static {
            for (Endpoint.QualityLevel c: values()) {
                constants.put(c.value, c);
            }
        }

        private QualityLevel(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Endpoint.QualityLevel fromValue(String value) {
            Endpoint.QualityLevel constant = constants.get(value);
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
        private static Map<String, Endpoint.ServingState> constants = new HashMap<String, Endpoint.ServingState>();

        static {
            for (Endpoint.ServingState c: values()) {
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
        public static Endpoint.ServingState fromValue(String value) {
            Endpoint.ServingState constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
