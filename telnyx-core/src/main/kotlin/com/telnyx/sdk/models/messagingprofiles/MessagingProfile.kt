// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingprofiles

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MessagingProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val alphaSender: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dailySpendLimit: JsonField<String>,
    private val dailySpendLimitEnabled: JsonField<Boolean>,
    private val enabled: JsonField<Boolean>,
    private val mmsFallBackToSms: JsonField<Boolean>,
    private val mmsTranscoding: JsonField<Boolean>,
    private val mobileOnly: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val numberPoolSettings: JsonField<NumberPoolSettings>,
    private val recordType: JsonField<RecordType>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val urlShortenerSettings: JsonField<UrlShortenerSettings>,
    private val v1Secret: JsonField<String>,
    private val webhookApiVersion: JsonField<WebhookApiVersion>,
    private val webhookFailoverUrl: JsonField<String>,
    private val webhookUrl: JsonField<String>,
    private val whitelistedDestinations: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alpha_sender")
        @ExcludeMissing
        alphaSender: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("daily_spend_limit")
        @ExcludeMissing
        dailySpendLimit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("daily_spend_limit_enabled")
        @ExcludeMissing
        dailySpendLimitEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mms_fall_back_to_sms")
        @ExcludeMissing
        mmsFallBackToSms: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mms_transcoding")
        @ExcludeMissing
        mmsTranscoding: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mobile_only")
        @ExcludeMissing
        mobileOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("number_pool_settings")
        @ExcludeMissing
        numberPoolSettings: JsonField<NumberPoolSettings> = JsonMissing.of(),
        @JsonProperty("record_type")
        @ExcludeMissing
        recordType: JsonField<RecordType> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url_shortener_settings")
        @ExcludeMissing
        urlShortenerSettings: JsonField<UrlShortenerSettings> = JsonMissing.of(),
        @JsonProperty("v1_secret") @ExcludeMissing v1Secret: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_api_version")
        @ExcludeMissing
        webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of(),
        @JsonProperty("webhook_failover_url")
        @ExcludeMissing
        webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhook_url")
        @ExcludeMissing
        webhookUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("whitelisted_destinations")
        @ExcludeMissing
        whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        alphaSender,
        createdAt,
        dailySpendLimit,
        dailySpendLimitEnabled,
        enabled,
        mmsFallBackToSms,
        mmsTranscoding,
        mobileOnly,
        name,
        numberPoolSettings,
        recordType,
        updatedAt,
        urlShortenerSettings,
        v1Secret,
        webhookApiVersion,
        webhookFailoverUrl,
        webhookUrl,
        whitelistedDestinations,
        mutableMapOf(),
    )

    /**
     * Identifies the type of resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The alphanumeric sender ID to use when sending to destinations that require an alphanumeric
     * sender ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alphaSender(): Optional<String> = alphaSender.getOptional("alpha_sender")

    /**
     * ISO 8601 formatted date indicating when the resource was created.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * The maximum amount of money (in USD) that can be spent by this profile before midnight UTC.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimit(): Optional<String> = dailySpendLimit.getOptional("daily_spend_limit")

    /**
     * Whether to enforce the value configured by `daily_spend_limit`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimitEnabled(): Optional<Boolean> =
        dailySpendLimitEnabled.getOptional("daily_spend_limit_enabled")

    /**
     * Specifies whether the messaging profile is enabled or not.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * enables SMS fallback for MMS messages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mmsFallBackToSms(): Optional<Boolean> = mmsFallBackToSms.getOptional("mms_fall_back_to_sms")

    /**
     * enables automated resizing of MMS media.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mmsTranscoding(): Optional<Boolean> = mmsTranscoding.getOptional("mms_transcoding")

    /**
     * Send messages only to mobile phone numbers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mobileOnly(): Optional<Boolean> = mobileOnly.getOptional("mobile_only")

    /**
     * A user friendly name for the messaging profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Number Pool allows you to send messages from a pool of numbers of different types, assigning
     * weights to each type. The pool consists of all the long code and toll free numbers assigned
     * to the messaging profile.
     *
     * To disable this feature, set the object field to `null`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numberPoolSettings(): Optional<NumberPoolSettings> =
        numberPoolSettings.getOptional("number_pool_settings")

    /**
     * Identifies the type of the resource.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordType(): Optional<RecordType> = recordType.getOptional("record_type")

    /**
     * ISO 8601 formatted date indicating when the resource was updated.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * The URL shortener feature allows automatic replacement of URLs that were generated using a
     * public URL shortener service. Some examples include bit.do, bit.ly, goo.gl, ht.ly, is.gd,
     * ow.ly, rebrand.ly, t.co, tiny.cc, and tinyurl.com. Such URLs are replaced with with links
     * generated by Telnyx. The use of custom links can improve branding and message deliverability.
     *
     * To disable this feature, set the object field to `null`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun urlShortenerSettings(): Optional<UrlShortenerSettings> =
        urlShortenerSettings.getOptional("url_shortener_settings")

    /**
     * Secret used to authenticate with v1 endpoints.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun v1Secret(): Optional<String> = v1Secret.getOptional("v1_secret")

    /**
     * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01
     * format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookApiVersion(): Optional<WebhookApiVersion> =
        webhookApiVersion.getOptional("webhook_api_version")

    /**
     * The failover URL where webhooks related to this messaging profile will be sent if sending to
     * the primary URL fails.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> =
        webhookFailoverUrl.getOptional("webhook_failover_url")

    /**
     * The URL where webhooks related to this messaging profile will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

    /**
     * Destinations to which the messaging profile is allowed to send. The elements in the list must
     * be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations will be
     * allowed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun whitelistedDestinations(): Optional<List<String>> =
        whitelistedDestinations.getOptional("whitelisted_destinations")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [alphaSender].
     *
     * Unlike [alphaSender], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alpha_sender")
    @ExcludeMissing
    fun _alphaSender(): JsonField<String> = alphaSender

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dailySpendLimit].
     *
     * Unlike [dailySpendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("daily_spend_limit")
    @ExcludeMissing
    fun _dailySpendLimit(): JsonField<String> = dailySpendLimit

    /**
     * Returns the raw JSON value of [dailySpendLimitEnabled].
     *
     * Unlike [dailySpendLimitEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("daily_spend_limit_enabled")
    @ExcludeMissing
    fun _dailySpendLimitEnabled(): JsonField<Boolean> = dailySpendLimitEnabled

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [mmsFallBackToSms].
     *
     * Unlike [mmsFallBackToSms], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mms_fall_back_to_sms")
    @ExcludeMissing
    fun _mmsFallBackToSms(): JsonField<Boolean> = mmsFallBackToSms

    /**
     * Returns the raw JSON value of [mmsTranscoding].
     *
     * Unlike [mmsTranscoding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mms_transcoding")
    @ExcludeMissing
    fun _mmsTranscoding(): JsonField<Boolean> = mmsTranscoding

    /**
     * Returns the raw JSON value of [mobileOnly].
     *
     * Unlike [mobileOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mobile_only") @ExcludeMissing fun _mobileOnly(): JsonField<Boolean> = mobileOnly

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [numberPoolSettings].
     *
     * Unlike [numberPoolSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("number_pool_settings")
    @ExcludeMissing
    fun _numberPoolSettings(): JsonField<NumberPoolSettings> = numberPoolSettings

    /**
     * Returns the raw JSON value of [recordType].
     *
     * Unlike [recordType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("record_type")
    @ExcludeMissing
    fun _recordType(): JsonField<RecordType> = recordType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [urlShortenerSettings].
     *
     * Unlike [urlShortenerSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("url_shortener_settings")
    @ExcludeMissing
    fun _urlShortenerSettings(): JsonField<UrlShortenerSettings> = urlShortenerSettings

    /**
     * Returns the raw JSON value of [v1Secret].
     *
     * Unlike [v1Secret], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("v1_secret") @ExcludeMissing fun _v1Secret(): JsonField<String> = v1Secret

    /**
     * Returns the raw JSON value of [webhookApiVersion].
     *
     * Unlike [webhookApiVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_api_version")
    @ExcludeMissing
    fun _webhookApiVersion(): JsonField<WebhookApiVersion> = webhookApiVersion

    /**
     * Returns the raw JSON value of [webhookFailoverUrl].
     *
     * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("webhook_failover_url")
    @ExcludeMissing
    fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhook_url") @ExcludeMissing fun _webhookUrl(): JsonField<String> = webhookUrl

    /**
     * Returns the raw JSON value of [whitelistedDestinations].
     *
     * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("whitelisted_destinations")
    @ExcludeMissing
    fun _whitelistedDestinations(): JsonField<List<String>> = whitelistedDestinations

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [MessagingProfile]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingProfile]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var alphaSender: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dailySpendLimit: JsonField<String> = JsonMissing.of()
        private var dailySpendLimitEnabled: JsonField<Boolean> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var mmsFallBackToSms: JsonField<Boolean> = JsonMissing.of()
        private var mmsTranscoding: JsonField<Boolean> = JsonMissing.of()
        private var mobileOnly: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var numberPoolSettings: JsonField<NumberPoolSettings> = JsonMissing.of()
        private var recordType: JsonField<RecordType> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var urlShortenerSettings: JsonField<UrlShortenerSettings> = JsonMissing.of()
        private var v1Secret: JsonField<String> = JsonMissing.of()
        private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
        private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
        private var webhookUrl: JsonField<String> = JsonMissing.of()
        private var whitelistedDestinations: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messagingProfile: MessagingProfile) = apply {
            id = messagingProfile.id
            alphaSender = messagingProfile.alphaSender
            createdAt = messagingProfile.createdAt
            dailySpendLimit = messagingProfile.dailySpendLimit
            dailySpendLimitEnabled = messagingProfile.dailySpendLimitEnabled
            enabled = messagingProfile.enabled
            mmsFallBackToSms = messagingProfile.mmsFallBackToSms
            mmsTranscoding = messagingProfile.mmsTranscoding
            mobileOnly = messagingProfile.mobileOnly
            name = messagingProfile.name
            numberPoolSettings = messagingProfile.numberPoolSettings
            recordType = messagingProfile.recordType
            updatedAt = messagingProfile.updatedAt
            urlShortenerSettings = messagingProfile.urlShortenerSettings
            v1Secret = messagingProfile.v1Secret
            webhookApiVersion = messagingProfile.webhookApiVersion
            webhookFailoverUrl = messagingProfile.webhookFailoverUrl
            webhookUrl = messagingProfile.webhookUrl
            whitelistedDestinations =
                messagingProfile.whitelistedDestinations.map { it.toMutableList() }
            additionalProperties = messagingProfile.additionalProperties.toMutableMap()
        }

        /** Identifies the type of resource. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The alphanumeric sender ID to use when sending to destinations that require an
         * alphanumeric sender ID.
         */
        fun alphaSender(alphaSender: String?) = alphaSender(JsonField.ofNullable(alphaSender))

        /** Alias for calling [Builder.alphaSender] with `alphaSender.orElse(null)`. */
        fun alphaSender(alphaSender: Optional<String>) = alphaSender(alphaSender.getOrNull())

        /**
         * Sets [Builder.alphaSender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alphaSender] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alphaSender(alphaSender: JsonField<String>) = apply { this.alphaSender = alphaSender }

        /** ISO 8601 formatted date indicating when the resource was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The maximum amount of money (in USD) that can be spent by this profile before midnight
         * UTC.
         */
        fun dailySpendLimit(dailySpendLimit: String) =
            dailySpendLimit(JsonField.of(dailySpendLimit))

        /**
         * Sets [Builder.dailySpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailySpendLimit(dailySpendLimit: JsonField<String>) = apply {
            this.dailySpendLimit = dailySpendLimit
        }

        /** Whether to enforce the value configured by `daily_spend_limit`. */
        fun dailySpendLimitEnabled(dailySpendLimitEnabled: Boolean) =
            dailySpendLimitEnabled(JsonField.of(dailySpendLimitEnabled))

        /**
         * Sets [Builder.dailySpendLimitEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimitEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dailySpendLimitEnabled(dailySpendLimitEnabled: JsonField<Boolean>) = apply {
            this.dailySpendLimitEnabled = dailySpendLimitEnabled
        }

        /** Specifies whether the messaging profile is enabled or not. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** enables SMS fallback for MMS messages. */
        fun mmsFallBackToSms(mmsFallBackToSms: Boolean) =
            mmsFallBackToSms(JsonField.of(mmsFallBackToSms))

        /**
         * Sets [Builder.mmsFallBackToSms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mmsFallBackToSms] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mmsFallBackToSms(mmsFallBackToSms: JsonField<Boolean>) = apply {
            this.mmsFallBackToSms = mmsFallBackToSms
        }

        /** enables automated resizing of MMS media. */
        fun mmsTranscoding(mmsTranscoding: Boolean) = mmsTranscoding(JsonField.of(mmsTranscoding))

        /**
         * Sets [Builder.mmsTranscoding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mmsTranscoding] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mmsTranscoding(mmsTranscoding: JsonField<Boolean>) = apply {
            this.mmsTranscoding = mmsTranscoding
        }

        /** Send messages only to mobile phone numbers. */
        fun mobileOnly(mobileOnly: Boolean) = mobileOnly(JsonField.of(mobileOnly))

        /**
         * Sets [Builder.mobileOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mobileOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mobileOnly(mobileOnly: JsonField<Boolean>) = apply { this.mobileOnly = mobileOnly }

        /** A user friendly name for the messaging profile. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Number Pool allows you to send messages from a pool of numbers of different types,
         * assigning weights to each type. The pool consists of all the long code and toll free
         * numbers assigned to the messaging profile.
         *
         * To disable this feature, set the object field to `null`.
         */
        fun numberPoolSettings(numberPoolSettings: NumberPoolSettings?) =
            numberPoolSettings(JsonField.ofNullable(numberPoolSettings))

        /**
         * Alias for calling [Builder.numberPoolSettings] with `numberPoolSettings.orElse(null)`.
         */
        fun numberPoolSettings(numberPoolSettings: Optional<NumberPoolSettings>) =
            numberPoolSettings(numberPoolSettings.getOrNull())

        /**
         * Sets [Builder.numberPoolSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numberPoolSettings] with a well-typed
         * [NumberPoolSettings] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun numberPoolSettings(numberPoolSettings: JsonField<NumberPoolSettings>) = apply {
            this.numberPoolSettings = numberPoolSettings
        }

        /** Identifies the type of the resource. */
        fun recordType(recordType: RecordType) = recordType(JsonField.of(recordType))

        /**
         * Sets [Builder.recordType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordType] with a well-typed [RecordType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordType(recordType: JsonField<RecordType>) = apply { this.recordType = recordType }

        /** ISO 8601 formatted date indicating when the resource was updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * The URL shortener feature allows automatic replacement of URLs that were generated using
         * a public URL shortener service. Some examples include bit.do, bit.ly, goo.gl, ht.ly,
         * is.gd, ow.ly, rebrand.ly, t.co, tiny.cc, and tinyurl.com. Such URLs are replaced with
         * with links generated by Telnyx. The use of custom links can improve branding and message
         * deliverability.
         *
         * To disable this feature, set the object field to `null`.
         */
        fun urlShortenerSettings(urlShortenerSettings: UrlShortenerSettings?) =
            urlShortenerSettings(JsonField.ofNullable(urlShortenerSettings))

        /**
         * Alias for calling [Builder.urlShortenerSettings] with
         * `urlShortenerSettings.orElse(null)`.
         */
        fun urlShortenerSettings(urlShortenerSettings: Optional<UrlShortenerSettings>) =
            urlShortenerSettings(urlShortenerSettings.getOrNull())

        /**
         * Sets [Builder.urlShortenerSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urlShortenerSettings] with a well-typed
         * [UrlShortenerSettings] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun urlShortenerSettings(urlShortenerSettings: JsonField<UrlShortenerSettings>) = apply {
            this.urlShortenerSettings = urlShortenerSettings
        }

        /** Secret used to authenticate with v1 endpoints. */
        fun v1Secret(v1Secret: String) = v1Secret(JsonField.of(v1Secret))

        /**
         * Sets [Builder.v1Secret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.v1Secret] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun v1Secret(v1Secret: JsonField<String>) = apply { this.v1Secret = v1Secret }

        /**
         * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01
         * format.
         */
        fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) =
            webhookApiVersion(JsonField.of(webhookApiVersion))

        /**
         * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookApiVersion] with a well-typed [WebhookApiVersion]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
            this.webhookApiVersion = webhookApiVersion
        }

        /**
         * The failover URL where webhooks related to this messaging profile will be sent if sending
         * to the primary URL fails.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: String?) =
            webhookFailoverUrl(JsonField.ofNullable(webhookFailoverUrl))

        /**
         * Alias for calling [Builder.webhookFailoverUrl] with `webhookFailoverUrl.orElse(null)`.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: Optional<String>) =
            webhookFailoverUrl(webhookFailoverUrl.getOrNull())

        /**
         * Sets [Builder.webhookFailoverUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookFailoverUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: JsonField<String>) = apply {
            this.webhookFailoverUrl = webhookFailoverUrl
        }

        /** The URL where webhooks related to this messaging profile will be sent. */
        fun webhookUrl(webhookUrl: String?) = webhookUrl(JsonField.ofNullable(webhookUrl))

        /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
        fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

        /**
         * Destinations to which the messaging profile is allowed to send. The elements in the list
         * must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]`, all destinations will
         * be allowed.
         */
        fun whitelistedDestinations(whitelistedDestinations: List<String>) =
            whitelistedDestinations(JsonField.of(whitelistedDestinations))

        /**
         * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whitelistedDestinations] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
            this.whitelistedDestinations = whitelistedDestinations.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [whitelistedDestinations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWhitelistedDestination(whitelistedDestination: String) = apply {
            whitelistedDestinations =
                (whitelistedDestinations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("whitelistedDestinations", it).add(whitelistedDestination)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [MessagingProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MessagingProfile =
            MessagingProfile(
                id,
                alphaSender,
                createdAt,
                dailySpendLimit,
                dailySpendLimitEnabled,
                enabled,
                mmsFallBackToSms,
                mmsTranscoding,
                mobileOnly,
                name,
                numberPoolSettings,
                recordType,
                updatedAt,
                urlShortenerSettings,
                v1Secret,
                webhookApiVersion,
                webhookFailoverUrl,
                webhookUrl,
                (whitelistedDestinations ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessagingProfile = apply {
        if (validated) {
            return@apply
        }

        id()
        alphaSender()
        createdAt()
        dailySpendLimit()
        dailySpendLimitEnabled()
        enabled()
        mmsFallBackToSms()
        mmsTranscoding()
        mobileOnly()
        name()
        numberPoolSettings().ifPresent { it.validate() }
        recordType().ifPresent { it.validate() }
        updatedAt()
        urlShortenerSettings().ifPresent { it.validate() }
        v1Secret()
        webhookApiVersion().ifPresent { it.validate() }
        webhookFailoverUrl()
        webhookUrl()
        whitelistedDestinations()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: TelnyxInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (alphaSender.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (dailySpendLimit.asKnown().isPresent) 1 else 0) +
            (if (dailySpendLimitEnabled.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (mmsFallBackToSms.asKnown().isPresent) 1 else 0) +
            (if (mmsTranscoding.asKnown().isPresent) 1 else 0) +
            (if (mobileOnly.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (numberPoolSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (recordType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (urlShortenerSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (v1Secret.asKnown().isPresent) 1 else 0) +
            (webhookApiVersion.asKnown().getOrNull()?.validity() ?: 0) +
            (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
            (if (webhookUrl.asKnown().isPresent) 1 else 0) +
            (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0)

    /** Identifies the type of the resource. */
    class RecordType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MESSAGING_PROFILE = of("messaging_profile")

            @JvmStatic fun of(value: String) = RecordType(JsonField.of(value))
        }

        /** An enum containing [RecordType]'s known values. */
        enum class Known {
            MESSAGING_PROFILE
        }

        /**
         * An enum containing [RecordType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MESSAGING_PROFILE,
            /**
             * An enum member indicating that [RecordType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                MESSAGING_PROFILE -> Value.MESSAGING_PROFILE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                MESSAGING_PROFILE -> Known.MESSAGING_PROFILE
                else -> throw TelnyxInvalidDataException("Unknown RecordType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): RecordType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RecordType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01
     * format.
     */
    class WebhookApiVersion @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val V1 = of("1")

            @JvmField val V2 = of("2")

            @JvmField val V2010_04_01 = of("2010-04-01")

            @JvmStatic fun of(value: String) = WebhookApiVersion(JsonField.of(value))
        }

        /** An enum containing [WebhookApiVersion]'s known values. */
        enum class Known {
            V1,
            V2,
            V2010_04_01,
        }

        /**
         * An enum containing [WebhookApiVersion]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [WebhookApiVersion] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            V1,
            V2,
            V2010_04_01,
            /**
             * An enum member indicating that [WebhookApiVersion] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                V1 -> Value.V1
                V2 -> Value.V2
                V2010_04_01 -> Value.V2010_04_01
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                V1 -> Known.V1
                V2 -> Known.V2
                V2010_04_01 -> Known.V2010_04_01
                else -> throw TelnyxInvalidDataException("Unknown WebhookApiVersion: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): WebhookApiVersion = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: TelnyxInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WebhookApiVersion && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingProfile &&
            id == other.id &&
            alphaSender == other.alphaSender &&
            createdAt == other.createdAt &&
            dailySpendLimit == other.dailySpendLimit &&
            dailySpendLimitEnabled == other.dailySpendLimitEnabled &&
            enabled == other.enabled &&
            mmsFallBackToSms == other.mmsFallBackToSms &&
            mmsTranscoding == other.mmsTranscoding &&
            mobileOnly == other.mobileOnly &&
            name == other.name &&
            numberPoolSettings == other.numberPoolSettings &&
            recordType == other.recordType &&
            updatedAt == other.updatedAt &&
            urlShortenerSettings == other.urlShortenerSettings &&
            v1Secret == other.v1Secret &&
            webhookApiVersion == other.webhookApiVersion &&
            webhookFailoverUrl == other.webhookFailoverUrl &&
            webhookUrl == other.webhookUrl &&
            whitelistedDestinations == other.whitelistedDestinations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            alphaSender,
            createdAt,
            dailySpendLimit,
            dailySpendLimitEnabled,
            enabled,
            mmsFallBackToSms,
            mmsTranscoding,
            mobileOnly,
            name,
            numberPoolSettings,
            recordType,
            updatedAt,
            urlShortenerSettings,
            v1Secret,
            webhookApiVersion,
            webhookFailoverUrl,
            webhookUrl,
            whitelistedDestinations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessagingProfile{id=$id, alphaSender=$alphaSender, createdAt=$createdAt, dailySpendLimit=$dailySpendLimit, dailySpendLimitEnabled=$dailySpendLimitEnabled, enabled=$enabled, mmsFallBackToSms=$mmsFallBackToSms, mmsTranscoding=$mmsTranscoding, mobileOnly=$mobileOnly, name=$name, numberPoolSettings=$numberPoolSettings, recordType=$recordType, updatedAt=$updatedAt, urlShortenerSettings=$urlShortenerSettings, v1Secret=$v1Secret, webhookApiVersion=$webhookApiVersion, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, whitelistedDestinations=$whitelistedDestinations, additionalProperties=$additionalProperties}"
}
