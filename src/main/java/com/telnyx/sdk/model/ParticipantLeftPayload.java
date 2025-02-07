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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * ParticipantLeftPayload
 */
@JsonPropertyOrder(
    {
        ParticipantLeftPayload.JSON_PROPERTY_SESSION_ID,
        ParticipantLeftPayload.JSON_PROPERTY_ROOM_ID,
        ParticipantLeftPayload.JSON_PROPERTY_CONTEXT,
        ParticipantLeftPayload.JSON_PROPERTY_PARTICIPANT_ID,
        ParticipantLeftPayload.JSON_PROPERTY_DURATION_SECS,
        ParticipantLeftPayload.JSON_PROPERTY_LEFT_REASON,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.4.0"
)
public class ParticipantLeftPayload {

    public static final String JSON_PROPERTY_SESSION_ID = "session_id";
    private UUID sessionId;

    public static final String JSON_PROPERTY_ROOM_ID = "room_id";
    private UUID roomId;

    public static final String JSON_PROPERTY_CONTEXT = "context";
    private String context;

    public static final String JSON_PROPERTY_PARTICIPANT_ID = "participant_id";
    private UUID participantId;

    public static final String JSON_PROPERTY_DURATION_SECS = "duration_secs";
    private Integer durationSecs;

    public static final String JSON_PROPERTY_LEFT_REASON = "left_reason";
    private String leftReason;

    public ParticipantLeftPayload() {}

    public ParticipantLeftPayload sessionId(UUID sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Session ID that identifies the session where the participant left.
     * @return sessionId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0",
        value = "Session ID that identifies the session where the participant left."
    )
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

    public ParticipantLeftPayload roomId(UUID roomId) {
        this.roomId = roomId;
        return this;
    }

    /**
     * Room ID that identifies the room where the participant left.
     * @return roomId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0ccc7b54-4df3-4bca-a65a-35a1ecc777f0",
        value = "Room ID that identifies the room where the participant left."
    )
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

    public ParticipantLeftPayload context(String context) {
        this.context = context;
        return this;
    }

    /**
     * Context provided to the given participant through the client SDK
     * @return context
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Alice",
        value = "Context provided to the given participant through the client SDK"
    )
    @JsonProperty(JSON_PROPERTY_CONTEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getContext() {
        return context;
    }

    @JsonProperty(JSON_PROPERTY_CONTEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContext(String context) {
        this.context = context;
    }

    public ParticipantLeftPayload participantId(UUID participantId) {
        this.participantId = participantId;
        return this;
    }

    /**
     * Participant ID that identifies the participant that left.
     * @return participantId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "0ccc7b54-4df3-4bca-a65a-35a1ecc777f0",
        value = "Participant ID that identifies the participant that left."
    )
    @JsonProperty(JSON_PROPERTY_PARTICIPANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getParticipantId() {
        return participantId;
    }

    @JsonProperty(JSON_PROPERTY_PARTICIPANT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParticipantId(UUID participantId) {
        this.participantId = participantId;
    }

    public ParticipantLeftPayload durationSecs(Integer durationSecs) {
        this.durationSecs = durationSecs;
        return this;
    }

    /**
     * The duration in seconds of the participant in the session
     * @return durationSecs
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "245",
        value = "The duration in seconds of the participant in the session"
    )
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

    public ParticipantLeftPayload leftReason(String leftReason) {
        this.leftReason = leftReason;
        return this;
    }

    /**
     * The reason why the participant left
     * @return leftReason
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "kicked",
        value = "The reason why the participant left"
    )
    @JsonProperty(JSON_PROPERTY_LEFT_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLeftReason() {
        return leftReason;
    }

    @JsonProperty(JSON_PROPERTY_LEFT_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLeftReason(String leftReason) {
        this.leftReason = leftReason;
    }

    /**
     * Return true if this ParticipantLeft_payload object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParticipantLeftPayload participantLeftPayload =
            (ParticipantLeftPayload) o;
        return (
            Objects.equals(this.sessionId, participantLeftPayload.sessionId) &&
            Objects.equals(this.roomId, participantLeftPayload.roomId) &&
            Objects.equals(this.context, participantLeftPayload.context) &&
            Objects.equals(
                this.participantId,
                participantLeftPayload.participantId
            ) &&
            Objects.equals(
                this.durationSecs,
                participantLeftPayload.durationSecs
            ) &&
            Objects.equals(this.leftReason, participantLeftPayload.leftReason)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sessionId,
            roomId,
            context,
            participantId,
            durationSecs,
            leftReason
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParticipantLeftPayload {\n");
        sb
            .append("    sessionId: ")
            .append(toIndentedString(sessionId))
            .append("\n");
        sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
        sb
            .append("    context: ")
            .append(toIndentedString(context))
            .append("\n");
        sb
            .append("    participantId: ")
            .append(toIndentedString(participantId))
            .append("\n");
        sb
            .append("    durationSecs: ")
            .append(toIndentedString(durationSecs))
            .append("\n");
        sb
            .append("    leftReason: ")
            .append(toIndentedString(leftReason))
            .append("\n");
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
