// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyendpoints

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.Metadata
import com.telnyx.sdk.services.async.DynamicEmergencyEndpointServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DynamicEmergencyEndpointServiceAsync.list */
class DynamicEmergencyEndpointListPageAsync
private constructor(
    private val service: DynamicEmergencyEndpointServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DynamicEmergencyEndpointListParams,
    private val response: DynamicEmergencyEndpointListPageResponse,
) : PageAsync<DynamicEmergencyEndpoint> {

    /**
     * Delegates to [DynamicEmergencyEndpointListPageResponse], but gracefully handles missing data.
     *
     * @see DynamicEmergencyEndpointListPageResponse.data
     */
    fun data(): List<DynamicEmergencyEndpoint> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DynamicEmergencyEndpointListPageResponse], but gracefully handles missing data.
     *
     * @see DynamicEmergencyEndpointListPageResponse.meta
     */
    fun meta(): Optional<Metadata> = response._meta().getOptional("meta")

    override fun items(): List<DynamicEmergencyEndpoint> = data()

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

    fun nextPageParams(): DynamicEmergencyEndpointListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DynamicEmergencyEndpointListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DynamicEmergencyEndpoint> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DynamicEmergencyEndpointListParams = params

    /** The response that this page was parsed from. */
    fun response(): DynamicEmergencyEndpointListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DynamicEmergencyEndpointListPageAsync].
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

    /** A builder for [DynamicEmergencyEndpointListPageAsync]. */
    class Builder internal constructor() {

        private var service: DynamicEmergencyEndpointServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DynamicEmergencyEndpointListParams? = null
        private var response: DynamicEmergencyEndpointListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            dynamicEmergencyEndpointListPageAsync: DynamicEmergencyEndpointListPageAsync
        ) = apply {
            service = dynamicEmergencyEndpointListPageAsync.service
            streamHandlerExecutor = dynamicEmergencyEndpointListPageAsync.streamHandlerExecutor
            params = dynamicEmergencyEndpointListPageAsync.params
            response = dynamicEmergencyEndpointListPageAsync.response
        }

        fun service(service: DynamicEmergencyEndpointServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DynamicEmergencyEndpointListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DynamicEmergencyEndpointListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DynamicEmergencyEndpointListPageAsync].
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
        fun build(): DynamicEmergencyEndpointListPageAsync =
            DynamicEmergencyEndpointListPageAsync(
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

        return other is DynamicEmergencyEndpointListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DynamicEmergencyEndpointListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
