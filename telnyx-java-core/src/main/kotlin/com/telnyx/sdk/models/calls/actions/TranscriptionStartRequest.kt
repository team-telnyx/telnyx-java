// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.BaseDeserializer
import com.telnyx.sdk.core.BaseSerializer
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptionStartRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientState: JsonField<String>,
    private val commandId: JsonField<String>,
    private val transcriptionEngine: JsonField<TranscriptionEngine>,
    private val transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>,
    private val transcriptionTracks: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("client_state")
        @ExcludeMissing
        clientState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("command_id") @ExcludeMissing commandId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
        @JsonProperty("transcription_engine_config")
        @ExcludeMissing
        transcriptionEngineConfig: JsonField<TranscriptionEngineConfig> = JsonMissing.of(),
        @JsonProperty("transcription_tracks")
        @ExcludeMissing
        transcriptionTracks: JsonField<String> = JsonMissing.of(),
    ) : this(
        clientState,
        commandId,
        transcriptionEngine,
        transcriptionEngineConfig,
        transcriptionTracks,
        mutableMapOf(),
    )

    /**
     * Use this field to add state to every subsequent webhook. It must be a valid Base-64 encoded
     * string.
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
     * Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEngine(): Optional<TranscriptionEngine> =
        transcriptionEngine.getOptional("transcription_engine")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEngineConfig(): Optional<TranscriptionEngineConfig> =
        transcriptionEngineConfig.getOptional("transcription_engine_config")

    /**
     * Indicates which leg of the call will be transcribed. Use `inbound` for the leg that requested
     * the transcription, `outbound` for the other leg, and `both` for both legs of the call. Will
     * default to `inbound`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionTracks(): Optional<String> =
        transcriptionTracks.getOptional("transcription_tracks")

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
     * Returns the raw JSON value of [transcriptionEngine].
     *
     * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transcription_engine")
    @ExcludeMissing
    fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

    /**
     * Returns the raw JSON value of [transcriptionEngineConfig].
     *
     * Unlike [transcriptionEngineConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("transcription_engine_config")
    @ExcludeMissing
    fun _transcriptionEngineConfig(): JsonField<TranscriptionEngineConfig> =
        transcriptionEngineConfig

    /**
     * Returns the raw JSON value of [transcriptionTracks].
     *
     * Unlike [transcriptionTracks], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transcription_tracks")
    @ExcludeMissing
    fun _transcriptionTracks(): JsonField<String> = transcriptionTracks

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
         * Returns a mutable builder for constructing an instance of [TranscriptionStartRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionStartRequest]. */
    class Builder internal constructor() {

        private var clientState: JsonField<String> = JsonMissing.of()
        private var commandId: JsonField<String> = JsonMissing.of()
        private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
        private var transcriptionEngineConfig: JsonField<TranscriptionEngineConfig> =
            JsonMissing.of()
        private var transcriptionTracks: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionStartRequest: TranscriptionStartRequest) = apply {
            clientState = transcriptionStartRequest.clientState
            commandId = transcriptionStartRequest.commandId
            transcriptionEngine = transcriptionStartRequest.transcriptionEngine
            transcriptionEngineConfig = transcriptionStartRequest.transcriptionEngineConfig
            transcriptionTracks = transcriptionStartRequest.transcriptionTracks
            additionalProperties = transcriptionStartRequest.additionalProperties.toMutableMap()
        }

        /**
         * Use this field to add state to every subsequent webhook. It must be a valid Base-64
         * encoded string.
         */
        fun clientState(clientState: String) = clientState(JsonField.of(clientState))

        /**
         * Sets [Builder.clientState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientState(clientState: JsonField<String>) = apply { this.clientState = clientState }

        /**
         * Use this field to avoid duplicate commands. Telnyx will ignore any command with the same
         * `command_id` for the same `call_control_id`.
         */
        fun commandId(commandId: String) = commandId(JsonField.of(commandId))

        /**
         * Sets [Builder.commandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandId(commandId: JsonField<String>) = apply { this.commandId = commandId }

        /** Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`. */
        fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
            transcriptionEngine(JsonField.of(transcriptionEngine))

        /**
         * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionEngine] with a well-typed
         * [TranscriptionEngine] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
            this.transcriptionEngine = transcriptionEngine
        }

        fun transcriptionEngineConfig(transcriptionEngineConfig: TranscriptionEngineConfig) =
            transcriptionEngineConfig(JsonField.of(transcriptionEngineConfig))

        /**
         * Sets [Builder.transcriptionEngineConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionEngineConfig] with a well-typed
         * [TranscriptionEngineConfig] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun transcriptionEngineConfig(
            transcriptionEngineConfig: JsonField<TranscriptionEngineConfig>
        ) = apply { this.transcriptionEngineConfig = transcriptionEngineConfig }

        /**
         * Alias for calling [transcriptionEngineConfig] with `TranscriptionEngineConfig.ofA(a)`.
         */
        fun transcriptionEngineConfig(a: TranscriptionEngineAConfig) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofA(a))

        /**
         * Alias for calling [transcriptionEngineConfig] with `TranscriptionEngineConfig.ofB(b)`.
         */
        fun transcriptionEngineConfig(b: TranscriptionEngineBConfig) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofB(b))

        /**
         * Indicates which leg of the call will be transcribed. Use `inbound` for the leg that
         * requested the transcription, `outbound` for the other leg, and `both` for both legs of
         * the call. Will default to `inbound`.
         */
        fun transcriptionTracks(transcriptionTracks: String) =
            transcriptionTracks(JsonField.of(transcriptionTracks))

        /**
         * Sets [Builder.transcriptionTracks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionTracks] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transcriptionTracks(transcriptionTracks: JsonField<String>) = apply {
            this.transcriptionTracks = transcriptionTracks
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
         * Returns an immutable instance of [TranscriptionStartRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionStartRequest =
            TranscriptionStartRequest(
                clientState,
                commandId,
                transcriptionEngine,
                transcriptionEngineConfig,
                transcriptionTracks,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptionStartRequest = apply {
        if (validated) {
            return@apply
        }

        clientState()
        commandId()
        transcriptionEngine().ifPresent { it.validate() }
        transcriptionEngineConfig().ifPresent { it.validate() }
        transcriptionTracks()
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
        (if (clientState.asKnown().isPresent) 1 else 0) +
            (if (commandId.asKnown().isPresent) 1 else 0) +
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptionEngineConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transcriptionTracks.asKnown().isPresent) 1 else 0)

    /** Engine to use for speech recognition. `A` - `Google`, `B` - `Telnyx`. */
    class TranscriptionEngine
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

            @JvmField val A = of("A")

            @JvmField val B = of("B")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            A,
            B,
        }

        /**
         * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TranscriptionEngine] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            A,
            B,
            /**
             * An enum member indicating that [TranscriptionEngine] was instantiated with an unknown
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
                A -> Value.A
                B -> Value.B
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
                A -> Known.A
                B -> Known.B
                else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
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

        fun validate(): TranscriptionEngine = apply {
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

            return other is TranscriptionEngine && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = TranscriptionEngineConfig.Deserializer::class)
    @JsonSerialize(using = TranscriptionEngineConfig.Serializer::class)
    class TranscriptionEngineConfig
    private constructor(
        private val a: TranscriptionEngineAConfig? = null,
        private val b: TranscriptionEngineBConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun a(): Optional<TranscriptionEngineAConfig> = Optional.ofNullable(a)

        fun b(): Optional<TranscriptionEngineBConfig> = Optional.ofNullable(b)

        fun isA(): Boolean = a != null

        fun isB(): Boolean = b != null

        fun asA(): TranscriptionEngineAConfig = a.getOrThrow("a")

        fun asB(): TranscriptionEngineBConfig = b.getOrThrow("b")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                a != null -> visitor.visitA(a)
                b != null -> visitor.visitB(b)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): TranscriptionEngineConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitA(a: TranscriptionEngineAConfig) {
                        a.validate()
                    }

                    override fun visitB(b: TranscriptionEngineBConfig) {
                        b.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitA(a: TranscriptionEngineAConfig) = a.validity()

                    override fun visitB(b: TranscriptionEngineBConfig) = b.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TranscriptionEngineConfig && a == other.a && b == other.b
        }

        override fun hashCode(): Int = Objects.hash(a, b)

        override fun toString(): String =
            when {
                a != null -> "TranscriptionEngineConfig{a=$a}"
                b != null -> "TranscriptionEngineConfig{b=$b}"
                _json != null -> "TranscriptionEngineConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TranscriptionEngineConfig")
            }

        companion object {

            @JvmStatic fun ofA(a: TranscriptionEngineAConfig) = TranscriptionEngineConfig(a = a)

            @JvmStatic fun ofB(b: TranscriptionEngineBConfig) = TranscriptionEngineConfig(b = b)
        }

        /**
         * An interface that defines how to map each variant of [TranscriptionEngineConfig] to a
         * value of type [T].
         */
        interface Visitor<out T> {

            fun visitA(a: TranscriptionEngineAConfig): T

            fun visitB(b: TranscriptionEngineBConfig): T

            /**
             * Maps an unknown variant of [TranscriptionEngineConfig] to a value of type [T].
             *
             * An instance of [TranscriptionEngineConfig] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws TelnyxInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw TelnyxInvalidDataException("Unknown TranscriptionEngineConfig: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<TranscriptionEngineConfig>(TranscriptionEngineConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TranscriptionEngineConfig {
                val json = JsonValue.fromJsonNode(node)
                val transcriptionEngine =
                    json
                        .asObject()
                        .getOrNull()
                        ?.get("transcription_engine")
                        ?.asString()
                        ?.getOrNull()

                when (transcriptionEngine) {
                    "A" -> {
                        return tryDeserialize(node, jacksonTypeRef<TranscriptionEngineAConfig>())
                            ?.let { TranscriptionEngineConfig(a = it, _json = json) }
                            ?: TranscriptionEngineConfig(_json = json)
                    }
                    "B" -> {
                        return tryDeserialize(node, jacksonTypeRef<TranscriptionEngineBConfig>())
                            ?.let { TranscriptionEngineConfig(b = it, _json = json) }
                            ?: TranscriptionEngineConfig(_json = json)
                    }
                }

                return TranscriptionEngineConfig(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<TranscriptionEngineConfig>(TranscriptionEngineConfig::class) {

            override fun serialize(
                value: TranscriptionEngineConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.a != null -> generator.writeObject(value.a)
                    value.b != null -> generator.writeObject(value.b)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TranscriptionEngineConfig")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionStartRequest &&
            clientState == other.clientState &&
            commandId == other.commandId &&
            transcriptionEngine == other.transcriptionEngine &&
            transcriptionEngineConfig == other.transcriptionEngineConfig &&
            transcriptionTracks == other.transcriptionTracks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            clientState,
            commandId,
            transcriptionEngine,
            transcriptionEngineConfig,
            transcriptionTracks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionStartRequest{clientState=$clientState, commandId=$commandId, transcriptionEngine=$transcriptionEngine, transcriptionEngineConfig=$transcriptionEngineConfig, transcriptionTracks=$transcriptionTracks, additionalProperties=$additionalProperties}"
}
