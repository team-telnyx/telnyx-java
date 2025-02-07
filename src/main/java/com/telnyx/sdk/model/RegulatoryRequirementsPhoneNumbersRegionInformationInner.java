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
 * RegulatoryRequirementsPhoneNumbersRegionInformationInner
 */
@JsonPropertyOrder(
    {
        RegulatoryRequirementsPhoneNumbersRegionInformationInner.JSON_PROPERTY_REGION_NAME,
        RegulatoryRequirementsPhoneNumbersRegionInformationInner.JSON_PROPERTY_REGION_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class RegulatoryRequirementsPhoneNumbersRegionInformationInner {

    public static final String JSON_PROPERTY_REGION_NAME = "region_name";
    private String regionName;

    public static final String JSON_PROPERTY_REGION_TYPE = "region_type";
    private String regionType;

    public RegulatoryRequirementsPhoneNumbersRegionInformationInner() {}

    public RegulatoryRequirementsPhoneNumbersRegionInformationInner regionName(
        String regionName
    ) {
        this.regionName = regionName;
        return this;
    }

    /**
     * Get regionName
     * @return regionName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "CH", value = "")
    @JsonProperty(JSON_PROPERTY_REGION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRegionName() {
        return regionName;
    }

    @JsonProperty(JSON_PROPERTY_REGION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public RegulatoryRequirementsPhoneNumbersRegionInformationInner regionType(
        String regionType
    ) {
        this.regionType = regionType;
        return this;
    }

    /**
     * Get regionType
     * @return regionType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "country_code", value = "")
    @JsonProperty(JSON_PROPERTY_REGION_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRegionType() {
        return regionType;
    }

    @JsonProperty(JSON_PROPERTY_REGION_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    /**
     * Return true if this RegulatoryRequirementsPhoneNumbers_region_information_inner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegulatoryRequirementsPhoneNumbersRegionInformationInner regulatoryRequirementsPhoneNumbersRegionInformationInner =
            (RegulatoryRequirementsPhoneNumbersRegionInformationInner) o;
        return (
            Objects.equals(
                this.regionName,
                regulatoryRequirementsPhoneNumbersRegionInformationInner.regionName
            ) &&
            Objects.equals(
                this.regionType,
                regulatoryRequirementsPhoneNumbersRegionInformationInner.regionType
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, regionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(
            "class RegulatoryRequirementsPhoneNumbersRegionInformationInner {\n"
        );
        sb
            .append("    regionName: ")
            .append(toIndentedString(regionName))
            .append("\n");
        sb
            .append("    regionType: ")
            .append(toIndentedString(regionType))
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
