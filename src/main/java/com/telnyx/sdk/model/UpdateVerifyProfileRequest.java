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
import com.telnyx.sdk.model.UpdateVerifyProfileCallRequest;
import com.telnyx.sdk.model.UpdateVerifyProfileFlashcallRequest;
import com.telnyx.sdk.model.UpdateVerifyProfileSMSRequest;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * UpdateVerifyProfileRequest
 */
@JsonPropertyOrder({
  UpdateVerifyProfileRequest.JSON_PROPERTY_NAME,
  UpdateVerifyProfileRequest.JSON_PROPERTY_WEBHOOK_URL,
  UpdateVerifyProfileRequest.JSON_PROPERTY_WEBHOOK_FAILOVER_URL,
  UpdateVerifyProfileRequest.JSON_PROPERTY_SMS,
  UpdateVerifyProfileRequest.JSON_PROPERTY_CALL,
  UpdateVerifyProfileRequest.JSON_PROPERTY_FLASHCALL,
  UpdateVerifyProfileRequest.JSON_PROPERTY_LANGUAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UpdateVerifyProfileRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private String webhookUrl;

  public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_URL = "webhook_failover_url";
  private String webhookFailoverUrl;

  public static final String JSON_PROPERTY_SMS = "sms";
  private UpdateVerifyProfileSMSRequest sms;

  public static final String JSON_PROPERTY_CALL = "call";
  private UpdateVerifyProfileCallRequest call;

  public static final String JSON_PROPERTY_FLASHCALL = "flashcall";
  private UpdateVerifyProfileFlashcallRequest flashcall;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public UpdateVerifyProfileRequest() { 
  }

  public UpdateVerifyProfileRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Test Profile", value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UpdateVerifyProfileRequest webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/webhook", value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookUrl() {
    return webhookUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }


  public UpdateVerifyProfileRequest webhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
    return this;
  }

   /**
   * Get webhookFailoverUrl
   * @return webhookFailoverUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://example.com/webhook/failover", value = "")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookFailoverUrl() {
    return webhookFailoverUrl;
  }


  @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
  }


  public UpdateVerifyProfileRequest sms(UpdateVerifyProfileSMSRequest sms) {
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateVerifyProfileSMSRequest getSms() {
    return sms;
  }


  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSms(UpdateVerifyProfileSMSRequest sms) {
    this.sms = sms;
  }


  public UpdateVerifyProfileRequest call(UpdateVerifyProfileCallRequest call) {
    this.call = call;
    return this;
  }

   /**
   * Get call
   * @return call
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateVerifyProfileCallRequest getCall() {
    return call;
  }


  @JsonProperty(JSON_PROPERTY_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCall(UpdateVerifyProfileCallRequest call) {
    this.call = call;
  }


  public UpdateVerifyProfileRequest flashcall(UpdateVerifyProfileFlashcallRequest flashcall) {
    this.flashcall = flashcall;
    return this;
  }

   /**
   * Get flashcall
   * @return flashcall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FLASHCALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateVerifyProfileFlashcallRequest getFlashcall() {
    return flashcall;
  }


  @JsonProperty(JSON_PROPERTY_FLASHCALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlashcall(UpdateVerifyProfileFlashcallRequest flashcall) {
    this.flashcall = flashcall;
  }


  public UpdateVerifyProfileRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "en-US", value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * Return true if this Update_Verify_Profile_Request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateVerifyProfileRequest updateVerifyProfileRequest = (UpdateVerifyProfileRequest) o;
    return Objects.equals(this.name, updateVerifyProfileRequest.name) &&
        Objects.equals(this.webhookUrl, updateVerifyProfileRequest.webhookUrl) &&
        Objects.equals(this.webhookFailoverUrl, updateVerifyProfileRequest.webhookFailoverUrl) &&
        Objects.equals(this.sms, updateVerifyProfileRequest.sms) &&
        Objects.equals(this.call, updateVerifyProfileRequest.call) &&
        Objects.equals(this.flashcall, updateVerifyProfileRequest.flashcall) &&
        Objects.equals(this.language, updateVerifyProfileRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, webhookUrl, webhookFailoverUrl, sms, call, flashcall, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerifyProfileRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookFailoverUrl: ").append(toIndentedString(webhookFailoverUrl)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    call: ").append(toIndentedString(call)).append("\n");
    sb.append("    flashcall: ").append(toIndentedString(flashcall)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

