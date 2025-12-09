// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardorders

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.SimCardOrderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardOrderService.list */
class SimCardOrderListPage
private constructor(
    private val service: SimCardOrderService,
    private val params: SimCardOrderListParams,
    private val response: SimCardOrderListPageResponse,
) : Page<SimCardOrder> {

    /**
     * Delegates to [SimCardOrderListPageResponse], but gracefully handles missing data.
     *
     * @see SimCardOrderListPageResponse.data
     */
    fun data(): List<SimCardOrder> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SimCardOrderListPageResponse], but gracefully handles missing data.
     *
     * @see SimCardOrderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimCardOrder> = data()

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

    fun nextPageParams(): SimCardOrderListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): SimCardOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SimCardOrder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SimCardOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SimCardOrderListPage].
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

    /** A builder for [SimCardOrderListPage]. */
    class Builder internal constructor() {

        private var service: SimCardOrderService? = null
        private var params: SimCardOrderListParams? = null
        private var response: SimCardOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(simCardOrderListPage: SimCardOrderListPage) = apply {
            service = simCardOrderListPage.service
            params = simCardOrderListPage.params
            response = simCardOrderListPage.response
        }

        fun service(service: SimCardOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SimCardOrderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SimCardOrderListPage].
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
        fun build(): SimCardOrderListPage =
            SimCardOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardOrderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SimCardOrderListPage{service=$service, params=$params, response=$response}"
}
