// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.otaupdates

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.OtaUpdateService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see OtaUpdateService.list */
class OtaUpdateListPage
private constructor(
    private val service: OtaUpdateService,
    private val params: OtaUpdateListParams,
    private val response: OtaUpdateListPageResponse,
) : Page<OtaUpdateListResponse> {

    /**
     * Delegates to [OtaUpdateListPageResponse], but gracefully handles missing data.
     *
     * @see OtaUpdateListPageResponse.data
     */
    fun data(): List<OtaUpdateListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [OtaUpdateListPageResponse], but gracefully handles missing data.
     *
     * @see OtaUpdateListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<OtaUpdateListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): OtaUpdateListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): OtaUpdateListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OtaUpdateListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OtaUpdateListParams = params

    /** The response that this page was parsed from. */
    fun response(): OtaUpdateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OtaUpdateListPage].
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

    /** A builder for [OtaUpdateListPage]. */
    class Builder internal constructor() {

        private var service: OtaUpdateService? = null
        private var params: OtaUpdateListParams? = null
        private var response: OtaUpdateListPageResponse? = null

        @JvmSynthetic
        internal fun from(otaUpdateListPage: OtaUpdateListPage) = apply {
            service = otaUpdateListPage.service
            params = otaUpdateListPage.params
            response = otaUpdateListPage.response
        }

        fun service(service: OtaUpdateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OtaUpdateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OtaUpdateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OtaUpdateListPage].
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
        fun build(): OtaUpdateListPage =
            OtaUpdateListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OtaUpdateListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "OtaUpdateListPage{service=$service, params=$params, response=$response}"
}
