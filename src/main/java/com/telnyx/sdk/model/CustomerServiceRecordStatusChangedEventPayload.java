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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CustomerServiceRecordStatusChangedEventPayload
 */
@JsonPropertyOrder({
  CustomerServiceRecordStatusChangedEventPayload.JSON_PROPERTY_ID,
  CustomerServiceRecordStatusChangedEventPayload.JSON_PROPERTY_PHONE_NUMBER,
  CustomerServiceRecordStatusChangedEventPayload.JSON_PROPERTY_STATUS,
  CustomerServiceRecordStatusChangedEventPayload.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CustomerServiceRecordStatusChangedEventPayload {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  /**
   * The status of the customer service record
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    COMPLETED("completed"),
    
    FAILED("failed");

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

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public CustomerServiceRecordStatusChangedEventPayload() { 
  }

  public CustomerServiceRecordStatusChangedEventPayload id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the customer service record.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f1486bae-f067-460c-ad43-73a92848f902", value = "Uniquely identifies the customer service record.")
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


  public CustomerServiceRecordStatusChangedEventPayload phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the customer service record.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+12065551212", value = "The phone number of the customer service record.")
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


  public CustomerServiceRecordStatusChangedEventPayload status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the customer service record
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "completed", value = "The status of the customer service record")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CustomerServiceRecordStatusChangedEventPayload updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating the last time where the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-19T10:07:15.527Z", value = "ISO 8601 formatted date indicating the last time where the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this CustomerServiceRecordStatusChangedEvent_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerServiceRecordStatusChangedEventPayload customerServiceRecordStatusChangedEventPayload = (CustomerServiceRecordStatusChangedEventPayload) o;
    return Objects.equals(this.id, customerServiceRecordStatusChangedEventPayload.id) &&
        Objects.equals(this.phoneNumber, customerServiceRecordStatusChangedEventPayload.phoneNumber) &&
        Objects.equals(this.status, customerServiceRecordStatusChangedEventPayload.status) &&
        Objects.equals(this.updatedAt, customerServiceRecordStatusChangedEventPayload.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, phoneNumber, status, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerServiceRecordStatusChangedEventPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

