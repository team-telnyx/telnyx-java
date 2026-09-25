// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles.memories

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.memory.namespaces.profiles.PageMeta
import com.telnyx.sdk.services.async.ai.memory.namespaces.profiles.MemoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MemoryServiceAsync.list */
class MemoryListPageAsync
private constructor(
    private val service: MemoryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MemoryListParams,
    private val response: MemoryListPageResponse,
) : PageAsync<MemoryListResponse> {

    /**
     * Delegates to [MemoryListPageResponse], but gracefully handles missing data.
     *
     * @see MemoryListPageResponse.data
     */
    fun data(): List<MemoryListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MemoryListPageResponse], but gracefully handles missing data.
     *
     * @see MemoryListPageResponse.meta
     */
    fun meta(): Optional<PageMeta> = response._meta().getOptional("meta")

    override fun items(): List<MemoryListResponse> = data()

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

    fun nextPageParams(): MemoryListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MemoryListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MemoryListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MemoryListParams = params

    /** The response that this page was parsed from. */
    fun response(): MemoryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MemoryListPageAsync].
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

    /** A builder for [MemoryListPageAsync]. */
    class Builder internal constructor() {

        private var service: MemoryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MemoryListParams? = null
        private var response: MemoryListPageResponse? = null

        @JvmSynthetic
        internal fun from(memoryListPageAsync: MemoryListPageAsync) = apply {
            service = memoryListPageAsync.service
            streamHandlerExecutor = memoryListPageAsync.streamHandlerExecutor
            params = memoryListPageAsync.params
            response = memoryListPageAsync.response
        }

        fun service(service: MemoryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MemoryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MemoryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MemoryListPageAsync].
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
        fun build(): MemoryListPageAsync =
            MemoryListPageAsync(
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

        return other is MemoryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MemoryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
