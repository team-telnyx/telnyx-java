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
 * VerifyPhoneNumberCoverageRequest
 */
@JsonPropertyOrder({
  VerifyPhoneNumberCoverageRequest.JSON_PROPERTY_PHONE_NUMBERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class VerifyPhoneNumberCoverageRequest {
  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private List<String> phoneNumbers = new ArrayList<>();

  public VerifyPhoneNumberCoverageRequest() { 
  }

  public VerifyPhoneNumberCoverageRequest phoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public VerifyPhoneNumberCoverageRequest addphoneNumbersItem(String phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * The phone numbers list to be verified.
   * @return phoneNumbers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The phone numbers list to be verified.")
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


  /**
   * Return true if this VerifyPhoneNumberCoverage_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyPhoneNumberCoverageRequest verifyPhoneNumberCoverageRequest = (VerifyPhoneNumberCoverageRequest) o;
    return Objects.equals(this.phoneNumbers, verifyPhoneNumberCoverageRequest.phoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyPhoneNumberCoverageRequest {\n");
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

