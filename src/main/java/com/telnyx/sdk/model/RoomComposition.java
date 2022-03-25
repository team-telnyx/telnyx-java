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
import com.telnyx.sdk.model.VideoRegion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * RoomComposition
 */
@JsonPropertyOrder({
  RoomComposition.JSON_PROPERTY_ID,
  RoomComposition.JSON_PROPERTY_ROOM_ID,
  RoomComposition.JSON_PROPERTY_SESSION_ID,
  RoomComposition.JSON_PROPERTY_USER_ID,
  RoomComposition.JSON_PROPERTY_STATUS,
  RoomComposition.JSON_PROPERTY_SIZE_MB,
  RoomComposition.JSON_PROPERTY_DOWNLOAD_URL,
  RoomComposition.JSON_PROPERTY_DURATION_SECS,
  RoomComposition.JSON_PROPERTY_FORMAT,
  RoomComposition.JSON_PROPERTY_CREATED_AT,
  RoomComposition.JSON_PROPERTY_UPDATED_AT,
  RoomComposition.JSON_PROPERTY_ENDED_AT,
  RoomComposition.JSON_PROPERTY_STARTED_AT,
  RoomComposition.JSON_PROPERTY_COMPLETED_AT,
  RoomComposition.JSON_PROPERTY_VIDEO_LAYOUT,
  RoomComposition.JSON_PROPERTY_WEBHOOK_EVENT_URL,
  RoomComposition.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
  RoomComposition.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS,
  RoomComposition.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoomComposition {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ROOM_ID = "room_id";
  private UUID roomId;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private UUID sessionId;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private UUID userId;

  /**
   * Shows the room composition status.
   */
  public enum StatusEnum {
    COMPLETED("completed"),
    
    ENQUEUED("enqueued"),
    
    PROCESSING("processing");

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

  public static final String JSON_PROPERTY_SIZE_MB = "size_mb";
  private Float sizeMb;

  public static final String JSON_PROPERTY_DOWNLOAD_URL = "download_url";
  private String downloadUrl;

  public static final String JSON_PROPERTY_DURATION_SECS = "duration_secs";
  private Integer durationSecs;

  /**
   * Shows format of the room composition.
   */
  public enum FormatEnum {
    MP4("mp4");

    private String value;

    FormatEnum(String value) {
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
    public static FormatEnum fromValue(String value) {
      for (FormatEnum b : FormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORMAT = "format";
  private FormatEnum format;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_ENDED_AT = "ended_at";
  private String endedAt;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private String startedAt;

  public static final String JSON_PROPERTY_COMPLETED_AT = "completed_at";
  private String completedAt;

  public static final String JSON_PROPERTY_VIDEO_LAYOUT = "video_layout";
  private Map<String, VideoRegion> videoLayout = null;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL = "webhook_event_url";
  private String webhookEventUrl;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL = "webhook_event_failover_url";
  private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<String>of("");

  public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS = "webhook_timeout_secs";
  private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public RoomComposition() { 
  }

  public RoomComposition id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the room composition.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0", value = "A unique identifier for the room composition.")
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


  public RoomComposition roomId(UUID roomId) {
    this.roomId = roomId;
    return this;
  }

   /**
   * Identify the room associated with the room composition.
   * @return roomId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777b0", value = "Identify the room associated with the room composition.")
  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRoomId() {
    return roomId;
  }


  @JsonProperty(JSON_PROPERTY_ROOM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoomId(UUID roomId) {
    this.roomId = roomId;
  }


  public RoomComposition sessionId(UUID sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Identify the room session associated with the room composition.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777b0", value = "Identify the room session associated with the room composition.")
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }


  public RoomComposition userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Identify the user associated with the room composition.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777b0", value = "Identify the user associated with the room composition.")
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


  public RoomComposition status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Shows the room composition status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "completed", value = "Shows the room composition status.")
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


  public RoomComposition sizeMb(Float sizeMb) {
    this.sizeMb = sizeMb;
    return this;
  }

   /**
   * Shows the room composition size in MB.
   * @return sizeMb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.5", value = "Shows the room composition size in MB.")
  @JsonProperty(JSON_PROPERTY_SIZE_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getSizeMb() {
    return sizeMb;
  }


  @JsonProperty(JSON_PROPERTY_SIZE_MB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSizeMb(Float sizeMb) {
    this.sizeMb = sizeMb;
  }


  public RoomComposition downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * Url to download the composition.
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.example.com", value = "Url to download the composition.")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDownloadUrl() {
    return downloadUrl;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public RoomComposition durationSecs(Integer durationSecs) {
    this.durationSecs = durationSecs;
    return this;
  }

   /**
   * Shows the room composition duration in seconds.
   * @return durationSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "67", value = "Shows the room composition duration in seconds.")
  @JsonProperty(JSON_PROPERTY_DURATION_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDurationSecs() {
    return durationSecs;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationSecs(Integer durationSecs) {
    this.durationSecs = durationSecs;
  }


  public RoomComposition format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * Shows format of the room composition.
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mp4", value = "Shows format of the room composition.")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormatEnum getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public RoomComposition createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room composition was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room composition was created.")
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


  public RoomComposition updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room composition was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room composition was updated.")
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


  public RoomComposition endedAt(String endedAt) {
    this.endedAt = endedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room composition has ended.
   * @return endedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room composition has ended.")
  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndedAt() {
    return endedAt;
  }


  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndedAt(String endedAt) {
    this.endedAt = endedAt;
  }


  public RoomComposition startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room composition has stated.
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room composition has stated.")
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public RoomComposition completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * ISO 8601 timestamp when the room composition has completed.
   * @return completedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-26T17:51:59.588408Z", value = "ISO 8601 timestamp when the room composition has completed.")
  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompletedAt() {
    return completedAt;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }


  public RoomComposition videoLayout(Map<String, VideoRegion> videoLayout) {
    this.videoLayout = videoLayout;
    return this;
  }

  public RoomComposition putVideoLayoutItem(String key, VideoRegion videoLayoutItem) {
    if (this.videoLayout == null) {
      this.videoLayout = new HashMap<>();
    }
    this.videoLayout.put(key, videoLayoutItem);
    return this;
  }

   /**
   * Describes the video layout of the room composition in terms of regions. Limited to 2 regions.
   * @return videoLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes the video layout of the room composition in terms of regions. Limited to 2 regions.")
  @JsonProperty(JSON_PROPERTY_VIDEO_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, VideoRegion> getVideoLayout() {
    return videoLayout;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_LAYOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoLayout(Map<String, VideoRegion> videoLayout) {
    this.videoLayout = videoLayout;
  }


  public RoomComposition webhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
    return this;
  }

   /**
   * The URL where webhooks related to this room composition will be sent. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.com", value = "The URL where webhooks related to this room composition will be sent. Must include a scheme, such as 'https'.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookEventUrl() {
    return webhookEventUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookEventUrl(String webhookEventUrl) {
    this.webhookEventUrl = webhookEventUrl;
  }


  public RoomComposition webhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
    return this;
  }

   /**
   * The failover URL where webhooks related to this room composition will be sent if sending to the primary URL fails. Must include a scheme, such as &#39;https&#39;.
   * @return webhookEventFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://failover.example.com", value = "The failover URL where webhooks related to this room composition will be sent if sending to the primary URL fails. Must include a scheme, such as 'https'.")
  @JsonIgnore

  public String getWebhookEventFailoverUrl() {
        return webhookEventFailoverUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getWebhookEventFailoverUrl_JsonNullable() {
    return webhookEventFailoverUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL)
  public void setWebhookEventFailoverUrl_JsonNullable(JsonNullable<String> webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = webhookEventFailoverUrl;
  }

  public void setWebhookEventFailoverUrl(String webhookEventFailoverUrl) {
    this.webhookEventFailoverUrl = JsonNullable.<String>of(webhookEventFailoverUrl);
  }


  public RoomComposition webhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
    return this;
  }

   /**
   * Specifies how many seconds to wait before timing out a webhook.
   * minimum: 0
   * maximum: 30
   * @return webhookTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "Specifies how many seconds to wait before timing out a webhook.")
  @JsonIgnore

  public Integer getWebhookTimeoutSecs() {
        return webhookTimeoutSecs.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getWebhookTimeoutSecs_JsonNullable() {
    return webhookTimeoutSecs;
  }
  
  @JsonProperty(JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS)
  public void setWebhookTimeoutSecs_JsonNullable(JsonNullable<Integer> webhookTimeoutSecs) {
    this.webhookTimeoutSecs = webhookTimeoutSecs;
  }

  public void setWebhookTimeoutSecs(Integer webhookTimeoutSecs) {
    this.webhookTimeoutSecs = JsonNullable.<Integer>of(webhookTimeoutSecs);
  }


   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "room_composition", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




  /**
   * Return true if this RoomComposition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomComposition roomComposition = (RoomComposition) o;
    return Objects.equals(this.id, roomComposition.id) &&
        Objects.equals(this.roomId, roomComposition.roomId) &&
        Objects.equals(this.sessionId, roomComposition.sessionId) &&
        Objects.equals(this.userId, roomComposition.userId) &&
        Objects.equals(this.status, roomComposition.status) &&
        Objects.equals(this.sizeMb, roomComposition.sizeMb) &&
        Objects.equals(this.downloadUrl, roomComposition.downloadUrl) &&
        Objects.equals(this.durationSecs, roomComposition.durationSecs) &&
        Objects.equals(this.format, roomComposition.format) &&
        Objects.equals(this.createdAt, roomComposition.createdAt) &&
        Objects.equals(this.updatedAt, roomComposition.updatedAt) &&
        Objects.equals(this.endedAt, roomComposition.endedAt) &&
        Objects.equals(this.startedAt, roomComposition.startedAt) &&
        Objects.equals(this.completedAt, roomComposition.completedAt) &&
        Objects.equals(this.videoLayout, roomComposition.videoLayout) &&
        Objects.equals(this.webhookEventUrl, roomComposition.webhookEventUrl) &&
        equalsNullable(this.webhookEventFailoverUrl, roomComposition.webhookEventFailoverUrl) &&
        equalsNullable(this.webhookTimeoutSecs, roomComposition.webhookTimeoutSecs) &&
        Objects.equals(this.recordType, roomComposition.recordType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, roomId, sessionId, userId, status, sizeMb, downloadUrl, durationSecs, format, createdAt, updatedAt, endedAt, startedAt, completedAt, videoLayout, webhookEventUrl, hashCodeNullable(webhookEventFailoverUrl), hashCodeNullable(webhookTimeoutSecs), recordType);
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
    sb.append("class RoomComposition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sizeMb: ").append(toIndentedString(sizeMb)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    durationSecs: ").append(toIndentedString(durationSecs)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    videoLayout: ").append(toIndentedString(videoLayout)).append("\n");
    sb.append("    webhookEventUrl: ").append(toIndentedString(webhookEventUrl)).append("\n");
    sb.append("    webhookEventFailoverUrl: ").append(toIndentedString(webhookEventFailoverUrl)).append("\n");
    sb.append("    webhookTimeoutSecs: ").append(toIndentedString(webhookTimeoutSecs)).append("\n");
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
