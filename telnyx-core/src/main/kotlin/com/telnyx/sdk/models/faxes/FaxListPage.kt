// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.Metadata
import com.telnyx.sdk.services.blocking.FaxService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see FaxService.list */
class FaxListPage
private constructor(
    private val service: FaxService,
    private val params: FaxListParams,
    private val response: FaxListPageResponse,
) : Page<Fax> {

    /**
     * Delegates to [FaxListPageResponse], but gracefully handles missing data.
     *
     * @see FaxListPageResponse.data
     */
    fun data(): List<Fax> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FaxListPageResponse], but gracefully handles missing data.
     *
     * @see FaxListPageResponse.meta
     */
    fun meta(): Optional<Metadata> = response._meta().getOptional("meta")

    override fun items(): List<Fax> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): FaxListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): FaxListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Fax> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FaxListParams = params

    /** The response that this page was parsed from. */
    fun response(): FaxListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FaxListPage].
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

    /** A builder for [FaxListPage]. */
    class Builder internal constructor() {

        private var service: FaxService? = null
        private var params: FaxListParams? = null
        private var response: FaxListPageResponse? = null

        @JvmSynthetic
        internal fun from(faxListPage: FaxListPage) = apply {
            service = faxListPage.service
            params = faxListPage.params
            response = faxListPage.response
        }

        fun service(service: FaxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FaxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FaxListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FaxListPage].
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
        fun build(): FaxListPage =
            FaxListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FaxListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "FaxListPage{service=$service, params=$params, response=$response}"
}
