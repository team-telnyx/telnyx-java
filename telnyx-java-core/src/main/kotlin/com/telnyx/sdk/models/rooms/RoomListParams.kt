// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** View a list of rooms. */
class RoomListParams
private constructor(
    private val filter: Filter?,
    private val includeSessions: Boolean?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[date_created_at][eq],
     * filter[date_created_at][gte], filter[date_created_at][lte], filter[date_updated_at][eq],
     * filter[date_updated_at][gte], filter[date_updated_at][lte], filter[unique_name]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** To decide if room sessions should be included in the response. */
    fun includeSessions(): Optional<Boolean> = Optional.ofNullable(includeSessions)

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RoomListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RoomListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoomListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var includeSessions: Boolean? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(roomListParams: RoomListParams) = apply {
            filter = roomListParams.filter
            includeSessions = roomListParams.includeSessions
            page = roomListParams.page
            additionalHeaders = roomListParams.additionalHeaders.toBuilder()
            additionalQueryParams = roomListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally:
         * filter[date_created_at][eq], filter[date_created_at][gte], filter[date_created_at][lte],
         * filter[date_updated_at][eq], filter[date_updated_at][gte], filter[date_updated_at][lte],
         * filter[unique_name]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** To decide if room sessions should be included in the response. */
        fun includeSessions(includeSessions: Boolean?) = apply {
            this.includeSessions = includeSessions
        }

        /**
         * Alias for [Builder.includeSessions].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeSessions(includeSessions: Boolean) = includeSessions(includeSessions as Boolean?)

        /** Alias for calling [Builder.includeSessions] with `includeSessions.orElse(null)`. */
        fun includeSessions(includeSessions: Optional<Boolean>) =
            includeSessions(includeSessions.getOrNull())

        /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
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
         * Returns an immutable instance of [RoomListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoomListParams =
            RoomListParams(
                filter,
                includeSessions,
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
                    it.dateCreatedAt().ifPresent {
                        it.eq().ifPresent { put("filter[date_created_at][eq]", it.toString()) }
                        it.gte().ifPresent { put("filter[date_created_at][gte]", it.toString()) }
                        it.lte().ifPresent { put("filter[date_created_at][lte]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[date_created_at][$key]", value)
                            }
                        }
                    }
                    it.dateUpdatedAt().ifPresent {
                        it.eq().ifPresent { put("filter[date_updated_at][eq]", it.toString()) }
                        it.gte().ifPresent { put("filter[date_updated_at][gte]", it.toString()) }
                        it.lte().ifPresent { put("filter[date_updated_at][lte]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[date_updated_at][$key]", value)
                            }
                        }
                    }
                    it.uniqueName().ifPresent { put("filter[unique_name]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                includeSessions?.let { put("include_sessions", it.toString()) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[date_created_at][eq],
     * filter[date_created_at][gte], filter[date_created_at][lte], filter[date_updated_at][eq],
     * filter[date_updated_at][gte], filter[date_updated_at][lte], filter[unique_name]
     */
    class Filter
    private constructor(
        private val dateCreatedAt: DateCreatedAt?,
        private val dateUpdatedAt: DateUpdatedAt?,
        private val uniqueName: String?,
        private val additionalProperties: QueryParams,
    ) {

        fun dateCreatedAt(): Optional<DateCreatedAt> = Optional.ofNullable(dateCreatedAt)

        fun dateUpdatedAt(): Optional<DateUpdatedAt> = Optional.ofNullable(dateUpdatedAt)

        /** Unique_name for filtering rooms. */
        fun uniqueName(): Optional<String> = Optional.ofNullable(uniqueName)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var dateCreatedAt: DateCreatedAt? = null
            private var dateUpdatedAt: DateUpdatedAt? = null
            private var uniqueName: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                dateCreatedAt = filter.dateCreatedAt
                dateUpdatedAt = filter.dateUpdatedAt
                uniqueName = filter.uniqueName
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun dateCreatedAt(dateCreatedAt: DateCreatedAt?) = apply {
                this.dateCreatedAt = dateCreatedAt
            }

            /** Alias for calling [Builder.dateCreatedAt] with `dateCreatedAt.orElse(null)`. */
            fun dateCreatedAt(dateCreatedAt: Optional<DateCreatedAt>) =
                dateCreatedAt(dateCreatedAt.getOrNull())

            fun dateUpdatedAt(dateUpdatedAt: DateUpdatedAt?) = apply {
                this.dateUpdatedAt = dateUpdatedAt
            }

            /** Alias for calling [Builder.dateUpdatedAt] with `dateUpdatedAt.orElse(null)`. */
            fun dateUpdatedAt(dateUpdatedAt: Optional<DateUpdatedAt>) =
                dateUpdatedAt(dateUpdatedAt.getOrNull())

            /** Unique_name for filtering rooms. */
            fun uniqueName(uniqueName: String?) = apply { this.uniqueName = uniqueName }

            /** Alias for calling [Builder.uniqueName] with `uniqueName.orElse(null)`. */
            fun uniqueName(uniqueName: Optional<String>) = uniqueName(uniqueName.getOrNull())

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
                Filter(dateCreatedAt, dateUpdatedAt, uniqueName, additionalProperties.build())
        }

        class DateCreatedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
        ) {

            /** ISO 8601 date for filtering rooms created on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering rooms created on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering rooms created on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [DateCreatedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DateCreatedAt]. */
            class Builder internal constructor() {

                private var eq: LocalDate? = null
                private var gte: LocalDate? = null
                private var lte: LocalDate? = null

                @JvmSynthetic
                internal fun from(dateCreatedAt: DateCreatedAt) = apply {
                    eq = dateCreatedAt.eq
                    gte = dateCreatedAt.gte
                    lte = dateCreatedAt.lte
                }

                /** ISO 8601 date for filtering rooms created on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /** ISO 8601 date for filtering rooms created on or after that date. */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /** ISO 8601 date for filtering rooms created on or before that date. */
                fun lte(lte: LocalDate?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<LocalDate>) = lte(lte.getOrNull())

                /**
                 * Returns an immutable instance of [DateCreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateCreatedAt = DateCreatedAt(eq, gte, lte)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateCreatedAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "DateCreatedAt{eq=$eq, gte=$gte, lte=$lte}"
        }

        class DateUpdatedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
        ) {

            /** ISO 8601 date for filtering rooms updated on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering rooms updated on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering rooms updated on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [DateUpdatedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DateUpdatedAt]. */
            class Builder internal constructor() {

                private var eq: LocalDate? = null
                private var gte: LocalDate? = null
                private var lte: LocalDate? = null

                @JvmSynthetic
                internal fun from(dateUpdatedAt: DateUpdatedAt) = apply {
                    eq = dateUpdatedAt.eq
                    gte = dateUpdatedAt.gte
                    lte = dateUpdatedAt.lte
                }

                /** ISO 8601 date for filtering rooms updated on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /** ISO 8601 date for filtering rooms updated on or after that date. */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /** ISO 8601 date for filtering rooms updated on or before that date. */
                fun lte(lte: LocalDate?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<LocalDate>) = lte(lte.getOrNull())

                /**
                 * Returns an immutable instance of [DateUpdatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateUpdatedAt = DateUpdatedAt(eq, gte, lte)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateUpdatedAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "DateUpdatedAt{eq=$eq, gte=$gte, lte=$lte}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                dateCreatedAt == other.dateCreatedAt &&
                dateUpdatedAt == other.dateUpdatedAt &&
                uniqueName == other.uniqueName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dateCreatedAt, dateUpdatedAt, uniqueName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{dateCreatedAt=$dateCreatedAt, dateUpdatedAt=$dateUpdatedAt, uniqueName=$uniqueName, additionalProperties=$additionalProperties}"
    }

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
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

        return other is RoomListParams &&
            filter == other.filter &&
            includeSessions == other.includeSessions &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, includeSessions, page, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RoomListParams{filter=$filter, includeSessions=$includeSessions, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
