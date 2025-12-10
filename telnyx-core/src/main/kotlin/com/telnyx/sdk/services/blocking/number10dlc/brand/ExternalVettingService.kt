// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.brand

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingExternalVettingParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingExternalVettingResponse
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingRetrieveExternalVettingParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingRetrieveExternalVettingResponse
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingUpdateExternalVettingParams
import com.telnyx.sdk.models.number10dlc.brand.externalvetting.ExternalVettingUpdateExternalVettingResponse
import java.util.function.Consumer

interface ExternalVettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalVettingService

    /** Order new external vetting for a brand */
    fun externalVetting(
        brandId: String,
        params: ExternalVettingExternalVettingParams,
    ): ExternalVettingExternalVettingResponse =
        externalVetting(brandId, params, RequestOptions.none())

    /** @see externalVetting */
    fun externalVetting(
        brandId: String,
        params: ExternalVettingExternalVettingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVettingExternalVettingResponse =
        externalVetting(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see externalVetting */
    fun externalVetting(
        params: ExternalVettingExternalVettingParams
    ): ExternalVettingExternalVettingResponse = externalVetting(params, RequestOptions.none())

    /** @see externalVetting */
    fun externalVetting(
        params: ExternalVettingExternalVettingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVettingExternalVettingResponse

    /** Get list of valid external vetting record for a given brand */
    fun retrieveExternalVetting(
        brandId: String
    ): List<ExternalVettingRetrieveExternalVettingResponse> =
        retrieveExternalVetting(brandId, ExternalVettingRetrieveExternalVettingParams.none())

    /** @see retrieveExternalVetting */
    fun retrieveExternalVetting(
        brandId: String,
        params: ExternalVettingRetrieveExternalVettingParams =
            ExternalVettingRetrieveExternalVettingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ExternalVettingRetrieveExternalVettingResponse> =
        retrieveExternalVetting(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see retrieveExternalVetting */
    fun retrieveExternalVetting(
        brandId: String,
        params: ExternalVettingRetrieveExternalVettingParams =
            ExternalVettingRetrieveExternalVettingParams.none(),
    ): List<ExternalVettingRetrieveExternalVettingResponse> =
        retrieveExternalVetting(brandId, params, RequestOptions.none())

    /** @see retrieveExternalVetting */
    fun retrieveExternalVetting(
        params: ExternalVettingRetrieveExternalVettingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ExternalVettingRetrieveExternalVettingResponse>

    /** @see retrieveExternalVetting */
    fun retrieveExternalVetting(
        params: ExternalVettingRetrieveExternalVettingParams
    ): List<ExternalVettingRetrieveExternalVettingResponse> =
        retrieveExternalVetting(params, RequestOptions.none())

    /** @see retrieveExternalVetting */
    fun retrieveExternalVetting(
        brandId: String,
        requestOptions: RequestOptions,
    ): List<ExternalVettingRetrieveExternalVettingResponse> =
        retrieveExternalVetting(
            brandId,
            ExternalVettingRetrieveExternalVettingParams.none(),
            requestOptions,
        )

    /**
     * This operation can be used to import an external vetting record from a TCR-approved vetting
     * provider. If the vetting provider confirms validity of the record, it will be saved with the
     * brand and will be considered for future campaign qualification.
     */
    fun updateExternalVetting(
        brandId: String,
        params: ExternalVettingUpdateExternalVettingParams,
    ): ExternalVettingUpdateExternalVettingResponse =
        updateExternalVetting(brandId, params, RequestOptions.none())

    /** @see updateExternalVetting */
    fun updateExternalVetting(
        brandId: String,
        params: ExternalVettingUpdateExternalVettingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVettingUpdateExternalVettingResponse =
        updateExternalVetting(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see updateExternalVetting */
    fun updateExternalVetting(
        params: ExternalVettingUpdateExternalVettingParams
    ): ExternalVettingUpdateExternalVettingResponse =
        updateExternalVetting(params, RequestOptions.none())

    /** @see updateExternalVetting */
    fun updateExternalVetting(
        params: ExternalVettingUpdateExternalVettingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVettingUpdateExternalVettingResponse

    /**
     * A view of [ExternalVettingService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalVettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /10dlc/brand/{brandId}/externalVetting`, but is
         * otherwise the same as [ExternalVettingService.externalVetting].
         */
        @MustBeClosed
        fun externalVetting(
            brandId: String,
            params: ExternalVettingExternalVettingParams,
        ): HttpResponseFor<ExternalVettingExternalVettingResponse> =
            externalVetting(brandId, params, RequestOptions.none())

        /** @see externalVetting */
        @MustBeClosed
        fun externalVetting(
            brandId: String,
            params: ExternalVettingExternalVettingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVettingExternalVettingResponse> =
            externalVetting(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see externalVetting */
        @MustBeClosed
        fun externalVetting(
            params: ExternalVettingExternalVettingParams
        ): HttpResponseFor<ExternalVettingExternalVettingResponse> =
            externalVetting(params, RequestOptions.none())

        /** @see externalVetting */
        @MustBeClosed
        fun externalVetting(
            params: ExternalVettingExternalVettingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVettingExternalVettingResponse>

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/{brandId}/externalVetting`, but is
         * otherwise the same as [ExternalVettingService.retrieveExternalVetting].
         */
        @MustBeClosed
        fun retrieveExternalVetting(
            brandId: String
        ): HttpResponseFor<List<ExternalVettingRetrieveExternalVettingResponse>> =
            retrieveExternalVetting(brandId, ExternalVettingRetrieveExternalVettingParams.none())

        /** @see retrieveExternalVetting */
        @MustBeClosed
        fun retrieveExternalVetting(
            brandId: String,
            params: ExternalVettingRetrieveExternalVettingParams =
                ExternalVettingRetrieveExternalVettingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ExternalVettingRetrieveExternalVettingResponse>> =
            retrieveExternalVetting(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see retrieveExternalVetting */
        @MustBeClosed
        fun retrieveExternalVetting(
            brandId: String,
            params: ExternalVettingRetrieveExternalVettingParams =
                ExternalVettingRetrieveExternalVettingParams.none(),
        ): HttpResponseFor<List<ExternalVettingRetrieveExternalVettingResponse>> =
            retrieveExternalVetting(brandId, params, RequestOptions.none())

        /** @see retrieveExternalVetting */
        @MustBeClosed
        fun retrieveExternalVetting(
            params: ExternalVettingRetrieveExternalVettingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ExternalVettingRetrieveExternalVettingResponse>>

        /** @see retrieveExternalVetting */
        @MustBeClosed
        fun retrieveExternalVetting(
            params: ExternalVettingRetrieveExternalVettingParams
        ): HttpResponseFor<List<ExternalVettingRetrieveExternalVettingResponse>> =
            retrieveExternalVetting(params, RequestOptions.none())

        /** @see retrieveExternalVetting */
        @MustBeClosed
        fun retrieveExternalVetting(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ExternalVettingRetrieveExternalVettingResponse>> =
            retrieveExternalVetting(
                brandId,
                ExternalVettingRetrieveExternalVettingParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}/externalVetting`, but is
         * otherwise the same as [ExternalVettingService.updateExternalVetting].
         */
        @MustBeClosed
        fun updateExternalVetting(
            brandId: String,
            params: ExternalVettingUpdateExternalVettingParams,
        ): HttpResponseFor<ExternalVettingUpdateExternalVettingResponse> =
            updateExternalVetting(brandId, params, RequestOptions.none())

        /** @see updateExternalVetting */
        @MustBeClosed
        fun updateExternalVetting(
            brandId: String,
            params: ExternalVettingUpdateExternalVettingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVettingUpdateExternalVettingResponse> =
            updateExternalVetting(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see updateExternalVetting */
        @MustBeClosed
        fun updateExternalVetting(
            params: ExternalVettingUpdateExternalVettingParams
        ): HttpResponseFor<ExternalVettingUpdateExternalVettingResponse> =
            updateExternalVetting(params, RequestOptions.none())

        /** @see updateExternalVetting */
        @MustBeClosed
        fun updateExternalVetting(
            params: ExternalVettingUpdateExternalVettingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVettingUpdateExternalVettingResponse>
    }
}
