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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UpdateVerifiedCallsDisplayProfileRequest
 */
@JsonPropertyOrder({
  UpdateVerifiedCallsDisplayProfileRequest.JSON_PROPERTY_CALL_REASONS,
  UpdateVerifiedCallsDisplayProfileRequest.JSON_PROPERTY_PHONE_NUMBERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateVerifiedCallsDisplayProfileRequest {
  public static final String JSON_PROPERTY_CALL_REASONS = "call_reasons";
  private String callReasons = null;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private String phoneNumbers = null;

  public UpdateVerifiedCallsDisplayProfileRequest() { 
  }

  public UpdateVerifiedCallsDisplayProfileRequest callReasons(String callReasons) {
    this.callReasons = callReasons;
    return this;
  }

   /**
   * Get callReasons
   * @return callReasons
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallReasons() {
    return callReasons;
  }


  @JsonProperty(JSON_PROPERTY_CALL_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallReasons(String callReasons) {
    this.callReasons = callReasons;
  }


  public UpdateVerifiedCallsDisplayProfileRequest phoneNumbers(String phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(String phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  /**
   * Return true if this UpdateVerifiedCallsDisplayProfileRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVerifiedCallsDisplayProfileRequest updateVerifiedCallsDisplayProfileRequest = (UpdateVerifiedCallsDisplayProfileRequest) o;
    return Objects.equals(this.callReasons, updateVerifiedCallsDisplayProfileRequest.callReasons) &&
        Objects.equals(this.phoneNumbers, updateVerifiedCallsDisplayProfileRequest.phoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callReasons, phoneNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerifiedCallsDisplayProfileRequest {\n");
    sb.append("    callReasons: ").append(toIndentedString(callReasons)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
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

