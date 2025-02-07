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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * ResumeConferenceRecordingRequest
 */
@JsonPropertyOrder({
  ResumeConferenceRecordingRequest.JSON_PROPERTY_COMMAND_ID,
  ResumeConferenceRecordingRequest.JSON_PROPERTY_RECORDING_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ResumeConferenceRecordingRequest {
  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public static final String JSON_PROPERTY_RECORDING_ID = "recording_id";
  private String recordingId;

  public ResumeConferenceRecordingRequest() { 
  }

  public ResumeConferenceRecordingRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
   * @return commandId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "891510ac-f3e4-11e8-af5b-de00688a4901", value = "Use this field to avoid duplicate commands. Telnyx will ignore any command with the same `command_id` for the same `call_control_id`.")
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


  public ResumeConferenceRecordingRequest recordingId(String recordingId) {
    this.recordingId = recordingId;
    return this;
  }

   /**
   * Use this field to resume specific recording.
   * @return recordingId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6e00ab49-9487-4364-8ad6-23965965afb2", value = "Use this field to resume specific recording.")
  @JsonProperty(JSON_PROPERTY_RECORDING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordingId() {
    return recordingId;
  }


  @JsonProperty(JSON_PROPERTY_RECORDING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordingId(String recordingId) {
    this.recordingId = recordingId;
  }


  /**
   * Return true if this ResumeConferenceRecordingRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumeConferenceRecordingRequest resumeConferenceRecordingRequest = (ResumeConferenceRecordingRequest) o;
    return Objects.equals(this.commandId, resumeConferenceRecordingRequest.commandId) &&
        Objects.equals(this.recordingId, resumeConferenceRecordingRequest.recordingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandId, recordingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumeConferenceRecordingRequest {\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    recordingId: ").append(toIndentedString(recordingId)).append("\n");
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

