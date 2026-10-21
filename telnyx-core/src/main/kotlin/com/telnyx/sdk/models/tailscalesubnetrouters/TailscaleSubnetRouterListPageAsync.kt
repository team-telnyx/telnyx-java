// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tailscalesubnetrouters

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.TailscaleSubnetRouterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TailscaleSubnetRouterServiceAsync.list */
class TailscaleSubnetRouterListPageAsync
private constructor(
    private val service: TailscaleSubnetRouterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TailscaleSubnetRouterListParams,
    private val response: TailscaleSubnetRouterListPageResponse,
) : PageAsync<TailscaleSubnetRouter> {

    /**
     * Delegates to [TailscaleSubnetRouterListPageResponse], but gracefully handles missing data.
     *
     * @see TailscaleSubnetRouterListPageResponse.data
     */
    fun data(): List<TailscaleSubnetRouter> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TailscaleSubnetRouterListPageResponse], but gracefully handles missing data.
     *
     * @see TailscaleSubnetRouterListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TailscaleSubnetRouter> = data()

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

    fun nextPageParams(): TailscaleSubnetRouterListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<TailscaleSubnetRouterListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TailscaleSubnetRouter> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TailscaleSubnetRouterListParams = params

    /** The response that this page was parsed from. */
    fun response(): TailscaleSubnetRouterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TailscaleSubnetRouterListPageAsync].
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

    /** A builder for [TailscaleSubnetRouterListPageAsync]. */
    class Builder internal constructor() {

        private var service: TailscaleSubnetRouterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TailscaleSubnetRouterListParams? = null
        private var response: TailscaleSubnetRouterListPageResponse? = null

        @JvmSynthetic
        internal fun from(tailscaleSubnetRouterListPageAsync: TailscaleSubnetRouterListPageAsync) =
            apply {
                service = tailscaleSubnetRouterListPageAsync.service
                streamHandlerExecutor = tailscaleSubnetRouterListPageAsync.streamHandlerExecutor
                params = tailscaleSubnetRouterListPageAsync.params
                response = tailscaleSubnetRouterListPageAsync.response
            }

        fun service(service: TailscaleSubnetRouterServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TailscaleSubnetRouterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TailscaleSubnetRouterListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TailscaleSubnetRouterListPageAsync].
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
        fun build(): TailscaleSubnetRouterListPageAsync =
            TailscaleSubnetRouterListPageAsync(
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

        return other is TailscaleSubnetRouterListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TailscaleSubnetRouterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
