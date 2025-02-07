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
import com.telnyx.sdk.model.AnchorsiteOverride;
import com.telnyx.sdk.model.DtmfType;
import com.telnyx.sdk.model.TexmlApplicationInbound;
import com.telnyx.sdk.model.TexmlApplicationOutbound;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateTexmlApplicationRequest
 */
@JsonPropertyOrder(
    {
        UpdateTexmlApplicationRequest.JSON_PROPERTY_FRIENDLY_NAME,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_ACTIVE,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_ANCHORSITE_OVERRIDE,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_DTMF_TYPE,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_FIRST_COMMAND_TIMEOUT,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_VOICE_URL,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_VOICE_FALLBACK_URL,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_VOICE_METHOD,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_STATUS_CALLBACK,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_STATUS_CALLBACK_METHOD,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_INBOUND,
        UpdateTexmlApplicationRequest.JSON_PROPERTY_OUTBOUND,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class UpdateTexmlApplicationRequest {

    public static final String JSON_PROPERTY_FRIENDLY_NAME = "friendly_name";
    private String friendlyName;

    public static final String JSON_PROPERTY_ACTIVE = "active";
    private Boolean active = true;

    public static final String JSON_PROPERTY_ANCHORSITE_OVERRIDE =
        "anchorsite_override";
    private AnchorsiteOverride anchorsiteOverride = AnchorsiteOverride.LATENCY;

    public static final String JSON_PROPERTY_DTMF_TYPE = "dtmf_type";
    private DtmfType dtmfType = DtmfType.RFC_2833;

    public static final String JSON_PROPERTY_FIRST_COMMAND_TIMEOUT =
        "first_command_timeout";
    private Boolean firstCommandTimeout = false;

    public static final String JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS =
        "first_command_timeout_secs";
    private Integer firstCommandTimeoutSecs = 30;

    public static final String JSON_PROPERTY_VOICE_URL = "voice_url";
    private String voiceUrl;

    public static final String JSON_PROPERTY_VOICE_FALLBACK_URL =
        "voice_fallback_url";
    private String voiceFallbackUrl;

    /**
     * HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either &#39;get&#39; or &#39;post&#39;.
     */
    public enum VoiceMethodEnum {
        GET(String.valueOf("get")),

        POST(String.valueOf("post"));

        private String value;

        VoiceMethodEnum(String value) {
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
        public static VoiceMethodEnum fromValue(String value) {
            for (VoiceMethodEnum b : VoiceMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_VOICE_METHOD = "voice_method";
    private VoiceMethodEnum voiceMethod = VoiceMethodEnum.POST;

    public static final String JSON_PROPERTY_STATUS_CALLBACK =
        "status_callback";
    private String statusCallback;

    /**
     * HTTP request method Telnyx should use when requesting the status_callback URL.
     */
    public enum StatusCallbackMethodEnum {
        GET(String.valueOf("get")),

        POST(String.valueOf("post"));

        private String value;

        StatusCallbackMethodEnum(String value) {
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
        public static StatusCallbackMethodEnum fromValue(String value) {
            for (StatusCallbackMethodEnum b : StatusCallbackMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_STATUS_CALLBACK_METHOD =
        "status_callback_method";
    private StatusCallbackMethodEnum statusCallbackMethod =
        StatusCallbackMethodEnum.POST;

    public static final String JSON_PROPERTY_INBOUND = "inbound";
    private TexmlApplicationInbound inbound;

    public static final String JSON_PROPERTY_OUTBOUND = "outbound";
    private TexmlApplicationOutbound outbound;

    public UpdateTexmlApplicationRequest() {}

    public UpdateTexmlApplicationRequest friendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * A user-assigned name to help manage the application.
     * @return friendlyName
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "call-router",
        required = true,
        value = "A user-assigned name to help manage the application."
    )
    @JsonProperty(JSON_PROPERTY_FRIENDLY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFriendlyName() {
        return friendlyName;
    }

    @JsonProperty(JSON_PROPERTY_FRIENDLY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public UpdateTexmlApplicationRequest active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Specifies whether the connection can be used.
     * @return active
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "false",
        value = "Specifies whether the connection can be used."
    )
    @JsonProperty(JSON_PROPERTY_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getActive() {
        return active;
    }

    @JsonProperty(JSON_PROPERTY_ACTIVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActive(Boolean active) {
        this.active = active;
    }

    public UpdateTexmlApplicationRequest anchorsiteOverride(
        AnchorsiteOverride anchorsiteOverride
    ) {
        this.anchorsiteOverride = anchorsiteOverride;
        return this;
    }

    /**
     * Get anchorsiteOverride
     * @return anchorsiteOverride
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AnchorsiteOverride getAnchorsiteOverride() {
        return anchorsiteOverride;
    }

    @JsonProperty(JSON_PROPERTY_ANCHORSITE_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAnchorsiteOverride(AnchorsiteOverride anchorsiteOverride) {
        this.anchorsiteOverride = anchorsiteOverride;
    }

    public UpdateTexmlApplicationRequest dtmfType(DtmfType dtmfType) {
        this.dtmfType = dtmfType;
        return this;
    }

    /**
     * Get dtmfType
     * @return dtmfType
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DtmfType getDtmfType() {
        return dtmfType;
    }

    @JsonProperty(JSON_PROPERTY_DTMF_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDtmfType(DtmfType dtmfType) {
        this.dtmfType = dtmfType;
    }

    public UpdateTexmlApplicationRequest firstCommandTimeout(
        Boolean firstCommandTimeout
    ) {
        this.firstCommandTimeout = firstCommandTimeout;
        return this;
    }

    /**
     * Specifies whether calls to phone numbers associated with this connection should hangup after timing out.
     * @return firstCommandTimeout
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "true",
        value = "Specifies whether calls to phone numbers associated with this connection should hangup after timing out."
    )
    @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getFirstCommandTimeout() {
        return firstCommandTimeout;
    }

    @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFirstCommandTimeout(Boolean firstCommandTimeout) {
        this.firstCommandTimeout = firstCommandTimeout;
    }

    public UpdateTexmlApplicationRequest firstCommandTimeoutSecs(
        Integer firstCommandTimeoutSecs
    ) {
        this.firstCommandTimeoutSecs = firstCommandTimeoutSecs;
        return this;
    }

    /**
     * Specifies how many seconds to wait before timing out a dial command.
     * @return firstCommandTimeoutSecs
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "10",
        value = "Specifies how many seconds to wait before timing out a dial command."
    )
    @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getFirstCommandTimeoutSecs() {
        return firstCommandTimeoutSecs;
    }

    @JsonProperty(JSON_PROPERTY_FIRST_COMMAND_TIMEOUT_SECS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFirstCommandTimeoutSecs(Integer firstCommandTimeoutSecs) {
        this.firstCommandTimeoutSecs = firstCommandTimeoutSecs;
    }

    public UpdateTexmlApplicationRequest voiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
        return this;
    }

    /**
     * URL to which Telnyx will deliver your XML Translator webhooks.
     * @return voiceUrl
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        example = "https://example.com",
        required = true,
        value = "URL to which Telnyx will deliver your XML Translator webhooks."
    )
    @JsonProperty(JSON_PROPERTY_VOICE_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getVoiceUrl() {
        return voiceUrl;
    }

    @JsonProperty(JSON_PROPERTY_VOICE_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl;
    }

    public UpdateTexmlApplicationRequest voiceFallbackUrl(
        String voiceFallbackUrl
    ) {
        this.voiceFallbackUrl = voiceFallbackUrl;
        return this;
    }

    /**
     * URL to which Telnyx will deliver your XML Translator webhooks if we get an error response from your voice_url.
     * @return voiceFallbackUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://fallback.example.com",
        value = "URL to which Telnyx will deliver your XML Translator webhooks if we get an error response from your voice_url."
    )
    @JsonProperty(JSON_PROPERTY_VOICE_FALLBACK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getVoiceFallbackUrl() {
        return voiceFallbackUrl;
    }

    @JsonProperty(JSON_PROPERTY_VOICE_FALLBACK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVoiceFallbackUrl(String voiceFallbackUrl) {
        this.voiceFallbackUrl = voiceFallbackUrl;
    }

    public UpdateTexmlApplicationRequest voiceMethod(
        VoiceMethodEnum voiceMethod
    ) {
        this.voiceMethod = voiceMethod;
        return this;
    }

    /**
     * HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either &#39;get&#39; or &#39;post&#39;.
     * @return voiceMethod
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "get",
        value = "HTTP request method Telnyx will use to interact with your XML Translator webhooks. Either 'get' or 'post'."
    )
    @JsonProperty(JSON_PROPERTY_VOICE_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public VoiceMethodEnum getVoiceMethod() {
        return voiceMethod;
    }

    @JsonProperty(JSON_PROPERTY_VOICE_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVoiceMethod(VoiceMethodEnum voiceMethod) {
        this.voiceMethod = voiceMethod;
    }

    public UpdateTexmlApplicationRequest statusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * URL for Telnyx to send requests to containing information about call progress events.
     * @return statusCallback
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "https://example.com",
        value = "URL for Telnyx to send requests to containing information about call progress events."
    )
    @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getStatusCallback() {
        return statusCallback;
    }

    @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
    }

    public UpdateTexmlApplicationRequest statusCallbackMethod(
        StatusCallbackMethodEnum statusCallbackMethod
    ) {
        this.statusCallbackMethod = statusCallbackMethod;
        return this;
    }

    /**
     * HTTP request method Telnyx should use when requesting the status_callback URL.
     * @return statusCallbackMethod
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        example = "get",
        value = "HTTP request method Telnyx should use when requesting the status_callback URL."
    )
    @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public StatusCallbackMethodEnum getStatusCallbackMethod() {
        return statusCallbackMethod;
    }

    @JsonProperty(JSON_PROPERTY_STATUS_CALLBACK_METHOD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatusCallbackMethod(
        StatusCallbackMethodEnum statusCallbackMethod
    ) {
        this.statusCallbackMethod = statusCallbackMethod;
    }

    public UpdateTexmlApplicationRequest inbound(
        TexmlApplicationInbound inbound
    ) {
        this.inbound = inbound;
        return this;
    }

    /**
     * Get inbound
     * @return inbound
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TexmlApplicationInbound getInbound() {
        return inbound;
    }

    @JsonProperty(JSON_PROPERTY_INBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInbound(TexmlApplicationInbound inbound) {
        this.inbound = inbound;
    }

    public UpdateTexmlApplicationRequest outbound(
        TexmlApplicationOutbound outbound
    ) {
        this.outbound = outbound;
        return this;
    }

    /**
     * Get outbound
     * @return outbound
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OUTBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TexmlApplicationOutbound getOutbound() {
        return outbound;
    }

    @JsonProperty(JSON_PROPERTY_OUTBOUND)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOutbound(TexmlApplicationOutbound outbound) {
        this.outbound = outbound;
    }

    /**
     * Return true if this UpdateTexmlApplicationRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTexmlApplicationRequest updateTexmlApplicationRequest =
            (UpdateTexmlApplicationRequest) o;
        return (
            Objects.equals(
                this.friendlyName,
                updateTexmlApplicationRequest.friendlyName
            ) &&
            Objects.equals(this.active, updateTexmlApplicationRequest.active) &&
            Objects.equals(
                this.anchorsiteOverride,
                updateTexmlApplicationRequest.anchorsiteOverride
            ) &&
            Objects.equals(
                this.dtmfType,
                updateTexmlApplicationRequest.dtmfType
            ) &&
            Objects.equals(
                this.firstCommandTimeout,
                updateTexmlApplicationRequest.firstCommandTimeout
            ) &&
            Objects.equals(
                this.firstCommandTimeoutSecs,
                updateTexmlApplicationRequest.firstCommandTimeoutSecs
            ) &&
            Objects.equals(
                this.voiceUrl,
                updateTexmlApplicationRequest.voiceUrl
            ) &&
            Objects.equals(
                this.voiceFallbackUrl,
                updateTexmlApplicationRequest.voiceFallbackUrl
            ) &&
            Objects.equals(
                this.voiceMethod,
                updateTexmlApplicationRequest.voiceMethod
            ) &&
            Objects.equals(
                this.statusCallback,
                updateTexmlApplicationRequest.statusCallback
            ) &&
            Objects.equals(
                this.statusCallbackMethod,
                updateTexmlApplicationRequest.statusCallbackMethod
            ) &&
            Objects.equals(
                this.inbound,
                updateTexmlApplicationRequest.inbound
            ) &&
            Objects.equals(
                this.outbound,
                updateTexmlApplicationRequest.outbound
            )
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            friendlyName,
            active,
            anchorsiteOverride,
            dtmfType,
            firstCommandTimeout,
            firstCommandTimeoutSecs,
            voiceUrl,
            voiceFallbackUrl,
            voiceMethod,
            statusCallback,
            statusCallbackMethod,
            inbound,
            outbound
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTexmlApplicationRequest {\n");
        sb
            .append("    friendlyName: ")
            .append(toIndentedString(friendlyName))
            .append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb
            .append("    anchorsiteOverride: ")
            .append(toIndentedString(anchorsiteOverride))
            .append("\n");
        sb
            .append("    dtmfType: ")
            .append(toIndentedString(dtmfType))
            .append("\n");
        sb
            .append("    firstCommandTimeout: ")
            .append(toIndentedString(firstCommandTimeout))
            .append("\n");
        sb
            .append("    firstCommandTimeoutSecs: ")
            .append(toIndentedString(firstCommandTimeoutSecs))
            .append("\n");
        sb
            .append("    voiceUrl: ")
            .append(toIndentedString(voiceUrl))
            .append("\n");
        sb
            .append("    voiceFallbackUrl: ")
            .append(toIndentedString(voiceFallbackUrl))
            .append("\n");
        sb
            .append("    voiceMethod: ")
            .append(toIndentedString(voiceMethod))
            .append("\n");
        sb
            .append("    statusCallback: ")
            .append(toIndentedString(statusCallback))
            .append("\n");
        sb
            .append("    statusCallbackMethod: ")
            .append(toIndentedString(statusCallbackMethod))
            .append("\n");
        sb
            .append("    inbound: ")
            .append(toIndentedString(inbound))
            .append("\n");
        sb
            .append("    outbound: ")
            .append(toIndentedString(outbound))
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
