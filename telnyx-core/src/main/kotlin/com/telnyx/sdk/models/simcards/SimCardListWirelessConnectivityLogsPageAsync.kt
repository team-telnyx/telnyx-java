// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.SimCardServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardServiceAsync.listWirelessConnectivityLogs */
class SimCardListWirelessConnectivityLogsPageAsync
private constructor(
    private val service: SimCardServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SimCardListWirelessConnectivityLogsParams,
    private val response: SimCardListWirelessConnectivityLogsPageResponse,
) : PageAsync<SimCardListWirelessConnectivityLogsResponse> {

    /**
     * Delegates to [SimCardListWirelessConnectivityLogsPageResponse], but gracefully handles
     * missing data.
     *
     * @see SimCardListWirelessConnectivityLogsPageResponse.data
     */
    fun data(): List<SimCardListWirelessConnectivityLogsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SimCardListWirelessConnectivityLogsPageResponse], but gracefully handles
     * missing data.
     *
     * @see SimCardListWirelessConnectivityLogsPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimCardListWirelessConnectivityLogsResponse> = data()

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

    fun nextPageParams(): SimCardListWirelessConnectivityLogsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SimCardListWirelessConnectivityLogsPageAsync> =
        service.listWirelessConnectivityLogs(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimCardListWirelessConnectivityLogsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SimCardListWirelessConnectivityLogsParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardListWirelessConnectivityLogsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SimCardListWirelessConnectivityLogsPageAsync].
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

    /** A builder for [SimCardListWirelessConnectivityLogsPageAsync]. */
    class Builder internal constructor() {

        private var service: SimCardServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SimCardListWirelessConnectivityLogsParams? = null
        private var response: SimCardListWirelessConnectivityLogsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            simCardListWirelessConnectivityLogsPageAsync:
                SimCardListWirelessConnectivityLogsPageAsync
        ) = apply {
            service = simCardListWirelessConnectivityLogsPageAsync.service
            streamHandlerExecutor =
                simCardListWirelessConnectivityLogsPageAsync.streamHandlerExecutor
            params = simCardListWirelessConnectivityLogsPageAsync.params
            response = simCardListWirelessConnectivityLogsPageAsync.response
        }

        fun service(service: SimCardServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardListWirelessConnectivityLogsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: SimCardListWirelessConnectivityLogsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SimCardListWirelessConnectivityLogsPageAsync].
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
        fun build(): SimCardListWirelessConnectivityLogsPageAsync =
            SimCardListWirelessConnectivityLogsPageAsync(
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

        return other is SimCardListWirelessConnectivityLogsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SimCardListWirelessConnectivityLogsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
