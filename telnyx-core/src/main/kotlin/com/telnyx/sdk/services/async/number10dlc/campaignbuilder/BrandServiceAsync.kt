// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.campaignbuilder

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.campaignbuilder.brand.BrandRetrieveParams
import com.telnyx.sdk.models.number10dlc.campaignbuilder.brand.BrandRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync

    /**
     * This endpoint allows you to see whether or not the supplied brand is suitable for your
     * desired campaign use case.
     */
    fun retrieve(
        usecase: String,
        params: BrandRetrieveParams,
    ): CompletableFuture<BrandRetrieveResponse> = retrieve(usecase, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        usecase: String,
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params.toBuilder().usecase(usecase).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse>

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /10dlc/campaignBuilder/brand/{brandId}/usecase/{usecase}`, but is otherwise the same as
         * [BrandServiceAsync.retrieve].
         */
        fun retrieve(
            usecase: String,
            params: BrandRetrieveParams,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(usecase, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            usecase: String,
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params.toBuilder().usecase(usecase).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>>
    }
}
