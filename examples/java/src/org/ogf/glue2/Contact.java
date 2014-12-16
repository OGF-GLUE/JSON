
package org.ogf.glue2;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * A GLUE 2 Contact
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "Associations",
    "Detail",
    "Type"
})
public class Contact extends Entity {

    /**
     * 
     */
    @JsonProperty("Associations")
    private ContactAssociations Associations;
    /**
     * A URI embedding the contact information
     * 
     */
    @JsonProperty("Detail")
    private String Detail;
    /**
     * closed enumeration ContactType_t
     * 
     */
    @JsonProperty("Type")
    private Contact.Type Type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Associations
     */
    @JsonProperty("Associations")
    public ContactAssociations getAssociations() {
        return Associations;
    }

    /**
     * 
     * @param Associations
     *     The Associations
     */
    @JsonProperty("Associations")
    public void setAssociations(ContactAssociations Associations) {
        this.Associations = Associations;
    }

    /**
     * A URI embedding the contact information
     * 
     * @return
     *     The Detail
     */
    @JsonProperty("Detail")
    public String getDetail() {
        return Detail;
    }

    /**
     * A URI embedding the contact information
     * 
     * @param Detail
     *     The Detail
     */
    @JsonProperty("Detail")
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * closed enumeration ContactType_t
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public Contact.Type getType() {
        return Type;
    }

    /**
     * closed enumeration ContactType_t
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(Contact.Type Type) {
        this.Type = Type;
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
        return new HashCodeBuilder().append(Associations).append(Detail).append(Type).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return new EqualsBuilder().append(Associations, rhs.Associations).append(Detail, rhs.Detail).append(Type, rhs.Type).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        GENERAL("general"),
        SECURITY("security"),
        SYSADMIN("sysadmin"),
        USERSUPPORT("usersupport");
        private final String value;
        private static Map<String, Contact.Type> constants = new HashMap<String, Contact.Type>();

        static {
            for (Contact.Type c: values()) {
                constants.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Contact.Type fromValue(String value) {
            Contact.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
