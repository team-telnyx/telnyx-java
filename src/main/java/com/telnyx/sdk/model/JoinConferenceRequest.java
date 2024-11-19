/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * JoinConferenceRequest
 */
@JsonPropertyOrder({
  JoinConferenceRequest.JSON_PROPERTY_CALL_CONTROL_ID,
  JoinConferenceRequest.JSON_PROPERTY_CLIENT_STATE,
  JoinConferenceRequest.JSON_PROPERTY_COMMAND_ID,
  JoinConferenceRequest.JSON_PROPERTY_END_CONFERENCE_ON_EXIT,
  JoinConferenceRequest.JSON_PROPERTY_SOFT_END_CONFERENCE_ON_EXIT,
  JoinConferenceRequest.JSON_PROPERTY_HOLD,
  JoinConferenceRequest.JSON_PROPERTY_HOLD_AUDIO_URL,
  JoinConferenceRequest.JSON_PROPERTY_HOLD_MEDIA_NAME,
  JoinConferenceRequest.JSON_PROPERTY_MUTE,
  JoinConferenceRequest.JSON_PROPERTY_START_CONFERENCE_ON_ENTER,
  JoinConferenceRequest.JSON_PROPERTY_SUPERVISOR_ROLE,
  JoinConferenceRequest.JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS,
  JoinConferenceRequest.JSON_PROPERTY_BEEP_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class JoinConferenceRequest {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public static final String JSON_PROPERTY_END_CONFERENCE_ON_EXIT = "end_conference_on_exit";
  private Boolean endConferenceOnExit;

  public static final String JSON_PROPERTY_SOFT_END_CONFERENCE_ON_EXIT = "soft_end_conference_on_exit";
  private Boolean softEndConferenceOnExit;

  public static final String JSON_PROPERTY_HOLD = "hold";
  private Boolean hold;

  public static final String JSON_PROPERTY_HOLD_AUDIO_URL = "hold_audio_url";
  private String holdAudioUrl;

  public static final String JSON_PROPERTY_HOLD_MEDIA_NAME = "hold_media_name";
  private String holdMediaName;

  public static final String JSON_PROPERTY_MUTE = "mute";
  private Boolean mute;

  public static final String JSON_PROPERTY_START_CONFERENCE_ON_ENTER = "start_conference_on_enter";
  private Boolean startConferenceOnEnter;

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SUPERVISOR_ROLE = "supervisor_role";
  private SupervisorRoleEnum supervisorRole;

  public static final String JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS = "whisper_call_control_ids";
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BEEP_ENABLED = "beep_enabled";
  private BeepEnabledEnum beepEnabled;

  public JoinConferenceRequest() { 
  }

  public JoinConferenceRequest callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Unique identifier and token for controlling the call
   * @return callControlId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQczRrZvZakpWxBlpw48KyZQ==", required = true, value = "Unique identifier and token for controlling the call")
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


  public JoinConferenceRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. Please note that the client_state will be updated for the participient call leg and the change will not affect conferencing webhooks unless the participient is the owner of the conference.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string. Please note that the client_state will be updated for the participient call leg and the change will not affect conferencing webhooks unless the participient is the owner of the conference.")
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


  public JoinConferenceRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same &#x60;command_id&#x60; as one that has already been executed.
   * @return commandId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid execution of duplicate commands. Telnyx will ignore subsequent commands with the same `command_id` as one that has already been executed.")
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


  public JoinConferenceRequest endConferenceOnExit(Boolean endConferenceOnExit) {
    this.endConferenceOnExit = endConferenceOnExit;
    return this;
  }

   /**
   * Whether the conference should end and all remaining participants be hung up after the participant leaves the conference. Defaults to \&quot;false\&quot;.
   * @return endConferenceOnExit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the conference should end and all remaining participants be hung up after the participant leaves the conference. Defaults to \"false\".")
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


  public JoinConferenceRequest softEndConferenceOnExit(Boolean softEndConferenceOnExit) {
    this.softEndConferenceOnExit = softEndConferenceOnExit;
    return this;
  }

   /**
   * Whether the conference should end after the participant leaves the conference. NOTE this doesn&#39;t hang up the other participants. Defaults to \&quot;false\&quot;.
   * @return softEndConferenceOnExit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the conference should end after the participant leaves the conference. NOTE this doesn't hang up the other participants. Defaults to \"false\".")
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


  public JoinConferenceRequest hold(Boolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Whether the participant should be put on hold immediately after joining the conference. Defaults to \&quot;false\&quot;.
   * @return hold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the participant should be put on hold immediately after joining the conference. Defaults to \"false\".")
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


  public JoinConferenceRequest holdAudioUrl(String holdAudioUrl) {
    this.holdAudioUrl = holdAudioUrl;
    return this;
  }

   /**
   * The URL of a file to be played to the participant when they are put on hold after joining the conference. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;.
   * @return holdAudioUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/message.wav", value = "The URL of a file to be played to the participant when they are put on hold after joining the conference. hold_media_name and hold_audio_url cannot be used together in one request. Takes effect only when \"start_conference_on_create\" is set to \"false\". This property takes effect only if \"hold\" is set to \"true\".")
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


  public JoinConferenceRequest holdMediaName(String holdMediaName) {
    this.holdMediaName = holdMediaName;
    return this;
  }

   /**
   * The media_name of a file to be played to the participant when they are put on hold after joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \&quot;start_conference_on_create\&quot; is set to \&quot;false\&quot;. This property takes effect only if \&quot;hold\&quot; is set to \&quot;true\&quot;.
   * @return holdMediaName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "my_media_uploaded_to_media_storage_api", value = "The media_name of a file to be played to the participant when they are put on hold after joining the conference. The media_name must point to a file previously uploaded to api.telnyx.com/v2/media by the same user/organization. The file must either be a WAV or MP3 file. Takes effect only when \"start_conference_on_create\" is set to \"false\". This property takes effect only if \"hold\" is set to \"true\".")
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


  public JoinConferenceRequest mute(Boolean mute) {
    this.mute = mute;
    return this;
  }

   /**
   * Whether the participant should be muted immediately after joining the conference. Defaults to \&quot;false\&quot;.
   * @return mute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the participant should be muted immediately after joining the conference. Defaults to \"false\".")
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


  public JoinConferenceRequest startConferenceOnEnter(Boolean startConferenceOnEnter) {
    this.startConferenceOnEnter = startConferenceOnEnter;
    return this;
  }

   /**
   * Whether the conference should be started after the participant joins the conference. Defaults to \&quot;false\&quot;.
   * @return startConferenceOnEnter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether the conference should be started after the participant joins the conference. Defaults to \"false\".")
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


  public JoinConferenceRequest supervisorRole(SupervisorRoleEnum supervisorRole) {
    this.supervisorRole = supervisorRole;
    return this;
  }

   /**
   * Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;.
   * @return supervisorRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "whisper", value = "Sets the joining participant as a supervisor for the conference. A conference can have multiple supervisors. \"barge\" means the supervisor enters the conference as a normal participant. This is the same as \"none\". \"monitor\" means the supervisor is muted but can hear all participants. \"whisper\" means that only the specified \"whisper_call_control_ids\" can hear the supervisor. Defaults to \"none\".")
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


  public JoinConferenceRequest whisperCallControlIds(List<String> whisperCallControlIds) {
    this.whisperCallControlIds = whisperCallControlIds;
    return this;
  }

  public JoinConferenceRequest addwhisperCallControlIdsItem(String whisperCallControlIdsItem) {
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
  @ApiModelProperty(example = "[\"v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ\",\"v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw\"]", value = "Array of unique call_control_ids the joining supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only.")
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


  public JoinConferenceRequest beepEnabled(BeepEnabledEnum beepEnabled) {
    this.beepEnabled = beepEnabled;
    return this;
  }

   /**
   * Whether a beep sound should be played when the participant joins and/or leaves the conference. Can be used to override the conference-level setting.
   * @return beepEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "on_exit", value = "Whether a beep sound should be played when the participant joins and/or leaves the conference. Can be used to override the conference-level setting.")
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
   * Return true if this JoinConferenceRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinConferenceRequest joinConferenceRequest = (JoinConferenceRequest) o;
    return Objects.equals(this.callControlId, joinConferenceRequest.callControlId) &&
        Objects.equals(this.clientState, joinConferenceRequest.clientState) &&
        Objects.equals(this.commandId, joinConferenceRequest.commandId) &&
        Objects.equals(this.endConferenceOnExit, joinConferenceRequest.endConferenceOnExit) &&
        Objects.equals(this.softEndConferenceOnExit, joinConferenceRequest.softEndConferenceOnExit) &&
        Objects.equals(this.hold, joinConferenceRequest.hold) &&
        Objects.equals(this.holdAudioUrl, joinConferenceRequest.holdAudioUrl) &&
        Objects.equals(this.holdMediaName, joinConferenceRequest.holdMediaName) &&
        Objects.equals(this.mute, joinConferenceRequest.mute) &&
        Objects.equals(this.startConferenceOnEnter, joinConferenceRequest.startConferenceOnEnter) &&
        Objects.equals(this.supervisorRole, joinConferenceRequest.supervisorRole) &&
        Objects.equals(this.whisperCallControlIds, joinConferenceRequest.whisperCallControlIds) &&
        Objects.equals(this.beepEnabled, joinConferenceRequest.beepEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, clientState, commandId, endConferenceOnExit, softEndConferenceOnExit, hold, holdAudioUrl, holdMediaName, mute, startConferenceOnEnter, supervisorRole, whisperCallControlIds, beepEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinConferenceRequest {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    endConferenceOnExit: ").append(toIndentedString(endConferenceOnExit)).append("\n");
    sb.append("    softEndConferenceOnExit: ").append(toIndentedString(softEndConferenceOnExit)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    holdAudioUrl: ").append(toIndentedString(holdAudioUrl)).append("\n");
    sb.append("    holdMediaName: ").append(toIndentedString(holdMediaName)).append("\n");
    sb.append("    mute: ").append(toIndentedString(mute)).append("\n");
    sb.append("    startConferenceOnEnter: ").append(toIndentedString(startConferenceOnEnter)).append("\n");
    sb.append("    supervisorRole: ").append(toIndentedString(supervisorRole)).append("\n");
    sb.append("    whisperCallControlIds: ").append(toIndentedString(whisperCallControlIds)).append("\n");
    sb.append("    beepEnabled: ").append(toIndentedString(beepEnabled)).append("\n");
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

