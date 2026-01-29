// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.NetworkService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see NetworkService.list */
class NetworkListPage
private constructor(
    private val service: NetworkService,
    private val params: NetworkListParams,
    private val response: NetworkListPageResponse,
) : Page<NetworkListResponse> {

    /**
     * Delegates to [NetworkListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkListPageResponse.data
     */
    fun data(): List<NetworkListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NetworkListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NetworkListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NetworkListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): NetworkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NetworkListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NetworkListParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkListPage].
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

    /** A builder for [NetworkListPage]. */
    class Builder internal constructor() {

        private var service: NetworkService? = null
        private var params: NetworkListParams? = null
        private var response: NetworkListPageResponse? = null

        @JvmSynthetic
        internal fun from(networkListPage: NetworkListPage) = apply {
            service = networkListPage.service
            params = networkListPage.params
            response = networkListPage.response
        }

        fun service(service: NetworkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NetworkListPage].
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
        fun build(): NetworkListPage =
            NetworkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NetworkListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NetworkListPage{service=$service, params=$params, response=$response}"
}
