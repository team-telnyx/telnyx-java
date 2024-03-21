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
import com.telnyx.sdk.model.MobileNetworkOperatorPreferencesResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * A JSON object representation of the operation. The information present here will relate directly to the source of the OTA request.
 */
@ApiModel(description = "A JSON object representation of the operation. The information present here will relate directly to the source of the OTA request.")
@JsonPropertyOrder({
  CompleteOTAUpdateSettings.JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CompleteOTAUpdateSettings {
  public static final String JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES = "mobile_network_operators_preferences";
  private List<MobileNetworkOperatorPreferencesResponse> mobileNetworkOperatorsPreferences = null;

  public CompleteOTAUpdateSettings() { 
  }

  public CompleteOTAUpdateSettings mobileNetworkOperatorsPreferences(List<MobileNetworkOperatorPreferencesResponse> mobileNetworkOperatorsPreferences) {
    this.mobileNetworkOperatorsPreferences = mobileNetworkOperatorsPreferences;
    return this;
  }

  public CompleteOTAUpdateSettings addMobileNetworkOperatorsPreferencesItem(MobileNetworkOperatorPreferencesResponse mobileNetworkOperatorsPreferencesItem) {
    if (this.mobileNetworkOperatorsPreferences == null) {
      this.mobileNetworkOperatorsPreferences = new ArrayList<>();
    }
    this.mobileNetworkOperatorsPreferences.add(mobileNetworkOperatorsPreferencesItem);
    return this;
  }

   /**
   * A list of mobile network operators and the priority that should be applied when the SIM is connecting to the network.
   * @return mobileNetworkOperatorsPreferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of mobile network operators and the priority that should be applied when the SIM is connecting to the network.")
  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MobileNetworkOperatorPreferencesResponse> getMobileNetworkOperatorsPreferences() {
    return mobileNetworkOperatorsPreferences;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_OPERATORS_PREFERENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileNetworkOperatorsPreferences(List<MobileNetworkOperatorPreferencesResponse> mobileNetworkOperatorsPreferences) {
    this.mobileNetworkOperatorsPreferences = mobileNetworkOperatorsPreferences;
  }


  /**
   * Return true if this CompleteOTAUpdate_settings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteOTAUpdateSettings completeOTAUpdateSettings = (CompleteOTAUpdateSettings) o;
    return Objects.equals(this.mobileNetworkOperatorsPreferences, completeOTAUpdateSettings.mobileNetworkOperatorsPreferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileNetworkOperatorsPreferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteOTAUpdateSettings {\n");
    sb.append("    mobileNetworkOperatorsPreferences: ").append(toIndentedString(mobileNetworkOperatorsPreferences)).append("\n");
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

