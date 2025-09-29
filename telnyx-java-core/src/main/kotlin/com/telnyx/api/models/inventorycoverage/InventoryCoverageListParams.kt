// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.inventorycoverage

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Creates an inventory coverage request. If locality, npa or national_destination_code is used in
 * groupBy, and no region or locality filters are used, the whole paginated set is returned.
 */
class InventoryCoverageListParams
private constructor(
    private val filter: Filter?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[npa], filter[nxx],
     * filter[administrative_area], filter[phone_number_type], filter[country_code], filter[count],
     * filter[features], filter[groupBy]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InventoryCoverageListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [InventoryCoverageListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InventoryCoverageListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(inventoryCoverageListParams: InventoryCoverageListParams) = apply {
            filter = inventoryCoverageListParams.filter
            additionalHeaders = inventoryCoverageListParams.additionalHeaders.toBuilder()
            additionalQueryParams = inventoryCoverageListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[npa], filter[nxx],
         * filter[administrative_area], filter[phone_number_type], filter[country_code],
         * filter[count], filter[features], filter[groupBy]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [InventoryCoverageListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InventoryCoverageListParams =
            InventoryCoverageListParams(
                filter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.administrativeArea().ifPresent { put("filter[administrative_area]", it) }
                    it.count().ifPresent { put("filter[count]", it.toString()) }
                    it.countryCode().ifPresent { put("filter[country_code]", it.toString()) }
                    it.features().ifPresent {
                        put("filter[features]", it.joinToString(",") { it.toString() })
                    }
                    it.groupBy().ifPresent { put("filter[groupBy]", it.toString()) }
                    it.npa().ifPresent { put("filter[npa]", it.toString()) }
                    it.nxx().ifPresent { put("filter[nxx]", it.toString()) }
                    it.phoneNumberType().ifPresent {
                        put("filter[phone_number_type]", it.toString())
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[npa], filter[nxx],
     * filter[administrative_area], filter[phone_number_type], filter[country_code], filter[count],
     * filter[features], filter[groupBy]
     */
    class Filter
    private constructor(
        private val administrativeArea: String?,
        private val count: Boolean?,
        private val countryCode: CountryCode?,
        private val features: List<Feature>?,
        private val groupBy: GroupBy?,
        private val npa: Long?,
        private val nxx: Long?,
        private val phoneNumberType: PhoneNumberType?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by administrative area */
        fun administrativeArea(): Optional<String> = Optional.ofNullable(administrativeArea)

        /** Include count in the result */
        fun count(): Optional<Boolean> = Optional.ofNullable(count)

        /** Filter by country. Defaults to US */
        fun countryCode(): Optional<CountryCode> = Optional.ofNullable(countryCode)

        /**
         * Filter if the phone number should be used for voice, fax, mms, sms, emergency. Returns
         * features in the response when used.
         */
        fun features(): Optional<List<Feature>> = Optional.ofNullable(features)

        /** Filter to group results */
        fun groupBy(): Optional<GroupBy> = Optional.ofNullable(groupBy)

        /** Filter by npa */
        fun npa(): Optional<Long> = Optional.ofNullable(npa)

        /** Filter by nxx */
        fun nxx(): Optional<Long> = Optional.ofNullable(nxx)

        /** Filter by phone number type */
        fun phoneNumberType(): Optional<PhoneNumberType> = Optional.ofNullable(phoneNumberType)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var administrativeArea: String? = null
            private var count: Boolean? = null
            private var countryCode: CountryCode? = null
            private var features: MutableList<Feature>? = null
            private var groupBy: GroupBy? = null
            private var npa: Long? = null
            private var nxx: Long? = null
            private var phoneNumberType: PhoneNumberType? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                administrativeArea = filter.administrativeArea
                count = filter.count
                countryCode = filter.countryCode
                features = filter.features?.toMutableList()
                groupBy = filter.groupBy
                npa = filter.npa
                nxx = filter.nxx
                phoneNumberType = filter.phoneNumberType
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by administrative area */
            fun administrativeArea(administrativeArea: String?) = apply {
                this.administrativeArea = administrativeArea
            }

            /**
             * Alias for calling [Builder.administrativeArea] with
             * `administrativeArea.orElse(null)`.
             */
            fun administrativeArea(administrativeArea: Optional<String>) =
                administrativeArea(administrativeArea.getOrNull())

            /** Include count in the result */
            fun count(count: Boolean?) = apply { this.count = count }

            /**
             * Alias for [Builder.count].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun count(count: Boolean) = count(count as Boolean?)

            /** Alias for calling [Builder.count] with `count.orElse(null)`. */
            fun count(count: Optional<Boolean>) = count(count.getOrNull())

            /** Filter by country. Defaults to US */
            fun countryCode(countryCode: CountryCode?) = apply { this.countryCode = countryCode }

            /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
            fun countryCode(countryCode: Optional<CountryCode>) =
                countryCode(countryCode.getOrNull())

            /**
             * Filter if the phone number should be used for voice, fax, mms, sms, emergency.
             * Returns features in the response when used.
             */
            fun features(features: List<Feature>?) = apply {
                this.features = features?.toMutableList()
            }

            /** Alias for calling [Builder.features] with `features.orElse(null)`. */
            fun features(features: Optional<List<Feature>>) = features(features.getOrNull())

            /**
             * Adds a single [Feature] to [features].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFeature(feature: Feature) = apply {
                features = (features ?: mutableListOf()).apply { add(feature) }
            }

            /** Filter to group results */
            fun groupBy(groupBy: GroupBy?) = apply { this.groupBy = groupBy }

            /** Alias for calling [Builder.groupBy] with `groupBy.orElse(null)`. */
            fun groupBy(groupBy: Optional<GroupBy>) = groupBy(groupBy.getOrNull())

            /** Filter by npa */
            fun npa(npa: Long?) = apply { this.npa = npa }

            /**
             * Alias for [Builder.npa].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun npa(npa: Long) = npa(npa as Long?)

            /** Alias for calling [Builder.npa] with `npa.orElse(null)`. */
            fun npa(npa: Optional<Long>) = npa(npa.getOrNull())

            /** Filter by nxx */
            fun nxx(nxx: Long?) = apply { this.nxx = nxx }

            /**
             * Alias for [Builder.nxx].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun nxx(nxx: Long) = nxx(nxx as Long?)

            /** Alias for calling [Builder.nxx] with `nxx.orElse(null)`. */
            fun nxx(nxx: Optional<Long>) = nxx(nxx.getOrNull())

            /** Filter by phone number type */
            fun phoneNumberType(phoneNumberType: PhoneNumberType?) = apply {
                this.phoneNumberType = phoneNumberType
            }

            /** Alias for calling [Builder.phoneNumberType] with `phoneNumberType.orElse(null)`. */
            fun phoneNumberType(phoneNumberType: Optional<PhoneNumberType>) =
                phoneNumberType(phoneNumberType.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Filter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Filter =
                Filter(
                    administrativeArea,
                    count,
                    countryCode,
                    features?.toImmutable(),
                    groupBy,
                    npa,
                    nxx,
                    phoneNumberType,
                    additionalProperties.build(),
                )
        }

        /** Filter by country. Defaults to US */
        class CountryCode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val AT = of("AT")

                @JvmField val AU = of("AU")

                @JvmField val BE = of("BE")

                @JvmField val BG = of("BG")

                @JvmField val CA = of("CA")

                @JvmField val CH = of("CH")

                @JvmField val CN = of("CN")

                @JvmField val CY = of("CY")

                @JvmField val CZ = of("CZ")

                @JvmField val DE = of("DE")

                @JvmField val DK = of("DK")

                @JvmField val EE = of("EE")

                @JvmField val ES = of("ES")

                @JvmField val FI = of("FI")

                @JvmField val FR = of("FR")

                @JvmField val GB = of("GB")

                @JvmField val GR = of("GR")

                @JvmField val HU = of("HU")

                @JvmField val HR = of("HR")

                @JvmField val IE = of("IE")

                @JvmField val IT = of("IT")

                @JvmField val LT = of("LT")

                @JvmField val LU = of("LU")

                @JvmField val LV = of("LV")

                @JvmField val NL = of("NL")

                @JvmField val NZ = of("NZ")

                @JvmField val MX = of("MX")

                @JvmField val NO = of("NO")

                @JvmField val PL = of("PL")

                @JvmField val PT = of("PT")

                @JvmField val RO = of("RO")

                @JvmField val SE = of("SE")

                @JvmField val SG = of("SG")

                @JvmField val SI = of("SI")

                @JvmField val SK = of("SK")

                @JvmField val US = of("US")

                @JvmStatic fun of(value: String) = CountryCode(JsonField.of(value))
            }

            /** An enum containing [CountryCode]'s known values. */
            enum class Known {
                AT,
                AU,
                BE,
                BG,
                CA,
                CH,
                CN,
                CY,
                CZ,
                DE,
                DK,
                EE,
                ES,
                FI,
                FR,
                GB,
                GR,
                HU,
                HR,
                IE,
                IT,
                LT,
                LU,
                LV,
                NL,
                NZ,
                MX,
                NO,
                PL,
                PT,
                RO,
                SE,
                SG,
                SI,
                SK,
                US,
            }

            /**
             * An enum containing [CountryCode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CountryCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AT,
                AU,
                BE,
                BG,
                CA,
                CH,
                CN,
                CY,
                CZ,
                DE,
                DK,
                EE,
                ES,
                FI,
                FR,
                GB,
                GR,
                HU,
                HR,
                IE,
                IT,
                LT,
                LU,
                LV,
                NL,
                NZ,
                MX,
                NO,
                PL,
                PT,
                RO,
                SE,
                SG,
                SI,
                SK,
                US,
                /**
                 * An enum member indicating that [CountryCode] was instantiated with an unknown
                 * value.
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
                    AT -> Value.AT
                    AU -> Value.AU
                    BE -> Value.BE
                    BG -> Value.BG
                    CA -> Value.CA
                    CH -> Value.CH
                    CN -> Value.CN
                    CY -> Value.CY
                    CZ -> Value.CZ
                    DE -> Value.DE
                    DK -> Value.DK
                    EE -> Value.EE
                    ES -> Value.ES
                    FI -> Value.FI
                    FR -> Value.FR
                    GB -> Value.GB
                    GR -> Value.GR
                    HU -> Value.HU
                    HR -> Value.HR
                    IE -> Value.IE
                    IT -> Value.IT
                    LT -> Value.LT
                    LU -> Value.LU
                    LV -> Value.LV
                    NL -> Value.NL
                    NZ -> Value.NZ
                    MX -> Value.MX
                    NO -> Value.NO
                    PL -> Value.PL
                    PT -> Value.PT
                    RO -> Value.RO
                    SE -> Value.SE
                    SG -> Value.SG
                    SI -> Value.SI
                    SK -> Value.SK
                    US -> Value.US
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
                    AT -> Known.AT
                    AU -> Known.AU
                    BE -> Known.BE
                    BG -> Known.BG
                    CA -> Known.CA
                    CH -> Known.CH
                    CN -> Known.CN
                    CY -> Known.CY
                    CZ -> Known.CZ
                    DE -> Known.DE
                    DK -> Known.DK
                    EE -> Known.EE
                    ES -> Known.ES
                    FI -> Known.FI
                    FR -> Known.FR
                    GB -> Known.GB
                    GR -> Known.GR
                    HU -> Known.HU
                    HR -> Known.HR
                    IE -> Known.IE
                    IT -> Known.IT
                    LT -> Known.LT
                    LU -> Known.LU
                    LV -> Known.LV
                    NL -> Known.NL
                    NZ -> Known.NZ
                    MX -> Known.MX
                    NO -> Known.NO
                    PL -> Known.PL
                    PT -> Known.PT
                    RO -> Known.RO
                    SE -> Known.SE
                    SG -> Known.SG
                    SI -> Known.SI
                    SK -> Known.SK
                    US -> Known.US
                    else -> throw TelnyxInvalidDataException("Unknown CountryCode: $value")
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

            fun validate(): CountryCode = apply {
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

                return other is CountryCode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Feature @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val SMS = of("sms")

                @JvmField val MMS = of("mms")

                @JvmField val VOICE = of("voice")

                @JvmField val FAX = of("fax")

                @JvmField val EMERGENCY = of("emergency")

                @JvmStatic fun of(value: String) = Feature(JsonField.of(value))
            }

            /** An enum containing [Feature]'s known values. */
            enum class Known {
                SMS,
                MMS,
                VOICE,
                FAX,
                EMERGENCY,
            }

            /**
             * An enum containing [Feature]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Feature] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SMS,
                MMS,
                VOICE,
                FAX,
                EMERGENCY,
                /**
                 * An enum member indicating that [Feature] was instantiated with an unknown value.
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
                    SMS -> Value.SMS
                    MMS -> Value.MMS
                    VOICE -> Value.VOICE
                    FAX -> Value.FAX
                    EMERGENCY -> Value.EMERGENCY
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
                    SMS -> Known.SMS
                    MMS -> Known.MMS
                    VOICE -> Known.VOICE
                    FAX -> Known.FAX
                    EMERGENCY -> Known.EMERGENCY
                    else -> throw TelnyxInvalidDataException("Unknown Feature: $value")
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

            fun validate(): Feature = apply {
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

                return other is Feature && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Filter to group results */
        class GroupBy @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val LOCALITY = of("locality")

                @JvmField val NPA = of("npa")

                @JvmField val NATIONAL_DESTINATION_CODE = of("national_destination_code")

                @JvmStatic fun of(value: String) = GroupBy(JsonField.of(value))
            }

            /** An enum containing [GroupBy]'s known values. */
            enum class Known {
                LOCALITY,
                NPA,
                NATIONAL_DESTINATION_CODE,
            }

            /**
             * An enum containing [GroupBy]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [GroupBy] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOCALITY,
                NPA,
                NATIONAL_DESTINATION_CODE,
                /**
                 * An enum member indicating that [GroupBy] was instantiated with an unknown value.
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
                    LOCALITY -> Value.LOCALITY
                    NPA -> Value.NPA
                    NATIONAL_DESTINATION_CODE -> Value.NATIONAL_DESTINATION_CODE
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
                    LOCALITY -> Known.LOCALITY
                    NPA -> Known.NPA
                    NATIONAL_DESTINATION_CODE -> Known.NATIONAL_DESTINATION_CODE
                    else -> throw TelnyxInvalidDataException("Unknown GroupBy: $value")
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

            fun validate(): GroupBy = apply {
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

                return other is GroupBy && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Filter by phone number type */
        class PhoneNumberType
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

                @JvmField val LOCAL = of("local")

                @JvmField val TOLL_FREE = of("toll_free")

                @JvmField val NATIONAL = of("national")

                @JvmField val MOBILE = of("mobile")

                @JvmField val LANDLINE = of("landline")

                @JvmField val SHARED_COST = of("shared_cost")

                @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
            }

            /** An enum containing [PhoneNumberType]'s known values. */
            enum class Known {
                LOCAL,
                TOLL_FREE,
                NATIONAL,
                MOBILE,
                LANDLINE,
                SHARED_COST,
            }

            /**
             * An enum containing [PhoneNumberType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PhoneNumberType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOCAL,
                TOLL_FREE,
                NATIONAL,
                MOBILE,
                LANDLINE,
                SHARED_COST,
                /**
                 * An enum member indicating that [PhoneNumberType] was instantiated with an unknown
                 * value.
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
                    LOCAL -> Value.LOCAL
                    TOLL_FREE -> Value.TOLL_FREE
                    NATIONAL -> Value.NATIONAL
                    MOBILE -> Value.MOBILE
                    LANDLINE -> Value.LANDLINE
                    SHARED_COST -> Value.SHARED_COST
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
                    LOCAL -> Known.LOCAL
                    TOLL_FREE -> Known.TOLL_FREE
                    NATIONAL -> Known.NATIONAL
                    MOBILE -> Known.MOBILE
                    LANDLINE -> Known.LANDLINE
                    SHARED_COST -> Known.SHARED_COST
                    else -> throw TelnyxInvalidDataException("Unknown PhoneNumberType: $value")
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

            fun validate(): PhoneNumberType = apply {
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

                return other is PhoneNumberType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                administrativeArea == other.administrativeArea &&
                count == other.count &&
                countryCode == other.countryCode &&
                features == other.features &&
                groupBy == other.groupBy &&
                npa == other.npa &&
                nxx == other.nxx &&
                phoneNumberType == other.phoneNumberType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                administrativeArea,
                count,
                countryCode,
                features,
                groupBy,
                npa,
                nxx,
                phoneNumberType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{administrativeArea=$administrativeArea, count=$count, countryCode=$countryCode, features=$features, groupBy=$groupBy, npa=$npa, nxx=$nxx, phoneNumberType=$phoneNumberType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InventoryCoverageListParams &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(filter, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InventoryCoverageListParams{filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
