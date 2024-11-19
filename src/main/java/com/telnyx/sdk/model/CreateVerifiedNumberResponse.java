/*
 * Telnyx API
 * Notifications and Notification Settings.
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
 * CreateVerifiedNumberResponse
 */
@JsonPropertyOrder({
  CreateVerifiedNumberResponse.JSON_PROPERTY_PHONE_NUMBER,
  CreateVerifiedNumberResponse.JSON_PROPERTY_VERIFICATION_METHOD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class CreateVerifiedNumberResponse {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_VERIFICATION_METHOD = "verification_method";
  private String verificationMethod;

  public CreateVerifiedNumberResponse() { 
  }

  public CreateVerifiedNumberResponse phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+15551234567", value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CreateVerifiedNumberResponse verificationMethod(String verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

   /**
   * Get verificationMethod
   * @return verificationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sms", value = "")
  @JsonProperty(JSON_PROPERTY_VERIFICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVerificationMethod() {
    return verificationMethod;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVerificationMethod(String verificationMethod) {
    this.verificationMethod = verificationMethod;
  }


  /**
   * Return true if this CreateVerifiedNumberResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVerifiedNumberResponse createVerifiedNumberResponse = (CreateVerifiedNumberResponse) o;
    return Objects.equals(this.phoneNumber, createVerifiedNumberResponse.phoneNumber) &&
        Objects.equals(this.verificationMethod, createVerifiedNumberResponse.verificationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, verificationMethod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerifiedNumberResponse {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
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

