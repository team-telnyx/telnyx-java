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
import com.telnyx.sdk.model.ExportPortoutsCSVReportFilters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The parameters for generating a port-outs CSV report.
 */
@ApiModel(description = "The parameters for generating a port-outs CSV report.")
@JsonPropertyOrder({ ExportPortoutsCSVReport.JSON_PROPERTY_FILTERS })
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class ExportPortoutsCSVReport {

    public static final String JSON_PROPERTY_FILTERS = "filters";
    private ExportPortoutsCSVReportFilters filters;

    public ExportPortoutsCSVReport() {}

    public ExportPortoutsCSVReport filters(
        ExportPortoutsCSVReportFilters filters
    ) {
        this.filters = filters;
        return this;
    }

    /**
     * Get filters
     * @return filters
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_FILTERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ExportPortoutsCSVReportFilters getFilters() {
        return filters;
    }

    @JsonProperty(JSON_PROPERTY_FILTERS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFilters(ExportPortoutsCSVReportFilters filters) {
        this.filters = filters;
    }

    /**
     * Return true if this ExportPortoutsCSVReport object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExportPortoutsCSVReport exportPortoutsCSVReport =
            (ExportPortoutsCSVReport) o;
        return Objects.equals(this.filters, exportPortoutsCSVReport.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportPortoutsCSVReport {\n");
        sb
            .append("    filters: ")
            .append(toIndentedString(filters))
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
