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

/** @see ProductServiceAsync.retrieve */
class ProductRetrievePageAsync
private constructor(
    private val service: ProductServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ProductRetrieveParams,
    private val response: ProductRetrievePageResponse,
) : PageAsync<ProductRetrieveResponse> {

    /**
     * Delegates to [ProductRetrievePageResponse], but gracefully handles missing data.
     *
     * @see ProductRetrievePageResponse.data
     */
    fun data(): List<ProductRetrieveResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ProductRetrievePageResponse], but gracefully handles missing data.
     *
     * @see ProductRetrievePageResponse.meta
     */
    fun meta(): Optional<PricingPaginationMeta> = response._meta().getOptional("meta")

    override fun items(): List<ProductRetrieveResponse> = data()

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

    fun nextPageParams(): ProductRetrieveParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ProductRetrievePageAsync> =
        service.retrieve(nextPageParams())

    fun autoPager(): AutoPagerAsync<ProductRetrieveResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ProductRetrieveParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductRetrievePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductRetrievePageAsync].
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

    /** A builder for [ProductRetrievePageAsync]. */
    class Builder internal constructor() {

        private var service: ProductServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ProductRetrieveParams? = null
        private var response: ProductRetrievePageResponse? = null

        @JvmSynthetic
        internal fun from(productRetrievePageAsync: ProductRetrievePageAsync) = apply {
            service = productRetrievePageAsync.service
            streamHandlerExecutor = productRetrievePageAsync.streamHandlerExecutor
            params = productRetrievePageAsync.params
            response = productRetrievePageAsync.response
        }

        fun service(service: ProductServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProductRetrieveParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductRetrievePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductRetrievePageAsync].
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
        fun build(): ProductRetrievePageAsync =
            ProductRetrievePageAsync(
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

        return other is ProductRetrievePageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ProductRetrievePageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
