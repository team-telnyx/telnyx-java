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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.telnyx.sdk.JSON;


/**
 * CustomerServiceRecordAdditionalData
 */
@JsonPropertyOrder({
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_NAME,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_AUTHORIZED_PERSON_NAME,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_PIN,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_ACCOUNT_NUMBER,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_CUSTOMER_CODE,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_ADDRESS_LINE1,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_CITY,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_STATE,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_ZIP_CODE,
  CustomerServiceRecordAdditionalData.JSON_PROPERTY_BILLING_PHONE_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CustomerServiceRecordAdditionalData {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_AUTHORIZED_PERSON_NAME = "authorized_person_name";
  private String authorizedPersonName;

  public static final String JSON_PROPERTY_PIN = "pin";
  private String pin;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "account_number";
  private String accountNumber;

  public static final String JSON_PROPERTY_CUSTOMER_CODE = "customer_code";
  private String customerCode;

  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "address_line_1";
  private String addressLine1;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_ZIP_CODE = "zip_code";
  private String zipCode;

  public static final String JSON_PROPERTY_BILLING_PHONE_NUMBER = "billing_phone_number";
  private String billingPhoneNumber;

  public CustomerServiceRecordAdditionalData() { 
  }

  public CustomerServiceRecordAdditionalData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the administrator of CSR.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Entity Inc.", value = "The name of the administrator of CSR.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CustomerServiceRecordAdditionalData authorizedPersonName(String authorizedPersonName) {
    this.authorizedPersonName = authorizedPersonName;
    return this;
  }

   /**
   * The name of the authorized person.
   * @return authorizedPersonName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John Doe", value = "The name of the authorized person.")
  @JsonProperty(JSON_PROPERTY_AUTHORIZED_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizedPersonName() {
    return authorizedPersonName;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZED_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizedPersonName(String authorizedPersonName) {
    this.authorizedPersonName = authorizedPersonName;
  }


  public CustomerServiceRecordAdditionalData pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * The PIN of the customer service record.
   * @return pin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "The PIN of the customer service record.")
  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPin() {
    return pin;
  }


  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPin(String pin) {
    this.pin = pin;
  }


  public CustomerServiceRecordAdditionalData accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The account number of the customer service record.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "The account number of the customer service record.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public CustomerServiceRecordAdditionalData customerCode(String customerCode) {
    this.customerCode = customerCode;
    return this;
  }

   /**
   * The customer code of the customer service record.
   * @return customerCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "The customer code of the customer service record.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerCode() {
    return customerCode;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerCode(String customerCode) {
    this.customerCode = customerCode;
  }


  public CustomerServiceRecordAdditionalData addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the address of the customer service record.
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123 Main St", value = "The first line of the address of the customer service record.")
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine1() {
    return addressLine1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public CustomerServiceRecordAdditionalData city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city of the customer service record.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New York", value = "The city of the customer service record.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public CustomerServiceRecordAdditionalData state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the customer service record.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NY", value = "The state of the customer service record.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public CustomerServiceRecordAdditionalData zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * The zip code of the customer service record.
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001", value = "The zip code of the customer service record.")
  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZipCode() {
    return zipCode;
  }


  @JsonProperty(JSON_PROPERTY_ZIP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public CustomerServiceRecordAdditionalData billingPhoneNumber(String billingPhoneNumber) {
    this.billingPhoneNumber = billingPhoneNumber;
    return this;
  }

   /**
   * The billing phone number of the customer service record.
   * @return billingPhoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+12065551212", value = "The billing phone number of the customer service record.")
  @JsonProperty(JSON_PROPERTY_BILLING_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingPhoneNumber() {
    return billingPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingPhoneNumber(String billingPhoneNumber) {
    this.billingPhoneNumber = billingPhoneNumber;
  }


  /**
   * Return true if this CustomerServiceRecordAdditionalData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerServiceRecordAdditionalData customerServiceRecordAdditionalData = (CustomerServiceRecordAdditionalData) o;
    return Objects.equals(this.name, customerServiceRecordAdditionalData.name) &&
        Objects.equals(this.authorizedPersonName, customerServiceRecordAdditionalData.authorizedPersonName) &&
        Objects.equals(this.pin, customerServiceRecordAdditionalData.pin) &&
        Objects.equals(this.accountNumber, customerServiceRecordAdditionalData.accountNumber) &&
        Objects.equals(this.customerCode, customerServiceRecordAdditionalData.customerCode) &&
        Objects.equals(this.addressLine1, customerServiceRecordAdditionalData.addressLine1) &&
        Objects.equals(this.city, customerServiceRecordAdditionalData.city) &&
        Objects.equals(this.state, customerServiceRecordAdditionalData.state) &&
        Objects.equals(this.zipCode, customerServiceRecordAdditionalData.zipCode) &&
        Objects.equals(this.billingPhoneNumber, customerServiceRecordAdditionalData.billingPhoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, authorizedPersonName, pin, accountNumber, customerCode, addressLine1, city, state, zipCode, billingPhoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerServiceRecordAdditionalData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    authorizedPersonName: ").append(toIndentedString(authorizedPersonName)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    customerCode: ").append(toIndentedString(customerCode)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    billingPhoneNumber: ").append(toIndentedString(billingPhoneNumber)).append("\n");
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

