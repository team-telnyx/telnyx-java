// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.StandardPaginationMeta
import com.telnyx.sdk.services.blocking.legacy.reporting.usagereports.NumberLookupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NumberLookupService.list */
class NumberLookupListPage
private constructor(
    private val service: NumberLookupService,
    private val params: NumberLookupListParams,
    private val response: NumberLookupListPageResponse,
) : Page<TelcoDataUsageReportResponse> {

    /**
     * Delegates to [NumberLookupListPageResponse], but gracefully handles missing data.
     *
     * @see NumberLookupListPageResponse.data
     */
    fun data(): List<TelcoDataUsageReportResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NumberLookupListPageResponse], but gracefully handles missing data.
     *
     * @see NumberLookupListPageResponse.meta
     */
    fun meta(): Optional<StandardPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TelcoDataUsageReportResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NumberLookupListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): NumberLookupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TelcoDataUsageReportResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NumberLookupListParams = params

    /** The response that this page was parsed from. */
    fun response(): NumberLookupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NumberLookupListPage].
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

    /** A builder for [NumberLookupListPage]. */
    class Builder internal constructor() {

        private var service: NumberLookupService? = null
        private var params: NumberLookupListParams? = null
        private var response: NumberLookupListPageResponse? = null

        @JvmSynthetic
        internal fun from(numberLookupListPage: NumberLookupListPage) = apply {
            service = numberLookupListPage.service
            params = numberLookupListPage.params
            response = numberLookupListPage.response
        }

        fun service(service: NumberLookupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NumberLookupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NumberLookupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NumberLookupListPage].
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
        fun build(): NumberLookupListPage =
            NumberLookupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NumberLookupListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NumberLookupListPage{service=$service, params=$params, response=$response}"
}
