// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcarddatausagenotifications

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.SimCardDataUsageNotificationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardDataUsageNotificationServiceAsync.list */
class SimCardDataUsageNotificationListPageAsync
private constructor(
    private val service: SimCardDataUsageNotificationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SimCardDataUsageNotificationListParams,
    private val response: SimCardDataUsageNotificationListPageResponse,
) : PageAsync<SimCardDataUsageNotification> {

    /**
     * Delegates to [SimCardDataUsageNotificationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see SimCardDataUsageNotificationListPageResponse.data
     */
    fun data(): List<SimCardDataUsageNotification> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SimCardDataUsageNotificationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see SimCardDataUsageNotificationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimCardDataUsageNotification> = data()

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

    fun nextPageParams(): SimCardDataUsageNotificationListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SimCardDataUsageNotificationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<SimCardDataUsageNotification> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SimCardDataUsageNotificationListParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardDataUsageNotificationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SimCardDataUsageNotificationListPageAsync].
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

    /** A builder for [SimCardDataUsageNotificationListPageAsync]. */
    class Builder internal constructor() {

        private var service: SimCardDataUsageNotificationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SimCardDataUsageNotificationListParams? = null
        private var response: SimCardDataUsageNotificationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            simCardDataUsageNotificationListPageAsync: SimCardDataUsageNotificationListPageAsync
        ) = apply {
            service = simCardDataUsageNotificationListPageAsync.service
            streamHandlerExecutor = simCardDataUsageNotificationListPageAsync.streamHandlerExecutor
            params = simCardDataUsageNotificationListPageAsync.params
            response = simCardDataUsageNotificationListPageAsync.response
        }

        fun service(service: SimCardDataUsageNotificationServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardDataUsageNotificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SimCardDataUsageNotificationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SimCardDataUsageNotificationListPageAsync].
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
        fun build(): SimCardDataUsageNotificationListPageAsync =
            SimCardDataUsageNotificationListPageAsync(
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

        return other is SimCardDataUsageNotificationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SimCardDataUsageNotificationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
