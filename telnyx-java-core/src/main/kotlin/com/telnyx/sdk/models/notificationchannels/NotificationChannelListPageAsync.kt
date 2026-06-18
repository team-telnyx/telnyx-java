// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationchannels

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NotificationChannelServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationChannelServiceAsync.list */
class NotificationChannelListPageAsync
private constructor(
    private val service: NotificationChannelServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NotificationChannelListParams,
    private val response: NotificationChannelListPageResponse,
) : PageAsync<NotificationChannel> {

    /**
     * Delegates to [NotificationChannelListPageResponse], but gracefully handles missing data.
     *
     * @see NotificationChannelListPageResponse.data
     */
    fun data(): List<NotificationChannel> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NotificationChannelListPageResponse], but gracefully handles missing data.
     *
     * @see NotificationChannelListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NotificationChannel> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NotificationChannelListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NotificationChannelListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NotificationChannel> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NotificationChannelListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationChannelListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationChannelListPageAsync].
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

    /** A builder for [NotificationChannelListPageAsync]. */
    class Builder internal constructor() {

        private var service: NotificationChannelServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NotificationChannelListParams? = null
        private var response: NotificationChannelListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationChannelListPageAsync: NotificationChannelListPageAsync) =
            apply {
                service = notificationChannelListPageAsync.service
                streamHandlerExecutor = notificationChannelListPageAsync.streamHandlerExecutor
                params = notificationChannelListPageAsync.params
                response = notificationChannelListPageAsync.response
            }

        fun service(service: NotificationChannelServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationChannelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationChannelListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationChannelListPageAsync].
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
        fun build(): NotificationChannelListPageAsync =
            NotificationChannelListPageAsync(
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

        return other is NotificationChannelListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NotificationChannelListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
