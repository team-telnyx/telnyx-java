// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.brand

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingImportParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingImportResponse
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingListParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingListResponse
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingOrderParams
import com.telnyx.sdk.models.brand.externalvetting.ExternalVettingOrderResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExternalVettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalVettingServiceAsync

    /** Get list of valid external vetting record for a given brand */
    fun list(brandId: String): CompletableFuture<List<ExternalVettingListResponse>> =
        list(brandId, ExternalVettingListParams.none())

    /** @see list */
    fun list(
        brandId: String,
        params: ExternalVettingListParams = ExternalVettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ExternalVettingListResponse>> =
        list(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see list */
    fun list(
        brandId: String,
        params: ExternalVettingListParams = ExternalVettingListParams.none(),
    ): CompletableFuture<List<ExternalVettingListResponse>> =
        list(brandId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ExternalVettingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ExternalVettingListResponse>>

    /** @see list */
    fun list(
        params: ExternalVettingListParams
    ): CompletableFuture<List<ExternalVettingListResponse>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        brandId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ExternalVettingListResponse>> =
        list(brandId, ExternalVettingListParams.none(), requestOptions)

    /**
     * This operation can be used to import an external vetting record from a TCR-approved vetting
     * provider. If the vetting provider confirms validity of the record, it will be saved with the
     * brand and will be considered for future campaign qualification.
     */
    fun import_(
        brandId: String,
        params: ExternalVettingImportParams,
    ): CompletableFuture<ExternalVettingImportResponse> =
        import_(brandId, params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        brandId: String,
        params: ExternalVettingImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalVettingImportResponse> =
        import_(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see import_ */
    fun import_(
        params: ExternalVettingImportParams
    ): CompletableFuture<ExternalVettingImportResponse> = import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: ExternalVettingImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalVettingImportResponse>

    /** Order new external vetting for a brand */
    fun order(
        brandId: String,
        params: ExternalVettingOrderParams,
    ): CompletableFuture<ExternalVettingOrderResponse> =
        order(brandId, params, RequestOptions.none())

    /** @see order */
    fun order(
        brandId: String,
        params: ExternalVettingOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalVettingOrderResponse> =
        order(params.toBuilder().brandId(brandId).build(), requestOptions)

    /** @see order */
    fun order(params: ExternalVettingOrderParams): CompletableFuture<ExternalVettingOrderResponse> =
        order(params, RequestOptions.none())

    /** @see order */
    fun order(
        params: ExternalVettingOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalVettingOrderResponse>

    /**
     * A view of [ExternalVettingServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExternalVettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /10dlc/brand/{brandId}/externalVetting`, but is
         * otherwise the same as [ExternalVettingServiceAsync.list].
         */
        fun list(
            brandId: String
        ): CompletableFuture<HttpResponseFor<List<ExternalVettingListResponse>>> =
            list(brandId, ExternalVettingListParams.none())

        /** @see list */
        fun list(
            brandId: String,
            params: ExternalVettingListParams = ExternalVettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ExternalVettingListResponse>>> =
            list(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see list */
        fun list(
            brandId: String,
            params: ExternalVettingListParams = ExternalVettingListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ExternalVettingListResponse>>> =
            list(brandId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ExternalVettingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ExternalVettingListResponse>>>

        /** @see list */
        fun list(
            params: ExternalVettingListParams
        ): CompletableFuture<HttpResponseFor<List<ExternalVettingListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            brandId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ExternalVettingListResponse>>> =
            list(brandId, ExternalVettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /10dlc/brand/{brandId}/externalVetting`, but is
         * otherwise the same as [ExternalVettingServiceAsync.import_].
         */
        fun import_(
            brandId: String,
            params: ExternalVettingImportParams,
        ): CompletableFuture<HttpResponseFor<ExternalVettingImportResponse>> =
            import_(brandId, params, RequestOptions.none())

        /** @see import_ */
        fun import_(
            brandId: String,
            params: ExternalVettingImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVettingImportResponse>> =
            import_(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see import_ */
        fun import_(
            params: ExternalVettingImportParams
        ): CompletableFuture<HttpResponseFor<ExternalVettingImportResponse>> =
            import_(params, RequestOptions.none())

        /** @see import_ */
        fun import_(
            params: ExternalVettingImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVettingImportResponse>>

        /**
         * Returns a raw HTTP response for `post /10dlc/brand/{brandId}/externalVetting`, but is
         * otherwise the same as [ExternalVettingServiceAsync.order].
         */
        fun order(
            brandId: String,
            params: ExternalVettingOrderParams,
        ): CompletableFuture<HttpResponseFor<ExternalVettingOrderResponse>> =
            order(brandId, params, RequestOptions.none())

        /** @see order */
        fun order(
            brandId: String,
            params: ExternalVettingOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVettingOrderResponse>> =
            order(params.toBuilder().brandId(brandId).build(), requestOptions)

        /** @see order */
        fun order(
            params: ExternalVettingOrderParams
        ): CompletableFuture<HttpResponseFor<ExternalVettingOrderResponse>> =
            order(params, RequestOptions.none())

        /** @see order */
        fun order(
            params: ExternalVettingOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalVettingOrderResponse>>
    }
}
