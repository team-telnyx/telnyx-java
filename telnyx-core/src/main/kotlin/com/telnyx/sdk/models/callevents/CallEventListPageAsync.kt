// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callevents

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.CallEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CallEventServiceAsync.list */
class CallEventListPageAsync
private constructor(
    private val service: CallEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CallEventListParams,
    private val response: CallEventListPageResponse,
) : PageAsync<CallEventListResponse> {

    /**
     * Delegates to [CallEventListPageResponse], but gracefully handles missing data.
     *
     * @see CallEventListPageResponse.data
     */
    fun data(): List<CallEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CallEventListPageResponse], but gracefully handles missing data.
     *
     * @see CallEventListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CallEventListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CallEventListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CallEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CallEventListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CallEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): CallEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CallEventListPageAsync].
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

    /** A builder for [CallEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: CallEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CallEventListParams? = null
        private var response: CallEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(callEventListPageAsync: CallEventListPageAsync) = apply {
            service = callEventListPageAsync.service
            streamHandlerExecutor = callEventListPageAsync.streamHandlerExecutor
            params = callEventListPageAsync.params
            response = callEventListPageAsync.response
        }

        fun service(service: CallEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CallEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CallEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CallEventListPageAsync].
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
        fun build(): CallEventListPageAsync =
            CallEventListPageAsync(
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

        return other is CallEventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CallEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
