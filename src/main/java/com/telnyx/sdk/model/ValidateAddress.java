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
 * ValidateAddress
 */
@JsonPropertyOrder(
    {
        ValidateAddress.JSON_PROPERTY_STREET_ADDRESS,
        ValidateAddress.JSON_PROPERTY_EXTENDED_ADDRESS,
        ValidateAddress.JSON_PROPERTY_LOCALITY,
        ValidateAddress.JSON_PROPERTY_ADMINISTRATIVE_AREA,
        ValidateAddress.JSON_PROPERTY_POSTAL_CODE,
        ValidateAddress.JSON_PROPERTY_COUNTRY_CODE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ValidateAddress {

    public static final String JSON_PROPERTY_STREET_ADDRESS = "street_address";
    private String streetAddress;

    public static final String JSON_PROPERTY_EXTENDED_ADDRESS =
        "extended_address";
    private String extendedAddress;

    public static final String JSON_PROPERTY_LOCALITY = "locality";
    private String locality;

    public static final String JSON_PROPERTY_ADMINISTRATIVE_AREA =
        "administrative_area";
    private String administrativeArea;

    public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
    private String postalCode;

    public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
    private String countryCode;

    public ValidateAddress() {}

    public ValidateAddress streetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    /**
     * The primary street address information about the address.
     * @return streetAddress
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "600 Congress Avenue",
        value = "The primary street address information about the address."
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

    public ValidateAddress extendedAddress(String extendedAddress) {
        this.extendedAddress = extendedAddress;
        return this;
    }

    /**
     * Additional street address information about the address such as, but not limited to, unit number or apartment number.
     * @return extendedAddress
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "14th Floor",
        value = "Additional street address information about the address such as, but not limited to, unit number or apartment number."
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

    public ValidateAddress locality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * The locality of the address. For US addresses, this corresponds to the city of the address.
     * @return locality
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Austin",
        value = "The locality of the address. For US addresses, this corresponds to the city of the address."
    )
    @JsonProperty(JSON_PROPERTY_LOCALITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLocality() {
        return locality;
    }

    @JsonProperty(JSON_PROPERTY_LOCALITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public ValidateAddress administrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
        return this;
    }

    /**
     * The locality of the address. For US addresses, this corresponds to the state of the address.
     * @return administrativeArea
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "TX",
        value = "The locality of the address. For US addresses, this corresponds to the state of the address."
    )
    @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAdministrativeArea() {
        return administrativeArea;
    }

    @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public ValidateAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * The postal code of the address.
     * @return postalCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "78701",
        value = "The postal code of the address."
    )
    @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public ValidateAddress countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The two-character (ISO 3166-1 alpha-2) country code of the address.
     * @return countryCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "US",
        value = "The two-character (ISO 3166-1 alpha-2) country code of the address."
    )
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
     * Return true if this ValidateAddress object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidateAddress validateAddress = (ValidateAddress) o;
        return (
            Objects.equals(this.streetAddress, validateAddress.streetAddress) &&
            Objects.equals(
                this.extendedAddress,
                validateAddress.extendedAddress
            ) &&
            Objects.equals(this.locality, validateAddress.locality) &&
            Objects.equals(
                this.administrativeArea,
                validateAddress.administrativeArea
            ) &&
            Objects.equals(this.postalCode, validateAddress.postalCode) &&
            Objects.equals(this.countryCode, validateAddress.countryCode)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            streetAddress,
            extendedAddress,
            locality,
            administrativeArea,
            postalCode,
            countryCode
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateAddress {\n");
        sb
            .append("    streetAddress: ")
            .append(toIndentedString(streetAddress))
            .append("\n");
        sb
            .append("    extendedAddress: ")
            .append(toIndentedString(extendedAddress))
            .append("\n");
        sb
            .append("    locality: ")
            .append(toIndentedString(locality))
            .append("\n");
        sb
            .append("    administrativeArea: ")
            .append(toIndentedString(administrativeArea))
            .append("\n");
        sb
            .append("    postalCode: ")
            .append(toIndentedString(postalCode))
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
