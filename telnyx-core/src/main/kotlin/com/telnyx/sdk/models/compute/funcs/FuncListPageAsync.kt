// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.storage.kvs.EdgeComputePaginationMeta
import com.telnyx.sdk.services.async.compute.FuncServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FuncServiceAsync.list */
class FuncListPageAsync
private constructor(
    private val service: FuncServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FuncListParams,
    private val response: FuncListPageResponse,
) : PageAsync<FuncListResponse> {

    /**
     * Delegates to [FuncListPageResponse], but gracefully handles missing data.
     *
     * @see FuncListPageResponse.data
     */
    fun data(): List<FuncListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FuncListPageResponse], but gracefully handles missing data.
     *
     * @see FuncListPageResponse.meta
     */
    fun meta(): Optional<EdgeComputePaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<FuncListResponse> = data()

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

    fun nextPageParams(): FuncListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<FuncListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FuncListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FuncListParams = params

    /** The response that this page was parsed from. */
    fun response(): FuncListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FuncListPageAsync].
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

    /** A builder for [FuncListPageAsync]. */
    class Builder internal constructor() {

        private var service: FuncServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FuncListParams? = null
        private var response: FuncListPageResponse? = null

        @JvmSynthetic
        internal fun from(funcListPageAsync: FuncListPageAsync) = apply {
            service = funcListPageAsync.service
            streamHandlerExecutor = funcListPageAsync.streamHandlerExecutor
            params = funcListPageAsync.params
            response = funcListPageAsync.response
        }

        fun service(service: FuncServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FuncListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FuncListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FuncListPageAsync].
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
        fun build(): FuncListPageAsync =
            FuncListPageAsync(
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

        return other is FuncListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FuncListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
