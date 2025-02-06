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
import com.telnyx.sdk.model.GlobalIpAssignmentUsageMetricGlobalIp;
import com.telnyx.sdk.model.GlobalIpAssignmentUsageMetricGlobalIpAssignment;
import com.telnyx.sdk.model.GlobalIpAssignmentUsageMetricReceived;
import com.telnyx.sdk.model.GlobalIpAssignmentUsageMetricTransmitted;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GlobalIpAssignmentUsageMetric
 */
@JsonPropertyOrder({
  GlobalIpAssignmentUsageMetric.JSON_PROPERTY_TIMESTAMP,
  GlobalIpAssignmentUsageMetric.JSON_PROPERTY_GLOBAL_IP,
  GlobalIpAssignmentUsageMetric.JSON_PROPERTY_GLOBAL_IP_ASSIGNMENT,
  GlobalIpAssignmentUsageMetric.JSON_PROPERTY_TRANSMITTED,
  GlobalIpAssignmentUsageMetric.JSON_PROPERTY_RECEIVED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GlobalIpAssignmentUsageMetric {
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_GLOBAL_IP = "global_ip";
  private GlobalIpAssignmentUsageMetricGlobalIp globalIp;

  public static final String JSON_PROPERTY_GLOBAL_IP_ASSIGNMENT = "global_ip_assignment";
  private GlobalIpAssignmentUsageMetricGlobalIpAssignment globalIpAssignment;

  public static final String JSON_PROPERTY_TRANSMITTED = "transmitted";
  private GlobalIpAssignmentUsageMetricTransmitted transmitted;

  public static final String JSON_PROPERTY_RECEIVED = "received";
  private GlobalIpAssignmentUsageMetricReceived received;

  public GlobalIpAssignmentUsageMetric() { 
  }

  public GlobalIpAssignmentUsageMetric timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the metric.
   * @return timestamp
  **/
  @javax.annotation.Nullable
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


  public GlobalIpAssignmentUsageMetric globalIp(GlobalIpAssignmentUsageMetricGlobalIp globalIp) {
    this.globalIp = globalIp;
    return this;
  }

   /**
   * Get globalIp
   * @return globalIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GLOBAL_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpAssignmentUsageMetricGlobalIp getGlobalIp() {
    return globalIp;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_IP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalIp(GlobalIpAssignmentUsageMetricGlobalIp globalIp) {
    this.globalIp = globalIp;
  }


  public GlobalIpAssignmentUsageMetric globalIpAssignment(GlobalIpAssignmentUsageMetricGlobalIpAssignment globalIpAssignment) {
    this.globalIpAssignment = globalIpAssignment;
    return this;
  }

   /**
   * Get globalIpAssignment
   * @return globalIpAssignment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GLOBAL_IP_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GlobalIpAssignmentUsageMetricGlobalIpAssignment getGlobalIpAssignment() {
    return globalIpAssignment;
  }


  @JsonProperty(JSON_PROPERTY_GLOBAL_IP_ASSIGNMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGlobalIpAssignment(GlobalIpAssignmentUsageMetricGlobalIpAssignment globalIpAssignment) {
    this.globalIpAssignment = globalIpAssignment;
  }


  public GlobalIpAssignmentUsageMetric transmitted(GlobalIpAssignmentUsageMetricTransmitted transmitted) {
    this.transmitted = transmitted;
    return this;
  }

   /**
   * Get transmitted
   * @return transmitted
  **/
  @javax.annotation.Nullable
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


  public GlobalIpAssignmentUsageMetric received(GlobalIpAssignmentUsageMetricReceived received) {
    this.received = received;
    return this;
  }

   /**
   * Get received
   * @return received
  **/
  @javax.annotation.Nullable
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
   * Return true if this GlobalIpAssignmentUsageMetric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpAssignmentUsageMetric globalIpAssignmentUsageMetric = (GlobalIpAssignmentUsageMetric) o;
    return Objects.equals(this.timestamp, globalIpAssignmentUsageMetric.timestamp) &&
        Objects.equals(this.globalIp, globalIpAssignmentUsageMetric.globalIp) &&
        Objects.equals(this.globalIpAssignment, globalIpAssignmentUsageMetric.globalIpAssignment) &&
        Objects.equals(this.transmitted, globalIpAssignmentUsageMetric.transmitted) &&
        Objects.equals(this.received, globalIpAssignmentUsageMetric.received);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, globalIp, globalIpAssignment, transmitted, received);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpAssignmentUsageMetric {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    globalIp: ").append(toIndentedString(globalIp)).append("\n");
    sb.append("    globalIpAssignment: ").append(toIndentedString(globalIpAssignment)).append("\n");
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

