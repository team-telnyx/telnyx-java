// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import com.telnyx.sdk.core.Params
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all Wireless Blocklists belonging to the user. */
class WirelessBlocklistListParams
private constructor(
    private val filterName: String?,
    private val filterType: String?,
    private val filterValues: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The name of the Wireless Blocklist. */
    fun filterName(): Optional<String> = Optional.ofNullable(filterName)

    /** When the Private Wireless Gateway was last updated. */
    fun filterType(): Optional<String> = Optional.ofNullable(filterType)

    /** Values to filter on (inclusive). */
    fun filterValues(): Optional<String> = Optional.ofNullable(filterValues)

    /** The page number to load. */
    fun pageNumber(): Optional<Long> = Optional.ofNullable(pageNumber)

    /** The size of the page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): WirelessBlocklistListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [WirelessBlocklistListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WirelessBlocklistListParams]. */
    class Builder internal constructor() {

        private var filterName: String? = null
        private var filterType: String? = null
        private var filterValues: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(wirelessBlocklistListParams: WirelessBlocklistListParams) = apply {
            filterName = wirelessBlocklistListParams.filterName
            filterType = wirelessBlocklistListParams.filterType
            filterValues = wirelessBlocklistListParams.filterValues
            pageNumber = wirelessBlocklistListParams.pageNumber
            pageSize = wirelessBlocklistListParams.pageSize
            additionalHeaders = wirelessBlocklistListParams.additionalHeaders.toBuilder()
            additionalQueryParams = wirelessBlocklistListParams.additionalQueryParams.toBuilder()
        }

        /** The name of the Wireless Blocklist. */
        fun filterName(filterName: String?) = apply { this.filterName = filterName }

        /** Alias for calling [Builder.filterName] with `filterName.orElse(null)`. */
        fun filterName(filterName: Optional<String>) = filterName(filterName.getOrNull())

        /** When the Private Wireless Gateway was last updated. */
        fun filterType(filterType: String?) = apply { this.filterType = filterType }

        /** Alias for calling [Builder.filterType] with `filterType.orElse(null)`. */
        fun filterType(filterType: Optional<String>) = filterType(filterType.getOrNull())

        /** Values to filter on (inclusive). */
        fun filterValues(filterValues: String?) = apply { this.filterValues = filterValues }

        /** Alias for calling [Builder.filterValues] with `filterValues.orElse(null)`. */
        fun filterValues(filterValues: Optional<String>) = filterValues(filterValues.getOrNull())

        /** The page number to load. */
        fun pageNumber(pageNumber: Long?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Long) = pageNumber(pageNumber as Long?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Long>) = pageNumber(pageNumber.getOrNull())

        /** The size of the page. */
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
         * Returns an immutable instance of [WirelessBlocklistListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WirelessBlocklistListParams =
            WirelessBlocklistListParams(
                filterName,
                filterType,
                filterValues,
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
                filterName?.let { put("filter[name]", it) }
                filterType?.let { put("filter[type]", it) }
                filterValues?.let { put("filter[values]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WirelessBlocklistListParams &&
            filterName == other.filterName &&
            filterType == other.filterType &&
            filterValues == other.filterValues &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterName,
            filterType,
            filterValues,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "WirelessBlocklistListParams{filterName=$filterName, filterType=$filterType, filterValues=$filterValues, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
