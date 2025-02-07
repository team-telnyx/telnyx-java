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
 * WdrReportRequest
 */
@JsonPropertyOrder(
    {
        WdrReportRequest.JSON_PROPERTY_START_TIME,
        WdrReportRequest.JSON_PROPERTY_END_TIME,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class WdrReportRequest {

    public static final String JSON_PROPERTY_START_TIME = "start_time";
    private String startTime;

    public static final String JSON_PROPERTY_END_TIME = "end_time";
    private String endTime;

    public WdrReportRequest() {}

    public WdrReportRequest startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * ISO 8601 formatted date-time indicating the start time.
     * @return startTime
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating the start time."
    )
    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public WdrReportRequest endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * ISO 8601 formatted date-time indicating the end time.
     * @return endTime
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2018-02-02T22:25:27.521Z",
        value = "ISO 8601 formatted date-time indicating the end time."
    )
    @JsonProperty(JSON_PROPERTY_END_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty(JSON_PROPERTY_END_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * Return true if this WdrReportRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WdrReportRequest wdrReportRequest = (WdrReportRequest) o;
        return (
            Objects.equals(this.startTime, wdrReportRequest.startTime) &&
            Objects.equals(this.endTime, wdrReportRequest.endTime)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WdrReportRequest {\n");
        sb
            .append("    startTime: ")
            .append(toIndentedString(startTime))
            .append("\n");
        sb
            .append("    endTime: ")
            .append(toIndentedString(endTime))
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
