// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.globalipassignments

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.GlobalIpAssignmentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see GlobalIpAssignmentService.list */
class GlobalIpAssignmentListPage
private constructor(
    private val service: GlobalIpAssignmentService,
    private val params: GlobalIpAssignmentListParams,
    private val response: GlobalIpAssignmentListPageResponse,
) : Page<GlobalIpAssignment> {

    /**
     * Delegates to [GlobalIpAssignmentListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpAssignmentListPageResponse.data
     */
    fun data(): List<GlobalIpAssignment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [GlobalIpAssignmentListPageResponse], but gracefully handles missing data.
     *
     * @see GlobalIpAssignmentListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<GlobalIpAssignment> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): GlobalIpAssignmentListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): GlobalIpAssignmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<GlobalIpAssignment> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): GlobalIpAssignmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): GlobalIpAssignmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GlobalIpAssignmentListPage].
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

    /** A builder for [GlobalIpAssignmentListPage]. */
    class Builder internal constructor() {

        private var service: GlobalIpAssignmentService? = null
        private var params: GlobalIpAssignmentListParams? = null
        private var response: GlobalIpAssignmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(globalIpAssignmentListPage: GlobalIpAssignmentListPage) = apply {
            service = globalIpAssignmentListPage.service
            params = globalIpAssignmentListPage.params
            response = globalIpAssignmentListPage.response
        }

        fun service(service: GlobalIpAssignmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: GlobalIpAssignmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GlobalIpAssignmentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [GlobalIpAssignmentListPage].
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
        fun build(): GlobalIpAssignmentListPage =
            GlobalIpAssignmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GlobalIpAssignmentListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "GlobalIpAssignmentListPage{service=$service, params=$params, response=$response}"
}
