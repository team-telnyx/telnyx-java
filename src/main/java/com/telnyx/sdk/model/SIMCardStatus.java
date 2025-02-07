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
 * SIMCardStatus
 */
@JsonPropertyOrder(
    { SIMCardStatus.JSON_PROPERTY_VALUE, SIMCardStatus.JSON_PROPERTY_REASON }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class SIMCardStatus {

    /**
     * The current status of the SIM card. It will be one of the following: &lt;br/&gt; &lt;ul&gt;  &lt;li&gt;&lt;code&gt;registering&lt;/code&gt; - the card is being registered&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enabling&lt;/code&gt; - the card is being enabled&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enabled&lt;/code&gt; - the card is enabled and ready for use&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disabling&lt;/code&gt; - the card is being disabled&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disabled&lt;/code&gt; - the card has been disabled and cannot be used&lt;/li&gt;  &lt;li&gt;&lt;code&gt;data_limit_exceeded&lt;/code&gt; - the card has exceeded its data consumption limit&lt;/li&gt;  &lt;li&gt;&lt;code&gt;setting_standby&lt;/code&gt; - the process to set the card in stand by is in progress&lt;/li&gt;  &lt;li&gt;&lt;code&gt;standby&lt;/code&gt; - the card is in stand by&lt;/li&gt; &lt;/ul&gt; Transitioning between the enabled and disabled states may take a period of time.
     */
    public enum ValueEnum {
        REGISTERING(String.valueOf("registering")),

        ENABLING(String.valueOf("enabling")),

        ENABLED(String.valueOf("enabled")),

        DISABLING(String.valueOf("disabling")),

        DISABLED(String.valueOf("disabled")),

        DATA_LIMIT_EXCEEDED(String.valueOf("data_limit_exceeded")),

        SETTING_STANDBY(String.valueOf("setting_standby")),

        STANDBY(String.valueOf("standby"));

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

    public SIMCardStatus() {}

    @JsonCreator
    public SIMCardStatus(
        @JsonProperty(JSON_PROPERTY_VALUE) ValueEnum value,
        @JsonProperty(JSON_PROPERTY_REASON) String reason
    ) {
        this();
        this.value = value;
        this.reason = reason;
    }

    /**
     * The current status of the SIM card. It will be one of the following: &lt;br/&gt; &lt;ul&gt;  &lt;li&gt;&lt;code&gt;registering&lt;/code&gt; - the card is being registered&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enabling&lt;/code&gt; - the card is being enabled&lt;/li&gt;  &lt;li&gt;&lt;code&gt;enabled&lt;/code&gt; - the card is enabled and ready for use&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disabling&lt;/code&gt; - the card is being disabled&lt;/li&gt;  &lt;li&gt;&lt;code&gt;disabled&lt;/code&gt; - the card has been disabled and cannot be used&lt;/li&gt;  &lt;li&gt;&lt;code&gt;data_limit_exceeded&lt;/code&gt; - the card has exceeded its data consumption limit&lt;/li&gt;  &lt;li&gt;&lt;code&gt;setting_standby&lt;/code&gt; - the process to set the card in stand by is in progress&lt;/li&gt;  &lt;li&gt;&lt;code&gt;standby&lt;/code&gt; - the card is in stand by&lt;/li&gt; &lt;/ul&gt; Transitioning between the enabled and disabled states may take a period of time.
     * @return value
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "enabled",
        value = "The current status of the SIM card. It will be one of the following: <br/> <ul>  <li><code>registering</code> - the card is being registered</li>  <li><code>enabling</code> - the card is being enabled</li>  <li><code>enabled</code> - the card is enabled and ready for use</li>  <li><code>disabling</code> - the card is being disabled</li>  <li><code>disabled</code> - the card has been disabled and cannot be used</li>  <li><code>data_limit_exceeded</code> - the card has exceeded its data consumption limit</li>  <li><code>setting_standby</code> - the process to set the card in stand by is in progress</li>  <li><code>standby</code> - the card is in stand by</li> </ul> Transitioning between the enabled and disabled states may take a period of time. "
    )
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ValueEnum getValue() {
        return value;
    }

    /**
     * It describes why the SIM card is in the current status.
     * @return reason
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "The SIM card is active, ready to connect to networks and consume data.",
        value = "It describes why the SIM card is in the current status."
    )
    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getReason() {
        return reason;
    }

    /**
     * Return true if this SIMCardStatus object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SIMCardStatus siMCardStatus = (SIMCardStatus) o;
        return (
            Objects.equals(this.value, siMCardStatus.value) &&
            Objects.equals(this.reason, siMCardStatus.reason)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SIMCardStatus {\n");
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
