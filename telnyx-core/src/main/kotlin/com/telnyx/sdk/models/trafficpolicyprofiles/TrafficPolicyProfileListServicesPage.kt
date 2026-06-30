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

/** @see TrafficPolicyProfileService.listServices */
class TrafficPolicyProfileListServicesPage
private constructor(
    private val service: TrafficPolicyProfileService,
    private val params: TrafficPolicyProfileListServicesParams,
    private val response: TrafficPolicyProfileListServicesPageResponse,
) : Page<TrafficPolicyProfileListServicesResponse> {

    /**
     * Delegates to [TrafficPolicyProfileListServicesPageResponse], but gracefully handles missing
     * data.
     *
     * @see TrafficPolicyProfileListServicesPageResponse.data
     */
    fun data(): List<TrafficPolicyProfileListServicesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TrafficPolicyProfileListServicesPageResponse], but gracefully handles missing
     * data.
     *
     * @see TrafficPolicyProfileListServicesPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TrafficPolicyProfileListServicesResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TrafficPolicyProfileListServicesParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): TrafficPolicyProfileListServicesPage =
        service.listServices(nextPageParams())

    fun autoPager(): AutoPager<TrafficPolicyProfileListServicesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TrafficPolicyProfileListServicesParams = params

    /** The response that this page was parsed from. */
    fun response(): TrafficPolicyProfileListServicesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TrafficPolicyProfileListServicesPage].
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

    /** A builder for [TrafficPolicyProfileListServicesPage]. */
    class Builder internal constructor() {

        private var service: TrafficPolicyProfileService? = null
        private var params: TrafficPolicyProfileListServicesParams? = null
        private var response: TrafficPolicyProfileListServicesPageResponse? = null

        @JvmSynthetic
        internal fun from(
            trafficPolicyProfileListServicesPage: TrafficPolicyProfileListServicesPage
        ) = apply {
            service = trafficPolicyProfileListServicesPage.service
            params = trafficPolicyProfileListServicesPage.params
            response = trafficPolicyProfileListServicesPage.response
        }

        fun service(service: TrafficPolicyProfileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TrafficPolicyProfileListServicesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TrafficPolicyProfileListServicesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TrafficPolicyProfileListServicesPage].
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
        fun build(): TrafficPolicyProfileListServicesPage =
            TrafficPolicyProfileListServicesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrafficPolicyProfileListServicesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TrafficPolicyProfileListServicesPage{service=$service, params=$params, response=$response}"
}
