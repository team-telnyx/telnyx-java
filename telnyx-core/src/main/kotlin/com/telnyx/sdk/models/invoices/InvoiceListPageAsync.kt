// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.invoices

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.InvoiceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see InvoiceServiceAsync.list */
class InvoiceListPageAsync
private constructor(
    private val service: InvoiceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: InvoiceListParams,
    private val response: InvoiceListPageResponse,
) : PageAsync<InvoiceListResponse> {

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

    override fun nextPage(): CompletableFuture<InvoiceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InvoiceListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): InvoiceListParams = params

    /** The response that this page was parsed from. */
    fun response(): InvoiceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceListPageAsync]. */
    class Builder internal constructor() {

        private var service: InvoiceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: InvoiceListParams? = null
        private var response: InvoiceListPageResponse? = null

        @JvmSynthetic
        internal fun from(invoiceListPageAsync: InvoiceListPageAsync) = apply {
            service = invoiceListPageAsync.service
            streamHandlerExecutor = invoiceListPageAsync.streamHandlerExecutor
            params = invoiceListPageAsync.params
            response = invoiceListPageAsync.response
        }

        fun service(service: InvoiceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: InvoiceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InvoiceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InvoiceListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceListPageAsync =
            InvoiceListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "InvoiceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
