
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


/**
 * A GLUE 2 Location
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Address",
    "Associations",
    "Country",
    "Latitude",
    "Longitude",
    "Place",
    "PostalCode"
})
public class Location extends Entity {

    /**
     * A free format street address
     * 
     */
    @JsonProperty("Address")
    private String Address;
    @JsonProperty("Associations")
    private LocationAssociations Associations;
    /**
     * Name of country
     * 
     */
    @JsonProperty("Country")
    private String Country;
    /**
     * Position north (positive) or south (negative) of the equator in degrees
     * 
     */
    @JsonProperty("Latitude")
    private Double Latitude;
    /**
     * Position east (positive) or west (negative) of the primary meridian in degrees
     * 
     */
    @JsonProperty("Longitude")
    private Double Longitude;
    /**
     * Name of town/city
     * 
     */
    @JsonProperty("Place")
    private String Place;
    /**
     * Postal code
     * 
     */
    @JsonProperty("PostalCode")
    private String PostalCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A free format street address
     * 
     * @return
     *     The Address
     */
    @JsonProperty("Address")
    public String getAddress() {
        return Address;
    }

    /**
     * A free format street address
     * 
     * @param Address
     *     The Address
     */
    @JsonProperty("Address")
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public LocationAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(LocationAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * Name of country
     * 
     * @return
     *     The Country
     */
    @JsonProperty("Country")
    public String getCountry() {
        return Country;
    }

    /**
     * Name of country
     * 
     * @param Country
     *     The Country
     */
    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Position north (positive) or south (negative) of the equator in degrees
     * 
     * @return
     *     The Latitude
     */
    @JsonProperty("Latitude")
    public Double getLatitude() {
        return Latitude;
    }

    /**
     * Position north (positive) or south (negative) of the equator in degrees
     * 
     * @param Latitude
     *     The Latitude
     */
    @JsonProperty("Latitude")
    public void setLatitude(Double Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Position east (positive) or west (negative) of the primary meridian in degrees
     * 
     * @return
     *     The Longitude
     */
    @JsonProperty("Longitude")
    public Double getLongitude() {
        return Longitude;
    }

    /**
     * Position east (positive) or west (negative) of the primary meridian in degrees
     * 
     * @param Longitude
     *     The Longitude
     */
    @JsonProperty("Longitude")
    public void setLongitude(Double Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Name of town/city
     * 
     * @return
     *     The Place
     */
    @JsonProperty("Place")
    public String getPlace() {
        return Place;
    }

    /**
     * Name of town/city
     * 
     * @param Place
     *     The Place
     */
    @JsonProperty("Place")
    public void setPlace(String Place) {
        this.Place = Place;
    }

    /**
     * Postal code
     * 
     * @return
     *     The PostalCode
     */
    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * Postal code
     * 
     * @param PostalCode
     *     The PostalCode
     */
    @JsonProperty("PostalCode")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
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
        return new HashCodeBuilder().append(Address).append(Associations).append(Country).append(Latitude).append(Longitude).append(Place).append(PostalCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(Address, rhs.Address).append(Associations, rhs.Associations).append(Country, rhs.Country).append(Latitude, rhs.Latitude).append(Longitude, rhs.Longitude).append(Place, rhs.Place).append(PostalCode, rhs.PostalCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
