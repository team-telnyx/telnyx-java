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
 * The emergency services settings for a phone number.
 */
@ApiModel(description = "The emergency services settings for a phone number.")
@JsonPropertyOrder({
  EmergencySettings.JSON_PROPERTY_EMERGENCY_ENABLED,
  EmergencySettings.JSON_PROPERTY_EMERGENCY_ADDRESS_ID,
  EmergencySettings.JSON_PROPERTY_EMERGENCY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class EmergencySettings {
  public static final String JSON_PROPERTY_EMERGENCY_ENABLED = "emergency_enabled";
  private Boolean emergencyEnabled = false;

  public static final String JSON_PROPERTY_EMERGENCY_ADDRESS_ID = "emergency_address_id";
  private String emergencyAddressId;

  /**
   * Represents the state of the number regarding emergency activation.
   */
  public enum EmergencyStatusEnum {
    DISABLED(String.valueOf("disabled")),
    
    ACTIVE(String.valueOf("active")),
    
    PROVISIONING(String.valueOf("provisioning")),
    
    DEPROVISIONING(String.valueOf("deprovisioning")),
    
    PROVISIONING_FAILED(String.valueOf("provisioning-failed"));

    private String value;

    EmergencyStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EmergencyStatusEnum fromValue(String value) {
      for (EmergencyStatusEnum b : EmergencyStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_EMERGENCY_STATUS = "emergency_status";
  private EmergencyStatusEnum emergencyStatus = EmergencyStatusEnum.DISABLED;

  public EmergencySettings() { 
  }

  public EmergencySettings emergencyEnabled(Boolean emergencyEnabled) {
    this.emergencyEnabled = emergencyEnabled;
    return this;
  }

   /**
   * Allows you to enable or disable emergency services on the phone number. In order to enable emergency services, you must also set an emergency_address_id.
   * @return emergencyEnabled
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Allows you to enable or disable emergency services on the phone number. In order to enable emergency services, you must also set an emergency_address_id.")
  @JsonProperty(JSON_PROPERTY_EMERGENCY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEmergencyEnabled() {
    return emergencyEnabled;
  }


  @JsonProperty(JSON_PROPERTY_EMERGENCY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmergencyEnabled(Boolean emergencyEnabled) {
    this.emergencyEnabled = emergencyEnabled;
  }


  public EmergencySettings emergencyAddressId(String emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
    return this;
  }

   /**
   * Identifies the address to be used with emergency services.
   * @return emergencyAddressId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Identifies the address to be used with emergency services.")
  @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmergencyAddressId() {
    return emergencyAddressId;
  }


  @JsonProperty(JSON_PROPERTY_EMERGENCY_ADDRESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmergencyAddressId(String emergencyAddressId) {
    this.emergencyAddressId = emergencyAddressId;
  }


  public EmergencySettings emergencyStatus(EmergencyStatusEnum emergencyStatus) {
    this.emergencyStatus = emergencyStatus;
    return this;
  }

   /**
   * Represents the state of the number regarding emergency activation.
   * @return emergencyStatus
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Represents the state of the number regarding emergency activation.")
  @JsonProperty(JSON_PROPERTY_EMERGENCY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmergencyStatusEnum getEmergencyStatus() {
    return emergencyStatus;
  }


  @JsonProperty(JSON_PROPERTY_EMERGENCY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmergencyStatus(EmergencyStatusEnum emergencyStatus) {
    this.emergencyStatus = emergencyStatus;
  }


  /**
   * Return true if this EmergencySettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmergencySettings emergencySettings = (EmergencySettings) o;
    return Objects.equals(this.emergencyEnabled, emergencySettings.emergencyEnabled) &&
        Objects.equals(this.emergencyAddressId, emergencySettings.emergencyAddressId) &&
        Objects.equals(this.emergencyStatus, emergencySettings.emergencyStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emergencyEnabled, emergencyAddressId, emergencyStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmergencySettings {\n");
    sb.append("    emergencyEnabled: ").append(toIndentedString(emergencyEnabled)).append("\n");
    sb.append("    emergencyAddressId: ").append(toIndentedString(emergencyAddressId)).append("\n");
    sb.append("    emergencyStatus: ").append(toIndentedString(emergencyStatus)).append("\n");
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

