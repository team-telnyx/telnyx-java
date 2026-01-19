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

/** @see NetworkService.listInterfaces */
class NetworkListInterfacesPage
private constructor(
    private val service: NetworkService,
    private val params: NetworkListInterfacesParams,
    private val response: NetworkListInterfacesPageResponse,
) : Page<NetworkListInterfacesResponse> {

    /**
     * Delegates to [NetworkListInterfacesPageResponse], but gracefully handles missing data.
     *
     * @see NetworkListInterfacesPageResponse.data
     */
    fun data(): List<NetworkListInterfacesResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NetworkListInterfacesPageResponse], but gracefully handles missing data.
     *
     * @see NetworkListInterfacesPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<NetworkListInterfacesResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): NetworkListInterfacesParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): NetworkListInterfacesPage = service.listInterfaces(nextPageParams())

    fun autoPager(): AutoPager<NetworkListInterfacesResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NetworkListInterfacesParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkListInterfacesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkListInterfacesPage].
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

    /** A builder for [NetworkListInterfacesPage]. */
    class Builder internal constructor() {

        private var service: NetworkService? = null
        private var params: NetworkListInterfacesParams? = null
        private var response: NetworkListInterfacesPageResponse? = null

        @JvmSynthetic
        internal fun from(networkListInterfacesPage: NetworkListInterfacesPage) = apply {
            service = networkListInterfacesPage.service
            params = networkListInterfacesPage.params
            response = networkListInterfacesPage.response
        }

        fun service(service: NetworkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkListInterfacesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkListInterfacesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NetworkListInterfacesPage].
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
        fun build(): NetworkListInterfacesPage =
            NetworkListInterfacesPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NetworkListInterfacesPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "NetworkListInterfacesPage{service=$service, params=$params, response=$response}"
}
