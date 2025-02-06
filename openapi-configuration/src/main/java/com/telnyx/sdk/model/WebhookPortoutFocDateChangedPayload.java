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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The webhook payload for the portout.foc_date_changed event
 */
@ApiModel(description = "The webhook payload for the portout.foc_date_changed event")
@JsonPropertyOrder({
  WebhookPortoutFocDateChangedPayload.JSON_PROPERTY_ID,
  WebhookPortoutFocDateChangedPayload.JSON_PROPERTY_USER_ID,
  WebhookPortoutFocDateChangedPayload.JSON_PROPERTY_FOC_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class WebhookPortoutFocDateChangedPayload {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public static final String JSON_PROPERTY_FOC_DATE = "foc_date";
  private OffsetDateTime focDate;

  public WebhookPortoutFocDateChangedPayload() { 
  }

  public WebhookPortoutFocDateChangedPayload id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the port-out order that have the FOC date changed.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96dfa9e4-c753-4fd3-97cd-42d66f26cf0c", value = "Identifies the port-out order that have the FOC date changed.")
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


  public WebhookPortoutFocDateChangedPayload userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Identifies the organization that port-out order belongs to.
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0e19c89e-f0ce-458a-a36c-3c60bc2014b1", value = "Identifies the organization that port-out order belongs to.")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public WebhookPortoutFocDateChangedPayload focDate(OffsetDateTime focDate) {
    this.focDate = focDate;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating the new FOC date.
   * @return focDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-19T10:07:15.527Z", value = "ISO 8601 formatted date indicating the new FOC date.")
  @JsonProperty(JSON_PROPERTY_FOC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getFocDate() {
    return focDate;
  }


  @JsonProperty(JSON_PROPERTY_FOC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFocDate(OffsetDateTime focDate) {
    this.focDate = focDate;
  }


  /**
   * Return true if this WebhookPortoutFocDateChangedPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookPortoutFocDateChangedPayload webhookPortoutFocDateChangedPayload = (WebhookPortoutFocDateChangedPayload) o;
    return Objects.equals(this.id, webhookPortoutFocDateChangedPayload.id) &&
        Objects.equals(this.userId, webhookPortoutFocDateChangedPayload.userId) &&
        Objects.equals(this.focDate, webhookPortoutFocDateChangedPayload.focDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, focDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPortoutFocDateChangedPayload {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    focDate: ").append(toIndentedString(focDate)).append("\n");
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

