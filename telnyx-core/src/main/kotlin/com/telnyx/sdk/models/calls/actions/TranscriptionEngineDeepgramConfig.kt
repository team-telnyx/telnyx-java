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

/**
 * Deepgram Nova-2 specialty models: `deepgram/nova-2-medical` (medical vocabulary) and
 * `deepgram/nova-2-phonecall` (low-bandwidth phone audio). English only.
 */
@JsonDeserialize(using = TranscriptionEngineDeepgramConfig.Deserializer::class)
@JsonSerialize(using = TranscriptionEngineDeepgramConfig.Serializer::class)
class TranscriptionEngineDeepgramConfig
private constructor(
    private val deepgramNova2: DeepgramNova2Config? = null,
    private val deepgramNova2Specialty: DeepgramNova2SpecialtyConfig? = null,
    private val deepgramNova3: DeepgramNova3Config? = null,
    private val deepgramNova3Medical: DeepgramNova3Medical? = null,
    private val deepgramFlux: DeepgramFlux? = null,
    private val deepgramFluxMulti: DeepgramFluxMulti? = null,
    private val _json: JsonValue? = null,
) {

    fun deepgramNova2(): Optional<DeepgramNova2Config> = Optional.ofNullable(deepgramNova2)

    /**
     * Deepgram Nova-2 specialty models: `deepgram/nova-2-medical` (medical vocabulary) and
     * `deepgram/nova-2-phonecall` (low-bandwidth phone audio). English only.
     */
    fun deepgramNova2Specialty(): Optional<DeepgramNova2SpecialtyConfig> =
        Optional.ofNullable(deepgramNova2Specialty)

    fun deepgramNova3(): Optional<DeepgramNova3Config> = Optional.ofNullable(deepgramNova3)

    /** Deepgram Nova-3 medical model, tuned for medical vocabulary. English only. */
    fun deepgramNova3Medical(): Optional<DeepgramNova3Medical> =
        Optional.ofNullable(deepgramNova3Medical)

    /**
     * Deepgram Flux (English), a conversational speech recognition model with built-in end-of-turn
     * detection. `smart_format`, `utterance_end_ms`, `hints` and `keywords_boosting` do not apply
     * to Flux.
     */
    fun deepgramFlux(): Optional<DeepgramFlux> = Optional.ofNullable(deepgramFlux)

    /**
     * Deepgram Flux multilingual, a conversational speech recognition model with built-in
     * end-of-turn detection. `smart_format`, `utterance_end_ms`, `hints` and `keywords_boosting` do
     * not apply to Flux.
     */
    fun deepgramFluxMulti(): Optional<DeepgramFluxMulti> = Optional.ofNullable(deepgramFluxMulti)

    fun isDeepgramNova2(): Boolean = deepgramNova2 != null

    fun isDeepgramNova2Specialty(): Boolean = deepgramNova2Specialty != null

    fun isDeepgramNova3(): Boolean = deepgramNova3 != null

    fun isDeepgramNova3Medical(): Boolean = deepgramNova3Medical != null

    fun isDeepgramFlux(): Boolean = deepgramFlux != null

    fun isDeepgramFluxMulti(): Boolean = deepgramFluxMulti != null

    fun asDeepgramNova2(): DeepgramNova2Config = deepgramNova2.getOrThrow("deepgramNova2")

    /**
     * Deepgram Nova-2 specialty models: `deepgram/nova-2-medical` (medical vocabulary) and
     * `deepgram/nova-2-phonecall` (low-bandwidth phone audio). English only.
     */
    fun asDeepgramNova2Specialty(): DeepgramNova2SpecialtyConfig =
        deepgramNova2Specialty.getOrThrow("deepgramNova2Specialty")

    fun asDeepgramNova3(): DeepgramNova3Config = deepgramNova3.getOrThrow("deepgramNova3")

    /** Deepgram Nova-3 medical model, tuned for medical vocabulary. English only. */
    fun asDeepgramNova3Medical(): DeepgramNova3Medical =
        deepgramNova3Medical.getOrThrow("deepgramNova3Medical")

    /**
     * Deepgram Flux (English), a conversational speech recognition model with built-in end-of-turn
     * detection. `smart_format`, `utterance_end_ms`, `hints` and `keywords_boosting` do not apply
     * to Flux.
     */
    fun asDeepgramFlux(): DeepgramFlux = deepgramFlux.getOrThrow("deepgramFlux")

    /**
     * Deepgram Flux multilingual, a conversational speech recognition model with built-in
     * end-of-turn detection. `smart_format`, `utterance_end_ms`, `hints` and `keywords_boosting` do
     * not apply to Flux.
     */
    fun asDeepgramFluxMulti(): DeepgramFluxMulti = deepgramFluxMulti.getOrThrow("deepgramFluxMulti")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.telnyx.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = transcriptionEngineDeepgramConfig.accept(new TranscriptionEngineDeepgramConfig.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitDeepgramNova2(DeepgramNova2Config deepgramNova2) {
     *         return Optional.of(deepgramNova2.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws TelnyxInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            deepgramNova2 != null -> visitor.visitDeepgramNova2(deepgramNova2)
            deepgramNova2Specialty != null ->
                visitor.visitDeepgramNova2Specialty(deepgramNova2Specialty)
            deepgramNova3 != null -> visitor.visitDeepgramNova3(deepgramNova3)
            deepgramNova3Medical != null -> visitor.visitDeepgramNova3Medical(deepgramNova3Medical)
            deepgramFlux != null -> visitor.visitDeepgramFlux(deepgramFlux)
            deepgramFluxMulti != null -> visitor.visitDeepgramFluxMulti(deepgramFluxMulti)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TranscriptionEngineDeepgramConfig = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config) {
                    deepgramNova2.validate()
                }

                override fun visitDeepgramNova2Specialty(
                    deepgramNova2Specialty: DeepgramNova2SpecialtyConfig
                ) {
                    deepgramNova2Specialty.validate()
                }

                override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config) {
                    deepgramNova3.validate()
                }

                override fun visitDeepgramNova3Medical(deepgramNova3Medical: DeepgramNova3Medical) {
                    deepgramNova3Medical.validate()
                }

                override fun visitDeepgramFlux(deepgramFlux: DeepgramFlux) {
                    deepgramFlux.validate()
                }

                override fun visitDeepgramFluxMulti(deepgramFluxMulti: DeepgramFluxMulti) {
                    deepgramFluxMulti.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config) =
                    deepgramNova2.validity()

                override fun visitDeepgramNova2Specialty(
                    deepgramNova2Specialty: DeepgramNova2SpecialtyConfig
                ) = deepgramNova2Specialty.validity()

                override fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config) =
                    deepgramNova3.validity()

                override fun visitDeepgramNova3Medical(deepgramNova3Medical: DeepgramNova3Medical) =
                    deepgramNova3Medical.validity()

                override fun visitDeepgramFlux(deepgramFlux: DeepgramFlux) = deepgramFlux.validity()

                override fun visitDeepgramFluxMulti(deepgramFluxMulti: DeepgramFluxMulti) =
                    deepgramFluxMulti.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionEngineDeepgramConfig &&
            deepgramNova2 == other.deepgramNova2 &&
            deepgramNova2Specialty == other.deepgramNova2Specialty &&
            deepgramNova3 == other.deepgramNova3 &&
            deepgramNova3Medical == other.deepgramNova3Medical &&
            deepgramFlux == other.deepgramFlux &&
            deepgramFluxMulti == other.deepgramFluxMulti
    }

    override fun hashCode(): Int =
        Objects.hash(
            deepgramNova2,
            deepgramNova2Specialty,
            deepgramNova3,
            deepgramNova3Medical,
            deepgramFlux,
            deepgramFluxMulti,
        )

    override fun toString(): String =
        when {
            deepgramNova2 != null ->
                "TranscriptionEngineDeepgramConfig{deepgramNova2=$deepgramNova2}"
            deepgramNova2Specialty != null ->
                "TranscriptionEngineDeepgramConfig{deepgramNova2Specialty=$deepgramNova2Specialty}"
            deepgramNova3 != null ->
                "TranscriptionEngineDeepgramConfig{deepgramNova3=$deepgramNova3}"
            deepgramNova3Medical != null ->
                "TranscriptionEngineDeepgramConfig{deepgramNova3Medical=$deepgramNova3Medical}"
            deepgramFlux != null -> "TranscriptionEngineDeepgramConfig{deepgramFlux=$deepgramFlux}"
            deepgramFluxMulti != null ->
                "TranscriptionEngineDeepgramConfig{deepgramFluxMulti=$deepgramFluxMulti}"
            _json != null -> "TranscriptionEngineDeepgramConfig{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TranscriptionEngineDeepgramConfig")
        }

    companion object {

        @JvmStatic
        fun ofDeepgramNova2(deepgramNova2: DeepgramNova2Config) =
            TranscriptionEngineDeepgramConfig(deepgramNova2 = deepgramNova2)

        /**
         * Deepgram Nova-2 specialty models: `deepgram/nova-2-medical` (medical vocabulary) and
         * `deepgram/nova-2-phonecall` (low-bandwidth phone audio). English only.
         */
        @JvmStatic
        fun ofDeepgramNova2Specialty(deepgramNova2Specialty: DeepgramNova2SpecialtyConfig) =
            TranscriptionEngineDeepgramConfig(deepgramNova2Specialty = deepgramNova2Specialty)

        @JvmStatic
        fun ofDeepgramNova3(deepgramNova3: DeepgramNova3Config) =
            TranscriptionEngineDeepgramConfig(deepgramNova3 = deepgramNova3)

        /** Deepgram Nova-3 medical model, tuned for medical vocabulary. English only. */
        @JvmStatic
        fun ofDeepgramNova3Medical(deepgramNova3Medical: DeepgramNova3Medical) =
            TranscriptionEngineDeepgramConfig(deepgramNova3Medical = deepgramNova3Medical)

        /**
         * Deepgram Flux (English), a conversational speech recognition model with built-in
         * end-of-turn detection. `smart_format`, `utterance_end_ms`, `hints` and
         * `keywords_boosting` do not apply to Flux.
         */
        @JvmStatic
        fun ofDeepgramFlux(deepgramFlux: DeepgramFlux) =
            TranscriptionEngineDeepgramConfig(deepgramFlux = deepgramFlux)

        /**
         * Deepgram Flux multilingual, a conversational speech recognition model with built-in
         * end-of-turn detection. `smart_format`, `utterance_end_ms`, `hints` and
         * `keywords_boosting` do not apply to Flux.
         */
        @JvmStatic
        fun ofDeepgramFluxMulti(deepgramFluxMulti: DeepgramFluxMulti) =
            TranscriptionEngineDeepgramConfig(deepgramFluxMulti = deepgramFluxMulti)
    }

    /**
     * An interface that defines how to map each variant of [TranscriptionEngineDeepgramConfig] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitDeepgramNova2(deepgramNova2: DeepgramNova2Config): T

        /**
         * Deepgram Nova-2 specialty models: `deepgram/nova-2-medical` (medical vocabulary) and
         * `deepgram/nova-2-phonecall` (low-bandwidth phone audio). English only.
         */
        fun visitDeepgramNova2Specialty(deepgramNova2Specialty: DeepgramNova2SpecialtyConfig): T

        fun visitDeepgramNova3(deepgramNova3: DeepgramNova3Config): T

        /** Deepgram Nova-3 medical model, tuned for medical vocabulary. English only. */
        fun visitDeepgramNova3Medical(deepgramNova3Medical: DeepgramNova3Medical): T

        /**
         * Deepgram Flux (English), a conversational speech recognition model with built-in
         * end-of-turn detection. `smart_format`, `utterance_end_ms`, `hints` and
         * `keywords_boosting` do not apply to Flux.
         */
        fun visitDeepgramFlux(deepgramFlux: DeepgramFlux): T

        /**
         * Deepgram Flux multilingual, a conversational speech recognition model with built-in
         * end-of-turn detection. `smart_format`, `utterance_end_ms`, `hints` and
         * `keywords_boosting` do not apply to Flux.
         */
        fun visitDeepgramFluxMulti(deepgramFluxMulti: DeepgramFluxMulti): T

        /**
         * Maps an unknown variant of [TranscriptionEngineDeepgramConfig] to a value of type [T].
         *
         * An instance of [TranscriptionEngineDeepgramConfig] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws TelnyxInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw TelnyxInvalidDataException("Unknown TranscriptionEngineDeepgramConfig: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TranscriptionEngineDeepgramConfig>(
            TranscriptionEngineDeepgramConfig::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): TranscriptionEngineDeepgramConfig {
            val json = JsonValue.fromJsonNode(node)
            val transcriptionModel =
                json.asObject().getOrNull()?.get("transcription_model")?.asString()?.getOrNull()

            when (transcriptionModel) {
                "deepgram/nova-2" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramNova2Config>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramNova2 = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
                "deepgram/nova-3" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramNova3Config>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramNova3 = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
                "deepgram/nova-3-medical" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramNova3Medical>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramNova3Medical = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
                "deepgram/flux" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramFlux>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramFlux = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
                "deepgram/flux-multi" -> {
                    return tryDeserialize(node, jacksonTypeRef<DeepgramFluxMulti>())?.let {
                        TranscriptionEngineDeepgramConfig(deepgramFluxMulti = it, _json = json)
                    } ?: TranscriptionEngineDeepgramConfig(_json = json)
                }
            }

            return tryDeserialize(node, jacksonTypeRef<DeepgramNova2SpecialtyConfig>())?.let {
                TranscriptionEngineDeepgramConfig(deepgramNova2Specialty = it, _json = json)
            } ?: TranscriptionEngineDeepgramConfig(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<TranscriptionEngineDeepgramConfig>(
            TranscriptionEngineDeepgramConfig::class
        ) {

        override fun serialize(
            value: TranscriptionEngineDeepgramConfig,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.deepgramNova2 != null -> generator.writeObject(value.deepgramNova2)
                value.deepgramNova2Specialty != null ->
                    generator.writeObject(value.deepgramNova2Specialty)
                value.deepgramNova3 != null -> generator.writeObject(value.deepgramNova3)
                value.deepgramNova3Medical != null ->
                    generator.writeObject(value.deepgramNova3Medical)
                value.deepgramFlux != null -> generator.writeObject(value.deepgramFlux)
                value.deepgramFluxMulti != null -> generator.writeObject(value.deepgramFluxMulti)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TranscriptionEngineDeepgramConfig")
            }
        }
    }

    /**
     * Deepgram Nova-2 specialty models: `deepgram/nova-2-medical` (medical vocabulary) and
     * `deepgram/nova-2-phonecall` (low-bandwidth phone audio). English only.
     */
    class DeepgramNova2SpecialtyConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionModel: JsonField<TranscriptionModel>,
        private val hints: JsonField<List<String>>,
        private val interimResults: JsonField<Boolean>,
        private val keywordsBoosting: JsonField<KeywordsBoosting>,
        private val language: JsonField<DeepgramEnglishTranscriptionLanguage>,
        private val smartFormat: JsonField<Boolean>,
        private val utteranceEndMs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_model")
            @ExcludeMissing
            transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of(),
            @JsonProperty("hints")
            @ExcludeMissing
            hints: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("interim_results")
            @ExcludeMissing
            interimResults: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("keywords_boosting")
            @ExcludeMissing
            keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<DeepgramEnglishTranscriptionLanguage> = JsonMissing.of(),
            @JsonProperty("smart_format")
            @ExcludeMissing
            smartFormat: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("utterance_end_ms")
            @ExcludeMissing
            utteranceEndMs: JsonField<Long> = JsonMissing.of(),
        ) : this(
            transcriptionEngine,
            transcriptionModel,
            hints,
            interimResults,
            keywordsBoosting,
            language,
            smartFormat,
            utteranceEndMs,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transcriptionEngine(): TranscriptionEngine =
            transcriptionEngine.getRequired("transcription_engine")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transcriptionModel(): TranscriptionModel =
            transcriptionModel.getRequired("transcription_model")

        /**
         * Nova-2 keyword biasing without intensifiers. Up to 100 terms to bias recognition toward.
         * For weighted biasing, use `keywords_boosting` instead. Supported on Nova-2 models only
         * (`deepgram/nova-2`, `deepgram/nova-2-medical`, `deepgram/nova-2-phonecall`); use
         * `keyterms` on Nova-3 and Flux.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hints(): Optional<List<String>> = hints.getOptional("hints")

        /**
         * Whether to send also interim results. If set to false, only final results will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

        /**
         * Keywords and their respective intensifiers (boosting values) to improve transcription
         * accuracy for specific words or phrases. The intensifier should be a numeric value.
         * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keywordsBoosting(): Optional<KeywordsBoosting> =
            keywordsBoosting.getOptional("keywords_boosting")

        /**
         * Language to transcribe. Deepgram's medical and phonecall models support English only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<DeepgramEnglishTranscriptionLanguage> =
            language.getOptional("language")

        /**
         * Enable Deepgram's smart formatting (capitalization, punctuation, and digit
         * normalization). Note: Telnyx defaults this to `true`, overriding Deepgram's underlying
         * default of `false` — omit the field to get a smart-formatted transcript, or set it to
         * `false` to receive the raw lowercase transcript without punctuation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun smartFormat(): Optional<Boolean> = smartFormat.getOptional("smart_format")

        /**
         * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to 5000
         * ms.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun utteranceEndMs(): Optional<Long> = utteranceEndMs.getOptional("utterance_end_ms")

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

        /**
         * Returns the raw JSON value of [hints].
         *
         * Unlike [hints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hints") @ExcludeMissing fun _hints(): JsonField<List<String>> = hints

        /**
         * Returns the raw JSON value of [interimResults].
         *
         * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interim_results")
        @ExcludeMissing
        fun _interimResults(): JsonField<Boolean> = interimResults

        /**
         * Returns the raw JSON value of [keywordsBoosting].
         *
         * Unlike [keywordsBoosting], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("keywords_boosting")
        @ExcludeMissing
        fun _keywordsBoosting(): JsonField<KeywordsBoosting> = keywordsBoosting

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language")
        @ExcludeMissing
        fun _language(): JsonField<DeepgramEnglishTranscriptionLanguage> = language

        /**
         * Returns the raw JSON value of [smartFormat].
         *
         * Unlike [smartFormat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("smart_format")
        @ExcludeMissing
        fun _smartFormat(): JsonField<Boolean> = smartFormat

        /**
         * Returns the raw JSON value of [utteranceEndMs].
         *
         * Unlike [utteranceEndMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("utterance_end_ms")
        @ExcludeMissing
        fun _utteranceEndMs(): JsonField<Long> = utteranceEndMs

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
             * [DeepgramNova2SpecialtyConfig].
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * .transcriptionModel()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeepgramNova2SpecialtyConfig]. */
        class Builder internal constructor() {

            private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
            private var transcriptionModel: JsonField<TranscriptionModel>? = null
            private var hints: JsonField<MutableList<String>>? = null
            private var interimResults: JsonField<Boolean> = JsonMissing.of()
            private var keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of()
            private var language: JsonField<DeepgramEnglishTranscriptionLanguage> = JsonMissing.of()
            private var smartFormat: JsonField<Boolean> = JsonMissing.of()
            private var utteranceEndMs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deepgramNova2SpecialtyConfig: DeepgramNova2SpecialtyConfig) = apply {
                transcriptionEngine = deepgramNova2SpecialtyConfig.transcriptionEngine
                transcriptionModel = deepgramNova2SpecialtyConfig.transcriptionModel
                hints = deepgramNova2SpecialtyConfig.hints.map { it.toMutableList() }
                interimResults = deepgramNova2SpecialtyConfig.interimResults
                keywordsBoosting = deepgramNova2SpecialtyConfig.keywordsBoosting
                language = deepgramNova2SpecialtyConfig.language
                smartFormat = deepgramNova2SpecialtyConfig.smartFormat
                utteranceEndMs = deepgramNova2SpecialtyConfig.utteranceEndMs
                additionalProperties =
                    deepgramNova2SpecialtyConfig.additionalProperties.toMutableMap()
            }

            fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                transcriptionEngine(JsonField.of(transcriptionEngine))

            /**
             * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngine] with a well-typed
             * [TranscriptionEngine] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
                this.transcriptionEngine = transcriptionEngine
            }

            fun transcriptionModel(transcriptionModel: TranscriptionModel) =
                transcriptionModel(JsonField.of(transcriptionModel))

            /**
             * Sets [Builder.transcriptionModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionModel] with a well-typed
             * [TranscriptionModel] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun transcriptionModel(transcriptionModel: JsonField<TranscriptionModel>) = apply {
                this.transcriptionModel = transcriptionModel
            }

            /**
             * Nova-2 keyword biasing without intensifiers. Up to 100 terms to bias recognition
             * toward. For weighted biasing, use `keywords_boosting` instead. Supported on Nova-2
             * models only (`deepgram/nova-2`, `deepgram/nova-2-medical`,
             * `deepgram/nova-2-phonecall`); use `keyterms` on Nova-3 and Flux.
             */
            fun hints(hints: List<String>) = hints(JsonField.of(hints))

            /**
             * Sets [Builder.hints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hints] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.interimResults] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interimResults(interimResults: JsonField<Boolean>) = apply {
                this.interimResults = interimResults
            }

            /**
             * Keywords and their respective intensifiers (boosting values) to improve transcription
             * accuracy for specific words or phrases. The intensifier should be a numeric value.
             * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
             */
            fun keywordsBoosting(keywordsBoosting: KeywordsBoosting) =
                keywordsBoosting(JsonField.of(keywordsBoosting))

            /**
             * Sets [Builder.keywordsBoosting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keywordsBoosting] with a well-typed
             * [KeywordsBoosting] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun keywordsBoosting(keywordsBoosting: JsonField<KeywordsBoosting>) = apply {
                this.keywordsBoosting = keywordsBoosting
            }

            /**
             * Language to transcribe. Deepgram's medical and phonecall models support English only.
             */
            fun language(language: DeepgramEnglishTranscriptionLanguage) =
                language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed
             * [DeepgramEnglishTranscriptionLanguage] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun language(language: JsonField<DeepgramEnglishTranscriptionLanguage>) = apply {
                this.language = language
            }

            /**
             * Enable Deepgram's smart formatting (capitalization, punctuation, and digit
             * normalization). Note: Telnyx defaults this to `true`, overriding Deepgram's
             * underlying default of `false` — omit the field to get a smart-formatted transcript,
             * or set it to `false` to receive the raw lowercase transcript without punctuation.
             */
            fun smartFormat(smartFormat: Boolean) = smartFormat(JsonField.of(smartFormat))

            /**
             * Sets [Builder.smartFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.smartFormat] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun smartFormat(smartFormat: JsonField<Boolean>) = apply {
                this.smartFormat = smartFormat
            }

            /**
             * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to
             * 5000 ms.
             */
            fun utteranceEndMs(utteranceEndMs: Long) = utteranceEndMs(JsonField.of(utteranceEndMs))

            /**
             * Sets [Builder.utteranceEndMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.utteranceEndMs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun utteranceEndMs(utteranceEndMs: JsonField<Long>) = apply {
                this.utteranceEndMs = utteranceEndMs
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
             * Returns an immutable instance of [DeepgramNova2SpecialtyConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * .transcriptionModel()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DeepgramNova2SpecialtyConfig =
                DeepgramNova2SpecialtyConfig(
                    checkRequired("transcriptionEngine", transcriptionEngine),
                    checkRequired("transcriptionModel", transcriptionModel),
                    (hints ?: JsonMissing.of()).map { it.toImmutable() },
                    interimResults,
                    keywordsBoosting,
                    language,
                    smartFormat,
                    utteranceEndMs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): DeepgramNova2SpecialtyConfig = apply {
            if (validated) {
                return@apply
            }

            transcriptionEngine().validate()
            transcriptionModel().validate()
            hints()
            interimResults()
            keywordsBoosting().ifPresent { it.validate() }
            language().ifPresent { it.validate() }
            smartFormat()
            utteranceEndMs()
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
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0) +
                (hints.asKnown().getOrNull()?.size ?: 0) +
                (if (interimResults.asKnown().isPresent) 1 else 0) +
                (keywordsBoosting.asKnown().getOrNull()?.validity() ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (if (smartFormat.asKnown().isPresent) 1 else 0) +
                (if (utteranceEndMs.asKnown().isPresent) 1 else 0)

        class TranscriptionEngine
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DEEPGRAM = of("Deepgram")

                @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
            }

            /** An enum containing [TranscriptionEngine]'s known values. */
            enum class Known {
                DEEPGRAM
            }

            /**
             * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DEEPGRAM -> Value.DEEPGRAM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DEEPGRAM -> Known.DEEPGRAM
                    else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        class TranscriptionModel
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DEEPGRAM_NOVA_2_MEDICAL = of("deepgram/nova-2-medical")

                @JvmField val DEEPGRAM_NOVA_2_PHONECALL = of("deepgram/nova-2-phonecall")

                @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
            }

            /** An enum containing [TranscriptionModel]'s known values. */
            enum class Known {
                DEEPGRAM_NOVA_2_MEDICAL,
                DEEPGRAM_NOVA_2_PHONECALL,
            }

            /**
             * An enum containing [TranscriptionModel]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TranscriptionModel] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM_NOVA_2_MEDICAL,
                DEEPGRAM_NOVA_2_PHONECALL,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DEEPGRAM_NOVA_2_MEDICAL -> Value.DEEPGRAM_NOVA_2_MEDICAL
                    DEEPGRAM_NOVA_2_PHONECALL -> Value.DEEPGRAM_NOVA_2_PHONECALL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DEEPGRAM_NOVA_2_MEDICAL -> Known.DEEPGRAM_NOVA_2_MEDICAL
                    DEEPGRAM_NOVA_2_PHONECALL -> Known.DEEPGRAM_NOVA_2_PHONECALL
                    else -> throw TelnyxInvalidDataException("Unknown TranscriptionModel: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

                /** Returns a mutable builder for constructing an instance of [KeywordsBoosting]. */
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
                fun build(): KeywordsBoosting = KeywordsBoosting(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is KeywordsBoosting &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "KeywordsBoosting{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeepgramNova2SpecialtyConfig &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionModel == other.transcriptionModel &&
                hints == other.hints &&
                interimResults == other.interimResults &&
                keywordsBoosting == other.keywordsBoosting &&
                language == other.language &&
                smartFormat == other.smartFormat &&
                utteranceEndMs == other.utteranceEndMs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                transcriptionEngine,
                transcriptionModel,
                hints,
                interimResults,
                keywordsBoosting,
                language,
                smartFormat,
                utteranceEndMs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeepgramNova2SpecialtyConfig{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, hints=$hints, interimResults=$interimResults, keywordsBoosting=$keywordsBoosting, language=$language, smartFormat=$smartFormat, utteranceEndMs=$utteranceEndMs, additionalProperties=$additionalProperties}"
    }

    /** Deepgram Nova-3 medical model, tuned for medical vocabulary. English only. */
    class DeepgramNova3Medical
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionModel: JsonValue,
        private val interimResults: JsonField<Boolean>,
        private val keyterms: JsonField<List<String>>,
        private val keywordsBoosting: JsonField<KeywordsBoosting>,
        private val language: JsonField<DeepgramEnglishTranscriptionLanguage>,
        private val smartFormat: JsonField<Boolean>,
        private val utteranceEndMs: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_model")
            @ExcludeMissing
            transcriptionModel: JsonValue = JsonMissing.of(),
            @JsonProperty("interim_results")
            @ExcludeMissing
            interimResults: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("keyterms")
            @ExcludeMissing
            keyterms: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("keywords_boosting")
            @ExcludeMissing
            keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<DeepgramEnglishTranscriptionLanguage> = JsonMissing.of(),
            @JsonProperty("smart_format")
            @ExcludeMissing
            smartFormat: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("utterance_end_ms")
            @ExcludeMissing
            utteranceEndMs: JsonField<Long> = JsonMissing.of(),
        ) : this(
            transcriptionEngine,
            transcriptionModel,
            interimResults,
            keyterms,
            keywordsBoosting,
            language,
            smartFormat,
            utteranceEndMs,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transcriptionEngine(): TranscriptionEngine =
            transcriptionEngine.getRequired("transcription_engine")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("deepgram/nova-3-medical")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("transcription_model")
        @ExcludeMissing
        fun _transcriptionModel(): JsonValue = transcriptionModel

        /**
         * Whether to send also interim results. If set to false, only final results will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

        /**
         * Keyterm prompting. Up to 100 domain-specific terms or brand names to bias recognition
         * toward. Supported on Nova-3 and Flux models (`deepgram/nova-3`,
         * `deepgram/nova-3-medical`, `deepgram/flux`, `deepgram/flux-multi`); use `hints` on
         * Nova-2.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keyterms(): Optional<List<String>> = keyterms.getOptional("keyterms")

        /**
         * Keywords and their respective intensifiers (boosting values) to improve transcription
         * accuracy for specific words or phrases. The intensifier should be a numeric value.
         * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keywordsBoosting(): Optional<KeywordsBoosting> =
            keywordsBoosting.getOptional("keywords_boosting")

        /**
         * Language to transcribe. Deepgram's medical and phonecall models support English only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<DeepgramEnglishTranscriptionLanguage> =
            language.getOptional("language")

        /**
         * Enable Deepgram's smart formatting (capitalization, punctuation, and digit
         * normalization). Note: Telnyx defaults this to `true`, overriding Deepgram's underlying
         * default of `false` — omit the field to get a smart-formatted transcript, or set it to
         * `false` to receive the raw lowercase transcript without punctuation.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun smartFormat(): Optional<Boolean> = smartFormat.getOptional("smart_format")

        /**
         * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to 5000
         * ms.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun utteranceEndMs(): Optional<Long> = utteranceEndMs.getOptional("utterance_end_ms")

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
         * Returns the raw JSON value of [interimResults].
         *
         * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interim_results")
        @ExcludeMissing
        fun _interimResults(): JsonField<Boolean> = interimResults

        /**
         * Returns the raw JSON value of [keyterms].
         *
         * Unlike [keyterms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keyterms")
        @ExcludeMissing
        fun _keyterms(): JsonField<List<String>> = keyterms

        /**
         * Returns the raw JSON value of [keywordsBoosting].
         *
         * Unlike [keywordsBoosting], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("keywords_boosting")
        @ExcludeMissing
        fun _keywordsBoosting(): JsonField<KeywordsBoosting> = keywordsBoosting

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language")
        @ExcludeMissing
        fun _language(): JsonField<DeepgramEnglishTranscriptionLanguage> = language

        /**
         * Returns the raw JSON value of [smartFormat].
         *
         * Unlike [smartFormat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("smart_format")
        @ExcludeMissing
        fun _smartFormat(): JsonField<Boolean> = smartFormat

        /**
         * Returns the raw JSON value of [utteranceEndMs].
         *
         * Unlike [utteranceEndMs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("utterance_end_ms")
        @ExcludeMissing
        fun _utteranceEndMs(): JsonField<Long> = utteranceEndMs

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
             * Returns a mutable builder for constructing an instance of [DeepgramNova3Medical].
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeepgramNova3Medical]. */
        class Builder internal constructor() {

            private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
            private var transcriptionModel: JsonValue = JsonValue.from("deepgram/nova-3-medical")
            private var interimResults: JsonField<Boolean> = JsonMissing.of()
            private var keyterms: JsonField<MutableList<String>>? = null
            private var keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of()
            private var language: JsonField<DeepgramEnglishTranscriptionLanguage> = JsonMissing.of()
            private var smartFormat: JsonField<Boolean> = JsonMissing.of()
            private var utteranceEndMs: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deepgramNova3Medical: DeepgramNova3Medical) = apply {
                transcriptionEngine = deepgramNova3Medical.transcriptionEngine
                transcriptionModel = deepgramNova3Medical.transcriptionModel
                interimResults = deepgramNova3Medical.interimResults
                keyterms = deepgramNova3Medical.keyterms.map { it.toMutableList() }
                keywordsBoosting = deepgramNova3Medical.keywordsBoosting
                language = deepgramNova3Medical.language
                smartFormat = deepgramNova3Medical.smartFormat
                utteranceEndMs = deepgramNova3Medical.utteranceEndMs
                additionalProperties = deepgramNova3Medical.additionalProperties.toMutableMap()
            }

            fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                transcriptionEngine(JsonField.of(transcriptionEngine))

            /**
             * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngine] with a well-typed
             * [TranscriptionEngine] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
                this.transcriptionEngine = transcriptionEngine
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("deepgram/nova-3-medical")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transcriptionModel(transcriptionModel: JsonValue) = apply {
                this.transcriptionModel = transcriptionModel
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
             * You should usually call [Builder.interimResults] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interimResults(interimResults: JsonField<Boolean>) = apply {
                this.interimResults = interimResults
            }

            /**
             * Keyterm prompting. Up to 100 domain-specific terms or brand names to bias recognition
             * toward. Supported on Nova-3 and Flux models (`deepgram/nova-3`,
             * `deepgram/nova-3-medical`, `deepgram/flux`, `deepgram/flux-multi`); use `hints` on
             * Nova-2.
             */
            fun keyterms(keyterms: List<String>) = keyterms(JsonField.of(keyterms))

            /**
             * Sets [Builder.keyterms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyterms] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyterms(keyterms: JsonField<List<String>>) = apply {
                this.keyterms = keyterms.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [keyterms].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addKeyterm(keyterm: String) = apply {
                keyterms =
                    (keyterms ?: JsonField.of(mutableListOf())).also {
                        checkKnown("keyterms", it).add(keyterm)
                    }
            }

            /**
             * Keywords and their respective intensifiers (boosting values) to improve transcription
             * accuracy for specific words or phrases. The intensifier should be a numeric value.
             * Example: `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
             */
            fun keywordsBoosting(keywordsBoosting: KeywordsBoosting) =
                keywordsBoosting(JsonField.of(keywordsBoosting))

            /**
             * Sets [Builder.keywordsBoosting] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keywordsBoosting] with a well-typed
             * [KeywordsBoosting] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun keywordsBoosting(keywordsBoosting: JsonField<KeywordsBoosting>) = apply {
                this.keywordsBoosting = keywordsBoosting
            }

            /**
             * Language to transcribe. Deepgram's medical and phonecall models support English only.
             */
            fun language(language: DeepgramEnglishTranscriptionLanguage) =
                language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed
             * [DeepgramEnglishTranscriptionLanguage] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun language(language: JsonField<DeepgramEnglishTranscriptionLanguage>) = apply {
                this.language = language
            }

            /**
             * Enable Deepgram's smart formatting (capitalization, punctuation, and digit
             * normalization). Note: Telnyx defaults this to `true`, overriding Deepgram's
             * underlying default of `false` — omit the field to get a smart-formatted transcript,
             * or set it to `false` to receive the raw lowercase transcript without punctuation.
             */
            fun smartFormat(smartFormat: Boolean) = smartFormat(JsonField.of(smartFormat))

            /**
             * Sets [Builder.smartFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.smartFormat] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun smartFormat(smartFormat: JsonField<Boolean>) = apply {
                this.smartFormat = smartFormat
            }

            /**
             * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to
             * 5000 ms.
             */
            fun utteranceEndMs(utteranceEndMs: Long) = utteranceEndMs(JsonField.of(utteranceEndMs))

            /**
             * Sets [Builder.utteranceEndMs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.utteranceEndMs] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun utteranceEndMs(utteranceEndMs: JsonField<Long>) = apply {
                this.utteranceEndMs = utteranceEndMs
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
             * Returns an immutable instance of [DeepgramNova3Medical].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DeepgramNova3Medical =
                DeepgramNova3Medical(
                    checkRequired("transcriptionEngine", transcriptionEngine),
                    transcriptionModel,
                    interimResults,
                    (keyterms ?: JsonMissing.of()).map { it.toImmutable() },
                    keywordsBoosting,
                    language,
                    smartFormat,
                    utteranceEndMs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): DeepgramNova3Medical = apply {
            if (validated) {
                return@apply
            }

            transcriptionEngine().validate()
            _transcriptionModel().let {
                if (it != JsonValue.from("deepgram/nova-3-medical")) {
                    throw TelnyxInvalidDataException(
                        "'transcriptionModel' is invalid, received $it"
                    )
                }
            }
            interimResults()
            keyterms()
            keywordsBoosting().ifPresent { it.validate() }
            language().ifPresent { it.validate() }
            smartFormat()
            utteranceEndMs()
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
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                transcriptionModel.let {
                    if (it == JsonValue.from("deepgram/nova-3-medical")) 1 else 0
                } +
                (if (interimResults.asKnown().isPresent) 1 else 0) +
                (keyterms.asKnown().getOrNull()?.size ?: 0) +
                (keywordsBoosting.asKnown().getOrNull()?.validity() ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0) +
                (if (smartFormat.asKnown().isPresent) 1 else 0) +
                (if (utteranceEndMs.asKnown().isPresent) 1 else 0)

        class TranscriptionEngine
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DEEPGRAM = of("Deepgram")

                @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
            }

            /** An enum containing [TranscriptionEngine]'s known values. */
            enum class Known {
                DEEPGRAM
            }

            /**
             * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DEEPGRAM -> Value.DEEPGRAM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DEEPGRAM -> Known.DEEPGRAM
                    else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

                /** Returns a mutable builder for constructing an instance of [KeywordsBoosting]. */
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
                fun build(): KeywordsBoosting = KeywordsBoosting(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is KeywordsBoosting &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "KeywordsBoosting{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeepgramNova3Medical &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionModel == other.transcriptionModel &&
                interimResults == other.interimResults &&
                keyterms == other.keyterms &&
                keywordsBoosting == other.keywordsBoosting &&
                language == other.language &&
                smartFormat == other.smartFormat &&
                utteranceEndMs == other.utteranceEndMs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                transcriptionEngine,
                transcriptionModel,
                interimResults,
                keyterms,
                keywordsBoosting,
                language,
                smartFormat,
                utteranceEndMs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeepgramNova3Medical{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, interimResults=$interimResults, keyterms=$keyterms, keywordsBoosting=$keywordsBoosting, language=$language, smartFormat=$smartFormat, utteranceEndMs=$utteranceEndMs, additionalProperties=$additionalProperties}"
    }

    /**
     * Deepgram Flux (English), a conversational speech recognition model with built-in end-of-turn
     * detection. `smart_format`, `utterance_end_ms`, `hints` and `keywords_boosting` do not apply
     * to Flux.
     */
    class DeepgramFlux
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionModel: JsonValue,
        private val interimResults: JsonField<Boolean>,
        private val keyterms: JsonField<List<String>>,
        private val language: JsonField<Language>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_model")
            @ExcludeMissing
            transcriptionModel: JsonValue = JsonMissing.of(),
            @JsonProperty("interim_results")
            @ExcludeMissing
            interimResults: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("keyterms")
            @ExcludeMissing
            keyterms: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
        ) : this(
            transcriptionEngine,
            transcriptionModel,
            interimResults,
            keyterms,
            language,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transcriptionEngine(): TranscriptionEngine =
            transcriptionEngine.getRequired("transcription_engine")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("deepgram/flux")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("transcription_model")
        @ExcludeMissing
        fun _transcriptionModel(): JsonValue = transcriptionModel

        /**
         * Whether to send also interim results. If set to false, only final results will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

        /**
         * Keyterm prompting. Up to 100 domain-specific terms or brand names to bias recognition
         * toward. Supported on Nova-3 and Flux models (`deepgram/nova-3`,
         * `deepgram/nova-3-medical`, `deepgram/flux`, `deepgram/flux-multi`); use `hints` on
         * Nova-2.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keyterms(): Optional<List<String>> = keyterms.getOptional("keyterms")

        /**
         * Language to transcribe. `deepgram/flux` supports English only.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<Language> = language.getOptional("language")

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
         * Returns the raw JSON value of [interimResults].
         *
         * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interim_results")
        @ExcludeMissing
        fun _interimResults(): JsonField<Boolean> = interimResults

        /**
         * Returns the raw JSON value of [keyterms].
         *
         * Unlike [keyterms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keyterms")
        @ExcludeMissing
        fun _keyterms(): JsonField<List<String>> = keyterms

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

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
             * Returns a mutable builder for constructing an instance of [DeepgramFlux].
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeepgramFlux]. */
        class Builder internal constructor() {

            private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
            private var transcriptionModel: JsonValue = JsonValue.from("deepgram/flux")
            private var interimResults: JsonField<Boolean> = JsonMissing.of()
            private var keyterms: JsonField<MutableList<String>>? = null
            private var language: JsonField<Language> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deepgramFlux: DeepgramFlux) = apply {
                transcriptionEngine = deepgramFlux.transcriptionEngine
                transcriptionModel = deepgramFlux.transcriptionModel
                interimResults = deepgramFlux.interimResults
                keyterms = deepgramFlux.keyterms.map { it.toMutableList() }
                language = deepgramFlux.language
                additionalProperties = deepgramFlux.additionalProperties.toMutableMap()
            }

            fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                transcriptionEngine(JsonField.of(transcriptionEngine))

            /**
             * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngine] with a well-typed
             * [TranscriptionEngine] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
                this.transcriptionEngine = transcriptionEngine
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("deepgram/flux")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transcriptionModel(transcriptionModel: JsonValue) = apply {
                this.transcriptionModel = transcriptionModel
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
             * You should usually call [Builder.interimResults] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interimResults(interimResults: JsonField<Boolean>) = apply {
                this.interimResults = interimResults
            }

            /**
             * Keyterm prompting. Up to 100 domain-specific terms or brand names to bias recognition
             * toward. Supported on Nova-3 and Flux models (`deepgram/nova-3`,
             * `deepgram/nova-3-medical`, `deepgram/flux`, `deepgram/flux-multi`); use `hints` on
             * Nova-2.
             */
            fun keyterms(keyterms: List<String>) = keyterms(JsonField.of(keyterms))

            /**
             * Sets [Builder.keyterms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyterms] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyterms(keyterms: JsonField<List<String>>) = apply {
                this.keyterms = keyterms.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [keyterms].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addKeyterm(keyterm: String) = apply {
                keyterms =
                    (keyterms ?: JsonField.of(mutableListOf())).also {
                        checkKnown("keyterms", it).add(keyterm)
                    }
            }

            /** Language to transcribe. `deepgram/flux` supports English only. */
            fun language(language: Language) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [Language] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<Language>) = apply { this.language = language }

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
             * Returns an immutable instance of [DeepgramFlux].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DeepgramFlux =
                DeepgramFlux(
                    checkRequired("transcriptionEngine", transcriptionEngine),
                    transcriptionModel,
                    interimResults,
                    (keyterms ?: JsonMissing.of()).map { it.toImmutable() },
                    language,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): DeepgramFlux = apply {
            if (validated) {
                return@apply
            }

            transcriptionEngine().validate()
            _transcriptionModel().let {
                if (it != JsonValue.from("deepgram/flux")) {
                    throw TelnyxInvalidDataException(
                        "'transcriptionModel' is invalid, received $it"
                    )
                }
            }
            interimResults()
            keyterms()
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
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                transcriptionModel.let { if (it == JsonValue.from("deepgram/flux")) 1 else 0 } +
                (if (interimResults.asKnown().isPresent) 1 else 0) +
                (keyterms.asKnown().getOrNull()?.size ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0)

        class TranscriptionEngine
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DEEPGRAM = of("Deepgram")

                @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
            }

            /** An enum containing [TranscriptionEngine]'s known values. */
            enum class Known {
                DEEPGRAM
            }

            /**
             * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DEEPGRAM -> Value.DEEPGRAM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DEEPGRAM -> Known.DEEPGRAM
                    else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        /** Language to transcribe. `deepgram/flux` supports English only. */
        class Language @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EN = of("en")

                @JvmStatic fun of(value: String) = Language(JsonField.of(value))
            }

            /** An enum containing [Language]'s known values. */
            enum class Known {
                EN
            }

            /**
             * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Language] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EN,
                /**
                 * An enum member indicating that [Language] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EN -> Value.EN
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    EN -> Known.EN
                    else -> throw TelnyxInvalidDataException("Unknown Language: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

            return other is DeepgramFlux &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionModel == other.transcriptionModel &&
                interimResults == other.interimResults &&
                keyterms == other.keyterms &&
                language == other.language &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                transcriptionEngine,
                transcriptionModel,
                interimResults,
                keyterms,
                language,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeepgramFlux{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, interimResults=$interimResults, keyterms=$keyterms, language=$language, additionalProperties=$additionalProperties}"
    }

    /**
     * Deepgram Flux multilingual, a conversational speech recognition model with built-in
     * end-of-turn detection. `smart_format`, `utterance_end_ms`, `hints` and `keywords_boosting` do
     * not apply to Flux.
     */
    class DeepgramFluxMulti
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val transcriptionEngine: JsonField<TranscriptionEngine>,
        private val transcriptionModel: JsonValue,
        private val interimResults: JsonField<Boolean>,
        private val keyterms: JsonField<List<String>>,
        private val language: JsonField<Language>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("transcription_engine")
            @ExcludeMissing
            transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
            @JsonProperty("transcription_model")
            @ExcludeMissing
            transcriptionModel: JsonValue = JsonMissing.of(),
            @JsonProperty("interim_results")
            @ExcludeMissing
            interimResults: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("keyterms")
            @ExcludeMissing
            keyterms: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<Language> = JsonMissing.of(),
        ) : this(
            transcriptionEngine,
            transcriptionModel,
            interimResults,
            keyterms,
            language,
            mutableMapOf(),
        )

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transcriptionEngine(): TranscriptionEngine =
            transcriptionEngine.getRequired("transcription_engine")

        /**
         * Expected to always return the following:
         * ```java
         * JsonValue.from("deepgram/flux-multi")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("transcription_model")
        @ExcludeMissing
        fun _transcriptionModel(): JsonValue = transcriptionModel

        /**
         * Whether to send also interim results. If set to false, only final results will be sent.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

        /**
         * Keyterm prompting. Up to 100 domain-specific terms or brand names to bias recognition
         * toward. Supported on Nova-3 and Flux models (`deepgram/nova-3`,
         * `deepgram/nova-3-medical`, `deepgram/flux`, `deepgram/flux-multi`); use `hints` on
         * Nova-2.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun keyterms(): Optional<List<String>> = keyterms.getOptional("keyterms")

        /**
         * Language to transcribe. Flux-multi uses the language as a hint; `auto` lets Flux detect
         * the language.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<Language> = language.getOptional("language")

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
         * Returns the raw JSON value of [interimResults].
         *
         * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interim_results")
        @ExcludeMissing
        fun _interimResults(): JsonField<Boolean> = interimResults

        /**
         * Returns the raw JSON value of [keyterms].
         *
         * Unlike [keyterms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keyterms")
        @ExcludeMissing
        fun _keyterms(): JsonField<List<String>> = keyterms

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

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
             * Returns a mutable builder for constructing an instance of [DeepgramFluxMulti].
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeepgramFluxMulti]. */
        class Builder internal constructor() {

            private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
            private var transcriptionModel: JsonValue = JsonValue.from("deepgram/flux-multi")
            private var interimResults: JsonField<Boolean> = JsonMissing.of()
            private var keyterms: JsonField<MutableList<String>>? = null
            private var language: JsonField<Language> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deepgramFluxMulti: DeepgramFluxMulti) = apply {
                transcriptionEngine = deepgramFluxMulti.transcriptionEngine
                transcriptionModel = deepgramFluxMulti.transcriptionModel
                interimResults = deepgramFluxMulti.interimResults
                keyterms = deepgramFluxMulti.keyterms.map { it.toMutableList() }
                language = deepgramFluxMulti.language
                additionalProperties = deepgramFluxMulti.additionalProperties.toMutableMap()
            }

            fun transcriptionEngine(transcriptionEngine: TranscriptionEngine) =
                transcriptionEngine(JsonField.of(transcriptionEngine))

            /**
             * Sets [Builder.transcriptionEngine] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transcriptionEngine] with a well-typed
             * [TranscriptionEngine] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
                this.transcriptionEngine = transcriptionEngine
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```java
             * JsonValue.from("deepgram/flux-multi")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transcriptionModel(transcriptionModel: JsonValue) = apply {
                this.transcriptionModel = transcriptionModel
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
             * You should usually call [Builder.interimResults] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun interimResults(interimResults: JsonField<Boolean>) = apply {
                this.interimResults = interimResults
            }

            /**
             * Keyterm prompting. Up to 100 domain-specific terms or brand names to bias recognition
             * toward. Supported on Nova-3 and Flux models (`deepgram/nova-3`,
             * `deepgram/nova-3-medical`, `deepgram/flux`, `deepgram/flux-multi`); use `hints` on
             * Nova-2.
             */
            fun keyterms(keyterms: List<String>) = keyterms(JsonField.of(keyterms))

            /**
             * Sets [Builder.keyterms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keyterms] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keyterms(keyterms: JsonField<List<String>>) = apply {
                this.keyterms = keyterms.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [keyterms].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addKeyterm(keyterm: String) = apply {
                keyterms =
                    (keyterms ?: JsonField.of(mutableListOf())).also {
                        checkKnown("keyterms", it).add(keyterm)
                    }
            }

            /**
             * Language to transcribe. Flux-multi uses the language as a hint; `auto` lets Flux
             * detect the language.
             */
            fun language(language: Language) = language(JsonField.of(language))

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [Language] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<Language>) = apply { this.language = language }

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
             * Returns an immutable instance of [DeepgramFluxMulti].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .transcriptionEngine()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DeepgramFluxMulti =
                DeepgramFluxMulti(
                    checkRequired("transcriptionEngine", transcriptionEngine),
                    transcriptionModel,
                    interimResults,
                    (keyterms ?: JsonMissing.of()).map { it.toImmutable() },
                    language,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): DeepgramFluxMulti = apply {
            if (validated) {
                return@apply
            }

            transcriptionEngine().validate()
            _transcriptionModel().let {
                if (it != JsonValue.from("deepgram/flux-multi")) {
                    throw TelnyxInvalidDataException(
                        "'transcriptionModel' is invalid, received $it"
                    )
                }
            }
            interimResults()
            keyterms()
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
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
                transcriptionModel.let {
                    if (it == JsonValue.from("deepgram/flux-multi")) 1 else 0
                } +
                (if (interimResults.asKnown().isPresent) 1 else 0) +
                (keyterms.asKnown().getOrNull()?.size ?: 0) +
                (language.asKnown().getOrNull()?.validity() ?: 0)

        class TranscriptionEngine
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DEEPGRAM = of("Deepgram")

                @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
            }

            /** An enum containing [TranscriptionEngine]'s known values. */
            enum class Known {
                DEEPGRAM
            }

            /**
             * An enum containing [TranscriptionEngine]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [TranscriptionEngine] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DEEPGRAM -> Value.DEEPGRAM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DEEPGRAM -> Known.DEEPGRAM
                    else -> throw TelnyxInvalidDataException("Unknown TranscriptionEngine: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

        /**
         * Language to transcribe. Flux-multi uses the language as a hint; `auto` lets Flux detect
         * the language.
         */
        class Language @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EN = of("en")

                @JvmField val ES = of("es")

                @JvmField val FR = of("fr")

                @JvmField val DE = of("de")

                @JvmField val HI = of("hi")

                @JvmField val RU = of("ru")

                @JvmField val PT = of("pt")

                @JvmField val JA = of("ja")

                @JvmField val IT = of("it")

                @JvmField val NL = of("nl")

                @JvmField val AUTO = of("auto")

                @JvmStatic fun of(value: String) = Language(JsonField.of(value))
            }

            /** An enum containing [Language]'s known values. */
            enum class Known {
                EN,
                ES,
                FR,
                DE,
                HI,
                RU,
                PT,
                JA,
                IT,
                NL,
                AUTO,
            }

            /**
             * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Language] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EN,
                ES,
                FR,
                DE,
                HI,
                RU,
                PT,
                JA,
                IT,
                NL,
                AUTO,
                /**
                 * An enum member indicating that [Language] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EN -> Value.EN
                    ES -> Value.ES
                    FR -> Value.FR
                    DE -> Value.DE
                    HI -> Value.HI
                    RU -> Value.RU
                    PT -> Value.PT
                    JA -> Value.JA
                    IT -> Value.IT
                    NL -> Value.NL
                    AUTO -> Value.AUTO
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    EN -> Known.EN
                    ES -> Known.ES
                    FR -> Known.FR
                    DE -> Known.DE
                    HI -> Known.HI
                    RU -> Known.RU
                    PT -> Known.PT
                    JA -> Known.JA
                    IT -> Known.IT
                    NL -> Known.NL
                    AUTO -> Known.AUTO
                    else -> throw TelnyxInvalidDataException("Unknown Language: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
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

            return other is DeepgramFluxMulti &&
                transcriptionEngine == other.transcriptionEngine &&
                transcriptionModel == other.transcriptionModel &&
                interimResults == other.interimResults &&
                keyterms == other.keyterms &&
                language == other.language &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                transcriptionEngine,
                transcriptionModel,
                interimResults,
                keyterms,
                language,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DeepgramFluxMulti{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, interimResults=$interimResults, keyterms=$keyterms, language=$language, additionalProperties=$additionalProperties}"
    }
}
