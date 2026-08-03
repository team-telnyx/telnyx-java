// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.telnyx.sdk.core.AutoPagerAsync
import com.telnyx.sdk.core.PageAsync
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.async.pricing.ProductServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ProductServiceAsync.list */
class ProductListPageAsync
private constructor(
    private val service: ProductServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ProductListParams,
    private val response: ProductListPageResponse,
) : PageAsync<ProductListResponse> {

    /**
     * Delegates to [ProductListPageResponse], but gracefully handles missing data.
     *
     * @see ProductListPageResponse.data
     */
    fun data(): List<ProductListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProductListPageResponse], but gracefully handles missing data.
     *
     * @see ProductListPageResponse.meta
     */
    fun meta(): Optional<PricingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ProductListResponse> = data()

    override fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        val pageNumber =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._pageNumber().getOptional("page_number") }
                .getOrDefault(1)
        val pageCount =
            response
                ._meta()
                .getOptional("meta")
                .flatMap { it._totalPages().getOptional("total_pages") }
                .getOrNull()
        return pageCount == null || pageNumber < pageCount
    }

    fun nextPageParams(): ProductListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ProductListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ProductListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ProductListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductListPageAsync].
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

    /** A builder for [ProductListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProductServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ProductListParams? = null
        private var response: ProductListPageResponse? = null

        @JvmSynthetic
        internal fun from(productListPageAsync: ProductListPageAsync) = apply {
            service = productListPageAsync.service
            streamHandlerExecutor = productListPageAsync.streamHandlerExecutor
            params = productListPageAsync.params
            response = productListPageAsync.response
        }

        fun service(service: ProductServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProductListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductListPageAsync].
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
        fun build(): ProductListPageAsync =
            ProductListPageAsync(
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

        return other is ProductListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ProductListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
