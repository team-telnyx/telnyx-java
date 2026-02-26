// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.queues

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.QueueServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see QueueServiceAsync.list */
class QueueListPageAsync
private constructor(
    private val service: QueueServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: QueueListParams,
    private val response: QueueListPageResponse,
) : PageAsync<Queue> {

    /**
     * Delegates to [QueueListPageResponse], but gracefully handles missing data.
     *
     * @see QueueListPageResponse.data
     */
    fun data(): List<Queue> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [QueueListPageResponse], but gracefully handles missing data.
     *
     * @see QueueListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Queue> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): QueueListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<QueueListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Queue> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): QueueListParams = params

    /** The response that this page was parsed from. */
    fun response(): QueueListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QueueListPageAsync].
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

    /** A builder for [QueueListPageAsync]. */
    class Builder internal constructor() {

        private var service: QueueServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: QueueListParams? = null
        private var response: QueueListPageResponse? = null

        @JvmSynthetic
        internal fun from(queueListPageAsync: QueueListPageAsync) = apply {
            service = queueListPageAsync.service
            streamHandlerExecutor = queueListPageAsync.streamHandlerExecutor
            params = queueListPageAsync.params
            response = queueListPageAsync.response
        }

        fun service(service: QueueServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: QueueListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: QueueListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [QueueListPageAsync].
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
        fun build(): QueueListPageAsync =
            QueueListPageAsync(
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

        return other is QueueListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "QueueListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
