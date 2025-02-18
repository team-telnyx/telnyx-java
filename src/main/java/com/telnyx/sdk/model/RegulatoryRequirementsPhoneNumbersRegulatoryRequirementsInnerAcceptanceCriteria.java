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
 * RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria
 */
@JsonPropertyOrder(
    {
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria.JSON_PROPERTY_LOCALITY_LIMIT,
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria.JSON_PROPERTY_FIELD_VALUE,
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria.JSON_PROPERTY_FIELD_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria {

    public static final String JSON_PROPERTY_LOCALITY_LIMIT = "locality_limit";
    private String localityLimit;

    public static final String JSON_PROPERTY_FIELD_VALUE = "field_value";
    private String fieldValue;

    public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
    private String fieldType;

    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria() {}

    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria localityLimit(
        String localityLimit
    ) {
        this.localityLimit = localityLimit;
        return this;
    }

    /**
     * Get localityLimit
     * @return localityLimit
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Identical locality as the numbers desired",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_LOCALITY_LIMIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLocalityLimit() {
        return localityLimit;
    }

    @JsonProperty(JSON_PROPERTY_LOCALITY_LIMIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocalityLimit(String localityLimit) {
        this.localityLimit = localityLimit;
    }

    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria fieldValue(
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
    @ApiModelProperty(
        example = "45f45a04-b4be-4592-95b1-9306b9db2b21",
        value = ""
    )
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

    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria fieldType(
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
    @ApiModelProperty(example = "address", value = "")
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
     * Return true if this RegulatoryRequirementsPhoneNumbers_regulatory_requirements_inner_acceptance_criteria object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria =
            (RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria) o;
        return (
            Objects.equals(
                this.localityLimit,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria.localityLimit
            ) &&
            Objects.equals(
                this.fieldValue,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria.fieldValue
            ) &&
            Objects.equals(
                this.fieldType,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria.fieldType
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(localityLimit, fieldValue, fieldType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria {\n"
        );
        sb
            .append("    localityLimit: ")
            .append(toIndentedString(localityLimit))
            .append("\n");
        sb
            .append("    fieldValue: ")
            .append(toIndentedString(fieldValue))
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
