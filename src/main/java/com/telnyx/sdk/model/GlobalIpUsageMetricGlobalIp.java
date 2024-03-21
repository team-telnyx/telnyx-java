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
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GlobalIpUsageMetricGlobalIp
 */
@JsonPropertyOrder({
  GlobalIpUsageMetricGlobalIp.JSON_PROPERTY_ID,
  GlobalIpUsageMetricGlobalIp.JSON_PROPERTY_IP_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class GlobalIpUsageMetricGlobalIp {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public GlobalIpUsageMetricGlobalIp() { 
  }

  @JsonCreator
  public GlobalIpUsageMetricGlobalIp(
    @JsonProperty(JSON_PROPERTY_IP_ADDRESS) String ipAddress
  ) {
    this();
    this.ipAddress = ipAddress;
  }

  public GlobalIpUsageMetricGlobalIp id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Global IP ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "a836125b-20b6-452e-9c03-2653f09c7ed7", value = "Global IP ID.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


   /**
   * The Global IP address.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "64.1.2.130", value = "The Global IP address.")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }




  /**
   * Return true if this GlobalIpUsageMetric_global_ip object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpUsageMetricGlobalIp globalIpUsageMetricGlobalIp = (GlobalIpUsageMetricGlobalIp) o;
    return Objects.equals(this.id, globalIpUsageMetricGlobalIp.id) &&
        Objects.equals(this.ipAddress, globalIpUsageMetricGlobalIp.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpUsageMetricGlobalIp {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

