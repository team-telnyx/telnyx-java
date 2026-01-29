// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.customerservicerecords

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.services.async.CustomerServiceRecordServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see CustomerServiceRecordServiceAsync.list */
class CustomerServiceRecordListPageAsync
private constructor(
    private val service: CustomerServiceRecordServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CustomerServiceRecordListParams,
    private val response: CustomerServiceRecordListPageResponse,
) : PageAsync<CustomerServiceRecord> {

    /**
     * Delegates to [CustomerServiceRecordListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerServiceRecordListPageResponse.data
     */
    fun data(): List<CustomerServiceRecord> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CustomerServiceRecordListPageResponse], but gracefully handles missing data.
     *
     * @see CustomerServiceRecordListPageResponse.meta
     */
    fun meta(): Optional<PaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<CustomerServiceRecord> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): CustomerServiceRecordListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<CustomerServiceRecordListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerServiceRecord> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CustomerServiceRecordListParams = params

    /** The response that this page was parsed from. */
    fun response(): CustomerServiceRecordListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerServiceRecordListPageAsync].
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

    /** A builder for [CustomerServiceRecordListPageAsync]. */
    class Builder internal constructor() {

        private var service: CustomerServiceRecordServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CustomerServiceRecordListParams? = null
        private var response: CustomerServiceRecordListPageResponse? = null

        @JvmSynthetic
        internal fun from(customerServiceRecordListPageAsync: CustomerServiceRecordListPageAsync) =
            apply {
                service = customerServiceRecordListPageAsync.service
                streamHandlerExecutor = customerServiceRecordListPageAsync.streamHandlerExecutor
                params = customerServiceRecordListPageAsync.params
                response = customerServiceRecordListPageAsync.response
            }

        fun service(service: CustomerServiceRecordServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CustomerServiceRecordListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CustomerServiceRecordListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CustomerServiceRecordListPageAsync].
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
        fun build(): CustomerServiceRecordListPageAsync =
            CustomerServiceRecordListPageAsync(
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

        return other is CustomerServiceRecordListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CustomerServiceRecordListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
