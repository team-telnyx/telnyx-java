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
import com.telnyx.sdk.model.CustomerServiceRecordAdditionalData;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CreateCustomerServiceRecordRequest
 */
@JsonPropertyOrder({
  CreateCustomerServiceRecordRequest.JSON_PROPERTY_PHONE_NUMBER,
  CreateCustomerServiceRecordRequest.JSON_PROPERTY_WEBHOOK_URL,
  CreateCustomerServiceRecordRequest.JSON_PROPERTY_ADDITIONAL_DATA
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CreateCustomerServiceRecordRequest {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
  private String webhookUrl;

  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additional_data";
  private CustomerServiceRecordAdditionalData additionalData;

  public CreateCustomerServiceRecordRequest() { 
  }

  public CreateCustomerServiceRecordRequest phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * A valid US phone number in E164 format.
   * @return phoneNumber
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "+1234567890", required = true, value = "A valid US phone number in E164 format.")
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


  public CreateCustomerServiceRecordRequest webhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * Callback URL to receive webhook notifications.
   * @return webhookUrl
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://example.com/webhook", value = "Callback URL to receive webhook notifications.")
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


  public CreateCustomerServiceRecordRequest additionalData(CustomerServiceRecordAdditionalData additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Get additionalData
   * @return additionalData
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerServiceRecordAdditionalData getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(CustomerServiceRecordAdditionalData additionalData) {
    this.additionalData = additionalData;
  }


  /**
   * Return true if this CreateCustomerServiceRecord_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomerServiceRecordRequest createCustomerServiceRecordRequest = (CreateCustomerServiceRecordRequest) o;
    return Objects.equals(this.phoneNumber, createCustomerServiceRecordRequest.phoneNumber) &&
        Objects.equals(this.webhookUrl, createCustomerServiceRecordRequest.webhookUrl) &&
        Objects.equals(this.additionalData, createCustomerServiceRecordRequest.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, webhookUrl, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomerServiceRecordRequest {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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

