// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.collections

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.ai.CollectionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CollectionServiceAsync.list */
class CollectionListPageAsync
private constructor(
    private val service: CollectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CollectionListParams,
    private val response: CollectionListPageResponse,
) : PageAsync<Collection> {

    /**
     * Delegates to [CollectionListPageResponse], but gracefully handles missing data.
     *
     * @see CollectionListPageResponse.data
     */
    fun data(): List<Collection> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionListPageResponse], but gracefully handles missing data.
     *
     * @see CollectionListPageResponse.meta
     */
    fun meta(): Optional<CollectionListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<Collection> = data()

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

    fun nextPageParams(): CollectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CollectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Collection> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CollectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CollectionListPageAsync].
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

    /** A builder for [CollectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: CollectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CollectionListParams? = null
        private var response: CollectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(collectionListPageAsync: CollectionListPageAsync) = apply {
            service = collectionListPageAsync.service
            streamHandlerExecutor = collectionListPageAsync.streamHandlerExecutor
            params = collectionListPageAsync.params
            response = collectionListPageAsync.response
        }

        fun service(service: CollectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CollectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CollectionListPageAsync].
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
        fun build(): CollectionListPageAsync =
            CollectionListPageAsync(
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

        return other is CollectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CollectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
