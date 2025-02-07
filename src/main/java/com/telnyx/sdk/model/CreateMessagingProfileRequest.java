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
import com.telnyx.sdk.model.NumberPoolSettings;
import com.telnyx.sdk.model.UrlShortenerSettings;
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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateMessagingProfileRequest
 */
@JsonPropertyOrder(
    {
        CreateMessagingProfileRequest.JSON_PROPERTY_NAME,
        CreateMessagingProfileRequest.JSON_PROPERTY_WHITELISTED_DESTINATIONS,
        CreateMessagingProfileRequest.JSON_PROPERTY_ENABLED,
        CreateMessagingProfileRequest.JSON_PROPERTY_WEBHOOK_URL,
        CreateMessagingProfileRequest.JSON_PROPERTY_WEBHOOK_FAILOVER_URL,
        CreateMessagingProfileRequest.JSON_PROPERTY_WEBHOOK_API_VERSION,
        CreateMessagingProfileRequest.JSON_PROPERTY_NUMBER_POOL_SETTINGS,
        CreateMessagingProfileRequest.JSON_PROPERTY_URL_SHORTENER_SETTINGS,
        CreateMessagingProfileRequest.JSON_PROPERTY_ALPHA_SENDER,
        CreateMessagingProfileRequest.JSON_PROPERTY_DAILY_SPEND_LIMIT,
        CreateMessagingProfileRequest.JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED,
        CreateMessagingProfileRequest.JSON_PROPERTY_MMS_FALL_BACK_TO_SMS,
        CreateMessagingProfileRequest.JSON_PROPERTY_MMS_TRANSCODING,
    }
)
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.11.0"
)
public class CreateMessagingProfileRequest {

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_WHITELISTED_DESTINATIONS =
        "whitelisted_destinations";
    private List<String> whitelistedDestinations = new ArrayList<>();

    public static final String JSON_PROPERTY_ENABLED = "enabled";
    private Boolean enabled = true;

    public static final String JSON_PROPERTY_WEBHOOK_URL = "webhook_url";
    private JsonNullable<String> webhookUrl = JsonNullable.<String>of("");

    public static final String JSON_PROPERTY_WEBHOOK_FAILOVER_URL =
        "webhook_failover_url";
    private JsonNullable<String> webhookFailoverUrl = JsonNullable.<String>of(
        ""
    );

    /**
     * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format.
     */
    public enum WebhookApiVersionEnum {
        _1(String.valueOf("1")),

        _2(String.valueOf("2")),

        _2010_04_01(String.valueOf("2010-04-01"));

        private String value;

        WebhookApiVersionEnum(String value) {
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
        public static WebhookApiVersionEnum fromValue(String value) {
            for (WebhookApiVersionEnum b : WebhookApiVersionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException(
                "Unexpected value '" + value + "'"
            );
        }
    }

    public static final String JSON_PROPERTY_WEBHOOK_API_VERSION =
        "webhook_api_version";
    private WebhookApiVersionEnum webhookApiVersion = WebhookApiVersionEnum._2;

    public static final String JSON_PROPERTY_NUMBER_POOL_SETTINGS =
        "number_pool_settings";
    private JsonNullable<NumberPoolSettings> numberPoolSettings = JsonNullable.<
            NumberPoolSettings
        >undefined();

    public static final String JSON_PROPERTY_URL_SHORTENER_SETTINGS =
        "url_shortener_settings";
    private JsonNullable<UrlShortenerSettings> urlShortenerSettings =
        JsonNullable.<UrlShortenerSettings>undefined();

    public static final String JSON_PROPERTY_ALPHA_SENDER = "alpha_sender";
    private JsonNullable<String> alphaSender = JsonNullable.<String>undefined();

    public static final String JSON_PROPERTY_DAILY_SPEND_LIMIT =
        "daily_spend_limit";
    private String dailySpendLimit;

    public static final String JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED =
        "daily_spend_limit_enabled";
    private Boolean dailySpendLimitEnabled;

    public static final String JSON_PROPERTY_MMS_FALL_BACK_TO_SMS =
        "mms_fall_back_to_sms";
    private Boolean mmsFallBackToSms = false;

    public static final String JSON_PROPERTY_MMS_TRANSCODING =
        "mms_transcoding";
    private Boolean mmsTranscoding = false;

    public CreateMessagingProfileRequest() {}

    public CreateMessagingProfileRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A user friendly name for the messaging profile.
     * @return name
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "A user friendly name for the messaging profile."
    )
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setName(String name) {
        this.name = name;
    }

