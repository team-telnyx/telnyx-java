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
 * ConferenceParticipantSpeakStartedPayload
 */
@JsonPropertyOrder({
  ConferenceParticipantSpeakStartedPayload.JSON_PROPERTY_CALL_CONTROL_ID,
  ConferenceParticipantSpeakStartedPayload.JSON_PROPERTY_CALL_LEG_ID,
  ConferenceParticipantSpeakStartedPayload.JSON_PROPERTY_CALL_SESSION_ID,
  ConferenceParticipantSpeakStartedPayload.JSON_PROPERTY_CLIENT_STATE,
  ConferenceParticipantSpeakStartedPayload.JSON_PROPERTY_CONNECTION_ID,
  ConferenceParticipantSpeakStartedPayload.JSON_PROPERTY_CREATOR_CALL_SESSION_ID,
  ConferenceParticipantSpeakStartedPayload.JSON_PROPERTY_CONFERENCE_ID,
  ConferenceParticipantSpeakStartedPayload.JSON_PROPERTY_OCCURRED_AT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ConferenceParticipantSpeakStartedPayload {
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

  public static final String JSON_PROPERTY_CREATOR_CALL_SESSION_ID = "creator_call_session_id";
  private String creatorCallSessionId;

  public static final String JSON_PROPERTY_CONFERENCE_ID = "conference_id";
  private String conferenceId;

  public static final String JSON_PROPERTY_OCCURRED_AT = "occurred_at";
  private OffsetDateTime occurredAt;

  public ConferenceParticipantSpeakStartedPayload() { 
  }

  public ConferenceParticipantSpeakStartedPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Participant&#39;s call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg", value = "Participant's call ID used to issue commands via Call Control API.")
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


  public ConferenceParticipantSpeakStartedPayload callLegId(String callLegId) {
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


  public ConferenceParticipantSpeakStartedPayload callSessionId(String callSessionId) {
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


  public ConferenceParticipantSpeakStartedPayload clientState(String clientState) {
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


  public ConferenceParticipantSpeakStartedPayload connectionId(String connectionId) {
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


  public ConferenceParticipantSpeakStartedPayload creatorCallSessionId(String creatorCallSessionId) {
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


  public ConferenceParticipantSpeakStartedPayload conferenceId(String conferenceId) {
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


  public ConferenceParticipantSpeakStartedPayload occurredAt(OffsetDateTime occurredAt) {
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
   * Return true if this ConferenceParticipantSpeakStarted_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceParticipantSpeakStartedPayload conferenceParticipantSpeakStartedPayload = (ConferenceParticipantSpeakStartedPayload) o;
    return Objects.equals(this.callControlId, conferenceParticipantSpeakStartedPayload.callControlId) &&
        Objects.equals(this.callLegId, conferenceParticipantSpeakStartedPayload.callLegId) &&
        Objects.equals(this.callSessionId, conferenceParticipantSpeakStartedPayload.callSessionId) &&
        Objects.equals(this.clientState, conferenceParticipantSpeakStartedPayload.clientState) &&
        Objects.equals(this.connectionId, conferenceParticipantSpeakStartedPayload.connectionId) &&
        Objects.equals(this.creatorCallSessionId, conferenceParticipantSpeakStartedPayload.creatorCallSessionId) &&
        Objects.equals(this.conferenceId, conferenceParticipantSpeakStartedPayload.conferenceId) &&
        Objects.equals(this.occurredAt, conferenceParticipantSpeakStartedPayload.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, callLegId, callSessionId, clientState, connectionId, creatorCallSessionId, conferenceId, occurredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceParticipantSpeakStartedPayload {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    creatorCallSessionId: ").append(toIndentedString(creatorCallSessionId)).append("\n");
    sb.append("    conferenceId: ").append(toIndentedString(conferenceId)).append("\n");
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

