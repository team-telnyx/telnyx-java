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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The request body when updating a Verify profile.
 */
@ApiModel(description = "The request body when updating a Verify profile.")
@JsonPropertyOrder({
  UpdateVerifyProfileRequest.JSON_PROPERTY_NAME,
  UpdateVerifyProfileRequest.JSON_PROPERTY_MESSAGING_ENABLED,
  UpdateVerifyProfileRequest.JSON_PROPERTY_RCS_ENABLED,
  UpdateVerifyProfileRequest.JSON_PROPERTY_DEFAULT_TIMEOUT_SECS,
  UpdateVerifyProfileRequest.JSON_PROPERTY_MESSAGING_TEMPLATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateVerifyProfileRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MESSAGING_ENABLED = "messaging_enabled";
  private Boolean messagingEnabled = true;

  public static final String JSON_PROPERTY_RCS_ENABLED = "rcs_enabled";
  private Boolean rcsEnabled = false;

  public static final String JSON_PROPERTY_DEFAULT_TIMEOUT_SECS = "default_timeout_secs";
  private Integer defaultTimeoutSecs;

  public static final String JSON_PROPERTY_MESSAGING_TEMPLATE = "messaging_template";
  private JsonNullable<String> messagingTemplate = JsonNullable.<String>of("null");


  public UpdateVerifyProfileRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The human readable label for the Verify profile.
   * @return name
  **/
  @ApiModelProperty(example = "Test Profile", required = true, value = "The human readable label for the Verify profile.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateVerifyProfileRequest messagingEnabled(Boolean messagingEnabled) {
    this.messagingEnabled = messagingEnabled;
    return this;
  }

   /**
   * Enables SMS text messaging for the Verify profile.
   * @return messagingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enables SMS text messaging for the Verify profile.")
  @JsonProperty(JSON_PROPERTY_MESSAGING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMessagingEnabled() {
    return messagingEnabled;
  }


  public void setMessagingEnabled(Boolean messagingEnabled) {
    this.messagingEnabled = messagingEnabled;
  }


  public UpdateVerifyProfileRequest rcsEnabled(Boolean rcsEnabled) {
    this.rcsEnabled = rcsEnabled;
    return this;
  }

   /**
   * Enables RCS messaging for the Verify profile.
   * @return rcsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Enables RCS messaging for the Verify profile.")
  @JsonProperty(JSON_PROPERTY_RCS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRcsEnabled() {
    return rcsEnabled;
  }


  public void setRcsEnabled(Boolean rcsEnabled) {
    this.rcsEnabled = rcsEnabled;
  }


  public UpdateVerifyProfileRequest defaultTimeoutSecs(Integer defaultTimeoutSecs) {
    this.defaultTimeoutSecs = defaultTimeoutSecs;
    return this;
  }

   /**
   * For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.
   * @return defaultTimeoutSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300", value = "For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultTimeoutSecs() {
    return defaultTimeoutSecs;
  }


  public void setDefaultTimeoutSecs(Integer defaultTimeoutSecs) {
    this.defaultTimeoutSecs = defaultTimeoutSecs;
  }


  public UpdateVerifyProfileRequest messagingTemplate(String messagingTemplate) {
    this.messagingTemplate = JsonNullable.<String>of(messagingTemplate);
    return this;
  }

   /**
   * Optionally sets a messaging text template when sending the verification code. Uses &#x60;{code}&#x60; to template in the actual verification code.
   * @return messagingTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello, this is the Acme Inc verification code you requested: {code}.", value = "Optionally sets a messaging text template when sending the verification code. Uses `{code}` to template in the actual verification code.")
  @JsonIgnore

  public String getMessagingTemplate() {
        return messagingTemplate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGING_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessagingTemplate_JsonNullable() {
    return messagingTemplate;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGING_TEMPLATE)
  public void setMessagingTemplate_JsonNullable(JsonNullable<String> messagingTemplate) {
    this.messagingTemplate = messagingTemplate;
  }

  public void setMessagingTemplate(String messagingTemplate) {
    this.messagingTemplate = JsonNullable.<String>of(messagingTemplate);
  }


  /**
   * Return true if this UpdateVerifyProfileRequest object is equal to o.
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
        Objects.equals(this.messagingEnabled, updateVerifyProfileRequest.messagingEnabled) &&
        Objects.equals(this.rcsEnabled, updateVerifyProfileRequest.rcsEnabled) &&
        Objects.equals(this.defaultTimeoutSecs, updateVerifyProfileRequest.defaultTimeoutSecs) &&
        Objects.equals(this.messagingTemplate, updateVerifyProfileRequest.messagingTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, messagingEnabled, rcsEnabled, defaultTimeoutSecs, messagingTemplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateVerifyProfileRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    messagingEnabled: ").append(toIndentedString(messagingEnabled)).append("\n");
    sb.append("    rcsEnabled: ").append(toIndentedString(rcsEnabled)).append("\n");
    sb.append("    defaultTimeoutSecs: ").append(toIndentedString(defaultTimeoutSecs)).append("\n");
    sb.append("    messagingTemplate: ").append(toIndentedString(messagingTemplate)).append("\n");
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

