// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.VirtualCrossConnectService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see VirtualCrossConnectService.list */
class VirtualCrossConnectListPage
private constructor(
    private val service: VirtualCrossConnectService,
    private val params: VirtualCrossConnectListParams,
    private val response: VirtualCrossConnectListPageResponse,
) : Page<VirtualCrossConnectListResponse> {

    /**
     * Delegates to [VirtualCrossConnectListPageResponse], but gracefully handles missing data.
     *
     * @see VirtualCrossConnectListPageResponse.data
     */
    fun data(): List<VirtualCrossConnectListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [VirtualCrossConnectListPageResponse], but gracefully handles missing data.
     *
     * @see VirtualCrossConnectListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<VirtualCrossConnectListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): VirtualCrossConnectListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): VirtualCrossConnectListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<VirtualCrossConnectListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): VirtualCrossConnectListParams = params

    /** The response that this page was parsed from. */
    fun response(): VirtualCrossConnectListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VirtualCrossConnectListPage].
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

    /** A builder for [VirtualCrossConnectListPage]. */
    class Builder internal constructor() {

        private var service: VirtualCrossConnectService? = null
        private var params: VirtualCrossConnectListParams? = null
        private var response: VirtualCrossConnectListPageResponse? = null

        @JvmSynthetic
        internal fun from(virtualCrossConnectListPage: VirtualCrossConnectListPage) = apply {
            service = virtualCrossConnectListPage.service
            params = virtualCrossConnectListPage.params
            response = virtualCrossConnectListPage.response
        }

        fun service(service: VirtualCrossConnectService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: VirtualCrossConnectListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: VirtualCrossConnectListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [VirtualCrossConnectListPage].
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
        fun build(): VirtualCrossConnectListPage =
            VirtualCrossConnectListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VirtualCrossConnectListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "VirtualCrossConnectListPage{service=$service, params=$params, response=$response}"
}
