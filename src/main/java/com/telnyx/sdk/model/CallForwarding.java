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
 * The call forwarding settings for a phone number.
 */
@ApiModel(description = "The call forwarding settings for a phone number.")
@JsonPropertyOrder(
    {
        CallForwarding.JSON_PROPERTY_CALL_FORWARDING_ENABLED,
        CallForwarding.JSON_PROPERTY_FORWARDS_TO,
        CallForwarding.JSON_PROPERTY_FORWARDING_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallForwarding {

    public static final String JSON_PROPERTY_CALL_FORWARDING_ENABLED =
        "call_forwarding_enabled";
    private Boolean callForwardingEnabled = true;

    public static final String JSON_PROPERTY_FORWARDS_TO = "forwards_to";
    private String forwardsTo;

    /**
     * Call forwarding type. &#39;forwards_to&#39; must be set for this to have an effect.
     */
    public enum ForwardingTypeEnum {
        ALWAYS(String.valueOf("always")),

        ON_FAILURE(String.valueOf("on_failure"));

        private String value;

        ForwardingTypeEnum(String value) {
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
        public static ForwardingTypeEnum fromValue(String value) {
            for (ForwardingTypeEnum b : ForwardingTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_FORWARDING_TYPE =
        "forwarding_type";
    private ForwardingTypeEnum forwardingType;

    public CallForwarding() {}

    public CallForwarding callForwardingEnabled(Boolean callForwardingEnabled) {
        this.callForwardingEnabled = callForwardingEnabled;
        return this;
    }

    /**
     * Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints.
     * @return callForwardingEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Indicates if call forwarding will be enabled for this number if forwards_to and forwarding_type are filled in. Defaults to true for backwards compatibility with APIV1 use of numbers endpoints."
    )
    @JsonProperty(JSON_PROPERTY_CALL_FORWARDING_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getCallForwardingEnabled() {
        return callForwardingEnabled;
    }

    @JsonProperty(JSON_PROPERTY_CALL_FORWARDING_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallForwardingEnabled(Boolean callForwardingEnabled) {
        this.callForwardingEnabled = callForwardingEnabled;
    }

    public CallForwarding forwardsTo(String forwardsTo) {
        this.forwardsTo = forwardsTo;
        return this;
    }

    /**
     * The phone number to which inbound calls to this number are forwarded. Inbound calls will not be forwarded if this field is left blank. If set, must be a +E.164-formatted phone number.
     * @return forwardsTo
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The phone number to which inbound calls to this number are forwarded. Inbound calls will not be forwarded if this field is left blank. If set, must be a +E.164-formatted phone number."
    )
    @JsonProperty(JSON_PROPERTY_FORWARDS_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getForwardsTo() {
        return forwardsTo;
    }

    @JsonProperty(JSON_PROPERTY_FORWARDS_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setForwardsTo(String forwardsTo) {
        this.forwardsTo = forwardsTo;
    }

    public CallForwarding forwardingType(ForwardingTypeEnum forwardingType) {
        this.forwardingType = forwardingType;
        return this;
    }

    /**
     * Call forwarding type. &#39;forwards_to&#39; must be set for this to have an effect.
     * @return forwardingType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "always",
        value = "Call forwarding type. 'forwards_to' must be set for this to have an effect."
    )
    @JsonProperty(JSON_PROPERTY_FORWARDING_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ForwardingTypeEnum getForwardingType() {
        return forwardingType;
    }

    @JsonProperty(JSON_PROPERTY_FORWARDING_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setForwardingType(ForwardingTypeEnum forwardingType) {
        this.forwardingType = forwardingType;
    }

    /**
     * Return true if this CallForwarding object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallForwarding callForwarding = (CallForwarding) o;
        return (
            Objects.equals(
                this.callForwardingEnabled,
                callForwarding.callForwardingEnabled
            ) &&
            Objects.equals(this.forwardsTo, callForwarding.forwardsTo) &&
            Objects.equals(this.forwardingType, callForwarding.forwardingType)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(callForwardingEnabled, forwardsTo, forwardingType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallForwarding {\n");
        sb
            .append("    callForwardingEnabled: ")
            .append(toIndentedString(callForwardingEnabled))
            .append("\n");
        sb
            .append("    forwardsTo: ")
            .append(toIndentedString(forwardsTo))
            .append("\n");
        sb
            .append("    forwardingType: ")
            .append(toIndentedString(forwardingType))
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
