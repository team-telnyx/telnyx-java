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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * CustomerServiceRecordPhoneNumberCoverage
 */
@JsonPropertyOrder({
  CustomerServiceRecordPhoneNumberCoverage.JSON_PROPERTY_PHONE_NUMBER,
  CustomerServiceRecordPhoneNumberCoverage.JSON_PROPERTY_HAS_CSR_COVERAGE,
  CustomerServiceRecordPhoneNumberCoverage.JSON_PROPERTY_REASON,
  CustomerServiceRecordPhoneNumberCoverage.JSON_PROPERTY_ADDITIONAL_DATA_REQUIRED,
  CustomerServiceRecordPhoneNumberCoverage.JSON_PROPERTY_RECORD_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.4.0")
public class CustomerServiceRecordPhoneNumberCoverage {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_HAS_CSR_COVERAGE = "has_csr_coverage";
  private Boolean hasCsrCoverage;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  /**
   * Gets or Sets additionalDataRequired
   */
  public enum AdditionalDataRequiredEnum {
    NAME("name"),
    
    AUTHORIZED_PERSON_NAME("authorized_person_name"),
    
    ACCOUNT_NUMBER("account_number"),
    
    CUSTOMER_CODE("customer_code"),
    
    PIN("pin"),
    
    ADDRESS_LINE_1("address_line_1"),
    
    CITY("city"),
    
    STATE("state"),
    
    ZIP_CODE("zip_code"),
    
    BILLING_PHONE_NUMBER("billing_phone_number");

    private String value;

    AdditionalDataRequiredEnum(String value) {
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
    public static AdditionalDataRequiredEnum fromValue(String value) {
      for (AdditionalDataRequiredEnum b : AdditionalDataRequiredEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADDITIONAL_DATA_REQUIRED = "additional_data_required";
  private List<AdditionalDataRequiredEnum> additionalDataRequired = null;

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  public CustomerServiceRecordPhoneNumberCoverage() { 
  }

  public CustomerServiceRecordPhoneNumberCoverage phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number that is being verified.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "+12223334444", value = "The phone number that is being verified.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public CustomerServiceRecordPhoneNumberCoverage hasCsrCoverage(Boolean hasCsrCoverage) {
    this.hasCsrCoverage = hasCsrCoverage;
    return this;
  }

   /**
   * Indicates whether the phone number is covered or not.
   * @return hasCsrCoverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates whether the phone number is covered or not.")
  @JsonProperty(JSON_PROPERTY_HAS_CSR_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasCsrCoverage() {
    return hasCsrCoverage;
  }


  @JsonProperty(JSON_PROPERTY_HAS_CSR_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasCsrCoverage(Boolean hasCsrCoverage) {
    this.hasCsrCoverage = hasCsrCoverage;
  }


  public CustomerServiceRecordPhoneNumberCoverage reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason why the phone number is not covered. Only returned if &#x60;has_csr_coverage&#x60; is false.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The phone number '+19999999999' is invalid.", value = "The reason why the phone number is not covered. Only returned if `has_csr_coverage` is false.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public CustomerServiceRecordPhoneNumberCoverage additionalDataRequired(List<AdditionalDataRequiredEnum> additionalDataRequired) {
    this.additionalDataRequired = additionalDataRequired;
    return this;
  }

  public CustomerServiceRecordPhoneNumberCoverage addAdditionalDataRequiredItem(AdditionalDataRequiredEnum additionalDataRequiredItem) {
    if (this.additionalDataRequired == null) {
      this.additionalDataRequired = new ArrayList<>();
    }
    this.additionalDataRequired.add(additionalDataRequiredItem);
    return this;
  }

   /**
   * Additional data required to perform CSR for the phone number. Only returned if &#x60;has_csr_coverage&#x60; is true.
   * @return additionalDataRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional data required to perform CSR for the phone number. Only returned if `has_csr_coverage` is true.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdditionalDataRequiredEnum> getAdditionalDataRequired() {
    return additionalDataRequired;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalDataRequired(List<AdditionalDataRequiredEnum> additionalDataRequired) {
    this.additionalDataRequired = additionalDataRequired;
  }


  public CustomerServiceRecordPhoneNumberCoverage recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "customer_service_record_phone_number_coverage", value = "Identifies the type of the resource.")
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


  /**
   * Return true if this CustomerServiceRecordPhoneNumberCoverage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerServiceRecordPhoneNumberCoverage customerServiceRecordPhoneNumberCoverage = (CustomerServiceRecordPhoneNumberCoverage) o;
    return Objects.equals(this.phoneNumber, customerServiceRecordPhoneNumberCoverage.phoneNumber) &&
        Objects.equals(this.hasCsrCoverage, customerServiceRecordPhoneNumberCoverage.hasCsrCoverage) &&
        Objects.equals(this.reason, customerServiceRecordPhoneNumberCoverage.reason) &&
        Objects.equals(this.additionalDataRequired, customerServiceRecordPhoneNumberCoverage.additionalDataRequired) &&
        Objects.equals(this.recordType, customerServiceRecordPhoneNumberCoverage.recordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, hasCsrCoverage, reason, additionalDataRequired, recordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerServiceRecordPhoneNumberCoverage {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    hasCsrCoverage: ").append(toIndentedString(hasCsrCoverage)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    additionalDataRequired: ").append(toIndentedString(additionalDataRequired)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

