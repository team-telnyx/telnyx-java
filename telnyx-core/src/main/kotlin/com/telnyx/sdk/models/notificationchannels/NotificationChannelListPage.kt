// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationchannels

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NotificationChannelService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationChannelService.list */
class NotificationChannelListPage
private constructor(
    private val service: NotificationChannelService,
    private val params: NotificationChannelListParams,
    private val response: NotificationChannelListPageResponse,
) : Page<NotificationChannel> {

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
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): NotificationChannelListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NotificationChannel> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NotificationChannelListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationChannelListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotificationChannelListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationChannelListPage]. */
    class Builder internal constructor() {

        private var service: NotificationChannelService? = null
        private var params: NotificationChannelListParams? = null
        private var response: NotificationChannelListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationChannelListPage: NotificationChannelListPage) = apply {
            service = notificationChannelListPage.service
            params = notificationChannelListPage.params
            response = notificationChannelListPage.response
        }

        fun service(service: NotificationChannelService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationChannelListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationChannelListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationChannelListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationChannelListPage =
            NotificationChannelListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationChannelListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NotificationChannelListPage{service=$service, params=$params, response=$response}"
}
