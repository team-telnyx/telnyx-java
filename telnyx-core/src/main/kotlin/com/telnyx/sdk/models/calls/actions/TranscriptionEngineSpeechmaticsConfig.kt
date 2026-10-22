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
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptionEngineSpeechmaticsConfig
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
        @JsonProperty("language") @ExcludeMissing language: JsonField<Language> = JsonMissing.of(),
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
        @JsonProperty("transcription_model")
        @ExcludeMissing
        transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of(),
    ) : this(interimResults, language, transcriptionEngine, transcriptionModel, mutableMapOf())

    /**
     * Whether to send also interim results. If set to false, only final results will be sent.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interimResults(): Optional<Boolean> = interimResults.getOptional("interim_results")

    /**
     * Language to use for speech recognition. Accepted values depend on the selected
     * `transcription_model`. `speechmatics/standard` supports: `en`, `ba`, `eu`, `gl`, `ga`, `mt`,
     * `mn`, `sw`, `ug`, `cy`, `ar_en`, `cmn_en`, `en_ms`, `en_ta`, `tl`, `es-bilingual-en`,
     * `cmn_en_ms_ta`. `speechmatics/linden-1` (preview) supports the same languages as Speechmatics
     * Realtime: `ar`, `ar_en`, `ba`, `be`, `bg`, `bn`, `ca`, `cmn`, `cmn_en`, `cmn_en_ms_ta`, `cs`,
     * `cy`, `da`, `de`, `el`, `en`, `en_ms`, `en_ta`, `eo`, `es`, `es-bilingual-en`, `et`, `eu`,
     * `fa`, `fi`, `fr`, `ga`, `gl`, `he`, `hi`, `hr`, `hu`, `ia`, `id`, `it`, `ja`, `ko`, `lt`,
     * `lv`, `mn`, `mr`, `ms`, `mt`, `nl`, `no`, `pl`, `pt`, `ro`, `ru`, `sk`, `sl`, `sv`, `sw`,
     * `ta`, `th`, `tl`, `tr`, `ug`, `uk`, `ur`, `vi`, `yue`, plus the spelling and script variants
     * `en-US`, `en-GB`, `en-AU`, `cmn-Hans`, and `cmn-Hant` (`en` alone uses the default spelling).
     * A value outside the selected model's list is rejected. For `speechmatics/standard`, unset,
     * blank, `auto`, `auto_beta`, or `multi` defaults to `en`; for `speechmatics/linden-1`, only an
     * unset language defaults to `en`, and `auto`, `auto_beta`, or `multi` is rejected.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<Language> = language.getOptional("language")

    /**
     * Engine identifier for Speechmatics transcription service
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEngine(): Optional<TranscriptionEngine> =
        transcriptionEngine.getOptional("transcription_engine")

    /**
     * The model to use for transcription. `speechmatics/linden-1` is a preview, vendor-hosted model
     * with its own language support (see `language`).
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionModel(): Optional<TranscriptionModel> =
        transcriptionModel.getOptional("transcription_model")

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
    @JsonProperty("language") @ExcludeMissing fun _language(): JsonField<Language> = language

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
         * [TranscriptionEngineSpeechmaticsConfig].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionEngineSpeechmaticsConfig]. */
    class Builder internal constructor() {

        private var interimResults: JsonField<Boolean> = JsonMissing.of()
        private var language: JsonField<Language> = JsonMissing.of()
        private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
        private var transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            transcriptionEngineSpeechmaticsConfig: TranscriptionEngineSpeechmaticsConfig
        ) = apply {
            interimResults = transcriptionEngineSpeechmaticsConfig.interimResults
            language = transcriptionEngineSpeechmaticsConfig.language
            transcriptionEngine = transcriptionEngineSpeechmaticsConfig.transcriptionEngine
            transcriptionModel = transcriptionEngineSpeechmaticsConfig.transcriptionModel
            additionalProperties =
                transcriptionEngineSpeechmaticsConfig.additionalProperties.toMutableMap()
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
         * Language to use for speech recognition. Accepted values depend on the selected
         * `transcription_model`. `speechmatics/standard` supports: `en`, `ba`, `eu`, `gl`, `ga`,
         * `mt`, `mn`, `sw`, `ug`, `cy`, `ar_en`, `cmn_en`, `en_ms`, `en_ta`, `tl`,
         * `es-bilingual-en`, `cmn_en_ms_ta`. `speechmatics/linden-1` (preview) supports the same
         * languages as Speechmatics Realtime: `ar`, `ar_en`, `ba`, `be`, `bg`, `bn`, `ca`, `cmn`,
         * `cmn_en`, `cmn_en_ms_ta`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en_ms`, `en_ta`, `eo`,
         * `es`, `es-bilingual-en`, `et`, `eu`, `fa`, `fi`, `fr`, `ga`, `gl`, `he`, `hi`, `hr`,
         * `hu`, `ia`, `id`, `it`, `ja`, `ko`, `lt`, `lv`, `mn`, `mr`, `ms`, `mt`, `nl`, `no`, `pl`,
         * `pt`, `ro`, `ru`, `sk`, `sl`, `sv`, `sw`, `ta`, `th`, `tl`, `tr`, `ug`, `uk`, `ur`, `vi`,
         * `yue`, plus the spelling and script variants `en-US`, `en-GB`, `en-AU`, `cmn-Hans`, and
         * `cmn-Hant` (`en` alone uses the default spelling). A value outside the selected model's
         * list is rejected. For `speechmatics/standard`, unset, blank, `auto`, `auto_beta`, or
         * `multi` defaults to `en`; for `speechmatics/linden-1`, only an unset language defaults to
         * `en`, and `auto`, `auto_beta`, or `multi` is rejected.
         */
        fun language(language: Language) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [Language] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun language(language: JsonField<Language>) = apply { this.language = language }

        /** Engine identifier for Speechmatics transcription service */
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

        /**
         * The model to use for transcription. `speechmatics/linden-1` is a preview, vendor-hosted
         * model with its own language support (see `language`).
         */
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
         * Returns an immutable instance of [TranscriptionEngineSpeechmaticsConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionEngineSpeechmaticsConfig =
            TranscriptionEngineSpeechmaticsConfig(
                interimResults,
                language,
                transcriptionEngine,
                transcriptionModel,
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
    fun validate(): TranscriptionEngineSpeechmaticsConfig = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (interimResults.asKnown().isPresent) 1 else 0) +
            (language.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * Language to use for speech recognition. Accepted values depend on the selected
     * `transcription_model`. `speechmatics/standard` supports: `en`, `ba`, `eu`, `gl`, `ga`, `mt`,
     * `mn`, `sw`, `ug`, `cy`, `ar_en`, `cmn_en`, `en_ms`, `en_ta`, `tl`, `es-bilingual-en`,
     * `cmn_en_ms_ta`. `speechmatics/linden-1` (preview) supports the same languages as Speechmatics
     * Realtime: `ar`, `ar_en`, `ba`, `be`, `bg`, `bn`, `ca`, `cmn`, `cmn_en`, `cmn_en_ms_ta`, `cs`,
     * `cy`, `da`, `de`, `el`, `en`, `en_ms`, `en_ta`, `eo`, `es`, `es-bilingual-en`, `et`, `eu`,
     * `fa`, `fi`, `fr`, `ga`, `gl`, `he`, `hi`, `hr`, `hu`, `ia`, `id`, `it`, `ja`, `ko`, `lt`,
     * `lv`, `mn`, `mr`, `ms`, `mt`, `nl`, `no`, `pl`, `pt`, `ro`, `ru`, `sk`, `sl`, `sv`, `sw`,
     * `ta`, `th`, `tl`, `tr`, `ug`, `uk`, `ur`, `vi`, `yue`, plus the spelling and script variants
     * `en-US`, `en-GB`, `en-AU`, `cmn-Hans`, and `cmn-Hant` (`en` alone uses the default spelling).
     * A value outside the selected model's list is rejected. For `speechmatics/standard`, unset,
     * blank, `auto`, `auto_beta`, or `multi` defaults to `en`; for `speechmatics/linden-1`, only an
     * unset language defaults to `en`, and `auto`, `auto_beta`, or `multi` is rejected.
     */
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

            @JvmField val EN = of("en")

            @JvmField val BA = of("ba")

            @JvmField val EU = of("eu")

            @JvmField val GL = of("gl")

            @JvmField val GA = of("ga")

            @JvmField val MT = of("mt")

            @JvmField val MN = of("mn")

            @JvmField val SW = of("sw")

            @JvmField val UG = of("ug")

            @JvmField val CY = of("cy")

            @JvmField val AR_EN = of("ar_en")

            @JvmField val CMN_EN = of("cmn_en")

            @JvmField val EN_MS = of("en_ms")

            @JvmField val EN_TA = of("en_ta")

            @JvmField val TL = of("tl")

            @JvmField val ES_BILINGUAL_EN = of("es-bilingual-en")

            @JvmField val CMN_EN_MS_TA = of("cmn_en_ms_ta")

            @JvmField val AR = of("ar")

            @JvmField val BE = of("be")

            @JvmField val BG = of("bg")

            @JvmField val BN = of("bn")

            @JvmField val CA = of("ca")

            @JvmField val CMN = of("cmn")

            @JvmField val CS = of("cs")

            @JvmField val DA = of("da")

            @JvmField val DE = of("de")

            @JvmField val EL = of("el")

            @JvmField val EO = of("eo")

            @JvmField val ES = of("es")

            @JvmField val ET = of("et")

            @JvmField val FA = of("fa")

            @JvmField val FI = of("fi")

            @JvmField val FR = of("fr")

            @JvmField val HE = of("he")

            @JvmField val HI = of("hi")

            @JvmField val HR = of("hr")

            @JvmField val HU = of("hu")

            @JvmField val IA = of("ia")

            @JvmField val ID = of("id")

            @JvmField val IT = of("it")

            @JvmField val JA = of("ja")

            @JvmField val KO = of("ko")

            @JvmField val LT = of("lt")

            @JvmField val LV = of("lv")

            @JvmField val MR = of("mr")

            @JvmField val MS = of("ms")

            @JvmField val NL = of("nl")

            @JvmField val NO = of("no")

            @JvmField val PL = of("pl")

            @JvmField val PT = of("pt")

            @JvmField val RO = of("ro")

            @JvmField val RU = of("ru")

            @JvmField val SK = of("sk")

            @JvmField val SL = of("sl")

            @JvmField val SV = of("sv")

            @JvmField val TA = of("ta")

            @JvmField val TH = of("th")

            @JvmField val TR = of("tr")

            @JvmField val UK = of("uk")

            @JvmField val UR = of("ur")

            @JvmField val VI = of("vi")

            @JvmField val YUE = of("yue")

            @JvmField val EN_US = of("en-US")

            @JvmField val EN_GB = of("en-GB")

            @JvmField val EN_AU = of("en-AU")

            @JvmField val CMN_HANS = of("cmn-Hans")

            @JvmField val CMN_HANT = of("cmn-Hant")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            EN,
            BA,
            EU,
            GL,
            GA,
            MT,
            MN,
            SW,
            UG,
            CY,
            AR_EN,
            CMN_EN,
            EN_MS,
            EN_TA,
            TL,
            ES_BILINGUAL_EN,
            CMN_EN_MS_TA,
            AR,
            BE,
            BG,
            BN,
            CA,
            CMN,
            CS,
            DA,
            DE,
            EL,
            EO,
            ES,
            ET,
            FA,
            FI,
            FR,
            HE,
            HI,
            HR,
            HU,
            IA,
            ID,
            IT,
            JA,
            KO,
            LT,
            LV,
            MR,
            MS,
            NL,
            NO,
            PL,
            PT,
            RO,
            RU,
            SK,
            SL,
            SV,
            TA,
            TH,
            TR,
            UK,
            UR,
            VI,
            YUE,
            EN_US,
            EN_GB,
            EN_AU,
            CMN_HANS,
            CMN_HANT,
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
            EN,
            BA,
            EU,
            GL,
            GA,
            MT,
            MN,
            SW,
            UG,
            CY,
            AR_EN,
            CMN_EN,
            EN_MS,
            EN_TA,
            TL,
            ES_BILINGUAL_EN,
            CMN_EN_MS_TA,
            AR,
            BE,
            BG,
            BN,
            CA,
            CMN,
            CS,
            DA,
            DE,
            EL,
            EO,
            ES,
            ET,
            FA,
            FI,
            FR,
            HE,
            HI,
            HR,
            HU,
            IA,
            ID,
            IT,
            JA,
            KO,
            LT,
            LV,
            MR,
            MS,
            NL,
            NO,
            PL,
            PT,
            RO,
            RU,
            SK,
            SL,
            SV,
            TA,
            TH,
            TR,
            UK,
            UR,
            VI,
            YUE,
            EN_US,
            EN_GB,
            EN_AU,
            CMN_HANS,
            CMN_HANT,
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
                EN -> Value.EN
                BA -> Value.BA
                EU -> Value.EU
                GL -> Value.GL
                GA -> Value.GA
                MT -> Value.MT
                MN -> Value.MN
                SW -> Value.SW
                UG -> Value.UG
                CY -> Value.CY
                AR_EN -> Value.AR_EN
                CMN_EN -> Value.CMN_EN
                EN_MS -> Value.EN_MS
                EN_TA -> Value.EN_TA
                TL -> Value.TL
                ES_BILINGUAL_EN -> Value.ES_BILINGUAL_EN
                CMN_EN_MS_TA -> Value.CMN_EN_MS_TA
                AR -> Value.AR
                BE -> Value.BE
                BG -> Value.BG
                BN -> Value.BN
                CA -> Value.CA
                CMN -> Value.CMN
                CS -> Value.CS
                DA -> Value.DA
                DE -> Value.DE
                EL -> Value.EL
                EO -> Value.EO
                ES -> Value.ES
                ET -> Value.ET
                FA -> Value.FA
                FI -> Value.FI
                FR -> Value.FR
                HE -> Value.HE
                HI -> Value.HI
                HR -> Value.HR
                HU -> Value.HU
                IA -> Value.IA
                ID -> Value.ID
                IT -> Value.IT
                JA -> Value.JA
                KO -> Value.KO
                LT -> Value.LT
                LV -> Value.LV
                MR -> Value.MR
                MS -> Value.MS
                NL -> Value.NL
                NO -> Value.NO
                PL -> Value.PL
                PT -> Value.PT
                RO -> Value.RO
                RU -> Value.RU
                SK -> Value.SK
                SL -> Value.SL
                SV -> Value.SV
                TA -> Value.TA
                TH -> Value.TH
                TR -> Value.TR
                UK -> Value.UK
                UR -> Value.UR
                VI -> Value.VI
                YUE -> Value.YUE
                EN_US -> Value.EN_US
                EN_GB -> Value.EN_GB
                EN_AU -> Value.EN_AU
                CMN_HANS -> Value.CMN_HANS
                CMN_HANT -> Value.CMN_HANT
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
                EN -> Known.EN
                BA -> Known.BA
                EU -> Known.EU
                GL -> Known.GL
                GA -> Known.GA
                MT -> Known.MT
                MN -> Known.MN
                SW -> Known.SW
                UG -> Known.UG
                CY -> Known.CY
                AR_EN -> Known.AR_EN
                CMN_EN -> Known.CMN_EN
                EN_MS -> Known.EN_MS
                EN_TA -> Known.EN_TA
                TL -> Known.TL
                ES_BILINGUAL_EN -> Known.ES_BILINGUAL_EN
                CMN_EN_MS_TA -> Known.CMN_EN_MS_TA
                AR -> Known.AR
                BE -> Known.BE
                BG -> Known.BG
                BN -> Known.BN
                CA -> Known.CA
                CMN -> Known.CMN
                CS -> Known.CS
                DA -> Known.DA
                DE -> Known.DE
                EL -> Known.EL
                EO -> Known.EO
                ES -> Known.ES
                ET -> Known.ET
                FA -> Known.FA
                FI -> Known.FI
                FR -> Known.FR
                HE -> Known.HE
                HI -> Known.HI
                HR -> Known.HR
                HU -> Known.HU
                IA -> Known.IA
                ID -> Known.ID
                IT -> Known.IT
                JA -> Known.JA
                KO -> Known.KO
                LT -> Known.LT
                LV -> Known.LV
                MR -> Known.MR
                MS -> Known.MS
                NL -> Known.NL
                NO -> Known.NO
                PL -> Known.PL
                PT -> Known.PT
                RO -> Known.RO
                RU -> Known.RU
                SK -> Known.SK
                SL -> Known.SL
                SV -> Known.SV
                TA -> Known.TA
                TH -> Known.TH
                TR -> Known.TR
                UK -> Known.UK
                UR -> Known.UR
                VI -> Known.VI
                YUE -> Known.YUE
                EN_US -> Known.EN_US
                EN_GB -> Known.EN_GB
                EN_AU -> Known.EN_AU
                CMN_HANS -> Known.CMN_HANS
                CMN_HANT -> Known.CMN_HANT
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

    /** Engine identifier for Speechmatics transcription service */
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

            @JvmField val SPEECHMATICS = of("Speechmatics")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            SPEECHMATICS
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
            SPEECHMATICS,
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
                SPEECHMATICS -> Value.SPEECHMATICS
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
                SPEECHMATICS -> Known.SPEECHMATICS
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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
     * The model to use for transcription. `speechmatics/linden-1` is a preview, vendor-hosted model
     * with its own language support (see `language`).
     */
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

            @JvmField val SPEECHMATICS_STANDARD = of("speechmatics/standard")

            @JvmField val SPEECHMATICS_LINDEN_1 = of("speechmatics/linden-1")

            @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
        }

        /** An enum containing [TranscriptionModel]'s known values. */
        enum class Known {
            SPEECHMATICS_STANDARD,
            SPEECHMATICS_LINDEN_1,
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
            SPEECHMATICS_STANDARD,
            SPEECHMATICS_LINDEN_1,
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
                SPEECHMATICS_STANDARD -> Value.SPEECHMATICS_STANDARD
                SPEECHMATICS_LINDEN_1 -> Value.SPEECHMATICS_LINDEN_1
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
                SPEECHMATICS_STANDARD -> Known.SPEECHMATICS_STANDARD
                SPEECHMATICS_LINDEN_1 -> Known.SPEECHMATICS_LINDEN_1
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionEngineSpeechmaticsConfig &&
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
        "TranscriptionEngineSpeechmaticsConfig{interimResults=$interimResults, language=$language, transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, additionalProperties=$additionalProperties}"
}
