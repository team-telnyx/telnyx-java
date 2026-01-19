// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a paginated list of number orders. */
class NumberOrderListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[status],
     * filter[created_at], filter[phone_numbers_count], filter[customer_reference],
     * filter[requirements_met]
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

        @JvmStatic fun none(): NumberOrderListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [NumberOrderListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NumberOrderListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(numberOrderListParams: NumberOrderListParams) = apply {
            filter = numberOrderListParams.filter
            pageNumber = numberOrderListParams.pageNumber
            pageSize = numberOrderListParams.pageSize
            additionalHeaders = numberOrderListParams.additionalHeaders.toBuilder()
            additionalQueryParams = numberOrderListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[status],
         * filter[created_at], filter[phone_numbers_count], filter[customer_reference],
         * filter[requirements_met]
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
         * Returns an immutable instance of [NumberOrderListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): NumberOrderListParams =
            NumberOrderListParams(
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
                    it.createdAt().ifPresent {
                        it.gt().ifPresent { put("filter[created_at][gt]", it) }
                        it.lt().ifPresent { put("filter[created_at][lt]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[created_at][$key]", value)
                            }
                        }
                    }
                    it.customerReference().ifPresent { put("filter[customer_reference]", it) }
                    it.phoneNumbersCount().ifPresent { put("filter[phone_numbers_count]", it) }
                    it.requirementsMet().ifPresent {
                        put("filter[requirements_met]", it.toString())
                    }
                    it.status().ifPresent { put("filter[status]", it) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[status],
     * filter[created_at], filter[phone_numbers_count], filter[customer_reference],
     * filter[requirements_met]
     */
    class Filter
    private constructor(
        private val createdAt: CreatedAt?,
        private val customerReference: String?,
        private val phoneNumbersCount: String?,
        private val requirementsMet: Boolean?,
        private val status: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter number orders by date range. */
        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        /** Filter number orders via the customer reference set. */
        fun customerReference(): Optional<String> = Optional.ofNullable(customerReference)

        /** Filter number order with this amount of numbers */
        fun phoneNumbersCount(): Optional<String> = Optional.ofNullable(phoneNumbersCount)

        /** Filter number orders by requirements met. */
        fun requirementsMet(): Optional<Boolean> = Optional.ofNullable(requirementsMet)

        /** Filter number orders by status. */
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

            private var createdAt: CreatedAt? = null
            private var customerReference: String? = null
            private var phoneNumbersCount: String? = null
            private var requirementsMet: Boolean? = null
            private var status: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                createdAt = filter.createdAt
                customerReference = filter.customerReference
                phoneNumbersCount = filter.phoneNumbersCount
                requirementsMet = filter.requirementsMet
                status = filter.status
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter number orders by date range. */
            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

            /** Filter number orders via the customer reference set. */
            fun customerReference(customerReference: String?) = apply {
                this.customerReference = customerReference
            }

            /**
             * Alias for calling [Builder.customerReference] with `customerReference.orElse(null)`.
             */
            fun customerReference(customerReference: Optional<String>) =
                customerReference(customerReference.getOrNull())

            /** Filter number order with this amount of numbers */
            fun phoneNumbersCount(phoneNumbersCount: String?) = apply {
                this.phoneNumbersCount = phoneNumbersCount
            }

            /**
             * Alias for calling [Builder.phoneNumbersCount] with `phoneNumbersCount.orElse(null)`.
             */
            fun phoneNumbersCount(phoneNumbersCount: Optional<String>) =
                phoneNumbersCount(phoneNumbersCount.getOrNull())

            /** Filter number orders by requirements met. */
            fun requirementsMet(requirementsMet: Boolean?) = apply {
                this.requirementsMet = requirementsMet
            }

            /**
             * Alias for [Builder.requirementsMet].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun requirementsMet(requirementsMet: Boolean) =
                requirementsMet(requirementsMet as Boolean?)

            /** Alias for calling [Builder.requirementsMet] with `requirementsMet.orElse(null)`. */
            fun requirementsMet(requirementsMet: Optional<Boolean>) =
                requirementsMet(requirementsMet.getOrNull())

            /** Filter number orders by status. */
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
                    createdAt,
                    customerReference,
                    phoneNumbersCount,
                    requirementsMet,
                    status,
                    additionalProperties.build(),
                )
        }

        /** Filter number orders by date range. */
        class CreatedAt
        private constructor(
            private val gt: String?,
            private val lt: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Filter number orders later than this value. */
            fun gt(): Optional<String> = Optional.ofNullable(gt)

            /** Filter number orders earlier than this value. */
            fun lt(): Optional<String> = Optional.ofNullable(lt)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var gt: String? = null
                private var lt: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    gt = createdAt.gt
                    lt = createdAt.lt
                    additionalProperties = createdAt.additionalProperties.toBuilder()
                }

                /** Filter number orders later than this value. */
                fun gt(gt: String?) = apply { this.gt = gt }

                /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
                fun gt(gt: Optional<String>) = gt(gt.getOrNull())

                /** Filter number orders earlier than this value. */
                fun lt(lt: String?) = apply { this.lt = lt }

                /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
                fun lt(lt: Optional<String>) = lt(lt.getOrNull())

                fun additionalProperties(additionalProperties: QueryParams) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                    apply {
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

                fun putAllAdditionalProperties(
                    additionalProperties: Map<String, Iterable<String>>
                ) = apply { this.additionalProperties.putAll(additionalProperties) }

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

                fun removeAdditionalProperties(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    additionalProperties.removeAll(keys)
                }

                /**
                 * Returns an immutable instance of [CreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreatedAt = CreatedAt(gt, lt, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    gt == other.gt &&
                    lt == other.lt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(gt, lt, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{gt=$gt, lt=$lt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                createdAt == other.createdAt &&
                customerReference == other.customerReference &&
                phoneNumbersCount == other.phoneNumbersCount &&
                requirementsMet == other.requirementsMet &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                createdAt,
                customerReference,
                phoneNumbersCount,
                requirementsMet,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{createdAt=$createdAt, customerReference=$customerReference, phoneNumbersCount=$phoneNumbersCount, requirementsMet=$requirementsMet, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberOrderListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NumberOrderListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
