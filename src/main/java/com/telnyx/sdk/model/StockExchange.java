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
 * (Required for public company) stock exchange.
 */
public enum StockExchange {
    NONE("NONE"),

    NASDAQ("NASDAQ"),

    NYSE("NYSE"),

    AMEX("AMEX"),

    AMX("AMX"),

    ASX("ASX"),

    B3("B3"),

    BME("BME"),

    BSE("BSE"),

    FRA("FRA"),

    ICEX("ICEX"),

    JPX("JPX"),

    JSE("JSE"),

    KRX("KRX"),

    LON("LON"),

    NSE("NSE"),

    OMX("OMX"),

    SEHK("SEHK"),

    SSE("SSE"),

    STO("STO"),

    SWX("SWX"),

    SZSE("SZSE"),

    TSX("TSX"),

    TWSE("TWSE"),

    VSE("VSE");

    private String value;

    StockExchange(String value) {
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
    public static StockExchange fromValue(String value) {
        for (StockExchange b : StockExchange.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
