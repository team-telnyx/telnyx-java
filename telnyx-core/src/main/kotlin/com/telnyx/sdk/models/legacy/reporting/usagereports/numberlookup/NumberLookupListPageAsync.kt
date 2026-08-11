// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.StandardPaginationMetaFfba4faa88
import com.telnyx.sdk.services.async.legacy.reporting.usagereports.NumberLookupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberLookupServiceAsync.list */
class NumberLookupListPageAsync
private constructor(
    private val service: NumberLookupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NumberLookupListParams,
    private val response: NumberLookupListPageResponse,
) : PageAsync<TelcoDataUsageReportResponse> {

    /**
     * Delegates to [NumberLookupListPageResponse], but gracefully handles missing data.
     *
     * @see NumberLookupListPageResponse.data
     */
    fun data(): List<TelcoDataUsageReportResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberLookupListPageResponse], but gracefully handles missing data.
     *
     * @see NumberLookupListPageResponse.meta
     */
    fun meta(): Optional<StandardPaginationMetaFfba4faa88> = response._meta().getOptional("meta")

    override fun items(): List<TelcoDataUsageReportResponse> = data()

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

    fun nextPageParams(): NumberLookupListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NumberLookupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TelcoDataUsageReportResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NumberLookupListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberLookupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberLookupListPageAsync].
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

    /** A builder for [NumberLookupListPageAsync]. */
    class Builder internal constructor() {

        private var service: NumberLookupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NumberLookupListParams? = null
        private var response: NumberLookupListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberLookupListPageAsync: NumberLookupListPageAsync) = apply {
            service = numberLookupListPageAsync.service
            streamHandlerExecutor = numberLookupListPageAsync.streamHandlerExecutor
            params = numberLookupListPageAsync.params
            response = numberLookupListPageAsync.response
        }

        fun service(service: NumberLookupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NumberLookupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberLookupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NumberLookupListPageAsync].
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
        fun build(): NumberLookupListPageAsync =
            NumberLookupListPageAsync(
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

        return other is NumberLookupListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NumberLookupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
