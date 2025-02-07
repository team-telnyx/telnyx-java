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
import com.telnyx.sdk.model.SubNumberOrderRegulatoryRequirementWithValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumber
 */
@JsonPropertyOrder({
  PhoneNumber.JSON_PROPERTY_ID,
  PhoneNumber.JSON_PROPERTY_RECORD_TYPE,
  PhoneNumber.JSON_PROPERTY_PHONE_NUMBER,
  PhoneNumber.JSON_PROPERTY_COUNTRY_ISO_ALPHA2,
  PhoneNumber.JSON_PROPERTY_REGULATORY_REQUIREMENTS,
  PhoneNumber.JSON_PROPERTY_REQUIREMENTS_MET,
  PhoneNumber.JSON_PROPERTY_REQUIREMENTS_STATUS,
  PhoneNumber.JSON_PROPERTY_STATUS,
  PhoneNumber.JSON_PROPERTY_BUNDLE_ID,
  PhoneNumber.JSON_PROPERTY_PHONE_NUMBER_TYPE,
  PhoneNumber.JSON_PROPERTY_COUNTRY_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PhoneNumber {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_COUNTRY_ISO_ALPHA2 = "country_iso_alpha2";
  private String countryIsoAlpha2;

  public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS = "regulatory_requirements";
  private List<SubNumberOrderRegulatoryRequirementWithValue> regulatoryRequirements = null;

  public static final String JSON_PROPERTY_REQUIREMENTS_MET = "requirements_met";
  private Boolean requirementsMet;

  /**
   * Status of document requirements (if applicable)
   */
  public enum RequirementsStatusEnum {
    PENDING(String.valueOf("pending")),
    
    APPROVED(String.valueOf("approved")),
    
    CANCELLED(String.valueOf("cancelled")),
    
    DELETED(String.valueOf("deleted")),
    
    REQUIREMENT_INFO_EXCEPTION(String.valueOf("requirement-info-exception")),
    
    REQUIREMENT_INFO_PENDING(String.valueOf("requirement-info-pending")),
    
    REQUIREMENT_INFO_UNDER_REVIEW(String.valueOf("requirement-info-under-review"));

    private String value;

    RequirementsStatusEnum(String value) {
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
    public static RequirementsStatusEnum fromValue(String value) {
      for (RequirementsStatusEnum b : RequirementsStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REQUIREMENTS_STATUS = "requirements_status";
  private RequirementsStatusEnum requirementsStatus;

  /**
   * The status of the phone number in the order.
   */
  public enum StatusEnum {
    PENDING(String.valueOf("pending")),
    
    SUCCESS(String.valueOf("success")),
    
    FAILURE(String.valueOf("failure"));

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

  public static final String JSON_PROPERTY_BUNDLE_ID = "bundle_id";
  private UUID bundleId;

  /**
   * Phone number type
   */
  public enum PhoneNumberTypeEnum {
    LOCAL(String.valueOf("local")),
    
    MOBILE(String.valueOf("mobile")),
    
    NATIONAL(String.valueOf("national")),
    
    SHARED_COST(String.valueOf("shared_cost")),
    
    TOLL_FREE(String.valueOf("toll_free"));

    private String value;

    PhoneNumberTypeEnum(String value) {
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
    public static PhoneNumberTypeEnum fromValue(String value) {
      for (PhoneNumberTypeEnum b : PhoneNumberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PHONE_NUMBER_TYPE = "phone_number_type";
  private PhoneNumberTypeEnum phoneNumberType;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public PhoneNumber() { 
  }

  @JsonCreator
  public PhoneNumber(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_ISO_ALPHA2) String countryIsoAlpha2, 
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET) Boolean requirementsMet, 
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_STATUS) RequirementsStatusEnum requirementsStatus, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_BUNDLE_ID) UUID bundleId, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE) PhoneNumberTypeEnum phoneNumberType, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE) String countryCode
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.countryIsoAlpha2 = countryIsoAlpha2;
    this.requirementsMet = requirementsMet;
    this.requirementsStatus = requirementsStatus;
    this.status = status;
    this.bundleId = bundleId;
    this.phoneNumberType = phoneNumberType;
    this.countryCode = countryCode;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc8e4d67-33a0-4cbb-af74-7b58f05bd494", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "number_order_phone_number", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public PhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+19705555098", value = "")
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


   /**
   * The ISO 3166-1 alpha-2 country code of the phone number.
   * @return countryIsoAlpha2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "The ISO 3166-1 alpha-2 country code of the phone number.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_ISO_ALPHA2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryIsoAlpha2() {
    return countryIsoAlpha2;
  }




  public PhoneNumber regulatoryRequirements(List<SubNumberOrderRegulatoryRequirementWithValue> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public PhoneNumber addregulatoryRequirementsItem(SubNumberOrderRegulatoryRequirementWithValue regulatoryRequirementsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubNumberOrderRegulatoryRequirementWithValue> getRegulatoryRequirements() {
    return regulatoryRequirements;
  }


  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegulatoryRequirements(List<SubNumberOrderRegulatoryRequirementWithValue> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
  }


   /**
   * True if all requirements are met for a phone number, false otherwise.
   * @return requirementsMet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if all requirements are met for a phone number, false otherwise.")
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequirementsMet() {
    return requirementsMet;
  }




   /**
   * Status of document requirements (if applicable)
   * @return requirementsStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of document requirements (if applicable)")
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RequirementsStatusEnum getRequirementsStatus() {
    return requirementsStatus;
  }




   /**
   * The status of the phone number in the order.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the phone number in the order.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Get bundleId
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "bc8e4d67-33a0-4cbb-af74-7b58f05bd494", value = "")
  @JsonProperty(JSON_PROPERTY_BUNDLE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getBundleId() {
    return bundleId;
  }




   /**
   * Phone number type
   * @return phoneNumberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number type")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }




   /**
   * Country code of the phone number
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "Country code of the phone number")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }




  /**
   * Return true if this PhoneNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.id, phoneNumber.id) &&
        Objects.equals(this.recordType, phoneNumber.recordType) &&
        Objects.equals(this.phoneNumber, phoneNumber.phoneNumber) &&
        Objects.equals(this.countryIsoAlpha2, phoneNumber.countryIsoAlpha2) &&
        Objects.equals(this.regulatoryRequirements, phoneNumber.regulatoryRequirements) &&
        Objects.equals(this.requirementsMet, phoneNumber.requirementsMet) &&
        Objects.equals(this.requirementsStatus, phoneNumber.requirementsStatus) &&
        Objects.equals(this.status, phoneNumber.status) &&
        Objects.equals(this.bundleId, phoneNumber.bundleId) &&
        Objects.equals(this.phoneNumberType, phoneNumber.phoneNumberType) &&
        Objects.equals(this.countryCode, phoneNumber.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumber, countryIsoAlpha2, regulatoryRequirements, requirementsMet, requirementsStatus, status, bundleId, phoneNumberType, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    countryIsoAlpha2: ").append(toIndentedString(countryIsoAlpha2)).append("\n");
    sb.append("    regulatoryRequirements: ").append(toIndentedString(regulatoryRequirements)).append("\n");
    sb.append("    requirementsMet: ").append(toIndentedString(requirementsMet)).append("\n");
    sb.append("    requirementsStatus: ").append(toIndentedString(requirementsStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

