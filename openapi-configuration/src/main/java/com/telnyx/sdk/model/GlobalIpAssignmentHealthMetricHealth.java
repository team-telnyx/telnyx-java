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
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * GlobalIpAssignmentHealthMetricHealth
 */
@JsonPropertyOrder({
  GlobalIpAssignmentHealthMetricHealth.JSON_PROPERTY_PASS,
  GlobalIpAssignmentHealthMetricHealth.JSON_PROPERTY_FAIL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class GlobalIpAssignmentHealthMetricHealth {
  public static final String JSON_PROPERTY_PASS = "pass";
  private BigDecimal pass;

  public static final String JSON_PROPERTY_FAIL = "fail";
  private BigDecimal fail;

  public GlobalIpAssignmentHealthMetricHealth() { 
  }

  public GlobalIpAssignmentHealthMetricHealth pass(BigDecimal pass) {
    this.pass = pass;
    return this;
  }

   /**
   * The number of successful health checks.
   * @return pass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "The number of successful health checks.")
  @JsonProperty(JSON_PROPERTY_PASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPass() {
    return pass;
  }


  @JsonProperty(JSON_PROPERTY_PASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPass(BigDecimal pass) {
    this.pass = pass;
  }


  public GlobalIpAssignmentHealthMetricHealth fail(BigDecimal fail) {
    this.fail = fail;
    return this;
  }

   /**
   * The number of failed health checks.
   * @return fail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The number of failed health checks.")
  @JsonProperty(JSON_PROPERTY_FAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFail() {
    return fail;
  }


  @JsonProperty(JSON_PROPERTY_FAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFail(BigDecimal fail) {
    this.fail = fail;
  }


  /**
   * Return true if this GlobalIpAssignmentHealthMetric_health object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalIpAssignmentHealthMetricHealth globalIpAssignmentHealthMetricHealth = (GlobalIpAssignmentHealthMetricHealth) o;
    return Objects.equals(this.pass, globalIpAssignmentHealthMetricHealth.pass) &&
        Objects.equals(this.fail, globalIpAssignmentHealthMetricHealth.fail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pass, fail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalIpAssignmentHealthMetricHealth {\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    fail: ").append(toIndentedString(fail)).append("\n");
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

