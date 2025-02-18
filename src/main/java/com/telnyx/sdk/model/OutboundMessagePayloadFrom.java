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
 * OutboundMessagePayloadFrom
 */
@JsonPropertyOrder(
    {
        OutboundMessagePayloadFrom.JSON_PROPERTY_PHONE_NUMBER,
        OutboundMessagePayloadFrom.JSON_PROPERTY_CARRIER,
        OutboundMessagePayloadFrom.JSON_PROPERTY_LINE_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class OutboundMessagePayloadFrom {

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public static final String JSON_PROPERTY_CARRIER = "carrier";
    private String carrier;

    /**
     * The line-type of the receiver.
     */
    public enum LineTypeEnum {
        WIRELINE(String.valueOf("Wireline")),

        WIRELESS(String.valueOf("Wireless")),

        VO_WI_FI(String.valueOf("VoWiFi")),

        VO_IP(String.valueOf("VoIP")),

        PRE_PAID_WIRELESS(String.valueOf("Pre-Paid Wireless")),

        EMPTY(String.valueOf(""));

        private String value;

        LineTypeEnum(String value) {
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
        public static LineTypeEnum fromValue(String value) {
            for (LineTypeEnum b : LineTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_LINE_TYPE = "line_type";
    private LineTypeEnum lineType;

    public OutboundMessagePayloadFrom() {}

    public OutboundMessagePayloadFrom phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code)."
    )
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

    public OutboundMessagePayloadFrom carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * The carrier of the receiver.
     * @return carrier
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The carrier of the receiver.")
    @JsonProperty(JSON_PROPERTY_CARRIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCarrier() {
        return carrier;
    }

    @JsonProperty(JSON_PROPERTY_CARRIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public OutboundMessagePayloadFrom lineType(LineTypeEnum lineType) {
        this.lineType = lineType;
        return this;
    }

    /**
     * The line-type of the receiver.
     * @return lineType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The line-type of the receiver.")
    @JsonProperty(JSON_PROPERTY_LINE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public LineTypeEnum getLineType() {
        return lineType;
    }

    @JsonProperty(JSON_PROPERTY_LINE_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLineType(LineTypeEnum lineType) {
        this.lineType = lineType;
    }

    /**
     * Return true if this OutboundMessagePayload_from object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutboundMessagePayloadFrom outboundMessagePayloadFrom =
            (OutboundMessagePayloadFrom) o;
        return (
            Objects.equals(
                this.phoneNumber,
                outboundMessagePayloadFrom.phoneNumber
            ) &&
            Objects.equals(this.carrier, outboundMessagePayloadFrom.carrier) &&
            Objects.equals(this.lineType, outboundMessagePayloadFrom.lineType)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber, carrier, lineType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutboundMessagePayloadFrom {\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb
            .append("    carrier: ")
            .append(toIndentedString(carrier))
            .append("\n");
        sb
            .append("    lineType: ")
            .append(toIndentedString(lineType))
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
