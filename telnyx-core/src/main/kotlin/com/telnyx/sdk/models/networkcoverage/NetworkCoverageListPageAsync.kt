// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkcoverage

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NetworkCoverageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NetworkCoverageServiceAsync.list */
class NetworkCoverageListPageAsync
private constructor(
    private val service: NetworkCoverageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NetworkCoverageListParams,
    private val response: NetworkCoverageListPageResponse,
) : PageAsync<NetworkCoverageListResponse> {

    /**
     * Delegates to [NetworkCoverageListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkCoverageListPageResponse.data
     */
    fun data(): List<NetworkCoverageListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NetworkCoverageListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkCoverageListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NetworkCoverageListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NetworkCoverageListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NetworkCoverageListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NetworkCoverageListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NetworkCoverageListParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkCoverageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkCoverageListPageAsync].
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

    /** A builder for [NetworkCoverageListPageAsync]. */
    class Builder internal constructor() {

        private var service: NetworkCoverageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NetworkCoverageListParams? = null
        private var response: NetworkCoverageListPageResponse? = null

        @JvmSynthetic
        internal fun from(networkCoverageListPageAsync: NetworkCoverageListPageAsync) = apply {
            service = networkCoverageListPageAsync.service
            streamHandlerExecutor = networkCoverageListPageAsync.streamHandlerExecutor
            params = networkCoverageListPageAsync.params
            response = networkCoverageListPageAsync.response
        }

        fun service(service: NetworkCoverageServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkCoverageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkCoverageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NetworkCoverageListPageAsync].
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
        fun build(): NetworkCoverageListPageAsync =
            NetworkCoverageListPageAsync(
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

        return other is NetworkCoverageListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NetworkCoverageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
