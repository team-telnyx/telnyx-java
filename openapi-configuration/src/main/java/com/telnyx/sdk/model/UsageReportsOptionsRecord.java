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
import com.telnyx.sdk.model.RecordType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * An object following one of the schemas published in https://developers.telnyx.com/docs/api/v2/detail-records
 */
@ApiModel(description = "An object following one of the schemas published in https://developers.telnyx.com/docs/api/v2/detail-records")
@JsonPropertyOrder({
  UsageReportsOptionsRecord.JSON_PROPERTY_PRODUCT,
  UsageReportsOptionsRecord.JSON_PROPERTY_PRODUCT_DIMENSIONS,
  UsageReportsOptionsRecord.JSON_PROPERTY_PRODUCT_METRICS,
  UsageReportsOptionsRecord.JSON_PROPERTY_RECORD_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class UsageReportsOptionsRecord {
  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_PRODUCT_DIMENSIONS = "product_dimensions";
  private List<String> productDimensions = null;

  public static final String JSON_PROPERTY_PRODUCT_METRICS = "product_metrics";
  private List<String> productMetrics = null;

  public static final String JSON_PROPERTY_RECORD_TYPES = "record_types";
  private List<RecordType> recordTypes = null;

  public UsageReportsOptionsRecord() { 
  }

  public UsageReportsOptionsRecord product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Telnyx Product
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wireless", value = "Telnyx Product")
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProduct() {
    return product;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(String product) {
    this.product = product;
  }


  public UsageReportsOptionsRecord productDimensions(List<String> productDimensions) {
    this.productDimensions = productDimensions;
    return this;
  }

  public UsageReportsOptionsRecord addproductDimensionsItem(String productDimensionsItem) {
    if (this.productDimensions == null) {
      this.productDimensions = new ArrayList<>();
    }
    this.productDimensions.add(productDimensionsItem);
    return this;
  }

   /**
   * Telnyx Product Dimensions
   * @return productDimensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "['mnc', 'mcc', 'sim_card_id', 'sim_group_name']", value = "Telnyx Product Dimensions")
  @JsonProperty(JSON_PROPERTY_PRODUCT_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProductDimensions() {
    return productDimensions;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductDimensions(List<String> productDimensions) {
    this.productDimensions = productDimensions;
  }


  public UsageReportsOptionsRecord productMetrics(List<String> productMetrics) {
    this.productMetrics = productMetrics;
    return this;
  }

  public UsageReportsOptionsRecord addproductMetricsItem(String productMetricsItem) {
    if (this.productMetrics == null) {
      this.productMetrics = new ArrayList<>();
    }
    this.productMetrics.add(productMetricsItem);
    return this;
  }

   /**
   * Telnyx Product Metrics
   * @return productMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "['uplink_data_bytes','downlink_data','downlink_data_bytes','uplink_data','data_cost']", value = "Telnyx Product Metrics")
  @JsonProperty(JSON_PROPERTY_PRODUCT_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProductMetrics() {
    return productMetrics;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductMetrics(List<String> productMetrics) {
    this.productMetrics = productMetrics;
  }


  public UsageReportsOptionsRecord recordTypes(List<RecordType> recordTypes) {
    this.recordTypes = recordTypes;
    return this;
  }

  public UsageReportsOptionsRecord addrecordTypesItem(RecordType recordTypesItem) {
    if (this.recordTypes == null) {
      this.recordTypes = new ArrayList<>();
    }
    this.recordTypes.add(recordTypesItem);
    return this;
  }

   /**
   * Subproducts if applicable
   * @return recordTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "null", value = "Subproducts if applicable")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RecordType> getRecordTypes() {
    return recordTypes;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecordTypes(List<RecordType> recordTypes) {
    this.recordTypes = recordTypes;
  }


  /**
   * Return true if this UsageReportsOptionsRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageReportsOptionsRecord usageReportsOptionsRecord = (UsageReportsOptionsRecord) o;
    return Objects.equals(this.product, usageReportsOptionsRecord.product) &&
        Objects.equals(this.productDimensions, usageReportsOptionsRecord.productDimensions) &&
        Objects.equals(this.productMetrics, usageReportsOptionsRecord.productMetrics) &&
        Objects.equals(this.recordTypes, usageReportsOptionsRecord.recordTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, productDimensions, productMetrics, recordTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageReportsOptionsRecord {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productDimensions: ").append(toIndentedString(productDimensions)).append("\n");
    sb.append("    productMetrics: ").append(toIndentedString(productMetrics)).append("\n");
    sb.append("    recordTypes: ").append(toIndentedString(recordTypes)).append("\n");
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

