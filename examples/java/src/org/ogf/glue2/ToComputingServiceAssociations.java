
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
    "ComputingServiceID",
    "StorageAccessProtocolID",
    "StorageServiceID"
})
public class ToComputingServiceAssociations {

    /**
     * The ID of the ComputingService
     * 
     */
    @JsonProperty("ComputingServiceID")
    private String ComputingServiceID;
    /**
     * IDs of the protocols that can be used to access the StorageService
     * 
     */
    @JsonProperty("StorageAccessProtocolID")
    private List<String> StorageAccessProtocolID = new ArrayList<String>();
    /**
     * The ID of the StorageService
     * 
     */
    @JsonProperty("StorageServiceID")
    private String StorageServiceID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID of the ComputingService
     * 
     * @return
     *     The ComputingServiceID
     */
    @JsonProperty("ComputingServiceID")
    public String getComputingServiceID() {
        return ComputingServiceID;
    }

    /**
     * The ID of the ComputingService
     * 
     * @param ComputingServiceID
     *     The ComputingServiceID
     */
    @JsonProperty("ComputingServiceID")
    public void setComputingServiceID(String ComputingServiceID) {
        this.ComputingServiceID = ComputingServiceID;
    }

    /**
     * IDs of the protocols that can be used to access the StorageService
     * 
     * @return
     *     The StorageAccessProtocolID
     */
    @JsonProperty("StorageAccessProtocolID")
    public List<String> getStorageAccessProtocolID() {
        return StorageAccessProtocolID;
    }

    /**
     * IDs of the protocols that can be used to access the StorageService
     * 
     * @param StorageAccessProtocolID
     *     The StorageAccessProtocolID
     */
    @JsonProperty("StorageAccessProtocolID")
    public void setStorageAccessProtocolID(List<String> StorageAccessProtocolID) {
        this.StorageAccessProtocolID = StorageAccessProtocolID;
    }

    /**
     * The ID of the StorageService
     * 
     * @return
     *     The StorageServiceID
     */
    @JsonProperty("StorageServiceID")
    public String getStorageServiceID() {
        return StorageServiceID;
    }

    /**
     * The ID of the StorageService
     * 
     * @param StorageServiceID
     *     The StorageServiceID
     */
    @JsonProperty("StorageServiceID")
    public void setStorageServiceID(String StorageServiceID) {
        this.StorageServiceID = StorageServiceID;
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
        return new HashCodeBuilder().append(ComputingServiceID).append(StorageAccessProtocolID).append(StorageServiceID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ToComputingServiceAssociations) == false) {
            return false;
        }
        ToComputingServiceAssociations rhs = ((ToComputingServiceAssociations) other);
        return new EqualsBuilder().append(ComputingServiceID, rhs.ComputingServiceID).append(StorageAccessProtocolID, rhs.StorageAccessProtocolID).append(StorageServiceID, rhs.StorageServiceID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
