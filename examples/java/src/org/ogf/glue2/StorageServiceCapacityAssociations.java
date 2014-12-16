
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
    "StorageServiceID"
})
public class StorageServiceCapacityAssociations {

    /**
     * The ID of the StorageService this capacity describes
     * 
     */
    @JsonProperty("StorageServiceID")
    private String StorageServiceID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID of the StorageService this capacity describes
     * 
     * @return
     *     The StorageServiceID
     */
    @JsonProperty("StorageServiceID")
    public String getStorageServiceID() {
        return StorageServiceID;
    }

    /**
     * The ID of the StorageService this capacity describes
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
        return new HashCodeBuilder().append(StorageServiceID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageServiceCapacityAssociations) == false) {
            return false;
        }
        StorageServiceCapacityAssociations rhs = ((StorageServiceCapacityAssociations) other);
        return new EqualsBuilder().append(StorageServiceID, rhs.StorageServiceID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
