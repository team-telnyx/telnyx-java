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
 * ManagedAccountBalance
 */
@JsonPropertyOrder({
  ManagedAccountBalance.JSON_PROPERTY_RECORD_TYPE,
  ManagedAccountBalance.JSON_PROPERTY_BALANCE,
  ManagedAccountBalance.JSON_PROPERTY_CREDIT_LIMIT,
  ManagedAccountBalance.JSON_PROPERTY_AVAILABLE_CREDIT,
  ManagedAccountBalance.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class ManagedAccountBalance {
  /**
   * Identifies the type of the resource.
   */
  public enum RecordTypeEnum {
    BALANCE("balance");

    private String value;

    RecordTypeEnum(String value) {
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
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  public static final String JSON_PROPERTY_BALANCE = "balance";
  private BigDecimal balance;

  public static final String JSON_PROPERTY_CREDIT_LIMIT = "credit_limit";
  private BigDecimal creditLimit;

  public static final String JSON_PROPERTY_AVAILABLE_CREDIT = "available_credit";
  private BigDecimal availableCredit;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public ManagedAccountBalance() { 
  }

  public ManagedAccountBalance recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "balance", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public ManagedAccountBalance balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The account&#39;s current balance.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "300.00", value = "The account's current balance.")
  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBalance() {
    return balance;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public ManagedAccountBalance creditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

   /**
   * The account&#39;s credit limit.
   * @return creditLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "The account's credit limit.")
  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCreditLimit() {
    return creditLimit;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditLimit(BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }


  public ManagedAccountBalance availableCredit(BigDecimal availableCredit) {
    this.availableCredit = availableCredit;
    return this;
  }

   /**
   * Available amount to spend (balance + credit limit)
   * @return availableCredit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "400.00", value = "Available amount to spend (balance + credit limit)")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAvailableCredit() {
    return availableCredit;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_CREDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailableCredit(BigDecimal availableCredit) {
    this.availableCredit = availableCredit;
  }


  public ManagedAccountBalance currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The ISO 4217 currency identifier.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The ISO 4217 currency identifier.")
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
   * Return true if this ManagedAccountBalance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagedAccountBalance managedAccountBalance = (ManagedAccountBalance) o;
    return Objects.equals(this.recordType, managedAccountBalance.recordType) &&
        Objects.equals(this.balance, managedAccountBalance.balance) &&
        Objects.equals(this.creditLimit, managedAccountBalance.creditLimit) &&
        Objects.equals(this.availableCredit, managedAccountBalance.availableCredit) &&
        Objects.equals(this.currency, managedAccountBalance.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, balance, creditLimit, availableCredit, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagedAccountBalance {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    availableCredit: ").append(toIndentedString(availableCredit)).append("\n");
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

