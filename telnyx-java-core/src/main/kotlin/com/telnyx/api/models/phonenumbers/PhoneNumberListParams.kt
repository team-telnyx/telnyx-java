// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List phone numbers */
class PhoneNumberListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val sort: Sort?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[tag],
     * filter[phone_number], filter[status], filter[country_iso_alpha2], filter[connection_id],
     * filter[voice.connection_name], filter[voice.usage_payment_method], filter[billing_group_id],
     * filter[emergency_address_id], filter[customer_reference], filter[number_type], filter[source]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /**
     * Specifies the sort order for results. If not given, results are sorted by created_at in
     * descending order.
     */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PhoneNumberListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PhoneNumberListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneNumberListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var sort: Sort? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(phoneNumberListParams: PhoneNumberListParams) = apply {
            filter = phoneNumberListParams.filter
            page = phoneNumberListParams.page
            sort = phoneNumberListParams.sort
            additionalHeaders = phoneNumberListParams.additionalHeaders.toBuilder()
            additionalQueryParams = phoneNumberListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[tag],
         * filter[phone_number], filter[status], filter[country_iso_alpha2], filter[connection_id],
         * filter[voice.connection_name], filter[voice.usage_payment_method],
         * filter[billing_group_id], filter[emergency_address_id], filter[customer_reference],
         * filter[number_type], filter[source]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

        /**
         * Specifies the sort order for results. If not given, results are sorted by created_at in
         * descending order.
         */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

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
         * Returns an immutable instance of [PhoneNumberListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneNumberListParams =
            PhoneNumberListParams(
                filter,
                page,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.billingGroupId().ifPresent { put("filter[billing_group_id]", it) }
                    it.connectionId().ifPresent { put("filter[connection_id]", it) }
                    it.countryIsoAlpha2().ifPresent {
                        it.accept(
                            object : Filter.CountryIsoAlpha2.Visitor<Unit> {
                                override fun visitString(string: String) {
                                    put("filter[country_iso_alpha2]", string)
                                }

                                override fun visitStrings(strings: List<String>) {
                                    put("filter[country_iso_alpha2]", strings.joinToString(","))
                                }
                            }
                        )
                    }
                    it.customerReference().ifPresent { put("filter[customer_reference]", it) }
                    it.emergencyAddressId().ifPresent { put("filter[emergency_address_id]", it) }
                    it.numberType().ifPresent {
                        it.eq().ifPresent { put("filter[number_type][eq]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[number_type][$key]", value)
                            }
                        }
                    }
                    it.phoneNumber().ifPresent { put("filter[phone_number]", it) }
                    it.source().ifPresent { put("filter[source]", it.toString()) }
                    it.status().ifPresent { put("filter[status]", it.toString()) }
                    it.tag().ifPresent { put("filter[tag]", it) }
                    it.voiceConnectionName().ifPresent {
                        it.contains().ifPresent {
                            put("filter[voice.connection_name][contains]", it)
                        }
                        it.endsWith().ifPresent {
                            put("filter[voice.connection_name][ends_with]", it)
                        }
                        it.eq().ifPresent { put("filter[voice.connection_name][eq]", it) }
                        it.startsWith().ifPresent {
                            put("filter[voice.connection_name][starts_with]", it)
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[voice.connection_name][$key]", value)
                            }
                        }
                    }
                    it.voiceUsagePaymentMethod().ifPresent {
                        put("filter[voice.usage_payment_method]", it.toString())
                    }
                    it.withoutTags().ifPresent { put("filter[without_tags]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                page?.let {
                    it.number().ifPresent { put("page[number]", it.toString()) }
                    it.size().ifPresent { put("page[size]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("page[$key]", value)
                        }
                    }
                }
                sort?.let { put("sort", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[tag],
     * filter[phone_number], filter[status], filter[country_iso_alpha2], filter[connection_id],
     * filter[voice.connection_name], filter[voice.usage_payment_method], filter[billing_group_id],
     * filter[emergency_address_id], filter[customer_reference], filter[number_type], filter[source]
     */
    class Filter
    private constructor(
        private val billingGroupId: String?,
        private val connectionId: String?,
        private val countryIsoAlpha2: CountryIsoAlpha2?,
        private val customerReference: String?,
        private val emergencyAddressId: String?,
        private val numberType: NumberType?,
        private val phoneNumber: String?,
        private val source: Source?,
        private val status: Status?,
        private val tag: String?,
        private val voiceConnectionName: VoiceConnectionName?,
        private val voiceUsagePaymentMethod: VoiceUsagePaymentMethod?,
        private val withoutTags: WithoutTags?,
        private val additionalProperties: QueryParams,
    ) {

        /**
         * Filter by the billing_group_id associated with phone numbers. To filter to only phone
         * numbers that have no billing group associated them, set the value of this filter to the
         * string 'null'.
         */
        fun billingGroupId(): Optional<String> = Optional.ofNullable(billingGroupId)

        /** Filter by connection_id. */
        fun connectionId(): Optional<String> = Optional.ofNullable(connectionId)

        /**
         * Filter by phone number country ISO alpha-2 code. Can be a single value or an array of
         * values.
         */
        fun countryIsoAlpha2(): Optional<CountryIsoAlpha2> = Optional.ofNullable(countryIsoAlpha2)

        /** Filter numbers via the customer_reference set. */
        fun customerReference(): Optional<String> = Optional.ofNullable(customerReference)

        /**
         * Filter by the emergency_address_id associated with phone numbers. To filter only phone
         * numbers that have no emergency address associated with them, set the value of this filter
         * to the string 'null'.
         */
        fun emergencyAddressId(): Optional<String> = Optional.ofNullable(emergencyAddressId)

        /** Filter phone numbers by phone number type. */
        fun numberType(): Optional<NumberType> = Optional.ofNullable(numberType)

        /**
         * Filter by phone number. Requires at least three digits. Non-numerical characters will
         * result in no values being returned.
         */
        fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

        /**
         * Filter phone numbers by their source. Use 'ported' for numbers ported from other
         * carriers, or 'purchased' for numbers bought directly from Telnyx.
         */
        fun source(): Optional<Source> = Optional.ofNullable(source)

        /** Filter by phone number status. */
        fun status(): Optional<Status> = Optional.ofNullable(status)

        /** Filter by phone number tags. */
        fun tag(): Optional<String> = Optional.ofNullable(tag)

        /** Filter by voice connection name pattern matching. */
        fun voiceConnectionName(): Optional<VoiceConnectionName> =
            Optional.ofNullable(voiceConnectionName)

        /** Filter by usage_payment_method. */
        fun voiceUsagePaymentMethod(): Optional<VoiceUsagePaymentMethod> =
            Optional.ofNullable(voiceUsagePaymentMethod)

        /**
         * When set to 'true', filters for phone numbers that do not have any tags applied. All
         * other values are ignored.
         */
        fun withoutTags(): Optional<WithoutTags> = Optional.ofNullable(withoutTags)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var billingGroupId: String? = null
            private var connectionId: String? = null
            private var countryIsoAlpha2: CountryIsoAlpha2? = null
            private var customerReference: String? = null
            private var emergencyAddressId: String? = null
            private var numberType: NumberType? = null
            private var phoneNumber: String? = null
            private var source: Source? = null
            private var status: Status? = null
            private var tag: String? = null
            private var voiceConnectionName: VoiceConnectionName? = null
            private var voiceUsagePaymentMethod: VoiceUsagePaymentMethod? = null
            private var withoutTags: WithoutTags? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                billingGroupId = filter.billingGroupId
                connectionId = filter.connectionId
                countryIsoAlpha2 = filter.countryIsoAlpha2
                customerReference = filter.customerReference
                emergencyAddressId = filter.emergencyAddressId
                numberType = filter.numberType
                phoneNumber = filter.phoneNumber
                source = filter.source
                status = filter.status
                tag = filter.tag
                voiceConnectionName = filter.voiceConnectionName
                voiceUsagePaymentMethod = filter.voiceUsagePaymentMethod
                withoutTags = filter.withoutTags
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /**
             * Filter by the billing_group_id associated with phone numbers. To filter to only phone
             * numbers that have no billing group associated them, set the value of this filter to
             * the string 'null'.
             */
            fun billingGroupId(billingGroupId: String?) = apply {
                this.billingGroupId = billingGroupId
            }

            /** Alias for calling [Builder.billingGroupId] with `billingGroupId.orElse(null)`. */
            fun billingGroupId(billingGroupId: Optional<String>) =
                billingGroupId(billingGroupId.getOrNull())

            /** Filter by connection_id. */
            fun connectionId(connectionId: String?) = apply { this.connectionId = connectionId }

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<String>) =
                connectionId(connectionId.getOrNull())

            /**
             * Filter by phone number country ISO alpha-2 code. Can be a single value or an array of
             * values.
             */
            fun countryIsoAlpha2(countryIsoAlpha2: CountryIsoAlpha2?) = apply {
                this.countryIsoAlpha2 = countryIsoAlpha2
            }

            /**
             * Alias for calling [Builder.countryIsoAlpha2] with `countryIsoAlpha2.orElse(null)`.
             */
            fun countryIsoAlpha2(countryIsoAlpha2: Optional<CountryIsoAlpha2>) =
                countryIsoAlpha2(countryIsoAlpha2.getOrNull())

            /** Alias for calling [countryIsoAlpha2] with `CountryIsoAlpha2.ofString(string)`. */
            fun countryIsoAlpha2(string: String) =
                countryIsoAlpha2(CountryIsoAlpha2.ofString(string))

            /** Alias for calling [countryIsoAlpha2] with `CountryIsoAlpha2.ofStrings(strings)`. */
            fun countryIsoAlpha2OfStrings(strings: List<String>) =
                countryIsoAlpha2(CountryIsoAlpha2.ofStrings(strings))

            /** Filter numbers via the customer_reference set. */
            fun customerReference(customerReference: String?) = apply {
                this.customerReference = customerReference
            }

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

            /**
             * Filter by the emergency_address_id associated with phone numbers. To filter only
             * phone numbers that have no emergency address associated with them, set the value of
             * this filter to the string 'null'.
             */
            fun emergencyAddressId(emergencyAddressId: String?) = apply {
                this.emergencyAddressId = emergencyAddressId
            }

            /**
             * Alias for calling [Builder.emergencyAddressId] with
             * `emergencyAddressId.orElse(null)`.
             */
            fun emergencyAddressId(emergencyAddressId: Optional<String>) =
                emergencyAddressId(emergencyAddressId.getOrNull())

            /** Filter phone numbers by phone number type. */
            fun numberType(numberType: NumberType?) = apply { this.numberType = numberType }

            /** Alias for calling [Builder.numberType] with `numberType.orElse(null)`. */
            fun numberType(numberType: Optional<NumberType>) = numberType(numberType.getOrNull())

            /**
             * Filter by phone number. Requires at least three digits. Non-numerical characters will
             * result in no values being returned.
             */
            fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

            /**
             * Filter phone numbers by their source. Use 'ported' for numbers ported from other
             * carriers, or 'purchased' for numbers bought directly from Telnyx.
             */
            fun source(source: Source?) = apply { this.source = source }

            /** Alias for calling [Builder.source] with `source.orElse(null)`. */
            fun source(source: Optional<Source>) = source(source.getOrNull())

            /** Filter by phone number status. */
            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /** Filter by phone number tags. */
            fun tag(tag: String?) = apply { this.tag = tag }

            /** Alias for calling [Builder.tag] with `tag.orElse(null)`. */
            fun tag(tag: Optional<String>) = tag(tag.getOrNull())

            /** Filter by voice connection name pattern matching. */
            fun voiceConnectionName(voiceConnectionName: VoiceConnectionName?) = apply {
                this.voiceConnectionName = voiceConnectionName
            }

            /**
             * Alias for calling [Builder.voiceConnectionName] with
             * `voiceConnectionName.orElse(null)`.
             */
            fun voiceConnectionName(voiceConnectionName: Optional<VoiceConnectionName>) =
                voiceConnectionName(voiceConnectionName.getOrNull())

            /** Filter by usage_payment_method. */
            fun voiceUsagePaymentMethod(voiceUsagePaymentMethod: VoiceUsagePaymentMethod?) = apply {
                this.voiceUsagePaymentMethod = voiceUsagePaymentMethod
            }

            /**
             * Alias for calling [Builder.voiceUsagePaymentMethod] with
             * `voiceUsagePaymentMethod.orElse(null)`.
             */
            fun voiceUsagePaymentMethod(
                voiceUsagePaymentMethod: Optional<VoiceUsagePaymentMethod>
            ) = voiceUsagePaymentMethod(voiceUsagePaymentMethod.getOrNull())

            /**
             * When set to 'true', filters for phone numbers that do not have any tags applied. All
             * other values are ignored.
             */
            fun withoutTags(withoutTags: WithoutTags?) = apply { this.withoutTags = withoutTags }

            /** Alias for calling [Builder.withoutTags] with `withoutTags.orElse(null)`. */
            fun withoutTags(withoutTags: Optional<WithoutTags>) =
                withoutTags(withoutTags.getOrNull())

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
                    billingGroupId,
                    connectionId,
                    countryIsoAlpha2,
                    customerReference,
                    emergencyAddressId,
                    numberType,
                    phoneNumber,
                    source,
                    status,
                    tag,
                    voiceConnectionName,
                    voiceUsagePaymentMethod,
                    withoutTags,
                    additionalProperties.build(),
                )
        }

        /**
         * Filter by phone number country ISO alpha-2 code. Can be a single value or an array of
         * values.
         */
        class CountryIsoAlpha2
        private constructor(
            private val string: String? = null,
            private val strings: List<String>? = null,
        ) {

            fun string(): Optional<String> = Optional.ofNullable(string)

            fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

            fun isString(): Boolean = string != null

            fun isStrings(): Boolean = strings != null

            fun asString(): String = string.getOrThrow("string")

            fun asStrings(): List<String> = strings.getOrThrow("strings")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    strings != null -> visitor.visitStrings(strings)
                    else -> throw IllegalStateException("Invalid CountryIsoAlpha2")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CountryIsoAlpha2 &&
                    string == other.string &&
                    strings == other.strings
            }

            override fun hashCode(): Int = Objects.hash(string, strings)

            override fun toString(): String =
                when {
                    string != null -> "CountryIsoAlpha2{string=$string}"
                    strings != null -> "CountryIsoAlpha2{strings=$strings}"
                    else -> throw IllegalStateException("Invalid CountryIsoAlpha2")
                }

            companion object {

                @JvmStatic fun ofString(string: String) = CountryIsoAlpha2(string = string)

                @JvmStatic
                fun ofStrings(strings: List<String>) =
                    CountryIsoAlpha2(strings = strings.toImmutable())
            }

            /**
             * An interface that defines how to map each variant of [CountryIsoAlpha2] to a value of
             * type [T].
             */
            interface Visitor<out T> {

                fun visitString(string: String): T

                fun visitStrings(strings: List<String>): T
            }
        }

        /** Filter phone numbers by phone number type. */
        class NumberType private constructor(private val eq: Eq?) {

            /** Filter phone numbers by phone number type. */
            fun eq(): Optional<Eq> = Optional.ofNullable(eq)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [NumberType]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NumberType]. */
            class Builder internal constructor() {

                private var eq: Eq? = null

                @JvmSynthetic
                internal fun from(numberType: NumberType) = apply { eq = numberType.eq }

                /** Filter phone numbers by phone number type. */
                fun eq(eq: Eq?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<Eq>) = eq(eq.getOrNull())

                /**
                 * Returns an immutable instance of [NumberType].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): NumberType = NumberType(eq)
            }

            /** Filter phone numbers by phone number type. */
            class Eq @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LOCAL = of("local")

                    @JvmField val NATIONAL = of("national")

                    @JvmField val TOLL_FREE = of("toll_free")

                    @JvmField val MOBILE = of("mobile")

                    @JvmField val SHARED_COST = of("shared_cost")

                    @JvmStatic fun of(value: String) = Eq(JsonField.of(value))
                }

                /** An enum containing [Eq]'s known values. */
                enum class Known {
                    LOCAL,
                    NATIONAL,
                    TOLL_FREE,
                    MOBILE,
                    SHARED_COST,
                }

                /**
                 * An enum containing [Eq]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Eq] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LOCAL,
                    NATIONAL,
                    TOLL_FREE,
                    MOBILE,
                    SHARED_COST,
                    /**
                     * An enum member indicating that [Eq] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LOCAL -> Value.LOCAL
                        NATIONAL -> Value.NATIONAL
                        TOLL_FREE -> Value.TOLL_FREE
                        MOBILE -> Value.MOBILE
                        SHARED_COST -> Value.SHARED_COST
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        LOCAL -> Known.LOCAL
                        NATIONAL -> Known.NATIONAL
                        TOLL_FREE -> Known.TOLL_FREE
                        MOBILE -> Known.MOBILE
                        SHARED_COST -> Known.SHARED_COST
                        else -> throw TelnyxInvalidDataException("Unknown Eq: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws TelnyxInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        TelnyxInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Eq = apply {
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

                    return other is Eq && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NumberType && eq == other.eq
            }

            private val hashCode: Int by lazy { Objects.hash(eq) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "NumberType{eq=$eq}"
        }

        /**
         * Filter phone numbers by their source. Use 'ported' for numbers ported from other
         * carriers, or 'purchased' for numbers bought directly from Telnyx.
         */
        class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PORTED = of("ported")

                @JvmField val PURCHASED = of("purchased")

                @JvmStatic fun of(value: String) = Source(JsonField.of(value))
            }

            /** An enum containing [Source]'s known values. */
            enum class Known {
                PORTED,
                PURCHASED,
            }

            /**
             * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Source] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PORTED,
                PURCHASED,
                /**
                 * An enum member indicating that [Source] was instantiated with an unknown value.
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
                    PORTED -> Value.PORTED
                    PURCHASED -> Value.PURCHASED
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
                    PORTED -> Known.PORTED
                    PURCHASED -> Known.PURCHASED
                    else -> throw TelnyxInvalidDataException("Unknown Source: $value")
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

            fun validate(): Source = apply {
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

                return other is Source && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Filter by phone number status. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PURCHASE_PENDING = of("purchase-pending")

                @JvmField val PURCHASE_FAILED = of("purchase-failed")

                @JvmField val PORT_PENDING = of("port-pending")

                @JvmField val ACTIVE = of("active")

                @JvmField val DELETED = of("deleted")

                @JvmField val PORT_FAILED = of("port-failed")

                @JvmField val EMERGENCY_ONLY = of("emergency-only")

                @JvmField val PORTED_OUT = of("ported-out")

                @JvmField val PORT_OUT_PENDING = of("port-out-pending")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PURCHASE_PENDING,
                PURCHASE_FAILED,
                PORT_PENDING,
                ACTIVE,
                DELETED,
                PORT_FAILED,
                EMERGENCY_ONLY,
                PORTED_OUT,
                PORT_OUT_PENDING,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PURCHASE_PENDING,
                PURCHASE_FAILED,
                PORT_PENDING,
                ACTIVE,
                DELETED,
                PORT_FAILED,
                EMERGENCY_ONLY,
                PORTED_OUT,
                PORT_OUT_PENDING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PURCHASE_PENDING -> Value.PURCHASE_PENDING
                    PURCHASE_FAILED -> Value.PURCHASE_FAILED
                    PORT_PENDING -> Value.PORT_PENDING
                    ACTIVE -> Value.ACTIVE
                    DELETED -> Value.DELETED
                    PORT_FAILED -> Value.PORT_FAILED
                    EMERGENCY_ONLY -> Value.EMERGENCY_ONLY
                    PORTED_OUT -> Value.PORTED_OUT
                    PORT_OUT_PENDING -> Value.PORT_OUT_PENDING
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
                    PURCHASE_PENDING -> Known.PURCHASE_PENDING
                    PURCHASE_FAILED -> Known.PURCHASE_FAILED
                    PORT_PENDING -> Known.PORT_PENDING
                    ACTIVE -> Known.ACTIVE
                    DELETED -> Known.DELETED
                    PORT_FAILED -> Known.PORT_FAILED
                    EMERGENCY_ONLY -> Known.EMERGENCY_ONLY
                    PORTED_OUT -> Known.PORTED_OUT
                    PORT_OUT_PENDING -> Known.PORT_OUT_PENDING
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Filter by voice connection name pattern matching. */
        class VoiceConnectionName
        private constructor(
            private val contains: String?,
            private val endsWith: String?,
            private val eq: String?,
            private val startsWith: String?,
        ) {

            /** Filter contains connection name. Requires at least three characters. */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Filter ends with connection name. Requires at least three characters. */
            fun endsWith(): Optional<String> = Optional.ofNullable(endsWith)

            /** Filter by connection name. */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Filter starts with connection name. Requires at least three characters. */
            fun startsWith(): Optional<String> = Optional.ofNullable(startsWith)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [VoiceConnectionName].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [VoiceConnectionName]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var endsWith: String? = null
                private var eq: String? = null
                private var startsWith: String? = null

                @JvmSynthetic
                internal fun from(voiceConnectionName: VoiceConnectionName) = apply {
                    contains = voiceConnectionName.contains
                    endsWith = voiceConnectionName.endsWith
                    eq = voiceConnectionName.eq
                    startsWith = voiceConnectionName.startsWith
                }

                /** Filter contains connection name. Requires at least three characters. */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

                /** Filter ends with connection name. Requires at least three characters. */
                fun endsWith(endsWith: String?) = apply { this.endsWith = endsWith }

                /** Alias for calling [Builder.endsWith] with `endsWith.orElse(null)`. */
                fun endsWith(endsWith: Optional<String>) = endsWith(endsWith.getOrNull())

                /** Filter by connection name. */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /** Filter starts with connection name. Requires at least three characters. */
                fun startsWith(startsWith: String?) = apply { this.startsWith = startsWith }

                /** Alias for calling [Builder.startsWith] with `startsWith.orElse(null)`. */
                fun startsWith(startsWith: Optional<String>) = startsWith(startsWith.getOrNull())

                /**
                 * Returns an immutable instance of [VoiceConnectionName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): VoiceConnectionName =
                    VoiceConnectionName(contains, endsWith, eq, startsWith)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VoiceConnectionName &&
                    contains == other.contains &&
                    endsWith == other.endsWith &&
                    eq == other.eq &&
                    startsWith == other.startsWith
            }

            private val hashCode: Int by lazy { Objects.hash(contains, endsWith, eq, startsWith) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "VoiceConnectionName{contains=$contains, endsWith=$endsWith, eq=$eq, startsWith=$startsWith}"
        }

        /** Filter by usage_payment_method. */
        class VoiceUsagePaymentMethod
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

                @JvmField val PAY_PER_MINUTE = of("pay-per-minute")

                @JvmField val CHANNEL = of("channel")

                @JvmStatic fun of(value: String) = VoiceUsagePaymentMethod(JsonField.of(value))
            }

            /** An enum containing [VoiceUsagePaymentMethod]'s known values. */
            enum class Known {
                PAY_PER_MINUTE,
                CHANNEL,
            }

            /**
             * An enum containing [VoiceUsagePaymentMethod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [VoiceUsagePaymentMethod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAY_PER_MINUTE,
                CHANNEL,
                /**
                 * An enum member indicating that [VoiceUsagePaymentMethod] was instantiated with an
                 * unknown value.
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
                    PAY_PER_MINUTE -> Value.PAY_PER_MINUTE
                    CHANNEL -> Value.CHANNEL
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
                    PAY_PER_MINUTE -> Known.PAY_PER_MINUTE
                    CHANNEL -> Known.CHANNEL
                    else ->
                        throw TelnyxInvalidDataException("Unknown VoiceUsagePaymentMethod: $value")
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

            fun validate(): VoiceUsagePaymentMethod = apply {
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

                return other is VoiceUsagePaymentMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * When set to 'true', filters for phone numbers that do not have any tags applied. All
         * other values are ignored.
         */
        class WithoutTags @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val TRUE = of("true")

                @JvmField val FALSE = of("false")

                @JvmStatic fun of(value: String) = WithoutTags(JsonField.of(value))
            }

            /** An enum containing [WithoutTags]'s known values. */
            enum class Known {
                TRUE,
                FALSE,
            }

            /**
             * An enum containing [WithoutTags]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [WithoutTags] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TRUE,
                FALSE,
                /**
                 * An enum member indicating that [WithoutTags] was instantiated with an unknown
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
                    TRUE -> Value.TRUE
                    FALSE -> Value.FALSE
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
                    TRUE -> Known.TRUE
                    FALSE -> Known.FALSE
                    else -> throw TelnyxInvalidDataException("Unknown WithoutTags: $value")
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

            fun validate(): WithoutTags = apply {
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

                return other is WithoutTags && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                billingGroupId == other.billingGroupId &&
                connectionId == other.connectionId &&
                countryIsoAlpha2 == other.countryIsoAlpha2 &&
                customerReference == other.customerReference &&
                emergencyAddressId == other.emergencyAddressId &&
                numberType == other.numberType &&
                phoneNumber == other.phoneNumber &&
                source == other.source &&
                status == other.status &&
                tag == other.tag &&
                voiceConnectionName == other.voiceConnectionName &&
                voiceUsagePaymentMethod == other.voiceUsagePaymentMethod &&
                withoutTags == other.withoutTags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingGroupId,
                connectionId,
                countryIsoAlpha2,
                customerReference,
                emergencyAddressId,
                numberType,
                phoneNumber,
                source,
                status,
                tag,
                voiceConnectionName,
                voiceUsagePaymentMethod,
                withoutTags,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{billingGroupId=$billingGroupId, connectionId=$connectionId, countryIsoAlpha2=$countryIsoAlpha2, customerReference=$customerReference, emergencyAddressId=$emergencyAddressId, numberType=$numberType, phoneNumber=$phoneNumber, source=$source, status=$status, tag=$tag, voiceConnectionName=$voiceConnectionName, voiceUsagePaymentMethod=$voiceUsagePaymentMethod, withoutTags=$withoutTags, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    class Page
    private constructor(
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** The page number to load */
        fun number(): Optional<Long> = Optional.ofNullable(number)

        /** The size of the page */
        fun size(): Optional<Long> = Optional.ofNullable(size)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var number: Long? = null
            private var size: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                number = page.number
                size = page.size
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** The page number to load */
            fun number(number: Long?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Long) = number(number as Long?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Long>) = number(number.getOrNull())

            /** The size of the page */
            fun size(size: Long?) = apply { this.size = size }

            /**
             * Alias for [Builder.size].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun size(size: Long) = size(size as Long?)

            /** Alias for calling [Builder.size] with `size.orElse(null)`. */
            fun size(size: Optional<Long>) = size(size.getOrNull())

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
             * Returns an immutable instance of [Page].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Page = Page(number, size, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                number == other.number &&
                size == other.size &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(number, size, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{number=$number, size=$size, additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies the sort order for results. If not given, results are sorted by created_at in
     * descending order.
     */
    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PURCHASED_AT = of("purchased_at")

            @JvmField val PHONE_NUMBER = of("phone_number")

            @JvmField val CONNECTION_NAME = of("connection_name")

            @JvmField val USAGE_PAYMENT_METHOD = of("usage_payment_method")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            PURCHASED_AT,
            PHONE_NUMBER,
            CONNECTION_NAME,
            USAGE_PAYMENT_METHOD,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PURCHASED_AT,
            PHONE_NUMBER,
            CONNECTION_NAME,
            USAGE_PAYMENT_METHOD,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
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
                PURCHASED_AT -> Value.PURCHASED_AT
                PHONE_NUMBER -> Value.PHONE_NUMBER
                CONNECTION_NAME -> Value.CONNECTION_NAME
                USAGE_PAYMENT_METHOD -> Value.USAGE_PAYMENT_METHOD
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
                PURCHASED_AT -> Known.PURCHASED_AT
                PHONE_NUMBER -> Known.PHONE_NUMBER
                CONNECTION_NAME -> Known.CONNECTION_NAME
                USAGE_PAYMENT_METHOD -> Known.USAGE_PAYMENT_METHOD
                else -> throw TelnyxInvalidDataException("Unknown Sort: $value")
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

        fun validate(): Sort = apply {
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

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberListParams &&
            filter == other.filter &&
            page == other.page &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, sort, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PhoneNumberListParams{filter=$filter, page=$page, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
