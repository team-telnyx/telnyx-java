// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationevents

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NotificationEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationEventServiceAsync.list */
class NotificationEventListPageAsync
private constructor(
    private val service: NotificationEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NotificationEventListParams,
    private val response: NotificationEventListPageResponse,
) : PageAsync<NotificationEventListResponse> {

    /**
     * Delegates to [NotificationEventListPageResponse], but gracefully handles missing data.
     *
     * @see NotificationEventListPageResponse.data
     */
    fun data(): List<NotificationEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NotificationEventListPageResponse], but gracefully handles missing data.
     *
     * @see NotificationEventListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NotificationEventListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NotificationEventListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NotificationEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NotificationEventListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NotificationEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationEventListPageAsync].
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

    /** A builder for [NotificationEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: NotificationEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NotificationEventListParams? = null
        private var response: NotificationEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationEventListPageAsync: NotificationEventListPageAsync) = apply {
            service = notificationEventListPageAsync.service
            streamHandlerExecutor = notificationEventListPageAsync.streamHandlerExecutor
            params = notificationEventListPageAsync.params
            response = notificationEventListPageAsync.response
        }

        fun service(service: NotificationEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationEventListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationEventListPageAsync].
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
        fun build(): NotificationEventListPageAsync =
            NotificationEventListPageAsync(
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

        return other is NotificationEventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NotificationEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
