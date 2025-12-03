// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.invoices

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.InvoiceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InvoiceService.list */
class InvoiceListPage
private constructor(
    private val service: InvoiceService,
    private val params: InvoiceListParams,
    private val response: InvoiceListPageResponse,
) : Page<InvoiceListResponse> {

    /**
     * Delegates to [InvoiceListPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListPageResponse.data
     */
    fun data(): List<InvoiceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [InvoiceListPageResponse], but gracefully handles missing data.
     *
     * @see InvoiceListPageResponse.meta
     */
    fun meta(): Optional<InvoiceListPageResponse.Meta> = response._meta().getOptional("meta")

    override fun items(): List<InvoiceListResponse> = data()

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

    fun nextPageParams(): InvoiceListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): InvoiceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InvoiceListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListPage].
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

    /** A builder for [InvoiceListPage]. */
    class Builder internal constructor() {

        private var service: InvoiceService? = null
        private var params: InvoiceListParams? = null
        private var response: InvoiceListPageResponse? = null

        @JvmSynthetic
        internal fun from(invoiceListPage: InvoiceListPage) = apply {
            service = invoiceListPage.service
            params = invoiceListPage.params
            response = invoiceListPage.response
        }

        fun service(service: InvoiceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InvoiceListPage].
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
        fun build(): InvoiceListPage =
            InvoiceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InvoiceListPage{service=$service, params=$params, response=$response}"
}
