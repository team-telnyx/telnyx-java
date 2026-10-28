// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payconnectors

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List connectors belonging to the authenticated organization, including connectors created by
 * other users in that organization. Set filter[type]=generic to restrict results to the type
 * covered here. Results default to newest created_at first. Use meta.end_cursor as page[after] for
 * the next page, or meta.start_cursor as page[before] for the preceding page. Omit both cursors for
 * the first page; if both are supplied, page[after] takes precedence. Responses omit passwords and
 * tokens.
 */
class PayConnectorListParams
private constructor(
    private val filterCreatedAtEq: String?,
    private val filterCreatedAtGt: String?,
    private val filterCreatedAtGte: String?,
    private val filterCreatedAtLt: String?,
    private val filterCreatedAtLte: String?,
    private val filterMode: String?,
    private val filterName: String?,
    private val filterType: String?,
    private val filterUpdatedAtEq: String?,
    private val filterUpdatedAtGt: String?,
    private val filterUpdatedAtGte: String?,
    private val filterUpdatedAtLt: String?,
    private val filterUpdatedAtLte: String?,
    private val pageAfter: String?,
    private val pageBefore: String?,
    private val pageSize: Long?,
    private val sort: String?,
    private val additionalHeaders: com.telnyx.sdk.core.http.Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Equal to this created_at timestamp. */
    fun filterCreatedAtEq(): Optional<String> = Optional.ofNullable(filterCreatedAtEq)

    /** After this created_at timestamp. */
    fun filterCreatedAtGt(): Optional<String> = Optional.ofNullable(filterCreatedAtGt)

    /** At or after this created_at timestamp. */
    fun filterCreatedAtGte(): Optional<String> = Optional.ofNullable(filterCreatedAtGte)

    /** Before this created_at timestamp. */
    fun filterCreatedAtLt(): Optional<String> = Optional.ofNullable(filterCreatedAtLt)

    /** At or before this created_at timestamp. */
    fun filterCreatedAtLte(): Optional<String> = Optional.ofNullable(filterCreatedAtLte)

    /** Exact match on mode. */
    fun filterMode(): Optional<String> = Optional.ofNullable(filterMode)

    /** Exact match on name. */
    fun filterName(): Optional<String> = Optional.ofNullable(filterName)

    /** Exact match on type. */
    fun filterType(): Optional<String> = Optional.ofNullable(filterType)

    /** Equal to this updated_at timestamp. */
    fun filterUpdatedAtEq(): Optional<String> = Optional.ofNullable(filterUpdatedAtEq)

    /** After this updated_at timestamp. */
    fun filterUpdatedAtGt(): Optional<String> = Optional.ofNullable(filterUpdatedAtGt)

    /** At or after this updated_at timestamp. */
    fun filterUpdatedAtGte(): Optional<String> = Optional.ofNullable(filterUpdatedAtGte)

    /** Before this updated_at timestamp. */
    fun filterUpdatedAtLt(): Optional<String> = Optional.ofNullable(filterUpdatedAtLt)

    /** At or before this updated_at timestamp. */
    fun filterUpdatedAtLte(): Optional<String> = Optional.ofNullable(filterUpdatedAtLte)

    /** Opaque cursor from meta.end_cursor. */
    fun pageAfter(): Optional<String> = Optional.ofNullable(pageAfter)

    /** Opaque cursor from meta.start_cursor. */
    fun pageBefore(): Optional<String> = Optional.ofNullable(pageBefore)

    /** Number of records per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Comma-separated created_at or updated_at fields, optionally prefixed with - for descending
     * order.
     */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PayConnectorListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PayConnectorListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayConnectorListParams]. */
    class Builder internal constructor() {

        private var filterCreatedAtEq: String? = null
        private var filterCreatedAtGt: String? = null
        private var filterCreatedAtGte: String? = null
        private var filterCreatedAtLt: String? = null
        private var filterCreatedAtLte: String? = null
        private var filterMode: String? = null
        private var filterName: String? = null
        private var filterType: String? = null
        private var filterUpdatedAtEq: String? = null
        private var filterUpdatedAtGt: String? = null
        private var filterUpdatedAtGte: String? = null
        private var filterUpdatedAtLt: String? = null
        private var filterUpdatedAtLte: String? = null
        private var pageAfter: String? = null
        private var pageBefore: String? = null
        private var pageSize: Long? = null
        private var sort: String? = null
        private var additionalHeaders: com.telnyx.sdk.core.http.Headers.Builder =
            com.telnyx.sdk.core.http.Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(payConnectorListParams: PayConnectorListParams) = apply {
            filterCreatedAtEq = payConnectorListParams.filterCreatedAtEq
            filterCreatedAtGt = payConnectorListParams.filterCreatedAtGt
            filterCreatedAtGte = payConnectorListParams.filterCreatedAtGte
            filterCreatedAtLt = payConnectorListParams.filterCreatedAtLt
            filterCreatedAtLte = payConnectorListParams.filterCreatedAtLte
            filterMode = payConnectorListParams.filterMode
            filterName = payConnectorListParams.filterName
            filterType = payConnectorListParams.filterType
            filterUpdatedAtEq = payConnectorListParams.filterUpdatedAtEq
            filterUpdatedAtGt = payConnectorListParams.filterUpdatedAtGt
            filterUpdatedAtGte = payConnectorListParams.filterUpdatedAtGte
            filterUpdatedAtLt = payConnectorListParams.filterUpdatedAtLt
            filterUpdatedAtLte = payConnectorListParams.filterUpdatedAtLte
            pageAfter = payConnectorListParams.pageAfter
            pageBefore = payConnectorListParams.pageBefore
            pageSize = payConnectorListParams.pageSize
            sort = payConnectorListParams.sort
            additionalHeaders = payConnectorListParams.additionalHeaders.toBuilder()
            additionalQueryParams = payConnectorListParams.additionalQueryParams.toBuilder()
        }

        /** Equal to this created_at timestamp. */
        fun filterCreatedAtEq(filterCreatedAtEq: String?) = apply {
            this.filterCreatedAtEq = filterCreatedAtEq
        }

        /** Alias for calling [Builder.filterCreatedAtEq] with `filterCreatedAtEq.orElse(null)`. */
        fun filterCreatedAtEq(filterCreatedAtEq: Optional<String>) =
            filterCreatedAtEq(filterCreatedAtEq.getOrNull())

        /** After this created_at timestamp. */
        fun filterCreatedAtGt(filterCreatedAtGt: String?) = apply {
            this.filterCreatedAtGt = filterCreatedAtGt
        }

        /** Alias for calling [Builder.filterCreatedAtGt] with `filterCreatedAtGt.orElse(null)`. */
        fun filterCreatedAtGt(filterCreatedAtGt: Optional<String>) =
            filterCreatedAtGt(filterCreatedAtGt.getOrNull())

        /** At or after this created_at timestamp. */
        fun filterCreatedAtGte(filterCreatedAtGte: String?) = apply {
            this.filterCreatedAtGte = filterCreatedAtGte
        }

        /**
         * Alias for calling [Builder.filterCreatedAtGte] with `filterCreatedAtGte.orElse(null)`.
         */
        fun filterCreatedAtGte(filterCreatedAtGte: Optional<String>) =
            filterCreatedAtGte(filterCreatedAtGte.getOrNull())

        /** Before this created_at timestamp. */
        fun filterCreatedAtLt(filterCreatedAtLt: String?) = apply {
            this.filterCreatedAtLt = filterCreatedAtLt
        }

        /** Alias for calling [Builder.filterCreatedAtLt] with `filterCreatedAtLt.orElse(null)`. */
        fun filterCreatedAtLt(filterCreatedAtLt: Optional<String>) =
            filterCreatedAtLt(filterCreatedAtLt.getOrNull())

        /** At or before this created_at timestamp. */
        fun filterCreatedAtLte(filterCreatedAtLte: String?) = apply {
            this.filterCreatedAtLte = filterCreatedAtLte
        }

        /**
         * Alias for calling [Builder.filterCreatedAtLte] with `filterCreatedAtLte.orElse(null)`.
         */
        fun filterCreatedAtLte(filterCreatedAtLte: Optional<String>) =
            filterCreatedAtLte(filterCreatedAtLte.getOrNull())

        /** Exact match on mode. */
        fun filterMode(filterMode: String?) = apply { this.filterMode = filterMode }

        /** Alias for calling [Builder.filterMode] with `filterMode.orElse(null)`. */
        fun filterMode(filterMode: Optional<String>) = filterMode(filterMode.getOrNull())

        /** Exact match on name. */
        fun filterName(filterName: String?) = apply { this.filterName = filterName }

        /** Alias for calling [Builder.filterName] with `filterName.orElse(null)`. */
        fun filterName(filterName: Optional<String>) = filterName(filterName.getOrNull())

        /** Exact match on type. */
        fun filterType(filterType: String?) = apply { this.filterType = filterType }

        /** Alias for calling [Builder.filterType] with `filterType.orElse(null)`. */
        fun filterType(filterType: Optional<String>) = filterType(filterType.getOrNull())

        /** Equal to this updated_at timestamp. */
        fun filterUpdatedAtEq(filterUpdatedAtEq: String?) = apply {
            this.filterUpdatedAtEq = filterUpdatedAtEq
        }

        /** Alias for calling [Builder.filterUpdatedAtEq] with `filterUpdatedAtEq.orElse(null)`. */
        fun filterUpdatedAtEq(filterUpdatedAtEq: Optional<String>) =
            filterUpdatedAtEq(filterUpdatedAtEq.getOrNull())

        /** After this updated_at timestamp. */
        fun filterUpdatedAtGt(filterUpdatedAtGt: String?) = apply {
            this.filterUpdatedAtGt = filterUpdatedAtGt
        }

        /** Alias for calling [Builder.filterUpdatedAtGt] with `filterUpdatedAtGt.orElse(null)`. */
        fun filterUpdatedAtGt(filterUpdatedAtGt: Optional<String>) =
            filterUpdatedAtGt(filterUpdatedAtGt.getOrNull())

        /** At or after this updated_at timestamp. */
        fun filterUpdatedAtGte(filterUpdatedAtGte: String?) = apply {
            this.filterUpdatedAtGte = filterUpdatedAtGte
        }

        /**
         * Alias for calling [Builder.filterUpdatedAtGte] with `filterUpdatedAtGte.orElse(null)`.
         */
        fun filterUpdatedAtGte(filterUpdatedAtGte: Optional<String>) =
            filterUpdatedAtGte(filterUpdatedAtGte.getOrNull())

        /** Before this updated_at timestamp. */
        fun filterUpdatedAtLt(filterUpdatedAtLt: String?) = apply {
            this.filterUpdatedAtLt = filterUpdatedAtLt
        }

        /** Alias for calling [Builder.filterUpdatedAtLt] with `filterUpdatedAtLt.orElse(null)`. */
        fun filterUpdatedAtLt(filterUpdatedAtLt: Optional<String>) =
            filterUpdatedAtLt(filterUpdatedAtLt.getOrNull())

        /** At or before this updated_at timestamp. */
        fun filterUpdatedAtLte(filterUpdatedAtLte: String?) = apply {
            this.filterUpdatedAtLte = filterUpdatedAtLte
        }

        /**
         * Alias for calling [Builder.filterUpdatedAtLte] with `filterUpdatedAtLte.orElse(null)`.
         */
        fun filterUpdatedAtLte(filterUpdatedAtLte: Optional<String>) =
            filterUpdatedAtLte(filterUpdatedAtLte.getOrNull())

        /** Opaque cursor from meta.end_cursor. */
        fun pageAfter(pageAfter: String?) = apply { this.pageAfter = pageAfter }

        /** Alias for calling [Builder.pageAfter] with `pageAfter.orElse(null)`. */
        fun pageAfter(pageAfter: Optional<String>) = pageAfter(pageAfter.getOrNull())

        /** Opaque cursor from meta.start_cursor. */
        fun pageBefore(pageBefore: String?) = apply { this.pageBefore = pageBefore }

        /** Alias for calling [Builder.pageBefore] with `pageBefore.orElse(null)`. */
        fun pageBefore(pageBefore: Optional<String>) = pageBefore(pageBefore.getOrNull())

        /** Number of records per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * Comma-separated created_at or updated_at fields, optionally prefixed with - for
         * descending order.
         */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

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
         * Returns an immutable instance of [PayConnectorListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PayConnectorListParams =
            PayConnectorListParams(
                filterCreatedAtEq,
                filterCreatedAtGt,
                filterCreatedAtGte,
                filterCreatedAtLt,
                filterCreatedAtLte,
                filterMode,
                filterName,
                filterType,
                filterUpdatedAtEq,
                filterUpdatedAtGt,
                filterUpdatedAtGte,
                filterUpdatedAtLt,
                filterUpdatedAtLte,
                pageAfter,
                pageBefore,
                pageSize,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): com.telnyx.sdk.core.http.Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterCreatedAtEq?.let { put("filter[created_at][eq]", it) }
                filterCreatedAtGt?.let { put("filter[created_at][gt]", it) }
                filterCreatedAtGte?.let { put("filter[created_at][gte]", it) }
                filterCreatedAtLt?.let { put("filter[created_at][lt]", it) }
                filterCreatedAtLte?.let { put("filter[created_at][lte]", it) }
                filterMode?.let { put("filter[mode]", it) }
                filterName?.let { put("filter[name]", it) }
                filterType?.let { put("filter[type]", it) }
                filterUpdatedAtEq?.let { put("filter[updated_at][eq]", it) }
                filterUpdatedAtGt?.let { put("filter[updated_at][gt]", it) }
                filterUpdatedAtGte?.let { put("filter[updated_at][gte]", it) }
                filterUpdatedAtLt?.let { put("filter[updated_at][lt]", it) }
                filterUpdatedAtLte?.let { put("filter[updated_at][lte]", it) }
                pageAfter?.let { put("page[after]", it) }
                pageBefore?.let { put("page[before]", it) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PayConnectorListParams &&
            filterCreatedAtEq == other.filterCreatedAtEq &&
            filterCreatedAtGt == other.filterCreatedAtGt &&
            filterCreatedAtGte == other.filterCreatedAtGte &&
            filterCreatedAtLt == other.filterCreatedAtLt &&
            filterCreatedAtLte == other.filterCreatedAtLte &&
            filterMode == other.filterMode &&
            filterName == other.filterName &&
            filterType == other.filterType &&
            filterUpdatedAtEq == other.filterUpdatedAtEq &&
            filterUpdatedAtGt == other.filterUpdatedAtGt &&
            filterUpdatedAtGte == other.filterUpdatedAtGte &&
            filterUpdatedAtLt == other.filterUpdatedAtLt &&
            filterUpdatedAtLte == other.filterUpdatedAtLte &&
            pageAfter == other.pageAfter &&
            pageBefore == other.pageBefore &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterCreatedAtEq,
            filterCreatedAtGt,
            filterCreatedAtGte,
            filterCreatedAtLt,
            filterCreatedAtLte,
            filterMode,
            filterName,
            filterType,
            filterUpdatedAtEq,
            filterUpdatedAtGt,
            filterUpdatedAtGte,
            filterUpdatedAtLt,
            filterUpdatedAtLte,
            pageAfter,
            pageBefore,
            pageSize,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PayConnectorListParams{filterCreatedAtEq=$filterCreatedAtEq, filterCreatedAtGt=$filterCreatedAtGt, filterCreatedAtGte=$filterCreatedAtGte, filterCreatedAtLt=$filterCreatedAtLt, filterCreatedAtLte=$filterCreatedAtLte, filterMode=$filterMode, filterName=$filterName, filterType=$filterType, filterUpdatedAtEq=$filterUpdatedAtEq, filterUpdatedAtGt=$filterUpdatedAtGt, filterUpdatedAtGte=$filterUpdatedAtGte, filterUpdatedAtLt=$filterUpdatedAtLt, filterUpdatedAtLte=$filterUpdatedAtLte, pageAfter=$pageAfter, pageBefore=$pageBefore, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
