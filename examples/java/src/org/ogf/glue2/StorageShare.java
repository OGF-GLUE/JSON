
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
    "AccessLatency",
    "AccessMode",
    "Associations",
    "DefaultLifeTime",
    "ExpirationMode",
    "MaximumLifeTime",
    "Path",
    "RetentionPolicy",
    "ServingState",
    "SharingID",
    "Tag"
})
public class StorageShare extends Share {

    /**
     * The maximum latency category under normal operating conditions
     * 
     */
    @JsonProperty("AccessLatency")
    private StorageShare.AccessLatency AccessLatency;
    /**
     * The type of access allowed for this share - AccessMode_t (undefined)
     * 
     */
    @JsonProperty("AccessMode")
    private List<String> AccessMode = new ArrayList<String>();
    @JsonProperty("Associations")
    private StorageShareAssociations Associations;
    /**
     * The default lifetime assigned to a new file
     * 
     */
    @JsonProperty("DefaultLifeTime")
    private Long DefaultLifeTime;
    /**
     * Supported file lifetime modes
     * 
     */
    @JsonProperty("ExpirationMode")
    private List<org.ogf.glue2.ExpirationMode> ExpirationMode = new ArrayList<org.ogf.glue2.ExpirationMode>();
    /**
     * The maximum lifetime that can be requested for a file
     * 
     */
    @JsonProperty("MaximumLifeTime")
    private Long MaximumLifeTime;
    /**
     * A default namespace where files are logically placed when they are stored in this Share
     * 
     */
    @JsonProperty("Path")
    private String Path;
    /**
     * The quality of data retention - RetentionPolicy_t
     * 
     */
    @JsonProperty("RetentionPolicy")
    private String RetentionPolicy;
    /**
     * How the Share is currently serving jobs
     * 
     */
    @JsonProperty("ServingState")
    private StorageShare.ServingState ServingState;
    /**
     * A local identifier common to the set of StorageShares which use the same underling extents
     * 
     */
    @JsonProperty("SharingID")
    private String SharingID;
    /**
     * An identifier defined by a UserDomain
     * 
     */
    @JsonProperty("Tag")
    private String Tag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The maximum latency category under normal operating conditions
     * 
     * @return
     *     The AccessLatency
     */
    @JsonProperty("AccessLatency")
    public StorageShare.AccessLatency getAccessLatency() {
        return AccessLatency;
    }

    /**
     * The maximum latency category under normal operating conditions
     * 
     * @param AccessLatency
     *     The AccessLatency
     */
    @JsonProperty("AccessLatency")
    public void setAccessLatency(StorageShare.AccessLatency AccessLatency) {
        this.AccessLatency = AccessLatency;
    }

    /**
     * The type of access allowed for this share - AccessMode_t (undefined)
     * 
     * @return
     *     The AccessMode
     */
    @JsonProperty("AccessMode")
    public List<String> getAccessMode() {
        return AccessMode;
    }

