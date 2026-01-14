// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberblockorders

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NumberBlockOrderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberBlockOrderService.list */
class NumberBlockOrderListPage
private constructor(
    private val service: NumberBlockOrderService,
    private val params: NumberBlockOrderListParams,
    private val response: NumberBlockOrderListPageResponse,
) : Page<NumberBlockOrder> {

    /**
     * Delegates to [NumberBlockOrderListPageResponse], but gracefully handles missing data.
     *
     * @see NumberBlockOrderListPageResponse.data
     */
    fun data(): List<NumberBlockOrder> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberBlockOrderListPageResponse], but gracefully handles missing data.
     *
     * @see NumberBlockOrderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NumberBlockOrder> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NumberBlockOrderListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): NumberBlockOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NumberBlockOrder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NumberBlockOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberBlockOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberBlockOrderListPage].
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

    /** A builder for [NumberBlockOrderListPage]. */
    class Builder internal constructor() {

        private var service: NumberBlockOrderService? = null
        private var params: NumberBlockOrderListParams? = null
        private var response: NumberBlockOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberBlockOrderListPage: NumberBlockOrderListPage) = apply {
            service = numberBlockOrderListPage.service
            params = numberBlockOrderListPage.params
            response = numberBlockOrderListPage.response
        }

        fun service(service: NumberBlockOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NumberBlockOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberBlockOrderListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NumberBlockOrderListPage].
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
        fun build(): NumberBlockOrderListPage =
            NumberBlockOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberBlockOrderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NumberBlockOrderListPage{service=$service, params=$params, response=$response}"
}
