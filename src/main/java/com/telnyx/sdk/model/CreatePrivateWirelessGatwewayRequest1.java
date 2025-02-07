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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreatePrivateWirelessGatwewayRequest1
 */
@JsonPropertyOrder({
  CreatePrivateWirelessGatwewayRequest1.JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatePrivateWirelessGatwewayRequest1 {
  public static final String JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID = "private_wireless_gateway_id";
  private UUID privateWirelessGatewayId;

  public CreatePrivateWirelessGatwewayRequest1() { 
  }

  public CreatePrivateWirelessGatwewayRequest1 privateWirelessGatewayId(UUID privateWirelessGatewayId) {
    this.privateWirelessGatewayId = privateWirelessGatewayId;
    return this;
  }

   /**
   * The identification of the related Private Wireless Gateway resource.
   * @return privateWirelessGatewayId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", required = true, value = "The identification of the related Private Wireless Gateway resource.")
  @JsonProperty(JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getPrivateWirelessGatewayId() {
    return privateWirelessGatewayId;
  }


  @JsonProperty(JSON_PROPERTY_PRIVATE_WIRELESS_GATEWAY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrivateWirelessGatewayId(UUID privateWirelessGatewayId) {
    this.privateWirelessGatewayId = privateWirelessGatewayId;
  }


  /**
   * Return true if this Create_Private_Wireless_Gatweway_Request_1 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePrivateWirelessGatwewayRequest1 createPrivateWirelessGatwewayRequest1 = (CreatePrivateWirelessGatwewayRequest1) o;
    return Objects.equals(this.privateWirelessGatewayId, createPrivateWirelessGatwewayRequest1.privateWirelessGatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateWirelessGatewayId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePrivateWirelessGatwewayRequest1 {\n");
    sb.append("    privateWirelessGatewayId: ").append(toIndentedString(privateWirelessGatewayId)).append("\n");
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