    /**
     * The type of access allowed for this share - AccessMode_t (undefined)
     * 
     * @param AccessMode
     *     The AccessMode
     */
    @JsonProperty("AccessMode")
    public void setAccessMode(List<String> AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public StorageShareAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(StorageShareAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The default lifetime assigned to a new file
     * 
     * @return
     *     The DefaultLifeTime
     */
    @JsonProperty("DefaultLifeTime")
    public Long getDefaultLifeTime() {
        return DefaultLifeTime;
    }

    /**
     * The default lifetime assigned to a new file
     * 
     * @param DefaultLifeTime
     *     The DefaultLifeTime
     */
    @JsonProperty("DefaultLifeTime")
    public void setDefaultLifeTime(Long DefaultLifeTime) {
        this.DefaultLifeTime = DefaultLifeTime;
    }

    /**
     * Supported file lifetime modes
     * 
     * @return
     *     The ExpirationMode
     */
    @JsonProperty("ExpirationMode")
    public List<org.ogf.glue2.ExpirationMode> getExpirationMode() {
        return ExpirationMode;
    }

    /**
     * Supported file lifetime modes
     * 
     * @param ExpirationMode
     *     The ExpirationMode
     */
    @JsonProperty("ExpirationMode")
    public void setExpirationMode(List<org.ogf.glue2.ExpirationMode> ExpirationMode) {
        this.ExpirationMode = ExpirationMode;
    }

    /**
     * The maximum lifetime that can be requested for a file
     * 
     * @return
     *     The MaximumLifeTime
     */
    @JsonProperty("MaximumLifeTime")
    public Long getMaximumLifeTime() {
        return MaximumLifeTime;
    }

    /**
     * The maximum lifetime that can be requested for a file
     * 
     * @param MaximumLifeTime
     *     The MaximumLifeTime
     */
    @JsonProperty("MaximumLifeTime")
    public void setMaximumLifeTime(Long MaximumLifeTime) {
        this.MaximumLifeTime = MaximumLifeTime;
    }

    /**
     * A default namespace where files are logically placed when they are stored in this Share
     * 
     * @return
     *     The Path
     */
    @JsonProperty("Path")
    public String getPath() {
        return Path;
    }

    /**
     * A default namespace where files are logically placed when they are stored in this Share
     * 
     * @param Path
     *     The Path
     */
    @JsonProperty("Path")
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * The quality of data retention - RetentionPolicy_t
     * 
     * @return
     *     The RetentionPolicy
     */
    @JsonProperty("RetentionPolicy")
    public String getRetentionPolicy() {
        return RetentionPolicy;
    }

    /**
     * The quality of data retention - RetentionPolicy_t
     * 
     * @param RetentionPolicy
     *     The RetentionPolicy
     */
    @JsonProperty("RetentionPolicy")
    public void setRetentionPolicy(String RetentionPolicy) {
        this.RetentionPolicy = RetentionPolicy;
    }

    /**
     * How the Share is currently serving jobs
     * 
     * @return
     *     The ServingState
     */
    @JsonProperty("ServingState")
    public StorageShare.ServingState getServingState() {
        return ServingState;
    }

    /**
     * How the Share is currently serving jobs
     * 
     * @param ServingState
     *     The ServingState
     */
    @JsonProperty("ServingState")
    public void setServingState(StorageShare.ServingState ServingState) {
        this.ServingState = ServingState;
    }

    /**
     * A local identifier common to the set of StorageShares which use the same underling extents
     * 
     * @return
     *     The SharingID
     */
    @JsonProperty("SharingID")
    public String getSharingID() {
        return SharingID;
    }

    /**
     * A local identifier common to the set of StorageShares which use the same underling extents
     * 
     * @param SharingID
     *     The SharingID
     */
    @JsonProperty("SharingID")
    public void setSharingID(String SharingID) {
        this.SharingID = SharingID;
    }

    /**
     * An identifier defined by a UserDomain
     * 
     * @return
     *     The Tag
     */
    @JsonProperty("Tag")
    public String getTag() {
        return Tag;
    }

    /**
     * An identifier defined by a UserDomain
     * 
     * @param Tag
     *     The Tag
     */
    @JsonProperty("Tag")
    public void setTag(String Tag) {
        this.Tag = Tag;
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
        return new HashCodeBuilder().append(AccessLatency).append(AccessMode).append(Associations).append(DefaultLifeTime).append(ExpirationMode).append(MaximumLifeTime).append(Path).append(RetentionPolicy).append(ServingState).append(SharingID).append(Tag).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageShare) == false) {
            return false;
        }
        StorageShare rhs = ((StorageShare) other);
        return new EqualsBuilder().append(AccessLatency, rhs.AccessLatency).append(AccessMode, rhs.AccessMode).append(Associations, rhs.Associations).append(DefaultLifeTime, rhs.DefaultLifeTime).append(ExpirationMode, rhs.ExpirationMode).append(MaximumLifeTime, rhs.MaximumLifeTime).append(Path, rhs.Path).append(RetentionPolicy, rhs.RetentionPolicy).append(ServingState, rhs.ServingState).append(SharingID, rhs.SharingID).append(Tag, rhs.Tag).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum AccessLatency {

        NEARLINE("nearline"),
        OFFLINE("offline"),
        ONLINE("online");
        private final String value;
        private static Map<String, StorageShare.AccessLatency> constants = new HashMap<String, StorageShare.AccessLatency>();

        static {
            for (StorageShare.AccessLatency c: values()) {
                constants.put(c.value, c);
            }
        }

        private AccessLatency(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static StorageShare.AccessLatency fromValue(String value) {
            StorageShare.AccessLatency constant = constants.get(value);
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
        private static Map<String, StorageShare.ServingState> constants = new HashMap<String, StorageShare.ServingState>();

        static {
            for (StorageShare.ServingState c: values()) {
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
        public static StorageShare.ServingState fromValue(String value) {
            StorageShare.ServingState constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
