// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.inexplicitnumberorders

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.InexplicitNumberOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InexplicitNumberOrderServiceAsync.list */
class InexplicitNumberOrderListPageAsync
private constructor(
    private val service: InexplicitNumberOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InexplicitNumberOrderListParams,
    private val response: InexplicitNumberOrderListPageResponse,
) : PageAsync<InexplicitNumberOrderResponse> {

    /**
     * Delegates to [InexplicitNumberOrderListPageResponse], but gracefully handles missing data.
     *
     * @see InexplicitNumberOrderListPageResponse.data
     */
    fun data(): List<InexplicitNumberOrderResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InexplicitNumberOrderListPageResponse], but gracefully handles missing data.
     *
     * @see InexplicitNumberOrderListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<InexplicitNumberOrderResponse> = data()

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

    fun nextPageParams(): InexplicitNumberOrderListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<InexplicitNumberOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InexplicitNumberOrderResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InexplicitNumberOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): InexplicitNumberOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InexplicitNumberOrderListPageAsync].
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

    /** A builder for [InexplicitNumberOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: InexplicitNumberOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InexplicitNumberOrderListParams? = null
        private var response: InexplicitNumberOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(inexplicitNumberOrderListPageAsync: InexplicitNumberOrderListPageAsync) =
            apply {
                service = inexplicitNumberOrderListPageAsync.service
                streamHandlerExecutor = inexplicitNumberOrderListPageAsync.streamHandlerExecutor
                params = inexplicitNumberOrderListPageAsync.params
                response = inexplicitNumberOrderListPageAsync.response
            }

        fun service(service: InexplicitNumberOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InexplicitNumberOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InexplicitNumberOrderListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InexplicitNumberOrderListPageAsync].
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
        fun build(): InexplicitNumberOrderListPageAsync =
            InexplicitNumberOrderListPageAsync(
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

        return other is InexplicitNumberOrderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InexplicitNumberOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
