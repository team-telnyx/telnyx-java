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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * AutoRechargePref
 */
@JsonPropertyOrder({
  AutoRechargePref.JSON_PROPERTY_ID,
  AutoRechargePref.JSON_PROPERTY_RECORD_TYPE,
  AutoRechargePref.JSON_PROPERTY_THRESHOLD_AMOUNT,
  AutoRechargePref.JSON_PROPERTY_RECHARGE_AMOUNT,
  AutoRechargePref.JSON_PROPERTY_ENABLED,
  AutoRechargePref.JSON_PROPERTY_INVOICE_ENABLED,
  AutoRechargePref.JSON_PROPERTY_PREFERENCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class AutoRechargePref {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public static final String JSON_PROPERTY_THRESHOLD_AMOUNT = "threshold_amount";
  private BigDecimal thresholdAmount;

  public static final String JSON_PROPERTY_RECHARGE_AMOUNT = "recharge_amount";
  private BigDecimal rechargeAmount;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_INVOICE_ENABLED = "invoice_enabled";
  private Boolean invoiceEnabled;

  /**
   * The payment preference for auto recharge.
   */
  public enum PreferenceEnum {
    CREDIT_PAYPAL("credit_paypal"),
    
    ACH("ach");

    private String value;

    PreferenceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PreferenceEnum fromValue(String value) {
      for (PreferenceEnum b : PreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PREFERENCE = "preference";
  private PreferenceEnum preference;

  public AutoRechargePref() { 
  }

  public AutoRechargePref id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the auto recharge preference.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1524126400473204723", value = "The unique identifier for the auto recharge preference.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AutoRechargePref recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * The record type.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "auto_recharge_pref", value = "The record type.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }


  public AutoRechargePref thresholdAmount(BigDecimal thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
    return this;
  }

   /**
   * The threshold amount at which the account will be recharged.
   * @return thresholdAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "104.00", value = "The threshold amount at which the account will be recharged.")
  @JsonProperty(JSON_PROPERTY_THRESHOLD_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getThresholdAmount() {
    return thresholdAmount;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdAmount(BigDecimal thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
  }


  public AutoRechargePref rechargeAmount(BigDecimal rechargeAmount) {
    this.rechargeAmount = rechargeAmount;
    return this;
  }

   /**
   * The amount to recharge the account, the actual recharge amount will be the amount necessary to reach the threshold amount plus the recharge amount.
   * @return rechargeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "104.00", value = "The amount to recharge the account, the actual recharge amount will be the amount necessary to reach the threshold amount plus the recharge amount.")
  @JsonProperty(JSON_PROPERTY_RECHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRechargeAmount() {
    return rechargeAmount;
  }


  @JsonProperty(JSON_PROPERTY_RECHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRechargeAmount(BigDecimal rechargeAmount) {
    this.rechargeAmount = rechargeAmount;
  }


  public AutoRechargePref enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether auto recharge is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Whether auto recharge is enabled.")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public AutoRechargePref invoiceEnabled(Boolean invoiceEnabled) {
    this.invoiceEnabled = invoiceEnabled;
    return this;
  }

   /**
   * Get invoiceEnabled
   * @return invoiceEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInvoiceEnabled() {
    return invoiceEnabled;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceEnabled(Boolean invoiceEnabled) {
    this.invoiceEnabled = invoiceEnabled;
  }


  public AutoRechargePref preference(PreferenceEnum preference) {
    this.preference = preference;
    return this;
  }

   /**
   * The payment preference for auto recharge.
   * @return preference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "credit_paypal", value = "The payment preference for auto recharge.")
  @JsonProperty(JSON_PROPERTY_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PreferenceEnum getPreference() {
    return preference;
  }


  @JsonProperty(JSON_PROPERTY_PREFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreference(PreferenceEnum preference) {
    this.preference = preference;
  }


  /**
   * Return true if this AutoRechargePref object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoRechargePref autoRechargePref = (AutoRechargePref) o;
    return Objects.equals(this.id, autoRechargePref.id) &&
        Objects.equals(this.recordType, autoRechargePref.recordType) &&
        Objects.equals(this.thresholdAmount, autoRechargePref.thresholdAmount) &&
        Objects.equals(this.rechargeAmount, autoRechargePref.rechargeAmount) &&
        Objects.equals(this.enabled, autoRechargePref.enabled) &&
        Objects.equals(this.invoiceEnabled, autoRechargePref.invoiceEnabled) &&
        Objects.equals(this.preference, autoRechargePref.preference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recordType, thresholdAmount, rechargeAmount, enabled, invoiceEnabled, preference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoRechargePref {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    thresholdAmount: ").append(toIndentedString(thresholdAmount)).append("\n");
    sb.append("    rechargeAmount: ").append(toIndentedString(rechargeAmount)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    invoiceEnabled: ").append(toIndentedString(invoiceEnabled)).append("\n");
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
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

