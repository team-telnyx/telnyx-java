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
 * CallCostPayloadCostPartsInner
 */
@JsonPropertyOrder({
  CallCostPayloadCostPartsInner.JSON_PROPERTY_BILLED_DURATION_SECS,
  CallCostPayloadCostPartsInner.JSON_PROPERTY_CALL_PART,
  CallCostPayloadCostPartsInner.JSON_PROPERTY_COST,
  CallCostPayloadCostPartsInner.JSON_PROPERTY_CURRENCY,
  CallCostPayloadCostPartsInner.JSON_PROPERTY_RATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CallCostPayloadCostPartsInner {
  public static final String JSON_PROPERTY_BILLED_DURATION_SECS = "billed_duration_secs";
  private Integer billedDurationSecs;

  public static final String JSON_PROPERTY_CALL_PART = "call_part";
  private String callPart;

  public static final String JSON_PROPERTY_COST = "cost";
  private BigDecimal cost;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_RATE = "rate";
  private BigDecimal rate;

  public CallCostPayloadCostPartsInner() { 
  }

  public CallCostPayloadCostPartsInner billedDurationSecs(Integer billedDurationSecs) {
    this.billedDurationSecs = billedDurationSecs;
    return this;
  }

   /**
   * The number of seconds for which this item will be billed
   * minimum: 0
   * @return billedDurationSecs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The number of seconds for which this item will be billed")
  @JsonProperty(JSON_PROPERTY_BILLED_DURATION_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBilledDurationSecs() {
    return billedDurationSecs;
  }


  @JsonProperty(JSON_PROPERTY_BILLED_DURATION_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBilledDurationSecs(Integer billedDurationSecs) {
    this.billedDurationSecs = billedDurationSecs;
  }


  public CallCostPayloadCostPartsInner callPart(String callPart) {
    this.callPart = callPart;
    return this;
  }

   /**
   * The service incurring a charge
   * @return callPart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "call-control", value = "The service incurring a charge")
  @JsonProperty(JSON_PROPERTY_CALL_PART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallPart() {
    return callPart;
  }


  @JsonProperty(JSON_PROPERTY_CALL_PART)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallPart(String callPart) {
    this.callPart = callPart;
  }


  public CallCostPayloadCostPartsInner cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * The billed cost of the item, in currency shown in the &#x60;currency&#x60; field
   * minimum: 0.0
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0", value = "The billed cost of the item, in currency shown in the `currency` field")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }


  public CallCostPayloadCostPartsInner currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The currency in which &#x60;cost&#x60; is measured
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The currency in which `cost` is measured")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CallCostPayloadCostPartsInner rate(BigDecimal rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The cost per unit of the item incurring a charge
   * minimum: 0.0
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.001", value = "The cost per unit of the item incurring a charge")
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(BigDecimal rate) {
    this.rate = rate;
  }


  /**
   * Return true if this CallCost_payload_cost_parts_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallCostPayloadCostPartsInner callCostPayloadCostPartsInner = (CallCostPayloadCostPartsInner) o;
    return Objects.equals(this.billedDurationSecs, callCostPayloadCostPartsInner.billedDurationSecs) &&
        Objects.equals(this.callPart, callCostPayloadCostPartsInner.callPart) &&
        Objects.equals(this.cost, callCostPayloadCostPartsInner.cost) &&
        Objects.equals(this.currency, callCostPayloadCostPartsInner.currency) &&
        Objects.equals(this.rate, callCostPayloadCostPartsInner.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billedDurationSecs, callPart, cost, currency, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallCostPayloadCostPartsInner {\n");
    sb.append("    billedDurationSecs: ").append(toIndentedString(billedDurationSecs)).append("\n");
    sb.append("    callPart: ").append(toIndentedString(callPart)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

