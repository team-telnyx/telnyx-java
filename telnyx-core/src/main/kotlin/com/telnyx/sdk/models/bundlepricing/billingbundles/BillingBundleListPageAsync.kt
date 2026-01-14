// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.billingbundles

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.bundlepricing.BillingBundleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BillingBundleServiceAsync.list */
class BillingBundleListPageAsync
private constructor(
    private val service: BillingBundleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BillingBundleListParams,
    private val response: BillingBundleListPageResponse,
) : PageAsync<BillingBundleSummary> {

    /**
     * Delegates to [BillingBundleListPageResponse], but gracefully handles missing data.
     *
     * @see BillingBundleListPageResponse.data
     */
    fun data(): List<BillingBundleSummary> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillingBundleListPageResponse], but gracefully handles missing data.
     *
     * @see BillingBundleListPageResponse.meta
     */
    fun meta(): Optional<PaginationResponse> = response._meta().getOptional("meta")

    override fun items(): List<BillingBundleSummary> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            meta().flatMap { it._pageNumber().getOptional("page_number") }.getOrDefault(1)
        val pageCount = meta().flatMap { it._totalPages().getOptional("total_pages") }.getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): BillingBundleListParams {
        val pageNumber = params.page().flatMap { it.number() }.getOrDefault(1)
        return params.toBuilder().number(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<BillingBundleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillingBundleSummary> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BillingBundleListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillingBundleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillingBundleListPageAsync].
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

    /** A builder for [BillingBundleListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillingBundleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BillingBundleListParams? = null
        private var response: BillingBundleListPageResponse? = null

        @JvmSynthetic
        internal fun from(billingBundleListPageAsync: BillingBundleListPageAsync) = apply {
            service = billingBundleListPageAsync.service
            streamHandlerExecutor = billingBundleListPageAsync.streamHandlerExecutor
            params = billingBundleListPageAsync.params
            response = billingBundleListPageAsync.response
        }

        fun service(service: BillingBundleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BillingBundleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillingBundleListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillingBundleListPageAsync].
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
        fun build(): BillingBundleListPageAsync =
            BillingBundleListPageAsync(
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

        return other is BillingBundleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BillingBundleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
