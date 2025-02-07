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
import com.telnyx.sdk.model.CallRecordingSavedPayloadPublicRecordingUrls;
import com.telnyx.sdk.model.CallRecordingSavedPayloadRecordingUrls;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallRecordingSavedPayload
 */
@JsonPropertyOrder({
  CallRecordingSavedPayload.JSON_PROPERTY_CALL_LEG_ID,
  CallRecordingSavedPayload.JSON_PROPERTY_CALL_SESSION_ID,
  CallRecordingSavedPayload.JSON_PROPERTY_CONNECTION_ID,
  CallRecordingSavedPayload.JSON_PROPERTY_CLIENT_STATE,
  CallRecordingSavedPayload.JSON_PROPERTY_RECORDING_STARTED_AT,
  CallRecordingSavedPayload.JSON_PROPERTY_RECORDING_ENDED_AT,
  CallRecordingSavedPayload.JSON_PROPERTY_CHANNELS,
  CallRecordingSavedPayload.JSON_PROPERTY_RECORDING_URLS,
  CallRecordingSavedPayload.JSON_PROPERTY_PUBLIC_RECORDING_URLS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CallRecordingSavedPayload {
  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_RECORDING_STARTED_AT = "recording_started_at";
  private OffsetDateTime recordingStartedAt;

  public static final String JSON_PROPERTY_RECORDING_ENDED_AT = "recording_ended_at";
  private OffsetDateTime recordingEndedAt;

  /**
   * Whether recording was recorded in &#x60;single&#x60; or &#x60;dual&#x60; channel.
   */
  public enum ChannelsEnum {
    SINGLE(String.valueOf("single")),
    
    DUAL(String.valueOf("dual"));

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

  public static final String JSON_PROPERTY_RECORDING_URLS = "recording_urls";
  private CallRecordingSavedPayloadRecordingUrls recordingUrls;

  public static final String JSON_PROPERTY_PUBLIC_RECORDING_URLS = "public_recording_urls";
  private CallRecordingSavedPayloadPublicRecordingUrls publicRecordingUrls;

  public CallRecordingSavedPayload() { 
  }

  public CallRecordingSavedPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", value = "ID that is unique to the call and can be used to correlate webhook events.")
  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallLegId() {
    return callLegId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public CallRecordingSavedPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.
   * @return callSessionId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallSessionId() {
    return callSessionId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public CallRecordingSavedPayload connectionId(String connectionId) {
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


  public CallRecordingSavedPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "State received from a command.")
  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientState() {
    return clientState;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public CallRecordingSavedPayload recordingStartedAt(OffsetDateTime recordingStartedAt) {
    this.recordingStartedAt = recordingStartedAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when recording started.
   * @return recordingStartedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:20:27.521992Z", value = "ISO 8601 datetime of when recording started.")
  @JsonProperty(JSON_PROPERTY_RECORDING_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRecordingStartedAt() {
    return recordingStartedAt;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordingStartedAt(OffsetDateTime recordingStartedAt) {
    this.recordingStartedAt = recordingStartedAt;
  }


  public CallRecordingSavedPayload recordingEndedAt(OffsetDateTime recordingEndedAt) {
    this.recordingEndedAt = recordingEndedAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when recording ended.
   * @return recordingEndedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521992Z", value = "ISO 8601 datetime of when recording ended.")
  @JsonProperty(JSON_PROPERTY_RECORDING_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRecordingEndedAt() {
    return recordingEndedAt;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordingEndedAt(OffsetDateTime recordingEndedAt) {
    this.recordingEndedAt = recordingEndedAt;
  }


  public CallRecordingSavedPayload channels(ChannelsEnum channels) {
    this.channels = channels;
    return this;
  }

   /**
   * Whether recording was recorded in &#x60;single&#x60; or &#x60;dual&#x60; channel.
   * @return channels
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "single", value = "Whether recording was recorded in `single` or `dual` channel.")
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChannelsEnum getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannels(ChannelsEnum channels) {
    this.channels = channels;
  }


  public CallRecordingSavedPayload recordingUrls(CallRecordingSavedPayloadRecordingUrls recordingUrls) {
    this.recordingUrls = recordingUrls;
    return this;
  }

   /**
   * Get recordingUrls
   * @return recordingUrls
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECORDING_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecordingSavedPayloadRecordingUrls getRecordingUrls() {
    return recordingUrls;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordingUrls(CallRecordingSavedPayloadRecordingUrls recordingUrls) {
    this.recordingUrls = recordingUrls;
  }


  public CallRecordingSavedPayload publicRecordingUrls(CallRecordingSavedPayloadPublicRecordingUrls publicRecordingUrls) {
    this.publicRecordingUrls = publicRecordingUrls;
    return this;
  }

   /**
   * Get publicRecordingUrls
   * @return publicRecordingUrls
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLIC_RECORDING_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecordingSavedPayloadPublicRecordingUrls getPublicRecordingUrls() {
    return publicRecordingUrls;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_RECORDING_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicRecordingUrls(CallRecordingSavedPayloadPublicRecordingUrls publicRecordingUrls) {
    this.publicRecordingUrls = publicRecordingUrls;
  }


  /**
   * Return true if this CallRecordingSaved_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallRecordingSavedPayload callRecordingSavedPayload = (CallRecordingSavedPayload) o;
    return Objects.equals(this.callLegId, callRecordingSavedPayload.callLegId) &&
        Objects.equals(this.callSessionId, callRecordingSavedPayload.callSessionId) &&
        Objects.equals(this.connectionId, callRecordingSavedPayload.connectionId) &&
        Objects.equals(this.clientState, callRecordingSavedPayload.clientState) &&
        Objects.equals(this.recordingStartedAt, callRecordingSavedPayload.recordingStartedAt) &&
        Objects.equals(this.recordingEndedAt, callRecordingSavedPayload.recordingEndedAt) &&
        Objects.equals(this.channels, callRecordingSavedPayload.channels) &&
        Objects.equals(this.recordingUrls, callRecordingSavedPayload.recordingUrls) &&
        Objects.equals(this.publicRecordingUrls, callRecordingSavedPayload.publicRecordingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callLegId, callSessionId, connectionId, clientState, recordingStartedAt, recordingEndedAt, channels, recordingUrls, publicRecordingUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallRecordingSavedPayload {\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    recordingStartedAt: ").append(toIndentedString(recordingStartedAt)).append("\n");
    sb.append("    recordingEndedAt: ").append(toIndentedString(recordingEndedAt)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    recordingUrls: ").append(toIndentedString(recordingUrls)).append("\n");
    sb.append("    publicRecordingUrls: ").append(toIndentedString(publicRecordingUrls)).append("\n");
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

