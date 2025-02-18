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
 * The current status or failure details of the Private Wireless Gateway.
 */
@ApiModel(
    description = "The current status or failure details of the Private Wireless Gateway."
)
@JsonPropertyOrder(
    {
        PrivateWirelessGatewayStatus.JSON_PROPERTY_VALUE,
        PrivateWirelessGatewayStatus.JSON_PROPERTY_ERROR_DESCRIPTION,
        PrivateWirelessGatewayStatus.JSON_PROPERTY_ERROR_CODE,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class PrivateWirelessGatewayStatus {

    /**
     * The current status or failure details of the Private Wireless Gateway. &lt;ul&gt;  &lt;li&gt;&lt;code&gt;provisioning&lt;/code&gt; - the Private Wireless Gateway is being provisioned.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;provisioned&lt;/code&gt; - the Private Wireless Gateway was provisioned and able to receive connections.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;failed&lt;/code&gt; - the provisioning had failed for a reason and it requires an intervention.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;decommissioning&lt;/code&gt; - the Private Wireless Gateway is being removed from the network.&lt;/li&gt;  &lt;/ul&gt;  Transitioning between the provisioning and provisioned states may take some time.
     */
    public enum ValueEnum {
        PROVISIONING(String.valueOf("provisioning")),

        PROVISIONED(String.valueOf("provisioned")),

        FAILED(String.valueOf("failed")),

        DECOMMISSIONING(String.valueOf("decommissioning"));

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
    private ValueEnum value = ValueEnum.PROVISIONING;

    public static final String JSON_PROPERTY_ERROR_DESCRIPTION =
        "error_description";
    private String errorDescription;

    public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
    private String errorCode;

    public PrivateWirelessGatewayStatus() {}

    @JsonCreator
    public PrivateWirelessGatewayStatus(
        @JsonProperty(JSON_PROPERTY_VALUE) ValueEnum value,
        @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION) String errorDescription,
        @JsonProperty(JSON_PROPERTY_ERROR_CODE) String errorCode
    ) {
        this();
        this.value = value;
        this.errorDescription = errorDescription;
        this.errorCode = errorCode;
    }

    /**
     * The current status or failure details of the Private Wireless Gateway. &lt;ul&gt;  &lt;li&gt;&lt;code&gt;provisioning&lt;/code&gt; - the Private Wireless Gateway is being provisioned.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;provisioned&lt;/code&gt; - the Private Wireless Gateway was provisioned and able to receive connections.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;failed&lt;/code&gt; - the provisioning had failed for a reason and it requires an intervention.&lt;/li&gt;  &lt;li&gt;&lt;code&gt;decommissioning&lt;/code&gt; - the Private Wireless Gateway is being removed from the network.&lt;/li&gt;  &lt;/ul&gt;  Transitioning between the provisioning and provisioned states may take some time.
     * @return value
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "provisioned",
        value = "The current status or failure details of the Private Wireless Gateway. <ul>  <li><code>provisioning</code> - the Private Wireless Gateway is being provisioned.</li>  <li><code>provisioned</code> - the Private Wireless Gateway was provisioned and able to receive connections.</li>  <li><code>failed</code> - the provisioning had failed for a reason and it requires an intervention.</li>  <li><code>decommissioning</code> - the Private Wireless Gateway is being removed from the network.</li>  </ul>  Transitioning between the provisioning and provisioned states may take some time."
    )
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ValueEnum getValue() {
        return value;
    }

    /**
     * This attribute provides a human-readable explanation of why a failure happened.
     * @return errorDescription
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "This attribute provides a human-readable explanation of why a failure happened."
    )
    @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * This attribute is an [error code](https://developers.telnyx.com/api/errors) related to the failure reason.
     * @return errorCode
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "This attribute is an [error code](https://developers.telnyx.com/api/errors) related to the failure reason."
    )
    @JsonProperty(JSON_PROPERTY_ERROR_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Return true if this PrivateWirelessGatewayStatus object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateWirelessGatewayStatus privateWirelessGatewayStatus =
            (PrivateWirelessGatewayStatus) o;
        return (
            Objects.equals(this.value, privateWirelessGatewayStatus.value) &&
            Objects.equals(
                this.errorDescription,
                privateWirelessGatewayStatus.errorDescription
            ) &&
            Objects.equals(
                this.errorCode,
                privateWirelessGatewayStatus.errorCode
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, errorDescription, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateWirelessGatewayStatus {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb
            .append("    errorDescription: ")
            .append(toIndentedString(errorDescription))
            .append("\n");
        sb
            .append("    errorCode: ")
            .append(toIndentedString(errorCode))
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
