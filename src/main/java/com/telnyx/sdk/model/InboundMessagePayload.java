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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.Error;
import com.telnyx.sdk.model.InboundMessagePayloadCcInner;
import com.telnyx.sdk.model.InboundMessagePayloadCost;
import com.telnyx.sdk.model.InboundMessagePayloadFrom;
import com.telnyx.sdk.model.InboundMessagePayloadMediaInner;
import com.telnyx.sdk.model.InboundMessagePayloadToInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * InboundMessagePayload
 */
@JsonPropertyOrder({
  InboundMessagePayload.JSON_PROPERTY_RECORD_TYPE,
  InboundMessagePayload.JSON_PROPERTY_DIRECTION,
  InboundMessagePayload.JSON_PROPERTY_ID,
  InboundMessagePayload.JSON_PROPERTY_TYPE,
  InboundMessagePayload.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  InboundMessagePayload.JSON_PROPERTY_TO,
  InboundMessagePayload.JSON_PROPERTY_CC,
  InboundMessagePayload.JSON_PROPERTY_FROM,
  InboundMessagePayload.JSON_PROPERTY_TEXT,
  InboundMessagePayload.JSON_PROPERTY_MEDIA,
  InboundMessagePayload.JSON_PROPERTY_WEBHOOK_URL,
  InboundMessagePayload.JSON_PROPERTY_WEBHOOK_FAILOVER_URL,
  InboundMessagePayload.JSON_PROPERTY_ENCODING,
  InboundMessagePayload.JSON_PROPERTY_PARTS,
  InboundMessagePayload.JSON_PROPERTY_TAGS,
  InboundMessagePayload.JSON_PROPERTY_COST,
  InboundMessagePayload.JSON_PROPERTY_RECEIVED_AT,
  InboundMessagePayload.JSON_PROPERTY_SENT_AT,
  InboundMessagePayload.JSON_PROPERTY_COMPLETED_AT,
  InboundMessagePayload.JSON_PROPERTY_VALID_UNTIL,
  InboundMessagePayload.JSON_PROPERTY_ERRORS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InboundMessagePayload {
  /**
   * Identifies the type of the resource.
   */
  public enum RecordTypeEnum {
    MESSAGE("message");

    private String value;

    RecordTypeEnum(String value) {
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
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  /**
   * The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.
   */
  public enum DirectionEnum {
    INBOUND("inbound");

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

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  /**
   * The type of message. This value can be either &#39;sms&#39; or &#39;mms&#39;.
   */
  public enum TypeEnum {
    SMS("SMS"),
    
    MMS("MMS");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messaging_profile_id";
  private String messagingProfileId;

  public static final String JSON_PROPERTY_TO = "to";
  private List<InboundMessagePayloadToInner> to = null;

  public static final String JSON_PROPERTY_CC = "cc";
  private List<InboundMessagePayloadCcInner> cc = null;

  public static final String JSON_PROPERTY_FROM = "from";
  private InboundMessagePayloadFrom from;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_MEDIA = "media";
  private List<InboundMessagePayloadMediaInner> media = null;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private JsonNullable<String> webhookUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_URL = "webhook_failover_url";
  private JsonNullable<String> webhookFailoverUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENCODING = "encoding";
  private String encoding;

  public static final String JSON_PROPERTY_PARTS = "parts";
  private Integer parts;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_COST = "cost";
  private JsonNullable<InboundMessagePayloadCost> cost = JsonNullable.<InboundMessagePayloadCost>undefined();

  public static final String JSON_PROPERTY_RECEIVED_AT = "received_at";
  private OffsetDateTime receivedAt;

  public static final String JSON_PROPERTY_SENT_AT = "sent_at";
  private JsonNullable<OffsetDateTime> sentAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_VALID_UNTIL = "valid_until";
  private JsonNullable<OffsetDateTime> validUntil = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public InboundMessagePayload() { 
  }

  public InboundMessagePayload recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "message", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public InboundMessagePayload direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "inbound", value = "The direction of the message. Inbound messages are sent to you whereas outbound messages are sent from you.")
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


  public InboundMessagePayload id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the type of resource.")
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


  public InboundMessagePayload type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of message. This value can be either &#39;sms&#39; or &#39;mms&#39;.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of message. This value can be either 'sms' or 'mms'.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InboundMessagePayload messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
    return this;
  }

   /**
   * Unique identifier for a messaging profile.
   * @return messagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for a messaging profile.")
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


  public InboundMessagePayload to(List<InboundMessagePayloadToInner> to) {
    this.to = to;
    return this;
  }

  public InboundMessagePayload addToItem(InboundMessagePayloadToInner toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InboundMessagePayloadToInner> getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(List<InboundMessagePayloadToInner> to) {
    this.to = to;
  }


  public InboundMessagePayload cc(List<InboundMessagePayloadCcInner> cc) {
    this.cc = cc;
    return this;
  }

  public InboundMessagePayload addCcItem(InboundMessagePayloadCcInner ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InboundMessagePayloadCcInner> getCc() {
    return cc;
  }


  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCc(List<InboundMessagePayloadCcInner> cc) {
    this.cc = cc;
  }


  public InboundMessagePayload from(InboundMessagePayloadFrom from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InboundMessagePayloadFrom getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(InboundMessagePayloadFrom from) {
    this.from = from;
  }


  public InboundMessagePayload text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Message body (i.e., content) as a non-empty string.  **Required for SMS**
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Message body (i.e., content) as a non-empty string.  **Required for SMS**")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(String text) {
    this.text = text;
  }


  public InboundMessagePayload media(List<InboundMessagePayloadMediaInner> media) {
    this.media = media;
    return this;
  }

  public InboundMessagePayload addMediaItem(InboundMessagePayloadMediaInner mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InboundMessagePayloadMediaInner> getMedia() {
    return media;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedia(List<InboundMessagePayloadMediaInner> media) {
    this.media = media;
  }


  public InboundMessagePayload webhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
    return this;
  }

   /**
   * The URL where webhooks related to this message will be sent.
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL where webhooks related to this message will be sent.")
  @JsonIgnore

  public String getWebhookUrl() {
        return webhookUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookUrl_JsonNullable() {
    return webhookUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  public void setWebhookUrl_JsonNullable(JsonNullable<String> webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = JsonNullable.<String>of(webhookUrl);
  }


  public InboundMessagePayload webhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = JsonNullable.<String>of(webhookFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.
   * @return webhookFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.")
  @JsonIgnore

  public String getWebhookFailoverUrl() {
        return webhookFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookFailoverUrl_JsonNullable() {
    return webhookFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  public void setWebhookFailoverUrl_JsonNullable(JsonNullable<String> webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
  }

  public void setWebhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = JsonNullable.<String>of(webhookFailoverUrl);
  }


  public InboundMessagePayload encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * Encoding scheme used for the message body.
   * @return encoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encoding scheme used for the message body.")
  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncoding() {
    return encoding;
  }


  @JsonProperty(JSON_PROPERTY_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }


  public InboundMessagePayload parts(Integer parts) {
    this.parts = parts;
    return this;
  }

   /**
   * Number of parts into which the message&#39;s body must be split.
   * minimum: 1
   * maximum: 10
   * @return parts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of parts into which the message's body must be split.")
  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParts() {
    return parts;
  }


  @JsonProperty(JSON_PROPERTY_PARTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParts(Integer parts) {
    this.parts = parts;
  }


  public InboundMessagePayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public InboundMessagePayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags associated with the resource.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags associated with the resource.")
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public InboundMessagePayload cost(InboundMessagePayloadCost cost) {
    this.cost = JsonNullable.<InboundMessagePayloadCost>of(cost);
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InboundMessagePayloadCost getCost() {
        return cost.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InboundMessagePayloadCost> getCost_JsonNullable() {
    return cost;
  }
  
  @JsonProperty(JSON_PROPERTY_COST)
  public void setCost_JsonNullable(JsonNullable<InboundMessagePayloadCost> cost) {
    this.cost = cost;
  }

  public void setCost(InboundMessagePayloadCost cost) {
    this.cost = JsonNullable.<InboundMessagePayloadCost>of(cost);
  }


  public InboundMessagePayload receivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the message request was received.
   * @return receivedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the message request was received.")
  @JsonProperty(JSON_PROPERTY_RECEIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getReceivedAt() {
    return receivedAt;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivedAt(OffsetDateTime receivedAt) {
    this.receivedAt = receivedAt;
  }


  public InboundMessagePayload sentAt(OffsetDateTime sentAt) {
    this.sentAt = JsonNullable.<OffsetDateTime>of(sentAt);
    return this;
  }

   /**
   * Not used for inbound messages.
   * @return sentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used for inbound messages.")
  @JsonIgnore

  public OffsetDateTime getSentAt() {
        return sentAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENT_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getSentAt_JsonNullable() {
    return sentAt;
  }
  
  @JsonProperty(JSON_PROPERTY_SENT_AT)
  public void setSentAt_JsonNullable(JsonNullable<OffsetDateTime> sentAt) {
    this.sentAt = sentAt;
  }

  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = JsonNullable.<OffsetDateTime>of(sentAt);
  }


  public InboundMessagePayload completedAt(OffsetDateTime completedAt) {
    this.completedAt = JsonNullable.<OffsetDateTime>of(completedAt);
    return this;
  }

   /**
   * Not used for inbound messages.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used for inbound messages.")
  @JsonIgnore

  public OffsetDateTime getCompletedAt() {
        return completedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCompletedAt_JsonNullable() {
    return completedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  public void setCompletedAt_JsonNullable(JsonNullable<OffsetDateTime> completedAt) {
    this.completedAt = completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = JsonNullable.<OffsetDateTime>of(completedAt);
  }


  public InboundMessagePayload validUntil(OffsetDateTime validUntil) {
    this.validUntil = JsonNullable.<OffsetDateTime>of(validUntil);
    return this;
  }

   /**
   * Not used for inbound messages.
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used for inbound messages.")
  @JsonIgnore

  public OffsetDateTime getValidUntil() {
        return validUntil.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getValidUntil_JsonNullable() {
    return validUntil;
  }
  
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  public void setValidUntil_JsonNullable(JsonNullable<OffsetDateTime> validUntil) {
    this.validUntil = validUntil;
  }

  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = JsonNullable.<OffsetDateTime>of(validUntil);
  }


  public InboundMessagePayload errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public InboundMessagePayload addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * These errors may point at addressees when referring to unsuccessful/unconfirmed delivery statuses.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "These errors may point at addressees when referring to unsuccessful/unconfirmed delivery statuses.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  /**
   * Return true if this InboundMessagePayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessagePayload inboundMessagePayload = (InboundMessagePayload) o;
    return Objects.equals(this.recordType, inboundMessagePayload.recordType) &&
        Objects.equals(this.direction, inboundMessagePayload.direction) &&
        Objects.equals(this.id, inboundMessagePayload.id) &&
        Objects.equals(this.type, inboundMessagePayload.type) &&
        Objects.equals(this.messagingProfileId, inboundMessagePayload.messagingProfileId) &&
        Objects.equals(this.to, inboundMessagePayload.to) &&
        Objects.equals(this.cc, inboundMessagePayload.cc) &&
        Objects.equals(this.from, inboundMessagePayload.from) &&
        Objects.equals(this.text, inboundMessagePayload.text) &&
        Objects.equals(this.media, inboundMessagePayload.media) &&
        equalsNullable(this.webhookUrl, inboundMessagePayload.webhookUrl) &&
        equalsNullable(this.webhookFailoverUrl, inboundMessagePayload.webhookFailoverUrl) &&
        Objects.equals(this.encoding, inboundMessagePayload.encoding) &&
        Objects.equals(this.parts, inboundMessagePayload.parts) &&
        Objects.equals(this.tags, inboundMessagePayload.tags) &&
        equalsNullable(this.cost, inboundMessagePayload.cost) &&
        Objects.equals(this.receivedAt, inboundMessagePayload.receivedAt) &&
        equalsNullable(this.sentAt, inboundMessagePayload.sentAt) &&
        equalsNullable(this.completedAt, inboundMessagePayload.completedAt) &&
        equalsNullable(this.validUntil, inboundMessagePayload.validUntil) &&
        Objects.equals(this.errors, inboundMessagePayload.errors);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, direction, id, type, messagingProfileId, to, cc, from, text, media, hashCodeNullable(webhookUrl), hashCodeNullable(webhookFailoverUrl), encoding, parts, tags, hashCodeNullable(cost), receivedAt, hashCodeNullable(sentAt), hashCodeNullable(completedAt), hashCodeNullable(validUntil), errors);
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
    sb.append("class InboundMessagePayload {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookFailoverUrl: ").append(toIndentedString(webhookFailoverUrl)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

