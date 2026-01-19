// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.PortingOrderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PortingOrderService.retrieveRequirements */
class PortingOrderRetrieveRequirementsPage
private constructor(
    private val service: PortingOrderService,
    private val params: PortingOrderRetrieveRequirementsParams,
    private val response: PortingOrderRetrieveRequirementsPageResponse,
) : Page<PortingOrderRetrieveRequirementsResponse> {

    /**
     * Delegates to [PortingOrderRetrieveRequirementsPageResponse], but gracefully handles missing
     * data.
     *
     * @see PortingOrderRetrieveRequirementsPageResponse.data
     */
    fun data(): List<PortingOrderRetrieveRequirementsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PortingOrderRetrieveRequirementsPageResponse], but gracefully handles missing
     * data.
     *
     * @see PortingOrderRetrieveRequirementsPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PortingOrderRetrieveRequirementsResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PortingOrderRetrieveRequirementsParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): PortingOrderRetrieveRequirementsPage =
        service.retrieveRequirements(nextPageParams())

    fun autoPager(): AutoPager<PortingOrderRetrieveRequirementsResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PortingOrderRetrieveRequirementsParams = params

    /** The response that this page was parsed from. */
    fun response(): PortingOrderRetrieveRequirementsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PortingOrderRetrieveRequirementsPage].
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

    /** A builder for [PortingOrderRetrieveRequirementsPage]. */
    class Builder internal constructor() {

        private var service: PortingOrderService? = null
        private var params: PortingOrderRetrieveRequirementsParams? = null
        private var response: PortingOrderRetrieveRequirementsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            portingOrderRetrieveRequirementsPage: PortingOrderRetrieveRequirementsPage
        ) = apply {
            service = portingOrderRetrieveRequirementsPage.service
            params = portingOrderRetrieveRequirementsPage.params
            response = portingOrderRetrieveRequirementsPage.response
        }

        fun service(service: PortingOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PortingOrderRetrieveRequirementsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PortingOrderRetrieveRequirementsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PortingOrderRetrieveRequirementsPage].
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
        fun build(): PortingOrderRetrieveRequirementsPage =
            PortingOrderRetrieveRequirementsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortingOrderRetrieveRequirementsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PortingOrderRetrieveRequirementsPage{service=$service, params=$params, response=$response}"
}
