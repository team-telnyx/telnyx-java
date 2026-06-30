// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** View a list of room sessions. */
class SessionList0Params
private constructor(
    private val filter: Filter?,
    private val includeParticipants: Boolean?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[date_created_at][eq],
     * filter[date_created_at][gte], filter[date_created_at][lte], filter[date_updated_at][eq],
     * filter[date_updated_at][gte], filter[date_updated_at][lte], filter[date_ended_at][eq],
     * filter[date_ended_at][gte], filter[date_ended_at][lte], filter[room_id], filter[active]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** To decide if room participants should be included in the response. */
    fun includeParticipants(): Optional<Boolean> = Optional.ofNullable(includeParticipants)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SessionList0Params = builder().build()

        /** Returns a mutable builder for constructing an instance of [SessionList0Params]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionList0Params]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var includeParticipants: Boolean? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionList0Params: SessionList0Params) = apply {
            filter = sessionList0Params.filter
            includeParticipants = sessionList0Params.includeParticipants
            pageNumber = sessionList0Params.pageNumber
            pageSize = sessionList0Params.pageSize
            additionalHeaders = sessionList0Params.additionalHeaders.toBuilder()
            additionalQueryParams = sessionList0Params.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally:
         * filter[date_created_at][eq], filter[date_created_at][gte], filter[date_created_at][lte],
         * filter[date_updated_at][eq], filter[date_updated_at][gte], filter[date_updated_at][lte],
         * filter[date_ended_at][eq], filter[date_ended_at][gte], filter[date_ended_at][lte],
         * filter[room_id], filter[active]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /** To decide if room participants should be included in the response. */
        fun includeParticipants(includeParticipants: Boolean?) = apply {
            this.includeParticipants = includeParticipants
        }

        /**
         * Alias for [Builder.includeParticipants].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeParticipants(includeParticipants: Boolean) =
            includeParticipants(includeParticipants as Boolean?)

        /**
         * Alias for calling [Builder.includeParticipants] with `includeParticipants.orElse(null)`.
         */
        fun includeParticipants(includeParticipants: Optional<Boolean>) =
            includeParticipants(includeParticipants.getOrNull())

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
         * Returns an immutable instance of [SessionList0Params].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionList0Params =
            SessionList0Params(
                filter,
                includeParticipants,
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
                    it.active().ifPresent { put("filter[active]", it.toString()) }
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
                    it.dateEndedAt().ifPresent {
                        it.eq().ifPresent { put("filter[date_ended_at][eq]", it.toString()) }
                        it.gte().ifPresent { put("filter[date_ended_at][gte]", it.toString()) }
                        it.lte().ifPresent { put("filter[date_ended_at][lte]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[date_ended_at][$key]", value)
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
                    it.roomId().ifPresent { put("filter[room_id]", it) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                includeParticipants?.let { put("include_participants", it.toString()) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[date_created_at][eq],
     * filter[date_created_at][gte], filter[date_created_at][lte], filter[date_updated_at][eq],
     * filter[date_updated_at][gte], filter[date_updated_at][lte], filter[date_ended_at][eq],
     * filter[date_ended_at][gte], filter[date_ended_at][lte], filter[room_id], filter[active]
     */
    class Filter
    private constructor(
        private val active: Boolean?,
        private val dateCreatedAt: DateCreatedAt?,
        private val dateEndedAt: DateEndedAt?,
        private val dateUpdatedAt: DateUpdatedAt?,
        private val roomId: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** Filter active or inactive room sessions. */
        fun active(): Optional<Boolean> = Optional.ofNullable(active)

        fun dateCreatedAt(): Optional<DateCreatedAt> = Optional.ofNullable(dateCreatedAt)

        fun dateEndedAt(): Optional<DateEndedAt> = Optional.ofNullable(dateEndedAt)

        fun dateUpdatedAt(): Optional<DateUpdatedAt> = Optional.ofNullable(dateUpdatedAt)

        /** Room_id for filtering room sessions. */
        fun roomId(): Optional<String> = Optional.ofNullable(roomId)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var active: Boolean? = null
            private var dateCreatedAt: DateCreatedAt? = null
            private var dateEndedAt: DateEndedAt? = null
            private var dateUpdatedAt: DateUpdatedAt? = null
            private var roomId: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                active = filter.active
                dateCreatedAt = filter.dateCreatedAt
                dateEndedAt = filter.dateEndedAt
                dateUpdatedAt = filter.dateUpdatedAt
                roomId = filter.roomId
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Filter active or inactive room sessions. */
            fun active(active: Boolean?) = apply { this.active = active }

            /**
             * Alias for [Builder.active].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun active(active: Boolean) = active(active as Boolean?)

            /** Alias for calling [Builder.active] with `active.orElse(null)`. */
            fun active(active: Optional<Boolean>) = active(active.getOrNull())

            fun dateCreatedAt(dateCreatedAt: DateCreatedAt?) = apply {
                this.dateCreatedAt = dateCreatedAt
            }

            /** Alias for calling [Builder.dateCreatedAt] with `dateCreatedAt.orElse(null)`. */
            fun dateCreatedAt(dateCreatedAt: Optional<DateCreatedAt>) =
                dateCreatedAt(dateCreatedAt.getOrNull())

            fun dateEndedAt(dateEndedAt: DateEndedAt?) = apply { this.dateEndedAt = dateEndedAt }

            /** Alias for calling [Builder.dateEndedAt] with `dateEndedAt.orElse(null)`. */
            fun dateEndedAt(dateEndedAt: Optional<DateEndedAt>) =
                dateEndedAt(dateEndedAt.getOrNull())

            fun dateUpdatedAt(dateUpdatedAt: DateUpdatedAt?) = apply {
                this.dateUpdatedAt = dateUpdatedAt
            }

            /** Alias for calling [Builder.dateUpdatedAt] with `dateUpdatedAt.orElse(null)`. */
            fun dateUpdatedAt(dateUpdatedAt: Optional<DateUpdatedAt>) =
                dateUpdatedAt(dateUpdatedAt.getOrNull())

            /** Room_id for filtering room sessions. */
            fun roomId(roomId: String?) = apply { this.roomId = roomId }

            /** Alias for calling [Builder.roomId] with `roomId.orElse(null)`. */
            fun roomId(roomId: Optional<String>) = roomId(roomId.getOrNull())

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
                    active,
                    dateCreatedAt,
                    dateEndedAt,
                    dateUpdatedAt,
                    roomId,
                    additionalProperties.build(),
                )
        }

        class DateCreatedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
            private val additionalProperties: QueryParams,
        ) {

            /** ISO 8601 date for filtering room sessions created on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering room sessions created on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering room sessions created on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

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
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(dateCreatedAt: DateCreatedAt) = apply {
                    eq = dateCreatedAt.eq
                    gte = dateCreatedAt.gte
                    lte = dateCreatedAt.lte
                    additionalProperties = dateCreatedAt.additionalProperties.toBuilder()
                }

                /** ISO 8601 date for filtering room sessions created on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /** ISO 8601 date for filtering room sessions created on or after that date. */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /** ISO 8601 date for filtering room sessions created on or before that date. */
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
                 * Returns an immutable instance of [DateCreatedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateCreatedAt =
                    DateCreatedAt(eq, gte, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateCreatedAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DateCreatedAt{eq=$eq, gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
        }

        class DateEndedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
            private val additionalProperties: QueryParams,
        ) {

            /** ISO 8601 date for filtering room sessions ended on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering room sessions ended on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering room sessions ended on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [DateEndedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DateEndedAt]. */
            class Builder internal constructor() {

                private var eq: LocalDate? = null
                private var gte: LocalDate? = null
                private var lte: LocalDate? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(dateEndedAt: DateEndedAt) = apply {
                    eq = dateEndedAt.eq
                    gte = dateEndedAt.gte
                    lte = dateEndedAt.lte
                    additionalProperties = dateEndedAt.additionalProperties.toBuilder()
                }

                /** ISO 8601 date for filtering room sessions ended on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /** ISO 8601 date for filtering room sessions ended on or after that date. */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /** ISO 8601 date for filtering room sessions ended on or before that date. */
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
                 * Returns an immutable instance of [DateEndedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateEndedAt = DateEndedAt(eq, gte, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateEndedAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DateEndedAt{eq=$eq, gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
        }

        class DateUpdatedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
            private val additionalProperties: QueryParams,
        ) {

            /** ISO 8601 date for filtering room sessions updated on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering room sessions updated on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering room sessions updated on or before that date. */
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

                /** ISO 8601 date for filtering room sessions updated on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /** ISO 8601 date for filtering room sessions updated on or after that date. */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /** ISO 8601 date for filtering room sessions updated on or before that date. */
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
                active == other.active &&
                dateCreatedAt == other.dateCreatedAt &&
                dateEndedAt == other.dateEndedAt &&
                dateUpdatedAt == other.dateUpdatedAt &&
                roomId == other.roomId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                active,
                dateCreatedAt,
                dateEndedAt,
                dateUpdatedAt,
                roomId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{active=$active, dateCreatedAt=$dateCreatedAt, dateEndedAt=$dateEndedAt, dateUpdatedAt=$dateUpdatedAt, roomId=$roomId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionList0Params &&
            filter == other.filter &&
            includeParticipants == other.includeParticipants &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filter,
            includeParticipants,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionList0Params{filter=$filter, includeParticipants=$includeParticipants, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
