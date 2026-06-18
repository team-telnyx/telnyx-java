// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.async.ai.assistants.ScheduledEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ScheduledEventServiceAsync.list */
class ScheduledEventListPageAsync
private constructor(
    private val service: ScheduledEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ScheduledEventListParams,
    private val response: ScheduledEventListPageResponse,
) : PageAsync<ScheduledEventListResponse> {

    /**
     * Delegates to [ScheduledEventListPageResponse], but gracefully handles missing data.
     *
     * @see ScheduledEventListPageResponse.data
     */
    fun data(): List<ScheduledEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ScheduledEventListPageResponse], but gracefully handles missing data.
     *
     * @see ScheduledEventListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<ScheduledEventListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ScheduledEventListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ScheduledEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ScheduledEventListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ScheduledEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): ScheduledEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ScheduledEventListPageAsync].
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

    /** A builder for [ScheduledEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: ScheduledEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ScheduledEventListParams? = null
        private var response: ScheduledEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(scheduledEventListPageAsync: ScheduledEventListPageAsync) = apply {
            service = scheduledEventListPageAsync.service
            streamHandlerExecutor = scheduledEventListPageAsync.streamHandlerExecutor
            params = scheduledEventListPageAsync.params
            response = scheduledEventListPageAsync.response
        }

        fun service(service: ScheduledEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ScheduledEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ScheduledEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ScheduledEventListPageAsync].
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
        fun build(): ScheduledEventListPageAsync =
            ScheduledEventListPageAsync(
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

        return other is ScheduledEventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ScheduledEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
