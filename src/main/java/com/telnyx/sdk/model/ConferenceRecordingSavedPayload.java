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
import com.telnyx.sdk.model.CallRecordingSavedPayloadPublicRecordingUrls;
import com.telnyx.sdk.model.CallRecordingSavedPayloadRecordingUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ConferenceRecordingSavedPayload
 */
@JsonPropertyOrder({
  ConferenceRecordingSavedPayload.JSON_PROPERTY_CALL_CONTROL_ID,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_CHANNELS,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_CONFERENCE_ID,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_CONNECTION_ID,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_FORMAT,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_PUBLIC_RECORDING_URLS,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_RECORDING_ENDED_AT,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_RECORDING_ID,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_RECORDING_STARTED_AT,
  ConferenceRecordingSavedPayload.JSON_PROPERTY_RECORDING_URLS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConferenceRecordingSavedPayload {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  /**
   * Whether recording was recorded in &#x60;single&#x60; or &#x60;dual&#x60; channel.
   */
  public enum ChannelsEnum {
    SINGLE("single"),
    
    DUAL("dual");

    private String value;

    ChannelsEnum(String value) {
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
    public static ChannelsEnum fromValue(String value) {
      for (ChannelsEnum b : ChannelsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private ChannelsEnum channels;

  public static final String JSON_PROPERTY_CONFERENCE_ID = "conference_id";
  private UUID conferenceId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  /**
   * The audio file format used when storing the call recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;.
   */
  public enum FormatEnum {
    WAV("wav"),
    
    MP3("mp3");

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

  public static final String JSON_PROPERTY_PUBLIC_RECORDING_URLS = "public_recording_urls";
  private CallRecordingSavedPayloadPublicRecordingUrls publicRecordingUrls;

  public static final String JSON_PROPERTY_RECORDING_ENDED_AT = "recording_ended_at";
  private OffsetDateTime recordingEndedAt;

  public static final String JSON_PROPERTY_RECORDING_ID = "recording_id";
  private UUID recordingId;

  public static final String JSON_PROPERTY_RECORDING_STARTED_AT = "recording_started_at";
  private OffsetDateTime recordingStartedAt;

  public static final String JSON_PROPERTY_RECORDING_URLS = "recording_urls";
  private CallRecordingSavedPayloadRecordingUrls recordingUrls;


  public ConferenceRecordingSavedPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Participant&#39;s call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ", value = "Participant's call ID used to issue commands via Call Control API.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallControlId() {
    return callControlId;
  }


  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public ConferenceRecordingSavedPayload channels(ChannelsEnum channels) {
    this.channels = channels;
    return this;
  }

   /**
   * Whether recording was recorded in &#x60;single&#x60; or &#x60;dual&#x60; channel.
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "single", value = "Whether recording was recorded in `single` or `dual` channel.")
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChannelsEnum getChannels() {
    return channels;
  }


  public void setChannels(ChannelsEnum channels) {
    this.channels = channels;
  }


  public ConferenceRecordingSavedPayload conferenceId(UUID conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * ID of the conference that is being recorded.
   * @return conferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID of the conference that is being recorded.")
  @JsonProperty(JSON_PROPERTY_CONFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getConferenceId() {
    return conferenceId;
  }


  public void setConferenceId(UUID conferenceId) {
    this.conferenceId = conferenceId;
  }


  public ConferenceRecordingSavedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Call Control App ID (formerly Telnyx connection ID) used in the call.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Call Control App ID (formerly Telnyx connection ID) used in the call.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public ConferenceRecordingSavedPayload format(FormatEnum format) {
    this.format = format;
    return this;
  }

   /**
   * The audio file format used when storing the call recording. Can be either &#x60;mp3&#x60; or &#x60;wav&#x60;.
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mp3", value = "The audio file format used when storing the call recording. Can be either `mp3` or `wav`.")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormatEnum getFormat() {
    return format;
  }


  public void setFormat(FormatEnum format) {
    this.format = format;
  }


  public ConferenceRecordingSavedPayload publicRecordingUrls(CallRecordingSavedPayloadPublicRecordingUrls publicRecordingUrls) {
    this.publicRecordingUrls = publicRecordingUrls;
    return this;
  }

   /**
   * Get publicRecordingUrls
   * @return publicRecordingUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLIC_RECORDING_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecordingSavedPayloadPublicRecordingUrls getPublicRecordingUrls() {
    return publicRecordingUrls;
  }


  public void setPublicRecordingUrls(CallRecordingSavedPayloadPublicRecordingUrls publicRecordingUrls) {
    this.publicRecordingUrls = publicRecordingUrls;
  }


  public ConferenceRecordingSavedPayload recordingEndedAt(OffsetDateTime recordingEndedAt) {
    this.recordingEndedAt = recordingEndedAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when recording ended.
   * @return recordingEndedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521992Z", value = "ISO 8601 datetime of when recording ended.")
  @JsonProperty(JSON_PROPERTY_RECORDING_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRecordingEndedAt() {
    return recordingEndedAt;
  }


  public void setRecordingEndedAt(OffsetDateTime recordingEndedAt) {
    this.recordingEndedAt = recordingEndedAt;
  }


  public ConferenceRecordingSavedPayload recordingId(UUID recordingId) {
    this.recordingId = recordingId;
    return this;
  }

   /**
   * ID of the conference recording.
   * @return recordingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4577f9a2-cf0e-44f3-ac57-9f95fb03fa47", value = "ID of the conference recording.")
  @JsonProperty(JSON_PROPERTY_RECORDING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRecordingId() {
    return recordingId;
  }


  public void setRecordingId(UUID recordingId) {
    this.recordingId = recordingId;
  }


  public ConferenceRecordingSavedPayload recordingStartedAt(OffsetDateTime recordingStartedAt) {
    this.recordingStartedAt = recordingStartedAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when recording started.
   * @return recordingStartedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:20:27.521992Z", value = "ISO 8601 datetime of when recording started.")
  @JsonProperty(JSON_PROPERTY_RECORDING_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRecordingStartedAt() {
    return recordingStartedAt;
  }


  public void setRecordingStartedAt(OffsetDateTime recordingStartedAt) {
    this.recordingStartedAt = recordingStartedAt;
  }


  public ConferenceRecordingSavedPayload recordingUrls(CallRecordingSavedPayloadRecordingUrls recordingUrls) {
    this.recordingUrls = recordingUrls;
    return this;
  }

   /**
   * Get recordingUrls
   * @return recordingUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECORDING_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecordingSavedPayloadRecordingUrls getRecordingUrls() {
    return recordingUrls;
  }


  public void setRecordingUrls(CallRecordingSavedPayloadRecordingUrls recordingUrls) {
    this.recordingUrls = recordingUrls;
  }


  /**
   * Return true if this ConferenceRecordingSaved_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceRecordingSavedPayload conferenceRecordingSavedPayload = (ConferenceRecordingSavedPayload) o;
    return Objects.equals(this.callControlId, conferenceRecordingSavedPayload.callControlId) &&
        Objects.equals(this.channels, conferenceRecordingSavedPayload.channels) &&
        Objects.equals(this.conferenceId, conferenceRecordingSavedPayload.conferenceId) &&
        Objects.equals(this.connectionId, conferenceRecordingSavedPayload.connectionId) &&
        Objects.equals(this.format, conferenceRecordingSavedPayload.format) &&
        Objects.equals(this.publicRecordingUrls, conferenceRecordingSavedPayload.publicRecordingUrls) &&
        Objects.equals(this.recordingEndedAt, conferenceRecordingSavedPayload.recordingEndedAt) &&
        Objects.equals(this.recordingId, conferenceRecordingSavedPayload.recordingId) &&
        Objects.equals(this.recordingStartedAt, conferenceRecordingSavedPayload.recordingStartedAt) &&
        Objects.equals(this.recordingUrls, conferenceRecordingSavedPayload.recordingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, channels, conferenceId, connectionId, format, publicRecordingUrls, recordingEndedAt, recordingId, recordingStartedAt, recordingUrls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceRecordingSavedPayload {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    publicRecordingUrls: ").append(toIndentedString(publicRecordingUrls)).append("\n");
    sb.append("    recordingEndedAt: ").append(toIndentedString(recordingEndedAt)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
    sb.append("    recordingStartedAt: ").append(toIndentedString(recordingStartedAt)).append("\n");
    sb.append("    recordingUrls: ").append(toIndentedString(recordingUrls)).append("\n");
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

