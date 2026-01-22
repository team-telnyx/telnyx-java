// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callevents

import com.fasterxml.jackson.annotation.JsonCreator
import com.telnyx.sdk.core.Enum
import com.telnyx.sdk.core.JsonField
import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Filters call events by given filter parameters. Events are ordered by `occurred_at`. If filter
 * for `leg_id` or `application_session_id` is not present, it only filters events from the last 24
 * hours.
 *
 * **Note**: Only one `filter[occurred_at]` can be passed.
 */
class CallEventListParams
private constructor(
    private val filter: Filter?,
    private val page: Page?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Consolidated filter parameter (deepObject style). Originally:
     * filter[application_name][contains], filter[outbound.outbound_voice_profile_id],
     * filter[leg_id], filter[application_session_id], filter[connection_id], filter[product],
     * filter[failed], filter[from], filter[to], filter[name], filter[type],
     * filter[occurred_at][eq/gt/gte/lt/lte], filter[status]
     */
    fun filter(): Optional<Filter> = Optional.ofNullable(filter)

    /**
     * Consolidated page parameter (deepObject style). Originally: page[after], page[before],
     * page[limit], page[size], page[number]
     */
    fun page(): Optional<Page> = Optional.ofNullable(page)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CallEventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CallEventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CallEventListParams]. */
    class Builder internal constructor() {

        private var filter: Filter? = null
        private var page: Page? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(callEventListParams: CallEventListParams) = apply {
            filter = callEventListParams.filter
            page = callEventListParams.page
            pageNumber = callEventListParams.pageNumber
            pageSize = callEventListParams.pageSize
            additionalHeaders = callEventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = callEventListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Consolidated filter parameter (deepObject style). Originally:
         * filter[application_name][contains], filter[outbound.outbound_voice_profile_id],
         * filter[leg_id], filter[application_session_id], filter[connection_id], filter[product],
         * filter[failed], filter[from], filter[to], filter[name], filter[type],
         * filter[occurred_at][eq/gt/gte/lt/lte], filter[status]
         */
        fun filter(filter: Filter?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<Filter>) = filter(filter.getOrNull())

        /**
         * Consolidated page parameter (deepObject style). Originally: page[after], page[before],
         * page[limit], page[size], page[number]
         */
        fun page(page: Page?) = apply { this.page = page }

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Page>) = page(page.getOrNull())

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
         * Returns an immutable instance of [CallEventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CallEventListParams =
            CallEventListParams(
                filter,
                page,
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
                    it.applicationName().ifPresent {
                        it.contains().ifPresent { put("filter[application_name][contains]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[application_name][$key]", value)
                            }
                        }
                    }
                    it.applicationSessionId().ifPresent {
                        put("filter[application_session_id]", it)
                    }
                    it.connectionId().ifPresent { put("filter[connection_id]", it) }
                    it.failed().ifPresent { put("filter[failed]", it.toString()) }
                    it.from().ifPresent { put("filter[from]", it) }
                    it.legId().ifPresent { put("filter[leg_id]", it) }
                    it.name().ifPresent { put("filter[name]", it) }
                    it.occurredAt().ifPresent {
                        it.eq().ifPresent { put("filter[occurred_at][eq]", it) }
                        it.gt().ifPresent { put("filter[occurred_at][gt]", it) }
                        it.gte().ifPresent { put("filter[occurred_at][gte]", it) }
                        it.lt().ifPresent { put("filter[occurred_at][lt]", it) }
                        it.lte().ifPresent { put("filter[occurred_at][lte]", it) }
                        it._additionalProperties().keys().forEach { key ->
                            it._additionalProperties().values(key).forEach { value ->
                                put("filter[occurred_at][$key]", value)
                            }
                        }
                    }
                    it.outboundOutboundVoiceProfileId().ifPresent {
                        put("filter[outbound.outbound_voice_profile_id]", it)
                    }
                    it.product().ifPresent { put("filter[product]", it.toString()) }
                    it.status().ifPresent { put("filter[status]", it.toString()) }
                    it.to().ifPresent { put("filter[to]", it) }
                    it.type().ifPresent { put("filter[type]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("filter[$key]", value)
                        }
                    }
                }
                page?.let {
                    it.after().ifPresent { put("page[after]", it) }
                    it.before().ifPresent { put("page[before]", it) }
                    it.limit().ifPresent { put("page[limit]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("page[$key]", value)
                        }
                    }
                }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Consolidated filter parameter (deepObject style). Originally:
     * filter[application_name][contains], filter[outbound.outbound_voice_profile_id],
     * filter[leg_id], filter[application_session_id], filter[connection_id], filter[product],
     * filter[failed], filter[from], filter[to], filter[name], filter[type],
     * filter[occurred_at][eq/gt/gte/lt/lte], filter[status]
     */
    class Filter
    private constructor(
        private val applicationName: ApplicationName?,
        private val applicationSessionId: String?,
        private val connectionId: String?,
        private val failed: Boolean?,
        private val from: String?,
        private val legId: String?,
        private val name: String?,
        private val occurredAt: OccurredAt?,
        private val outboundOutboundVoiceProfileId: String?,
        private val product: Product?,
        private val status: Status?,
        private val to: String?,
        private val type: Type?,
        private val additionalProperties: QueryParams,
    ) {

        /** Application name filters */
        fun applicationName(): Optional<ApplicationName> = Optional.ofNullable(applicationName)

        /**
         * The unique identifier of the call session. A session may include multiple call leg
         * events.
         */
        fun applicationSessionId(): Optional<String> = Optional.ofNullable(applicationSessionId)

        /** The unique identifier of the conection. */
        fun connectionId(): Optional<String> = Optional.ofNullable(connectionId)

        /** Delivery failed or not. */
        fun failed(): Optional<Boolean> = Optional.ofNullable(failed)

        /** Filter by From number. */
        fun from(): Optional<String> = Optional.ofNullable(from)

        /** The unique identifier of an individual call leg. */
        fun legId(): Optional<String> = Optional.ofNullable(legId)

        /**
         * If present, conferences will be filtered to those with a matching `name` attribute.
         * Matching is case-sensitive
         */
        fun name(): Optional<String> = Optional.ofNullable(name)

        /** Event occurred_at filters */
        fun occurredAt(): Optional<OccurredAt> = Optional.ofNullable(occurredAt)

        /** Identifies the associated outbound voice profile. */
        fun outboundOutboundVoiceProfileId(): Optional<String> =
            Optional.ofNullable(outboundOutboundVoiceProfileId)

        /** Filter by product. */
        fun product(): Optional<Product> = Optional.ofNullable(product)

        /** If present, conferences will be filtered by status. */
        fun status(): Optional<Status> = Optional.ofNullable(status)

        /** Filter by To number. */
        fun to(): Optional<String> = Optional.ofNullable(to)

        /** Event type */
        fun type(): Optional<Type> = Optional.ofNullable(type)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Filter]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Filter]. */
        class Builder internal constructor() {

            private var applicationName: ApplicationName? = null
            private var applicationSessionId: String? = null
            private var connectionId: String? = null
            private var failed: Boolean? = null
            private var from: String? = null
            private var legId: String? = null
            private var name: String? = null
            private var occurredAt: OccurredAt? = null
            private var outboundOutboundVoiceProfileId: String? = null
            private var product: Product? = null
            private var status: Status? = null
            private var to: String? = null
            private var type: Type? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(filter: Filter) = apply {
                applicationName = filter.applicationName
                applicationSessionId = filter.applicationSessionId
                connectionId = filter.connectionId
                failed = filter.failed
                from = filter.from
                legId = filter.legId
                name = filter.name
                occurredAt = filter.occurredAt
                outboundOutboundVoiceProfileId = filter.outboundOutboundVoiceProfileId
                product = filter.product
                status = filter.status
                to = filter.to
                type = filter.type
                additionalProperties = filter.additionalProperties.toBuilder()
            }

            /** Application name filters */
            fun applicationName(applicationName: ApplicationName?) = apply {
                this.applicationName = applicationName
            }

            /** Alias for calling [Builder.applicationName] with `applicationName.orElse(null)`. */
            fun applicationName(applicationName: Optional<ApplicationName>) =
                applicationName(applicationName.getOrNull())

            /**
             * The unique identifier of the call session. A session may include multiple call leg
             * events.
             */
            fun applicationSessionId(applicationSessionId: String?) = apply {
                this.applicationSessionId = applicationSessionId
            }

            /**
             * Alias for calling [Builder.applicationSessionId] with
             * `applicationSessionId.orElse(null)`.
             */
            fun applicationSessionId(applicationSessionId: Optional<String>) =
                applicationSessionId(applicationSessionId.getOrNull())

            /** The unique identifier of the conection. */
            fun connectionId(connectionId: String?) = apply { this.connectionId = connectionId }

            /** Alias for calling [Builder.connectionId] with `connectionId.orElse(null)`. */
            fun connectionId(connectionId: Optional<String>) =
                connectionId(connectionId.getOrNull())

            /** Delivery failed or not. */
            fun failed(failed: Boolean?) = apply { this.failed = failed }

            /**
             * Alias for [Builder.failed].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun failed(failed: Boolean) = failed(failed as Boolean?)

            /** Alias for calling [Builder.failed] with `failed.orElse(null)`. */
            fun failed(failed: Optional<Boolean>) = failed(failed.getOrNull())

            /** Filter by From number. */
            fun from(from: String?) = apply { this.from = from }

            /** Alias for calling [Builder.from] with `from.orElse(null)`. */
            fun from(from: Optional<String>) = from(from.getOrNull())

            /** The unique identifier of an individual call leg. */
            fun legId(legId: String?) = apply { this.legId = legId }

            /** Alias for calling [Builder.legId] with `legId.orElse(null)`. */
            fun legId(legId: Optional<String>) = legId(legId.getOrNull())

            /**
             * If present, conferences will be filtered to those with a matching `name` attribute.
             * Matching is case-sensitive
             */
            fun name(name: String?) = apply { this.name = name }

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /** Event occurred_at filters */
            fun occurredAt(occurredAt: OccurredAt?) = apply { this.occurredAt = occurredAt }

            /** Alias for calling [Builder.occurredAt] with `occurredAt.orElse(null)`. */
            fun occurredAt(occurredAt: Optional<OccurredAt>) = occurredAt(occurredAt.getOrNull())

            /** Identifies the associated outbound voice profile. */
            fun outboundOutboundVoiceProfileId(outboundOutboundVoiceProfileId: String?) = apply {
                this.outboundOutboundVoiceProfileId = outboundOutboundVoiceProfileId
            }

            /**
             * Alias for calling [Builder.outboundOutboundVoiceProfileId] with
             * `outboundOutboundVoiceProfileId.orElse(null)`.
             */
            fun outboundOutboundVoiceProfileId(outboundOutboundVoiceProfileId: Optional<String>) =
                outboundOutboundVoiceProfileId(outboundOutboundVoiceProfileId.getOrNull())

            /** Filter by product. */
            fun product(product: Product?) = apply { this.product = product }

            /** Alias for calling [Builder.product] with `product.orElse(null)`. */
            fun product(product: Optional<Product>) = product(product.getOrNull())

            /** If present, conferences will be filtered by status. */
            fun status(status: Status?) = apply { this.status = status }

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<Status>) = status(status.getOrNull())

            /** Filter by To number. */
            fun to(to: String?) = apply { this.to = to }

            /** Alias for calling [Builder.to] with `to.orElse(null)`. */
            fun to(to: Optional<String>) = to(to.getOrNull())

            /** Event type */
            fun type(type: Type?) = apply { this.type = type }

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<Type>) = type(type.getOrNull())

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
                    applicationName,
                    applicationSessionId,
                    connectionId,
                    failed,
                    from,
                    legId,
                    name,
                    occurredAt,
                    outboundOutboundVoiceProfileId,
                    product,
                    status,
                    to,
                    type,
                    additionalProperties.build(),
                )
        }

        /** Application name filters */
        class ApplicationName
        private constructor(
            private val contains: String?,
            private val additionalProperties: QueryParams,
        ) {

            /**
             * If present, applications with <code>application_name</code> containing the given
             * value will be returned. Matching is not case-sensitive. Requires at least three
             * characters.
             */
            fun contains(): Optional<String> = Optional.ofNullable(contains)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [ApplicationName]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ApplicationName]. */
            class Builder internal constructor() {

                private var contains: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(applicationName: ApplicationName) = apply {
                    contains = applicationName.contains
                    additionalProperties = applicationName.additionalProperties.toBuilder()
                }

                /**
                 * If present, applications with <code>application_name</code> containing the given
                 * value will be returned. Matching is not case-sensitive. Requires at least three
                 * characters.
                 */
                fun contains(contains: String?) = apply { this.contains = contains }

                /** Alias for calling [Builder.contains] with `contains.orElse(null)`. */
                fun contains(contains: Optional<String>) = contains(contains.getOrNull())

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
                 * Returns an immutable instance of [ApplicationName].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ApplicationName =
                    ApplicationName(contains, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApplicationName &&
                    contains == other.contains &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contains, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApplicationName{contains=$contains, additionalProperties=$additionalProperties}"
        }

        /** Event occurred_at filters */
        class OccurredAt
        private constructor(
            private val eq: String?,
            private val gt: String?,
            private val gte: String?,
            private val lt: String?,
            private val lte: String?,
            private val additionalProperties: QueryParams,
        ) {

            /** Event occurred_at: equal */
            fun eq(): Optional<String> = Optional.ofNullable(eq)

            /** Event occurred_at: greater than */
            fun gt(): Optional<String> = Optional.ofNullable(gt)

            /** Event occurred_at: greater than or equal */
            fun gte(): Optional<String> = Optional.ofNullable(gte)

            /** Event occurred_at: lower than */
            fun lt(): Optional<String> = Optional.ofNullable(lt)

            /** Event occurred_at: lower than or equal */
            fun lte(): Optional<String> = Optional.ofNullable(lte)

            /** Query params to send with the request. */
            fun _additionalProperties(): QueryParams = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [OccurredAt]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OccurredAt]. */
            class Builder internal constructor() {

                private var eq: String? = null
                private var gt: String? = null
                private var gte: String? = null
                private var lt: String? = null
                private var lte: String? = null
                private var additionalProperties: QueryParams.Builder = QueryParams.builder()

                @JvmSynthetic
                internal fun from(occurredAt: OccurredAt) = apply {
                    eq = occurredAt.eq
                    gt = occurredAt.gt
                    gte = occurredAt.gte
                    lt = occurredAt.lt
                    lte = occurredAt.lte
                    additionalProperties = occurredAt.additionalProperties.toBuilder()
                }

                /** Event occurred_at: equal */
                fun eq(eq: String?) = apply { this.eq = eq }

                /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
                fun eq(eq: Optional<String>) = eq(eq.getOrNull())

                /** Event occurred_at: greater than */
                fun gt(gt: String?) = apply { this.gt = gt }

                /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
                fun gt(gt: Optional<String>) = gt(gt.getOrNull())

                /** Event occurred_at: greater than or equal */
                fun gte(gte: String?) = apply { this.gte = gte }

                /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
                fun gte(gte: Optional<String>) = gte(gte.getOrNull())

                /** Event occurred_at: lower than */
                fun lt(lt: String?) = apply { this.lt = lt }

                /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
                fun lt(lt: Optional<String>) = lt(lt.getOrNull())

                /** Event occurred_at: lower than or equal */
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
                 * Returns an immutable instance of [OccurredAt].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OccurredAt =
                    OccurredAt(eq, gt, gte, lt, lte, additionalProperties.build())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OccurredAt &&
                    eq == other.eq &&
                    gt == other.gt &&
                    gte == other.gte &&
                    lt == other.lt &&
                    lte == other.lte &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(eq, gt, gte, lt, lte, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OccurredAt{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
        }

        /** Filter by product. */
        class Product @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CALL_CONTROL = of("call_control")

                @JvmField val FAX = of("fax")

                @JvmField val TEXML = of("texml")

                @JvmStatic fun of(value: String) = Product(JsonField.of(value))
            }

            /** An enum containing [Product]'s known values. */
            enum class Known {
                CALL_CONTROL,
                FAX,
                TEXML,
            }

            /**
             * An enum containing [Product]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Product] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CALL_CONTROL,
                FAX,
                TEXML,
                /**
                 * An enum member indicating that [Product] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CALL_CONTROL -> Value.CALL_CONTROL
                    FAX -> Value.FAX
                    TEXML -> Value.TEXML
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CALL_CONTROL -> Known.CALL_CONTROL
                    FAX -> Known.FAX
                    TEXML -> Known.TEXML
                    else -> throw TelnyxInvalidDataException("Unknown Product: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Product = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: TelnyxInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Product && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** If present, conferences will be filtered by status. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INIT = of("init")

                @JvmField val IN_PROGRESS = of("in_progress")

                @JvmField val COMPLETED = of("completed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                INIT,
                IN_PROGRESS,
                COMPLETED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INIT,
                IN_PROGRESS,
                COMPLETED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INIT -> Value.INIT
                    IN_PROGRESS -> Value.IN_PROGRESS
                    COMPLETED -> Value.COMPLETED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INIT -> Known.INIT
                    IN_PROGRESS -> Known.IN_PROGRESS
                    COMPLETED -> Known.COMPLETED
                    else -> throw TelnyxInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: TelnyxInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Event type */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMAND = of("command")

                @JvmField val WEBHOOK = of("webhook")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                COMMAND,
                WEBHOOK,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMAND,
                WEBHOOK,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMAND -> Value.COMMAND
                    WEBHOOK -> Value.WEBHOOK
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws TelnyxInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMAND -> Known.COMMAND
                    WEBHOOK -> Known.WEBHOOK
                    else -> throw TelnyxInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws TelnyxInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    TelnyxInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: TelnyxInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filter &&
                applicationName == other.applicationName &&
                applicationSessionId == other.applicationSessionId &&
                connectionId == other.connectionId &&
                failed == other.failed &&
                from == other.from &&
                legId == other.legId &&
                name == other.name &&
                occurredAt == other.occurredAt &&
                outboundOutboundVoiceProfileId == other.outboundOutboundVoiceProfileId &&
                product == other.product &&
                status == other.status &&
                to == other.to &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                applicationName,
                applicationSessionId,
                connectionId,
                failed,
                from,
                legId,
                name,
                occurredAt,
                outboundOutboundVoiceProfileId,
                product,
                status,
                to,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Filter{applicationName=$applicationName, applicationSessionId=$applicationSessionId, connectionId=$connectionId, failed=$failed, from=$from, legId=$legId, name=$name, occurredAt=$occurredAt, outboundOutboundVoiceProfileId=$outboundOutboundVoiceProfileId, product=$product, status=$status, to=$to, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Consolidated page parameter (deepObject style). Originally: page[after], page[before],
     * page[limit], page[size], page[number]
     */
    class Page
    private constructor(
        private val after: String?,
        private val before: String?,
        private val limit: Long?,
        private val additionalProperties: QueryParams,
    ) {

        /** Opaque identifier of next page */
        fun after(): Optional<String> = Optional.ofNullable(after)

        /** Opaque identifier of previous page */
        fun before(): Optional<String> = Optional.ofNullable(before)

        /** Limit of records per single page */
        fun limit(): Optional<Long> = Optional.ofNullable(limit)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Page]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Page]. */
        class Builder internal constructor() {

            private var after: String? = null
            private var before: String? = null
            private var limit: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(page: Page) = apply {
                after = page.after
                before = page.before
                limit = page.limit
                additionalProperties = page.additionalProperties.toBuilder()
            }

            /** Opaque identifier of next page */
            fun after(after: String?) = apply { this.after = after }

            /** Alias for calling [Builder.after] with `after.orElse(null)`. */
            fun after(after: Optional<String>) = after(after.getOrNull())

            /** Opaque identifier of previous page */
            fun before(before: String?) = apply { this.before = before }

            /** Alias for calling [Builder.before] with `before.orElse(null)`. */
            fun before(before: Optional<String>) = before(before.getOrNull())

            /** Limit of records per single page */
            fun limit(limit: Long?) = apply { this.limit = limit }

            /**
             * Alias for [Builder.limit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun limit(limit: Long) = limit(limit as Long?)

            /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
            fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

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
            fun build(): Page = Page(after, before, limit, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Page &&
                after == other.after &&
                before == other.before &&
                limit == other.limit &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(after, before, limit, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Page{after=$after, before=$before, limit=$limit, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CallEventListParams &&
            filter == other.filter &&
            page == other.page &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(filter, page, pageNumber, pageSize, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CallEventListParams{filter=$filter, page=$page, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
