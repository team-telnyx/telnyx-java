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

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UserAddress
 */
@JsonPropertyOrder({
  UserAddress.JSON_PROPERTY_ID,
  UserAddress.JSON_PROPERTY_RECORD_TYPE,
  UserAddress.JSON_PROPERTY_CUSTOMER_REFERENCE,
  UserAddress.JSON_PROPERTY_FIRST_NAME,
  UserAddress.JSON_PROPERTY_LAST_NAME,
  UserAddress.JSON_PROPERTY_BUSINESS_NAME,
  UserAddress.JSON_PROPERTY_PHONE_NUMBER,
  UserAddress.JSON_PROPERTY_STREET_ADDRESS,
  UserAddress.JSON_PROPERTY_EXTENDED_ADDRESS,
  UserAddress.JSON_PROPERTY_LOCALITY,
  UserAddress.JSON_PROPERTY_ADMINISTRATIVE_AREA,
  UserAddress.JSON_PROPERTY_NEIGHBORHOOD,
  UserAddress.JSON_PROPERTY_BOROUGH,
  UserAddress.JSON_PROPERTY_POSTAL_CODE,
  UserAddress.JSON_PROPERTY_COUNTRY_CODE,
  UserAddress.JSON_PROPERTY_CREATED_AT,
  UserAddress.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UserAddress {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
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

  public static final String JSON_PROPERTY_EXTENDED_ADDRESS = "extended_address";
  private String extendedAddress;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  public static final String JSON_PROPERTY_ADMINISTRATIVE_AREA = "administrative_area";
  private String administrativeArea;

  public static final String JSON_PROPERTY_NEIGHBORHOOD = "neighborhood";
  private String neighborhood;

  public static final String JSON_PROPERTY_BOROUGH = "borough";
  private String borough;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public UserAddress() { 
  }

  public UserAddress id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the user address.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "c3527e69-dc5a-4b3e-8f44-99d209f83c1d", value = "Uniquely identifies the user address.")
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


  public UserAddress recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "user_address", value = "Identifies the type of the resource.")
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


  public UserAddress customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer reference string for customer look ups.
   * @return customerReference
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "MY REF 001", value = "A customer reference string for customer look ups.")
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


  public UserAddress firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name associated with the address. An address must have either a first last name or a business name.
   * @return firstName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Alfred", value = "The first name associated with the address. An address must have either a first last name or a business name.")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public UserAddress lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name associated with the address. An address must have either a first last name or a business name.
   * @return lastName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Foster", value = "The last name associated with the address. An address must have either a first last name or a business name.")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public UserAddress businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * The business name associated with the address. An address must have either a first last name or a business name.
   * @return businessName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Toy-O'Kon", value = "The business name associated with the address. An address must have either a first last name or a business name.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public UserAddress phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number associated with the address.
   * @return phoneNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "+12125559000", value = "The phone number associated with the address.")
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


  public UserAddress streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * The primary street address information about the address.
   * @return streetAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "600 Congress Avenue", value = "The primary street address information about the address.")
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


  public UserAddress extendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

   /**
   * Additional street address information about the address such as, but not limited to, unit number or apartment number.
   * @return extendedAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "14th Floor", value = "Additional street address information about the address such as, but not limited to, unit number or apartment number.")
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


  public UserAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * The locality of the address. For US addresses, this corresponds to the city of the address.
   * @return locality
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Austin", value = "The locality of the address. For US addresses, this corresponds to the city of the address.")
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


  public UserAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * The locality of the address. For US addresses, this corresponds to the state of the address.
   * @return administrativeArea
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "TX", value = "The locality of the address. For US addresses, this corresponds to the state of the address.")
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


  public UserAddress neighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

   /**
   * The neighborhood of the address. This field is not used for addresses in the US but is used for some international addresses.
   * @return neighborhood
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Ciudad de los deportes", value = "The neighborhood of the address. This field is not used for addresses in the US but is used for some international addresses.")
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


  public UserAddress borough(String borough) {
    this.borough = borough;
    return this;
  }

   /**
   * The borough of the address. This field is not used for addresses in the US but is used for some international addresses.
   * @return borough
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Guadalajara", value = "The borough of the address. This field is not used for addresses in the US but is used for some international addresses.")
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


  public UserAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code of the address.
   * @return postalCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "78701", value = "The postal code of the address.")
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


  public UserAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The two-character (ISO 3166-1 alpha-2) country code of the address.
   * @return countryCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The two-character (ISO 3166-1 alpha-2) country code of the address.")
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


  public UserAddress createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public UserAddress updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this UserAddress object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAddress userAddress = (UserAddress) o;
    return Objects.equals(this.id, userAddress.id) &&
        Objects.equals(this.recordType, userAddress.recordType) &&
        Objects.equals(this.customerReference, userAddress.customerReference) &&
        Objects.equals(this.firstName, userAddress.firstName) &&
        Objects.equals(this.lastName, userAddress.lastName) &&
        Objects.equals(this.businessName, userAddress.businessName) &&
        Objects.equals(this.phoneNumber, userAddress.phoneNumber) &&
        Objects.equals(this.streetAddress, userAddress.streetAddress) &&
        Objects.equals(this.extendedAddress, userAddress.extendedAddress) &&
        Objects.equals(this.locality, userAddress.locality) &&
        Objects.equals(this.administrativeArea, userAddress.administrativeArea) &&
        Objects.equals(this.neighborhood, userAddress.neighborhood) &&
        Objects.equals(this.borough, userAddress.borough) &&
        Objects.equals(this.postalCode, userAddress.postalCode) &&
        Objects.equals(this.countryCode, userAddress.countryCode) &&
        Objects.equals(this.createdAt, userAddress.createdAt) &&
        Objects.equals(this.updatedAt, userAddress.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, customerReference, firstName, lastName, businessName, phoneNumber, streetAddress, extendedAddress, locality, administrativeArea, neighborhood, borough, postalCode, countryCode, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAddress {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    extendedAddress: ").append(toIndentedString(extendedAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    borough: ").append(toIndentedString(borough)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

