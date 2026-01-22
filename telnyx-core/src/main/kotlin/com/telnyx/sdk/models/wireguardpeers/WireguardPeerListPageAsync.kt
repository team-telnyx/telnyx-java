// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.WireguardPeerServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WireguardPeerServiceAsync.list */
class WireguardPeerListPageAsync
private constructor(
    private val service: WireguardPeerServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WireguardPeerListParams,
    private val response: WireguardPeerListPageResponse,
) : PageAsync<WireguardPeerListResponse> {

    /**
     * Delegates to [WireguardPeerListPageResponse], but gracefully handles missing data.
     *
     * @see WireguardPeerListPageResponse.data
     */
    fun data(): List<WireguardPeerListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireguardPeerListPageResponse], but gracefully handles missing data.
     *
     * @see WireguardPeerListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<WireguardPeerListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): WireguardPeerListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<WireguardPeerListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WireguardPeerListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WireguardPeerListParams = params

    /** The response that this page was parsed from. */
    fun response(): WireguardPeerListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireguardPeerListPageAsync].
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

    /** A builder for [WireguardPeerListPageAsync]. */
    class Builder internal constructor() {

        private var service: WireguardPeerServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WireguardPeerListParams? = null
        private var response: WireguardPeerListPageResponse? = null

        @JvmSynthetic
        internal fun from(wireguardPeerListPageAsync: WireguardPeerListPageAsync) = apply {
            service = wireguardPeerListPageAsync.service
            streamHandlerExecutor = wireguardPeerListPageAsync.streamHandlerExecutor
            params = wireguardPeerListPageAsync.params
            response = wireguardPeerListPageAsync.response
        }

        fun service(service: WireguardPeerServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WireguardPeerListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WireguardPeerListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WireguardPeerListPageAsync].
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
        fun build(): WireguardPeerListPageAsync =
            WireguardPeerListPageAsync(
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

        return other is WireguardPeerListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WireguardPeerListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
