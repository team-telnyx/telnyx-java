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

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallReferFailedPayload
 */
@JsonPropertyOrder({
  CallReferFailedPayload.JSON_PROPERTY_CALL_CONTROL_ID,
  CallReferFailedPayload.JSON_PROPERTY_CALL_LEG_ID,
  CallReferFailedPayload.JSON_PROPERTY_CALL_SESSION_ID,
  CallReferFailedPayload.JSON_PROPERTY_CONNECTION_ID,
  CallReferFailedPayload.JSON_PROPERTY_CLIENT_STATE,
  CallReferFailedPayload.JSON_PROPERTY_FROM,
  CallReferFailedPayload.JSON_PROPERTY_SIP_NOTIFY_RESPONSE,
  CallReferFailedPayload.JSON_PROPERTY_TO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallReferFailedPayload {
  public static final String JSON_PROPERTY_CALL_CONTROL_ID = "call_control_id";
  private String callControlId;

  public static final String JSON_PROPERTY_CALL_LEG_ID = "call_leg_id";
  private String callLegId;

  public static final String JSON_PROPERTY_CALL_SESSION_ID = "call_session_id";
  private String callSessionId;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_SIP_NOTIFY_RESPONSE = "sip_notify_response";
  private Integer sipNotifyResponse;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;


  public CallReferFailedPayload callControlId(String callControlId) {
    this.callControlId = callControlId;
    return this;
  }

   /**
   * Unique ID for controlling the call.
   * @return callControlId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v2:OycMASgvIjsGIAVEx8x3n9rYeKnUJx6a3V8VGhs5futnr17KZhujZA", value = "Unique ID for controlling the call.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallControlId() {
    return callControlId;
  }


  public void setCallControlId(String callControlId) {
    this.callControlId = callControlId;
  }


  public CallReferFailedPayload callLegId(String callLegId) {
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


  public void setCallLegId(String callLegId) {
    this.callLegId = callLegId;
  }


  public CallReferFailedPayload callSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
    return this;
  }

   /**
   * ID that is unique to the call session and can be used to correlate webhook events.
   * @return callSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "428c31b6-abf3-3bc1-b7f4-5013ef9657c1", value = "ID that is unique to the call session and can be used to correlate webhook events.")
  @JsonProperty(JSON_PROPERTY_CALL_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallSessionId() {
    return callSessionId;
  }


  public void setCallSessionId(String callSessionId) {
    this.callSessionId = callSessionId;
  }


  public CallReferFailedPayload connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Telnyx connection ID used in the call.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7267xxxxxxxxxxxxxx", value = "Telnyx connection ID used in the call.")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public CallReferFailedPayload clientState(String clientState) {
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


  public void setClientState(String clientState) {
    this.clientState = clientState;
  }


  public CallReferFailedPayload from(String from) {
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


  public void setFrom(String from) {
    this.from = from;
  }


  public CallReferFailedPayload sipNotifyResponse(Integer sipNotifyResponse) {
    this.sipNotifyResponse = sipNotifyResponse;
    return this;
  }

   /**
   * SIP NOTIFY event status for tracking the REFER attempt.
   * @return sipNotifyResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "603", value = "SIP NOTIFY event status for tracking the REFER attempt.")
  @JsonProperty(JSON_PROPERTY_SIP_NOTIFY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSipNotifyResponse() {
    return sipNotifyResponse;
  }


  public void setSipNotifyResponse(Integer sipNotifyResponse) {
    this.sipNotifyResponse = sipNotifyResponse;
  }


  public CallReferFailedPayload to(String to) {
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


  public void setTo(String to) {
    this.to = to;
  }


  /**
   * Return true if this CallReferFailed_payload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallReferFailedPayload callReferFailedPayload = (CallReferFailedPayload) o;
    return Objects.equals(this.callControlId, callReferFailedPayload.callControlId) &&
        Objects.equals(this.callLegId, callReferFailedPayload.callLegId) &&
        Objects.equals(this.callSessionId, callReferFailedPayload.callSessionId) &&
        Objects.equals(this.connectionId, callReferFailedPayload.connectionId) &&
        Objects.equals(this.clientState, callReferFailedPayload.clientState) &&
        Objects.equals(this.from, callReferFailedPayload.from) &&
        Objects.equals(this.sipNotifyResponse, callReferFailedPayload.sipNotifyResponse) &&
        Objects.equals(this.to, callReferFailedPayload.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlId, callLegId, callSessionId, connectionId, clientState, from, sipNotifyResponse, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallReferFailedPayload {\n");
    sb.append("    callControlId: ").append(toIndentedString(callControlId)).append("\n");
    sb.append("    callLegId: ").append(toIndentedString(callLegId)).append("\n");
    sb.append("    callSessionId: ").append(toIndentedString(callSessionId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    sipNotifyResponse: ").append(toIndentedString(sipNotifyResponse)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

