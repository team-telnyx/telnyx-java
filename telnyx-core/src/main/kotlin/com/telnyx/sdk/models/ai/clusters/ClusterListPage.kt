// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.clusters

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.services.blocking.ai.ClusterService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ClusterService.list */
class ClusterListPage
private constructor(
    private val service: ClusterService,
    private val params: ClusterListParams,
    private val response: ClusterListPageResponse,
) : Page<ClusterListResponse> {

    /**
     * Delegates to [ClusterListPageResponse], but gracefully handles missing data.
     *
     * @see ClusterListPageResponse.data
     */
    fun data(): List<ClusterListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ClusterListPageResponse], but gracefully handles missing data.
     *
     * @see ClusterListPageResponse.meta
     */
    fun meta(): Optional<Meta> = response._meta().getOptional("meta")

    override fun items(): List<ClusterListResponse> = data()

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

    fun nextPageParams(): ClusterListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): ClusterListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ClusterListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ClusterListParams = params

    /** The response that this page was parsed from. */
    fun response(): ClusterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClusterListPage].
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

    /** A builder for [ClusterListPage]. */
    class Builder internal constructor() {

        private var service: ClusterService? = null
        private var params: ClusterListParams? = null
        private var response: ClusterListPageResponse? = null

        @JvmSynthetic
        internal fun from(clusterListPage: ClusterListPage) = apply {
            service = clusterListPage.service
            params = clusterListPage.params
            response = clusterListPage.response
        }

        fun service(service: ClusterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ClusterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ClusterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ClusterListPage].
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
        fun build(): ClusterListPage =
            ClusterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClusterListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ClusterListPage{service=$service, params=$params, response=$response}"
}
