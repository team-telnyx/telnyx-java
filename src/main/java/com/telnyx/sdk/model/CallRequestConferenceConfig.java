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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Optional configuration parameters to dial new participant into a conference.
 */
@ApiModel(
    description = "Optional configuration parameters to dial new participant into a conference."
)
@JsonPropertyOrder(
    {
        CallRequestConferenceConfig.JSON_PROPERTY_ID,
        CallRequestConferenceConfig.JSON_PROPERTY_CONFERENCE_NAME,
        CallRequestConferenceConfig.JSON_PROPERTY_EARLY_MEDIA,
        CallRequestConferenceConfig.JSON_PROPERTY_END_CONFERENCE_ON_EXIT,
        CallRequestConferenceConfig.JSON_PROPERTY_SOFT_END_CONFERENCE_ON_EXIT,
        CallRequestConferenceConfig.JSON_PROPERTY_HOLD,
        CallRequestConferenceConfig.JSON_PROPERTY_HOLD_AUDIO_URL,
        CallRequestConferenceConfig.JSON_PROPERTY_HOLD_MEDIA_NAME,
        CallRequestConferenceConfig.JSON_PROPERTY_MUTE,
        CallRequestConferenceConfig.JSON_PROPERTY_START_CONFERENCE_ON_ENTER,
        CallRequestConferenceConfig.JSON_PROPERTY_START_CONFERENCE_ON_CREATE,
        CallRequestConferenceConfig.JSON_PROPERTY_SUPERVISOR_ROLE,
        CallRequestConferenceConfig.JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS,
        CallRequestConferenceConfig.JSON_PROPERTY_BEEP_ENABLED,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallRequestConferenceConfig {

    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_CONFERENCE_NAME =
        "conference_name";
    private String conferenceName;

    public static final String JSON_PROPERTY_EARLY_MEDIA = "early_media";
    private Boolean earlyMedia = true;

    public static final String JSON_PROPERTY_END_CONFERENCE_ON_EXIT =
        "end_conference_on_exit";
    private Boolean endConferenceOnExit;

    public static final String JSON_PROPERTY_SOFT_END_CONFERENCE_ON_EXIT =
        "soft_end_conference_on_exit";
    private Boolean softEndConferenceOnExit;

    public static final String JSON_PROPERTY_HOLD = "hold";
    private Boolean hold;

    public static final String JSON_PROPERTY_HOLD_AUDIO_URL = "hold_audio_url";
    private String holdAudioUrl;

    public static final String JSON_PROPERTY_HOLD_MEDIA_NAME =
        "hold_media_name";
    private String holdMediaName;

    public static final String JSON_PROPERTY_MUTE = "mute";
    private Boolean mute;

    public static final String JSON_PROPERTY_START_CONFERENCE_ON_ENTER =
        "start_conference_on_enter";
    private Boolean startConferenceOnEnter;

    public static final String JSON_PROPERTY_START_CONFERENCE_ON_CREATE =
        "start_conference_on_create";
    private Boolean startConferenceOnCreate;

    /**
     * Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;.
     */
    public enum SupervisorRoleEnum {
        BARGE(String.valueOf("barge")),

        MONITOR(String.valueOf("monitor")),

        NONE(String.valueOf("none")),

        WHISPER(String.valueOf("whisper"));

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

    public static final String JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS =
        "whisper_call_control_ids";
    private List<String> whisperCallControlIds = null;

    /**
     * Whether a beep sound should be played when the participant joins and/or leaves the conference. Can be used to override the conference-level setting.
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
    private BeepEnabledEnum beepEnabled;

    public CallRequestConferenceConfig() {}

    public CallRequestConferenceConfig id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Conference ID to be joined
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0",
        value = "Conference ID to be joined"
    )
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(UUID id) {
        this.id = id;
    }

    public CallRequestConferenceConfig conferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
        return this;
    }

    /**
     * Conference name to be joined
     * @return conferenceName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "telnyx-conference",
        value = "Conference name to be joined"
    )
    @JsonProperty(JSON_PROPERTY_CONFERENCE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getConferenceName() {
        return conferenceName;
    }

    @JsonProperty(JSON_PROPERTY_CONFERENCE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public CallRequestConferenceConfig earlyMedia(Boolean earlyMedia) {
        this.earlyMedia = earlyMedia;
        return this;
    }

    /**
     * Controls the moment when dialled call is joined into conference. If set to &#x60;true&#x60; user will be joined as soon as media is available (ringback). If &#x60;false&#x60; user will be joined when call is answered. Defaults to &#x60;true&#x60;
     * @return earlyMedia
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Controls the moment when dialled call is joined into conference. If set to `true` user will be joined as soon as media is available (ringback). If `false` user will be joined when call is answered. Defaults to `true`"
    )
    @JsonProperty(JSON_PROPERTY_EARLY_MEDIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEarlyMedia() {
        return earlyMedia;
    }

    @JsonProperty(JSON_PROPERTY_EARLY_MEDIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEarlyMedia(Boolean earlyMedia) {
        this.earlyMedia = earlyMedia;
    }

    public CallRequestConferenceConfig endConferenceOnExit(
        Boolean endConferenceOnExit
    ) {
        this.endConferenceOnExit = endConferenceOnExit;
        return this;
    }

    /**
     * Whether the conference should end and all remaining participants be hung up after the participant leaves the conference. Defaults to \&quot;false\&quot;.
     * @return endConferenceOnExit
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Whether the conference should end and all remaining participants be hung up after the participant leaves the conference. Defaults to \"false\"."
    )
    @JsonProperty(JSON_PROPERTY_END_CONFERENCE_ON_EXIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEndConferenceOnExit() {
        return endConferenceOnExit;
    }

    @JsonProperty(JSON_PROPERTY_END_CONFERENCE_ON_EXIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEndConferenceOnExit(Boolean endConferenceOnExit) {
        this.endConferenceOnExit = endConferenceOnExit;
    }

    public CallRequestConferenceConfig softEndConferenceOnExit(
        Boolean softEndConferenceOnExit
    ) {
        this.softEndConferenceOnExit = softEndConferenceOnExit;
        return this;
    }

    /**
     * Whether the conference should end after the participant leaves the conference. NOTE this doesn&#39;t hang up the other participants. Defaults to \&quot;false\&quot;.
     * @return softEndConferenceOnExit
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Whether the conference should end after the participant leaves the conference. NOTE this doesn't hang up the other participants. Defaults to \"false\"."
    )
    @JsonProperty(JSON_PROPERTY_SOFT_END_CONFERENCE_ON_EXIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getSoftEndConferenceOnExit() {
        return softEndConferenceOnExit;
    }

    @JsonProperty(JSON_PROPERTY_SOFT_END_CONFERENCE_ON_EXIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSoftEndConferenceOnExit(Boolean softEndConferenceOnExit) {
        this.softEndConferenceOnExit = softEndConferenceOnExit;
    }

    public CallRequestConferenceConfig hold(Boolean hold) {
        this.hold = hold;
        return this;
    }

    /**
     * Whether the participant should be put on hold immediately after joining the conference. Defaults to \&quot;false\&quot;.
     * @return hold
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Whether the participant should be put on hold immediately after joining the conference. Defaults to \"false\"."
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

    public CallRequestConferenceConfig holdAudioUrl(String holdAudioUrl) {
        this.holdAudioUrl = holdAudioUrl;
        return this;
    }

    /**
     * The URL of a file to be played to the participant when they are put on hold after joining the conference. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;.
     * @return holdAudioUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "http://example.com/message.wav",
        value = "The URL of a file to be played to the participant when they are put on hold after joining the conference. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \"start_conference_on_create\" is set to \"false\". This property takes effect only if \"hold\" is set to \"true\"."
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

    public CallRequestConferenceConfig holdMediaName(String holdMediaName) {
        this.holdMediaName = holdMediaName;
        return this;
    }

    /**
     * The media_name of a file to be played to the participant when they are put on hold after joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;.
     * @return holdMediaName
     **/
    @javax.annotation.Nullable
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

    public CallRequestConferenceConfig mute(Boolean mute) {
        this.mute = mute;
        return this;
    }

    /**
     * Whether the participant should be muted immediately after joining the conference. Defaults to \&quot;false\&quot;.
     * @return mute
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Whether the participant should be muted immediately after joining the conference. Defaults to \"false\"."
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

    public CallRequestConferenceConfig startConferenceOnEnter(
        Boolean startConferenceOnEnter
    ) {
        this.startConferenceOnEnter = startConferenceOnEnter;
        return this;
    }

    /**
     * Whether the conference should be started after the participant joins the conference. Defaults to \&quot;false\&quot;.
     * @return startConferenceOnEnter
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Whether the conference should be started after the participant joins the conference. Defaults to \"false\"."
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

    public CallRequestConferenceConfig startConferenceOnCreate(
        Boolean startConferenceOnCreate
    ) {
        this.startConferenceOnCreate = startConferenceOnCreate;
        return this;
    }

    /**
     * Whether the conference should be started on creation. If the conference isn&#39;t started all participants that join are automatically put on hold. Defaults to \&quot;true\&quot;.
     * @return startConferenceOnCreate
     **/
    @javax.annotation.Nullable
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

    public CallRequestConferenceConfig supervisorRole(
        SupervisorRoleEnum supervisorRole
    ) {
        this.supervisorRole = supervisorRole;
        return this;
    }

    /**
     * Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;.
     * @return supervisorRole
     **/
    @javax.annotation.Nullable
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

    public CallRequestConferenceConfig whisperCallControlIds(
        List<String> whisperCallControlIds
    ) {
        this.whisperCallControlIds = whisperCallControlIds;
        return this;
    }

    public CallRequestConferenceConfig addwhisperCallControlIdsItem(
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
    @javax.annotation.Nullable
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

    public CallRequestConferenceConfig beepEnabled(
        BeepEnabledEnum beepEnabled
    ) {
        this.beepEnabled = beepEnabled;
        return this;
    }

    /**
     * Whether a beep sound should be played when the participant joins and/or leaves the conference. Can be used to override the conference-level setting.
     * @return beepEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "on_exit",
        value = "Whether a beep sound should be played when the participant joins and/or leaves the conference. Can be used to override the conference-level setting."
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

    /**
     * Return true if this CallRequest_conference_config object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRequestConferenceConfig callRequestConferenceConfig =
            (CallRequestConferenceConfig) o;
        return (
            Objects.equals(this.id, callRequestConferenceConfig.id) &&
            Objects.equals(
                this.conferenceName,
                callRequestConferenceConfig.conferenceName
            ) &&
            Objects.equals(
                this.earlyMedia,
                callRequestConferenceConfig.earlyMedia
            ) &&
            Objects.equals(
                this.endConferenceOnExit,
                callRequestConferenceConfig.endConferenceOnExit
            ) &&
            Objects.equals(
                this.softEndConferenceOnExit,
                callRequestConferenceConfig.softEndConferenceOnExit
            ) &&
            Objects.equals(this.hold, callRequestConferenceConfig.hold) &&
            Objects.equals(
                this.holdAudioUrl,
                callRequestConferenceConfig.holdAudioUrl
            ) &&
            Objects.equals(
                this.holdMediaName,
                callRequestConferenceConfig.holdMediaName
            ) &&
            Objects.equals(this.mute, callRequestConferenceConfig.mute) &&
            Objects.equals(
                this.startConferenceOnEnter,
                callRequestConferenceConfig.startConferenceOnEnter
            ) &&
            Objects.equals(
                this.startConferenceOnCreate,
                callRequestConferenceConfig.startConferenceOnCreate
            ) &&
            Objects.equals(
                this.supervisorRole,
                callRequestConferenceConfig.supervisorRole
            ) &&
            Objects.equals(
                this.whisperCallControlIds,
                callRequestConferenceConfig.whisperCallControlIds
            ) &&
            Objects.equals(
                this.beepEnabled,
                callRequestConferenceConfig.beepEnabled
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            conferenceName,
            earlyMedia,
            endConferenceOnExit,
            softEndConferenceOnExit,
            hold,
            holdAudioUrl,
            holdMediaName,
            mute,
            startConferenceOnEnter,
            startConferenceOnCreate,
            supervisorRole,
            whisperCallControlIds,
            beepEnabled
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallRequestConferenceConfig {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb
            .append("    conferenceName: ")
            .append(toIndentedString(conferenceName))
            .append("\n");
        sb
            .append("    earlyMedia: ")
            .append(toIndentedString(earlyMedia))
            .append("\n");
        sb
            .append("    endConferenceOnExit: ")
            .append(toIndentedString(endConferenceOnExit))
            .append("\n");
        sb
            .append("    softEndConferenceOnExit: ")
            .append(toIndentedString(softEndConferenceOnExit))
            .append("\n");
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
            .append("    startConferenceOnCreate: ")
            .append(toIndentedString(startConferenceOnCreate))
            .append("\n");
        sb
            .append("    supervisorRole: ")
            .append(toIndentedString(supervisorRole))
            .append("\n");
        sb
            .append("    whisperCallControlIds: ")
            .append(toIndentedString(whisperCallControlIds))
            .append("\n");
        sb
            .append("    beepEnabled: ")
            .append(toIndentedString(beepEnabled))
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
