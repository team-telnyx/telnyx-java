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
 * PhoneNumberEnableEmergencyRequest
 */
@JsonPropertyOrder({
  PhoneNumberEnableEmergencyRequest.JSON_PROPERTY_EMERGENCY_ENABLED,
  PhoneNumberEnableEmergencyRequest.JSON_PROPERTY_EMERGENCY_ADDRESS_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PhoneNumberEnableEmergencyRequest {
  public static final String JSON_PROPERTY_EMERGENCY_ENABLED = "emergency_enabled";
  private Boolean emergencyEnabled;

  public static final String JSON_PROPERTY_EMERGENCY_ADDRESS_ID = "emergency_address_id";
  private String emergencyAddressId;

  public PhoneNumberEnableEmergencyRequest() { 
  }

  public PhoneNumberEnableEmergencyRequest emergencyEnabled(Boolean emergencyEnabled) {
    this.emergencyEnabled = emergencyEnabled;
    return this;
  }

   /**
   * Indicates whether to enable emergency services on this number.
   * @return emergencyEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates whether to enable emergency services on this number.")
  @JsonProperty(JSON_PROPERTY_EMERGENCY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEmergencyEnabled() {
    return emergencyEnabled;
  }


  @JsonProperty(JSON_PROPERTY_EMERGENCY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmergencyEnabled(Boolean emergencyEnabled) {
    this.emergencyEnabled = emergencyEnabled;
  }


  public PhoneNumberEnableEmergencyRequest emergencyAddressId(String emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
    return this;
  }

   /**
   * Identifies the address to be used with emergency services.
   * @return emergencyAddressId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifies the address to be used with emergency services.")
  @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmergencyAddressId() {
    return emergencyAddressId;
  }


  @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmergencyAddressId(String emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
  }


  /**
   * Return true if this PhoneNumberEnableEmergencyRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberEnableEmergencyRequest phoneNumberEnableEmergencyRequest = (PhoneNumberEnableEmergencyRequest) o;
    return Objects.equals(this.emergencyEnabled, phoneNumberEnableEmergencyRequest.emergencyEnabled) &&
        Objects.equals(this.emergencyAddressId, phoneNumberEnableEmergencyRequest.emergencyAddressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emergencyEnabled, emergencyAddressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberEnableEmergencyRequest {\n");
    sb.append("    emergencyEnabled: ").append(toIndentedString(emergencyEnabled)).append("\n");
    sb.append("    emergencyAddressId: ").append(toIndentedString(emergencyAddressId)).append("\n");
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

