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
import com.telnyx.api.core.checkKnown
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptionEngineAConfig
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
        @JsonProperty("hints") @ExcludeMissing hints: JsonField<List<String>> = JsonMissing.of(),
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enableSpeakerDiarization(): Optional<Boolean> =
        enableSpeakerDiarization.getOptional("enable_speaker_diarization")

    /**
     * Hints to improve transcription accuracy.
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
     * Language to use for speech recognition
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<GoogleTranscriptionLanguage> = language.getOptional("language")

    /**
     * Defines maximum number of speakers in the conversation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxSpeakerCount(): Optional<Int> = maxSpeakerCount.getOptional("max_speaker_count")

    /**
     * Defines minimum number of speakers in the conversation.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minSpeakerCount(): Optional<Int> = minSpeakerCount.getOptional("min_speaker_count")

    /**
     * The model to use for transcription.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun model(): Optional<Model> = model.getOptional("model")

    /**
     * Enables profanity_filter.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profanityFilter(): Optional<Boolean> = profanityFilter.getOptional("profanity_filter")

    /**
     * Speech context to improve transcription accuracy.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speechContext(): Optional<List<SpeechContext>> = speechContext.getOptional("speech_context")

    /**
     * Engine identifier for Google transcription service
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEngine(): Optional<TranscriptionEngine> =
        transcriptionEngine.getOptional("transcription_engine")

    /**
     * Enables enhanced transcription, this works for models `phone_call` and `video`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interim_results")
    @ExcludeMissing
    fun _interimResults(): JsonField<Boolean> = interimResults

    /**
     * Returns the raw JSON value of [language].
     *
     * Unlike [language], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("language")
    @ExcludeMissing
    fun _language(): JsonField<GoogleTranscriptionLanguage> = language

    /**
     * Returns the raw JSON value of [maxSpeakerCount].
     *
     * Unlike [maxSpeakerCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_speaker_count")
    @ExcludeMissing
    fun _maxSpeakerCount(): JsonField<Int> = maxSpeakerCount

    /**
     * Returns the raw JSON value of [minSpeakerCount].
     *
     * Unlike [minSpeakerCount], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [profanityFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profanity_filter")
    @ExcludeMissing
    fun _profanityFilter(): JsonField<Boolean> = profanityFilter

    /**
     * Returns the raw JSON value of [speechContext].
     *
     * Unlike [speechContext], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speech_context")
    @ExcludeMissing
    fun _speechContext(): JsonField<List<SpeechContext>> = speechContext

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
     * Returns the raw JSON value of [useEnhanced].
     *
     * Unlike [useEnhanced], this method doesn't throw if the JSON field has an unexpected type.
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

        /**
         * Returns a mutable builder for constructing an instance of [TranscriptionEngineAConfig].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionEngineAConfig]. */
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
        internal fun from(transcriptionEngineAConfig: TranscriptionEngineAConfig) = apply {
            enableSpeakerDiarization = transcriptionEngineAConfig.enableSpeakerDiarization
            hints = transcriptionEngineAConfig.hints.map { it.toMutableList() }
            interimResults = transcriptionEngineAConfig.interimResults
            language = transcriptionEngineAConfig.language
            maxSpeakerCount = transcriptionEngineAConfig.maxSpeakerCount
            minSpeakerCount = transcriptionEngineAConfig.minSpeakerCount
            model = transcriptionEngineAConfig.model
            profanityFilter = transcriptionEngineAConfig.profanityFilter
            speechContext = transcriptionEngineAConfig.speechContext.map { it.toMutableList() }
            transcriptionEngine = transcriptionEngineAConfig.transcriptionEngine
            useEnhanced = transcriptionEngineAConfig.useEnhanced
            additionalProperties = transcriptionEngineAConfig.additionalProperties.toMutableMap()
        }

        /** Enables speaker diarization. */
        fun enableSpeakerDiarization(enableSpeakerDiarization: Boolean) =
            enableSpeakerDiarization(JsonField.of(enableSpeakerDiarization))

        /**
         * Sets [Builder.enableSpeakerDiarization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enableSpeakerDiarization] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun enableSpeakerDiarization(enableSpeakerDiarization: JsonField<Boolean>) = apply {
            this.enableSpeakerDiarization = enableSpeakerDiarization
        }

        /** Hints to improve transcription accuracy. */
        fun hints(hints: List<String>) = hints(JsonField.of(hints))

        /**
         * Sets [Builder.hints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hints] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
                (hints ?: JsonField.of(mutableListOf())).also { checkKnown("hints", it).add(hint) }
        }

        /**
         * Whether to send also interim results. If set to false, only final results will be sent.
         */
        fun interimResults(interimResults: Boolean) = interimResults(JsonField.of(interimResults))

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

        /** Language to use for speech recognition */
        fun language(language: GoogleTranscriptionLanguage) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed
         * [GoogleTranscriptionLanguage] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun language(language: JsonField<GoogleTranscriptionLanguage>) = apply {
            this.language = language
        }

        /** Defines maximum number of speakers in the conversation. */
        fun maxSpeakerCount(maxSpeakerCount: Int) = maxSpeakerCount(JsonField.of(maxSpeakerCount))

        /**
         * Sets [Builder.maxSpeakerCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSpeakerCount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxSpeakerCount(maxSpeakerCount: JsonField<Int>) = apply {
            this.maxSpeakerCount = maxSpeakerCount
        }

        /** Defines minimum number of speakers in the conversation. */
        fun minSpeakerCount(minSpeakerCount: Int) = minSpeakerCount(JsonField.of(minSpeakerCount))

        /**
         * Sets [Builder.minSpeakerCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minSpeakerCount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minSpeakerCount(minSpeakerCount: JsonField<Int>) = apply {
            this.minSpeakerCount = minSpeakerCount
        }

        /** The model to use for transcription. */
        fun model(model: Model) = model(JsonField.of(model))

        /**
         * Sets [Builder.model] to an arbitrary JSON value.
         *
         * You should usually call [Builder.model] with a well-typed [Model] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun model(model: JsonField<Model>) = apply { this.model = model }

        /** Enables profanity_filter. */
        fun profanityFilter(profanityFilter: Boolean) =
            profanityFilter(JsonField.of(profanityFilter))

        /**
         * Sets [Builder.profanityFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profanityFilter] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * You should usually call [Builder.speechContext] with a well-typed `List<SpeechContext>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
         * [TranscriptionEngine] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionEngine(transcriptionEngine: JsonField<TranscriptionEngine>) = apply {
            this.transcriptionEngine = transcriptionEngine
        }

        /** Enables enhanced transcription, this works for models `phone_call` and `video`. */
        fun useEnhanced(useEnhanced: Boolean) = useEnhanced(JsonField.of(useEnhanced))

        /**
         * Sets [Builder.useEnhanced] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useEnhanced] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun useEnhanced(useEnhanced: JsonField<Boolean>) = apply { this.useEnhanced = useEnhanced }

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
         * Returns an immutable instance of [TranscriptionEngineAConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionEngineAConfig =
            TranscriptionEngineAConfig(
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

    fun validate(): TranscriptionEngineAConfig = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws TelnyxInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

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
            @JsonProperty("boost") @ExcludeMissing boost: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("phrases")
            @ExcludeMissing
            phrases: JsonField<List<String>> = JsonMissing.of(),
        ) : this(boost, phrases, mutableMapOf())

        /**
         * Boost factor for the speech context.
         *
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun boost(): Optional<Double> = boost.getOptional("boost")

        /**
         * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phrases(): Optional<List<String>> = phrases.getOptional("phrases")

        /**
         * Returns the raw JSON value of [boost].
         *
         * Unlike [boost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("boost") @ExcludeMissing fun _boost(): JsonField<Double> = boost

        /**
         * Returns the raw JSON value of [phrases].
         *
         * Unlike [phrases], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phrases") @ExcludeMissing fun _phrases(): JsonField<List<String>> = phrases

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

            /** Returns a mutable builder for constructing an instance of [SpeechContext]. */
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
             * You should usually call [Builder.boost] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun boost(boost: JsonField<Double>) = apply { this.boost = boost }

            fun phrases(phrases: List<String>) = phrases(JsonField.of(phrases))

            /**
             * Sets [Builder.phrases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phrases] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
            (if (boost.asKnown().isPresent) 1 else 0) + (phrases.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpeechContext &&
                boost == other.boost &&
                phrases == other.phrases &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(boost, phrases, additionalProperties) }

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
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val A = of("A")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            A
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionEngineAConfig &&
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
        "TranscriptionEngineAConfig{enableSpeakerDiarization=$enableSpeakerDiarization, hints=$hints, interimResults=$interimResults, language=$language, maxSpeakerCount=$maxSpeakerCount, minSpeakerCount=$minSpeakerCount, model=$model, profanityFilter=$profanityFilter, speechContext=$speechContext, transcriptionEngine=$transcriptionEngine, useEnhanced=$useEnhanced, additionalProperties=$additionalProperties}"
}
