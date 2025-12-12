// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.phonenumbercampaigns

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.number10dlc.PhoneNumberCampaignService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberCampaignService.list */
class PhoneNumberCampaignListPage
private constructor(
    private val service: PhoneNumberCampaignService,
    private val params: PhoneNumberCampaignListParams,
    private val response: PhoneNumberCampaignListPageResponse,
) : Page<PhoneNumberCampaign> {

    /**
     * Delegates to [PhoneNumberCampaignListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberCampaignListPageResponse.records
     */
    fun records(): List<PhoneNumberCampaign> =
        response._records().getOptional("records").getOrNull() ?: emptyList()

    /**
     * Delegates to [PhoneNumberCampaignListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberCampaignListPageResponse.page
     */
    fun page(): Optional<Long> = response._page().getOptional("page")

    /**
     * Delegates to [PhoneNumberCampaignListPageResponse], but gracefully handles missing data.
     *
     * @see PhoneNumberCampaignListPageResponse.totalRecords
     */
    fun totalRecords(): Optional<Long> = response._totalRecords().getOptional("totalRecords")

    override fun items(): List<PhoneNumberCampaign> = records()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber = page().getOrDefault(1)
        val pageCount = totalRecords().getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberCampaignListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): PhoneNumberCampaignListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PhoneNumberCampaign> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberCampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberCampaignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneNumberCampaignListPage].
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

    /** A builder for [PhoneNumberCampaignListPage]. */
    class Builder internal constructor() {

        private var service: PhoneNumberCampaignService? = null
        private var params: PhoneNumberCampaignListParams? = null
        private var response: PhoneNumberCampaignListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberCampaignListPage: PhoneNumberCampaignListPage) = apply {
            service = phoneNumberCampaignListPage.service
            params = phoneNumberCampaignListPage.params
            response = phoneNumberCampaignListPage.response
        }

        fun service(service: PhoneNumberCampaignService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberCampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberCampaignListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberCampaignListPage].
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
        fun build(): PhoneNumberCampaignListPage =
            PhoneNumberCampaignListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneNumberCampaignListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhoneNumberCampaignListPage{service=$service, params=$params, response=$response}"
}
