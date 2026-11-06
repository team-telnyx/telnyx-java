// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import com.telnyx.sdk.services.async.AgentGatewayServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AgentGatewayServiceAsync.list */
class AgentGatewayListPageAsync
private constructor(
    private val service: AgentGatewayServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AgentGatewayListParams,
    private val response: AgentGatewayListPageResponse,
) : PageAsync<AgentGateway> {

    /**
     * Delegates to [AgentGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see AgentGatewayListPageResponse.data
     */
    fun data(): List<AgentGateway> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AgentGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see AgentGatewayListPageResponse.meta
     */
    fun meta(): Optional<PageMeta> = response._meta().getOptional("meta")

    override fun items(): List<AgentGateway> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AgentGatewayListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AgentGatewayListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AgentGateway> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AgentGatewayListParams = params

    /** The response that this page was parsed from. */
    fun response(): AgentGatewayListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AgentGatewayListPageAsync].
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

    /** A builder for [AgentGatewayListPageAsync]. */
    class Builder internal constructor() {

        private var service: AgentGatewayServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AgentGatewayListParams? = null
        private var response: AgentGatewayListPageResponse? = null

        @JvmSynthetic
        internal fun from(agentGatewayListPageAsync: AgentGatewayListPageAsync) = apply {
            service = agentGatewayListPageAsync.service
            streamHandlerExecutor = agentGatewayListPageAsync.streamHandlerExecutor
            params = agentGatewayListPageAsync.params
            response = agentGatewayListPageAsync.response
        }

        fun service(service: AgentGatewayServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AgentGatewayListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AgentGatewayListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AgentGatewayListPageAsync].
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
        fun build(): AgentGatewayListPageAsync =
            AgentGatewayListPageAsync(
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

        return other is AgentGatewayListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AgentGatewayListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
