// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.campaignbuilder

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.campaignbuilder.brand.BrandQualifyByUsecaseParams
import com.telnyx.sdk.models.number10dlc.campaignbuilder.brand.BrandQualifyByUsecaseResponse
import java.util.function.Consumer

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService

    /**
     * This endpoint allows you to see whether or not the supplied brand is suitable for your
     * desired campaign use case.
     */
    fun qualifyByUsecase(
        usecase: String,
        params: BrandQualifyByUsecaseParams,
    ): BrandQualifyByUsecaseResponse = qualifyByUsecase(usecase, params, RequestOptions.none())

    /** @see qualifyByUsecase */
    fun qualifyByUsecase(
        usecase: String,
        params: BrandQualifyByUsecaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandQualifyByUsecaseResponse =
        qualifyByUsecase(params.toBuilder().usecase(usecase).build(), requestOptions)

    /** @see qualifyByUsecase */
    fun qualifyByUsecase(params: BrandQualifyByUsecaseParams): BrandQualifyByUsecaseResponse =
        qualifyByUsecase(params, RequestOptions.none())

    /** @see qualifyByUsecase */
    fun qualifyByUsecase(
        params: BrandQualifyByUsecaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandQualifyByUsecaseResponse

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /10dlc/campaignBuilder/brand/{brandId}/usecase/{usecase}`, but is otherwise the same as
         * [BrandService.qualifyByUsecase].
         */
        @MustBeClosed
        fun qualifyByUsecase(
            usecase: String,
            params: BrandQualifyByUsecaseParams,
        ): HttpResponseFor<BrandQualifyByUsecaseResponse> =
            qualifyByUsecase(usecase, params, RequestOptions.none())

        /** @see qualifyByUsecase */
        @MustBeClosed
        fun qualifyByUsecase(
            usecase: String,
            params: BrandQualifyByUsecaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandQualifyByUsecaseResponse> =
            qualifyByUsecase(params.toBuilder().usecase(usecase).build(), requestOptions)

        /** @see qualifyByUsecase */
        @MustBeClosed
        fun qualifyByUsecase(
            params: BrandQualifyByUsecaseParams
        ): HttpResponseFor<BrandQualifyByUsecaseResponse> =
            qualifyByUsecase(params, RequestOptions.none())

        /** @see qualifyByUsecase */
        @MustBeClosed
        fun qualifyByUsecase(
            params: BrandQualifyByUsecaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandQualifyByUsecaseResponse>
    }
}
