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
 * PortingPhoneNumberExtensionActivationRangesInner
 */
@JsonPropertyOrder({
  PortingPhoneNumberExtensionActivationRangesInner.JSON_PROPERTY_START_AT,
  PortingPhoneNumberExtensionActivationRangesInner.JSON_PROPERTY_END_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class PortingPhoneNumberExtensionActivationRangesInner {
  public static final String JSON_PROPERTY_START_AT = "start_at";
  private Integer startAt;

  public static final String JSON_PROPERTY_END_AT = "end_at";
  private Integer endAt;

  public PortingPhoneNumberExtensionActivationRangesInner() { 
  }

  public PortingPhoneNumberExtensionActivationRangesInner startAt(Integer startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Specifies the start of the activation range. Must be greater or equal the start of the extension range.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Specifies the start of the activation range. Must be greater or equal the start of the extension range.")
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartAt() {
    return startAt;
  }


  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }


  public PortingPhoneNumberExtensionActivationRangesInner endAt(Integer endAt) {
    this.endAt = endAt;
    return this;
  }

   /**
   * Specifies the end of the activation range. It must be no more than the end of the extension range.
   * @return endAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Specifies the end of the activation range. It must be no more than the end of the extension range.")
  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndAt() {
    return endAt;
  }


  @JsonProperty(JSON_PROPERTY_END_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndAt(Integer endAt) {
    this.endAt = endAt;
  }


  /**
   * Return true if this PortingPhoneNumberExtension_activation_ranges_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortingPhoneNumberExtensionActivationRangesInner portingPhoneNumberExtensionActivationRangesInner = (PortingPhoneNumberExtensionActivationRangesInner) o;
    return Objects.equals(this.startAt, portingPhoneNumberExtensionActivationRangesInner.startAt) &&
        Objects.equals(this.endAt, portingPhoneNumberExtensionActivationRangesInner.endAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, endAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortingPhoneNumberExtensionActivationRangesInner {\n");
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

