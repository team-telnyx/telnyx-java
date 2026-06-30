// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.TrafficPolicyProfileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TrafficPolicyProfileService.list */
class TrafficPolicyProfileListPage
private constructor(
    private val service: TrafficPolicyProfileService,
    private val params: TrafficPolicyProfileListParams,
    private val response: TrafficPolicyProfileListPageResponse,
) : Page<TrafficPolicyProfile> {

    /**
     * Delegates to [TrafficPolicyProfileListPageResponse], but gracefully handles missing data.
     *
     * @see TrafficPolicyProfileListPageResponse.data
     */
    fun data(): List<TrafficPolicyProfile> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TrafficPolicyProfileListPageResponse], but gracefully handles missing data.
     *
     * @see TrafficPolicyProfileListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TrafficPolicyProfile> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TrafficPolicyProfileListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): TrafficPolicyProfileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TrafficPolicyProfile> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TrafficPolicyProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): TrafficPolicyProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TrafficPolicyProfileListPage].
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

    /** A builder for [TrafficPolicyProfileListPage]. */
    class Builder internal constructor() {

        private var service: TrafficPolicyProfileService? = null
        private var params: TrafficPolicyProfileListParams? = null
        private var response: TrafficPolicyProfileListPageResponse? = null

        @JvmSynthetic
        internal fun from(trafficPolicyProfileListPage: TrafficPolicyProfileListPage) = apply {
            service = trafficPolicyProfileListPage.service
            params = trafficPolicyProfileListPage.params
            response = trafficPolicyProfileListPage.response
        }

        fun service(service: TrafficPolicyProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TrafficPolicyProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TrafficPolicyProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TrafficPolicyProfileListPage].
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
        fun build(): TrafficPolicyProfileListPage =
            TrafficPolicyProfileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrafficPolicyProfileListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TrafficPolicyProfileListPage{service=$service, params=$params, response=$response}"
}
