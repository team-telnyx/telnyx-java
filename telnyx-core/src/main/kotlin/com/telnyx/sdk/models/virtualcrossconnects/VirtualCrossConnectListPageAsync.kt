// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.VirtualCrossConnectServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VirtualCrossConnectServiceAsync.list */
class VirtualCrossConnectListPageAsync
private constructor(
    private val service: VirtualCrossConnectServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: VirtualCrossConnectListParams,
    private val response: VirtualCrossConnectListPageResponse,
) : PageAsync<VirtualCrossConnectListResponse> {

    /**
     * Delegates to [VirtualCrossConnectListPageResponse], but gracefully handles missing data.
     *
     * @see VirtualCrossConnectListPageResponse.data
     */
    fun data(): List<VirtualCrossConnectListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VirtualCrossConnectListPageResponse], but gracefully handles missing data.
     *
     * @see VirtualCrossConnectListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<VirtualCrossConnectListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VirtualCrossConnectListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<VirtualCrossConnectListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<VirtualCrossConnectListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): VirtualCrossConnectListParams = params

    /** The response that this page was parsed from. */
    fun response(): VirtualCrossConnectListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualCrossConnectListPageAsync].
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

    /** A builder for [VirtualCrossConnectListPageAsync]. */
    class Builder internal constructor() {

        private var service: VirtualCrossConnectServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: VirtualCrossConnectListParams? = null
        private var response: VirtualCrossConnectListPageResponse? = null

        @JvmSynthetic
        internal fun from(virtualCrossConnectListPageAsync: VirtualCrossConnectListPageAsync) =
            apply {
                service = virtualCrossConnectListPageAsync.service
                streamHandlerExecutor = virtualCrossConnectListPageAsync.streamHandlerExecutor
                params = virtualCrossConnectListPageAsync.params
                response = virtualCrossConnectListPageAsync.response
            }

        fun service(service: VirtualCrossConnectServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: VirtualCrossConnectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VirtualCrossConnectListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [VirtualCrossConnectListPageAsync].
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
        fun build(): VirtualCrossConnectListPageAsync =
            VirtualCrossConnectListPageAsync(
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

        return other is VirtualCrossConnectListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "VirtualCrossConnectListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
