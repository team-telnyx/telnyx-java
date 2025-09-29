// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.errors.TelnyxInvalidDataException

/** Language to use for speech recognition */
class GoogleTranscriptionLanguage
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val AF = of("af")

        @JvmField val SQ = of("sq")

        @JvmField val AM = of("am")

        @JvmField val AR = of("ar")

        @JvmField val HY = of("hy")

        @JvmField val AZ = of("az")

        @JvmField val EU = of("eu")

        @JvmField val BN = of("bn")

        @JvmField val BS = of("bs")

        @JvmField val BG = of("bg")

        @JvmField val MY = of("my")

        @JvmField val CA = of("ca")

        @JvmField val YUE = of("yue")

        @JvmField val ZH = of("zh")

        @JvmField val HR = of("hr")

        @JvmField val CS = of("cs")

        @JvmField val DA = of("da")

        @JvmField val NL = of("nl")

        @JvmField val EN = of("en")

        @JvmField val ET = of("et")

        @JvmField val FIL = of("fil")

        @JvmField val FI = of("fi")

        @JvmField val FR = of("fr")

        @JvmField val GL = of("gl")

        @JvmField val KA = of("ka")

        @JvmField val DE = of("de")

        @JvmField val EL = of("el")

        @JvmField val GU = of("gu")

        @JvmField val IW = of("iw")

        @JvmField val HI = of("hi")

        @JvmField val HU = of("hu")

        @JvmField val IS = of("is")

        @JvmField val ID = of("id")

        @JvmField val IT = of("it")

        @JvmField val JA = of("ja")

        @JvmField val JV = of("jv")

        @JvmField val KN = of("kn")

        @JvmField val KK = of("kk")

        @JvmField val KM = of("km")

        @JvmField val KO = of("ko")

        @JvmField val LO = of("lo")

        @JvmField val LV = of("lv")

        @JvmField val LT = of("lt")

        @JvmField val MK = of("mk")

        @JvmField val MS = of("ms")

        @JvmField val ML = of("ml")

        @JvmField val MR = of("mr")

        @JvmField val MN = of("mn")

        @JvmField val NE = of("ne")

        @JvmField val NO = of("no")

        @JvmField val FA = of("fa")

        @JvmField val PL = of("pl")

        @JvmField val PT = of("pt")

        @JvmField val PA = of("pa")

        @JvmField val RO = of("ro")

        @JvmField val RU = of("ru")

        @JvmField val RW = of("rw")

        @JvmField val SR = of("sr")

        @JvmField val SI = of("si")

        @JvmField val SK = of("sk")

        @JvmField val SL = of("sl")

        @JvmField val SS = of("ss")

        @JvmField val ST = of("st")

        @JvmField val ES = of("es")

        @JvmField val SU = of("su")

        @JvmField val SW = of("sw")

        @JvmField val SV = of("sv")

        @JvmField val TA = of("ta")

        @JvmField val TE = of("te")

        @JvmField val TH = of("th")

        @JvmField val TN = of("tn")

        @JvmField val TR = of("tr")

        @JvmField val TS = of("ts")

        @JvmField val UK = of("uk")

        @JvmField val UR = of("ur")

        @JvmField val UZ = of("uz")

        @JvmField val VE = of("ve")

        @JvmField val VI = of("vi")

        @JvmField val XH = of("xh")

        @JvmField val ZU = of("zu")

        @JvmStatic fun of(value: String) = GoogleTranscriptionLanguage(JsonField.of(value))
    }

    /** An enum containing [GoogleTranscriptionLanguage]'s known values. */
    enum class Known {
        AF,
        SQ,
        AM,
        AR,
        HY,
        AZ,
        EU,
        BN,
        BS,
        BG,
        MY,
        CA,
        YUE,
        ZH,
        HR,
        CS,
        DA,
        NL,
        EN,
        ET,
        FIL,
        FI,
        FR,
        GL,
        KA,
        DE,
        EL,
        GU,
        IW,
        HI,
        HU,
        IS,
        ID,
        IT,
        JA,
        JV,
        KN,
        KK,
        KM,
        KO,
        LO,
        LV,
        LT,
        MK,
        MS,
        ML,
        MR,
        MN,
        NE,
        NO,
        FA,
        PL,
        PT,
        PA,
        RO,
        RU,
        RW,
        SR,
        SI,
        SK,
        SL,
        SS,
        ST,
        ES,
        SU,
        SW,
        SV,
        TA,
        TE,
        TH,
        TN,
        TR,
        TS,
        UK,
        UR,
        UZ,
        VE,
        VI,
        XH,
        ZU,
    }

    /**
     * An enum containing [GoogleTranscriptionLanguage]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [GoogleTranscriptionLanguage] can contain an unknown value in a couple of
     * cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AF,
        SQ,
        AM,
        AR,
        HY,
        AZ,
        EU,
        BN,
        BS,
        BG,
        MY,
        CA,
        YUE,
        ZH,
        HR,
        CS,
        DA,
        NL,
        EN,
        ET,
        FIL,
        FI,
        FR,
        GL,
        KA,
        DE,
        EL,
        GU,
        IW,
        HI,
        HU,
        IS,
        ID,
        IT,
        JA,
        JV,
        KN,
        KK,
        KM,
        KO,
        LO,
        LV,
        LT,
        MK,
        MS,
        ML,
        MR,
        MN,
        NE,
        NO,
        FA,
        PL,
        PT,
        PA,
        RO,
        RU,
        RW,
        SR,
        SI,
        SK,
        SL,
        SS,
        ST,
        ES,
        SU,
        SW,
        SV,
        TA,
        TE,
        TH,
        TN,
        TR,
        TS,
        UK,
        UR,
        UZ,
        VE,
        VI,
        XH,
        ZU,
        /**
         * An enum member indicating that [GoogleTranscriptionLanguage] was instantiated with an
         * unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            AF -> Value.AF
            SQ -> Value.SQ
            AM -> Value.AM
            AR -> Value.AR
            HY -> Value.HY
            AZ -> Value.AZ
            EU -> Value.EU
            BN -> Value.BN
            BS -> Value.BS
            BG -> Value.BG
            MY -> Value.MY
            CA -> Value.CA
            YUE -> Value.YUE
            ZH -> Value.ZH
            HR -> Value.HR
            CS -> Value.CS
            DA -> Value.DA
            NL -> Value.NL
            EN -> Value.EN
            ET -> Value.ET
            FIL -> Value.FIL
            FI -> Value.FI
            FR -> Value.FR
            GL -> Value.GL
            KA -> Value.KA
            DE -> Value.DE
            EL -> Value.EL
            GU -> Value.GU
            IW -> Value.IW
            HI -> Value.HI
            HU -> Value.HU
            IS -> Value.IS
            ID -> Value.ID
            IT -> Value.IT
            JA -> Value.JA
            JV -> Value.JV
            KN -> Value.KN
            KK -> Value.KK
            KM -> Value.KM
            KO -> Value.KO
            LO -> Value.LO
            LV -> Value.LV
            LT -> Value.LT
            MK -> Value.MK
            MS -> Value.MS
            ML -> Value.ML
            MR -> Value.MR
            MN -> Value.MN
            NE -> Value.NE
            NO -> Value.NO
            FA -> Value.FA
            PL -> Value.PL
            PT -> Value.PT
            PA -> Value.PA
            RO -> Value.RO
            RU -> Value.RU
            RW -> Value.RW
            SR -> Value.SR
            SI -> Value.SI
            SK -> Value.SK
            SL -> Value.SL
            SS -> Value.SS
            ST -> Value.ST
            ES -> Value.ES
            SU -> Value.SU
            SW -> Value.SW
            SV -> Value.SV
            TA -> Value.TA
            TE -> Value.TE
            TH -> Value.TH
            TN -> Value.TN
            TR -> Value.TR
            TS -> Value.TS
            UK -> Value.UK
            UR -> Value.UR
            UZ -> Value.UZ
            VE -> Value.VE
            VI -> Value.VI
            XH -> Value.XH
            ZU -> Value.ZU
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws TelnyxInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            AF -> Known.AF
            SQ -> Known.SQ
            AM -> Known.AM
            AR -> Known.AR
            HY -> Known.HY
            AZ -> Known.AZ
            EU -> Known.EU
            BN -> Known.BN
            BS -> Known.BS
            BG -> Known.BG
            MY -> Known.MY
            CA -> Known.CA
            YUE -> Known.YUE
            ZH -> Known.ZH
            HR -> Known.HR
            CS -> Known.CS
            DA -> Known.DA
            NL -> Known.NL
            EN -> Known.EN
            ET -> Known.ET
            FIL -> Known.FIL
            FI -> Known.FI
            FR -> Known.FR
            GL -> Known.GL
            KA -> Known.KA
            DE -> Known.DE
            EL -> Known.EL
            GU -> Known.GU
            IW -> Known.IW
            HI -> Known.HI
            HU -> Known.HU
            IS -> Known.IS
            ID -> Known.ID
            IT -> Known.IT
            JA -> Known.JA
            JV -> Known.JV
            KN -> Known.KN
            KK -> Known.KK
            KM -> Known.KM
            KO -> Known.KO
            LO -> Known.LO
            LV -> Known.LV
            LT -> Known.LT
            MK -> Known.MK
            MS -> Known.MS
            ML -> Known.ML
            MR -> Known.MR
            MN -> Known.MN
            NE -> Known.NE
            NO -> Known.NO
            FA -> Known.FA
            PL -> Known.PL
            PT -> Known.PT
            PA -> Known.PA
            RO -> Known.RO
            RU -> Known.RU
            RW -> Known.RW
            SR -> Known.SR
            SI -> Known.SI
            SK -> Known.SK
            SL -> Known.SL
            SS -> Known.SS
            ST -> Known.ST
            ES -> Known.ES
            SU -> Known.SU
            SW -> Known.SW
            SV -> Known.SV
            TA -> Known.TA
            TE -> Known.TE
            TH -> Known.TH
            TN -> Known.TN
            TR -> Known.TR
            TS -> Known.TS
            UK -> Known.UK
            UR -> Known.UR
            UZ -> Known.UZ
            VE -> Known.VE
            VI -> Known.VI
            XH -> Known.XH
            ZU -> Known.ZU
            else -> throw TelnyxInvalidDataException("Unknown GoogleTranscriptionLanguage: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws TelnyxInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { TelnyxInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): GoogleTranscriptionLanguage = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GoogleTranscriptionLanguage && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
