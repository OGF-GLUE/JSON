
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
    "Bandwidth",
    "NetworkInfo"
})
public class ToComputingService extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private ToComputingServiceAssociations Associations;
    /**
     * The normal bandwidth available between the Storage and Computing services (Mb/s)
     * 
     */
    @JsonProperty("Bandwidth")
    private Long Bandwidth;
    /**
     * Type of network connections between the Storage and Computing services (NetworkInfo_t)
     * 
     */
    @JsonProperty("NetworkInfo")
    private String NetworkInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ToComputingServiceAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ToComputingServiceAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The normal bandwidth available between the Storage and Computing services (Mb/s)
     * 
     * @return
     *     The Bandwidth
     */
    @JsonProperty("Bandwidth")
    public Long getBandwidth() {
        return Bandwidth;
    }

    /**
     * The normal bandwidth available between the Storage and Computing services (Mb/s)
     * 
     * @param Bandwidth
     *     The Bandwidth
     */
    @JsonProperty("Bandwidth")
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Type of network connections between the Storage and Computing services (NetworkInfo_t)
     * 
     * @return
     *     The NetworkInfo
     */
    @JsonProperty("NetworkInfo")
    public String getNetworkInfo() {
        return NetworkInfo;
    }

    /**
     * Type of network connections between the Storage and Computing services (NetworkInfo_t)
     * 
     * @param NetworkInfo
     *     The NetworkInfo
     */
    @JsonProperty("NetworkInfo")
    public void setNetworkInfo(String NetworkInfo) {
        this.NetworkInfo = NetworkInfo;
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
        return new HashCodeBuilder().append(Associations).append(Bandwidth).append(NetworkInfo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ToComputingService) == false) {
            return false;
        }
        ToComputingService rhs = ((ToComputingService) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Bandwidth, rhs.Bandwidth).append(NetworkInfo, rhs.NetworkInfo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
