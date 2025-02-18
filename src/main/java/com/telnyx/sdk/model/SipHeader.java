/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.telnyx.sdk.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SipHeader
 */
@JsonPropertyOrder(
    { SipHeader.JSON_PROPERTY_NAME, SipHeader.JSON_PROPERTY_VALUE }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SipHeader {

    /**
     * The name of the header to add.
     */
    public enum NameEnum {
        USER_TO_USER(String.valueOf("User-to-User"));

        private String value;

        NameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NameEnum fromValue(String value) {
            for (NameEnum b : NameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_NAME = "name";
    private NameEnum name;

    public static final String JSON_PROPERTY_VALUE = "value";
    private String value;

    public SipHeader() {}

    public SipHeader name(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the header to add.
     * @return name
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "User-to-User",
        required = true,
        value = "The name of the header to add."
    )
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public NameEnum getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(NameEnum name) {
        this.name = name;
    }

    public SipHeader value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the header.
     * @return value
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "value",
        required = true,
        value = "The value of the header."
    )
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Return true if this SipHeader object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SipHeader sipHeader = (SipHeader) o;
        return (
            Objects.equals(this.name, sipHeader.name) &&
            Objects.equals(this.value, sipHeader.value)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SipHeader {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
