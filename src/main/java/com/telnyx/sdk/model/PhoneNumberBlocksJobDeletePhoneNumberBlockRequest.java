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
 * PhoneNumberBlocksJobDeletePhoneNumberBlockRequest
 */
@JsonPropertyOrder(
    {
        PhoneNumberBlocksJobDeletePhoneNumberBlockRequest.JSON_PROPERTY_PHONE_NUMBER_BLOCK_ID,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PhoneNumberBlocksJobDeletePhoneNumberBlockRequest {

    public static final String JSON_PROPERTY_PHONE_NUMBER_BLOCK_ID =
        "phone_number_block_id";
    private String phoneNumberBlockId;

    public PhoneNumberBlocksJobDeletePhoneNumberBlockRequest() {}

    public PhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlockId(
        String phoneNumberBlockId
    ) {
        this.phoneNumberBlockId = phoneNumberBlockId;
        return this;
    }

    /**
     * Get phoneNumberBlockId
     * @return phoneNumberBlockId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_BLOCK_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPhoneNumberBlockId() {
        return phoneNumberBlockId;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_BLOCK_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPhoneNumberBlockId(String phoneNumberBlockId) {
        this.phoneNumberBlockId = phoneNumberBlockId;
    }

    /**
     * Return true if this PhoneNumberBlocksJobDeletePhoneNumberBlockRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumberBlocksJobDeletePhoneNumberBlockRequest phoneNumberBlocksJobDeletePhoneNumberBlockRequest =
            (PhoneNumberBlocksJobDeletePhoneNumberBlockRequest) o;
        return Objects.equals(
            this.phoneNumberBlockId,
            phoneNumberBlocksJobDeletePhoneNumberBlockRequest.phoneNumberBlockId
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumberBlockId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class PhoneNumberBlocksJobDeletePhoneNumberBlockRequest {\n"
        );
        sb
            .append("    phoneNumberBlockId: ")
            .append(toIndentedString(phoneNumberBlockId))
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
