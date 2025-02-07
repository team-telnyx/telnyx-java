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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VerifyProfileWhatsappResponse
 */
@JsonPropertyOrder(
    {
        VerifyProfileWhatsappResponse.JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS,
        VerifyProfileWhatsappResponse.JSON_PROPERTY_APP_NAME,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen"
)
public class VerifyProfileWhatsappResponse {

    public static final String JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS =
        "default_verification_timeout_secs";
    private Integer defaultVerificationTimeoutSecs;

    public static final String JSON_PROPERTY_APP_NAME = "app_name";
    private String appName;

    public VerifyProfileWhatsappResponse() {}

    public VerifyProfileWhatsappResponse defaultVerificationTimeoutSecs(
        Integer defaultVerificationTimeoutSecs
    ) {
        this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
        return this;
    }

    /**
     * For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.
     * @return defaultVerificationTimeoutSecs
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "300",
        value = "For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity."
    )
    @JsonProperty(JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDefaultVerificationTimeoutSecs() {
        return defaultVerificationTimeoutSecs;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDefaultVerificationTimeoutSecs(
        Integer defaultVerificationTimeoutSecs
    ) {
        this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
    }

    public VerifyProfileWhatsappResponse appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * The name that identifies the application requesting 2fa in the verification message.
     * @return appName
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "Example Secure App",
        value = "The name that identifies the application requesting 2fa in the verification message."
    )
    @JsonProperty(JSON_PROPERTY_APP_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAppName() {
        return appName;
    }

    @JsonProperty(JSON_PROPERTY_APP_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * Return true if this VerifyProfileWhatsappResponse object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyProfileWhatsappResponse verifyProfileWhatsappResponse =
            (VerifyProfileWhatsappResponse) o;
        return (
            Objects.equals(
                this.defaultVerificationTimeoutSecs,
                verifyProfileWhatsappResponse.defaultVerificationTimeoutSecs
            ) &&
            Objects.equals(this.appName, verifyProfileWhatsappResponse.appName)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultVerificationTimeoutSecs, appName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyProfileWhatsappResponse {\n");
        sb
            .append("    defaultVerificationTimeoutSecs: ")
            .append(toIndentedString(defaultVerificationTimeoutSecs))
            .append("\n");
        sb
            .append("    appName: ")
            .append(toIndentedString(appName))
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
