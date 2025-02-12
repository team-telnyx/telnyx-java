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
import java.util.UUID;

/**
 * UpdateNumberOrderPhoneNumberRequirementGroupRequest
 */
@JsonPropertyOrder(
    {
        UpdateNumberOrderPhoneNumberRequirementGroupRequest.JSON_PROPERTY_REQUIREMENT_GROUP_ID,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdateNumberOrderPhoneNumberRequirementGroupRequest {

    public static final String JSON_PROPERTY_REQUIREMENT_GROUP_ID =
        "requirement_group_id";
    private UUID requirementGroupId;

    public UpdateNumberOrderPhoneNumberRequirementGroupRequest() {}

    public UpdateNumberOrderPhoneNumberRequirementGroupRequest requirementGroupId(
        UUID requirementGroupId
    ) {
        this.requirementGroupId = requirementGroupId;
        return this;
    }

    /**
     * The ID of the requirement group to associate
     * @return requirementGroupId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "The ID of the requirement group to associate"
    )
    @JsonProperty(JSON_PROPERTY_REQUIREMENT_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getRequirementGroupId() {
        return requirementGroupId;
    }

    @JsonProperty(JSON_PROPERTY_REQUIREMENT_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRequirementGroupId(UUID requirementGroupId) {
        this.requirementGroupId = requirementGroupId;
    }

    /**
     * Return true if this updateNumberOrderPhoneNumberRequirementGroup_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNumberOrderPhoneNumberRequirementGroupRequest updateNumberOrderPhoneNumberRequirementGroupRequest =
            (UpdateNumberOrderPhoneNumberRequirementGroupRequest) o;
        return Objects.equals(
            this.requirementGroupId,
            updateNumberOrderPhoneNumberRequirementGroupRequest.requirementGroupId
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(requirementGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class UpdateNumberOrderPhoneNumberRequirementGroupRequest {\n"
        );
        sb
            .append("    requirementGroupId: ")
            .append(toIndentedString(requirementGroupId))
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
