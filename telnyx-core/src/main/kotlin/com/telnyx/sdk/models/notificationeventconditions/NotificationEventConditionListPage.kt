// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationeventconditions

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NotificationEventConditionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationEventConditionService.list */
class NotificationEventConditionListPage
private constructor(
    private val service: NotificationEventConditionService,
    private val params: NotificationEventConditionListParams,
    private val response: NotificationEventConditionListPageResponse,
) : Page<NotificationEventConditionListResponse> {

    /**
     * Delegates to [NotificationEventConditionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see NotificationEventConditionListPageResponse.data
     */
    fun data(): List<NotificationEventConditionListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NotificationEventConditionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see NotificationEventConditionListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NotificationEventConditionListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NotificationEventConditionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): NotificationEventConditionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NotificationEventConditionListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NotificationEventConditionListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationEventConditionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationEventConditionListPage].
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

    /** A builder for [NotificationEventConditionListPage]. */
    class Builder internal constructor() {

        private var service: NotificationEventConditionService? = null
        private var params: NotificationEventConditionListParams? = null
        private var response: NotificationEventConditionListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationEventConditionListPage: NotificationEventConditionListPage) =
            apply {
                service = notificationEventConditionListPage.service
                params = notificationEventConditionListPage.params
                response = notificationEventConditionListPage.response
            }

        fun service(service: NotificationEventConditionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationEventConditionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationEventConditionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationEventConditionListPage].
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
        fun build(): NotificationEventConditionListPage =
            NotificationEventConditionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationEventConditionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NotificationEventConditionListPage{service=$service, params=$params, response=$response}"
}
