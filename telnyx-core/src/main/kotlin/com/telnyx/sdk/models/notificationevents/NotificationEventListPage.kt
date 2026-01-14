// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationevents

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NotificationEventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationEventService.list */
class NotificationEventListPage
private constructor(
    private val service: NotificationEventService,
    private val params: NotificationEventListParams,
    private val response: NotificationEventListPageResponse,
) : Page<NotificationEventListResponse> {

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
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): NotificationEventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NotificationEventListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NotificationEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotificationEventListPage].
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

    /** A builder for [NotificationEventListPage]. */
    class Builder internal constructor() {

        private var service: NotificationEventService? = null
        private var params: NotificationEventListParams? = null
        private var response: NotificationEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationEventListPage: NotificationEventListPage) = apply {
            service = notificationEventListPage.service
            params = notificationEventListPage.params
            response = notificationEventListPage.response
        }

        fun service(service: NotificationEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationEventListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationEventListPage].
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
        fun build(): NotificationEventListPage =
            NotificationEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationEventListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NotificationEventListPage{service=$service, params=$params, response=$response}"
}
