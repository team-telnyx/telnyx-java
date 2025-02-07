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
import com.telnyx.sdk.model.TelnyxDownstreamCampaign;
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
 * TelnyxDownstreamCampaignRecordSet
 */
@JsonPropertyOrder(
    {
        TelnyxDownstreamCampaignRecordSet.JSON_PROPERTY_RECORDS,
        TelnyxDownstreamCampaignRecordSet.JSON_PROPERTY_PAGE,
        TelnyxDownstreamCampaignRecordSet.JSON_PROPERTY_TOTAL_RECORDS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class TelnyxDownstreamCampaignRecordSet {

    public static final String JSON_PROPERTY_RECORDS = "records";
    private List<TelnyxDownstreamCampaign> records = null;

    public static final String JSON_PROPERTY_PAGE = "page";
    private Integer page;

    public static final String JSON_PROPERTY_TOTAL_RECORDS = "totalRecords";
    private Integer totalRecords;

    public TelnyxDownstreamCampaignRecordSet() {}

    public TelnyxDownstreamCampaignRecordSet records(
        List<TelnyxDownstreamCampaign> records
    ) {
        this.records = records;
        return this;
    }

    public TelnyxDownstreamCampaignRecordSet addrecordsItem(
        TelnyxDownstreamCampaign recordsItem
    ) {
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
    public List<TelnyxDownstreamCampaign> getRecords() {
        return records;
    }

    @JsonProperty(JSON_PROPERTY_RECORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecords(List<TelnyxDownstreamCampaign> records) {
        this.records = records;
    }

    public TelnyxDownstreamCampaignRecordSet page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Get page
     * @return page
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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

    public TelnyxDownstreamCampaignRecordSet totalRecords(
        Integer totalRecords
    ) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * Get totalRecords
     * @return totalRecords
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
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
     * Return true if this TelnyxDownstreamCampaignRecordSet object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TelnyxDownstreamCampaignRecordSet telnyxDownstreamCampaignRecordSet =
            (TelnyxDownstreamCampaignRecordSet) o;
        return (
            Objects.equals(
                this.records,
                telnyxDownstreamCampaignRecordSet.records
            ) &&
            Objects.equals(this.page, telnyxDownstreamCampaignRecordSet.page) &&
            Objects.equals(
                this.totalRecords,
                telnyxDownstreamCampaignRecordSet.totalRecords
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, page, totalRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TelnyxDownstreamCampaignRecordSet {\n");
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
