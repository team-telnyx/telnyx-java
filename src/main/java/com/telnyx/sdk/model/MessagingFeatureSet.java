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
 * The set of features available for a specific messaging use case (SMS or MMS). Features can vary depending on the characteristics the phone number, as well as its current product configuration. 
 */
@ApiModel(description = "The set of features available for a specific messaging use case (SMS or MMS). Features can vary depending on the characteristics the phone number, as well as its current product configuration. ")
@JsonPropertyOrder({
  MessagingFeatureSet.JSON_PROPERTY_DOMESTIC_TWO_WAY,
  MessagingFeatureSet.JSON_PROPERTY_INTERNATIONAL_INBOUND,
  MessagingFeatureSet.JSON_PROPERTY_INTERNATIONAL_OUTBOUND
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class MessagingFeatureSet {
  public static final String JSON_PROPERTY_DOMESTIC_TWO_WAY = "domestic_two_way";
  private Boolean domesticTwoWay;

  public static final String JSON_PROPERTY_INTERNATIONAL_INBOUND = "international_inbound";
  private Boolean internationalInbound;

  public static final String JSON_PROPERTY_INTERNATIONAL_OUTBOUND = "international_outbound";
  private Boolean internationalOutbound;

  public MessagingFeatureSet() { 
  }

  public MessagingFeatureSet domesticTwoWay(Boolean domesticTwoWay) {
    this.domesticTwoWay = domesticTwoWay;
    return this;
  }

   /**
   * Send messages to and receive messages from numbers in the same country.
   * @return domesticTwoWay
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Send messages to and receive messages from numbers in the same country.")
  @JsonProperty(JSON_PROPERTY_DOMESTIC_TWO_WAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getDomesticTwoWay() {
    return domesticTwoWay;
  }


  @JsonProperty(JSON_PROPERTY_DOMESTIC_TWO_WAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDomesticTwoWay(Boolean domesticTwoWay) {
    this.domesticTwoWay = domesticTwoWay;
  }


  public MessagingFeatureSet internationalInbound(Boolean internationalInbound) {
    this.internationalInbound = internationalInbound;
    return this;
  }

   /**
   * Receive messages from numbers in other countries.
   * @return internationalInbound
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Receive messages from numbers in other countries.")
  @JsonProperty(JSON_PROPERTY_INTERNATIONAL_INBOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getInternationalInbound() {
    return internationalInbound;
  }


  @JsonProperty(JSON_PROPERTY_INTERNATIONAL_INBOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInternationalInbound(Boolean internationalInbound) {
    this.internationalInbound = internationalInbound;
  }


  public MessagingFeatureSet internationalOutbound(Boolean internationalOutbound) {
    this.internationalOutbound = internationalOutbound;
    return this;
  }

   /**
   * Send messages to numbers in other countries.
   * @return internationalOutbound
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Send messages to numbers in other countries.")
  @JsonProperty(JSON_PROPERTY_INTERNATIONAL_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getInternationalOutbound() {
    return internationalOutbound;
  }


  @JsonProperty(JSON_PROPERTY_INTERNATIONAL_OUTBOUND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInternationalOutbound(Boolean internationalOutbound) {
    this.internationalOutbound = internationalOutbound;
  }


  /**
   * Return true if this MessagingFeatureSet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagingFeatureSet messagingFeatureSet = (MessagingFeatureSet) o;
    return Objects.equals(this.domesticTwoWay, messagingFeatureSet.domesticTwoWay) &&
        Objects.equals(this.internationalInbound, messagingFeatureSet.internationalInbound) &&
        Objects.equals(this.internationalOutbound, messagingFeatureSet.internationalOutbound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domesticTwoWay, internationalInbound, internationalOutbound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingFeatureSet {\n");
    sb.append("    domesticTwoWay: ").append(toIndentedString(domesticTwoWay)).append("\n");
    sb.append("    internationalInbound: ").append(toIndentedString(internationalInbound)).append("\n");
    sb.append("    internationalOutbound: ").append(toIndentedString(internationalOutbound)).append("\n");
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

