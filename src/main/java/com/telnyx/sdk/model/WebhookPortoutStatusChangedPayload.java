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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The webhook payload for the portout.status_changed event
 */
@ApiModel(description = "The webhook payload for the portout.status_changed event")
@JsonPropertyOrder({
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_ID,
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_STATUS,
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_PHONE_NUMBERS,
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_CARRIER_NAME,
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_SPID,
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_USER_ID,
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_SUBSCRIBER_NAME,
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_REJECTION_REASON,
  WebhookPortoutStatusChangedPayload.JSON_PROPERTY_ATTEMPTED_PIN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class WebhookPortoutStatusChangedPayload {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  /**
   * The new status of the port out.
   */
  public enum StatusEnum {
    PENDING(String.valueOf("pending")),
    
    AUTHORIZED(String.valueOf("authorized")),
    
    PORTED(String.valueOf("ported")),
    
    REJECTED(String.valueOf("rejected")),
    
    REJECTED_PENDING(String.valueOf("rejected-pending")),
    
    CANCELED(String.valueOf("canceled"));

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

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private List<String> phoneNumbers = null;

  public static final String JSON_PROPERTY_CARRIER_NAME = "carrier_name";
  private String carrierName;

  public static final String JSON_PROPERTY_SPID = "spid";
  private String spid;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public static final String JSON_PROPERTY_SUBSCRIBER_NAME = "subscriber_name";
  private String subscriberName;

  public static final String JSON_PROPERTY_REJECTION_REASON = "rejection_reason";
  private String rejectionReason;

  public static final String JSON_PROPERTY_ATTEMPTED_PIN = "attempted_pin";
  private String attemptedPin;

  public WebhookPortoutStatusChangedPayload() { 
  }

  public WebhookPortoutStatusChangedPayload id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the port out that was moved.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "96dfa9e4-c753-4fd3-97cd-42d66f26cf0c", value = "Identifies the port out that was moved.")
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


  public WebhookPortoutStatusChangedPayload status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The new status of the port out.
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "authorized", value = "The new status of the port out.")
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


  public WebhookPortoutStatusChangedPayload phoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public WebhookPortoutStatusChangedPayload addphoneNumbersItem(String phoneNumbersItem) {
    if (this.phoneNumbers == null) {
      this.phoneNumbers = new ArrayList<>();
    }
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Phone numbers associated with this port-out order
   * @return phoneNumbers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"+35312345678\"]", value = "Phone numbers associated with this port-out order")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public WebhookPortoutStatusChangedPayload carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * Carrier the number will be ported out to
   * @return carrierName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Testing Carrier", value = "Carrier the number will be ported out to")
  @JsonProperty(JSON_PROPERTY_CARRIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCarrierName() {
    return carrierName;
  }


  @JsonProperty(JSON_PROPERTY_CARRIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public WebhookPortoutStatusChangedPayload spid(String spid) {
    this.spid = spid;
    return this;
  }

   /**
   * The new carrier SPID.
   * @return spid
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "987H", value = "The new carrier SPID.")
  @JsonProperty(JSON_PROPERTY_SPID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpid() {
    return spid;
  }


  @JsonProperty(JSON_PROPERTY_SPID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpid(String spid) {
    this.spid = spid;
  }


  public WebhookPortoutStatusChangedPayload userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Identifies the user that the port-out order belongs to.
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "96dfa9e4-c753-4fd3-97cd-42d66f26cf0c", value = "Identifies the user that the port-out order belongs to.")
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


  public WebhookPortoutStatusChangedPayload subscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
    return this;
  }

   /**
   * The name of the port-out&#39;s end user.
   * @return subscriberName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "The name of the port-out's end user.")
  @JsonProperty(JSON_PROPERTY_SUBSCRIBER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubscriberName() {
    return subscriberName;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIBER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriberName(String subscriberName) {
    this.subscriberName = subscriberName;
  }


  public WebhookPortoutStatusChangedPayload rejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
    return this;
  }

   /**
   * The reason why the order is being rejected by the user. If the order is authorized, this field can be left null
   * @return rejectionReason
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The reason why the order is being rejected by the user. If the order is authorized, this field can be left null")
  @JsonProperty(JSON_PROPERTY_REJECTION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRejectionReason() {
    return rejectionReason;
  }


  @JsonProperty(JSON_PROPERTY_REJECTION_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }


  public WebhookPortoutStatusChangedPayload attemptedPin(String attemptedPin) {
    this.attemptedPin = attemptedPin;
    return this;
  }

   /**
   * The PIN that was attempted to be used to authorize the port out.
   * @return attemptedPin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "The PIN that was attempted to be used to authorize the port out.")
  @JsonProperty(JSON_PROPERTY_ATTEMPTED_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttemptedPin() {
    return attemptedPin;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPTED_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttemptedPin(String attemptedPin) {
    this.attemptedPin = attemptedPin;
  }


  /**
   * Return true if this WebhookPortoutStatusChangedPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPortoutStatusChangedPayload webhookPortoutStatusChangedPayload = (WebhookPortoutStatusChangedPayload) o;
    return Objects.equals(this.id, webhookPortoutStatusChangedPayload.id) &&
        Objects.equals(this.status, webhookPortoutStatusChangedPayload.status) &&
        Objects.equals(this.phoneNumbers, webhookPortoutStatusChangedPayload.phoneNumbers) &&
        Objects.equals(this.carrierName, webhookPortoutStatusChangedPayload.carrierName) &&
        Objects.equals(this.spid, webhookPortoutStatusChangedPayload.spid) &&
        Objects.equals(this.userId, webhookPortoutStatusChangedPayload.userId) &&
        Objects.equals(this.subscriberName, webhookPortoutStatusChangedPayload.subscriberName) &&
        Objects.equals(this.rejectionReason, webhookPortoutStatusChangedPayload.rejectionReason) &&
        Objects.equals(this.attemptedPin, webhookPortoutStatusChangedPayload.attemptedPin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, phoneNumbers, carrierName, spid, userId, subscriberName, rejectionReason, attemptedPin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPortoutStatusChangedPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    subscriberName: ").append(toIndentedString(subscriberName)).append("\n");
    sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
    sb.append("    attemptedPin: ").append(toIndentedString(attemptedPin)).append("\n");
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

