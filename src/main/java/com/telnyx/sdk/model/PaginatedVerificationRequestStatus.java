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
import com.telnyx.sdk.model.VerificationRequestStatus;
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
 * A paginated response
 */
@ApiModel(description = "A paginated response")
@JsonPropertyOrder(
    {
        PaginatedVerificationRequestStatus.JSON_PROPERTY_RECORDS,
        PaginatedVerificationRequestStatus.JSON_PROPERTY_TOTAL_RECORDS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PaginatedVerificationRequestStatus {

    public static final String JSON_PROPERTY_RECORDS = "records";
    private List<VerificationRequestStatus> records = null;

    public static final String JSON_PROPERTY_TOTAL_RECORDS = "total_records";
    private Integer totalRecords = 0;

    public PaginatedVerificationRequestStatus() {}

    public PaginatedVerificationRequestStatus records(
        List<VerificationRequestStatus> records
    ) {
        this.records = records;
        return this;
    }

    public PaginatedVerificationRequestStatus addrecordsItem(
        VerificationRequestStatus recordsItem
    ) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    /**
     * The records yielded by this request
     * @return records
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "The records yielded by this request")
    @JsonProperty(JSON_PROPERTY_RECORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<VerificationRequestStatus> getRecords() {
        return records;
    }

    @JsonProperty(JSON_PROPERTY_RECORDS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRecords(List<VerificationRequestStatus> records) {
        this.records = records;
    }

    public PaginatedVerificationRequestStatus totalRecords(
        Integer totalRecords
    ) {
        this.totalRecords = totalRecords;
        return this;
    }

    /**
     * The total amount of records for these query parameters
     * @return totalRecords
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The total amount of records for these query parameters"
    )
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
     * Return true if this Paginated_VerificationRequestStatus_ object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaginatedVerificationRequestStatus paginatedVerificationRequestStatus =
            (PaginatedVerificationRequestStatus) o;
        return (
            Objects.equals(
                this.records,
                paginatedVerificationRequestStatus.records
            ) &&
            Objects.equals(
                this.totalRecords,
                paginatedVerificationRequestStatus.totalRecords
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(records, totalRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaginatedVerificationRequestStatus {\n");
        sb
            .append("    records: ")
            .append(toIndentedString(records))
            .append("\n");
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
