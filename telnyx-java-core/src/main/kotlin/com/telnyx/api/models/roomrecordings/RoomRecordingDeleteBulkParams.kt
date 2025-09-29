// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.roomrecordings

import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import com.telnyx.api.core.toImmutable
import java.time.LocalDate
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Delete several room recordings in a bulk. */
class RoomRecordingDeleteBulkParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[date_ended_at][eq],
     * filter[date_ended_at][gte], filter[date_ended_at][lte], filter[date_started_at][eq],
     * filter[date_started_at][gte], filter[date_started_at][lte], filter[room_id],
     * filter[participant_id], filter[session_id], filter[status], filter[type],
     * filter[duration_secs]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /** Consolidated page parameter (deepObject style). Originally: page[size], page[number] */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    /** Additional body properties to send with the request. */
    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RoomRecordingDeleteBulkParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [RoomRecordingDeleteBulkParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RoomRecordingDeleteBulkParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(roomRecordingDeleteBulkParams: RoomRecordingDeleteBulkParams) = apply {
            filter = roomRecordingDeleteBulkParams.filter
            page = roomRecordingDeleteBulkParams.page
            additionalHeaders = roomRecordingDeleteBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = roomRecordingDeleteBulkParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                roomRecordingDeleteBulkParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[date_ended_at][eq],
         * filter[date_ended_at][gte], filter[date_ended_at][lte], filter[date_started_at][eq],
         * filter[date_started_at][gte], filter[date_started_at][lte], filter[room_id],
         * filter[participant_id], filter[session_id], filter[status], filter[type],
         * filter[duration_secs]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        /**
         * Returns an immutable instance of [RoomRecordingDeleteBulkParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RoomRecordingDeleteBulkParams =
            RoomRecordingDeleteBulkParams(
                filter,
                page,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    fun _body(): Optional<Map<String, JsonValue>> =
        Optional.ofNullable(additionalBodyProperties.ifEmpty { null })

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filter?.let {
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
                    it.dateStartedAt().ifPresent {
                        it.eq().ifPresent { put("filter[date_started_at][eq]", it.toString()) }
                        it.gte().ifPresent { put("filter[date_started_at][gte]", it.toString()) }
                        it.lte().ifPresent { put("filter[date_started_at][lte]", it.toString()) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[date_started_at][$key]", value)
                            }
                        }
                    }
                    it.durationSecs().ifPresent { put("filter[duration_secs]", it.toString()) }
                    it.participantId().ifPresent { put("filter[participant_id]", it) }
                    it.roomId().ifPresent { put("filter[room_id]", it) }
                    it.sessionId().ifPresent { put("filter[session_id]", it) }
                    it.status().ifPresent { put("filter[status]", it) }
                    it.type().ifPresent { put("filter[type]", it) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[date_ended_at][eq],
     * filter[date_ended_at][gte], filter[date_ended_at][lte], filter[date_started_at][eq],
     * filter[date_started_at][gte], filter[date_started_at][lte], filter[room_id],
     * filter[participant_id], filter[session_id], filter[status], filter[type],
     * filter[duration_secs]
     */
    class Filter
    private constructor(
        private val dateEndedAt: DateEndedAt?,
        private val dateStartedAt: DateStartedAt?,
        private val durationSecs: Long?,
        private val participantId: String?,
        private val roomId: String?,
        private val sessionId: String?,
        private val status: String?,
        private val type: String?,
        private val additionalProperties: QueryParams,
    ) {

        fun dateEndedAt(): Optional<DateEndedAt> = Optional.ofNullable(dateEndedAt)

        fun dateStartedAt(): Optional<DateStartedAt> = Optional.ofNullable(dateStartedAt)

        /** duration_secs greater or equal for filtering room recordings. */
        fun durationSecs(): Optional<Long> = Optional.ofNullable(durationSecs)

        /** participant_id for filtering room recordings. */
        fun participantId(): Optional<String> = Optional.ofNullable(participantId)

        /** room_id for filtering room recordings. */
        fun roomId(): Optional<String> = Optional.ofNullable(roomId)

        /** session_id for filtering room recordings. */
        fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

        /** status for filtering room recordings. */
        fun status(): Optional<String> = Optional.ofNullable(status)

        /** type for filtering room recordings. */
        fun type(): Optional<String> = Optional.ofNullable(type)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var dateEndedAt: DateEndedAt? = null
            private var dateStartedAt: DateStartedAt? = null
            private var durationSecs: Long? = null
            private var participantId: String? = null
            private var roomId: String? = null
            private var sessionId: String? = null
            private var status: String? = null
            private var type: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                dateEndedAt = filter.dateEndedAt
                dateStartedAt = filter.dateStartedAt
                durationSecs = filter.durationSecs
                participantId = filter.participantId
                roomId = filter.roomId
                sessionId = filter.sessionId
                status = filter.status
                type = filter.type
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            fun dateEndedAt(dateEndedAt: DateEndedAt?) = apply { this.dateEndedAt = dateEndedAt }

            /** Alias for calling [Builder.dateEndedAt] with `dateEndedAt.orElse(null)`. */
            fun dateEndedAt(dateEndedAt: Optional<DateEndedAt>) =
                dateEndedAt(dateEndedAt.getOrNull())

            fun dateStartedAt(dateStartedAt: DateStartedAt?) = apply {
                this.dateStartedAt = dateStartedAt
            }

            /** Alias for calling [Builder.dateStartedAt] with `dateStartedAt.orElse(null)`. */
            fun dateStartedAt(dateStartedAt: Optional<DateStartedAt>) =
                dateStartedAt(dateStartedAt.getOrNull())

            /** duration_secs greater or equal for filtering room recordings. */
            fun durationSecs(durationSecs: Long?) = apply { this.durationSecs = durationSecs }

            /**
             * Alias for [Builder.durationSecs].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun durationSecs(durationSecs: Long) = durationSecs(durationSecs as Long?)

            /** Alias for calling [Builder.durationSecs] with `durationSecs.orElse(null)`. */
            fun durationSecs(durationSecs: Optional<Long>) = durationSecs(durationSecs.getOrNull())

            /** participant_id for filtering room recordings. */
            fun participantId(participantId: String?) = apply { this.participantId = participantId }

            /** Alias for calling [Builder.participantId] with `participantId.orElse(null)`. */
            fun participantId(participantId: Optional<String>) =
                participantId(participantId.getOrNull())

            /** room_id for filtering room recordings. */
            fun roomId(roomId: String?) = apply { this.roomId = roomId }

            /** Alias for calling [Builder.roomId] with `roomId.orElse(null)`. */
            fun roomId(roomId: Optional<String>) = roomId(roomId.getOrNull())

            /** session_id for filtering room recordings. */
            fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

            /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
            fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

            /** status for filtering room recordings. */
            fun status(status: String?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<String>) = status(status.getOrNull())

            /** type for filtering room recordings. */
            fun type(type: String?) = apply { this.type = type }

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<String>) = type(type.getOrNull())

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
                    dateEndedAt,
                    dateStartedAt,
                    durationSecs,
                    participantId,
                    roomId,
                    sessionId,
                    status,
                    type,
                    additionalProperties.build(),
                )
        }

        class DateEndedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
        ) {

            /** ISO 8601 date for filtering room recordings ended on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering room recordings ended on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering room recordings ended on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

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

                @JvmSynthetic
                internal fun from(dateEndedAt: DateEndedAt) = apply {
                    eq = dateEndedAt.eq
                    gte = dateEndedAt.gte
                    lte = dateEndedAt.lte
                }

                /** ISO 8601 date for filtering room recordings ended on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /** ISO 8601 date for filtering room recordings ended on or after that date. */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /** ISO 8601 date for filtering room recordings ended on or before that date. */
                fun lte(lte: LocalDate?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<LocalDate>) = lte(lte.getOrNull())

                /**
                 * Returns an immutable instance of [DateEndedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateEndedAt = DateEndedAt(eq, gte, lte)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateEndedAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "DateEndedAt{eq=$eq, gte=$gte, lte=$lte}"
        }

        class DateStartedAt
        private constructor(
            private val eq: LocalDate?,
            private val gte: LocalDate?,
            private val lte: LocalDate?,
        ) {

            /** ISO 8601 date for filtering room recordings started on that date. */
            fun eq(): Optional<LocalDate> = Optional.ofNullable(eq)

            /** ISO 8601 date for filtering room recordings started on or after that date. */
            fun gte(): Optional<LocalDate> = Optional.ofNullable(gte)

            /** ISO 8601 date for filtering room recordings started on or before that date. */
            fun lte(): Optional<LocalDate> = Optional.ofNullable(lte)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [DateStartedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DateStartedAt]. */
            class Builder internal constructor() {

                private var eq: LocalDate? = null
                private var gte: LocalDate? = null
                private var lte: LocalDate? = null

                @JvmSynthetic
                internal fun from(dateStartedAt: DateStartedAt) = apply {
                    eq = dateStartedAt.eq
                    gte = dateStartedAt.gte
                    lte = dateStartedAt.lte
                }

                /** ISO 8601 date for filtering room recordings started on that date. */
                fun eq(eq: LocalDate?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<LocalDate>) = eq(eq.getOrNull())

                /** ISO 8601 date for filtering room recordings started on or after that date. */
                fun gte(gte: LocalDate?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<LocalDate>) = gte(gte.getOrNull())

                /** ISO 8601 date for filtering room recordings started on or before that date. */
                fun lte(lte: LocalDate?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<LocalDate>) = lte(lte.getOrNull())

                /**
                 * Returns an immutable instance of [DateStartedAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DateStartedAt = DateStartedAt(eq, gte, lte)
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DateStartedAt &&
                    eq == other.eq &&
                    gte == other.gte &&
                    lte == other.lte
            }

            private val hashCode: Int by lazy { Objects.hash(eq, gte, lte) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "DateStartedAt{eq=$eq, gte=$gte, lte=$lte}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                dateEndedAt == other.dateEndedAt &&
                dateStartedAt == other.dateStartedAt &&
                durationSecs == other.durationSecs &&
                participantId == other.participantId &&
                roomId == other.roomId &&
                sessionId == other.sessionId &&
                status == other.status &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                dateEndedAt,
                dateStartedAt,
                durationSecs,
                participantId,
                roomId,
                sessionId,
                status,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{dateEndedAt=$dateEndedAt, dateStartedAt=$dateStartedAt, durationSecs=$durationSecs, participantId=$participantId, roomId=$roomId, sessionId=$sessionId, status=$status, type=$type, additionalProperties=$additionalProperties}"
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

        return other is RoomRecordingDeleteBulkParams &&
            filter == other.filter &&
            page == other.page &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams &&
            additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int =
        Objects.hash(
            filter,
            page,
            additionalHeaders,
            additionalQueryParams,
            additionalBodyProperties,
        )

    override fun toString() =
        "RoomRecordingDeleteBulkParams{filter=$filter, page=$page, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
