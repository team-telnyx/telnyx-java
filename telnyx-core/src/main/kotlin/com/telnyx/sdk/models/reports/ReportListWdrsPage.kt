// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.ReportService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ReportService.listWdrs */
class ReportListWdrsPage
private constructor(
    private val service: ReportService,
    private val params: ReportListWdrsParams,
    private val response: ReportListWdrsPageResponse,
) : Page<ReportListWdrsResponse> {

    /**
     * Delegates to [ReportListWdrsPageResponse], but gracefully handles missing data.
     *
     * @see ReportListWdrsPageResponse.data
     */
    fun data(): List<ReportListWdrsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReportListWdrsPageResponse], but gracefully handles missing data.
     *
     * @see ReportListWdrsPageResponse.meta
     */
    fun meta(): Optional<ReportListWdrsPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<ReportListWdrsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ReportListWdrsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): ReportListWdrsPage = service.listWdrs(nextPageParams())

    fun autoPager(): AutoPager<ReportListWdrsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportListWdrsParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportListWdrsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ReportListWdrsPage].
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

    /** A builder for [ReportListWdrsPage]. */
    class Builder internal constructor() {

        private var service: ReportService? = null
        private var params: ReportListWdrsParams? = null
        private var response: ReportListWdrsPageResponse? = null

        @JvmSynthetic
        internal fun from(reportListWdrsPage: ReportListWdrsPage) = apply {
            service = reportListWdrsPage.service
            params = reportListWdrsPage.params
            response = reportListWdrsPage.response
        }

        fun service(service: ReportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportListWdrsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportListWdrsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ReportListWdrsPage].
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
        fun build(): ReportListWdrsPage =
            ReportListWdrsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportListWdrsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ReportListWdrsPage{service=$service, params=$params, response=$response}"
}
