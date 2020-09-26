/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PhoneNumberEnableEmergencyRequest
 */


public class PhoneNumberEnableEmergencyRequest {
  @SerializedName("emergency_enabled")
  private Boolean emergencyEnabled = null;

  @SerializedName("emergency_address_id")
  private String emergencyAddressId = null;

  public PhoneNumberEnableEmergencyRequest emergencyEnabled(Boolean emergencyEnabled) {
    this.emergencyEnabled = emergencyEnabled;
    return this;
  }

   /**
   * Indicates whether to enable emergency services on this number.
   * @return emergencyEnabled
  **/
  @Schema(required = true, description = "Indicates whether to enable emergency services on this number.")
  public Boolean isEmergencyEnabled() {
    return emergencyEnabled;
  }

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
  @Schema(required = true, description = "Identifies the address to be used with emergency services.")
  public String getEmergencyAddressId() {
    return emergencyAddressId;
  }

  public void setEmergencyAddressId(String emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
