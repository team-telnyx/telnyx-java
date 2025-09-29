// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardorders

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all SIM card orders according to filters. */
class SimCardOrderListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter for SIM card orders (deepObject style). Originally:
     * filter[created_at], filter[updated_at], filter[quantity], filter[cost.amount],
     * filter[cost.currency], filter[address.id], filter[address.street_address],
     * filter[address.extended_address], filter[address.locality],
     * filter[address.administrative_area], filter[address.country_code],
     * filter[address.postal_code]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /**
     * Consolidated pagination parameter (deepObject style). Originally: page[number], page[size]
     */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SimCardOrderListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SimCardOrderListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardOrderListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(simCardOrderListParams: SimCardOrderListParams) = apply {
            filter = simCardOrderListParams.filter
            page = simCardOrderListParams.page
            additionalHeaders = simCardOrderListParams.additionalHeaders.toBuilder()
            additionalQueryParams = simCardOrderListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter for SIM card orders (deepObject style). Originally:
         * filter[created_at], filter[updated_at], filter[quantity], filter[cost.amount],
         * filter[cost.currency], filter[address.id], filter[address.street_address],
         * filter[address.extended_address], filter[address.locality],
         * filter[address.administrative_area], filter[address.country_code],
         * filter[address.postal_code]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Consolidated pagination parameter (deepObject style). Originally: page[number],
         * page[size]
         */
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
         * Returns an immutable instance of [SimCardOrderListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardOrderListParams =
            SimCardOrderListParams(
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
                    it.address().ifPresent {
                        it.id().ifPresent { put("filter[address][id]", it) }
                        it.administrativeArea().ifPresent {
                            put("filter[address][administrative_area]", it)
                        }
                        it.countryCode().ifPresent { put("filter[address][country_code]", it) }
                        it.extendedAddress().ifPresent {
                            put("filter[address][extended_address]", it)
                        }
                        it.locality().ifPresent { put("filter[address][locality]", it) }
                        it.postalCode().ifPresent { put("filter[address][postal_code]", it) }
                        it.streetAddress().ifPresent { put("filter[address][street_address]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[address][$key]", value)
                            }
                        }
                    }
                    it.cost().ifPresent {
                        it.amount().ifPresent { put("filter[cost][amount]", it) }
                        it.currency().ifPresent { put("filter[cost][currency]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[cost][$key]", value)
                            }
                        }
                    }
                    it.createdAt().ifPresent {
                        put("filter[created_at]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
                    it.quantity().ifPresent { put("filter[quantity]", it.toString()) }
                    it.updatedAt().ifPresent {
                        put("filter[updated_at]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                    }
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
     * Consolidated filter parameter for SIM card orders (deepObject style). Originally:
     * filter[created_at], filter[updated_at], filter[quantity], filter[cost.amount],
     * filter[cost.currency], filter[address.id], filter[address.street_address],
     * filter[address.extended_address], filter[address.locality],
     * filter[address.administrative_area], filter[address.country_code],
     * filter[address.postal_code]
     */
    class Filter
    private constructor(
        private val address: Address?,
        private val cost: Cost?,
        private val createdAt: OffsetDateTime?,
        private val quantity: Long?,
        private val updatedAt: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        fun address(): Optional<Address> = Optional.ofNullable(address)

        fun cost(): Optional<Cost> = Optional.ofNullable(cost)

        /** Filter by ISO 8601 formatted date-time string matching resource creation date-time. */
        fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

        /** Filter orders by how many SIM cards were ordered. */
        fun quantity(): Optional<Long> = Optional.ofNullable(quantity)

        /**
         * Filter by ISO 8601 formatted date-time string matching resource last update date-time.
         */
        fun updatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAt)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var address: Address? = null
            private var cost: Cost? = null
            private var createdAt: OffsetDateTime? = null
            private var quantity: Long? = null
            private var updatedAt: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                address = filter.address
                cost = filter.cost
                createdAt = filter.createdAt
                quantity = filter.quantity
                updatedAt = filter.updatedAt
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun address(address: Address?) = apply { this.address = address }

            /** Alias for calling [Builder.address] with `address.orElse(null)`. */
            fun address(address: Optional<Address>) = address(address.getOrNull())

            fun cost(cost: Cost?) = apply { this.cost = cost }

            /** Alias for calling [Builder.cost] with `cost.orElse(null)`. */
            fun cost(cost: Optional<Cost>) = cost(cost.getOrNull())

            /**
             * Filter by ISO 8601 formatted date-time string matching resource creation date-time.
             */
            fun createdAt(createdAt: OffsetDateTime?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

            /** Filter orders by how many SIM cards were ordered. */
            fun quantity(quantity: Long?) = apply { this.quantity = quantity }

            /**
             * Alias for [Builder.quantity].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun quantity(quantity: Long) = quantity(quantity as Long?)

            /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
            fun quantity(quantity: Optional<Long>) = quantity(quantity.getOrNull())

            /**
             * Filter by ISO 8601 formatted date-time string matching resource last update
             * date-time.
             */
            fun updatedAt(updatedAt: OffsetDateTime?) = apply { this.updatedAt = updatedAt }

            /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
            fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

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
                Filter(address, cost, createdAt, quantity, updatedAt, additionalProperties.build())
        }

        class Address
        private constructor(
            private val id: String?,
            private val administrativeArea: String?,
            private val countryCode: String?,
            private val extendedAddress: String?,
            private val locality: String?,
            private val postalCode: String?,
            private val streetAddress: String?,
        ) {

            /** Uniquely identifies the address for the order. */
            fun id(): Optional<String> = Optional.ofNullable(id)

            /** Filter by state or province where the address is located. */
            fun administrativeArea(): Optional<String> = Optional.ofNullable(administrativeArea)

            /**
             * Filter by the mobile operator two-character (ISO 3166-1 alpha-2) origin country code.
             */
            fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

            /**
             * Returns entries with matching name of the supplemental field for address information.
             */
            fun extendedAddress(): Optional<String> = Optional.ofNullable(extendedAddress)

            /** Filter by the name of the city where the address is located. */
            fun locality(): Optional<String> = Optional.ofNullable(locality)

            /** Filter by postal code for the address. */
            fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

            /** Returns entries with matching name of the street where the address is located. */
            fun streetAddress(): Optional<String> = Optional.ofNullable(streetAddress)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Address]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Address]. */
            class Builder internal constructor() {

                private var id: String? = null
                private var administrativeArea: String? = null
                private var countryCode: String? = null
                private var extendedAddress: String? = null
                private var locality: String? = null
                private var postalCode: String? = null
                private var streetAddress: String? = null

                @JvmSynthetic
                internal fun from(address: Address) = apply {
                    id = address.id
                    administrativeArea = address.administrativeArea
                    countryCode = address.countryCode
                    extendedAddress = address.extendedAddress
                    locality = address.locality
                    postalCode = address.postalCode
                    streetAddress = address.streetAddress
                }

                /** Uniquely identifies the address for the order. */
                fun id(id: String?) = apply { this.id = id }

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /** Filter by state or province where the address is located. */
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
                 * Filter by the mobile operator two-character (ISO 3166-1 alpha-2) origin country
                 * code.
                 */
                fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

                /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
                fun countryCode(countryCode: Optional<String>) =
                    countryCode(countryCode.getOrNull())

                /**
                 * Returns entries with matching name of the supplemental field for address
                 * information.
                 */
                fun extendedAddress(extendedAddress: String?) = apply {
                    this.extendedAddress = extendedAddress
                }

                /**
                 * Alias for calling [Builder.extendedAddress] with `extendedAddress.orElse(null)`.
                 */
                fun extendedAddress(extendedAddress: Optional<String>) =
                    extendedAddress(extendedAddress.getOrNull())

                /** Filter by the name of the city where the address is located. */
                fun locality(locality: String?) = apply { this.locality = locality }

                /** Alias for calling [Builder.locality] with `locality.orElse(null)`. */
                fun locality(locality: Optional<String>) = locality(locality.getOrNull())

                /** Filter by postal code for the address. */
                fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

                /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
                fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

                /**
                 * Returns entries with matching name of the street where the address is located.
                 */
                fun streetAddress(streetAddress: String?) = apply {
                    this.streetAddress = streetAddress
                }

                /** Alias for calling [Builder.streetAddress] with `streetAddress.orElse(null)`. */
                fun streetAddress(streetAddress: Optional<String>) =
                    streetAddress(streetAddress.getOrNull())

                /**
                 * Returns an immutable instance of [Address].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Address =
                    Address(
                        id,
                        administrativeArea,
                        countryCode,
                        extendedAddress,
                        locality,
                        postalCode,
                        streetAddress,
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Address &&
                    id == other.id &&
                    administrativeArea == other.administrativeArea &&
                    countryCode == other.countryCode &&
                    extendedAddress == other.extendedAddress &&
                    locality == other.locality &&
                    postalCode == other.postalCode &&
                    streetAddress == other.streetAddress
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    administrativeArea,
                    countryCode,
                    extendedAddress,
                    locality,
                    postalCode,
                    streetAddress,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Address{id=$id, administrativeArea=$administrativeArea, countryCode=$countryCode, extendedAddress=$extendedAddress, locality=$locality, postalCode=$postalCode, streetAddress=$streetAddress}"
        }

        class Cost private constructor(private val amount: String?, private val currency: String?) {

            /** The total monetary amount of the order. */
            fun amount(): Optional<String> = Optional.ofNullable(amount)

            /** Filter by ISO 4217 currency string. */
            fun currency(): Optional<String> = Optional.ofNullable(currency)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Cost]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cost]. */
            class Builder internal constructor() {

                private var amount: String? = null
                private var currency: String? = null

                @JvmSynthetic
                internal fun from(cost: Cost) = apply {
                    amount = cost.amount
                    currency = cost.currency
                }

                /** The total monetary amount of the order. */
                fun amount(amount: String?) = apply { this.amount = amount }

                /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
                fun amount(amount: Optional<String>) = amount(amount.getOrNull())

                /** Filter by ISO 4217 currency string. */
                fun currency(currency: String?) = apply { this.currency = currency }

                /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
                fun currency(currency: Optional<String>) = currency(currency.getOrNull())

                /**
                 * Returns an immutable instance of [Cost].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Cost = Cost(amount, currency)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cost && amount == other.amount && currency == other.currency
            }

            private val hashCode: Int by lazy { Objects.hash(amount, currency) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Cost{amount=$amount, currency=$currency}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                address == other.address &&
                cost == other.cost &&
                createdAt == other.createdAt &&
                quantity == other.quantity &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(address, cost, createdAt, quantity, updatedAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{address=$address, cost=$cost, createdAt=$createdAt, quantity=$quantity, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Consolidated pagination parameter (deepObject style). Originally: page[number], page[size]
     */
    class Page
    private constructor(
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** The page number to load. */
        fun number(): Optional<Long> = Optional.ofNullable(number)

        /** The size of the page. */
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

            /** The page number to load. */
            fun number(number: Long?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Long) = number(number as Long?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Long>) = number(number.getOrNull())

            /** The size of the page. */
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

        return other is SimCardOrderListParams &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SimCardOrderListParams{filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
