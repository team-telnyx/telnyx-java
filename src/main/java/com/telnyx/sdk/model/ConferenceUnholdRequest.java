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
 * ConferenceUnholdRequest
 */
@JsonPropertyOrder({
  ConferenceUnholdRequest.JSON_PROPERTY_CALL_CONTROL_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ConferenceUnholdRequest {
  public static final String JSON_PROPERTY_CALL_CONTROL_IDS = "call_control_ids";
  private List<String> callControlIds = new ArrayList<>();

  public ConferenceUnholdRequest() { 
  }

  public ConferenceUnholdRequest callControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
    return this;
  }

  public ConferenceUnholdRequest addCallControlIdsItem(String callControlIdsItem) {
    this.callControlIds.add(callControlIdsItem);
    return this;
  }

   /**
   * List of unique identifiers and tokens for controlling the call. Enter each call control ID to be unheld.
   * @return callControlIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of unique identifiers and tokens for controlling the call. Enter each call control ID to be unheld.")
  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getCallControlIds() {
    return callControlIds;
  }


  @JsonProperty(JSON_PROPERTY_CALL_CONTROL_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCallControlIds(List<String> callControlIds) {
    this.callControlIds = callControlIds;
  }


  /**
   * Return true if this ConferenceUnholdRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConferenceUnholdRequest conferenceUnholdRequest = (ConferenceUnholdRequest) o;
    return Objects.equals(this.callControlIds, conferenceUnholdRequest.callControlIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callControlIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceUnholdRequest {\n");
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

