
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
    "FreeSize",
    "ReservedSize",
    "TotalSize",
    "Type",
    "UsedSize"
})
public class StorageShareCapacity extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private StorageShareCapacityAssociations Associations;
    /**
     * The amount of available storage (GB)
     * 
     */
    @JsonProperty("FreeSize")
    private Long FreeSize;
    /**
     * The amount storage which is not occupied, but has been reserved for use (GB)
     * 
     */
    @JsonProperty("ReservedSize")
    private Long ReservedSize;
    /**
     * The total amount of storage (GB)
     * 
     */
    @JsonProperty("TotalSize")
    private Long TotalSize;
    /**
     * The type of storage capacity - StorageCapacity_t
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
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public StorageShareCapacityAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(StorageShareCapacityAssociations Associations) {
        this.Associations = Associations;
    }

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
     * The amount storage which is not occupied, but has been reserved for use (GB)
     * 
     * @return
     *     The ReservedSize
     */
    @JsonProperty("ReservedSize")
    public Long getReservedSize() {
        return ReservedSize;
    }

    /**
     * The amount storage which is not occupied, but has been reserved for use (GB)
     * 
     * @param ReservedSize
     *     The ReservedSize
     */
    @JsonProperty("ReservedSize")
    public void setReservedSize(Long ReservedSize) {
        this.ReservedSize = ReservedSize;
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
     * The type of storage capacity - StorageCapacity_t
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * The type of storage capacity - StorageCapacity_t
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
        return new HashCodeBuilder().append(Associations).append(FreeSize).append(ReservedSize).append(TotalSize).append(Type).append(UsedSize).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageShareCapacity) == false) {
            return false;
        }
        StorageShareCapacity rhs = ((StorageShareCapacity) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(FreeSize, rhs.FreeSize).append(ReservedSize, rhs.ReservedSize).append(TotalSize, rhs.TotalSize).append(Type, rhs.Type).append(UsedSize, rhs.UsedSize).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
