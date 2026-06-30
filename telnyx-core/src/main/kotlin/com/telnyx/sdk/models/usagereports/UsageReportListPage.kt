// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.usagereports

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.UsageReportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UsageReportService.list */
class UsageReportListPage
private constructor(
    private val service: UsageReportService,
    private val params: UsageReportListParams,
    private val response: UsageReportListPageResponse,
) : Page<UsageReportListResponse> {

    /**
     * Delegates to [UsageReportListPageResponse], but gracefully handles missing data.
     *
     * @see UsageReportListPageResponse.data
     */
    fun data(): List<UsageReportListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UsageReportListPageResponse], but gracefully handles missing data.
     *
     * @see UsageReportListPageResponse.meta
     */
    fun meta(): Optional<UsageReportListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<UsageReportListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): UsageReportListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): UsageReportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<UsageReportListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UsageReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageReportListPage].
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

    /** A builder for [UsageReportListPage]. */
    class Builder internal constructor() {

        private var service: UsageReportService? = null
        private var params: UsageReportListParams? = null
        private var response: UsageReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(usageReportListPage: UsageReportListPage) = apply {
            service = usageReportListPage.service
            params = usageReportListPage.params
            response = usageReportListPage.response
        }

        fun service(service: UsageReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UsageReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageReportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UsageReportListPage].
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
        fun build(): UsageReportListPage =
            UsageReportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageReportListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UsageReportListPage{service=$service, params=$params, response=$response}"
}
