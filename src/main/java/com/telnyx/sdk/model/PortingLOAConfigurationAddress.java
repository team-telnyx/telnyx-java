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
 * The address of the company.
 */
@ApiModel(description = "The address of the company.")
@JsonPropertyOrder(
    {
        PortingLOAConfigurationAddress.JSON_PROPERTY_STREET_ADDRESS,
        PortingLOAConfigurationAddress.JSON_PROPERTY_EXTENDED_ADDRESS,
        PortingLOAConfigurationAddress.JSON_PROPERTY_CITY,
        PortingLOAConfigurationAddress.JSON_PROPERTY_STATE,
        PortingLOAConfigurationAddress.JSON_PROPERTY_ZIP_CODE,
        PortingLOAConfigurationAddress.JSON_PROPERTY_COUNTRY_CODE,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PortingLOAConfigurationAddress {

    public static final String JSON_PROPERTY_STREET_ADDRESS = "street_address";
    private String streetAddress;

    public static final String JSON_PROPERTY_EXTENDED_ADDRESS =
        "extended_address";
    private String extendedAddress;

    public static final String JSON_PROPERTY_CITY = "city";
    private String city;

    public static final String JSON_PROPERTY_STATE = "state";
    private String state;

    public static final String JSON_PROPERTY_ZIP_CODE = "zip_code";
    private String zipCode;

    public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
    private String countryCode;

    public PortingLOAConfigurationAddress() {}

    public PortingLOAConfigurationAddress streetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    /**
     * The street address of the company
     * @return streetAddress
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "600 Congress Avenue",
        value = "The street address of the company"
    )
    @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStreetAddress() {
        return streetAddress;
    }

    @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public PortingLOAConfigurationAddress extendedAddress(
        String extendedAddress
    ) {
        this.extendedAddress = extendedAddress;
        return this;
    }

    /**
     * The extended address of the company
     * @return extendedAddress
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "14th Floor",
        value = "The extended address of the company"
    )
    @JsonProperty(JSON_PROPERTY_EXTENDED_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExtendedAddress() {
        return extendedAddress;
    }

    @JsonProperty(JSON_PROPERTY_EXTENDED_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExtendedAddress(String extendedAddress) {
        this.extendedAddress = extendedAddress;
    }

    public PortingLOAConfigurationAddress city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The locality of the company
     * @return city
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "Austin", value = "The locality of the company")
    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCity() {
        return city;
    }

    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCity(String city) {
        this.city = city;
    }

    public PortingLOAConfigurationAddress state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The administrative area of the company
     * @return state
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "TX",
        value = "The administrative area of the company"
    )
    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getState() {
        return state;
    }

    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setState(String state) {
        this.state = state;
    }

    public PortingLOAConfigurationAddress zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    /**
     * The postal code of the company
     * @return zipCode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "78701",
        value = "The postal code of the company"
    )
    @JsonProperty(JSON_PROPERTY_ZIP_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getZipCode() {
        return zipCode;
    }

    @JsonProperty(JSON_PROPERTY_ZIP_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public PortingLOAConfigurationAddress countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The country code of the company
     * @return countryCode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "US", value = "The country code of the company")
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

    /**
     * Return true if this PortingLOAConfiguration_address object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortingLOAConfigurationAddress portingLOAConfigurationAddress =
            (PortingLOAConfigurationAddress) o;
        return (
            Objects.equals(
                this.streetAddress,
                portingLOAConfigurationAddress.streetAddress
            ) &&
            Objects.equals(
                this.extendedAddress,
                portingLOAConfigurationAddress.extendedAddress
            ) &&
            Objects.equals(this.city, portingLOAConfigurationAddress.city) &&
            Objects.equals(this.state, portingLOAConfigurationAddress.state) &&
            Objects.equals(
                this.zipCode,
                portingLOAConfigurationAddress.zipCode
            ) &&
            Objects.equals(
                this.countryCode,
                portingLOAConfigurationAddress.countryCode
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            streetAddress,
            extendedAddress,
            city,
            state,
            zipCode,
            countryCode
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortingLOAConfigurationAddress {\n");
        sb
            .append("    streetAddress: ")
            .append(toIndentedString(streetAddress))
            .append("\n");
        sb
            .append("    extendedAddress: ")
            .append(toIndentedString(extendedAddress))
            .append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb
            .append("    zipCode: ")
            .append(toIndentedString(zipCode))
            .append("\n");
        sb
            .append("    countryCode: ")
            .append(toIndentedString(countryCode))
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
