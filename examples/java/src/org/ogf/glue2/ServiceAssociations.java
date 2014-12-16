
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
    "ContactID",
    "EndpointID",
    "LocationID",
    "ManagerID",
    "ServiceID",
    "ShareID"
})
public class ServiceAssociations {

    /**
     * The IDs of Contacts for this Service
     * 
     */
    @JsonProperty("ContactID")
    private List<String> ContactID = new ArrayList<String>();
    /**
     * The IDs of Endpoints for this Service
     * 
     */
    @JsonProperty("EndpointID")
    private List<String> EndpointID = new ArrayList<String>();
    /**
     * The ID of the primary Location of this Service
     * 
     */
    @JsonProperty("LocationID")
    private String LocationID;
    /**
     * The IDs of the Managers of this Service
     * 
     */
    @JsonProperty("ManagerID")
    private List<String> ManagerID = new ArrayList<String>();
    /**
     * The IDs of Services related to this Service
     * 
     */
    @JsonProperty("ServiceID")
    private List<String> ServiceID = new ArrayList<String>();
    /**
     * The IDs of the Shares offered by this Service
     * 
     */
    @JsonProperty("ShareID")
    private List<String> ShareID = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * The IDs of Contacts for this Service
     * 
     * @return
     *     The ContactID
     */
    @JsonProperty("ContactID")
    public List<String> getContactID() {
        return ContactID;
    }

    /**
     * The IDs of Contacts for this Service
     * 
     * @param ContactID
     *     The ContactID
     */
    @JsonProperty("ContactID")
    public void setContactID(List<String> ContactID) {
        this.ContactID = ContactID;
    }

    /**
     * The IDs of Endpoints for this Service
     * 
     * @return
     *     The EndpointID
     */
    @JsonProperty("EndpointID")
    public List<String> getEndpointID() {
        return EndpointID;
    }

    /**
     * The IDs of Endpoints for this Service
     * 
     * @param EndpointID
     *     The EndpointID
     */
    @JsonProperty("EndpointID")
    public void setEndpointID(List<String> EndpointID) {
        this.EndpointID = EndpointID;
    }

    /**
     * The ID of the primary Location of this Service
     * 
     * @return
     *     The LocationID
     */
    @JsonProperty("LocationID")
    public String getLocationID() {
        return LocationID;
    }

    /**
     * The ID of the primary Location of this Service
     * 
     * @param LocationID
     *     The LocationID
     */
    @JsonProperty("LocationID")
    public void setLocationID(String LocationID) {
        this.LocationID = LocationID;
    }

    /**
     * The IDs of the Managers of this Service
     * 
     * @return
     *     The ManagerID
     */
    @JsonProperty("ManagerID")
    public List<String> getManagerID() {
        return ManagerID;
    }

    /**
     * The IDs of the Managers of this Service
     * 
     * @param ManagerID
     *     The ManagerID
     */
    @JsonProperty("ManagerID")
    public void setManagerID(List<String> ManagerID) {
        this.ManagerID = ManagerID;
    }

    /**
     * The IDs of Services related to this Service
     * 
     * @return
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public List<String> getServiceID() {
        return ServiceID;
    }

    /**
     * The IDs of Services related to this Service
     * 
     * @param ServiceID
     *     The ServiceID
     */
    @JsonProperty("ServiceID")
    public void setServiceID(List<String> ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * The IDs of the Shares offered by this Service
     * 
     * @return
     *     The ShareID
     */
    @JsonProperty("ShareID")
    public List<String> getShareID() {
        return ShareID;
    }

    /**
     * The IDs of the Shares offered by this Service
     * 
     * @param ShareID
     *     The ShareID
     */
    @JsonProperty("ShareID")
    public void setShareID(List<String> ShareID) {
        this.ShareID = ShareID;
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
        return new HashCodeBuilder().append(ContactID).append(EndpointID).append(LocationID).append(ManagerID).append(ServiceID).append(ShareID).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceAssociations) == false) {
            return false;
        }
        ServiceAssociations rhs = ((ServiceAssociations) other);
        return new EqualsBuilder().append(ContactID, rhs.ContactID).append(EndpointID, rhs.EndpointID).append(LocationID, rhs.LocationID).append(ManagerID, rhs.ManagerID).append(ServiceID, rhs.ServiceID).append(ShareID, rhs.ShareID).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
