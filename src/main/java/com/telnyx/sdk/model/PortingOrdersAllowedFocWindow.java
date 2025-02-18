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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PortingOrdersAllowedFocWindow
 */
@JsonPropertyOrder(
    {
        PortingOrdersAllowedFocWindow.JSON_PROPERTY_STARTED_AT,
        PortingOrdersAllowedFocWindow.JSON_PROPERTY_ENDED_AT,
        PortingOrdersAllowedFocWindow.JSON_PROPERTY_RECORD_TYPE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PortingOrdersAllowedFocWindow {

    public static final String JSON_PROPERTY_STARTED_AT = "started_at";
    private OffsetDateTime startedAt;

    public static final String JSON_PROPERTY_ENDED_AT = "ended_at";
    private OffsetDateTime endedAt;

    public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
    private String recordType;

    public PortingOrdersAllowedFocWindow() {}

    @JsonCreator
    public PortingOrdersAllowedFocWindow(
        @JsonProperty(JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt,
        @JsonProperty(JSON_PROPERTY_ENDED_AT) OffsetDateTime endedAt,
        @JsonProperty(JSON_PROPERTY_RECORD_TYPE) String recordType
    ) {
        this();
        this.startedAt = startedAt;
        this.endedAt = endedAt;
        this.recordType = recordType;
    }

    /**
     * ISO 8601 formatted date indicating the start of the range of foc window.
     * @return startedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating the start of the range of foc window."
    )
    @JsonProperty(JSON_PROPERTY_STARTED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    /**
     * ISO 8601 formatted date indicating the end of the range of foc window
     * @return endedAt
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted date indicating the end of the range of foc window"
    )
    @JsonProperty(JSON_PROPERTY_ENDED_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getEndedAt() {
        return endedAt;
    }

    /**
     * Identifies the type of the resource.
     * @return recordType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "porting_order",
        value = "Identifies the type of the resource."
    )
    @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRecordType() {
        return recordType;
    }

    /**
     * Return true if this PortingOrdersAllowedFocWindow object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PortingOrdersAllowedFocWindow portingOrdersAllowedFocWindow =
            (PortingOrdersAllowedFocWindow) o;
        return (
            Objects.equals(
                this.startedAt,
                portingOrdersAllowedFocWindow.startedAt
            ) &&
            Objects.equals(
                this.endedAt,
                portingOrdersAllowedFocWindow.endedAt
            ) &&
            Objects.equals(
                this.recordType,
                portingOrdersAllowedFocWindow.recordType
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(startedAt, endedAt, recordType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PortingOrdersAllowedFocWindow {\n");
        sb
            .append("    startedAt: ")
            .append(toIndentedString(startedAt))
            .append("\n");
        sb
            .append("    endedAt: ")
            .append(toIndentedString(endedAt))
            .append("\n");
        sb
            .append("    recordType: ")
            .append(toIndentedString(recordType))
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
