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
 * CreateQueueRequest
 */
@JsonPropertyOrder({
  CreateQueueRequest.JSON_PROPERTY_QUEUE_NAME,
  CreateQueueRequest.JSON_PROPERTY_MAX_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateQueueRequest {
  public static final String JSON_PROPERTY_QUEUE_NAME = "queue_name";
  private String queueName;

  public static final String JSON_PROPERTY_MAX_SIZE = "max_size";
  private Integer maxSize = 300;

  public CreateQueueRequest() { 
  }

  public CreateQueueRequest queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

   /**
   * Name of the queue to create
   * @return queueName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "support", required = true, value = "Name of the queue to create")
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


  public CreateQueueRequest maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Maximum number of calls that can be in the queue at once
   * minimum: 1
   * maximum: 300
   * @return maxSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "Maximum number of calls that can be in the queue at once")
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
   * Return true if this CreateQueue_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateQueueRequest createQueueRequest = (CreateQueueRequest) o;
    return Objects.equals(this.queueName, createQueueRequest.queueName) &&
        Objects.equals(this.maxSize, createQueueRequest.maxSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueName, maxSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateQueueRequest {\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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

