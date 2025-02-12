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
import com.telnyx.sdk.model.CreatePortoutReportRequestParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The parameters for generating a new port-out related report.
 */
@ApiModel(
    description = "The parameters for generating a new port-out related report."
)
@JsonPropertyOrder(
    {
        CreatePortoutReportRequest.JSON_PROPERTY_REPORT_TYPE,
        CreatePortoutReportRequest.JSON_PROPERTY_PARAMS,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreatePortoutReportRequest {

    /**
     * Identifies the type of report
     */
    public enum ReportTypeEnum {
        EXPORT_PORTOUTS_CSV(String.valueOf("export_portouts_csv"));

        private String value;

        ReportTypeEnum(String value) {
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
        public static ReportTypeEnum fromValue(String value) {
            for (ReportTypeEnum b : ReportTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_REPORT_TYPE = "report_type";
    private ReportTypeEnum reportType;

    public static final String JSON_PROPERTY_PARAMS = "params";
    private CreatePortoutReportRequestParams params;

    public CreatePortoutReportRequest() {}

    public CreatePortoutReportRequest reportType(ReportTypeEnum reportType) {
        this.reportType = reportType;
        return this;
    }

    /**
     * Identifies the type of report
     * @return reportType
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "export_portouts_csv",
        required = true,
        value = "Identifies the type of report"
    )
    @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public ReportTypeEnum getReportType() {
        return reportType;
    }

    @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setReportType(ReportTypeEnum reportType) {
        this.reportType = reportType;
    }

    public CreatePortoutReportRequest params(
        CreatePortoutReportRequestParams params
    ) {
        this.params = params;
        return this;
    }

    /**
     * Get params
     * @return params
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreatePortoutReportRequestParams getParams() {
        return params;
    }

    @JsonProperty(JSON_PROPERTY_PARAMS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setParams(CreatePortoutReportRequestParams params) {
        this.params = params;
    }

    /**
     * Return true if this CreatePortoutReport_request object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePortoutReportRequest createPortoutReportRequest =
            (CreatePortoutReportRequest) o;
        return (
            Objects.equals(
                this.reportType,
                createPortoutReportRequest.reportType
            ) &&
            Objects.equals(this.params, createPortoutReportRequest.params)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportType, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePortoutReportRequest {\n");
        sb
            .append("    reportType: ")
            .append(toIndentedString(reportType))
            .append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
