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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The filters to apply to the export porting order CSV report.
 */
@ApiModel(description = "The filters to apply to the export porting order CSV report.")
@JsonPropertyOrder({
  ExportPortingOrdersCSVReportFilters.JSON_PROPERTY_STATUS_IN,
  ExportPortingOrdersCSVReportFilters.JSON_PROPERTY_CUSTOMER_REFERENCE_IN,
  ExportPortingOrdersCSVReportFilters.JSON_PROPERTY_CREATED_AT_LT,
  ExportPortingOrdersCSVReportFilters.JSON_PROPERTY_CREATED_AT_GT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class ExportPortingOrdersCSVReportFilters {
  /**
   * Gets or Sets statusIn
   */
  public enum StatusInEnum {
    DRAFT(String.valueOf("draft")),
    
    IN_PROCESS(String.valueOf("in-process")),
    
    SUBMITTED(String.valueOf("submitted")),
    
    EXCEPTION(String.valueOf("exception")),
    
    FOC_DATE_CONFIRMED(String.valueOf("foc-date-confirmed")),
    
    CANCEL_PENDING(String.valueOf("cancel-pending")),
    
    PORTED(String.valueOf("ported")),
    
    CANCELLED(String.valueOf("cancelled"));

    private String value;

    StatusInEnum(String value) {
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
    public static StatusInEnum fromValue(String value) {
      for (StatusInEnum b : StatusInEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS_IN = "status__in";
  private List<StatusInEnum> statusIn = null;

  public static final String JSON_PROPERTY_CUSTOMER_REFERENCE_IN = "customer_reference__in";
  private List<String> customerReferenceIn = null;

  public static final String JSON_PROPERTY_CREATED_AT_LT = "created_at__lt";
  private OffsetDateTime createdAtLt;

  public static final String JSON_PROPERTY_CREATED_AT_GT = "created_at__gt";
  private OffsetDateTime createdAtGt;

  public ExportPortingOrdersCSVReportFilters() { 
  }

  public ExportPortingOrdersCSVReportFilters statusIn(List<StatusInEnum> statusIn) {
    this.statusIn = statusIn;
    return this;
  }

  public ExportPortingOrdersCSVReportFilters addstatusInItem(StatusInEnum statusInItem) {
    if (this.statusIn == null) {
      this.statusIn = new ArrayList<>();
    }
    this.statusIn.add(statusInItem);
    return this;
  }

   /**
   * The status of the porting orders to include in the report.
   * @return statusIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the porting orders to include in the report.")
  @JsonProperty(JSON_PROPERTY_STATUS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StatusInEnum> getStatusIn() {
    return statusIn;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusIn(List<StatusInEnum> statusIn) {
    this.statusIn = statusIn;
  }


  public ExportPortingOrdersCSVReportFilters customerReferenceIn(List<String> customerReferenceIn) {
    this.customerReferenceIn = customerReferenceIn;
    return this;
  }

  public ExportPortingOrdersCSVReportFilters addcustomerReferenceInItem(String customerReferenceInItem) {
    if (this.customerReferenceIn == null) {
      this.customerReferenceIn = new ArrayList<>();
    }
    this.customerReferenceIn.add(customerReferenceInItem);
    return this;
  }

   /**
   * The customer reference of the porting orders to include in the report.
   * @return customerReferenceIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer reference of the porting orders to include in the report.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCustomerReferenceIn() {
    return customerReferenceIn;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_REFERENCE_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerReferenceIn(List<String> customerReferenceIn) {
    this.customerReferenceIn = customerReferenceIn;
  }


  public ExportPortingOrdersCSVReportFilters createdAtLt(OffsetDateTime createdAtLt) {
    this.createdAtLt = createdAtLt;
    return this;
  }

   /**
   * The date and time the porting order was created before.
   * @return createdAtLt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the porting order was created before.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAtLt() {
    return createdAtLt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_LT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtLt(OffsetDateTime createdAtLt) {
    this.createdAtLt = createdAtLt;
  }


  public ExportPortingOrdersCSVReportFilters createdAtGt(OffsetDateTime createdAtGt) {
    this.createdAtGt = createdAtGt;
    return this;
  }

   /**
   * The date and time the porting order was created after.
   * @return createdAtGt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time the porting order was created after.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAtGt() {
    return createdAtGt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT_GT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAtGt(OffsetDateTime createdAtGt) {
    this.createdAtGt = createdAtGt;
  }


  /**
   * Return true if this ExportPortingOrdersCSVReport_filters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExportPortingOrdersCSVReportFilters exportPortingOrdersCSVReportFilters = (ExportPortingOrdersCSVReportFilters) o;
    return Objects.equals(this.statusIn, exportPortingOrdersCSVReportFilters.statusIn) &&
        Objects.equals(this.customerReferenceIn, exportPortingOrdersCSVReportFilters.customerReferenceIn) &&
        Objects.equals(this.createdAtLt, exportPortingOrdersCSVReportFilters.createdAtLt) &&
        Objects.equals(this.createdAtGt, exportPortingOrdersCSVReportFilters.createdAtGt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusIn, customerReferenceIn, createdAtLt, createdAtGt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportPortingOrdersCSVReportFilters {\n");
    sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
    sb.append("    customerReferenceIn: ").append(toIndentedString(customerReferenceIn)).append("\n");
    sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
    sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
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

