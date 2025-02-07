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
import com.telnyx.sdk.model.DocReqsRequirementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * DocReqsRequirement
 */
@JsonPropertyOrder({
  DocReqsRequirement.JSON_PROPERTY_RECORD_TYPE,
  DocReqsRequirement.JSON_PROPERTY_COUNTRY_CODE,
  DocReqsRequirement.JSON_PROPERTY_LOCALITY,
  DocReqsRequirement.JSON_PROPERTY_PHONE_NUMBER_TYPE,
  DocReqsRequirement.JSON_PROPERTY_ACTION,
  DocReqsRequirement.JSON_PROPERTY_REQUIREMENTS_TYPES,
  DocReqsRequirement.JSON_PROPERTY_ID,
  DocReqsRequirement.JSON_PROPERTY_CREATED_AT,
  DocReqsRequirement.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class DocReqsRequirement {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  public static final String JSON_PROPERTY_LOCALITY = "locality";
  private String locality;

  /**
   * Indicates the phone_number_type this requirement applies to. Leave blank if this requirement applies to all number_types.
   */
  public enum PhoneNumberTypeEnum {
    LOCAL(String.valueOf("local")),
    
    NATIONAL(String.valueOf("national")),
    
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

  /**
   * Indicates whether this requirement applies to ordering, porting, or both
   */
  public enum ActionEnum {
    BOTH(String.valueOf("both")),
    
    ORDERING(String.valueOf("ordering")),
    
    PORTING(String.valueOf("porting"));

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_REQUIREMENTS_TYPES = "requirements_types";
  private List<DocReqsRequirementType> requirementsTypes = null;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public DocReqsRequirement() { 
  }

  @JsonCreator
  public DocReqsRequirement(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_TYPES) List<DocReqsRequirementType> requirementsTypes, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt
  ) {
    this();
    this.recordType = recordType;
    this.requirementsTypes = requirementsTypes;
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "requirement", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  public DocReqsRequirement countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The 2-character (ISO 3166-1 alpha-2) country code where this requirement applies
   * @return countryCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "FR", value = "The 2-character (ISO 3166-1 alpha-2) country code where this requirement applies")
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


  public DocReqsRequirement locality(String locality) {
    this.locality = locality;
    return this;
  }

   /**
   * The locality where this requirement applies
   * @return locality
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Nice", value = "The locality where this requirement applies")
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


  public DocReqsRequirement phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
    return this;
  }

   /**
   * Indicates the phone_number_type this requirement applies to. Leave blank if this requirement applies to all number_types.
   * @return phoneNumberType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "local", value = "Indicates the phone_number_type this requirement applies to. Leave blank if this requirement applies to all number_types.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhoneNumberTypeEnum getPhoneNumberType() {
    return phoneNumberType;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
  }


  public DocReqsRequirement action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Indicates whether this requirement applies to ordering, porting, or both
   * @return action
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ordering", value = "Indicates whether this requirement applies to ordering, porting, or both")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


   /**
   * Lists the requirement types necessary to fulfill this requirement
   * @return requirementsTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Lists the requirement types necessary to fulfill this requirement")
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocReqsRequirementType> getRequirementsTypes() {
    return requirementsTypes;
  }




   /**
   * Identifies the associated document
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "Identifies the associated document")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * ISO 8601 formatted date-time indicating when the resource was created.
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-04-09T22:25:27.521Z", value = "ISO 8601 formatted date-time indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date-time indicating when the resource was last updated.
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-04-12T20:20:20.020Z", value = "ISO 8601 formatted date-time indicating when the resource was last updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this DocReqsRequirement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocReqsRequirement docReqsRequirement = (DocReqsRequirement) o;
    return Objects.equals(this.recordType, docReqsRequirement.recordType) &&
        Objects.equals(this.countryCode, docReqsRequirement.countryCode) &&
        Objects.equals(this.locality, docReqsRequirement.locality) &&
        Objects.equals(this.phoneNumberType, docReqsRequirement.phoneNumberType) &&
        Objects.equals(this.action, docReqsRequirement.action) &&
        Objects.equals(this.requirementsTypes, docReqsRequirement.requirementsTypes) &&
        Objects.equals(this.id, docReqsRequirement.id) &&
        Objects.equals(this.createdAt, docReqsRequirement.createdAt) &&
        Objects.equals(this.updatedAt, docReqsRequirement.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, countryCode, locality, phoneNumberType, action, requirementsTypes, id, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocReqsRequirement {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    requirementsTypes: ").append(toIndentedString(requirementsTypes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

