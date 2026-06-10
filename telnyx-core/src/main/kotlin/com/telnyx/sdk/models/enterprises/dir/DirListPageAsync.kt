// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises.dir

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.enterprises.DirServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DirServiceAsync.list */
class DirListPageAsync
private constructor(
    private val service: DirServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DirListParams,
    private val response: DirListPageResponse,
) : PageAsync<DirListResponse> {

    /**
     * Delegates to [DirListPageResponse], but gracefully handles missing data.
     *
     * @see DirListPageResponse.data
     */
    fun data(): List<DirListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DirListPageResponse], but gracefully handles missing data.
     *
     * @see DirListPageResponse.meta
     */
    fun meta(): Optional<DirListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<DirListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): DirListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DirListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DirListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DirListParams = params

    /** The response that this page was parsed from. */
    fun response(): DirListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DirListPageAsync].
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

    /** A builder for [DirListPageAsync]. */
    class Builder internal constructor() {

        private var service: DirServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DirListParams? = null
        private var response: DirListPageResponse? = null

        @JvmSynthetic
        internal fun from(dirListPageAsync: DirListPageAsync) = apply {
            service = dirListPageAsync.service
            streamHandlerExecutor = dirListPageAsync.streamHandlerExecutor
            params = dirListPageAsync.params
            response = dirListPageAsync.response
        }

        fun service(service: DirServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DirListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DirListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DirListPageAsync].
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
        fun build(): DirListPageAsync =
            DirListPageAsync(
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

        return other is DirListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DirListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
