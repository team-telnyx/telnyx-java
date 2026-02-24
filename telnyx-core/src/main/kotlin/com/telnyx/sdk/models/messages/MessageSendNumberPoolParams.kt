// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messages

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

/** Send a message using number pool */
class MessageSendNumberPoolParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Unique identifier for a messaging profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messagingProfileId(): String = body.messagingProfileId()

    /**
     * Receiving address (+E.164 formatted phone number or short code).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * Automatically detect if an SMS message is unusually long and exceeds a recommended limit of
     * message parts.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun autoDetect(): Optional<Boolean> = body.autoDetect()

    /**
     * Encoding to use for the message. `auto` (default) uses smart encoding to automatically select
     * the most efficient encoding. `gsm7` forces GSM-7 encoding (returns 400 if message contains
     * characters that cannot be encoded). `ucs2` forces UCS-2 encoding and disables smart encoding.
     * When set, this overrides the messaging profile's `smart_encoding` setting.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encoding(): Optional<Encoding> = body.encoding()

    /**
     * A list of media URLs. The total media size must be less than 1 MB.
     *
     * **Required for MMS**
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mediaUrls(): Optional<List<String>> = body.mediaUrls()

    /**
     * Subject of multimedia message
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = body.subject()

    /**
     * Message body (i.e., content) as a non-empty string.
     *
     * **Required for SMS**
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

    /**
     * The protocol for sending the message, either SMS or MMS.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = body.type()

    /**
     * If the profile this number is associated with has webhooks, use them for delivery
     * notifications. If webhooks are also specified on the message itself, they will be attempted
     * first, then those on the profile.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useProfileWebhooks(): Optional<Boolean> = body.useProfileWebhooks()

    /**
     * The failover URL where webhooks related to this message will be sent if sending to the
     * primary URL fails.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookFailoverUrl(): Optional<String> = body.webhookFailoverUrl()

    /**
     * The URL where webhooks related to this message will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [messagingProfileId].
     *
     * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messagingProfileId(): JsonField<String> = body._messagingProfileId()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

    /**
     * Returns the raw JSON value of [autoDetect].
     *
     * Unlike [autoDetect], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoDetect(): JsonField<Boolean> = body._autoDetect()

    /**
     * Returns the raw JSON value of [encoding].
     *
     * Unlike [encoding], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _encoding(): JsonField<Encoding> = body._encoding()

    /**
     * Returns the raw JSON value of [mediaUrls].
     *
     * Unlike [mediaUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _mediaUrls(): JsonField<List<String>> = body._mediaUrls()

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _subject(): JsonField<String> = body._subject()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [useProfileWebhooks].
     *
     * Unlike [useProfileWebhooks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _useProfileWebhooks(): JsonField<Boolean> = body._useProfileWebhooks()

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
         * Returns a mutable builder for constructing an instance of [MessageSendNumberPoolParams].
         *
         * The following fields are required:
         * ```java
         * .messagingProfileId()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageSendNumberPoolParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageSendNumberPoolParams: MessageSendNumberPoolParams) = apply {
            body = messageSendNumberPoolParams.body.toBuilder()
            additionalHeaders = messageSendNumberPoolParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageSendNumberPoolParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [messagingProfileId]
         * - [to]
         * - [autoDetect]
         * - [encoding]
         * - [mediaUrls]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Unique identifier for a messaging profile. */
        fun messagingProfileId(messagingProfileId: String) = apply {
            body.messagingProfileId(messagingProfileId)
        }

        /**
         * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
            body.messagingProfileId(messagingProfileId)
        }

        /** Receiving address (+E.164 formatted phone number or short code). */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        /**
         * Automatically detect if an SMS message is unusually long and exceeds a recommended limit
         * of message parts.
         */
        fun autoDetect(autoDetect: Boolean) = apply { body.autoDetect(autoDetect) }

        /**
         * Sets [Builder.autoDetect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoDetect] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoDetect(autoDetect: JsonField<Boolean>) = apply { body.autoDetect(autoDetect) }

        /**
         * Encoding to use for the message. `auto` (default) uses smart encoding to automatically
         * select the most efficient encoding. `gsm7` forces GSM-7 encoding (returns 400 if message
         * contains characters that cannot be encoded). `ucs2` forces UCS-2 encoding and disables
         * smart encoding. When set, this overrides the messaging profile's `smart_encoding`
         * setting.
         */
        fun encoding(encoding: Encoding) = apply { body.encoding(encoding) }

        /**
         * Sets [Builder.encoding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encoding] with a well-typed [Encoding] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun encoding(encoding: JsonField<Encoding>) = apply { body.encoding(encoding) }

        /**
         * A list of media URLs. The total media size must be less than 1 MB.
         *
         * **Required for MMS**
         */
        fun mediaUrls(mediaUrls: List<String>) = apply { body.mediaUrls(mediaUrls) }

        /**
         * Sets [Builder.mediaUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mediaUrls] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mediaUrls(mediaUrls: JsonField<List<String>>) = apply { body.mediaUrls(mediaUrls) }

        /**
         * Adds a single [String] to [mediaUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMediaUrl(mediaUrl: String) = apply { body.addMediaUrl(mediaUrl) }

        /** Subject of multimedia message */
        fun subject(subject: String) = apply { body.subject(subject) }

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { body.subject(subject) }

        /**
         * Message body (i.e., content) as a non-empty string.
         *
         * **Required for SMS**
         */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        /** The protocol for sending the message, either SMS or MMS. */
        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * If the profile this number is associated with has webhooks, use them for delivery
         * notifications. If webhooks are also specified on the message itself, they will be
         * attempted first, then those on the profile.
         */
        fun useProfileWebhooks(useProfileWebhooks: Boolean) = apply {
            body.useProfileWebhooks(useProfileWebhooks)
        }

        /**
         * Sets [Builder.useProfileWebhooks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useProfileWebhooks] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useProfileWebhooks(useProfileWebhooks: JsonField<Boolean>) = apply {
            body.useProfileWebhooks(useProfileWebhooks)
        }

        /**
         * The failover URL where webhooks related to this message will be sent if sending to the
         * primary URL fails.
         */
        fun webhookFailoverUrl(webhookFailoverUrl: String) = apply {
            body.webhookFailoverUrl(webhookFailoverUrl)
        }

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

        /** The URL where webhooks related to this message will be sent. */
        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

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
         * Returns an immutable instance of [MessageSendNumberPoolParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .messagingProfileId()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageSendNumberPoolParams =
            MessageSendNumberPoolParams(
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
        private val messagingProfileId: JsonField<String>,
        private val to: JsonField<String>,
        private val autoDetect: JsonField<Boolean>,
        private val encoding: JsonField<Encoding>,
        private val mediaUrls: JsonField<List<String>>,
        private val subject: JsonField<String>,
        private val text: JsonField<String>,
        private val type: JsonField<Type>,
        private val useProfileWebhooks: JsonField<Boolean>,
        private val webhookFailoverUrl: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("messaging_profile_id")
            @ExcludeMissing
            messagingProfileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_detect")
            @ExcludeMissing
            autoDetect: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("encoding")
            @ExcludeMissing
            encoding: JsonField<Encoding> = JsonMissing.of(),
            @JsonProperty("media_urls")
            @ExcludeMissing
            mediaUrls: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("use_profile_webhooks")
            @ExcludeMissing
            useProfileWebhooks: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("webhook_failover_url")
            @ExcludeMissing
            webhookFailoverUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            messagingProfileId,
            to,
            autoDetect,
            encoding,
            mediaUrls,
            subject,
            text,
            type,
            useProfileWebhooks,
            webhookFailoverUrl,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * Unique identifier for a messaging profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messagingProfileId(): String = messagingProfileId.getRequired("messaging_profile_id")

        /**
         * Receiving address (+E.164 formatted phone number or short code).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("to")

        /**
         * Automatically detect if an SMS message is unusually long and exceeds a recommended limit
         * of message parts.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoDetect(): Optional<Boolean> = autoDetect.getOptional("auto_detect")

        /**
         * Encoding to use for the message. `auto` (default) uses smart encoding to automatically
         * select the most efficient encoding. `gsm7` forces GSM-7 encoding (returns 400 if message
         * contains characters that cannot be encoded). `ucs2` forces UCS-2 encoding and disables
         * smart encoding. When set, this overrides the messaging profile's `smart_encoding`
         * setting.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun encoding(): Optional<Encoding> = encoding.getOptional("encoding")

        /**
         * A list of media URLs. The total media size must be less than 1 MB.
         *
         * **Required for MMS**
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mediaUrls(): Optional<List<String>> = mediaUrls.getOptional("media_urls")

        /**
         * Subject of multimedia message
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subject(): Optional<String> = subject.getOptional("subject")

        /**
         * Message body (i.e., content) as a non-empty string.
         *
         * **Required for SMS**
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * The protocol for sending the message, either SMS or MMS.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * If the profile this number is associated with has webhooks, use them for delivery
         * notifications. If webhooks are also specified on the message itself, they will be
         * attempted first, then those on the profile.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun useProfileWebhooks(): Optional<Boolean> =
            useProfileWebhooks.getOptional("use_profile_webhooks")

        /**
         * The failover URL where webhooks related to this message will be sent if sending to the
         * primary URL fails.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookFailoverUrl(): Optional<String> =
            webhookFailoverUrl.getOptional("webhook_failover_url")

        /**
         * The URL where webhooks related to this message will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [messagingProfileId].
         *
         * Unlike [messagingProfileId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("messaging_profile_id")
        @ExcludeMissing
        fun _messagingProfileId(): JsonField<String> = messagingProfileId

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [autoDetect].
         *
         * Unlike [autoDetect], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auto_detect")
        @ExcludeMissing
        fun _autoDetect(): JsonField<Boolean> = autoDetect

        /**
         * Returns the raw JSON value of [encoding].
         *
         * Unlike [encoding], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("encoding") @ExcludeMissing fun _encoding(): JsonField<Encoding> = encoding

        /**
         * Returns the raw JSON value of [mediaUrls].
         *
         * Unlike [mediaUrls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("media_urls")
        @ExcludeMissing
        fun _mediaUrls(): JsonField<List<String>> = mediaUrls

        /**
         * Returns the raw JSON value of [subject].
         *
         * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [useProfileWebhooks].
         *
         * Unlike [useProfileWebhooks], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("use_profile_webhooks")
        @ExcludeMissing
        fun _useProfileWebhooks(): JsonField<Boolean> = useProfileWebhooks

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
             * .messagingProfileId()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var messagingProfileId: JsonField<String>? = null
            private var to: JsonField<String>? = null
            private var autoDetect: JsonField<Boolean> = JsonMissing.of()
            private var encoding: JsonField<Encoding> = JsonMissing.of()
            private var mediaUrls: JsonField<MutableList<String>>? = null
            private var subject: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var useProfileWebhooks: JsonField<Boolean> = JsonMissing.of()
            private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                messagingProfileId = body.messagingProfileId
                to = body.to
                autoDetect = body.autoDetect
                encoding = body.encoding
                mediaUrls = body.mediaUrls.map { it.toMutableList() }
                subject = body.subject
                text = body.text
                type = body.type
                useProfileWebhooks = body.useProfileWebhooks
                webhookFailoverUrl = body.webhookFailoverUrl
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Unique identifier for a messaging profile. */
            fun messagingProfileId(messagingProfileId: String) =
                messagingProfileId(JsonField.of(messagingProfileId))

            /**
             * Sets [Builder.messagingProfileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messagingProfileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messagingProfileId(messagingProfileId: JsonField<String>) = apply {
                this.messagingProfileId = messagingProfileId
            }

            /** Receiving address (+E.164 formatted phone number or short code). */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /**
             * Automatically detect if an SMS message is unusually long and exceeds a recommended
             * limit of message parts.
             */
            fun autoDetect(autoDetect: Boolean) = autoDetect(JsonField.of(autoDetect))

            /**
             * Sets [Builder.autoDetect] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoDetect] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoDetect(autoDetect: JsonField<Boolean>) = apply { this.autoDetect = autoDetect }

            /**
             * Encoding to use for the message. `auto` (default) uses smart encoding to
             * automatically select the most efficient encoding. `gsm7` forces GSM-7 encoding
             * (returns 400 if message contains characters that cannot be encoded). `ucs2` forces
             * UCS-2 encoding and disables smart encoding. When set, this overrides the messaging
             * profile's `smart_encoding` setting.
             */
            fun encoding(encoding: Encoding) = encoding(JsonField.of(encoding))

            /**
             * Sets [Builder.encoding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.encoding] with a well-typed [Encoding] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun encoding(encoding: JsonField<Encoding>) = apply { this.encoding = encoding }

            /**
             * A list of media URLs. The total media size must be less than 1 MB.
             *
             * **Required for MMS**
             */
            fun mediaUrls(mediaUrls: List<String>) = mediaUrls(JsonField.of(mediaUrls))

            /**
             * Sets [Builder.mediaUrls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mediaUrls] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mediaUrls(mediaUrls: JsonField<List<String>>) = apply {
                this.mediaUrls = mediaUrls.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [mediaUrls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMediaUrl(mediaUrl: String) = apply {
                mediaUrls =
                    (mediaUrls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mediaUrls", it).add(mediaUrl)
                    }
            }

            /** Subject of multimedia message */
            fun subject(subject: String) = subject(JsonField.of(subject))

            /**
             * Sets [Builder.subject] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subject] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subject(subject: JsonField<String>) = apply { this.subject = subject }

            /**
             * Message body (i.e., content) as a non-empty string.
             *
             * **Required for SMS**
             */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** The protocol for sending the message, either SMS or MMS. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * If the profile this number is associated with has webhooks, use them for delivery
             * notifications. If webhooks are also specified on the message itself, they will be
             * attempted first, then those on the profile.
             */
            fun useProfileWebhooks(useProfileWebhooks: Boolean) =
                useProfileWebhooks(JsonField.of(useProfileWebhooks))

            /**
             * Sets [Builder.useProfileWebhooks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useProfileWebhooks] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun useProfileWebhooks(useProfileWebhooks: JsonField<Boolean>) = apply {
                this.useProfileWebhooks = useProfileWebhooks
            }

            /**
             * The failover URL where webhooks related to this message will be sent if sending to
             * the primary URL fails.
             */
            fun webhookFailoverUrl(webhookFailoverUrl: String) =
                webhookFailoverUrl(JsonField.of(webhookFailoverUrl))

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

            /** The URL where webhooks related to this message will be sent. */
            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

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
             * .messagingProfileId()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("messagingProfileId", messagingProfileId),
                    checkRequired("to", to),
                    autoDetect,
                    encoding,
                    (mediaUrls ?: JsonMissing.of()).map { it.toImmutable() },
                    subject,
                    text,
                    type,
                    useProfileWebhooks,
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

            messagingProfileId()
            to()
            autoDetect()
            encoding().ifPresent { it.validate() }
            mediaUrls()
            subject()
            text()
            type().ifPresent { it.validate() }
            useProfileWebhooks()
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
            (if (messagingProfileId.asKnown().isPresent) 1 else 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (if (autoDetect.asKnown().isPresent) 1 else 0) +
                (encoding.asKnown().getOrNull()?.validity() ?: 0) +
                (mediaUrls.asKnown().getOrNull()?.size ?: 0) +
                (if (subject.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (useProfileWebhooks.asKnown().isPresent) 1 else 0) +
                (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                messagingProfileId == other.messagingProfileId &&
                to == other.to &&
                autoDetect == other.autoDetect &&
                encoding == other.encoding &&
                mediaUrls == other.mediaUrls &&
                subject == other.subject &&
                text == other.text &&
                type == other.type &&
                useProfileWebhooks == other.useProfileWebhooks &&
                webhookFailoverUrl == other.webhookFailoverUrl &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                messagingProfileId,
                to,
                autoDetect,
                encoding,
                mediaUrls,
                subject,
                text,
                type,
                useProfileWebhooks,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{messagingProfileId=$messagingProfileId, to=$to, autoDetect=$autoDetect, encoding=$encoding, mediaUrls=$mediaUrls, subject=$subject, text=$text, type=$type, useProfileWebhooks=$useProfileWebhooks, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    /**
     * Encoding to use for the message. `auto` (default) uses smart encoding to automatically select
     * the most efficient encoding. `gsm7` forces GSM-7 encoding (returns 400 if message contains
     * characters that cannot be encoded). `ucs2` forces UCS-2 encoding and disables smart encoding.
     * When set, this overrides the messaging profile's `smart_encoding` setting.
     */
    class Encoding @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AUTO = of("auto")

            @JvmField val GSM7 = of("gsm7")

            @JvmField val UCS2 = of("ucs2")

            @JvmStatic fun of(value: String) = Encoding(JsonField.of(value))
        }

        /** An enum containing [Encoding]'s known values. */
        enum class Known {
            AUTO,
            GSM7,
            UCS2,
        }

        /**
         * An enum containing [Encoding]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Encoding] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUTO,
            GSM7,
            UCS2,
            /** An enum member indicating that [Encoding] was instantiated with an unknown value. */
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
                AUTO -> Value.AUTO
                GSM7 -> Value.GSM7
                UCS2 -> Value.UCS2
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
                AUTO -> Known.AUTO
                GSM7 -> Known.GSM7
                UCS2 -> Known.UCS2
                else -> throw TelnyxInvalidDataException("Unknown Encoding: $value")
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

        fun validate(): Encoding = apply {
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

            return other is Encoding && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The protocol for sending the message, either SMS or MMS. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SMS = of("SMS")

            @JvmField val MMS = of("MMS")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SMS,
            MMS,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS,
            MMS,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                SMS -> Value.SMS
                MMS -> Value.MMS
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
                SMS -> Known.SMS
                MMS -> Known.MMS
                else -> throw TelnyxInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageSendNumberPoolParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageSendNumberPoolParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
