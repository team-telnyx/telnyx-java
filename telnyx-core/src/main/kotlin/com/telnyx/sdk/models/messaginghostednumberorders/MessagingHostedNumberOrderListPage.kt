// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingHostedNumberOrder
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.blocking.MessagingHostedNumberOrderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingHostedNumberOrderService.list */
class MessagingHostedNumberOrderListPage
private constructor(
    private val service: MessagingHostedNumberOrderService,
    private val params: MessagingHostedNumberOrderListParams,
    private val response: MessagingHostedNumberOrderListPageResponse,
) : Page<MessagingHostedNumberOrder> {

    /**
     * Delegates to [MessagingHostedNumberOrderListPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingHostedNumberOrderListPageResponse.data
     */
    fun data(): List<MessagingHostedNumberOrder> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingHostedNumberOrderListPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingHostedNumberOrderListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingHostedNumberOrder> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessagingHostedNumberOrderListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): MessagingHostedNumberOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MessagingHostedNumberOrder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MessagingHostedNumberOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingHostedNumberOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingHostedNumberOrderListPage].
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

    /** A builder for [MessagingHostedNumberOrderListPage]. */
    class Builder internal constructor() {

        private var service: MessagingHostedNumberOrderService? = null
        private var params: MessagingHostedNumberOrderListParams? = null
        private var response: MessagingHostedNumberOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingHostedNumberOrderListPage: MessagingHostedNumberOrderListPage) =
            apply {
                service = messagingHostedNumberOrderListPage.service
                params = messagingHostedNumberOrderListPage.params
                response = messagingHostedNumberOrderListPage.response
            }

        fun service(service: MessagingHostedNumberOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingHostedNumberOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingHostedNumberOrderListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingHostedNumberOrderListPage].
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
        fun build(): MessagingHostedNumberOrderListPage =
            MessagingHostedNumberOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessagingHostedNumberOrderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MessagingHostedNumberOrderListPage{service=$service, params=$params, response=$response}"
}
