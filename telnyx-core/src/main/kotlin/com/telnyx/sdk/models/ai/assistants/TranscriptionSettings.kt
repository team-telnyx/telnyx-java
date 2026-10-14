// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.ExcludeMissing
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.JsonMissing
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.checkKnown
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptionSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiKeyRef: JsonField<String>,
    private val challenger: JsonField<Challenger>,
    private val fallbackModels: JsonField<List<FallbackModel>>,
    private val language: JsonField<String>,
    private val model: JsonField<Model>,
    private val region: JsonField<String>,
    private val settings: JsonField<TranscriptionSettingsConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_key_ref")
        @ExcludeMissing
        apiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("challenger")
        @ExcludeMissing
        challenger: JsonField<Challenger> = JsonMissing.of(),
        @JsonProperty("fallback_models")
        @ExcludeMissing
        fallbackModels: JsonField<List<FallbackModel>> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<String> = JsonMissing.of(),
        @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settings")
        @ExcludeMissing
        settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of(),
    ) : this(
        apiKeyRef,
        challenger,
        fallbackModels,
        language,
        model,
        region,
        settings,
        mutableMapOf(),
    )

    /**
     * Integration secret identifier for the transcription provider API key. Currently used for
     * Azure transcription regions that require a customer-provided API key.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKeyRef(): Optional<String> = apiKeyRef.getOptional("api_key_ref")

    /**
     * A second speech-to-text model that transcribes alongside `transcription.model`, and the rule
     * that decides which transcript the assistant uses.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun challenger(): Optional<Challenger> = challenger.getOptional("challenger")

    /**
     * Up to 3 streaming models that take over transcription, in this order, when the model in use
     * fails, at the start of a call or mid-call. `model` must be a streaming model too, and must
     * support `language` alongside other models. On update, a list replaces the stored one: omit
     * the field to keep the stored list, or send `null` or `[]` to remove it. When an update
     * changes `model` or `language`, stored fallbacks that no longer fit are removed without an
     * error. Can't be combined with `challenger`, the language booster; to replace a stored
     * language booster, send `challenger: null` in the same request.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fallbackModels(): Optional<List<FallbackModel>> =
        fallbackModels.getOptional("fallback_models")

    /**
     * The language of the audio to be transcribed. If not set, or if set to `auto`, supported
     * models will automatically detect the language. For `deepgram/flux`, supported values are:
     * `auto` (Telnyx language detection controls the language hint), `multi` (no language hint),
     * and language-specific hints `en`, `es`, `fr`, `de`, `hi`, `ru`, `pt`, `ja`, `it`, and `nl`.
     * For `soniox/stt-rt-v4` and `soniox/stt-rt-v5`, `auto` omits the language hint and lets Soniox
     * auto-detect; ISO 639-1 codes (e.g. `en`, `es`) bias detection toward that language;
     * `settings.language_hints` can pin multiple languages at once instead. For `humain/realtime`,
     * supported values are `ar`, `en`, `codeswitch` (Arabic/English code-switching), and `auto`
     * (resolves server-side to code-switching). Unlike other models, `humain/realtime` does not
     * fall back to `auto` when `language` is omitted — omitting it applies `en` instead. For
     * `reson8/turns`, supported values are `auto` (or unset) for automatic language detection, and
     * the language codes `nl`, `en`, `fr`, `fy`, `de`, `it`, `pl`, `pt`, `es`, and `sv` to fix the
     * transcription language. For `cohere/ar-stt`, supported values are `ar` and `en`; unlike other
     * models, this model does not auto-detect and defaults to `ar` when `language` is omitted.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<String> = language.getOptional("language")

    /**
     * The speech to text model to be used by the voice assistant. All Deepgram models are run
     * on-premise.
     * - `deepgram/flux` is optimized for turn-taking with multilingual language hints.
     * - `deepgram/nova-3` is multilingual with automatic language detection.
     * - `deepgram/nova-2` is Deepgram's previous-generation multilingual model.
     * - `azure/fast` is a multilingual Azure transcription model.
     * - `assemblyai/universal-3-5-pro` is a multilingual streaming model with configurable turn
     *   detection. The legacy alias `assemblyai/universal-streaming` is still accepted and resolves
     *   to the same model.
     * - `xai/grok-stt` is a multilingual Grok STT model.
     * - `soniox/stt-rt-v4` and `soniox/stt-rt-v5` are multilingual streaming models with automatic
     *   language detection, configurable endpointing, term biasing (`context`), and
     *   `language_hints`.
     * - `nvidia/parakeet-v3` is a multilingual transcription model with automatic language
     *   detection.
     * - `omi-health/omi-med-stt-v1` is an English-only medical transcription model
     *   (Parakeet-based).
     * - `humain/realtime` is a streaming model with native Arabic and Arabic/English code-switching
     *   support.
     * - `reson8/turns` is a turn-based streaming model covering 10 European languages with
     *   automatic language detection.
     * - `cohere/ar-stt` is a non-streaming Arabic and English transcription model.
     * - `telnyx/basira` is a non-streaming Arabic transcription model.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<Model> = model.getOptional("model")

    /**
     * Region on third party cloud providers (currently Azure) if using one of their models. Some
     * regions require `api_key_ref`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = region.getOptional("region")

    /**
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settings(): Optional<TranscriptionSettingsConfig> = settings.getOptional("settings")

    /**
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key_ref") @ExcludeMissing fun _apiKeyRef(): JsonField<String> = apiKeyRef

    /**
     * Returns the raw JSON value of [challenger].
     *
     * Unlike [challenger], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("challenger")
    @ExcludeMissing
    fun _challenger(): JsonField<Challenger> = challenger

    /**
     * Returns the raw JSON value of [fallbackModels].
     *
     * Unlike [fallbackModels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fallback_models")
    @ExcludeMissing
    fun _fallbackModels(): JsonField<List<FallbackModel>> = fallbackModels

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

    /**
     * Returns the raw JSON value of [model].
     *
     * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settings")
    @ExcludeMissing
    fun _settings(): JsonField<TranscriptionSettingsConfig> = settings

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

        /** Returns a mutable builder for constructing an instance of [TranscriptionSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionSettings]. */
    class Builder internal constructor() {

        private var apiKeyRef: JsonField<String> = JsonMissing.of()
        private var challenger: JsonField<Challenger> = JsonMissing.of()
        private var fallbackModels: JsonField<MutableList<FallbackModel>>? = null
        private var language: JsonField<String> = JsonMissing.of()
        private var model: JsonField<Model> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionSettings: TranscriptionSettings) = apply {
            apiKeyRef = transcriptionSettings.apiKeyRef
            challenger = transcriptionSettings.challenger
            fallbackModels = transcriptionSettings.fallbackModels.map { it.toMutableList() }
            language = transcriptionSettings.language
            model = transcriptionSettings.model
            region = transcriptionSettings.region
            settings = transcriptionSettings.settings
            additionalProperties = transcriptionSettings.additionalProperties.toMutableMap()
        }

        /**
         * Integration secret identifier for the transcription provider API key. Currently used for
         * Azure transcription regions that require a customer-provided API key.
         */
        fun apiKeyRef(apiKeyRef: String) = apiKeyRef(JsonField.of(apiKeyRef))

        /**
         * Sets [Builder.apiKeyRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiKeyRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun apiKeyRef(apiKeyRef: JsonField<String>) = apply { this.apiKeyRef = apiKeyRef }

        /**
         * A second speech-to-text model that transcribes alongside `transcription.model`, and the
         * rule that decides which transcript the assistant uses.
         */
        fun challenger(challenger: Challenger?) = challenger(JsonField.ofNullable(challenger))

        /** Alias for calling [Builder.challenger] with `challenger.orElse(null)`. */
        fun challenger(challenger: Optional<Challenger>) = challenger(challenger.getOrNull())

        /**
         * Sets [Builder.challenger] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challenger] with a well-typed [Challenger] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun challenger(challenger: JsonField<Challenger>) = apply { this.challenger = challenger }

        /**
         * Up to 3 streaming models that take over transcription, in this order, when the model in
         * use fails, at the start of a call or mid-call. `model` must be a streaming model too, and
         * must support `language` alongside other models. On update, a list replaces the stored
         * one: omit the field to keep the stored list, or send `null` or `[]` to remove it. When an
         * update changes `model` or `language`, stored fallbacks that no longer fit are removed
         * without an error. Can't be combined with `challenger`, the language booster; to replace a
         * stored language booster, send `challenger: null` in the same request.
         */
        fun fallbackModels(fallbackModels: List<FallbackModel>?) =
            fallbackModels(JsonField.ofNullable(fallbackModels))

        /** Alias for calling [Builder.fallbackModels] with `fallbackModels.orElse(null)`. */
        fun fallbackModels(fallbackModels: Optional<List<FallbackModel>>) =
            fallbackModels(fallbackModels.getOrNull())

        /**
         * Sets [Builder.fallbackModels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackModels] with a well-typed `List<FallbackModel>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fallbackModels(fallbackModels: JsonField<List<FallbackModel>>) = apply {
            this.fallbackModels = fallbackModels.map { it.toMutableList() }
        }

        /**
         * Adds a single [FallbackModel] to [fallbackModels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFallbackModel(fallbackModel: FallbackModel) = apply {
            fallbackModels =
                (fallbackModels ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fallbackModels", it).add(fallbackModel)
                }
        }

        /**
         * The language of the audio to be transcribed. If not set, or if set to `auto`, supported
         * models will automatically detect the language. For `deepgram/flux`, supported values are:
         * `auto` (Telnyx language detection controls the language hint), `multi` (no language
         * hint), and language-specific hints `en`, `es`, `fr`, `de`, `hi`, `ru`, `pt`, `ja`, `it`,
         * and `nl`. For `soniox/stt-rt-v4` and `soniox/stt-rt-v5`, `auto` omits the language hint
         * and lets Soniox auto-detect; ISO 639-1 codes (e.g. `en`, `es`) bias detection toward that
         * language; `settings.language_hints` can pin multiple languages at once instead. For
         * `humain/realtime`, supported values are `ar`, `en`, `codeswitch` (Arabic/English
         * code-switching), and `auto` (resolves server-side to code-switching). Unlike other
         * models, `humain/realtime` does not fall back to `auto` when `language` is omitted —
         * omitting it applies `en` instead. For `reson8/turns`, supported values are `auto` (or
         * unset) for automatic language detection, and the language codes `nl`, `en`, `fr`, `fy`,
         * `de`, `it`, `pl`, `pt`, `es`, and `sv` to fix the transcription language. For
         * `cohere/ar-stt`, supported values are `ar` and `en`; unlike other models, this model does
         * not auto-detect and defaults to `ar` when `language` is omitted.
         */
        fun language(language: String) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<String>) = apply { this.language = language }

        /**
         * The speech to text model to be used by the voice assistant. All Deepgram models are run
         * on-premise.
         * - `deepgram/flux` is optimized for turn-taking with multilingual language hints.
         * - `deepgram/nova-3` is multilingual with automatic language detection.
         * - `deepgram/nova-2` is Deepgram's previous-generation multilingual model.
         * - `azure/fast` is a multilingual Azure transcription model.
         * - `assemblyai/universal-3-5-pro` is a multilingual streaming model with configurable turn
         *   detection. The legacy alias `assemblyai/universal-streaming` is still accepted and
         *   resolves to the same model.
         * - `xai/grok-stt` is a multilingual Grok STT model.
         * - `soniox/stt-rt-v4` and `soniox/stt-rt-v5` are multilingual streaming models with
         *   automatic language detection, configurable endpointing, term biasing (`context`), and
         *   `language_hints`.
         * - `nvidia/parakeet-v3` is a multilingual transcription model with automatic language
         *   detection.
         * - `omi-health/omi-med-stt-v1` is an English-only medical transcription model
         *   (Parakeet-based).
         * - `humain/realtime` is a streaming model with native Arabic and Arabic/English
         *   code-switching support.
         * - `reson8/turns` is a turn-based streaming model covering 10 European languages with
         *   automatic language detection.
         * - `cohere/ar-stt` is a non-streaming Arabic and English transcription model.
         * - `telnyx/basira` is a non-streaming Arabic transcription model.
         */
        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

        /**
         * Region on third party cloud providers (currently Azure) if using one of their models.
         * Some regions require `api_key_ref`.
         */
        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<String>) = apply { this.region = region }

        fun settings(settings: TranscriptionSettingsConfig) = settings(JsonField.of(settings))

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed
         * [TranscriptionSettingsConfig] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun settings(settings: JsonField<TranscriptionSettingsConfig>) = apply {
            this.settings = settings
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
         * Returns an immutable instance of [TranscriptionSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionSettings =
            TranscriptionSettings(
                apiKeyRef,
                challenger,
                (fallbackModels ?: JsonMissing.of()).map { it.toImmutable() },
                language,
                model,
                region,
                settings,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): TranscriptionSettings = apply {
        if (validated) {
            return@apply
        }

        apiKeyRef()
        challenger().ifPresent { it.validate() }
        fallbackModels().ifPresent { it.forEach { it.validate() } }
        language()
        model().ifPresent { it.validate() }
        region()
        settings().ifPresent { it.validate() }
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
        (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
            (challenger.asKnown().getOrNull()?.validity() ?: 0) +
            (fallbackModels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (language.asKnown().isPresent) 1 else 0) +
            (model.asKnown().getOrNull()?.validity() ?: 0) +
            (if (region.asKnown().isPresent) 1 else 0) +
            (settings.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * A second speech-to-text model that transcribes alongside `transcription.model`, and the rule
     * that decides which transcript the assistant uses.
     */
    class Challenger
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val model: JsonField<Model>,
        private val language: JsonField<String>,
        private val rule: JsonField<Rule>,
        private val settings: JsonField<TranscriptionSettingsConfig>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rule") @ExcludeMissing rule: JsonField<Rule> = JsonMissing.of(),
            @JsonProperty("settings")
            @ExcludeMissing
            settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of(),
        ) : this(model, language, rule, settings, mutableMapOf())

        /**
         * The language booster's model. It must be the same kind of model as `transcription.model`:
         * both streaming (`deepgram/flux`, `deepgram/nova-3`, `deepgram/nova-2`,
         * `assemblyai/universal-3-5-pro` or its legacy alias `assemblyai/universal-streaming`,
         * `xai/grok-stt`, `soniox/stt-rt-v4`, `soniox/stt-rt-v5`, `humain/realtime`,
         * `reson8/turns`) or both non-streaming (`azure/fast`, `nvidia/parakeet-v3`,
         * `omi-health/omi-med-stt-v1`, `cohere/ar-stt`, `distil-whisper/distil-large-v2`,
         * `openai/whisper-large-v3-turbo`, `telnyx/basira`). It can be the same model as
         * `transcription.model` on a different `language`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): Model = model.getRequired("model")

        /**
         * The language this model transcribes. Omit it or set it to `null` to use the language of
         * `transcription.model`. The request is rejected when this model doesn't support the
         * language it would run. It is also rejected when it would run the same model on the same
         * language as `transcription.model`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * How the assistant picks the transcript it uses. The models are compared on how complete
         * and confident their transcripts are, not on language, so the rules work best when both
         * models understand the callers' language.
         * - `best_turn` (default): both models transcribe the whole call. Each turn uses the
         *   language booster's transcript only when it scores higher than the transcript of
         *   `transcription.model` (clearly higher with non-streaming models). With streaming
         *   models, `transcription.model` also decides when each turn ends. Available for every
         *   pair.
         * - `best_engine`: both models transcribe the first turns, then the call continues alone on
         *   the model whose transcripts scored higher. If neither clearly leads,
         *   `transcription.model` continues. Streaming models only.
         * - `merge_words`: both models transcribe each utterance and their words are merged,
         *   keeping Arabic and English spoken in the same sentence. Available only for
         *   `telnyx/basira` with `cohere/ar-stt`, in either order. The pair runs on the language
         *   that applies to `telnyx/basira` (its own, or that of `transcription.model`), which must
         *   be Arabic (`ar` or an `ar-` locale), `multi`, or `auto`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun rule(): Optional<Rule> = rule.getOptional("rule")

        /**
         * Settings for the language booster, with the same fields and limits as
         * `transcription.settings`. Fields that don't apply to this model's provider are dropped,
         * and the provider's defaults fill in the rest. Omit it or set it to `null` to use the
         * settings of `transcription.model` where they apply to this model.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun settings(): Optional<TranscriptionSettingsConfig> = settings.getOptional("settings")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [rule].
         *
         * Unlike [rule], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule") @ExcludeMissing fun _rule(): JsonField<Rule> = rule

        /**
         * Returns the raw JSON value of [settings].
         *
         * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("settings")
        @ExcludeMissing
        fun _settings(): JsonField<TranscriptionSettingsConfig> = settings

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
             * Returns a mutable builder for constructing an instance of [Challenger].
             *
             * The following fields are required:
             * ```java
             * .model()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Challenger]. */
        class Builder internal constructor() {

            private var model: JsonField<Model>? = null
            private var language: JsonField<String> = JsonMissing.of()
            private var rule: JsonField<Rule> = JsonMissing.of()
            private var settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(challenger: Challenger) = apply {
                model = challenger.model
                language = challenger.language
                rule = challenger.rule
                settings = challenger.settings
                additionalProperties = challenger.additionalProperties.toMutableMap()
            }

            /**
             * The language booster's model. It must be the same kind of model as
             * `transcription.model`: both streaming (`deepgram/flux`, `deepgram/nova-3`,
             * `deepgram/nova-2`, `assemblyai/universal-3-5-pro` or its legacy alias
             * `assemblyai/universal-streaming`, `xai/grok-stt`, `soniox/stt-rt-v4`,
             * `soniox/stt-rt-v5`, `humain/realtime`, `reson8/turns`) or both non-streaming
             * (`azure/fast`, `nvidia/parakeet-v3`, `omi-health/omi-med-stt-v1`, `cohere/ar-stt`,
             * `distil-whisper/distil-large-v2`, `openai/whisper-large-v3-turbo`, `telnyx/basira`).
             * It can be the same model as `transcription.model` on a different `language`.
             */
            fun model(model: Model) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [Model] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun model(model: JsonField<Model>) = apply { this.model = model }

            /**
             * The language this model transcribes. Omit it or set it to `null` to use the language
             * of `transcription.model`. The request is rejected when this model doesn't support the
             * language it would run. It is also rejected when it would run the same model on the
             * same language as `transcription.model`.
             */
            fun language(language: String?) = language(JsonField.ofNullable(language))

            /** Alias for calling [Builder.language] with `language.orElse(null)`. */
            fun language(language: Optional<String>) = language(language.getOrNull())

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /**
             * How the assistant picks the transcript it uses. The models are compared on how
             * complete and confident their transcripts are, not on language, so the rules work best
             * when both models understand the callers' language.
             * - `best_turn` (default): both models transcribe the whole call. Each turn uses the
             *   language booster's transcript only when it scores higher than the transcript of
             *   `transcription.model` (clearly higher with non-streaming models). With streaming
             *   models, `transcription.model` also decides when each turn ends. Available for every
             *   pair.
             * - `best_engine`: both models transcribe the first turns, then the call continues
             *   alone on the model whose transcripts scored higher. If neither clearly leads,
             *   `transcription.model` continues. Streaming models only.
             * - `merge_words`: both models transcribe each utterance and their words are merged,
             *   keeping Arabic and English spoken in the same sentence. Available only for
             *   `telnyx/basira` with `cohere/ar-stt`, in either order. The pair runs on the
             *   language that applies to `telnyx/basira` (its own, or that of
             *   `transcription.model`), which must be Arabic (`ar` or an `ar-` locale), `multi`, or
             *   `auto`.
             */
            fun rule(rule: Rule) = rule(JsonField.of(rule))

            /**
             * Sets [Builder.rule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rule] with a well-typed [Rule] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rule(rule: JsonField<Rule>) = apply { this.rule = rule }

            /**
             * Settings for the language booster, with the same fields and limits as
             * `transcription.settings`. Fields that don't apply to this model's provider are
             * dropped, and the provider's defaults fill in the rest. Omit it or set it to `null` to
             * use the settings of `transcription.model` where they apply to this model.
             */
            fun settings(settings: TranscriptionSettingsConfig?) =
                settings(JsonField.ofNullable(settings))

            /** Alias for calling [Builder.settings] with `settings.orElse(null)`. */
            fun settings(settings: Optional<TranscriptionSettingsConfig>) =
                settings(settings.getOrNull())

            /**
             * Sets [Builder.settings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settings] with a well-typed
             * [TranscriptionSettingsConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun settings(settings: JsonField<TranscriptionSettingsConfig>) = apply {
                this.settings = settings
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
             * Returns an immutable instance of [Challenger].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Challenger =
                Challenger(
                    checkRequired("model", model),
                    language,
                    rule,
                    settings,
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
        fun validate(): Challenger = apply {
            if (validated) {
                return@apply
            }

            model().validate()
            language()
            rule().ifPresent { it.validate() }
            settings().ifPresent { it.validate() }
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
            (model.asKnown().getOrNull()?.validity() ?: 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (rule.asKnown().getOrNull()?.validity() ?: 0) +
                (settings.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The language booster's model. It must be the same kind of model as `transcription.model`:
         * both streaming (`deepgram/flux`, `deepgram/nova-3`, `deepgram/nova-2`,
         * `assemblyai/universal-3-5-pro` or its legacy alias `assemblyai/universal-streaming`,
         * `xai/grok-stt`, `soniox/stt-rt-v4`, `soniox/stt-rt-v5`, `humain/realtime`,
         * `reson8/turns`) or both non-streaming (`azure/fast`, `nvidia/parakeet-v3`,
         * `omi-health/omi-med-stt-v1`, `cohere/ar-stt`, `distil-whisper/distil-large-v2`,
         * `openai/whisper-large-v3-turbo`, `telnyx/basira`). It can be the same model as
         * `transcription.model` on a different `language`.
         */
        class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DEEPGRAM_FLUX = of("deepgram/flux")

                @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

                @JvmField val DEEPGRAM_NOVA_2 = of("deepgram/nova-2")

                @JvmField val AZURE_FAST = of("azure/fast")

                @JvmField val ASSEMBLYAI_UNIVERSAL_3_5_PRO = of("assemblyai/universal-3-5-pro")

                @JvmField val ASSEMBLYAI_UNIVERSAL_STREAMING = of("assemblyai/universal-streaming")

                @JvmField val XAI_GROK_STT = of("xai/grok-stt")

                @JvmField val SONIOX_STT_RT_V4 = of("soniox/stt-rt-v4")

                @JvmField val SONIOX_STT_RT_V5 = of("soniox/stt-rt-v5")

                @JvmField val NVIDIA_PARAKEET_V3 = of("nvidia/parakeet-v3")

                @JvmField val OMI_HEALTH_OMI_MED_STT_V1 = of("omi-health/omi-med-stt-v1")

                @JvmField val HUMAIN_REALTIME = of("humain/realtime")

                @JvmField val RESON8_TURNS = of("reson8/turns")

                @JvmField val COHERE_AR_STT = of("cohere/ar-stt")

                @JvmField val TELNYX_BASIRA = of("telnyx/basira")

                @JvmField val DISTIL_WHISPER_DISTIL_LARGE_V2 = of("distil-whisper/distil-large-v2")

                @JvmField val OPENAI_WHISPER_LARGE_V3_TURBO = of("openai/whisper-large-v3-turbo")

                @JvmStatic fun of(value: String) = Model(JsonField.of(value))
            }

            /** An enum containing [Model]'s known values. */
            enum class Known {
                DEEPGRAM_FLUX,
                DEEPGRAM_NOVA_3,
                DEEPGRAM_NOVA_2,
                AZURE_FAST,
                ASSEMBLYAI_UNIVERSAL_3_5_PRO,
                ASSEMBLYAI_UNIVERSAL_STREAMING,
                XAI_GROK_STT,
                SONIOX_STT_RT_V4,
                SONIOX_STT_RT_V5,
                NVIDIA_PARAKEET_V3,
                OMI_HEALTH_OMI_MED_STT_V1,
                HUMAIN_REALTIME,
                RESON8_TURNS,
                COHERE_AR_STT,
                TELNYX_BASIRA,
                DISTIL_WHISPER_DISTIL_LARGE_V2,
                OPENAI_WHISPER_LARGE_V3_TURBO,
            }

            /**
             * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Model] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM_FLUX,
                DEEPGRAM_NOVA_3,
                DEEPGRAM_NOVA_2,
                AZURE_FAST,
                ASSEMBLYAI_UNIVERSAL_3_5_PRO,
                ASSEMBLYAI_UNIVERSAL_STREAMING,
                XAI_GROK_STT,
                SONIOX_STT_RT_V4,
                SONIOX_STT_RT_V5,
                NVIDIA_PARAKEET_V3,
                OMI_HEALTH_OMI_MED_STT_V1,
                HUMAIN_REALTIME,
                RESON8_TURNS,
                COHERE_AR_STT,
                TELNYX_BASIRA,
                DISTIL_WHISPER_DISTIL_LARGE_V2,
                OPENAI_WHISPER_LARGE_V3_TURBO,
                /**
                 * An enum member indicating that [Model] was instantiated with an unknown value.
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
                    DEEPGRAM_FLUX -> Value.DEEPGRAM_FLUX
                    DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
                    DEEPGRAM_NOVA_2 -> Value.DEEPGRAM_NOVA_2
                    AZURE_FAST -> Value.AZURE_FAST
                    ASSEMBLYAI_UNIVERSAL_3_5_PRO -> Value.ASSEMBLYAI_UNIVERSAL_3_5_PRO
                    ASSEMBLYAI_UNIVERSAL_STREAMING -> Value.ASSEMBLYAI_UNIVERSAL_STREAMING
                    XAI_GROK_STT -> Value.XAI_GROK_STT
                    SONIOX_STT_RT_V4 -> Value.SONIOX_STT_RT_V4
                    SONIOX_STT_RT_V5 -> Value.SONIOX_STT_RT_V5
                    NVIDIA_PARAKEET_V3 -> Value.NVIDIA_PARAKEET_V3
                    OMI_HEALTH_OMI_MED_STT_V1 -> Value.OMI_HEALTH_OMI_MED_STT_V1
                    HUMAIN_REALTIME -> Value.HUMAIN_REALTIME
                    RESON8_TURNS -> Value.RESON8_TURNS
                    COHERE_AR_STT -> Value.COHERE_AR_STT
                    TELNYX_BASIRA -> Value.TELNYX_BASIRA
                    DISTIL_WHISPER_DISTIL_LARGE_V2 -> Value.DISTIL_WHISPER_DISTIL_LARGE_V2
                    OPENAI_WHISPER_LARGE_V3_TURBO -> Value.OPENAI_WHISPER_LARGE_V3_TURBO
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
                    DEEPGRAM_FLUX -> Known.DEEPGRAM_FLUX
                    DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                    DEEPGRAM_NOVA_2 -> Known.DEEPGRAM_NOVA_2
                    AZURE_FAST -> Known.AZURE_FAST
                    ASSEMBLYAI_UNIVERSAL_3_5_PRO -> Known.ASSEMBLYAI_UNIVERSAL_3_5_PRO
                    ASSEMBLYAI_UNIVERSAL_STREAMING -> Known.ASSEMBLYAI_UNIVERSAL_STREAMING
                    XAI_GROK_STT -> Known.XAI_GROK_STT
                    SONIOX_STT_RT_V4 -> Known.SONIOX_STT_RT_V4
                    SONIOX_STT_RT_V5 -> Known.SONIOX_STT_RT_V5
                    NVIDIA_PARAKEET_V3 -> Known.NVIDIA_PARAKEET_V3
                    OMI_HEALTH_OMI_MED_STT_V1 -> Known.OMI_HEALTH_OMI_MED_STT_V1
                    HUMAIN_REALTIME -> Known.HUMAIN_REALTIME
                    RESON8_TURNS -> Known.RESON8_TURNS
                    COHERE_AR_STT -> Known.COHERE_AR_STT
                    TELNYX_BASIRA -> Known.TELNYX_BASIRA
                    DISTIL_WHISPER_DISTIL_LARGE_V2 -> Known.DISTIL_WHISPER_DISTIL_LARGE_V2
                    OPENAI_WHISPER_LARGE_V3_TURBO -> Known.OPENAI_WHISPER_LARGE_V3_TURBO
                    else -> throw TelnyxInvalidDataException("Unknown Model: $value")
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

        /**
         * How the assistant picks the transcript it uses. The models are compared on how complete
         * and confident their transcripts are, not on language, so the rules work best when both
         * models understand the callers' language.
         * - `best_turn` (default): both models transcribe the whole call. Each turn uses the
         *   language booster's transcript only when it scores higher than the transcript of
         *   `transcription.model` (clearly higher with non-streaming models). With streaming
         *   models, `transcription.model` also decides when each turn ends. Available for every
         *   pair.
         * - `best_engine`: both models transcribe the first turns, then the call continues alone on
         *   the model whose transcripts scored higher. If neither clearly leads,
         *   `transcription.model` continues. Streaming models only.
         * - `merge_words`: both models transcribe each utterance and their words are merged,
         *   keeping Arabic and English spoken in the same sentence. Available only for
         *   `telnyx/basira` with `cohere/ar-stt`, in either order. The pair runs on the language
         *   that applies to `telnyx/basira` (its own, or that of `transcription.model`), which must
         *   be Arabic (`ar` or an `ar-` locale), `multi`, or `auto`.
         */
        class Rule @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val BEST_TURN = of("best_turn")

                @JvmField val BEST_ENGINE = of("best_engine")

                @JvmField val MERGE_WORDS = of("merge_words")

                @JvmStatic fun of(value: String) = Rule(JsonField.of(value))
            }

            /** An enum containing [Rule]'s known values. */
            enum class Known {
                BEST_TURN,
                BEST_ENGINE,
                MERGE_WORDS,
            }

            /**
             * An enum containing [Rule]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Rule] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BEST_TURN,
                BEST_ENGINE,
                MERGE_WORDS,
                /** An enum member indicating that [Rule] was instantiated with an unknown value. */
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
                    BEST_TURN -> Value.BEST_TURN
                    BEST_ENGINE -> Value.BEST_ENGINE
                    MERGE_WORDS -> Value.MERGE_WORDS
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
                    BEST_TURN -> Known.BEST_TURN
                    BEST_ENGINE -> Known.BEST_ENGINE
                    MERGE_WORDS -> Known.MERGE_WORDS
                    else -> throw TelnyxInvalidDataException("Unknown Rule: $value")
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
            fun validate(): Rule = apply {
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

                return other is Rule && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Challenger &&
                model == other.model &&
                language == other.language &&
                rule == other.rule &&
                settings == other.settings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(model, language, rule, settings, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Challenger{model=$model, language=$language, rule=$rule, settings=$settings, additionalProperties=$additionalProperties}"
    }

    /**
     * A streaming speech-to-text model that takes over transcription when the model in use fails.
     */
    class FallbackModel
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val model: JsonField<Model>,
        private val language: JsonField<String>,
        private val settings: JsonField<TranscriptionSettingsConfig>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("model") @ExcludeMissing model: JsonField<Model> = JsonMissing.of(),
            @JsonProperty("language")
            @ExcludeMissing
            language: JsonField<String> = JsonMissing.of(),
            @JsonProperty("settings")
            @ExcludeMissing
            settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of(),
        ) : this(model, language, settings, mutableMapOf())

        /**
         * The fallback model. It must be a streaming model other than `transcription.model` and the
         * other fallbacks: `deepgram/flux`, `deepgram/nova-3`, `deepgram/nova-2`,
         * `assemblyai/universal-3-5-pro` (or its legacy alias `assemblyai/universal-streaming`),
         * `xai/grok-stt`, `soniox/stt-rt-v4`, `soniox/stt-rt-v5`, `humain/realtime`, or
         * `reson8/turns`.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun model(): Model = model.getRequired("model")

        /**
         * The language the fallback transcribes. Omit it or set it to `null` to use the language of
         * `transcription.model`. The request is rejected when the fallback model doesn't support
         * the language it would run.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun language(): Optional<String> = language.getOptional("language")

        /**
         * Settings for the fallback, with the same fields and limits as `transcription.settings`.
         * Fields that don't apply to this model's provider are dropped, and the provider's defaults
         * fill in the rest. Omit it or set it to `null` to use the settings of
         * `transcription.model` where they apply to this model.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun settings(): Optional<TranscriptionSettingsConfig> = settings.getOptional("settings")

        /**
         * Returns the raw JSON value of [model].
         *
         * Unlike [model], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("model") @ExcludeMissing fun _model(): JsonField<Model> = model

        /**
         * Returns the raw JSON value of [language].
         *
         * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<String> = language

        /**
         * Returns the raw JSON value of [settings].
         *
         * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("settings")
        @ExcludeMissing
        fun _settings(): JsonField<TranscriptionSettingsConfig> = settings

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
             * Returns a mutable builder for constructing an instance of [FallbackModel].
             *
             * The following fields are required:
             * ```java
             * .model()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FallbackModel]. */
        class Builder internal constructor() {

            private var model: JsonField<Model>? = null
            private var language: JsonField<String> = JsonMissing.of()
            private var settings: JsonField<TranscriptionSettingsConfig> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fallbackModel: FallbackModel) = apply {
                model = fallbackModel.model
                language = fallbackModel.language
                settings = fallbackModel.settings
                additionalProperties = fallbackModel.additionalProperties.toMutableMap()
            }

            /**
             * The fallback model. It must be a streaming model other than `transcription.model` and
             * the other fallbacks: `deepgram/flux`, `deepgram/nova-3`, `deepgram/nova-2`,
             * `assemblyai/universal-3-5-pro` (or its legacy alias
             * `assemblyai/universal-streaming`), `xai/grok-stt`, `soniox/stt-rt-v4`,
             * `soniox/stt-rt-v5`, `humain/realtime`, or `reson8/turns`.
             */
            fun model(model: Model) = model(JsonField.of(model))

            /**
             * Sets [Builder.model] to an arbitrary JSON value.
             *
             * You should usually call [Builder.model] with a well-typed [Model] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun model(model: JsonField<Model>) = apply { this.model = model }

            /**
             * The language the fallback transcribes. Omit it or set it to `null` to use the
             * language of `transcription.model`. The request is rejected when the fallback model
             * doesn't support the language it would run.
             */
            fun language(language: String?) = language(JsonField.ofNullable(language))

            /** Alias for calling [Builder.language] with `language.orElse(null)`. */
            fun language(language: Optional<String>) = language(language.getOrNull())

            /**
             * Sets [Builder.language] to an arbitrary JSON value.
             *
             * You should usually call [Builder.language] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun language(language: JsonField<String>) = apply { this.language = language }

            /**
             * Settings for the fallback, with the same fields and limits as
             * `transcription.settings`. Fields that don't apply to this model's provider are
             * dropped, and the provider's defaults fill in the rest. Omit it or set it to `null` to
             * use the settings of `transcription.model` where they apply to this model.
             */
            fun settings(settings: TranscriptionSettingsConfig?) =
                settings(JsonField.ofNullable(settings))

            /** Alias for calling [Builder.settings] with `settings.orElse(null)`. */
            fun settings(settings: Optional<TranscriptionSettingsConfig>) =
                settings(settings.getOrNull())

            /**
             * Sets [Builder.settings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settings] with a well-typed
             * [TranscriptionSettingsConfig] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun settings(settings: JsonField<TranscriptionSettingsConfig>) = apply {
                this.settings = settings
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
             * Returns an immutable instance of [FallbackModel].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .model()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FallbackModel =
                FallbackModel(
                    checkRequired("model", model),
                    language,
                    settings,
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
        fun validate(): FallbackModel = apply {
            if (validated) {
                return@apply
            }

            model().validate()
            language()
            settings().ifPresent { it.validate() }
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
            (model.asKnown().getOrNull()?.validity() ?: 0) +
                (if (language.asKnown().isPresent) 1 else 0) +
                (settings.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * The fallback model. It must be a streaming model other than `transcription.model` and the
         * other fallbacks: `deepgram/flux`, `deepgram/nova-3`, `deepgram/nova-2`,
         * `assemblyai/universal-3-5-pro` (or its legacy alias `assemblyai/universal-streaming`),
         * `xai/grok-stt`, `soniox/stt-rt-v4`, `soniox/stt-rt-v5`, `humain/realtime`, or
         * `reson8/turns`.
         */
        class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DEEPGRAM_FLUX = of("deepgram/flux")

                @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

                @JvmField val DEEPGRAM_NOVA_2 = of("deepgram/nova-2")

                @JvmField val ASSEMBLYAI_UNIVERSAL_3_5_PRO = of("assemblyai/universal-3-5-pro")

                @JvmField val ASSEMBLYAI_UNIVERSAL_STREAMING = of("assemblyai/universal-streaming")

                @JvmField val XAI_GROK_STT = of("xai/grok-stt")

                @JvmField val SONIOX_STT_RT_V4 = of("soniox/stt-rt-v4")

                @JvmField val SONIOX_STT_RT_V5 = of("soniox/stt-rt-v5")

                @JvmField val HUMAIN_REALTIME = of("humain/realtime")

                @JvmField val RESON8_TURNS = of("reson8/turns")

                @JvmStatic fun of(value: String) = Model(JsonField.of(value))
            }

            /** An enum containing [Model]'s known values. */
            enum class Known {
                DEEPGRAM_FLUX,
                DEEPGRAM_NOVA_3,
                DEEPGRAM_NOVA_2,
                ASSEMBLYAI_UNIVERSAL_3_5_PRO,
                ASSEMBLYAI_UNIVERSAL_STREAMING,
                XAI_GROK_STT,
                SONIOX_STT_RT_V4,
                SONIOX_STT_RT_V5,
                HUMAIN_REALTIME,
                RESON8_TURNS,
            }

            /**
             * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Model] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DEEPGRAM_FLUX,
                DEEPGRAM_NOVA_3,
                DEEPGRAM_NOVA_2,
                ASSEMBLYAI_UNIVERSAL_3_5_PRO,
                ASSEMBLYAI_UNIVERSAL_STREAMING,
                XAI_GROK_STT,
                SONIOX_STT_RT_V4,
                SONIOX_STT_RT_V5,
                HUMAIN_REALTIME,
                RESON8_TURNS,
                /**
                 * An enum member indicating that [Model] was instantiated with an unknown value.
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
                    DEEPGRAM_FLUX -> Value.DEEPGRAM_FLUX
                    DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
                    DEEPGRAM_NOVA_2 -> Value.DEEPGRAM_NOVA_2
                    ASSEMBLYAI_UNIVERSAL_3_5_PRO -> Value.ASSEMBLYAI_UNIVERSAL_3_5_PRO
                    ASSEMBLYAI_UNIVERSAL_STREAMING -> Value.ASSEMBLYAI_UNIVERSAL_STREAMING
                    XAI_GROK_STT -> Value.XAI_GROK_STT
                    SONIOX_STT_RT_V4 -> Value.SONIOX_STT_RT_V4
                    SONIOX_STT_RT_V5 -> Value.SONIOX_STT_RT_V5
                    HUMAIN_REALTIME -> Value.HUMAIN_REALTIME
                    RESON8_TURNS -> Value.RESON8_TURNS
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
                    DEEPGRAM_FLUX -> Known.DEEPGRAM_FLUX
                    DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                    DEEPGRAM_NOVA_2 -> Known.DEEPGRAM_NOVA_2
                    ASSEMBLYAI_UNIVERSAL_3_5_PRO -> Known.ASSEMBLYAI_UNIVERSAL_3_5_PRO
                    ASSEMBLYAI_UNIVERSAL_STREAMING -> Known.ASSEMBLYAI_UNIVERSAL_STREAMING
                    XAI_GROK_STT -> Known.XAI_GROK_STT
                    SONIOX_STT_RT_V4 -> Known.SONIOX_STT_RT_V4
                    SONIOX_STT_RT_V5 -> Known.SONIOX_STT_RT_V5
                    HUMAIN_REALTIME -> Known.HUMAIN_REALTIME
                    RESON8_TURNS -> Known.RESON8_TURNS
                    else -> throw TelnyxInvalidDataException("Unknown Model: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FallbackModel &&
                model == other.model &&
                language == other.language &&
                settings == other.settings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(model, language, settings, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FallbackModel{model=$model, language=$language, settings=$settings, additionalProperties=$additionalProperties}"
    }

    /**
     * The speech to text model to be used by the voice assistant. All Deepgram models are run
     * on-premise.
     * - `deepgram/flux` is optimized for turn-taking with multilingual language hints.
     * - `deepgram/nova-3` is multilingual with automatic language detection.
     * - `deepgram/nova-2` is Deepgram's previous-generation multilingual model.
     * - `azure/fast` is a multilingual Azure transcription model.
     * - `assemblyai/universal-3-5-pro` is a multilingual streaming model with configurable turn
     *   detection. The legacy alias `assemblyai/universal-streaming` is still accepted and resolves
     *   to the same model.
     * - `xai/grok-stt` is a multilingual Grok STT model.
     * - `soniox/stt-rt-v4` and `soniox/stt-rt-v5` are multilingual streaming models with automatic
     *   language detection, configurable endpointing, term biasing (`context`), and
     *   `language_hints`.
     * - `nvidia/parakeet-v3` is a multilingual transcription model with automatic language
     *   detection.
     * - `omi-health/omi-med-stt-v1` is an English-only medical transcription model
     *   (Parakeet-based).
     * - `humain/realtime` is a streaming model with native Arabic and Arabic/English code-switching
     *   support.
     * - `reson8/turns` is a turn-based streaming model covering 10 European languages with
     *   automatic language detection.
     * - `cohere/ar-stt` is a non-streaming Arabic and English transcription model.
     * - `telnyx/basira` is a non-streaming Arabic transcription model.
     */
    class Model @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEEPGRAM_FLUX = of("deepgram/flux")

            @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

            @JvmField val DEEPGRAM_NOVA_2 = of("deepgram/nova-2")

            @JvmField val AZURE_FAST = of("azure/fast")

            @JvmField val ASSEMBLYAI_UNIVERSAL_3_5_PRO = of("assemblyai/universal-3-5-pro")

            @JvmField val ASSEMBLYAI_UNIVERSAL_STREAMING = of("assemblyai/universal-streaming")

            @JvmField val XAI_GROK_STT = of("xai/grok-stt")

            @JvmField val SONIOX_STT_RT_V4 = of("soniox/stt-rt-v4")

            @JvmField val SONIOX_STT_RT_V5 = of("soniox/stt-rt-v5")

            @JvmField val NVIDIA_PARAKEET_V3 = of("nvidia/parakeet-v3")

            @JvmField val OMI_HEALTH_OMI_MED_STT_V1 = of("omi-health/omi-med-stt-v1")

            @JvmField val HUMAIN_REALTIME = of("humain/realtime")

            @JvmField val RESON8_TURNS = of("reson8/turns")

            @JvmField val COHERE_AR_STT = of("cohere/ar-stt")

            @JvmField val TELNYX_BASIRA = of("telnyx/basira")

            @JvmField val DISTIL_WHISPER_DISTIL_LARGE_V2 = of("distil-whisper/distil-large-v2")

            @JvmField val OPENAI_WHISPER_LARGE_V3_TURBO = of("openai/whisper-large-v3-turbo")

            @JvmStatic fun of(value: String) = Model(JsonField.of(value))
        }

        /** An enum containing [Model]'s known values. */
        enum class Known {
            DEEPGRAM_FLUX,
            DEEPGRAM_NOVA_3,
            DEEPGRAM_NOVA_2,
            AZURE_FAST,
            ASSEMBLYAI_UNIVERSAL_3_5_PRO,
            ASSEMBLYAI_UNIVERSAL_STREAMING,
            XAI_GROK_STT,
            SONIOX_STT_RT_V4,
            SONIOX_STT_RT_V5,
            NVIDIA_PARAKEET_V3,
            OMI_HEALTH_OMI_MED_STT_V1,
            HUMAIN_REALTIME,
            RESON8_TURNS,
            COHERE_AR_STT,
            TELNYX_BASIRA,
            DISTIL_WHISPER_DISTIL_LARGE_V2,
            OPENAI_WHISPER_LARGE_V3_TURBO,
        }

        /**
         * An enum containing [Model]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Model] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEEPGRAM_FLUX,
            DEEPGRAM_NOVA_3,
            DEEPGRAM_NOVA_2,
            AZURE_FAST,
            ASSEMBLYAI_UNIVERSAL_3_5_PRO,
            ASSEMBLYAI_UNIVERSAL_STREAMING,
            XAI_GROK_STT,
            SONIOX_STT_RT_V4,
            SONIOX_STT_RT_V5,
            NVIDIA_PARAKEET_V3,
            OMI_HEALTH_OMI_MED_STT_V1,
            HUMAIN_REALTIME,
            RESON8_TURNS,
            COHERE_AR_STT,
            TELNYX_BASIRA,
            DISTIL_WHISPER_DISTIL_LARGE_V2,
            OPENAI_WHISPER_LARGE_V3_TURBO,
            /** An enum member indicating that [Model] was instantiated with an unknown value. */
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
                DEEPGRAM_FLUX -> Value.DEEPGRAM_FLUX
                DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
                DEEPGRAM_NOVA_2 -> Value.DEEPGRAM_NOVA_2
                AZURE_FAST -> Value.AZURE_FAST
                ASSEMBLYAI_UNIVERSAL_3_5_PRO -> Value.ASSEMBLYAI_UNIVERSAL_3_5_PRO
                ASSEMBLYAI_UNIVERSAL_STREAMING -> Value.ASSEMBLYAI_UNIVERSAL_STREAMING
                XAI_GROK_STT -> Value.XAI_GROK_STT
                SONIOX_STT_RT_V4 -> Value.SONIOX_STT_RT_V4
                SONIOX_STT_RT_V5 -> Value.SONIOX_STT_RT_V5
                NVIDIA_PARAKEET_V3 -> Value.NVIDIA_PARAKEET_V3
                OMI_HEALTH_OMI_MED_STT_V1 -> Value.OMI_HEALTH_OMI_MED_STT_V1
                HUMAIN_REALTIME -> Value.HUMAIN_REALTIME
                RESON8_TURNS -> Value.RESON8_TURNS
                COHERE_AR_STT -> Value.COHERE_AR_STT
                TELNYX_BASIRA -> Value.TELNYX_BASIRA
                DISTIL_WHISPER_DISTIL_LARGE_V2 -> Value.DISTIL_WHISPER_DISTIL_LARGE_V2
                OPENAI_WHISPER_LARGE_V3_TURBO -> Value.OPENAI_WHISPER_LARGE_V3_TURBO
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
                DEEPGRAM_FLUX -> Known.DEEPGRAM_FLUX
                DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                DEEPGRAM_NOVA_2 -> Known.DEEPGRAM_NOVA_2
                AZURE_FAST -> Known.AZURE_FAST
                ASSEMBLYAI_UNIVERSAL_3_5_PRO -> Known.ASSEMBLYAI_UNIVERSAL_3_5_PRO
                ASSEMBLYAI_UNIVERSAL_STREAMING -> Known.ASSEMBLYAI_UNIVERSAL_STREAMING
                XAI_GROK_STT -> Known.XAI_GROK_STT
                SONIOX_STT_RT_V4 -> Known.SONIOX_STT_RT_V4
                SONIOX_STT_RT_V5 -> Known.SONIOX_STT_RT_V5
                NVIDIA_PARAKEET_V3 -> Known.NVIDIA_PARAKEET_V3
                OMI_HEALTH_OMI_MED_STT_V1 -> Known.OMI_HEALTH_OMI_MED_STT_V1
                HUMAIN_REALTIME -> Known.HUMAIN_REALTIME
                RESON8_TURNS -> Known.RESON8_TURNS
                COHERE_AR_STT -> Known.COHERE_AR_STT
                TELNYX_BASIRA -> Known.TELNYX_BASIRA
                DISTIL_WHISPER_DISTIL_LARGE_V2 -> Known.DISTIL_WHISPER_DISTIL_LARGE_V2
                OPENAI_WHISPER_LARGE_V3_TURBO -> Known.OPENAI_WHISPER_LARGE_V3_TURBO
                else -> throw TelnyxInvalidDataException("Unknown Model: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws TelnyxInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionSettings &&
            apiKeyRef == other.apiKeyRef &&
            challenger == other.challenger &&
            fallbackModels == other.fallbackModels &&
            language == other.language &&
            model == other.model &&
            region == other.region &&
            settings == other.settings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiKeyRef,
            challenger,
            fallbackModels,
            language,
            model,
            region,
            settings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionSettings{apiKeyRef=$apiKeyRef, challenger=$challenger, fallbackModels=$fallbackModels, language=$language, model=$model, region=$region, settings=$settings, additionalProperties=$additionalProperties}"
}
