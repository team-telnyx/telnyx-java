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

/**
 * UpdateConferenceRequest
 */
@JsonPropertyOrder(
    {
        UpdateConferenceRequest.JSON_PROPERTY_CALL_CONTROL_ID,
        UpdateConferenceRequest.JSON_PROPERTY_COMMAND_ID,
        UpdateConferenceRequest.JSON_PROPERTY_SUPERVISOR_ROLE,
        UpdateConferenceRequest.JSON_PROPERTY_WHISPER_CALL_CONTROL_IDS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdateConferenceRequest {

    public static final String JSON_PROPERTY_CALL_CONTROL_ID =
        "call_control_id";
    private String callControlId;

    public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
    private String commandId;

    /**
     * Sets the participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;.
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

    public UpdateConferenceRequest() {}

    public UpdateConferenceRequest callControlId(String callControlId) {
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

    public UpdateConferenceRequest commandId(String commandId) {
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

    public UpdateConferenceRequest supervisorRole(
        SupervisorRoleEnum supervisorRole
    ) {
        this.supervisorRole = supervisorRole;
        return this;
    }

    /**
     * Sets the participant as a supervisor for the conference. A conference can have multiple supervisors. \&quot;barge\&quot; means the supervisor enters the conference as a normal participant. This is the same as \&quot;none\&quot;. \&quot;monitor\&quot; means the supervisor is muted but can hear all participants. \&quot;whisper\&quot; means that only the specified \&quot;whisper_call_control_ids\&quot; can hear the supervisor. Defaults to \&quot;none\&quot;.
     * @return supervisorRole
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "whisper",
        required = true,
        value = "Sets the participant as a supervisor for the conference. A conference can have multiple supervisors. \"barge\" means the supervisor enters the conference as a normal participant. This is the same as \"none\". \"monitor\" means the supervisor is muted but can hear all participants. \"whisper\" means that only the specified \"whisper_call_control_ids\" can hear the supervisor. Defaults to \"none\"."
    )
    @JsonProperty(JSON_PROPERTY_SUPERVISOR_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public SupervisorRoleEnum getSupervisorRole() {
        return supervisorRole;
    }

    @JsonProperty(JSON_PROPERTY_SUPERVISOR_ROLE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSupervisorRole(SupervisorRoleEnum supervisorRole) {
        this.supervisorRole = supervisorRole;
    }

    public UpdateConferenceRequest whisperCallControlIds(
        List<String> whisperCallControlIds
    ) {
        this.whisperCallControlIds = whisperCallControlIds;
        return this;
    }

    public UpdateConferenceRequest addwhisperCallControlIdsItem(
        String whisperCallControlIdsItem
    ) {
        if (this.whisperCallControlIds == null) {
            this.whisperCallControlIds = new ArrayList<>();
        }
        this.whisperCallControlIds.add(whisperCallControlIdsItem);
        return this;
    }

    /**
     * Array of unique call_control_ids the supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only.
     * @return whisperCallControlIds
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[\"v2:Sg1xxxQ_U3ixxxyXT_VDNI3xxxazZdg6Vxxxs4-GNYxxxVaJPOhFMRQ\",\"v2:qqpb0mmvd-ovhhBr0BUQQn0fld5jIboaaX3-De0DkqXHzbf8d75xkw\"]",
        value = "Array of unique call_control_ids the supervisor can whisper to. If none provided, the supervisor will join the conference as a monitoring participant only."
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
     * Return true if this UpdateConferenceRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateConferenceRequest updateConferenceRequest =
            (UpdateConferenceRequest) o;
        return (
            Objects.equals(
                this.callControlId,
                updateConferenceRequest.callControlId
            ) &&
            Objects.equals(this.commandId, updateConferenceRequest.commandId) &&
            Objects.equals(
                this.supervisorRole,
                updateConferenceRequest.supervisorRole
            ) &&
            Objects.equals(
                this.whisperCallControlIds,
                updateConferenceRequest.whisperCallControlIds
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            callControlId,
            commandId,
            supervisorRole,
            whisperCallControlIds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConferenceRequest {\n");
        sb
            .append("    callControlId: ")
            .append(toIndentedString(callControlId))
            .append("\n");
        sb
            .append("    commandId: ")
            .append(toIndentedString(commandId))
            .append("\n");
        sb
            .append("    supervisorRole: ")
            .append(toIndentedString(supervisorRole))
            .append("\n");
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
