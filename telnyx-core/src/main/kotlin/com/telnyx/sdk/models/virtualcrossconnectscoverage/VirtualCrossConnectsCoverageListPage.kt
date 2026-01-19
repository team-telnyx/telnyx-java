// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnectscoverage

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.VirtualCrossConnectsCoverageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VirtualCrossConnectsCoverageService.list */
class VirtualCrossConnectsCoverageListPage
private constructor(
    private val service: VirtualCrossConnectsCoverageService,
    private val params: VirtualCrossConnectsCoverageListParams,
    private val response: VirtualCrossConnectsCoverageListPageResponse,
) : Page<VirtualCrossConnectsCoverageListResponse> {

    /**
     * Delegates to [VirtualCrossConnectsCoverageListPageResponse], but gracefully handles missing
     * data.
     *
     * @see VirtualCrossConnectsCoverageListPageResponse.data
     */
    fun data(): List<VirtualCrossConnectsCoverageListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VirtualCrossConnectsCoverageListPageResponse], but gracefully handles missing
     * data.
     *
     * @see VirtualCrossConnectsCoverageListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<VirtualCrossConnectsCoverageListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VirtualCrossConnectsCoverageListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): VirtualCrossConnectsCoverageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VirtualCrossConnectsCoverageListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VirtualCrossConnectsCoverageListParams = params

    /** The response that this page was parsed from. */
    fun response(): VirtualCrossConnectsCoverageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [VirtualCrossConnectsCoverageListPage].
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

    /** A builder for [VirtualCrossConnectsCoverageListPage]. */
    class Builder internal constructor() {

        private var service: VirtualCrossConnectsCoverageService? = null
        private var params: VirtualCrossConnectsCoverageListParams? = null
        private var response: VirtualCrossConnectsCoverageListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            virtualCrossConnectsCoverageListPage: VirtualCrossConnectsCoverageListPage
        ) = apply {
            service = virtualCrossConnectsCoverageListPage.service
            params = virtualCrossConnectsCoverageListPage.params
            response = virtualCrossConnectsCoverageListPage.response
        }

        fun service(service: VirtualCrossConnectsCoverageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VirtualCrossConnectsCoverageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VirtualCrossConnectsCoverageListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [VirtualCrossConnectsCoverageListPage].
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
        fun build(): VirtualCrossConnectsCoverageListPage =
            VirtualCrossConnectsCoverageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectsCoverageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VirtualCrossConnectsCoverageListPage{service=$service, params=$params, response=$response}"
}
