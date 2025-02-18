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
 * ActiveCall
 */
@JsonPropertyOrder(
    {
        ActiveCall.JSON_PROPERTY_RECORD_TYPE,
        ActiveCall.JSON_PROPERTY_CALL_SESSION_ID,
        ActiveCall.JSON_PROPERTY_CALL_LEG_ID,
        ActiveCall.JSON_PROPERTY_CALL_CONTROL_ID,
        ActiveCall.JSON_PROPERTY_CLIENT_STATE,
        ActiveCall.JSON_PROPERTY_CALL_DURATION,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ActiveCall {

    /**
     * Gets or Sets recordType
     */
    public enum RecordTypeEnum {
        CALL(String.valueOf("call"));

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            for (RecordTypeEnum b : RecordTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private RecordTypeEnum recordType;

    public static final String JSON_PROPERTY_CALL_SESSION_ID =
        "call_session_id";
    private String callSessionId;

    public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
    private String callLegId;

    public static final String JSON_PROPERTY_CALL_CONTROL_ID =
        "call_control_id";
    private String callControlId;

    public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
    private String clientState;

    public static final String JSON_PROPERTY_CALL_DURATION = "call_duration";
    private Integer callDuration;

    public ActiveCall() {}

    public ActiveCall recordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * Get recordType
     * @return recordType
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(example = "call", required = true, value = "")
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    public ActiveCall callSessionId(String callSessionId) {
        this.callSessionId = callSessionId;
        return this;
    }

    /**
     * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call
     * @return callSessionId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "428c31b6-7af4-4bcb-b68e-5013ef9657c1",
        required = true,
        value = "ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call"
    )
    @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCallSessionId() {
        return callSessionId;
    }

    @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCallSessionId(String callSessionId) {
        this.callSessionId = callSessionId;
    }

    public ActiveCall callLegId(String callLegId) {
        this.callLegId = callLegId;
        return this;
    }

    /**
     * ID that is unique to the call and can be used to correlate webhook events
     * @return callLegId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1",
        required = true,
        value = "ID that is unique to the call and can be used to correlate webhook events"
    )
    @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCallLegId() {
        return callLegId;
    }

    @JsonProperty(JSON_PROPERTY_CALL_LEG_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCallLegId(String callLegId) {
        this.callLegId = callLegId;
    }

    public ActiveCall callControlId(String callControlId) {
        this.callControlId = callControlId;
        return this;
    }

    /**
     * Unique identifier and token for controlling the call.
     * @return callControlId
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg",
        required = true,
        value = "Unique identifier and token for controlling the call."
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

    public ActiveCall clientState(String clientState) {
        this.clientState = clientState;
        return this;
    }

    /**
     * State received from a command.
     * @return clientState
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "aGF2ZSBhIG5pY2UgZGF5ID1d",
        required = true,
        value = "State received from a command."
    )
    @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getClientState() {
        return clientState;
    }

    @JsonProperty(JSON_PROPERTY_CLIENT_STATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setClientState(String clientState) {
        this.clientState = clientState;
    }

    public ActiveCall callDuration(Integer callDuration) {
        this.callDuration = callDuration;
        return this;
    }

    /**
     * Indicates the duration of the call in seconds
     * @return callDuration
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "50",
        required = true,
        value = "Indicates the duration of the call in seconds"
    )
    @JsonProperty(JSON_PROPERTY_CALL_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getCallDuration() {
        return callDuration;
    }

    @JsonProperty(JSON_PROPERTY_CALL_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    /**
     * Return true if this ActiveCall object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActiveCall activeCall = (ActiveCall) o;
        return (
            Objects.equals(this.recordType, activeCall.recordType) &&
            Objects.equals(this.callSessionId, activeCall.callSessionId) &&
            Objects.equals(this.callLegId, activeCall.callLegId) &&
            Objects.equals(this.callControlId, activeCall.callControlId) &&
            Objects.equals(this.clientState, activeCall.clientState) &&
            Objects.equals(this.callDuration, activeCall.callDuration)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            recordType,
            callSessionId,
            callLegId,
            callControlId,
            clientState,
            callDuration
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActiveCall {\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
            .append("\n");
        sb
            .append("    callSessionId: ")
            .append(toIndentedString(callSessionId))
            .append("\n");
        sb
            .append("    callLegId: ")
            .append(toIndentedString(callLegId))
            .append("\n");
        sb
            .append("    callControlId: ")
            .append(toIndentedString(callControlId))
            .append("\n");
        sb
            .append("    clientState: ")
            .append(toIndentedString(clientState))
            .append("\n");
        sb
            .append("    callDuration: ")
            .append(toIndentedString(callDuration))
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
