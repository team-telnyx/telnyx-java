// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.UsageReportServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UsageReportServiceAsync.list */
class UsageReportListPageAsync
private constructor(
    private val service: UsageReportServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UsageReportListParams,
    private val response: UsageReportListPageResponse,
) : PageAsync<UsageReportListResponse> {

    /**
     * Delegates to [UsageReportListPageResponse], but gracefully handles missing data.
     *
     * @see UsageReportListPageResponse.data
     */
    fun data(): List<UsageReportListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UsageReportListPageResponse], but gracefully handles missing data.
     *
     * @see UsageReportListPageResponse.meta
     */
    fun meta(): Optional<UsageReportListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<UsageReportListResponse> = data()

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

    fun nextPageParams(): UsageReportListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<UsageReportListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<UsageReportListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UsageReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageReportListPageAsync].
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

    /** A builder for [UsageReportListPageAsync]. */
    class Builder internal constructor() {

        private var service: UsageReportServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UsageReportListParams? = null
        private var response: UsageReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(usageReportListPageAsync: UsageReportListPageAsync) = apply {
            service = usageReportListPageAsync.service
            streamHandlerExecutor = usageReportListPageAsync.streamHandlerExecutor
            params = usageReportListPageAsync.params
            response = usageReportListPageAsync.response
        }

        fun service(service: UsageReportServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UsageReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageReportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UsageReportListPageAsync].
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
        fun build(): UsageReportListPageAsync =
            UsageReportListPageAsync(
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

        return other is UsageReportListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UsageReportListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
