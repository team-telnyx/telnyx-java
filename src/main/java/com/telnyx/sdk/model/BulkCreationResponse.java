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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * BulkCreationResponse
 */
@JsonPropertyOrder({
  BulkCreationResponse.JSON_PROPERTY_BRAND_COUNT,
  BulkCreationResponse.JSON_PROPERTY_TASK_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class BulkCreationResponse {
  public static final String JSON_PROPERTY_BRAND_COUNT = "brandCount";
  private Integer brandCount;

  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  private String taskId;

  public BulkCreationResponse() { 
  }

  public BulkCreationResponse brandCount(Integer brandCount) {
    this.brandCount = brandCount;
    return this;
  }

   /**
   * The total number of brands to be created.
   * @return brandCount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "The total number of brands to be created.")
  @JsonProperty(JSON_PROPERTY_BRAND_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBrandCount() {
    return brandCount;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrandCount(Integer brandCount) {
    this.brandCount = brandCount;
  }


  public BulkCreationResponse taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * The ID of the task associated with bulk Sole Proprietor brand and campaign creation.
   * @return taskId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "667a80f8-b0a9-49d0-b9ab-a7a1bcc45086", required = true, value = "The ID of the task associated with bulk Sole Proprietor brand and campaign creation.")
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTaskId() {
    return taskId;
  }


  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }


  /**
   * Return true if this BulkCreationResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkCreationResponse bulkCreationResponse = (BulkCreationResponse) o;
    return Objects.equals(this.brandCount, bulkCreationResponse.brandCount) &&
        Objects.equals(this.taskId, bulkCreationResponse.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandCount, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkCreationResponse {\n");
    sb.append("    brandCount: ").append(toIndentedString(brandCount)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

