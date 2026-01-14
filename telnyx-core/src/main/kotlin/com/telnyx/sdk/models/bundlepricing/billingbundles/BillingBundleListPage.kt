// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.billingbundles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.bundlepricing.BillingBundleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BillingBundleService.list */
class BillingBundleListPage
private constructor(
    private val service: BillingBundleService,
    private val params: BillingBundleListParams,
    private val response: BillingBundleListPageResponse,
) : Page<BillingBundleSummary> {

    /**
     * Delegates to [BillingBundleListPageResponse], but gracefully handles missing data.
     *
     * @see BillingBundleListPageResponse.data
     */
    fun data(): List<BillingBundleSummary> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillingBundleListPageResponse], but gracefully handles missing data.
     *
     * @see BillingBundleListPageResponse.meta
     */
    fun meta(): Optional<PaginationResponse> = response._meta().getOptional("meta")

    override fun items(): List<BillingBundleSummary> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): BillingBundleListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): BillingBundleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BillingBundleSummary> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BillingBundleListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillingBundleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillingBundleListPage].
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

    /** A builder for [BillingBundleListPage]. */
    class Builder internal constructor() {

        private var service: BillingBundleService? = null
        private var params: BillingBundleListParams? = null
        private var response: BillingBundleListPageResponse? = null

        @JvmSynthetic
        internal fun from(billingBundleListPage: BillingBundleListPage) = apply {
            service = billingBundleListPage.service
            params = billingBundleListPage.params
            response = billingBundleListPage.response
        }

        fun service(service: BillingBundleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillingBundleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillingBundleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillingBundleListPage].
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
        fun build(): BillingBundleListPage =
            BillingBundleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingBundleListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BillingBundleListPage{service=$service, params=$params, response=$response}"
}
