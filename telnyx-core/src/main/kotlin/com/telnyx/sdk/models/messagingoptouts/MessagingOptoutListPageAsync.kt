// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messagingoptouts

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.async.MessagingOptoutServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingOptoutServiceAsync.list */
class MessagingOptoutListPageAsync
private constructor(
    private val service: MessagingOptoutServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingOptoutListParams,
    private val response: MessagingOptoutListPageResponse,
) : PageAsync<MessagingOptoutListResponse> {

    /**
     * Delegates to [MessagingOptoutListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingOptoutListPageResponse.data
     */
    fun data(): List<MessagingOptoutListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingOptoutListPageResponse], but gracefully handles missing data.
     *
     * @see MessagingOptoutListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingOptoutListResponse> = data()

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

    fun nextPageParams(): MessagingOptoutListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingOptoutListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MessagingOptoutListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingOptoutListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingOptoutListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessagingOptoutListPageAsync].
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

    /** A builder for [MessagingOptoutListPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingOptoutServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingOptoutListParams? = null
        private var response: MessagingOptoutListPageResponse? = null

        @JvmSynthetic
        internal fun from(messagingOptoutListPageAsync: MessagingOptoutListPageAsync) = apply {
            service = messagingOptoutListPageAsync.service
            streamHandlerExecutor = messagingOptoutListPageAsync.streamHandlerExecutor
            params = messagingOptoutListPageAsync.params
            response = messagingOptoutListPageAsync.response
        }

        fun service(service: MessagingOptoutServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingOptoutListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingOptoutListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MessagingOptoutListPageAsync].
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
        fun build(): MessagingOptoutListPageAsync =
            MessagingOptoutListPageAsync(
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

        return other is MessagingOptoutListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingOptoutListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
