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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ListTagsResponseDataInner
 */
@JsonPropertyOrder(
    {
        ListTagsResponseDataInner.JSON_PROPERTY_TAG,
        ListTagsResponseDataInner.JSON_PROPERTY_AMOUNT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class ListTagsResponseDataInner {

    public static final String JSON_PROPERTY_TAG = "tag";
    private String tag;

    public static final String JSON_PROPERTY_AMOUNT = "amount";
    private Integer amount;

    public ListTagsResponseDataInner() {}

    public ListTagsResponseDataInner tag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     * @return tag
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "a_tag", value = "")
    @JsonProperty(JSON_PROPERTY_TAG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTag() {
        return tag;
    }

    @JsonProperty(JSON_PROPERTY_TAG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListTagsResponseDataInner amount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     * @return amount
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "1", value = "")
    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty(JSON_PROPERTY_AMOUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Return true if this List_Tags_Response_data_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTagsResponseDataInner listTagsResponseDataInner =
            (ListTagsResponseDataInner) o;
        return (
            Objects.equals(this.tag, listTagsResponseDataInner.tag) &&
            Objects.equals(this.amount, listTagsResponseDataInner.amount)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagsResponseDataInner {\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
