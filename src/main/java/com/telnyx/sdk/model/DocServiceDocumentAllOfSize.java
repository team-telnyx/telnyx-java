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
 * Indicates the document&#39;s filesize
 */
@ApiModel(description = "Indicates the document's filesize")
@JsonPropertyOrder(
    {
        DocServiceDocumentAllOfSize.JSON_PROPERTY_UNIT,
        DocServiceDocumentAllOfSize.JSON_PROPERTY_AMOUNT,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class DocServiceDocumentAllOfSize {

    public static final String JSON_PROPERTY_UNIT = "unit";
    private String unit;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private Integer amount;

    public DocServiceDocumentAllOfSize() {}

    @JsonCreator
    public DocServiceDocumentAllOfSize(
        @JsonProperty(JSON_PROPERTY_UNIT) String unit,
        @JsonProperty(JSON_PROPERTY_AMOUNT) Integer amount
    ) {
        this();
        this.unit = unit;
        this.amount = amount;
    }

    /**
     * Identifies the unit
     * @return unit
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "bytes", value = "Identifies the unit")
    @JsonProperty(JSON_PROPERTY_UNIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUnit() {
        return unit;
    }

    /**
     * The number of bytes
     * @return amount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "123456", value = "The number of bytes")
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Return true if this DocServiceDocument_allOf_size object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DocServiceDocumentAllOfSize docServiceDocumentAllOfSize =
            (DocServiceDocumentAllOfSize) o;
        return (
            Objects.equals(this.unit, docServiceDocumentAllOfSize.unit) &&
            Objects.equals(this.amount, docServiceDocumentAllOfSize.amount)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocServiceDocumentAllOfSize {\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
