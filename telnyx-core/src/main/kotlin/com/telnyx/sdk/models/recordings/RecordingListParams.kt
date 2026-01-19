// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordings

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Returns a list of your call recordings. */
class RecordingListParams
private constructor(
    private val filter: Filter?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally: filter[conference_id],
     * filter[created_at][gte], filter[created_at][lte], filter[call_leg_id],
     * filter[call_session_id], filter[from], filter[to], filter[connection_id], filter[sip_call_id]
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

        @JvmStatic fun none(): RecordingListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RecordingListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordingListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(recordingListParams: RecordingListParams) = apply {
            filter = recordingListParams.filter
            pageNumber = recordingListParams.pageNumber
            pageSize = recordingListParams.pageSize
            additionalHeaders = recordingListParams.additionalHeaders.toBuilder()
            additionalQueryParams = recordingListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally: filter[conference_id],
         * filter[created_at][gte], filter[created_at][lte], filter[call_leg_id],
         * filter[call_session_id], filter[from], filter[to], filter[connection_id],
         * filter[sip_call_id]
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
         * Returns an immutable instance of [RecordingListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RecordingListParams =
            RecordingListParams(
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
                    it.callLegId().ifPresent { put("filter[call_leg_id]", it) }
                    it.callSessionId().ifPresent { put("filter[call_session_id]", it) }
                    it.conferenceId().ifPresent { put("filter[conference_id]", it) }
                    it.connectionId().ifPresent { put("filter[connection_id]", it) }
                    it.createdAt().ifPresent {
                        it.gte().ifPresent { put("filter[created_at][gte]", it) }
                        it.lte().ifPresent { put("filter[created_at][lte]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[created_at][$key]", value)
                            }
                        }
                    }
                    it.from().ifPresent { put("filter[from]", it) }
                    it.sipCallId().ifPresent { put("filter[sip_call_id]", it) }
                    it.to().ifPresent { put("filter[to]", it) }
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
     * Consolidated filter parameter (deepObject style). Originally: filter[conference_id],
     * filter[created_at][gte], filter[created_at][lte], filter[call_leg_id],
     * filter[call_session_id], filter[from], filter[to], filter[connection_id], filter[sip_call_id]
     */
    class Filter
    private constructor(
        private val callLegId: String?,
        private val callSessionId: String?,
        private val conferenceId: String?,
        private val connectionId: String?,
        private val createdAt: CreatedAt?,
        private val from: String?,
        private val sipCallId: String?,
        private val to: String?,
        private val additionalProperties: QueryParams,
    ) {

        /** If present, recordings will be filtered to those with a matching call_leg_id. */
        fun callLegId(): Optional<String> = Optional.ofNullable(callLegId)

        /** If present, recordings will be filtered to those with a matching call_session_id. */
        fun callSessionId(): Optional<String> = Optional.ofNullable(callSessionId)

        /** Returns only recordings associated with a given conference. */
        fun conferenceId(): Optional<String> = Optional.ofNullable(conferenceId)

        /**
         * If present, recordings will be filtered to those with a matching `connection_id`
         * attribute (case-sensitive).
         */
        fun connectionId(): Optional<String> = Optional.ofNullable(connectionId)

        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        /**
         * If present, recordings will be filtered to those with a matching `from` attribute
         * (case-sensitive).
         */
        fun from(): Optional<String> = Optional.ofNullable(from)

        /**
         * If present, recordings will be filtered to those with a matching `sip_call_id` attribute.
         * Matching is case-sensitive
         */
        fun sipCallId(): Optional<String> = Optional.ofNullable(sipCallId)

        /**
         * If present, recordings will be filtered to those with a matching `to` attribute
         * (case-sensitive).
         */
        fun to(): Optional<String> = Optional.ofNullable(to)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var callLegId: String? = null
            private var callSessionId: String? = null
            private var conferenceId: String? = null
            private var connectionId: String? = null
            private var createdAt: CreatedAt? = null
            private var from: String? = null
            private var sipCallId: String? = null
            private var to: String? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                callLegId = filter.callLegId
                callSessionId = filter.callSessionId
                conferenceId = filter.conferenceId
                connectionId = filter.connectionId
                createdAt = filter.createdAt
                from = filter.from
                sipCallId = filter.sipCallId
                to = filter.to
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** If present, recordings will be filtered to those with a matching call_leg_id. */
            fun callLegId(callLegId: String?) = apply { this.callLegId = callLegId }

            /** Alias for calling [Builder.callLegId] with `callLegId.orElse(null)`. */
            fun callLegId(callLegId: Optional<String>) = callLegId(callLegId.getOrNull())

            /** If present, recordings will be filtered to those with a matching call_session_id. */
            fun callSessionId(callSessionId: String?) = apply { this.callSessionId = callSessionId }

            /** Alias for calling [Builder.callSessionId] with `callSessionId.orElse(null)`. */
            fun callSessionId(callSessionId: Optional<String>) =
                callSessionId(callSessionId.getOrNull())

            /** Returns only recordings associated with a given conference. */
            fun conferenceId(conferenceId: String?) = apply { this.conferenceId = conferenceId }

            /** Alias for calling [Builder.conferenceId] with `conferenceId.orElse(null)`. */
            fun conferenceId(conferenceId: Optional<String>) =
                conferenceId(conferenceId.getOrNull())

            /**
             * If present, recordings will be filtered to those with a matching `connection_id`
             * attribute (case-sensitive).
             */
            fun connectionId(connectionId: String?) = apply { this.connectionId = connectionId }

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<String>) =
                connectionId(connectionId.getOrNull())

            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

            /**
             * If present, recordings will be filtered to those with a matching `from` attribute
             * (case-sensitive).
             */
            fun from(from: String?) = apply { this.from = from }

            /** Alias for calling [Builder.from] with `from.orElse(null)`. */
            fun from(from: Optional<String>) = from(from.getOrNull())

            /**
             * If present, recordings will be filtered to those with a matching `sip_call_id`
             * attribute. Matching is case-sensitive
             */
            fun sipCallId(sipCallId: String?) = apply { this.sipCallId = sipCallId }

            /** Alias for calling [Builder.sipCallId] with `sipCallId.orElse(null)`. */
            fun sipCallId(sipCallId: Optional<String>) = sipCallId(sipCallId.getOrNull())

            /**
             * If present, recordings will be filtered to those with a matching `to` attribute
             * (case-sensitive).
             */
            fun to(to: String?) = apply { this.to = to }

            /** Alias for calling [Builder.to] with `to.orElse(null)`. */
            fun to(to: Optional<String>) = to(to.getOrNull())

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
                    callLegId,
                    callSessionId,
                    conferenceId,
                    connectionId,
                    createdAt,
                    from,
                    sipCallId,
                    to,
                    additionalProperties.build(),
                )
        }

        class CreatedAt
        private constructor(
            private val gte: String?,
            private val lte: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Returns only recordings created later than or at given ISO 8601 datetime. */
            fun gte(): Optional<String> = Optional.ofNullable(gte)

            /** Returns only recordings created earlier than or at given ISO 8601 datetime. */
            fun lte(): Optional<String> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreatedAt]. */
            class Builder internal constructor() {

                private var gte: String? = null
                private var lte: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(createdAt: CreatedAt) = apply {
                    gte = createdAt.gte
                    lte = createdAt.lte
                    additionalProperties = createdAt.additionalProperties.toBuilder()
                }

                /** Returns only recordings created later than or at given ISO 8601 datetime. */
                fun gte(gte: String?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<String>) = gte(gte.getOrNull())

                /** Returns only recordings created earlier than or at given ISO 8601 datetime. */
                fun lte(lte: String?) = apply { this.lte = lte }

                /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
                fun lte(lte: Optional<String>) = lte(lte.getOrNull())

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
                fun build(): CreatedAt = CreatedAt(gte, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt &&
                    gte == other.gte &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(gte, lte, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreatedAt{gte=$gte, lte=$lte, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                callLegId == other.callLegId &&
                callSessionId == other.callSessionId &&
                conferenceId == other.conferenceId &&
                connectionId == other.connectionId &&
                createdAt == other.createdAt &&
                from == other.from &&
                sipCallId == other.sipCallId &&
                to == other.to &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                callLegId,
                callSessionId,
                conferenceId,
                connectionId,
                createdAt,
                from,
                sipCallId,
                to,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{callLegId=$callLegId, callSessionId=$callSessionId, conferenceId=$conferenceId, connectionId=$connectionId, createdAt=$createdAt, from=$from, sipCallId=$sipCallId, to=$to, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordingListParams &&
            filter == other.filter &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, pageNumber, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RecordingListParams{filter=$filter, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
