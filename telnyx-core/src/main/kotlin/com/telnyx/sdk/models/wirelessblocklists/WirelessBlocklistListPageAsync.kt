// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklists

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.WirelessBlocklistServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see WirelessBlocklistServiceAsync.list */
class WirelessBlocklistListPageAsync
private constructor(
    private val service: WirelessBlocklistServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WirelessBlocklistListParams,
    private val response: WirelessBlocklistListPageResponse,
) : PageAsync<WirelessBlocklist> {

    /**
     * Delegates to [WirelessBlocklistListPageResponse], but gracefully handles missing data.
     *
     * @see WirelessBlocklistListPageResponse.data
     */
    fun data(): List<WirelessBlocklist> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [WirelessBlocklistListPageResponse], but gracefully handles missing data.
     *
     * @see WirelessBlocklistListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<WirelessBlocklist> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): WirelessBlocklistListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<WirelessBlocklistListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WirelessBlocklist> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WirelessBlocklistListParams = params

    /** The response that this page was parsed from. */
    fun response(): WirelessBlocklistListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [WirelessBlocklistListPageAsync].
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

    /** A builder for [WirelessBlocklistListPageAsync]. */
    class Builder internal constructor() {

        private var service: WirelessBlocklistServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WirelessBlocklistListParams? = null
        private var response: WirelessBlocklistListPageResponse? = null

        @JvmSynthetic
        internal fun from(wirelessBlocklistListPageAsync: WirelessBlocklistListPageAsync) = apply {
            service = wirelessBlocklistListPageAsync.service
            streamHandlerExecutor = wirelessBlocklistListPageAsync.streamHandlerExecutor
            params = wirelessBlocklistListPageAsync.params
            response = wirelessBlocklistListPageAsync.response
        }

        fun service(service: WirelessBlocklistServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WirelessBlocklistListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WirelessBlocklistListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WirelessBlocklistListPageAsync].
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
        fun build(): WirelessBlocklistListPageAsync =
            WirelessBlocklistListPageAsync(
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

        return other is WirelessBlocklistListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "WirelessBlocklistListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
