
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
    "ProductName",
    "ProductVersion"
})
public class Manager extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private ManagerAssociations Associations;
    /**
     * The name of the software product which implements the Manager
     * 
     */
    @JsonProperty("ProductName")
    private String ProductName;
    /**
     * The version of the software product which implements the Manager
     * 
     */
    @JsonProperty("ProductVersion")
    private String ProductVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ManagerAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ManagerAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * The name of the software product which implements the Manager
     * 
     * @return
     *     The ProductName
     */
    @JsonProperty("ProductName")
    public String getProductName() {
        return ProductName;
    }

    /**
     * The name of the software product which implements the Manager
     * 
     * @param ProductName
     *     The ProductName
     */
    @JsonProperty("ProductName")
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * The version of the software product which implements the Manager
     * 
     * @return
     *     The ProductVersion
     */
    @JsonProperty("ProductVersion")
    public String getProductVersion() {
        return ProductVersion;
    }

    /**
     * The version of the software product which implements the Manager
     * 
     * @param ProductVersion
     *     The ProductVersion
     */
    @JsonProperty("ProductVersion")
    public void setProductVersion(String ProductVersion) {
        this.ProductVersion = ProductVersion;
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
        return new HashCodeBuilder().append(Associations).append(ProductName).append(ProductVersion).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Manager) == false) {
            return false;
        }
        Manager rhs = ((Manager) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(ProductName, rhs.ProductName).append(ProductVersion, rhs.ProductVersion).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
