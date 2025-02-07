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
 * Upper limit on the amount of data the SIM cards, within the group, can use.
 */
@ApiModel(
    description = "Upper limit on the amount of data the SIM cards, within the group, can use."
)
@JsonPropertyOrder(
    {
        SearchedSIMCardGroupDataLimit.JSON_PROPERTY_AMOUNT,
        SearchedSIMCardGroupDataLimit.JSON_PROPERTY_UNIT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SearchedSIMCardGroupDataLimit {

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private BigDecimal amount;

    public static final String JSON_PROPERTY_UNIT = "unit";
    private String unit;

    public SearchedSIMCardGroupDataLimit() {}

    public SearchedSIMCardGroupDataLimit amount(BigDecimal amount) {
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

    public SearchedSIMCardGroupDataLimit unit(String unit) {
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
    public String getUnit() {
        return unit;
    }

    @JsonProperty(JSON_PROPERTY_UNIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Return true if this SearchedSIMCardGroup_data_limit object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchedSIMCardGroupDataLimit searchedSIMCardGroupDataLimit =
            (SearchedSIMCardGroupDataLimit) o;
        return (
            Objects.equals(this.amount, searchedSIMCardGroupDataLimit.amount) &&
            Objects.equals(this.unit, searchedSIMCardGroupDataLimit.unit)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchedSIMCardGroupDataLimit {\n");
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
