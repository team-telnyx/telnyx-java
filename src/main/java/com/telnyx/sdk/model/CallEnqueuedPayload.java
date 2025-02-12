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
 * CallEnqueuedPayload
 */
@JsonPropertyOrder(
    {
        CallEnqueuedPayload.JSON_PROPERTY_CALL_CONTROL_ID,
        CallEnqueuedPayload.JSON_PROPERTY_CONNECTION_ID,
        CallEnqueuedPayload.JSON_PROPERTY_CALL_LEG_ID,
        CallEnqueuedPayload.JSON_PROPERTY_CALL_SESSION_ID,
        CallEnqueuedPayload.JSON_PROPERTY_CLIENT_STATE,
        CallEnqueuedPayload.JSON_PROPERTY_QUEUE,
        CallEnqueuedPayload.JSON_PROPERTY_CURRENT_POSITION,
        CallEnqueuedPayload.JSON_PROPERTY_QUEUE_AVG_WAIT_TIME_SECS,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallEnqueuedPayload {

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

    public static final String JSON_PROPERTY_QUEUE = "queue";
    private String queue;

    public static final String JSON_PROPERTY_CURRENT_POSITION =
        "current_position";
    private Integer currentPosition;

    public static final String JSON_PROPERTY_QUEUE_AVG_WAIT_TIME_SECS =
        "queue_avg_wait_time_secs";
    private Integer queueAvgWaitTimeSecs;

    public CallEnqueuedPayload() {}

    public CallEnqueuedPayload callControlId(String callControlId) {
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

    public CallEnqueuedPayload connectionId(String connectionId) {
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

    public CallEnqueuedPayload callLegId(String callLegId) {
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

    public CallEnqueuedPayload callSessionId(String callSessionId) {
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

    public CallEnqueuedPayload clientState(String clientState) {
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

    public CallEnqueuedPayload queue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * The name of the queue
     * @return queue
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "support", value = "The name of the queue")
    @JsonProperty(JSON_PROPERTY_QUEUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getQueue() {
        return queue;
    }

    @JsonProperty(JSON_PROPERTY_QUEUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQueue(String queue) {
        this.queue = queue;
    }

    public CallEnqueuedPayload currentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
        return this;
    }

    /**
     * Current position of the call in the queue.
     * @return currentPosition
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "7",
        value = "Current position of the call in the queue."
    )
    @JsonProperty(JSON_PROPERTY_CURRENT_POSITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCurrentPosition() {
        return currentPosition;
    }

    @JsonProperty(JSON_PROPERTY_CURRENT_POSITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public CallEnqueuedPayload queueAvgWaitTimeSecs(
        Integer queueAvgWaitTimeSecs
    ) {
        this.queueAvgWaitTimeSecs = queueAvgWaitTimeSecs;
        return this;
    }

    /**
     * Average time call spends in the queue in seconds.
     * @return queueAvgWaitTimeSecs
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "60",
        value = "Average time call spends in the queue in seconds."
    )
    @JsonProperty(JSON_PROPERTY_QUEUE_AVG_WAIT_TIME_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getQueueAvgWaitTimeSecs() {
        return queueAvgWaitTimeSecs;
    }

    @JsonProperty(JSON_PROPERTY_QUEUE_AVG_WAIT_TIME_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQueueAvgWaitTimeSecs(Integer queueAvgWaitTimeSecs) {
        this.queueAvgWaitTimeSecs = queueAvgWaitTimeSecs;
    }

    /**
     * Return true if this CallEnqueued_payload object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallEnqueuedPayload callEnqueuedPayload = (CallEnqueuedPayload) o;
        return (
            Objects.equals(
                this.callControlId,
                callEnqueuedPayload.callControlId
            ) &&
            Objects.equals(
                this.connectionId,
                callEnqueuedPayload.connectionId
            ) &&
            Objects.equals(this.callLegId, callEnqueuedPayload.callLegId) &&
            Objects.equals(
                this.callSessionId,
                callEnqueuedPayload.callSessionId
            ) &&
            Objects.equals(this.clientState, callEnqueuedPayload.clientState) &&
            Objects.equals(this.queue, callEnqueuedPayload.queue) &&
            Objects.equals(
                this.currentPosition,
                callEnqueuedPayload.currentPosition
            ) &&
            Objects.equals(
                this.queueAvgWaitTimeSecs,
                callEnqueuedPayload.queueAvgWaitTimeSecs
            )
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
            queue,
            currentPosition,
            queueAvgWaitTimeSecs
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallEnqueuedPayload {\n");
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
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb
            .append("    currentPosition: ")
            .append(toIndentedString(currentPosition))
            .append("\n");
        sb
            .append("    queueAvgWaitTimeSecs: ")
            .append(toIndentedString(queueAvgWaitTimeSecs))
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
