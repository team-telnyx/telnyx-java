// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** View a list of faxes */
class FaxListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[created_at][gte],
     * filter[created_at][gt], filter[created_at][lte], filter[created_at][lt],
     * filter[direction][eq], filter[from][eq], filter[to][eq]
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

        @JvmStatic fun none(): FaxListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FaxListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FaxListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(faxListParams: FaxListParams) = apply {
            filter = faxListParams.filter
            pageNumber = faxListParams.pageNumber
            pageSize = faxListParams.pageSize
            additionalHeaders = faxListParams.additionalHeaders.toBuilder()
            additionalQueryParams = faxListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[created_at][gte],
         * filter[created_at][gt], filter[created_at][lte], filter[created_at][lt],
         * filter[direction][eq], filter[from][eq], filter[to][eq]
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
         * Returns an immutable instance of [FaxListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FaxListParams =
            FaxListParams(
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
                        it.gt().ifPresent {
                            put(
                                "filter[created_at][gt]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it.gte().ifPresent {
                            put(
                                "filter[created_at][gte]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it.lt().ifPresent {
                            put(
                                "filter[created_at][lt]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it.lte().ifPresent {
                            put(
                                "filter[created_at][lte]",
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                            )
                        }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[created_at][$key]", value)
                            }
                        }
                    }
                    it.direction().ifPresent {
                        it.eq().ifPresent { put("filter[direction][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[direction][$key]", value)
                            }
                        }
                    }
                    it.from().ifPresent {
                        it.eq().ifPresent { put("filter[from][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[from][$key]", value)
                            }
                        }
                    }
                    it.to().ifPresent {
                        it.eq().ifPresent { put("filter[to][eq]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[to][$key]", value)
                            }
                        }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[created_at][gte],
     * filter[created_at][gt], filter[created_at][lte], filter[created_at][lt],
     * filter[direction][eq], filter[from][eq], filter[to][eq]
     */
    class Filter
    private constructor(
        private val createdAt: CreatedAt?,
        private val direction: Direction?,
        private val from: From?,
        private val to: To?,
        private val additionalProperties: QueryParams,
    ) {

        /** Date range filtering operations for fax creation timestamp */
        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        /** Direction filtering operations */
        fun direction(): Optional<Direction> = Optional.ofNullable(direction)

        /** From number filtering operations */
        fun from(): Optional<From> = Optional.ofNullable(from)

        /** To number filtering operations */
        fun to(): Optional<To> = Optional.ofNullable(to)

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
            private var direction: Direction? = null
            private var from: From? = null
            private var to: To? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                createdAt = filter.createdAt
                direction = filter.direction
                from = filter.from
                to = filter.to
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Date range filtering operations for fax creation timestamp */
            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

            /** Direction filtering operations */
            fun direction(direction: Direction?) = apply { this.direction = direction }

            /** Alias for calling [Builder.direction] with `direction.orElse(null)`. */
            fun direction(direction: Optional<Direction>) = direction(direction.getOrNull())

            /** From number filtering operations */
            fun from(from: From?) = apply { this.from = from }

            /** Alias for calling [Builder.from] with `from.orElse(null)`. */
            fun from(from: Optional<From>) = from(from.getOrNull())

            /** To number filtering operations */
            fun to(to: To?) = apply { this.to = to }

            /** Alias for calling [Builder.to] with `to.orElse(null)`. */
            fun to(to: Optional<To>) = to(to.getOrNull())

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
                Filter(createdAt, direction, from, to, additionalProperties.build())
        }

        /** Date range filtering operations for fax creation timestamp */
        class CreatedAt
        private constructor(
            private val gt: OffsetDateTime?,
            private val gte: OffsetDateTime?,
            private val lt: OffsetDateTime?,
            private val lte: OffsetDateTime?,
            private val additionalProperties: QueryParams,
        ) {

            /** ISO 8601 date time for filtering faxes created after that date */
            fun gt(): Optional<OffsetDateTime> = Optional.ofNullable(gt)

            /** ISO 8601 date time for filtering faxes created after or on that date */
            fun gte(): Optional<OffsetDateTime> = Optional.ofNullable(gte)

            /** ISO 8601 formatted date time for filtering faxes created before that date */
            fun lt(): Optional<OffsetDateTime> = Optional.ofNullable(lt)

            /** ISO 8601 formatted date time for filtering faxes created on or before that date */
            fun lte(): Optional<OffsetDateTime> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var gt: OffsetDateTime? = null
                private var gte: OffsetDateTime? = null
                private var lt: OffsetDateTime? = null
                private var lte: OffsetDateTime? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    gt = createdAt.gt
                    gte = createdAt.gte
                    lt = createdAt.lt
                    lte = createdAt.lte
                    additionalProperties = createdAt.additionalProperties.toBuilder()
                }

                /** ISO 8601 date time for filtering faxes created after that date */
                fun gt(gt: OffsetDateTime?) = apply { this.gt = gt }

                /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
                fun gt(gt: Optional<OffsetDateTime>) = gt(gt.getOrNull())

                /** ISO 8601 date time for filtering faxes created after or on that date */
                fun gte(gte: OffsetDateTime?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<OffsetDateTime>) = gte(gte.getOrNull())

                /** ISO 8601 formatted date time for filtering faxes created before that date */
                fun lt(lt: OffsetDateTime?) = apply { this.lt = lt }

                /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
                fun lt(lt: Optional<OffsetDateTime>) = lt(lt.getOrNull())

                /**
                 * ISO 8601 formatted date time for filtering faxes created on or before that date
                 */
                fun lte(lte: OffsetDateTime?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<OffsetDateTime>) = lte(lte.getOrNull())

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
                fun build(): CreatedAt = CreatedAt(gt, gte, lt, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    gt == other.gt &&
                    gte == other.gte &&
                    lt == other.lt &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(gt, gte, lt, lte, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
        }

        /** Direction filtering operations */
        class Direction
        private constructor(
            private val eq: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** The direction, inbound or outbound, for filtering faxes sent from this account */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Direction]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Direction]. */
            class Builder internal constructor() {

                private var eq: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(direction: Direction) = apply {
                    eq = direction.eq
                    additionalProperties = direction.additionalProperties.toBuilder()
                }

                /**
                 * The direction, inbound or outbound, for filtering faxes sent from this account
                 */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

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
                 * Returns an immutable instance of [Direction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Direction = Direction(eq, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Direction &&
                    eq == other.eq &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Direction{eq=$eq, additionalProperties=$additionalProperties}"
        }

        /** From number filtering operations */
        class From
        private constructor(
            private val eq: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** The phone number, in E.164 format for filtering faxes sent from this number */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [From]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [From]. */
            class Builder internal constructor() {

                private var eq: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(from: From) = apply {
                    eq = from.eq
                    additionalProperties = from.additionalProperties.toBuilder()
                }

                /** The phone number, in E.164 format for filtering faxes sent from this number */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

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
                 * Returns an immutable instance of [From].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): From = From(eq, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is From &&
                    eq == other.eq &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "From{eq=$eq, additionalProperties=$additionalProperties}"
        }

        /** To number filtering operations */
        class To
        private constructor(
            private val eq: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** The phone number, in E.164 format for filtering faxes sent to this number */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [To]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [To]. */
            class Builder internal constructor() {

                private var eq: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(to: To) = apply {
                    eq = to.eq
                    additionalProperties = to.additionalProperties.toBuilder()
                }

                /** The phone number, in E.164 format for filtering faxes sent to this number */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

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
                 * Returns an immutable instance of [To].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): To = To(eq, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is To &&
                    eq == other.eq &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "To{eq=$eq, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                createdAt == other.createdAt &&
                direction == other.direction &&
                from == other.from &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAt, direction, from, to, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{createdAt=$createdAt, direction=$direction, from=$from, to=$to, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FaxListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FaxListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
