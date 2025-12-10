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

/** @see PartnerCampaignServiceAsync.listSharedByMe */
class PartnerCampaignListSharedByMePageAsync
private constructor(
    private val service: PartnerCampaignServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PartnerCampaignListSharedByMeParams,
    private val response: PartnerCampaignListSharedByMePageResponse,
) : PageAsync<PartnerCampaignListSharedByMeResponse> {

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
        val pageCount = totalRecords().getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): PartnerCampaignListSharedByMeParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PartnerCampaignListSharedByMePageAsync> =
        service.listSharedByMe(nextPageParams())

    fun autoPager(): AutoPagerAsync<PartnerCampaignListSharedByMeResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PartnerCampaignListSharedByMeParams = params

    /** The response that this page was parsed from. */
    fun response(): PartnerCampaignListSharedByMePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PartnerCampaignListSharedByMePageAsync].
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

    /** A builder for [PartnerCampaignListSharedByMePageAsync]. */
    class Builder internal constructor() {

        private var service: PartnerCampaignServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PartnerCampaignListSharedByMeParams? = null
        private var response: PartnerCampaignListSharedByMePageResponse? = null

        @JvmSynthetic
        internal fun from(
            partnerCampaignListSharedByMePageAsync: PartnerCampaignListSharedByMePageAsync
        ) = apply {
            service = partnerCampaignListSharedByMePageAsync.service
            streamHandlerExecutor = partnerCampaignListSharedByMePageAsync.streamHandlerExecutor
            params = partnerCampaignListSharedByMePageAsync.params
            response = partnerCampaignListSharedByMePageAsync.response
        }

        fun service(service: PartnerCampaignServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PartnerCampaignListSharedByMeParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PartnerCampaignListSharedByMePageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PartnerCampaignListSharedByMePageAsync].
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
        fun build(): PartnerCampaignListSharedByMePageAsync =
            PartnerCampaignListSharedByMePageAsync(
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

        return other is PartnerCampaignListSharedByMePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PartnerCampaignListSharedByMePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
