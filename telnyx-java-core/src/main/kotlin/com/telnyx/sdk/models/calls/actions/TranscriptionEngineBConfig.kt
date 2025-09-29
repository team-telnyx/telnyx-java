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

class TranscriptionEngineBConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val language: JsonField<Language>,
    private val transcriptionEngine: JsonField<TranscriptionEngine>,
    private val transcriptionModel: JsonField<TranscriptionModel>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("language") @ExcludeMissing language: JsonField<Language> = JsonMissing.of(),
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
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<Language> = language.getOptional("language")

    /**
     * Engine identifier for Telnyx transcription service
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionEngine(): Optional<TranscriptionEngine> =
        transcriptionEngine.getOptional("transcription_engine")

    /**
     * The model to use for transcription.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transcriptionModel(): Optional<TranscriptionModel> =
        transcriptionModel.getOptional("transcription_model")

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
         * Returns a mutable builder for constructing an instance of [TranscriptionEngineBConfig].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionEngineBConfig]. */
    class Builder internal constructor() {

        private var language: JsonField<Language> = JsonMissing.of()
        private var transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of()
        private var transcriptionModel: JsonField<TranscriptionModel> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionEngineBConfig: TranscriptionEngineBConfig) = apply {
            language = transcriptionEngineBConfig.language
            transcriptionEngine = transcriptionEngineBConfig.transcriptionEngine
            transcriptionModel = transcriptionEngineBConfig.transcriptionModel
            additionalProperties = transcriptionEngineBConfig.additionalProperties.toMutableMap()
        }

        /** Language to use for speech recognition */
        fun language(language: Language) = language(JsonField.of(language))

        /**
         * Sets [Builder.language] to an arbitrary JSON value.
         *
         * You should usually call [Builder.language] with a well-typed [Language] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun language(language: JsonField<Language>) = apply { this.language = language }

        /** Engine identifier for Telnyx transcription service */
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

        /** The model to use for transcription. */
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
         * Returns an immutable instance of [TranscriptionEngineBConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TranscriptionEngineBConfig =
            TranscriptionEngineBConfig(
                language,
                transcriptionEngine,
                transcriptionModel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptionEngineBConfig = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (language.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptionModel.asKnown().getOrNull()?.validity() ?: 0)

    /** Language to use for speech recognition */
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

            @JvmField val ZH = of("zh")

            @JvmField val DE = of("de")

            @JvmField val ES = of("es")

            @JvmField val RU = of("ru")

            @JvmField val KO = of("ko")

            @JvmField val FR = of("fr")

            @JvmField val JA = of("ja")

            @JvmField val PT = of("pt")

            @JvmField val TR = of("tr")

            @JvmField val PL = of("pl")

            @JvmField val CA = of("ca")

            @JvmField val NL = of("nl")

            @JvmField val AR = of("ar")

            @JvmField val SV = of("sv")

            @JvmField val IT = of("it")

            @JvmField val ID = of("id")

            @JvmField val HI = of("hi")

            @JvmField val FI = of("fi")

            @JvmField val VI = of("vi")

            @JvmField val HE = of("he")

            @JvmField val UK = of("uk")

            @JvmField val EL = of("el")

            @JvmField val MS = of("ms")

            @JvmField val CS = of("cs")

            @JvmField val RO = of("ro")

            @JvmField val DA = of("da")

            @JvmField val HU = of("hu")

            @JvmField val TA = of("ta")

            @JvmField val NO = of("no")

            @JvmField val TH = of("th")

            @JvmField val UR = of("ur")

            @JvmField val HR = of("hr")

            @JvmField val BG = of("bg")

            @JvmField val LT = of("lt")

            @JvmField val LA = of("la")

            @JvmField val MI = of("mi")

            @JvmField val ML = of("ml")

            @JvmField val CY = of("cy")

            @JvmField val SK = of("sk")

            @JvmField val TE = of("te")

            @JvmField val FA = of("fa")

            @JvmField val LV = of("lv")

            @JvmField val BN = of("bn")

            @JvmField val SR = of("sr")

            @JvmField val AZ = of("az")

            @JvmField val SL = of("sl")

            @JvmField val KN = of("kn")

            @JvmField val ET = of("et")

            @JvmField val MK = of("mk")

            @JvmField val BR = of("br")

            @JvmField val EU = of("eu")

            @JvmField val IS = of("is")

            @JvmField val HY = of("hy")

            @JvmField val NE = of("ne")

            @JvmField val MN = of("mn")

            @JvmField val BS = of("bs")

            @JvmField val KK = of("kk")

            @JvmField val SQ = of("sq")

            @JvmField val SW = of("sw")

            @JvmField val GL = of("gl")

            @JvmField val MR = of("mr")

            @JvmField val PA = of("pa")

            @JvmField val SI = of("si")

            @JvmField val KM = of("km")

            @JvmField val SN = of("sn")

            @JvmField val YO = of("yo")

            @JvmField val SO = of("so")

            @JvmField val AF = of("af")

            @JvmField val OC = of("oc")

            @JvmField val KA = of("ka")

            @JvmField val BE = of("be")

            @JvmField val TG = of("tg")

            @JvmField val SD = of("sd")

            @JvmField val GU = of("gu")

            @JvmField val AM = of("am")

            @JvmField val YI = of("yi")

            @JvmField val LO = of("lo")

            @JvmField val UZ = of("uz")

            @JvmField val FO = of("fo")

            @JvmField val HT = of("ht")

            @JvmField val PS = of("ps")

            @JvmField val TK = of("tk")

            @JvmField val NN = of("nn")

            @JvmField val MT = of("mt")

            @JvmField val SA = of("sa")

            @JvmField val LB = of("lb")

            @JvmField val MY = of("my")

            @JvmField val BO = of("bo")

            @JvmField val TL = of("tl")

            @JvmField val MG = of("mg")

            @JvmField val AS = of("as")

            @JvmField val TT = of("tt")

            @JvmField val HAW = of("haw")

            @JvmField val LN = of("ln")

            @JvmField val HA = of("ha")

            @JvmField val BA = of("ba")

            @JvmField val JW = of("jw")

            @JvmField val SU = of("su")

            @JvmField val AUTO_DETECT = of("auto_detect")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            EN,
            ZH,
            DE,
            ES,
            RU,
            KO,
            FR,
            JA,
            PT,
            TR,
            PL,
            CA,
            NL,
            AR,
            SV,
            IT,
            ID,
            HI,
            FI,
            VI,
            HE,
            UK,
            EL,
            MS,
            CS,
            RO,
            DA,
            HU,
            TA,
            NO,
            TH,
            UR,
            HR,
            BG,
            LT,
            LA,
            MI,
            ML,
            CY,
            SK,
            TE,
            FA,
            LV,
            BN,
            SR,
            AZ,
            SL,
            KN,
            ET,
            MK,
            BR,
            EU,
            IS,
            HY,
            NE,
            MN,
            BS,
            KK,
            SQ,
            SW,
            GL,
            MR,
            PA,
            SI,
            KM,
            SN,
            YO,
            SO,
            AF,
            OC,
            KA,
            BE,
            TG,
            SD,
            GU,
            AM,
            YI,
            LO,
            UZ,
            FO,
            HT,
            PS,
            TK,
            NN,
            MT,
            SA,
            LB,
            MY,
            BO,
            TL,
            MG,
            AS,
            TT,
            HAW,
            LN,
            HA,
            BA,
            JW,
            SU,
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
            EN,
            ZH,
            DE,
            ES,
            RU,
            KO,
            FR,
            JA,
            PT,
            TR,
            PL,
            CA,
            NL,
            AR,
            SV,
            IT,
            ID,
            HI,
            FI,
            VI,
            HE,
            UK,
            EL,
            MS,
            CS,
            RO,
            DA,
            HU,
            TA,
            NO,
            TH,
            UR,
            HR,
            BG,
            LT,
            LA,
            MI,
            ML,
            CY,
            SK,
            TE,
            FA,
            LV,
            BN,
            SR,
            AZ,
            SL,
            KN,
            ET,
            MK,
            BR,
            EU,
            IS,
            HY,
            NE,
            MN,
            BS,
            KK,
            SQ,
            SW,
            GL,
            MR,
            PA,
            SI,
            KM,
            SN,
            YO,
            SO,
            AF,
            OC,
            KA,
            BE,
            TG,
            SD,
            GU,
            AM,
            YI,
            LO,
            UZ,
            FO,
            HT,
            PS,
            TK,
            NN,
            MT,
            SA,
            LB,
            MY,
            BO,
            TL,
            MG,
            AS,
            TT,
            HAW,
            LN,
            HA,
            BA,
            JW,
            SU,
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
                EN -> Value.EN
                ZH -> Value.ZH
                DE -> Value.DE
                ES -> Value.ES
                RU -> Value.RU
                KO -> Value.KO
                FR -> Value.FR
                JA -> Value.JA
                PT -> Value.PT
                TR -> Value.TR
                PL -> Value.PL
                CA -> Value.CA
                NL -> Value.NL
                AR -> Value.AR
                SV -> Value.SV
                IT -> Value.IT
                ID -> Value.ID
                HI -> Value.HI
                FI -> Value.FI
                VI -> Value.VI
                HE -> Value.HE
                UK -> Value.UK
                EL -> Value.EL
                MS -> Value.MS
                CS -> Value.CS
                RO -> Value.RO
                DA -> Value.DA
                HU -> Value.HU
                TA -> Value.TA
                NO -> Value.NO
                TH -> Value.TH
                UR -> Value.UR
                HR -> Value.HR
                BG -> Value.BG
                LT -> Value.LT
                LA -> Value.LA
                MI -> Value.MI
                ML -> Value.ML
                CY -> Value.CY
                SK -> Value.SK
                TE -> Value.TE
                FA -> Value.FA
                LV -> Value.LV
                BN -> Value.BN
                SR -> Value.SR
                AZ -> Value.AZ
                SL -> Value.SL
                KN -> Value.KN
                ET -> Value.ET
                MK -> Value.MK
                BR -> Value.BR
                EU -> Value.EU
                IS -> Value.IS
                HY -> Value.HY
                NE -> Value.NE
                MN -> Value.MN
                BS -> Value.BS
                KK -> Value.KK
                SQ -> Value.SQ
                SW -> Value.SW
                GL -> Value.GL
                MR -> Value.MR
                PA -> Value.PA
                SI -> Value.SI
                KM -> Value.KM
                SN -> Value.SN
                YO -> Value.YO
                SO -> Value.SO
                AF -> Value.AF
                OC -> Value.OC
                KA -> Value.KA
                BE -> Value.BE
                TG -> Value.TG
                SD -> Value.SD
                GU -> Value.GU
                AM -> Value.AM
                YI -> Value.YI
                LO -> Value.LO
                UZ -> Value.UZ
                FO -> Value.FO
                HT -> Value.HT
                PS -> Value.PS
                TK -> Value.TK
                NN -> Value.NN
                MT -> Value.MT
                SA -> Value.SA
                LB -> Value.LB
                MY -> Value.MY
                BO -> Value.BO
                TL -> Value.TL
                MG -> Value.MG
                AS -> Value.AS
                TT -> Value.TT
                HAW -> Value.HAW
                LN -> Value.LN
                HA -> Value.HA
                BA -> Value.BA
                JW -> Value.JW
                SU -> Value.SU
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
                EN -> Known.EN
                ZH -> Known.ZH
                DE -> Known.DE
                ES -> Known.ES
                RU -> Known.RU
                KO -> Known.KO
                FR -> Known.FR
                JA -> Known.JA
                PT -> Known.PT
                TR -> Known.TR
                PL -> Known.PL
                CA -> Known.CA
                NL -> Known.NL
                AR -> Known.AR
                SV -> Known.SV
                IT -> Known.IT
                ID -> Known.ID
                HI -> Known.HI
                FI -> Known.FI
                VI -> Known.VI
                HE -> Known.HE
                UK -> Known.UK
                EL -> Known.EL
                MS -> Known.MS
                CS -> Known.CS
                RO -> Known.RO
                DA -> Known.DA
                HU -> Known.HU
                TA -> Known.TA
                NO -> Known.NO
                TH -> Known.TH
                UR -> Known.UR
                HR -> Known.HR
                BG -> Known.BG
                LT -> Known.LT
                LA -> Known.LA
                MI -> Known.MI
                ML -> Known.ML
                CY -> Known.CY
                SK -> Known.SK
                TE -> Known.TE
                FA -> Known.FA
                LV -> Known.LV
                BN -> Known.BN
                SR -> Known.SR
                AZ -> Known.AZ
                SL -> Known.SL
                KN -> Known.KN
                ET -> Known.ET
                MK -> Known.MK
                BR -> Known.BR
                EU -> Known.EU
                IS -> Known.IS
                HY -> Known.HY
                NE -> Known.NE
                MN -> Known.MN
                BS -> Known.BS
                KK -> Known.KK
                SQ -> Known.SQ
                SW -> Known.SW
                GL -> Known.GL
                MR -> Known.MR
                PA -> Known.PA
                SI -> Known.SI
                KM -> Known.KM
                SN -> Known.SN
                YO -> Known.YO
                SO -> Known.SO
                AF -> Known.AF
                OC -> Known.OC
                KA -> Known.KA
                BE -> Known.BE
                TG -> Known.TG
                SD -> Known.SD
                GU -> Known.GU
                AM -> Known.AM
                YI -> Known.YI
                LO -> Known.LO
                UZ -> Known.UZ
                FO -> Known.FO
                HT -> Known.HT
                PS -> Known.PS
                TK -> Known.TK
                NN -> Known.NN
                MT -> Known.MT
                SA -> Known.SA
                LB -> Known.LB
                MY -> Known.MY
                BO -> Known.BO
                TL -> Known.TL
                MG -> Known.MG
                AS -> Known.AS
                TT -> Known.TT
                HAW -> Known.HAW
                LN -> Known.LN
                HA -> Known.HA
                BA -> Known.BA
                JW -> Known.JW
                SU -> Known.SU
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

    /** Engine identifier for Telnyx transcription service */
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

            @JvmField val B = of("B")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            B
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

    /** The model to use for transcription. */
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

            @JvmField val OPENAI_WHISPER_TINY = of("openai/whisper-tiny")

            @JvmField val OPENAI_WHISPER_LARGE_V3_TURBO = of("openai/whisper-large-v3-turbo")

            @JvmStatic fun of(value: String) = TranscriptionModel(JsonField.of(value))
        }

        /** An enum containing [TranscriptionModel]'s known values. */
        enum class Known {
            OPENAI_WHISPER_TINY,
            OPENAI_WHISPER_LARGE_V3_TURBO,
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
            OPENAI_WHISPER_TINY,
            OPENAI_WHISPER_LARGE_V3_TURBO,
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
                OPENAI_WHISPER_TINY -> Value.OPENAI_WHISPER_TINY
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
                OPENAI_WHISPER_TINY -> Known.OPENAI_WHISPER_TINY
                OPENAI_WHISPER_LARGE_V3_TURBO -> Known.OPENAI_WHISPER_LARGE_V3_TURBO
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptionEngineBConfig &&
            language == other.language &&
            transcriptionEngine == other.transcriptionEngine &&
            transcriptionModel == other.transcriptionModel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(language, transcriptionEngine, transcriptionModel, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionEngineBConfig{language=$language, transcriptionEngine=$transcriptionEngine, transcriptionModel=$transcriptionModel, additionalProperties=$additionalProperties}"
}
