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
 * GetPortingOrder200ResponseMeta
 */
@JsonPropertyOrder({
  GetPortingOrder200ResponseMeta.JSON_PROPERTY_PHONE_NUMBERS_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GetPortingOrder200ResponseMeta {
  public static final String JSON_PROPERTY_PHONE_NUMBERS_URL = "phone_numbers_url";
  private String phoneNumbersUrl;

  public GetPortingOrder200ResponseMeta() { 
  }

  public GetPortingOrder200ResponseMeta phoneNumbersUrl(String phoneNumbersUrl) {
    this.phoneNumbersUrl = phoneNumbersUrl;
    return this;
  }

   /**
   * Link to list all phone numbers
   * @return phoneNumbersUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/v2/porting_phone_numbers?filter[porting_order_id]=eef10fb8-f3df-4c67-97c5-e18179723222", value = "Link to list all phone numbers")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumbersUrl() {
    return phoneNumbersUrl;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbersUrl(String phoneNumbersUrl) {
    this.phoneNumbersUrl = phoneNumbersUrl;
  }


  /**
   * Return true if this GetPortingOrder_200_response_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPortingOrder200ResponseMeta getPortingOrder200ResponseMeta = (GetPortingOrder200ResponseMeta) o;
    return Objects.equals(this.phoneNumbersUrl, getPortingOrder200ResponseMeta.phoneNumbersUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumbersUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPortingOrder200ResponseMeta {\n");
    sb.append("    phoneNumbersUrl: ").append(toIndentedString(phoneNumbersUrl)).append("\n");
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

