// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.billinggroups

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.BillingGroupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BillingGroupService.list */
class BillingGroupListPage
private constructor(
    private val service: BillingGroupService,
    private val params: BillingGroupListParams,
    private val response: BillingGroupListPageResponse,
) : Page<BillingGroup> {

    /**
     * Delegates to [BillingGroupListPageResponse], but gracefully handles missing data.
     *
     * @see BillingGroupListPageResponse.data
     */
    fun data(): List<BillingGroup> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillingGroupListPageResponse], but gracefully handles missing data.
     *
     * @see BillingGroupListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<BillingGroup> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): BillingGroupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): BillingGroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BillingGroup> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BillingGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillingGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillingGroupListPage].
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

    /** A builder for [BillingGroupListPage]. */
    class Builder internal constructor() {

        private var service: BillingGroupService? = null
        private var params: BillingGroupListParams? = null
        private var response: BillingGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(billingGroupListPage: BillingGroupListPage) = apply {
            service = billingGroupListPage.service
            params = billingGroupListPage.params
            response = billingGroupListPage.response
        }

        fun service(service: BillingGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillingGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillingGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillingGroupListPage].
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
        fun build(): BillingGroupListPage =
            BillingGroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingGroupListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BillingGroupListPage{service=$service, params=$params, response=$response}"
}
