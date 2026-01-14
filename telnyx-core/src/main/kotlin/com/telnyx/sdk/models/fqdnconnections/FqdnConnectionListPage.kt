// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.fqdnconnections

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ConnectionsPaginationMeta
import com.telnyx.sdk.services.blocking.FqdnConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FqdnConnectionService.list */
class FqdnConnectionListPage
private constructor(
    private val service: FqdnConnectionService,
    private val params: FqdnConnectionListParams,
    private val response: FqdnConnectionListPageResponse,
) : Page<FqdnConnection> {

    /**
     * Delegates to [FqdnConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see FqdnConnectionListPageResponse.data
     */
    fun data(): List<FqdnConnection> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FqdnConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see FqdnConnectionListPageResponse.meta
     */
    fun meta(): Optional<ConnectionsPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<FqdnConnection> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): FqdnConnectionListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): FqdnConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FqdnConnection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FqdnConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): FqdnConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FqdnConnectionListPage].
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

    /** A builder for [FqdnConnectionListPage]. */
    class Builder internal constructor() {

        private var service: FqdnConnectionService? = null
        private var params: FqdnConnectionListParams? = null
        private var response: FqdnConnectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(fqdnConnectionListPage: FqdnConnectionListPage) = apply {
            service = fqdnConnectionListPage.service
            params = fqdnConnectionListPage.params
            response = fqdnConnectionListPage.response
        }

        fun service(service: FqdnConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FqdnConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FqdnConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FqdnConnectionListPage].
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
        fun build(): FqdnConnectionListPage =
            FqdnConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FqdnConnectionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FqdnConnectionListPage{service=$service, params=$params, response=$response}"
}
