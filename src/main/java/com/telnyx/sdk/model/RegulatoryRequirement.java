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
 * RegulatoryRequirement
 */
@JsonPropertyOrder(
    {
        RegulatoryRequirement.JSON_PROPERTY_RECORD_TYPE,
        RegulatoryRequirement.JSON_PROPERTY_REQUIREMENT_ID,
        RegulatoryRequirement.JSON_PROPERTY_FIELD_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RegulatoryRequirement {

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_REQUIREMENT_ID = "requirement_id";
    private UUID requirementId;

    public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
    private String fieldType;

    public RegulatoryRequirement() {}

    public RegulatoryRequirement recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public RegulatoryRequirement requirementId(UUID requirementId) {
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

    public RegulatoryRequirement fieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * Get fieldType
     * @return fieldType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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

    /**
     * Return true if this RegulatoryRequirement object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegulatoryRequirement regulatoryRequirement = (RegulatoryRequirement) o;
        return (
            Objects.equals(this.recordType, regulatoryRequirement.recordType) &&
            Objects.equals(
                this.requirementId,
                regulatoryRequirement.requirementId
            ) &&
            Objects.equals(this.fieldType, regulatoryRequirement.fieldType)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordType, requirementId, fieldType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegulatoryRequirement {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    requirementId: ")
            .append(toIndentedString(requirementId))
            .append("\n");
        sb
            .append("    fieldType: ")
            .append(toIndentedString(fieldType))
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
