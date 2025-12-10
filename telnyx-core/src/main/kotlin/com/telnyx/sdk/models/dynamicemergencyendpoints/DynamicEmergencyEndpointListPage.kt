// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyendpoints

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.Metadata
import com.telnyx.sdk.services.blocking.DynamicEmergencyEndpointService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DynamicEmergencyEndpointService.list */
class DynamicEmergencyEndpointListPage
private constructor(
    private val service: DynamicEmergencyEndpointService,
    private val params: DynamicEmergencyEndpointListParams,
    private val response: DynamicEmergencyEndpointListPageResponse,
) : Page<DynamicEmergencyEndpoint> {

    /**
     * Delegates to [DynamicEmergencyEndpointListPageResponse], but gracefully handles missing data.
     *
     * @see DynamicEmergencyEndpointListPageResponse.data
     */
    fun data(): List<DynamicEmergencyEndpoint> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DynamicEmergencyEndpointListPageResponse], but gracefully handles missing data.
     *
     * @see DynamicEmergencyEndpointListPageResponse.meta
     */
    fun meta(): Optional<Metadata> = response._meta().getOptional("meta")

    override fun items(): List<DynamicEmergencyEndpoint> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount =
            meta()
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrDefault(Long.MAX_VALUE)
        return pageNumber < pageCount
    }

    fun nextPageParams(): DynamicEmergencyEndpointListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): DynamicEmergencyEndpointListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DynamicEmergencyEndpoint> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DynamicEmergencyEndpointListParams = params

    /** The response that this page was parsed from. */
    fun response(): DynamicEmergencyEndpointListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DynamicEmergencyEndpointListPage].
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

    /** A builder for [DynamicEmergencyEndpointListPage]. */
    class Builder internal constructor() {

        private var service: DynamicEmergencyEndpointService? = null
        private var params: DynamicEmergencyEndpointListParams? = null
        private var response: DynamicEmergencyEndpointListPageResponse? = null

        @JvmSynthetic
        internal fun from(dynamicEmergencyEndpointListPage: DynamicEmergencyEndpointListPage) =
            apply {
                service = dynamicEmergencyEndpointListPage.service
                params = dynamicEmergencyEndpointListPage.params
                response = dynamicEmergencyEndpointListPage.response
            }

        fun service(service: DynamicEmergencyEndpointService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DynamicEmergencyEndpointListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DynamicEmergencyEndpointListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DynamicEmergencyEndpointListPage].
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
        fun build(): DynamicEmergencyEndpointListPage =
            DynamicEmergencyEndpointListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DynamicEmergencyEndpointListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DynamicEmergencyEndpointListPage{service=$service, params=$params, response=$response}"
}
