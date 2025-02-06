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
import com.telnyx.sdk.model.PhoneNumbersJobPhoneNumber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * NumberOrder
 */
@JsonPropertyOrder({
  NumberOrder.JSON_PROPERTY_ID,
  NumberOrder.JSON_PROPERTY_RECORD_TYPE,
  NumberOrder.JSON_PROPERTY_PHONE_NUMBERS_COUNT,
  NumberOrder.JSON_PROPERTY_CONNECTION_ID,
  NumberOrder.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  NumberOrder.JSON_PROPERTY_BILLING_GROUP_ID,
  NumberOrder.JSON_PROPERTY_PHONE_NUMBERS,
  NumberOrder.JSON_PROPERTY_SUB_NUMBER_ORDERS_IDS,
  NumberOrder.JSON_PROPERTY_STATUS,
  NumberOrder.JSON_PROPERTY_CUSTOMER_REFERENCE,
  NumberOrder.JSON_PROPERTY_CREATED_AT,
  NumberOrder.JSON_PROPERTY_UPDATED_AT,
  NumberOrder.JSON_PROPERTY_REQUIREMENTS_MET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class NumberOrder {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_PHONE_NUMBERS_COUNT = "phone_numbers_count";
  private Integer phoneNumbersCount;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messaging_profile_id";
  private String messagingProfileId;

  public static final String JSON_PROPERTY_BILLING_GROUP_ID = "billing_group_id";
  private String billingGroupId;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private List<PhoneNumbersJobPhoneNumber> phoneNumbers = null;

  public static final String JSON_PROPERTY_SUB_NUMBER_ORDERS_IDS = "sub_number_orders_ids";
  private List<String> subNumberOrdersIds = null;

  /**
   * The status of the order.
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

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE = "customer_reference";
  private String customerReference;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_REQUIREMENTS_MET = "requirements_met";
  private Boolean requirementsMet;

  public NumberOrder() { 
  }

  @JsonCreator
  public NumberOrder(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS_COUNT) Integer phoneNumbersCount, 
    @JsonProperty(JSON_PROPERTY_STATUS) StatusEnum status, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) String createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) String updatedAt, 
    @JsonProperty(JSON_PROPERTY_REQUIREMENTS_MET) Boolean requirementsMet
  ) {
    this();
    this.id = id;
    this.recordType = recordType;
    this.phoneNumbersCount = phoneNumbersCount;
    this.status = status;
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
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "number_order", value = "")
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




  public NumberOrder connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Identifies the connection associated with this phone number.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "346789098765567", value = "Identifies the connection associated with this phone number.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public NumberOrder messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * Identifies the messaging profile associated with the phone number.
   * @return messagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc85f64-5717-4562-b3fc-2c9600", value = "Identifies the messaging profile associated with the phone number.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagingProfileId() {
    return messagingProfileId;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }


  public NumberOrder billingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
    return this;
  }

   /**
   * Identifies the messaging profile associated with the phone number.
   * @return billingGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc85f64-5717-4562-b3fc-2c9600", value = "Identifies the messaging profile associated with the phone number.")
  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingGroupId() {
    return billingGroupId;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingGroupId(String billingGroupId) {
    this.billingGroupId = billingGroupId;
  }


  public NumberOrder phoneNumbers(List<PhoneNumbersJobPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public NumberOrder addphoneNumbersItem(PhoneNumbersJobPhoneNumber phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PhoneNumbersJobPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(List<PhoneNumbersJobPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public NumberOrder subNumberOrdersIds(List<String> subNumberOrdersIds) {
    this.subNumberOrdersIds = subNumberOrdersIds;
    return this;
  }

  public NumberOrder addsubNumberOrdersIdsItem(String subNumberOrdersIdsItem) {
    if (this.subNumberOrdersIds == null) {
      this.subNumberOrdersIds = new ArrayList<>();
    }
    this.subNumberOrdersIds.add(subNumberOrdersIdsItem);
    return this;
  }

   /**
   * Get subNumberOrdersIds
   * @return subNumberOrdersIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUB_NUMBER_ORDERS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubNumberOrdersIds() {
    return subNumberOrdersIds;
  }


  @JsonProperty(JSON_PROPERTY_SUB_NUMBER_ORDERS_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubNumberOrdersIds(List<String> subNumberOrdersIds) {
    this.subNumberOrdersIds = subNumberOrdersIds;
  }


   /**
   * The status of the order.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the order.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  public NumberOrder customerReference(String customerReference) {
    this.customerReference = customerReference;
    return this;
  }

   /**
   * A customer reference string for customer look ups.
   * @return customerReference
  **/
  @javax.annotation.Nullable
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
   * Return true if this NumberOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOrder numberOrder = (NumberOrder) o;
    return Objects.equals(this.id, numberOrder.id) &&
        Objects.equals(this.recordType, numberOrder.recordType) &&
        Objects.equals(this.phoneNumbersCount, numberOrder.phoneNumbersCount) &&
        Objects.equals(this.connectionId, numberOrder.connectionId) &&
        Objects.equals(this.messagingProfileId, numberOrder.messagingProfileId) &&
        Objects.equals(this.billingGroupId, numberOrder.billingGroupId) &&
        Objects.equals(this.phoneNumbers, numberOrder.phoneNumbers) &&
        Objects.equals(this.subNumberOrdersIds, numberOrder.subNumberOrdersIds) &&
        Objects.equals(this.status, numberOrder.status) &&
        Objects.equals(this.customerReference, numberOrder.customerReference) &&
        Objects.equals(this.createdAt, numberOrder.createdAt) &&
        Objects.equals(this.updatedAt, numberOrder.updatedAt) &&
        Objects.equals(this.requirementsMet, numberOrder.requirementsMet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumbersCount, connectionId, messagingProfileId, billingGroupId, phoneNumbers, subNumberOrdersIds, status, customerReference, createdAt, updatedAt, requirementsMet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOrder {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumbersCount: ").append(toIndentedString(phoneNumbersCount)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    billingGroupId: ").append(toIndentedString(billingGroupId)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    subNumberOrdersIds: ").append(toIndentedString(subNumberOrdersIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customerReference: ").append(toIndentedString(customerReference)).append("\n");
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

