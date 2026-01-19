// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.PortingOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PortingOrderServiceAsync.list */
class PortingOrderListPageAsync
private constructor(
    private val service: PortingOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PortingOrderListParams,
    private val response: PortingOrderListPageResponse,
) : PageAsync<PortingOrder> {

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
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PortingOrderListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PortingOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortingOrder> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PortingOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): PortingOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PortingOrderListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortingOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: PortingOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PortingOrderListParams? = null
        private var response: PortingOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(portingOrderListPageAsync: PortingOrderListPageAsync) = apply {
            service = portingOrderListPageAsync.service
            streamHandlerExecutor = portingOrderListPageAsync.streamHandlerExecutor
            params = portingOrderListPageAsync.params
            response = portingOrderListPageAsync.response
        }

        fun service(service: PortingOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PortingOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PortingOrderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PortingOrderListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortingOrderListPageAsync =
            PortingOrderListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PortingOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
