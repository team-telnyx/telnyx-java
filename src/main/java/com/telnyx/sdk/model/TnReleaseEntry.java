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
 * TnReleaseEntry
 */
@JsonPropertyOrder(
    {
        TnReleaseEntry.JSON_PROPERTY_PHONE_NUMBER,
        TnReleaseEntry.JSON_PROPERTY_NUMBER_ID,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class TnReleaseEntry {

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public static final String JSON_PROPERTY_NUMBER_ID = "number_id";
    private String numberId;

    public TnReleaseEntry() {}

    public TnReleaseEntry phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Phone number in E164 format.
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Phone number in E164 format.")
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

    public TnReleaseEntry numberId(String numberId) {
        this.numberId = numberId;
        return this;
    }

    /**
     * Phone number ID from the Telnyx API.
     * @return numberId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "Phone number ID from the Telnyx API.")
    @JsonProperty(JSON_PROPERTY_NUMBER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNumberId() {
        return numberId;
    }

    @JsonProperty(JSON_PROPERTY_NUMBER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    /**
     * Return true if this TnReleaseEntry object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TnReleaseEntry tnReleaseEntry = (TnReleaseEntry) o;
        return (
            Objects.equals(this.phoneNumber, tnReleaseEntry.phoneNumber) &&
            Objects.equals(this.numberId, tnReleaseEntry.numberId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, numberId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TnReleaseEntry {\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb
            .append("    numberId: ")
            .append(toIndentedString(numberId))
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
