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
import com.telnyx.sdk.model.HostedNumber;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MessagingHostedNumberOrder
 */
@JsonPropertyOrder({
  MessagingHostedNumberOrder.JSON_PROPERTY_RECORD_TYPE,
  MessagingHostedNumberOrder.JSON_PROPERTY_ID,
  MessagingHostedNumberOrder.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  MessagingHostedNumberOrder.JSON_PROPERTY_STATUS,
  MessagingHostedNumberOrder.JSON_PROPERTY_PHONE_NUMBERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class MessagingHostedNumberOrder {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messaging_profile_id";
  private JsonNullable<String> messagingProfileId = JsonNullable.<String>undefined();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    FAILED(String.valueOf("failed")),
    
    PENDING(String.valueOf("pending")),
    
    SUCCESSFUL(String.valueOf("successful"));

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
  private List<HostedNumber> phoneNumbers = null;

  public MessagingHostedNumberOrder() { 
  }

  @JsonCreator
  public MessagingHostedNumberOrder(
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType, 
    @JsonProperty(JSON_PROPERTY_ID) UUID id
  ) {
    this();
    this.recordType = recordType;
    this.id = id;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "messaging_hosted_number_order", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * Resource unique identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource unique identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public MessagingHostedNumberOrder messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = JsonNullable.<String>of(messagingProfileId);
    return this;
  }

   /**
   * Automatically associate the number with this messaging profile ID when the order is complete.
   * @return messagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Automatically associate the number with this messaging profile ID when the order is complete.")
  @JsonIgnore

  public String getMessagingProfileId() {
        return messagingProfileId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessagingProfileId_JsonNullable() {
    return messagingProfileId;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  public void setMessagingProfileId_JsonNullable(JsonNullable<String> messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }

  public void setMessagingProfileId(String messagingProfileId) {
    this.messagingProfileId = JsonNullable.<String>of(messagingProfileId);
  }


  public MessagingHostedNumberOrder status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public MessagingHostedNumberOrder phoneNumbers(List<HostedNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public MessagingHostedNumberOrder addphoneNumbersItem(HostedNumber phoneNumbersItem) {
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

  public List<HostedNumber> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(List<HostedNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  /**
   * Return true if this MessagingHostedNumberOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingHostedNumberOrder messagingHostedNumberOrder = (MessagingHostedNumberOrder) o;
    return Objects.equals(this.recordType, messagingHostedNumberOrder.recordType) &&
        Objects.equals(this.id, messagingHostedNumberOrder.id) &&
        equalsNullable(this.messagingProfileId, messagingHostedNumberOrder.messagingProfileId) &&
        Objects.equals(this.status, messagingHostedNumberOrder.status) &&
        Objects.equals(this.phoneNumbers, messagingHostedNumberOrder.phoneNumbers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, hashCodeNullable(messagingProfileId), status, phoneNumbers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingHostedNumberOrder {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
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

