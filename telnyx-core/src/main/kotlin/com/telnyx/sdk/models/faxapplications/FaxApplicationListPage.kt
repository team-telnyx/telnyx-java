// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxapplications

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.blocking.FaxApplicationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FaxApplicationService.list */
class FaxApplicationListPage
private constructor(
    private val service: FaxApplicationService,
    private val params: FaxApplicationListParams,
    private val response: FaxApplicationListPageResponse,
) : Page<FaxApplication> {

    /**
     * Delegates to [FaxApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see FaxApplicationListPageResponse.data
     */
    fun data(): List<FaxApplication> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FaxApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see FaxApplicationListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<FaxApplication> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): FaxApplicationListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): FaxApplicationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FaxApplication> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FaxApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): FaxApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FaxApplicationListPage].
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

    /** A builder for [FaxApplicationListPage]. */
    class Builder internal constructor() {

        private var service: FaxApplicationService? = null
        private var params: FaxApplicationListParams? = null
        private var response: FaxApplicationListPageResponse? = null

        @JvmSynthetic
        internal fun from(faxApplicationListPage: FaxApplicationListPage) = apply {
            service = faxApplicationListPage.service
            params = faxApplicationListPage.params
            response = faxApplicationListPage.response
        }

        fun service(service: FaxApplicationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FaxApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FaxApplicationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FaxApplicationListPage].
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
        fun build(): FaxApplicationListPage =
            FaxApplicationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FaxApplicationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FaxApplicationListPage{service=$service, params=$params, response=$response}"
}
