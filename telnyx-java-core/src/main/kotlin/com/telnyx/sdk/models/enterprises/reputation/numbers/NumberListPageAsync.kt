// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.reputation.numbers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.enterprises.reputation.NumberServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberServiceAsync.list */
class NumberListPageAsync
private constructor(
    private val service: NumberServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NumberListParams,
    private val response: NumberListPageResponse,
) : PageAsync<NumberListResponse> {

    /**
     * Delegates to [NumberListPageResponse], but gracefully handles missing data.
     *
     * @see NumberListPageResponse.data
     */
    fun data(): List<NumberListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberListPageResponse], but gracefully handles missing data.
     *
     * @see NumberListPageResponse.meta
     */
    fun meta(): Optional<NumberListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<NumberListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NumberListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NumberListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NumberListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberListPageAsync].
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

    /** A builder for [NumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: NumberServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NumberListParams? = null
        private var response: NumberListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberListPageAsync: NumberListPageAsync) = apply {
            service = numberListPageAsync.service
            streamHandlerExecutor = numberListPageAsync.streamHandlerExecutor
            params = numberListPageAsync.params
            response = numberListPageAsync.response
        }

        fun service(service: NumberServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NumberListPageAsync].
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
        fun build(): NumberListPageAsync =
            NumberListPageAsync(
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

        return other is NumberListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NumberListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
