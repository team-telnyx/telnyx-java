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
import com.telnyx.sdk.model.CreatePortingPhoneNumberBlockRequestActivationRangesInner;
import com.telnyx.sdk.model.CreatePortingPhoneNumberBlockRequestPhoneNumberRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * CreatePortingPhoneNumberBlockRequest
 */
@JsonPropertyOrder(
    {
        CreatePortingPhoneNumberBlockRequest.JSON_PROPERTY_PHONE_NUMBER_RANGE,
        CreatePortingPhoneNumberBlockRequest.JSON_PROPERTY_ACTIVATION_RANGES,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreatePortingPhoneNumberBlockRequest {

    public static final String JSON_PROPERTY_PHONE_NUMBER_RANGE =
        "phone_number_range";
    private CreatePortingPhoneNumberBlockRequestPhoneNumberRange phoneNumberRange;

    public static final String JSON_PROPERTY_ACTIVATION_RANGES =
        "activation_ranges";
    private List<
        CreatePortingPhoneNumberBlockRequestActivationRangesInner
    > activationRanges = new ArrayList<>();

    public CreatePortingPhoneNumberBlockRequest() {}

    public CreatePortingPhoneNumberBlockRequest phoneNumberRange(
        CreatePortingPhoneNumberBlockRequestPhoneNumberRange phoneNumberRange
    ) {
        this.phoneNumberRange = phoneNumberRange;
        return this;
    }

    /**
     * Get phoneNumberRange
     * @return phoneNumberRange
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_RANGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreatePortingPhoneNumberBlockRequestPhoneNumberRange getPhoneNumberRange() {
        return phoneNumberRange;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_RANGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPhoneNumberRange(
        CreatePortingPhoneNumberBlockRequestPhoneNumberRange phoneNumberRange
    ) {
        this.phoneNumberRange = phoneNumberRange;
    }

    public CreatePortingPhoneNumberBlockRequest activationRanges(
        List<
            CreatePortingPhoneNumberBlockRequestActivationRangesInner
        > activationRanges
    ) {
        this.activationRanges = activationRanges;
        return this;
    }

    public CreatePortingPhoneNumberBlockRequest addactivationRangesItem(
        CreatePortingPhoneNumberBlockRequestActivationRangesInner activationRangesItem
    ) {
        this.activationRanges.add(activationRangesItem);
        return this;
    }

    /**
     * Specifies the activation ranges for this porting phone number block. The activation range must be within the block range and should not overlap with other activation ranges.
     * @return activationRanges
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Specifies the activation ranges for this porting phone number block. The activation range must be within the block range and should not overlap with other activation ranges."
    )
    @JsonProperty(JSON_PROPERTY_ACTIVATION_RANGES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<
        CreatePortingPhoneNumberBlockRequestActivationRangesInner
    > getActivationRanges() {
        return activationRanges;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVATION_RANGES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setActivationRanges(
        List<
            CreatePortingPhoneNumberBlockRequestActivationRangesInner
        > activationRanges
    ) {
        this.activationRanges = activationRanges;
    }

    /**
     * Return true if this createPortingPhoneNumberBlock_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePortingPhoneNumberBlockRequest createPortingPhoneNumberBlockRequest =
            (CreatePortingPhoneNumberBlockRequest) o;
        return (
            Objects.equals(
                this.phoneNumberRange,
                createPortingPhoneNumberBlockRequest.phoneNumberRange
            ) &&
            Objects.equals(
                this.activationRanges,
                createPortingPhoneNumberBlockRequest.activationRanges
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumberRange, activationRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePortingPhoneNumberBlockRequest {\n");
        sb
            .append("    phoneNumberRange: ")
            .append(toIndentedString(phoneNumberRange))
            .append("\n");
        sb
            .append("    activationRanges: ")
            .append(toIndentedString(activationRanges))
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
