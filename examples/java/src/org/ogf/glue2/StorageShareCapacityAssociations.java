
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
    "StorageShareID"
})
public class StorageShareCapacityAssociations {

    /**
     * The ID of the StorageShare related to this capacity
     * 
     */
    @JsonProperty("StorageShareID")
    private String StorageShareID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The ID of the StorageShare related to this capacity
     * 
     * @return
     *     The StorageShareID
     */
    @JsonProperty("StorageShareID")
    public String getStorageShareID() {
        return StorageShareID;
    }

    /**
     * The ID of the StorageShare related to this capacity
     * 
     * @param StorageShareID
     *     The StorageShareID
     */
    @JsonProperty("StorageShareID")
    public void setStorageShareID(String StorageShareID) {
        this.StorageShareID = StorageShareID;
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
        return new HashCodeBuilder().append(StorageShareID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageShareCapacityAssociations) == false) {
            return false;
        }
        StorageShareCapacityAssociations rhs = ((StorageShareCapacityAssociations) other);
        return new EqualsBuilder().append(StorageShareID, rhs.StorageShareID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
