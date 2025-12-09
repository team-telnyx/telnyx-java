// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.numberblockorders

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NumberBlockOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberBlockOrderServiceAsync.list */
class NumberBlockOrderListPageAsync
private constructor(
    private val service: NumberBlockOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NumberBlockOrderListParams,
    private val response: NumberBlockOrderListPageResponse,
) : PageAsync<NumberBlockOrder> {

    /**
     * Delegates to [NumberBlockOrderListPageResponse], but gracefully handles missing data.
     *
     * @see NumberBlockOrderListPageResponse.data
     */
    fun data(): List<NumberBlockOrder> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberBlockOrderListPageResponse], but gracefully handles missing data.
     *
     * @see NumberBlockOrderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NumberBlockOrder> = data()

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

    fun nextPageParams(): NumberBlockOrderListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NumberBlockOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NumberBlockOrder> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NumberBlockOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberBlockOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NumberBlockOrderListPageAsync].
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

    /** A builder for [NumberBlockOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: NumberBlockOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NumberBlockOrderListParams? = null
        private var response: NumberBlockOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberBlockOrderListPageAsync: NumberBlockOrderListPageAsync) = apply {
            service = numberBlockOrderListPageAsync.service
            streamHandlerExecutor = numberBlockOrderListPageAsync.streamHandlerExecutor
            params = numberBlockOrderListPageAsync.params
            response = numberBlockOrderListPageAsync.response
        }

        fun service(service: NumberBlockOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NumberBlockOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberBlockOrderListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NumberBlockOrderListPageAsync].
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
        fun build(): NumberBlockOrderListPageAsync =
            NumberBlockOrderListPageAsync(
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

        return other is NumberBlockOrderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NumberBlockOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
