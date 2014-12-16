
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
    "StorageServiceID",
    "ToComputingServiceID"
})
public class StorageAccessProtocolAssociations {

    /**
     * The ID of the StorageService this protocol is available for
     * 
     */
    @JsonProperty("StorageServiceID")
    private String StorageServiceID;
    /**
     * The ID(s) ToComputingService objects that describe connectivity to ComputingServices
     * 
     */
    @JsonProperty("ToComputingServiceID")
    private List<String> ToComputingServiceID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID of the StorageService this protocol is available for
     * 
     * @return
     *     The StorageServiceID
     */
    @JsonProperty("StorageServiceID")
    public String getStorageServiceID() {
        return StorageServiceID;
    }

    /**
     * The ID of the StorageService this protocol is available for
     * 
     * @param StorageServiceID
     *     The StorageServiceID
     */
    @JsonProperty("StorageServiceID")
    public void setStorageServiceID(String StorageServiceID) {
        this.StorageServiceID = StorageServiceID;
    }

    /**
     * The ID(s) ToComputingService objects that describe connectivity to ComputingServices
     * 
     * @return
     *     The ToComputingServiceID
     */
    @JsonProperty("ToComputingServiceID")
    public List<String> getToComputingServiceID() {
        return ToComputingServiceID;
    }

    /**
     * The ID(s) ToComputingService objects that describe connectivity to ComputingServices
     * 
     * @param ToComputingServiceID
     *     The ToComputingServiceID
     */
    @JsonProperty("ToComputingServiceID")
    public void setToComputingServiceID(List<String> ToComputingServiceID) {
        this.ToComputingServiceID = ToComputingServiceID;
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
        return new HashCodeBuilder().append(StorageServiceID).append(ToComputingServiceID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageAccessProtocolAssociations) == false) {
            return false;
        }
        StorageAccessProtocolAssociations rhs = ((StorageAccessProtocolAssociations) other);
        return new EqualsBuilder().append(StorageServiceID, rhs.StorageServiceID).append(ToComputingServiceID, rhs.ToComputingServiceID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
