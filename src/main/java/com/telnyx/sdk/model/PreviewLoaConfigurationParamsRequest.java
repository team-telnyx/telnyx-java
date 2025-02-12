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
import com.telnyx.sdk.model.PreviewLoaConfigurationParamsRequestAddress;
import com.telnyx.sdk.model.PreviewLoaConfigurationParamsRequestContact;
import com.telnyx.sdk.model.PreviewLoaConfigurationParamsRequestLogo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The parameters for creating a new LOA configuration.
 */
@ApiModel(description = "The parameters for creating a new LOA configuration.")
@JsonPropertyOrder(
    {
        PreviewLoaConfigurationParamsRequest.JSON_PROPERTY_NAME,
        PreviewLoaConfigurationParamsRequest.JSON_PROPERTY_LOGO,
        PreviewLoaConfigurationParamsRequest.JSON_PROPERTY_COMPANY_NAME,
        PreviewLoaConfigurationParamsRequest.JSON_PROPERTY_ADDRESS,
        PreviewLoaConfigurationParamsRequest.JSON_PROPERTY_CONTACT,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PreviewLoaConfigurationParamsRequest {

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_LOGO = "logo";
    private PreviewLoaConfigurationParamsRequestLogo logo;

    public static final String JSON_PROPERTY_COMPANY_NAME = "company_name";
    private String companyName;

    public static final String JSON_PROPERTY_ADDRESS = "address";
    private PreviewLoaConfigurationParamsRequestAddress address;

    public static final String JSON_PROPERTY_CONTACT = "contact";
    private PreviewLoaConfigurationParamsRequestContact contact;

    public PreviewLoaConfigurationParamsRequest() {}

    public PreviewLoaConfigurationParamsRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the LOA configuration
     * @return name
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "My LOA Configuration",
        required = true,
        value = "The name of the LOA configuration"
    )
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public PreviewLoaConfigurationParamsRequest logo(
        PreviewLoaConfigurationParamsRequestLogo logo
    ) {
        this.logo = logo;
        return this;
    }

    /**
     * Get logo
     * @return logo
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_LOGO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public PreviewLoaConfigurationParamsRequestLogo getLogo() {
        return logo;
    }

    @JsonProperty(JSON_PROPERTY_LOGO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLogo(PreviewLoaConfigurationParamsRequestLogo logo) {
        this.logo = logo;
    }

    public PreviewLoaConfigurationParamsRequest companyName(
        String companyName
    ) {
        this.companyName = companyName;
        return this;
    }

    /**
     * The name of the company
     * @return companyName
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "Telnyx",
        required = true,
        value = "The name of the company"
    )
    @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public PreviewLoaConfigurationParamsRequest address(
        PreviewLoaConfigurationParamsRequestAddress address
    ) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     * @return address
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public PreviewLoaConfigurationParamsRequestAddress getAddress() {
        return address;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAddress(
        PreviewLoaConfigurationParamsRequestAddress address
    ) {
        this.address = address;
    }

    public PreviewLoaConfigurationParamsRequest contact(
        PreviewLoaConfigurationParamsRequestContact contact
    ) {
        this.contact = contact;
        return this;
    }

    /**
     * Get contact
     * @return contact
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_CONTACT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public PreviewLoaConfigurationParamsRequestContact getContact() {
        return contact;
    }

    @JsonProperty(JSON_PROPERTY_CONTACT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setContact(
        PreviewLoaConfigurationParamsRequestContact contact
    ) {
        this.contact = contact;
    }

    /**
     * Return true if this PreviewLoaConfigurationParams_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreviewLoaConfigurationParamsRequest previewLoaConfigurationParamsRequest =
            (PreviewLoaConfigurationParamsRequest) o;
        return (
            Objects.equals(
                this.name,
                previewLoaConfigurationParamsRequest.name
            ) &&
            Objects.equals(
                this.logo,
                previewLoaConfigurationParamsRequest.logo
            ) &&
            Objects.equals(
                this.companyName,
                previewLoaConfigurationParamsRequest.companyName
            ) &&
            Objects.equals(
                this.address,
                previewLoaConfigurationParamsRequest.address
            ) &&
            Objects.equals(
                this.contact,
                previewLoaConfigurationParamsRequest.contact
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, logo, companyName, address, contact);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewLoaConfigurationParamsRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb
            .append("    companyName: ")
            .append(toIndentedString(companyName))
            .append("\n");
        sb
            .append("    address: ")
            .append(toIndentedString(address))
            .append("\n");
        sb
            .append("    contact: ")
            .append(toIndentedString(contact))
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
