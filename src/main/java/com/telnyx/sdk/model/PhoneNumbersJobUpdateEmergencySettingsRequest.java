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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumbersJobUpdateEmergencySettingsRequest
 */
@JsonPropertyOrder({
  PhoneNumbersJobUpdateEmergencySettingsRequest.JSON_PROPERTY_PHONE_NUMBERS,
  PhoneNumbersJobUpdateEmergencySettingsRequest.JSON_PROPERTY_EMERGENCY_ENABLED,
  PhoneNumbersJobUpdateEmergencySettingsRequest.JSON_PROPERTY_EMERGENCY_ADDRESS_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PhoneNumbersJobUpdateEmergencySettingsRequest {
  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private List<String> phoneNumbers = new ArrayList<>();

  public static final String JSON_PROPERTY_EMERGENCY_ENABLED = "emergency_enabled";
  private Boolean emergencyEnabled;

  public static final String JSON_PROPERTY_EMERGENCY_ADDRESS_ID = "emergency_address_id";
  private String emergencyAddressId;

  public PhoneNumbersJobUpdateEmergencySettingsRequest() { 
  }

  public PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PhoneNumbersJobUpdateEmergencySettingsRequest addphoneNumbersItem(String phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  public PhoneNumbersJobUpdateEmergencySettingsRequest emergencyEnabled(Boolean emergencyEnabled) {
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


  public PhoneNumbersJobUpdateEmergencySettingsRequest emergencyAddressId(String emergencyAddressId) {
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
   * Return true if this PhoneNumbersJobUpdateEmergencySettingsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumbersJobUpdateEmergencySettingsRequest phoneNumbersJobUpdateEmergencySettingsRequest = (PhoneNumbersJobUpdateEmergencySettingsRequest) o;
    return Objects.equals(this.phoneNumbers, phoneNumbersJobUpdateEmergencySettingsRequest.phoneNumbers) &&
        Objects.equals(this.emergencyEnabled, phoneNumbersJobUpdateEmergencySettingsRequest.emergencyEnabled) &&
        Objects.equals(this.emergencyAddressId, phoneNumbersJobUpdateEmergencySettingsRequest.emergencyAddressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumbers, emergencyEnabled, emergencyAddressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumbersJobUpdateEmergencySettingsRequest {\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
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

