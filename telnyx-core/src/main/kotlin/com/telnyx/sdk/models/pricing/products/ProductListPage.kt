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

/** @see ProductService.list */
class ProductListPage
private constructor(
    private val service: ProductService,
    private val params: ProductListParams,
    private val response: ProductListPageResponse,
) : Page<ProductListResponse> {

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

    override fun nextPage(): ProductListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ProductListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProductListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductListPage].
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

    /** A builder for [ProductListPage]. */
    class Builder internal constructor() {

        private var service: ProductService? = null
        private var params: ProductListParams? = null
        private var response: ProductListPageResponse? = null

        @JvmSynthetic
        internal fun from(productListPage: ProductListPage) = apply {
            service = productListPage.service
            params = productListPage.params
            response = productListPage.response
        }

        fun service(service: ProductService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProductListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductListPage].
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
        fun build(): ProductListPage =
            ProductListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ProductListPage{service=$service, params=$params, response=$response}"
}
