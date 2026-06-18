// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.inexplicitnumberorders

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.InexplicitNumberOrderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InexplicitNumberOrderService.list */
class InexplicitNumberOrderListPage
private constructor(
    private val service: InexplicitNumberOrderService,
    private val params: InexplicitNumberOrderListParams,
    private val response: InexplicitNumberOrderListPageResponse,
) : Page<InexplicitNumberOrderResponse> {

    /**
     * Delegates to [InexplicitNumberOrderListPageResponse], but gracefully handles missing data.
     *
     * @see InexplicitNumberOrderListPageResponse.data
     */
    fun data(): List<InexplicitNumberOrderResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InexplicitNumberOrderListPageResponse], but gracefully handles missing data.
     *
     * @see InexplicitNumberOrderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<InexplicitNumberOrderResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): InexplicitNumberOrderListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): InexplicitNumberOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InexplicitNumberOrderResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InexplicitNumberOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): InexplicitNumberOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InexplicitNumberOrderListPage].
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

    /** A builder for [InexplicitNumberOrderListPage]. */
    class Builder internal constructor() {

        private var service: InexplicitNumberOrderService? = null
        private var params: InexplicitNumberOrderListParams? = null
        private var response: InexplicitNumberOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(inexplicitNumberOrderListPage: InexplicitNumberOrderListPage) = apply {
            service = inexplicitNumberOrderListPage.service
            params = inexplicitNumberOrderListPage.params
            response = inexplicitNumberOrderListPage.response
        }

        fun service(service: InexplicitNumberOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InexplicitNumberOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InexplicitNumberOrderListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InexplicitNumberOrderListPage].
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
        fun build(): InexplicitNumberOrderListPage =
            InexplicitNumberOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InexplicitNumberOrderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InexplicitNumberOrderListPage{service=$service, params=$params, response=$response}"
}
