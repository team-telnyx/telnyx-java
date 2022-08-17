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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * MessagingProfileHighLevelMetricsOutbound
 */
@JsonPropertyOrder({
  MessagingProfileHighLevelMetricsOutbound.JSON_PROPERTY_SENT,
  MessagingProfileHighLevelMetricsOutbound.JSON_PROPERTY_DELIVERED,
  MessagingProfileHighLevelMetricsOutbound.JSON_PROPERTY_ERROR_RATIO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MessagingProfileHighLevelMetricsOutbound {
  public static final String JSON_PROPERTY_SENT = "sent";
  private BigDecimal sent;

  public static final String JSON_PROPERTY_DELIVERED = "delivered";
  private BigDecimal delivered;

  public static final String JSON_PROPERTY_ERROR_RATIO = "error_ratio";
  private BigDecimal errorRatio;

  public MessagingProfileHighLevelMetricsOutbound() { 
  }

  @JsonCreator
  public MessagingProfileHighLevelMetricsOutbound(
    @JsonProperty(JSON_PROPERTY_SENT) BigDecimal sent, 
    @JsonProperty(JSON_PROPERTY_DELIVERED) BigDecimal delivered, 
    @JsonProperty(JSON_PROPERTY_ERROR_RATIO) BigDecimal errorRatio
  ) {
    this();
    this.sent = sent;
    this.delivered = delivered;
    this.errorRatio = errorRatio;
  }

   /**
   * The number of outbound messages sent.
   * @return sent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of outbound messages sent.")
  @JsonProperty(JSON_PROPERTY_SENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSent() {
    return sent;
  }




   /**
   * The number of outbound messages successfully delivered.
   * @return delivered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of outbound messages successfully delivered.")
  @JsonProperty(JSON_PROPERTY_DELIVERED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDelivered() {
    return delivered;
  }




   /**
   * The ratio of messages sent that resulted in errors.
   * @return errorRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ratio of messages sent that resulted in errors.")
  @JsonProperty(JSON_PROPERTY_ERROR_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getErrorRatio() {
    return errorRatio;
  }




  /**
   * Return true if this MessagingProfileHighLevelMetrics_outbound object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingProfileHighLevelMetricsOutbound messagingProfileHighLevelMetricsOutbound = (MessagingProfileHighLevelMetricsOutbound) o;
    return Objects.equals(this.sent, messagingProfileHighLevelMetricsOutbound.sent) &&
        Objects.equals(this.delivered, messagingProfileHighLevelMetricsOutbound.delivered) &&
        Objects.equals(this.errorRatio, messagingProfileHighLevelMetricsOutbound.errorRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sent, delivered, errorRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingProfileHighLevelMetricsOutbound {\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    errorRatio: ").append(toIndentedString(errorRatio)).append("\n");
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

