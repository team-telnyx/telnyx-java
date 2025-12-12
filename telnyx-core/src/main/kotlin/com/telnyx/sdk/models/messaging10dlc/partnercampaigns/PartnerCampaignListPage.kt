// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.partnercampaigns

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.messaging10dlc.PartnerCampaignService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PartnerCampaignService.list */
class PartnerCampaignListPage
private constructor(
    private val service: PartnerCampaignService,
    private val params: PartnerCampaignListParams,
    private val response: PartnerCampaignListPageResponse,
) : Page<TelnyxDownstreamCampaign> {

    /**
     * Delegates to [PartnerCampaignListPageResponse], but gracefully handles missing data.
     *
     * @see PartnerCampaignListPageResponse.records
     */
    fun records(): List<TelnyxDownstreamCampaign> =
        response._records().getOptional("records").getOrNull() ?: emptyList()

    /**
     * Delegates to [PartnerCampaignListPageResponse], but gracefully handles missing data.
     *
     * @see PartnerCampaignListPageResponse.page
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    /**
     * Delegates to [PartnerCampaignListPageResponse], but gracefully handles missing data.
     *
     * @see PartnerCampaignListPageResponse.totalRecords
     */
    fun totalRecords(): Optional<Long> = response._totalRecords().getOptional("totalRecords")

    override fun items(): List<TelnyxDownstreamCampaign> = records()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber = page().getOrDefault(1)
        val pageCount = totalRecords().getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): PartnerCampaignListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): PartnerCampaignListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TelnyxDownstreamCampaign> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PartnerCampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): PartnerCampaignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PartnerCampaignListPage].
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

    /** A builder for [PartnerCampaignListPage]. */
    class Builder internal constructor() {

        private var service: PartnerCampaignService? = null
        private var params: PartnerCampaignListParams? = null
        private var response: PartnerCampaignListPageResponse? = null

        @JvmSynthetic
        internal fun from(partnerCampaignListPage: PartnerCampaignListPage) = apply {
            service = partnerCampaignListPage.service
            params = partnerCampaignListPage.params
            response = partnerCampaignListPage.response
        }

        fun service(service: PartnerCampaignService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PartnerCampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PartnerCampaignListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PartnerCampaignListPage].
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
        fun build(): PartnerCampaignListPage =
            PartnerCampaignListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerCampaignListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PartnerCampaignListPage{service=$service, params=$params, response=$response}"
}
