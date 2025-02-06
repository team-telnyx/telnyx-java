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
 * ExternalConnectionInbound
 */
@JsonPropertyOrder({
  ExternalConnectionInbound.JSON_PROPERTY_CHANNEL_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ExternalConnectionInbound {
  public static final String JSON_PROPERTY_CHANNEL_LIMIT = "channel_limit";
  private Integer channelLimit;

  public ExternalConnectionInbound() { 
  }

  public ExternalConnectionInbound channelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
    return this;
  }

   /**
   * When set, this will limit the number of concurrent inbound calls to phone numbers associated with this connection.
   * @return channelLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "When set, this will limit the number of concurrent inbound calls to phone numbers associated with this connection.")
  @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChannelLimit() {
    return channelLimit;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelLimit(Integer channelLimit) {
    this.channelLimit = channelLimit;
  }


  /**
   * Return true if this ExternalConnection_inbound object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalConnectionInbound externalConnectionInbound = (ExternalConnectionInbound) o;
    return Objects.equals(this.channelLimit, externalConnectionInbound.channelLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalConnectionInbound {\n");
    sb.append("    channelLimit: ").append(toIndentedString(channelLimit)).append("\n");
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

