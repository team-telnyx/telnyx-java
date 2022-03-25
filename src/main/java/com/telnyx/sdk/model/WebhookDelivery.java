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
import com.telnyx.sdk.model.Attempt;
import com.telnyx.sdk.model.WebhookDeliveryWebhook;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Record of all attempts to deliver a webhook.
 */
@ApiModel(description = "Record of all attempts to deliver a webhook.")
@JsonPropertyOrder({
  WebhookDelivery.JSON_PROPERTY_ID,
  WebhookDelivery.JSON_PROPERTY_USER_ID,
  WebhookDelivery.JSON_PROPERTY_RECORD_TYPE,
  WebhookDelivery.JSON_PROPERTY_STATUS,
  WebhookDelivery.JSON_PROPERTY_WEBHOOK,
  WebhookDelivery.JSON_PROPERTY_STARTED_AT,
  WebhookDelivery.JSON_PROPERTY_FINISHED_AT,
  WebhookDelivery.JSON_PROPERTY_ATTEMPTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WebhookDelivery {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  /**
   * Delivery status: &#39;delivered&#39; when successfuly delivered or &#39;failed&#39; if all attempts have failed.
   */
  public enum StatusEnum {
    DELIVERED("delivered"),
    
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

  public static final String JSON_PROPERTY_WEBHOOK = "webhook";
  private WebhookDeliveryWebhook webhook;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_FINISHED_AT = "finished_at";
  private OffsetDateTime finishedAt;

  public static final String JSON_PROPERTY_ATTEMPTS = "attempts";
  private List<Attempt> attempts = null;

  public WebhookDelivery() { 
  }

  public WebhookDelivery id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the webhook_delivery record.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f5586561-8ff0-4291-a0ac-84fe544797bd", value = "Uniquely identifies the webhook_delivery record.")
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


  public WebhookDelivery userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Uniquely identifies the user that owns the webhook_delivery record.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "Uniquely identifies the user that owns the webhook_delivery record.")
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


  public WebhookDelivery recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "webhook_delivery", value = "Identifies the type of the resource.")
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


  public WebhookDelivery status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Delivery status: &#39;delivered&#39; when successfuly delivered or &#39;failed&#39; if all attempts have failed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Delivery status: 'delivered' when successfuly delivered or 'failed' if all attempts have failed.")
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


  public WebhookDelivery webhook(WebhookDeliveryWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WebhookDeliveryWebhook getWebhook() {
    return webhook;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhook(WebhookDeliveryWebhook webhook) {
    this.webhook = webhook;
  }


  public WebhookDelivery startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp indicating when the first request attempt was initiated.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-08-10T14:00Z", value = "ISO 8601 timestamp indicating when the first request attempt was initiated.")
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public WebhookDelivery finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp indicating when the last webhook response has been received.
   * @return finishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-08-10T14:00:05.595Z", value = "ISO 8601 timestamp indicating when the last webhook response has been received.")
  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }


  public WebhookDelivery attempts(List<Attempt> attempts) {
    this.attempts = attempts;
    return this;
  }

  public WebhookDelivery addAttemptsItem(Attempt attemptsItem) {
    if (this.attempts == null) {
      this.attempts = new ArrayList<>();
    }
    this.attempts.add(attemptsItem);
    return this;
  }

   /**
   * Detailed delivery attempts, ordered by most recent.
   * @return attempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"status\":\"delivered\",\"started_at\":\"2020-08-10T14:00:05.364Z\",\"finished_at\":\"2020-08-10T14:00:05.595Z\",\"http\":{\"request\":{\"url\":\"https://fallback.example.com/webhooks\",\"headers\":[\"Accept: *_/_*\"]},\"response\":{\"status\":200,\"headers\":[\"Content-Type: text/html\"],\"body\":\"All good.\"}}},{\"status\":\"failed\",\"started_at\":\"2020-08-10T14:00:05.004Z\",\"finished_at\":\"2020-08-10T14:00:05.360Z\",\"http\":{\"request\":{\"url\":\"https://typo.example.com/webhooks\",\"headers\":[\"Accept: *_/_*\"]},\"response\":{\"status\":404,\"headers\":[\"Content-Type: text/html\",\"Pragma: no-cache\"],\"body\":\"Oops. Not found.\"}},\"errors\":[{\"code\":\"75499\",\"title\":\"Webhook host returned HTTP 4XX\",\"detail\":\"The server returned another HTTP 4XX error\"}]}]", value = "Detailed delivery attempts, ordered by most recent.")
  @JsonProperty(JSON_PROPERTY_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Attempt> getAttempts() {
    return attempts;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttempts(List<Attempt> attempts) {
    this.attempts = attempts;
  }


  /**
   * Return true if this webhook_delivery object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookDelivery webhookDelivery = (WebhookDelivery) o;
    return Objects.equals(this.id, webhookDelivery.id) &&
        Objects.equals(this.userId, webhookDelivery.userId) &&
        Objects.equals(this.recordType, webhookDelivery.recordType) &&
        Objects.equals(this.status, webhookDelivery.status) &&
        Objects.equals(this.webhook, webhookDelivery.webhook) &&
        Objects.equals(this.startedAt, webhookDelivery.startedAt) &&
        Objects.equals(this.finishedAt, webhookDelivery.finishedAt) &&
        Objects.equals(this.attempts, webhookDelivery.attempts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, recordType, status, webhook, startedAt, finishedAt, attempts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookDelivery {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
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
