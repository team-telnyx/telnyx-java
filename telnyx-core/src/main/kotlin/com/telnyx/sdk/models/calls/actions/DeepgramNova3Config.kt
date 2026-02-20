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
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DeepgramNova3Config
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val transcriptionEngine: JsonField<TranscriptionEngine>,
    private val transcriptionModel: JsonField<TranscriptionModel>,
    private val interimResults: JsonField<Boolean>,
    private val keywordsBoosting: JsonField<KeywordsBoosting>,
    private val language: JsonField<Language>,
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
        @JsonProperty("interim_results")
        @ExcludeMissing
        interimResults: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("keywords_boosting")
        @ExcludeMissing
        keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<Language> = JsonMissing.of(),
        @JsonProperty("utterance_end_ms")
        @ExcludeMissing
        utteranceEndMs: JsonField<Long> = JsonMissing.of(),
    ) : this(
        transcriptionEngine,
        transcriptionModel,
        interimResults,
        keywordsBoosting,
        language,
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
     * Whether to send also interim results. If set to false, only final results will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

    /**
     * Keywords and their respective intensifiers (boosting values) to improve transcription
     * accuracy for specific words or phrases. The intensifier should be a numeric value. Example:
     * `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun keywordsBoosting(): Optional<KeywordsBoosting> =
        keywordsBoosting.getOptional("keywords_boosting")

    /**
     * Language to use for speech recognition with nova-3 model
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<Language> = language.getOptional("language")

    /**
     * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to 5000 ms.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun utteranceEndMs(): Optional<Long> = utteranceEndMs.getOptional("utterance_end_ms")

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
     * Returns the raw JSON value of [transcriptionModel].
     *
     * Unlike [transcriptionModel], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transcription_model")
    @ExcludeMissing
    fun _transcriptionModel(): JsonField<TranscriptionModel> = transcriptionModel

    /**
     * Returns the raw JSON value of [interimResults].
     *
     * Unlike [interimResults], this method doesn't throw if the JSON field has an unexpected type.
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
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

    /**
     * Returns the raw JSON value of [utteranceEndMs].
     *
     * Unlike [utteranceEndMs], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [DeepgramNova3Config].
         *
         * The following fields are required:
         * ```java
         * .transcriptionEngine()
         * .transcriptionModel()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DeepgramNova3Config]. */
    class Builder internal constructor() {

        private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
        private var transcriptionModel: JsonField<TranscriptionModel>? = null
        private var interimResults: JsonField<Boolean> = JsonMissing.of()
        private var keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of()
        private var language: JsonField<Language> = JsonMissing.of()
        private var utteranceEndMs: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(deepgramNova3Config: DeepgramNova3Config) = apply {
            transcriptionEngine = deepgramNova3Config.transcriptionEngine
            transcriptionModel = deepgramNova3Config.transcriptionModel
            interimResults = deepgramNova3Config.interimResults
            keywordsBoosting = deepgramNova3Config.keywordsBoosting
            language = deepgramNova3Config.language
            utteranceEndMs = deepgramNova3Config.utteranceEndMs
            additionalProperties = deepgramNova3Config.additionalProperties.toMutableMap()
        }

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

        fun transcriptionModel(transcriptionModel: TranscriptionModel) =
            transcriptionModel(JsonField.of(transcriptionModel))

        /**
         * Sets [Builder.transcriptionModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptionModel] with a well-typed
         * [TranscriptionModel] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun transcriptionModel(transcriptionModel: JsonField<TranscriptionModel>) = apply {
            this.transcriptionModel = transcriptionModel
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
         * You should usually call [Builder.keywordsBoosting] with a well-typed [KeywordsBoosting]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun keywordsBoosting(keywordsBoosting: JsonField<KeywordsBoosting>) = apply {
            this.keywordsBoosting = keywordsBoosting
        }

        /** Language to use for speech recognition with nova-3 model */
        fun language(language: Language) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [Language] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun language(language: JsonField<Language>) = apply { this.language = language }

        /**
         * Number of milliseconds of silence to consider an utterance ended. Ranges from 0 to 5000
         * ms.
         */
        fun utteranceEndMs(utteranceEndMs: Long) = utteranceEndMs(JsonField.of(utteranceEndMs))

        /**
         * Sets [Builder.utteranceEndMs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utteranceEndMs] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [DeepgramNova3Config].
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
        fun build(): DeepgramNova3Config =
            DeepgramNova3Config(
                checkRequired("transcriptionEngine", transcriptionEngine),
                checkRequired("transcriptionModel", transcriptionModel),
                interimResults,
                keywordsBoosting,
                language,
                utteranceEndMs,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DeepgramNova3Config = apply {
        if (validated) {
            return@apply
        }

        transcriptionEngine().validate()
        transcriptionModel().validate()
        interimResults()
        keywordsBoosting().ifPresent { it.validate() }
        language().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0) +
            (if (interimResults.asKnown().isPresent) 1 else 0) +
            (keywordsBoosting.asKnown().getOrNull()?.validity() ?: 0) +
            (language.asKnown().getOrNull()?.validity() ?: 0) +
            (if (utteranceEndMs.asKnown().isPresent) 1 else 0)

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

            @JvmField val DEEPGRAM = of("Deepgram")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            DEEPGRAM
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
            DEEPGRAM,
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
                DEEPGRAM -> Value.DEEPGRAM
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
                DEEPGRAM -> Known.DEEPGRAM
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

    class TranscriptionModel
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

            @JvmField val DEEPGRAM_NOVA_3 = of("deepgram/nova-3")

            @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
        }

        /** An enum containing [TranscriptionModel]'s known values. */
        enum class Known {
            DEEPGRAM_NOVA_3
        }

        /**
         * An enum containing [TranscriptionModel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TranscriptionModel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEEPGRAM_NOVA_3,
            /**
             * An enum member indicating that [TranscriptionModel] was instantiated with an unknown
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
                DEEPGRAM_NOVA_3 -> Value.DEEPGRAM_NOVA_3
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
                DEEPGRAM_NOVA_3 -> Known.DEEPGRAM_NOVA_3
                else -> throw TelnyxInvalidDataException("Unknown TranscriptionModel: $value")
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
     * accuracy for specific words or phrases. The intensifier should be a numeric value. Example:
     * `{"snuffleupagus": 5, "systrom": 2, "krieger": 1}`.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

            return other is KeywordsBoosting && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "KeywordsBoosting{additionalProperties=$additionalProperties}"
    }

    /** Language to use for speech recognition with nova-3 model */
    class Language @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EN_US = of("en-US")

            @JvmField val EN_AU = of("en-AU")

            @JvmField val EN_GB = of("en-GB")

            @JvmField val EN_IN = of("en-IN")

            @JvmField val EN_NZ = of("en-NZ")

            @JvmField val DE = of("de")

            @JvmField val NL = of("nl")

            @JvmField val SV_SE = of("sv-SE")

            @JvmField val DA_DK = of("da-DK")

            @JvmField val ES = of("es")

            @JvmField val ES_419 = of("es-419")

            @JvmField val FR = of("fr")

            @JvmField val FR_CA = of("fr-CA")

            @JvmField val PT_BR = of("pt-BR")

            @JvmField val PT_PT = of("pt-PT")

            @JvmField val AUTO_DETECT = of("auto_detect")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            EN_US,
            EN_AU,
            EN_GB,
            EN_IN,
            EN_NZ,
            DE,
            NL,
            SV_SE,
            DA_DK,
            ES,
            ES_419,
            FR,
            FR_CA,
            PT_BR,
            PT_PT,
            AUTO_DETECT,
        }

        /**
         * An enum containing [Language]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Language] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EN_US,
            EN_AU,
            EN_GB,
            EN_IN,
            EN_NZ,
            DE,
            NL,
            SV_SE,
            DA_DK,
            ES,
            ES_419,
            FR,
            FR_CA,
            PT_BR,
            PT_PT,
            AUTO_DETECT,
            /** An enum member indicating that [Language] was instantiated with an unknown value. */
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
                EN_US -> Value.EN_US
                EN_AU -> Value.EN_AU
                EN_GB -> Value.EN_GB
                EN_IN -> Value.EN_IN
                EN_NZ -> Value.EN_NZ
                DE -> Value.DE
                NL -> Value.NL
                SV_SE -> Value.SV_SE
                DA_DK -> Value.DA_DK
                ES -> Value.ES
                ES_419 -> Value.ES_419
                FR -> Value.FR
                FR_CA -> Value.FR_CA
                PT_BR -> Value.PT_BR
                PT_PT -> Value.PT_PT
                AUTO_DETECT -> Value.AUTO_DETECT
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
                EN_US -> Known.EN_US
                EN_AU -> Known.EN_AU
                EN_GB -> Known.EN_GB
                EN_IN -> Known.EN_IN
                EN_NZ -> Known.EN_NZ
                DE -> Known.DE
                NL -> Known.NL
                SV_SE -> Known.SV_SE
                DA_DK -> Known.DA_DK
                ES -> Known.ES
                ES_419 -> Known.ES_419
                FR -> Known.FR
                FR_CA -> Known.FR_CA
                PT_BR -> Known.PT_BR
                PT_PT -> Known.PT_PT
                AUTO_DETECT -> Known.AUTO_DETECT
                else -> throw TelnyxInvalidDataException("Unknown Language: $value")
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
            interimResults == other.interimResults &&
            keywordsBoosting == other.keywordsBoosting &&
            language == other.language &&
            utteranceEndMs == other.utteranceEndMs &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            transcriptionEngine,
            transcriptionModel,
            interimResults,
            keywordsBoosting,
            language,
            utteranceEndMs,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeepgramNova3Config{transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, interimResults=$interimResults, keywordsBoosting=$keywordsBoosting, language=$language, utteranceEndMs=$utteranceEndMs, additionalProperties=$additionalProperties}"
}
