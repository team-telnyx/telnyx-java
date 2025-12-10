// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.number10dlc.CampaignService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CampaignService.list */
class CampaignListPage
private constructor(
    private val service: CampaignService,
    private val params: CampaignListParams,
    private val response: CampaignListPageResponse,
) : Page<CampaignListResponse> {

    /**
     * Delegates to [CampaignListPageResponse], but gracefully handles missing data.
     *
     * @see CampaignListPageResponse.records
     */
    fun records(): List<CampaignListResponse> =
        response._records().getOptional("records").getOrNull() ?: emptyList()

    /**
     * Delegates to [CampaignListPageResponse], but gracefully handles missing data.
     *
     * @see CampaignListPageResponse.page
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    /**
     * Delegates to [CampaignListPageResponse], but gracefully handles missing data.
     *
     * @see CampaignListPageResponse.totalRecords
     */
    fun totalRecords(): Optional<Long> = response._totalRecords().getOptional("totalRecords")

    override fun items(): List<CampaignListResponse> = records()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber = page().getOrDefault(1)
        val pageCount = totalRecords().getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): CampaignListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CampaignListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CampaignListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): CampaignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CampaignListPage].
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

    /** A builder for [CampaignListPage]. */
    class Builder internal constructor() {

        private var service: CampaignService? = null
        private var params: CampaignListParams? = null
        private var response: CampaignListPageResponse? = null

        @JvmSynthetic
        internal fun from(campaignListPage: CampaignListPage) = apply {
            service = campaignListPage.service
            params = campaignListPage.params
            response = campaignListPage.response
        }

        fun service(service: CampaignService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CampaignListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CampaignListPage].
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
        fun build(): CampaignListPage =
            CampaignListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CampaignListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CampaignListPage{service=$service, params=$params, response=$response}"
}
