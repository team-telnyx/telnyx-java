// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardgroups

import com.telnyx.api.core.Params
import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get all SIM card groups belonging to the user that match the given filters. */
class SimCardGroupListParams
private constructor(
    private val filterName: String?,
    private val filterPrivateWirelessGatewayId: String?,
    private val filterWirelessBlocklistId: String?,
    private val pageNumber: Long?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** A valid SIM card group name. */
    fun filterName(): Optional<String> = Optional.ofNullable(filterName)

    /** A Private Wireless Gateway ID associated with the group. */
    fun filterPrivateWirelessGatewayId(): Optional<String> =
        Optional.ofNullable(filterPrivateWirelessGatewayId)

    /** A Wireless Blocklist ID associated with the group. */
    fun filterWirelessBlocklistId(): Optional<String> =
        Optional.ofNullable(filterWirelessBlocklistId)

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

        @JvmStatic fun none(): SimCardGroupListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SimCardGroupListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimCardGroupListParams]. */
    class Builder internal constructor() {

        private var filterName: String? = null
        private var filterPrivateWirelessGatewayId: String? = null
        private var filterWirelessBlocklistId: String? = null
        private var pageNumber: Long? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(simCardGroupListParams: SimCardGroupListParams) = apply {
            filterName = simCardGroupListParams.filterName
            filterPrivateWirelessGatewayId = simCardGroupListParams.filterPrivateWirelessGatewayId
            filterWirelessBlocklistId = simCardGroupListParams.filterWirelessBlocklistId
            pageNumber = simCardGroupListParams.pageNumber
            pageSize = simCardGroupListParams.pageSize
            additionalHeaders = simCardGroupListParams.additionalHeaders.toBuilder()
            additionalQueryParams = simCardGroupListParams.additionalQueryParams.toBuilder()
        }

        /** A valid SIM card group name. */
        fun filterName(filterName: String?) = apply { this.filterName = filterName }

        /** Alias for calling [Builder.filterName] with `filterName.orElse(null)`. */
        fun filterName(filterName: Optional<String>) = filterName(filterName.getOrNull())

        /** A Private Wireless Gateway ID associated with the group. */
        fun filterPrivateWirelessGatewayId(filterPrivateWirelessGatewayId: String?) = apply {
            this.filterPrivateWirelessGatewayId = filterPrivateWirelessGatewayId
        }

        /**
         * Alias for calling [Builder.filterPrivateWirelessGatewayId] with
         * `filterPrivateWirelessGatewayId.orElse(null)`.
         */
        fun filterPrivateWirelessGatewayId(filterPrivateWirelessGatewayId: Optional<String>) =
            filterPrivateWirelessGatewayId(filterPrivateWirelessGatewayId.getOrNull())

        /** A Wireless Blocklist ID associated with the group. */
        fun filterWirelessBlocklistId(filterWirelessBlocklistId: String?) = apply {
            this.filterWirelessBlocklistId = filterWirelessBlocklistId
        }

        /**
         * Alias for calling [Builder.filterWirelessBlocklistId] with
         * `filterWirelessBlocklistId.orElse(null)`.
         */
        fun filterWirelessBlocklistId(filterWirelessBlocklistId: Optional<String>) =
            filterWirelessBlocklistId(filterWirelessBlocklistId.getOrNull())

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
         * Returns an immutable instance of [SimCardGroupListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SimCardGroupListParams =
            SimCardGroupListParams(
                filterName,
                filterPrivateWirelessGatewayId,
                filterWirelessBlocklistId,
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
                filterPrivateWirelessGatewayId?.let {
                    put("filter[private_wireless_gateway_id]", it)
                }
                filterWirelessBlocklistId?.let { put("filter[wireless_blocklist_id]", it) }
                pageNumber?.let { put("page[number]", it.toString()) }
                pageSize?.let { put("page[size]", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardGroupListParams &&
            filterName == other.filterName &&
            filterPrivateWirelessGatewayId == other.filterPrivateWirelessGatewayId &&
            filterWirelessBlocklistId == other.filterWirelessBlocklistId &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            filterName,
            filterPrivateWirelessGatewayId,
            filterWirelessBlocklistId,
            pageNumber,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SimCardGroupListParams{filterName=$filterName, filterPrivateWirelessGatewayId=$filterPrivateWirelessGatewayId, filterWirelessBlocklistId=$filterWirelessBlocklistId, pageNumber=$pageNumber, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
