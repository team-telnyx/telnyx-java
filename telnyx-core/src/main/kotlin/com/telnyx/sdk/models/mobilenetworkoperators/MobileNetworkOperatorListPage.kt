// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilenetworkoperators

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.MobileNetworkOperatorService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MobileNetworkOperatorService.list */
class MobileNetworkOperatorListPage
private constructor(
    private val service: MobileNetworkOperatorService,
    private val params: MobileNetworkOperatorListParams,
    private val response: MobileNetworkOperatorListPageResponse,
) : Page<MobileNetworkOperatorListResponse> {

    /**
     * Delegates to [MobileNetworkOperatorListPageResponse], but gracefully handles missing data.
     *
     * @see MobileNetworkOperatorListPageResponse.data
     */
    fun data(): List<MobileNetworkOperatorListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MobileNetworkOperatorListPageResponse], but gracefully handles missing data.
     *
     * @see MobileNetworkOperatorListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<MobileNetworkOperatorListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): MobileNetworkOperatorListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): MobileNetworkOperatorListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MobileNetworkOperatorListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): MobileNetworkOperatorListParams = params

    /** The response that this page was parsed from. */
    fun response(): MobileNetworkOperatorListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [MobileNetworkOperatorListPage].
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

    /** A builder for [MobileNetworkOperatorListPage]. */
    class Builder internal constructor() {

        private var service: MobileNetworkOperatorService? = null
        private var params: MobileNetworkOperatorListParams? = null
        private var response: MobileNetworkOperatorListPageResponse? = null

        @JvmSynthetic
        internal fun from(mobileNetworkOperatorListPage: MobileNetworkOperatorListPage) = apply {
            service = mobileNetworkOperatorListPage.service
            params = mobileNetworkOperatorListPage.params
            response = mobileNetworkOperatorListPage.response
        }

        fun service(service: MobileNetworkOperatorService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MobileNetworkOperatorListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MobileNetworkOperatorListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [MobileNetworkOperatorListPage].
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
        fun build(): MobileNetworkOperatorListPage =
            MobileNetworkOperatorListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MobileNetworkOperatorListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "MobileNetworkOperatorListPage{service=$service, params=$params, response=$response}"
}
