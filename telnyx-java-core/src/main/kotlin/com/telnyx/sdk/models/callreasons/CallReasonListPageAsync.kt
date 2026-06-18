// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.CallReasonServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CallReasonServiceAsync.list */
class CallReasonListPageAsync
private constructor(
    private val service: CallReasonServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CallReasonListParams,
    private val response: CallReasonListPageResponse,
) : PageAsync<CallReasonListResponse> {

    /**
     * Delegates to [CallReasonListPageResponse], but gracefully handles missing data.
     *
     * @see CallReasonListPageResponse.data
     */
    fun data(): List<CallReasonListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CallReasonListPageResponse], but gracefully handles missing data.
     *
     * @see CallReasonListPageResponse.meta
     */
    fun meta(): Optional<CallReasonListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<CallReasonListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CallReasonListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CallReasonListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CallReasonListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CallReasonListParams = params

    /** The response that this page was parsed from. */
    fun response(): CallReasonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallReasonListPageAsync].
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

    /** A builder for [CallReasonListPageAsync]. */
    class Builder internal constructor() {

        private var service: CallReasonServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CallReasonListParams? = null
        private var response: CallReasonListPageResponse? = null

        @JvmSynthetic
        internal fun from(callReasonListPageAsync: CallReasonListPageAsync) = apply {
            service = callReasonListPageAsync.service
            streamHandlerExecutor = callReasonListPageAsync.streamHandlerExecutor
            params = callReasonListPageAsync.params
            response = callReasonListPageAsync.response
        }

        fun service(service: CallReasonServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CallReasonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CallReasonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CallReasonListPageAsync].
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
        fun build(): CallReasonListPageAsync =
            CallReasonListPageAsync(
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

        return other is CallReasonListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CallReasonListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
