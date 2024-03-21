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
 * 
 */
@ApiModel(description = "")
@JsonPropertyOrder({
  MobileOperatorNetworkPreferencesRequest.JSON_PROPERTY_MOBILE_OPERATOR_NETWORK_ID,
  MobileOperatorNetworkPreferencesRequest.JSON_PROPERTY_PRIORITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MobileOperatorNetworkPreferencesRequest {
  public static final String JSON_PROPERTY_MOBILE_OPERATOR_NETWORK_ID = "mobile_operator_network_id";
  private UUID mobileOperatorNetworkId;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public MobileOperatorNetworkPreferencesRequest() { 
  }

  public MobileOperatorNetworkPreferencesRequest mobileOperatorNetworkId(UUID mobileOperatorNetworkId) {
    this.mobileOperatorNetworkId = mobileOperatorNetworkId;
    return this;
  }

   /**
   * The mobile operator network resource identification UUID.
   * @return mobileOperatorNetworkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "The mobile operator network resource identification UUID.")
  @JsonProperty(JSON_PROPERTY_MOBILE_OPERATOR_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getMobileOperatorNetworkId() {
    return mobileOperatorNetworkId;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_OPERATOR_NETWORK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileOperatorNetworkId(UUID mobileOperatorNetworkId) {
    this.mobileOperatorNetworkId = mobileOperatorNetworkId;
  }


  public MobileOperatorNetworkPreferencesRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * It determines what is the priority of a specific operator network that should be assumed by a SIM card when connecting to a network. The highest priority is 0, the second highest is 1 and so on.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "It determines what is the priority of a specific operator network that should be assumed by a SIM card when connecting to a network. The highest priority is 0, the second highest is 1 and so on.")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * Return true if this MobileOperatorNetworkPreferencesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileOperatorNetworkPreferencesRequest mobileOperatorNetworkPreferencesRequest = (MobileOperatorNetworkPreferencesRequest) o;
    return Objects.equals(this.mobileOperatorNetworkId, mobileOperatorNetworkPreferencesRequest.mobileOperatorNetworkId) &&
        Objects.equals(this.priority, mobileOperatorNetworkPreferencesRequest.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileOperatorNetworkId, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileOperatorNetworkPreferencesRequest {\n");
    sb.append("    mobileOperatorNetworkId: ").append(toIndentedString(mobileOperatorNetworkId)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

