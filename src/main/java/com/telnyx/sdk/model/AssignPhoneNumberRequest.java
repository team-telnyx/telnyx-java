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
 * AssignPhoneNumberRequest
 */
@JsonPropertyOrder({ AssignPhoneNumberRequest.JSON_PROPERTY_PHONE_NUMBER })
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class AssignPhoneNumberRequest {

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public AssignPhoneNumberRequest() {}

    public AssignPhoneNumberRequest phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     * @return phoneNumber
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(example = "+15554441234", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Return true if this AssignPhoneNumber_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignPhoneNumberRequest assignPhoneNumberRequest =
            (AssignPhoneNumberRequest) o;
        return Objects.equals(
            this.phoneNumber,
            assignPhoneNumberRequest.phoneNumber
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignPhoneNumberRequest {\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
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
