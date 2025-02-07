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
 * WirelessCost
 */
@JsonPropertyOrder(
    { WirelessCost.JSON_PROPERTY_AMOUNT, WirelessCost.JSON_PROPERTY_CURRENCY }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class WirelessCost {

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private String amount;

    /**
     * Currency of the rate and cost
     */
    public enum CurrencyEnum {
        AUD(String.valueOf("AUD")),

        CAD(String.valueOf("CAD")),

        EUR(String.valueOf("EUR")),

        GBP(String.valueOf("GBP")),

        USD(String.valueOf("USD"));

        private String value;

        CurrencyEnum(String value) {
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
        public static CurrencyEnum fromValue(String value) {
            for (CurrencyEnum b : CurrencyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_CURRENCY = "currency";
    private CurrencyEnum currency;

    public WirelessCost() {}

    public WirelessCost amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Final cost. Cost is calculated as rate * unit
     * @return amount
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0.1",
        value = "Final cost. Cost is calculated as rate * unit"
    )
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAmount() {
        return amount;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public WirelessCost currency(CurrencyEnum currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Currency of the rate and cost
     * @return currency
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "USD", value = "Currency of the rate and cost")
    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CurrencyEnum getCurrency() {
        return currency;
    }

    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    /**
     * Return true if this WirelessCost object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WirelessCost wirelessCost = (WirelessCost) o;
        return (
            Objects.equals(this.amount, wirelessCost.amount) &&
            Objects.equals(this.currency, wirelessCost.currency)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WirelessCost {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb
            .append("    currency: ")
            .append(toIndentedString(currency))
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
