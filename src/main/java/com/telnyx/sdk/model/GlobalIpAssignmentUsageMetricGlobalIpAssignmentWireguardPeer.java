/*
 * Telnyx API
 * Notifications and Notification Settings.
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
 * GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer
 */
@JsonPropertyOrder({
  GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer.JSON_PROPERTY_NAME,
  GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer.JSON_PROPERTY_IP_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ip_address";
  private String ipAddress;

  public GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer() { 
  }

  public GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A user specified name for the interface.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wireguard Peer 1", value = "A user specified name for the interface.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address of the interface.
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "172.1.0.1", value = "The IP address of the interface.")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  /**
   * Return true if this GlobalIpAssignmentUsageMetric_global_ip_assignment_wireguard_peer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer globalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer = (GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer) o;
    return Objects.equals(this.name, globalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer.name) &&
        Objects.equals(this.ipAddress, globalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer.ipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpAssignmentUsageMetricGlobalIpAssignmentWireguardPeer {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

