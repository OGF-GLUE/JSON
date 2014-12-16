
package org.ogf.glue2;

import java.util.HashMap;
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
    "Associations",
    "MaxStreams",
    "Type",
    "Version"
})
public class StorageAccessProtocol extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private StorageAccessProtocolAssociations Associations;
    /**
     * The maximum number of parallel network streams which can be usef for a single transfer
     * 
     */
    @JsonProperty("MaxStreams")
    private Long MaxStreams;
    /**
     * The type of the protocol - StorageAccessProtocol_t
     * 
     */
    @JsonProperty("Type")
    private String Type;
    /**
     * The version of the protocol supported
     * 
     */
    @JsonProperty("Version")
    private String Version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public StorageAccessProtocolAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(StorageAccessProtocolAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The maximum number of parallel network streams which can be usef for a single transfer
     * 
     * @return
     *     The MaxStreams
     */
    @JsonProperty("MaxStreams")
    public Long getMaxStreams() {
        return MaxStreams;
    }

    /**
     * The maximum number of parallel network streams which can be usef for a single transfer
     * 
     * @param MaxStreams
     *     The MaxStreams
     */
    @JsonProperty("MaxStreams")
    public void setMaxStreams(Long MaxStreams) {
        this.MaxStreams = MaxStreams;
    }

    /**
     * The type of the protocol - StorageAccessProtocol_t
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * The type of the protocol - StorageAccessProtocol_t
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * The version of the protocol supported
     * 
     * @return
     *     The Version
     */
    @JsonProperty("Version")
    public String getVersion() {
        return Version;
    }

    /**
     * The version of the protocol supported
     * 
     * @param Version
     *     The Version
     */
    @JsonProperty("Version")
    public void setVersion(String Version) {
        this.Version = Version;
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
        return new HashCodeBuilder().append(Associations).append(MaxStreams).append(Type).append(Version).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageAccessProtocol) == false) {
            return false;
        }
        StorageAccessProtocol rhs = ((StorageAccessProtocol) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(MaxStreams, rhs.MaxStreams).append(Type, rhs.Type).append(Version, rhs.Version).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
