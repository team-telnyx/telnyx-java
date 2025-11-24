// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

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
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Noise Suppression Start (BETA) */
class ActionStartNoiseSuppressionParams
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
     * The direction of the audio stream to be noise suppressed.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun direction(): Optional<Direction> = body.direction()

    /**
     * The engine to use for noise suppression. For backward compatibility, engines A and B are also
     * supported, but are deprecated: A - Denoiser B - DeepFilterNet
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noiseSuppressionEngine(): Optional<NoiseSuppressionEngine> = body.noiseSuppressionEngine()

    /**
     * Configuration parameters for noise suppression engines.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noiseSuppressionEngineConfig(): Optional<NoiseSuppressionEngineConfig> =
        body.noiseSuppressionEngineConfig()

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
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _direction(): JsonField<Direction> = body._direction()

    /**
     * Returns the raw JSON value of [noiseSuppressionEngine].
     *
     * Unlike [noiseSuppressionEngine], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _noiseSuppressionEngine(): JsonField<NoiseSuppressionEngine> =
        body._noiseSuppressionEngine()

    /**
     * Returns the raw JSON value of [noiseSuppressionEngineConfig].
     *
     * Unlike [noiseSuppressionEngineConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _noiseSuppressionEngineConfig(): JsonField<NoiseSuppressionEngineConfig> =
        body._noiseSuppressionEngineConfig()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ActionStartNoiseSuppressionParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [ActionStartNoiseSuppressionParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ActionStartNoiseSuppressionParams]. */
    class Builder internal constructor() {

        private var callControlId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(actionStartNoiseSuppressionParams: ActionStartNoiseSuppressionParams) =
            apply {
                callControlId = actionStartNoiseSuppressionParams.callControlId
                body = actionStartNoiseSuppressionParams.body.toBuilder()
                additionalHeaders = actionStartNoiseSuppressionParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    actionStartNoiseSuppressionParams.additionalQueryParams.toBuilder()
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
         * - [direction]
         * - [noiseSuppressionEngine]
         * - [noiseSuppressionEngineConfig]
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

        /** The direction of the audio stream to be noise suppressed. */
        fun direction(direction: Direction) = apply { body.direction(direction) }

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { body.direction(direction) }

        /**
         * The engine to use for noise suppression. For backward compatibility, engines A and B are
         * also supported, but are deprecated: A - Denoiser B - DeepFilterNet
         */
        fun noiseSuppressionEngine(noiseSuppressionEngine: NoiseSuppressionEngine) = apply {
            body.noiseSuppressionEngine(noiseSuppressionEngine)
        }

        /**
         * Sets [Builder.noiseSuppressionEngine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppressionEngine] with a well-typed
         * [NoiseSuppressionEngine] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun noiseSuppressionEngine(noiseSuppressionEngine: JsonField<NoiseSuppressionEngine>) =
            apply {
                body.noiseSuppressionEngine(noiseSuppressionEngine)
            }

        /** Configuration parameters for noise suppression engines. */
        fun noiseSuppressionEngineConfig(
            noiseSuppressionEngineConfig: NoiseSuppressionEngineConfig
        ) = apply { body.noiseSuppressionEngineConfig(noiseSuppressionEngineConfig) }

        /**
         * Sets [Builder.noiseSuppressionEngineConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noiseSuppressionEngineConfig] with a well-typed
         * [NoiseSuppressionEngineConfig] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun noiseSuppressionEngineConfig(
            noiseSuppressionEngineConfig: JsonField<NoiseSuppressionEngineConfig>
        ) = apply { body.noiseSuppressionEngineConfig(noiseSuppressionEngineConfig) }

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
         * Returns an immutable instance of [ActionStartNoiseSuppressionParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ActionStartNoiseSuppressionParams =
            ActionStartNoiseSuppressionParams(
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
        private val direction: JsonField<Direction>,
        private val noiseSuppressionEngine: JsonField<NoiseSuppressionEngine>,
        private val noiseSuppressionEngineConfig: JsonField<NoiseSuppressionEngineConfig>,
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
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("noise_suppression_engine")
            @ExcludeMissing
            noiseSuppressionEngine: JsonField<NoiseSuppressionEngine> = JsonMissing.of(),
            @JsonProperty("noise_suppression_engine_config")
            @ExcludeMissing
            noiseSuppressionEngineConfig: JsonField<NoiseSuppressionEngineConfig> = JsonMissing.of(),
        ) : this(
            clientState,
            commandId,
            direction,
            noiseSuppressionEngine,
            noiseSuppressionEngineConfig,
            mutableMapOf(),
        )

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
         * The direction of the audio stream to be noise suppressed.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun direction(): Optional<Direction> = direction.getOptional("direction")

        /**
         * The engine to use for noise suppression. For backward compatibility, engines A and B are
         * also supported, but are deprecated: A - Denoiser B - DeepFilterNet
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun noiseSuppressionEngine(): Optional<NoiseSuppressionEngine> =
            noiseSuppressionEngine.getOptional("noise_suppression_engine")

        /**
         * Configuration parameters for noise suppression engines.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun noiseSuppressionEngineConfig(): Optional<NoiseSuppressionEngineConfig> =
            noiseSuppressionEngineConfig.getOptional("noise_suppression_engine_config")

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
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction")
        @ExcludeMissing
        fun _direction(): JsonField<Direction> = direction

        /**
         * Returns the raw JSON value of [noiseSuppressionEngine].
         *
         * Unlike [noiseSuppressionEngine], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("noise_suppression_engine")
        @ExcludeMissing
        fun _noiseSuppressionEngine(): JsonField<NoiseSuppressionEngine> = noiseSuppressionEngine

        /**
         * Returns the raw JSON value of [noiseSuppressionEngineConfig].
         *
         * Unlike [noiseSuppressionEngineConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("noise_suppression_engine_config")
        @ExcludeMissing
        fun _noiseSuppressionEngineConfig(): JsonField<NoiseSuppressionEngineConfig> =
            noiseSuppressionEngineConfig

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
            private var direction: JsonField<Direction> = JsonMissing.of()
            private var noiseSuppressionEngine: JsonField<NoiseSuppressionEngine> = JsonMissing.of()
            private var noiseSuppressionEngineConfig: JsonField<NoiseSuppressionEngineConfig> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                clientState = body.clientState
                commandId = body.commandId
                direction = body.direction
                noiseSuppressionEngine = body.noiseSuppressionEngine
                noiseSuppressionEngineConfig = body.noiseSuppressionEngineConfig
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

            /** The direction of the audio stream to be noise suppressed. */
            fun direction(direction: Direction) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [Direction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

            /**
             * The engine to use for noise suppression. For backward compatibility, engines A and B
             * are also supported, but are deprecated: A - Denoiser B - DeepFilterNet
             */
            fun noiseSuppressionEngine(noiseSuppressionEngine: NoiseSuppressionEngine) =
                noiseSuppressionEngine(JsonField.of(noiseSuppressionEngine))

            /**
             * Sets [Builder.noiseSuppressionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noiseSuppressionEngine] with a well-typed
             * [NoiseSuppressionEngine] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun noiseSuppressionEngine(noiseSuppressionEngine: JsonField<NoiseSuppressionEngine>) =
                apply {
                    this.noiseSuppressionEngine = noiseSuppressionEngine
                }

            /** Configuration parameters for noise suppression engines. */
            fun noiseSuppressionEngineConfig(
                noiseSuppressionEngineConfig: NoiseSuppressionEngineConfig
            ) = noiseSuppressionEngineConfig(JsonField.of(noiseSuppressionEngineConfig))

            /**
             * Sets [Builder.noiseSuppressionEngineConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noiseSuppressionEngineConfig] with a well-typed
             * [NoiseSuppressionEngineConfig] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun noiseSuppressionEngineConfig(
                noiseSuppressionEngineConfig: JsonField<NoiseSuppressionEngineConfig>
            ) = apply { this.noiseSuppressionEngineConfig = noiseSuppressionEngineConfig }

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
                    direction,
                    noiseSuppressionEngine,
                    noiseSuppressionEngineConfig,
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
            direction().ifPresent { it.validate() }
            noiseSuppressionEngine().ifPresent { it.validate() }
            noiseSuppressionEngineConfig().ifPresent { it.validate() }
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
                (direction.asKnown().getOrNull()?.validity() ?: 0) +
                (noiseSuppressionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                (noiseSuppressionEngineConfig.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientState == other.clientState &&
                commandId == other.commandId &&
                direction == other.direction &&
                noiseSuppressionEngine == other.noiseSuppressionEngine &&
                noiseSuppressionEngineConfig == other.noiseSuppressionEngineConfig &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                clientState,
                commandId,
                direction,
                noiseSuppressionEngine,
                noiseSuppressionEngineConfig,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{clientState=$clientState, commandId=$commandId, direction=$direction, noiseSuppressionEngine=$noiseSuppressionEngine, noiseSuppressionEngineConfig=$noiseSuppressionEngineConfig, additionalProperties=$additionalProperties}"
    }

    /** The direction of the audio stream to be noise suppressed. */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            INBOUND,
            OUTBOUND,
            BOTH,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
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
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                else -> throw TelnyxInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The engine to use for noise suppression. For backward compatibility, engines A and B are also
     * supported, but are deprecated: A - Denoiser B - DeepFilterNet
     */
    class NoiseSuppressionEngine
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

            @JvmField val DENOISER = of("Denoiser")

            @JvmField val DEEP_FILTER_NET = of("DeepFilterNet")

            @JvmStatic fun of(value: String) = NoiseSuppressionEngine(JsonField.of(value))
        }

        /** An enum containing [NoiseSuppressionEngine]'s known values. */
        enum class Known {
            DENOISER,
            DEEP_FILTER_NET,
        }

        /**
         * An enum containing [NoiseSuppressionEngine]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [NoiseSuppressionEngine] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DENOISER,
            DEEP_FILTER_NET,
            /**
             * An enum member indicating that [NoiseSuppressionEngine] was instantiated with an
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
                DENOISER -> Value.DENOISER
                DEEP_FILTER_NET -> Value.DEEP_FILTER_NET
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
                DENOISER -> Known.DENOISER
                DEEP_FILTER_NET -> Known.DEEP_FILTER_NET
                else -> throw TelnyxInvalidDataException("Unknown NoiseSuppressionEngine: $value")
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

        fun validate(): NoiseSuppressionEngine = apply {
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

            return other is NoiseSuppressionEngine && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Configuration parameters for noise suppression engines. */
    class NoiseSuppressionEngineConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attenuationLimit: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attenuation_limit")
            @ExcludeMissing
            attenuationLimit: JsonField<Long> = JsonMissing.of()
        ) : this(attenuationLimit, mutableMapOf())

        /**
         * The attenuation limit for noise suppression (0-100). Only applicable for DeepFilterNet.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attenuationLimit(): Optional<Long> = attenuationLimit.getOptional("attenuation_limit")

        /**
         * Returns the raw JSON value of [attenuationLimit].
         *
         * Unlike [attenuationLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attenuation_limit")
        @ExcludeMissing
        fun _attenuationLimit(): JsonField<Long> = attenuationLimit

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
             * Returns a mutable builder for constructing an instance of
             * [NoiseSuppressionEngineConfig].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NoiseSuppressionEngineConfig]. */
        class Builder internal constructor() {

            private var attenuationLimit: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(noiseSuppressionEngineConfig: NoiseSuppressionEngineConfig) = apply {
                attenuationLimit = noiseSuppressionEngineConfig.attenuationLimit
                additionalProperties =
                    noiseSuppressionEngineConfig.additionalProperties.toMutableMap()
            }

            /**
             * The attenuation limit for noise suppression (0-100). Only applicable for
             * DeepFilterNet.
             */
            fun attenuationLimit(attenuationLimit: Long) =
                attenuationLimit(JsonField.of(attenuationLimit))

            /**
             * Sets [Builder.attenuationLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attenuationLimit] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attenuationLimit(attenuationLimit: JsonField<Long>) = apply {
                this.attenuationLimit = attenuationLimit
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
             * Returns an immutable instance of [NoiseSuppressionEngineConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): NoiseSuppressionEngineConfig =
                NoiseSuppressionEngineConfig(attenuationLimit, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): NoiseSuppressionEngineConfig = apply {
            if (validated) {
                return@apply
            }

            attenuationLimit()
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
        internal fun validity(): Int = (if (attenuationLimit.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NoiseSuppressionEngineConfig &&
                attenuationLimit == other.attenuationLimit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(attenuationLimit, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NoiseSuppressionEngineConfig{attenuationLimit=$attenuationLimit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ActionStartNoiseSuppressionParams &&
            callControlId == other.callControlId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(callControlId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ActionStartNoiseSuppressionParams{callControlId=$callControlId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
