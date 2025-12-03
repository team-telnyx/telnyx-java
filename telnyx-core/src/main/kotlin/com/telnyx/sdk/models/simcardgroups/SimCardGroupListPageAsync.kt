// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.SimCardGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardGroupServiceAsync.list */
class SimCardGroupListPageAsync
private constructor(
    private val service: SimCardGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SimCardGroupListParams,
    private val response: SimCardGroupListPageResponse,
) : PageAsync<SimCardGroupListResponse> {

    /**
     * Delegates to [SimCardGroupListPageResponse], but gracefully handles missing data.
     *
     * @see SimCardGroupListPageResponse.data
     */
    fun data(): List<SimCardGroupListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SimCardGroupListPageResponse], but gracefully handles missing data.
     *
     * @see SimCardGroupListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimCardGroupListResponse> = data()

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

    fun nextPageParams(): SimCardGroupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SimCardGroupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimCardGroupListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SimCardGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SimCardGroupListPageAsync].
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

    /** A builder for [SimCardGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: SimCardGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SimCardGroupListParams? = null
        private var response: SimCardGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(simCardGroupListPageAsync: SimCardGroupListPageAsync) = apply {
            service = simCardGroupListPageAsync.service
            streamHandlerExecutor = simCardGroupListPageAsync.streamHandlerExecutor
            params = simCardGroupListPageAsync.params
            response = simCardGroupListPageAsync.response
        }

        fun service(service: SimCardGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SimCardGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SimCardGroupListPageAsync].
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
        fun build(): SimCardGroupListPageAsync =
            SimCardGroupListPageAsync(
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

        return other is SimCardGroupListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SimCardGroupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
