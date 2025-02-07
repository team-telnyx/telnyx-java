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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * BulkMessagingSettingsUpdatePhoneNumbersRequest
 */
@JsonPropertyOrder(
    {
        BulkMessagingSettingsUpdatePhoneNumbersRequest.JSON_PROPERTY_MESSAGING_PROFILE_ID,
        BulkMessagingSettingsUpdatePhoneNumbersRequest.JSON_PROPERTY_NUMBERS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BulkMessagingSettingsUpdatePhoneNumbersRequest {

    public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID =
        "messaging_profile_id";
    private String messagingProfileId;

    public static final String JSON_PROPERTY_NUMBERS = "numbers";
    private List<String> numbers = new ArrayList<>();

    public BulkMessagingSettingsUpdatePhoneNumbersRequest() {}

    public BulkMessagingSettingsUpdatePhoneNumbersRequest messagingProfileId(
        String messagingProfileId
    ) {
        this.messagingProfileId = messagingProfileId;
        return this;
    }

    /**
     * Configure the messaging profile these phone numbers are assigned to:  * Set this field to &#x60;\&quot;\&quot;&#x60; to unassign each number from their respective messaging profile * Set this field to a quoted UUID of a messaging profile to assign these numbers to that messaging profile
     * @return messagingProfileId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Configure the messaging profile these phone numbers are assigned to:  * Set this field to `\"\"` to unassign each number from their respective messaging profile * Set this field to a quoted UUID of a messaging profile to assign these numbers to that messaging profile"
    )
    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getMessagingProfileId() {
        return messagingProfileId;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMessagingProfileId(String messagingProfileId) {
        this.messagingProfileId = messagingProfileId;
    }

    public BulkMessagingSettingsUpdatePhoneNumbersRequest numbers(
        List<String> numbers
    ) {
        this.numbers = numbers;
        return this;
    }

    public BulkMessagingSettingsUpdatePhoneNumbersRequest addnumbersItem(
        String numbersItem
    ) {
        this.numbers.add(numbersItem);
        return this;
    }

    /**
     * The list of phone numbers to update.
     * @return numbers
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The list of phone numbers to update."
    )
    @JsonProperty(JSON_PROPERTY_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getNumbers() {
        return numbers;
    }

    @JsonProperty(JSON_PROPERTY_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    /**
     * Return true if this BulkMessagingSettingsUpdatePhoneNumbersRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BulkMessagingSettingsUpdatePhoneNumbersRequest bulkMessagingSettingsUpdatePhoneNumbersRequest =
            (BulkMessagingSettingsUpdatePhoneNumbersRequest) o;
        return (
            Objects.equals(
                this.messagingProfileId,
                bulkMessagingSettingsUpdatePhoneNumbersRequest.messagingProfileId
            ) &&
            Objects.equals(
                this.numbers,
                bulkMessagingSettingsUpdatePhoneNumbersRequest.numbers
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(messagingProfileId, numbers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkMessagingSettingsUpdatePhoneNumbersRequest {\n");
        sb
            .append("    messagingProfileId: ")
            .append(toIndentedString(messagingProfileId))
            .append("\n");
        sb
            .append("    numbers: ")
            .append(toIndentedString(numbers))
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
