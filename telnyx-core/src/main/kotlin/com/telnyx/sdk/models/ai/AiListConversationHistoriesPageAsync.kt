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

/** @see AiServiceAsync.listConversationHistories */
class AiListConversationHistoriesPageAsync
private constructor(
    private val service: AiServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AiListConversationHistoriesParams,
    private val response: AiListConversationHistoriesPageResponse,
) : PageAsync<AiListConversationHistoriesResponse> {

    /**
     * Delegates to [AiListConversationHistoriesPageResponse], but gracefully handles missing data.
     *
     * @see AiListConversationHistoriesPageResponse.data
     */
    fun data(): List<AiListConversationHistoriesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AiListConversationHistoriesPageResponse], but gracefully handles missing data.
     *
     * @see AiListConversationHistoriesPageResponse.meta
     */
    fun meta(): Optional<AiListConversationHistoriesPageResponse.Meta> =
        response._meta().getOptional("meta")

    override fun items(): List<AiListConversationHistoriesResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): AiListConversationHistoriesParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<AiListConversationHistoriesPageAsync> =
        service.listConversationHistories(nextPageParams())

    fun autoPager(): AutoPagerAsync<AiListConversationHistoriesResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AiListConversationHistoriesParams = params

    /** The response that this page was parsed from. */
    fun response(): AiListConversationHistoriesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AiListConversationHistoriesPageAsync].
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

    /** A builder for [AiListConversationHistoriesPageAsync]. */
    class Builder internal constructor() {

        private var service: AiServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AiListConversationHistoriesParams? = null
        private var response: AiListConversationHistoriesPageResponse? = null

        @JvmSynthetic
        internal fun from(
            aiListConversationHistoriesPageAsync: AiListConversationHistoriesPageAsync
        ) = apply {
            service = aiListConversationHistoriesPageAsync.service
            streamHandlerExecutor = aiListConversationHistoriesPageAsync.streamHandlerExecutor
            params = aiListConversationHistoriesPageAsync.params
            response = aiListConversationHistoriesPageAsync.response
        }

        fun service(service: AiServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AiListConversationHistoriesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AiListConversationHistoriesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AiListConversationHistoriesPageAsync].
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
        fun build(): AiListConversationHistoriesPageAsync =
            AiListConversationHistoriesPageAsync(
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

        return other is AiListConversationHistoriesPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AiListConversationHistoriesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
