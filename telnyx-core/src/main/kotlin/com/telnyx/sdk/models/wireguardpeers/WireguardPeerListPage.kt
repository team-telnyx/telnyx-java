// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.WireguardPeerService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WireguardPeerService.list */
class WireguardPeerListPage
private constructor(
    private val service: WireguardPeerService,
    private val params: WireguardPeerListParams,
    private val response: WireguardPeerListPageResponse,
) : Page<WireguardPeerListResponse> {

    /**
     * Delegates to [WireguardPeerListPageResponse], but gracefully handles missing data.
     *
     * @see WireguardPeerListPageResponse.data
     */
    fun data(): List<WireguardPeerListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireguardPeerListPageResponse], but gracefully handles missing data.
     *
     * @see WireguardPeerListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<WireguardPeerListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): WireguardPeerListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): WireguardPeerListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WireguardPeerListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WireguardPeerListParams = params

    /** The response that this page was parsed from. */
    fun response(): WireguardPeerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireguardPeerListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireguardPeerListPage]. */
    class Builder internal constructor() {

        private var service: WireguardPeerService? = null
        private var params: WireguardPeerListParams? = null
        private var response: WireguardPeerListPageResponse? = null

        @JvmSynthetic
        internal fun from(wireguardPeerListPage: WireguardPeerListPage) = apply {
            service = wireguardPeerListPage.service
            params = wireguardPeerListPage.params
            response = wireguardPeerListPage.response
        }

        fun service(service: WireguardPeerService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WireguardPeerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WireguardPeerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WireguardPeerListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WireguardPeerListPage =
            WireguardPeerListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireguardPeerListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WireguardPeerListPage{service=$service, params=$params, response=$response}"
}
