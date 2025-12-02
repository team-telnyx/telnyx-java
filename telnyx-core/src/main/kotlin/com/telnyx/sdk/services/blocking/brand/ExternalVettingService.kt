// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.brand

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingImportParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingImportResponse
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingListParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingListResponse
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingOrderParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingOrderResponse
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

    /** Get list of valid external vetting record for a given brand */
    fun list(brandId: String): List<ExternalVettingListResponse> =
        list(brandId, ExternalVettingListParams.none())

    /** @see list */
    fun list(
        brandId: String,
        params: ExternalVettingListParams = ExternalVettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ExternalVettingListResponse> =
        list(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see list */
    fun list(
        brandId: String,
        params: ExternalVettingListParams = ExternalVettingListParams.none(),
    ): List<ExternalVettingListResponse> = list(brandId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExternalVettingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ExternalVettingListResponse>

    /** @see list */
    fun list(params: ExternalVettingListParams): List<ExternalVettingListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(brandId: String, requestOptions: RequestOptions): List<ExternalVettingListResponse> =
        list(brandId, ExternalVettingListParams.none(), requestOptions)

    /**
     * This operation can be used to import an external vetting record from a TCR-approved vetting
     * provider. If the vetting provider confirms validity of the record, it will be saved with the
     * brand and will be considered for future campaign qualification.
     */
    fun import_(
        brandId: String,
        params: ExternalVettingImportParams,
    ): ExternalVettingImportResponse = import_(brandId, params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        brandId: String,
        params: ExternalVettingImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVettingImportResponse =
        import_(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see import_ */
    fun import_(params: ExternalVettingImportParams): ExternalVettingImportResponse =
        import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: ExternalVettingImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVettingImportResponse

    /** Order new external vetting for a brand */
    fun order(brandId: String, params: ExternalVettingOrderParams): ExternalVettingOrderResponse =
        order(brandId, params, RequestOptions.none())

    /** @see order */
    fun order(
        brandId: String,
        params: ExternalVettingOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVettingOrderResponse =
        order(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see order */
    fun order(params: ExternalVettingOrderParams): ExternalVettingOrderResponse =
        order(params, RequestOptions.none())

    /** @see order */
    fun order(
        params: ExternalVettingOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalVettingOrderResponse

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
         * Returns a raw HTTP response for `get /brand/{brandId}/externalVetting`, but is otherwise
         * the same as [ExternalVettingService.list].
         */
        @MustBeClosed
        fun list(brandId: String): HttpResponseFor<List<ExternalVettingListResponse>> =
            list(brandId, ExternalVettingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            brandId: String,
            params: ExternalVettingListParams = ExternalVettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ExternalVettingListResponse>> =
            list(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            brandId: String,
            params: ExternalVettingListParams = ExternalVettingListParams.none(),
        ): HttpResponseFor<List<ExternalVettingListResponse>> =
            list(brandId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExternalVettingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ExternalVettingListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ExternalVettingListParams
        ): HttpResponseFor<List<ExternalVettingListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            brandId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ExternalVettingListResponse>> =
            list(brandId, ExternalVettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /brand/{brandId}/externalVetting`, but is otherwise
         * the same as [ExternalVettingService.import_].
         */
        @MustBeClosed
        fun import_(
            brandId: String,
            params: ExternalVettingImportParams,
        ): HttpResponseFor<ExternalVettingImportResponse> =
            import_(brandId, params, RequestOptions.none())

        /** @see import_ */
        @MustBeClosed
        fun import_(
            brandId: String,
            params: ExternalVettingImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVettingImportResponse> =
            import_(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see import_ */
        @MustBeClosed
        fun import_(
            params: ExternalVettingImportParams
        ): HttpResponseFor<ExternalVettingImportResponse> = import_(params, RequestOptions.none())

        /** @see import_ */
        @MustBeClosed
        fun import_(
            params: ExternalVettingImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVettingImportResponse>

        /**
         * Returns a raw HTTP response for `post /brand/{brandId}/externalVetting`, but is otherwise
         * the same as [ExternalVettingService.order].
         */
        @MustBeClosed
        fun order(
            brandId: String,
            params: ExternalVettingOrderParams,
        ): HttpResponseFor<ExternalVettingOrderResponse> =
            order(brandId, params, RequestOptions.none())

        /** @see order */
        @MustBeClosed
        fun order(
            brandId: String,
            params: ExternalVettingOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVettingOrderResponse> =
            order(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see order */
        @MustBeClosed
        fun order(
            params: ExternalVettingOrderParams
        ): HttpResponseFor<ExternalVettingOrderResponse> = order(params, RequestOptions.none())

        /** @see order */
        @MustBeClosed
        fun order(
            params: ExternalVettingOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalVettingOrderResponse>
    }
}
