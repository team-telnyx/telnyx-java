// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumberblocks.jobs

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.phonenumberblocks.JobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see JobServiceAsync.list */
class JobListPageAsync
private constructor(
    private val service: JobServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: JobListParams,
    private val response: JobListPageResponse,
) : PageAsync<Job> {

    /**
     * Delegates to [JobListPageResponse], but gracefully handles missing data.
     *
     * @see JobListPageResponse.data
     */
    fun data(): List<Job> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [JobListPageResponse], but gracefully handles missing data.
     *
     * @see JobListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<Job> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): JobListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<JobListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Job> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): JobListParams = params

    /** The response that this page was parsed from. */
    fun response(): JobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [JobListPageAsync].
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

    /** A builder for [JobListPageAsync]. */
    class Builder internal constructor() {

        private var service: JobServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: JobListParams? = null
        private var response: JobListPageResponse? = null

        @JvmSynthetic
        internal fun from(jobListPageAsync: JobListPageAsync) = apply {
            service = jobListPageAsync.service
            streamHandlerExecutor = jobListPageAsync.streamHandlerExecutor
            params = jobListPageAsync.params
            response = jobListPageAsync.response
        }

        fun service(service: JobServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: JobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: JobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [JobListPageAsync].
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
        fun build(): JobListPageAsync =
            JobListPageAsync(
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

        return other is JobListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "JobListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
