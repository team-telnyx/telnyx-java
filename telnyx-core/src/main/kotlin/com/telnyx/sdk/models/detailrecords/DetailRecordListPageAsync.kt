// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.detailrecords

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.DetailRecordServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DetailRecordServiceAsync.list */
class DetailRecordListPageAsync
private constructor(
    private val service: DetailRecordServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DetailRecordListParams,
    private val response: DetailRecordListPageResponse,
) : PageAsync<DetailRecordListResponse> {

    /**
     * Delegates to [DetailRecordListPageResponse], but gracefully handles missing data.
     *
     * @see DetailRecordListPageResponse.data
     */
    fun data(): List<DetailRecordListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DetailRecordListPageResponse], but gracefully handles missing data.
     *
     * @see DetailRecordListPageResponse.meta
     */
    fun meta(): Optional<DetailRecordListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<DetailRecordListResponse> = data()

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

    fun nextPageParams(): DetailRecordListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DetailRecordListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DetailRecordListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DetailRecordListParams = params

    /** The response that this page was parsed from. */
    fun response(): DetailRecordListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DetailRecordListPageAsync].
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

    /** A builder for [DetailRecordListPageAsync]. */
    class Builder internal constructor() {

        private var service: DetailRecordServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DetailRecordListParams? = null
        private var response: DetailRecordListPageResponse? = null

        @JvmSynthetic
        internal fun from(detailRecordListPageAsync: DetailRecordListPageAsync) = apply {
            service = detailRecordListPageAsync.service
            streamHandlerExecutor = detailRecordListPageAsync.streamHandlerExecutor
            params = detailRecordListPageAsync.params
            response = detailRecordListPageAsync.response
        }

        fun service(service: DetailRecordServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DetailRecordListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DetailRecordListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DetailRecordListPageAsync].
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
        fun build(): DetailRecordListPageAsync =
            DetailRecordListPageAsync(
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

        return other is DetailRecordListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DetailRecordListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
