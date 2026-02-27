// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.detailrecords.DetailRecordListPageAsync
import com.telnyx.sdk.models.detailrecords.DetailRecordListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Detail Records operations */
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
    fun list(): CompletableFuture<DetailRecordListPageAsync> = list(DetailRecordListParams.none())

    /** @see list */
    fun list(
        params: DetailRecordListParams = DetailRecordListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailRecordListPageAsync>

    /** @see list */
    fun list(
        params: DetailRecordListParams = DetailRecordListParams.none()
    ): CompletableFuture<DetailRecordListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DetailRecordListPageAsync> =
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
        fun list(): CompletableFuture<HttpResponseFor<DetailRecordListPageAsync>> =
            list(DetailRecordListParams.none())

        /** @see list */
        fun list(
            params: DetailRecordListParams = DetailRecordListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailRecordListPageAsync>>

        /** @see list */
        fun list(
            params: DetailRecordListParams = DetailRecordListParams.none()
        ): CompletableFuture<HttpResponseFor<DetailRecordListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DetailRecordListPageAsync>> =
            list(DetailRecordListParams.none(), requestOptions)
    }
}
