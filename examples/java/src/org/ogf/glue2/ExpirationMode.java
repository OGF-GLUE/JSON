
package org.ogf.glue2;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

@Generated("org.jsonschema2pojo")
public enum ExpirationMode {

    NEVEREXPIRE("neverexpire"),
    RELEASEWHENEXPIRED("releasewhenexpired"),
    WARNWHENEXPIRED("warnwhenexpired");
    private final String value;
    private static Map<String, ExpirationMode> constants = new HashMap<String, ExpirationMode>();

    static {
        for (ExpirationMode c: values()) {
            constants.put(c.value, c);
        }
    }

    private ExpirationMode(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }

    @JsonCreator
    public static ExpirationMode fromValue(String value) {
        ExpirationMode constant = constants.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
