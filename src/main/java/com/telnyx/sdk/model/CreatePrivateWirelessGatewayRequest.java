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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreatePrivateWirelessGatewayRequest
 */
@JsonPropertyOrder({
  CreatePrivateWirelessGatewayRequest.JSON_PROPERTY_NETWORK_ID,
  CreatePrivateWirelessGatewayRequest.JSON_PROPERTY_NAME,
  CreatePrivateWirelessGatewayRequest.JSON_PROPERTY_REGION_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreatePrivateWirelessGatewayRequest {
  public static final String JSON_PROPERTY_NETWORK_ID = "network_id";
  private UUID networkId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGION_CODE = "region_code";
  private String regionCode;

  public CreatePrivateWirelessGatewayRequest() { 
  }

  public CreatePrivateWirelessGatewayRequest networkId(UUID networkId) {
    this.networkId = networkId;
    return this;
  }

   /**
   * The identification of the related network resource.
   * @return networkId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", required = true, value = "The identification of the related network resource.")
  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getNetworkId() {
    return networkId;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetworkId(UUID networkId) {
    this.networkId = networkId;
  }


  public CreatePrivateWirelessGatewayRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The private wireless gateway name.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "My private wireless gateway", required = true, value = "The private wireless gateway name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreatePrivateWirelessGatewayRequest regionCode(String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

   /**
   * The code of the region where the private wireless gateway will be assigned. A list of available regions can be found at the regions endpoint
   * @return regionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dc2", value = "The code of the region where the private wireless gateway will be assigned. A list of available regions can be found at the regions endpoint")
  @JsonProperty(JSON_PROPERTY_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegionCode() {
    return regionCode;
  }


  @JsonProperty(JSON_PROPERTY_REGION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  /**
   * Return true if this CreatePrivateWirelessGateway_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePrivateWirelessGatewayRequest createPrivateWirelessGatewayRequest = (CreatePrivateWirelessGatewayRequest) o;
    return Objects.equals(this.networkId, createPrivateWirelessGatewayRequest.networkId) &&
        Objects.equals(this.name, createPrivateWirelessGatewayRequest.name) &&
        Objects.equals(this.regionCode, createPrivateWirelessGatewayRequest.regionCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, name, regionCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrivateWirelessGatewayRequest {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
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

