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
import com.telnyx.sdk.model.WhatsappPhoneNumberWhatsappSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * WhatsappPhoneNumber
 */
@JsonPropertyOrder({
  WhatsappPhoneNumber.JSON_PROPERTY_RECORD_TYPE,
  WhatsappPhoneNumber.JSON_PROPERTY_ID,
  WhatsappPhoneNumber.JSON_PROPERTY_ORGANIZATION_ID,
  WhatsappPhoneNumber.JSON_PROPERTY_WHATSAPP_BUSINESS_ACCOUNT_ID,
  WhatsappPhoneNumber.JSON_PROPERTY_STATUS,
  WhatsappPhoneNumber.JSON_PROPERTY_WEBHOOK_URL,
  WhatsappPhoneNumber.JSON_PROPERTY_ABOUT,
  WhatsappPhoneNumber.JSON_PROPERTY_PHONE_NUMBER,
  WhatsappPhoneNumber.JSON_PROPERTY_WHATSAPP_USER_ID,
  WhatsappPhoneNumber.JSON_PROPERTY_WHATSAPP_SETTINGS,
  WhatsappPhoneNumber.JSON_PROPERTY_CREATED_AT,
  WhatsappPhoneNumber.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WhatsappPhoneNumber {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ORGANIZATION_ID = "organization_id";
  private UUID organizationId;

  public static final String JSON_PROPERTY_WHATSAPP_BUSINESS_ACCOUNT_ID = "whatsapp_business_account_id";
  private UUID whatsappBusinessAccountId;

  /**
   * The configuration status for the phone number in the Telnyx platform
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    READY("ready"),
    
    DISCONNECTED("disconnected");

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

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private String webhookUrl;

  public static final String JSON_PROPERTY_ABOUT = "about";
  private String about;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_WHATSAPP_USER_ID = "whatsapp_user_id";
  private String whatsappUserId;

  public static final String JSON_PROPERTY_WHATSAPP_SETTINGS = "whatsapp_settings";
  private WhatsappPhoneNumberWhatsappSettings whatsappSettings;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public WhatsappPhoneNumber() { 
  }

  public WhatsappPhoneNumber recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whatsapp_phone_number", value = "")
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


  public WhatsappPhoneNumber id(UUID id) {
    this.id = id;
    return this;
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


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public WhatsappPhoneNumber organizationId(UUID organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The owning organization&#39;s ID
   * @return organizationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", value = "The owning organization's ID")
  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getOrganizationId() {
    return organizationId;
  }


  @JsonProperty(JSON_PROPERTY_ORGANIZATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganizationId(UUID organizationId) {
    this.organizationId = organizationId;
  }


  public WhatsappPhoneNumber whatsappBusinessAccountId(UUID whatsappBusinessAccountId) {
    this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    return this;
  }

   /**
   * The associated WhatsApp Business Account ID
   * @return whatsappBusinessAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", value = "The associated WhatsApp Business Account ID")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_BUSINESS_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getWhatsappBusinessAccountId() {
    return whatsappBusinessAccountId;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_BUSINESS_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhatsappBusinessAccountId(UUID whatsappBusinessAccountId) {
    this.whatsappBusinessAccountId = whatsappBusinessAccountId;
  }


  public WhatsappPhoneNumber status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The configuration status for the phone number in the Telnyx platform
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The configuration status for the phone number in the Telnyx platform")
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


  public WhatsappPhoneNumber webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * The webhook url to be used by facebook
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://mydomain.com/webhook", value = "The webhook url to be used by facebook")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookUrl() {
    return webhookUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public WhatsappPhoneNumber about(String about) {
    this.about = about;
    return this;
  }

   /**
   * The WhatsApp about section content
   * @return about
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is our about section", value = "The WhatsApp about section content")
  @JsonProperty(JSON_PROPERTY_ABOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAbout() {
    return about;
  }


  @JsonProperty(JSON_PROPERTY_ABOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbout(String about) {
    this.about = about;
  }


  public WhatsappPhoneNumber phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number in E164 format
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number in E164 format")
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


  public WhatsappPhoneNumber whatsappUserId(String whatsappUserId) {
    this.whatsappUserId = whatsappUserId;
    return this;
  }

   /**
   * The phone number&#39;s WhatsApp User ID, used in other Telnyx Whatsapp API endpoints
   * @return whatsappUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number's WhatsApp User ID, used in other Telnyx Whatsapp API endpoints")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWhatsappUserId() {
    return whatsappUserId;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhatsappUserId(String whatsappUserId) {
    this.whatsappUserId = whatsappUserId;
  }


  public WhatsappPhoneNumber whatsappSettings(WhatsappPhoneNumberWhatsappSettings whatsappSettings) {
    this.whatsappSettings = whatsappSettings;
    return this;
  }

   /**
   * Get whatsappSettings
   * @return whatsappSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WhatsappPhoneNumberWhatsappSettings getWhatsappSettings() {
    return whatsappSettings;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhatsappSettings(WhatsappPhoneNumberWhatsappSettings whatsappSettings) {
    this.whatsappSettings = whatsappSettings;
  }


  public WhatsappPhoneNumber createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * An ISO 8601 datetime string denoting when the account was added to the Telnyx platform
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8601 datetime string denoting when the account was added to the Telnyx platform")
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


  public WhatsappPhoneNumber updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * An ISO 8601 datetime string for when the number order was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-01-01T00:00:00.000000Z", value = "An ISO 8601 datetime string for when the number order was updated.")
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
   * Return true if this WhatsappPhoneNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsappPhoneNumber whatsappPhoneNumber = (WhatsappPhoneNumber) o;
    return Objects.equals(this.recordType, whatsappPhoneNumber.recordType) &&
        Objects.equals(this.id, whatsappPhoneNumber.id) &&
        Objects.equals(this.organizationId, whatsappPhoneNumber.organizationId) &&
        Objects.equals(this.whatsappBusinessAccountId, whatsappPhoneNumber.whatsappBusinessAccountId) &&
        Objects.equals(this.status, whatsappPhoneNumber.status) &&
        Objects.equals(this.webhookUrl, whatsappPhoneNumber.webhookUrl) &&
        Objects.equals(this.about, whatsappPhoneNumber.about) &&
        Objects.equals(this.phoneNumber, whatsappPhoneNumber.phoneNumber) &&
        Objects.equals(this.whatsappUserId, whatsappPhoneNumber.whatsappUserId) &&
        Objects.equals(this.whatsappSettings, whatsappPhoneNumber.whatsappSettings) &&
        Objects.equals(this.createdAt, whatsappPhoneNumber.createdAt) &&
        Objects.equals(this.updatedAt, whatsappPhoneNumber.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, organizationId, whatsappBusinessAccountId, status, webhookUrl, about, phoneNumber, whatsappUserId, whatsappSettings, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsappPhoneNumber {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    whatsappBusinessAccountId: ").append(toIndentedString(whatsappBusinessAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    whatsappUserId: ").append(toIndentedString(whatsappUserId)).append("\n");
    sb.append("    whatsappSettings: ").append(toIndentedString(whatsappSettings)).append("\n");
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

