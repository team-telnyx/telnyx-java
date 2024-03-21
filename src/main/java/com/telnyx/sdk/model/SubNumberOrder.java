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
import com.telnyx.sdk.model.SubNumberOrderRegulatoryRequirement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * SubNumberOrder
 */
@JsonPropertyOrder({
  SubNumberOrder.JSON_PROPERTY_ID,
  SubNumberOrder.JSON_PROPERTY_ORDER_REQUEST_ID,
  SubNumberOrder.JSON_PROPERTY_COUNTRY_CODE,
  SubNumberOrder.JSON_PROPERTY_PHONE_NUMBER_TYPE,
  SubNumberOrder.JSON_PROPERTY_USER_ID,
  SubNumberOrder.JSON_PROPERTY_REGULATORY_REQUIREMENTS,
  SubNumberOrder.JSON_PROPERTY_RECORD_TYPE,
  SubNumberOrder.JSON_PROPERTY_PHONE_NUMBERS_COUNT,
  SubNumberOrder.JSON_PROPERTY_CREATED_AT,
  SubNumberOrder.JSON_PROPERTY_UPDATED_AT,
  SubNumberOrder.JSON_PROPERTY_REQUIREMENTS_MET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class SubNumberOrder {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ORDER_REQUEST_ID = "order_request_id";
  private UUID orderRequestId;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  /**
   * Gets or Sets phoneNumberType
   */
  public enum PhoneNumberTypeEnum {
    LOCAL("local"),
    
    TOLL_FREE("toll_free"),
    
    MOBILE("mobile"),
    
    NATIONAL("national"),
    
    SHARED_COST("shared_cost"),
    
    LANDLINE("landline");

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

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public static final String JSON_PROPERTY_REGULATORY_REQUIREMENTS = "regulatory_requirements";
  private List<SubNumberOrderRegulatoryRequirement> regulatoryRequirements = null;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBERS_COUNT = "phone_numbers_count";
  private Integer phoneNumbersCount;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_REQUIREMENTS_MET = "requirements_met";
  private Boolean requirementsMet;

  public SubNumberOrder() { 
  }

  @JsonCreator
  public SubNumberOrder(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_ORDER_REQUEST_ID) UUID orderRequestId, 
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE) String countryCode, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS_COUNT) Integer phoneNumbersCount, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt, 
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET) Boolean requirementsMet
  ) {
    this();
    this.id = id;
    this.orderRequestId = orderRequestId;
    this.countryCode = countryCode;
    this.recordType = recordType;
    this.phoneNumbersCount = phoneNumbersCount;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.requirementsMet = requirementsMet;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




   /**
   * Get orderRequestId
   * @return orderRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c293", value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOrderRequestId() {
    return orderRequestId;
  }




   /**
   * Get countryCode
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }




  public SubNumberOrder phoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
    this.phoneNumberType = phoneNumberType;
    return this;
  }

   /**
   * Get phoneNumberType
   * @return phoneNumberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "local", value = "")
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


  public SubNumberOrder userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d70873cd-7c98-401a-81b6-b1ae08246995", value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(UUID userId) {
    this.userId = userId;
  }


  public SubNumberOrder regulatoryRequirements(List<SubNumberOrderRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
    return this;
  }

  public SubNumberOrder addRegulatoryRequirementsItem(SubNumberOrderRegulatoryRequirement regulatoryRequirementsItem) {
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

  public List<SubNumberOrderRegulatoryRequirement> getRegulatoryRequirements() {
    return regulatoryRequirements;
  }


  @JsonProperty(JSON_PROPERTY_REGULATORY_REQUIREMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegulatoryRequirements(List<SubNumberOrderRegulatoryRequirement> regulatoryRequirements) {
    this.regulatoryRequirements = regulatoryRequirements;
  }


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sub_number_order", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * The count of phone numbers in the number order.
   * @return phoneNumbersCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The count of phone numbers in the number order.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPhoneNumbersCount() {
    return phoneNumbersCount;
  }




   /**
   * An ISO 8901 datetime string denoting when the number order was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8901 datetime string denoting when the number order was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }




   /**
   * An ISO 8901 datetime string for when the number order was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8901 datetime string for when the number order was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }




   /**
   * True if all requirements are met for every phone number, false otherwise.
   * @return requirementsMet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "True if all requirements are met for every phone number, false otherwise.")
  @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequirementsMet() {
    return requirementsMet;
  }




  /**
   * Return true if this SubNumberOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubNumberOrder subNumberOrder = (SubNumberOrder) o;
    return Objects.equals(this.id, subNumberOrder.id) &&
        Objects.equals(this.orderRequestId, subNumberOrder.orderRequestId) &&
        Objects.equals(this.countryCode, subNumberOrder.countryCode) &&
        Objects.equals(this.phoneNumberType, subNumberOrder.phoneNumberType) &&
        Objects.equals(this.userId, subNumberOrder.userId) &&
        Objects.equals(this.regulatoryRequirements, subNumberOrder.regulatoryRequirements) &&
        Objects.equals(this.recordType, subNumberOrder.recordType) &&
        Objects.equals(this.phoneNumbersCount, subNumberOrder.phoneNumbersCount) &&
        Objects.equals(this.createdAt, subNumberOrder.createdAt) &&
        Objects.equals(this.updatedAt, subNumberOrder.updatedAt) &&
        Objects.equals(this.requirementsMet, subNumberOrder.requirementsMet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderRequestId, countryCode, phoneNumberType, userId, regulatoryRequirements, recordType, phoneNumbersCount, createdAt, updatedAt, requirementsMet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubNumberOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderRequestId: ").append(toIndentedString(orderRequestId)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneNumberType: ").append(toIndentedString(phoneNumberType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    regulatoryRequirements: ").append(toIndentedString(regulatoryRequirements)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumbersCount: ").append(toIndentedString(phoneNumbersCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    requirementsMet: ").append(toIndentedString(requirementsMet)).append("\n");
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

