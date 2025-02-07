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
import com.telnyx.sdk.model.GatherUsingAIRequestMessageHistoryInner;
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
 * CallAIGatherEndedPayload
 */
@JsonPropertyOrder(
    {
        CallAIGatherEndedPayload.JSON_PROPERTY_CALL_CONTROL_ID,
        CallAIGatherEndedPayload.JSON_PROPERTY_CONNECTION_ID,
        CallAIGatherEndedPayload.JSON_PROPERTY_CALL_LEG_ID,
        CallAIGatherEndedPayload.JSON_PROPERTY_CALL_SESSION_ID,
        CallAIGatherEndedPayload.JSON_PROPERTY_CLIENT_STATE,
        CallAIGatherEndedPayload.JSON_PROPERTY_FROM,
        CallAIGatherEndedPayload.JSON_PROPERTY_TO,
        CallAIGatherEndedPayload.JSON_PROPERTY_MESSAGE_HISTORY,
        CallAIGatherEndedPayload.JSON_PROPERTY_RESULT,
        CallAIGatherEndedPayload.JSON_PROPERTY_STATUS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallAIGatherEndedPayload {

    public static final String JSON_PROPERTY_CALL_CONTROL_ID =
        "call_control_id";
    private String callControlId;

    public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
    private String connectionId;

    public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
    private String callLegId;

    public static final String JSON_PROPERTY_CALL_SESSION_ID =
        "call_session_id";
    private String callSessionId;

    public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
    private String clientState;

    public static final String JSON_PROPERTY_FROM = "from";
    private String from;

    public static final String JSON_PROPERTY_TO = "to";
    private String to;

    public static final String JSON_PROPERTY_MESSAGE_HISTORY =
        "message_history";
    private List<GatherUsingAIRequestMessageHistoryInner> messageHistory = null;

    public static final String JSON_PROPERTY_RESULT = "result";
    private Object result;

    /**
     * Reflects how command ended.
     */
    public enum StatusEnum {
        VALID(String.valueOf("valid")),

        INVALID(String.valueOf("invalid"));

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATUS = "status";
    private StatusEnum status;

    public CallAIGatherEndedPayload() {}

    public CallAIGatherEndedPayload callControlId(String callControlId) {
        this.callControlId = callControlId;
        return this;
    }

    /**
     * Call ID used to issue commands via Call Control API.
     * @return callControlId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "v2:T02llQxIyaRkhfRKxgAP8nY511EhFLizdvdUKJiSw8d6A9BborherQ",
        value = "Call ID used to issue commands via Call Control API."
    )
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

    public CallAIGatherEndedPayload connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Telnyx connection ID used in the call.
     * @return connectionId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "7267xxxxxxxxxxxxxx",
        value = "Telnyx connection ID used in the call."
    )
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

    public CallAIGatherEndedPayload callLegId(String callLegId) {
        this.callLegId = callLegId;
        return this;
    }

    /**
     * ID that is unique to the call and can be used to correlate webhook events.
     * @return callLegId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1",
        value = "ID that is unique to the call and can be used to correlate webhook events."
    )
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

    public CallAIGatherEndedPayload callSessionId(String callSessionId) {
        this.callSessionId = callSessionId;
        return this;
    }

    /**
     * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.
     * @return callSessionId
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1",
        value = "ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call."
    )
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

    public CallAIGatherEndedPayload clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * State received from a command.
     * @return clientState
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "aGF2ZSBhIG5pY2UgZGF5ID1d",
        value = "State received from a command."
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

    public CallAIGatherEndedPayload from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Number or SIP URI placing the call.
     * @return from
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+35319605860",
        value = "Number or SIP URI placing the call."
    )
    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFrom() {
        return from;
    }

    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFrom(String from) {
        this.from = from;
    }

    public CallAIGatherEndedPayload to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Destination number or SIP URI of the call.
     * @return to
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "+13129457420",
        value = "Destination number or SIP URI of the call."
    )
    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTo() {
        return to;
    }

    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTo(String to) {
        this.to = to;
    }

    public CallAIGatherEndedPayload messageHistory(
        List<GatherUsingAIRequestMessageHistoryInner> messageHistory
    ) {
        this.messageHistory = messageHistory;
        return this;
    }

    public CallAIGatherEndedPayload addmessageHistoryItem(
        GatherUsingAIRequestMessageHistoryInner messageHistoryItem
    ) {
        if (this.messageHistory == null) {
            this.messageHistory = new ArrayList<>();
        }
        this.messageHistory.add(messageHistoryItem);
        return this;
    }

    /**
     * The history of the messages exchanged during the AI gather
     * @return messageHistory
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The history of the messages exchanged during the AI gather"
    )
    @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<GatherUsingAIRequestMessageHistoryInner> getMessageHistory() {
        return messageHistory;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE_HISTORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessageHistory(
        List<GatherUsingAIRequestMessageHistoryInner> messageHistory
    ) {
        this.messageHistory = messageHistory;
    }

    public CallAIGatherEndedPayload result(Object result) {
        this.result = result;
        return this;
    }

    /**
     * The result of the AI gather, its type depends of the &#x60;parameters&#x60; provided in the command
     * @return result
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "{\"age\":29,\"city\":\"Paris\"}",
        value = "The result of the AI gather, its type depends of the `parameters` provided in the command"
    )
    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getResult() {
        return result;
    }

    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResult(Object result) {
        this.result = result;
    }

    public CallAIGatherEndedPayload status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Reflects how command ended.
     * @return status
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "valid", value = "Reflects how command ended.")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Return true if this CallAIGatherEnded_payload object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallAIGatherEndedPayload callAIGatherEndedPayload =
            (CallAIGatherEndedPayload) o;
        return (
            Objects.equals(
                this.callControlId,
                callAIGatherEndedPayload.callControlId
            ) &&
            Objects.equals(
                this.connectionId,
                callAIGatherEndedPayload.connectionId
            ) &&
            Objects.equals(
                this.callLegId,
                callAIGatherEndedPayload.callLegId
            ) &&
            Objects.equals(
                this.callSessionId,
                callAIGatherEndedPayload.callSessionId
            ) &&
            Objects.equals(
                this.clientState,
                callAIGatherEndedPayload.clientState
            ) &&
            Objects.equals(this.from, callAIGatherEndedPayload.from) &&
            Objects.equals(this.to, callAIGatherEndedPayload.to) &&
            Objects.equals(
                this.messageHistory,
                callAIGatherEndedPayload.messageHistory
            ) &&
            Objects.equals(this.result, callAIGatherEndedPayload.result) &&
            Objects.equals(this.status, callAIGatherEndedPayload.status)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            callControlId,
            connectionId,
            callLegId,
            callSessionId,
            clientState,
            from,
            to,
            messageHistory,
            result,
            status
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallAIGatherEndedPayload {\n");
        sb
            .append("    callControlId: ")
            .append(toIndentedString(callControlId))
            .append("\n");
        sb
            .append("    connectionId: ")
            .append(toIndentedString(connectionId))
            .append("\n");
        sb
            .append("    callLegId: ")
            .append(toIndentedString(callLegId))
            .append("\n");
        sb
            .append("    callSessionId: ")
            .append(toIndentedString(callSessionId))
            .append("\n");
        sb
            .append("    clientState: ")
            .append(toIndentedString(clientState))
            .append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb
            .append("    messageHistory: ")
            .append(toIndentedString(messageHistory))
            .append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
