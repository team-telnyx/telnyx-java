// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkcoverage

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NetworkCoverageService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NetworkCoverageService.list */
class NetworkCoverageListPage
private constructor(
    private val service: NetworkCoverageService,
    private val params: NetworkCoverageListParams,
    private val response: NetworkCoverageListPageResponse,
) : Page<NetworkCoverageListResponse> {

    /**
     * Delegates to [NetworkCoverageListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkCoverageListPageResponse.data
     */
    fun data(): List<NetworkCoverageListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NetworkCoverageListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkCoverageListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NetworkCoverageListResponse> = data()

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

    fun nextPageParams(): NetworkCoverageListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): NetworkCoverageListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NetworkCoverageListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NetworkCoverageListParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkCoverageListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkCoverageListPage].
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

    /** A builder for [NetworkCoverageListPage]. */
    class Builder internal constructor() {

        private var service: NetworkCoverageService? = null
        private var params: NetworkCoverageListParams? = null
        private var response: NetworkCoverageListPageResponse? = null

        @JvmSynthetic
        internal fun from(networkCoverageListPage: NetworkCoverageListPage) = apply {
            service = networkCoverageListPage.service
            params = networkCoverageListPage.params
            response = networkCoverageListPage.response
        }

        fun service(service: NetworkCoverageService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkCoverageListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkCoverageListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NetworkCoverageListPage].
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
        fun build(): NetworkCoverageListPage =
            NetworkCoverageListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NetworkCoverageListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NetworkCoverageListPage{service=$service, params=$params, response=$response}"
}
