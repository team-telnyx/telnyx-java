// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.pricing

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.pricing.products.ProductListPage
import com.telnyx.sdk.models.pricing.products.ProductListParams
import com.telnyx.sdk.models.pricing.products.ProductRetrieveParams
import com.telnyx.sdk.models.pricing.products.ProductRetrieveResponse
import java.util.function.Consumer

/** Public pricing operations */
interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService

    /**
     * Returns pricing entries for a single product. Most products return standard rate entries with
     * fields like rate, unit, country_iso, direction, and tiers. Inference products return
     * model-specific fields (model, input_rate, output_rate, cached_input_rate) with tiered
     * pricing. Some products use rate decks (pricing_type: rate_deck) where rates are determined
     * dynamically.
     */
    fun retrieve(slug: String): ProductRetrieveResponse =
        retrieve(slug, ProductRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        slug: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductRetrieveResponse = retrieve(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        slug: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
    ): ProductRetrieveResponse = retrieve(slug, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ProductRetrieveParams): ProductRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(slug: String, requestOptions: RequestOptions): ProductRetrieveResponse =
        retrieve(slug, ProductRetrieveParams.none(), requestOptions)

    /**
     * Returns the full product catalog with pagination. Each entry contains a slug, display name,
     * and description. Use the slug to fetch per-product pricing via GET /pricing/products/{slug}.
     */
    fun list(): ProductListPage = list(ProductListParams.none())

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /** @see list */
    fun list(params: ProductListParams = ProductListParams.none()): ProductListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProductListPage =
        list(ProductListParams.none(), requestOptions)

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /pricing/products/{slug}`, but is otherwise the same
         * as [ProductService.retrieve].
         */
        @MustBeClosed
        fun retrieve(slug: String): HttpResponseFor<ProductRetrieveResponse> =
            retrieve(slug, ProductRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            slug: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductRetrieveResponse> =
            retrieve(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            slug: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
        ): HttpResponseFor<ProductRetrieveResponse> = retrieve(slug, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ProductRetrieveParams): HttpResponseFor<ProductRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            slug: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductRetrieveResponse> =
            retrieve(slug, ProductRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pricing/products`, but is otherwise the same as
         * [ProductService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProductListPage> = list(ProductListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): HttpResponseFor<ProductListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPage> =
            list(ProductListParams.none(), requestOptions)
    }
}
