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
 * UpdateVerifyProfileFlashcallRequest
 */
@JsonPropertyOrder({
  UpdateVerifyProfileFlashcallRequest.JSON_PROPERTY_WHITELISTED_DESTINATIONS,
  UpdateVerifyProfileFlashcallRequest.JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UpdateVerifyProfileFlashcallRequest {
  public static final String JSON_PROPERTY_WHITELISTED_DESTINATIONS = "whitelisted_destinations";
  private List<String> whitelistedDestinations = null;

  public static final String JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS = "default_verification_timeout_secs";
  private Integer defaultVerificationTimeoutSecs = 300;

  public UpdateVerifyProfileFlashcallRequest() { 
  }

  public UpdateVerifyProfileFlashcallRequest whitelistedDestinations(List<String> whitelistedDestinations) {
    this.whitelistedDestinations = whitelistedDestinations;
    return this;
  }

  public UpdateVerifyProfileFlashcallRequest addwhitelistedDestinationsItem(String whitelistedDestinationsItem) {
    if (this.whitelistedDestinations == null) {
      this.whitelistedDestinations = new ArrayList<>();
    }
    this.whitelistedDestinations.add(whitelistedDestinationsItem);
    return this;
  }

   /**
   * Enabled country destinations to send verification codes. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to &#x60;[\&quot;*\&quot;]&#x60;, all destinations will be allowed.
   * @return whitelistedDestinations
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"US\",\"CA\"]", value = "Enabled country destinations to send verification codes. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to `[\"*\"]`, all destinations will be allowed.")
  @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWhitelistedDestinations() {
    return whitelistedDestinations;
  }


  @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhitelistedDestinations(List<String> whitelistedDestinations) {
    this.whitelistedDestinations = whitelistedDestinations;
  }


  public UpdateVerifyProfileFlashcallRequest defaultVerificationTimeoutSecs(Integer defaultVerificationTimeoutSecs) {
    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
    return this;
  }

   /**
   * For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.
   * @return defaultVerificationTimeoutSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "300", value = "For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultVerificationTimeoutSecs() {
    return defaultVerificationTimeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultVerificationTimeoutSecs(Integer defaultVerificationTimeoutSecs) {
    this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
  }


  /**
   * Return true if this UpdateVerifyProfileFlashcallRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVerifyProfileFlashcallRequest updateVerifyProfileFlashcallRequest = (UpdateVerifyProfileFlashcallRequest) o;
    return Objects.equals(this.whitelistedDestinations, updateVerifyProfileFlashcallRequest.whitelistedDestinations) &&
        Objects.equals(this.defaultVerificationTimeoutSecs, updateVerifyProfileFlashcallRequest.defaultVerificationTimeoutSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(whitelistedDestinations, defaultVerificationTimeoutSecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerifyProfileFlashcallRequest {\n");
    sb.append("    whitelistedDestinations: ").append(toIndentedString(whitelistedDestinations)).append("\n");
    sb.append("    defaultVerificationTimeoutSecs: ").append(toIndentedString(defaultVerificationTimeoutSecs)).append("\n");
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

