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
import com.telnyx.sdk.model.CallForwarding;
import com.telnyx.sdk.model.CallRecording;
import com.telnyx.sdk.model.CnamListing;
import com.telnyx.sdk.model.MediaFeatures;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UpdatePhoneNumberVoiceSettingsRequest
 */
@JsonPropertyOrder({
  UpdatePhoneNumberVoiceSettingsRequest.JSON_PROPERTY_TECH_PREFIX_ENABLED,
  UpdatePhoneNumberVoiceSettingsRequest.JSON_PROPERTY_TRANSLATED_NUMBER,
  UpdatePhoneNumberVoiceSettingsRequest.JSON_PROPERTY_CALL_FORWARDING,
  UpdatePhoneNumberVoiceSettingsRequest.JSON_PROPERTY_CNAM_LISTING,
  UpdatePhoneNumberVoiceSettingsRequest.JSON_PROPERTY_USAGE_PAYMENT_METHOD,
  UpdatePhoneNumberVoiceSettingsRequest.JSON_PROPERTY_MEDIA_FEATURES,
  UpdatePhoneNumberVoiceSettingsRequest.JSON_PROPERTY_CALL_RECORDING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdatePhoneNumberVoiceSettingsRequest {
  public static final String JSON_PROPERTY_TECH_PREFIX_ENABLED = "tech_prefix_enabled";
  private Boolean techPrefixEnabled = false;

  public static final String JSON_PROPERTY_TRANSLATED_NUMBER = "translated_number";
  private String translatedNumber;

  public static final String JSON_PROPERTY_CALL_FORWARDING = "call_forwarding";
  private CallForwarding callForwarding;

  public static final String JSON_PROPERTY_CNAM_LISTING = "cnam_listing";
  private CnamListing cnamListing;

  /**
   * Controls whether a number is billed per minute or uses your concurrent channels.
   */
  public enum UsagePaymentMethodEnum {
    PAY_PER_MINUTE("pay-per-minute"),
    
    CHANNEL("channel");

    private String value;

    UsagePaymentMethodEnum(String value) {
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
    public static UsagePaymentMethodEnum fromValue(String value) {
      for (UsagePaymentMethodEnum b : UsagePaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_USAGE_PAYMENT_METHOD = "usage_payment_method";
  private UsagePaymentMethodEnum usagePaymentMethod = UsagePaymentMethodEnum.PAY_PER_MINUTE;

  public static final String JSON_PROPERTY_MEDIA_FEATURES = "media_features";
  private MediaFeatures mediaFeatures;

  public static final String JSON_PROPERTY_CALL_RECORDING = "call_recording";
  private CallRecording callRecording;


  public UpdatePhoneNumberVoiceSettingsRequest techPrefixEnabled(Boolean techPrefixEnabled) {
    this.techPrefixEnabled = techPrefixEnabled;
    return this;
  }

   /**
   * Controls whether a tech prefix is enabled for this phone number.
   * @return techPrefixEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls whether a tech prefix is enabled for this phone number.")
  @JsonProperty(JSON_PROPERTY_TECH_PREFIX_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTechPrefixEnabled() {
    return techPrefixEnabled;
  }


  public void setTechPrefixEnabled(Boolean techPrefixEnabled) {
    this.techPrefixEnabled = techPrefixEnabled;
  }


  public UpdatePhoneNumberVoiceSettingsRequest translatedNumber(String translatedNumber) {
    this.translatedNumber = translatedNumber;
    return this;
  }

   /**
   * This field allows you to rewrite the destination number of an inbound call before the call is routed to you. The value of this field may be any alphanumeric value, and the value will replace the number originally dialed.
   * @return translatedNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field allows you to rewrite the destination number of an inbound call before the call is routed to you. The value of this field may be any alphanumeric value, and the value will replace the number originally dialed.")
  @JsonProperty(JSON_PROPERTY_TRANSLATED_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTranslatedNumber() {
    return translatedNumber;
  }


  public void setTranslatedNumber(String translatedNumber) {
    this.translatedNumber = translatedNumber;
  }


  public UpdatePhoneNumberVoiceSettingsRequest callForwarding(CallForwarding callForwarding) {
    this.callForwarding = callForwarding;
    return this;
  }

   /**
   * Get callForwarding
   * @return callForwarding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_FORWARDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallForwarding getCallForwarding() {
    return callForwarding;
  }


  public void setCallForwarding(CallForwarding callForwarding) {
    this.callForwarding = callForwarding;
  }


  public UpdatePhoneNumberVoiceSettingsRequest cnamListing(CnamListing cnamListing) {
    this.cnamListing = cnamListing;
    return this;
  }

   /**
   * Get cnamListing
   * @return cnamListing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CNAM_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CnamListing getCnamListing() {
    return cnamListing;
  }


  public void setCnamListing(CnamListing cnamListing) {
    this.cnamListing = cnamListing;
  }


  public UpdatePhoneNumberVoiceSettingsRequest usagePaymentMethod(UsagePaymentMethodEnum usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
    return this;
  }

   /**
   * Controls whether a number is billed per minute or uses your concurrent channels.
   * @return usagePaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls whether a number is billed per minute or uses your concurrent channels.")
  @JsonProperty(JSON_PROPERTY_USAGE_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsagePaymentMethodEnum getUsagePaymentMethod() {
    return usagePaymentMethod;
  }


  public void setUsagePaymentMethod(UsagePaymentMethodEnum usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
  }


  public UpdatePhoneNumberVoiceSettingsRequest mediaFeatures(MediaFeatures mediaFeatures) {
    this.mediaFeatures = mediaFeatures;
    return this;
  }

   /**
   * Get mediaFeatures
   * @return mediaFeatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEDIA_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MediaFeatures getMediaFeatures() {
    return mediaFeatures;
  }


  public void setMediaFeatures(MediaFeatures mediaFeatures) {
    this.mediaFeatures = mediaFeatures;
  }


  public UpdatePhoneNumberVoiceSettingsRequest callRecording(CallRecording callRecording) {
    this.callRecording = callRecording;
    return this;
  }

   /**
   * Get callRecording
   * @return callRecording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL_RECORDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CallRecording getCallRecording() {
    return callRecording;
  }


  public void setCallRecording(CallRecording callRecording) {
    this.callRecording = callRecording;
  }


  /**
   * Return true if this UpdatePhoneNumberVoiceSettingsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePhoneNumberVoiceSettingsRequest updatePhoneNumberVoiceSettingsRequest = (UpdatePhoneNumberVoiceSettingsRequest) o;
    return Objects.equals(this.techPrefixEnabled, updatePhoneNumberVoiceSettingsRequest.techPrefixEnabled) &&
        Objects.equals(this.translatedNumber, updatePhoneNumberVoiceSettingsRequest.translatedNumber) &&
        Objects.equals(this.callForwarding, updatePhoneNumberVoiceSettingsRequest.callForwarding) &&
        Objects.equals(this.cnamListing, updatePhoneNumberVoiceSettingsRequest.cnamListing) &&
        Objects.equals(this.usagePaymentMethod, updatePhoneNumberVoiceSettingsRequest.usagePaymentMethod) &&
        Objects.equals(this.mediaFeatures, updatePhoneNumberVoiceSettingsRequest.mediaFeatures) &&
        Objects.equals(this.callRecording, updatePhoneNumberVoiceSettingsRequest.callRecording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(techPrefixEnabled, translatedNumber, callForwarding, cnamListing, usagePaymentMethod, mediaFeatures, callRecording);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePhoneNumberVoiceSettingsRequest {\n");
    sb.append("    techPrefixEnabled: ").append(toIndentedString(techPrefixEnabled)).append("\n");
    sb.append("    translatedNumber: ").append(toIndentedString(translatedNumber)).append("\n");
    sb.append("    callForwarding: ").append(toIndentedString(callForwarding)).append("\n");
    sb.append("    cnamListing: ").append(toIndentedString(cnamListing)).append("\n");
    sb.append("    usagePaymentMethod: ").append(toIndentedString(usagePaymentMethod)).append("\n");
    sb.append("    mediaFeatures: ").append(toIndentedString(mediaFeatures)).append("\n");
    sb.append("    callRecording: ").append(toIndentedString(callRecording)).append("\n");
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
