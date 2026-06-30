// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.ai.McpServerServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault

/** @see McpServerServiceAsync.list */
class McpServerListPageAsync
private constructor(
    private val service: McpServerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: McpServerListParams,
    private val items: List<McpServerListResponse>,
) : PageAsync<McpServerListResponse> {

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): McpServerListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<McpServerListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<McpServerListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): McpServerListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<McpServerListResponse> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [McpServerListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [McpServerListPageAsync]. */
    class Builder internal constructor() {

        private var service: McpServerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: McpServerListParams? = null
        private var items: List<McpServerListResponse>? = null

        @JvmSynthetic
        internal fun from(mcpServerListPageAsync: McpServerListPageAsync) = apply {
            service = mcpServerListPageAsync.service
            streamHandlerExecutor = mcpServerListPageAsync.streamHandlerExecutor
            params = mcpServerListPageAsync.params
            items = mcpServerListPageAsync.items
        }

        fun service(service: McpServerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: McpServerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun items(items: List<McpServerListResponse>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [McpServerListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): McpServerListPageAsync =
            McpServerListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is McpServerListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            items == other.items
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, items)

    override fun toString() =
        "McpServerListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, items=$items}"
}