    public CreateMessagingProfileRequest whitelistedDestinations(
        List<String> whitelistedDestinations
    ) {
        this.whitelistedDestinations = whitelistedDestinations;
        return this;
    }

    public CreateMessagingProfileRequest addwhitelistedDestinationsItem(
        String whitelistedDestinationsItem
    ) {
        this.whitelistedDestinations.add(whitelistedDestinationsItem);
        return this;
    }

    /**
     * Destinations to which the messaging profile is allowed to send. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to &#x60;[\&quot;*\&quot;]&#x60; all destinations will be allowed.
     * @return whitelistedDestinations
     **/
    @jakarta.annotation.Nonnull
    @ApiModelProperty(
        required = true,
        value = "Destinations to which the messaging profile is allowed to send. The elements in the list must be valid ISO 3166-1 alpha-2 country codes. If set to `[\"*\"]` all destinations will be allowed."
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

    public CreateMessagingProfileRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether the messaging profile is enabled or not.
     * @return enabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Specifies whether the messaging profile is enabled or not."
    )
    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateMessagingProfileRequest webhookUrl(String webhookUrl) {
        this.webhookUrl = JsonNullable.<String>of(webhookUrl);
        return this;
    }

    /**
     * The URL where webhooks related to this messaging profile will be sent.
     * @return webhookUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The URL where webhooks related to this messaging profile will be sent."
    )
    @JsonIgnore
    public String getWebhookUrl() {
        return webhookUrl.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getWebhookUrl_JsonNullable() {
        return webhookUrl;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
    public void setWebhookUrl_JsonNullable(JsonNullable<String> webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = JsonNullable.<String>of(webhookUrl);
    }

    public CreateMessagingProfileRequest webhookFailoverUrl(
        String webhookFailoverUrl
    ) {
        this.webhookFailoverUrl = JsonNullable.<String>of(webhookFailoverUrl);
        return this;
    }

    /**
     * The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails.
     * @return webhookFailoverUrl
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The failover URL where webhooks related to this messaging profile will be sent if sending to the primary URL fails."
    )
    @JsonIgnore
    public String getWebhookFailoverUrl() {
        return webhookFailoverUrl.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getWebhookFailoverUrl_JsonNullable() {
        return webhookFailoverUrl;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_FAILOVER_URL)
    public void setWebhookFailoverUrl_JsonNullable(
        JsonNullable<String> webhookFailoverUrl
    ) {
        this.webhookFailoverUrl = webhookFailoverUrl;
    }

    public void setWebhookFailoverUrl(String webhookFailoverUrl) {
        this.webhookFailoverUrl = JsonNullable.<String>of(webhookFailoverUrl);
    }

    public CreateMessagingProfileRequest webhookApiVersion(
        WebhookApiVersionEnum webhookApiVersion
    ) {
        this.webhookApiVersion = webhookApiVersion;
        return this;
    }

    /**
     * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format.
     * @return webhookApiVersion
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01 format."
    )
    @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public WebhookApiVersionEnum getWebhookApiVersion() {
        return webhookApiVersion;
    }

    @JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWebhookApiVersion(WebhookApiVersionEnum webhookApiVersion) {
        this.webhookApiVersion = webhookApiVersion;
    }

    public CreateMessagingProfileRequest numberPoolSettings(
        NumberPoolSettings numberPoolSettings
    ) {
        this.numberPoolSettings = JsonNullable.<NumberPoolSettings>of(
            numberPoolSettings
        );
        return this;
    }

    /**
     * Get numberPoolSettings
     * @return numberPoolSettings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonIgnore
    public NumberPoolSettings getNumberPoolSettings() {
        return numberPoolSettings.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_NUMBER_POOL_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<
        NumberPoolSettings
    > getNumberPoolSettings_JsonNullable() {
        return numberPoolSettings;
    }

    @JsonProperty(JSON_PROPERTY_NUMBER_POOL_SETTINGS)
    public void setNumberPoolSettings_JsonNullable(
        JsonNullable<NumberPoolSettings> numberPoolSettings
    ) {
        this.numberPoolSettings = numberPoolSettings;
    }

    public void setNumberPoolSettings(NumberPoolSettings numberPoolSettings) {
        this.numberPoolSettings = JsonNullable.<NumberPoolSettings>of(
            numberPoolSettings
        );
    }

    public CreateMessagingProfileRequest urlShortenerSettings(
        UrlShortenerSettings urlShortenerSettings
    ) {
        this.urlShortenerSettings = JsonNullable.<UrlShortenerSettings>of(
            urlShortenerSettings
        );
        return this;
    }

    /**
     * Get urlShortenerSettings
     * @return urlShortenerSettings
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonIgnore
    public UrlShortenerSettings getUrlShortenerSettings() {
        return urlShortenerSettings.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_URL_SHORTENER_SETTINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<
        UrlShortenerSettings
    > getUrlShortenerSettings_JsonNullable() {
        return urlShortenerSettings;
    }

    @JsonProperty(JSON_PROPERTY_URL_SHORTENER_SETTINGS)
    public void setUrlShortenerSettings_JsonNullable(
        JsonNullable<UrlShortenerSettings> urlShortenerSettings
    ) {
        this.urlShortenerSettings = urlShortenerSettings;
    }

    public void setUrlShortenerSettings(
        UrlShortenerSettings urlShortenerSettings
    ) {
        this.urlShortenerSettings = JsonNullable.<UrlShortenerSettings>of(
            urlShortenerSettings
        );
    }

    public CreateMessagingProfileRequest alphaSender(String alphaSender) {
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

    public CreateMessagingProfileRequest dailySpendLimit(
        String dailySpendLimit
    ) {
        this.dailySpendLimit = dailySpendLimit;
        return this;
    }

    /**
     * The maximum amount of money (in USD) that can be spent by this profile before midnight UTC.
     * @return dailySpendLimit
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "The maximum amount of money (in USD) that can be spent by this profile before midnight UTC."
    )
    @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDailySpendLimit() {
        return dailySpendLimit;
    }

    @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDailySpendLimit(String dailySpendLimit) {
        this.dailySpendLimit = dailySpendLimit;
    }

    public CreateMessagingProfileRequest dailySpendLimitEnabled(
        Boolean dailySpendLimitEnabled
    ) {
        this.dailySpendLimitEnabled = dailySpendLimitEnabled;
        return this;
    }

    /**
     * Whether to enforce the value configured by &#x60;daily_spend_limit&#x60;.
     * @return dailySpendLimitEnabled
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(
        value = "Whether to enforce the value configured by `daily_spend_limit`."
    )
    @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getDailySpendLimitEnabled() {
        return dailySpendLimitEnabled;
    }

    @JsonProperty(JSON_PROPERTY_DAILY_SPEND_LIMIT_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDailySpendLimitEnabled(Boolean dailySpendLimitEnabled) {
        this.dailySpendLimitEnabled = dailySpendLimitEnabled;
    }

    public CreateMessagingProfileRequest mmsFallBackToSms(
        Boolean mmsFallBackToSms
    ) {
        this.mmsFallBackToSms = mmsFallBackToSms;
        return this;
    }

    /**
     * enables SMS fallback for MMS messages.
     * @return mmsFallBackToSms
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "enables SMS fallback for MMS messages.")
    @JsonProperty(JSON_PROPERTY_MMS_FALL_BACK_TO_SMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getMmsFallBackToSms() {
        return mmsFallBackToSms;
    }

    @JsonProperty(JSON_PROPERTY_MMS_FALL_BACK_TO_SMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMmsFallBackToSms(Boolean mmsFallBackToSms) {
        this.mmsFallBackToSms = mmsFallBackToSms;
    }

    public CreateMessagingProfileRequest mmsTranscoding(
        Boolean mmsTranscoding
    ) {
        this.mmsTranscoding = mmsTranscoding;
        return this;
    }

    /**
     * enables automated resizing of MMS media.
     * @return mmsTranscoding
     **/
    @jakarta.annotation.Nullable
    @ApiModelProperty(value = "enables automated resizing of MMS media.")
    @JsonProperty(JSON_PROPERTY_MMS_TRANSCODING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getMmsTranscoding() {
        return mmsTranscoding;
    }

    @JsonProperty(JSON_PROPERTY_MMS_TRANSCODING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMmsTranscoding(Boolean mmsTranscoding) {
        this.mmsTranscoding = mmsTranscoding;
    }

    /**
     * Return true if this CreateMessagingProfileRequest object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMessagingProfileRequest createMessagingProfileRequest =
            (CreateMessagingProfileRequest) o;
        return (
            Objects.equals(this.name, createMessagingProfileRequest.name) &&
            Objects.equals(
                this.whitelistedDestinations,
                createMessagingProfileRequest.whitelistedDestinations
            ) &&
            Objects.equals(
                this.enabled,
                createMessagingProfileRequest.enabled
            ) &&
            equalsNullable(
                this.webhookUrl,
                createMessagingProfileRequest.webhookUrl
            ) &&
            equalsNullable(
                this.webhookFailoverUrl,
                createMessagingProfileRequest.webhookFailoverUrl
            ) &&
            Objects.equals(
                this.webhookApiVersion,
                createMessagingProfileRequest.webhookApiVersion
            ) &&
            equalsNullable(
                this.numberPoolSettings,
                createMessagingProfileRequest.numberPoolSettings
            ) &&
            equalsNullable(
                this.urlShortenerSettings,
                createMessagingProfileRequest.urlShortenerSettings
            ) &&
            equalsNullable(
                this.alphaSender,
                createMessagingProfileRequest.alphaSender
            ) &&
            Objects.equals(
                this.dailySpendLimit,
                createMessagingProfileRequest.dailySpendLimit
            ) &&
            Objects.equals(
                this.dailySpendLimitEnabled,
                createMessagingProfileRequest.dailySpendLimitEnabled
            ) &&
            Objects.equals(
                this.mmsFallBackToSms,
                createMessagingProfileRequest.mmsFallBackToSms
            ) &&
            Objects.equals(
                this.mmsTranscoding,
                createMessagingProfileRequest.mmsTranscoding
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
            name,
            whitelistedDestinations,
            enabled,
            hashCodeNullable(webhookUrl),
            hashCodeNullable(webhookFailoverUrl),
            webhookApiVersion,
            hashCodeNullable(numberPoolSettings),
            hashCodeNullable(urlShortenerSettings),
            hashCodeNullable(alphaSender),
            dailySpendLimit,
            dailySpendLimitEnabled,
            mmsFallBackToSms,
            mmsTranscoding
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
        sb.append("class CreateMessagingProfileRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb
            .append("    whitelistedDestinations: ")
            .append(toIndentedString(whitelistedDestinations))
            .append("\n");
        sb
            .append("    enabled: ")
            .append(toIndentedString(enabled))
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
            .append("    webhookApiVersion: ")
            .append(toIndentedString(webhookApiVersion))
            .append("\n");
        sb
            .append("    numberPoolSettings: ")
            .append(toIndentedString(numberPoolSettings))
            .append("\n");
        sb
            .append("    urlShortenerSettings: ")
            .append(toIndentedString(urlShortenerSettings))
            .append("\n");
        sb
            .append("    alphaSender: ")
            .append(toIndentedString(alphaSender))
            .append("\n");
        sb
            .append("    dailySpendLimit: ")
            .append(toIndentedString(dailySpendLimit))
            .append("\n");
        sb
            .append("    dailySpendLimitEnabled: ")
            .append(toIndentedString(dailySpendLimitEnabled))
            .append("\n");
        sb
            .append("    mmsFallBackToSms: ")
            .append(toIndentedString(mmsFallBackToSms))
            .append("\n");
        sb
            .append("    mmsTranscoding: ")
            .append(toIndentedString(mmsTranscoding))
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
