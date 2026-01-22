// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalips

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.GlobalIpService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see GlobalIpService.list */
class GlobalIpListPage
private constructor(
    private val service: GlobalIpService,
    private val params: GlobalIpListParams,
    private val response: GlobalIpListPageResponse,
) : Page<GlobalIpListResponse> {

    /**
     * Delegates to [GlobalIpListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpListPageResponse.data
     */
    fun data(): List<GlobalIpListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [GlobalIpListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<GlobalIpListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): GlobalIpListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): GlobalIpListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GlobalIpListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GlobalIpListParams = params

    /** The response that this page was parsed from. */
    fun response(): GlobalIpListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GlobalIpListPage].
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

    /** A builder for [GlobalIpListPage]. */
    class Builder internal constructor() {

        private var service: GlobalIpService? = null
        private var params: GlobalIpListParams? = null
        private var response: GlobalIpListPageResponse? = null

        @JvmSynthetic
        internal fun from(globalIpListPage: GlobalIpListPage) = apply {
            service = globalIpListPage.service
            params = globalIpListPage.params
            response = globalIpListPage.response
        }

        fun service(service: GlobalIpService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GlobalIpListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GlobalIpListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [GlobalIpListPage].
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
        fun build(): GlobalIpListPage =
            GlobalIpListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalIpListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "GlobalIpListPage{service=$service, params=$params, response=$response}"
}
