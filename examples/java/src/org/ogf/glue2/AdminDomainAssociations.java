
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
    "ChildDomainID",
    "ComputingServiceID",
    "ParentDomainID",
    "ServiceID",
    "StorageServiceID"
})
public class AdminDomainAssociations extends DomainAssociations {

    /**
     * IDs of AdminDomains aggregated by this AdminDomain
     * 
     */
    @JsonProperty("ChildDomainID")
    private List<String> ChildDomainID = new ArrayList<String>();
    /**
     * IDs of ComputingServices in this AdminDomain
     * 
     */
    @JsonProperty("ComputingServiceID")
    private List<String> ComputingServiceID = new ArrayList<String>();
    /**
     * The ID of the AdminDomain that this AdminDomain participates in
     * 
     */
    @JsonProperty("ParentDomainID")
    private String ParentDomainID;
    /**
     * IDs of Services in this AdminDomain
     * 
     */
    @JsonProperty("ServiceID")
    private List<String> ServiceID = new ArrayList<String>();
    /**
     * IDs of StorageServices in this AdminDomain
     * 
     */
    @JsonProperty("StorageServiceID")
    private List<String> StorageServiceID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * IDs of AdminDomains aggregated by this AdminDomain
     * 
     * @return
     *     The ChildDomainID
     */
    @JsonProperty("ChildDomainID")
    public List<String> getChildDomainID() {
        return ChildDomainID;
    }

    /**
     * IDs of AdminDomains aggregated by this AdminDomain
     * 
     * @param ChildDomainID
     *     The ChildDomainID
     */
    @JsonProperty("ChildDomainID")
    public void setChildDomainID(List<String> ChildDomainID) {
        this.ChildDomainID = ChildDomainID;
    }

    /**
     * IDs of ComputingServices in this AdminDomain
     * 
     * @return
     *     The ComputingServiceID
     */
    @JsonProperty("ComputingServiceID")
    public List<String> getComputingServiceID() {
        return ComputingServiceID;
    }

    /**
     * IDs of ComputingServices in this AdminDomain
     * 
     * @param ComputingServiceID
     *     The ComputingServiceID
     */
    @JsonProperty("ComputingServiceID")
    public void setComputingServiceID(List<String> ComputingServiceID) {
        this.ComputingServiceID = ComputingServiceID;
    }

    /**
     * The ID of the AdminDomain that this AdminDomain participates in
     * 
     * @return
     *     The ParentDomainID
     */
    @JsonProperty("ParentDomainID")
    public String getParentDomainID() {
        return ParentDomainID;
    }

    /**
     * The ID of the AdminDomain that this AdminDomain participates in
     * 
     * @param ParentDomainID
     *     The ParentDomainID
     */
    @JsonProperty("ParentDomainID")
    public void setParentDomainID(String ParentDomainID) {
        this.ParentDomainID = ParentDomainID;
    }

    /**
     * IDs of Services in this AdminDomain
     * 
     * @return
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public List<String> getServiceID() {
        return ServiceID;
    }

    /**
     * IDs of Services in this AdminDomain
     * 
     * @param ServiceID
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public void setServiceID(List<String> ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * IDs of StorageServices in this AdminDomain
     * 
     * @return
     *     The StorageServiceID
     */
    @JsonProperty("StorageServiceID")
    public List<String> getStorageServiceID() {
        return StorageServiceID;
    }

    /**
     * IDs of StorageServices in this AdminDomain
     * 
     * @param StorageServiceID
     *     The StorageServiceID
     */
    @JsonProperty("StorageServiceID")
    public void setStorageServiceID(List<String> StorageServiceID) {
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
        return new HashCodeBuilder().append(ChildDomainID).append(ComputingServiceID).append(ParentDomainID).append(ServiceID).append(StorageServiceID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdminDomainAssociations) == false) {
            return false;
        }
        AdminDomainAssociations rhs = ((AdminDomainAssociations) other);
        return new EqualsBuilder().append(ChildDomainID, rhs.ChildDomainID).append(ComputingServiceID, rhs.ComputingServiceID).append(ParentDomainID, rhs.ParentDomainID).append(ServiceID, rhs.ServiceID).append(StorageServiceID, rhs.StorageServiceID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
