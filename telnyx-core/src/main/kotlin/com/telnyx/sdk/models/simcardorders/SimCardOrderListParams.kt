// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardorders

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all SIM card orders according to filters. */
class SimCardOrderListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
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

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

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
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(simCardOrderListParams: SimCardOrderListParams) = apply {
            filter = simCardOrderListParams.filter
            pageNumber = simCardOrderListParams.pageNumber
            pageSize = simCardOrderListParams.pageSize
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

        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.addressAdministrativeArea().ifPresent {
                        put("filter[address.administrative_area]", it)
                    }
                    it.addressCountryCode().ifPresent { put("filter[address.country_code]", it) }
                    it.addressExtendedAddress().ifPresent {
                        put("filter[address.extended_address]", it)
                    }
                    it.addressId().ifPresent { put("filter[address.id]", it) }
                    it.addressLocality().ifPresent { put("filter[address.locality]", it) }
                    it.addressPostalCode().ifPresent { put("filter[address.postal_code]", it) }
                    it.addressStreetAddress().ifPresent {
                        put("filter[address.street_address]", it)
                    }
                    it.costAmount().ifPresent { put("filter[cost.amount]", it) }
                    it.costCurrency().ifPresent { put("filter[cost.currency]", it) }
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
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
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
        private val addressAdministrativeArea: String?,
        private val addressCountryCode: String?,
        private val addressExtendedAddress: String?,
        private val addressId: String?,
        private val addressLocality: String?,
        private val addressPostalCode: String?,
        private val addressStreetAddress: String?,
        private val costAmount: String?,
        private val costCurrency: String?,
        private val createdAt: OffsetDateTime?,
        private val quantity: Long?,
        private val updatedAt: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by state or province where the address is located. */
        fun addressAdministrativeArea(): Optional<String> =
            Optional.ofNullable(addressAdministrativeArea)

        /** Filter by the mobile operator two-character (ISO 3166-1 alpha-2) origin country code. */
        fun addressCountryCode(): Optional<String> = Optional.ofNullable(addressCountryCode)

        /** Returns entries with matching name of the supplemental field for address information. */
        fun addressExtendedAddress(): Optional<String> = Optional.ofNullable(addressExtendedAddress)

        /** Uniquely identifies the address for the order. */
        fun addressId(): Optional<String> = Optional.ofNullable(addressId)

        /** Filter by the name of the city where the address is located. */
        fun addressLocality(): Optional<String> = Optional.ofNullable(addressLocality)

        /** Filter by postal code for the address. */
        fun addressPostalCode(): Optional<String> = Optional.ofNullable(addressPostalCode)

        /** Returns entries with matching name of the street where the address is located. */
        fun addressStreetAddress(): Optional<String> = Optional.ofNullable(addressStreetAddress)

        /** The total monetary amount of the order. */
        fun costAmount(): Optional<String> = Optional.ofNullable(costAmount)

        /** Filter by ISO 4217 currency string. */
        fun costCurrency(): Optional<String> = Optional.ofNullable(costCurrency)

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

            private var addressAdministrativeArea: String? = null
            private var addressCountryCode: String? = null
            private var addressExtendedAddress: String? = null
            private var addressId: String? = null
            private var addressLocality: String? = null
            private var addressPostalCode: String? = null
            private var addressStreetAddress: String? = null
            private var costAmount: String? = null
            private var costCurrency: String? = null
            private var createdAt: OffsetDateTime? = null
            private var quantity: Long? = null
            private var updatedAt: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                addressAdministrativeArea = filter.addressAdministrativeArea
                addressCountryCode = filter.addressCountryCode
                addressExtendedAddress = filter.addressExtendedAddress
                addressId = filter.addressId
                addressLocality = filter.addressLocality
                addressPostalCode = filter.addressPostalCode
                addressStreetAddress = filter.addressStreetAddress
                costAmount = filter.costAmount
                costCurrency = filter.costCurrency
                createdAt = filter.createdAt
                quantity = filter.quantity
                updatedAt = filter.updatedAt
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by state or province where the address is located. */
            fun addressAdministrativeArea(addressAdministrativeArea: String?) = apply {
                this.addressAdministrativeArea = addressAdministrativeArea
            }

            /**
             * Alias for calling [Builder.addressAdministrativeArea] with
             * `addressAdministrativeArea.orElse(null)`.
             */
            fun addressAdministrativeArea(addressAdministrativeArea: Optional<String>) =
                addressAdministrativeArea(addressAdministrativeArea.getOrNull())

            /**
             * Filter by the mobile operator two-character (ISO 3166-1 alpha-2) origin country code.
             */
            fun addressCountryCode(addressCountryCode: String?) = apply {
                this.addressCountryCode = addressCountryCode
            }

            /**
             * Alias for calling [Builder.addressCountryCode] with
             * `addressCountryCode.orElse(null)`.
             */
            fun addressCountryCode(addressCountryCode: Optional<String>) =
                addressCountryCode(addressCountryCode.getOrNull())

            /**
             * Returns entries with matching name of the supplemental field for address information.
             */
            fun addressExtendedAddress(addressExtendedAddress: String?) = apply {
                this.addressExtendedAddress = addressExtendedAddress
            }

            /**
             * Alias for calling [Builder.addressExtendedAddress] with
             * `addressExtendedAddress.orElse(null)`.
             */
            fun addressExtendedAddress(addressExtendedAddress: Optional<String>) =
                addressExtendedAddress(addressExtendedAddress.getOrNull())

            /** Uniquely identifies the address for the order. */
            fun addressId(addressId: String?) = apply { this.addressId = addressId }

            /** Alias for calling [Builder.addressId] with `addressId.orElse(null)`. */
            fun addressId(addressId: Optional<String>) = addressId(addressId.getOrNull())

            /** Filter by the name of the city where the address is located. */
            fun addressLocality(addressLocality: String?) = apply {
                this.addressLocality = addressLocality
            }

            /** Alias for calling [Builder.addressLocality] with `addressLocality.orElse(null)`. */
            fun addressLocality(addressLocality: Optional<String>) =
                addressLocality(addressLocality.getOrNull())

            /** Filter by postal code for the address. */
            fun addressPostalCode(addressPostalCode: String?) = apply {
                this.addressPostalCode = addressPostalCode
            }

            /**
             * Alias for calling [Builder.addressPostalCode] with `addressPostalCode.orElse(null)`.
             */
            fun addressPostalCode(addressPostalCode: Optional<String>) =
                addressPostalCode(addressPostalCode.getOrNull())

            /** Returns entries with matching name of the street where the address is located. */
            fun addressStreetAddress(addressStreetAddress: String?) = apply {
                this.addressStreetAddress = addressStreetAddress
            }

            /**
             * Alias for calling [Builder.addressStreetAddress] with
             * `addressStreetAddress.orElse(null)`.
             */
            fun addressStreetAddress(addressStreetAddress: Optional<String>) =
                addressStreetAddress(addressStreetAddress.getOrNull())

            /** The total monetary amount of the order. */
            fun costAmount(costAmount: String?) = apply { this.costAmount = costAmount }

            /** Alias for calling [Builder.costAmount] with `costAmount.orElse(null)`. */
            fun costAmount(costAmount: Optional<String>) = costAmount(costAmount.getOrNull())

            /** Filter by ISO 4217 currency string. */
            fun costCurrency(costCurrency: String?) = apply { this.costCurrency = costCurrency }

            /** Alias for calling [Builder.costCurrency] with `costCurrency.orElse(null)`. */
            fun costCurrency(costCurrency: Optional<String>) =
                costCurrency(costCurrency.getOrNull())

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
                Filter(
                    addressAdministrativeArea,
                    addressCountryCode,
                    addressExtendedAddress,
                    addressId,
                    addressLocality,
                    addressPostalCode,
                    addressStreetAddress,
                    costAmount,
                    costCurrency,
                    createdAt,
                    quantity,
                    updatedAt,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                addressAdministrativeArea == other.addressAdministrativeArea &&
                addressCountryCode == other.addressCountryCode &&
                addressExtendedAddress == other.addressExtendedAddress &&
                addressId == other.addressId &&
                addressLocality == other.addressLocality &&
                addressPostalCode == other.addressPostalCode &&
                addressStreetAddress == other.addressStreetAddress &&
                costAmount == other.costAmount &&
                costCurrency == other.costCurrency &&
                createdAt == other.createdAt &&
                quantity == other.quantity &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addressAdministrativeArea,
                addressCountryCode,
                addressExtendedAddress,
                addressId,
                addressLocality,
                addressPostalCode,
                addressStreetAddress,
                costAmount,
                costCurrency,
                createdAt,
                quantity,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{addressAdministrativeArea=$addressAdministrativeArea, addressCountryCode=$addressCountryCode, addressExtendedAddress=$addressExtendedAddress, addressId=$addressId, addressLocality=$addressLocality, addressPostalCode=$addressPostalCode, addressStreetAddress=$addressStreetAddress, costAmount=$costAmount, costCurrency=$costCurrency, createdAt=$createdAt, quantity=$quantity, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardOrderListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SimCardOrderListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
