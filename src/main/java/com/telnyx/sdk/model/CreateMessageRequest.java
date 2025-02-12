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

/**
 * CreateMessageRequest
 */
@JsonPropertyOrder(
    {
        CreateMessageRequest.JSON_PROPERTY_FROM,
        CreateMessageRequest.JSON_PROPERTY_MESSAGING_PROFILE_ID,
        CreateMessageRequest.JSON_PROPERTY_TO,
        CreateMessageRequest.JSON_PROPERTY_TEXT,
        CreateMessageRequest.JSON_PROPERTY_SUBJECT,
        CreateMessageRequest.JSON_PROPERTY_MEDIA_URLS,
        CreateMessageRequest.JSON_PROPERTY_WEBHOOK_URL,
        CreateMessageRequest.JSON_PROPERTY_WEBHOOK_FAILOVER_URL,
        CreateMessageRequest.JSON_PROPERTY_USE_PROFILE_WEBHOOKS,
        CreateMessageRequest.JSON_PROPERTY_TYPE,
        CreateMessageRequest.JSON_PROPERTY_AUTO_DETECT,
    }
)
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateMessageRequest {

    public static final String JSON_PROPERTY_FROM = "from";
    private String from;

    public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID =
        "messaging_profile_id";
    private String messagingProfileId;

    public static final String JSON_PROPERTY_TO = "to";
    private String to;

    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public static final String JSON_PROPERTY_SUBJECT = "subject";
    private String subject;

    public static final String JSON_PROPERTY_MEDIA_URLS = "media_urls";
    private List<String> mediaUrls = null;

    public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
    private String webhookUrl;

    public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_URL =
        "webhook_failover_url";
    private String webhookFailoverUrl;

    public static final String JSON_PROPERTY_USE_PROFILE_WEBHOOKS =
        "use_profile_webhooks";
    private Boolean useProfileWebhooks = true;

    /**
     * The protocol for sending the message, either SMS or MMS.
     */
    public enum TypeEnum {
        SMS(String.valueOf("SMS")),

        MMS(String.valueOf("MMS"));

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_AUTO_DETECT = "auto_detect";
    private Boolean autoDetect = false;

    public CreateMessageRequest() {}

    public CreateMessageRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).  **Required if sending with a phone number, short code, or alphanumeric sender ID.**
     * @return from
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Sending address (+E.164 formatted phone number, alphanumeric sender ID, or short code).  **Required if sending with a phone number, short code, or alphanumeric sender ID.** "
    )
    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getFrom() {
        return from;
    }

    @JsonProperty(JSON_PROPERTY_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFrom(String from) {
        this.from = from;
    }

    public CreateMessageRequest messagingProfileId(String messagingProfileId) {
        this.messagingProfileId = messagingProfileId;
        return this;
    }

    /**
     * Unique identifier for a messaging profile.  **Required if sending via number pool or with an alphanumeric sender ID.**
     * @return messagingProfileId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Unique identifier for a messaging profile.  **Required if sending via number pool or with an alphanumeric sender ID.** "
    )
    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getMessagingProfileId() {
        return messagingProfileId;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessagingProfileId(String messagingProfileId) {
        this.messagingProfileId = messagingProfileId;
    }

    public CreateMessageRequest to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Receiving address (+E.164 formatted phone number or short code).
     * @return to
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(
        example = "+E.164",
        required = true,
        value = "Receiving address (+E.164 formatted phone number or short code)."
    )
    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getTo() {
        return to;
    }

    @JsonProperty(JSON_PROPERTY_TO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTo(String to) {
        this.to = to;
    }

    public CreateMessageRequest text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Message body (i.e., content) as a non-empty string.  **Required for SMS**
     * @return text
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Message body (i.e., content) as a non-empty string.  **Required for SMS**"
    )
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setText(String text) {
        this.text = text;
    }

    public CreateMessageRequest subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Subject of multimedia message
     * @return subject
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Subject of multimedia message")
    @JsonProperty(JSON_PROPERTY_SUBJECT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSubject() {
        return subject;
    }

    @JsonProperty(JSON_PROPERTY_SUBJECT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public CreateMessageRequest mediaUrls(List<String> mediaUrls) {
        this.mediaUrls = mediaUrls;
        return this;
    }

    public CreateMessageRequest addmediaUrlsItem(String mediaUrlsItem) {
        if (this.mediaUrls == null) {
            this.mediaUrls = new ArrayList<>();
        }
        this.mediaUrls.add(mediaUrlsItem);
        return this;
    }

    /**
     * A list of media URLs. The total media size must be less than 1 MB.  **Required for MMS**
     * @return mediaUrls
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "A list of media URLs. The total media size must be less than 1 MB.  **Required for MMS**"
    )
    @JsonProperty(JSON_PROPERTY_MEDIA_URLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getMediaUrls() {
        return mediaUrls;
    }

    @JsonProperty(JSON_PROPERTY_MEDIA_URLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMediaUrls(List<String> mediaUrls) {
        this.mediaUrls = mediaUrls;
    }

    public CreateMessageRequest webhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
        return this;
    }

    /**
     * The URL where webhooks related to this message will be sent.
     * @return webhookUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "The URL where webhooks related to this message will be sent."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebhookUrl() {
        return webhookUrl;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public CreateMessageRequest webhookFailoverUrl(String webhookFailoverUrl) {
        this.webhookFailoverUrl = webhookFailoverUrl;
        return this;
    }

    /**
     * The failover URL where webhooks related to this message will be sent if sending to the primary URL fails.
     * @return webhookFailoverUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "The failover URL where webhooks related to this message will be sent if sending to the primary URL fails."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getWebhookFailoverUrl() {
        return webhookFailoverUrl;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookFailoverUrl(String webhookFailoverUrl) {
        this.webhookFailoverUrl = webhookFailoverUrl;
    }

    public CreateMessageRequest useProfileWebhooks(Boolean useProfileWebhooks) {
        this.useProfileWebhooks = useProfileWebhooks;
        return this;
    }

    /**
     * If the profile this number is associated with has webhooks, use them for delivery notifications. If webhooks are also specified on the message itself, they will be attempted first, then those on the profile.
     * @return useProfileWebhooks
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "If the profile this number is associated with has webhooks, use them for delivery notifications. If webhooks are also specified on the message itself, they will be attempted first, then those on the profile."
    )
    @JsonProperty(JSON_PROPERTY_USE_PROFILE_WEBHOOKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getUseProfileWebhooks() {
        return useProfileWebhooks;
    }

    @JsonProperty(JSON_PROPERTY_USE_PROFILE_WEBHOOKS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUseProfileWebhooks(Boolean useProfileWebhooks) {
        this.useProfileWebhooks = useProfileWebhooks;
    }

    public CreateMessageRequest type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The protocol for sending the message, either SMS or MMS.
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "The protocol for sending the message, either SMS or MMS."
    )
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateMessageRequest autoDetect(Boolean autoDetect) {
        this.autoDetect = autoDetect;
        return this;
    }

    /**
     * Automatically detect if an SMS message is unusually long and exceeds a recommended limit of message parts.
     * @return autoDetect
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(
        value = "Automatically detect if an SMS message is unusually long and exceeds a recommended limit of message parts."
    )
    @JsonProperty(JSON_PROPERTY_AUTO_DETECT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAutoDetect() {
        return autoDetect;
    }

    @JsonProperty(JSON_PROPERTY_AUTO_DETECT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAutoDetect(Boolean autoDetect) {
        this.autoDetect = autoDetect;
    }

    /**
     * Return true if this CreateMessageRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMessageRequest createMessageRequest = (CreateMessageRequest) o;
        return (
            Objects.equals(this.from, createMessageRequest.from) &&
            Objects.equals(
                this.messagingProfileId,
                createMessageRequest.messagingProfileId
            ) &&
            Objects.equals(this.to, createMessageRequest.to) &&
            Objects.equals(this.text, createMessageRequest.text) &&
            Objects.equals(this.subject, createMessageRequest.subject) &&
            Objects.equals(this.mediaUrls, createMessageRequest.mediaUrls) &&
            Objects.equals(this.webhookUrl, createMessageRequest.webhookUrl) &&
            Objects.equals(
                this.webhookFailoverUrl,
                createMessageRequest.webhookFailoverUrl
            ) &&
            Objects.equals(
                this.useProfileWebhooks,
                createMessageRequest.useProfileWebhooks
            ) &&
            Objects.equals(this.type, createMessageRequest.type) &&
            Objects.equals(this.autoDetect, createMessageRequest.autoDetect)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            from,
            messagingProfileId,
            to,
            text,
            subject,
            mediaUrls,
            webhookUrl,
            webhookFailoverUrl,
            useProfileWebhooks,
            type,
            autoDetect
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageRequest {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb
            .append("    messagingProfileId: ")
            .append(toIndentedString(messagingProfileId))
            .append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb
            .append("    subject: ")
            .append(toIndentedString(subject))
            .append("\n");
        sb
            .append("    mediaUrls: ")
            .append(toIndentedString(mediaUrls))
            .append("\n");
        sb
            .append("    webhookUrl: ")
            .append(toIndentedString(webhookUrl))
            .append("\n");
        sb
            .append("    webhookFailoverUrl: ")
            .append(toIndentedString(webhookFailoverUrl))
            .append("\n");
        sb
            .append("    useProfileWebhooks: ")
            .append(toIndentedString(useProfileWebhooks))
            .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb
            .append("    autoDetect: ")
            .append(toIndentedString(autoDetect))
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
