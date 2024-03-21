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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * PortingOrdersActivationJobActivationWindowsInner
 */
@JsonPropertyOrder({
  PortingOrdersActivationJobActivationWindowsInner.JSON_PROPERTY_START_AT,
  PortingOrdersActivationJobActivationWindowsInner.JSON_PROPERTY_END_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class PortingOrdersActivationJobActivationWindowsInner {
  public static final String JSON_PROPERTY_START_AT = "start_at";
  private OffsetDateTime startAt;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private OffsetDateTime endAt;

  public PortingOrdersActivationJobActivationWindowsInner() { 
  }

  public PortingOrdersActivationJobActivationWindowsInner startAt(OffsetDateTime startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the activation window starts
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-19T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the activation window starts")
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartAt() {
    return startAt;
  }


  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartAt(OffsetDateTime startAt) {
    this.startAt = startAt;
  }


  public PortingOrdersActivationJobActivationWindowsInner endAt(OffsetDateTime endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * ISO 8601 formatted date indicating when the activation window ends
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-19T10:07:15.527Z", value = "ISO 8601 formatted date indicating when the activation window ends")
  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndAt() {
    return endAt;
  }


  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndAt(OffsetDateTime endAt) {
    this.endAt = endAt;
  }


  /**
   * Return true if this PortingOrdersActivationJob_activation_windows_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingOrdersActivationJobActivationWindowsInner portingOrdersActivationJobActivationWindowsInner = (PortingOrdersActivationJobActivationWindowsInner) o;
    return Objects.equals(this.startAt, portingOrdersActivationJobActivationWindowsInner.startAt) &&
        Objects.equals(this.endAt, portingOrdersActivationJobActivationWindowsInner.endAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, endAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingOrdersActivationJobActivationWindowsInner {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
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
