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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CallbackWebhookMeta
 */
@JsonPropertyOrder({
  CallbackWebhookMeta.JSON_PROPERTY_ATTEMPT,
  CallbackWebhookMeta.JSON_PROPERTY_DELIVERED_TO
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CallbackWebhookMeta {
  public static final String JSON_PROPERTY_ATTEMPT = "attempt";
  private Integer attempt;

  public static final String JSON_PROPERTY_DELIVERED_TO = "delivered_to";
  private String deliveredTo;

  public CallbackWebhookMeta() { 
  }

  public CallbackWebhookMeta attempt(Integer attempt) {
    this.attempt = attempt;
    return this;
  }

   /**
   * The number of times the callback webhook has been attempted.
   * @return attempt
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The number of times the callback webhook has been attempted.")
  @JsonProperty(JSON_PROPERTY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttempt() {
    return attempt;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttempt(Integer attempt) {
    this.attempt = attempt;
  }


  public CallbackWebhookMeta deliveredTo(String deliveredTo) {
    this.deliveredTo = deliveredTo;
    return this;
  }

   /**
   * The URL that the callback webhook was delivered to.
   * @return deliveredTo
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/webhook", value = "The URL that the callback webhook was delivered to.")
  @JsonProperty(JSON_PROPERTY_DELIVERED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeliveredTo() {
    return deliveredTo;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERED_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveredTo(String deliveredTo) {
    this.deliveredTo = deliveredTo;
  }


  /**
   * Return true if this CallbackWebhookMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackWebhookMeta callbackWebhookMeta = (CallbackWebhookMeta) o;
    return Objects.equals(this.attempt, callbackWebhookMeta.attempt) &&
        Objects.equals(this.deliveredTo, callbackWebhookMeta.deliveredTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempt, deliveredTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackWebhookMeta {\n");
    sb.append("    attempt: ").append(toIndentedString(attempt)).append("\n");
    sb.append("    deliveredTo: ").append(toIndentedString(deliveredTo)).append("\n");
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

