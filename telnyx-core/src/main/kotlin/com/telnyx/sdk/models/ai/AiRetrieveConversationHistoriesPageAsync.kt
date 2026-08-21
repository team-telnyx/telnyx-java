// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.AiServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see AiServiceAsync.retrieveConversationHistories */
class AiRetrieveConversationHistoriesPageAsync
private constructor(
    private val service: AiServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AiRetrieveConversationHistoriesParams,
    private val response: AiRetrieveConversationHistoriesPageResponse,
) : PageAsync<AiRetrieveConversationHistoriesResponse> {

    /**
     * Delegates to [AiRetrieveConversationHistoriesPageResponse], but gracefully handles missing
     * data.
     *
     * @see AiRetrieveConversationHistoriesPageResponse.data
     */
    fun data(): List<AiRetrieveConversationHistoriesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AiRetrieveConversationHistoriesPageResponse], but gracefully handles missing
     * data.
     *
     * @see AiRetrieveConversationHistoriesPageResponse.meta
     */
    fun meta(): Optional<AiRetrieveConversationHistoriesPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<AiRetrieveConversationHistoriesResponse> = data()

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

    fun nextPageParams(): AiRetrieveConversationHistoriesParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AiRetrieveConversationHistoriesPageAsync> =
        service.retrieveConversationHistories(nextPageParams())

    fun autoPager(): AutoPagerAsync<AiRetrieveConversationHistoriesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AiRetrieveConversationHistoriesParams = params

    /** The response that this page was parsed from. */
    fun response(): AiRetrieveConversationHistoriesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AiRetrieveConversationHistoriesPageAsync].
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

    /** A builder for [AiRetrieveConversationHistoriesPageAsync]. */
    class Builder internal constructor() {

        private var service: AiServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AiRetrieveConversationHistoriesParams? = null
        private var response: AiRetrieveConversationHistoriesPageResponse? = null

        @JvmSynthetic
        internal fun from(
            aiRetrieveConversationHistoriesPageAsync: AiRetrieveConversationHistoriesPageAsync
        ) = apply {
            service = aiRetrieveConversationHistoriesPageAsync.service
            streamHandlerExecutor = aiRetrieveConversationHistoriesPageAsync.streamHandlerExecutor
            params = aiRetrieveConversationHistoriesPageAsync.params
            response = aiRetrieveConversationHistoriesPageAsync.response
        }

        fun service(service: AiServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AiRetrieveConversationHistoriesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AiRetrieveConversationHistoriesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AiRetrieveConversationHistoriesPageAsync].
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
        fun build(): AiRetrieveConversationHistoriesPageAsync =
            AiRetrieveConversationHistoriesPageAsync(
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

        return other is AiRetrieveConversationHistoriesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AiRetrieveConversationHistoriesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
