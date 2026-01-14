// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalips

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.GlobalIpServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see GlobalIpServiceAsync.list */
class GlobalIpListPageAsync
private constructor(
    private val service: GlobalIpServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GlobalIpListParams,
    private val response: GlobalIpListPageResponse,
) : PageAsync<GlobalIpListResponse> {

    /**
     * Delegates to [GlobalIpListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpListPageResponse.data
     */
    fun data(): List<GlobalIpListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [GlobalIpListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<GlobalIpListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): GlobalIpListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<GlobalIpListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<GlobalIpListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GlobalIpListParams = params

    /** The response that this page was parsed from. */
    fun response(): GlobalIpListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GlobalIpListPageAsync].
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

    /** A builder for [GlobalIpListPageAsync]. */
    class Builder internal constructor() {

        private var service: GlobalIpServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GlobalIpListParams? = null
        private var response: GlobalIpListPageResponse? = null

        @JvmSynthetic
        internal fun from(globalIpListPageAsync: GlobalIpListPageAsync) = apply {
            service = globalIpListPageAsync.service
            streamHandlerExecutor = globalIpListPageAsync.streamHandlerExecutor
            params = globalIpListPageAsync.params
            response = globalIpListPageAsync.response
        }

        fun service(service: GlobalIpServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GlobalIpListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GlobalIpListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [GlobalIpListPageAsync].
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
        fun build(): GlobalIpListPageAsync =
            GlobalIpListPageAsync(
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

        return other is GlobalIpListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "GlobalIpListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
