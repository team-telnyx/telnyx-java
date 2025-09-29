// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.availablephonenumbers

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.core.toImmutable
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List available phone numbers */
class AvailablePhoneNumberListParams
private constructor(
    private val filter: Filter?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[phone_number],
     * filter[locality], filter[administrative_area], filter[country_code],
     * filter[national_destination_code], filter[rate_center], filter[phone_number_type],
     * filter[features], filter[limit], filter[best_effort], filter[quickship], filter[reservable],
     * filter[exclude_held_numbers]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AvailablePhoneNumberListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AvailablePhoneNumberListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AvailablePhoneNumberListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(availablePhoneNumberListParams: AvailablePhoneNumberListParams) = apply {
            filter = availablePhoneNumberListParams.filter
            additionalHeaders = availablePhoneNumberListParams.additionalHeaders.toBuilder()
            additionalQueryParams = availablePhoneNumberListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[phone_number],
         * filter[locality], filter[administrative_area], filter[country_code],
         * filter[national_destination_code], filter[rate_center], filter[phone_number_type],
         * filter[features], filter[limit], filter[best_effort], filter[quickship],
         * filter[reservable], filter[exclude_held_numbers]
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
         * Returns an immutable instance of [AvailablePhoneNumberListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AvailablePhoneNumberListParams =
            AvailablePhoneNumberListParams(
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
                    it.bestEffort().ifPresent { put("filter[best_effort]", it.toString()) }
                    it.countryCode().ifPresent { put("filter[country_code]", it) }
                    it.excludeHeldNumbers().ifPresent {
                        put("filter[exclude_held_numbers]", it.toString())
                    }
                    it.features().ifPresent {
                        put("filter[features]", it.joinToString(",") { it.toString() })
                    }
                    it.limit().ifPresent { put("filter[limit]", it.toString()) }
                    it.locality().ifPresent { put("filter[locality]", it) }
                    it.nationalDestinationCode().ifPresent {
                        put("filter[national_destination_code]", it)
                    }
                    it.phoneNumber().ifPresent {
                        it.contains().ifPresent { put("filter[phone_number][contains]", it) }
                        it.endsWith().ifPresent { put("filter[phone_number][ends_with]", it) }
                        it.startsWith().ifPresent { put("filter[phone_number][starts_with]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[phone_number][$key]", value)
                            }
                        }
                    }
                    it.phoneNumberType().ifPresent {
                        put("filter[phone_number_type]", it.toString())
                    }
                    it.quickship().ifPresent { put("filter[quickship]", it.toString()) }
                    it.rateCenter().ifPresent { put("filter[rate_center]", it) }
                    it.reservable().ifPresent { put("filter[reservable]", it.toString()) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[phone_number],
     * filter[locality], filter[administrative_area], filter[country_code],
     * filter[national_destination_code], filter[rate_center], filter[phone_number_type],
     * filter[features], filter[limit], filter[best_effort], filter[quickship], filter[reservable],
     * filter[exclude_held_numbers]
     */
    class Filter
    private constructor(
        private val administrativeArea: String?,
        private val bestEffort: Boolean?,
        private val countryCode: String?,
        private val excludeHeldNumbers: Boolean?,
        private val features: List<Feature>?,
        private val limit: Long?,
        private val locality: String?,
        private val nationalDestinationCode: String?,
        private val phoneNumber: PhoneNumber?,
        private val phoneNumberType: PhoneNumberType?,
        private val quickship: Boolean?,
        private val rateCenter: String?,
        private val reservable: Boolean?,
        private val additionalProperties: QueryParams,
    ) {

        /** Find numbers in a particular US state or CA province. */
        fun administrativeArea(): Optional<String> = Optional.ofNullable(administrativeArea)

        /**
         * Filter to determine if best effort results should be included. Only available in
         * USA/CANADA.
         */
        fun bestEffort(): Optional<Boolean> = Optional.ofNullable(bestEffort)

        /** Filter phone numbers by country. */
        fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

        /** Filter to exclude phone numbers that are currently on hold/reserved for your account. */
        fun excludeHeldNumbers(): Optional<Boolean> = Optional.ofNullable(excludeHeldNumbers)

        /** Filter phone numbers with specific features. */
        fun features(): Optional<List<Feature>> = Optional.ofNullable(features)

        /** Limits the number of results. */
        fun limit(): Optional<Long> = Optional.ofNullable(limit)

        /** Filter phone numbers by city. */
        fun locality(): Optional<String> = Optional.ofNullable(locality)

        /** Filter by the national destination code of the number. */
        fun nationalDestinationCode(): Optional<String> =
            Optional.ofNullable(nationalDestinationCode)

        /** Filter phone numbers by pattern matching. */
        fun phoneNumber(): Optional<PhoneNumber> = Optional.ofNullable(phoneNumber)

        /** Filter phone numbers by number type. */
        fun phoneNumberType(): Optional<PhoneNumberType> = Optional.ofNullable(phoneNumberType)

        /**
         * Filter to exclude phone numbers that need additional time after to purchase to activate.
         * Only applicable for +1 toll_free numbers.
         */
        fun quickship(): Optional<Boolean> = Optional.ofNullable(quickship)

        /**
         * Filter phone numbers by rate center. This filter is only applicable to USA and Canada
         * numbers.
         */
        fun rateCenter(): Optional<String> = Optional.ofNullable(rateCenter)

        /** Filter to ensure only numbers that can be reserved are included in the results. */
        fun reservable(): Optional<Boolean> = Optional.ofNullable(reservable)

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
            private var bestEffort: Boolean? = null
            private var countryCode: String? = null
            private var excludeHeldNumbers: Boolean? = null
            private var features: MutableList<Feature>? = null
            private var limit: Long? = null
            private var locality: String? = null
            private var nationalDestinationCode: String? = null
            private var phoneNumber: PhoneNumber? = null
            private var phoneNumberType: PhoneNumberType? = null
            private var quickship: Boolean? = null
            private var rateCenter: String? = null
            private var reservable: Boolean? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                administrativeArea = filter.administrativeArea
                bestEffort = filter.bestEffort
                countryCode = filter.countryCode
                excludeHeldNumbers = filter.excludeHeldNumbers
                features = filter.features?.toMutableList()
                limit = filter.limit
                locality = filter.locality
                nationalDestinationCode = filter.nationalDestinationCode
                phoneNumber = filter.phoneNumber
                phoneNumberType = filter.phoneNumberType
                quickship = filter.quickship
                rateCenter = filter.rateCenter
                reservable = filter.reservable
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Find numbers in a particular US state or CA province. */
            fun administrativeArea(administrativeArea: String?) = apply {
                this.administrativeArea = administrativeArea
            }

            /**
             * Alias for calling [Builder.administrativeArea] with
             * `administrativeArea.orElse(null)`.
             */
            fun administrativeArea(administrativeArea: Optional<String>) =
                administrativeArea(administrativeArea.getOrNull())

            /**
             * Filter to determine if best effort results should be included. Only available in
             * USA/CANADA.
             */
            fun bestEffort(bestEffort: Boolean?) = apply { this.bestEffort = bestEffort }

            /**
             * Alias for [Builder.bestEffort].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun bestEffort(bestEffort: Boolean) = bestEffort(bestEffort as Boolean?)

            /** Alias for calling [Builder.bestEffort] with `bestEffort.orElse(null)`. */
            fun bestEffort(bestEffort: Optional<Boolean>) = bestEffort(bestEffort.getOrNull())

            /** Filter phone numbers by country. */
            fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

            /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
            fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

            /**
             * Filter to exclude phone numbers that are currently on hold/reserved for your account.
             */
            fun excludeHeldNumbers(excludeHeldNumbers: Boolean?) = apply {
                this.excludeHeldNumbers = excludeHeldNumbers
            }

            /**
             * Alias for [Builder.excludeHeldNumbers].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun excludeHeldNumbers(excludeHeldNumbers: Boolean) =
                excludeHeldNumbers(excludeHeldNumbers as Boolean?)

            /**
             * Alias for calling [Builder.excludeHeldNumbers] with
             * `excludeHeldNumbers.orElse(null)`.
             */
            fun excludeHeldNumbers(excludeHeldNumbers: Optional<Boolean>) =
                excludeHeldNumbers(excludeHeldNumbers.getOrNull())

            /** Filter phone numbers with specific features. */
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

            /** Limits the number of results. */
            fun limit(limit: Long?) = apply { this.limit = limit }

            /**
             * Alias for [Builder.limit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun limit(limit: Long) = limit(limit as Long?)

            /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
            fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

            /** Filter phone numbers by city. */
            fun locality(locality: String?) = apply { this.locality = locality }

            /** Alias for calling [Builder.locality] with `locality.orElse(null)`. */
            fun locality(locality: Optional<String>) = locality(locality.getOrNull())

            /** Filter by the national destination code of the number. */
            fun nationalDestinationCode(nationalDestinationCode: String?) = apply {
                this.nationalDestinationCode = nationalDestinationCode
            }

            /**
             * Alias for calling [Builder.nationalDestinationCode] with
             * `nationalDestinationCode.orElse(null)`.
             */
            fun nationalDestinationCode(nationalDestinationCode: Optional<String>) =
                nationalDestinationCode(nationalDestinationCode.getOrNull())

            /** Filter phone numbers by pattern matching. */
            fun phoneNumber(phoneNumber: PhoneNumber?) = apply { this.phoneNumber = phoneNumber }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<PhoneNumber>) =
                phoneNumber(phoneNumber.getOrNull())

            /** Filter phone numbers by number type. */
            fun phoneNumberType(phoneNumberType: PhoneNumberType?) = apply {
                this.phoneNumberType = phoneNumberType
            }

            /** Alias for calling [Builder.phoneNumberType] with `phoneNumberType.orElse(null)`. */
            fun phoneNumberType(phoneNumberType: Optional<PhoneNumberType>) =
                phoneNumberType(phoneNumberType.getOrNull())

            /**
             * Filter to exclude phone numbers that need additional time after to purchase to
             * activate. Only applicable for +1 toll_free numbers.
             */
            fun quickship(quickship: Boolean?) = apply { this.quickship = quickship }

            /**
             * Alias for [Builder.quickship].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun quickship(quickship: Boolean) = quickship(quickship as Boolean?)

            /** Alias for calling [Builder.quickship] with `quickship.orElse(null)`. */
            fun quickship(quickship: Optional<Boolean>) = quickship(quickship.getOrNull())

            /**
             * Filter phone numbers by rate center. This filter is only applicable to USA and Canada
             * numbers.
             */
            fun rateCenter(rateCenter: String?) = apply { this.rateCenter = rateCenter }

            /** Alias for calling [Builder.rateCenter] with `rateCenter.orElse(null)`. */
            fun rateCenter(rateCenter: Optional<String>) = rateCenter(rateCenter.getOrNull())

            /** Filter to ensure only numbers that can be reserved are included in the results. */
            fun reservable(reservable: Boolean?) = apply { this.reservable = reservable }

            /**
             * Alias for [Builder.reservable].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun reservable(reservable: Boolean) = reservable(reservable as Boolean?)

            /** Alias for calling [Builder.reservable] with `reservable.orElse(null)`. */
            fun reservable(reservable: Optional<Boolean>) = reservable(reservable.getOrNull())

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
                    bestEffort,
                    countryCode,
                    excludeHeldNumbers,
                    features?.toImmutable(),
                    limit,
                    locality,
                    nationalDestinationCode,
                    phoneNumber,
                    phoneNumberType,
                    quickship,
                    rateCenter,
                    reservable,
                    additionalProperties.build(),
                )
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

                @JvmField val HD_VOICE = of("hd_voice")

                @JvmField val INTERNATIONAL_SMS = of("international_sms")

                @JvmField val LOCAL_CALLING = of("local_calling")

                @JvmStatic fun of(value: String) = Feature(JsonField.of(value))
            }

            /** An enum containing [Feature]'s known values. */
            enum class Known {
                SMS,
                MMS,
                VOICE,
                FAX,
                EMERGENCY,
                HD_VOICE,
                INTERNATIONAL_SMS,
                LOCAL_CALLING,
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
                HD_VOICE,
                INTERNATIONAL_SMS,
                LOCAL_CALLING,
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
                    HD_VOICE -> Value.HD_VOICE
                    INTERNATIONAL_SMS -> Value.INTERNATIONAL_SMS
                    LOCAL_CALLING -> Value.LOCAL_CALLING
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
                    HD_VOICE -> Known.HD_VOICE
                    INTERNATIONAL_SMS -> Known.INTERNATIONAL_SMS
                    LOCAL_CALLING -> Known.LOCAL_CALLING
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

        /** Filter phone numbers by pattern matching. */
        class PhoneNumber
        private constructor(
            private val contains: String?,
            private val endsWith: String?,
            private val startsWith: String?,
        ) {

            /**
             * Filter numbers containing a pattern (excludes NDC if used with
             * `national_destination_code` filter).
             */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /**
             * Filter numbers ending with a pattern (excludes NDC if used with
             * `national_destination_code` filter).
             */
            fun endsWith(): Optional<String> = Optional.ofNullable(endsWith)

            /**
             * Filter numbers starting with a pattern (excludes NDC if used with
             * `national_destination_code` filter).
             */
            fun startsWith(): Optional<String> = Optional.ofNullable(startsWith)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [PhoneNumber]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PhoneNumber]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var endsWith: String? = null
                private var startsWith: String? = null

                @JvmSynthetic
                internal fun from(phoneNumber: PhoneNumber) = apply {
                    contains = phoneNumber.contains
                    endsWith = phoneNumber.endsWith
                    startsWith = phoneNumber.startsWith
                }

                /**
                 * Filter numbers containing a pattern (excludes NDC if used with
                 * `national_destination_code` filter).
                 */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /**
                 * Filter numbers ending with a pattern (excludes NDC if used with
                 * `national_destination_code` filter).
                 */
                fun endsWith(endsWith: String?) = apply { this.endsWith = endsWith }

                /** Alias for calling [Builder.endsWith] with `endsWith.orElse(null)`. */
                fun endsWith(endsWith: Optional<String>) = endsWith(endsWith.getOrNull())

                /**
                 * Filter numbers starting with a pattern (excludes NDC if used with
                 * `national_destination_code` filter).
                 */
                fun startsWith(startsWith: String?) = apply { this.startsWith = startsWith }

                /** Alias for calling [Builder.startsWith] with `startsWith.orElse(null)`. */
                fun startsWith(startsWith: Optional<String>) = startsWith(startsWith.getOrNull())

                /**
                 * Returns an immutable instance of [PhoneNumber].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PhoneNumber = PhoneNumber(contains, endsWith, startsWith)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PhoneNumber &&
                    contains == other.contains &&
                    endsWith == other.endsWith &&
                    startsWith == other.startsWith
            }

            private val hashCode: Int by lazy { Objects.hash(contains, endsWith, startsWith) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhoneNumber{contains=$contains, endsWith=$endsWith, startsWith=$startsWith}"
        }

        /** Filter phone numbers by number type. */
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

                @JvmField val MOBILE = of("mobile")

                @JvmField val NATIONAL = of("national")

                @JvmField val SHARED_COST = of("shared_cost")

                @JvmStatic fun of(value: String) = PhoneNumberType(JsonField.of(value))
            }

            /** An enum containing [PhoneNumberType]'s known values. */
            enum class Known {
                LOCAL,
                TOLL_FREE,
                MOBILE,
                NATIONAL,
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
                MOBILE,
                NATIONAL,
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
                    MOBILE -> Value.MOBILE
                    NATIONAL -> Value.NATIONAL
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
                    MOBILE -> Known.MOBILE
                    NATIONAL -> Known.NATIONAL
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
                bestEffort == other.bestEffort &&
                countryCode == other.countryCode &&
                excludeHeldNumbers == other.excludeHeldNumbers &&
                features == other.features &&
                limit == other.limit &&
                locality == other.locality &&
                nationalDestinationCode == other.nationalDestinationCode &&
                phoneNumber == other.phoneNumber &&
                phoneNumberType == other.phoneNumberType &&
                quickship == other.quickship &&
                rateCenter == other.rateCenter &&
                reservable == other.reservable &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                administrativeArea,
                bestEffort,
                countryCode,
                excludeHeldNumbers,
                features,
                limit,
                locality,
                nationalDestinationCode,
                phoneNumber,
                phoneNumberType,
                quickship,
                rateCenter,
                reservable,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{administrativeArea=$administrativeArea, bestEffort=$bestEffort, countryCode=$countryCode, excludeHeldNumbers=$excludeHeldNumbers, features=$features, limit=$limit, locality=$locality, nationalDestinationCode=$nationalDestinationCode, phoneNumber=$phoneNumber, phoneNumberType=$phoneNumberType, quickship=$quickship, rateCenter=$rateCenter, reservable=$reservable, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AvailablePhoneNumberListParams &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(filter, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AvailablePhoneNumberListParams{filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
