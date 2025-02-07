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
 * PortingPhoneNumberBlockActivationRangesInner
 */
@JsonPropertyOrder(
    {
        PortingPhoneNumberBlockActivationRangesInner.JSON_PROPERTY_START_AT,
        PortingPhoneNumberBlockActivationRangesInner.JSON_PROPERTY_END_AT,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PortingPhoneNumberBlockActivationRangesInner {

    public static final String JSON_PROPERTY_START_AT = "start_at";
    private String startAt;

    public static final String JSON_PROPERTY_END_AT = "end_at";
    private String endAt;

    public PortingPhoneNumberBlockActivationRangesInner() {}

    public PortingPhoneNumberBlockActivationRangesInner startAt(
        String startAt
    ) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Specifies the start of the activation range. Must be greater or equal the start of the phone number range.
     * @return startAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+4930244999901",
        value = "Specifies the start of the activation range. Must be greater or equal the start of the phone number range."
    )
    @JsonProperty(JSON_PROPERTY_START_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStartAt() {
        return startAt;
    }

    @JsonProperty(JSON_PROPERTY_START_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public PortingPhoneNumberBlockActivationRangesInner endAt(String endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * Specifies the end of the activation range. It must be no more than the end of the phone number range.
     * @return endAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+4930244999910",
        value = "Specifies the end of the activation range. It must be no more than the end of the phone number range."
    )
    @JsonProperty(JSON_PROPERTY_END_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEndAt() {
        return endAt;
    }

    @JsonProperty(JSON_PROPERTY_END_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    /**
     * Return true if this PortingPhoneNumberBlock_activation_ranges_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortingPhoneNumberBlockActivationRangesInner portingPhoneNumberBlockActivationRangesInner =
            (PortingPhoneNumberBlockActivationRangesInner) o;
        return (
            Objects.equals(
                this.startAt,
                portingPhoneNumberBlockActivationRangesInner.startAt
            ) &&
            Objects.equals(
                this.endAt,
                portingPhoneNumberBlockActivationRangesInner.endAt
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(startAt, endAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortingPhoneNumberBlockActivationRangesInner {\n");
        sb
            .append("    startAt: ")
            .append(toIndentedString(startAt))
            .append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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
