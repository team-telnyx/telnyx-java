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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ConferenceStopRequest
 */
@JsonPropertyOrder({
  ConferenceStopRequest.JSON_PROPERTY_CALL_CONTROL_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ConferenceStopRequest {
  public static final String JSON_PROPERTY_CALL_CONTROL_IDS = "call_control_ids";
  private List<String> callControlIds = null;

  public ConferenceStopRequest() { 
  }

  public ConferenceStopRequest callControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
    return this;
  }

  public ConferenceStopRequest addCallControlIdsItem(String callControlIdsItem) {
    if (this.callControlIds == null) {
      this.callControlIds = new ArrayList<>();
    }
    this.callControlIds.add(callControlIdsItem);
    return this;
  }

   /**
   * List of call control ids identifying participants the audio file should stop be played to. If not given, the audio will be stoped to the entire conference.
   * @return callControlIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of call control ids identifying participants the audio file should stop be played to. If not given, the audio will be stoped to the entire conference.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCallControlIds() {
    return callControlIds;
  }


  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
  }


  /**
   * Return true if this ConferenceStopRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceStopRequest conferenceStopRequest = (ConferenceStopRequest) o;
    return Objects.equals(this.callControlIds, conferenceStopRequest.callControlIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceStopRequest {\n");
    sb.append("    callControlIds: ").append(toIndentedString(callControlIds)).append("\n");
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

