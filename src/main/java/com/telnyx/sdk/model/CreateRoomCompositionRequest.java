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
 * CreateRoomCompositionRequest
 */
@JsonPropertyOrder({
  CreateRoomCompositionRequest.JSON_PROPERTY_FORMAT,
  CreateRoomCompositionRequest.JSON_PROPERTY_RESOLUTION,
  CreateRoomCompositionRequest.JSON_PROPERTY_SESSION_ID,
  CreateRoomCompositionRequest.JSON_PROPERTY_VIDEO_LAYOUT,
  CreateRoomCompositionRequest.JSON_PROPERTY_WEBHOOK_EVENT_URL,
  CreateRoomCompositionRequest.JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL,
  CreateRoomCompositionRequest.JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateRoomCompositionRequest {
  public static final String JSON_PROPERTY_FORMAT = "format";
  private JsonNullable<String> format = JsonNullable.<String>of("mp4");

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private JsonNullable<String> resolution = JsonNullable.<String>of("1280x720");

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private JsonNullable<UUID> sessionId = JsonNullable.<UUID>undefined();

  public static final String JSON_PROPERTY_VIDEO_LAYOUT = "video_layout";
  private Map<String, VideoRegion> videoLayout = null;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_URL = "webhook_event_url";
  private String webhookEventUrl;

  public static final String JSON_PROPERTY_WEBHOOK_EVENT_FAILOVER_URL = "webhook_event_failover_url";
  private JsonNullable<String> webhookEventFailoverUrl = JsonNullable.<String>of("");

  public static final String JSON_PROPERTY_WEBHOOK_TIMEOUT_SECS = "webhook_timeout_secs";
  private JsonNullable<Integer> webhookTimeoutSecs = JsonNullable.<Integer>undefined();

  public CreateRoomCompositionRequest() { 
  }

  public CreateRoomCompositionRequest format(String format) {
    this.format = JsonNullable.<String>of(format);
    return this;
  }

   /**
   * The desired format of the room composition.
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mp4", value = "The desired format of the room composition.")
  @JsonIgnore

  public String getFormat() {
        return format.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFormat_JsonNullable() {
    return format;
  }
  
  @JsonProperty(JSON_PROPERTY_FORMAT)
  public void setFormat_JsonNullable(JsonNullable<String> format) {
    this.format = format;
  }

  public void setFormat(String format) {
    this.format = JsonNullable.<String>of(format);
  }


  public CreateRoomCompositionRequest resolution(String resolution) {
    this.resolution = JsonNullable.<String>of(resolution);
    return this;
  }

   /**
   * The desired resolution (width/height in pixels) of the resulting video of the room composition. Both width and height are required to be between 16 and 1280; and width * height should not exceed 1280 * 720
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "800x600", value = "The desired resolution (width/height in pixels) of the resulting video of the room composition. Both width and height are required to be between 16 and 1280; and width * height should not exceed 1280 * 720")
  @JsonIgnore

  public String getResolution() {
        return resolution.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getResolution_JsonNullable() {
    return resolution;
  }
  
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  public void setResolution_JsonNullable(JsonNullable<String> resolution) {
    this.resolution = resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = JsonNullable.<String>of(resolution);
  }


  public CreateRoomCompositionRequest sessionId(UUID sessionId) {
    this.sessionId = JsonNullable.<UUID>of(sessionId);
    return this;
  }

   /**
   * id of the room session associated with the room composition.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777b0", value = "id of the room session associated with the room composition.")
  @JsonIgnore

  public UUID getSessionId() {
        return sessionId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UUID> getSessionId_JsonNullable() {
    return sessionId;
  }
  
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  public void setSessionId_JsonNullable(JsonNullable<UUID> sessionId) {
    this.sessionId = sessionId;
  }

  public void setSessionId(UUID sessionId) {
    this.sessionId = JsonNullable.<UUID>of(sessionId);
  }


  public CreateRoomCompositionRequest videoLayout(Map<String, VideoRegion> videoLayout) {
    this.videoLayout = videoLayout;
    return this;
  }

  public CreateRoomCompositionRequest putVideoLayoutItem(String key, VideoRegion videoLayoutItem) {
    if (this.videoLayout == null) {
      this.videoLayout = new HashMap<>();
    }
    this.videoLayout.put(key, videoLayoutItem);
    return this;
  }

   /**
   * Describes the video layout of the room composition in terms of regions.
   * @return videoLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes the video layout of the room composition in terms of regions.")
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


  public CreateRoomCompositionRequest webhookEventUrl(String webhookEventUrl) {
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


  public CreateRoomCompositionRequest webhookEventFailoverUrl(String webhookEventFailoverUrl) {
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


  public CreateRoomCompositionRequest webhookTimeoutSecs(Integer webhookTimeoutSecs) {
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
   * Return true if this CreateRoomCompositionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoomCompositionRequest createRoomCompositionRequest = (CreateRoomCompositionRequest) o;
    return equalsNullable(this.format, createRoomCompositionRequest.format) &&
        equalsNullable(this.resolution, createRoomCompositionRequest.resolution) &&
        equalsNullable(this.sessionId, createRoomCompositionRequest.sessionId) &&
        Objects.equals(this.videoLayout, createRoomCompositionRequest.videoLayout) &&
        Objects.equals(this.webhookEventUrl, createRoomCompositionRequest.webhookEventUrl) &&
        equalsNullable(this.webhookEventFailoverUrl, createRoomCompositionRequest.webhookEventFailoverUrl) &&
        equalsNullable(this.webhookTimeoutSecs, createRoomCompositionRequest.webhookTimeoutSecs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(format), hashCodeNullable(resolution), hashCodeNullable(sessionId), videoLayout, webhookEventUrl, hashCodeNullable(webhookEventFailoverUrl), hashCodeNullable(webhookTimeoutSecs));
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
    sb.append("class CreateRoomCompositionRequest {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    videoLayout: ").append(toIndentedString(videoLayout)).append("\n");
    sb.append("    webhookEventUrl: ").append(toIndentedString(webhookEventUrl)).append("\n");
    sb.append("    webhookEventFailoverUrl: ").append(toIndentedString(webhookEventFailoverUrl)).append("\n");
    sb.append("    webhookTimeoutSecs: ").append(toIndentedString(webhookTimeoutSecs)).append("\n");
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
