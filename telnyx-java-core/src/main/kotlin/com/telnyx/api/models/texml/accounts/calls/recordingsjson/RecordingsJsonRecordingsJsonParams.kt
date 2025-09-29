// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.calls.recordingsjson

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.api.core.Enum
import com.telnyx.api.core.ExcludeMissing
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.JsonMissing
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Starts recording with specified parameters for call idientified by call_sid. */
class RecordingsJsonRecordingsJsonParams
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
     * Whether to play a beep when recording is started.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun playBeep(): Optional<Boolean> = body.playBeep()

    /**
     * When `dual`, final audio file has the first leg on channel A, and the rest on channel B.
     * `single` mixes both tracks into a single channel.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingChannels(): Optional<RecordingChannels> = body.recordingChannels()

    /**
     * Url where status callbacks will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallback(): Optional<String> = body.recordingStatusCallback()

    /**
     * The changes to the recording's state that should generate a call to
     * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate multiple
     * values with a space. Defaults to `completed`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallbackEvent(): Optional<String> = body.recordingStatusCallbackEvent()

    /**
     * HTTP method used to send status callbacks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
        body.recordingStatusCallbackMethod()

    /**
     * The audio track to record for the call. The default is `both`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recordingTrack(): Optional<RecordingTrack> = body.recordingTrack()

    /**
     * Whether to send RecordingUrl in webhooks.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sendRecordingUrl(): Optional<Boolean> = body.sendRecordingUrl()

    /**
     * Returns the raw JSON value of [playBeep].
     *
     * Unlike [playBeep], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _playBeep(): JsonField<Boolean> = body._playBeep()

    /**
     * Returns the raw JSON value of [recordingChannels].
     *
     * Unlike [recordingChannels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _recordingChannels(): JsonField<RecordingChannels> = body._recordingChannels()

    /**
     * Returns the raw JSON value of [recordingStatusCallback].
     *
     * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallback(): JsonField<String> = body._recordingStatusCallback()

    /**
     * Returns the raw JSON value of [recordingStatusCallbackEvent].
     *
     * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallbackEvent(): JsonField<String> = body._recordingStatusCallbackEvent()

    /**
     * Returns the raw JSON value of [recordingStatusCallbackMethod].
     *
     * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
        body._recordingStatusCallbackMethod()

    /**
     * Returns the raw JSON value of [recordingTrack].
     *
     * Unlike [recordingTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recordingTrack(): JsonField<RecordingTrack> = body._recordingTrack()

    /**
     * Returns the raw JSON value of [sendRecordingUrl].
     *
     * Unlike [sendRecordingUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _sendRecordingUrl(): JsonField<Boolean> = body._sendRecordingUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RecordingsJsonRecordingsJsonParams].
         *
         * The following fields are required:
         * ```java
         * .accountSid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordingsJsonRecordingsJsonParams]. */
    class Builder internal constructor() {

        private var accountSid: String? = null
        private var callSid: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(recordingsJsonRecordingsJsonParams: RecordingsJsonRecordingsJsonParams) =
            apply {
                accountSid = recordingsJsonRecordingsJsonParams.accountSid
                callSid = recordingsJsonRecordingsJsonParams.callSid
                body = recordingsJsonRecordingsJsonParams.body.toBuilder()
                additionalHeaders = recordingsJsonRecordingsJsonParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    recordingsJsonRecordingsJsonParams.additionalQueryParams.toBuilder()
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
         * - [playBeep]
         * - [recordingChannels]
         * - [recordingStatusCallback]
         * - [recordingStatusCallbackEvent]
         * - [recordingStatusCallbackMethod]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Whether to play a beep when recording is started. */
        fun playBeep(playBeep: Boolean) = apply { body.playBeep(playBeep) }

        /**
         * Sets [Builder.playBeep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.playBeep] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun playBeep(playBeep: JsonField<Boolean>) = apply { body.playBeep(playBeep) }

        /**
         * When `dual`, final audio file has the first leg on channel A, and the rest on channel B.
         * `single` mixes both tracks into a single channel.
         */
        fun recordingChannels(recordingChannels: RecordingChannels) = apply {
            body.recordingChannels(recordingChannels)
        }

        /**
         * Sets [Builder.recordingChannels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingChannels] with a well-typed [RecordingChannels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
            body.recordingChannels(recordingChannels)
        }

        /** Url where status callbacks will be sent. */
        fun recordingStatusCallback(recordingStatusCallback: String) = apply {
            body.recordingStatusCallback(recordingStatusCallback)
        }

        /**
         * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallback] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
            body.recordingStatusCallback(recordingStatusCallback)
        }

        /**
         * The changes to the recording's state that should generate a call to
         * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
         * multiple values with a space. Defaults to `completed`.
         */
        fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) = apply {
            body.recordingStatusCallbackEvent(recordingStatusCallbackEvent)
        }

        /**
         * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) = apply {
            body.recordingStatusCallbackEvent(recordingStatusCallbackEvent)
        }

        /** HTTP method used to send status callbacks. */
        fun recordingStatusCallbackMethod(
            recordingStatusCallbackMethod: RecordingStatusCallbackMethod
        ) = apply { body.recordingStatusCallbackMethod(recordingStatusCallbackMethod) }

        /**
         * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
         * [RecordingStatusCallbackMethod] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun recordingStatusCallbackMethod(
            recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
        ) = apply { body.recordingStatusCallbackMethod(recordingStatusCallbackMethod) }

        /** The audio track to record for the call. The default is `both`. */
        fun recordingTrack(recordingTrack: RecordingTrack) = apply {
            body.recordingTrack(recordingTrack)
        }

        /**
         * Sets [Builder.recordingTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordingTrack] with a well-typed [RecordingTrack] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
            body.recordingTrack(recordingTrack)
        }

        /** Whether to send RecordingUrl in webhooks. */
        fun sendRecordingUrl(sendRecordingUrl: Boolean) = apply {
            body.sendRecordingUrl(sendRecordingUrl)
        }

        /**
         * Sets [Builder.sendRecordingUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendRecordingUrl] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendRecordingUrl(sendRecordingUrl: JsonField<Boolean>) = apply {
            body.sendRecordingUrl(sendRecordingUrl)
        }

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
         * Returns an immutable instance of [RecordingsJsonRecordingsJsonParams].
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
        fun build(): RecordingsJsonRecordingsJsonParams =
            RecordingsJsonRecordingsJsonParams(
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
        private val playBeep: JsonField<Boolean>,
        private val recordingChannels: JsonField<RecordingChannels>,
        private val recordingStatusCallback: JsonField<String>,
        private val recordingStatusCallbackEvent: JsonField<String>,
        private val recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>,
        private val recordingTrack: JsonField<RecordingTrack>,
        private val sendRecordingUrl: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("PlayBeep")
            @ExcludeMissing
            playBeep: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("RecordingChannels")
            @ExcludeMissing
            recordingChannels: JsonField<RecordingChannels> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallback")
            @ExcludeMissing
            recordingStatusCallback: JsonField<String> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallbackEvent")
            @ExcludeMissing
            recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("RecordingStatusCallbackMethod")
            @ExcludeMissing
            recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                JsonMissing.of(),
            @JsonProperty("RecordingTrack")
            @ExcludeMissing
            recordingTrack: JsonField<RecordingTrack> = JsonMissing.of(),
            @JsonProperty("SendRecordingUrl")
            @ExcludeMissing
            sendRecordingUrl: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            playBeep,
            recordingChannels,
            recordingStatusCallback,
            recordingStatusCallbackEvent,
            recordingStatusCallbackMethod,
            recordingTrack,
            sendRecordingUrl,
            mutableMapOf(),
        )

        /**
         * Whether to play a beep when recording is started.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun playBeep(): Optional<Boolean> = playBeep.getOptional("PlayBeep")

        /**
         * When `dual`, final audio file has the first leg on channel A, and the rest on channel B.
         * `single` mixes both tracks into a single channel.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingChannels(): Optional<RecordingChannels> =
            recordingChannels.getOptional("RecordingChannels")

        /**
         * Url where status callbacks will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallback(): Optional<String> =
            recordingStatusCallback.getOptional("RecordingStatusCallback")

        /**
         * The changes to the recording's state that should generate a call to
         * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
         * multiple values with a space. Defaults to `completed`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallbackEvent(): Optional<String> =
            recordingStatusCallbackEvent.getOptional("RecordingStatusCallbackEvent")

        /**
         * HTTP method used to send status callbacks.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingStatusCallbackMethod(): Optional<RecordingStatusCallbackMethod> =
            recordingStatusCallbackMethod.getOptional("RecordingStatusCallbackMethod")

        /**
         * The audio track to record for the call. The default is `both`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun recordingTrack(): Optional<RecordingTrack> =
            recordingTrack.getOptional("RecordingTrack")

        /**
         * Whether to send RecordingUrl in webhooks.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sendRecordingUrl(): Optional<Boolean> = sendRecordingUrl.getOptional("SendRecordingUrl")

        /**
         * Returns the raw JSON value of [playBeep].
         *
         * Unlike [playBeep], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("PlayBeep") @ExcludeMissing fun _playBeep(): JsonField<Boolean> = playBeep

        /**
         * Returns the raw JSON value of [recordingChannels].
         *
         * Unlike [recordingChannels], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("RecordingChannels")
        @ExcludeMissing
        fun _recordingChannels(): JsonField<RecordingChannels> = recordingChannels

        /**
         * Returns the raw JSON value of [recordingStatusCallback].
         *
         * Unlike [recordingStatusCallback], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("RecordingStatusCallback")
        @ExcludeMissing
        fun _recordingStatusCallback(): JsonField<String> = recordingStatusCallback

        /**
         * Returns the raw JSON value of [recordingStatusCallbackEvent].
         *
         * Unlike [recordingStatusCallbackEvent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("RecordingStatusCallbackEvent")
        @ExcludeMissing
        fun _recordingStatusCallbackEvent(): JsonField<String> = recordingStatusCallbackEvent

        /**
         * Returns the raw JSON value of [recordingStatusCallbackMethod].
         *
         * Unlike [recordingStatusCallbackMethod], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("RecordingStatusCallbackMethod")
        @ExcludeMissing
        fun _recordingStatusCallbackMethod(): JsonField<RecordingStatusCallbackMethod> =
            recordingStatusCallbackMethod

        /**
         * Returns the raw JSON value of [recordingTrack].
         *
         * Unlike [recordingTrack], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("RecordingTrack")
        @ExcludeMissing
        fun _recordingTrack(): JsonField<RecordingTrack> = recordingTrack

        /**
         * Returns the raw JSON value of [sendRecordingUrl].
         *
         * Unlike [sendRecordingUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("SendRecordingUrl")
        @ExcludeMissing
        fun _sendRecordingUrl(): JsonField<Boolean> = sendRecordingUrl

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

            private var playBeep: JsonField<Boolean> = JsonMissing.of()
            private var recordingChannels: JsonField<RecordingChannels> = JsonMissing.of()
            private var recordingStatusCallback: JsonField<String> = JsonMissing.of()
            private var recordingStatusCallbackEvent: JsonField<String> = JsonMissing.of()
            private var recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod> =
                JsonMissing.of()
            private var recordingTrack: JsonField<RecordingTrack> = JsonMissing.of()
            private var sendRecordingUrl: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                playBeep = body.playBeep
                recordingChannels = body.recordingChannels
                recordingStatusCallback = body.recordingStatusCallback
                recordingStatusCallbackEvent = body.recordingStatusCallbackEvent
                recordingStatusCallbackMethod = body.recordingStatusCallbackMethod
                recordingTrack = body.recordingTrack
                sendRecordingUrl = body.sendRecordingUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Whether to play a beep when recording is started. */
            fun playBeep(playBeep: Boolean) = playBeep(JsonField.of(playBeep))

            /**
             * Sets [Builder.playBeep] to an arbitrary JSON value.
             *
             * You should usually call [Builder.playBeep] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun playBeep(playBeep: JsonField<Boolean>) = apply { this.playBeep = playBeep }

            /**
             * When `dual`, final audio file has the first leg on channel A, and the rest on channel
             * B. `single` mixes both tracks into a single channel.
             */
            fun recordingChannels(recordingChannels: RecordingChannels) =
                recordingChannels(JsonField.of(recordingChannels))

            /**
             * Sets [Builder.recordingChannels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingChannels] with a well-typed
             * [RecordingChannels] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun recordingChannels(recordingChannels: JsonField<RecordingChannels>) = apply {
                this.recordingChannels = recordingChannels
            }

            /** Url where status callbacks will be sent. */
            fun recordingStatusCallback(recordingStatusCallback: String) =
                recordingStatusCallback(JsonField.of(recordingStatusCallback))

            /**
             * Sets [Builder.recordingStatusCallback] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallback] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordingStatusCallback(recordingStatusCallback: JsonField<String>) = apply {
                this.recordingStatusCallback = recordingStatusCallback
            }

            /**
             * The changes to the recording's state that should generate a call to
             * `RecoridngStatusCallback`. Can be: `in-progress`, `completed` and `absent`. Separate
             * multiple values with a space. Defaults to `completed`.
             */
            fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: String) =
                recordingStatusCallbackEvent(JsonField.of(recordingStatusCallbackEvent))

            /**
             * Sets [Builder.recordingStatusCallbackEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallbackEvent] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun recordingStatusCallbackEvent(recordingStatusCallbackEvent: JsonField<String>) =
                apply {
                    this.recordingStatusCallbackEvent = recordingStatusCallbackEvent
                }

            /** HTTP method used to send status callbacks. */
            fun recordingStatusCallbackMethod(
                recordingStatusCallbackMethod: RecordingStatusCallbackMethod
            ) = recordingStatusCallbackMethod(JsonField.of(recordingStatusCallbackMethod))

            /**
             * Sets [Builder.recordingStatusCallbackMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingStatusCallbackMethod] with a well-typed
             * [RecordingStatusCallbackMethod] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun recordingStatusCallbackMethod(
                recordingStatusCallbackMethod: JsonField<RecordingStatusCallbackMethod>
            ) = apply { this.recordingStatusCallbackMethod = recordingStatusCallbackMethod }

            /** The audio track to record for the call. The default is `both`. */
            fun recordingTrack(recordingTrack: RecordingTrack) =
                recordingTrack(JsonField.of(recordingTrack))

            /**
             * Sets [Builder.recordingTrack] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recordingTrack] with a well-typed [RecordingTrack]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recordingTrack(recordingTrack: JsonField<RecordingTrack>) = apply {
                this.recordingTrack = recordingTrack
            }

            /** Whether to send RecordingUrl in webhooks. */
            fun sendRecordingUrl(sendRecordingUrl: Boolean) =
                sendRecordingUrl(JsonField.of(sendRecordingUrl))

            /**
             * Sets [Builder.sendRecordingUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendRecordingUrl] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sendRecordingUrl(sendRecordingUrl: JsonField<Boolean>) = apply {
                this.sendRecordingUrl = sendRecordingUrl
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    playBeep,
                    recordingChannels,
                    recordingStatusCallback,
                    recordingStatusCallbackEvent,
                    recordingStatusCallbackMethod,
                    recordingTrack,
                    sendRecordingUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            playBeep()
            recordingChannels().ifPresent { it.validate() }
            recordingStatusCallback()
            recordingStatusCallbackEvent()
            recordingStatusCallbackMethod().ifPresent { it.validate() }
            recordingTrack().ifPresent { it.validate() }
            sendRecordingUrl()
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
            (if (playBeep.asKnown().isPresent) 1 else 0) +
                (recordingChannels.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recordingStatusCallback.asKnown().isPresent) 1 else 0) +
                (if (recordingStatusCallbackEvent.asKnown().isPresent) 1 else 0) +
                (recordingStatusCallbackMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (recordingTrack.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sendRecordingUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                playBeep == other.playBeep &&
                recordingChannels == other.recordingChannels &&
                recordingStatusCallback == other.recordingStatusCallback &&
                recordingStatusCallbackEvent == other.recordingStatusCallbackEvent &&
                recordingStatusCallbackMethod == other.recordingStatusCallbackMethod &&
                recordingTrack == other.recordingTrack &&
                sendRecordingUrl == other.sendRecordingUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                playBeep,
                recordingChannels,
                recordingStatusCallback,
                recordingStatusCallbackEvent,
                recordingStatusCallbackMethod,
                recordingTrack,
                sendRecordingUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{playBeep=$playBeep, recordingChannels=$recordingChannels, recordingStatusCallback=$recordingStatusCallback, recordingStatusCallbackEvent=$recordingStatusCallbackEvent, recordingStatusCallbackMethod=$recordingStatusCallbackMethod, recordingTrack=$recordingTrack, sendRecordingUrl=$sendRecordingUrl, additionalProperties=$additionalProperties}"
    }

    /**
     * When `dual`, final audio file has the first leg on channel A, and the rest on channel B.
     * `single` mixes both tracks into a single channel.
     */
    class RecordingChannels @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SINGLE = of("single")

            @JvmField val DUAL = of("dual")

            @JvmStatic fun of(value: String) = RecordingChannels(JsonField.of(value))
        }

        /** An enum containing [RecordingChannels]'s known values. */
        enum class Known {
            SINGLE,
            DUAL,
        }

        /**
         * An enum containing [RecordingChannels]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordingChannels] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE,
            DUAL,
            /**
             * An enum member indicating that [RecordingChannels] was instantiated with an unknown
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
                SINGLE -> Value.SINGLE
                DUAL -> Value.DUAL
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
                SINGLE -> Known.SINGLE
                DUAL -> Known.DUAL
                else -> throw TelnyxInvalidDataException("Unknown RecordingChannels: $value")
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

        fun validate(): RecordingChannels = apply {
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

            return other is RecordingChannels && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** HTTP method used to send status callbacks. */
    class RecordingStatusCallbackMethod
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

            @JvmStatic fun of(value: String) = RecordingStatusCallbackMethod(JsonField.of(value))
        }

        /** An enum containing [RecordingStatusCallbackMethod]'s known values. */
        enum class Known {
            GET,
            POST,
        }

        /**
         * An enum containing [RecordingStatusCallbackMethod]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [RecordingStatusCallbackMethod] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GET,
            POST,
            /**
             * An enum member indicating that [RecordingStatusCallbackMethod] was instantiated with
             * an unknown value.
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
                else ->
                    throw TelnyxInvalidDataException(
                        "Unknown RecordingStatusCallbackMethod: $value"
                    )
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

        fun validate(): RecordingStatusCallbackMethod = apply {
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

            return other is RecordingStatusCallbackMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The audio track to record for the call. The default is `both`. */
    class RecordingTrack @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INBOUND = of("inbound")

            @JvmField val OUTBOUND = of("outbound")

            @JvmField val BOTH = of("both")

            @JvmStatic fun of(value: String) = RecordingTrack(JsonField.of(value))
        }

        /** An enum containing [RecordingTrack]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
            BOTH,
        }

        /**
         * An enum containing [RecordingTrack]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RecordingTrack] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INBOUND,
            OUTBOUND,
            BOTH,
            /**
             * An enum member indicating that [RecordingTrack] was instantiated with an unknown
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
                INBOUND -> Value.INBOUND
                OUTBOUND -> Value.OUTBOUND
                BOTH -> Value.BOTH
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
                INBOUND -> Known.INBOUND
                OUTBOUND -> Known.OUTBOUND
                BOTH -> Known.BOTH
                else -> throw TelnyxInvalidDataException("Unknown RecordingTrack: $value")
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

        fun validate(): RecordingTrack = apply {
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

            return other is RecordingTrack && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordingsJsonRecordingsJsonParams &&
            accountSid == other.accountSid &&
            callSid == other.callSid &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountSid, callSid, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RecordingsJsonRecordingsJsonParams{accountSid=$accountSid, callSid=$callSid, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
