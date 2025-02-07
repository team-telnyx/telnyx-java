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
 * UserAddressCreate
 */
@JsonPropertyOrder(
    {
        UserAddressCreate.JSON_PROPERTY_CUSTOMER_REFERENCE,
        UserAddressCreate.JSON_PROPERTY_FIRST_NAME,
        UserAddressCreate.JSON_PROPERTY_LAST_NAME,
        UserAddressCreate.JSON_PROPERTY_BUSINESS_NAME,
        UserAddressCreate.JSON_PROPERTY_PHONE_NUMBER,
        UserAddressCreate.JSON_PROPERTY_STREET_ADDRESS,
        UserAddressCreate.JSON_PROPERTY_EXTENDED_ADDRESS,
        UserAddressCreate.JSON_PROPERTY_LOCALITY,
        UserAddressCreate.JSON_PROPERTY_ADMINISTRATIVE_AREA,
        UserAddressCreate.JSON_PROPERTY_NEIGHBORHOOD,
        UserAddressCreate.JSON_PROPERTY_BOROUGH,
        UserAddressCreate.JSON_PROPERTY_POSTAL_CODE,
        UserAddressCreate.JSON_PROPERTY_COUNTRY_CODE,
        UserAddressCreate.JSON_PROPERTY_SKIP_ADDRESS_VERIFICATION,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UserAddressCreate {

    public static final String JSON_PROPERTY_CUSTOMER_REFERENCE =
        "customer_reference";
    private String customerReference;

    public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
    private String firstName;

    public static final String JSON_PROPERTY_LAST_NAME = "last_name";
    private String lastName;

    public static final String JSON_PROPERTY_BUSINESS_NAME = "business_name";
    private String businessName;

    public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
    private String phoneNumber;

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

    public static final String JSON_PROPERTY_NEIGHBORHOOD = "neighborhood";
    private String neighborhood;

    public static final String JSON_PROPERTY_BOROUGH = "borough";
    private String borough;

    public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
    private String postalCode;

    public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
    private String countryCode;

    public static final String JSON_PROPERTY_SKIP_ADDRESS_VERIFICATION =
        "skip_address_verification";
    private String skipAddressVerification = "false";

    public UserAddressCreate() {}

    public UserAddressCreate customerReference(String customerReference) {
        this.customerReference = customerReference;
        return this;
    }

    /**
     * A customer reference string for customer look ups.
     * @return customerReference
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "MY REF 001",
        value = "A customer reference string for customer look ups."
    )
    @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCustomerReference() {
        return customerReference;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    public UserAddressCreate firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * The first name associated with the address. An address must have either a first last name or a business name.
     * @return firstName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Alfred",
        required = true,
        value = "The first name associated with the address. An address must have either a first last name or a business name."
    )
    @JsonProperty(JSON_PROPERTY_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty(JSON_PROPERTY_FIRST_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserAddressCreate lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * The last name associated with the address. An address must have either a first last name or a business name.
     * @return lastName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Foster",
        required = true,
        value = "The last name associated with the address. An address must have either a first last name or a business name."
    )
    @JsonProperty(JSON_PROPERTY_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getLastName() {
        return lastName;
    }

    @JsonProperty(JSON_PROPERTY_LAST_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserAddressCreate businessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    /**
     * The business name associated with the address. An address must have either a first last name or a business name.
     * @return businessName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Toy-O'Kon",
        required = true,
        value = "The business name associated with the address. An address must have either a first last name or a business name."
    )
    @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getBusinessName() {
        return businessName;
    }

    @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public UserAddressCreate phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * The phone number associated with the address.
     * @return phoneNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+12125559000",
        value = "The phone number associated with the address."
    )
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

    public UserAddressCreate streetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    /**
     * The primary street address information about the address.
     * @return streetAddress
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "600 Congress Avenue",
        required = true,
        value = "The primary street address information about the address."
    )
    @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getStreetAddress() {
        return streetAddress;
    }

    @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public UserAddressCreate extendedAddress(String extendedAddress) {
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

    public UserAddressCreate locality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * The locality of the address. For US addresses, this corresponds to the city of the address.
     * @return locality
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Austin",
        required = true,
        value = "The locality of the address. For US addresses, this corresponds to the city of the address."
    )
    @JsonProperty(JSON_PROPERTY_LOCALITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getLocality() {
        return locality;
    }

    @JsonProperty(JSON_PROPERTY_LOCALITY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLocality(String locality) {
        this.locality = locality;
    }

    public UserAddressCreate administrativeArea(String administrativeArea) {
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

    public UserAddressCreate neighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    /**
     * The neighborhood of the address. This field is not used for addresses in the US but is used for some international addresses.
     * @return neighborhood
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Ciudad de los deportes",
        value = "The neighborhood of the address. This field is not used for addresses in the US but is used for some international addresses."
    )
    @JsonProperty(JSON_PROPERTY_NEIGHBORHOOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getNeighborhood() {
        return neighborhood;
    }

    @JsonProperty(JSON_PROPERTY_NEIGHBORHOOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public UserAddressCreate borough(String borough) {
        this.borough = borough;
        return this;
    }

    /**
     * The borough of the address. This field is not used for addresses in the US but is used for some international addresses.
     * @return borough
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Guadalajara",
        value = "The borough of the address. This field is not used for addresses in the US but is used for some international addresses."
    )
    @JsonProperty(JSON_PROPERTY_BOROUGH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getBorough() {
        return borough;
    }

    @JsonProperty(JSON_PROPERTY_BOROUGH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBorough(String borough) {
        this.borough = borough;
    }

    public UserAddressCreate postalCode(String postalCode) {
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

    public UserAddressCreate countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The two-character (ISO 3166-1 alpha-2) country code of the address.
     * @return countryCode
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "US",
        required = true,
        value = "The two-character (ISO 3166-1 alpha-2) country code of the address."
    )
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public UserAddressCreate skipAddressVerification(
        String skipAddressVerification
    ) {
        this.skipAddressVerification = skipAddressVerification;
        return this;
    }

    /**
     * An optional boolean value specifying if verification of the address should be skipped or not. UserAddresses are generally used for shipping addresses, and failure to validate your shipping address will likely result in a failure to deliver SIM cards or other items ordered from Telnyx. Do not use this parameter unless you are sure that the address is correct even though it cannot be validated. If this is set to any value other than true, verification of the address will be attempted, and the user address will not be allowed if verification fails. If verification fails but suggested values are available that might make the address correct, they will be present in the response as well. If this value is set to true, then the verification will not be attempted. Defaults to false (verification will be performed).
     * @return skipAddressVerification
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "An optional boolean value specifying if verification of the address should be skipped or not. UserAddresses are generally used for shipping addresses, and failure to validate your shipping address will likely result in a failure to deliver SIM cards or other items ordered from Telnyx. Do not use this parameter unless you are sure that the address is correct even though it cannot be validated. If this is set to any value other than true, verification of the address will be attempted, and the user address will not be allowed if verification fails. If verification fails but suggested values are available that might make the address correct, they will be present in the response as well. If this value is set to true, then the verification will not be attempted. Defaults to false (verification will be performed)."
    )
    @JsonProperty(JSON_PROPERTY_SKIP_ADDRESS_VERIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSkipAddressVerification() {
        return skipAddressVerification;
    }

    @JsonProperty(JSON_PROPERTY_SKIP_ADDRESS_VERIFICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSkipAddressVerification(String skipAddressVerification) {
        this.skipAddressVerification = skipAddressVerification;
    }

    /**
     * Return true if this UserAddressCreate object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAddressCreate userAddressCreate = (UserAddressCreate) o;
        return (
            Objects.equals(
                this.customerReference,
                userAddressCreate.customerReference
            ) &&
            Objects.equals(this.firstName, userAddressCreate.firstName) &&
            Objects.equals(this.lastName, userAddressCreate.lastName) &&
            Objects.equals(this.businessName, userAddressCreate.businessName) &&
            Objects.equals(this.phoneNumber, userAddressCreate.phoneNumber) &&
            Objects.equals(
                this.streetAddress,
                userAddressCreate.streetAddress
            ) &&
            Objects.equals(
                this.extendedAddress,
                userAddressCreate.extendedAddress
            ) &&
            Objects.equals(this.locality, userAddressCreate.locality) &&
            Objects.equals(
                this.administrativeArea,
                userAddressCreate.administrativeArea
            ) &&
            Objects.equals(this.neighborhood, userAddressCreate.neighborhood) &&
            Objects.equals(this.borough, userAddressCreate.borough) &&
            Objects.equals(this.postalCode, userAddressCreate.postalCode) &&
            Objects.equals(this.countryCode, userAddressCreate.countryCode) &&
            Objects.equals(
                this.skipAddressVerification,
                userAddressCreate.skipAddressVerification
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            customerReference,
            firstName,
            lastName,
            businessName,
            phoneNumber,
            streetAddress,
            extendedAddress,
            locality,
            administrativeArea,
            neighborhood,
            borough,
            postalCode,
            countryCode,
            skipAddressVerification
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAddressCreate {\n");
        sb
            .append("    customerReference: ")
            .append(toIndentedString(customerReference))
            .append("\n");
        sb
            .append("    firstName: ")
            .append(toIndentedString(firstName))
            .append("\n");
        sb
            .append("    lastName: ")
            .append(toIndentedString(lastName))
            .append("\n");
        sb
            .append("    businessName: ")
            .append(toIndentedString(businessName))
            .append("\n");
        sb
            .append("    phoneNumber: ")
            .append(toIndentedString(phoneNumber))
            .append("\n");
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
            .append("    neighborhood: ")
            .append(toIndentedString(neighborhood))
            .append("\n");
        sb
            .append("    borough: ")
            .append(toIndentedString(borough))
            .append("\n");
        sb
            .append("    postalCode: ")
            .append(toIndentedString(postalCode))
            .append("\n");
        sb
            .append("    countryCode: ")
            .append(toIndentedString(countryCode))
            .append("\n");
        sb
            .append("    skipAddressVerification: ")
            .append(toIndentedString(skipAddressVerification))
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
