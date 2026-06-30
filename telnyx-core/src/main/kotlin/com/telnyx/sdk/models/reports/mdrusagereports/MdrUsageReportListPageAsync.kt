// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports.mdrusagereports

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.reports.MdrUsageReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MdrUsageReportServiceAsync.list */
class MdrUsageReportListPageAsync
private constructor(
    private val service: MdrUsageReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MdrUsageReportListParams,
    private val response: MdrUsageReportListPageResponse,
) : PageAsync<MdrUsageReport> {

    /**
     * Delegates to [MdrUsageReportListPageResponse], but gracefully handles missing data.
     *
     * @see MdrUsageReportListPageResponse.data
     */
    fun data(): List<MdrUsageReport> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MdrUsageReportListPageResponse], but gracefully handles missing data.
     *
     * @see MdrUsageReportListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaReporting> = response._meta().getOptional("meta")

    override fun items(): List<MdrUsageReport> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MdrUsageReportListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MdrUsageReportListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MdrUsageReport> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MdrUsageReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): MdrUsageReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MdrUsageReportListPageAsync].
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

    /** A builder for [MdrUsageReportListPageAsync]. */
    class Builder internal constructor() {

        private var service: MdrUsageReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MdrUsageReportListParams? = null
        private var response: MdrUsageReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(mdrUsageReportListPageAsync: MdrUsageReportListPageAsync) = apply {
            service = mdrUsageReportListPageAsync.service
            streamHandlerExecutor = mdrUsageReportListPageAsync.streamHandlerExecutor
            params = mdrUsageReportListPageAsync.params
            response = mdrUsageReportListPageAsync.response
        }

        fun service(service: MdrUsageReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MdrUsageReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MdrUsageReportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MdrUsageReportListPageAsync].
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
        fun build(): MdrUsageReportListPageAsync =
            MdrUsageReportListPageAsync(
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

        return other is MdrUsageReportListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MdrUsageReportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
