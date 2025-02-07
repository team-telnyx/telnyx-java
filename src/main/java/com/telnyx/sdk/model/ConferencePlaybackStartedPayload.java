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
 * ConferencePlaybackStartedPayload
 */
@JsonPropertyOrder({
  ConferencePlaybackStartedPayload.JSON_PROPERTY_CONNECTION_ID,
  ConferencePlaybackStartedPayload.JSON_PROPERTY_CREATOR_CALL_SESSION_ID,
  ConferencePlaybackStartedPayload.JSON_PROPERTY_CONFERENCE_ID,
  ConferencePlaybackStartedPayload.JSON_PROPERTY_MEDIA_URL,
  ConferencePlaybackStartedPayload.JSON_PROPERTY_MEDIA_NAME,
  ConferencePlaybackStartedPayload.JSON_PROPERTY_OCCURRED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ConferencePlaybackStartedPayload {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CREATOR_CALL_SESSION_ID = "creator_call_session_id";
  private String creatorCallSessionId;

  public static final String JSON_PROPERTY_CONFERENCE_ID = "conference_id";
  private String conferenceId;

  public static final String JSON_PROPERTY_MEDIA_URL = "media_url";
  private String mediaUrl;

  public static final String JSON_PROPERTY_MEDIA_NAME = "media_name";
  private String mediaName;

  public static final String JSON_PROPERTY_OCCURRED_AT = "occurred_at";
  private OffsetDateTime occurredAt;

  public ConferencePlaybackStartedPayload() { 
  }

  public ConferencePlaybackStartedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Call Control App ID (formerly Telnyx connection ID) used in the call.
   * @return connectionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Call Control App ID (formerly Telnyx connection ID) used in the call.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public ConferencePlaybackStartedPayload creatorCallSessionId(String creatorCallSessionId) {
    this.creatorCallSessionId = creatorCallSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session that started the conference.
   * @return creatorCallSessionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID that is unique to the call session that started the conference.")
  @JsonProperty(JSON_PROPERTY_CREATOR_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorCallSessionId() {
    return creatorCallSessionId;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatorCallSessionId(String creatorCallSessionId) {
    this.creatorCallSessionId = creatorCallSessionId;
  }


  public ConferencePlaybackStartedPayload conferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * ID of the conference the text was spoken in.
   * @return conferenceId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID of the conference the text was spoken in.")
  @JsonProperty(JSON_PROPERTY_CONFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConferenceId() {
    return conferenceId;
  }


  @JsonProperty(JSON_PROPERTY_CONFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  public ConferencePlaybackStartedPayload mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The audio URL being played back, if audio_url has been used to start.
   * @return mediaUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/audio.wav", value = "The audio URL being played back, if audio_url has been used to start.")
  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaUrl() {
    return mediaUrl;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }


  public ConferencePlaybackStartedPayload mediaName(String mediaName) {
    this.mediaName = mediaName;
    return this;
  }

   /**
   * The name of the audio media file being played back, if media_name has been used to start.
   * @return mediaName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "my_media_uploaded_to_media_storage_api", value = "The name of the audio media file being played back, if media_name has been used to start.")
  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMediaName() {
    return mediaName;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediaName(String mediaName) {
    this.mediaName = mediaName;
  }


  public ConferencePlaybackStartedPayload occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when the event occurred.
   * @return occurredAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 datetime of when the event occurred.")
  @JsonProperty(JSON_PROPERTY_OCCURRED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }


  @JsonProperty(JSON_PROPERTY_OCCURRED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  /**
   * Return true if this ConferencePlaybackStarted_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferencePlaybackStartedPayload conferencePlaybackStartedPayload = (ConferencePlaybackStartedPayload) o;
    return Objects.equals(this.connectionId, conferencePlaybackStartedPayload.connectionId) &&
        Objects.equals(this.creatorCallSessionId, conferencePlaybackStartedPayload.creatorCallSessionId) &&
        Objects.equals(this.conferenceId, conferencePlaybackStartedPayload.conferenceId) &&
        Objects.equals(this.mediaUrl, conferencePlaybackStartedPayload.mediaUrl) &&
        Objects.equals(this.mediaName, conferencePlaybackStartedPayload.mediaName) &&
        Objects.equals(this.occurredAt, conferencePlaybackStartedPayload.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, creatorCallSessionId, conferenceId, mediaUrl, mediaName, occurredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferencePlaybackStartedPayload {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    creatorCallSessionId: ").append(toIndentedString(creatorCallSessionId)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaName: ").append(toIndentedString(mediaName)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
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

