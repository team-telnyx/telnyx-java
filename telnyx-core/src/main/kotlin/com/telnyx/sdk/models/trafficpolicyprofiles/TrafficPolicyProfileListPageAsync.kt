// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.TrafficPolicyProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TrafficPolicyProfileServiceAsync.list */
class TrafficPolicyProfileListPageAsync
private constructor(
    private val service: TrafficPolicyProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TrafficPolicyProfileListParams,
    private val response: TrafficPolicyProfileListPageResponse,
) : PageAsync<TrafficPolicyProfileListResponse> {

    /**
     * Delegates to [TrafficPolicyProfileListPageResponse], but gracefully handles missing data.
     *
     * @see TrafficPolicyProfileListPageResponse.data
     */
    fun data(): List<TrafficPolicyProfileListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TrafficPolicyProfileListPageResponse], but gracefully handles missing data.
     *
     * @see TrafficPolicyProfileListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TrafficPolicyProfileListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TrafficPolicyProfileListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TrafficPolicyProfileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TrafficPolicyProfileListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TrafficPolicyProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): TrafficPolicyProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TrafficPolicyProfileListPageAsync].
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

    /** A builder for [TrafficPolicyProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: TrafficPolicyProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TrafficPolicyProfileListParams? = null
        private var response: TrafficPolicyProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(trafficPolicyProfileListPageAsync: TrafficPolicyProfileListPageAsync) =
            apply {
                service = trafficPolicyProfileListPageAsync.service
                streamHandlerExecutor = trafficPolicyProfileListPageAsync.streamHandlerExecutor
                params = trafficPolicyProfileListPageAsync.params
                response = trafficPolicyProfileListPageAsync.response
            }

        fun service(service: TrafficPolicyProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TrafficPolicyProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TrafficPolicyProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TrafficPolicyProfileListPageAsync].
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
        fun build(): TrafficPolicyProfileListPageAsync =
            TrafficPolicyProfileListPageAsync(
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

        return other is TrafficPolicyProfileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TrafficPolicyProfileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
