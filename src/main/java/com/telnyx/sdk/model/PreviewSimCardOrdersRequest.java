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
 * PreviewSimCardOrdersRequest
 */
@JsonPropertyOrder({
  PreviewSimCardOrdersRequest.JSON_PROPERTY_QUANTITY,
  PreviewSimCardOrdersRequest.JSON_PROPERTY_ADDRESS_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PreviewSimCardOrdersRequest {
  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Integer quantity;

  public static final String JSON_PROPERTY_ADDRESS_ID = "address_id";
  private String addressId;

  public PreviewSimCardOrdersRequest() { 
  }

  public PreviewSimCardOrdersRequest quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The amount of SIM cards that the user would like to purchase in the SIM card order.
   * minimum: 1
   * @return quantity
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "21", required = true, value = "The amount of SIM cards that the user would like to purchase in the SIM card order.")
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public PreviewSimCardOrdersRequest addressId(String addressId) {
    this.addressId = addressId;
    return this;
  }

   /**
   * Uniquely identifies the address for the order.
   * @return addressId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1293384261075731499", required = true, value = "Uniquely identifies the address for the order.")
  @JsonProperty(JSON_PROPERTY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddressId() {
    return addressId;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddressId(String addressId) {
    this.addressId = addressId;
  }


  /**
   * Return true if this PreviewSimCardOrders_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewSimCardOrdersRequest previewSimCardOrdersRequest = (PreviewSimCardOrdersRequest) o;
    return Objects.equals(this.quantity, previewSimCardOrdersRequest.quantity) &&
        Objects.equals(this.addressId, previewSimCardOrdersRequest.addressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, addressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewSimCardOrdersRequest {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
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

