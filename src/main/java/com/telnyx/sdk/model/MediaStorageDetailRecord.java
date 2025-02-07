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
 * MediaStorageDetailRecord
 */
@JsonPropertyOrder({
  MediaStorageDetailRecord.JSON_PROPERTY_ID,
  MediaStorageDetailRecord.JSON_PROPERTY_CREATED_AT,
  MediaStorageDetailRecord.JSON_PROPERTY_ASSET_ID,
  MediaStorageDetailRecord.JSON_PROPERTY_USER_ID,
  MediaStorageDetailRecord.JSON_PROPERTY_ORG_ID,
  MediaStorageDetailRecord.JSON_PROPERTY_ACTION_TYPE,
  MediaStorageDetailRecord.JSON_PROPERTY_LINK_CHANNEL_TYPE,
  MediaStorageDetailRecord.JSON_PROPERTY_LINK_CHANNEL_ID,
  MediaStorageDetailRecord.JSON_PROPERTY_STATUS,
  MediaStorageDetailRecord.JSON_PROPERTY_WEBHOOK_ID,
  MediaStorageDetailRecord.JSON_PROPERTY_RATE,
  MediaStorageDetailRecord.JSON_PROPERTY_RATE_MEASURED_IN,
  MediaStorageDetailRecord.JSON_PROPERTY_COST,
  MediaStorageDetailRecord.JSON_PROPERTY_CURRENCY,
  MediaStorageDetailRecord.JSON_PROPERTY_RECORD_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class MediaStorageDetailRecord {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ASSET_ID = "asset_id";
  private String assetId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private String orgId;

  public static final String JSON_PROPERTY_ACTION_TYPE = "action_type";
  private String actionType;

  public static final String JSON_PROPERTY_LINK_CHANNEL_TYPE = "link_channel_type";
  private String linkChannelType;

  public static final String JSON_PROPERTY_LINK_CHANNEL_ID = "link_channel_id";
  private String linkChannelId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_WEBHOOK_ID = "webhook_id";
  private String webhookId;

  public static final String JSON_PROPERTY_RATE = "rate";
  private String rate;

  public static final String JSON_PROPERTY_RATE_MEASURED_IN = "rate_measured_in";
  private String rateMeasuredIn;

  public static final String JSON_PROPERTY_COST = "cost";
  private String cost;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType = "media_storage";

  public MediaStorageDetailRecord() { 
  }

  public MediaStorageDetailRecord id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the Media Storage Event
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3ca7bd3d-7d82-4e07-9df4-009123068320", value = "Unique identifier for the Media Storage Event")
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


  public MediaStorageDetailRecord createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Event creation time
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-07-01T00:00Z", value = "Event creation time")
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


  public MediaStorageDetailRecord assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Asset id
   * @return assetId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "a46f4764-4ce4-4391-804c-02f00bc4ff9b", value = "Asset id")
  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetId() {
    return assetId;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public MediaStorageDetailRecord userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User id
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3ca7bd3d-7d82-4e07-9df4-009123068320", value = "User id")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public MediaStorageDetailRecord orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Organization owner id
   * @return orgId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3ca7bd3d-7d82-4e07-9df4-009123068320", value = "Organization owner id")
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrgId() {
    return orgId;
  }


  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public MediaStorageDetailRecord actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * Type of action performed against the Media Storage API
   * @return actionType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "upload", value = "Type of action performed against the Media Storage API")
  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActionType() {
    return actionType;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public MediaStorageDetailRecord linkChannelType(String linkChannelType) {
    this.linkChannelType = linkChannelType;
    return this;
  }

   /**
   * Link channel type
   * @return linkChannelType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "message", value = "Link channel type")
  @JsonProperty(JSON_PROPERTY_LINK_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkChannelType() {
    return linkChannelType;
  }


  @JsonProperty(JSON_PROPERTY_LINK_CHANNEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkChannelType(String linkChannelType) {
    this.linkChannelType = linkChannelType;
  }


  public MediaStorageDetailRecord linkChannelId(String linkChannelId) {
    this.linkChannelId = linkChannelId;
    return this;
  }

   /**
   * Link channel id
   * @return linkChannelId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2065f482-64b9-4680-a3a9-c6d3142efdf7", value = "Link channel id")
  @JsonProperty(JSON_PROPERTY_LINK_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkChannelId() {
    return linkChannelId;
  }


  @JsonProperty(JSON_PROPERTY_LINK_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkChannelId(String linkChannelId) {
    this.linkChannelId = linkChannelId;
  }


  public MediaStorageDetailRecord status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Request status
   * @return status
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "failed", value = "Request status")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public MediaStorageDetailRecord webhookId(String webhookId) {
    this.webhookId = webhookId;
    return this;
  }

   /**
   * Webhook id
   * @return webhookId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "b46f4764-4ce4-4391-804c-02f00bc4ff9b", value = "Webhook id")
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


  public MediaStorageDetailRecord rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Currency amount per billing unit used to calculate the Telnyx billing cost
   * @return rate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.0001", value = "Currency amount per billing unit used to calculate the Telnyx billing cost")
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


  public MediaStorageDetailRecord rateMeasuredIn(String rateMeasuredIn) {
    this.rateMeasuredIn = rateMeasuredIn;
    return this;
  }

   /**
   * Billing unit used to calculate the Telnyx billing cost
   * @return rateMeasuredIn
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "events", value = "Billing unit used to calculate the Telnyx billing cost")
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


  public MediaStorageDetailRecord cost(String cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Currency amount for Telnyx billing cost
   * @return cost
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.004", value = "Currency amount for Telnyx billing cost")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(String cost) {
    this.cost = cost;
  }


  public MediaStorageDetailRecord currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Telnyx account currency used to describe monetary values, including billing cost
   * @return currency
  **/
  @jakarta.annotation.Nullable
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


  public MediaStorageDetailRecord recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "media_storage", required = true, value = "")
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
   * Return true if this MediaStorageDetailRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaStorageDetailRecord mediaStorageDetailRecord = (MediaStorageDetailRecord) o;
    return Objects.equals(this.id, mediaStorageDetailRecord.id) &&
        Objects.equals(this.createdAt, mediaStorageDetailRecord.createdAt) &&
        Objects.equals(this.assetId, mediaStorageDetailRecord.assetId) &&
        Objects.equals(this.userId, mediaStorageDetailRecord.userId) &&
        Objects.equals(this.orgId, mediaStorageDetailRecord.orgId) &&
        Objects.equals(this.actionType, mediaStorageDetailRecord.actionType) &&
        Objects.equals(this.linkChannelType, mediaStorageDetailRecord.linkChannelType) &&
        Objects.equals(this.linkChannelId, mediaStorageDetailRecord.linkChannelId) &&
        Objects.equals(this.status, mediaStorageDetailRecord.status) &&
        Objects.equals(this.webhookId, mediaStorageDetailRecord.webhookId) &&
        Objects.equals(this.rate, mediaStorageDetailRecord.rate) &&
        Objects.equals(this.rateMeasuredIn, mediaStorageDetailRecord.rateMeasuredIn) &&
        Objects.equals(this.cost, mediaStorageDetailRecord.cost) &&
        Objects.equals(this.currency, mediaStorageDetailRecord.currency) &&
        Objects.equals(this.recordType, mediaStorageDetailRecord.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, assetId, userId, orgId, actionType, linkChannelType, linkChannelId, status, webhookId, rate, rateMeasuredIn, cost, currency, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaStorageDetailRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    linkChannelType: ").append(toIndentedString(linkChannelType)).append("\n");
    sb.append("    linkChannelId: ").append(toIndentedString(linkChannelId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    rateMeasuredIn: ").append(toIndentedString(rateMeasuredIn)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

