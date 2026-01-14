// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.campaign

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.messaging10dlc.CampaignServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CampaignServiceAsync.list */
class CampaignListPageAsync
private constructor(
    private val service: CampaignServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CampaignListParams,
    private val response: CampaignListPageResponse,
) : PageAsync<CampaignListResponse> {

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
        val pageCount = totalRecords().getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CampaignListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CampaignListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CampaignListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): CampaignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CampaignListPageAsync].
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

    /** A builder for [CampaignListPageAsync]. */
    class Builder internal constructor() {

        private var service: CampaignServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CampaignListParams? = null
        private var response: CampaignListPageResponse? = null

        @JvmSynthetic
        internal fun from(campaignListPageAsync: CampaignListPageAsync) = apply {
            service = campaignListPageAsync.service
            streamHandlerExecutor = campaignListPageAsync.streamHandlerExecutor
            params = campaignListPageAsync.params
            response = campaignListPageAsync.response
        }

        fun service(service: CampaignServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CampaignListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CampaignListPageAsync].
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
        fun build(): CampaignListPageAsync =
            CampaignListPageAsync(
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

        return other is CampaignListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CampaignListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
