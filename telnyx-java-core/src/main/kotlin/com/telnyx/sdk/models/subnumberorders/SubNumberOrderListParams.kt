// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.subnumberorders

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a paginated list of sub number orders. */
class SubNumberOrderListParams
private constructor(
    private val filter: Filter?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[status],
     * filter[order_request_id], filter[country_code], filter[phone_number_type],
     * filter[phone_numbers_count]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubNumberOrderListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubNumberOrderListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubNumberOrderListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subNumberOrderListParams: SubNumberOrderListParams) = apply {
            filter = subNumberOrderListParams.filter
            additionalHeaders = subNumberOrderListParams.additionalHeaders.toBuilder()
            additionalQueryParams = subNumberOrderListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[status],
         * filter[order_request_id], filter[country_code], filter[phone_number_type],
         * filter[phone_numbers_count]
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
         * Returns an immutable instance of [SubNumberOrderListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubNumberOrderListParams =
            SubNumberOrderListParams(
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
                    it.countryCode().ifPresent { put("filter[country_code]", it) }
                    it.orderRequestId().ifPresent { put("filter[order_request_id]", it) }
                    it.phoneNumberType().ifPresent { put("filter[phone_number_type]", it) }
                    it.phoneNumbersCount().ifPresent {
                        put("filter[phone_numbers_count]", it.toString())
                    }
                    it.status().ifPresent { put("filter[status]", it) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[status],
     * filter[order_request_id], filter[country_code], filter[phone_number_type],
     * filter[phone_numbers_count]
     */
    class Filter
    private constructor(
        private val countryCode: String?,
        private val orderRequestId: String?,
        private val phoneNumberType: String?,
        private val phoneNumbersCount: Long?,
        private val status: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** ISO alpha-2 country code. */
        fun countryCode(): Optional<String> = Optional.ofNullable(countryCode)

        /** ID of the number order the sub number order belongs to */
        fun orderRequestId(): Optional<String> = Optional.ofNullable(orderRequestId)

        /** Phone Number Type */
        fun phoneNumberType(): Optional<String> = Optional.ofNullable(phoneNumberType)

        /** Amount of numbers in the sub number order */
        fun phoneNumbersCount(): Optional<Long> = Optional.ofNullable(phoneNumbersCount)

        /** Filter sub number orders by status. */
        fun status(): Optional<String> = Optional.ofNullable(status)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var countryCode: String? = null
            private var orderRequestId: String? = null
            private var phoneNumberType: String? = null
            private var phoneNumbersCount: Long? = null
            private var status: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                countryCode = filter.countryCode
                orderRequestId = filter.orderRequestId
                phoneNumberType = filter.phoneNumberType
                phoneNumbersCount = filter.phoneNumbersCount
                status = filter.status
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** ISO alpha-2 country code. */
            fun countryCode(countryCode: String?) = apply { this.countryCode = countryCode }

            /** Alias for calling [Builder.countryCode] with `countryCode.orElse(null)`. */
            fun countryCode(countryCode: Optional<String>) = countryCode(countryCode.getOrNull())

            /** ID of the number order the sub number order belongs to */
            fun orderRequestId(orderRequestId: String?) = apply {
                this.orderRequestId = orderRequestId
            }

            /** Alias for calling [Builder.orderRequestId] with `orderRequestId.orElse(null)`. */
            fun orderRequestId(orderRequestId: Optional<String>) =
                orderRequestId(orderRequestId.getOrNull())

            /** Phone Number Type */
            fun phoneNumberType(phoneNumberType: String?) = apply {
                this.phoneNumberType = phoneNumberType
            }

            /** Alias for calling [Builder.phoneNumberType] with `phoneNumberType.orElse(null)`. */
            fun phoneNumberType(phoneNumberType: Optional<String>) =
                phoneNumberType(phoneNumberType.getOrNull())

            /** Amount of numbers in the sub number order */
            fun phoneNumbersCount(phoneNumbersCount: Long?) = apply {
                this.phoneNumbersCount = phoneNumbersCount
            }

            /**
             * Alias for [Builder.phoneNumbersCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun phoneNumbersCount(phoneNumbersCount: Long) =
                phoneNumbersCount(phoneNumbersCount as Long?)

            /**
             * Alias for calling [Builder.phoneNumbersCount] with `phoneNumbersCount.orElse(null)`.
             */
            fun phoneNumbersCount(phoneNumbersCount: Optional<Long>) =
                phoneNumbersCount(phoneNumbersCount.getOrNull())

            /** Filter sub number orders by status. */
            fun status(status: String?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<String>) = status(status.getOrNull())

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
                    countryCode,
                    orderRequestId,
                    phoneNumberType,
                    phoneNumbersCount,
                    status,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                countryCode == other.countryCode &&
                orderRequestId == other.orderRequestId &&
                phoneNumberType == other.phoneNumberType &&
                phoneNumbersCount == other.phoneNumbersCount &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                countryCode,
                orderRequestId,
                phoneNumberType,
                phoneNumbersCount,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{countryCode=$countryCode, orderRequestId=$orderRequestId, phoneNumberType=$phoneNumberType, phoneNumbersCount=$phoneNumbersCount, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubNumberOrderListParams &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(filter, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubNumberOrderListParams{filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
