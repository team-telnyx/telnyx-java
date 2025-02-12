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
 * CallMachineDetectionEndedPayload
 */
@JsonPropertyOrder(
    {
        CallMachineDetectionEndedPayload.JSON_PROPERTY_CALL_CONTROL_ID,
        CallMachineDetectionEndedPayload.JSON_PROPERTY_CONNECTION_ID,
        CallMachineDetectionEndedPayload.JSON_PROPERTY_CALL_LEG_ID,
        CallMachineDetectionEndedPayload.JSON_PROPERTY_CALL_SESSION_ID,
        CallMachineDetectionEndedPayload.JSON_PROPERTY_CLIENT_STATE,
        CallMachineDetectionEndedPayload.JSON_PROPERTY_FROM,
        CallMachineDetectionEndedPayload.JSON_PROPERTY_TO,
        CallMachineDetectionEndedPayload.JSON_PROPERTY_RESULT,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallMachineDetectionEndedPayload {

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

    /**
     * Answering machine detection result.
     */
    public enum ResultEnum {
        HUMAN(String.valueOf("human")),

        MACHINE(String.valueOf("machine")),

        NOT_SURE(String.valueOf("not_sure"));

        private String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            for (ResultEnum b : ResultEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RESULT = "result";
    private ResultEnum result;

    public CallMachineDetectionEndedPayload() {}

    public CallMachineDetectionEndedPayload callControlId(
        String callControlId
    ) {
        this.callControlId = callControlId;
        return this;
    }

    /**
     * Call ID used to issue commands via Call Control API.
     * @return callControlId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg",
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

    public CallMachineDetectionEndedPayload connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Call Control App ID (formerly Telnyx connection ID) used in the call.
     * @return connectionId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "7267xxxxxxxxxxxxxx",
        value = "Call Control App ID (formerly Telnyx connection ID) used in the call."
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

    public CallMachineDetectionEndedPayload callLegId(String callLegId) {
        this.callLegId = callLegId;
        return this;
    }

    /**
     * ID that is unique to the call and can be used to correlate webhook events.
     * @return callLegId
     **/
    @javax.annotation.Nullable
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

    public CallMachineDetectionEndedPayload callSessionId(
        String callSessionId
    ) {
        this.callSessionId = callSessionId;
        return this;
    }

    /**
     * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.
     * @return callSessionId
     **/
    @javax.annotation.Nullable
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

    public CallMachineDetectionEndedPayload clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * State received from a command.
     * @return clientState
     **/
    @javax.annotation.Nullable
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

    public CallMachineDetectionEndedPayload from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Number or SIP URI placing the call.
     * @return from
     **/
    @javax.annotation.Nullable
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

    public CallMachineDetectionEndedPayload to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Destination number or SIP URI of the call.
     * @return to
     **/
    @javax.annotation.Nullable
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

    public CallMachineDetectionEndedPayload result(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * Answering machine detection result.
     * @return result
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "machine",
        value = "Answering machine detection result."
    )
    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ResultEnum getResult() {
        return result;
    }

    @JsonProperty(JSON_PROPERTY_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResult(ResultEnum result) {
        this.result = result;
    }

    /**
     * Return true if this CallMachineDetectionEnded_payload object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallMachineDetectionEndedPayload callMachineDetectionEndedPayload =
            (CallMachineDetectionEndedPayload) o;
        return (
            Objects.equals(
                this.callControlId,
                callMachineDetectionEndedPayload.callControlId
            ) &&
            Objects.equals(
                this.connectionId,
                callMachineDetectionEndedPayload.connectionId
            ) &&
            Objects.equals(
                this.callLegId,
                callMachineDetectionEndedPayload.callLegId
            ) &&
            Objects.equals(
                this.callSessionId,
                callMachineDetectionEndedPayload.callSessionId
            ) &&
            Objects.equals(
                this.clientState,
                callMachineDetectionEndedPayload.clientState
            ) &&
            Objects.equals(this.from, callMachineDetectionEndedPayload.from) &&
            Objects.equals(this.to, callMachineDetectionEndedPayload.to) &&
            Objects.equals(this.result, callMachineDetectionEndedPayload.result)
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
            result
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallMachineDetectionEndedPayload {\n");
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
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
