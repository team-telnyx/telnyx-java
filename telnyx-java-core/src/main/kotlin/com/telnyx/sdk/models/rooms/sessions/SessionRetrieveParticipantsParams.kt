// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** View a list of room participants. */
class SessionRetrieveParticipantsParams
private constructor(
    private val roomSessionId: String?,
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun roomSessionId(): Optional<String> = Optional.ofNullable(roomSessionId)

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[date_joined_at][eq],
     * filter[date_joined_at][gte], filter[date_joined_at][lte], filter[date_updated_at][eq],
     * filter[date_updated_at][gte], filter[date_updated_at][lte], filter[date_left_at][eq],
     * filter[date_left_at][gte], filter[date_left_at][lte], filter[context]
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

        @JvmStatic fun none(): SessionRetrieveParticipantsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SessionRetrieveParticipantsParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionRetrieveParticipantsParams]. */
    class Builder internal constructor() {

        private var roomSessionId: String? = null
        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionRetrieveParticipantsParams: SessionRetrieveParticipantsParams) =
            apply {
                roomSessionId = sessionRetrieveParticipantsParams.roomSessionId
                filter = sessionRetrieveParticipantsParams.filter
                pageNumber = sessionRetrieveParticipantsParams.pageNumber
                pageSize = sessionRetrieveParticipantsParams.pageSize
                additionalHeaders = sessionRetrieveParticipantsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    sessionRetrieveParticipantsParams.additionalQueryParams.toBuilder()
            }

        fun roomSessionId(roomSessionId: String?) = apply { this.roomSessionId = roomSessionId }

        /** Alias for calling [Builder.roomSessionId] with `roomSessionId.orElse(null)`. */
        fun roomSessionId(roomSessionId: Optional<String>) =
            roomSessionId(roomSessionId.getOrNull())

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[date_joined_at][eq],
         * filter[date_joined_at][gte], filter[date_joined_at][lte], filter[date_updated_at][eq],
         * filter[date_updated_at][gte], filter[date_updated_at][lte], filter[date_left_at][eq],
         * filter[date_left_at][gte], filter[date_left_at][lte], filter[context]
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
         * Returns an immutable instance of [SessionRetrieveParticipantsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionRetrieveParticipantsParams =
            SessionRetrieveParticipantsParams(
                roomSessionId,
                filter,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> roomSessionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
                    it.context().ifPresent { put("filter[context]", it) }
                    it.dateJoinedAt().ifPresent {
                        it.eq().ifPresent { put("filter[date_joined_at][eq]", it.toString()) }
                        it.gte().ifPresent { put("filter[date_joined_at][gte]", it.toString()) }
                        it.lte().ifPresent { put("filter[date_joined_at][lte]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[date_joined_at][$key]", value)
                            }
                        }
                    }
                    it.dateLeftAt().ifPresent {
                        it.eq().ifPresent { put("filter[date_left_at][eq]", it.toString()) }
                        it.gte().ifPresent { put("filter[date_left_at][gte]", it.toString()) }
                        it.lte().ifPresent { put("filter[date_left_at][lte]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[date_left_at][$key]", value)
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
     * Consolidated filter parameter (deepObject style). Originally: filter[date_joined_at][eq],
     * filter[date_joined_at][gte], filter[date_joined_at][lte], filter[date_updated_at][eq],
     * filter[date_updated_at][gte], filter[date_updated_at][lte], filter[date_left_at][eq],
     * filter[date_left_at][gte], filter[date_left_at][lte], filter[context]
     */
    class Filter
    private constructor(
        private val context: String?,
        private val dateJoinedAt: DateJoinedAt?,
        private val dateLeftAt: DateLeftAt?,
        private val dateUpdatedAt: DateUpdatedAt?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter room participants based on the context. */
        fun context(): Optional<String> = Optional.ofNullable(context)

        fun dateJoinedAt(): Optional<DateJoinedAt> = Optional.ofNullable(dateJoinedAt)

        fun dateLeftAt(): Optional<DateLeftAt> = Optional.ofNullable(dateLeftAt)

        fun dateUpdatedAt(): Optional<DateUpdatedAt> = Optional.ofNullable(dateUpdatedAt)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var context: String? = null
            private var dateJoinedAt: DateJoinedAt? = null
            private var dateLeftAt: DateLeftAt? = null
            private var dateUpdatedAt: DateUpdatedAt? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                context = filter.context
                dateJoinedAt = filter.dateJoinedAt
                dateLeftAt = filter.dateLeftAt
                dateUpdatedAt = filter.dateUpdatedAt
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter room participants based on the context. */
            fun context(context: String?) = apply { this.context = context }

            /** Alias for calling [Builder.context] with `context.orElse(null)`. */
            fun context(context: Optional<String>) = context(context.getOrNull())

            fun dateJoinedAt(dateJoinedAt: DateJoinedAt?) = apply {
                this.dateJoinedAt = dateJoinedAt
            }

            /** Alias for calling [Builder.dateJoinedAt] with `dateJoinedAt.orElse(null)`. */
            fun dateJoinedAt(dateJoinedAt: Optional<DateJoinedAt>) =
                dateJoinedAt(dateJoinedAt.getOrNull())

            fun dateLeftAt(dateLeftAt: DateLeftAt?) = apply { this.dateLeftAt = dateLeftAt }

            /** Alias for calling [Builder.dateLeftAt] with `dateLeftAt.orElse(null)`. */
            fun dateLeftAt(dateLeftAt: Optional<DateLeftAt>) = dateLeftAt(dateLeftAt.getOrNull())

            fun dateUpdatedAt(dateUpdatedAt: DateUpdatedAt?) = apply {
                this.dateUpdatedAt = dateUpdatedAt
            }

            /** Alias for calling [Builder.dateUpdatedAt] with `dateUpdatedAt.orElse(null)`. */
            fun dateUpdatedAt(dateUpdatedAt: Optional<DateUpdatedAt>) =
                dateUpdatedAt(dateUpdatedAt.getOrNull())

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
                    context,
                    dateJoinedAt,
                    dateLeftAt,
                    dateUpdatedAt,
                    additionalProperties.build(),
                )
        }

        class DateJoinedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
            private val additionalProperties: QueryParams,
        ) {

            /** ISO 8601 date for filtering room participants that joined on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering room participants that joined on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering room participants that joined on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [DateJoinedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DateJoinedAt]. */
            class Builder internal constructor() {

                private var eq: LocalDate? = null
                private var gte: LocalDate? = null
                private var lte: LocalDate? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(dateJoinedAt: DateJoinedAt) = apply {
                    eq = dateJoinedAt.eq
                    gte = dateJoinedAt.gte
                    lte = dateJoinedAt.lte
                    additionalProperties = dateJoinedAt.additionalProperties.toBuilder()
                }

                /** ISO 8601 date for filtering room participants that joined on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /**
                 * ISO 8601 date for filtering room participants that joined on or after that date.
                 */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /**
                 * ISO 8601 date for filtering room participants that joined on or before that date.
                 */
                fun lte(lte: LocalDate?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<LocalDate>) = lte(lte.getOrNull())

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
                 * Returns an immutable instance of [DateJoinedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateJoinedAt = DateJoinedAt(eq, gte, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateJoinedAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DateJoinedAt{eq=$eq, gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
        }

        class DateLeftAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
            private val additionalProperties: QueryParams,
        ) {

            /** ISO 8601 date for filtering room participants that left on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering room participants that left on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering room participants that left on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [DateLeftAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DateLeftAt]. */
            class Builder internal constructor() {

                private var eq: LocalDate? = null
                private var gte: LocalDate? = null
                private var lte: LocalDate? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(dateLeftAt: DateLeftAt) = apply {
                    eq = dateLeftAt.eq
                    gte = dateLeftAt.gte
                    lte = dateLeftAt.lte
                    additionalProperties = dateLeftAt.additionalProperties.toBuilder()
                }

                /** ISO 8601 date for filtering room participants that left on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /**
                 * ISO 8601 date for filtering room participants that left on or after that date.
                 */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /**
                 * ISO 8601 date for filtering room participants that left on or before that date.
                 */
                fun lte(lte: LocalDate?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<LocalDate>) = lte(lte.getOrNull())

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
                 * Returns an immutable instance of [DateLeftAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateLeftAt = DateLeftAt(eq, gte, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateLeftAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DateLeftAt{eq=$eq, gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
        }

        class DateUpdatedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
            private val additionalProperties: QueryParams,
        ) {

            /** ISO 8601 date for filtering room participants updated on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering room participants updated on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering room participants updated on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

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
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(dateUpdatedAt: DateUpdatedAt) = apply {
                    eq = dateUpdatedAt.eq
                    gte = dateUpdatedAt.gte
                    lte = dateUpdatedAt.lte
                    additionalProperties = dateUpdatedAt.additionalProperties.toBuilder()
                }

                /** ISO 8601 date for filtering room participants updated on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /** ISO 8601 date for filtering room participants updated on or after that date. */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /** ISO 8601 date for filtering room participants updated on or before that date. */
                fun lte(lte: LocalDate?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<LocalDate>) = lte(lte.getOrNull())

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
                 * Returns an immutable instance of [DateUpdatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateUpdatedAt =
                    DateUpdatedAt(eq, gte, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateUpdatedAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DateUpdatedAt{eq=$eq, gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                context == other.context &&
                dateJoinedAt == other.dateJoinedAt &&
                dateLeftAt == other.dateLeftAt &&
                dateUpdatedAt == other.dateUpdatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(context, dateJoinedAt, dateLeftAt, dateUpdatedAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{context=$context, dateJoinedAt=$dateJoinedAt, dateLeftAt=$dateLeftAt, dateUpdatedAt=$dateUpdatedAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionRetrieveParticipantsParams &&
            roomSessionId == other.roomSessionId &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            roomSessionId,
            filter,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionRetrieveParticipantsParams{roomSessionId=$roomSessionId, filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
