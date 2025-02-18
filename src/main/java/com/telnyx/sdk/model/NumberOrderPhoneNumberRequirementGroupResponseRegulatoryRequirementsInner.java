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
 * NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner
 */
@JsonPropertyOrder(
    {
        NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner.JSON_PROPERTY_REQUIREMENT_ID,
        NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner.JSON_PROPERTY_FIELD_VALUE,
        NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner.JSON_PROPERTY_FIELD_TYPE,
        NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner.JSON_PROPERTY_STATUS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner {

    public static final String JSON_PROPERTY_REQUIREMENT_ID = "requirement_id";
    private UUID requirementId;

    public static final String JSON_PROPERTY_FIELD_VALUE = "field_value";
    private String fieldValue;

    public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
    private String fieldType;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner() {}

    public NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner requirementId(
        UUID requirementId
    ) {
        this.requirementId = requirementId;
        return this;
    }

    /**
     * Get requirementId
     * @return requirementId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REQUIREMENT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getRequirementId() {
        return requirementId;
    }

    @JsonProperty(JSON_PROPERTY_REQUIREMENT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRequirementId(UUID requirementId) {
        this.requirementId = requirementId;
    }

    public NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner fieldValue(
        String fieldValue
    ) {
        this.fieldValue = fieldValue;
        return this;
    }

    /**
     * Get fieldValue
     * @return fieldValue
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "1234567890", value = "")
    @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFieldValue() {
        return fieldValue;
    }

    @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner fieldType(
        String fieldType
    ) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * Get fieldType
     * @return fieldType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "textual", value = "")
    @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFieldType() {
        return fieldType;
    }

    @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner status(
        String status
    ) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "pending-approval", value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Return true if this NumberOrderPhoneNumberRequirementGroupResponse_regulatory_requirements_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner numberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner =
            (NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner) o;
        return (
            Objects.equals(
                this.requirementId,
                numberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner.requirementId
            ) &&
            Objects.equals(
                this.fieldValue,
                numberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner.fieldValue
            ) &&
            Objects.equals(
                this.fieldType,
                numberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner.fieldType
            ) &&
            Objects.equals(
                this.status,
                numberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner.status
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(requirementId, fieldValue, fieldType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class NumberOrderPhoneNumberRequirementGroupResponseRegulatoryRequirementsInner {\n"
        );
        sb
            .append("    requirementId: ")
            .append(toIndentedString(requirementId))
            .append("\n");
        sb
            .append("    fieldValue: ")
            .append(toIndentedString(fieldValue))
            .append("\n");
        sb
            .append("    fieldType: ")
            .append(toIndentedString(fieldType))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
