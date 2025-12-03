// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcarddatausagenotifications

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.SimCardDataUsageNotificationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardDataUsageNotificationService.list */
class SimCardDataUsageNotificationListPage
private constructor(
    private val service: SimCardDataUsageNotificationService,
    private val params: SimCardDataUsageNotificationListParams,
    private val response: SimCardDataUsageNotificationListPageResponse,
) : Page<SimCardDataUsageNotification> {

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

    override fun nextPage(): SimCardDataUsageNotificationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SimCardDataUsageNotification> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SimCardDataUsageNotificationListParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardDataUsageNotificationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SimCardDataUsageNotificationListPage].
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

    /** A builder for [SimCardDataUsageNotificationListPage]. */
    class Builder internal constructor() {

        private var service: SimCardDataUsageNotificationService? = null
        private var params: SimCardDataUsageNotificationListParams? = null
        private var response: SimCardDataUsageNotificationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            simCardDataUsageNotificationListPage: SimCardDataUsageNotificationListPage
        ) = apply {
            service = simCardDataUsageNotificationListPage.service
            params = simCardDataUsageNotificationListPage.params
            response = simCardDataUsageNotificationListPage.response
        }

        fun service(service: SimCardDataUsageNotificationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardDataUsageNotificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SimCardDataUsageNotificationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SimCardDataUsageNotificationListPage].
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
        fun build(): SimCardDataUsageNotificationListPage =
            SimCardDataUsageNotificationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardDataUsageNotificationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SimCardDataUsageNotificationListPage{service=$service, params=$params, response=$response}"
}
