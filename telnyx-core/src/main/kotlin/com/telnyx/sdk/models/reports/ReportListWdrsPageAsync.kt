// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.ReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ReportServiceAsync.listWdrs */
class ReportListWdrsPageAsync
private constructor(
    private val service: ReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReportListWdrsParams,
    private val response: ReportListWdrsPageResponse,
) : PageAsync<ReportListWdrsResponse> {

    /**
     * Delegates to [ReportListWdrsPageResponse], but gracefully handles missing data.
     *
     * @see ReportListWdrsPageResponse.data
     */
    fun data(): List<ReportListWdrsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReportListWdrsPageResponse], but gracefully handles missing data.
     *
     * @see ReportListWdrsPageResponse.meta
     */
    fun meta(): Optional<ReportListWdrsPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<ReportListWdrsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ReportListWdrsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ReportListWdrsPageAsync> =
        service.listWdrs(nextPageParams())

    fun autoPager(): AutoPagerAsync<ReportListWdrsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReportListWdrsParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportListWdrsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReportListWdrsPageAsync].
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

    /** A builder for [ReportListWdrsPageAsync]. */
    class Builder internal constructor() {

        private var service: ReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReportListWdrsParams? = null
        private var response: ReportListWdrsPageResponse? = null

        @JvmSynthetic
        internal fun from(reportListWdrsPageAsync: ReportListWdrsPageAsync) = apply {
            service = reportListWdrsPageAsync.service
            streamHandlerExecutor = reportListWdrsPageAsync.streamHandlerExecutor
            params = reportListWdrsPageAsync.params
            response = reportListWdrsPageAsync.response
        }

        fun service(service: ReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReportListWdrsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportListWdrsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReportListWdrsPageAsync].
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
        fun build(): ReportListWdrsPageAsync =
            ReportListWdrsPageAsync(
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

        return other is ReportListWdrsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ReportListWdrsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
