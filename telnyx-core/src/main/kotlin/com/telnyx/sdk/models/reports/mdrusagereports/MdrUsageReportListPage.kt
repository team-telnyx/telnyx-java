// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports.mdrusagereports

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.reports.MdrUsageReportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MdrUsageReportService.list */
class MdrUsageReportListPage
private constructor(
    private val service: MdrUsageReportService,
    private val params: MdrUsageReportListParams,
    private val response: MdrUsageReportListPageResponse,
) : Page<MdrUsageReport> {

    /**
     * Delegates to [MdrUsageReportListPageResponse], but gracefully handles missing data.
     *
     * @see MdrUsageReportListPageResponse.data
     */
    fun data(): List<MdrUsageReport> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MdrUsageReportListPageResponse], but gracefully handles missing data.
     *
     * @see MdrUsageReportListPageResponse.meta
     */
    fun meta(): Optional<PaginationMetaReporting> = response._meta().getOptional("meta")

    override fun items(): List<MdrUsageReport> = data()

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

    fun nextPageParams(): MdrUsageReportListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): MdrUsageReportListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MdrUsageReport> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MdrUsageReportListParams = params

    /** The response that this page was parsed from. */
    fun response(): MdrUsageReportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MdrUsageReportListPage].
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

    /** A builder for [MdrUsageReportListPage]. */
    class Builder internal constructor() {

        private var service: MdrUsageReportService? = null
        private var params: MdrUsageReportListParams? = null
        private var response: MdrUsageReportListPageResponse? = null

        @JvmSynthetic
        internal fun from(mdrUsageReportListPage: MdrUsageReportListPage) = apply {
            service = mdrUsageReportListPage.service
            params = mdrUsageReportListPage.params
            response = mdrUsageReportListPage.response
        }

        fun service(service: MdrUsageReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MdrUsageReportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MdrUsageReportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MdrUsageReportListPage].
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
        fun build(): MdrUsageReportListPage =
            MdrUsageReportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MdrUsageReportListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MdrUsageReportListPage{service=$service, params=$params, response=$response}"
}
