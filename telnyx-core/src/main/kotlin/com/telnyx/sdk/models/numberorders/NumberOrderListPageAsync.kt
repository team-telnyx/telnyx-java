// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberorders

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NumberOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberOrderServiceAsync.list */
class NumberOrderListPageAsync
private constructor(
    private val service: NumberOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NumberOrderListParams,
    private val response: NumberOrderListPageResponse,
) : PageAsync<NumberOrderListResponse> {

    /**
     * Delegates to [NumberOrderListPageResponse], but gracefully handles missing data.
     *
     * @see NumberOrderListPageResponse.data
     */
    fun data(): List<NumberOrderListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberOrderListPageResponse], but gracefully handles missing data.
     *
     * @see NumberOrderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NumberOrderListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NumberOrderListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NumberOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NumberOrderListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NumberOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberOrderListPageAsync].
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

    /** A builder for [NumberOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: NumberOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NumberOrderListParams? = null
        private var response: NumberOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberOrderListPageAsync: NumberOrderListPageAsync) = apply {
            service = numberOrderListPageAsync.service
            streamHandlerExecutor = numberOrderListPageAsync.streamHandlerExecutor
            params = numberOrderListPageAsync.params
            response = numberOrderListPageAsync.response
        }

        fun service(service: NumberOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NumberOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberOrderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NumberOrderListPageAsync].
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
        fun build(): NumberOrderListPageAsync =
            NumberOrderListPageAsync(
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

        return other is NumberOrderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NumberOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
