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
import com.telnyx.sdk.model.SubNumberOrderPhoneNumberRegulatoryRequirementsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * SubNumberOrderPhoneNumber
 */
@JsonPropertyOrder(
    {
        SubNumberOrderPhoneNumber.JSON_PROPERTY_ID,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_PHONE_NUMBER,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_COUNTRY_CODE,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_PHONE_NUMBER_TYPE,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_REQUIREMENTS_MET,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_REQUIREMENTS_STATUS,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_STATUS,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_RECORD_TYPE,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_BUNDLE_ID,
        SubNumberOrderPhoneNumber.JSON_PROPERTY_REGULATORY_REQUIREMENTS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SubNumberOrderPhoneNumber {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

    public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
    private String countryCode;

    public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE =
        "phone_number_type";
    private String phoneNumberType;

    public static final String JSON_PROPERTY_REQUIREMENTS_MET =
        "requirements_met";
    private Boolean requirementsMet;

    public static final String JSON_PROPERTY_REQUIREMENTS_STATUS =
        "requirements_status";
    private String requirementsStatus;

    public static final String JSON_PROPERTY_STATUS = "status";
    private String status;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public static final String JSON_PROPERTY_BUNDLE_ID = "bundle_id";
    private UUID bundleId;

    public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS =
        "regulatory_requirements";
    private List<
        SubNumberOrderPhoneNumberRegulatoryRequirementsInner
    > regulatoryRequirements = null;

    public SubNumberOrderPhoneNumber() {}

    public SubNumberOrderPhoneNumber id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(UUID id) {
        this.id = id;
    }

    public SubNumberOrderPhoneNumber phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Get phoneNumber
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SubNumberOrderPhoneNumber countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get countryCode
     * @return countryCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public SubNumberOrderPhoneNumber phoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
        return this;
    }

    /**
     * Get phoneNumberType
     * @return phoneNumberType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    public SubNumberOrderPhoneNumber requirementsMet(Boolean requirementsMet) {
        this.requirementsMet = requirementsMet;
        return this;
    }

    /**
     * Get requirementsMet
     * @return requirementsMet
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getRequirementsMet() {
        return requirementsMet;
    }

    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRequirementsMet(Boolean requirementsMet) {
        this.requirementsMet = requirementsMet;
    }

    public SubNumberOrderPhoneNumber requirementsStatus(
        String requirementsStatus
    ) {
        this.requirementsStatus = requirementsStatus;
        return this;
    }

    /**
     * Get requirementsStatus
     * @return requirementsStatus
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRequirementsStatus() {
        return requirementsStatus;
    }

    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRequirementsStatus(String requirementsStatus) {
        this.requirementsStatus = requirementsStatus;
    }

    public SubNumberOrderPhoneNumber status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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

    public SubNumberOrderPhoneNumber recordType(String recordType) {
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

    public SubNumberOrderPhoneNumber bundleId(UUID bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Get bundleId
     * @return bundleId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getBundleId() {
        return bundleId;
    }

    @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBundleId(UUID bundleId) {
        this.bundleId = bundleId;
    }

    public SubNumberOrderPhoneNumber regulatoryRequirements(
        List<
            SubNumberOrderPhoneNumberRegulatoryRequirementsInner
        > regulatoryRequirements
    ) {
        this.regulatoryRequirements = regulatoryRequirements;
        return this;
    }

    public SubNumberOrderPhoneNumber addregulatoryRequirementsItem(
        SubNumberOrderPhoneNumberRegulatoryRequirementsInner regulatoryRequirementsItem
    ) {
        if (this.regulatoryRequirements == null) {
            this.regulatoryRequirements = new ArrayList<>();
        }
        this.regulatoryRequirements.add(regulatoryRequirementsItem);
        return this;
    }

    /**
     * Get regulatoryRequirements
     * @return regulatoryRequirements
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<
        SubNumberOrderPhoneNumberRegulatoryRequirementsInner
    > getRegulatoryRequirements() {
        return regulatoryRequirements;
    }

    @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegulatoryRequirements(
        List<
            SubNumberOrderPhoneNumberRegulatoryRequirementsInner
        > regulatoryRequirements
    ) {
        this.regulatoryRequirements = regulatoryRequirements;
    }

    /**
     * Return true if this SubNumberOrderPhoneNumber object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubNumberOrderPhoneNumber subNumberOrderPhoneNumber =
            (SubNumberOrderPhoneNumber) o;
        return (
            Objects.equals(this.id, subNumberOrderPhoneNumber.id) &&
            Objects.equals(
                this.phoneNumber,
                subNumberOrderPhoneNumber.phoneNumber
            ) &&
            Objects.equals(
                this.countryCode,
                subNumberOrderPhoneNumber.countryCode
            ) &&
            Objects.equals(
                this.phoneNumberType,
                subNumberOrderPhoneNumber.phoneNumberType
            ) &&
            Objects.equals(
                this.requirementsMet,
                subNumberOrderPhoneNumber.requirementsMet
            ) &&
            Objects.equals(
                this.requirementsStatus,
                subNumberOrderPhoneNumber.requirementsStatus
            ) &&
            Objects.equals(this.status, subNumberOrderPhoneNumber.status) &&
            Objects.equals(
                this.recordType,
                subNumberOrderPhoneNumber.recordType
            ) &&
            Objects.equals(this.bundleId, subNumberOrderPhoneNumber.bundleId) &&
            Objects.equals(
                this.regulatoryRequirements,
                subNumberOrderPhoneNumber.regulatoryRequirements
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            phoneNumber,
            countryCode,
            phoneNumberType,
            requirementsMet,
            requirementsStatus,
            status,
            recordType,
            bundleId,
            regulatoryRequirements
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubNumberOrderPhoneNumber {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
        sb
            .append("    countryCode: ")
            .append(toIndentedString(countryCode))
            .append("\n");
        sb
            .append("    phoneNumberType: ")
            .append(toIndentedString(phoneNumberType))
            .append("\n");
        sb
            .append("    requirementsMet: ")
            .append(toIndentedString(requirementsMet))
            .append("\n");
        sb
            .append("    requirementsStatus: ")
            .append(toIndentedString(requirementsStatus))
            .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    bundleId: ")
            .append(toIndentedString(bundleId))
            .append("\n");
        sb
            .append("    regulatoryRequirements: ")
            .append(toIndentedString(regulatoryRequirements))
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
