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

/** @see TrafficPolicyProfileServiceAsync.listServices */
class TrafficPolicyProfileListServicesPageAsync
private constructor(
    private val service: TrafficPolicyProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TrafficPolicyProfileListServicesParams,
    private val response: TrafficPolicyProfileListServicesPageResponse,
) : PageAsync<TrafficPolicyProfileListServicesResponse> {

    /**
     * Delegates to [TrafficPolicyProfileListServicesPageResponse], but gracefully handles missing
     * data.
     *
     * @see TrafficPolicyProfileListServicesPageResponse.data
     */
    fun data(): List<TrafficPolicyProfileListServicesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TrafficPolicyProfileListServicesPageResponse], but gracefully handles missing
     * data.
     *
     * @see TrafficPolicyProfileListServicesPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TrafficPolicyProfileListServicesResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TrafficPolicyProfileListServicesParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TrafficPolicyProfileListServicesPageAsync> =
        service.listServices(nextPageParams())

    fun autoPager(): AutoPagerAsync<TrafficPolicyProfileListServicesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TrafficPolicyProfileListServicesParams = params

    /** The response that this page was parsed from. */
    fun response(): TrafficPolicyProfileListServicesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TrafficPolicyProfileListServicesPageAsync].
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

    /** A builder for [TrafficPolicyProfileListServicesPageAsync]. */
    class Builder internal constructor() {

        private var service: TrafficPolicyProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TrafficPolicyProfileListServicesParams? = null
        private var response: TrafficPolicyProfileListServicesPageResponse? = null

        @JvmSynthetic
        internal fun from(
            trafficPolicyProfileListServicesPageAsync: TrafficPolicyProfileListServicesPageAsync
        ) = apply {
            service = trafficPolicyProfileListServicesPageAsync.service
            streamHandlerExecutor = trafficPolicyProfileListServicesPageAsync.streamHandlerExecutor
            params = trafficPolicyProfileListServicesPageAsync.params
            response = trafficPolicyProfileListServicesPageAsync.response
        }

        fun service(service: TrafficPolicyProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TrafficPolicyProfileListServicesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TrafficPolicyProfileListServicesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TrafficPolicyProfileListServicesPageAsync].
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
        fun build(): TrafficPolicyProfileListServicesPageAsync =
            TrafficPolicyProfileListServicesPageAsync(
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

        return other is TrafficPolicyProfileListServicesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TrafficPolicyProfileListServicesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
