
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
    "StorageAccessProtocolID",
    "StorageServiceCapacityID"
})
public class StorageServiceAssociations extends ServiceAssociations {

    /**
     * The ID(s) of the StorageAccessProtocols supported by this service
     * 
     */
    @JsonProperty("StorageAccessProtocolID")
    private List<String> StorageAccessProtocolID = new ArrayList<String>();
    /**
     * The ID(s) of the StorageServiceCapacities for this Service
     * 
     */
    @JsonProperty("StorageServiceCapacityID")
    private List<String> StorageServiceCapacityID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID(s) of the StorageAccessProtocols supported by this service
     * 
     * @return
     *     The StorageAccessProtocolID
     */
    @JsonProperty("StorageAccessProtocolID")
    public List<String> getStorageAccessProtocolID() {
        return StorageAccessProtocolID;
    }

    /**
     * The ID(s) of the StorageAccessProtocols supported by this service
     * 
     * @param StorageAccessProtocolID
     *     The StorageAccessProtocolID
     */
    @JsonProperty("StorageAccessProtocolID")
    public void setStorageAccessProtocolID(List<String> StorageAccessProtocolID) {
        this.StorageAccessProtocolID = StorageAccessProtocolID;
    }

    /**
     * The ID(s) of the StorageServiceCapacities for this Service
     * 
     * @return
     *     The StorageServiceCapacityID
     */
    @JsonProperty("StorageServiceCapacityID")
    public List<String> getStorageServiceCapacityID() {
        return StorageServiceCapacityID;
    }

    /**
     * The ID(s) of the StorageServiceCapacities for this Service
     * 
     * @param StorageServiceCapacityID
     *     The StorageServiceCapacityID
     */
    @JsonProperty("StorageServiceCapacityID")
    public void setStorageServiceCapacityID(List<String> StorageServiceCapacityID) {
        this.StorageServiceCapacityID = StorageServiceCapacityID;
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
        return new HashCodeBuilder().append(StorageAccessProtocolID).append(StorageServiceCapacityID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageServiceAssociations) == false) {
            return false;
        }
        StorageServiceAssociations rhs = ((StorageServiceAssociations) other);
        return new EqualsBuilder().append(StorageAccessProtocolID, rhs.StorageAccessProtocolID).append(StorageServiceCapacityID, rhs.StorageServiceCapacityID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
