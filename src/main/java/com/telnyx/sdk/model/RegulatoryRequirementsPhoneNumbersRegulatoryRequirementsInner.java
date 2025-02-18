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
import com.telnyx.sdk.model.RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner
 */
@JsonPropertyOrder(
    {
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.JSON_PROPERTY_DESCRIPTION,
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.JSON_PROPERTY_ID,
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.JSON_PROPERTY_EXAMPLE,
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.JSON_PROPERTY_LABEL,
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.JSON_PROPERTY_FIELD_TYPE,
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.JSON_PROPERTY_ACCEPTANCE_CRITERIA,
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.JSON_PROPERTY_RECORD_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner {

    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    private String description;

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_EXAMPLE = "example";
    private String example;

    public static final String JSON_PROPERTY_LABEL = "label";
    private String label;

    public static final String JSON_PROPERTY_FIELD_TYPE = "field_type";
    private String fieldType;

    public static final String JSON_PROPERTY_ACCEPTANCE_CRITERIA =
        "acceptance_criteria";
    private RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria acceptanceCriteria;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner() {}

    @JsonCreator
    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner(
        @JsonProperty(JSON_PROPERTY_DESCRIPTION) String description,
        @JsonProperty(JSON_PROPERTY_ID) UUID id,
        @JsonProperty(JSON_PROPERTY_EXAMPLE) String example,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
    ) {
        this();
        this.description = description;
        this.id = id;
        this.example = example;
        this.recordType = recordType;
    }

    /**
     * Get description
     * @return description
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Address matching the DID area code (street, building number, postal code, city and country)",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDescription() {
        return description;
    }

    /**
     * Get id
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "12ade33a-21c0-473b-b055-b3c836e1c292",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    /**
     * Get example
     * @return example
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "600 Congress Avenue, 14th Floor, Austin, TX 78701",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_EXAMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExample() {
        return example;
    }

    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner label(
        String label
    ) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Address matching the DID area code",
        value = ""
    )
    @JsonProperty(JSON_PROPERTY_LABEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLabel() {
        return label;
    }

    @JsonProperty(JSON_PROPERTY_LABEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLabel(String label) {
        this.label = label;
    }

    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner fieldType(
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
    @ApiModelProperty(example = "address_id", value = "")
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

    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner acceptanceCriteria(
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria acceptanceCriteria
    ) {
        this.acceptanceCriteria = acceptanceCriteria;
        return this;
    }

    /**
     * Get acceptanceCriteria
     * @return acceptanceCriteria
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ACCEPTANCE_CRITERIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    @JsonProperty(JSON_PROPERTY_ACCEPTANCE_CRITERIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAcceptanceCriteria(
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInnerAcceptanceCriteria acceptanceCriteria
    ) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "regulatory_requirement", value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * Return true if this RegulatoryRequirementsPhoneNumbers_regulatory_requirements_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner =
            (RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner) o;
        return (
            Objects.equals(
                this.description,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.description
            ) &&
            Objects.equals(
                this.id,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.id
            ) &&
            Objects.equals(
                this.example,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.example
            ) &&
            Objects.equals(
                this.label,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.label
            ) &&
            Objects.equals(
                this.fieldType,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.fieldType
            ) &&
            Objects.equals(
                this.acceptanceCriteria,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.acceptanceCriteria
            ) &&
            Objects.equals(
                this.recordType,
                regulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner.recordType
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            description,
            id,
            example,
            label,
            fieldType,
            acceptanceCriteria,
            recordType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class RegulatoryRequirementsPhoneNumbersRegulatoryRequirementsInner {\n"
        );
        sb
            .append("    description: ")
            .append(toIndentedString(description))
            .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    example: ")
            .append(toIndentedString(example))
            .append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb
            .append("    fieldType: ")
            .append(toIndentedString(fieldType))
            .append("\n");
        sb
            .append("    acceptanceCriteria: ")
            .append(toIndentedString(acceptanceCriteria))
            .append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
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
