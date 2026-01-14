// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NetworkServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NetworkServiceAsync.list */
class NetworkListPageAsync
private constructor(
    private val service: NetworkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NetworkListParams,
    private val response: NetworkListPageResponse,
) : PageAsync<NetworkListResponse> {

    /**
     * Delegates to [NetworkListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkListPageResponse.data
     */
    fun data(): List<NetworkListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NetworkListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NetworkListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NetworkListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NetworkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NetworkListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NetworkListParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkListPageAsync].
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

    /** A builder for [NetworkListPageAsync]. */
    class Builder internal constructor() {

        private var service: NetworkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NetworkListParams? = null
        private var response: NetworkListPageResponse? = null

        @JvmSynthetic
        internal fun from(networkListPageAsync: NetworkListPageAsync) = apply {
            service = networkListPageAsync.service
            streamHandlerExecutor = networkListPageAsync.streamHandlerExecutor
            params = networkListPageAsync.params
            response = networkListPageAsync.response
        }

        fun service(service: NetworkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NetworkListPageAsync].
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
        fun build(): NetworkListPageAsync =
            NetworkListPageAsync(
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

        return other is NetworkListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NetworkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
