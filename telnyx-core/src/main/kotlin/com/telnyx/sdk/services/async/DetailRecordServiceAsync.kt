// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.detailrecords.DetailRecordListParams
import com.telnyx.sdk.models.detailrecords.DetailRecordListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DetailRecordServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailRecordServiceAsync

    /** Search for any detail record across the Telnyx Platform */
    fun list(): CompletableFuture<DetailRecordListResponse> = list(DetailRecordListParams.none())

    /** @see list */
    fun list(
        params: DetailRecordListParams = DetailRecordListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailRecordListResponse>

    /** @see list */
    fun list(
        params: DetailRecordListParams = DetailRecordListParams.none()
    ): CompletableFuture<DetailRecordListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DetailRecordListResponse> =
        list(DetailRecordListParams.none(), requestOptions)

    /**
     * A view of [DetailRecordServiceAsync] that provides access to raw HTTP responses for each
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
        ): DetailRecordServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /detail_records`, but is otherwise the same as
         * [DetailRecordServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DetailRecordListResponse>> =
            list(DetailRecordListParams.none())

        /** @see list */
        fun list(
            params: DetailRecordListParams = DetailRecordListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordListResponse>>

        /** @see list */
        fun list(
            params: DetailRecordListParams = DetailRecordListParams.none()
        ): CompletableFuture<HttpResponseFor<DetailRecordListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DetailRecordListResponse>> =
            list(DetailRecordListParams.none(), requestOptions)
    }
}
