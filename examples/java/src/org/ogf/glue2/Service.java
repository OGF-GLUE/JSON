
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
    "Complexity",
    "QualityLevel",
    "StatusInfo",
    "Type"
})
public class Service extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private ServiceAssociations Associations;
    /**
     * Capability_t (open enumeration)
     * 
     */
    @JsonProperty("Capability")
    private List<String> Capability = new ArrayList<String>();
    /**
     * A human-readable description of the number of endpoint types, shares, and resources
     * 
     */
    @JsonProperty("Complexity")
    private String Complexity;
    /**
     * QualityLevel_t
     * 
     */
    @JsonProperty("QualityLevel")
    private Service.QualityLevel QualityLevel;
    /**
     * URLs of web pages providing additional information
     * 
     */
    @JsonProperty("StatusInfo")
    private List<String> StatusInfo = new ArrayList<String>();
    /**
     * ServiceType_t (open enumeration)
     * 
     */
    @JsonProperty("Type")
    private String Type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ServiceAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ServiceAssociations Associations) {
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
     * A human-readable description of the number of endpoint types, shares, and resources
     * 
     * @return
     *     The Complexity
     */
    @JsonProperty("Complexity")
    public String getComplexity() {
        return Complexity;
    }

    /**
     * A human-readable description of the number of endpoint types, shares, and resources
     * 
     * @param Complexity
     *     The Complexity
     */
    @JsonProperty("Complexity")
    public void setComplexity(String Complexity) {
        this.Complexity = Complexity;
    }

    /**
     * QualityLevel_t
     * 
     * @return
     *     The QualityLevel
     */
    @JsonProperty("QualityLevel")
    public Service.QualityLevel getQualityLevel() {
        return QualityLevel;
    }

    /**
     * QualityLevel_t
     * 
     * @param QualityLevel
     *     The QualityLevel
     */
    @JsonProperty("QualityLevel")
    public void setQualityLevel(Service.QualityLevel QualityLevel) {
        this.QualityLevel = QualityLevel;
    }

    /**
     * URLs of web pages providing additional information
     * 
     * @return
     *     The StatusInfo
     */
    @JsonProperty("StatusInfo")
    public List<String> getStatusInfo() {
        return StatusInfo;
    }

    /**
     * URLs of web pages providing additional information
     * 
     * @param StatusInfo
     *     The StatusInfo
     */
    @JsonProperty("StatusInfo")
    public void setStatusInfo(List<String> StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * ServiceType_t (open enumeration)
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * ServiceType_t (open enumeration)
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
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
        return new HashCodeBuilder().append(Associations).append(Capability).append(Complexity).append(QualityLevel).append(StatusInfo).append(Type).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Service) == false) {
            return false;
        }
        Service rhs = ((Service) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Capability, rhs.Capability).append(Complexity, rhs.Complexity).append(QualityLevel, rhs.QualityLevel).append(StatusInfo, rhs.StatusInfo).append(Type, rhs.Type).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum QualityLevel {

        DEVELOPMENT("development"),
        PRE_PRODUCTION("pre-production"),
        PRODUCTION("production"),
        TESTING("testing");
        private final String value;
        private static Map<String, Service.QualityLevel> constants = new HashMap<String, Service.QualityLevel>();

        static {
            for (Service.QualityLevel c: values()) {
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
        public static Service.QualityLevel fromValue(String value) {
            Service.QualityLevel constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
