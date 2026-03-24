// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.async.ai.ToolServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ToolServiceAsync.list */
class ToolListPageAsync
private constructor(
    private val service: ToolServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ToolListParams,
    private val response: ToolListPageResponse,
) : PageAsync<ToolListResponse> {

    /**
     * Delegates to [ToolListPageResponse], but gracefully handles missing data.
     *
     * @see ToolListPageResponse.data
     */
    fun data(): List<ToolListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ToolListPageResponse], but gracefully handles missing data.
     *
     * @see ToolListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<ToolListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ToolListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ToolListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ToolListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ToolListParams = params

    /** The response that this page was parsed from. */
    fun response(): ToolListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ToolListPageAsync].
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

    /** A builder for [ToolListPageAsync]. */
    class Builder internal constructor() {

        private var service: ToolServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ToolListParams? = null
        private var response: ToolListPageResponse? = null

        @JvmSynthetic
        internal fun from(toolListPageAsync: ToolListPageAsync) = apply {
            service = toolListPageAsync.service
            streamHandlerExecutor = toolListPageAsync.streamHandlerExecutor
            params = toolListPageAsync.params
            response = toolListPageAsync.response
        }

        fun service(service: ToolServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ToolListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ToolListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ToolListPageAsync].
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
        fun build(): ToolListPageAsync =
            ToolListPageAsync(
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

        return other is ToolListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ToolListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
