// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portouts

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.api.core.Enum
import com.telnyx.api.core.JsonField
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import com.telnyx.api.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns the portout requests according to filters */
class PortoutListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[carrier_name],
     * filter[country_code], filter[country_code_in], filter[foc_date], filter[inserted_at],
     * filter[phone_number], filter[pon], filter[ported_out_at], filter[spid], filter[status],
     * filter[status_in], filter[support_key]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PortoutListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PortoutListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortoutListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(portoutListParams: PortoutListParams) = apply {
            filter = portoutListParams.filter
            page = portoutListParams.page
            additionalHeaders = portoutListParams.additionalHeaders.toBuilder()
            additionalQueryParams = portoutListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[carrier_name],
         * filter[country_code], filter[country_code_in], filter[foc_date], filter[inserted_at],
         * filter[phone_number], filter[pon], filter[ported_out_at], filter[spid], filter[status],
         * filter[status_in], filter[support_key]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

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
         * Returns an immutable instance of [PortoutListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PortoutListParams =
            PortoutListParams(
                filter,
                page,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.carrierName().ifPresent { put("filter[carrier_name]", it) }
                    it.countryCode().ifPresent { put("filter[country_code]", it) }
                    it.countryCodeIn().ifPresent {
                        put("filter[country_code_in]", it.joinToString(","))
                    }
                    it.focDate().ifPresent {
                        put("filter[foc_date]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.insertedAt().ifPresent {
                        it.gte().ifPresent {
                            put(
                                "filter[inserted_at][gte]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it.lte().ifPresent {
                            put(
                                "filter[inserted_at][lte]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[inserted_at][$key]", value)
                            }
                        }
                    }
                    it.phoneNumber().ifPresent { put("filter[phone_number]", it) }
                    it.pon().ifPresent { put("filter[pon]", it) }
                    it.portedOutAt().ifPresent {
                        it.gte().ifPresent {
                            put(
                                "filter[ported_out_at][gte]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it.lte().ifPresent {
                            put(
                                "filter[ported_out_at][lte]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[ported_out_at][$key]", value)
                            }
                        }
                    }
                    it.spid().ifPresent { put("filter[spid]", it) }
                    it.status().ifPresent { put("filter[status]", it.toString()) }
                    it.statusIn().ifPresent {
                        put("filter[status_in]", it.joinToString(",") { it.toString() })
                    }
                    it.supportKey().ifPresent { put("filter[support_key]", it) }
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
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[carrier_name],
     * filter[country_code], filter[country_code_in], filter[foc_date], filter[inserted_at],
     * filter[phone_number], filter[pon], filter[ported_out_at], filter[spid], filter[status],
     * filter[status_in], filter[support_key]
     */
    class Filter
    private constructor(
        private val carrierName: String?,
        private val countryCode: String?,
        private val countryCodeIn: List<String>?,
        private val focDate: OffsetDateTime?,
        private val insertedAt: InsertedAt?,
        private val phoneNumber: String?,
        private val pon: String?,
        private val portedOutAt: PortedOutAt?,
        private val spid: String?,
        private val status: Status?,
        private val statusIn: List<StatusIn>?,
        private val supportKey: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by new carrier name. */
        fun carrierName(): Optional<String> = Optional.ofNullable(carrierName)

        /** Filter by 2-letter country code */
        fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

        /** Filter by a list of 2-letter country codes */
        fun countryCodeIn(): Optional<List<String>> = Optional.ofNullable(countryCodeIn)

        /** Filter by foc_date. Matches all portouts with the same date */
        fun focDate(): Optional<OffsetDateTime> = Optional.ofNullable(focDate)

        /** Filter by inserted_at date range using nested operations */
        fun insertedAt(): Optional<InsertedAt> = Optional.ofNullable(insertedAt)

        /** Filter by a phone number on the portout. Matches all portouts with the phone number */
        fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

        /** Filter by Port Order Number (PON). */
        fun pon(): Optional<String> = Optional.ofNullable(pon)

        /** Filter by ported_out_at date range using nested operations */
        fun portedOutAt(): Optional<PortedOutAt> = Optional.ofNullable(portedOutAt)

        /** Filter by new carrier spid. */
        fun spid(): Optional<String> = Optional.ofNullable(spid)

        /** Filter by portout status. */
        fun status(): Optional<Status> = Optional.ofNullable(status)

        /** Filter by a list of portout statuses */
        fun statusIn(): Optional<List<StatusIn>> = Optional.ofNullable(statusIn)

        /** Filter by the portout's support_key */
        fun supportKey(): Optional<String> = Optional.ofNullable(supportKey)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var carrierName: String? = null
            private var countryCode: String? = null
            private var countryCodeIn: MutableList<String>? = null
            private var focDate: OffsetDateTime? = null
            private var insertedAt: InsertedAt? = null
            private var phoneNumber: String? = null
            private var pon: String? = null
            private var portedOutAt: PortedOutAt? = null
            private var spid: String? = null
            private var status: Status? = null
            private var statusIn: MutableList<StatusIn>? = null
            private var supportKey: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                carrierName = filter.carrierName
                countryCode = filter.countryCode
                countryCodeIn = filter.countryCodeIn?.toMutableList()
                focDate = filter.focDate
                insertedAt = filter.insertedAt
                phoneNumber = filter.phoneNumber
                pon = filter.pon
                portedOutAt = filter.portedOutAt
                spid = filter.spid
                status = filter.status
                statusIn = filter.statusIn?.toMutableList()
                supportKey = filter.supportKey
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by new carrier name. */
            fun carrierName(carrierName: String?) = apply { this.carrierName = carrierName }

            /** Alias for calling [Builder.carrierName] with `carrierName.orElse(null)`. */
            fun carrierName(carrierName: Optional<String>) = carrierName(carrierName.getOrNull())

            /** Filter by 2-letter country code */
            fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

            /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
            fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

            /** Filter by a list of 2-letter country codes */
            fun countryCodeIn(countryCodeIn: List<String>?) = apply {
                this.countryCodeIn = countryCodeIn?.toMutableList()
            }

            /** Alias for calling [Builder.countryCodeIn] with `countryCodeIn.orElse(null)`. */
            fun countryCodeIn(countryCodeIn: Optional<List<String>>) =
                countryCodeIn(countryCodeIn.getOrNull())

            /**
             * Adds a single [String] to [Builder.countryCodeIn].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountryCodeIn(countryCodeIn: String) = apply {
                this.countryCodeIn =
                    (this.countryCodeIn ?: mutableListOf()).apply { add(countryCodeIn) }
            }

            /** Filter by foc_date. Matches all portouts with the same date */
            fun focDate(focDate: OffsetDateTime?) = apply { this.focDate = focDate }

            /** Alias for calling [Builder.focDate] with `focDate.orElse(null)`. */
            fun focDate(focDate: Optional<OffsetDateTime>) = focDate(focDate.getOrNull())

            /** Filter by inserted_at date range using nested operations */
            fun insertedAt(insertedAt: InsertedAt?) = apply { this.insertedAt = insertedAt }

            /** Alias for calling [Builder.insertedAt] with `insertedAt.orElse(null)`. */
            fun insertedAt(insertedAt: Optional<InsertedAt>) = insertedAt(insertedAt.getOrNull())

            /**
             * Filter by a phone number on the portout. Matches all portouts with the phone number
             */
            fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

            /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
            fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

            /** Filter by Port Order Number (PON). */
            fun pon(pon: String?) = apply { this.pon = pon }

            /** Alias for calling [Builder.pon] with `pon.orElse(null)`. */
            fun pon(pon: Optional<String>) = pon(pon.getOrNull())

            /** Filter by ported_out_at date range using nested operations */
            fun portedOutAt(portedOutAt: PortedOutAt?) = apply { this.portedOutAt = portedOutAt }

            /** Alias for calling [Builder.portedOutAt] with `portedOutAt.orElse(null)`. */
            fun portedOutAt(portedOutAt: Optional<PortedOutAt>) =
                portedOutAt(portedOutAt.getOrNull())

            /** Filter by new carrier spid. */
            fun spid(spid: String?) = apply { this.spid = spid }

            /** Alias for calling [Builder.spid] with `spid.orElse(null)`. */
            fun spid(spid: Optional<String>) = spid(spid.getOrNull())

            /** Filter by portout status. */
            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /** Filter by a list of portout statuses */
            fun statusIn(statusIn: List<StatusIn>?) = apply {
                this.statusIn = statusIn?.toMutableList()
            }

            /** Alias for calling [Builder.statusIn] with `statusIn.orElse(null)`. */
            fun statusIn(statusIn: Optional<List<StatusIn>>) = statusIn(statusIn.getOrNull())

            /**
             * Adds a single [StatusIn] to [Builder.statusIn].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatusIn(statusIn: StatusIn) = apply {
                this.statusIn = (this.statusIn ?: mutableListOf()).apply { add(statusIn) }
            }

            /** Filter by the portout's support_key */
            fun supportKey(supportKey: String?) = apply { this.supportKey = supportKey }

            /** Alias for calling [Builder.supportKey] with `supportKey.orElse(null)`. */
            fun supportKey(supportKey: Optional<String>) = supportKey(supportKey.getOrNull())

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
                    carrierName,
                    countryCode,
                    countryCodeIn?.toImmutable(),
                    focDate,
                    insertedAt,
                    phoneNumber,
                    pon,
                    portedOutAt,
                    spid,
                    status,
                    statusIn?.toImmutable(),
                    supportKey,
                    additionalProperties.build(),
                )
        }

        /** Filter by inserted_at date range using nested operations */
        class InsertedAt
        private constructor(private val gte: OffsetDateTime?, private val lte: OffsetDateTime?) {

            /** Filter by inserted_at date greater than or equal. */
            fun gte(): Optional<OffsetDateTime> = Optional.ofNullable(gte)

            /** Filter by inserted_at date less than or equal. */
            fun lte(): Optional<OffsetDateTime> = Optional.ofNullable(lte)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [InsertedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InsertedAt]. */
            class Builder internal constructor() {

                private var gte: OffsetDateTime? = null
                private var lte: OffsetDateTime? = null

                @JvmSynthetic
                internal fun from(insertedAt: InsertedAt) = apply {
                    gte = insertedAt.gte
                    lte = insertedAt.lte
                }

                /** Filter by inserted_at date greater than or equal. */
                fun gte(gte: OffsetDateTime?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<OffsetDateTime>) = gte(gte.getOrNull())

                /** Filter by inserted_at date less than or equal. */
                fun lte(lte: OffsetDateTime?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<OffsetDateTime>) = lte(lte.getOrNull())

                /**
                 * Returns an immutable instance of [InsertedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InsertedAt = InsertedAt(gte, lte)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InsertedAt && gte == other.gte && lte == other.lte
            }

            private val hashCode: Int by lazy { Objects.hash(gte, lte) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "InsertedAt{gte=$gte, lte=$lte}"
        }

        /** Filter by ported_out_at date range using nested operations */
        class PortedOutAt
        private constructor(private val gte: OffsetDateTime?, private val lte: OffsetDateTime?) {

            /** Filter by ported_out_at date greater than or equal. */
            fun gte(): Optional<OffsetDateTime> = Optional.ofNullable(gte)

            /** Filter by ported_out_at date less than or equal. */
            fun lte(): Optional<OffsetDateTime> = Optional.ofNullable(lte)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [PortedOutAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PortedOutAt]. */
            class Builder internal constructor() {

                private var gte: OffsetDateTime? = null
                private var lte: OffsetDateTime? = null

                @JvmSynthetic
                internal fun from(portedOutAt: PortedOutAt) = apply {
                    gte = portedOutAt.gte
                    lte = portedOutAt.lte
                }

                /** Filter by ported_out_at date greater than or equal. */
                fun gte(gte: OffsetDateTime?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<OffsetDateTime>) = gte(gte.getOrNull())

                /** Filter by ported_out_at date less than or equal. */
                fun lte(lte: OffsetDateTime?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<OffsetDateTime>) = lte(lte.getOrNull())

                /**
                 * Returns an immutable instance of [PortedOutAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PortedOutAt = PortedOutAt(gte, lte)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PortedOutAt && gte == other.gte && lte == other.lte
            }

            private val hashCode: Int by lazy { Objects.hash(gte, lte) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "PortedOutAt{gte=$gte, lte=$lte}"
        }

        /** Filter by portout status. */
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

                @JvmField val PENDING = of("pending")

                @JvmField val AUTHORIZED = of("authorized")

                @JvmField val PORTED = of("ported")

                @JvmField val REJECTED = of("rejected")

                @JvmField val REJECTED_PENDING = of("rejected-pending")

                @JvmField val CANCELED = of("canceled")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                AUTHORIZED,
                PORTED,
                REJECTED,
                REJECTED_PENDING,
                CANCELED,
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
                PENDING,
                AUTHORIZED,
                PORTED,
                REJECTED,
                REJECTED_PENDING,
                CANCELED,
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
                    PENDING -> Value.PENDING
                    AUTHORIZED -> Value.AUTHORIZED
                    PORTED -> Value.PORTED
                    REJECTED -> Value.REJECTED
                    REJECTED_PENDING -> Value.REJECTED_PENDING
                    CANCELED -> Value.CANCELED
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
                    PENDING -> Known.PENDING
                    AUTHORIZED -> Known.AUTHORIZED
                    PORTED -> Known.PORTED
                    REJECTED -> Known.REJECTED
                    REJECTED_PENDING -> Known.REJECTED_PENDING
                    CANCELED -> Known.CANCELED
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

        class StatusIn @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val PENDING = of("pending")

                @JvmField val AUTHORIZED = of("authorized")

                @JvmField val PORTED = of("ported")

                @JvmField val REJECTED = of("rejected")

                @JvmField val REJECTED_PENDING = of("rejected-pending")

                @JvmField val CANCELED = of("canceled")

                @JvmStatic fun of(value: String) = StatusIn(JsonField.of(value))
            }

            /** An enum containing [StatusIn]'s known values. */
            enum class Known {
                PENDING,
                AUTHORIZED,
                PORTED,
                REJECTED,
                REJECTED_PENDING,
                CANCELED,
            }

            /**
             * An enum containing [StatusIn]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [StatusIn] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                AUTHORIZED,
                PORTED,
                REJECTED,
                REJECTED_PENDING,
                CANCELED,
                /**
                 * An enum member indicating that [StatusIn] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    AUTHORIZED -> Value.AUTHORIZED
                    PORTED -> Value.PORTED
                    REJECTED -> Value.REJECTED
                    REJECTED_PENDING -> Value.REJECTED_PENDING
                    CANCELED -> Value.CANCELED
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
                    PENDING -> Known.PENDING
                    AUTHORIZED -> Known.AUTHORIZED
                    PORTED -> Known.PORTED
                    REJECTED -> Known.REJECTED
                    REJECTED_PENDING -> Known.REJECTED_PENDING
                    CANCELED -> Known.CANCELED
                    else -> throw TelnyxInvalidDataException("Unknown StatusIn: $value")
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

            fun validate(): StatusIn = apply {
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

                return other is StatusIn && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                carrierName == other.carrierName &&
                countryCode == other.countryCode &&
                countryCodeIn == other.countryCodeIn &&
                focDate == other.focDate &&
                insertedAt == other.insertedAt &&
                phoneNumber == other.phoneNumber &&
                pon == other.pon &&
                portedOutAt == other.portedOutAt &&
                spid == other.spid &&
                status == other.status &&
                statusIn == other.statusIn &&
                supportKey == other.supportKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                carrierName,
                countryCode,
                countryCodeIn,
                focDate,
                insertedAt,
                phoneNumber,
                pon,
                portedOutAt,
                spid,
                status,
                statusIn,
                supportKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{carrierName=$carrierName, countryCode=$countryCode, countryCodeIn=$countryCodeIn, focDate=$focDate, insertedAt=$insertedAt, phoneNumber=$phoneNumber, pon=$pon, portedOutAt=$portedOutAt, spid=$spid, status=$status, statusIn=$statusIn, supportKey=$supportKey, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortoutListParams &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PortoutListParams{filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
