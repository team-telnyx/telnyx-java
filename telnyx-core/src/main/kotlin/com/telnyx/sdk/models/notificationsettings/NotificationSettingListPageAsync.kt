// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationsettings

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.NotificationSettingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationSettingServiceAsync.list */
class NotificationSettingListPageAsync
private constructor(
    private val service: NotificationSettingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NotificationSettingListParams,
    private val response: NotificationSettingListPageResponse,
) : PageAsync<NotificationSetting> {

    /**
     * Delegates to [NotificationSettingListPageResponse], but gracefully handles missing data.
     *
     * @see NotificationSettingListPageResponse.data
     */
    fun data(): List<NotificationSetting> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NotificationSettingListPageResponse], but gracefully handles missing data.
     *
     * @see NotificationSettingListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NotificationSetting> = data()

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

    fun nextPageParams(): NotificationSettingListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<NotificationSettingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NotificationSetting> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NotificationSettingListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationSettingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationSettingListPageAsync].
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

    /** A builder for [NotificationSettingListPageAsync]. */
    class Builder internal constructor() {

        private var service: NotificationSettingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NotificationSettingListParams? = null
        private var response: NotificationSettingListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationSettingListPageAsync: NotificationSettingListPageAsync) =
            apply {
                service = notificationSettingListPageAsync.service
                streamHandlerExecutor = notificationSettingListPageAsync.streamHandlerExecutor
                params = notificationSettingListPageAsync.params
                response = notificationSettingListPageAsync.response
            }

        fun service(service: NotificationSettingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationSettingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationSettingListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationSettingListPageAsync].
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
        fun build(): NotificationSettingListPageAsync =
            NotificationSettingListPageAsync(
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

        return other is NotificationSettingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NotificationSettingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
