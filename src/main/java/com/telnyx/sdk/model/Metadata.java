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
 * Metadata
 */
@JsonPropertyOrder({
  Metadata.JSON_PROPERTY_TOTAL_PAGES,
  Metadata.JSON_PROPERTY_TOTAL_RESULTS,
  Metadata.JSON_PROPERTY_PAGE_NUMBER,
  Metadata.JSON_PROPERTY_PAGE_SIZE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0")
public class Metadata {
  public static final String JSON_PROPERTY_TOTAL_PAGES = "total_pages";
  private Double totalPages;

  public static final String JSON_PROPERTY_TOTAL_RESULTS = "total_results";
  private Double totalResults;

  public static final String JSON_PROPERTY_PAGE_NUMBER = "page_number";
  private Double pageNumber;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Double pageSize;

  public Metadata() { 
  }

  public Metadata totalPages(Double totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages based on pagination settings
   * @return totalPages
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "13", value = "Total number of pages based on pagination settings")
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTotalPages() {
    return totalPages;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPages(Double totalPages) {
    this.totalPages = totalPages;
  }


  public Metadata totalResults(Double totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Total number of results
   * @return totalResults
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "13", value = "Total number of results")
  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTotalResults() {
    return totalResults;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalResults(Double totalResults) {
    this.totalResults = totalResults;
  }


  public Metadata pageNumber(Double pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Current Page based on pagination settings (included when defaults are used.)
   * @return pageNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Current Page based on pagination settings (included when defaults are used.)")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(Double pageNumber) {
    this.pageNumber = pageNumber;
  }


  public Metadata pageSize(Double pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Number of results to return per page based on pagination settings (included when defaults are used.)
   * @return pageSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Number of results to return per page based on pagination settings (included when defaults are used.)")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Double pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * Return true if this Metadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metadata metadata = (Metadata) o;
    return Objects.equals(this.totalPages, metadata.totalPages) &&
        Objects.equals(this.totalResults, metadata.totalResults) &&
        Objects.equals(this.pageNumber, metadata.pageNumber) &&
        Objects.equals(this.pageSize, metadata.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, totalResults, pageNumber, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metadata {\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

