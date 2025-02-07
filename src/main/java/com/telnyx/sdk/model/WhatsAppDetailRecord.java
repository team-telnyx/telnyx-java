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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * WhatsAppDetailRecord
 */
@JsonPropertyOrder({
  WhatsAppDetailRecord.JSON_PROPERTY_ID,
  WhatsAppDetailRecord.JSON_PROPERTY_VERSION,
  WhatsAppDetailRecord.JSON_PROPERTY_SENDER_ID,
  WhatsAppDetailRecord.JSON_PROPERTY_RECIPIENT_ID,
  WhatsAppDetailRecord.JSON_PROPERTY_MESSAGE_TYPE,
  WhatsAppDetailRecord.JSON_PROPERTY_MESSAGE_STATUS,
  WhatsAppDetailRecord.JSON_PROPERTY_DIRECTION,
  WhatsAppDetailRecord.JSON_PROPERTY_RECIPIENT_REGION_CODE,
  WhatsAppDetailRecord.JSON_PROPERTY_CURRENCY,
  WhatsAppDetailRecord.JSON_PROPERTY_WHATSAPP_ERROR_CODE,
  WhatsAppDetailRecord.JSON_PROPERTY_CREATED_AT,
  WhatsAppDetailRecord.JSON_PROPERTY_WEBHOOK_RECEIVED_AT,
  WhatsAppDetailRecord.JSON_PROPERTY_WEBHOOK_ID,
  WhatsAppDetailRecord.JSON_PROPERTY_TELNYX_FEE,
  WhatsAppDetailRecord.JSON_PROPERTY_WHATSAPP_FEE,
  WhatsAppDetailRecord.JSON_PROPERTY_CONVERSATION_ID,
  WhatsAppDetailRecord.JSON_PROPERTY_CONVERSATION_ORIGIN,
  WhatsAppDetailRecord.JSON_PROPERTY_WHATSAPP_BUSINESS_ACCOUNT_ID,
  WhatsAppDetailRecord.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class WhatsAppDetailRecord {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_SENDER_ID = "sender_id";
  private String senderId;

  public static final String JSON_PROPERTY_RECIPIENT_ID = "recipient_id";
  private String recipientId;

  /**
   * WhatsApp Message Type. Consult WhatsApp API documentation to see all available types
   */
  public enum MessageTypeEnum {
    SESSION(String.valueOf("session")),
    
    TEMPLATE(String.valueOf("template"));

    private String value;

    MessageTypeEnum(String value) {
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
    public static MessageTypeEnum fromValue(String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MESSAGE_TYPE = "message_type";
  private MessageTypeEnum messageType;

  /**
   * WhatsApp Message Status. Consult WhatsApp API documentation to see all available status
   */
  public enum MessageStatusEnum {
    SENT(String.valueOf("sent")),
    
    DELIVERED(String.valueOf("delivered")),
    
    READ(String.valueOf("read")),
    
    FAILED(String.valueOf("failed")),
    
    DELETED(String.valueOf("deleted"));

    private String value;

    MessageStatusEnum(String value) {
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
    public static MessageStatusEnum fromValue(String value) {
      for (MessageStatusEnum b : MessageStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MESSAGE_STATUS = "message_status";
  private MessageStatusEnum messageStatus;

  /**
   * Logical direction of the message from the Telnyx customer&#39;s perspective. It&#39;s inbound when the Telnyx customer receives the message, or outbound otherwise
   */
  public enum DirectionEnum {
    INBOUND(String.valueOf("inbound")),
    
    OUTBOUND(String.valueOf("outbound"));

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public static final String JSON_PROPERTY_RECIPIENT_REGION_CODE = "recipient_region_code";
  private String recipientRegionCode;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_WHATSAPP_ERROR_CODE = "whatsapp_error_code";
  private String whatsappErrorCode;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_WEBHOOK_RECEIVED_AT = "webhook_received_at";
  private OffsetDateTime webhookReceivedAt;

  public static final String JSON_PROPERTY_WEBHOOK_ID = "webhook_id";
  private String webhookId;

  public static final String JSON_PROPERTY_TELNYX_FEE = "telnyx_fee";
  private String telnyxFee;

  public static final String JSON_PROPERTY_WHATSAPP_FEE = "whatsapp_fee";
  private String whatsappFee;

  public static final String JSON_PROPERTY_CONVERSATION_ID = "conversation_id";
  private String conversationId;

  /**
   * Whatsapp Conversation Origin
   */
  public enum ConversationOriginEnum {
    BUSINESS_INITIATED(String.valueOf("business_initiated")),
    
    USER_INITIATED(String.valueOf("user_initiated")),
    
    REFERRAL_CONVERSION(String.valueOf("referral_conversion"));

    private String value;

    ConversationOriginEnum(String value) {
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
    public static ConversationOriginEnum fromValue(String value) {
      for (ConversationOriginEnum b : ConversationOriginEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONVERSATION_ORIGIN = "conversation_origin";
  private ConversationOriginEnum conversationOrigin;

  public static final String JSON_PROPERTY_WHATSAPP_BUSINESS_ACCOUNT_ID = "whatsapp_business_account_id";
  private String whatsappBusinessAccountId;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType = "whatsapp_detail_record";

  public WhatsAppDetailRecord() { 
  }

  public WhatsAppDetailRecord id(String id) {
    this.id = id;
    return this;
  }

   /**
   * WhatsApp Message Id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gBOGyfgaqtrewgpRTGqKuHKaTRhP", value = "WhatsApp Message Id")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public WhatsAppDetailRecord version(String version) {
    this.version = version;
    return this;
  }

   /**
   * WhatsApp API Version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v0.1.0", value = "WhatsApp API Version")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public WhatsAppDetailRecord senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * WhatsApp Sender Id
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18336512500", value = "WhatsApp Sender Id")
  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSenderId() {
    return senderId;
  }


  @JsonProperty(JSON_PROPERTY_SENDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }


  public WhatsAppDetailRecord recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * WhatsApp Recipient Id
   * @return recipientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18336512500", value = "WhatsApp Recipient Id")
  @JsonProperty(JSON_PROPERTY_RECIPIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientId() {
    return recipientId;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public WhatsAppDetailRecord messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * WhatsApp Message Type. Consult WhatsApp API documentation to see all available types
   * @return messageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "session", value = "WhatsApp Message Type. Consult WhatsApp API documentation to see all available types")
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageTypeEnum getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }


  public WhatsAppDetailRecord messageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
    return this;
  }

   /**
   * WhatsApp Message Status. Consult WhatsApp API documentation to see all available status
   * @return messageStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "delivered", value = "WhatsApp Message Status. Consult WhatsApp API documentation to see all available status")
  @JsonProperty(JSON_PROPERTY_MESSAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageStatusEnum getMessageStatus() {
    return messageStatus;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
  }


  public WhatsAppDetailRecord direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Logical direction of the message from the Telnyx customer&#39;s perspective. It&#39;s inbound when the Telnyx customer receives the message, or outbound otherwise
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "inbound", value = "Logical direction of the message from the Telnyx customer's perspective. It's inbound when the Telnyx customer receives the message, or outbound otherwise")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  public WhatsAppDetailRecord recipientRegionCode(String recipientRegionCode) {
    this.recipientRegionCode = recipientRegionCode;
    return this;
  }

   /**
   * CLDR two-letter region-code of recipient
   * @return recipientRegionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "CLDR two-letter region-code of recipient")
  @JsonProperty(JSON_PROPERTY_RECIPIENT_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientRegionCode() {
    return recipientRegionCode;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientRegionCode(String recipientRegionCode) {
    this.recipientRegionCode = recipientRegionCode;
  }


  public WhatsAppDetailRecord currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Telnyx account currency used to describe monetary values, including billing cost
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Telnyx account currency used to describe monetary values, including billing cost")
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


  public WhatsAppDetailRecord whatsappErrorCode(String whatsappErrorCode) {
    this.whatsappErrorCode = whatsappErrorCode;
    return this;
  }

   /**
   * A string representing Whatsapp error code. Consult WhatsApp API documentation to see all available error codes
   * @return whatsappErrorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "490", value = "A string representing Whatsapp error code. Consult WhatsApp API documentation to see all available error codes")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWhatsappErrorCode() {
    return whatsappErrorCode;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhatsappErrorCode(String whatsappErrorCode) {
    this.whatsappErrorCode = whatsappErrorCode;
  }


  public WhatsAppDetailRecord createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * UTC time when the message was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-06T03:32:01.125Z", value = "UTC time when the message was created")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public WhatsAppDetailRecord webhookReceivedAt(OffsetDateTime webhookReceivedAt) {
    this.webhookReceivedAt = webhookReceivedAt;
    return this;
  }

   /**
   * UTC time when the webhook was received
   * @return webhookReceivedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-06T03:32:01.125Z", value = "UTC time when the webhook was received")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_RECEIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getWebhookReceivedAt() {
    return webhookReceivedAt;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_RECEIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookReceivedAt(OffsetDateTime webhookReceivedAt) {
    this.webhookReceivedAt = webhookReceivedAt;
  }


  public WhatsAppDetailRecord webhookId(String webhookId) {
    this.webhookId = webhookId;
    return this;
  }

   /**
   * UUID representation of the webhook unique identifier
   * @return webhookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3ca7bd3d-7d82-4e07-9df4-009123068320", value = "UUID representation of the webhook unique identifier")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookId() {
    return webhookId;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookId(String webhookId) {
    this.webhookId = webhookId;
  }


  public WhatsAppDetailRecord telnyxFee(String telnyxFee) {
    this.telnyxFee = telnyxFee;
    return this;
  }

   /**
   * Currency amount for Telnyx billing cost
   * @return telnyxFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.003", value = "Currency amount for Telnyx billing cost")
  @JsonProperty(JSON_PROPERTY_TELNYX_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTelnyxFee() {
    return telnyxFee;
  }


  @JsonProperty(JSON_PROPERTY_TELNYX_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelnyxFee(String telnyxFee) {
    this.telnyxFee = telnyxFee;
  }


  public WhatsAppDetailRecord whatsappFee(String whatsappFee) {
    this.whatsappFee = whatsappFee;
    return this;
  }

   /**
   * Currency amount for WhatsApp cost
   * @return whatsappFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.003", value = "Currency amount for WhatsApp cost")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWhatsappFee() {
    return whatsappFee;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhatsappFee(String whatsappFee) {
    this.whatsappFee = whatsappFee;
  }


  public WhatsAppDetailRecord conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

   /**
   * Whatsapp Conversation ID
   * @return conversationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f44ae083-c800-4433-baac-b439e5270aa4", value = "Whatsapp Conversation ID")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversationId() {
    return conversationId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  public WhatsAppDetailRecord conversationOrigin(ConversationOriginEnum conversationOrigin) {
    this.conversationOrigin = conversationOrigin;
    return this;
  }

   /**
   * Whatsapp Conversation Origin
   * @return conversationOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whatsapp Conversation Origin")
  @JsonProperty(JSON_PROPERTY_CONVERSATION_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversationOriginEnum getConversationOrigin() {
    return conversationOrigin;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSATION_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversationOrigin(ConversationOriginEnum conversationOrigin) {
    this.conversationOrigin = conversationOrigin;
  }


  public WhatsAppDetailRecord whatsappBusinessAccountId(String whatsappBusinessAccountId) {
    this.whatsappBusinessAccountId = whatsappBusinessAccountId;
    return this;
  }

   /**
   * Whatsapp Business Account ID
   * @return whatsappBusinessAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "421452453", value = "Whatsapp Business Account ID")
  @JsonProperty(JSON_PROPERTY_WHATSAPP_BUSINESS_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWhatsappBusinessAccountId() {
    return whatsappBusinessAccountId;
  }


  @JsonProperty(JSON_PROPERTY_WHATSAPP_BUSINESS_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhatsappBusinessAccountId(String whatsappBusinessAccountId) {
    this.whatsappBusinessAccountId = whatsappBusinessAccountId;
  }


  public WhatsAppDetailRecord recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "whatsapp_detail_record", required = true, value = "")
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
   * Return true if this WhatsAppDetailRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppDetailRecord whatsAppDetailRecord = (WhatsAppDetailRecord) o;
    return Objects.equals(this.id, whatsAppDetailRecord.id) &&
        Objects.equals(this.version, whatsAppDetailRecord.version) &&
        Objects.equals(this.senderId, whatsAppDetailRecord.senderId) &&
        Objects.equals(this.recipientId, whatsAppDetailRecord.recipientId) &&
        Objects.equals(this.messageType, whatsAppDetailRecord.messageType) &&
        Objects.equals(this.messageStatus, whatsAppDetailRecord.messageStatus) &&
        Objects.equals(this.direction, whatsAppDetailRecord.direction) &&
        Objects.equals(this.recipientRegionCode, whatsAppDetailRecord.recipientRegionCode) &&
        Objects.equals(this.currency, whatsAppDetailRecord.currency) &&
        Objects.equals(this.whatsappErrorCode, whatsAppDetailRecord.whatsappErrorCode) &&
        Objects.equals(this.createdAt, whatsAppDetailRecord.createdAt) &&
        Objects.equals(this.webhookReceivedAt, whatsAppDetailRecord.webhookReceivedAt) &&
        Objects.equals(this.webhookId, whatsAppDetailRecord.webhookId) &&
        Objects.equals(this.telnyxFee, whatsAppDetailRecord.telnyxFee) &&
        Objects.equals(this.whatsappFee, whatsAppDetailRecord.whatsappFee) &&
        Objects.equals(this.conversationId, whatsAppDetailRecord.conversationId) &&
        Objects.equals(this.conversationOrigin, whatsAppDetailRecord.conversationOrigin) &&
        Objects.equals(this.whatsappBusinessAccountId, whatsAppDetailRecord.whatsappBusinessAccountId) &&
        Objects.equals(this.recordType, whatsAppDetailRecord.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, senderId, recipientId, messageType, messageStatus, direction, recipientRegionCode, currency, whatsappErrorCode, createdAt, webhookReceivedAt, webhookId, telnyxFee, whatsappFee, conversationId, conversationOrigin, whatsappBusinessAccountId, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppDetailRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    recipientRegionCode: ").append(toIndentedString(recipientRegionCode)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    whatsappErrorCode: ").append(toIndentedString(whatsappErrorCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    webhookReceivedAt: ").append(toIndentedString(webhookReceivedAt)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    telnyxFee: ").append(toIndentedString(telnyxFee)).append("\n");
    sb.append("    whatsappFee: ").append(toIndentedString(whatsappFee)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    conversationOrigin: ").append(toIndentedString(conversationOrigin)).append("\n");
    sb.append("    whatsappBusinessAccountId: ").append(toIndentedString(whatsappBusinessAccountId)).append("\n");
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

