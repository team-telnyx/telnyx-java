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
import com.telnyx.sdk.model.BrandBasic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * BrandRecordSetCSP
 */
@JsonPropertyOrder(
    {
        BrandRecordSetCSP.JSON_PROPERTY_RECORDS,
        BrandRecordSetCSP.JSON_PROPERTY_PAGE,
        BrandRecordSetCSP.JSON_PROPERTY_TOTAL_RECORDS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class BrandRecordSetCSP {

    public static final String JSON_PROPERTY_RECORDS = "records";
    private List<BrandBasic> records = null;

    public static final String JSON_PROPERTY_PAGE = "page";
    private Integer page;

    public static final String JSON_PROPERTY_TOTAL_RECORDS = "totalRecords";
    private Integer totalRecords;

    public BrandRecordSetCSP() {}

    public BrandRecordSetCSP records(List<BrandBasic> records) {
        this.records = records;
        return this;
    }

    public BrandRecordSetCSP addrecordsItem(BrandBasic recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    /**
     * Get records
     * @return records
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RECORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<BrandBasic> getRecords() {
        return records;
    }

    @JsonProperty(JSON_PROPERTY_RECORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecords(List<BrandBasic> records) {
        this.records = records;
    }

    public BrandRecordSetCSP page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Get page
     * @return page
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "1", value = "")
    @JsonProperty(JSON_PROPERTY_PAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPage() {
        return page;
    }

    @JsonProperty(JSON_PROPERTY_PAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPage(Integer page) {
        this.page = page;
    }

    public BrandRecordSetCSP totalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * Get totalRecords
     * @return totalRecords
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(example = "1", value = "")
    @JsonProperty(JSON_PROPERTY_TOTAL_RECORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getTotalRecords() {
        return totalRecords;
    }

    @JsonProperty(JSON_PROPERTY_TOTAL_RECORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    /**
     * Return true if this BrandRecordSetCSP object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrandRecordSetCSP brandRecordSetCSP = (BrandRecordSetCSP) o;
        return (
            Objects.equals(this.records, brandRecordSetCSP.records) &&
            Objects.equals(this.page, brandRecordSetCSP.page) &&
            Objects.equals(this.totalRecords, brandRecordSetCSP.totalRecords)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, page, totalRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandRecordSetCSP {\n");
        sb
            .append("    records: ")
            .append(toIndentedString(records))
            .append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb
            .append("    totalRecords: ")
            .append(toIndentedString(totalRecords))
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
