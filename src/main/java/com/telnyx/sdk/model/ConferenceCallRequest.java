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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * ConferenceCallRequest
 */
@JsonPropertyOrder(
    {
        ConferenceCallRequest.JSON_PROPERTY_CALL_CONTROL_ID,
        ConferenceCallRequest.JSON_PROPERTY_CLIENT_STATE,
        ConferenceCallRequest.JSON_PROPERTY_COMMAND_ID,
        ConferenceCallRequest.JSON_PROPERTY_FROM,
        ConferenceCallRequest.JSON_PROPERTY_HOLD,
        ConferenceCallRequest.JSON_PROPERTY_HOLD_AUDIO_URL,
        ConferenceCallRequest.JSON_PROPERTY_HOLD_MEDIA_NAME,
        ConferenceCallRequest.JSON_PROPERTY_MUTE,
        ConferenceCallRequest.JSON_PROPERTY_START_CONFERENCE_ON_ENTER,
        ConferenceCallRequest.JSON_PROPERTY_SUPERVISOR_ROLE,
        ConferenceCallRequest.JSON_PROPERTY_TO,
        ConferenceCallRequest.JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class ConferenceCallRequest {

    public static final String JSON_PROPERTY_CALL_CONTROL_ID =
        "call_control_id";
    private String callControlId;

    public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
    private String clientState;

    public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
    private String commandId;

    public static final String JSON_PROPERTY_FROM = "from";
    private String from;

    public static final String JSON_PROPERTY_HOLD = "hold";
    private Boolean hold = false;

    public static final String JSON_PROPERTY_HOLD_AUDIO_URL = "hold_audio_url";
    private String holdAudioUrl;

    public static final String JSON_PROPERTY_HOLD_MEDIA_NAME =
        "hold_media_name";
    private String holdMediaName;

    public static final String JSON_PROPERTY_MUTE = "mute";
    private Boolean mute = false;

    public static final String JSON_PROPERTY_START_CONFERENCE_ON_ENTER =
        "start_conference_on_enter";
    private Boolean startConferenceOnEnter = false;

    /**
     * Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;.
     */
    public enum SupervisorRoleEnum {
        BARGE("barge"),

        MONITOR("monitor"),

        NONE("none"),

        WHISPER("whisper");

        private String value;

        SupervisorRoleEnum(String value) {
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
        public static SupervisorRoleEnum fromValue(String value) {
            for (SupervisorRoleEnum b : SupervisorRoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_SUPERVISOR_ROLE =
        "supervisor_role";
    private SupervisorRoleEnum supervisorRole;

    public static final String JSON_PROPERTY_TO = "to";
    private String to;

    public static final String JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS =
        "whisper_call_control_ids";
    private List<String> whisperCallControlIds = null;

    public ConferenceCallRequest() {}

    public ConferenceCallRequest callControlId(String callControlId) {
        this.callControlId = callControlId;
        return this;
    }

    /**
     * Unique identifier and token for controlling the call
     * @return callControlId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQczRrZvZakpWxBlpw48KyZQ==",
        required = true,
        value = "Unique identifier and token for controlling the call"
    )
    @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCallControlId() {
        return callControlId;
    }

    @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCallControlId(String callControlId) {
        this.callControlId = callControlId;
    }

    public ConferenceCallRequest clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
     * @return clientState
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "aGF2ZSBhIG5pY2UgZGF5ID1d",
        value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string."
    )
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

    public ConferenceCallRequest commandId(String commandId) {
        this.commandId = commandId;
        return this;
    }

    /**
     * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed.
     * @return commandId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "891510ac-f3e4-11e8-af5b-de00688a4901",
        value = "Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same `command_id` as one that has already been executed."
    )
    @JsonProperty(JSON_PROPERTY_COMMAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCommandId() {
        return commandId;
    }

    @JsonProperty(JSON_PROPERTY_COMMAND_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public ConferenceCallRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * The &#x60;from&#x60; number to be used as the caller id presented to the destination (&#x60;to&#x60; number).
     * @return from
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "+18005550101",
        required = true,
        value = "The `from` number to be used as the caller id presented to the destination (`to` number)."
    )
    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFrom() {
        return from;
    }

    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFrom(String from) {
        this.from = from;
    }

    public ConferenceCallRequest hold(Boolean hold) {
        this.hold = hold;
        return this;
    }

    /**
     * Whether the participant should be put on hold immediately after joining the conference.
     * @return hold
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Whether the participant should be put on hold immediately after joining the conference."
    )
    @JsonProperty(JSON_PROPERTY_HOLD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getHold() {
        return hold;
    }

    @JsonProperty(JSON_PROPERTY_HOLD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHold(Boolean hold) {
        this.hold = hold;
    }

    public ConferenceCallRequest holdAudioUrl(String holdAudioUrl) {
        this.holdAudioUrl = holdAudioUrl;
        return this;
    }

    /**
     * The URL of a file to be played to the participant when they are put on hold after joining the conference. If media_name is also supplied, this is currently ignored. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;.
     * @return holdAudioUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "http://example.com/message.wav",
        value = "The URL of a file to be played to the participant when they are put on hold after joining the conference. If media_name is also supplied, this is currently ignored. Takes effect only when \"start_conference_on_create\" is set to \"false\". This property takes effect only if \"hold\" is set to \"true\"."
    )
    @JsonProperty(JSON_PROPERTY_HOLD_AUDIO_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getHoldAudioUrl() {
        return holdAudioUrl;
    }

    @JsonProperty(JSON_PROPERTY_HOLD_AUDIO_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHoldAudioUrl(String holdAudioUrl) {
        this.holdAudioUrl = holdAudioUrl;
    }

    public ConferenceCallRequest holdMediaName(String holdMediaName) {
        this.holdMediaName = holdMediaName;
        return this;
    }

    /**
     * The media_name of a file to be played to the participant when they are put on hold after joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;.
     * @return holdMediaName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "my_media_uploaded_to_media_storage_api",
        value = "The media_name of a file to be played to the participant when they are put on hold after joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \"start_conference_on_create\" is set to \"false\". This property takes effect only if \"hold\" is set to \"true\"."
    )
    @JsonProperty(JSON_PROPERTY_HOLD_MEDIA_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getHoldMediaName() {
        return holdMediaName;
    }

    @JsonProperty(JSON_PROPERTY_HOLD_MEDIA_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHoldMediaName(String holdMediaName) {
        this.holdMediaName = holdMediaName;
    }

    public ConferenceCallRequest mute(Boolean mute) {
        this.mute = mute;
        return this;
    }

    /**
     * Whether the participant should be muted immediately after joining the conference.
     * @return mute
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Whether the participant should be muted immediately after joining the conference."
    )
    @JsonProperty(JSON_PROPERTY_MUTE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getMute() {
        return mute;
    }

    @JsonProperty(JSON_PROPERTY_MUTE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMute(Boolean mute) {
        this.mute = mute;
    }

    public ConferenceCallRequest startConferenceOnEnter(
        Boolean startConferenceOnEnter
    ) {
        this.startConferenceOnEnter = startConferenceOnEnter;
        return this;
    }

    /**
     * Whether the conference should be started after the participant joins the conference.
     * @return startConferenceOnEnter
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Whether the conference should be started after the participant joins the conference."
    )
    @JsonProperty(JSON_PROPERTY_START_CONFERENCE_ON_ENTER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getStartConferenceOnEnter() {
        return startConferenceOnEnter;
    }

    @JsonProperty(JSON_PROPERTY_START_CONFERENCE_ON_ENTER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartConferenceOnEnter(Boolean startConferenceOnEnter) {
        this.startConferenceOnEnter = startConferenceOnEnter;
    }

    public ConferenceCallRequest supervisorRole(
        SupervisorRoleEnum supervisorRole
    ) {
        this.supervisorRole = supervisorRole;
        return this;
    }

    /**
     * Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;.
     * @return supervisorRole
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "whisper",
        value = "Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \"barge\" means the supervisor enters the conference as a normal participant. This is the same as \"none\". \"monitor\" means the supervisor is muted but can hear all participants. \"whisper\" means that only the specified \"whisper_call_control_ids\" can hear the supervisor. Defaults to \"none\"."
    )
    @JsonProperty(JSON_PROPERTY_SUPERVISOR_ROLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public SupervisorRoleEnum getSupervisorRole() {
        return supervisorRole;
    }

    @JsonProperty(JSON_PROPERTY_SUPERVISOR_ROLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSupervisorRole(SupervisorRoleEnum supervisorRole) {
        this.supervisorRole = supervisorRole;
    }

    public ConferenceCallRequest to(String to) {
        this.to = to;
        return this;
    }

    /**
     * The DID or SIP URI to dial out and bridge to the given call.
     * @return to
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "+18005550100 or sip:username@sip.telnyx.com",
        required = true,
        value = "The DID or SIP URI to dial out and bridge to the given call."
    )
    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTo() {
        return to;
    }

    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTo(String to) {
        this.to = to;
    }

    public ConferenceCallRequest whisperCallControlIds(
        List<String> whisperCallControlIds
    ) {
        this.whisperCallControlIds = whisperCallControlIds;
        return this;
    }

    public ConferenceCallRequest addWhisperCallControlIdsItem(
        String whisperCallControlIdsItem
    ) {
        if (this.whisperCallControlIds == null) {
            this.whisperCallControlIds = new ArrayList<>();
        }
        this.whisperCallControlIds.add(whisperCallControlIdsItem);
        return this;
    }

    /**
     * Array of unique call_control_ids the joining supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only.
     * @return whisperCallControlIds
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[\"v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ\",\"v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw\"]",
        value = "Array of unique call_control_ids the joining supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only."
    )
    @JsonProperty(JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getWhisperCallControlIds() {
        return whisperCallControlIds;
    }

    @JsonProperty(JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWhisperCallControlIds(List<String> whisperCallControlIds) {
        this.whisperCallControlIds = whisperCallControlIds;
    }

    /**
     * Return true if this ConferenceCallRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConferenceCallRequest conferenceCallRequest = (ConferenceCallRequest) o;
        return (
            Objects.equals(
                this.callControlId,
                conferenceCallRequest.callControlId
            ) &&
            Objects.equals(
                this.clientState,
                conferenceCallRequest.clientState
            ) &&
            Objects.equals(this.commandId, conferenceCallRequest.commandId) &&
            Objects.equals(this.from, conferenceCallRequest.from) &&
            Objects.equals(this.hold, conferenceCallRequest.hold) &&
            Objects.equals(
                this.holdAudioUrl,
                conferenceCallRequest.holdAudioUrl
            ) &&
            Objects.equals(
                this.holdMediaName,
                conferenceCallRequest.holdMediaName
            ) &&
            Objects.equals(this.mute, conferenceCallRequest.mute) &&
            Objects.equals(
                this.startConferenceOnEnter,
                conferenceCallRequest.startConferenceOnEnter
            ) &&
            Objects.equals(
                this.supervisorRole,
                conferenceCallRequest.supervisorRole
            ) &&
            Objects.equals(this.to, conferenceCallRequest.to) &&
            Objects.equals(
                this.whisperCallControlIds,
                conferenceCallRequest.whisperCallControlIds
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            callControlId,
            clientState,
            commandId,
            from,
            hold,
            holdAudioUrl,
            holdMediaName,
            mute,
            startConferenceOnEnter,
            supervisorRole,
            to,
            whisperCallControlIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConferenceCallRequest {\n");
        sb
            .append("    callControlId: ")
            .append(toIndentedString(callControlId))
            .append("\n");
        sb
            .append("    clientState: ")
            .append(toIndentedString(clientState))
            .append("\n");
        sb
            .append("    commandId: ")
            .append(toIndentedString(commandId))
            .append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
        sb
            .append("    holdAudioUrl: ")
            .append(toIndentedString(holdAudioUrl))
            .append("\n");
        sb
            .append("    holdMediaName: ")
            .append(toIndentedString(holdMediaName))
            .append("\n");
        sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
        sb
            .append("    startConferenceOnEnter: ")
            .append(toIndentedString(startConferenceOnEnter))
            .append("\n");
        sb
            .append("    supervisorRole: ")
            .append(toIndentedString(supervisorRole))
            .append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb
            .append("    whisperCallControlIds: ")
            .append(toIndentedString(whisperCallControlIds))
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
