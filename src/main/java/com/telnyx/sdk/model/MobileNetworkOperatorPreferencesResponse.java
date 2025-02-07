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
 * 
 */
@ApiModel(description = "")
@JsonPropertyOrder({
  MobileNetworkOperatorPreferencesResponse.JSON_PROPERTY_MOBILE_NETWORK_OPERATOR_ID,
  MobileNetworkOperatorPreferencesResponse.JSON_PROPERTY_MOBILE_NETWORK_OPERATOR_NAME,
  MobileNetworkOperatorPreferencesResponse.JSON_PROPERTY_PRIORITY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class MobileNetworkOperatorPreferencesResponse {
  public static final String JSON_PROPERTY_MOBILE_NETWORK_OPERATOR_ID = "mobile_network_operator_id";
  private UUID mobileNetworkOperatorId;

  public static final String JSON_PROPERTY_MOBILE_NETWORK_OPERATOR_NAME = "mobile_network_operator_name";
  private String mobileNetworkOperatorName;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private Integer priority;

  public MobileNetworkOperatorPreferencesResponse() { 
  }

  public MobileNetworkOperatorPreferencesResponse mobileNetworkOperatorId(UUID mobileNetworkOperatorId) {
    this.mobileNetworkOperatorId = mobileNetworkOperatorId;
    return this;
  }

   /**
   * The mobile network operator resource identification UUID.
   * @return mobileNetworkOperatorId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "6a09cdc3-8948-47f0-aa62-74ac943d6c58", value = "The mobile network operator resource identification UUID.")
  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getMobileNetworkOperatorId() {
    return mobileNetworkOperatorId;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileNetworkOperatorId(UUID mobileNetworkOperatorId) {
    this.mobileNetworkOperatorId = mobileNetworkOperatorId;
  }


  public MobileNetworkOperatorPreferencesResponse mobileNetworkOperatorName(String mobileNetworkOperatorName) {
    this.mobileNetworkOperatorName = mobileNetworkOperatorName;
    return this;
  }

   /**
   * The mobile network operator resource name.
   * @return mobileNetworkOperatorName
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "AT&T Mobility (USACG)", value = "The mobile network operator resource name.")
  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileNetworkOperatorName() {
    return mobileNetworkOperatorName;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATOR_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileNetworkOperatorName(String mobileNetworkOperatorName) {
    this.mobileNetworkOperatorName = mobileNetworkOperatorName;
  }


  public MobileNetworkOperatorPreferencesResponse priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * It determines what is the priority of a specific network operator that should be assumed by a SIM card when connecting to a network. The highest priority is 0, the second highest is 1 and so on.
   * @return priority
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "It determines what is the priority of a specific network operator that should be assumed by a SIM card when connecting to a network. The highest priority is 0, the second highest is 1 and so on.")
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
   * Return true if this MobileNetworkOperatorPreferencesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileNetworkOperatorPreferencesResponse mobileNetworkOperatorPreferencesResponse = (MobileNetworkOperatorPreferencesResponse) o;
    return Objects.equals(this.mobileNetworkOperatorId, mobileNetworkOperatorPreferencesResponse.mobileNetworkOperatorId) &&
        Objects.equals(this.mobileNetworkOperatorName, mobileNetworkOperatorPreferencesResponse.mobileNetworkOperatorName) &&
        Objects.equals(this.priority, mobileNetworkOperatorPreferencesResponse.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNetworkOperatorId, mobileNetworkOperatorName, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileNetworkOperatorPreferencesResponse {\n");
    sb.append("    mobileNetworkOperatorId: ").append(toIndentedString(mobileNetworkOperatorId)).append("\n");
    sb.append("    mobileNetworkOperatorName: ").append(toIndentedString(mobileNetworkOperatorName)).append("\n");
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

