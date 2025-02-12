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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * CreateVerifyProfileCallRequest
 */
@JsonPropertyOrder(
    {
        CreateVerifyProfileCallRequest.JSON_PROPERTY_MESSAGING_TEMPLATE_ID,
        CreateVerifyProfileCallRequest.JSON_PROPERTY_APP_NAME,
        CreateVerifyProfileCallRequest.JSON_PROPERTY_CODE_LENGTH,
        CreateVerifyProfileCallRequest.JSON_PROPERTY_WHITELISTED_DESTINATIONS,
        CreateVerifyProfileCallRequest.JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateVerifyProfileCallRequest {

    public static final String JSON_PROPERTY_MESSAGING_TEMPLATE_ID =
        "messaging_template_id";
    private UUID messagingTemplateId;

    public static final String JSON_PROPERTY_APP_NAME = "app_name";
    private String appName;

    public static final String JSON_PROPERTY_CODE_LENGTH = "code_length";
    private Integer codeLength = 5;

    public static final String JSON_PROPERTY_WHITELISTED_DESTINATIONS =
        "whitelisted_destinations";
    private List<String> whitelistedDestinations = null;

    public static final String JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS =
        "default_verification_timeout_secs";
    private Integer defaultVerificationTimeoutSecs = 300;

    public CreateVerifyProfileCallRequest() {}

    public CreateVerifyProfileCallRequest messagingTemplateId(
        UUID messagingTemplateId
    ) {
        this.messagingTemplateId = messagingTemplateId;
        return this;
    }

    /**
     * The message template identifier selected from /verify_profiles/templates
     * @return messagingTemplateId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "0abb5b4f-459f-445a-bfcd-488998b7572d",
        value = "The message template identifier selected from /verify_profiles/templates"
    )
    @JsonProperty(JSON_PROPERTY_MESSAGING_TEMPLATE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getMessagingTemplateId() {
        return messagingTemplateId;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGING_TEMPLATE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessagingTemplateId(UUID messagingTemplateId) {
        this.messagingTemplateId = messagingTemplateId;
    }

    public CreateVerifyProfileCallRequest appName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * The name that identifies the application requesting 2fa in the verification message.
     * @return appName
     **/
    @javax.annotation.Nullable
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

    public CreateVerifyProfileCallRequest codeLength(Integer codeLength) {
        this.codeLength = codeLength;
        return this;
    }

    /**
     * The length of the verify code to generate.
     * @return codeLength
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "6",
        value = "The length of the verify code to generate."
    )
    @JsonProperty(JSON_PROPERTY_CODE_LENGTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getCodeLength() {
        return codeLength;
    }

    @JsonProperty(JSON_PROPERTY_CODE_LENGTH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCodeLength(Integer codeLength) {
        this.codeLength = codeLength;
    }

    public CreateVerifyProfileCallRequest whitelistedDestinations(
        List<String> whitelistedDestinations
    ) {
        this.whitelistedDestinations = whitelistedDestinations;
        return this;
    }

    public CreateVerifyProfileCallRequest addwhitelistedDestinationsItem(
        String whitelistedDestinationsItem
    ) {
        if (this.whitelistedDestinations == null) {
            this.whitelistedDestinations = new ArrayList<>();
        }
        this.whitelistedDestinations.add(whitelistedDestinationsItem);
        return this;
    }

    /**
     * Enabled country destinations to send verification codes. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to &#x60;[\&quot;*\&quot;]&#x60;, all destinations will be allowed.
     * @return whitelistedDestinations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        example = "[\"US\",\"CA\"]",
        value = "Enabled country destinations to send verification codes. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to `[\"*\"]`, all destinations will be allowed."
    )
    @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getWhitelistedDestinations() {
        return whitelistedDestinations;
    }

    @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWhitelistedDestinations(
        List<String> whitelistedDestinations
    ) {
        this.whitelistedDestinations = whitelistedDestinations;
    }

    public CreateVerifyProfileCallRequest defaultVerificationTimeoutSecs(
        Integer defaultVerificationTimeoutSecs
    ) {
        this.defaultVerificationTimeoutSecs = defaultVerificationTimeoutSecs;
        return this;
    }

    /**
     * For every request that is initiated via this Verify profile, this sets the number of seconds before a verification request code expires. Once the verification request expires, the user cannot use the code to verify their identity.
     * @return defaultVerificationTimeoutSecs
     **/
    @javax.annotation.Nullable
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

    /**
     * Return true if this CreateVerifyProfileCallRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVerifyProfileCallRequest createVerifyProfileCallRequest =
            (CreateVerifyProfileCallRequest) o;
        return (
            Objects.equals(
                this.messagingTemplateId,
                createVerifyProfileCallRequest.messagingTemplateId
            ) &&
            Objects.equals(
                this.appName,
                createVerifyProfileCallRequest.appName
            ) &&
            Objects.equals(
                this.codeLength,
                createVerifyProfileCallRequest.codeLength
            ) &&
            Objects.equals(
                this.whitelistedDestinations,
                createVerifyProfileCallRequest.whitelistedDestinations
            ) &&
            Objects.equals(
                this.defaultVerificationTimeoutSecs,
                createVerifyProfileCallRequest.defaultVerificationTimeoutSecs
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            messagingTemplateId,
            appName,
            codeLength,
            whitelistedDestinations,
            defaultVerificationTimeoutSecs
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVerifyProfileCallRequest {\n");
        sb
            .append("    messagingTemplateId: ")
            .append(toIndentedString(messagingTemplateId))
            .append("\n");
        sb
            .append("    appName: ")
            .append(toIndentedString(appName))
            .append("\n");
        sb
            .append("    codeLength: ")
            .append(toIndentedString(codeLength))
            .append("\n");
        sb
            .append("    whitelistedDestinations: ")
            .append(toIndentedString(whitelistedDestinations))
            .append("\n");
        sb
            .append("    defaultVerificationTimeoutSecs: ")
            .append(toIndentedString(defaultVerificationTimeoutSecs))
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
