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

class DeepgramNova2Config
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val transcriptionEngine: JsonField<TranscriptionEngine>,
    private val transcriptionModel: JsonField<TranscriptionModel>,
    private val keywordsBoosting: JsonField<KeywordsBoosting>,
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
        transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of(),
        @JsonProperty("keywords_boosting")
        @ExcludeMissing
        keywordsBoosting: JsonField<KeywordsBoosting> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<Language> = JsonMissing.of(),
    ) : this(transcriptionEngine, transcriptionModel, keywordsBoosting, language, mutableMapOf())

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
     * Language to use for speech recognition with nova-2 model
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<Language> = language.getOptional("language")

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
         * .transcriptionEngine()
         * .transcriptionModel()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DeepgramNova2Config]. */
    class Builder internal constructor() {

        private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
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

        /** Language to use for speech recognition with nova-2 model */
        fun language(language: Language) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [Language] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [DeepgramNova2Config].
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
        fun build(): DeepgramNova2Config =
            DeepgramNova2Config(
                checkRequired("transcriptionEngine", transcriptionEngine),
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

        transcriptionEngine().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0) +
            (keywordsBoosting.asKnown().getOrNull()?.validity() ?: 0) +
            (language.asKnown().getOrNull()?.validity() ?: 0)

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

            @JvmField val DEEPGRAM_NOVA_2 = of("deepgram/nova-2")

            @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
        }

        /** An enum containing [TranscriptionModel]'s known values. */
        enum class Known {
            DEEPGRAM_NOVA_2
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
            DEEPGRAM_NOVA_2,
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
                DEEPGRAM_NOVA_2 -> Value.DEEPGRAM_NOVA_2
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
                DEEPGRAM_NOVA_2 -> Known.DEEPGRAM_NOVA_2
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

    /** Language to use for speech recognition with nova-2 model */
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

            @JvmField val BG = of("bg")

            @JvmField val CA = of("ca")

            @JvmField val ZH_CN = of("zh-CN")

            @JvmField val ZH_HANS = of("zh-Hans")

            @JvmField val ZH_TW = of("zh-TW")

            @JvmField val ZH_HANT = of("zh-Hant")

            @JvmField val ZH_HK = of("zh-HK")

            @JvmField val CS = of("cs")

            @JvmField val DA_DK = of("da-DK")

            @JvmField val NL_BE = of("nl-BE")

            @JvmField val EN_US = of("en-US")

            @JvmField val EN_AU = of("en-AU")

            @JvmField val EN_GB = of("en-GB")

            @JvmField val EN_NZ = of("en-NZ")

            @JvmField val EN_IN = of("en-IN")

            @JvmField val ET = of("et")

            @JvmField val FI = of("fi")

            @JvmField val FR = of("fr")

            @JvmField val FR_CA = of("fr-CA")

            @JvmField val DE_CH = of("de-CH")

            @JvmField val EL = of("el")

            @JvmField val HI = of("hi")

            @JvmField val HU = of("hu")

            @JvmField val ID = of("id")

            @JvmField val IT = of("it")

            @JvmField val JA = of("ja")

            @JvmField val KO_KR = of("ko-KR")

            @JvmField val LV = of("lv")

            @JvmField val LT = of("lt")

            @JvmField val MS = of("ms")

            @JvmField val NO = of("no")

            @JvmField val PL = of("pl")

            @JvmField val PT_BR = of("pt-BR")

            @JvmField val PT_PT = of("pt-PT")

            @JvmField val RO = of("ro")

            @JvmField val RU = of("ru")

            @JvmField val SK = of("sk")

            @JvmField val ES_419 = of("es-419")

            @JvmField val SV_SE = of("sv-SE")

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
            ZH_CN,
            ZH_HANS,
            ZH_TW,
            ZH_HANT,
            ZH_HK,
            CS,
            DA_DK,
            NL_BE,
            EN_US,
            EN_AU,
            EN_GB,
            EN_NZ,
            EN_IN,
            ET,
            FI,
            FR,
            FR_CA,
            DE_CH,
            EL,
            HI,
            HU,
            ID,
            IT,
            JA,
            KO_KR,
            LV,
            LT,
            MS,
            NO,
            PL,
            PT_BR,
            PT_PT,
            RO,
            RU,
            SK,
            ES_419,
            SV_SE,
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BG,
            CA,
            ZH_CN,
            ZH_HANS,
            ZH_TW,
            ZH_HANT,
            ZH_HK,
            CS,
            DA_DK,
            NL_BE,
            EN_US,
            EN_AU,
            EN_GB,
            EN_NZ,
            EN_IN,
            ET,
            FI,
            FR,
            FR_CA,
            DE_CH,
            EL,
            HI,
            HU,
            ID,
            IT,
            JA,
            KO_KR,
            LV,
            LT,
            MS,
            NO,
            PL,
            PT_BR,
            PT_PT,
            RO,
            RU,
            SK,
            ES_419,
            SV_SE,
            TH_TH,
            TR,
            UK,
            VI,
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
                BG -> Value.BG
                CA -> Value.CA
                ZH_CN -> Value.ZH_CN
                ZH_HANS -> Value.ZH_HANS
                ZH_TW -> Value.ZH_TW
                ZH_HANT -> Value.ZH_HANT
                ZH_HK -> Value.ZH_HK
                CS -> Value.CS
                DA_DK -> Value.DA_DK
                NL_BE -> Value.NL_BE
                EN_US -> Value.EN_US
                EN_AU -> Value.EN_AU
                EN_GB -> Value.EN_GB
                EN_NZ -> Value.EN_NZ
                EN_IN -> Value.EN_IN
                ET -> Value.ET
                FI -> Value.FI
                FR -> Value.FR
                FR_CA -> Value.FR_CA
                DE_CH -> Value.DE_CH
                EL -> Value.EL
                HI -> Value.HI
                HU -> Value.HU
                ID -> Value.ID
                IT -> Value.IT
                JA -> Value.JA
                KO_KR -> Value.KO_KR
                LV -> Value.LV
                LT -> Value.LT
                MS -> Value.MS
                NO -> Value.NO
                PL -> Value.PL
                PT_BR -> Value.PT_BR
                PT_PT -> Value.PT_PT
                RO -> Value.RO
                RU -> Value.RU
                SK -> Value.SK
                ES_419 -> Value.ES_419
                SV_SE -> Value.SV_SE
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws TelnyxInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BG -> Known.BG
                CA -> Known.CA
                ZH_CN -> Known.ZH_CN
                ZH_HANS -> Known.ZH_HANS
                ZH_TW -> Known.ZH_TW
                ZH_HANT -> Known.ZH_HANT
                ZH_HK -> Known.ZH_HK
                CS -> Known.CS
                DA_DK -> Known.DA_DK
                NL_BE -> Known.NL_BE
                EN_US -> Known.EN_US
                EN_AU -> Known.EN_AU
                EN_GB -> Known.EN_GB
                EN_NZ -> Known.EN_NZ
                EN_IN -> Known.EN_IN
                ET -> Known.ET
                FI -> Known.FI
                FR -> Known.FR
                FR_CA -> Known.FR_CA
                DE_CH -> Known.DE_CH
                EL -> Known.EL
                HI -> Known.HI
                HU -> Known.HU
                ID -> Known.ID
                IT -> Known.IT
                JA -> Known.JA
                KO_KR -> Known.KO_KR
                LV -> Known.LV
                LT -> Known.LT
                MS -> Known.MS
                NO -> Known.NO
                PL -> Known.PL
                PT_BR -> Known.PT_BR
                PT_PT -> Known.PT_PT
                RO -> Known.RO
                RU -> Known.RU
                SK -> Known.SK
                ES_419 -> Known.ES_419
                SV_SE -> Known.SV_SE
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
