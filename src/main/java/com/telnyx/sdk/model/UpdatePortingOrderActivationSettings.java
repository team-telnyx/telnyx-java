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
 * UpdatePortingOrderActivationSettings
 */
@JsonPropertyOrder(
    {
        UpdatePortingOrderActivationSettings.JSON_PROPERTY_FOC_DATETIME_REQUESTED,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdatePortingOrderActivationSettings {

    public static final String JSON_PROPERTY_FOC_DATETIME_REQUESTED =
        "foc_datetime_requested";
    private OffsetDateTime focDatetimeRequested;

    public UpdatePortingOrderActivationSettings() {}

    public UpdatePortingOrderActivationSettings focDatetimeRequested(
        OffsetDateTime focDatetimeRequested
    ) {
        this.focDatetimeRequested = focDatetimeRequested;
        return this;
    }

    /**
     * ISO 8601 formatted Date/Time requested for the FOC date
     * @return focDatetimeRequested
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "2021-03-19T10:07:15.527Z",
        value = "ISO 8601 formatted Date/Time requested for the FOC date"
    )
    @JsonProperty(JSON_PROPERTY_FOC_DATETIME_REQUESTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OffsetDateTime getFocDatetimeRequested() {
        return focDatetimeRequested;
    }

    @JsonProperty(JSON_PROPERTY_FOC_DATETIME_REQUESTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFocDatetimeRequested(OffsetDateTime focDatetimeRequested) {
        this.focDatetimeRequested = focDatetimeRequested;
    }

    /**
     * Return true if this UpdatePortingOrder_activation_settings object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePortingOrderActivationSettings updatePortingOrderActivationSettings =
            (UpdatePortingOrderActivationSettings) o;
        return Objects.equals(
            this.focDatetimeRequested,
            updatePortingOrderActivationSettings.focDatetimeRequested
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(focDatetimeRequested);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortingOrderActivationSettings {\n");
        sb
            .append("    focDatetimeRequested: ")
            .append(toIndentedString(focDatetimeRequested))
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
