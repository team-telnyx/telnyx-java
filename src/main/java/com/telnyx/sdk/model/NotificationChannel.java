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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * A Notification Channel
 */
@ApiModel(description = "A Notification Channel")
@JsonPropertyOrder({
  NotificationChannel.JSON_PROPERTY_ID,
  NotificationChannel.JSON_PROPERTY_NOTIFICATION_PROFILE_ID,
  NotificationChannel.JSON_PROPERTY_CHANNEL_TYPE_ID,
  NotificationChannel.JSON_PROPERTY_CHANNEL_DESTINATION,
  NotificationChannel.JSON_PROPERTY_CREATED_AT,
  NotificationChannel.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class NotificationChannel {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NOTIFICATION_PROFILE_ID = "notification_profile_id";
  private String notificationProfileId;

  /**
   * A Channel Type ID
   */
  public enum ChannelTypeIdEnum {
    SMS("sms"),
    
    VOICE("voice"),
    
    EMAIL("email"),
    
    WEBHOOK("webhook");

    private String value;

    ChannelTypeIdEnum(String value) {
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
    public static ChannelTypeIdEnum fromValue(String value) {
      for (ChannelTypeIdEnum b : ChannelTypeIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHANNEL_TYPE_ID = "channel_type_id";
  private ChannelTypeIdEnum channelTypeId;

  public static final String JSON_PROPERTY_CHANNEL_DESTINATION = "channel_destination";
  private String channelDestination;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public NotificationChannel() { 
  }

  @JsonCreator
  public NotificationChannel(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt, 
    @JsonProperty(JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt
  ) {
    this();
    this.id = id;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * A UUID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12455643-3cf1-4683-ad23-1cd32f7d5e0a", value = "A UUID.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public NotificationChannel notificationProfileId(String notificationProfileId) {
    this.notificationProfileId = notificationProfileId;
    return this;
  }

   /**
   * A UUID reference to the associated Notification Profile.
   * @return notificationProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12455643-3cf1-4683-ad23-1cd32f7d5e0a", value = "A UUID reference to the associated Notification Profile.")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotificationProfileId() {
    return notificationProfileId;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationProfileId(String notificationProfileId) {
    this.notificationProfileId = notificationProfileId;
  }


  public NotificationChannel channelTypeId(ChannelTypeIdEnum channelTypeId) {
    this.channelTypeId = channelTypeId;
    return this;
  }

   /**
   * A Channel Type ID
   * @return channelTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Channel Type ID")
  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChannelTypeIdEnum getChannelTypeId() {
    return channelTypeId;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelTypeId(ChannelTypeIdEnum channelTypeId) {
    this.channelTypeId = channelTypeId;
  }


  public NotificationChannel channelDestination(String channelDestination) {
    this.channelDestination = channelDestination;
    return this;
  }

   /**
   * The destination associated with the channel type.
   * @return channelDestination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+13125550000", value = "The destination associated with the channel type.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelDestination() {
    return channelDestination;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelDestination(String channelDestination) {
    this.channelDestination = channelDestination;
  }


   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-10-15T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-10-15T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




  /**
   * Return true if this NotificationChannel object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannel notificationChannel = (NotificationChannel) o;
    return Objects.equals(this.id, notificationChannel.id) &&
        Objects.equals(this.notificationProfileId, notificationChannel.notificationProfileId) &&
        Objects.equals(this.channelTypeId, notificationChannel.channelTypeId) &&
        Objects.equals(this.channelDestination, notificationChannel.channelDestination) &&
        Objects.equals(this.createdAt, notificationChannel.createdAt) &&
        Objects.equals(this.updatedAt, notificationChannel.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, notificationProfileId, channelTypeId, channelDestination, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notificationProfileId: ").append(toIndentedString(notificationProfileId)).append("\n");
    sb.append("    channelTypeId: ").append(toIndentedString(channelTypeId)).append("\n");
    sb.append("    channelDestination: ").append(toIndentedString(channelDestination)).append("\n");
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

