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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Activation status
 */
public enum PortingOrderActivationStatus {
    NEW("New"),

    PENDING("Pending"),

    CONFLICT("Conflict"),

    CANCEL_PENDING("Cancel Pending"),

    FAILED("Failed"),

    CONCURRED("Concurred"),

    ACTIVATE_RDY("Activate RDY"),

    DISCONNECT_PENDING("Disconnect Pending"),

    CONCURRENCE_SENT("Concurrence Sent"),

    OLD("Old"),

    SENDING("Sending"),

    ACTIVE("Active"),

    CANCELLED("Cancelled");

    private String value;

    PortingOrderActivationStatus(String value) {
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
    public static PortingOrderActivationStatus fromValue(String value) {
        for (PortingOrderActivationStatus b : PortingOrderActivationStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
