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
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a messaging profile */
class MessagingProfileCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A user friendly name for the messaging profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * Destinations to which the messaging profile is allowed to send. The elements in the list must
     * be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]` all destinations will be
     * allowed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun whitelistedDestinations(): List<String> = body.whitelistedDestinations()

    /**
     * The alphanumeric sender ID to use when sending to destinations that require an alphanumeric
     * sender ID.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alphaSender(): Optional<String> = body.alphaSender()

    /**
     * The maximum amount of money (in USD) that can be spent by this profile before midnight UTC.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimit(): Optional<String> = body.dailySpendLimit()

    /**
     * Whether to enforce the value configured by `daily_spend_limit`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dailySpendLimitEnabled(): Optional<Boolean> = body.dailySpendLimitEnabled()

    /**
     * Specifies whether the messaging profile is enabled or not.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = body.enabled()

    /**
     * enables SMS fallback for MMS messages.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mmsFallBackToSms(): Optional<Boolean> = body.mmsFallBackToSms()

    /**
     * enables automated resizing of MMS media.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mmsTranscoding(): Optional<Boolean> = body.mmsTranscoding()

    /**
     * Send messages only to mobile phone numbers.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mobileOnly(): Optional<Boolean> = body.mobileOnly()

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
    fun numberPoolSettings(): Optional<NumberPoolSettings> = body.numberPoolSettings()

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
    fun urlShortenerSettings(): Optional<UrlShortenerSettings> = body.urlShortenerSettings()

    /**
     * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01
     * format.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookApiVersion(): Optional<WebhookApiVersion> = body.webhookApiVersion()

    /**
     * The failover URL where webhooks related to this messaging profile will be sent if sending to
     * the primary URL fails.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> = body.webhookFailoverUrl()

    /**
     * The URL where webhooks related to this messaging profile will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [whitelistedDestinations].
     *
     * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _whitelistedDestinations(): JsonField<List<String>> = body._whitelistedDestinations()

    /**
     * Returns the raw JSON value of [alphaSender].
     *
     * Unlike [alphaSender], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _alphaSender(): JsonField<String> = body._alphaSender()

    /**
     * Returns the raw JSON value of [dailySpendLimit].
     *
     * Unlike [dailySpendLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dailySpendLimit(): JsonField<String> = body._dailySpendLimit()

    /**
     * Returns the raw JSON value of [dailySpendLimitEnabled].
     *
     * Unlike [dailySpendLimitEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _dailySpendLimitEnabled(): JsonField<Boolean> = body._dailySpendLimitEnabled()

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _enabled(): JsonField<Boolean> = body._enabled()

    /**
     * Returns the raw JSON value of [mmsFallBackToSms].
     *
     * Unlike [mmsFallBackToSms], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _mmsFallBackToSms(): JsonField<Boolean> = body._mmsFallBackToSms()

    /**
     * Returns the raw JSON value of [mmsTranscoding].
     *
     * Unlike [mmsTranscoding], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mmsTranscoding(): JsonField<Boolean> = body._mmsTranscoding()

    /**
     * Returns the raw JSON value of [mobileOnly].
     *
     * Unlike [mobileOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mobileOnly(): JsonField<Boolean> = body._mobileOnly()

    /**
     * Returns the raw JSON value of [numberPoolSettings].
     *
     * Unlike [numberPoolSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _numberPoolSettings(): JsonField<NumberPoolSettings> = body._numberPoolSettings()

    /**
     * Returns the raw JSON value of [urlShortenerSettings].
     *
     * Unlike [urlShortenerSettings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _urlShortenerSettings(): JsonField<UrlShortenerSettings> = body._urlShortenerSettings()

    /**
     * Returns the raw JSON value of [webhookApiVersion].
     *
     * Unlike [webhookApiVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookApiVersion(): JsonField<WebhookApiVersion> = body._webhookApiVersion()

    /**
     * Returns the raw JSON value of [webhookFailoverUrl].
     *
     * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _webhookFailoverUrl(): JsonField<String> = body._webhookFailoverUrl()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessagingProfileCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .whitelistedDestinations()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessagingProfileCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messagingProfileCreateParams: MessagingProfileCreateParams) = apply {
            body = messagingProfileCreateParams.body.toBuilder()
            additionalHeaders = messagingProfileCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = messagingProfileCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [whitelistedDestinations]
         * - [alphaSender]
         * - [dailySpendLimit]
         * - [dailySpendLimitEnabled]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A user friendly name for the messaging profile. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Destinations to which the messaging profile is allowed to send. The elements in the list
         * must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]` all destinations will
         * be allowed.
         */
        fun whitelistedDestinations(whitelistedDestinations: List<String>) = apply {
            body.whitelistedDestinations(whitelistedDestinations)
        }

        /**
         * Sets [Builder.whitelistedDestinations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.whitelistedDestinations] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun whitelistedDestinations(whitelistedDestinations: JsonField<List<String>>) = apply {
            body.whitelistedDestinations(whitelistedDestinations)
        }

        /**
         * Adds a single [String] to [whitelistedDestinations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWhitelistedDestination(whitelistedDestination: String) = apply {
            body.addWhitelistedDestination(whitelistedDestination)
        }

        /**
         * The alphanumeric sender ID to use when sending to destinations that require an
         * alphanumeric sender ID.
         */
        fun alphaSender(alphaSender: String?) = apply { body.alphaSender(alphaSender) }

        /** Alias for calling [Builder.alphaSender] with `alphaSender.orElse(null)`. */
        fun alphaSender(alphaSender: Optional<String>) = alphaSender(alphaSender.getOrNull())

        /**
         * Sets [Builder.alphaSender] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alphaSender] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alphaSender(alphaSender: JsonField<String>) = apply { body.alphaSender(alphaSender) }

        /**
         * The maximum amount of money (in USD) that can be spent by this profile before midnight
         * UTC.
         */
        fun dailySpendLimit(dailySpendLimit: String) = apply {
            body.dailySpendLimit(dailySpendLimit)
        }

        /**
         * Sets [Builder.dailySpendLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimit] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dailySpendLimit(dailySpendLimit: JsonField<String>) = apply {
            body.dailySpendLimit(dailySpendLimit)
        }

        /** Whether to enforce the value configured by `daily_spend_limit`. */
        fun dailySpendLimitEnabled(dailySpendLimitEnabled: Boolean) = apply {
            body.dailySpendLimitEnabled(dailySpendLimitEnabled)
        }

        /**
         * Sets [Builder.dailySpendLimitEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailySpendLimitEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dailySpendLimitEnabled(dailySpendLimitEnabled: JsonField<Boolean>) = apply {
            body.dailySpendLimitEnabled(dailySpendLimitEnabled)
        }

        /** Specifies whether the messaging profile is enabled or not. */
        fun enabled(enabled: Boolean) = apply { body.enabled(enabled) }

        /**
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { body.enabled(enabled) }

        /** enables SMS fallback for MMS messages. */
        fun mmsFallBackToSms(mmsFallBackToSms: Boolean) = apply {
            body.mmsFallBackToSms(mmsFallBackToSms)
        }

        /**
         * Sets [Builder.mmsFallBackToSms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mmsFallBackToSms] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mmsFallBackToSms(mmsFallBackToSms: JsonField<Boolean>) = apply {
            body.mmsFallBackToSms(mmsFallBackToSms)
        }

        /** enables automated resizing of MMS media. */
        fun mmsTranscoding(mmsTranscoding: Boolean) = apply { body.mmsTranscoding(mmsTranscoding) }

        /**
         * Sets [Builder.mmsTranscoding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mmsTranscoding] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mmsTranscoding(mmsTranscoding: JsonField<Boolean>) = apply {
            body.mmsTranscoding(mmsTranscoding)
        }

        /** Send messages only to mobile phone numbers. */
        fun mobileOnly(mobileOnly: Boolean) = apply { body.mobileOnly(mobileOnly) }

        /**
         * Sets [Builder.mobileOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mobileOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mobileOnly(mobileOnly: JsonField<Boolean>) = apply { body.mobileOnly(mobileOnly) }

        /**
         * Number Pool allows you to send messages from a pool of numbers of different types,
         * assigning weights to each type. The pool consists of all the long code and toll free
         * numbers assigned to the messaging profile.
         *
         * To disable this feature, set the object field to `null`.
         */
        fun numberPoolSettings(numberPoolSettings: NumberPoolSettings?) = apply {
            body.numberPoolSettings(numberPoolSettings)
        }

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
            body.numberPoolSettings(numberPoolSettings)
        }

        /**
         * The URL shortener feature allows automatic replacement of URLs that were generated using
         * a public URL shortener service. Some examples include bit.do, bit.ly, goo.gl, ht.ly,
         * is.gd, ow.ly, rebrand.ly, t.co, tiny.cc, and tinyurl.com. Such URLs are replaced with
         * with links generated by Telnyx. The use of custom links can improve branding and message
         * deliverability.
         *
         * To disable this feature, set the object field to `null`.
         */
        fun urlShortenerSettings(urlShortenerSettings: UrlShortenerSettings?) = apply {
            body.urlShortenerSettings(urlShortenerSettings)
        }

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
            body.urlShortenerSettings(urlShortenerSettings)
        }

        /**
         * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy 2010-04-01
         * format.
         */
        fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) = apply {
            body.webhookApiVersion(webhookApiVersion)
        }

        /**
         * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookApiVersion] with a well-typed [WebhookApiVersion]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
            body.webhookApiVersion(webhookApiVersion)
        }

        /**
         * The failover URL where webhooks related to this messaging profile will be sent if sending
         * to the primary URL fails.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: String?) = apply {
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

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
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

        /** The URL where webhooks related to this messaging profile will be sent. */
        fun webhookUrl(webhookUrl: String?) = apply { body.webhookUrl(webhookUrl) }

        /** Alias for calling [Builder.webhookUrl] with `webhookUrl.orElse(null)`. */
        fun webhookUrl(webhookUrl: Optional<String>) = webhookUrl(webhookUrl.getOrNull())

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [MessagingProfileCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .whitelistedDestinations()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessagingProfileCreateParams =
            MessagingProfileCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val whitelistedDestinations: JsonField<List<String>>,
        private val alphaSender: JsonField<String>,
        private val dailySpendLimit: JsonField<String>,
        private val dailySpendLimitEnabled: JsonField<Boolean>,
        private val enabled: JsonField<Boolean>,
        private val mmsFallBackToSms: JsonField<Boolean>,
        private val mmsTranscoding: JsonField<Boolean>,
        private val mobileOnly: JsonField<Boolean>,
        private val numberPoolSettings: JsonField<NumberPoolSettings>,
        private val urlShortenerSettings: JsonField<UrlShortenerSettings>,
        private val webhookApiVersion: JsonField<WebhookApiVersion>,
        private val webhookFailoverUrl: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("whitelisted_destinations")
            @ExcludeMissing
            whitelistedDestinations: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("alpha_sender")
            @ExcludeMissing
            alphaSender: JsonField<String> = JsonMissing.of(),
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
            @JsonProperty("number_pool_settings")
            @ExcludeMissing
            numberPoolSettings: JsonField<NumberPoolSettings> = JsonMissing.of(),
            @JsonProperty("url_shortener_settings")
            @ExcludeMissing
            urlShortenerSettings: JsonField<UrlShortenerSettings> = JsonMissing.of(),
            @JsonProperty("webhook_api_version")
            @ExcludeMissing
            webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of(),
            @JsonProperty("webhook_failover_url")
            @ExcludeMissing
            webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            whitelistedDestinations,
            alphaSender,
            dailySpendLimit,
            dailySpendLimitEnabled,
            enabled,
            mmsFallBackToSms,
            mmsTranscoding,
            mobileOnly,
            numberPoolSettings,
            urlShortenerSettings,
            webhookApiVersion,
            webhookFailoverUrl,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * A user friendly name for the messaging profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Destinations to which the messaging profile is allowed to send. The elements in the list
         * must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]` all destinations will
         * be allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun whitelistedDestinations(): List<String> =
            whitelistedDestinations.getRequired("whitelisted_destinations")

        /**
         * The alphanumeric sender ID to use when sending to destinations that require an
         * alphanumeric sender ID.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun alphaSender(): Optional<String> = alphaSender.getOptional("alpha_sender")

        /**
         * The maximum amount of money (in USD) that can be spent by this profile before midnight
         * UTC.
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
        fun mmsFallBackToSms(): Optional<Boolean> =
            mmsFallBackToSms.getOptional("mms_fall_back_to_sms")

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
         * Number Pool allows you to send messages from a pool of numbers of different types,
         * assigning weights to each type. The pool consists of all the long code and toll free
         * numbers assigned to the messaging profile.
         *
         * To disable this feature, set the object field to `null`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numberPoolSettings(): Optional<NumberPoolSettings> =
            numberPoolSettings.getOptional("number_pool_settings")

        /**
         * The URL shortener feature allows automatic replacement of URLs that were generated using
         * a public URL shortener service. Some examples include bit.do, bit.ly, goo.gl, ht.ly,
         * is.gd, ow.ly, rebrand.ly, t.co, tiny.cc, and tinyurl.com. Such URLs are replaced with
         * with links generated by Telnyx. The use of custom links can improve branding and message
         * deliverability.
         *
         * To disable this feature, set the object field to `null`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun urlShortenerSettings(): Optional<UrlShortenerSettings> =
            urlShortenerSettings.getOptional("url_shortener_settings")

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
         * The failover URL where webhooks related to this messaging profile will be sent if sending
         * to the primary URL fails.
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
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [whitelistedDestinations].
         *
         * Unlike [whitelistedDestinations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("whitelisted_destinations")
        @ExcludeMissing
        fun _whitelistedDestinations(): JsonField<List<String>> = whitelistedDestinations

        /**
         * Returns the raw JSON value of [alphaSender].
         *
         * Unlike [alphaSender], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alpha_sender")
        @ExcludeMissing
        fun _alphaSender(): JsonField<String> = alphaSender

        /**
         * Returns the raw JSON value of [dailySpendLimit].
         *
         * Unlike [dailySpendLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [mmsTranscoding], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mms_transcoding")
        @ExcludeMissing
        fun _mmsTranscoding(): JsonField<Boolean> = mmsTranscoding

        /**
         * Returns the raw JSON value of [mobileOnly].
         *
         * Unlike [mobileOnly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mobile_only")
        @ExcludeMissing
        fun _mobileOnly(): JsonField<Boolean> = mobileOnly

        /**
         * Returns the raw JSON value of [numberPoolSettings].
         *
         * Unlike [numberPoolSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("number_pool_settings")
        @ExcludeMissing
        fun _numberPoolSettings(): JsonField<NumberPoolSettings> = numberPoolSettings

        /**
         * Returns the raw JSON value of [urlShortenerSettings].
         *
         * Unlike [urlShortenerSettings], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("url_shortener_settings")
        @ExcludeMissing
        fun _urlShortenerSettings(): JsonField<UrlShortenerSettings> = urlShortenerSettings

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
         * Unlike [webhookFailoverUrl], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("webhook_failover_url")
        @ExcludeMissing
        fun _webhookFailoverUrl(): JsonField<String> = webhookFailoverUrl

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .whitelistedDestinations()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var whitelistedDestinations: JsonField<MutableList<String>>? = null
            private var alphaSender: JsonField<String> = JsonMissing.of()
            private var dailySpendLimit: JsonField<String> = JsonMissing.of()
            private var dailySpendLimitEnabled: JsonField<Boolean> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var mmsFallBackToSms: JsonField<Boolean> = JsonMissing.of()
            private var mmsTranscoding: JsonField<Boolean> = JsonMissing.of()
            private var mobileOnly: JsonField<Boolean> = JsonMissing.of()
            private var numberPoolSettings: JsonField<NumberPoolSettings> = JsonMissing.of()
            private var urlShortenerSettings: JsonField<UrlShortenerSettings> = JsonMissing.of()
            private var webhookApiVersion: JsonField<WebhookApiVersion> = JsonMissing.of()
            private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                whitelistedDestinations = body.whitelistedDestinations.map { it.toMutableList() }
                alphaSender = body.alphaSender
                dailySpendLimit = body.dailySpendLimit
                dailySpendLimitEnabled = body.dailySpendLimitEnabled
                enabled = body.enabled
                mmsFallBackToSms = body.mmsFallBackToSms
                mmsTranscoding = body.mmsTranscoding
                mobileOnly = body.mobileOnly
                numberPoolSettings = body.numberPoolSettings
                urlShortenerSettings = body.urlShortenerSettings
                webhookApiVersion = body.webhookApiVersion
                webhookFailoverUrl = body.webhookFailoverUrl
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A user friendly name for the messaging profile. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Destinations to which the messaging profile is allowed to send. The elements in the
             * list must be valid ISO 3166-1 alpha-2 country codes. If set to `["*"]` all
             * destinations will be allowed.
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
             * You should usually call [Builder.alphaSender] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alphaSender(alphaSender: JsonField<String>) = apply {
                this.alphaSender = alphaSender
            }

            /**
             * The maximum amount of money (in USD) that can be spent by this profile before
             * midnight UTC.
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
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dailySpendLimitEnabled(dailySpendLimitEnabled: JsonField<Boolean>) = apply {
                this.dailySpendLimitEnabled = dailySpendLimitEnabled
            }

            /** Specifies whether the messaging profile is enabled or not. */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun mmsTranscoding(mmsTranscoding: Boolean) =
                mmsTranscoding(JsonField.of(mmsTranscoding))

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
             * You should usually call [Builder.mobileOnly] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mobileOnly(mobileOnly: JsonField<Boolean>) = apply { this.mobileOnly = mobileOnly }

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
             * Alias for calling [Builder.numberPoolSettings] with
             * `numberPoolSettings.orElse(null)`.
             */
            fun numberPoolSettings(numberPoolSettings: Optional<NumberPoolSettings>) =
                numberPoolSettings(numberPoolSettings.getOrNull())

            /**
             * Sets [Builder.numberPoolSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numberPoolSettings] with a well-typed
             * [NumberPoolSettings] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun numberPoolSettings(numberPoolSettings: JsonField<NumberPoolSettings>) = apply {
                this.numberPoolSettings = numberPoolSettings
            }

            /**
             * The URL shortener feature allows automatic replacement of URLs that were generated
             * using a public URL shortener service. Some examples include bit.do, bit.ly, goo.gl,
             * ht.ly, is.gd, ow.ly, rebrand.ly, t.co, tiny.cc, and tinyurl.com. Such URLs are
             * replaced with with links generated by Telnyx. The use of custom links can improve
             * branding and message deliverability.
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
             * [UrlShortenerSettings] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun urlShortenerSettings(urlShortenerSettings: JsonField<UrlShortenerSettings>) =
                apply {
                    this.urlShortenerSettings = urlShortenerSettings
                }

            /**
             * Determines which webhook format will be used, Telnyx API v1, v2, or a legacy
             * 2010-04-01 format.
             */
            fun webhookApiVersion(webhookApiVersion: WebhookApiVersion) =
                webhookApiVersion(JsonField.of(webhookApiVersion))

            /**
             * Sets [Builder.webhookApiVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookApiVersion] with a well-typed
             * [WebhookApiVersion] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun webhookApiVersion(webhookApiVersion: JsonField<WebhookApiVersion>) = apply {
                this.webhookApiVersion = webhookApiVersion
            }

            /**
             * The failover URL where webhooks related to this messaging profile will be sent if
             * sending to the primary URL fails.
             */
            fun webhookFailoverUrl(webhookFailoverUrl: String?) =
                webhookFailoverUrl(JsonField.ofNullable(webhookFailoverUrl))

            /**
             * Alias for calling [Builder.webhookFailoverUrl] with
             * `webhookFailoverUrl.orElse(null)`.
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
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .whitelistedDestinations()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("whitelistedDestinations", whitelistedDestinations).map {
                        it.toImmutable()
                    },
                    alphaSender,
                    dailySpendLimit,
                    dailySpendLimitEnabled,
                    enabled,
                    mmsFallBackToSms,
                    mmsTranscoding,
                    mobileOnly,
                    numberPoolSettings,
                    urlShortenerSettings,
                    webhookApiVersion,
                    webhookFailoverUrl,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            whitelistedDestinations()
            alphaSender()
            dailySpendLimit()
            dailySpendLimitEnabled()
            enabled()
            mmsFallBackToSms()
            mmsTranscoding()
            mobileOnly()
            numberPoolSettings().ifPresent { it.validate() }
            urlShortenerSettings().ifPresent { it.validate() }
            webhookApiVersion().ifPresent { it.validate() }
            webhookFailoverUrl()
            webhookUrl()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (whitelistedDestinations.asKnown().getOrNull()?.size ?: 0) +
                (if (alphaSender.asKnown().isPresent) 1 else 0) +
                (if (dailySpendLimit.asKnown().isPresent) 1 else 0) +
                (if (dailySpendLimitEnabled.asKnown().isPresent) 1 else 0) +
                (if (enabled.asKnown().isPresent) 1 else 0) +
                (if (mmsFallBackToSms.asKnown().isPresent) 1 else 0) +
                (if (mmsTranscoding.asKnown().isPresent) 1 else 0) +
                (if (mobileOnly.asKnown().isPresent) 1 else 0) +
                (numberPoolSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (urlShortenerSettings.asKnown().getOrNull()?.validity() ?: 0) +
                (webhookApiVersion.asKnown().getOrNull()?.validity() ?: 0) +
                (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                whitelistedDestinations == other.whitelistedDestinations &&
                alphaSender == other.alphaSender &&
                dailySpendLimit == other.dailySpendLimit &&
                dailySpendLimitEnabled == other.dailySpendLimitEnabled &&
                enabled == other.enabled &&
                mmsFallBackToSms == other.mmsFallBackToSms &&
                mmsTranscoding == other.mmsTranscoding &&
                mobileOnly == other.mobileOnly &&
                numberPoolSettings == other.numberPoolSettings &&
                urlShortenerSettings == other.urlShortenerSettings &&
                webhookApiVersion == other.webhookApiVersion &&
                webhookFailoverUrl == other.webhookFailoverUrl &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                whitelistedDestinations,
                alphaSender,
                dailySpendLimit,
                dailySpendLimitEnabled,
                enabled,
                mmsFallBackToSms,
                mmsTranscoding,
                mobileOnly,
                numberPoolSettings,
                urlShortenerSettings,
                webhookApiVersion,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, whitelistedDestinations=$whitelistedDestinations, alphaSender=$alphaSender, dailySpendLimit=$dailySpendLimit, dailySpendLimitEnabled=$dailySpendLimitEnabled, enabled=$enabled, mmsFallBackToSms=$mmsFallBackToSms, mmsTranscoding=$mmsTranscoding, mobileOnly=$mobileOnly, numberPoolSettings=$numberPoolSettings, urlShortenerSettings=$urlShortenerSettings, webhookApiVersion=$webhookApiVersion, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
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

        return other is MessagingProfileCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessagingProfileCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
