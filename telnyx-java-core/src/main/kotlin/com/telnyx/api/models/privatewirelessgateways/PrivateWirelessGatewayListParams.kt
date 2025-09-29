// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.privatewirelessgateways

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all Private Wireless Gateways belonging to the user. */
class PrivateWirelessGatewayListParams
private constructor(
    private val filterCreatedAt: String?,
    private val filterIpRange: String?,
    private val filterName: String?,
    private val filterRegionCode: String?,
    private val filterUpdatedAt: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Private Wireless Gateway resource creation date. */
    fun filterCreatedAt(): Optional<String> = Optional.ofNullable(filterCreatedAt)

    /** The IP address range of the Private Wireless Gateway. */
    fun filterIpRange(): Optional<String> = Optional.ofNullable(filterIpRange)

    /** The name of the Private Wireless Gateway. */
    fun filterName(): Optional<String> = Optional.ofNullable(filterName)

    /** The name of the region where the Private Wireless Gateway is deployed. */
    fun filterRegionCode(): Optional<String> = Optional.ofNullable(filterRegionCode)

    /** When the Private Wireless Gateway was last updated. */
    fun filterUpdatedAt(): Optional<String> = Optional.ofNullable(filterUpdatedAt)

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

        @JvmStatic fun none(): PrivateWirelessGatewayListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [PrivateWirelessGatewayListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrivateWirelessGatewayListParams]. */
    class Builder internal constructor() {

        private var filterCreatedAt: String? = null
        private var filterIpRange: String? = null
        private var filterName: String? = null
        private var filterRegionCode: String? = null
        private var filterUpdatedAt: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(privateWirelessGatewayListParams: PrivateWirelessGatewayListParams) =
            apply {
                filterCreatedAt = privateWirelessGatewayListParams.filterCreatedAt
                filterIpRange = privateWirelessGatewayListParams.filterIpRange
                filterName = privateWirelessGatewayListParams.filterName
                filterRegionCode = privateWirelessGatewayListParams.filterRegionCode
                filterUpdatedAt = privateWirelessGatewayListParams.filterUpdatedAt
                pageNumber = privateWirelessGatewayListParams.pageNumber
                pageSize = privateWirelessGatewayListParams.pageSize
                additionalHeaders = privateWirelessGatewayListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    privateWirelessGatewayListParams.additionalQueryParams.toBuilder()
            }

        /** Private Wireless Gateway resource creation date. */
        fun filterCreatedAt(filterCreatedAt: String?) = apply {
            this.filterCreatedAt = filterCreatedAt
        }

        /** Alias for calling [Builder.filterCreatedAt] with `filterCreatedAt.orElse(null)`. */
        fun filterCreatedAt(filterCreatedAt: Optional<String>) =
            filterCreatedAt(filterCreatedAt.getOrNull())

        /** The IP address range of the Private Wireless Gateway. */
        fun filterIpRange(filterIpRange: String?) = apply { this.filterIpRange = filterIpRange }

        /** Alias for calling [Builder.filterIpRange] with `filterIpRange.orElse(null)`. */
        fun filterIpRange(filterIpRange: Optional<String>) =
            filterIpRange(filterIpRange.getOrNull())

        /** The name of the Private Wireless Gateway. */
        fun filterName(filterName: String?) = apply { this.filterName = filterName }

        /** Alias for calling [Builder.filterName] with `filterName.orElse(null)`. */
        fun filterName(filterName: Optional<String>) = filterName(filterName.getOrNull())

        /** The name of the region where the Private Wireless Gateway is deployed. */
        fun filterRegionCode(filterRegionCode: String?) = apply {
            this.filterRegionCode = filterRegionCode
        }

        /** Alias for calling [Builder.filterRegionCode] with `filterRegionCode.orElse(null)`. */
        fun filterRegionCode(filterRegionCode: Optional<String>) =
            filterRegionCode(filterRegionCode.getOrNull())

        /** When the Private Wireless Gateway was last updated. */
        fun filterUpdatedAt(filterUpdatedAt: String?) = apply {
            this.filterUpdatedAt = filterUpdatedAt
        }

        /** Alias for calling [Builder.filterUpdatedAt] with `filterUpdatedAt.orElse(null)`. */
        fun filterUpdatedAt(filterUpdatedAt: Optional<String>) =
            filterUpdatedAt(filterUpdatedAt.getOrNull())

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
         * Returns an immutable instance of [PrivateWirelessGatewayListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PrivateWirelessGatewayListParams =
            PrivateWirelessGatewayListParams(
                filterCreatedAt,
                filterIpRange,
                filterName,
                filterRegionCode,
                filterUpdatedAt,
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
                filterCreatedAt?.let { put("filter[created_at]", it) }
                filterIpRange?.let { put("filter[ip_range]", it) }
                filterName?.let { put("filter[name]", it) }
                filterRegionCode?.let { put("filter[region_code]", it) }
                filterUpdatedAt?.let { put("filter[updated_at]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrivateWirelessGatewayListParams &&
            filterCreatedAt == other.filterCreatedAt &&
            filterIpRange == other.filterIpRange &&
            filterName == other.filterName &&
            filterRegionCode == other.filterRegionCode &&
            filterUpdatedAt == other.filterUpdatedAt &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterCreatedAt,
            filterIpRange,
            filterName,
            filterRegionCode,
            filterUpdatedAt,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PrivateWirelessGatewayListParams{filterCreatedAt=$filterCreatedAt, filterIpRange=$filterIpRange, filterName=$filterName, filterRegionCode=$filterRegionCode, filterUpdatedAt=$filterUpdatedAt, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
