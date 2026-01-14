// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaginghostednumberorders

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.MessagingHostedNumberOrder
import com.telnyx.sdk.models.MessagingPaginationMeta
import com.telnyx.sdk.services.async.MessagingHostedNumberOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MessagingHostedNumberOrderServiceAsync.list */
class MessagingHostedNumberOrderListPageAsync
private constructor(
    private val service: MessagingHostedNumberOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MessagingHostedNumberOrderListParams,
    private val response: MessagingHostedNumberOrderListPageResponse,
) : PageAsync<MessagingHostedNumberOrder> {

    /**
     * Delegates to [MessagingHostedNumberOrderListPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingHostedNumberOrderListPageResponse.data
     */
    fun data(): List<MessagingHostedNumberOrder> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MessagingHostedNumberOrderListPageResponse], but gracefully handles missing
     * data.
     *
     * @see MessagingHostedNumberOrderListPageResponse.meta
     */
    fun meta(): Optional<MessagingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MessagingHostedNumberOrder> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MessagingHostedNumberOrderListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MessagingHostedNumberOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MessagingHostedNumberOrder> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MessagingHostedNumberOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): MessagingHostedNumberOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MessagingHostedNumberOrderListPageAsync].
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

    /** A builder for [MessagingHostedNumberOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: MessagingHostedNumberOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MessagingHostedNumberOrderListParams? = null
        private var response: MessagingHostedNumberOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            messagingHostedNumberOrderListPageAsync: MessagingHostedNumberOrderListPageAsync
        ) = apply {
            service = messagingHostedNumberOrderListPageAsync.service
            streamHandlerExecutor = messagingHostedNumberOrderListPageAsync.streamHandlerExecutor
            params = messagingHostedNumberOrderListPageAsync.params
            response = messagingHostedNumberOrderListPageAsync.response
        }

        fun service(service: MessagingHostedNumberOrderServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MessagingHostedNumberOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MessagingHostedNumberOrderListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MessagingHostedNumberOrderListPageAsync].
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
        fun build(): MessagingHostedNumberOrderListPageAsync =
            MessagingHostedNumberOrderListPageAsync(
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

        return other is MessagingHostedNumberOrderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MessagingHostedNumberOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
