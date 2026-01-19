// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.SimpleSimCard
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.SimCardServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardServiceAsync.list */
class SimCardListPageAsync
private constructor(
    private val service: SimCardServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SimCardListParams,
    private val response: SimCardListPageResponse,
) : PageAsync<SimpleSimCard> {

    /**
     * Delegates to [SimCardListPageResponse], but gracefully handles missing data.
     *
     * @see SimCardListPageResponse.data
     */
    fun data(): List<SimpleSimCard> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SimCardListPageResponse], but gracefully handles missing data.
     *
     * @see SimCardListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimpleSimCard> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): SimCardListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SimCardListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimpleSimCard> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SimCardListParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SimCardListPageAsync].
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

    /** A builder for [SimCardListPageAsync]. */
    class Builder internal constructor() {

        private var service: SimCardServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SimCardListParams? = null
        private var response: SimCardListPageResponse? = null

        @JvmSynthetic
        internal fun from(simCardListPageAsync: SimCardListPageAsync) = apply {
            service = simCardListPageAsync.service
            streamHandlerExecutor = simCardListPageAsync.streamHandlerExecutor
            params = simCardListPageAsync.params
            response = simCardListPageAsync.response
        }

        fun service(service: SimCardServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SimCardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SimCardListPageAsync].
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
        fun build(): SimCardListPageAsync =
            SimCardListPageAsync(
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

        return other is SimCardListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SimCardListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
