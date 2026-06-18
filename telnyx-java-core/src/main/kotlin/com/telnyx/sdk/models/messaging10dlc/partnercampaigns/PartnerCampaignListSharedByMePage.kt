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

/** @see PartnerCampaignService.listSharedByMe */
class PartnerCampaignListSharedByMePage
private constructor(
    private val service: PartnerCampaignService,
    private val params: PartnerCampaignListSharedByMeParams,
    private val response: PartnerCampaignListSharedByMePageResponse,
) : Page<PartnerCampaignListSharedByMeResponse> {

    /**
     * Delegates to [PartnerCampaignListSharedByMePageResponse], but gracefully handles missing
     * data.
     *
     * @see PartnerCampaignListSharedByMePageResponse.records
     */
    fun records(): List<PartnerCampaignListSharedByMeResponse> =
        response._records().getOptional("records").getOrNull() ?: emptyList()

    /**
     * Delegates to [PartnerCampaignListSharedByMePageResponse], but gracefully handles missing
     * data.
     *
     * @see PartnerCampaignListSharedByMePageResponse.page
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    /**
     * Delegates to [PartnerCampaignListSharedByMePageResponse], but gracefully handles missing
     * data.
     *
     * @see PartnerCampaignListSharedByMePageResponse.totalRecords
     */
    fun totalRecords(): Optional<Long> = response._totalRecords().getOptional("totalRecords")

    override fun items(): List<PartnerCampaignListSharedByMeResponse> = records()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber = page().getOrDefault(1)
        val pageCount = totalRecords().getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PartnerCampaignListSharedByMeParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): PartnerCampaignListSharedByMePage =
        service.listSharedByMe(nextPageParams())

    fun autoPager(): AutoPager<PartnerCampaignListSharedByMeResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PartnerCampaignListSharedByMeParams = params

    /** The response that this page was parsed from. */
    fun response(): PartnerCampaignListSharedByMePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PartnerCampaignListSharedByMePage].
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

    /** A builder for [PartnerCampaignListSharedByMePage]. */
    class Builder internal constructor() {

        private var service: PartnerCampaignService? = null
        private var params: PartnerCampaignListSharedByMeParams? = null
        private var response: PartnerCampaignListSharedByMePageResponse? = null

        @JvmSynthetic
        internal fun from(partnerCampaignListSharedByMePage: PartnerCampaignListSharedByMePage) =
            apply {
                service = partnerCampaignListSharedByMePage.service
                params = partnerCampaignListSharedByMePage.params
                response = partnerCampaignListSharedByMePage.response
            }

        fun service(service: PartnerCampaignService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PartnerCampaignListSharedByMeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PartnerCampaignListSharedByMePageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PartnerCampaignListSharedByMePage].
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
        fun build(): PartnerCampaignListSharedByMePage =
            PartnerCampaignListSharedByMePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerCampaignListSharedByMePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PartnerCampaignListSharedByMePage{service=$service, params=$params, response=$response}"
}
