// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globaliphealthchecks

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.GlobalIpHealthCheckService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see GlobalIpHealthCheckService.list */
class GlobalIpHealthCheckListPage
private constructor(
    private val service: GlobalIpHealthCheckService,
    private val params: GlobalIpHealthCheckListParams,
    private val response: GlobalIpHealthCheckListPageResponse,
) : Page<GlobalIpHealthCheckListResponse> {

    /**
     * Delegates to [GlobalIpHealthCheckListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpHealthCheckListPageResponse.data
     */
    fun data(): List<GlobalIpHealthCheckListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [GlobalIpHealthCheckListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpHealthCheckListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<GlobalIpHealthCheckListResponse> = data()

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

    fun nextPageParams(): GlobalIpHealthCheckListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): GlobalIpHealthCheckListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GlobalIpHealthCheckListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GlobalIpHealthCheckListParams = params

    /** The response that this page was parsed from. */
    fun response(): GlobalIpHealthCheckListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GlobalIpHealthCheckListPage].
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

    /** A builder for [GlobalIpHealthCheckListPage]. */
    class Builder internal constructor() {

        private var service: GlobalIpHealthCheckService? = null
        private var params: GlobalIpHealthCheckListParams? = null
        private var response: GlobalIpHealthCheckListPageResponse? = null

        @JvmSynthetic
        internal fun from(globalIpHealthCheckListPage: GlobalIpHealthCheckListPage) = apply {
            service = globalIpHealthCheckListPage.service
            params = globalIpHealthCheckListPage.params
            response = globalIpHealthCheckListPage.response
        }

        fun service(service: GlobalIpHealthCheckService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GlobalIpHealthCheckListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GlobalIpHealthCheckListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [GlobalIpHealthCheckListPage].
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
        fun build(): GlobalIpHealthCheckListPage =
            GlobalIpHealthCheckListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalIpHealthCheckListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "GlobalIpHealthCheckListPage{service=$service, params=$params, response=$response}"
}
