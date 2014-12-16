
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
    "CreationTime",
    "Extension",
    "ID",
    "Name",
    "OtherInfo",
    "Validity"
})
public class Entity {

    /**
     * The creation time of this entity in the format: CCYY-MM-DDThh:mm:ss[Z|(+|-)hh:mm]
     * 
     */
    @JsonProperty("CreationTime")
    private String CreationTime;
    /**
     * Key/value pairs enabling the association of extra information not captured by the model
     * 
     */
    @JsonProperty("Extension")
    private org.ogf.glue2.Extension Extension;
    /**
     * A globally unique identifier for this entity
     * 
     */
    @JsonProperty("ID")
    private String ID;
    /**
     * A human-readable name
     * 
     */
    @JsonProperty("Name")
    private String Name;
    /**
     * Placeholder for information that does not fit in any other attribute
     * 
     */
    @JsonProperty("OtherInfo")
    private List<String> OtherInfo = new ArrayList<String>();
    /**
     * The number of seconds after CreationTime that this entity should be considered relevant
     * 
     */
    @JsonProperty("Validity")
    private Long Validity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The creation time of this entity in the format: CCYY-MM-DDThh:mm:ss[Z|(+|-)hh:mm]
     * 
     * @return
     *     The CreationTime
     */
    @JsonProperty("CreationTime")
    public String getCreationTime() {
        return CreationTime;
    }

    /**
     * The creation time of this entity in the format: CCYY-MM-DDThh:mm:ss[Z|(+|-)hh:mm]
     * 
     * @param CreationTime
     *     The CreationTime
     */
    @JsonProperty("CreationTime")
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Key/value pairs enabling the association of extra information not captured by the model
     * 
     * @return
     *     The Extension
     */
    @JsonProperty("Extension")
    public org.ogf.glue2.Extension getExtension() {
        return Extension;
    }

    /**
     * Key/value pairs enabling the association of extra information not captured by the model
     * 
     * @param Extension
     *     The Extension
     */
    @JsonProperty("Extension")
    public void setExtension(org.ogf.glue2.Extension Extension) {
        this.Extension = Extension;
    }

    /**
     * A globally unique identifier for this entity
     * 
     * @return
     *     The ID
     */
    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    /**
     * A globally unique identifier for this entity
     * 
     * @param ID
     *     The ID
     */
    @JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * A human-readable name
     * 
     * @return
     *     The Name
     */
    @JsonProperty("Name")
    public String getName() {
        return Name;
    }

    /**
     * A human-readable name
     * 
     * @param Name
     *     The Name
     */
    @JsonProperty("Name")
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Placeholder for information that does not fit in any other attribute
     * 
     * @return
     *     The OtherInfo
     */
    @JsonProperty("OtherInfo")
    public List<String> getOtherInfo() {
        return OtherInfo;
    }

    /**
     * Placeholder for information that does not fit in any other attribute
     * 
     * @param OtherInfo
     *     The OtherInfo
     */
    @JsonProperty("OtherInfo")
    public void setOtherInfo(List<String> OtherInfo) {
        this.OtherInfo = OtherInfo;
    }

    /**
     * The number of seconds after CreationTime that this entity should be considered relevant
     * 
     * @return
     *     The Validity
     */
    @JsonProperty("Validity")
    public Long getValidity() {
        return Validity;
    }

    /**
     * The number of seconds after CreationTime that this entity should be considered relevant
     * 
     * @param Validity
     *     The Validity
     */
    @JsonProperty("Validity")
    public void setValidity(Long Validity) {
        this.Validity = Validity;
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
        return new HashCodeBuilder().append(CreationTime).append(Extension).append(ID).append(Name).append(OtherInfo).append(Validity).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entity) == false) {
            return false;
        }
        Entity rhs = ((Entity) other);
        return new EqualsBuilder().append(CreationTime, rhs.CreationTime).append(Extension, rhs.Extension).append(ID, rhs.ID).append(Name, rhs.Name).append(OtherInfo, rhs.OtherInfo).append(Validity, rhs.Validity).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
