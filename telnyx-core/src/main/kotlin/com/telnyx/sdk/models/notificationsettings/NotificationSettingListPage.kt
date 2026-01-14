// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.notificationsettings

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NotificationSettingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NotificationSettingService.list */
class NotificationSettingListPage
private constructor(
    private val service: NotificationSettingService,
    private val params: NotificationSettingListParams,
    private val response: NotificationSettingListPageResponse,
) : Page<NotificationSetting> {

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
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NotificationSettingListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): NotificationSettingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NotificationSetting> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NotificationSettingListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationSettingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotificationSettingListPage].
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

    /** A builder for [NotificationSettingListPage]. */
    class Builder internal constructor() {

        private var service: NotificationSettingService? = null
        private var params: NotificationSettingListParams? = null
        private var response: NotificationSettingListPageResponse? = null

        @JvmSynthetic
        internal fun from(notificationSettingListPage: NotificationSettingListPage) = apply {
            service = notificationSettingListPage.service
            params = notificationSettingListPage.params
            response = notificationSettingListPage.response
        }

        fun service(service: NotificationSettingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationSettingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationSettingListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationSettingListPage].
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
        fun build(): NotificationSettingListPage =
            NotificationSettingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationSettingListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NotificationSettingListPage{service=$service, params=$params, response=$response}"
}
