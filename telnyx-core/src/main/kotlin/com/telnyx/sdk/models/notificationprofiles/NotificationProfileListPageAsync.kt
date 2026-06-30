// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationprofiles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NotificationProfileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationProfileServiceAsync.list */
class NotificationProfileListPageAsync
private constructor(
    private val service: NotificationProfileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NotificationProfileListParams,
    private val response: NotificationProfileListPageResponse,
) : PageAsync<NotificationProfile> {

    /**
     * Delegates to [NotificationProfileListPageResponse], but gracefully handles missing data.
     *
     * @see NotificationProfileListPageResponse.data
     */
    fun data(): List<NotificationProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NotificationProfileListPageResponse], but gracefully handles missing data.
     *
     * @see NotificationProfileListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NotificationProfile> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NotificationProfileListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NotificationProfileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NotificationProfile> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NotificationProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationProfileListPageAsync].
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

    /** A builder for [NotificationProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: NotificationProfileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NotificationProfileListParams? = null
        private var response: NotificationProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationProfileListPageAsync: NotificationProfileListPageAsync) =
            apply {
                service = notificationProfileListPageAsync.service
                streamHandlerExecutor = notificationProfileListPageAsync.streamHandlerExecutor
                params = notificationProfileListPageAsync.params
                response = notificationProfileListPageAsync.response
            }

        fun service(service: NotificationProfileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationProfileListPageAsync].
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
        fun build(): NotificationProfileListPageAsync =
            NotificationProfileListPageAsync(
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

        return other is NotificationProfileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NotificationProfileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
