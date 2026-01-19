// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.async.ai.ClusterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ClusterServiceAsync.list */
class ClusterListPageAsync
private constructor(
    private val service: ClusterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ClusterListParams,
    private val response: ClusterListPageResponse,
) : PageAsync<ClusterListResponse> {

    /**
     * Delegates to [ClusterListPageResponse], but gracefully handles missing data.
     *
     * @see ClusterListPageResponse.data
     */
    fun data(): List<ClusterListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ClusterListPageResponse], but gracefully handles missing data.
     *
     * @see ClusterListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<ClusterListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ClusterListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ClusterListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ClusterListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ClusterListParams = params

    /** The response that this page was parsed from. */
    fun response(): ClusterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClusterListPageAsync].
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

    /** A builder for [ClusterListPageAsync]. */
    class Builder internal constructor() {

        private var service: ClusterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ClusterListParams? = null
        private var response: ClusterListPageResponse? = null

        @JvmSynthetic
        internal fun from(clusterListPageAsync: ClusterListPageAsync) = apply {
            service = clusterListPageAsync.service
            streamHandlerExecutor = clusterListPageAsync.streamHandlerExecutor
            params = clusterListPageAsync.params
            response = clusterListPageAsync.response
        }

        fun service(service: ClusterServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ClusterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ClusterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ClusterListPageAsync].
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
        fun build(): ClusterListPageAsync =
            ClusterListPageAsync(
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

        return other is ClusterListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ClusterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
