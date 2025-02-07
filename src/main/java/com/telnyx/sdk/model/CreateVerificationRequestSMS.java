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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The request body when creating a verification.
 */
@ApiModel(description = "The request body when creating a verification.")
@JsonPropertyOrder({
  CreateVerificationRequestSMS.JSON_PROPERTY_PHONE_NUMBER,
  CreateVerificationRequestSMS.JSON_PROPERTY_VERIFY_PROFILE_ID,
  CreateVerificationRequestSMS.JSON_PROPERTY_CUSTOM_CODE,
  CreateVerificationRequestSMS.JSON_PROPERTY_TIMEOUT_SECS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateVerificationRequestSMS {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_VERIFY_PROFILE_ID = "verify_profile_id";
  private UUID verifyProfileId;

  public static final String JSON_PROPERTY_CUSTOM_CODE = "custom_code";
  private JsonNullable<String> customCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TIMEOUT_SECS = "timeout_secs";
  private Integer timeoutSecs;

  public CreateVerificationRequestSMS() { 
  }

  public CreateVerificationRequestSMS phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * +E164 formatted phone number.
   * @return phoneNumber
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "+13035551234", required = true, value = "+E164 formatted phone number.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CreateVerificationRequestSMS verifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
    return this;
  }

   /**
   * The identifier of the associated Verify profile.
   * @return verifyProfileId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", required = true, value = "The identifier of the associated Verify profile.")
  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getVerifyProfileId() {
    return verifyProfileId;
  }


  @JsonProperty(JSON_PROPERTY_VERIFY_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerifyProfileId(UUID verifyProfileId) {
    this.verifyProfileId = verifyProfileId;
  }


  public CreateVerificationRequestSMS customCode(String customCode) {
    this.customCode = JsonNullable.<String>of(customCode);
    return this;
  }

   /**
   * Send a self-generated numeric code to the end-user
   * @return customCode
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "43612", value = "Send a self-generated numeric code to the end-user")
  @JsonIgnore

  public String getCustomCode() {
        return customCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCustomCode_JsonNullable() {
    return customCode;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_CODE)
  public void setCustomCode_JsonNullable(JsonNullable<String> customCode) {
    this.customCode = customCode;
  }

  public void setCustomCode(String customCode) {
    this.customCode = JsonNullable.<String>of(customCode);
  }


  public CreateVerificationRequestSMS timeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
    return this;
  }

   /**
   * The number of seconds the verification code is valid for.
   * @return timeoutSecs
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "300", value = "The number of seconds the verification code is valid for.")
  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeoutSecs() {
    return timeoutSecs;
  }


  @JsonProperty(JSON_PROPERTY_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeoutSecs(Integer timeoutSecs) {
    this.timeoutSecs = timeoutSecs;
  }


  /**
   * Return true if this CreateVerificationRequestSMS object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVerificationRequestSMS createVerificationRequestSMS = (CreateVerificationRequestSMS) o;
    return Objects.equals(this.phoneNumber, createVerificationRequestSMS.phoneNumber) &&
        Objects.equals(this.verifyProfileId, createVerificationRequestSMS.verifyProfileId) &&
        equalsNullable(this.customCode, createVerificationRequestSMS.customCode) &&
        Objects.equals(this.timeoutSecs, createVerificationRequestSMS.timeoutSecs);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, verifyProfileId, hashCodeNullable(customCode), timeoutSecs);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerificationRequestSMS {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    verifyProfileId: ").append(toIndentedString(verifyProfileId)).append("\n");
    sb.append("    customCode: ").append(toIndentedString(customCode)).append("\n");
    sb.append("    timeoutSecs: ").append(toIndentedString(timeoutSecs)).append("\n");
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

