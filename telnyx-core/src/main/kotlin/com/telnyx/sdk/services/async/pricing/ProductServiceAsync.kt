// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.pricing

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.pricing.products.ProductListPageAsync
import com.telnyx.sdk.models.pricing.products.ProductListParams
import com.telnyx.sdk.models.pricing.products.ProductRetrievePageAsync
import com.telnyx.sdk.models.pricing.products.ProductRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Public pricing operations */
interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductServiceAsync

    /**
     * Returns pricing entries for a single product. Most products return standard rate entries with
     * fields like rate, unit, country_iso, direction, and tiers. Inference products return
     * model-specific fields (model, input_rate, output_rate, cached_input_rate) with tiered
     * pricing. Some products use rate decks (pricing_type: rate_deck) where rates are determined
     * dynamically.
     */
    fun retrieve(slug: String): CompletableFuture<ProductRetrievePageAsync> =
        retrieve(slug, ProductRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        slug: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductRetrievePageAsync> =
        retrieve(params.toBuilder().slug(slug).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        slug: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
    ): CompletableFuture<ProductRetrievePageAsync> = retrieve(slug, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductRetrievePageAsync>

    /** @see retrieve */
    fun retrieve(params: ProductRetrieveParams): CompletableFuture<ProductRetrievePageAsync> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        slug: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductRetrievePageAsync> =
        retrieve(slug, ProductRetrieveParams.none(), requestOptions)

    /**
     * Returns the full product catalog with pagination. Each entry contains a slug, display name,
     * and description. Use the slug to fetch per-product pricing via GET /pricing/products/{slug}.
     */
    fun list(): CompletableFuture<ProductListPageAsync> = list(ProductListParams.none())

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductListPageAsync>

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none()
    ): CompletableFuture<ProductListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProductListPageAsync> =
        list(ProductListParams.none(), requestOptions)

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /pricing/products/{slug}`, but is otherwise the same
         * as [ProductServiceAsync.retrieve].
         */
        fun retrieve(slug: String): CompletableFuture<HttpResponseFor<ProductRetrievePageAsync>> =
            retrieve(slug, ProductRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            slug: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductRetrievePageAsync>> =
            retrieve(params.toBuilder().slug(slug).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            slug: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductRetrievePageAsync>> =
            retrieve(slug, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductRetrievePageAsync>>

        /** @see retrieve */
        fun retrieve(
            params: ProductRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProductRetrievePageAsync>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            slug: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductRetrievePageAsync>> =
            retrieve(slug, ProductRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pricing/products`, but is otherwise the same as
         * [ProductServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(ProductListParams.none())

        /** @see list */
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>>

        /** @see list */
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(ProductListParams.none(), requestOptions)
    }
}
