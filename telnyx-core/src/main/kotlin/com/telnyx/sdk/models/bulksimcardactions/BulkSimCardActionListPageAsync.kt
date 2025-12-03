// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bulksimcardactions

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.BulkSimCardActionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BulkSimCardActionServiceAsync.list */
class BulkSimCardActionListPageAsync
private constructor(
    private val service: BulkSimCardActionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BulkSimCardActionListParams,
    private val response: BulkSimCardActionListPageResponse,
) : PageAsync<BulkSimCardActionListResponse> {

    /**
     * Delegates to [BulkSimCardActionListPageResponse], but gracefully handles missing data.
     *
     * @see BulkSimCardActionListPageResponse.data
     */
    fun data(): List<BulkSimCardActionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BulkSimCardActionListPageResponse], but gracefully handles missing data.
     *
     * @see BulkSimCardActionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<BulkSimCardActionListResponse> = data()

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

    fun nextPageParams(): BulkSimCardActionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<BulkSimCardActionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BulkSimCardActionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BulkSimCardActionListParams = params

    /** The response that this page was parsed from. */
    fun response(): BulkSimCardActionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BulkSimCardActionListPageAsync].
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

    /** A builder for [BulkSimCardActionListPageAsync]. */
    class Builder internal constructor() {

        private var service: BulkSimCardActionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BulkSimCardActionListParams? = null
        private var response: BulkSimCardActionListPageResponse? = null

        @JvmSynthetic
        internal fun from(bulkSimCardActionListPageAsync: BulkSimCardActionListPageAsync) = apply {
            service = bulkSimCardActionListPageAsync.service
            streamHandlerExecutor = bulkSimCardActionListPageAsync.streamHandlerExecutor
            params = bulkSimCardActionListPageAsync.params
            response = bulkSimCardActionListPageAsync.response
        }

        fun service(service: BulkSimCardActionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BulkSimCardActionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BulkSimCardActionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BulkSimCardActionListPageAsync].
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
        fun build(): BulkSimCardActionListPageAsync =
            BulkSimCardActionListPageAsync(
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

        return other is BulkSimCardActionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BulkSimCardActionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
