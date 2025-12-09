// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardorders

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.SimCardOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardOrderServiceAsync.list */
class SimCardOrderListPageAsync
private constructor(
    private val service: SimCardOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SimCardOrderListParams,
    private val response: SimCardOrderListPageResponse,
) : PageAsync<SimCardOrder> {

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

    override fun nextPage(): CompletableFuture<SimCardOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimCardOrder> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SimCardOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SimCardOrderListPageAsync].
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

    /** A builder for [SimCardOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: SimCardOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SimCardOrderListParams? = null
        private var response: SimCardOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(simCardOrderListPageAsync: SimCardOrderListPageAsync) = apply {
            service = simCardOrderListPageAsync.service
            streamHandlerExecutor = simCardOrderListPageAsync.streamHandlerExecutor
            params = simCardOrderListPageAsync.params
            response = simCardOrderListPageAsync.response
        }

        fun service(service: SimCardOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SimCardOrderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SimCardOrderListPageAsync].
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
        fun build(): SimCardOrderListPageAsync =
            SimCardOrderListPageAsync(
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

        return other is SimCardOrderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SimCardOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
