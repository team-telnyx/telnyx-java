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
 * The SIM card individual data limit configuration.
 */
@ApiModel(description = "The SIM card individual data limit configuration.")
@JsonPropertyOrder(
    {
        SIMCardDataLimit.JSON_PROPERTY_AMOUNT,
        SIMCardDataLimit.JSON_PROPERTY_UNIT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCardDataLimit {

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private BigDecimal amount;

    /**
     * Gets or Sets unit
     */
    public enum UnitEnum {
        MB(String.valueOf("MB")),

        GB(String.valueOf("GB"));

        private String value;

        UnitEnum(String value) {
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
        public static UnitEnum fromValue(String value) {
            for (UnitEnum b : UnitEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_UNIT = "unit";
    private UnitEnum unit;

    public SIMCardDataLimit() {}

    public SIMCardDataLimit amount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     * @return amount
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "2048.1", value = "")
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public SIMCardDataLimit unit(UnitEnum unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     * @return unit
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "MB", value = "")
    @JsonProperty(JSON_PROPERTY_UNIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UnitEnum getUnit() {
        return unit;
    }

    @JsonProperty(JSON_PROPERTY_UNIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    /**
     * Return true if this SIMCard_data_limit object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardDataLimit siMCardDataLimit = (SIMCardDataLimit) o;
        return (
            Objects.equals(this.amount, siMCardDataLimit.amount) &&
            Objects.equals(this.unit, siMCardDataLimit.unit)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardDataLimit {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
