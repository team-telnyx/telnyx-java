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
 * High level health metrics about the number and it&#39;s messaging sending patterns. 
 */
@ApiModel(description = "High level health metrics about the number and it's messaging sending patterns. ")
@JsonPropertyOrder({
  NumberHealthMetrics.JSON_PROPERTY_MESSAGE_COUNT,
  NumberHealthMetrics.JSON_PROPERTY_INBOUND_OUTBOUND_RATIO,
  NumberHealthMetrics.JSON_PROPERTY_SUCCESS_RATIO,
  NumberHealthMetrics.JSON_PROPERTY_SPAM_RATIO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class NumberHealthMetrics {
  public static final String JSON_PROPERTY_MESSAGE_COUNT = "message_count";
  private Integer messageCount;

  public static final String JSON_PROPERTY_INBOUND_OUTBOUND_RATIO = "inbound_outbound_ratio";
  private Float inboundOutboundRatio;

  public static final String JSON_PROPERTY_SUCCESS_RATIO = "success_ratio";
  private Float successRatio;

  public static final String JSON_PROPERTY_SPAM_RATIO = "spam_ratio";
  private Float spamRatio;

  public NumberHealthMetrics() { 
  }

  public NumberHealthMetrics messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }

   /**
   * The number of messages analyzed for the health metrics.
   * @return messageCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of messages analyzed for the health metrics.")
  @JsonProperty(JSON_PROPERTY_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMessageCount() {
    return messageCount;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }


  public NumberHealthMetrics inboundOutboundRatio(Float inboundOutboundRatio) {
    this.inboundOutboundRatio = inboundOutboundRatio;
    return this;
  }

   /**
   * The ratio of messages received to the number of messages sent.
   * @return inboundOutboundRatio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ratio of messages received to the number of messages sent.")
  @JsonProperty(JSON_PROPERTY_INBOUND_OUTBOUND_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getInboundOutboundRatio() {
    return inboundOutboundRatio;
  }


  @JsonProperty(JSON_PROPERTY_INBOUND_OUTBOUND_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInboundOutboundRatio(Float inboundOutboundRatio) {
    this.inboundOutboundRatio = inboundOutboundRatio;
  }


  public NumberHealthMetrics successRatio(Float successRatio) {
    this.successRatio = successRatio;
    return this;
  }

   /**
   * The ratio of messages sucessfully delivered to the number of messages attempted.
   * @return successRatio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ratio of messages sucessfully delivered to the number of messages attempted.")
  @JsonProperty(JSON_PROPERTY_SUCCESS_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSuccessRatio() {
    return successRatio;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccessRatio(Float successRatio) {
    this.successRatio = successRatio;
  }


  public NumberHealthMetrics spamRatio(Float spamRatio) {
    this.spamRatio = spamRatio;
    return this;
  }

   /**
   * The ratio of messages blocked for spam to the number of messages attempted.
   * @return spamRatio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ratio of messages blocked for spam to the number of messages attempted.")
  @JsonProperty(JSON_PROPERTY_SPAM_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getSpamRatio() {
    return spamRatio;
  }


  @JsonProperty(JSON_PROPERTY_SPAM_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSpamRatio(Float spamRatio) {
    this.spamRatio = spamRatio;
  }


  /**
   * Return true if this NumberHealthMetrics object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberHealthMetrics numberHealthMetrics = (NumberHealthMetrics) o;
    return Objects.equals(this.messageCount, numberHealthMetrics.messageCount) &&
        Objects.equals(this.inboundOutboundRatio, numberHealthMetrics.inboundOutboundRatio) &&
        Objects.equals(this.successRatio, numberHealthMetrics.successRatio) &&
        Objects.equals(this.spamRatio, numberHealthMetrics.spamRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageCount, inboundOutboundRatio, successRatio, spamRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberHealthMetrics {\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    inboundOutboundRatio: ").append(toIndentedString(inboundOutboundRatio)).append("\n");
    sb.append("    successRatio: ").append(toIndentedString(successRatio)).append("\n");
    sb.append("    spamRatio: ").append(toIndentedString(spamRatio)).append("\n");
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

