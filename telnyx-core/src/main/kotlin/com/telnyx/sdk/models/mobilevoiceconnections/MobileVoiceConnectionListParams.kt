// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilevoiceconnections

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Mobile Voice Connections */
class MobileVoiceConnectionListParams
private constructor(
    private val filterConnectionNameContains: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val sort: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter by connection name containing the given string */
    fun filterConnectionNameContains(): Optional<String> =
        Optional.ofNullable(filterConnectionNameContains)

    /** The page number to load */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** The size of the page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * Sort by field (e.g., created_at, connection_name, active). Prefix with - for descending
     * order.
     */
    fun sort(): Optional<String> = Optional.ofNullable(sort)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): MobileVoiceConnectionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobileVoiceConnectionListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MobileVoiceConnectionListParams]. */
    class Builder internal constructor() {

        private var filterConnectionNameContains: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var sort: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mobileVoiceConnectionListParams: MobileVoiceConnectionListParams) =
            apply {
                filterConnectionNameContains =
                    mobileVoiceConnectionListParams.filterConnectionNameContains
                pageNumber = mobileVoiceConnectionListParams.pageNumber
                pageSize = mobileVoiceConnectionListParams.pageSize
                sort = mobileVoiceConnectionListParams.sort
                additionalHeaders = mobileVoiceConnectionListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    mobileVoiceConnectionListParams.additionalQueryParams.toBuilder()
            }

        /** Filter by connection name containing the given string */
        fun filterConnectionNameContains(filterConnectionNameContains: String?) = apply {
            this.filterConnectionNameContains = filterConnectionNameContains
        }

        /**
         * Alias for calling [Builder.filterConnectionNameContains] with
         * `filterConnectionNameContains.orElse(null)`.
         */
        fun filterConnectionNameContains(filterConnectionNameContains: Optional<String>) =
            filterConnectionNameContains(filterConnectionNameContains.getOrNull())

        /** The page number to load */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** The size of the page */
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
         * Sort by field (e.g., created_at, connection_name, active). Prefix with - for descending
         * order.
         */
        fun sort(sort: String?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<String>) = sort(sort.getOrNull())

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
         * Returns an immutable instance of [MobileVoiceConnectionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): MobileVoiceConnectionListParams =
            MobileVoiceConnectionListParams(
                filterConnectionNameContains,
                pageNumber,
                pageSize,
                sort,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                filterConnectionNameContains?.let { put("filter[connection_name][contains]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                sort?.let { put("sort", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobileVoiceConnectionListParams &&
            filterConnectionNameContains == other.filterConnectionNameContains &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            sort == other.sort &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterConnectionNameContains,
            pageNumber,
            pageSize,
            sort,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "MobileVoiceConnectionListParams{filterConnectionNameContains=$filterConnectionNameContains, pageNumber=$pageNumber, pageSize=$pageSize, sort=$sort, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
