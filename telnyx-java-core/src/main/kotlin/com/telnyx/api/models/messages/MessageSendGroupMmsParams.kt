// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Send a group MMS message */
class MessageSendGroupMmsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Phone number, in +E.164 format, used to send the message.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = body.from()

    /**
     * A list of destinations. No more than 8 destinations are allowed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): List<String> = body.to()

    /**
     * A list of media URLs. The total media size must be less than 1 MB.
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun text(): Optional<String> = body.text()

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
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<List<String>> = body._to()

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
         * Returns a mutable builder for constructing an instance of [MessageSendGroupMmsParams].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageSendGroupMmsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageSendGroupMmsParams: MessageSendGroupMmsParams) = apply {
            body = messageSendGroupMmsParams.body.toBuilder()
            additionalHeaders = messageSendGroupMmsParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageSendGroupMmsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [from]
         * - [to]
         * - [mediaUrls]
         * - [subject]
         * - [text]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Phone number, in +E.164 format, used to send the message. */
        fun from(from: String) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { body.from(from) }

        /** A list of destinations. No more than 8 destinations are allowed. */
        fun to(to: List<String>) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed `List<String>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<List<String>>) = apply { body.to(to) }

        /**
         * Adds a single [String] to [Builder.to].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTo(to: String) = apply { body.addTo(to) }

        /** A list of media URLs. The total media size must be less than 1 MB. */
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

        /** Message body (i.e., content) as a non-empty string. */
        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

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
         * Returns an immutable instance of [MessageSendGroupMmsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageSendGroupMmsParams =
            MessageSendGroupMmsParams(
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
        private val from: JsonField<String>,
        private val to: JsonField<List<String>>,
        private val mediaUrls: JsonField<List<String>>,
        private val subject: JsonField<String>,
        private val text: JsonField<String>,
        private val useProfileWebhooks: JsonField<Boolean>,
        private val webhookFailoverUrl: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("media_urls")
            @ExcludeMissing
            mediaUrls: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
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
            from,
            to,
            mediaUrls,
            subject,
            text,
            useProfileWebhooks,
            webhookFailoverUrl,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * Phone number, in +E.164 format, used to send the message.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun from(): String = from.getRequired("from")

        /**
         * A list of destinations. No more than 8 destinations are allowed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): List<String> = to.getRequired("to")

        /**
         * A list of media URLs. The total media size must be less than 1 MB.
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
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

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
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<List<String>> = to

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
             * .from()
             * .to()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var from: JsonField<String>? = null
            private var to: JsonField<MutableList<String>>? = null
            private var mediaUrls: JsonField<MutableList<String>>? = null
            private var subject: JsonField<String> = JsonMissing.of()
            private var text: JsonField<String> = JsonMissing.of()
            private var useProfileWebhooks: JsonField<Boolean> = JsonMissing.of()
            private var webhookFailoverUrl: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                from = body.from
                to = body.to.map { it.toMutableList() }
                mediaUrls = body.mediaUrls.map { it.toMutableList() }
                subject = body.subject
                text = body.text
                useProfileWebhooks = body.useProfileWebhooks
                webhookFailoverUrl = body.webhookFailoverUrl
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Phone number, in +E.164 format, used to send the message. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /** A list of destinations. No more than 8 destinations are allowed. */
            fun to(to: List<String>) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun to(to: JsonField<List<String>>) = apply { this.to = to.map { it.toMutableList() } }

            /**
             * Adds a single [String] to [Builder.to].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTo(to: String) = apply {
                this.to =
                    (this.to ?: JsonField.of(mutableListOf())).also { checkKnown("to", it).add(to) }
            }

            /** A list of media URLs. The total media size must be less than 1 MB. */
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

            /** Message body (i.e., content) as a non-empty string. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

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
             * .from()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("from", from),
                    checkRequired("to", to).map { it.toImmutable() },
                    (mediaUrls ?: JsonMissing.of()).map { it.toImmutable() },
                    subject,
                    text,
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

            from()
            to()
            mediaUrls()
            subject()
            text()
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
            (if (from.asKnown().isPresent) 1 else 0) +
                (to.asKnown().getOrNull()?.size ?: 0) +
                (mediaUrls.asKnown().getOrNull()?.size ?: 0) +
                (if (subject.asKnown().isPresent) 1 else 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (useProfileWebhooks.asKnown().isPresent) 1 else 0) +
                (if (webhookFailoverUrl.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                from == other.from &&
                to == other.to &&
                mediaUrls == other.mediaUrls &&
                subject == other.subject &&
                text == other.text &&
                useProfileWebhooks == other.useProfileWebhooks &&
                webhookFailoverUrl == other.webhookFailoverUrl &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                from,
                to,
                mediaUrls,
                subject,
                text,
                useProfileWebhooks,
                webhookFailoverUrl,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{from=$from, to=$to, mediaUrls=$mediaUrls, subject=$subject, text=$text, useProfileWebhooks=$useProfileWebhooks, webhookFailoverUrl=$webhookFailoverUrl, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageSendGroupMmsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageSendGroupMmsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
