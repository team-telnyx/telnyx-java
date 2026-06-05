// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardinterfaces

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.WireguardInterfaceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WireguardInterfaceServiceAsync.list */
class WireguardInterfaceListPageAsync
private constructor(
    private val service: WireguardInterfaceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WireguardInterfaceListParams,
    private val response: WireguardInterfaceListPageResponse,
) : PageAsync<WireguardInterfaceListResponse> {

    /**
     * Delegates to [WireguardInterfaceListPageResponse], but gracefully handles missing data.
     *
     * @see WireguardInterfaceListPageResponse.data
     */
    fun data(): List<WireguardInterfaceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WireguardInterfaceListPageResponse], but gracefully handles missing data.
     *
     * @see WireguardInterfaceListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<WireguardInterfaceListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): WireguardInterfaceListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<WireguardInterfaceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WireguardInterfaceListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WireguardInterfaceListParams = params

    /** The response that this page was parsed from. */
    fun response(): WireguardInterfaceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WireguardInterfaceListPageAsync].
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

    /** A builder for [WireguardInterfaceListPageAsync]. */
    class Builder internal constructor() {

        private var service: WireguardInterfaceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WireguardInterfaceListParams? = null
        private var response: WireguardInterfaceListPageResponse? = null

        @JvmSynthetic
        internal fun from(wireguardInterfaceListPageAsync: WireguardInterfaceListPageAsync) =
            apply {
                service = wireguardInterfaceListPageAsync.service
                streamHandlerExecutor = wireguardInterfaceListPageAsync.streamHandlerExecutor
                params = wireguardInterfaceListPageAsync.params
                response = wireguardInterfaceListPageAsync.response
            }

        fun service(service: WireguardInterfaceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WireguardInterfaceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WireguardInterfaceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WireguardInterfaceListPageAsync].
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
        fun build(): WireguardInterfaceListPageAsync =
            WireguardInterfaceListPageAsync(
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

        return other is WireguardInterfaceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WireguardInterfaceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
