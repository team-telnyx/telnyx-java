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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Campaign usecase. Must be of defined valid types. For more details, send a GET request to https://api.telnyx.com/10dlc/enum/usecase
 */
public enum Usecase {
  
  _2FA("2FA"),
  
  ACCOUNT_NOTIFICATION("ACCOUNT_NOTIFICATION"),
  
  AGENTS_FRANCHISES("AGENTS_FRANCHISES"),
  
  CARRIER_EXEMPT("CARRIER_EXEMPT"),
  
  CHARITY("CHARITY"),
  
  CONVERSATIONAL("CONVERSATIONAL"),
  
  CUSTOMER_CARE("CUSTOMER_CARE"),
  
  DELIVERY_NOTIFICATION("DELIVERY_NOTIFICATION"),
  
  EMERGENCY("EMERGENCY"),
  
  FRAUD_ALERT("FRAUD_ALERT"),
  
  HIGHER_EDUCATION("HIGHER_EDUCATION"),
  
  LOW_VOLUME("LOW_VOLUME"),
  
  MARKETING("MARKETING"),
  
  MANUFACTURING("MANUFACTURING"),
  
  MIXED("MIXED"),
  
  POLITICAL("POLITICAL"),
  
  POLLING_VOTING("POLLING_VOTING"),
  
  PUBLIC_SERVICE_ANNOUNCEMENT("PUBLIC_SERVICE_ANNOUNCEMENT"),
  
  SECURITY_ALERT("SECURITY_ALERT"),
  
  SOCIAL("SOCIAL"),
  
  SWEEPSTAKE("SWEEPSTAKE"),
  
  SOLE_PROPRIETOR("SOLE_PROPRIETOR"),
  
  TRIAL("TRIAL");

  private String value;

  Usecase(String value) {
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
  public static Usecase fromValue(String value) {
    for (Usecase b : Usecase.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

