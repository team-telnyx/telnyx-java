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
 * VerifyDetailRecord
 */
@JsonPropertyOrder({
  VerifyDetailRecord.JSON_PROPERTY_ID,
  VerifyDetailRecord.JSON_PROPERTY_VERIFY_PROFILE_ID,
  VerifyDetailRecord.JSON_PROPERTY_DELIVERY_STATUS,
  VerifyDetailRecord.JSON_PROPERTY_VERIFICATION_STATUS,
  VerifyDetailRecord.JSON_PROPERTY_DESTINATION_PHONE_NUMBER,
  VerifyDetailRecord.JSON_PROPERTY_VERIFY_CHANNEL_TYPE,
  VerifyDetailRecord.JSON_PROPERTY_VERIFY_CHANNEL_ID,
  VerifyDetailRecord.JSON_PROPERTY_CREATED_AT,
  VerifyDetailRecord.JSON_PROPERTY_UPDATED_AT,
  VerifyDetailRecord.JSON_PROPERTY_RATE,
  VerifyDetailRecord.JSON_PROPERTY_RATE_MEASURED_IN,
  VerifyDetailRecord.JSON_PROPERTY_VERIFY_USAGE_FEE,
  VerifyDetailRecord.JSON_PROPERTY_CURRENCY,
  VerifyDetailRecord.JSON_PROPERTY_RECORD_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class VerifyDetailRecord {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_VERIFY_PROFILE_ID = "verify_profile_id";
  private UUID verifyProfileId;

  public static final String JSON_PROPERTY_DELIVERY_STATUS = "delivery_status";
  private String deliveryStatus;

  public static final String JSON_PROPERTY_VERIFICATION_STATUS = "verification_status";
  private String verificationStatus;

  public static final String JSON_PROPERTY_DESTINATION_PHONE_NUMBER = "destination_phone_number";
  private String destinationPhoneNumber;

  /**
   * Depending on the type of verification, the &#x60;verify_channel_id&#x60; points to one of the following channel ids; --- verify_channel_type | verify_channel_id ------------------- | ----------------- sms, psd2           | messaging_id call, flashcall     | call_control_id whatsapp            | messaging_whatsapp_id --- 
   */
  public enum VerifyChannelTypeEnum {
    SMS(String.valueOf("sms")),
    
    PSD2(String.valueOf("psd2")),
    
    CALL(String.valueOf("call")),
    
    FLASHCALL(String.valueOf("flashcall")),
    
    WHATSAPP(String.valueOf("whatsapp"));

    private String value;

    VerifyChannelTypeEnum(String value) {
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
    public static VerifyChannelTypeEnum fromValue(String value) {
      for (VerifyChannelTypeEnum b : VerifyChannelTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_VERIFY_CHANNEL_TYPE = "verify_channel_type";
  private VerifyChannelTypeEnum verifyChannelType;

  public static final String JSON_PROPERTY_VERIFY_CHANNEL_ID = "verify_channel_id";
  private UUID verifyChannelId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_RATE = "rate";
  private String rate;

  public static final String JSON_PROPERTY_RATE_MEASURED_IN = "rate_measured_in";
  private String rateMeasuredIn;

  public static final String JSON_PROPERTY_VERIFY_USAGE_FEE = "verify_usage_fee";
  private String verifyUsageFee;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType = "verification_detail_record";

  public VerifyDetailRecord() { 
  }

  public VerifyDetailRecord id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Unique ID of the verification
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0add777f-1549-46f7-84e9-ad7350f6aa97", value = "Unique ID of the verification")
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


  public VerifyDetailRecord verifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
    return this;
  }

   /**
   * Get verifyProfileId
   * @return verifyProfileId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "49000176-1ab2-8bc1-352e-4009f6c37f82", value = "")
  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getVerifyProfileId() {
    return verifyProfileId;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
  }


  public VerifyDetailRecord deliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "pending", value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeliveryStatus() {
    return deliveryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public VerifyDetailRecord verificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "pending", value = "")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerificationStatus() {
    return verificationStatus;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public VerifyDetailRecord destinationPhoneNumber(String destinationPhoneNumber) {
    this.destinationPhoneNumber = destinationPhoneNumber;
    return this;
  }

   /**
   * E.164 formatted phone number
   * @return destinationPhoneNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "+13124515883", value = "E.164 formatted phone number")
  @JsonProperty(JSON_PROPERTY_DESTINATION_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestinationPhoneNumber() {
    return destinationPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestinationPhoneNumber(String destinationPhoneNumber) {
    this.destinationPhoneNumber = destinationPhoneNumber;
  }


  public VerifyDetailRecord verifyChannelType(VerifyChannelTypeEnum verifyChannelType) {
    this.verifyChannelType = verifyChannelType;
    return this;
  }

   /**
   * Depending on the type of verification, the &#x60;verify_channel_id&#x60; points to one of the following channel ids; --- verify_channel_type | verify_channel_id ------------------- | ----------------- sms, psd2           | messaging_id call, flashcall     | call_control_id whatsapp            | messaging_whatsapp_id --- 
   * @return verifyChannelType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Depending on the type of verification, the `verify_channel_id` points to one of the following channel ids; --- verify_channel_type | verify_channel_id ------------------- | ----------------- sms, psd2           | messaging_id call, flashcall     | call_control_id whatsapp            | messaging_whatsapp_id --- ")
  @JsonProperty(JSON_PROPERTY_VERIFY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerifyChannelTypeEnum getVerifyChannelType() {
    return verifyChannelType;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyChannelType(VerifyChannelTypeEnum verifyChannelType) {
    this.verifyChannelType = verifyChannelType;
  }


  public VerifyDetailRecord verifyChannelId(UUID verifyChannelId) {
    this.verifyChannelId = verifyChannelId;
    return this;
  }

   /**
   * Get verifyChannelId
   * @return verifyChannelId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "5b7a8365-91f3-420a-befc-498d1efd6c20", value = "")
  @JsonProperty(JSON_PROPERTY_VERIFY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getVerifyChannelId() {
    return verifyChannelId;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyChannelId(UUID verifyChannelId) {
    this.verifyChannelId = verifyChannelId;
  }


  public VerifyDetailRecord createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-07-08T00:00:41.000000+00:00", value = "")
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


  public VerifyDetailRecord updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2021-07-08T00:00:41.000000+00:00", value = "")
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


  public VerifyDetailRecord rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Currency amount per billing unit used to calculate the Telnyx billing costs
   * @return rate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.002", value = "Currency amount per billing unit used to calculate the Telnyx billing costs")
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(String rate) {
    this.rate = rate;
  }


  public VerifyDetailRecord rateMeasuredIn(String rateMeasuredIn) {
    this.rateMeasuredIn = rateMeasuredIn;
    return this;
  }

   /**
   * Billing unit used to calculate the Telnyx billing costs
   * @return rateMeasuredIn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "number of occurrences", value = "Billing unit used to calculate the Telnyx billing costs")
  @JsonProperty(JSON_PROPERTY_RATE_MEASURED_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRateMeasuredIn() {
    return rateMeasuredIn;
  }


  @JsonProperty(JSON_PROPERTY_RATE_MEASURED_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateMeasuredIn(String rateMeasuredIn) {
    this.rateMeasuredIn = rateMeasuredIn;
  }


  public VerifyDetailRecord verifyUsageFee(String verifyUsageFee) {
    this.verifyUsageFee = verifyUsageFee;
    return this;
  }

   /**
   * Currency amount for Verify Usage Fee
   * @return verifyUsageFee
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.002", value = "Currency amount for Verify Usage Fee")
  @JsonProperty(JSON_PROPERTY_VERIFY_USAGE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerifyUsageFee() {
    return verifyUsageFee;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_USAGE_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerifyUsageFee(String verifyUsageFee) {
    this.verifyUsageFee = verifyUsageFee;
  }


  public VerifyDetailRecord currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Telnyx account currency used to describe monetary values, including billing costs
   * @return currency
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Telnyx account currency used to describe monetary values, including billing costs")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public VerifyDetailRecord recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "verification_detail_record", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  /**
   * Return true if this VerifyDetailRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyDetailRecord verifyDetailRecord = (VerifyDetailRecord) o;
    return Objects.equals(this.id, verifyDetailRecord.id) &&
        Objects.equals(this.verifyProfileId, verifyDetailRecord.verifyProfileId) &&
        Objects.equals(this.deliveryStatus, verifyDetailRecord.deliveryStatus) &&
        Objects.equals(this.verificationStatus, verifyDetailRecord.verificationStatus) &&
        Objects.equals(this.destinationPhoneNumber, verifyDetailRecord.destinationPhoneNumber) &&
        Objects.equals(this.verifyChannelType, verifyDetailRecord.verifyChannelType) &&
        Objects.equals(this.verifyChannelId, verifyDetailRecord.verifyChannelId) &&
        Objects.equals(this.createdAt, verifyDetailRecord.createdAt) &&
        Objects.equals(this.updatedAt, verifyDetailRecord.updatedAt) &&
        Objects.equals(this.rate, verifyDetailRecord.rate) &&
        Objects.equals(this.rateMeasuredIn, verifyDetailRecord.rateMeasuredIn) &&
        Objects.equals(this.verifyUsageFee, verifyDetailRecord.verifyUsageFee) &&
        Objects.equals(this.currency, verifyDetailRecord.currency) &&
        Objects.equals(this.recordType, verifyDetailRecord.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, verifyProfileId, deliveryStatus, verificationStatus, destinationPhoneNumber, verifyChannelType, verifyChannelId, createdAt, updatedAt, rate, rateMeasuredIn, verifyUsageFee, currency, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyDetailRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    verifyProfileId: ").append(toIndentedString(verifyProfileId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    destinationPhoneNumber: ").append(toIndentedString(destinationPhoneNumber)).append("\n");
    sb.append("    verifyChannelType: ").append(toIndentedString(verifyChannelType)).append("\n");
    sb.append("    verifyChannelId: ").append(toIndentedString(verifyChannelId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    rateMeasuredIn: ").append(toIndentedString(rateMeasuredIn)).append("\n");
    sb.append("    verifyUsageFee: ").append(toIndentedString(verifyUsageFee)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

