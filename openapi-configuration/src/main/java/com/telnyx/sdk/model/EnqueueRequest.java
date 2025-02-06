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
 * EnqueueRequest
 */
@JsonPropertyOrder({
  EnqueueRequest.JSON_PROPERTY_QUEUE_NAME,
  EnqueueRequest.JSON_PROPERTY_CLIENT_STATE,
  EnqueueRequest.JSON_PROPERTY_COMMAND_ID,
  EnqueueRequest.JSON_PROPERTY_MAX_WAIT_TIME_SECS,
  EnqueueRequest.JSON_PROPERTY_MAX_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class EnqueueRequest {
  public static final String JSON_PROPERTY_QUEUE_NAME = "queue_name";
  private String queueName;

  public static final String JSON_PROPERTY_CLIENT_STATE = "client_state";
  private String clientState;

  public static final String JSON_PROPERTY_COMMAND_ID = "command_id";
  private String commandId;

  public static final String JSON_PROPERTY_MAX_WAIT_TIME_SECS = "max_wait_time_secs";
  private Integer maxWaitTimeSecs;

  public static final String JSON_PROPERTY_MAX_SIZE = "max_size";
  private Integer maxSize = 100;

  public EnqueueRequest() { 
  }

  public EnqueueRequest queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

   /**
   * The name of the queue the call should be put in. If a queue with a given name doesn&#39;t exist yet it will be created.
   * @return queueName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "tier_1_support", required = true, value = "The name of the queue the call should be put in. If a queue with a given name doesn't exist yet it will be created.")
  @JsonProperty(JSON_PROPERTY_QUEUE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQueueName() {
    return queueName;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }


  public EnqueueRequest clientState(String clientState) {
    this.clientState = clientState;
    return this;
  }

   /**
   * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.
   * @return clientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "aGF2ZSBhIG5pY2UgZGF5ID1d", value = "Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded string.")
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


  public EnqueueRequest commandId(String commandId) {
    this.commandId = commandId;
    return this;
  }

   /**
   * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same &#x60;command_id&#x60; for the same &#x60;call_control_id&#x60;.
   * @return commandId
  **/
  @javax.annotation.Nullable
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


  public EnqueueRequest maxWaitTimeSecs(Integer maxWaitTimeSecs) {
    this.maxWaitTimeSecs = maxWaitTimeSecs;
    return this;
  }

   /**
   * The number of seconds after which the call will be removed from the queue.
   * @return maxWaitTimeSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "600", value = "The number of seconds after which the call will be removed from the queue.")
  @JsonProperty(JSON_PROPERTY_MAX_WAIT_TIME_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxWaitTimeSecs() {
    return maxWaitTimeSecs;
  }


  @JsonProperty(JSON_PROPERTY_MAX_WAIT_TIME_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxWaitTimeSecs(Integer maxWaitTimeSecs) {
    this.maxWaitTimeSecs = maxWaitTimeSecs;
  }


  public EnqueueRequest maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * The maximum number of calls allowed in the queue at a given time. Can&#39;t be modified for an existing queue.
   * @return maxSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "The maximum number of calls allowed in the queue at a given time. Can't be modified for an existing queue.")
  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxSize() {
    return maxSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  /**
   * Return true if this EnqueueRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnqueueRequest enqueueRequest = (EnqueueRequest) o;
    return Objects.equals(this.queueName, enqueueRequest.queueName) &&
        Objects.equals(this.clientState, enqueueRequest.clientState) &&
        Objects.equals(this.commandId, enqueueRequest.commandId) &&
        Objects.equals(this.maxWaitTimeSecs, enqueueRequest.maxWaitTimeSecs) &&
        Objects.equals(this.maxSize, enqueueRequest.maxSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueName, clientState, commandId, maxWaitTimeSecs, maxSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnqueueRequest {\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    clientState: ").append(toIndentedString(clientState)).append("\n");
    sb.append("    commandId: ").append(toIndentedString(commandId)).append("\n");
    sb.append("    maxWaitTimeSecs: ").append(toIndentedString(maxWaitTimeSecs)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
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

