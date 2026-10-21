// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tailscalesubnetrouters

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.TailscaleSubnetRouterService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see TailscaleSubnetRouterService.list */
class TailscaleSubnetRouterListPage
private constructor(
    private val service: TailscaleSubnetRouterService,
    private val params: TailscaleSubnetRouterListParams,
    private val response: TailscaleSubnetRouterListPageResponse,
) : Page<TailscaleSubnetRouter> {

    /**
     * Delegates to [TailscaleSubnetRouterListPageResponse], but gracefully handles missing data.
     *
     * @see TailscaleSubnetRouterListPageResponse.data
     */
    fun data(): List<TailscaleSubnetRouter> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TailscaleSubnetRouterListPageResponse], but gracefully handles missing data.
     *
     * @see TailscaleSubnetRouterListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<TailscaleSubnetRouter> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): TailscaleSubnetRouterListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): TailscaleSubnetRouterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TailscaleSubnetRouter> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TailscaleSubnetRouterListParams = params

    /** The response that this page was parsed from. */
    fun response(): TailscaleSubnetRouterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TailscaleSubnetRouterListPage].
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

    /** A builder for [TailscaleSubnetRouterListPage]. */
    class Builder internal constructor() {

        private var service: TailscaleSubnetRouterService? = null
        private var params: TailscaleSubnetRouterListParams? = null
        private var response: TailscaleSubnetRouterListPageResponse? = null

        @JvmSynthetic
        internal fun from(tailscaleSubnetRouterListPage: TailscaleSubnetRouterListPage) = apply {
            service = tailscaleSubnetRouterListPage.service
            params = tailscaleSubnetRouterListPage.params
            response = tailscaleSubnetRouterListPage.response
        }

        fun service(service: TailscaleSubnetRouterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TailscaleSubnetRouterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TailscaleSubnetRouterListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TailscaleSubnetRouterListPage].
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
        fun build(): TailscaleSubnetRouterListPage =
            TailscaleSubnetRouterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TailscaleSubnetRouterListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TailscaleSubnetRouterListPage{service=$service, params=$params, response=$response}"
}
