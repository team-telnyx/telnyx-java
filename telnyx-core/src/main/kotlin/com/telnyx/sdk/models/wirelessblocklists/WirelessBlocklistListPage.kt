// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.WirelessBlocklistService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WirelessBlocklistService.list */
class WirelessBlocklistListPage
private constructor(
    private val service: WirelessBlocklistService,
    private val params: WirelessBlocklistListParams,
    private val response: WirelessBlocklistListPageResponse,
) : Page<WirelessBlocklist> {

    /**
     * Delegates to [WirelessBlocklistListPageResponse], but gracefully handles missing data.
     *
     * @see WirelessBlocklistListPageResponse.data
     */
    fun data(): List<WirelessBlocklist> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WirelessBlocklistListPageResponse], but gracefully handles missing data.
     *
     * @see WirelessBlocklistListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<WirelessBlocklist> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount =
            meta()
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): WirelessBlocklistListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): WirelessBlocklistListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WirelessBlocklist> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WirelessBlocklistListParams = params

    /** The response that this page was parsed from. */
    fun response(): WirelessBlocklistListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WirelessBlocklistListPage].
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

    /** A builder for [WirelessBlocklistListPage]. */
    class Builder internal constructor() {

        private var service: WirelessBlocklistService? = null
        private var params: WirelessBlocklistListParams? = null
        private var response: WirelessBlocklistListPageResponse? = null

        @JvmSynthetic
        internal fun from(wirelessBlocklistListPage: WirelessBlocklistListPage) = apply {
            service = wirelessBlocklistListPage.service
            params = wirelessBlocklistListPage.params
            response = wirelessBlocklistListPage.response
        }

        fun service(service: WirelessBlocklistService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WirelessBlocklistListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WirelessBlocklistListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WirelessBlocklistListPage].
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
        fun build(): WirelessBlocklistListPage =
            WirelessBlocklistListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WirelessBlocklistListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "WirelessBlocklistListPage{service=$service, params=$params, response=$response}"
}
