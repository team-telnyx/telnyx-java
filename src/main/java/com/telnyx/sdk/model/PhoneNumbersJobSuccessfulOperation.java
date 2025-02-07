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
 * PhoneNumbersJobSuccessfulOperation
 */
@JsonPropertyOrder(
    {
        PhoneNumbersJobSuccessfulOperation.JSON_PROPERTY_PHONE_NUMBER,
        PhoneNumbersJobSuccessfulOperation.JSON_PROPERTY_ID,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PhoneNumbersJobSuccessfulOperation {

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public PhoneNumbersJobSuccessfulOperation() {}

    public PhoneNumbersJobSuccessfulOperation phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The phone number in e164 format.
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The phone number in e164 format.")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumbersJobSuccessfulOperation id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The phone number&#39;s ID
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The phone number's ID")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Return true if this PhoneNumbersJobSuccessfulOperation object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumbersJobSuccessfulOperation phoneNumbersJobSuccessfulOperation =
            (PhoneNumbersJobSuccessfulOperation) o;
        return (
            Objects.equals(
                this.phoneNumber,
                phoneNumbersJobSuccessfulOperation.phoneNumber
            ) &&
            Objects.equals(this.id, phoneNumbersJobSuccessfulOperation.id)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneNumbersJobSuccessfulOperation {\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
