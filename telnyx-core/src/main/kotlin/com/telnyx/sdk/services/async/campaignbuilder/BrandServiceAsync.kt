// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.campaignbuilder

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.campaignbuilder.brand.BrandQualifyByUsecaseParams
import com.telnyx.sdk.models.campaignbuilder.brand.BrandQualifyByUsecaseResponse
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
    fun qualifyByUsecase(
        usecase: String,
        params: BrandQualifyByUsecaseParams,
    ): CompletableFuture<BrandQualifyByUsecaseResponse> =
        qualifyByUsecase(usecase, params, RequestOptions.none())

    /** @see qualifyByUsecase */
    fun qualifyByUsecase(
        usecase: String,
        params: BrandQualifyByUsecaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandQualifyByUsecaseResponse> =
        qualifyByUsecase(params.toBuilder().usecase(usecase).build(), requestOptions)

    /** @see qualifyByUsecase */
    fun qualifyByUsecase(
        params: BrandQualifyByUsecaseParams
    ): CompletableFuture<BrandQualifyByUsecaseResponse> =
        qualifyByUsecase(params, RequestOptions.none())

    /** @see qualifyByUsecase */
    fun qualifyByUsecase(
        params: BrandQualifyByUsecaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandQualifyByUsecaseResponse>

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
         * [BrandServiceAsync.qualifyByUsecase].
         */
        fun qualifyByUsecase(
            usecase: String,
            params: BrandQualifyByUsecaseParams,
        ): CompletableFuture<HttpResponseFor<BrandQualifyByUsecaseResponse>> =
            qualifyByUsecase(usecase, params, RequestOptions.none())

        /** @see qualifyByUsecase */
        fun qualifyByUsecase(
            usecase: String,
            params: BrandQualifyByUsecaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandQualifyByUsecaseResponse>> =
            qualifyByUsecase(params.toBuilder().usecase(usecase).build(), requestOptions)

        /** @see qualifyByUsecase */
        fun qualifyByUsecase(
            params: BrandQualifyByUsecaseParams
        ): CompletableFuture<HttpResponseFor<BrandQualifyByUsecaseResponse>> =
            qualifyByUsecase(params, RequestOptions.none())

        /** @see qualifyByUsecase */
        fun qualifyByUsecase(
            params: BrandQualifyByUsecaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandQualifyByUsecaseResponse>>
    }
}
