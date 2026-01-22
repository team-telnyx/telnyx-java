// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NumberOrderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberOrderService.list */
class NumberOrderListPage
private constructor(
    private val service: NumberOrderService,
    private val params: NumberOrderListParams,
    private val response: NumberOrderListPageResponse,
) : Page<NumberOrderListResponse> {

    /**
     * Delegates to [NumberOrderListPageResponse], but gracefully handles missing data.
     *
     * @see NumberOrderListPageResponse.data
     */
    fun data(): List<NumberOrderListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberOrderListPageResponse], but gracefully handles missing data.
     *
     * @see NumberOrderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NumberOrderListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NumberOrderListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): NumberOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NumberOrderListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NumberOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberOrderListPage].
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

    /** A builder for [NumberOrderListPage]. */
    class Builder internal constructor() {

        private var service: NumberOrderService? = null
        private var params: NumberOrderListParams? = null
        private var response: NumberOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberOrderListPage: NumberOrderListPage) = apply {
            service = numberOrderListPage.service
            params = numberOrderListPage.params
            response = numberOrderListPage.response
        }

        fun service(service: NumberOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NumberOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberOrderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NumberOrderListPage].
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
        fun build(): NumberOrderListPage =
            NumberOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberOrderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NumberOrderListPage{service=$service, params=$params, response=$response}"
}
