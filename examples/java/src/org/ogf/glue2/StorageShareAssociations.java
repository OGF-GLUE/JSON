
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
    "StorageShareCapacityID"
})
public class StorageShareAssociations extends ShareAssociations {

    /**
     * ID of the StorageShareCapacities associated with this share
     * 
     */
    @JsonProperty("StorageShareCapacityID")
    private List<String> StorageShareCapacityID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID of the StorageShareCapacities associated with this share
     * 
     * @return
     *     The StorageShareCapacityID
     */
    @JsonProperty("StorageShareCapacityID")
    public List<String> getStorageShareCapacityID() {
        return StorageShareCapacityID;
    }

    /**
     * ID of the StorageShareCapacities associated with this share
     * 
     * @param StorageShareCapacityID
     *     The StorageShareCapacityID
     */
    @JsonProperty("StorageShareCapacityID")
    public void setStorageShareCapacityID(List<String> StorageShareCapacityID) {
        this.StorageShareCapacityID = StorageShareCapacityID;
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
        return new HashCodeBuilder().append(StorageShareCapacityID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageShareAssociations) == false) {
            return false;
        }
        StorageShareAssociations rhs = ((StorageShareAssociations) other);
        return new EqualsBuilder().append(StorageShareCapacityID, rhs.StorageShareCapacityID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
