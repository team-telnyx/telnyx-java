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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PaginationData
 */
@JsonPropertyOrder(
    {
        PaginationData.JSON_PROPERTY_TOTAL_PAGES,
        PaginationData.JSON_PROPERTY_TOTAL_RESULTS,
        PaginationData.JSON_PROPERTY_PAGE_NUMBER,
        PaginationData.JSON_PROPERTY_PAGE_SIZE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PaginationData {

    public static final String JSON_PROPERTY_TOTAL_PAGES = "total_pages";
    private Integer totalPages;

    public static final String JSON_PROPERTY_TOTAL_RESULTS = "total_results";
    private Integer totalResults;

    public static final String JSON_PROPERTY_PAGE_NUMBER = "page_number";
    private Integer pageNumber;

    public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
    private Integer pageSize;

    public PaginationData() {}

    public PaginationData totalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Total number of pages.
     * @return totalPages
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "5", value = "Total number of pages.")
    @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public PaginationData totalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    /**
     * Total number of results.
     * @return totalResults
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "100", value = "Total number of results.")
    @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTotalResults() {
        return totalResults;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public PaginationData pageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Selected page number.
     * @return pageNumber
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "1", value = "Selected page number.")
    @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPageNumber() {
        return pageNumber;
    }

    @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public PaginationData pageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Records per single page
     * @return pageSize
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "20", value = "Records per single page")
    @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Return true if this PaginationData object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaginationData paginationData = (PaginationData) o;
        return (
            Objects.equals(this.totalPages, paginationData.totalPages) &&
            Objects.equals(this.totalResults, paginationData.totalResults) &&
            Objects.equals(this.pageNumber, paginationData.pageNumber) &&
            Objects.equals(this.pageSize, paginationData.pageSize)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPages, totalResults, pageNumber, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginationData {\n");
        sb
            .append("    totalPages: ")
            .append(toIndentedString(totalPages))
            .append("\n");
        sb
            .append("    totalResults: ")
            .append(toIndentedString(totalResults))
            .append("\n");
        sb
            .append("    pageNumber: ")
            .append(toIndentedString(pageNumber))
            .append("\n");
        sb
            .append("    pageSize: ")
            .append(toIndentedString(pageSize))
            .append("\n");
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
