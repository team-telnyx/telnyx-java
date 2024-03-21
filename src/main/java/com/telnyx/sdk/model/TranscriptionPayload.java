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
import com.telnyx.sdk.model.TranscriptionPayloadTranscriptionData;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * TranscriptionPayload
 */
@JsonPropertyOrder({
  TranscriptionPayload.JSON_PROPERTY_CALL_CONTROL_ID,
  TranscriptionPayload.JSON_PROPERTY_CALL_LEG_ID,
  TranscriptionPayload.JSON_PROPERTY_CALL_SESSION_ID,
  TranscriptionPayload.JSON_PROPERTY_CLIENT_STATE,
  TranscriptionPayload.JSON_PROPERTY_CONNECTION_ID,
  TranscriptionPayload.JSON_PROPERTY_TRANSCRIPTION_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class TranscriptionPayload {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_TRANSCRIPTION_DATA = "transcription_data";
  private TranscriptionPayloadTranscriptionData transcriptionData;

  public TranscriptionPayload() { 
  }

  public TranscriptionPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Unique identifier and token for controlling the call.
   * @return callControlId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg", value = "Unique identifier and token for controlling the call.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallControlId() {
    return callControlId;
  }


  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public TranscriptionPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @javax.annotation.Nullable
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


  public TranscriptionPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.
   * @return callSessionId
  **/
  @javax.annotation.Nullable
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


  public TranscriptionPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
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


  public TranscriptionPayload connectionId(String connectionId) {
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


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public TranscriptionPayload transcriptionData(TranscriptionPayloadTranscriptionData transcriptionData) {
    this.transcriptionData = transcriptionData;
    return this;
  }

   /**
   * Get transcriptionData
   * @return transcriptionData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TranscriptionPayloadTranscriptionData getTranscriptionData() {
    return transcriptionData;
  }


  @JsonProperty(JSON_PROPERTY_TRANSCRIPTION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTranscriptionData(TranscriptionPayloadTranscriptionData transcriptionData) {
    this.transcriptionData = transcriptionData;
  }


  /**
   * Return true if this Transcription_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionPayload transcriptionPayload = (TranscriptionPayload) o;
    return Objects.equals(this.callControlId, transcriptionPayload.callControlId) &&
        Objects.equals(this.callLegId, transcriptionPayload.callLegId) &&
        Objects.equals(this.callSessionId, transcriptionPayload.callSessionId) &&
        Objects.equals(this.clientState, transcriptionPayload.clientState) &&
        Objects.equals(this.connectionId, transcriptionPayload.connectionId) &&
        Objects.equals(this.transcriptionData, transcriptionPayload.transcriptionData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, callLegId, callSessionId, clientState, connectionId, transcriptionData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionPayload {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    transcriptionData: ").append(toIndentedString(transcriptionData)).append("\n");
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

