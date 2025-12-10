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
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptionEngineAzureConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val region: JsonField<Region>,
    private val transcriptionEngine: JsonField<TranscriptionEngine>,
    private val apiKeyRef: JsonField<String>,
    private val language: JsonField<Language>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("region") @ExcludeMissing region: JsonField<Region> = JsonMissing.of(),
        @JsonProperty("transcription_engine")
        @ExcludeMissing
        transcriptionEngine: JsonField<TranscriptionEngine> = JsonMissing.of(),
        @JsonProperty("api_key_ref")
        @ExcludeMissing
        apiKeyRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("language") @ExcludeMissing language: JsonField<Language> = JsonMissing.of(),
    ) : this(region, transcriptionEngine, apiKeyRef, language, mutableMapOf())

    /**
     * Azure region to use for speech recognition
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun region(): Region = region.getRequired("region")

    /**
     * Engine identifier for Azure transcription service
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transcriptionEngine(): TranscriptionEngine =
        transcriptionEngine.getRequired("transcription_engine")

    /**
     * Reference to the API key for authentication. See
     * [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
     * for details. The parameter is optional as defaults are available for some regions.
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun apiKeyRef(): Optional<String> = apiKeyRef.getOptional("api_key_ref")

    /**
     * Language to use for speech recognition
     *
     * @throws TelnyxInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun language(): Optional<Language> = language.getOptional("language")

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<Region> = region

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
     * Returns the raw JSON value of [apiKeyRef].
     *
     * Unlike [apiKeyRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("api_key_ref") @ExcludeMissing fun _apiKeyRef(): JsonField<String> = apiKeyRef

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
         * Returns a mutable builder for constructing an instance of
         * [TranscriptionEngineAzureConfig].
         *
         * The following fields are required:
         * ```java
         * .region()
         * .transcriptionEngine()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptionEngineAzureConfig]. */
    class Builder internal constructor() {

        private var region: JsonField<Region>? = null
        private var transcriptionEngine: JsonField<TranscriptionEngine>? = null
        private var apiKeyRef: JsonField<String> = JsonMissing.of()
        private var language: JsonField<Language> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptionEngineAzureConfig: TranscriptionEngineAzureConfig) = apply {
            region = transcriptionEngineAzureConfig.region
            transcriptionEngine = transcriptionEngineAzureConfig.transcriptionEngine
            apiKeyRef = transcriptionEngineAzureConfig.apiKeyRef
            language = transcriptionEngineAzureConfig.language
            additionalProperties =
                transcriptionEngineAzureConfig.additionalProperties.toMutableMap()
        }

        /** Azure region to use for speech recognition */
        fun region(region: Region) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [Region] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun region(region: JsonField<Region>) = apply { this.region = region }

        /** Engine identifier for Azure transcription service */
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
         * Reference to the API key for authentication. See
         * [integration secrets documentation](https://developers.telnyx.com/api/secrets-manager/integration-secrets/create-integration-secret)
         * for details. The parameter is optional as defaults are available for some regions.
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
         * Returns an immutable instance of [TranscriptionEngineAzureConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .region()
         * .transcriptionEngine()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptionEngineAzureConfig =
            TranscriptionEngineAzureConfig(
                checkRequired("region", region),
                checkRequired("transcriptionEngine", transcriptionEngine),
                apiKeyRef,
                language,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptionEngineAzureConfig = apply {
        if (validated) {
            return@apply
        }

        region().validate()
        transcriptionEngine().validate()
        apiKeyRef()
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
        (region.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptionEngine.asKnown().getOrNull()?.validity() ?: 0) +
            (if (apiKeyRef.asKnown().isPresent) 1 else 0) +
            (language.asKnown().getOrNull()?.validity() ?: 0)

    /** Azure region to use for speech recognition */
    class Region @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AUSTRALIAEAST = of("australiaeast")

            @JvmField val CENTRALINDIA = of("centralindia")

            @JvmField val EASTUS = of("eastus")

            @JvmField val NORTHCENTRALUS = of("northcentralus")

            @JvmField val WESTEUROPE = of("westeurope")

            @JvmField val WESTUS2 = of("westus2")

            @JvmStatic fun of(value: String) = Region(JsonField.of(value))
        }

        /** An enum containing [Region]'s known values. */
        enum class Known {
            AUSTRALIAEAST,
            CENTRALINDIA,
            EASTUS,
            NORTHCENTRALUS,
            WESTEUROPE,
            WESTUS2,
        }

        /**
         * An enum containing [Region]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Region] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AUSTRALIAEAST,
            CENTRALINDIA,
            EASTUS,
            NORTHCENTRALUS,
            WESTEUROPE,
            WESTUS2,
            /** An enum member indicating that [Region] was instantiated with an unknown value. */
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
                AUSTRALIAEAST -> Value.AUSTRALIAEAST
                CENTRALINDIA -> Value.CENTRALINDIA
                EASTUS -> Value.EASTUS
                NORTHCENTRALUS -> Value.NORTHCENTRALUS
                WESTEUROPE -> Value.WESTEUROPE
                WESTUS2 -> Value.WESTUS2
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
                AUSTRALIAEAST -> Known.AUSTRALIAEAST
                CENTRALINDIA -> Known.CENTRALINDIA
                EASTUS -> Known.EASTUS
                NORTHCENTRALUS -> Known.NORTHCENTRALUS
                WESTEUROPE -> Known.WESTEUROPE
                WESTUS2 -> Known.WESTUS2
                else -> throw TelnyxInvalidDataException("Unknown Region: $value")
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

        fun validate(): Region = apply {
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

            return other is Region && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Engine identifier for Azure transcription service */
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

            @JvmField val AZURE = of("Azure")

            @JvmStatic fun of(value: String) = TranscriptionEngine(JsonField.of(value))
        }

        /** An enum containing [TranscriptionEngine]'s known values. */
        enum class Known {
            AZURE
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
            AZURE,
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
                AZURE -> Value.AZURE
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
                AZURE -> Known.AZURE
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

            @JvmField val AF = of("af")

            @JvmField val AM = of("am")

            @JvmField val AR = of("ar")

            @JvmField val BG = of("bg")

            @JvmField val BN = of("bn")

            @JvmField val BS = of("bs")

            @JvmField val CA = of("ca")

            @JvmField val CS = of("cs")

            @JvmField val CY = of("cy")

            @JvmField val DA = of("da")

            @JvmField val DE = of("de")

            @JvmField val EL = of("el")

            @JvmField val EN = of("en")

            @JvmField val ES = of("es")

            @JvmField val ET = of("et")

            @JvmField val EU = of("eu")

            @JvmField val FA = of("fa")

            @JvmField val FI = of("fi")

            @JvmField val FR = of("fr")

            @JvmField val GA = of("ga")

            @JvmField val GL = of("gl")

            @JvmField val GU = of("gu")

            @JvmField val HE = of("he")

            @JvmField val HI = of("hi")

            @JvmField val HR = of("hr")

            @JvmField val HU = of("hu")

            @JvmField val HY = of("hy")

            @JvmField val ID = of("id")

            @JvmField val IS = of("is")

            @JvmField val IT = of("it")

            @JvmField val JA = of("ja")

            @JvmField val KA = of("ka")

            @JvmField val KK = of("kk")

            @JvmField val KM = of("km")

            @JvmField val KN = of("kn")

            @JvmField val KO = of("ko")

            @JvmField val LO = of("lo")

            @JvmField val LT = of("lt")

            @JvmField val LV = of("lv")

            @JvmField val MK = of("mk")

            @JvmField val ML = of("ml")

            @JvmField val MN = of("mn")

            @JvmField val MR = of("mr")

            @JvmField val MS = of("ms")

            @JvmField val MT = of("mt")

            @JvmField val MY = of("my")

            @JvmField val NB = of("nb")

            @JvmField val NE = of("ne")

            @JvmField val NL = of("nl")

            @JvmField val PL = of("pl")

            @JvmField val PS = of("ps")

            @JvmField val PT = of("pt")

            @JvmField val RO = of("ro")

            @JvmField val RU = of("ru")

            @JvmField val SI = of("si")

            @JvmField val SK = of("sk")

            @JvmField val SL = of("sl")

            @JvmField val SO = of("so")

            @JvmField val SQ = of("sq")

            @JvmField val SR = of("sr")

            @JvmField val SV = of("sv")

            @JvmField val SW = of("sw")

            @JvmField val TA = of("ta")

            @JvmField val TE = of("te")

            @JvmField val TH = of("th")

            @JvmField val TR = of("tr")

            @JvmField val UK = of("uk")

            @JvmField val UR = of("ur")

            @JvmField val UZ = of("uz")

            @JvmField val VI = of("vi")

            @JvmField val WUU = of("wuu")

            @JvmField val YUE = of("yue")

            @JvmField val ZH = of("zh")

            @JvmField val ZU = of("zu")

            @JvmField val AUTO = of("auto")

            @JvmStatic fun of(value: String) = Language(JsonField.of(value))
        }

        /** An enum containing [Language]'s known values. */
        enum class Known {
            AF,
            AM,
            AR,
            BG,
            BN,
            BS,
            CA,
            CS,
            CY,
            DA,
            DE,
            EL,
            EN,
            ES,
            ET,
            EU,
            FA,
            FI,
            FR,
            GA,
            GL,
            GU,
            HE,
            HI,
            HR,
            HU,
            HY,
            ID,
            IS,
            IT,
            JA,
            KA,
            KK,
            KM,
            KN,
            KO,
            LO,
            LT,
            LV,
            MK,
            ML,
            MN,
            MR,
            MS,
            MT,
            MY,
            NB,
            NE,
            NL,
            PL,
            PS,
            PT,
            RO,
            RU,
            SI,
            SK,
            SL,
            SO,
            SQ,
            SR,
            SV,
            SW,
            TA,
            TE,
            TH,
            TR,
            UK,
            UR,
            UZ,
            VI,
            WUU,
            YUE,
            ZH,
            ZU,
            AUTO,
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
            AF,
            AM,
            AR,
            BG,
            BN,
            BS,
            CA,
            CS,
            CY,
            DA,
            DE,
            EL,
            EN,
            ES,
            ET,
            EU,
            FA,
            FI,
            FR,
            GA,
            GL,
            GU,
            HE,
            HI,
            HR,
            HU,
            HY,
            ID,
            IS,
            IT,
            JA,
            KA,
            KK,
            KM,
            KN,
            KO,
            LO,
            LT,
            LV,
            MK,
            ML,
            MN,
            MR,
            MS,
            MT,
            MY,
            NB,
            NE,
            NL,
            PL,
            PS,
            PT,
            RO,
            RU,
            SI,
            SK,
            SL,
            SO,
            SQ,
            SR,
            SV,
            SW,
            TA,
            TE,
            TH,
            TR,
            UK,
            UR,
            UZ,
            VI,
            WUU,
            YUE,
            ZH,
            ZU,
            AUTO,
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
                AF -> Value.AF
                AM -> Value.AM
                AR -> Value.AR
                BG -> Value.BG
                BN -> Value.BN
                BS -> Value.BS
                CA -> Value.CA
                CS -> Value.CS
                CY -> Value.CY
                DA -> Value.DA
                DE -> Value.DE
                EL -> Value.EL
                EN -> Value.EN
                ES -> Value.ES
                ET -> Value.ET
                EU -> Value.EU
                FA -> Value.FA
                FI -> Value.FI
                FR -> Value.FR
                GA -> Value.GA
                GL -> Value.GL
                GU -> Value.GU
                HE -> Value.HE
                HI -> Value.HI
                HR -> Value.HR
                HU -> Value.HU
                HY -> Value.HY
                ID -> Value.ID
                IS -> Value.IS
                IT -> Value.IT
                JA -> Value.JA
                KA -> Value.KA
                KK -> Value.KK
                KM -> Value.KM
                KN -> Value.KN
                KO -> Value.KO
                LO -> Value.LO
                LT -> Value.LT
                LV -> Value.LV
                MK -> Value.MK
                ML -> Value.ML
                MN -> Value.MN
                MR -> Value.MR
                MS -> Value.MS
                MT -> Value.MT
                MY -> Value.MY
                NB -> Value.NB
                NE -> Value.NE
                NL -> Value.NL
                PL -> Value.PL
                PS -> Value.PS
                PT -> Value.PT
                RO -> Value.RO
                RU -> Value.RU
                SI -> Value.SI
                SK -> Value.SK
                SL -> Value.SL
                SO -> Value.SO
                SQ -> Value.SQ
                SR -> Value.SR
                SV -> Value.SV
                SW -> Value.SW
                TA -> Value.TA
                TE -> Value.TE
                TH -> Value.TH
                TR -> Value.TR
                UK -> Value.UK
                UR -> Value.UR
                UZ -> Value.UZ
                VI -> Value.VI
                WUU -> Value.WUU
                YUE -> Value.YUE
                ZH -> Value.ZH
                ZU -> Value.ZU
                AUTO -> Value.AUTO
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
                AF -> Known.AF
                AM -> Known.AM
                AR -> Known.AR
                BG -> Known.BG
                BN -> Known.BN
                BS -> Known.BS
                CA -> Known.CA
                CS -> Known.CS
                CY -> Known.CY
                DA -> Known.DA
                DE -> Known.DE
                EL -> Known.EL
                EN -> Known.EN
                ES -> Known.ES
                ET -> Known.ET
                EU -> Known.EU
                FA -> Known.FA
                FI -> Known.FI
                FR -> Known.FR
                GA -> Known.GA
                GL -> Known.GL
                GU -> Known.GU
                HE -> Known.HE
                HI -> Known.HI
                HR -> Known.HR
                HU -> Known.HU
                HY -> Known.HY
                ID -> Known.ID
                IS -> Known.IS
                IT -> Known.IT
                JA -> Known.JA
                KA -> Known.KA
                KK -> Known.KK
                KM -> Known.KM
                KN -> Known.KN
                KO -> Known.KO
                LO -> Known.LO
                LT -> Known.LT
                LV -> Known.LV
                MK -> Known.MK
                ML -> Known.ML
                MN -> Known.MN
                MR -> Known.MR
                MS -> Known.MS
                MT -> Known.MT
                MY -> Known.MY
                NB -> Known.NB
                NE -> Known.NE
                NL -> Known.NL
                PL -> Known.PL
                PS -> Known.PS
                PT -> Known.PT
                RO -> Known.RO
                RU -> Known.RU
                SI -> Known.SI
                SK -> Known.SK
                SL -> Known.SL
                SO -> Known.SO
                SQ -> Known.SQ
                SR -> Known.SR
                SV -> Known.SV
                SW -> Known.SW
                TA -> Known.TA
                TE -> Known.TE
                TH -> Known.TH
                TR -> Known.TR
                UK -> Known.UK
                UR -> Known.UR
                UZ -> Known.UZ
                VI -> Known.VI
                WUU -> Known.WUU
                YUE -> Known.YUE
                ZH -> Known.ZH
                ZU -> Known.ZU
                AUTO -> Known.AUTO
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

        return other is TranscriptionEngineAzureConfig &&
            region == other.region &&
            transcriptionEngine == other.transcriptionEngine &&
            apiKeyRef == other.apiKeyRef &&
            language == other.language &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(region, transcriptionEngine, apiKeyRef, language, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptionEngineAzureConfig{region=$region, transcriptionEngine=$transcriptionEngine, apiKeyRef=$apiKeyRef, language=$language, additionalProperties=$additionalProperties}"
}
