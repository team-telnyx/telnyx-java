// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.PortingOrderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PortingOrderService.list */
class PortingOrderListPage
private constructor(
    private val service: PortingOrderService,
    private val params: PortingOrderListParams,
    private val response: PortingOrderListPageResponse,
) : Page<PortingOrder> {

    /**
     * Delegates to [PortingOrderListPageResponse], but gracefully handles missing data.
     *
     * @see PortingOrderListPageResponse.data
     */
    fun data(): List<PortingOrder> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PortingOrderListPageResponse], but gracefully handles missing data.
     *
     * @see PortingOrderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingOrder> = data()

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

    fun nextPageParams(): PortingOrderListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): PortingOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PortingOrder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PortingOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): PortingOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PortingOrderListPage].
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

    /** A builder for [PortingOrderListPage]. */
    class Builder internal constructor() {

        private var service: PortingOrderService? = null
        private var params: PortingOrderListParams? = null
        private var response: PortingOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(portingOrderListPage: PortingOrderListPage) = apply {
            service = portingOrderListPage.service
            params = portingOrderListPage.params
            response = portingOrderListPage.response
        }

        fun service(service: PortingOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PortingOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PortingOrderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PortingOrderListPage].
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
        fun build(): PortingOrderListPage =
            PortingOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PortingOrderListPage{service=$service, params=$params, response=$response}"
}
