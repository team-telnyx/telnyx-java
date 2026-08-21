// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.pricing.products

import com.telnyx.sdk.core.AutoPager
import com.telnyx.sdk.core.Page
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.services.blocking.pricing.ProductService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ProductService.retrieve */
class ProductRetrievePage
private constructor(
    private val service: ProductService,
    private val params: ProductRetrieveParams,
    private val response: ProductRetrievePageResponse,
) : Page<ProductRetrieveResponse> {

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

    override fun nextPage(): ProductRetrievePage = service.retrieve(nextPageParams())

    fun autoPager(): AutoPager<ProductRetrieveResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProductRetrieveParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductRetrievePageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductRetrievePage].
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

    /** A builder for [ProductRetrievePage]. */
    class Builder internal constructor() {

        private var service: ProductService? = null
        private var params: ProductRetrieveParams? = null
        private var response: ProductRetrievePageResponse? = null

        @JvmSynthetic
        internal fun from(productRetrievePage: ProductRetrievePage) = apply {
            service = productRetrievePage.service
            params = productRetrievePage.params
            response = productRetrievePage.response
        }

        fun service(service: ProductService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProductRetrieveParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductRetrievePageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductRetrievePage].
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
        fun build(): ProductRetrievePage =
            ProductRetrievePage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductRetrievePage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ProductRetrievePage{service=$service, params=$params, response=$response}"
}
