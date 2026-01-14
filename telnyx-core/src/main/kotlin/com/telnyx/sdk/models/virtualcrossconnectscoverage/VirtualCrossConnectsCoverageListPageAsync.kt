// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnectscoverage

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.VirtualCrossConnectsCoverageServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VirtualCrossConnectsCoverageServiceAsync.list */
class VirtualCrossConnectsCoverageListPageAsync
private constructor(
    private val service: VirtualCrossConnectsCoverageServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VirtualCrossConnectsCoverageListParams,
    private val response: VirtualCrossConnectsCoverageListPageResponse,
) : PageAsync<VirtualCrossConnectsCoverageListResponse> {

    /**
     * Delegates to [VirtualCrossConnectsCoverageListPageResponse], but gracefully handles missing
     * data.
     *
     * @see VirtualCrossConnectsCoverageListPageResponse.data
     */
    fun data(): List<VirtualCrossConnectsCoverageListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VirtualCrossConnectsCoverageListPageResponse], but gracefully handles missing
     * data.
     *
     * @see VirtualCrossConnectsCoverageListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<VirtualCrossConnectsCoverageListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VirtualCrossConnectsCoverageListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<VirtualCrossConnectsCoverageListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VirtualCrossConnectsCoverageListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VirtualCrossConnectsCoverageListParams = params

    /** The response that this page was parsed from. */
    fun response(): VirtualCrossConnectsCoverageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualCrossConnectsCoverageListPageAsync].
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

    /** A builder for [VirtualCrossConnectsCoverageListPageAsync]. */
    class Builder internal constructor() {

        private var service: VirtualCrossConnectsCoverageServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VirtualCrossConnectsCoverageListParams? = null
        private var response: VirtualCrossConnectsCoverageListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            virtualCrossConnectsCoverageListPageAsync: VirtualCrossConnectsCoverageListPageAsync
        ) = apply {
            service = virtualCrossConnectsCoverageListPageAsync.service
            streamHandlerExecutor = virtualCrossConnectsCoverageListPageAsync.streamHandlerExecutor
            params = virtualCrossConnectsCoverageListPageAsync.params
            response = virtualCrossConnectsCoverageListPageAsync.response
        }

        fun service(service: VirtualCrossConnectsCoverageServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VirtualCrossConnectsCoverageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VirtualCrossConnectsCoverageListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [VirtualCrossConnectsCoverageListPageAsync].
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
        fun build(): VirtualCrossConnectsCoverageListPageAsync =
            VirtualCrossConnectsCoverageListPageAsync(
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

        return other is VirtualCrossConnectsCoverageListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VirtualCrossConnectsCoverageListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
