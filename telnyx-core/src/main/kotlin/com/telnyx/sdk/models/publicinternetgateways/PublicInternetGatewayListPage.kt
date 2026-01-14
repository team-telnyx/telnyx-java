// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.PublicInternetGatewayService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see PublicInternetGatewayService.list */
class PublicInternetGatewayListPage
private constructor(
    private val service: PublicInternetGatewayService,
    private val params: PublicInternetGatewayListParams,
    private val response: PublicInternetGatewayListPageResponse,
) : Page<PublicInternetGatewayListResponse> {

    /**
     * Delegates to [PublicInternetGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see PublicInternetGatewayListPageResponse.data
     */
    fun data(): List<PublicInternetGatewayListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PublicInternetGatewayListPageResponse], but gracefully handles missing data.
     *
     * @see PublicInternetGatewayListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<PublicInternetGatewayListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): PublicInternetGatewayListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): PublicInternetGatewayListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PublicInternetGatewayListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PublicInternetGatewayListParams = params

    /** The response that this page was parsed from. */
    fun response(): PublicInternetGatewayListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PublicInternetGatewayListPage].
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

    /** A builder for [PublicInternetGatewayListPage]. */
    class Builder internal constructor() {

        private var service: PublicInternetGatewayService? = null
        private var params: PublicInternetGatewayListParams? = null
        private var response: PublicInternetGatewayListPageResponse? = null

        @JvmSynthetic
        internal fun from(publicInternetGatewayListPage: PublicInternetGatewayListPage) = apply {
            service = publicInternetGatewayListPage.service
            params = publicInternetGatewayListPage.params
            response = publicInternetGatewayListPage.response
        }

        fun service(service: PublicInternetGatewayService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PublicInternetGatewayListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PublicInternetGatewayListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PublicInternetGatewayListPage].
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
        fun build(): PublicInternetGatewayListPage =
            PublicInternetGatewayListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicInternetGatewayListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PublicInternetGatewayListPage{service=$service, params=$params, response=$response}"
}
