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
import com.telnyx.sdk.model.CallReasons;
import com.telnyx.sdk.model.DisplayName;
import com.telnyx.sdk.model.LogoUrl;
import com.telnyx.sdk.model.PhoneNumbers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateVerifiedCallsDisplayProfileRequest
 */
@JsonPropertyOrder({
  CreateVerifiedCallsDisplayProfileRequest.JSON_PROPERTY_BUSINESS_IDENTITY_ID,
  CreateVerifiedCallsDisplayProfileRequest.JSON_PROPERTY_NAME,
  CreateVerifiedCallsDisplayProfileRequest.JSON_PROPERTY_DISPLAY_NAME,
  CreateVerifiedCallsDisplayProfileRequest.JSON_PROPERTY_LOGO_URL,
  CreateVerifiedCallsDisplayProfileRequest.JSON_PROPERTY_CALL_REASONS,
  CreateVerifiedCallsDisplayProfileRequest.JSON_PROPERTY_PHONE_NUMBERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateVerifiedCallsDisplayProfileRequest {
  public static final String JSON_PROPERTY_BUSINESS_IDENTITY_ID = "business_identity_id";
  private UUID businessIdentityId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private DisplayName displayName = null;

  public static final String JSON_PROPERTY_LOGO_URL = "logo_url";
  private LogoUrl logoUrl = null;

  public static final String JSON_PROPERTY_CALL_REASONS = "call_reasons";
  private CallReasons callReasons = null;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phone_numbers";
  private PhoneNumbers phoneNumbers = null;

  public CreateVerifiedCallsDisplayProfileRequest() { 
  }

  public CreateVerifiedCallsDisplayProfileRequest businessIdentityId(UUID businessIdentityId) {
    this.businessIdentityId = businessIdentityId;
    return this;
  }

   /**
   * The ID of the business identity that owns the record
   * @return businessIdentityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "c6feda4e-6501-4db9-a21f-665e5b4ce2ba", required = true, value = "The ID of the business identity that owns the record")
  @JsonProperty(JSON_PROPERTY_BUSINESS_IDENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getBusinessIdentityId() {
    return businessIdentityId;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_IDENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBusinessIdentityId(UUID businessIdentityId) {
    this.businessIdentityId = businessIdentityId;
  }


  public CreateVerifiedCallsDisplayProfileRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name associated with the authentication provider.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Okta", required = true, value = "The name associated with the authentication provider.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CreateVerifiedCallsDisplayProfileRequest displayName(DisplayName displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DisplayName getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(DisplayName displayName) {
    this.displayName = displayName;
  }


  public CreateVerifiedCallsDisplayProfileRequest logoUrl(LogoUrl logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogoUrl getLogoUrl() {
    return logoUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOGO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogoUrl(LogoUrl logoUrl) {
    this.logoUrl = logoUrl;
  }


  public CreateVerifiedCallsDisplayProfileRequest callReasons(CallReasons callReasons) {
    this.callReasons = callReasons;
    return this;
  }

   /**
   * Get callReasons
   * @return callReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallReasons getCallReasons() {
    return callReasons;
  }


  @JsonProperty(JSON_PROPERTY_CALL_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallReasons(CallReasons callReasons) {
    this.callReasons = callReasons;
  }


  public CreateVerifiedCallsDisplayProfileRequest phoneNumbers(PhoneNumbers phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhoneNumbers getPhoneNumbers() {
    return phoneNumbers;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumbers(PhoneNumbers phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }


  /**
   * Return true if this CreateVerifiedCallsDisplayProfileRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVerifiedCallsDisplayProfileRequest createVerifiedCallsDisplayProfileRequest = (CreateVerifiedCallsDisplayProfileRequest) o;
    return Objects.equals(this.businessIdentityId, createVerifiedCallsDisplayProfileRequest.businessIdentityId) &&
        Objects.equals(this.name, createVerifiedCallsDisplayProfileRequest.name) &&
        Objects.equals(this.displayName, createVerifiedCallsDisplayProfileRequest.displayName) &&
        Objects.equals(this.logoUrl, createVerifiedCallsDisplayProfileRequest.logoUrl) &&
        Objects.equals(this.callReasons, createVerifiedCallsDisplayProfileRequest.callReasons) &&
        Objects.equals(this.phoneNumbers, createVerifiedCallsDisplayProfileRequest.phoneNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessIdentityId, name, displayName, logoUrl, callReasons, phoneNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerifiedCallsDisplayProfileRequest {\n");
    sb.append("    businessIdentityId: ").append(toIndentedString(businessIdentityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
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
