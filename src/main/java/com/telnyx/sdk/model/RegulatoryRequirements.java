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
import com.telnyx.sdk.model.RegulatoryRequirementsRegulatoryRequirementsInner;
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
 * RegulatoryRequirements
 */
@JsonPropertyOrder(
    {
        RegulatoryRequirements.JSON_PROPERTY_COUNTRY_CODE,
        RegulatoryRequirements.JSON_PROPERTY_PHONE_NUMBER_TYPE,
        RegulatoryRequirements.JSON_PROPERTY_ACTION,
        RegulatoryRequirements.JSON_PROPERTY_REGULATORY_REQUIREMENTS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RegulatoryRequirements {

    public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
    private String countryCode;

    public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE =
        "phone_number_type";
    private String phoneNumberType;

    public static final String JSON_PROPERTY_ACTION = "action";
    private String action;

    public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS =
        "regulatory_requirements";
    private List<
        RegulatoryRequirementsRegulatoryRequirementsInner
    > regulatoryRequirements = null;

    public RegulatoryRequirements() {}

    @JsonCreator
    public RegulatoryRequirements(
        @JsonProperty(JSON_PROPERTY_COUNTRY_CODE) String countryCode,
        @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE) String phoneNumberType,
        @JsonProperty(JSON_PROPERTY_ACTION) String action
    ) {
        this();
        this.countryCode = countryCode;
        this.phoneNumberType = phoneNumberType;
        this.action = action;
    }

    /**
     * Get countryCode
     * @return countryCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "DE", value = "")
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Get phoneNumberType
     * @return phoneNumberType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "local", value = "")
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPhoneNumberType() {
        return phoneNumberType;
    }

    /**
     * Get action
     * @return action
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "ordering", value = "")
    @JsonProperty(JSON_PROPERTY_ACTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAction() {
        return action;
    }

    public RegulatoryRequirements regulatoryRequirements(
        List<
            RegulatoryRequirementsRegulatoryRequirementsInner
        > regulatoryRequirements
    ) {
        this.regulatoryRequirements = regulatoryRequirements;
        return this;
    }

    public RegulatoryRequirements addregulatoryRequirementsItem(
        RegulatoryRequirementsRegulatoryRequirementsInner regulatoryRequirementsItem
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
        RegulatoryRequirementsRegulatoryRequirementsInner
    > getRegulatoryRequirements() {
        return regulatoryRequirements;
    }

    @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegulatoryRequirements(
        List<
            RegulatoryRequirementsRegulatoryRequirementsInner
        > regulatoryRequirements
    ) {
        this.regulatoryRequirements = regulatoryRequirements;
    }

    /**
     * Return true if this RegulatoryRequirements object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegulatoryRequirements regulatoryRequirements =
            (RegulatoryRequirements) o;
        return (
            Objects.equals(
                this.countryCode,
                regulatoryRequirements.countryCode
            ) &&
            Objects.equals(
                this.phoneNumberType,
                regulatoryRequirements.phoneNumberType
            ) &&
            Objects.equals(this.action, regulatoryRequirements.action) &&
            Objects.equals(
                this.regulatoryRequirements,
                regulatoryRequirements.regulatoryRequirements
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            countryCode,
            phoneNumberType,
            action,
            regulatoryRequirements
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegulatoryRequirements {\n");
        sb
            .append("    countryCode: ")
            .append(toIndentedString(countryCode))
            .append("\n");
        sb
            .append("    phoneNumberType: ")
            .append(toIndentedString(phoneNumberType))
            .append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
