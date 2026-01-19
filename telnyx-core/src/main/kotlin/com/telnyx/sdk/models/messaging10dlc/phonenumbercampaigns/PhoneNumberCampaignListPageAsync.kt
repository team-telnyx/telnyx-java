// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.phonenumbercampaigns

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.messaging10dlc.PhoneNumberCampaignServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PhoneNumberCampaignServiceAsync.list */
class PhoneNumberCampaignListPageAsync
private constructor(
    private val service: PhoneNumberCampaignServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PhoneNumberCampaignListParams,
    private val response: PhoneNumberCampaignListPageResponse,
) : PageAsync<PhoneNumberCampaign> {

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
        val pageCount = totalRecords().getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PhoneNumberCampaignListParams {
        val pageNumber = params.page().getOrDefault(1)
        return params.toBuilder().page(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PhoneNumberCampaignListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhoneNumberCampaign> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PhoneNumberCampaignListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhoneNumberCampaignListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhoneNumberCampaignListPageAsync].
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

    /** A builder for [PhoneNumberCampaignListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhoneNumberCampaignServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PhoneNumberCampaignListParams? = null
        private var response: PhoneNumberCampaignListPageResponse? = null

        @JvmSynthetic
        internal fun from(phoneNumberCampaignListPageAsync: PhoneNumberCampaignListPageAsync) =
            apply {
                service = phoneNumberCampaignListPageAsync.service
                streamHandlerExecutor = phoneNumberCampaignListPageAsync.streamHandlerExecutor
                params = phoneNumberCampaignListPageAsync.params
                response = phoneNumberCampaignListPageAsync.response
            }

        fun service(service: PhoneNumberCampaignServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PhoneNumberCampaignListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhoneNumberCampaignListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhoneNumberCampaignListPageAsync].
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
        fun build(): PhoneNumberCampaignListPageAsync =
            PhoneNumberCampaignListPageAsync(
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

        return other is PhoneNumberCampaignListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PhoneNumberCampaignListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
