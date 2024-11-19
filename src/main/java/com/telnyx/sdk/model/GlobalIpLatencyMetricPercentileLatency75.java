/*
 * Telnyx API
 * Notifications and Notification Settings.
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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GlobalIpLatencyMetricPercentileLatency75
 */
@JsonPropertyOrder({
  GlobalIpLatencyMetricPercentileLatency75.JSON_PROPERTY_AMOUNT,
  GlobalIpLatencyMetricPercentileLatency75.JSON_PROPERTY_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.10.0")
public class GlobalIpLatencyMetricPercentileLatency75 {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_UNIT = "unit";
  private String unit;

  public GlobalIpLatencyMetricPercentileLatency75() { 
  }

  public GlobalIpLatencyMetricPercentileLatency75 amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The 75th percentile latency.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The 75th percentile latency.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public GlobalIpLatencyMetricPercentileLatency75 unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of the 75th percentile latency.
   * @return unit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ms", value = "The unit of the 75th percentile latency.")
  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnit() {
    return unit;
  }


  @JsonProperty(JSON_PROPERTY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnit(String unit) {
    this.unit = unit;
  }


  /**
   * Return true if this GlobalIpLatencyMetric_percentile_latency_75 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpLatencyMetricPercentileLatency75 globalIpLatencyMetricPercentileLatency75 = (GlobalIpLatencyMetricPercentileLatency75) o;
    return Objects.equals(this.amount, globalIpLatencyMetricPercentileLatency75.amount) &&
        Objects.equals(this.unit, globalIpLatencyMetricPercentileLatency75.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpLatencyMetricPercentileLatency75 {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

