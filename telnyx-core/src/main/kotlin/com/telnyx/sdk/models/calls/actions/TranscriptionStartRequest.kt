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
import com.telnyx.sdk.core.allMaxBy
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
        fun transcriptionEngineConfig(google: TranscriptionEngineGoogleConfig) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofGoogle(google))

        /**
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofTelnyx(telnyx)`.
         */
        fun transcriptionEngineConfig(telnyx: TranscriptionEngineTelnyxConfig) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofTelnyx(telnyx))

        /**
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofDeepgramNova2(deepgramNova2)`.
         */
        fun transcriptionEngineConfig(
            deepgramNova2: TranscriptionEngineConfig.DeepgramNova2Config
        ) = transcriptionEngineConfig(TranscriptionEngineConfig.ofDeepgramNova2(deepgramNova2))

        /**
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofDeepgramNova3(deepgramNova3)`.
         */
        fun transcriptionEngineConfig(
            deepgramNova3: TranscriptionEngineConfig.DeepgramNova3Config
        ) = transcriptionEngineConfig(TranscriptionEngineConfig.ofDeepgramNova3(deepgramNova3))

        /**
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofAzure(azure)`.
         */
        fun transcriptionEngineConfig(azure: TranscriptionEngineAzureConfig) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofAzure(azure))

        /**
         * Alias for calling [transcriptionEngineConfig] with the following:
         * ```java
         * TranscriptionEngineAzureConfig.builder()
         *     .transcriptionEngine(TranscriptionEngineAzureConfig.TranscriptionEngine.AZURE)
         *     .region(region)
         *     .build()
         * ```
         */
        fun azureTranscriptionEngineConfig(region: TranscriptionEngineAzureConfig.Region) =
            transcriptionEngineConfig(
                TranscriptionEngineAzureConfig.builder()
                    .transcriptionEngine(TranscriptionEngineAzureConfig.TranscriptionEngine.AZURE)
                    .region(region)
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

            @JvmField val AZURE = of("Azure")

            @JvmField val A = of("A")

            @JvmField val B = of("B")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            GOOGLE,
            TELNYX,
            DEEPGRAM,
            AZURE,
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
            AZURE,
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
                AZURE -> Value.AZURE
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
                AZURE -> Known.AZURE
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
        private val google: TranscriptionEngineGoogleConfig? = null,
        private val telnyx: TranscriptionEngineTelnyxConfig? = null,
        private val deepgramNova2: DeepgramNova2Config? = null,
        private val deepgramNova3: DeepgramNova3Config? = null,
        private val azure: TranscriptionEngineAzureConfig? = null,
        private val a: TranscriptionEngineAConfig? = null,
        private val b: TranscriptionEngineBConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun google(): Optional<TranscriptionEngineGoogleConfig> = Optional.ofNullable(google)

        fun telnyx(): Optional<TranscriptionEngineTelnyxConfig> = Optional.ofNullable(telnyx)

        fun deepgramNova2(): Optional<DeepgramNova2Config> = Optional.ofNullable(deepgramNova2)

        fun deepgramNova3(): Optional<DeepgramNova3Config> = Optional.ofNullable(deepgramNova3)

        fun azure(): Optional<TranscriptionEngineAzureConfig> = Optional.ofNullable(azure)

        fun a(): Optional<TranscriptionEngineAConfig> = Optional.ofNullable(a)

        fun b(): Optional<TranscriptionEngineBConfig> = Optional.ofNullable(b)

        fun isGoogle(): Boolean = google != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isDeepgramNova2(): Boolean = deepgramNova2 != null

        fun isDeepgramNova3(): Boolean = deepgramNova3 != null

        fun isAzure(): Boolean = azure != null

        fun isA(): Boolean = a != null

        fun isB(): Boolean = b != null

        fun asGoogle(): TranscriptionEngineGoogleConfig = google.getOrThrow("google")

        fun asTelnyx(): TranscriptionEngineTelnyxConfig = telnyx.getOrThrow("telnyx")

        fun asDeepgramNova2(): DeepgramNova2Config = deepgramNova2.getOrThrow("deepgramNova2")

        fun asDeepgramNova3(): DeepgramNova3Config = deepgramNova3.getOrThrow("deepgramNova3")

        fun asAzure(): TranscriptionEngineAzureConfig = azure.getOrThrow("azure")

        fun asA(): TranscriptionEngineAConfig = a.getOrThrow("a")

        fun asB(): TranscriptionEngineBConfig = b.getOrThrow("b")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                google != null -> visitor.visitGoogle(google)
                telnyx != null -> visitor.visitTelnyx(telnyx)
                deepgramNova2 != null -> visitor.visitDeepgramNova2(deepgramNova2)
                deepgramNova3 != null -> visitor.visitDeepgramNova3(deepgramNova3)
                azure != null -> visitor.visitAzure(azure)
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
                    override fun visitGoogle(google: TranscriptionEngineGoogleConfig) {
                        google.validate()
                    }

                    override fun visitTelnyx(telnyx: TranscriptionEngineTelnyxConfig) {
                        telnyx.validate()
                    }

                    override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config) {
                        deepgramNova2.validate()
                    }

                    override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config) {
                        deepgramNova3.validate()
                    }

                    override fun visitAzure(azure: TranscriptionEngineAzureConfig) {
                        azure.validate()
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
                    override fun visitGoogle(google: TranscriptionEngineGoogleConfig) =
                        google.validity()

                    override fun visitTelnyx(telnyx: TranscriptionEngineTelnyxConfig) =
                        telnyx.validity()

                    override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config) =
                        deepgramNova2.validity()

                    override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config) =
                        deepgramNova3.validity()

                    override fun visitAzure(azure: TranscriptionEngineAzureConfig) =
                        azure.validity()

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
                deepgramNova2 == other.deepgramNova2 &&
                deepgramNova3 == other.deepgramNova3 &&
                azure == other.azure &&
                a == other.a &&
                b == other.b
        }

        override fun hashCode(): Int =
            Objects.hash(google, telnyx, deepgramNova2, deepgramNova3, azure, a, b)

        override fun toString(): String =
            when {
                google != null -> "TranscriptionEngineConfig{google=$google}"
                telnyx != null -> "TranscriptionEngineConfig{telnyx=$telnyx}"
                deepgramNova2 != null -> "TranscriptionEngineConfig{deepgramNova2=$deepgramNova2}"
                deepgramNova3 != null -> "TranscriptionEngineConfig{deepgramNova3=$deepgramNova3}"
                azure != null -> "TranscriptionEngineConfig{azure=$azure}"
                a != null -> "TranscriptionEngineConfig{a=$a}"
                b != null -> "TranscriptionEngineConfig{b=$b}"
                _json != null -> "TranscriptionEngineConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TranscriptionEngineConfig")
            }

        companion object {

            @JvmStatic
            fun ofGoogle(google: TranscriptionEngineGoogleConfig) =
                TranscriptionEngineConfig(google = google)

            @JvmStatic
            fun ofTelnyx(telnyx: TranscriptionEngineTelnyxConfig) =
                TranscriptionEngineConfig(telnyx = telnyx)

            @JvmStatic
            fun ofDeepgramNova2(deepgramNova2: DeepgramNova2Config) =
                TranscriptionEngineConfig(deepgramNova2 = deepgramNova2)

            @JvmStatic
            fun ofDeepgramNova3(deepgramNova3: DeepgramNova3Config) =
                TranscriptionEngineConfig(deepgramNova3 = deepgramNova3)

            @JvmStatic
            fun ofAzure(azure: TranscriptionEngineAzureConfig) =
                TranscriptionEngineConfig(azure = azure)

            @JvmStatic fun ofA(a: TranscriptionEngineAConfig) = TranscriptionEngineConfig(a = a)

            @JvmStatic fun ofB(b: TranscriptionEngineBConfig) = TranscriptionEngineConfig(b = b)
        }

        /**
         * An interface that defines how to map each variant of [TranscriptionEngineConfig] to a
         * value of type [T].
         */
        interface Visitor<out T> {

            fun visitGoogle(google: TranscriptionEngineGoogleConfig): T

            fun visitTelnyx(telnyx: TranscriptionEngineTelnyxConfig): T

            fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config): T

            fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config): T

            fun visitAzure(azure: TranscriptionEngineAzureConfig): T

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
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<TranscriptionEngineGoogleConfig>(),
                            )
                            ?.let { TranscriptionEngineConfig(google = it, _json = json) }
                            ?: TranscriptionEngineConfig(_json = json)
                    }
                    "Telnyx" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<TranscriptionEngineTelnyxConfig>(),
                            )
                            ?.let { TranscriptionEngineConfig(telnyx = it, _json = json) }
                            ?: TranscriptionEngineConfig(_json = json)
                    }
                    "Azure" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<TranscriptionEngineAzureConfig>(),
                            )
                            ?.let { TranscriptionEngineConfig(azure = it, _json = json) }
                            ?: TranscriptionEngineConfig(_json = json)
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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DeepgramNova2Config>())?.let {
                                TranscriptionEngineConfig(deepgramNova2 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DeepgramNova3Config>())?.let {
                                TranscriptionEngineConfig(deepgramNova3 = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> TranscriptionEngineConfig(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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
                    value.deepgramNova2 != null -> generator.writeObject(value.deepgramNova2)
                    value.deepgramNova3 != null -> generator.writeObject(value.deepgramNova3)
                    value.azure != null -> generator.writeObject(value.azure)
                    value.a != null -> generator.writeObject(value.a)
                    value.b != null -> generator.writeObject(value.b)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TranscriptionEngineConfig")
                }
            }
        }

        class DeepgramNova2Config
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val transcriptionEngine: JsonValue,
            private val transcriptionModel: JsonField<TranscriptionModel>,
            private val keywordsBoosting: JsonField<KeywordsBoosting>,
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
                @JsonProperty("keywords_boosting")
                @ExcludeMissing
                keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<Language> = JsonMissing.of(),
            ) : this(
                transcriptionEngine,
                transcriptionModel,
                keywordsBoosting,
                language,
                mutableMapOf(),
            )

            /**
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transcriptionModel(): TranscriptionModel =
                transcriptionModel.getRequired("transcription_model")

            /**
             * Keywords and their respective intensifiers (boosting values) to improve transcription
             * accuracy for specific words or phrases. The intensifier should be a numeric value.
             * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keywordsBoosting(): Optional<KeywordsBoosting> =
                keywordsBoosting.getOptional("keywords_boosting")

            /**
             * Language to use for speech recognition with nova-2 model
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
             * Returns the raw JSON value of [keywordsBoosting].
             *
             * Unlike [keywordsBoosting], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("keywords_boosting")
            @ExcludeMissing
            fun _keywordsBoosting(): JsonField<KeywordsBoosting> = keywordsBoosting

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
                 * Returns a mutable builder for constructing an instance of [DeepgramNova2Config].
                 *
                 * The following fields are required:
                 * ```java
                 * .transcriptionModel()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DeepgramNova2Config]. */
            class Builder internal constructor() {

                private var transcriptionEngine: JsonValue = JsonValue.from("Deepgram")
                private var transcriptionModel: JsonField<TranscriptionModel>? = null
                private var keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of()
                private var language: JsonField<Language> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(deepgramNova2Config: DeepgramNova2Config) = apply {
                    transcriptionEngine = deepgramNova2Config.transcriptionEngine
                    transcriptionModel = deepgramNova2Config.transcriptionModel
                    keywordsBoosting = deepgramNova2Config.keywordsBoosting
                    language = deepgramNova2Config.language
                    additionalProperties = deepgramNova2Config.additionalProperties.toMutableMap()
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
                 * Keywords and their respective intensifiers (boosting values) to improve
                 * transcription accuracy for specific words or phrases. The intensifier should be a
                 * numeric value. Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
                 */
                fun keywordsBoosting(keywordsBoosting: KeywordsBoosting) =
                    keywordsBoosting(JsonField.of(keywordsBoosting))

                /**
                 * Sets [Builder.keywordsBoosting] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keywordsBoosting] with a well-typed
                 * [KeywordsBoosting] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun keywordsBoosting(keywordsBoosting: JsonField<KeywordsBoosting>) = apply {
                    this.keywordsBoosting = keywordsBoosting
                }

                /** Language to use for speech recognition with nova-2 model */
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
                 * Returns an immutable instance of [DeepgramNova2Config].
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
                fun build(): DeepgramNova2Config =
                    DeepgramNova2Config(
                        transcriptionEngine,
                        checkRequired("transcriptionModel", transcriptionModel),
                        keywordsBoosting,
                        language,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DeepgramNova2Config = apply {
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
                keywordsBoosting().ifPresent { it.validate() }
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
                    (keywordsBoosting.asKnown().getOrNull()?.validity() ?: 0) +
                    (language.asKnown().getOrNull()?.validity() ?: 0)

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

                    @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
                }

                /** An enum containing [TranscriptionModel]'s known values. */
                enum class Known {
                    DEEPGRAM_NOVA_2
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
             * Keywords and their respective intensifiers (boosting values) to improve transcription
             * accuracy for specific words or phrases. The intensifier should be a numeric value.
             * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
             */
            class KeywordsBoosting
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [KeywordsBoosting].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [KeywordsBoosting]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(keywordsBoosting: KeywordsBoosting) = apply {
                        additionalProperties = keywordsBoosting.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [KeywordsBoosting].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): KeywordsBoosting =
                        KeywordsBoosting(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): KeywordsBoosting = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is KeywordsBoosting &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "KeywordsBoosting{additionalProperties=$additionalProperties}"
            }

            /** Language to use for speech recognition with nova-2 model */
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

                return other is DeepgramNova2Config &&
                    transcriptionEngine == other.transcriptionEngine &&
                    transcriptionModel == other.transcriptionModel &&
                    keywordsBoosting == other.keywordsBoosting &&
                    language == other.language &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    transcriptionEngine,
                    transcriptionModel,
                    keywordsBoosting,
                    language,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DeepgramNova2Config{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, keywordsBoosting=$keywordsBoosting, language=$language, additionalProperties=$additionalProperties}"
        }

        class DeepgramNova3Config
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val transcriptionEngine: JsonValue,
            private val transcriptionModel: JsonField<TranscriptionModel>,
            private val keywordsBoosting: JsonField<KeywordsBoosting>,
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
                @JsonProperty("keywords_boosting")
                @ExcludeMissing
                keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<Language> = JsonMissing.of(),
            ) : this(
                transcriptionEngine,
                transcriptionModel,
                keywordsBoosting,
                language,
                mutableMapOf(),
            )

            /**
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
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transcriptionModel(): TranscriptionModel =
                transcriptionModel.getRequired("transcription_model")

            /**
             * Keywords and their respective intensifiers (boosting values) to improve transcription
             * accuracy for specific words or phrases. The intensifier should be a numeric value.
             * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun keywordsBoosting(): Optional<KeywordsBoosting> =
                keywordsBoosting.getOptional("keywords_boosting")

            /**
             * Language to use for speech recognition with nova-3 model
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
             * Returns the raw JSON value of [keywordsBoosting].
             *
             * Unlike [keywordsBoosting], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("keywords_boosting")
            @ExcludeMissing
            fun _keywordsBoosting(): JsonField<KeywordsBoosting> = keywordsBoosting

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
                 * Returns a mutable builder for constructing an instance of [DeepgramNova3Config].
                 *
                 * The following fields are required:
                 * ```java
                 * .transcriptionModel()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DeepgramNova3Config]. */
            class Builder internal constructor() {

                private var transcriptionEngine: JsonValue = JsonValue.from("Deepgram")
                private var transcriptionModel: JsonField<TranscriptionModel>? = null
                private var keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of()
                private var language: JsonField<Language> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(deepgramNova3Config: DeepgramNova3Config) = apply {
                    transcriptionEngine = deepgramNova3Config.transcriptionEngine
                    transcriptionModel = deepgramNova3Config.transcriptionModel
                    keywordsBoosting = deepgramNova3Config.keywordsBoosting
                    language = deepgramNova3Config.language
                    additionalProperties = deepgramNova3Config.additionalProperties.toMutableMap()
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
                 * Keywords and their respective intensifiers (boosting values) to improve
                 * transcription accuracy for specific words or phrases. The intensifier should be a
                 * numeric value. Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
                 */
                fun keywordsBoosting(keywordsBoosting: KeywordsBoosting) =
                    keywordsBoosting(JsonField.of(keywordsBoosting))

                /**
                 * Sets [Builder.keywordsBoosting] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.keywordsBoosting] with a well-typed
                 * [KeywordsBoosting] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun keywordsBoosting(keywordsBoosting: JsonField<KeywordsBoosting>) = apply {
                    this.keywordsBoosting = keywordsBoosting
                }

                /** Language to use for speech recognition with nova-3 model */
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
                 * Returns an immutable instance of [DeepgramNova3Config].
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
                fun build(): DeepgramNova3Config =
                    DeepgramNova3Config(
                        transcriptionEngine,
                        checkRequired("transcriptionModel", transcriptionModel),
                        keywordsBoosting,
                        language,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DeepgramNova3Config = apply {
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
                keywordsBoosting().ifPresent { it.validate() }
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
                    (keywordsBoosting.asKnown().getOrNull()?.validity() ?: 0) +
                    (language.asKnown().getOrNull()?.validity() ?: 0)

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

                    @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

                    @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
                }

                /** An enum containing [TranscriptionModel]'s known values. */
                enum class Known {
                    DEEPGRAM_NOVA_3
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
             * Keywords and their respective intensifiers (boosting values) to improve transcription
             * accuracy for specific words or phrases. The intensifier should be a numeric value.
             * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
             */
            class KeywordsBoosting
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [KeywordsBoosting].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [KeywordsBoosting]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(keywordsBoosting: KeywordsBoosting) = apply {
                        additionalProperties = keywordsBoosting.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [KeywordsBoosting].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): KeywordsBoosting =
                        KeywordsBoosting(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): KeywordsBoosting = apply {
                    if (validated) {
                        return@apply
                    }

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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is KeywordsBoosting &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "KeywordsBoosting{additionalProperties=$additionalProperties}"
            }

            /** Language to use for speech recognition with nova-3 model */
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

                    @JvmField val EN = of("en")

                    @JvmField val EN_US = of("en-US")

                    @JvmField val EN_AU = of("en-AU")

                    @JvmField val EN_GB = of("en-GB")

                    @JvmField val EN_IN = of("en-IN")

                    @JvmField val EN_NZ = of("en-NZ")

                    @JvmField val DE = of("de")

                    @JvmField val NL = of("nl")

                    @JvmField val SV = of("sv")

                    @JvmField val SV_SE = of("sv-SE")

                    @JvmField val DA = of("da")

                    @JvmField val DA_DK = of("da-DK")

                    @JvmField val ES = of("es")

                    @JvmField val ES_419 = of("es-419")

                    @JvmField val FR = of("fr")

                    @JvmField val FR_CA = of("fr-CA")

                    @JvmField val PT = of("pt")

                    @JvmField val PT_BR = of("pt-BR")

                    @JvmField val PT_PT = of("pt-PT")

                    @JvmField val AUTO_DETECT = of("auto_detect")

                    @JvmStatic fun of(value: String) = Language(JsonField.of(value))
                }

                /** An enum containing [Language]'s known values. */
                enum class Known {
                    EN,
                    EN_US,
                    EN_AU,
                    EN_GB,
                    EN_IN,
                    EN_NZ,
                    DE,
                    NL,
                    SV,
                    SV_SE,
                    DA,
                    DA_DK,
                    ES,
                    ES_419,
                    FR,
                    FR_CA,
                    PT,
                    PT_BR,
                    PT_PT,
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
                    EN,
                    EN_US,
                    EN_AU,
                    EN_GB,
                    EN_IN,
                    EN_NZ,
                    DE,
                    NL,
                    SV,
                    SV_SE,
                    DA,
                    DA_DK,
                    ES,
                    ES_419,
                    FR,
                    FR_CA,
                    PT,
                    PT_BR,
                    PT_PT,
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
                        EN -> Value.EN
                        EN_US -> Value.EN_US
                        EN_AU -> Value.EN_AU
                        EN_GB -> Value.EN_GB
                        EN_IN -> Value.EN_IN
                        EN_NZ -> Value.EN_NZ
                        DE -> Value.DE
                        NL -> Value.NL
                        SV -> Value.SV
                        SV_SE -> Value.SV_SE
                        DA -> Value.DA
                        DA_DK -> Value.DA_DK
                        ES -> Value.ES
                        ES_419 -> Value.ES_419
                        FR -> Value.FR
                        FR_CA -> Value.FR_CA
                        PT -> Value.PT
                        PT_BR -> Value.PT_BR
                        PT_PT -> Value.PT_PT
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
                        EN -> Known.EN
                        EN_US -> Known.EN_US
                        EN_AU -> Known.EN_AU
                        EN_GB -> Known.EN_GB
                        EN_IN -> Known.EN_IN
                        EN_NZ -> Known.EN_NZ
                        DE -> Known.DE
                        NL -> Known.NL
                        SV -> Known.SV
                        SV_SE -> Known.SV_SE
                        DA -> Known.DA
                        DA_DK -> Known.DA_DK
                        ES -> Known.ES
                        ES_419 -> Known.ES_419
                        FR -> Known.FR
                        FR_CA -> Known.FR_CA
                        PT -> Known.PT
                        PT_BR -> Known.PT_BR
                        PT_PT -> Known.PT_PT
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

                return other is DeepgramNova3Config &&
                    transcriptionEngine == other.transcriptionEngine &&
                    transcriptionModel == other.transcriptionModel &&
                    keywordsBoosting == other.keywordsBoosting &&
                    language == other.language &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    transcriptionEngine,
                    transcriptionModel,
                    keywordsBoosting,
                    language,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DeepgramNova3Config{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, keywordsBoosting=$keywordsBoosting, language=$language, additionalProperties=$additionalProperties}"
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
