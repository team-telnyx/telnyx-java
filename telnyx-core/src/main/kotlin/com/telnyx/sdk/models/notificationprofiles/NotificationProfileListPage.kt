// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationprofiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NotificationProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationProfileService.list */
class NotificationProfileListPage
private constructor(
    private val service: NotificationProfileService,
    private val params: NotificationProfileListParams,
    private val response: NotificationProfileListPageResponse,
) : Page<NotificationProfile> {

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

    override fun nextPage(): NotificationProfileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NotificationProfile> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NotificationProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotificationProfileListPage].
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

    /** A builder for [NotificationProfileListPage]. */
    class Builder internal constructor() {

        private var service: NotificationProfileService? = null
        private var params: NotificationProfileListParams? = null
        private var response: NotificationProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationProfileListPage: NotificationProfileListPage) = apply {
            service = notificationProfileListPage.service
            params = notificationProfileListPage.params
            response = notificationProfileListPage.response
        }

        fun service(service: NotificationProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationProfileListPage].
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
        fun build(): NotificationProfileListPage =
            NotificationProfileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationProfileListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NotificationProfileListPage{service=$service, params=$params, response=$response}"
}
