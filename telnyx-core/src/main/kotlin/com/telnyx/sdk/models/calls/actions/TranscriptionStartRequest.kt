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
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofXAi(xAi)`.
         */
        fun transcriptionEngineConfig(xAi: TranscriptionEngineConfig.XAi) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofXAi(xAi))

        /**
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofAssemblyAi(assemblyAi)`.
         */
        fun transcriptionEngineConfig(assemblyAi: TranscriptionEngineConfig.AssemblyAi) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofAssemblyAi(assemblyAi))

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
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofDeepgramNova2(deepgramNova2)`.
         */
        fun transcriptionEngineConfig(deepgramNova2: DeepgramNova2Config) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofDeepgramNova2(deepgramNova2))

        /**
         * Alias for calling [transcriptionEngineConfig] with the following:
         * ```java
         * DeepgramNova2Config.builder()
         *     .transcriptionEngine(DeepgramNova2Config.TranscriptionEngine.DEEPGRAM_NOVA_2)
         *     .transcriptionModel(transcriptionModel)
         *     .build()
         * ```
         */
        fun deepgramNova2TranscriptionEngineConfig(
            transcriptionModel: DeepgramNova2Config.TranscriptionModel
        ) =
            transcriptionEngineConfig(
                DeepgramNova2Config.builder()
                    .transcriptionEngine(DeepgramNova2Config.TranscriptionEngine.DEEPGRAM_NOVA_2)
                    .transcriptionModel(transcriptionModel)
                    .build()
            )

        /**
         * Alias for calling [transcriptionEngineConfig] with
         * `TranscriptionEngineConfig.ofDeepgramNova3(deepgramNova3)`.
         */
        fun transcriptionEngineConfig(deepgramNova3: DeepgramNova3Config) =
            transcriptionEngineConfig(TranscriptionEngineConfig.ofDeepgramNova3(deepgramNova3))

        /**
         * Alias for calling [transcriptionEngineConfig] with the following:
         * ```java
         * DeepgramNova3Config.builder()
         *     .transcriptionEngine(DeepgramNova3Config.TranscriptionEngine.DEEPGRAM_NOVA_3)
         *     .transcriptionModel(transcriptionModel)
         *     .build()
         * ```
         */
        fun deepgramNova3TranscriptionEngineConfig(
            transcriptionModel: DeepgramNova3Config.TranscriptionModel
        ) =
            transcriptionEngineConfig(
                DeepgramNova3Config.builder()
                    .transcriptionEngine(DeepgramNova3Config.TranscriptionEngine.DEEPGRAM_NOVA_3)
                    .transcriptionModel(transcriptionModel)
                    .build()
            )

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

            @JvmField val X_AI = of("xAI")

            @JvmField val ASSEMBLY_AI = of("AssemblyAI")

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
            X_AI,
            ASSEMBLY_AI,
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
            X_AI,
            ASSEMBLY_AI,
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
                X_AI -> Value.X_AI
                ASSEMBLY_AI -> Value.ASSEMBLY_AI
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
                X_AI -> Known.X_AI
                ASSEMBLY_AI -> Known.ASSEMBLY_AI
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
        private val azure: TranscriptionEngineAzureConfig? = null,
        private val xAi: XAi? = null,
        private val assemblyAi: AssemblyAi? = null,
        private val a: TranscriptionEngineAConfig? = null,
        private val b: TranscriptionEngineBConfig? = null,
        private val deepgramNova2: DeepgramNova2Config? = null,
        private val deepgramNova3: DeepgramNova3Config? = null,
        private val _json: JsonValue? = null,
    ) {

        fun google(): Optional<TranscriptionEngineGoogleConfig> = Optional.ofNullable(google)

        fun telnyx(): Optional<TranscriptionEngineTelnyxConfig> = Optional.ofNullable(telnyx)

        fun azure(): Optional<TranscriptionEngineAzureConfig> = Optional.ofNullable(azure)

        fun xAi(): Optional<XAi> = Optional.ofNullable(xAi)

        fun assemblyAi(): Optional<AssemblyAi> = Optional.ofNullable(assemblyAi)

        fun a(): Optional<TranscriptionEngineAConfig> = Optional.ofNullable(a)

        fun b(): Optional<TranscriptionEngineBConfig> = Optional.ofNullable(b)

        fun deepgramNova2(): Optional<DeepgramNova2Config> = Optional.ofNullable(deepgramNova2)

        fun deepgramNova3(): Optional<DeepgramNova3Config> = Optional.ofNullable(deepgramNova3)

        fun isGoogle(): Boolean = google != null

        fun isTelnyx(): Boolean = telnyx != null

        fun isAzure(): Boolean = azure != null

        fun isXAi(): Boolean = xAi != null

        fun isAssemblyAi(): Boolean = assemblyAi != null

        fun isA(): Boolean = a != null

        fun isB(): Boolean = b != null

        fun isDeepgramNova2(): Boolean = deepgramNova2 != null

        fun isDeepgramNova3(): Boolean = deepgramNova3 != null

        fun asGoogle(): TranscriptionEngineGoogleConfig = google.getOrThrow("google")

        fun asTelnyx(): TranscriptionEngineTelnyxConfig = telnyx.getOrThrow("telnyx")

        fun asAzure(): TranscriptionEngineAzureConfig = azure.getOrThrow("azure")

        fun asXAi(): XAi = xAi.getOrThrow("xAi")

        fun asAssemblyAi(): AssemblyAi = assemblyAi.getOrThrow("assemblyAi")

        fun asA(): TranscriptionEngineAConfig = a.getOrThrow("a")

        fun asB(): TranscriptionEngineBConfig = b.getOrThrow("b")

        fun asDeepgramNova2(): DeepgramNova2Config = deepgramNova2.getOrThrow("deepgramNova2")

        fun asDeepgramNova3(): DeepgramNova3Config = deepgramNova3.getOrThrow("deepgramNova3")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                google != null -> visitor.visitGoogle(google)
                telnyx != null -> visitor.visitTelnyx(telnyx)
                azure != null -> visitor.visitAzure(azure)
                xAi != null -> visitor.visitXAi(xAi)
                assemblyAi != null -> visitor.visitAssemblyAi(assemblyAi)
                a != null -> visitor.visitA(a)
                b != null -> visitor.visitB(b)
                deepgramNova2 != null -> visitor.visitDeepgramNova2(deepgramNova2)
                deepgramNova3 != null -> visitor.visitDeepgramNova3(deepgramNova3)
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

                    override fun visitAzure(azure: TranscriptionEngineAzureConfig) {
                        azure.validate()
                    }

                    override fun visitXAi(xAi: XAi) {
                        xAi.validate()
                    }

                    override fun visitAssemblyAi(assemblyAi: AssemblyAi) {
                        assemblyAi.validate()
                    }

                    override fun visitA(a: TranscriptionEngineAConfig) {
                        a.validate()
                    }

                    override fun visitB(b: TranscriptionEngineBConfig) {
                        b.validate()
                    }

                    override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config) {
                        deepgramNova2.validate()
                    }

                    override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config) {
                        deepgramNova3.validate()
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

                    override fun visitAzure(azure: TranscriptionEngineAzureConfig) =
                        azure.validity()

                    override fun visitXAi(xAi: XAi) = xAi.validity()

                    override fun visitAssemblyAi(assemblyAi: AssemblyAi) = assemblyAi.validity()

                    override fun visitA(a: TranscriptionEngineAConfig) = a.validity()

                    override fun visitB(b: TranscriptionEngineBConfig) = b.validity()

                    override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config) =
                        deepgramNova2.validity()

                    override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config) =
                        deepgramNova3.validity()

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
                azure == other.azure &&
                xAi == other.xAi &&
                assemblyAi == other.assemblyAi &&
                a == other.a &&
                b == other.b &&
                deepgramNova2 == other.deepgramNova2 &&
                deepgramNova3 == other.deepgramNova3
        }

        override fun hashCode(): Int =
            Objects.hash(google, telnyx, azure, xAi, assemblyAi, a, b, deepgramNova2, deepgramNova3)

        override fun toString(): String =
            when {
                google != null -> "TranscriptionEngineConfig{google=$google}"
                telnyx != null -> "TranscriptionEngineConfig{telnyx=$telnyx}"
                azure != null -> "TranscriptionEngineConfig{azure=$azure}"
                xAi != null -> "TranscriptionEngineConfig{xAi=$xAi}"
                assemblyAi != null -> "TranscriptionEngineConfig{assemblyAi=$assemblyAi}"
                a != null -> "TranscriptionEngineConfig{a=$a}"
                b != null -> "TranscriptionEngineConfig{b=$b}"
                deepgramNova2 != null -> "TranscriptionEngineConfig{deepgramNova2=$deepgramNova2}"
                deepgramNova3 != null -> "TranscriptionEngineConfig{deepgramNova3=$deepgramNova3}"
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
            fun ofAzure(azure: TranscriptionEngineAzureConfig) =
                TranscriptionEngineConfig(azure = azure)

            @JvmStatic fun ofXAi(xAi: XAi) = TranscriptionEngineConfig(xAi = xAi)

            @JvmStatic
            fun ofAssemblyAi(assemblyAi: AssemblyAi) =
                TranscriptionEngineConfig(assemblyAi = assemblyAi)

            @JvmStatic fun ofA(a: TranscriptionEngineAConfig) = TranscriptionEngineConfig(a = a)

            @JvmStatic fun ofB(b: TranscriptionEngineBConfig) = TranscriptionEngineConfig(b = b)

            @JvmStatic
            fun ofDeepgramNova2(deepgramNova2: DeepgramNova2Config) =
                TranscriptionEngineConfig(deepgramNova2 = deepgramNova2)

            @JvmStatic
            fun ofDeepgramNova3(deepgramNova3: DeepgramNova3Config) =
                TranscriptionEngineConfig(deepgramNova3 = deepgramNova3)
        }

        /**
         * An interface that defines how to map each variant of [TranscriptionEngineConfig] to a
         * value of type [T].
         */
        interface Visitor<out T> {

            fun visitGoogle(google: TranscriptionEngineGoogleConfig): T

            fun visitTelnyx(telnyx: TranscriptionEngineTelnyxConfig): T

            fun visitAzure(azure: TranscriptionEngineAzureConfig): T

            fun visitXAi(xAi: XAi): T

            fun visitAssemblyAi(assemblyAi: AssemblyAi): T

            fun visitA(a: TranscriptionEngineAConfig): T

            fun visitB(b: TranscriptionEngineBConfig): T

            fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config): T

            fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config): T

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
                    "xAI" -> {
                        return tryDeserialize(node, jacksonTypeRef<XAi>())?.let {
                            TranscriptionEngineConfig(xAi = it, _json = json)
                        } ?: TranscriptionEngineConfig(_json = json)
                    }
                    "AssemblyAI" -> {
                        return tryDeserialize(node, jacksonTypeRef<AssemblyAi>())?.let {
                            TranscriptionEngineConfig(assemblyAi = it, _json = json)
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
                    "deepgram/nova-2" -> {
                        return tryDeserialize(node, jacksonTypeRef<DeepgramNova2Config>())?.let {
                            TranscriptionEngineConfig(deepgramNova2 = it, _json = json)
                        } ?: TranscriptionEngineConfig(_json = json)
                    }
                    "deepgram/nova-3" -> {
                        return tryDeserialize(node, jacksonTypeRef<DeepgramNova3Config>())?.let {
                            TranscriptionEngineConfig(deepgramNova3 = it, _json = json)
                        } ?: TranscriptionEngineConfig(_json = json)
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
                    value.azure != null -> generator.writeObject(value.azure)
                    value.xAi != null -> generator.writeObject(value.xAi)
                    value.assemblyAi != null -> generator.writeObject(value.assemblyAi)
                    value.a != null -> generator.writeObject(value.a)
                    value.b != null -> generator.writeObject(value.b)
                    value.deepgramNova2 != null -> generator.writeObject(value.deepgramNova2)
                    value.deepgramNova3 != null -> generator.writeObject(value.deepgramNova3)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TranscriptionEngineConfig")
                }
            }
        }

        class XAi
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val interimResults: JsonField<Boolean>,
            private val language: JsonField<Language>,
            private val transcriptionEngine: JsonField<TranscriptionEngine>,
            private val transcriptionModel: JsonField<TranscriptionModel>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("interim_results")
                @ExcludeMissing
                interimResults: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("language")
                @ExcludeMissing
                language: JsonField<Language> = JsonMissing.of(),
                @JsonProperty("transcription_engine")
                @ExcludeMissing
                transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
                @JsonProperty("transcription_model")
                @ExcludeMissing
                transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of(),
            ) : this(
                interimResults,
                language,
                transcriptionEngine,
                transcriptionModel,
                mutableMapOf(),
            )

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
            fun language(): Optional<Language> = language.getOptional("language")

            /**
             * Engine identifier for xAI transcription service
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
            fun _language(): JsonField<Language> = language

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

                /** Returns a mutable builder for constructing an instance of [XAi]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [XAi]. */
            class Builder internal constructor() {

                private var interimResults: JsonField<Boolean> = JsonMissing.of()
                private var language: JsonField<Language> = JsonMissing.of()
                private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
                private var transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(xAi: XAi) = apply {
                    interimResults = xAi.interimResults
                    language = xAi.language
                    transcriptionEngine = xAi.transcriptionEngine
                    transcriptionModel = xAi.transcriptionModel
                    additionalProperties = xAi.additionalProperties.toMutableMap()
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
                fun language(language: Language) = language(JsonField.of(language))

                /**
                 * Sets [Builder.language] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.language] with a well-typed [Language] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun language(language: JsonField<Language>) = apply { this.language = language }

                /** Engine identifier for xAI transcription service */
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
                 * Returns an immutable instance of [XAi].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): XAi =
                    XAi(
                        interimResults,
                        language,
                        transcriptionEngine,
                        transcriptionModel,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): XAi = apply {
                if (validated) {
                    return@apply
                }

                interimResults()
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
                (if (interimResults.asKnown().isPresent) 1 else 0) +
                    (language.asKnown().getOrNull()?.validity() ?: 0) +
                    (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                    (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0)

            /** Language to use for speech recognition */
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

                    @JvmField val AR = of("ar")

                    @JvmField val CS = of("cs")

                    @JvmField val DA = of("da")

                    @JvmField val DE = of("de")

                    @JvmField val EN = of("en")

                    @JvmField val ES = of("es")

                    @JvmField val FA = of("fa")

                    @JvmField val FIL = of("fil")

                    @JvmField val FR = of("fr")

                    @JvmField val HI = of("hi")

                    @JvmField val ID = of("id")

                    @JvmField val IT = of("it")

                    @JvmField val JA = of("ja")

                    @JvmField val KO = of("ko")

                    @JvmField val MK = of("mk")

                    @JvmField val MS = of("ms")

                    @JvmField val NL = of("nl")

                    @JvmField val PL = of("pl")

                    @JvmField val PT = of("pt")

                    @JvmField val RO = of("ro")

                    @JvmField val RU = of("ru")

                    @JvmField val SV = of("sv")

                    @JvmField val TH = of("th")

                    @JvmField val TR = of("tr")

                    @JvmField val VI = of("vi")

                    @JvmStatic fun of(value: String) = Language(JsonField.of(value))
                }

                /** An enum containing [Language]'s known values. */
                enum class Known {
                    AR,
                    CS,
                    DA,
                    DE,
                    EN,
                    ES,
                    FA,
                    FIL,
                    FR,
                    HI,
                    ID,
                    IT,
                    JA,
                    KO,
                    MK,
                    MS,
                    NL,
                    PL,
                    PT,
                    RO,
                    RU,
                    SV,
                    TH,
                    TR,
                    VI,
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
                    AR,
                    CS,
                    DA,
                    DE,
                    EN,
                    ES,
                    FA,
                    FIL,
                    FR,
                    HI,
                    ID,
                    IT,
                    JA,
                    KO,
                    MK,
                    MS,
                    NL,
                    PL,
                    PT,
                    RO,
                    RU,
                    SV,
                    TH,
                    TR,
                    VI,
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
                        AR -> Value.AR
                        CS -> Value.CS
                        DA -> Value.DA
                        DE -> Value.DE
                        EN -> Value.EN
                        ES -> Value.ES
                        FA -> Value.FA
                        FIL -> Value.FIL
                        FR -> Value.FR
                        HI -> Value.HI
                        ID -> Value.ID
                        IT -> Value.IT
                        JA -> Value.JA
                        KO -> Value.KO
                        MK -> Value.MK
                        MS -> Value.MS
                        NL -> Value.NL
                        PL -> Value.PL
                        PT -> Value.PT
                        RO -> Value.RO
                        RU -> Value.RU
                        SV -> Value.SV
                        TH -> Value.TH
                        TR -> Value.TR
                        VI -> Value.VI
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
                        AR -> Known.AR
                        CS -> Known.CS
                        DA -> Known.DA
                        DE -> Known.DE
                        EN -> Known.EN
                        ES -> Known.ES
                        FA -> Known.FA
                        FIL -> Known.FIL
                        FR -> Known.FR
                        HI -> Known.HI
                        ID -> Known.ID
                        IT -> Known.IT
                        JA -> Known.JA
                        KO -> Known.KO
                        MK -> Known.MK
                        MS -> Known.MS
                        NL -> Known.NL
                        PL -> Known.PL
                        PT -> Known.PT
                        RO -> Known.RO
                        RU -> Known.RU
                        SV -> Known.SV
                        TH -> Known.TH
                        TR -> Known.TR
                        VI -> Known.VI
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

            /** Engine identifier for xAI transcription service */
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

                    @JvmField val X_AI = of("xAI")

                    @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
                }

                /** An enum containing [TranscriptionEngine]'s known values. */
                enum class Known {
                    X_AI
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
                    X_AI,
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
                        X_AI -> Value.X_AI
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
                        X_AI -> Known.X_AI
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

                    @JvmField val XAI_GROK_STT = of("xai/grok-stt")

                    @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
                }

                /** An enum containing [TranscriptionModel]'s known values. */
                enum class Known {
                    XAI_GROK_STT
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
                    XAI_GROK_STT,
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
                        XAI_GROK_STT -> Value.XAI_GROK_STT
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
                        XAI_GROK_STT -> Known.XAI_GROK_STT
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

                return other is XAi &&
                    interimResults == other.interimResults &&
                    language == other.language &&
                    transcriptionEngine == other.transcriptionEngine &&
                    transcriptionModel == other.transcriptionModel &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    interimResults,
                    language,
                    transcriptionEngine,
                    transcriptionModel,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "XAi{interimResults=$interimResults, language=$language, transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, additionalProperties=$additionalProperties}"
        }

        class AssemblyAi
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val interimResults: JsonField<Boolean>,
            private val transcriptionEngine: JsonField<TranscriptionEngine>,
            private val transcriptionModel: JsonField<TranscriptionModel>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("interim_results")
                @ExcludeMissing
                interimResults: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("transcription_engine")
                @ExcludeMissing
                transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
                @JsonProperty("transcription_model")
                @ExcludeMissing
                transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of(),
            ) : this(interimResults, transcriptionEngine, transcriptionModel, mutableMapOf())

            /**
             * Whether to send also interim results. If set to false, only final results will be
             * sent.
             *
             * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

            /**
             * Engine identifier for AssemblyAI transcription service
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
             * Returns the raw JSON value of [interimResults].
             *
             * Unlike [interimResults], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("interim_results")
            @ExcludeMissing
            fun _interimResults(): JsonField<Boolean> = interimResults

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

                /** Returns a mutable builder for constructing an instance of [AssemblyAi]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AssemblyAi]. */
            class Builder internal constructor() {

                private var interimResults: JsonField<Boolean> = JsonMissing.of()
                private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
                private var transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(assemblyAi: AssemblyAi) = apply {
                    interimResults = assemblyAi.interimResults
                    transcriptionEngine = assemblyAi.transcriptionEngine
                    transcriptionModel = assemblyAi.transcriptionModel
                    additionalProperties = assemblyAi.additionalProperties.toMutableMap()
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

                /** Engine identifier for AssemblyAI transcription service */
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
                 * Returns an immutable instance of [AssemblyAi].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AssemblyAi =
                    AssemblyAi(
                        interimResults,
                        transcriptionEngine,
                        transcriptionModel,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AssemblyAi = apply {
                if (validated) {
                    return@apply
                }

                interimResults()
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
                (if (interimResults.asKnown().isPresent) 1 else 0) +
                    (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                    (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0)

            /** Engine identifier for AssemblyAI transcription service */
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

                    @JvmField val ASSEMBLY_AI = of("AssemblyAI")

                    @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
                }

                /** An enum containing [TranscriptionEngine]'s known values. */
                enum class Known {
                    ASSEMBLY_AI
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
                    ASSEMBLY_AI,
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
                        ASSEMBLY_AI -> Value.ASSEMBLY_AI
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
                        ASSEMBLY_AI -> Known.ASSEMBLY_AI
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

                    @JvmField
                    val ASSEMBLYAI_UNIVERSAL_STREAMING = of("assemblyai/universal-streaming")

                    @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
                }

                /** An enum containing [TranscriptionModel]'s known values. */
                enum class Known {
                    ASSEMBLYAI_UNIVERSAL_STREAMING
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
                    ASSEMBLYAI_UNIVERSAL_STREAMING,
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
                        ASSEMBLYAI_UNIVERSAL_STREAMING -> Value.ASSEMBLYAI_UNIVERSAL_STREAMING
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
                        ASSEMBLYAI_UNIVERSAL_STREAMING -> Known.ASSEMBLYAI_UNIVERSAL_STREAMING
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

                return other is AssemblyAi &&
                    interimResults == other.interimResults &&
                    transcriptionEngine == other.transcriptionEngine &&
                    transcriptionModel == other.transcriptionModel &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    interimResults,
                    transcriptionEngine,
                    transcriptionModel,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AssemblyAi{interimResults=$interimResults, transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, additionalProperties=$additionalProperties}"
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
