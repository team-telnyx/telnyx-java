// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.comments

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portingorders.CommentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CommentServiceAsync.list */
class CommentListPageAsync
private constructor(
    private val service: CommentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CommentListParams,
    private val response: CommentListPageResponse,
) : PageAsync<CommentListResponse> {

    /**
     * Delegates to [CommentListPageResponse], but gracefully handles missing data.
     *
     * @see CommentListPageResponse.data
     */
    fun data(): List<CommentListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CommentListPageResponse], but gracefully handles missing data.
     *
     * @see CommentListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CommentListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CommentListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CommentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CommentListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CommentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommentListPageAsync].
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

    /** A builder for [CommentListPageAsync]. */
    class Builder internal constructor() {

        private var service: CommentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CommentListParams? = null
        private var response: CommentListPageResponse? = null

        @JvmSynthetic
        internal fun from(commentListPageAsync: CommentListPageAsync) = apply {
            service = commentListPageAsync.service
            streamHandlerExecutor = commentListPageAsync.streamHandlerExecutor
            params = commentListPageAsync.params
            response = commentListPageAsync.response
        }

        fun service(service: CommentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CommentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommentListPageAsync].
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
        fun build(): CommentListPageAsync =
            CommentListPageAsync(
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

        return other is CommentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CommentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
