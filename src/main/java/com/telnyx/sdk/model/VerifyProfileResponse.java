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
import com.telnyx.sdk.model.VerificationProfileRecordType;
import com.telnyx.sdk.model.VerifyProfileCallResponse;
import com.telnyx.sdk.model.VerifyProfileFlashcallResponse;
import com.telnyx.sdk.model.VerifyProfileSMSResponse;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * VerifyProfileResponse
 */
@JsonPropertyOrder({
  VerifyProfileResponse.JSON_PROPERTY_ID,
  VerifyProfileResponse.JSON_PROPERTY_NAME,
  VerifyProfileResponse.JSON_PROPERTY_WEBHOOK_URL,
  VerifyProfileResponse.JSON_PROPERTY_WEBHOOK_FAILOVER_URL,
  VerifyProfileResponse.JSON_PROPERTY_RECORD_TYPE,
  VerifyProfileResponse.JSON_PROPERTY_CREATED_AT,
  VerifyProfileResponse.JSON_PROPERTY_UPDATED_AT,
  VerifyProfileResponse.JSON_PROPERTY_SMS,
  VerifyProfileResponse.JSON_PROPERTY_CALL,
  VerifyProfileResponse.JSON_PROPERTY_FLASHCALL,
  VerifyProfileResponse.JSON_PROPERTY_LANGUAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class VerifyProfileResponse {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private String webhookUrl;

  public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_URL = "webhook_failover_url";
  private String webhookFailoverUrl;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private VerificationProfileRecordType recordType;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_SMS = "sms";
  private VerifyProfileSMSResponse sms;

  public static final String JSON_PROPERTY_CALL = "call";
  private VerifyProfileCallResponse call;

  public static final String JSON_PROPERTY_FLASHCALL = "flashcall";
  private VerifyProfileFlashcallResponse flashcall;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public VerifyProfileResponse() { 
  }

  public VerifyProfileResponse id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "12ade33a-21c0-473b-b055-b3c836e1c292", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public VerifyProfileResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
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


  public VerifyProfileResponse webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Get webhookUrl
   * @return webhookUrl
  **/
  @jakarta.annotation.Nullable
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


  public VerifyProfileResponse webhookFailoverUrl(String webhookFailoverUrl) {
    this.webhookFailoverUrl = webhookFailoverUrl;
    return this;
  }

   /**
   * Get webhookFailoverUrl
   * @return webhookFailoverUrl
  **/
  @jakarta.annotation.Nullable
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


  public VerifyProfileResponse recordType(VerificationProfileRecordType recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerificationProfileRecordType getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(VerificationProfileRecordType recordType) {
    this.recordType = recordType;
  }


  public VerifyProfileResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-09-14T17:03:32.965812", value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public VerifyProfileResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2020-09-14T17:03:32.965812", value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public VerifyProfileResponse sms(VerifyProfileSMSResponse sms) {
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerifyProfileSMSResponse getSms() {
    return sms;
  }


  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSms(VerifyProfileSMSResponse sms) {
    this.sms = sms;
  }


  public VerifyProfileResponse call(VerifyProfileCallResponse call) {
    this.call = call;
    return this;
  }

   /**
   * Get call
   * @return call
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerifyProfileCallResponse getCall() {
    return call;
  }


  @JsonProperty(JSON_PROPERTY_CALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCall(VerifyProfileCallResponse call) {
    this.call = call;
  }


  public VerifyProfileResponse flashcall(VerifyProfileFlashcallResponse flashcall) {
    this.flashcall = flashcall;
    return this;
  }

   /**
   * Get flashcall
   * @return flashcall
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FLASHCALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VerifyProfileFlashcallResponse getFlashcall() {
    return flashcall;
  }


  @JsonProperty(JSON_PROPERTY_FLASHCALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlashcall(VerifyProfileFlashcallResponse flashcall) {
    this.flashcall = flashcall;
  }


  public VerifyProfileResponse language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @jakarta.annotation.Nullable
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
   * Return true if this VerifyProfileResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyProfileResponse verifyProfileResponse = (VerifyProfileResponse) o;
    return Objects.equals(this.id, verifyProfileResponse.id) &&
        Objects.equals(this.name, verifyProfileResponse.name) &&
        Objects.equals(this.webhookUrl, verifyProfileResponse.webhookUrl) &&
        Objects.equals(this.webhookFailoverUrl, verifyProfileResponse.webhookFailoverUrl) &&
        Objects.equals(this.recordType, verifyProfileResponse.recordType) &&
        Objects.equals(this.createdAt, verifyProfileResponse.createdAt) &&
        Objects.equals(this.updatedAt, verifyProfileResponse.updatedAt) &&
        Objects.equals(this.sms, verifyProfileResponse.sms) &&
        Objects.equals(this.call, verifyProfileResponse.call) &&
        Objects.equals(this.flashcall, verifyProfileResponse.flashcall) &&
        Objects.equals(this.language, verifyProfileResponse.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, webhookUrl, webhookFailoverUrl, recordType, createdAt, updatedAt, sms, call, flashcall, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyProfileResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    webhookFailoverUrl: ").append(toIndentedString(webhookFailoverUrl)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

