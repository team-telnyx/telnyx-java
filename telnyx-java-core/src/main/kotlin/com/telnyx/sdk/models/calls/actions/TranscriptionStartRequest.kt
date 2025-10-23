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
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.getOrThrow
import com.telnyx.sdk.core.toImmutable
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
     * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
     * supported for backward compatibility.
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

        /**
         * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
         * supported for backward compatibility.
         */
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
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofGoogle(google)`.
         */
        fun transcriptionEngineConfig(google: TranscriptionEngineConfig.Google) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofGoogle(google))

        /**
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofTelnyx(telnyx)`.
         */
        fun transcriptionEngineConfig(telnyx: TranscriptionEngineConfig.Telnyx) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofTelnyx(telnyx))

        /**
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofDeepgram(deepgram)`.
         */
        fun transcriptionEngineConfig(deepgram: TranscriptionEngineConfig.Deepgram) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofDeepgram(deepgram))

        /**
         * Alias for calling [transcriptionEngineConfig] with the following:
         * ```java
         * TranscriptionEngineConfig.Deepgram.builder()
         *     .transcriptionModel(transcriptionModel)
         *     .build()
         * ```
         */
        fun deepgramTranscriptionEngineConfig(
            transcriptionModel: TranscriptionEngineConfig.Deepgram.TranscriptionModel
        ) =
            transcriptionEngineConfig(
                TranscriptionEngineConfig.Deepgram.builder()
                    .transcriptionModel(transcriptionModel)
                    .build()
            )

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

    /**
     * Engine to use for speech recognition. Legacy values `A` - `Google`, `B` - `Telnyx` are
     * supported for backward compatibility.
     */
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

            @JvmField val GOOGLE = of("Google")

            @JvmField val TELNYX = of("Telnyx")

            @JvmField val DEEPGRAM = of("Deepgram")

            @JvmField val A = of("A")

            @JvmField val B = of("B")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            GOOGLE,
            TELNYX,
            DEEPGRAM,
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
            GOOGLE,
            TELNYX,
            DEEPGRAM,
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
                GOOGLE -> Value.GOOGLE
                TELNYX -> Value.TELNYX
                DEEPGRAM -> Value.DEEPGRAM
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
                GOOGLE -> Known.GOOGLE
                TELNYX -> Known.TELNYX
                DEEPGRAM -> Known.DEEPGRAM
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
        private val google: Google? = null,
        private val telnyx: Telnyx? = null,
        private val deepgram: Deepgram? = null,
        private val a: TranscriptionEngineAConfig? = null,
        private val b: TranscriptionEngineBConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun google(): Optional<Google> = Optional.ofNullable(google)

        fun telnyx(): Optional<Telnyx> = Optional.ofNullable(telnyx)

        fun deepgram(): Optional<Deepgram> = Optional.ofNullable(deepgram)

        fun a(): Optional<TranscriptionEngineAConfig> = Optional.ofNullable(a)

        fun b(): Optional<TranscriptionEngineBConfig> = Optional.ofNullable(b)

        fun isGoogle(): Boolean = google != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isDeepgram(): Boolean = deepgram != null

        fun isA(): Boolean = a != null

        fun isB(): Boolean = b != null

        fun asGoogle(): Google = google.getOrThrow("google")

        fun asTelnyx(): Telnyx = telnyx.getOrThrow("telnyx")

        fun asDeepgram(): Deepgram = deepgram.getOrThrow("deepgram")

        fun asA(): TranscriptionEngineAConfig = a.getOrThrow("a")

        fun asB(): TranscriptionEngineBConfig = b.getOrThrow("b")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                google != null -> visitor.visitGoogle(google)
                telnyx != null -> visitor.visitTelnyx(telnyx)
                deepgram != null -> visitor.visitDeepgram(deepgram)
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
                    override fun visitGoogle(google: Google) {
                        google.validate()
                    }

                    override fun visitTelnyx(telnyx: Telnyx) {
                        telnyx.validate()
                    }

                    override fun visitDeepgram(deepgram: Deepgram) {
                        deepgram.validate()
                    }

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
                    override fun visitGoogle(google: Google) = google.validity()

                    override fun visitTelnyx(telnyx: Telnyx) = telnyx.validity()

                    override fun visitDeepgram(deepgram: Deepgram) = deepgram.validity()

                    override fun visitA(a: TranscriptionEngineAConfig) = a.validity()

                    override fun visitB(b: TranscriptionEngineBConfig) = b.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TranscriptionEngineConfig &&
                google == other.google &&
                telnyx == other.telnyx &&
                deepgram == other.deepgram &&
                a == other.a &&
                b == other.b
        }

        override fun hashCode(): Int = Objects.hash(google, telnyx, deepgram, a, b)

        override fun toString(): String =
            when {
                google != null -> "TranscriptionEngineConfig{google=$google}"
                telnyx != null -> "TranscriptionEngineConfig{telnyx=$telnyx}"
                deepgram != null -> "TranscriptionEngineConfig{deepgram=$deepgram}"
                a != null -> "TranscriptionEngineConfig{a=$a}"
                b != null -> "TranscriptionEngineConfig{b=$b}"
                _json != null -> "TranscriptionEngineConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TranscriptionEngineConfig")
            }

        companion object {

            @JvmStatic fun ofGoogle(google: Google) = TranscriptionEngineConfig(google = google)

            @JvmStatic fun ofTelnyx(telnyx: Telnyx) = TranscriptionEngineConfig(telnyx = telnyx)

            @JvmStatic
            fun ofDeepgram(deepgram: Deepgram) = TranscriptionEngineConfig(deepgram = deepgram)

            @JvmStatic fun ofA(a: TranscriptionEngineAConfig) = TranscriptionEngineConfig(a = a)

            @JvmStatic fun ofB(b: TranscriptionEngineBConfig) = TranscriptionEngineConfig(b = b)
        }

        /**
         * An interface that defines how to map each variant of [TranscriptionEngineConfig] to a
         * value of type [T].
         */
        interface Visitor<out T> {

            fun visitGoogle(google: Google): T

            fun visitTelnyx(telnyx: Telnyx): T

            fun visitDeepgram(deepgram: Deepgram): T

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
                    "Google" -> {
                        return tryDeserialize(node, jacksonTypeRef<Google>())?.let {
                            TranscriptionEngineConfig(google = it, _json = json)
                        } ?: TranscriptionEngineConfig(_json = json)
                    }
                    "Telnyx" -> {
                        return tryDeserialize(node, jacksonTypeRef<Telnyx>())?.let {
                            TranscriptionEngineConfig(telnyx = it, _json = json)
                        } ?: TranscriptionEngineConfig(_json = json)
                    }
                    "Deepgram" -> {
                        return tryDeserialize(node, jacksonTypeRef<Deepgram>())?.let {
                            TranscriptionEngineConfig(deepgram = it, _json = json)
                        } ?: TranscriptionEngineConfig(_json = json)
                    }
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
                    value.google != null -> generator.writeObject(value.google)
                    value.telnyx != null -> generator.writeObject(value.telnyx)
                    value.deepgram != null -> generator.writeObject(value.deepgram)
                    value.a != null -> generator.writeObject(value.a)
                    value.b != null -> generator.writeObject(value.b)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TranscriptionEngineConfig")
                }
            }
        }

        class Google
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val enableSpeakerDiarization: JsonField<Boolean>,
            private val hints: JsonField<List<String>>,
            private val interimResults: JsonField<Boolean>,
            private val language: JsonField<GoogleTranscriptionLanguage>,
            private val maxSpeakerCount: JsonField<Int>,
            private val minSpeakerCount: JsonField<Int>,
            private val model: JsonField<Model>,
            private val profanityFilter: JsonField<Boolean>,
            private val speechContext: JsonField<List<SpeechContext>>,
            private val transcriptionEngine: JsonField<TranscriptionEngine>,
            private val useEnhanced: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("enable_speaker_diarization")
                @ExcludeMissing
                enableSpeakerDiarization: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("hints")
                @ExcludeMissing
                hints: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("interim_results")
                @ExcludeMissing
                interimResults: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<GoogleTranscriptionLanguage> = JsonMissing.of(),
                @JsonProperty("max_speaker_count")
                @ExcludeMissing
                maxSpeakerCount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("min_speaker_count")
                @ExcludeMissing
                minSpeakerCount: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
                @JsonProperty("profanity_filter")
                @ExcludeMissing
                profanityFilter: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("speech_context")
                @ExcludeMissing
                speechContext: JsonField<List<SpeechContext>> = JsonMissing.of(),
                @JsonProperty("transcription_engine")
                @ExcludeMissing
                transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
                @JsonProperty("use_enhanced")
                @ExcludeMissing
                useEnhanced: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                enableSpeakerDiarization,
                hints,
                interimResults,
                language,
                maxSpeakerCount,
                minSpeakerCount,
                model,
                profanityFilter,
                speechContext,
                transcriptionEngine,
                useEnhanced,
                mutableMapOf(),
            )

            /**
             * Enables speaker diarization.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun enableSpeakerDiarization(): Optional<Boolean> =
                enableSpeakerDiarization.getOptional("enable_speaker_diarization")

            /**
             * Hints to improve transcription accuracy.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun hints(): Optional<List<String>> = hints.getOptional("hints")

            /**
             * Whether to send also interim results. If set to false, only final results will be
             * sent.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

            /**
             * Language to use for speech recognition
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun language(): Optional<GoogleTranscriptionLanguage> = language.getOptional("language")

            /**
             * Defines maximum number of speakers in the conversation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun maxSpeakerCount(): Optional<Int> = maxSpeakerCount.getOptional("max_speaker_count")

            /**
             * Defines minimum number of speakers in the conversation.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun minSpeakerCount(): Optional<Int> = minSpeakerCount.getOptional("min_speaker_count")

            /**
             * The model to use for transcription.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun model(): Optional<Model> = model.getOptional("model")

            /**
             * Enables profanity_filter.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun profanityFilter(): Optional<Boolean> =
                profanityFilter.getOptional("profanity_filter")

            /**
             * Speech context to improve transcription accuracy.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun speechContext(): Optional<List<SpeechContext>> =
                speechContext.getOptional("speech_context")

            /**
             * Engine identifier for Google transcription service
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcriptionEngine(): Optional<TranscriptionEngine> =
                transcriptionEngine.getOptional("transcription_engine")

            /**
             * Enables enhanced transcription, this works for models `phone_call` and `video`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun useEnhanced(): Optional<Boolean> = useEnhanced.getOptional("use_enhanced")

            /**
             * Returns the raw JSON value of [enableSpeakerDiarization].
             *
             * Unlike [enableSpeakerDiarization], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("enable_speaker_diarization")
            @ExcludeMissing
            fun _enableSpeakerDiarization(): JsonField<Boolean> = enableSpeakerDiarization

            /**
             * Returns the raw JSON value of [hints].
             *
             * Unlike [hints], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hints") @ExcludeMissing fun _hints(): JsonField<List<String>> = hints

            /**
             * Returns the raw JSON value of [interimResults].
             *
             * Unlike [interimResults], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("interim_results")
            @ExcludeMissing
            fun _interimResults(): JsonField<Boolean> = interimResults

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language")
            @ExcludeMissing
            fun _language(): JsonField<GoogleTranscriptionLanguage> = language

            /**
             * Returns the raw JSON value of [maxSpeakerCount].
             *
             * Unlike [maxSpeakerCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("max_speaker_count")
            @ExcludeMissing
            fun _maxSpeakerCount(): JsonField<Int> = maxSpeakerCount

            /**
             * Returns the raw JSON value of [minSpeakerCount].
             *
             * Unlike [minSpeakerCount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("min_speaker_count")
            @ExcludeMissing
            fun _minSpeakerCount(): JsonField<Int> = minSpeakerCount

            /**
             * Returns the raw JSON value of [model].
             *
             * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

            /**
             * Returns the raw JSON value of [profanityFilter].
             *
             * Unlike [profanityFilter], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("profanity_filter")
            @ExcludeMissing
            fun _profanityFilter(): JsonField<Boolean> = profanityFilter

            /**
             * Returns the raw JSON value of [speechContext].
             *
             * Unlike [speechContext], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("speech_context")
            @ExcludeMissing
            fun _speechContext(): JsonField<List<SpeechContext>> = speechContext

            /**
             * Returns the raw JSON value of [transcriptionEngine].
             *
             * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

            /**
             * Returns the raw JSON value of [useEnhanced].
             *
             * Unlike [useEnhanced], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("use_enhanced")
            @ExcludeMissing
            fun _useEnhanced(): JsonField<Boolean> = useEnhanced

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

                /** Returns a mutable builder for constructing an instance of [Google]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Google]. */
            class Builder internal constructor() {

                private var enableSpeakerDiarization: JsonField<Boolean> = JsonMissing.of()
                private var hints: JsonField<MutableList<String>>? = null
                private var interimResults: JsonField<Boolean> = JsonMissing.of()
                private var language: JsonField<GoogleTranscriptionLanguage> = JsonMissing.of()
                private var maxSpeakerCount: JsonField<Int> = JsonMissing.of()
                private var minSpeakerCount: JsonField<Int> = JsonMissing.of()
                private var model: JsonField<Model> = JsonMissing.of()
                private var profanityFilter: JsonField<Boolean> = JsonMissing.of()
                private var speechContext: JsonField<MutableList<SpeechContext>>? = null
                private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
                private var useEnhanced: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(google: Google) = apply {
                    enableSpeakerDiarization = google.enableSpeakerDiarization
                    hints = google.hints.map { it.toMutableList() }
                    interimResults = google.interimResults
                    language = google.language
                    maxSpeakerCount = google.maxSpeakerCount
                    minSpeakerCount = google.minSpeakerCount
                    model = google.model
                    profanityFilter = google.profanityFilter
                    speechContext = google.speechContext.map { it.toMutableList() }
                    transcriptionEngine = google.transcriptionEngine
                    useEnhanced = google.useEnhanced
                    additionalProperties = google.additionalProperties.toMutableMap()
                }

                /** Enables speaker diarization. */
                fun enableSpeakerDiarization(enableSpeakerDiarization: Boolean) =
                    enableSpeakerDiarization(JsonField.of(enableSpeakerDiarization))

                /**
                 * Sets [Builder.enableSpeakerDiarization] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enableSpeakerDiarization] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun enableSpeakerDiarization(enableSpeakerDiarization: JsonField<Boolean>) = apply {
                    this.enableSpeakerDiarization = enableSpeakerDiarization
                }

                /** Hints to improve transcription accuracy. */
                fun hints(hints: List<String>) = hints(JsonField.of(hints))

                /**
                 * Sets [Builder.hints] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hints] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun hints(hints: JsonField<List<String>>) = apply {
                    this.hints = hints.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [hints].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addHint(hint: String) = apply {
                    hints =
                        (hints ?: JsonField.of(mutableListOf())).also {
                            checkKnown("hints", it).add(hint)
                        }
                }

                /**
                 * Whether to send also interim results. If set to false, only final results will be
                 * sent.
                 */
                fun interimResults(interimResults: Boolean) =
                    interimResults(JsonField.of(interimResults))

                /**
                 * Sets [Builder.interimResults] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.interimResults] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun interimResults(interimResults: JsonField<Boolean>) = apply {
                    this.interimResults = interimResults
                }

                /** Language to use for speech recognition */
                fun language(language: GoogleTranscriptionLanguage) =
                    language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed
                 * [GoogleTranscriptionLanguage] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun language(language: JsonField<GoogleTranscriptionLanguage>) = apply {
                    this.language = language
                }

                /** Defines maximum number of speakers in the conversation. */
                fun maxSpeakerCount(maxSpeakerCount: Int) =
                    maxSpeakerCount(JsonField.of(maxSpeakerCount))

                /**
                 * Sets [Builder.maxSpeakerCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.maxSpeakerCount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun maxSpeakerCount(maxSpeakerCount: JsonField<Int>) = apply {
                    this.maxSpeakerCount = maxSpeakerCount
                }

                /** Defines minimum number of speakers in the conversation. */
                fun minSpeakerCount(minSpeakerCount: Int) =
                    minSpeakerCount(JsonField.of(minSpeakerCount))

                /**
                 * Sets [Builder.minSpeakerCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.minSpeakerCount] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun minSpeakerCount(minSpeakerCount: JsonField<Int>) = apply {
                    this.minSpeakerCount = minSpeakerCount
                }

                /** The model to use for transcription. */
                fun model(model: Model) = model(JsonField.of(model))

                /**
                 * Sets [Builder.model] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.model] with a well-typed [Model] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun model(model: JsonField<Model>) = apply { this.model = model }

                /** Enables profanity_filter. */
                fun profanityFilter(profanityFilter: Boolean) =
                    profanityFilter(JsonField.of(profanityFilter))

                /**
                 * Sets [Builder.profanityFilter] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.profanityFilter] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun profanityFilter(profanityFilter: JsonField<Boolean>) = apply {
                    this.profanityFilter = profanityFilter
                }

                /** Speech context to improve transcription accuracy. */
                fun speechContext(speechContext: List<SpeechContext>) =
                    speechContext(JsonField.of(speechContext))

                /**
                 * Sets [Builder.speechContext] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.speechContext] with a well-typed
                 * `List<SpeechContext>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun speechContext(speechContext: JsonField<List<SpeechContext>>) = apply {
                    this.speechContext = speechContext.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SpeechContext] to [Builder.speechContext].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSpeechContext(speechContext: SpeechContext) = apply {
                    this.speechContext =
                        (this.speechContext ?: JsonField.of(mutableListOf())).also {
                            checkKnown("speechContext", it).add(speechContext)
                        }
                }

                /** Engine identifier for Google transcription service */
                fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                    transcriptionEngine(JsonField.of(transcriptionEngine))

                /**
                 * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcriptionEngine] with a well-typed
                 * [TranscriptionEngine] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) =
                    apply {
                        this.transcriptionEngine = transcriptionEngine
                    }

                /**
                 * Enables enhanced transcription, this works for models `phone_call` and `video`.
                 */
                fun useEnhanced(useEnhanced: Boolean) = useEnhanced(JsonField.of(useEnhanced))

                /**
                 * Sets [Builder.useEnhanced] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.useEnhanced] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun useEnhanced(useEnhanced: JsonField<Boolean>) = apply {
                    this.useEnhanced = useEnhanced
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Google].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Google =
                    Google(
                        enableSpeakerDiarization,
                        (hints ?: JsonMissing.of()).map { it.toImmutable() },
                        interimResults,
                        language,
                        maxSpeakerCount,
                        minSpeakerCount,
                        model,
                        profanityFilter,
                        (speechContext ?: JsonMissing.of()).map { it.toImmutable() },
                        transcriptionEngine,
                        useEnhanced,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Google = apply {
                if (validated) {
                    return@apply
                }

                enableSpeakerDiarization()
                hints()
                interimResults()
                language().ifPresent { it.validate() }
                maxSpeakerCount()
                minSpeakerCount()
                model().ifPresent { it.validate() }
                profanityFilter()
                speechContext().ifPresent { it.forEach { it.validate() } }
                transcriptionEngine().ifPresent { it.validate() }
                useEnhanced()
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
                (if (enableSpeakerDiarization.asKnown().isPresent) 1 else 0) +
                    (hints.asKnown().getOrNull()?.size ?: 0) +
                    (if (interimResults.asKnown().isPresent) 1 else 0) +
                    (language.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (maxSpeakerCount.asKnown().isPresent) 1 else 0) +
                    (if (minSpeakerCount.asKnown().isPresent) 1 else 0) +
                    (model.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (profanityFilter.asKnown().isPresent) 1 else 0) +
                    (speechContext.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (useEnhanced.asKnown().isPresent) 1 else 0)

            /** The model to use for transcription. */
            class Model @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LATEST_LONG = of("latest_long")

                    @JvmField val LATEST_SHORT = of("latest_short")

                    @JvmField val COMMAND_AND_SEARCH = of("command_and_search")

                    @JvmField val PHONE_CALL = of("phone_call")

                    @JvmField val VIDEO = of("video")

                    @JvmField val DEFAULT = of("default")

                    @JvmField val MEDICAL_CONVERSATION = of("medical_conversation")

                    @JvmField val MEDICAL_DICTATION = of("medical_dictation")

                    @JvmStatic fun of(value: String) = Model(JsonField.of(value))
                }

                /** An enum containing [Model]'s known values. */
                enum class Known {
                    LATEST_LONG,
                    LATEST_SHORT,
                    COMMAND_AND_SEARCH,
                    PHONE_CALL,
                    VIDEO,
                    DEFAULT,
                    MEDICAL_CONVERSATION,
                    MEDICAL_DICTATION,
                }

                /**
                 * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Model] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LATEST_LONG,
                    LATEST_SHORT,
                    COMMAND_AND_SEARCH,
                    PHONE_CALL,
                    VIDEO,
                    DEFAULT,
                    MEDICAL_CONVERSATION,
                    MEDICAL_DICTATION,
                    /**
                     * An enum member indicating that [Model] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LATEST_LONG -> Value.LATEST_LONG
                        LATEST_SHORT -> Value.LATEST_SHORT
                        COMMAND_AND_SEARCH -> Value.COMMAND_AND_SEARCH
                        PHONE_CALL -> Value.PHONE_CALL
                        VIDEO -> Value.VIDEO
                        DEFAULT -> Value.DEFAULT
                        MEDICAL_CONVERSATION -> Value.MEDICAL_CONVERSATION
                        MEDICAL_DICTATION -> Value.MEDICAL_DICTATION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        LATEST_LONG -> Known.LATEST_LONG
                        LATEST_SHORT -> Known.LATEST_SHORT
                        COMMAND_AND_SEARCH -> Known.COMMAND_AND_SEARCH
                        PHONE_CALL -> Known.PHONE_CALL
                        VIDEO -> Known.VIDEO
                        DEFAULT -> Known.DEFAULT
                        MEDICAL_CONVERSATION -> Known.MEDICAL_CONVERSATION
                        MEDICAL_DICTATION -> Known.MEDICAL_DICTATION
                        else -> throw TelnyxInvalidDataException("Unknown Model: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Model = apply {
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

                    return other is Model && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class SpeechContext
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val boost: JsonField<Double>,
                private val phrases: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("boost")
                    @ExcludeMissing
                    boost: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("phrases")
                    @ExcludeMissing
                    phrases: JsonField<List<String>> = JsonMissing.of(),
                ) : this(boost, phrases, mutableMapOf())

                /**
                 * Boost factor for the speech context.
                 *
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun boost(): Optional<Double> = boost.getOptional("boost")

                /**
                 * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun phrases(): Optional<List<String>> = phrases.getOptional("phrases")

                /**
                 * Returns the raw JSON value of [boost].
                 *
                 * Unlike [boost], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("boost") @ExcludeMissing fun _boost(): JsonField<Double> = boost

                /**
                 * Returns the raw JSON value of [phrases].
                 *
                 * Unlike [phrases], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("phrases")
                @ExcludeMissing
                fun _phrases(): JsonField<List<String>> = phrases

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
                     * Returns a mutable builder for constructing an instance of [SpeechContext].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SpeechContext]. */
                class Builder internal constructor() {

                    private var boost: JsonField<Double> = JsonMissing.of()
                    private var phrases: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(speechContext: SpeechContext) = apply {
                        boost = speechContext.boost
                        phrases = speechContext.phrases.map { it.toMutableList() }
                        additionalProperties = speechContext.additionalProperties.toMutableMap()
                    }

                    /** Boost factor for the speech context. */
                    fun boost(boost: Double) = boost(JsonField.of(boost))

                    /**
                     * Sets [Builder.boost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.boost] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun boost(boost: JsonField<Double>) = apply { this.boost = boost }

                    fun phrases(phrases: List<String>) = phrases(JsonField.of(phrases))

                    /**
                     * Sets [Builder.phrases] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phrases] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phrases(phrases: JsonField<List<String>>) = apply {
                        this.phrases = phrases.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [phrases].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addPhrase(phrase: String) = apply {
                        phrases =
                            (phrases ?: JsonField.of(mutableListOf())).also {
                                checkKnown("phrases", it).add(phrase)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [SpeechContext].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): SpeechContext =
                        SpeechContext(
                            boost,
                            (phrases ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): SpeechContext = apply {
                    if (validated) {
                        return@apply
                    }

                    boost()
                    phrases()
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
                    (if (boost.asKnown().isPresent) 1 else 0) +
                        (phrases.asKnown().getOrNull()?.size ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is SpeechContext &&
                        boost == other.boost &&
                        phrases == other.phrases &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(boost, phrases, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SpeechContext{boost=$boost, phrases=$phrases, additionalProperties=$additionalProperties}"
            }

            /** Engine identifier for Google transcription service */
            class TranscriptionEngine
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val GOOGLE = of("Google")

                    @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
                }

                /** An enum containing [TranscriptionEngine]'s known values. */
                enum class Known {
                    GOOGLE
                }

                /**
                 * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GOOGLE,
                    /**
                     * An enum member indicating that [TranscriptionEngine] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        GOOGLE -> Value.GOOGLE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        GOOGLE -> Known.GOOGLE
                        else ->
                            throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Google &&
                    enableSpeakerDiarization == other.enableSpeakerDiarization &&
                    hints == other.hints &&
                    interimResults == other.interimResults &&
                    language == other.language &&
                    maxSpeakerCount == other.maxSpeakerCount &&
                    minSpeakerCount == other.minSpeakerCount &&
                    model == other.model &&
                    profanityFilter == other.profanityFilter &&
                    speechContext == other.speechContext &&
                    transcriptionEngine == other.transcriptionEngine &&
                    useEnhanced == other.useEnhanced &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    enableSpeakerDiarization,
                    hints,
                    interimResults,
                    language,
                    maxSpeakerCount,
                    minSpeakerCount,
                    model,
                    profanityFilter,
                    speechContext,
                    transcriptionEngine,
                    useEnhanced,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Google{enableSpeakerDiarization=$enableSpeakerDiarization, hints=$hints, interimResults=$interimResults, language=$language, maxSpeakerCount=$maxSpeakerCount, minSpeakerCount=$minSpeakerCount, model=$model, profanityFilter=$profanityFilter, speechContext=$speechContext, transcriptionEngine=$transcriptionEngine, useEnhanced=$useEnhanced, additionalProperties=$additionalProperties}"
        }

        class Telnyx
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val language: JsonField<TelnyxTranscriptionLanguage>,
            private val transcriptionEngine: JsonField<TranscriptionEngine>,
            private val transcriptionModel: JsonField<TranscriptionModel>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<TelnyxTranscriptionLanguage> = JsonMissing.of(),
                @JsonProperty("transcription_engine")
                @ExcludeMissing
                transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
                @JsonProperty("transcription_model")
                @ExcludeMissing
                transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of(),
            ) : this(language, transcriptionEngine, transcriptionModel, mutableMapOf())

            /**
             * Language to use for speech recognition
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun language(): Optional<TelnyxTranscriptionLanguage> = language.getOptional("language")

            /**
             * Engine identifier for Telnyx transcription service
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcriptionEngine(): Optional<TranscriptionEngine> =
                transcriptionEngine.getOptional("transcription_engine")

            /**
             * The model to use for transcription.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun transcriptionModel(): Optional<TranscriptionModel> =
                transcriptionModel.getOptional("transcription_model")

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language")
            @ExcludeMissing
            fun _language(): JsonField<TelnyxTranscriptionLanguage> = language

            /**
             * Returns the raw JSON value of [transcriptionEngine].
             *
             * Unlike [transcriptionEngine], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            fun _transcriptionEngine(): JsonField<TranscriptionEngine> = transcriptionEngine

            /**
             * Returns the raw JSON value of [transcriptionModel].
             *
             * Unlike [transcriptionModel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transcription_model")
            @ExcludeMissing
            fun _transcriptionModel(): JsonField<TranscriptionModel> = transcriptionModel

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

                /** Returns a mutable builder for constructing an instance of [Telnyx]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Telnyx]. */
            class Builder internal constructor() {

                private var language: JsonField<TelnyxTranscriptionLanguage> = JsonMissing.of()
                private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
                private var transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(telnyx: Telnyx) = apply {
                    language = telnyx.language
                    transcriptionEngine = telnyx.transcriptionEngine
                    transcriptionModel = telnyx.transcriptionModel
                    additionalProperties = telnyx.additionalProperties.toMutableMap()
                }

                /** Language to use for speech recognition */
                fun language(language: TelnyxTranscriptionLanguage) =
                    language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed
                 * [TelnyxTranscriptionLanguage] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun language(language: JsonField<TelnyxTranscriptionLanguage>) = apply {
                    this.language = language
                }

                /** Engine identifier for Telnyx transcription service */
                fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                    transcriptionEngine(JsonField.of(transcriptionEngine))

                /**
                 * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcriptionEngine] with a well-typed
                 * [TranscriptionEngine] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) =
                    apply {
                        this.transcriptionEngine = transcriptionEngine
                    }

                /** The model to use for transcription. */
                fun transcriptionModel(transcriptionModel: TranscriptionModel) =
                    transcriptionModel(JsonField.of(transcriptionModel))

                /**
                 * Sets [Builder.transcriptionModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcriptionModel] with a well-typed
                 * [TranscriptionModel] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun transcriptionModel(transcriptionModel: JsonField<TranscriptionModel>) = apply {
                    this.transcriptionModel = transcriptionModel
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Telnyx].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Telnyx =
                    Telnyx(
                        language,
                        transcriptionEngine,
                        transcriptionModel,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Telnyx = apply {
                if (validated) {
                    return@apply
                }

                language().ifPresent { it.validate() }
                transcriptionEngine().ifPresent { it.validate() }
                transcriptionModel().ifPresent { it.validate() }
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
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                    (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                    (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0)

            /** Engine identifier for Telnyx transcription service */
            class TranscriptionEngine
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TELNYX = of("Telnyx")

                    @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
                }

                /** An enum containing [TranscriptionEngine]'s known values. */
                enum class Known {
                    TELNYX
                }

                /**
                 * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TELNYX,
                    /**
                     * An enum member indicating that [TranscriptionEngine] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TELNYX -> Value.TELNYX
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TELNYX -> Known.TELNYX
                        else ->
                            throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

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

            /** The model to use for transcription. */
            class TranscriptionModel
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val OPENAI_WHISPER_TINY = of("openai/whisper-tiny")

                    @JvmField
                    val OPENAI_WHISPER_LARGE_V3_TURBO = of("openai/whisper-large-v3-turbo")

                    @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
                }

                /** An enum containing [TranscriptionModel]'s known values. */
                enum class Known {
                    OPENAI_WHISPER_TINY,
                    OPENAI_WHISPER_LARGE_V3_TURBO,
                }

                /**
                 * An enum containing [TranscriptionModel]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [TranscriptionModel] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OPENAI_WHISPER_TINY,
                    OPENAI_WHISPER_LARGE_V3_TURBO,
                    /**
                     * An enum member indicating that [TranscriptionModel] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        OPENAI_WHISPER_TINY -> Value.OPENAI_WHISPER_TINY
                        OPENAI_WHISPER_LARGE_V3_TURBO -> Value.OPENAI_WHISPER_LARGE_V3_TURBO
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        OPENAI_WHISPER_TINY -> Known.OPENAI_WHISPER_TINY
                        OPENAI_WHISPER_LARGE_V3_TURBO -> Known.OPENAI_WHISPER_LARGE_V3_TURBO
                        else ->
                            throw TelnyxInvalidDataException("Unknown TranscriptionModel: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): TranscriptionModel = apply {
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

                    return other is TranscriptionModel && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Telnyx &&
                    language == other.language &&
                    transcriptionEngine == other.transcriptionEngine &&
                    transcriptionModel == other.transcriptionModel &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    language,
                    transcriptionEngine,
                    transcriptionModel,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Telnyx{language=$language, transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, additionalProperties=$additionalProperties}"
        }

        class Deepgram
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val transcriptionEngine: JsonValue,
            private val transcriptionModel: JsonField<TranscriptionModel>,
            private val language: JsonField<Language>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("transcription_engine")
                @ExcludeMissing
                transcriptionEngine: JsonValue = JsonMissing.of(),
                @JsonProperty("transcription_model")
                @ExcludeMissing
                transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<Language> = JsonMissing.of(),
            ) : this(transcriptionEngine, transcriptionModel, language, mutableMapOf())

            /**
             * Engine identifier for Deepgram transcription service
             *
             * Expected to always return the following:
             * ```java
             * JsonValue.from("Deepgram")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            fun _transcriptionEngine(): JsonValue = transcriptionEngine

            /**
             * The model to use for transcription.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transcriptionModel(): TranscriptionModel =
                transcriptionModel.getRequired("transcription_model")

            /**
             * Language to use for speech recognition. Available languages depend on the selected
             * model.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun language(): Optional<Language> = language.getOptional("language")

            /**
             * Returns the raw JSON value of [transcriptionModel].
             *
             * Unlike [transcriptionModel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("transcription_model")
            @ExcludeMissing
            fun _transcriptionModel(): JsonField<TranscriptionModel> = transcriptionModel

            /**
             * Returns the raw JSON value of [language].
             *
             * Unlike [language], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("language")
            @ExcludeMissing
            fun _language(): JsonField<Language> = language

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
                 * Returns a mutable builder for constructing an instance of [Deepgram].
                 *
                 * The following fields are required:
                 * ```java
                 * .transcriptionModel()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Deepgram]. */
            class Builder internal constructor() {

                private var transcriptionEngine: JsonValue = JsonValue.from("Deepgram")
                private var transcriptionModel: JsonField<TranscriptionModel>? = null
                private var language: JsonField<Language> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(deepgram: Deepgram) = apply {
                    transcriptionEngine = deepgram.transcriptionEngine
                    transcriptionModel = deepgram.transcriptionModel
                    language = deepgram.language
                    additionalProperties = deepgram.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("Deepgram")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun transcriptionEngine(transcriptionEngine: JsonValue) = apply {
                    this.transcriptionEngine = transcriptionEngine
                }

                /** The model to use for transcription. */
                fun transcriptionModel(transcriptionModel: TranscriptionModel) =
                    transcriptionModel(JsonField.of(transcriptionModel))

                /**
                 * Sets [Builder.transcriptionModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transcriptionModel] with a well-typed
                 * [TranscriptionModel] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun transcriptionModel(transcriptionModel: JsonField<TranscriptionModel>) = apply {
                    this.transcriptionModel = transcriptionModel
                }

                /**
                 * Language to use for speech recognition. Available languages depend on the
                 * selected model.
                 */
                fun language(language: Language) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [Language] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<Language>) = apply { this.language = language }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Deepgram].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .transcriptionModel()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Deepgram =
                    Deepgram(
                        transcriptionEngine,
                        checkRequired("transcriptionModel", transcriptionModel),
                        language,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Deepgram = apply {
                if (validated) {
                    return@apply
                }

                _transcriptionEngine().let {
                    if (it != JsonValue.from("Deepgram")) {
                        throw TelnyxInvalidDataException(
                            "'transcriptionEngine' is invalid, received $it"
                        )
                    }
                }
                transcriptionModel().validate()
                language().ifPresent { it.validate() }
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
                transcriptionEngine.let { if (it == JsonValue.from("Deepgram")) 1 else 0 } +
                    (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0) +
                    (language.asKnown().getOrNull()?.validity() ?: 0)

            /** The model to use for transcription. */
            class TranscriptionModel
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DEEPGRAM_NOVA_2 = of("deepgram/nova-2")

                    @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

                    @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
                }

                /** An enum containing [TranscriptionModel]'s known values. */
                enum class Known {
                    DEEPGRAM_NOVA_2,
                    DEEPGRAM_NOVA_3,
                }

                /**
                 * An enum containing [TranscriptionModel]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [TranscriptionModel] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DEEPGRAM_NOVA_2,
                    DEEPGRAM_NOVA_3,
                    /**
                     * An enum member indicating that [TranscriptionModel] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DEEPGRAM_NOVA_2 -> Value.DEEPGRAM_NOVA_2
                        DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DEEPGRAM_NOVA_2 -> Known.DEEPGRAM_NOVA_2
                        DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                        else ->
                            throw TelnyxInvalidDataException("Unknown TranscriptionModel: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): TranscriptionModel = apply {
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

                    return other is TranscriptionModel && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Language to use for speech recognition. Available languages depend on the selected
             * model.
             */
            class Language @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BG = of("bg")

                    @JvmField val CA = of("ca")

                    @JvmField val ZH = of("zh")

                    @JvmField val ZH_CN = of("zh-CN")

                    @JvmField val ZH_HANS = of("zh-Hans")

                    @JvmField val ZH_TW = of("zh-TW")

                    @JvmField val ZH_HANT = of("zh-Hant")

                    @JvmField val ZH_HK = of("zh-HK")

                    @JvmField val CS = of("cs")

                    @JvmField val DA = of("da")

                    @JvmField val DA_DK = of("da-DK")

                    @JvmField val NL = of("nl")

                    @JvmField val EN = of("en")

                    @JvmField val EN_US = of("en-US")

                    @JvmField val EN_AU = of("en-AU")

                    @JvmField val EN_GB = of("en-GB")

                    @JvmField val EN_NZ = of("en-NZ")

                    @JvmField val EN_IN = of("en-IN")

                    @JvmField val ET = of("et")

                    @JvmField val FI = of("fi")

                    @JvmField val NL_BE = of("nl-BE")

                    @JvmField val FR = of("fr")

                    @JvmField val FR_CA = of("fr-CA")

                    @JvmField val DE = of("de")

                    @JvmField val DE_CH = of("de-CH")

                    @JvmField val EL = of("el")

                    @JvmField val HI = of("hi")

                    @JvmField val HU = of("hu")

                    @JvmField val ID = of("id")

                    @JvmField val IT = of("it")

                    @JvmField val JA = of("ja")

                    @JvmField val KO = of("ko")

                    @JvmField val KO_KR = of("ko-KR")

                    @JvmField val LV = of("lv")

                    @JvmField val LT = of("lt")

                    @JvmField val MS = of("ms")

                    @JvmField val NO = of("no")

                    @JvmField val PL = of("pl")

                    @JvmField val PT = of("pt")

                    @JvmField val PT_BR = of("pt-BR")

                    @JvmField val PT_PT = of("pt-PT")

                    @JvmField val RO = of("ro")

                    @JvmField val RU = of("ru")

                    @JvmField val SK = of("sk")

                    @JvmField val ES = of("es")

                    @JvmField val ES_419 = of("es-419")

                    @JvmField val SV = of("sv")

                    @JvmField val SV_SE = of("sv-SE")

                    @JvmField val TH = of("th")

                    @JvmField val TH_TH = of("th-TH")

                    @JvmField val TR = of("tr")

                    @JvmField val UK = of("uk")

                    @JvmField val VI = of("vi")

                    @JvmField val AUTO_DETECT = of("auto_detect")

                    @JvmStatic fun of(value: String) = Language(JsonField.of(value))
                }

                /** An enum containing [Language]'s known values. */
                enum class Known {
                    BG,
                    CA,
                    ZH,
                    ZH_CN,
                    ZH_HANS,
                    ZH_TW,
                    ZH_HANT,
                    ZH_HK,
                    CS,
                    DA,
                    DA_DK,
                    NL,
                    EN,
                    EN_US,
                    EN_AU,
                    EN_GB,
                    EN_NZ,
                    EN_IN,
                    ET,
                    FI,
                    NL_BE,
                    FR,
                    FR_CA,
                    DE,
                    DE_CH,
                    EL,
                    HI,
                    HU,
                    ID,
                    IT,
                    JA,
                    KO,
                    KO_KR,
                    LV,
                    LT,
                    MS,
                    NO,
                    PL,
                    PT,
                    PT_BR,
                    PT_PT,
                    RO,
                    RU,
                    SK,
                    ES,
                    ES_419,
                    SV,
                    SV_SE,
                    TH,
                    TH_TH,
                    TR,
                    UK,
                    VI,
                    AUTO_DETECT,
                }

                /**
                 * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Language] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BG,
                    CA,
                    ZH,
                    ZH_CN,
                    ZH_HANS,
                    ZH_TW,
                    ZH_HANT,
                    ZH_HK,
                    CS,
                    DA,
                    DA_DK,
                    NL,
                    EN,
                    EN_US,
                    EN_AU,
                    EN_GB,
                    EN_NZ,
                    EN_IN,
                    ET,
                    FI,
                    NL_BE,
                    FR,
                    FR_CA,
                    DE,
                    DE_CH,
                    EL,
                    HI,
                    HU,
                    ID,
                    IT,
                    JA,
                    KO,
                    KO_KR,
                    LV,
                    LT,
                    MS,
                    NO,
                    PL,
                    PT,
                    PT_BR,
                    PT_PT,
                    RO,
                    RU,
                    SK,
                    ES,
                    ES_419,
                    SV,
                    SV_SE,
                    TH,
                    TH_TH,
                    TR,
                    UK,
                    VI,
                    AUTO_DETECT,
                    /**
                     * An enum member indicating that [Language] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BG -> Value.BG
                        CA -> Value.CA
                        ZH -> Value.ZH
                        ZH_CN -> Value.ZH_CN
                        ZH_HANS -> Value.ZH_HANS
                        ZH_TW -> Value.ZH_TW
                        ZH_HANT -> Value.ZH_HANT
                        ZH_HK -> Value.ZH_HK
                        CS -> Value.CS
                        DA -> Value.DA
                        DA_DK -> Value.DA_DK
                        NL -> Value.NL
                        EN -> Value.EN
                        EN_US -> Value.EN_US
                        EN_AU -> Value.EN_AU
                        EN_GB -> Value.EN_GB
                        EN_NZ -> Value.EN_NZ
                        EN_IN -> Value.EN_IN
                        ET -> Value.ET
                        FI -> Value.FI
                        NL_BE -> Value.NL_BE
                        FR -> Value.FR
                        FR_CA -> Value.FR_CA
                        DE -> Value.DE
                        DE_CH -> Value.DE_CH
                        EL -> Value.EL
                        HI -> Value.HI
                        HU -> Value.HU
                        ID -> Value.ID
                        IT -> Value.IT
                        JA -> Value.JA
                        KO -> Value.KO
                        KO_KR -> Value.KO_KR
                        LV -> Value.LV
                        LT -> Value.LT
                        MS -> Value.MS
                        NO -> Value.NO
                        PL -> Value.PL
                        PT -> Value.PT
                        PT_BR -> Value.PT_BR
                        PT_PT -> Value.PT_PT
                        RO -> Value.RO
                        RU -> Value.RU
                        SK -> Value.SK
                        ES -> Value.ES
                        ES_419 -> Value.ES_419
                        SV -> Value.SV
                        SV_SE -> Value.SV_SE
                        TH -> Value.TH
                        TH_TH -> Value.TH_TH
                        TR -> Value.TR
                        UK -> Value.UK
                        VI -> Value.VI
                        AUTO_DETECT -> Value.AUTO_DETECT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        BG -> Known.BG
                        CA -> Known.CA
                        ZH -> Known.ZH
                        ZH_CN -> Known.ZH_CN
                        ZH_HANS -> Known.ZH_HANS
                        ZH_TW -> Known.ZH_TW
                        ZH_HANT -> Known.ZH_HANT
                        ZH_HK -> Known.ZH_HK
                        CS -> Known.CS
                        DA -> Known.DA
                        DA_DK -> Known.DA_DK
                        NL -> Known.NL
                        EN -> Known.EN
                        EN_US -> Known.EN_US
                        EN_AU -> Known.EN_AU
                        EN_GB -> Known.EN_GB
                        EN_NZ -> Known.EN_NZ
                        EN_IN -> Known.EN_IN
                        ET -> Known.ET
                        FI -> Known.FI
                        NL_BE -> Known.NL_BE
                        FR -> Known.FR
                        FR_CA -> Known.FR_CA
                        DE -> Known.DE
                        DE_CH -> Known.DE_CH
                        EL -> Known.EL
                        HI -> Known.HI
                        HU -> Known.HU
                        ID -> Known.ID
                        IT -> Known.IT
                        JA -> Known.JA
                        KO -> Known.KO
                        KO_KR -> Known.KO_KR
                        LV -> Known.LV
                        LT -> Known.LT
                        MS -> Known.MS
                        NO -> Known.NO
                        PL -> Known.PL
                        PT -> Known.PT
                        PT_BR -> Known.PT_BR
                        PT_PT -> Known.PT_PT
                        RO -> Known.RO
                        RU -> Known.RU
                        SK -> Known.SK
                        ES -> Known.ES
                        ES_419 -> Known.ES_419
                        SV -> Known.SV
                        SV_SE -> Known.SV_SE
                        TH -> Known.TH
                        TH_TH -> Known.TH_TH
                        TR -> Known.TR
                        UK -> Known.UK
                        VI -> Known.VI
                        AUTO_DETECT -> Known.AUTO_DETECT
                        else -> throw TelnyxInvalidDataException("Unknown Language: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Language = apply {
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

                    return other is Language && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Deepgram &&
                    transcriptionEngine == other.transcriptionEngine &&
                    transcriptionModel == other.transcriptionModel &&
                    language == other.language &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    transcriptionEngine,
                    transcriptionModel,
                    language,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Deepgram{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, language=$language, additionalProperties=$additionalProperties}"
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
