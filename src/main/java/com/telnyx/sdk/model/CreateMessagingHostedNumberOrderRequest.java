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
 * CreateMessagingHostedNumberOrderRequest
 */
@JsonPropertyOrder(
    {
        CreateMessagingHostedNumberOrderRequest.JSON_PROPERTY_PHONE_NUMBERS,
        CreateMessagingHostedNumberOrderRequest.JSON_PROPERTY_MESSAGING_PROFILE_ID,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateMessagingHostedNumberOrderRequest {

    public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
    private List<String> phoneNumbers = null;

    public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID =
        "messaging_profile_id";
    private String messagingProfileId;

    public CreateMessagingHostedNumberOrderRequest() {}

    public CreateMessagingHostedNumberOrderRequest phoneNumbers(
        List<String> phoneNumbers
    ) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public CreateMessagingHostedNumberOrderRequest addphoneNumbersItem(
        String phoneNumbersItem
    ) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumbersItem);
        return this;
    }

    /**
     * Phone numbers to be used for hosted messaging.
     * @return phoneNumbers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Phone numbers to be used for hosted messaging.")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public CreateMessagingHostedNumberOrderRequest messagingProfileId(
        String messagingProfileId
    ) {
        this.messagingProfileId = messagingProfileId;
        return this;
    }

    /**
     * Automatically associate the number with this messaging profile ID when the order is complete.
     * @return messagingProfileId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Automatically associate the number with this messaging profile ID when the order is complete."
    )
    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessagingProfileId() {
        return messagingProfileId;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessagingProfileId(String messagingProfileId) {
        this.messagingProfileId = messagingProfileId;
    }

    /**
     * Return true if this CreateMessagingHostedNumberOrderRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMessagingHostedNumberOrderRequest createMessagingHostedNumberOrderRequest =
            (CreateMessagingHostedNumberOrderRequest) o;
        return (
            Objects.equals(
                this.phoneNumbers,
                createMessagingHostedNumberOrderRequest.phoneNumbers
            ) &&
            Objects.equals(
                this.messagingProfileId,
                createMessagingHostedNumberOrderRequest.messagingProfileId
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumbers, messagingProfileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessagingHostedNumberOrderRequest {\n");
        sb
            .append("    phoneNumbers: ")
            .append(toIndentedString(phoneNumbers))
            .append("\n");
        sb
            .append("    messagingProfileId: ")
            .append(toIndentedString(messagingProfileId))
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
