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
 * UpdateVerifyProfileCallRequest
 */
@JsonPropertyOrder({
  UpdateVerifyProfileCallRequest.JSON_PROPERTY_SPEECH_TEMPLATE,
  UpdateVerifyProfileCallRequest.JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS,
  UpdateVerifyProfileCallRequest.JSON_PROPERTY_DEFAULT_CALL_TIMEOUT_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateVerifyProfileCallRequest {
  public static final String JSON_PROPERTY_SPEECH_TEMPLATE = "speech_template";
  private String speechTemplate;

  public static final String JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS = "default_verification_timeout_secs";
  private Integer defaultVerificationTimeoutSecs;

  public static final String JSON_PROPERTY_DEFAULT_CALL_TIMEOUT_SECS = "default_call_timeout_secs";
  private Integer defaultCallTimeoutSecs = 45;


  public UpdateVerifyProfileCallRequest speechTemplate(String speechTemplate) {
    this.speechTemplate = speechTemplate;
    return this;
  }

   /**
   * Optionally sets a speech text template when sending the verification code. Uses &#x60;{code}&#x60; to template in the actual verification code.
   * @return speechTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello, this is the Acme Inc verification code you requested: {code}.", value = "Optionally sets a speech text template when sending the verification code. Uses `{code}` to template in the actual verification code.")
  @JsonProperty(JSON_PROPERTY_SPEECH_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpeechTemplate() {
    return speechTemplate;
  }


  public void setSpeechTemplate(String speechTemplate) {
    this.speechTemplate = speechTemplate;
  }


  public UpdateVerifyProfileCallRequest defaultVerificationTimeoutSecs(Integer defaultVerificationTimeoutSecs) {
    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
    return this;
  }

   /**
   * For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.
   * @return defaultVerificationTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultVerificationTimeoutSecs() {
    return defaultVerificationTimeoutSecs;
  }


  public void setDefaultVerificationTimeoutSecs(Integer defaultVerificationTimeoutSecs) {
    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
  }


  public UpdateVerifyProfileCallRequest defaultCallTimeoutSecs(Integer defaultCallTimeoutSecs) {
    this.defaultCallTimeoutSecs = defaultCallTimeoutSecs;
    return this;
  }

   /**
   * Must be less than default_verification_timeout_secs
   * @return defaultCallTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "Must be less than default_verification_timeout_secs")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CALL_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultCallTimeoutSecs() {
    return defaultCallTimeoutSecs;
  }


  public void setDefaultCallTimeoutSecs(Integer defaultCallTimeoutSecs) {
    this.defaultCallTimeoutSecs = defaultCallTimeoutSecs;
  }


  /**
   * Return true if this UpdateVerifyProfileCallRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVerifyProfileCallRequest updateVerifyProfileCallRequest = (UpdateVerifyProfileCallRequest) o;
    return Objects.equals(this.speechTemplate, updateVerifyProfileCallRequest.speechTemplate) &&
        Objects.equals(this.defaultVerificationTimeoutSecs, updateVerifyProfileCallRequest.defaultVerificationTimeoutSecs) &&
        Objects.equals(this.defaultCallTimeoutSecs, updateVerifyProfileCallRequest.defaultCallTimeoutSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(speechTemplate, defaultVerificationTimeoutSecs, defaultCallTimeoutSecs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerifyProfileCallRequest {\n");
    sb.append("    speechTemplate: ").append(toIndentedString(speechTemplate)).append("\n");
    sb.append("    defaultVerificationTimeoutSecs: ").append(toIndentedString(defaultVerificationTimeoutSecs)).append("\n");
    sb.append("    defaultCallTimeoutSecs: ").append(toIndentedString(defaultCallTimeoutSecs)).append("\n");
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

