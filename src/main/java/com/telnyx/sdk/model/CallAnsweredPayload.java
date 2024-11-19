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
import com.telnyx.sdk.model.CustomSipHeader;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallAnsweredPayload
 */
@JsonPropertyOrder({
  CallAnsweredPayload.JSON_PROPERTY_CALL_CONTROL_ID,
  CallAnsweredPayload.JSON_PROPERTY_CONNECTION_ID,
  CallAnsweredPayload.JSON_PROPERTY_CALL_LEG_ID,
  CallAnsweredPayload.JSON_PROPERTY_CALL_SESSION_ID,
  CallAnsweredPayload.JSON_PROPERTY_CLIENT_STATE,
  CallAnsweredPayload.JSON_PROPERTY_CUSTOM_HEADERS,
  CallAnsweredPayload.JSON_PROPERTY_FROM,
  CallAnsweredPayload.JSON_PROPERTY_TO,
  CallAnsweredPayload.JSON_PROPERTY_START_TIME,
  CallAnsweredPayload.JSON_PROPERTY_STATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CallAnsweredPayload {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_CUSTOM_HEADERS = "custom_headers";
  private List<CustomSipHeader> customHeaders = null;

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
    ANSWERED(String.valueOf("answered"));

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  public CallAnsweredPayload() { 
  }

  public CallAnsweredPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Call ID used to issue commands via Call Control API.
   * @return callControlId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg", value = "Call ID used to issue commands via Call Control API.")
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


  public CallAnsweredPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Call Control App ID (formerly Telnyx connection ID) used in the call.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Call Control App ID (formerly Telnyx connection ID) used in the call.")
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


  public CallAnsweredPayload callLegId(String callLegId) {
    this.callLegId = callLegId;
    return this;
  }

   /**
   * ID that is unique to the call and can be used to correlate webhook events.
   * @return callLegId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-7af4-4bcb-b7f5-5013ef9657c1", value = "ID that is unique to the call and can be used to correlate webhook events.")
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


  public CallAnsweredPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.
   * @return callSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID that is unique to the call session and can be used to correlate webhook events. Call session is a group of related call legs that logically belong to the same phone call, e.g. an inbound and outbound leg of a transferred call.")
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


  public CallAnsweredPayload clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * State received from a command.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "State received from a command.")
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


  public CallAnsweredPayload customHeaders(List<CustomSipHeader> customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

  public CallAnsweredPayload addcustomHeadersItem(CustomSipHeader customHeadersItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"name\":\"head_1\",\"value\":\"val_1\"},{\"name\":\"head_2\",\"value\":\"val_2\"}]", value = "Custom headers set on answer command")
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


  public CallAnsweredPayload from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Number or SIP URI placing the call.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+35319605860", value = "Number or SIP URI placing the call.")
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


  public CallAnsweredPayload to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Destination number or SIP URI of the call.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+13129457420", value = "Destination number or SIP URI of the call.")
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


  public CallAnsweredPayload startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * ISO 8601 datetime of when the call started.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-02-02T22:20:27.521992Z", value = "ISO 8601 datetime of when the call started.")
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


  public CallAnsweredPayload state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State received from a command.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "answered", value = "State received from a command.")
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


  /**
   * Return true if this CallAnswered_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallAnsweredPayload callAnsweredPayload = (CallAnsweredPayload) o;
    return Objects.equals(this.callControlId, callAnsweredPayload.callControlId) &&
        Objects.equals(this.connectionId, callAnsweredPayload.connectionId) &&
        Objects.equals(this.callLegId, callAnsweredPayload.callLegId) &&
        Objects.equals(this.callSessionId, callAnsweredPayload.callSessionId) &&
        Objects.equals(this.clientState, callAnsweredPayload.clientState) &&
        Objects.equals(this.customHeaders, callAnsweredPayload.customHeaders) &&
        Objects.equals(this.from, callAnsweredPayload.from) &&
        Objects.equals(this.to, callAnsweredPayload.to) &&
        Objects.equals(this.startTime, callAnsweredPayload.startTime) &&
        Objects.equals(this.state, callAnsweredPayload.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, connectionId, callLegId, callSessionId, clientState, customHeaders, from, to, startTime, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallAnsweredPayload {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

