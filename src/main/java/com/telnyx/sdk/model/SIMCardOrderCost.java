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
 * An object representing the total cost of the order.
 */
@ApiModel(description = "An object representing the total cost of the order.")
@JsonPropertyOrder(
    {
        SIMCardOrderCost.JSON_PROPERTY_AMOUNT,
        SIMCardOrderCost.JSON_PROPERTY_CURRENCY,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCardOrderCost {

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private String amount;

    public static final String JSON_PROPERTY_CURRENCY = "currency";
    private String currency;

    public SIMCardOrderCost() {}

    public SIMCardOrderCost amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * A string representing the cost amount.
     * @return amount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "2.32",
        value = "A string representing the cost amount."
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

    public SIMCardOrderCost currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Filter by ISO 4217 currency string.
     * @return currency
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "USD",
        value = "Filter by ISO 4217 currency string."
    )
    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCurrency() {
        return currency;
    }

    @JsonProperty(JSON_PROPERTY_CURRENCY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Return true if this SIMCardOrder_cost object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardOrderCost siMCardOrderCost = (SIMCardOrderCost) o;
        return (
            Objects.equals(this.amount, siMCardOrderCost.amount) &&
            Objects.equals(this.currency, siMCardOrderCost.currency)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardOrderCost {\n");
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
