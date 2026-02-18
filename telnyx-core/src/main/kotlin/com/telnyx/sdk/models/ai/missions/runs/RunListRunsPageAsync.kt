// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.async.ai.missions.RunServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see RunServiceAsync.listRuns */
class RunListRunsPageAsync
private constructor(
    private val service: RunServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: RunListRunsParams,
    private val response: RunListRunsPageResponse,
) : PageAsync<RunListRunsResponse> {

    /**
     * Delegates to [RunListRunsPageResponse], but gracefully handles missing data.
     *
     * @see RunListRunsPageResponse.data
     */
    fun data(): List<RunListRunsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [RunListRunsPageResponse], but gracefully handles missing data.
     *
     * @see RunListRunsPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<RunListRunsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): RunListRunsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<RunListRunsPageAsync> =
        service.listRuns(nextPageParams())

    fun autoPager(): AutoPagerAsync<RunListRunsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): RunListRunsParams = params

    /** The response that this page was parsed from. */
    fun response(): RunListRunsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunListRunsPageAsync].
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

    /** A builder for [RunListRunsPageAsync]. */
    class Builder internal constructor() {

        private var service: RunServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: RunListRunsParams? = null
        private var response: RunListRunsPageResponse? = null

        @JvmSynthetic
        internal fun from(runListRunsPageAsync: RunListRunsPageAsync) = apply {
            service = runListRunsPageAsync.service
            streamHandlerExecutor = runListRunsPageAsync.streamHandlerExecutor
            params = runListRunsPageAsync.params
            response = runListRunsPageAsync.response
        }

        fun service(service: RunServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: RunListRunsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RunListRunsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RunListRunsPageAsync].
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
        fun build(): RunListRunsPageAsync =
            RunListRunsPageAsync(
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

        return other is RunListRunsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "RunListRunsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
