// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.PrivateWirelessGatewayService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PrivateWirelessGatewayService.list */
class PrivateWirelessGatewayListPage
private constructor(
    private val service: PrivateWirelessGatewayService,
    private val params: PrivateWirelessGatewayListParams,
    private val response: PrivateWirelessGatewayListPageResponse,
) : Page<PrivateWirelessGateway> {

    /**
     * Delegates to [PrivateWirelessGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see PrivateWirelessGatewayListPageResponse.data
     */
    fun data(): List<PrivateWirelessGateway> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PrivateWirelessGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see PrivateWirelessGatewayListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PrivateWirelessGateway> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PrivateWirelessGatewayListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): PrivateWirelessGatewayListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PrivateWirelessGateway> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PrivateWirelessGatewayListParams = params

    /** The response that this page was parsed from. */
    fun response(): PrivateWirelessGatewayListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PrivateWirelessGatewayListPage].
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

    /** A builder for [PrivateWirelessGatewayListPage]. */
    class Builder internal constructor() {

        private var service: PrivateWirelessGatewayService? = null
        private var params: PrivateWirelessGatewayListParams? = null
        private var response: PrivateWirelessGatewayListPageResponse? = null

        @JvmSynthetic
        internal fun from(privateWirelessGatewayListPage: PrivateWirelessGatewayListPage) = apply {
            service = privateWirelessGatewayListPage.service
            params = privateWirelessGatewayListPage.params
            response = privateWirelessGatewayListPage.response
        }

        fun service(service: PrivateWirelessGatewayService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PrivateWirelessGatewayListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PrivateWirelessGatewayListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PrivateWirelessGatewayListPage].
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
        fun build(): PrivateWirelessGatewayListPage =
            PrivateWirelessGatewayListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrivateWirelessGatewayListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PrivateWirelessGatewayListPage{service=$service, params=$params, response=$response}"
}
