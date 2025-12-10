// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.reports

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.portouts.ReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ReportServiceAsync.list */
class ReportListPageAsync
private constructor(
    private val service: ReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReportListParams,
    private val response: ReportListPageResponse,
) : PageAsync<PortoutReport> {

    /**
     * Delegates to [ReportListPageResponse], but gracefully handles missing data.
     *
     * @see ReportListPageResponse.data
     */
    fun data(): List<PortoutReport> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReportListPageResponse], but gracefully handles missing data.
     *
     * @see ReportListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortoutReport> = data()

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

    fun nextPageParams(): ReportListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ReportListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PortoutReport> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReportListPageAsync].
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

    /** A builder for [ReportListPageAsync]. */
    class Builder internal constructor() {

        private var service: ReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReportListParams? = null
        private var response: ReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(reportListPageAsync: ReportListPageAsync) = apply {
            service = reportListPageAsync.service
            streamHandlerExecutor = reportListPageAsync.streamHandlerExecutor
            params = reportListPageAsync.params
            response = reportListPageAsync.response
        }

        fun service(service: ReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReportListPageAsync].
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
        fun build(): ReportListPageAsync =
            ReportListPageAsync(
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

        return other is ReportListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ReportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
