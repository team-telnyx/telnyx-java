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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ConferenceSpeakEndedPayload
 */
@JsonPropertyOrder({
  ConferenceSpeakEndedPayload.JSON_PROPERTY_CONNECTION_ID,
  ConferenceSpeakEndedPayload.JSON_PROPERTY_CREATOR_CALL_SESSION_ID,
  ConferenceSpeakEndedPayload.JSON_PROPERTY_CONFERENCE_ID,
  ConferenceSpeakEndedPayload.JSON_PROPERTY_OCCURRED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConferenceSpeakEndedPayload {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CREATOR_CALL_SESSION_ID = "creator_call_session_id";
  private String creatorCallSessionId;

  public static final String JSON_PROPERTY_CONFERENCE_ID = "conference_id";
  private String conferenceId;

  public static final String JSON_PROPERTY_OCCURRED_AT = "occurred_at";
  private OffsetDateTime occurredAt;


  public ConferenceSpeakEndedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Telnyx connection ID used in the call.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Telnyx connection ID used in the call.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public ConferenceSpeakEndedPayload creatorCallSessionId(String creatorCallSessionId) {
    this.creatorCallSessionId = creatorCallSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session that started the conference.
   * @return creatorCallSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID that is unique to the call session that started the conference.")
  @JsonProperty(JSON_PROPERTY_CREATOR_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorCallSessionId() {
    return creatorCallSessionId;
  }


  public void setCreatorCallSessionId(String creatorCallSessionId) {
    this.creatorCallSessionId = creatorCallSessionId;
  }


  public ConferenceSpeakEndedPayload conferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
    return this;
  }

   /**
   * ID of the conference the text was spoken in.
   * @return conferenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID of the conference the text was spoken in.")
  @JsonProperty(JSON_PROPERTY_CONFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConferenceId() {
    return conferenceId;
  }


  public void setConferenceId(String conferenceId) {
    this.conferenceId = conferenceId;
  }


  public ConferenceSpeakEndedPayload occurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * ISO 8601 datetime of when the event occurred.
   * @return occurredAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:25:27.521Z", value = "ISO 8601 datetime of when the event occurred.")
  @JsonProperty(JSON_PROPERTY_OCCURRED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }


  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }


  /**
   * Return true if this ConferenceSpeakEnded_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceSpeakEndedPayload conferenceSpeakEndedPayload = (ConferenceSpeakEndedPayload) o;
    return Objects.equals(this.connectionId, conferenceSpeakEndedPayload.connectionId) &&
        Objects.equals(this.creatorCallSessionId, conferenceSpeakEndedPayload.creatorCallSessionId) &&
        Objects.equals(this.conferenceId, conferenceSpeakEndedPayload.conferenceId) &&
        Objects.equals(this.occurredAt, conferenceSpeakEndedPayload.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, creatorCallSessionId, conferenceId, occurredAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceSpeakEndedPayload {\n");
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
