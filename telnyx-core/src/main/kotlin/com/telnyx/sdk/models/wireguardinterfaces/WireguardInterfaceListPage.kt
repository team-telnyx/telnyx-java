// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardinterfaces

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.WireguardInterfaceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WireguardInterfaceService.list */
class WireguardInterfaceListPage
private constructor(
    private val service: WireguardInterfaceService,
    private val params: WireguardInterfaceListParams,
    private val response: WireguardInterfaceListPageResponse,
) : Page<WireguardInterfaceListResponse> {

    /**
     * Delegates to [WireguardInterfaceListPageResponse], but gracefully handles missing data.
     *
     * @see WireguardInterfaceListPageResponse.data
     */
    fun data(): List<WireguardInterfaceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireguardInterfaceListPageResponse], but gracefully handles missing data.
     *
     * @see WireguardInterfaceListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<WireguardInterfaceListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): WireguardInterfaceListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): WireguardInterfaceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WireguardInterfaceListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WireguardInterfaceListParams = params

    /** The response that this page was parsed from. */
    fun response(): WireguardInterfaceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireguardInterfaceListPage].
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

    /** A builder for [WireguardInterfaceListPage]. */
    class Builder internal constructor() {

        private var service: WireguardInterfaceService? = null
        private var params: WireguardInterfaceListParams? = null
        private var response: WireguardInterfaceListPageResponse? = null

        @JvmSynthetic
        internal fun from(wireguardInterfaceListPage: WireguardInterfaceListPage) = apply {
            service = wireguardInterfaceListPage.service
            params = wireguardInterfaceListPage.params
            response = wireguardInterfaceListPage.response
        }

        fun service(service: WireguardInterfaceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WireguardInterfaceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WireguardInterfaceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WireguardInterfaceListPage].
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
        fun build(): WireguardInterfaceListPage =
            WireguardInterfaceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireguardInterfaceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WireguardInterfaceListPage{service=$service, params=$params, response=$response}"
}
