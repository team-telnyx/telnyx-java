/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telnyx.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.telnyx.sdk.models.CallForwarding;
import com.telnyx.sdk.models.CallRecording;
import com.telnyx.sdk.models.CnamListing;
import com.telnyx.sdk.models.EmergencySettings;
import com.telnyx.sdk.models.MediaFeatures;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PhoneNumberWithVoiceSettings
 */


public class PhoneNumberWithVoiceSettings {
  @SerializedName("id")
  private String id = null;

  @SerializedName("record_type")
  private String recordType = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  @SerializedName("connection_id")
  private String connectionId = null;

  @SerializedName("tech_prefix_enabled")
  private Boolean techPrefixEnabled = false;

  @SerializedName("translated_number")
  private String translatedNumber = "";

  @SerializedName("call_forwarding")
  private CallForwarding callForwarding = null;

  @SerializedName("cnam_listing")
  private CnamListing cnamListing = null;

  @SerializedName("emergency")
  private EmergencySettings emergency = null;

  /**
   * Controls whether a number is billed per minute or uses your concurrent channels.
   */
  @JsonAdapter(UsagePaymentMethodEnum.Adapter.class)
  public enum UsagePaymentMethodEnum {
    PAY_PER_MINUTE("pay-per-minute"),
    CHANNEL("channel");

    private String value;

    UsagePaymentMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UsagePaymentMethodEnum fromValue(String text) {
      for (UsagePaymentMethodEnum b : UsagePaymentMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UsagePaymentMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsagePaymentMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsagePaymentMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UsagePaymentMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("usage_payment_method")
  private UsagePaymentMethodEnum usagePaymentMethod = UsagePaymentMethodEnum.PAY_PER_MINUTE;

  @SerializedName("media_features")
  private MediaFeatures mediaFeatures = null;

  @SerializedName("call_recording")
  private CallRecording callRecording = null;

   /**
   * Identifies the type of resource.
   * @return id
  **/
  @Schema(example = "1293384261075731499", description = "Identifies the type of resource.")
  public String getId() {
    return id;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @Schema(example = "voice_settings", description = "Identifies the type of the resource.")
  public String getRecordType() {
    return recordType;
  }

   /**
   * The phone number in +E164 format.
   * @return phoneNumber
  **/
  @Schema(example = "+13035551234", description = "The phone number in +E164 format.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public PhoneNumberWithVoiceSettings connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Identifies the connection associated with this phone number.
   * @return connectionId
  **/
  @Schema(example = "1d0e6cb8-8668-462e-94c6-49ae0f0ed48b", description = "Identifies the connection associated with this phone number.")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public PhoneNumberWithVoiceSettings techPrefixEnabled(Boolean techPrefixEnabled) {
    this.techPrefixEnabled = techPrefixEnabled;
    return this;
  }

   /**
   * Controls whether a tech prefix is enabled for this phone number.
   * @return techPrefixEnabled
  **/
  @Schema(example = "false", description = "Controls whether a tech prefix is enabled for this phone number.")
  public Boolean isTechPrefixEnabled() {
    return techPrefixEnabled;
  }

  public void setTechPrefixEnabled(Boolean techPrefixEnabled) {
    this.techPrefixEnabled = techPrefixEnabled;
  }

  public PhoneNumberWithVoiceSettings translatedNumber(String translatedNumber) {
    this.translatedNumber = translatedNumber;
    return this;
  }

   /**
   * This field allows you to rewrite the destination number of an inbound call before the call is routed to you. The value of this field may be any alphanumeric value, and the value will replace the number originally dialed.
   * @return translatedNumber
  **/
  @Schema(example = "+13035559999", description = "This field allows you to rewrite the destination number of an inbound call before the call is routed to you. The value of this field may be any alphanumeric value, and the value will replace the number originally dialed.")
  public String getTranslatedNumber() {
    return translatedNumber;
  }

  public void setTranslatedNumber(String translatedNumber) {
    this.translatedNumber = translatedNumber;
  }

  public PhoneNumberWithVoiceSettings callForwarding(CallForwarding callForwarding) {
    this.callForwarding = callForwarding;
    return this;
  }

   /**
   * Get callForwarding
   * @return callForwarding
  **/
  @Schema(description = "")
  public CallForwarding getCallForwarding() {
    return callForwarding;
  }

  public void setCallForwarding(CallForwarding callForwarding) {
    this.callForwarding = callForwarding;
  }

  public PhoneNumberWithVoiceSettings cnamListing(CnamListing cnamListing) {
    this.cnamListing = cnamListing;
    return this;
  }

   /**
   * Get cnamListing
   * @return cnamListing
  **/
  @Schema(description = "")
  public CnamListing getCnamListing() {
    return cnamListing;
  }

  public void setCnamListing(CnamListing cnamListing) {
    this.cnamListing = cnamListing;
  }

  public PhoneNumberWithVoiceSettings emergency(EmergencySettings emergency) {
    this.emergency = emergency;
    return this;
  }

   /**
   * Get emergency
   * @return emergency
  **/
  @Schema(description = "")
  public EmergencySettings getEmergency() {
    return emergency;
  }

  public void setEmergency(EmergencySettings emergency) {
    this.emergency = emergency;
  }

  public PhoneNumberWithVoiceSettings usagePaymentMethod(UsagePaymentMethodEnum usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
    return this;
  }

   /**
   * Controls whether a number is billed per minute or uses your concurrent channels.
   * @return usagePaymentMethod
  **/
  @Schema(example = "pay-per-minute", description = "Controls whether a number is billed per minute or uses your concurrent channels.")
  public UsagePaymentMethodEnum getUsagePaymentMethod() {
    return usagePaymentMethod;
  }

  public void setUsagePaymentMethod(UsagePaymentMethodEnum usagePaymentMethod) {
    this.usagePaymentMethod = usagePaymentMethod;
  }

  public PhoneNumberWithVoiceSettings mediaFeatures(MediaFeatures mediaFeatures) {
    this.mediaFeatures = mediaFeatures;
    return this;
  }

   /**
   * Get mediaFeatures
   * @return mediaFeatures
  **/
  @Schema(description = "")
  public MediaFeatures getMediaFeatures() {
    return mediaFeatures;
  }

  public void setMediaFeatures(MediaFeatures mediaFeatures) {
    this.mediaFeatures = mediaFeatures;
  }

  public PhoneNumberWithVoiceSettings callRecording(CallRecording callRecording) {
    this.callRecording = callRecording;
    return this;
  }

   /**
   * Get callRecording
   * @return callRecording
  **/
  @Schema(description = "")
  public CallRecording getCallRecording() {
    return callRecording;
  }

  public void setCallRecording(CallRecording callRecording) {
    this.callRecording = callRecording;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberWithVoiceSettings phoneNumberWithVoiceSettings = (PhoneNumberWithVoiceSettings) o;
    return Objects.equals(this.id, phoneNumberWithVoiceSettings.id) &&
        Objects.equals(this.recordType, phoneNumberWithVoiceSettings.recordType) &&
        Objects.equals(this.phoneNumber, phoneNumberWithVoiceSettings.phoneNumber) &&
        Objects.equals(this.connectionId, phoneNumberWithVoiceSettings.connectionId) &&
        Objects.equals(this.techPrefixEnabled, phoneNumberWithVoiceSettings.techPrefixEnabled) &&
        Objects.equals(this.translatedNumber, phoneNumberWithVoiceSettings.translatedNumber) &&
        Objects.equals(this.callForwarding, phoneNumberWithVoiceSettings.callForwarding) &&
        Objects.equals(this.cnamListing, phoneNumberWithVoiceSettings.cnamListing) &&
        Objects.equals(this.emergency, phoneNumberWithVoiceSettings.emergency) &&
        Objects.equals(this.usagePaymentMethod, phoneNumberWithVoiceSettings.usagePaymentMethod) &&
        Objects.equals(this.mediaFeatures, phoneNumberWithVoiceSettings.mediaFeatures) &&
        Objects.equals(this.callRecording, phoneNumberWithVoiceSettings.callRecording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, phoneNumber, connectionId, techPrefixEnabled, translatedNumber, callForwarding, cnamListing, emergency, usagePaymentMethod, mediaFeatures, callRecording);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberWithVoiceSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    techPrefixEnabled: ").append(toIndentedString(techPrefixEnabled)).append("\n");
    sb.append("    translatedNumber: ").append(toIndentedString(translatedNumber)).append("\n");
    sb.append("    callForwarding: ").append(toIndentedString(callForwarding)).append("\n");
    sb.append("    cnamListing: ").append(toIndentedString(cnamListing)).append("\n");
    sb.append("    emergency: ").append(toIndentedString(emergency)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}