// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

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
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Call forking allows you to stream the media from a call to a specific target in realtime. This
 * stream can be used to enable realtime audio analysis to support a variety of use cases, including
 * fraud detection, or the creation of AI-generated audio responses. Requests must specify either
 * the `target` attribute or the `rx` and `tx` attributes.
 *
 * **Expected Webhooks:**
 * - `call.fork.started`
 * - `call.fork.stopped`
 */
class ActionStartForkingParams
private constructor(
    private val callControlId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun callControlId(): Optional<String> = Optional.ofNullable(callControlId)

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientState(): Optional<String> = body.clientState()

    /**
     * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
     * `command_id` for the same `call_control_id`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commandId(): Optional<String> = body.commandId()

    /**
     * The network target, <udp:ip_address:port>, where the call's incoming RTP media packets should
     * be forwarded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rx(): Optional<String> = body.rx()

    /**
     * Optionally specify a media type to stream. If `decrypted` selected, Telnyx will decrypt
     * incoming SIP media before forking to the target. `rx` and `tx` are required fields if
     * `decrypted` selected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun streamType(): Optional<StreamType> = body.streamType()

    /**
     * The network target, <udp:ip_address:port>, where the call's outgoing RTP media packets should
     * be forwarded.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tx(): Optional<String> = body.tx()

    /**
     * Returns the raw JSON value of [clientState].
     *
     * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientState(): JsonField<String> = body._clientState()

    /**
     * Returns the raw JSON value of [commandId].
     *
     * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandId(): JsonField<String> = body._commandId()

    /**
     * Returns the raw JSON value of [rx].
     *
     * Unlike [rx], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _rx(): JsonField<String> = body._rx()

    /**
     * Returns the raw JSON value of [streamType].
     *
     * Unlike [streamType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _streamType(): JsonField<StreamType> = body._streamType()

    /**
     * Returns the raw JSON value of [tx].
     *
     * Unlike [tx], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tx(): JsonField<String> = body._tx()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionStartForkingParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ActionStartForkingParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionStartForkingParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionStartForkingParams: ActionStartForkingParams) = apply {
            callControlId = actionStartForkingParams.callControlId
            body = actionStartForkingParams.body.toBuilder()
            additionalHeaders = actionStartForkingParams.additionalHeaders.toBuilder()
            additionalQueryParams = actionStartForkingParams.additionalQueryParams.toBuilder()
        }

        fun callControlId(callControlId: String?) = apply { this.callControlId = callControlId }

        /** Alias for calling [Builder.callControlId] with `callControlId.orElse(null)`. */
        fun callControlId(callControlId: Optional<String>) =
            callControlId(callControlId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [clientState]
         * - [commandId]
         * - [rx]
         * - [streamType]
         * - [tx]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
        fun clientState(clientState: String) = apply { body.clientState(clientState) }

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { body.clientState(clientState) }

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         */
        fun commandId(commandId: String) = apply { body.commandId(commandId) }

        /**
         * Sets [Builder.commandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandId(commandId: JsonField<String>) = apply { body.commandId(commandId) }

        /**
         * The network target, <udp:ip_address:port>, where the call's incoming RTP media packets
         * should be forwarded.
         */
        fun rx(rx: String) = apply { body.rx(rx) }

        /**
         * Sets [Builder.rx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rx] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rx(rx: JsonField<String>) = apply { body.rx(rx) }

        /**
         * Optionally specify a media type to stream. If `decrypted` selected, Telnyx will decrypt
         * incoming SIP media before forking to the target. `rx` and `tx` are required fields if
         * `decrypted` selected.
         */
        fun streamType(streamType: StreamType) = apply { body.streamType(streamType) }

        /**
         * Sets [Builder.streamType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.streamType] with a well-typed [StreamType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun streamType(streamType: JsonField<StreamType>) = apply { body.streamType(streamType) }

        /**
         * The network target, <udp:ip_address:port>, where the call's outgoing RTP media packets
         * should be forwarded.
         */
        fun tx(tx: String) = apply { body.tx(tx) }

        /**
         * Sets [Builder.tx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tx] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tx(tx: JsonField<String>) = apply { body.tx(tx) }

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
         * Returns an immutable instance of [ActionStartForkingParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionStartForkingParams =
            ActionStartForkingParams(
                callControlId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> callControlId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clientState: JsonField<String>,
        private val commandId: JsonField<String>,
        private val rx: JsonField<String>,
        private val streamType: JsonField<StreamType>,
        private val tx: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("client_state")
            @ExcludeMissing
            clientState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_id")
            @ExcludeMissing
            commandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rx") @ExcludeMissing rx: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stream_type")
            @ExcludeMissing
            streamType: JsonField<StreamType> = JsonMissing.of(),
            @JsonProperty("tx") @ExcludeMissing tx: JsonField<String> = JsonMissing.of(),
        ) : this(clientState, commandId, rx, streamType, tx, mutableMapOf())

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun clientState(): Optional<String> = clientState.getOptional("client_state")

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun commandId(): Optional<String> = commandId.getOptional("command_id")

        /**
         * The network target, <udp:ip_address:port>, where the call's incoming RTP media packets
         * should be forwarded.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rx(): Optional<String> = rx.getOptional("rx")

        /**
         * Optionally specify a media type to stream. If `decrypted` selected, Telnyx will decrypt
         * incoming SIP media before forking to the target. `rx` and `tx` are required fields if
         * `decrypted` selected.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun streamType(): Optional<StreamType> = streamType.getOptional("stream_type")

        /**
         * The network target, <udp:ip_address:port>, where the call's outgoing RTP media packets
         * should be forwarded.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tx(): Optional<String> = tx.getOptional("tx")

        /**
         * Returns the raw JSON value of [clientState].
         *
         * Unlike [clientState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_state")
        @ExcludeMissing
        fun _clientState(): JsonField<String> = clientState

        /**
         * Returns the raw JSON value of [commandId].
         *
         * Unlike [commandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command_id") @ExcludeMissing fun _commandId(): JsonField<String> = commandId

        /**
         * Returns the raw JSON value of [rx].
         *
         * Unlike [rx], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rx") @ExcludeMissing fun _rx(): JsonField<String> = rx

        /**
         * Returns the raw JSON value of [streamType].
         *
         * Unlike [streamType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stream_type")
        @ExcludeMissing
        fun _streamType(): JsonField<StreamType> = streamType

        /**
         * Returns the raw JSON value of [tx].
         *
         * Unlike [tx], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tx") @ExcludeMissing fun _tx(): JsonField<String> = tx

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

            private var clientState: JsonField<String> = JsonMissing.of()
            private var commandId: JsonField<String> = JsonMissing.of()
            private var rx: JsonField<String> = JsonMissing.of()
            private var streamType: JsonField<StreamType> = JsonMissing.of()
            private var tx: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                clientState = body.clientState
                commandId = body.commandId
                rx = body.rx
                streamType = body.streamType
                tx = body.tx
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Use this field to add state to every subsequent webhook. It must be a valid Base-64
             * encoded string.
             */
            fun clientState(clientState: String) = clientState(JsonField.of(clientState))

            /**
             * Sets [Builder.clientState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientState(clientState: JsonField<String>) = apply {
                this.clientState = clientState
            }

            /**
             * Use this field to avoid duplicate commands. Telnyx will ignore any command with the
             * same `command_id` for the same `call_control_id`.
             */
            fun commandId(commandId: String) = commandId(JsonField.of(commandId))

            /**
             * Sets [Builder.commandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commandId(commandId: JsonField<String>) = apply { this.commandId = commandId }

            /**
             * The network target, <udp:ip_address:port>, where the call's incoming RTP media
             * packets should be forwarded.
             */
            fun rx(rx: String) = rx(JsonField.of(rx))

            /**
             * Sets [Builder.rx] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rx] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rx(rx: JsonField<String>) = apply { this.rx = rx }

            /**
             * Optionally specify a media type to stream. If `decrypted` selected, Telnyx will
             * decrypt incoming SIP media before forking to the target. `rx` and `tx` are required
             * fields if `decrypted` selected.
             */
            fun streamType(streamType: StreamType) = streamType(JsonField.of(streamType))

            /**
             * Sets [Builder.streamType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamType] with a well-typed [StreamType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streamType(streamType: JsonField<StreamType>) = apply {
                this.streamType = streamType
            }

            /**
             * The network target, <udp:ip_address:port>, where the call's outgoing RTP media
             * packets should be forwarded.
             */
            fun tx(tx: String) = tx(JsonField.of(tx))

            /**
             * Sets [Builder.tx] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tx] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tx(tx: JsonField<String>) = apply { this.tx = tx }

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
                    clientState,
                    commandId,
                    rx,
                    streamType,
                    tx,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            clientState()
            commandId()
            rx()
            streamType().ifPresent { it.validate() }
            tx()
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
            (if (clientState.asKnown().isPresent) 1 else 0) +
                (if (commandId.asKnown().isPresent) 1 else 0) +
                (if (rx.asKnown().isPresent) 1 else 0) +
                (streamType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tx.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                rx == other.rx &&
                streamType == other.streamType &&
                tx == other.tx &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(clientState, commandId, rx, streamType, tx, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{clientState=$clientState, commandId=$commandId, rx=$rx, streamType=$streamType, tx=$tx, additionalProperties=$additionalProperties}"
    }

    /**
     * Optionally specify a media type to stream. If `decrypted` selected, Telnyx will decrypt
     * incoming SIP media before forking to the target. `rx` and `tx` are required fields if
     * `decrypted` selected.
     */
    class StreamType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DECRYPTED = of("decrypted")

            @JvmStatic fun of(value: String) = StreamType(JsonField.of(value))
        }

        /** An enum containing [StreamType]'s known values. */
        enum class Known {
            DECRYPTED
        }

        /**
         * An enum containing [StreamType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StreamType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DECRYPTED,
            /**
             * An enum member indicating that [StreamType] was instantiated with an unknown value.
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
                DECRYPTED -> Value.DECRYPTED
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
                DECRYPTED -> Known.DECRYPTED
                else -> throw TelnyxInvalidDataException("Unknown StreamType: $value")
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

        fun validate(): StreamType = apply {
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

            return other is StreamType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionStartForkingParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionStartForkingParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
