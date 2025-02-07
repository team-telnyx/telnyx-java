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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * DynamicEmergencyAddress
 */
@JsonPropertyOrder({
  DynamicEmergencyAddress.JSON_PROPERTY_ID,
  DynamicEmergencyAddress.JSON_PROPERTY_RECORD_TYPE,
  DynamicEmergencyAddress.JSON_PROPERTY_SIP_GEOLOCATION_ID,
  DynamicEmergencyAddress.JSON_PROPERTY_STATUS,
  DynamicEmergencyAddress.JSON_PROPERTY_HOUSE_NUMBER,
  DynamicEmergencyAddress.JSON_PROPERTY_HOUSE_SUFFIX,
  DynamicEmergencyAddress.JSON_PROPERTY_STREET_PRE_DIRECTIONAL,
  DynamicEmergencyAddress.JSON_PROPERTY_STREET_NAME,
  DynamicEmergencyAddress.JSON_PROPERTY_STREET_SUFFIX,
  DynamicEmergencyAddress.JSON_PROPERTY_STREET_POST_DIRECTIONAL,
  DynamicEmergencyAddress.JSON_PROPERTY_EXTENDED_ADDRESS,
  DynamicEmergencyAddress.JSON_PROPERTY_LOCALITY,
  DynamicEmergencyAddress.JSON_PROPERTY_ADMINISTRATIVE_AREA,
  DynamicEmergencyAddress.JSON_PROPERTY_POSTAL_CODE,
  DynamicEmergencyAddress.JSON_PROPERTY_COUNTRY_CODE,
  DynamicEmergencyAddress.JSON_PROPERTY_CREATED_AT,
  DynamicEmergencyAddress.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class DynamicEmergencyAddress {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_SIP_GEOLOCATION_ID = "sip_geolocation_id";
  private String sipGeolocationId;

  /**
   * Status of dynamic emergency address
   */
  public enum StatusEnum {
    PENDING(String.valueOf("pending")),
    
    ACTIVATED(String.valueOf("activated")),
    
    REJECTED(String.valueOf("rejected"));

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_HOUSE_NUMBER = "house_number";
  private String houseNumber;

  public static final String JSON_PROPERTY_HOUSE_SUFFIX = "house_suffix";
  private String houseSuffix;

  public static final String JSON_PROPERTY_STREET_PRE_DIRECTIONAL = "street_pre_directional";
  private String streetPreDirectional;

  public static final String JSON_PROPERTY_STREET_NAME = "street_name";
  private String streetName;

  public static final String JSON_PROPERTY_STREET_SUFFIX = "street_suffix";
  private String streetSuffix;

  public static final String JSON_PROPERTY_STREET_POST_DIRECTIONAL = "street_post_directional";
  private String streetPostDirectional;

  public static final String JSON_PROPERTY_EXTENDED_ADDRESS = "extended_address";
  private String extendedAddress;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  public static final String JSON_PROPERTY_ADMINISTRATIVE_AREA = "administrative_area";
  private String administrativeArea;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postal_code";
  private String postalCode;

  /**
   * Gets or Sets countryCode
   */
  public enum CountryCodeEnum {
    US(String.valueOf("US")),
    
    CA(String.valueOf("CA")),
    
    PR(String.valueOf("PR"));

    private String value;

    CountryCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CountryCodeEnum fromValue(String value) {
      for (CountryCodeEnum b : CountryCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private CountryCodeEnum countryCode;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public DynamicEmergencyAddress() { 
  }

  @JsonCreator
  public DynamicEmergencyAddress(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_SIP_GEOLOCATION_ID) String sipGeolocationId, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.sipGeolocationId = sipGeolocationId;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f1", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "dynamic_emergency_address", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * Unique location reference string to be used in SIP INVITE from / p-asserted headers.
   * @return sipGeolocationId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "XYZ123", value = "Unique location reference string to be used in SIP INVITE from / p-asserted headers.")
  @JsonProperty(JSON_PROPERTY_SIP_GEOLOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSipGeolocationId() {
    return sipGeolocationId;
  }




   /**
   * Status of dynamic emergency address
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "pending", value = "Status of dynamic emergency address")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  public DynamicEmergencyAddress houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

   /**
   * Get houseNumber
   * @return houseNumber
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "600", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHouseNumber() {
    return houseNumber;
  }


  @JsonProperty(JSON_PROPERTY_HOUSE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }


  public DynamicEmergencyAddress houseSuffix(String houseSuffix) {
    this.houseSuffix = houseSuffix;
    return this;
  }

   /**
   * Get houseSuffix
   * @return houseSuffix
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOUSE_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHouseSuffix() {
    return houseSuffix;
  }


  @JsonProperty(JSON_PROPERTY_HOUSE_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHouseSuffix(String houseSuffix) {
    this.houseSuffix = houseSuffix;
  }


  public DynamicEmergencyAddress streetPreDirectional(String streetPreDirectional) {
    this.streetPreDirectional = streetPreDirectional;
    return this;
  }

   /**
   * Get streetPreDirectional
   * @return streetPreDirectional
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STREET_PRE_DIRECTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetPreDirectional() {
    return streetPreDirectional;
  }


  @JsonProperty(JSON_PROPERTY_STREET_PRE_DIRECTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetPreDirectional(String streetPreDirectional) {
    this.streetPreDirectional = streetPreDirectional;
  }


  public DynamicEmergencyAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Congress", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STREET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStreetName() {
    return streetName;
  }


  @JsonProperty(JSON_PROPERTY_STREET_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public DynamicEmergencyAddress streetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
    return this;
  }

   /**
   * Get streetSuffix
   * @return streetSuffix
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "St", value = "")
  @JsonProperty(JSON_PROPERTY_STREET_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetSuffix() {
    return streetSuffix;
  }


  @JsonProperty(JSON_PROPERTY_STREET_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }


  public DynamicEmergencyAddress streetPostDirectional(String streetPostDirectional) {
    this.streetPostDirectional = streetPostDirectional;
    return this;
  }

   /**
   * Get streetPostDirectional
   * @return streetPostDirectional
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STREET_POST_DIRECTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetPostDirectional() {
    return streetPostDirectional;
  }


  @JsonProperty(JSON_PROPERTY_STREET_POST_DIRECTIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreetPostDirectional(String streetPostDirectional) {
    this.streetPostDirectional = streetPostDirectional;
  }


  public DynamicEmergencyAddress extendedAddress(String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

   /**
   * Get extendedAddress
   * @return extendedAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public DynamicEmergencyAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * Get locality
   * @return locality
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Austin", required = true, value = "")
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


  public DynamicEmergencyAddress administrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
    return this;
  }

   /**
   * Get administrativeArea
   * @return administrativeArea
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "TX", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAdministrativeArea() {
    return administrativeArea;
  }


  @JsonProperty(JSON_PROPERTY_ADMINISTRATIVE_AREA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAdministrativeArea(String administrativeArea) {
    this.administrativeArea = administrativeArea;
  }


  public DynamicEmergencyAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "78701", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public DynamicEmergencyAddress countryCode(CountryCodeEnum countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "US", value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CountryCodeEnum getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(CountryCodeEnum countryCode) {
    this.countryCode = countryCode;
  }


   /**
   * ISO 8601 formatted date of when the resource was created
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date of when the resource was created")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date of when the resource was last updated
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 formatted date of when the resource was last updated")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this DynamicEmergencyAddress object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicEmergencyAddress dynamicEmergencyAddress = (DynamicEmergencyAddress) o;
    return Objects.equals(this.id, dynamicEmergencyAddress.id) &&
        Objects.equals(this.recordType, dynamicEmergencyAddress.recordType) &&
        Objects.equals(this.sipGeolocationId, dynamicEmergencyAddress.sipGeolocationId) &&
        Objects.equals(this.status, dynamicEmergencyAddress.status) &&
        Objects.equals(this.houseNumber, dynamicEmergencyAddress.houseNumber) &&
        Objects.equals(this.houseSuffix, dynamicEmergencyAddress.houseSuffix) &&
        Objects.equals(this.streetPreDirectional, dynamicEmergencyAddress.streetPreDirectional) &&
        Objects.equals(this.streetName, dynamicEmergencyAddress.streetName) &&
        Objects.equals(this.streetSuffix, dynamicEmergencyAddress.streetSuffix) &&
        Objects.equals(this.streetPostDirectional, dynamicEmergencyAddress.streetPostDirectional) &&
        Objects.equals(this.extendedAddress, dynamicEmergencyAddress.extendedAddress) &&
        Objects.equals(this.locality, dynamicEmergencyAddress.locality) &&
        Objects.equals(this.administrativeArea, dynamicEmergencyAddress.administrativeArea) &&
        Objects.equals(this.postalCode, dynamicEmergencyAddress.postalCode) &&
        Objects.equals(this.countryCode, dynamicEmergencyAddress.countryCode) &&
        Objects.equals(this.createdAt, dynamicEmergencyAddress.createdAt) &&
        Objects.equals(this.updatedAt, dynamicEmergencyAddress.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, sipGeolocationId, status, houseNumber, houseSuffix, streetPreDirectional, streetName, streetSuffix, streetPostDirectional, extendedAddress, locality, administrativeArea, postalCode, countryCode, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicEmergencyAddress {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    sipGeolocationId: ").append(toIndentedString(sipGeolocationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    houseSuffix: ").append(toIndentedString(houseSuffix)).append("\n");
    sb.append("    streetPreDirectional: ").append(toIndentedString(streetPreDirectional)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    streetPostDirectional: ").append(toIndentedString(streetPostDirectional)).append("\n");
    sb.append("    extendedAddress: ").append(toIndentedString(extendedAddress)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    administrativeArea: ").append(toIndentedString(administrativeArea)).append("\n");
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

