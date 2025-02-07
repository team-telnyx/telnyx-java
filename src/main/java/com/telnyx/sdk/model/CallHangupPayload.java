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
import com.telnyx.sdk.model.CustomSipHeader;
import com.telnyx.sdk.model.SipHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * CallHangupPayload
 */
@JsonPropertyOrder(
    {
        CallHangupPayload.JSON_PROPERTY_CALL_CONTROL_ID,
        CallHangupPayload.JSON_PROPERTY_CONNECTION_ID,
        CallHangupPayload.JSON_PROPERTY_CALL_LEG_ID,
        CallHangupPayload.JSON_PROPERTY_CALL_SESSION_ID,
        CallHangupPayload.JSON_PROPERTY_CLIENT_STATE,
        CallHangupPayload.JSON_PROPERTY_CUSTOM_HEADERS,
        CallHangupPayload.JSON_PROPERTY_SIP_HEADERS,
        CallHangupPayload.JSON_PROPERTY_FROM,
        CallHangupPayload.JSON_PROPERTY_TO,
        CallHangupPayload.JSON_PROPERTY_START_TIME,
        CallHangupPayload.JSON_PROPERTY_STATE,
        CallHangupPayload.JSON_PROPERTY_TAGS,
        CallHangupPayload.JSON_PROPERTY_HANGUP_CAUSE,
        CallHangupPayload.JSON_PROPERTY_HANGUP_SOURCE,
        CallHangupPayload.JSON_PROPERTY_SIP_HANGUP_CAUSE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CallHangupPayload {

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

    public static final String JSON_PROPERTY_CUSTOM_HEADERS = "custom_headers";
    private List<CustomSipHeader> customHeaders = null;

    public static final String JSON_PROPERTY_SIP_HEADERS = "sip_headers";
    private List<SipHeader> sipHeaders = null;

    public static final String JSON_PROPERTY_FROM = "from";
    private String from;

    public static final String JSON_PROPERTY_TO = "to";
    private String to;

    public static final String JSON_PROPERTY_START_TIME = "start_time";
    private OffsetDateTime startTime;

    /**
     * State received from a command.
     */
    public enum StateEnum {
        HANGUP(String.valueOf("hangup"));

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATE = "state";
    private StateEnum state;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private List<String> tags = null;

    /**
     * The reason the call was ended (&#x60;call_rejected&#x60;, &#x60;normal_clearing&#x60;, &#x60;originator_cancel&#x60;, &#x60;timeout&#x60;, &#x60;time_limit&#x60;, &#x60;user_busy&#x60;, &#x60;not_found&#x60; or &#x60;unspecified&#x60;).
     */
    public enum HangupCauseEnum {
        CALL_REJECTED(String.valueOf("call_rejected")),

        NORMAL_CLEARING(String.valueOf("normal_clearing")),

        ORIGINATOR_CANCEL(String.valueOf("originator_cancel")),

        TIMEOUT(String.valueOf("timeout")),

        TIME_LIMIT(String.valueOf("time_limit")),

        USER_BUSY(String.valueOf("user_busy")),

        NOT_FOUND(String.valueOf("not_found")),

        UNSPECIFIED(String.valueOf("unspecified"));

        private String value;

        HangupCauseEnum(String value) {
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
        public static HangupCauseEnum fromValue(String value) {
            for (HangupCauseEnum b : HangupCauseEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_HANGUP_CAUSE = "hangup_cause";
    private HangupCauseEnum hangupCause;

    /**
     * The party who ended the call (&#x60;callee&#x60;, &#x60;caller&#x60;, &#x60;unknown&#x60;).
     */
    public enum HangupSourceEnum {
        CALLER(String.valueOf("caller")),

        CALLEE(String.valueOf("callee")),

        UNKNOWN(String.valueOf("unknown"));

        private String value;

        HangupSourceEnum(String value) {
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
        public static HangupSourceEnum fromValue(String value) {
            for (HangupSourceEnum b : HangupSourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_HANGUP_SOURCE = "hangup_source";
    private HangupSourceEnum hangupSource;

    public static final String JSON_PROPERTY_SIP_HANGUP_CAUSE =
        "sip_hangup_cause";
    private String sipHangupCause;

    public CallHangupPayload() {}

    public CallHangupPayload callControlId(String callControlId) {
        this.callControlId = callControlId;
        return this;
    }

    /**
     * Call ID used to issue commands via Call Control API.
     * @return callControlId
     **/
    @jakarta.annotation.Nullable
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

    public CallHangupPayload connectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Call Control App ID (formerly Telnyx connection ID) used in the call.
     * @return connectionId
     **/
    @jakarta.annotation.Nullable
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

    public CallHangupPayload callLegId(String callLegId) {
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

    public CallHangupPayload callSessionId(String callSessionId) {
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

    public CallHangupPayload clientState(String clientState) {
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

    public CallHangupPayload customHeaders(
        List<CustomSipHeader> customHeaders
    ) {
        this.customHeaders = customHeaders;
        return this;
    }

    public CallHangupPayload addcustomHeadersItem(
        CustomSipHeader customHeadersItem
    ) {
        if (this.customHeaders == null) {
            this.customHeaders = new ArrayList<>();
        }
        this.customHeaders.add(customHeadersItem);
        return this;
    }

    /**
     * Custom headers set on answer command
     * @return customHeaders
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[{\"name\":\"head_1\",\"value\":\"val_1\"},{\"name\":\"head_2\",\"value\":\"val_2\"}]",
        value = "Custom headers set on answer command"
    )
    @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<CustomSipHeader> getCustomHeaders() {
        return customHeaders;
    }

    @JsonProperty(JSON_PROPERTY_CUSTOM_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCustomHeaders(List<CustomSipHeader> customHeaders) {
        this.customHeaders = customHeaders;
    }

    public CallHangupPayload sipHeaders(List<SipHeader> sipHeaders) {
        this.sipHeaders = sipHeaders;
        return this;
    }

    public CallHangupPayload addsipHeadersItem(SipHeader sipHeadersItem) {
        if (this.sipHeaders == null) {
            this.sipHeaders = new ArrayList<>();
        }
        this.sipHeaders.add(sipHeadersItem);
        return this;
    }

    /**
     * User-to-User and Diversion headers from sip invite.
     * @return sipHeaders
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[{\"name\":\"User-to-User\",\"value\":\"1234\"},{\"name\":\"Diversion\",\"value\":\"<sip:111@192.168.1.1>\"}]",
        value = "User-to-User and Diversion headers from sip invite."
    )
    @JsonProperty(JSON_PROPERTY_SIP_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<SipHeader> getSipHeaders() {
        return sipHeaders;
    }

    @JsonProperty(JSON_PROPERTY_SIP_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSipHeaders(List<SipHeader> sipHeaders) {
        this.sipHeaders = sipHeaders;
    }

    public CallHangupPayload from(String from) {
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

    public CallHangupPayload to(String to) {
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

    public CallHangupPayload startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * ISO 8601 datetime of when the call started.
     * @return startTime
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:20:27.521992Z",
        value = "ISO 8601 datetime of when the call started."
    )
    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public CallHangupPayload state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * State received from a command.
     * @return state
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "hangup",
        value = "State received from a command."
    )
    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StateEnum getState() {
        return state;
    }

    @JsonProperty(JSON_PROPERTY_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setState(StateEnum state) {
        this.state = state;
    }

    public CallHangupPayload tags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CallHangupPayload addtagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    /**
     * Array of tags associated to number.
     * @return tags
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "[\"tag-01\",\"tag-02\"]",
        value = "Array of tags associated to number."
    )
    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CallHangupPayload hangupCause(HangupCauseEnum hangupCause) {
        this.hangupCause = hangupCause;
        return this;
    }

    /**
     * The reason the call was ended (&#x60;call_rejected&#x60;, &#x60;normal_clearing&#x60;, &#x60;originator_cancel&#x60;, &#x60;timeout&#x60;, &#x60;time_limit&#x60;, &#x60;user_busy&#x60;, &#x60;not_found&#x60; or &#x60;unspecified&#x60;).
     * @return hangupCause
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "call_rejected",
        value = "The reason the call was ended (`call_rejected`, `normal_clearing`, `originator_cancel`, `timeout`, `time_limit`, `user_busy`, `not_found` or `unspecified`)."
    )
    @JsonProperty(JSON_PROPERTY_HANGUP_CAUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public HangupCauseEnum getHangupCause() {
        return hangupCause;
    }

    @JsonProperty(JSON_PROPERTY_HANGUP_CAUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHangupCause(HangupCauseEnum hangupCause) {
        this.hangupCause = hangupCause;
    }

    public CallHangupPayload hangupSource(HangupSourceEnum hangupSource) {
        this.hangupSource = hangupSource;
        return this;
    }

    /**
     * The party who ended the call (&#x60;callee&#x60;, &#x60;caller&#x60;, &#x60;unknown&#x60;).
     * @return hangupSource
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "caller",
        value = "The party who ended the call (`callee`, `caller`, `unknown`)."
    )
    @JsonProperty(JSON_PROPERTY_HANGUP_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public HangupSourceEnum getHangupSource() {
        return hangupSource;
    }

    @JsonProperty(JSON_PROPERTY_HANGUP_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHangupSource(HangupSourceEnum hangupSource) {
        this.hangupSource = hangupSource;
    }

    public CallHangupPayload sipHangupCause(String sipHangupCause) {
        this.sipHangupCause = sipHangupCause;
        return this;
    }

    /**
     * The reason the call was ended (SIP response code). If the SIP response is unavailable (in inbound calls for example) this is set to &#x60;unspecified&#x60;.
     * @return sipHangupCause
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "603",
        value = "The reason the call was ended (SIP response code). If the SIP response is unavailable (in inbound calls for example) this is set to `unspecified`."
    )
    @JsonProperty(JSON_PROPERTY_SIP_HANGUP_CAUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSipHangupCause() {
        return sipHangupCause;
    }

    @JsonProperty(JSON_PROPERTY_SIP_HANGUP_CAUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSipHangupCause(String sipHangupCause) {
        this.sipHangupCause = sipHangupCause;
    }

    /**
     * Return true if this CallHangup_payload object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallHangupPayload callHangupPayload = (CallHangupPayload) o;
        return (
            Objects.equals(
                this.callControlId,
                callHangupPayload.callControlId
            ) &&
            Objects.equals(this.connectionId, callHangupPayload.connectionId) &&
            Objects.equals(this.callLegId, callHangupPayload.callLegId) &&
            Objects.equals(
                this.callSessionId,
                callHangupPayload.callSessionId
            ) &&
            Objects.equals(this.clientState, callHangupPayload.clientState) &&
            Objects.equals(
                this.customHeaders,
                callHangupPayload.customHeaders
            ) &&
            Objects.equals(this.sipHeaders, callHangupPayload.sipHeaders) &&
            Objects.equals(this.from, callHangupPayload.from) &&
            Objects.equals(this.to, callHangupPayload.to) &&
            Objects.equals(this.startTime, callHangupPayload.startTime) &&
            Objects.equals(this.state, callHangupPayload.state) &&
            Objects.equals(this.tags, callHangupPayload.tags) &&
            Objects.equals(this.hangupCause, callHangupPayload.hangupCause) &&
            Objects.equals(this.hangupSource, callHangupPayload.hangupSource) &&
            Objects.equals(
                this.sipHangupCause,
                callHangupPayload.sipHangupCause
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
            customHeaders,
            sipHeaders,
            from,
            to,
            startTime,
            state,
            tags,
            hangupCause,
            hangupSource,
            sipHangupCause
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CallHangupPayload {\n");
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
        sb
            .append("    customHeaders: ")
            .append(toIndentedString(customHeaders))
            .append("\n");
        sb
            .append("    sipHeaders: ")
            .append(toIndentedString(sipHeaders))
            .append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb
            .append("    startTime: ")
            .append(toIndentedString(startTime))
            .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb
            .append("    hangupCause: ")
            .append(toIndentedString(hangupCause))
            .append("\n");
        sb
            .append("    hangupSource: ")
            .append(toIndentedString(hangupSource))
            .append("\n");
        sb
            .append("    sipHangupCause: ")
            .append(toIndentedString(sipHangupCause))
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
