// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.accessipaddress

import com.telnyx.api.core.Params
import com.telnyx.api.core.getOrThrow
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List all Access IP Addresses */
class AccessIpAddressListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[ip_source],
     * filter[ip_address], filter[created_at]. Supports complex bracket operations for dynamic
     * filtering.
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

        @JvmStatic fun none(): AccessIpAddressListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [AccessIpAddressListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccessIpAddressListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accessIpAddressListParams: AccessIpAddressListParams) = apply {
            filter = accessIpAddressListParams.filter
            page = accessIpAddressListParams.page
            additionalHeaders = accessIpAddressListParams.additionalHeaders.toBuilder()
            additionalQueryParams = accessIpAddressListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[ip_source],
         * filter[ip_address], filter[created_at]. Supports complex bracket operations for dynamic
         * filtering.
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
         * Returns an immutable instance of [AccessIpAddressListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccessIpAddressListParams =
            AccessIpAddressListParams(
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
                    it.createdAt().ifPresent {
                        it.accept(
                            object : Filter.CreatedAt.Visitor<Unit> {
                                override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {
                                    put(
                                        "filter[created_at]",
                                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                                            offsetDateTime
                                        ),
                                    )
                                }

                                override fun visitDateRangeFilter(
                                    dateRangeFilter: Filter.CreatedAt.DateRangeFilter
                                ) {
                                    dateRangeFilter.gt().ifPresent {
                                        put(
                                            "filter[created_at][gt]",
                                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                                        )
                                    }
                                    dateRangeFilter.gte().ifPresent {
                                        put(
                                            "filter[created_at][gte]",
                                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                                        )
                                    }
                                    dateRangeFilter.lt().ifPresent {
                                        put(
                                            "filter[created_at][lt]",
                                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                                        )
                                    }
                                    dateRangeFilter.lte().ifPresent {
                                        put(
                                            "filter[created_at][lte]",
                                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                                        )
                                    }
                                    dateRangeFilter._additionalProperties().keys().forEach { key ->
                                        dateRangeFilter
                                            ._additionalProperties()
                                            .values(key)
                                            .forEach { value ->
                                                put("filter[created_at][$key]", value)
                                            }
                                    }
                                }
                            }
                        )
                    }
                    it.ipAddress().ifPresent { put("filter[ip_address]", it) }
                    it.ipSource().ifPresent { put("filter[ip_source]", it) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[ip_source],
     * filter[ip_address], filter[created_at]. Supports complex bracket operations for dynamic
     * filtering.
     */
    class Filter
    private constructor(
        private val createdAt: CreatedAt?,
        private val ipAddress: String?,
        private val ipSource: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter by exact creation date-time */
        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        /** Filter by IP address */
        fun ipAddress(): Optional<String> = Optional.ofNullable(ipAddress)

        /** Filter by IP source */
        fun ipSource(): Optional<String> = Optional.ofNullable(ipSource)

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
            private var ipAddress: String? = null
            private var ipSource: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                createdAt = filter.createdAt
                ipAddress = filter.ipAddress
                ipSource = filter.ipSource
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter by exact creation date-time */
            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

            /** Alias for calling [createdAt] with `CreatedAt.ofOffsetDateTime(offsetDateTime)`. */
            fun createdAt(offsetDateTime: OffsetDateTime) =
                createdAt(CreatedAt.ofOffsetDateTime(offsetDateTime))

            /**
             * Alias for calling [createdAt] with `CreatedAt.ofDateRangeFilter(dateRangeFilter)`.
             */
            fun createdAt(dateRangeFilter: CreatedAt.DateRangeFilter) =
                createdAt(CreatedAt.ofDateRangeFilter(dateRangeFilter))

            /** Filter by IP address */
            fun ipAddress(ipAddress: String?) = apply { this.ipAddress = ipAddress }

            /** Alias for calling [Builder.ipAddress] with `ipAddress.orElse(null)`. */
            fun ipAddress(ipAddress: Optional<String>) = ipAddress(ipAddress.getOrNull())

            /** Filter by IP source */
            fun ipSource(ipSource: String?) = apply { this.ipSource = ipSource }

            /** Alias for calling [Builder.ipSource] with `ipSource.orElse(null)`. */
            fun ipSource(ipSource: Optional<String>) = ipSource(ipSource.getOrNull())

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
                Filter(createdAt, ipAddress, ipSource, additionalProperties.build())
        }

        /** Filter by exact creation date-time */
        class CreatedAt
        private constructor(
            private val offsetDateTime: OffsetDateTime? = null,
            private val dateRangeFilter: DateRangeFilter? = null,
        ) {

            /** Filter by exact creation date-time */
            fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

            /** Date range filtering operations */
            fun dateRangeFilter(): Optional<DateRangeFilter> = Optional.ofNullable(dateRangeFilter)

            fun isOffsetDateTime(): Boolean = offsetDateTime != null

            fun isDateRangeFilter(): Boolean = dateRangeFilter != null

            /** Filter by exact creation date-time */
            fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

            /** Date range filtering operations */
            fun asDateRangeFilter(): DateRangeFilter = dateRangeFilter.getOrThrow("dateRangeFilter")

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                    dateRangeFilter != null -> visitor.visitDateRangeFilter(dateRangeFilter)
                    else -> throw IllegalStateException("Invalid CreatedAt")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    offsetDateTime == other.offsetDateTime &&
                    dateRangeFilter == other.dateRangeFilter
            }

            override fun hashCode(): Int = Objects.hash(offsetDateTime, dateRangeFilter)

            override fun toString(): String =
                when {
                    offsetDateTime != null -> "CreatedAt{offsetDateTime=$offsetDateTime}"
                    dateRangeFilter != null -> "CreatedAt{dateRangeFilter=$dateRangeFilter}"
                    else -> throw IllegalStateException("Invalid CreatedAt")
                }

            companion object {

                /** Filter by exact creation date-time */
                @JvmStatic
                fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                    CreatedAt(offsetDateTime = offsetDateTime)

                /** Date range filtering operations */
                @JvmStatic
                fun ofDateRangeFilter(dateRangeFilter: DateRangeFilter) =
                    CreatedAt(dateRangeFilter = dateRangeFilter)
            }

            /**
             * An interface that defines how to map each variant of [CreatedAt] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                /** Filter by exact creation date-time */
                fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

                /** Date range filtering operations */
                fun visitDateRangeFilter(dateRangeFilter: DateRangeFilter): T
            }

            /** Date range filtering operations */
            class DateRangeFilter
            private constructor(
                private val gt: OffsetDateTime?,
                private val gte: OffsetDateTime?,
                private val lt: OffsetDateTime?,
                private val lte: OffsetDateTime?,
            ) {

                /** Filter for creation date-time greater than */
                fun gt(): Optional<OffsetDateTime> = Optional.ofNullable(gt)

                /** Filter for creation date-time greater than or equal to */
                fun gte(): Optional<OffsetDateTime> = Optional.ofNullable(gte)

                /** Filter for creation date-time less than */
                fun lt(): Optional<OffsetDateTime> = Optional.ofNullable(lt)

                /** Filter for creation date-time less than or equal to */
                fun lte(): Optional<OffsetDateTime> = Optional.ofNullable(lte)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [DateRangeFilter].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DateRangeFilter]. */
                class Builder internal constructor() {

                    private var gt: OffsetDateTime? = null
                    private var gte: OffsetDateTime? = null
                    private var lt: OffsetDateTime? = null
                    private var lte: OffsetDateTime? = null

                    @JvmSynthetic
                    internal fun from(dateRangeFilter: DateRangeFilter) = apply {
                        gt = dateRangeFilter.gt
                        gte = dateRangeFilter.gte
                        lt = dateRangeFilter.lt
                        lte = dateRangeFilter.lte
                    }

                    /** Filter for creation date-time greater than */
                    fun gt(gt: OffsetDateTime?) = apply { this.gt = gt }

                    /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
                    fun gt(gt: Optional<OffsetDateTime>) = gt(gt.getOrNull())

                    /** Filter for creation date-time greater than or equal to */
                    fun gte(gte: OffsetDateTime?) = apply { this.gte = gte }

                    /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                    fun gte(gte: Optional<OffsetDateTime>) = gte(gte.getOrNull())

                    /** Filter for creation date-time less than */
                    fun lt(lt: OffsetDateTime?) = apply { this.lt = lt }

                    /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
                    fun lt(lt: Optional<OffsetDateTime>) = lt(lt.getOrNull())

                    /** Filter for creation date-time less than or equal to */
                    fun lte(lte: OffsetDateTime?) = apply { this.lte = lte }

                    /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                    fun lte(lte: Optional<OffsetDateTime>) = lte(lte.getOrNull())

                    /**
                     * Returns an immutable instance of [DateRangeFilter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): DateRangeFilter = DateRangeFilter(gt, gte, lt, lte)
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DateRangeFilter &&
                        gt == other.gt &&
                        gte == other.gte &&
                        lt == other.lt &&
                        lte == other.lte
                }

                private val hashCode: Int by lazy { Objects.hash(gt, gte, lt, lte) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "DateRangeFilter{gt=$gt, gte=$gte, lt=$lt, lte=$lte}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                createdAt == other.createdAt &&
                ipAddress == other.ipAddress &&
                ipSource == other.ipSource &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAt, ipAddress, ipSource, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{createdAt=$createdAt, ipAddress=$ipAddress, ipSource=$ipSource, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[number], page[size] */
    class Page
    private constructor(
        private val number: Long?,
        private val size: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun number(): Optional<Long> = Optional.ofNullable(number)

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

            fun number(number: Long?) = apply { this.number = number }

            /**
             * Alias for [Builder.number].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun number(number: Long) = number(number as Long?)

            /** Alias for calling [Builder.number] with `number.orElse(null)`. */
            fun number(number: Optional<Long>) = number(number.getOrNull())

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

        return other is AccessIpAddressListParams &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccessIpAddressListParams{filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
