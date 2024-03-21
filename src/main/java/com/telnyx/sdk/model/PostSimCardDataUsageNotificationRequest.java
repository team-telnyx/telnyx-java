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
import com.telnyx.sdk.model.PostSimCardDataUsageNotificationRequestThreshold;
import java.util.Arrays;
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PostSimCardDataUsageNotificationRequest
 */
@JsonPropertyOrder({
  PostSimCardDataUsageNotificationRequest.JSON_PROPERTY_SIM_CARD_ID,
  PostSimCardDataUsageNotificationRequest.JSON_PROPERTY_THRESHOLD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PostSimCardDataUsageNotificationRequest {
  public static final String JSON_PROPERTY_SIM_CARD_ID = "sim_card_id";
  private UUID simCardId;

  public static final String JSON_PROPERTY_THRESHOLD = "threshold";
  private PostSimCardDataUsageNotificationRequestThreshold threshold;

  public PostSimCardDataUsageNotificationRequest() { 
  }

  public PostSimCardDataUsageNotificationRequest simCardId(UUID simCardId) {
    this.simCardId = simCardId;
    return this;
  }

   /**
   * The identification UUID of the related SIM card resource.
   * @return simCardId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", required = true, value = "The identification UUID of the related SIM card resource.")
  @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getSimCardId() {
    return simCardId;
  }


  @JsonProperty(JSON_PROPERTY_SIM_CARD_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSimCardId(UUID simCardId) {
    this.simCardId = simCardId;
  }


  public PostSimCardDataUsageNotificationRequest threshold(PostSimCardDataUsageNotificationRequestThreshold threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PostSimCardDataUsageNotificationRequestThreshold getThreshold() {
    return threshold;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setThreshold(PostSimCardDataUsageNotificationRequestThreshold threshold) {
    this.threshold = threshold;
  }


  /**
   * Return true if this PostSimCardDataUsageNotification_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostSimCardDataUsageNotificationRequest postSimCardDataUsageNotificationRequest = (PostSimCardDataUsageNotificationRequest) o;
    return Objects.equals(this.simCardId, postSimCardDataUsageNotificationRequest.simCardId) &&
        Objects.equals(this.threshold, postSimCardDataUsageNotificationRequest.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simCardId, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostSimCardDataUsageNotificationRequest {\n");
    sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

