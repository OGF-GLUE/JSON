
package org.ogf.glue2;

import java.util.HashMap;
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
    "FreeSize",
    "Latency",
    "TotalSize",
    "Type",
    "UsedSize"
})
public class DataStore extends Resource {

    /**
     * The amount of available storage (GB)
     * 
     */
    @JsonProperty("FreeSize")
    private Long FreeSize;
    /**
     * The latency category under normal operating conditions - AccessLatency_t
     * 
     */
    @JsonProperty("Latency")
    private DataStore.Latency Latency;
    /**
     * The total amount of storage (GB)
     * 
     */
    @JsonProperty("TotalSize")
    private Long TotalSize;
    /**
     * The type of storage medium - DataStoreType_t (disk,optical,tape,...)
     * 
     */
    @JsonProperty("Type")
    private String Type;
    /**
     * The amount of used storage (GB)
     * 
     */
    @JsonProperty("UsedSize")
    private Long UsedSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The amount of available storage (GB)
     * 
     * @return
     *     The FreeSize
     */
    @JsonProperty("FreeSize")
    public Long getFreeSize() {
        return FreeSize;
    }

    /**
     * The amount of available storage (GB)
     * 
     * @param FreeSize
     *     The FreeSize
     */
    @JsonProperty("FreeSize")
    public void setFreeSize(Long FreeSize) {
        this.FreeSize = FreeSize;
    }

    /**
     * The latency category under normal operating conditions - AccessLatency_t
     * 
     * @return
     *     The Latency
     */
    @JsonProperty("Latency")
    public DataStore.Latency getLatency() {
        return Latency;
    }

    /**
     * The latency category under normal operating conditions - AccessLatency_t
     * 
     * @param Latency
     *     The Latency
     */
    @JsonProperty("Latency")
    public void setLatency(DataStore.Latency Latency) {
        this.Latency = Latency;
    }

    /**
     * The total amount of storage (GB)
     * 
     * @return
     *     The TotalSize
     */
    @JsonProperty("TotalSize")
    public Long getTotalSize() {
        return TotalSize;
    }

    /**
     * The total amount of storage (GB)
     * 
     * @param TotalSize
     *     The TotalSize
     */
    @JsonProperty("TotalSize")
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * The type of storage medium - DataStoreType_t (disk,optical,tape,...)
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * The type of storage medium - DataStoreType_t (disk,optical,tape,...)
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * The amount of used storage (GB)
     * 
     * @return
     *     The UsedSize
     */
    @JsonProperty("UsedSize")
    public Long getUsedSize() {
        return UsedSize;
    }

    /**
     * The amount of used storage (GB)
     * 
     * @param UsedSize
     *     The UsedSize
     */
    @JsonProperty("UsedSize")
    public void setUsedSize(Long UsedSize) {
        this.UsedSize = UsedSize;
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
        return new HashCodeBuilder().append(FreeSize).append(Latency).append(TotalSize).append(Type).append(UsedSize).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataStore) == false) {
            return false;
        }
        DataStore rhs = ((DataStore) other);
        return new EqualsBuilder().append(FreeSize, rhs.FreeSize).append(Latency, rhs.Latency).append(TotalSize, rhs.TotalSize).append(Type, rhs.Type).append(UsedSize, rhs.UsedSize).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Latency {

        NEARLINE("nearline"),
        OFFLINE("offline"),
        ONLINE("online");
        private final String value;
        private static Map<String, DataStore.Latency> constants = new HashMap<String, DataStore.Latency>();

        static {
            for (DataStore.Latency c: values()) {
                constants.put(c.value, c);
            }
        }

        private Latency(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static DataStore.Latency fromValue(String value) {
            DataStore.Latency constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
