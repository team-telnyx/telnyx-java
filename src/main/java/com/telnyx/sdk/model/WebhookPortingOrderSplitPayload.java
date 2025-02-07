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
import com.telnyx.sdk.model.WebhookPortingOrderSplitPayloadFrom;
import com.telnyx.sdk.model.WebhookPortingOrderSplitPayloadPortingPhoneNumbersInner;
import com.telnyx.sdk.model.WebhookPortingOrderSplitPayloadTo;
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
 * The webhook payload for the porting_order.split event
 */
@ApiModel(description = "The webhook payload for the porting_order.split event")
@JsonPropertyOrder(
    {
        WebhookPortingOrderSplitPayload.JSON_PROPERTY_FROM,
        WebhookPortingOrderSplitPayload.JSON_PROPERTY_TO,
        WebhookPortingOrderSplitPayload.JSON_PROPERTY_PORTING_PHONE_NUMBERS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class WebhookPortingOrderSplitPayload {

    public static final String JSON_PROPERTY_FROM = "from";
    private WebhookPortingOrderSplitPayloadFrom from;

    public static final String JSON_PROPERTY_TO = "to";
    private WebhookPortingOrderSplitPayloadTo to;

    public static final String JSON_PROPERTY_PORTING_PHONE_NUMBERS =
        "porting_phone_numbers";
    private List<
        WebhookPortingOrderSplitPayloadPortingPhoneNumbersInner
    > portingPhoneNumbers = null;

    public WebhookPortingOrderSplitPayload() {}

    public WebhookPortingOrderSplitPayload from(
        WebhookPortingOrderSplitPayloadFrom from
    ) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WebhookPortingOrderSplitPayloadFrom getFrom() {
        return from;
    }

    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFrom(WebhookPortingOrderSplitPayloadFrom from) {
        this.from = from;
    }

    public WebhookPortingOrderSplitPayload to(
        WebhookPortingOrderSplitPayloadTo to
    ) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WebhookPortingOrderSplitPayloadTo getTo() {
        return to;
    }

    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTo(WebhookPortingOrderSplitPayloadTo to) {
        this.to = to;
    }

    public WebhookPortingOrderSplitPayload portingPhoneNumbers(
        List<
            WebhookPortingOrderSplitPayloadPortingPhoneNumbersInner
        > portingPhoneNumbers
    ) {
        this.portingPhoneNumbers = portingPhoneNumbers;
        return this;
    }

    public WebhookPortingOrderSplitPayload addportingPhoneNumbersItem(
        WebhookPortingOrderSplitPayloadPortingPhoneNumbersInner portingPhoneNumbersItem
    ) {
        if (this.portingPhoneNumbers == null) {
            this.portingPhoneNumbers = new ArrayList<>();
        }
        this.portingPhoneNumbers.add(portingPhoneNumbersItem);
        return this;
    }

    /**
     * The list of porting phone numbers that were moved to the new porting order.
     * @return portingPhoneNumbers
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The list of porting phone numbers that were moved to the new porting order."
    )
    @JsonProperty(JSON_PROPERTY_PORTING_PHONE_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<
        WebhookPortingOrderSplitPayloadPortingPhoneNumbersInner
    > getPortingPhoneNumbers() {
        return portingPhoneNumbers;
    }

    @JsonProperty(JSON_PROPERTY_PORTING_PHONE_NUMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPortingPhoneNumbers(
        List<
            WebhookPortingOrderSplitPayloadPortingPhoneNumbersInner
        > portingPhoneNumbers
    ) {
        this.portingPhoneNumbers = portingPhoneNumbers;
    }

    /**
     * Return true if this WebhookPortingOrderSplitPayload object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPortingOrderSplitPayload webhookPortingOrderSplitPayload =
            (WebhookPortingOrderSplitPayload) o;
        return (
            Objects.equals(this.from, webhookPortingOrderSplitPayload.from) &&
            Objects.equals(this.to, webhookPortingOrderSplitPayload.to) &&
            Objects.equals(
                this.portingPhoneNumbers,
                webhookPortingOrderSplitPayload.portingPhoneNumbers
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, portingPhoneNumbers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPortingOrderSplitPayload {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb
            .append("    portingPhoneNumbers: ")
            .append(toIndentedString(portingPhoneNumbers))
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
