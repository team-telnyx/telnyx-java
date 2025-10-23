// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Starts streaming media from a call to a specific WebSocket address. */
class CallStreamsJsonParams
private constructor(
    private val accountSid: String,
    private val callSid: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountSid(): String = accountSid

    fun callSid(): Optional<String> = Optional.ofNullable(callSid)

    /**
     * Indicates codec for bidirectional streaming RTP payloads. Used only with
     * stream_bidirectional_mode=rtp. Case sensitive.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bidirectionalCodec(): Optional<BidirectionalCodec> = body.bidirectionalCodec()

    /**
     * Configures method of bidirectional streaming (mp3, rtp).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bidirectionalMode(): Optional<BidirectionalMode> = body.bidirectionalMode()

    /**
     * The user specified name of Stream.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Url where status callbacks will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallback(): Optional<String> = body.statusCallback()

    /**
     * HTTP method used to send status callbacks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statusCallbackMethod(): Optional<StatusCallbackMethod> = body.statusCallbackMethod()

    /**
     * Tracks to be included in the stream
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun track(): Optional<Track> = body.track()

    /**
     * The destination WebSocket address where the stream is going to be delivered.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = body.url()

    /**
     * Returns the raw JSON value of [bidirectionalCodec].
     *
     * Unlike [bidirectionalCodec], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _bidirectionalCodec(): JsonField<BidirectionalCodec> = body._bidirectionalCodec()

    /**
     * Returns the raw JSON value of [bidirectionalMode].
     *
     * Unlike [bidirectionalMode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _bidirectionalMode(): JsonField<BidirectionalMode> = body._bidirectionalMode()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [statusCallback].
     *
     * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statusCallback(): JsonField<String> = body._statusCallback()

    /**
     * Returns the raw JSON value of [statusCallbackMethod].
     *
     * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = body._statusCallbackMethod()

    /**
     * Returns the raw JSON value of [track].
     *
     * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _track(): JsonField<Track> = body._track()

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _url(): JsonField<String> = body._url()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallStreamsJsonParams].
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallStreamsJsonParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var callSid: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callStreamsJsonParams: CallStreamsJsonParams) = apply {
            accountSid = callStreamsJsonParams.accountSid
            callSid = callStreamsJsonParams.callSid
            body = callStreamsJsonParams.body.toBuilder()
            additionalHeaders = callStreamsJsonParams.additionalHeaders.toBuilder()
            additionalQueryParams = callStreamsJsonParams.additionalQueryParams.toBuilder()
        }

        fun accountSid(accountSid: String) = apply { this.accountSid = accountSid }

        fun callSid(callSid: String?) = apply { this.callSid = callSid }

        /** Alias for calling [Builder.callSid] with `callSid.orElse(null)`. */
        fun callSid(callSid: Optional<String>) = callSid(callSid.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bidirectionalCodec]
         * - [bidirectionalMode]
         * - [name]
         * - [statusCallback]
         * - [statusCallbackMethod]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Indicates codec for bidirectional streaming RTP payloads. Used only with
         * stream_bidirectional_mode=rtp. Case sensitive.
         */
        fun bidirectionalCodec(bidirectionalCodec: BidirectionalCodec) = apply {
            body.bidirectionalCodec(bidirectionalCodec)
        }

        /**
         * Sets [Builder.bidirectionalCodec] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bidirectionalCodec] with a well-typed
         * [BidirectionalCodec] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun bidirectionalCodec(bidirectionalCodec: JsonField<BidirectionalCodec>) = apply {
            body.bidirectionalCodec(bidirectionalCodec)
        }

        /** Configures method of bidirectional streaming (mp3, rtp). */
        fun bidirectionalMode(bidirectionalMode: BidirectionalMode) = apply {
            body.bidirectionalMode(bidirectionalMode)
        }

        /**
         * Sets [Builder.bidirectionalMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bidirectionalMode] with a well-typed [BidirectionalMode]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun bidirectionalMode(bidirectionalMode: JsonField<BidirectionalMode>) = apply {
            body.bidirectionalMode(bidirectionalMode)
        }

        /** The user specified name of Stream. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Url where status callbacks will be sent. */
        fun statusCallback(statusCallback: String) = apply { body.statusCallback(statusCallback) }

        /**
         * Sets [Builder.statusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallback] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statusCallback(statusCallback: JsonField<String>) = apply {
            body.statusCallback(statusCallback)
        }

        /** HTTP method used to send status callbacks. */
        fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /**
         * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statusCallbackMethod] with a well-typed
         * [StatusCallbackMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) = apply {
            body.statusCallbackMethod(statusCallbackMethod)
        }

        /** Tracks to be included in the stream */
        fun track(track: Track) = apply { body.track(track) }

        /**
         * Sets [Builder.track] to an arbitrary JSON value.
         *
         * You should usually call [Builder.track] with a well-typed [Track] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun track(track: JsonField<Track>) = apply { body.track(track) }

        /** The destination WebSocket address where the stream is going to be delivered. */
        fun url(url: String) = apply { body.url(url) }

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { body.url(url) }

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
         * Returns an immutable instance of [CallStreamsJsonParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CallStreamsJsonParams =
            CallStreamsJsonParams(
                checkRequired("accountSid", accountSid),
                callSid,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountSid
            1 -> callSid ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bidirectionalCodec: JsonField<BidirectionalCodec>,
        private val bidirectionalMode: JsonField<BidirectionalMode>,
        private val name: JsonField<String>,
        private val statusCallback: JsonField<String>,
        private val statusCallbackMethod: JsonField<StatusCallbackMethod>,
        private val track: JsonField<Track>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("BidirectionalCodec")
            @ExcludeMissing
            bidirectionalCodec: JsonField<BidirectionalCodec> = JsonMissing.of(),
            @JsonProperty("BidirectionalMode")
            @ExcludeMissing
            bidirectionalMode: JsonField<BidirectionalMode> = JsonMissing.of(),
            @JsonProperty("Name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StatusCallback")
            @ExcludeMissing
            statusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("StatusCallbackMethod")
            @ExcludeMissing
            statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of(),
            @JsonProperty("Track") @ExcludeMissing track: JsonField<Track> = JsonMissing.of(),
            @JsonProperty("Url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(
            bidirectionalCodec,
            bidirectionalMode,
            name,
            statusCallback,
            statusCallbackMethod,
            track,
            url,
            mutableMapOf(),
        )

        /**
         * Indicates codec for bidirectional streaming RTP payloads. Used only with
         * stream_bidirectional_mode=rtp. Case sensitive.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bidirectionalCodec(): Optional<BidirectionalCodec> =
            bidirectionalCodec.getOptional("BidirectionalCodec")

        /**
         * Configures method of bidirectional streaming (mp3, rtp).
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bidirectionalMode(): Optional<BidirectionalMode> =
            bidirectionalMode.getOptional("BidirectionalMode")

        /**
         * The user specified name of Stream.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("Name")

        /**
         * Url where status callbacks will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallback(): Optional<String> = statusCallback.getOptional("StatusCallback")

        /**
         * HTTP method used to send status callbacks.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCallbackMethod(): Optional<StatusCallbackMethod> =
            statusCallbackMethod.getOptional("StatusCallbackMethod")

        /**
         * Tracks to be included in the stream
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun track(): Optional<Track> = track.getOptional("Track")

        /**
         * The destination WebSocket address where the stream is going to be delivered.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("Url")

        /**
         * Returns the raw JSON value of [bidirectionalCodec].
         *
         * Unlike [bidirectionalCodec], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("BidirectionalCodec")
        @ExcludeMissing
        fun _bidirectionalCodec(): JsonField<BidirectionalCodec> = bidirectionalCodec

        /**
         * Returns the raw JSON value of [bidirectionalMode].
         *
         * Unlike [bidirectionalMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("BidirectionalMode")
        @ExcludeMissing
        fun _bidirectionalMode(): JsonField<BidirectionalMode> = bidirectionalMode

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [statusCallback].
         *
         * Unlike [statusCallback], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("StatusCallback")
        @ExcludeMissing
        fun _statusCallback(): JsonField<String> = statusCallback

        /**
         * Returns the raw JSON value of [statusCallbackMethod].
         *
         * Unlike [statusCallbackMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("StatusCallbackMethod")
        @ExcludeMissing
        fun _statusCallbackMethod(): JsonField<StatusCallbackMethod> = statusCallbackMethod

        /**
         * Returns the raw JSON value of [track].
         *
         * Unlike [track], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Track") @ExcludeMissing fun _track(): JsonField<Track> = track

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("Url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bidirectionalCodec: JsonField<BidirectionalCodec> = JsonMissing.of()
            private var bidirectionalMode: JsonField<BidirectionalMode> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var statusCallback: JsonField<String> = JsonMissing.of()
            private var statusCallbackMethod: JsonField<StatusCallbackMethod> = JsonMissing.of()
            private var track: JsonField<Track> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                bidirectionalCodec = body.bidirectionalCodec
                bidirectionalMode = body.bidirectionalMode
                name = body.name
                statusCallback = body.statusCallback
                statusCallbackMethod = body.statusCallbackMethod
                track = body.track
                url = body.url
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Indicates codec for bidirectional streaming RTP payloads. Used only with
             * stream_bidirectional_mode=rtp. Case sensitive.
             */
            fun bidirectionalCodec(bidirectionalCodec: BidirectionalCodec) =
                bidirectionalCodec(JsonField.of(bidirectionalCodec))

            /**
             * Sets [Builder.bidirectionalCodec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bidirectionalCodec] with a well-typed
             * [BidirectionalCodec] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun bidirectionalCodec(bidirectionalCodec: JsonField<BidirectionalCodec>) = apply {
                this.bidirectionalCodec = bidirectionalCodec
            }

            /** Configures method of bidirectional streaming (mp3, rtp). */
            fun bidirectionalMode(bidirectionalMode: BidirectionalMode) =
                bidirectionalMode(JsonField.of(bidirectionalMode))

            /**
             * Sets [Builder.bidirectionalMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bidirectionalMode] with a well-typed
             * [BidirectionalMode] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun bidirectionalMode(bidirectionalMode: JsonField<BidirectionalMode>) = apply {
                this.bidirectionalMode = bidirectionalMode
            }

            /** The user specified name of Stream. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Url where status callbacks will be sent. */
            fun statusCallback(statusCallback: String) =
                statusCallback(JsonField.of(statusCallback))

            /**
             * Sets [Builder.statusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallback] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCallback(statusCallback: JsonField<String>) = apply {
                this.statusCallback = statusCallback
            }

            /** HTTP method used to send status callbacks. */
            fun statusCallbackMethod(statusCallbackMethod: StatusCallbackMethod) =
                statusCallbackMethod(JsonField.of(statusCallbackMethod))

            /**
             * Sets [Builder.statusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCallbackMethod] with a well-typed
             * [StatusCallbackMethod] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun statusCallbackMethod(statusCallbackMethod: JsonField<StatusCallbackMethod>) =
                apply {
                    this.statusCallbackMethod = statusCallbackMethod
                }

            /** Tracks to be included in the stream */
            fun track(track: Track) = track(JsonField.of(track))

            /**
             * Sets [Builder.track] to an arbitrary JSON value.
             *
             * You should usually call [Builder.track] with a well-typed [Track] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun track(track: JsonField<Track>) = apply { this.track = track }

            /** The destination WebSocket address where the stream is going to be delivered. */
            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             */
            fun build(): Body =
                Body(
                    bidirectionalCodec,
                    bidirectionalMode,
                    name,
                    statusCallback,
                    statusCallbackMethod,
                    track,
                    url,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bidirectionalCodec().ifPresent { it.validate() }
            bidirectionalMode().ifPresent { it.validate() }
            name()
            statusCallback()
            statusCallbackMethod().ifPresent { it.validate() }
            track().ifPresent { it.validate() }
            url()
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
            (bidirectionalCodec.asKnown().getOrNull()?.validity() ?: 0) +
                (bidirectionalMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (statusCallback.asKnown().isPresent) 1 else 0) +
                (statusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (track.asKnown().getOrNull()?.validity() ?: 0) +
                (if (url.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bidirectionalCodec == other.bidirectionalCodec &&
                bidirectionalMode == other.bidirectionalMode &&
                name == other.name &&
                statusCallback == other.statusCallback &&
                statusCallbackMethod == other.statusCallbackMethod &&
                track == other.track &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bidirectionalCodec,
                bidirectionalMode,
                name,
                statusCallback,
                statusCallbackMethod,
                track,
                url,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bidirectionalCodec=$bidirectionalCodec, bidirectionalMode=$bidirectionalMode, name=$name, statusCallback=$statusCallback, statusCallbackMethod=$statusCallbackMethod, track=$track, url=$url, additionalProperties=$additionalProperties}"
    }

    /**
     * Indicates codec for bidirectional streaming RTP payloads. Used only with
     * stream_bidirectional_mode=rtp. Case sensitive.
     */
    class BidirectionalCodec
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PCMU = of("PCMU")

            @JvmField val PCMA = of("PCMA")

            @JvmField val G722 = of("G722")

            @JvmStatic fun of(value: String) = BidirectionalCodec(JsonField.of(value))
        }

        /** An enum containing [BidirectionalCodec]'s known values. */
        enum class Known {
            PCMU,
            PCMA,
            G722,
        }

        /**
         * An enum containing [BidirectionalCodec]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BidirectionalCodec] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PCMU,
            PCMA,
            G722,
            /**
             * An enum member indicating that [BidirectionalCodec] was instantiated with an unknown
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
                PCMU -> Value.PCMU
                PCMA -> Value.PCMA
                G722 -> Value.G722
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
                PCMU -> Known.PCMU
                PCMA -> Known.PCMA
                G722 -> Known.G722
                else -> throw TelnyxInvalidDataException("Unknown BidirectionalCodec: $value")
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

        fun validate(): BidirectionalCodec = apply {
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

            return other is BidirectionalCodec && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Configures method of bidirectional streaming (mp3, rtp). */
    class BidirectionalMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MP3 = of("mp3")

            @JvmField val RTP = of("rtp")

            @JvmStatic fun of(value: String) = BidirectionalMode(JsonField.of(value))
        }

        /** An enum containing [BidirectionalMode]'s known values. */
        enum class Known {
            MP3,
            RTP,
        }

        /**
         * An enum containing [BidirectionalMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BidirectionalMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MP3,
            RTP,
            /**
             * An enum member indicating that [BidirectionalMode] was instantiated with an unknown
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
                MP3 -> Value.MP3
                RTP -> Value.RTP
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
                MP3 -> Known.MP3
                RTP -> Known.RTP
                else -> throw TelnyxInvalidDataException("Unknown BidirectionalMode: $value")
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

        fun validate(): BidirectionalMode = apply {
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

            return other is BidirectionalMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP method used to send status callbacks. */
    class StatusCallbackMethod
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val GET = of("GET")

            @JvmField val POST = of("POST")

            @JvmStatic fun of(value: String) = StatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [StatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [StatusCallbackMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StatusCallbackMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [StatusCallbackMethod] was instantiated with an
             * unknown value.
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
                GET -> Value.GET
                POST -> Value.POST
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
                GET -> Known.GET
                POST -> Known.POST
                else -> throw TelnyxInvalidDataException("Unknown StatusCallbackMethod: $value")
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

        fun validate(): StatusCallbackMethod = apply {
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

            return other is StatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Tracks to be included in the stream */
    class Track @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INBOUND_TRACK = of("inbound_track")

            @JvmField val OUTBOUND_TRACK = of("outbound_track")

            @JvmField val BOTH_TRACKS = of("both_tracks")

            @JvmStatic fun of(value: String) = Track(JsonField.of(value))
        }

        /** An enum containing [Track]'s known values. */
        enum class Known {
            INBOUND_TRACK,
            OUTBOUND_TRACK,
            BOTH_TRACKS,
        }

        /**
         * An enum containing [Track]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Track] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND_TRACK,
            OUTBOUND_TRACK,
            BOTH_TRACKS,
            /** An enum member indicating that [Track] was instantiated with an unknown value. */
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
                INBOUND_TRACK -> Value.INBOUND_TRACK
                OUTBOUND_TRACK -> Value.OUTBOUND_TRACK
                BOTH_TRACKS -> Value.BOTH_TRACKS
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
                INBOUND_TRACK -> Known.INBOUND_TRACK
                OUTBOUND_TRACK -> Known.OUTBOUND_TRACK
                BOTH_TRACKS -> Known.BOTH_TRACKS
                else -> throw TelnyxInvalidDataException("Unknown Track: $value")
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

        fun validate(): Track = apply {
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

            return other is Track && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallStreamsJsonParams &&
            accountSid == other.accountSid &&
            callSid == other.callSid &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountSid, callSid, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallStreamsJsonParams{accountSid=$accountSid, callSid=$callSid, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
