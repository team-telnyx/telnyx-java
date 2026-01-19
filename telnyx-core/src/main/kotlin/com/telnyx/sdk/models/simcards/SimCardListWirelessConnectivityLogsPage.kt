// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.SimCardService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardService.listWirelessConnectivityLogs */
class SimCardListWirelessConnectivityLogsPage
private constructor(
    private val service: SimCardService,
    private val params: SimCardListWirelessConnectivityLogsParams,
    private val response: SimCardListWirelessConnectivityLogsPageResponse,
) : Page<SimCardListWirelessConnectivityLogsResponse> {

    /**
     * Delegates to [SimCardListWirelessConnectivityLogsPageResponse], but gracefully handles
     * missing data.
     *
     * @see SimCardListWirelessConnectivityLogsPageResponse.data
     */
    fun data(): List<SimCardListWirelessConnectivityLogsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SimCardListWirelessConnectivityLogsPageResponse], but gracefully handles
     * missing data.
     *
     * @see SimCardListWirelessConnectivityLogsPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimCardListWirelessConnectivityLogsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): SimCardListWirelessConnectivityLogsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): SimCardListWirelessConnectivityLogsPage =
        service.listWirelessConnectivityLogs(nextPageParams())

    fun autoPager(): AutoPager<SimCardListWirelessConnectivityLogsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SimCardListWirelessConnectivityLogsParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardListWirelessConnectivityLogsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SimCardListWirelessConnectivityLogsPage].
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

    /** A builder for [SimCardListWirelessConnectivityLogsPage]. */
    class Builder internal constructor() {

        private var service: SimCardService? = null
        private var params: SimCardListWirelessConnectivityLogsParams? = null
        private var response: SimCardListWirelessConnectivityLogsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            simCardListWirelessConnectivityLogsPage: SimCardListWirelessConnectivityLogsPage
        ) = apply {
            service = simCardListWirelessConnectivityLogsPage.service
            params = simCardListWirelessConnectivityLogsPage.params
            response = simCardListWirelessConnectivityLogsPage.response
        }

        fun service(service: SimCardService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardListWirelessConnectivityLogsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: SimCardListWirelessConnectivityLogsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SimCardListWirelessConnectivityLogsPage].
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
        fun build(): SimCardListWirelessConnectivityLogsPage =
            SimCardListWirelessConnectivityLogsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardListWirelessConnectivityLogsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SimCardListWirelessConnectivityLogsPage{service=$service, params=$params, response=$response}"
}
