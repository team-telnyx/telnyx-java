// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.partnercampaigns

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.messaging10dlc.PartnerCampaignServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PartnerCampaignServiceAsync.list */
class PartnerCampaignListPageAsync
private constructor(
    private val service: PartnerCampaignServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PartnerCampaignListParams,
    private val response: PartnerCampaignListPageResponse,
) : PageAsync<TelnyxDownstreamCampaign> {

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

    override fun nextPage(): CompletableFuture<PartnerCampaignListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TelnyxDownstreamCampaign> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PartnerCampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): PartnerCampaignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PartnerCampaignListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PartnerCampaignListPageAsync]. */
    class Builder internal constructor() {

        private var service: PartnerCampaignServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PartnerCampaignListParams? = null
        private var response: PartnerCampaignListPageResponse? = null

        @JvmSynthetic
        internal fun from(partnerCampaignListPageAsync: PartnerCampaignListPageAsync) = apply {
            service = partnerCampaignListPageAsync.service
            streamHandlerExecutor = partnerCampaignListPageAsync.streamHandlerExecutor
            params = partnerCampaignListPageAsync.params
            response = partnerCampaignListPageAsync.response
        }

        fun service(service: PartnerCampaignServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PartnerCampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PartnerCampaignListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PartnerCampaignListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PartnerCampaignListPageAsync =
            PartnerCampaignListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PartnerCampaignListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PartnerCampaignListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
