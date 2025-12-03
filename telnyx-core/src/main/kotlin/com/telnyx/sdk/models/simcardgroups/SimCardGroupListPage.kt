// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.SimCardGroupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SimCardGroupService.list */
class SimCardGroupListPage
private constructor(
    private val service: SimCardGroupService,
    private val params: SimCardGroupListParams,
    private val response: SimCardGroupListPageResponse,
) : Page<SimCardGroupListResponse> {

    /**
     * Delegates to [SimCardGroupListPageResponse], but gracefully handles missing data.
     *
     * @see SimCardGroupListPageResponse.data
     */
    fun data(): List<SimCardGroupListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [SimCardGroupListPageResponse], but gracefully handles missing data.
     *
     * @see SimCardGroupListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<SimCardGroupListResponse> = data()

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

    fun nextPageParams(): SimCardGroupListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): SimCardGroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<SimCardGroupListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SimCardGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): SimCardGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SimCardGroupListPage].
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

    /** A builder for [SimCardGroupListPage]. */
    class Builder internal constructor() {

        private var service: SimCardGroupService? = null
        private var params: SimCardGroupListParams? = null
        private var response: SimCardGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(simCardGroupListPage: SimCardGroupListPage) = apply {
            service = simCardGroupListPage.service
            params = simCardGroupListPage.params
            response = simCardGroupListPage.response
        }

        fun service(service: SimCardGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SimCardGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SimCardGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SimCardGroupListPage].
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
        fun build(): SimCardGroupListPage =
            SimCardGroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimCardGroupListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SimCardGroupListPage{service=$service, params=$params, response=$response}"
}
