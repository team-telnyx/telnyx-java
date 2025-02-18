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
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CreateConferenceRequest
 */
@JsonPropertyOrder(
    {
        CreateConferenceRequest.JSON_PROPERTY_CALL_CONTROL_ID,
        CreateConferenceRequest.JSON_PROPERTY_NAME,
        CreateConferenceRequest.JSON_PROPERTY_BEEP_ENABLED,
        CreateConferenceRequest.JSON_PROPERTY_CLIENT_STATE,
        CreateConferenceRequest.JSON_PROPERTY_COMFORT_NOISE,
        CreateConferenceRequest.JSON_PROPERTY_COMMAND_ID,
        CreateConferenceRequest.JSON_PROPERTY_DURATION_MINUTES,
        CreateConferenceRequest.JSON_PROPERTY_HOLD_AUDIO_URL,
        CreateConferenceRequest.JSON_PROPERTY_HOLD_MEDIA_NAME,
        CreateConferenceRequest.JSON_PROPERTY_MAX_PARTICIPANTS,
        CreateConferenceRequest.JSON_PROPERTY_START_CONFERENCE_ON_CREATE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateConferenceRequest {

    public static final String JSON_PROPERTY_CALL_CONTROL_ID =
        "call_control_id";
    private String callControlId;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    /**
     * Whether a beep sound should be played when participants join and/or leave the conference.
     */
    public enum BeepEnabledEnum {
        ALWAYS(String.valueOf("always")),

        NEVER(String.valueOf("never")),

        ON_ENTER(String.valueOf("on_enter")),

        ON_EXIT(String.valueOf("on_exit"));

        private String value;

        BeepEnabledEnum(String value) {
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
        public static BeepEnabledEnum fromValue(String value) {
            for (BeepEnabledEnum b : BeepEnabledEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_BEEP_ENABLED = "beep_enabled";
    private BeepEnabledEnum beepEnabled = BeepEnabledEnum.NEVER;

    public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
    private String clientState;

    public static final String JSON_PROPERTY_COMFORT_NOISE = "comfort_noise";
    private Boolean comfortNoise = true;

    public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
    private String commandId;

    public static final String JSON_PROPERTY_DURATION_MINUTES =
        "duration_minutes";
    private Integer durationMinutes;

    public static final String JSON_PROPERTY_HOLD_AUDIO_URL = "hold_audio_url";
    private String holdAudioUrl;

    public static final String JSON_PROPERTY_HOLD_MEDIA_NAME =
        "hold_media_name";
    private String holdMediaName;

    public static final String JSON_PROPERTY_MAX_PARTICIPANTS =
        "max_participants";
    private Integer maxParticipants;

    public static final String JSON_PROPERTY_START_CONFERENCE_ON_CREATE =
        "start_conference_on_create";
    private Boolean startConferenceOnCreate;

    public CreateConferenceRequest() {}

    public CreateConferenceRequest callControlId(String callControlId) {
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

    public CreateConferenceRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the conference
     * @return name
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "Business",
        required = true,
        value = "Name of the conference"
    )
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public CreateConferenceRequest beepEnabled(BeepEnabledEnum beepEnabled) {
        this.beepEnabled = beepEnabled;
        return this;
    }

    /**
     * Whether a beep sound should be played when participants join and/or leave the conference.
     * @return beepEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "on_exit",
        value = "Whether a beep sound should be played when participants join and/or leave the conference."
    )
    @JsonProperty(JSON_PROPERTY_BEEP_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BeepEnabledEnum getBeepEnabled() {
        return beepEnabled;
    }

    @JsonProperty(JSON_PROPERTY_BEEP_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBeepEnabled(BeepEnabledEnum beepEnabled) {
        this.beepEnabled = beepEnabled;
    }

    public CreateConferenceRequest clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. The client_state will be updated for the creator call leg and will be used for all webhooks related to the created conference.
     * @return clientState
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "aGF2ZSBhIG5pY2UgZGF5ID1d",
        value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. The client_state will be updated for the creator call leg and will be used for all webhooks related to the created conference."
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

    public CreateConferenceRequest comfortNoise(Boolean comfortNoise) {
        this.comfortNoise = comfortNoise;
        return this;
    }

    /**
     * Toggle background comfort noise.
     * @return comfortNoise
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Toggle background comfort noise."
    )
    @JsonProperty(JSON_PROPERTY_COMFORT_NOISE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getComfortNoise() {
        return comfortNoise;
    }

    @JsonProperty(JSON_PROPERTY_COMFORT_NOISE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComfortNoise(Boolean comfortNoise) {
        this.comfortNoise = comfortNoise;
    }

    public CreateConferenceRequest commandId(String commandId) {
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

    public CreateConferenceRequest durationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
        return this;
    }

    /**
     * Time length (minutes) after which the conference will end.
     * @return durationMinutes
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "5",
        value = "Time length (minutes) after which the conference will end."
    )
    @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    @JsonProperty(JSON_PROPERTY_DURATION_MINUTES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public CreateConferenceRequest holdAudioUrl(String holdAudioUrl) {
        this.holdAudioUrl = holdAudioUrl;
        return this;
    }

    /**
     * The URL of a file to be played to participants joining the conference. The URL can point to either a WAV or MP3 file. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;.
     * @return holdAudioUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "http://example.com/message.wav",
        value = "The URL of a file to be played to participants joining the conference. The URL can point to either a WAV or MP3 file. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \"start_conference_on_create\" is set to \"false\"."
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

    public CreateConferenceRequest holdMediaName(String holdMediaName) {
        this.holdMediaName = holdMediaName;
        return this;
    }

    /**
     * The media_name of a file to be played to participants joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;.
     * @return holdMediaName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "my_media_uploaded_to_media_storage_api",
        value = "The media_name of a file to be played to participants joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \"start_conference_on_create\" is set to \"false\"."
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

    public CreateConferenceRequest maxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
        return this;
    }

    /**
     * The maximum number of active conference participants to allow. Must be between 2 and 800. Defaults to 250
     * @return maxParticipants
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "3",
        value = "The maximum number of active conference participants to allow. Must be between 2 and 800. Defaults to 250"
    )
    @JsonProperty(JSON_PROPERTY_MAX_PARTICIPANTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getMaxParticipants() {
        return maxParticipants;
    }

    @JsonProperty(JSON_PROPERTY_MAX_PARTICIPANTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMaxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public CreateConferenceRequest startConferenceOnCreate(
        Boolean startConferenceOnCreate
    ) {
        this.startConferenceOnCreate = startConferenceOnCreate;
        return this;
    }

    /**
     * Whether the conference should be started on creation. If the conference isn&#39;t started all participants that join are automatically put on hold. Defaults to \&quot;true\&quot;.
     * @return startConferenceOnCreate
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Whether the conference should be started on creation. If the conference isn't started all participants that join are automatically put on hold. Defaults to \"true\"."
    )
    @JsonProperty(JSON_PROPERTY_START_CONFERENCE_ON_CREATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getStartConferenceOnCreate() {
        return startConferenceOnCreate;
    }

    @JsonProperty(JSON_PROPERTY_START_CONFERENCE_ON_CREATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartConferenceOnCreate(Boolean startConferenceOnCreate) {
        this.startConferenceOnCreate = startConferenceOnCreate;
    }

    /**
     * Return true if this CreateConferenceRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConferenceRequest createConferenceRequest =
            (CreateConferenceRequest) o;
        return (
            Objects.equals(
                this.callControlId,
                createConferenceRequest.callControlId
            ) &&
            Objects.equals(this.name, createConferenceRequest.name) &&
            Objects.equals(
                this.beepEnabled,
                createConferenceRequest.beepEnabled
            ) &&
            Objects.equals(
                this.clientState,
                createConferenceRequest.clientState
            ) &&
            Objects.equals(
                this.comfortNoise,
                createConferenceRequest.comfortNoise
            ) &&
            Objects.equals(this.commandId, createConferenceRequest.commandId) &&
            Objects.equals(
                this.durationMinutes,
                createConferenceRequest.durationMinutes
            ) &&
            Objects.equals(
                this.holdAudioUrl,
                createConferenceRequest.holdAudioUrl
            ) &&
            Objects.equals(
                this.holdMediaName,
                createConferenceRequest.holdMediaName
            ) &&
            Objects.equals(
                this.maxParticipants,
                createConferenceRequest.maxParticipants
            ) &&
            Objects.equals(
                this.startConferenceOnCreate,
                createConferenceRequest.startConferenceOnCreate
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            callControlId,
            name,
            beepEnabled,
            clientState,
            comfortNoise,
            commandId,
            durationMinutes,
            holdAudioUrl,
            holdMediaName,
            maxParticipants,
            startConferenceOnCreate
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConferenceRequest {\n");
        sb
            .append("    callControlId: ")
            .append(toIndentedString(callControlId))
            .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    beepEnabled: ")
            .append(toIndentedString(beepEnabled))
            .append("\n");
        sb
            .append("    clientState: ")
            .append(toIndentedString(clientState))
            .append("\n");
        sb
            .append("    comfortNoise: ")
            .append(toIndentedString(comfortNoise))
            .append("\n");
        sb
            .append("    commandId: ")
            .append(toIndentedString(commandId))
            .append("\n");
        sb
            .append("    durationMinutes: ")
            .append(toIndentedString(durationMinutes))
            .append("\n");
        sb
            .append("    holdAudioUrl: ")
            .append(toIndentedString(holdAudioUrl))
            .append("\n");
        sb
            .append("    holdMediaName: ")
            .append(toIndentedString(holdMediaName))
            .append("\n");
        sb
            .append("    maxParticipants: ")
            .append(toIndentedString(maxParticipants))
            .append("\n");
        sb
            .append("    startConferenceOnCreate: ")
            .append(toIndentedString(startConferenceOnCreate))
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
