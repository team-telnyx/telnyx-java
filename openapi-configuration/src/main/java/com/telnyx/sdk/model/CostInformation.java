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
 * CostInformation
 */
@JsonPropertyOrder({
  CostInformation.JSON_PROPERTY_UPFRONT_COST,
  CostInformation.JSON_PROPERTY_MONTHLY_COST,
  CostInformation.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class CostInformation {
  public static final String JSON_PROPERTY_UPFRONT_COST = "upfront_cost";
  private String upfrontCost;

  public static final String JSON_PROPERTY_MONTHLY_COST = "monthly_cost";
  private String monthlyCost;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public CostInformation() { 
  }

  public CostInformation upfrontCost(String upfrontCost) {
    this.upfrontCost = upfrontCost;
    return this;
  }

   /**
   * Get upfrontCost
   * @return upfrontCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.21", value = "")
  @JsonProperty(JSON_PROPERTY_UPFRONT_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpfrontCost() {
    return upfrontCost;
  }


  @JsonProperty(JSON_PROPERTY_UPFRONT_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpfrontCost(String upfrontCost) {
    this.upfrontCost = upfrontCost;
  }


  public CostInformation monthlyCost(String monthlyCost) {
    this.monthlyCost = monthlyCost;
    return this;
  }

   /**
   * Get monthlyCost
   * @return monthlyCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6.54", value = "")
  @JsonProperty(JSON_PROPERTY_MONTHLY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMonthlyCost() {
    return monthlyCost;
  }


  @JsonProperty(JSON_PROPERTY_MONTHLY_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonthlyCost(String monthlyCost) {
    this.monthlyCost = monthlyCost;
  }


  public CostInformation currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The ISO 4217 code for the currency.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The ISO 4217 code for the currency.")
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


  /**
   * Return true if this CostInformation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostInformation costInformation = (CostInformation) o;
    return Objects.equals(this.upfrontCost, costInformation.upfrontCost) &&
        Objects.equals(this.monthlyCost, costInformation.monthlyCost) &&
        Objects.equals(this.currency, costInformation.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upfrontCost, monthlyCost, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostInformation {\n");
    sb.append("    upfrontCost: ").append(toIndentedString(upfrontCost)).append("\n");
    sb.append("    monthlyCost: ").append(toIndentedString(monthlyCost)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

