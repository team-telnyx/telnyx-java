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
 * SIMCardActionStatus
 */
@JsonPropertyOrder(
    {
        SIMCardActionStatus.JSON_PROPERTY_VALUE,
        SIMCardActionStatus.JSON_PROPERTY_REASON,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCardActionStatus {

    /**
     * The current status of the SIM card action.
     */
    public enum ValueEnum {
        IN_PROGRESS(String.valueOf("in-progress")),

        COMPLETED(String.valueOf("completed")),

        FAILED(String.valueOf("failed")),

        INTERRUPTED(String.valueOf("interrupted"));

        private String value;

        ValueEnum(String value) {
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
        public static ValueEnum fromValue(String value) {
            for (ValueEnum b : ValueEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_VALUE = "value";
    private ValueEnum value;

    public static final String JSON_PROPERTY_REASON = "reason";
    private String reason;

    public SIMCardActionStatus() {}

    @JsonCreator
    public SIMCardActionStatus(
        @JsonProperty(JSON_PROPERTY_VALUE) ValueEnum value,
        @JsonProperty(JSON_PROPERTY_REASON) String reason
    ) {
        this();
        this.value = value;
        this.reason = reason;
    }

    /**
     * The current status of the SIM card action.
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "completed",
        value = "The current status of the SIM card action."
    )
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ValueEnum getValue() {
        return value;
    }

    /**
     * It describes why the SIM card action is in the current status. This will be &lt;code&gt;null&lt;/code&gt; for self-explanatory statuses, such as &lt;code&gt;in-progress&lt;/code&gt; and &lt;code&gt;completed&lt;/code&gt; but will include further information on statuses like &lt;code&gt;interrupted&lt;/code&gt; and &lt;code&gt;failed&lt;/code&gt;.
     * @return reason
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "The data limit was exceeded.",
        value = "It describes why the SIM card action is in the current status. This will be <code>null</code> for self-explanatory statuses, such as <code>in-progress</code> and <code>completed</code> but will include further information on statuses like <code>interrupted</code> and <code>failed</code>."
    )
    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getReason() {
        return reason;
    }

    /**
     * Return true if this SIMCardAction_status object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardActionStatus siMCardActionStatus = (SIMCardActionStatus) o;
        return (
            Objects.equals(this.value, siMCardActionStatus.value) &&
            Objects.equals(this.reason, siMCardActionStatus.reason)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardActionStatus {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
