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
import com.telnyx.sdk.model.GlobalIpAssignmentUsageMetricReceived;
import com.telnyx.sdk.model.GlobalIpAssignmentUsageMetricTransmitted;
import com.telnyx.sdk.model.GlobalIpUsageMetricGlobalIp;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GlobalIpUsageMetric
 */
@JsonPropertyOrder({
  GlobalIpUsageMetric.JSON_PROPERTY_TIMESTAMP,
  GlobalIpUsageMetric.JSON_PROPERTY_GLOBAL_IP,
  GlobalIpUsageMetric.JSON_PROPERTY_TRANSMITTED,
  GlobalIpUsageMetric.JSON_PROPERTY_RECEIVED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GlobalIpUsageMetric {
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_GLOBAL_IP = "global_ip";
  private GlobalIpUsageMetricGlobalIp globalIp;

  public static final String JSON_PROPERTY_TRANSMITTED = "transmitted";
  private GlobalIpAssignmentUsageMetricTransmitted transmitted;

  public static final String JSON_PROPERTY_RECEIVED = "received";
  private GlobalIpAssignmentUsageMetricReceived received;

  public GlobalIpUsageMetric() { 
  }

  public GlobalIpUsageMetric timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the metric.
   * @return timestamp
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T00:00Z", value = "The timestamp of the metric.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public GlobalIpUsageMetric globalIp(GlobalIpUsageMetricGlobalIp globalIp) {
    this.globalIp = globalIp;
    return this;
  }

   /**
   * Get globalIp
   * @return globalIp
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GLOBAL_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpUsageMetricGlobalIp getGlobalIp() {
    return globalIp;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalIp(GlobalIpUsageMetricGlobalIp globalIp) {
    this.globalIp = globalIp;
  }


  public GlobalIpUsageMetric transmitted(GlobalIpAssignmentUsageMetricTransmitted transmitted) {
    this.transmitted = transmitted;
    return this;
  }

   /**
   * Get transmitted
   * @return transmitted
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpAssignmentUsageMetricTransmitted getTransmitted() {
    return transmitted;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMITTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransmitted(GlobalIpAssignmentUsageMetricTransmitted transmitted) {
    this.transmitted = transmitted;
  }


  public GlobalIpUsageMetric received(GlobalIpAssignmentUsageMetricReceived received) {
    this.received = received;
    return this;
  }

   /**
   * Get received
   * @return received
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpAssignmentUsageMetricReceived getReceived() {
    return received;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceived(GlobalIpAssignmentUsageMetricReceived received) {
    this.received = received;
  }


  /**
   * Return true if this GlobalIpUsageMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpUsageMetric globalIpUsageMetric = (GlobalIpUsageMetric) o;
    return Objects.equals(this.timestamp, globalIpUsageMetric.timestamp) &&
        Objects.equals(this.globalIp, globalIpUsageMetric.globalIp) &&
        Objects.equals(this.transmitted, globalIpUsageMetric.transmitted) &&
        Objects.equals(this.received, globalIpUsageMetric.received);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, globalIp, transmitted, received);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpUsageMetric {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    globalIp: ").append(toIndentedString(globalIp)).append("\n");
    sb.append("    transmitted: ").append(toIndentedString(transmitted)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
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

