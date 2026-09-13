// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns aggregate request, latency, CPU, memory, and resource-limit metrics for a function over
 * the requested window.
 */
class FuncRetrieveMetricAggregatesParams
private constructor(
    private val id: String?,
    private val endTime: OffsetDateTime,
    private val startTime: OffsetDateTime,
    private val filterEdgeSite: String?,
    private val filterNamespace: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Exclusive window end, UTC ISO 8601 with milliseconds */
    fun endTime(): OffsetDateTime = endTime

    /** Inclusive window start, UTC ISO 8601 with milliseconds */
    fun startTime(): OffsetDateTime = startTime

    /** Edge site filter */
    fun filterEdgeSite(): Optional<String> = Optional.ofNullable(filterEdgeSite)

    /** Kubernetes namespace filter */
    fun filterNamespace(): Optional<String> = Optional.ofNullable(filterNamespace)

    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FuncRetrieveMetricAggregatesParams].
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FuncRetrieveMetricAggregatesParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var endTime: OffsetDateTime? = null
        private var startTime: OffsetDateTime? = null
        private var filterEdgeSite: String? = null
        private var filterNamespace: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(funcRetrieveMetricAggregatesParams: FuncRetrieveMetricAggregatesParams) =
            apply {
                id = funcRetrieveMetricAggregatesParams.id
                endTime = funcRetrieveMetricAggregatesParams.endTime
                startTime = funcRetrieveMetricAggregatesParams.startTime
                filterEdgeSite = funcRetrieveMetricAggregatesParams.filterEdgeSite
                filterNamespace = funcRetrieveMetricAggregatesParams.filterNamespace
                pageNumber = funcRetrieveMetricAggregatesParams.pageNumber
                pageSize = funcRetrieveMetricAggregatesParams.pageSize
                additionalHeaders = funcRetrieveMetricAggregatesParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    funcRetrieveMetricAggregatesParams.additionalQueryParams.toBuilder()
            }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Exclusive window end, UTC ISO 8601 with milliseconds */
        fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

        /** Inclusive window start, UTC ISO 8601 with milliseconds */
        fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

        /** Edge site filter */
        fun filterEdgeSite(filterEdgeSite: String?) = apply { this.filterEdgeSite = filterEdgeSite }

        /** Alias for calling [Builder.filterEdgeSite] with `filterEdgeSite.orElse(null)`. */
        fun filterEdgeSite(filterEdgeSite: Optional<String>) =
            filterEdgeSite(filterEdgeSite.getOrNull())

        /** Kubernetes namespace filter */
        fun filterNamespace(filterNamespace: String?) = apply {
            this.filterNamespace = filterNamespace
        }

        /** Alias for calling [Builder.filterNamespace] with `filterNamespace.orElse(null)`. */
        fun filterNamespace(filterNamespace: Optional<String>) =
            filterNamespace(filterNamespace.getOrNull())

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

        fun additionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun putAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) = apply {
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

        fun replaceAllAdditionalHeaders(additionalHeaders: com.telnyx.sdk.core.http.Headers) =
            apply {
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
         * Returns an immutable instance of [FuncRetrieveMetricAggregatesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endTime()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FuncRetrieveMetricAggregatesParams =
            FuncRetrieveMetricAggregatesParams(
                id,
                checkRequired("endTime", endTime),
                checkRequired("startTime", startTime),
                filterEdgeSite,
                filterNamespace,
                pageNumber,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("end_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(endTime))
                put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startTime))
                filterEdgeSite?.let { put("filter[edge_site]", it) }
                filterNamespace?.let { put("filter[namespace]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FuncRetrieveMetricAggregatesParams &&
            id == other.id &&
            endTime == other.endTime &&
            startTime == other.startTime &&
            filterEdgeSite == other.filterEdgeSite &&
            filterNamespace == other.filterNamespace &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            endTime,
            startTime,
            filterEdgeSite,
            filterNamespace,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FuncRetrieveMetricAggregatesParams{id=$id, endTime=$endTime, startTime=$startTime, filterEdgeSite=$filterEdgeSite, filterNamespace=$filterNamespace, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
