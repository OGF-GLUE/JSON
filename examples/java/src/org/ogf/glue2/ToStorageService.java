
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
    "LocalPath",
    "RemotePath"
})
public class ToStorageService extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private ToStorageServiceAssociations Associations;
    /**
     * The path within the ComputingService that is used to access the StorageService
     * 
     */
    @JsonProperty("LocalPath")
    private String LocalPath;
    /**
     * The path in the StorageService which is associated with the LocalPath
     * 
     */
    @JsonProperty("RemotePath")
    private String RemotePath;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ToStorageServiceAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ToStorageServiceAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The path within the ComputingService that is used to access the StorageService
     * 
     * @return
     *     The LocalPath
     */
    @JsonProperty("LocalPath")
    public String getLocalPath() {
        return LocalPath;
    }

    /**
     * The path within the ComputingService that is used to access the StorageService
     * 
     * @param LocalPath
     *     The LocalPath
     */
    @JsonProperty("LocalPath")
    public void setLocalPath(String LocalPath) {
        this.LocalPath = LocalPath;
    }

    /**
     * The path in the StorageService which is associated with the LocalPath
     * 
     * @return
     *     The RemotePath
     */
    @JsonProperty("RemotePath")
    public String getRemotePath() {
        return RemotePath;
    }

    /**
     * The path in the StorageService which is associated with the LocalPath
     * 
     * @param RemotePath
     *     The RemotePath
     */
    @JsonProperty("RemotePath")
    public void setRemotePath(String RemotePath) {
        this.RemotePath = RemotePath;
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
        return new HashCodeBuilder().append(Associations).append(LocalPath).append(RemotePath).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ToStorageService) == false) {
            return false;
        }
        ToStorageService rhs = ((ToStorageService) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(LocalPath, rhs.LocalPath).append(RemotePath, rhs.RemotePath).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
