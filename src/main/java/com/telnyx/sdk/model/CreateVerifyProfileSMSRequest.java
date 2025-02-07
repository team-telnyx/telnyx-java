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
import com.fasterxml.jackson.annotation.JsonIgnore;
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
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateVerifyProfileSMSRequest
 */
@JsonPropertyOrder(
    {
        CreateVerifyProfileSMSRequest.JSON_PROPERTY_MESSAGING_TEMPLATE_ID,
        CreateVerifyProfileSMSRequest.JSON_PROPERTY_APP_NAME,
        CreateVerifyProfileSMSRequest.JSON_PROPERTY_ALPHA_SENDER,
        CreateVerifyProfileSMSRequest.JSON_PROPERTY_CODE_LENGTH,
        CreateVerifyProfileSMSRequest.JSON_PROPERTY_WHITELISTED_DESTINATIONS,
        CreateVerifyProfileSMSRequest.JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateVerifyProfileSMSRequest {

    public static final String JSON_PROPERTY_MESSAGING_TEMPLATE_ID =
        "messaging_template_id";
    private UUID messagingTemplateId;

    public static final String JSON_PROPERTY_APP_NAME = "app_name";
    private String appName;

    public static final String JSON_PROPERTY_ALPHA_SENDER = "alpha_sender";
    private JsonNullable<String> alphaSender = JsonNullable.<String>of(
        "Telnyx"
    );

    public static final String JSON_PROPERTY_CODE_LENGTH = "code_length";
    private Integer codeLength = 5;

    public static final String JSON_PROPERTY_WHITELISTED_DESTINATIONS =
        "whitelisted_destinations";
    private List<String> whitelistedDestinations = new ArrayList<>();

    public static final String JSON_PROPERTY_DEFAULT_VERIFICATION_TIMEOUT_SECS =
        "default_verification_timeout_secs";
    private Integer defaultVerificationTimeoutSecs = 300;

    public CreateVerifyProfileSMSRequest() {}

    public CreateVerifyProfileSMSRequest messagingTemplateId(
        UUID messagingTemplateId
    ) {
        this.messagingTemplateId = messagingTemplateId;
        return this;
    }

    /**
     * The message template identifier selected from /verify_profiles/templates
     * @return messagingTemplateId
     **/
    @jakarta.annotation.Nullable
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

    public CreateVerifyProfileSMSRequest appName(String appName) {
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

    public CreateVerifyProfileSMSRequest alphaSender(String alphaSender) {
        this.alphaSender = JsonNullable.<String>of(alphaSender);
        return this;
    }

    /**
     * The alphanumeric sender ID to use when sending to destinations that require an alphanumeric sender ID.
     * @return alphaSender
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The alphanumeric sender ID to use when sending to destinations that require an alphanumeric sender ID."
    )
    @JsonIgnore
    public String getAlphaSender() {
        return alphaSender.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_ALPHA_SENDER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getAlphaSender_JsonNullable() {
        return alphaSender;
    }

    @JsonProperty(JSON_PROPERTY_ALPHA_SENDER)
    public void setAlphaSender_JsonNullable(JsonNullable<String> alphaSender) {
        this.alphaSender = alphaSender;
    }

    public void setAlphaSender(String alphaSender) {
        this.alphaSender = JsonNullable.<String>of(alphaSender);
    }

    public CreateVerifyProfileSMSRequest codeLength(Integer codeLength) {
        this.codeLength = codeLength;
        return this;
    }

    /**
     * The length of the verify code to generate.
     * @return codeLength
     **/
    @jakarta.annotation.Nullable
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

    public CreateVerifyProfileSMSRequest whitelistedDestinations(
        List<String> whitelistedDestinations
    ) {
        this.whitelistedDestinations = whitelistedDestinations;
        return this;
    }

    public CreateVerifyProfileSMSRequest addwhitelistedDestinationsItem(
        String whitelistedDestinationsItem
    ) {
        this.whitelistedDestinations.add(whitelistedDestinationsItem);
        return this;
    }

    /**
     * Enabled country destinations to send verification codes. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to &#x60;[\&quot;*\&quot;]&#x60;, all destinations will be allowed.
     * @return whitelistedDestinations
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "[\"US\",\"CA\"]",
        required = true,
        value = "Enabled country destinations to send verification codes. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to `[\"*\"]`, all destinations will be allowed."
    )
    @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<String> getWhitelistedDestinations() {
        return whitelistedDestinations;
    }

    @JsonProperty(JSON_PROPERTY_WHITELISTED_DESTINATIONS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setWhitelistedDestinations(
        List<String> whitelistedDestinations
    ) {
        this.whitelistedDestinations = whitelistedDestinations;
    }

    public CreateVerifyProfileSMSRequest defaultVerificationTimeoutSecs(
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

    /**
     * Return true if this CreateVerifyProfileSMSRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVerifyProfileSMSRequest createVerifyProfileSMSRequest =
            (CreateVerifyProfileSMSRequest) o;
        return (
            Objects.equals(
                this.messagingTemplateId,
                createVerifyProfileSMSRequest.messagingTemplateId
            ) &&
            Objects.equals(
                this.appName,
                createVerifyProfileSMSRequest.appName
            ) &&
            equalsNullable(
                this.alphaSender,
                createVerifyProfileSMSRequest.alphaSender
            ) &&
            Objects.equals(
                this.codeLength,
                createVerifyProfileSMSRequest.codeLength
            ) &&
            Objects.equals(
                this.whitelistedDestinations,
                createVerifyProfileSMSRequest.whitelistedDestinations
            ) &&
            Objects.equals(
                this.defaultVerificationTimeoutSecs,
                createVerifyProfileSMSRequest.defaultVerificationTimeoutSecs
            )
        );
    }

    private static <T> boolean equalsNullable(
        JsonNullable<T> a,
        JsonNullable<T> b
    ) {
        return (
            a == b ||
            (a != null &&
                b != null &&
                a.isPresent() &&
                b.isPresent() &&
                Objects.deepEquals(a.get(), b.get()))
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            messagingTemplateId,
            appName,
            hashCodeNullable(alphaSender),
            codeLength,
            whitelistedDestinations,
            defaultVerificationTimeoutSecs
        );
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent()
            ? Arrays.deepHashCode(new Object[] { a.get() })
            : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVerifyProfileSMSRequest {\n");
        sb
            .append("    messagingTemplateId: ")
            .append(toIndentedString(messagingTemplateId))
            .append("\n");
        sb
            .append("    appName: ")
            .append(toIndentedString(appName))
            .append("\n");
        sb
            .append("    alphaSender: ")
            .append(toIndentedString(alphaSender))
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
