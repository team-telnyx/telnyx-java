/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;
/**
 * ConferenceParticipantSpeakEndedPayload
 */


public class ConferenceParticipantSpeakEndedPayload {
  @SerializedName("call_control_id")
  private UUID callControlId = null;

  @SerializedName("call_leg_id")
  private String callLegId = null;

  @SerializedName("call_session_id")
  private String callSessionId = null;

  @SerializedName("client_state")
  private String clientState = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("creator_call_session_id")
  private String creatorCallSessionId = null;

  @SerializedName("conference_id")
  private String conferenceId = null;

  @SerializedName("occurred_at")
  private OffsetDateTime occurredAt = null;

  public ConferenceParticipantSpeakEndedPayload callControlId(UUID callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Participant&#x27;s call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @Schema(description = "Participant's call ID used to issue commands via Call Control API.")
  public UUID getCallControlId() {
    return callControlId;
  }

  public void setCallControlId(UUID callControlId) {
    this.callControlId = callControlId;
  }

  public ConferenceParticipantSpeakEndedPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @Schema(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", description = "ID that is unique to the call and can be used to correlate webhook events.")
  public String getCallLegId() {
    return callLegId;
  }

  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }

  public ConferenceParticipantSpeakEndedPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events.
   * @return callSessionId
  **/
  @Schema(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", description = "ID that is unique to the call session and can be used to correlate webhook events.")
  public String getCallSessionId() {
    return callSessionId;
  }

  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }

  public ConferenceParticipantSpeakEndedPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @Schema(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", description = "State received from a command.")
  public String getClientState() {
    return clientState;
  }

  public void setClientState(String clientState) {
    this.clientState = clientState;
  }

  public ConferenceParticipantSpeakEndedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Telnyx connection ID used in the call.
   * @return connectionId
  **/
  @Schema(example = "7267xxxxxxxxxxxxxx", description = "Telnyx connection ID used in the call.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public ConferenceParticipantSpeakEndedPayload creatorCallSessionId(String creatorCallSessionId) {
    this.creatorCallSessionId = creatorCallSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session that started the conference.
   * @return creatorCallSessionId
  **/
  @Schema(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", description = "ID that is unique to the call session that started the conference.")
  public String getCreatorCallSessionId() {
    return creatorCallSessionId;
  }

  public void setCreatorCallSessionId(String creatorCallSessionId) {
    this.creatorCallSessionId = creatorCallSessionId;
  }

  public ConferenceParticipantSpeakEndedPayload conferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * ID of the conference the text was spoken in.
   * @return conferenceId
  **/
  @Schema(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", description = "ID of the conference the text was spoken in.")
  public String getConferenceId() {
    return conferenceId;
  }

  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }

  public ConferenceParticipantSpeakEndedPayload occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when the event occurred.
   * @return occurredAt
  **/
  @Schema(example = "2018-02-02T22:25:27.521Z", description = "ISO 8601 datetime of when the event occurred.")
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceParticipantSpeakEndedPayload conferenceParticipantSpeakEndedPayload = (ConferenceParticipantSpeakEndedPayload) o;
    return Objects.equals(this.callControlId, conferenceParticipantSpeakEndedPayload.callControlId) &&
        Objects.equals(this.callLegId, conferenceParticipantSpeakEndedPayload.callLegId) &&
        Objects.equals(this.callSessionId, conferenceParticipantSpeakEndedPayload.callSessionId) &&
        Objects.equals(this.clientState, conferenceParticipantSpeakEndedPayload.clientState) &&
        Objects.equals(this.connectionId, conferenceParticipantSpeakEndedPayload.connectionId) &&
        Objects.equals(this.creatorCallSessionId, conferenceParticipantSpeakEndedPayload.creatorCallSessionId) &&
        Objects.equals(this.conferenceId, conferenceParticipantSpeakEndedPayload.conferenceId) &&
        Objects.equals(this.occurredAt, conferenceParticipantSpeakEndedPayload.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, callLegId, callSessionId, clientState, connectionId, creatorCallSessionId, conferenceId, occurredAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceParticipantSpeakEndedPayload {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
