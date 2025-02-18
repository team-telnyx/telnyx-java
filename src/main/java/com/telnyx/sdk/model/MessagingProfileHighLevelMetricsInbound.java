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
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * MessagingProfileHighLevelMetricsInbound
 */
@JsonPropertyOrder(
    { MessagingProfileHighLevelMetricsInbound.JSON_PROPERTY_RECEIVED }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class MessagingProfileHighLevelMetricsInbound {

    public static final String JSON_PROPERTY_RECEIVED = "received";
    private BigDecimal received;

    public MessagingProfileHighLevelMetricsInbound() {}

    @JsonCreator
    public MessagingProfileHighLevelMetricsInbound(
        @JsonProperty(JSON_PROPERTY_RECEIVED) BigDecimal received
    ) {
        this();
        this.received = received;
    }

    /**
     * The number of inbound messages received.
     * @return received
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The number of inbound messages received.")
    @JsonProperty(JSON_PROPERTY_RECEIVED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getReceived() {
        return received;
    }

    /**
     * Return true if this MessagingProfileHighLevelMetrics_inbound object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagingProfileHighLevelMetricsInbound messagingProfileHighLevelMetricsInbound =
            (MessagingProfileHighLevelMetricsInbound) o;
        return Objects.equals(
            this.received,
            messagingProfileHighLevelMetricsInbound.received
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(received);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessagingProfileHighLevelMetricsInbound {\n");
        sb
            .append("    received: ")
            .append(toIndentedString(received))
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
