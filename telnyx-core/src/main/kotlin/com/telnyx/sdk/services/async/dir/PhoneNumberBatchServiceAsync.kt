// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.dir

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchListPageAsync
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchListParams
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchRetrieveParams
import com.telnyx.sdk.models.dir.phonenumberbatches.PhoneNumberBatchRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Phone numbers are submitted to Telnyx for vetting in batches. Batches group all numbers added in
 * a single request under the same Letter of Authorization.
 */
interface PhoneNumberBatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneNumberBatchServiceAsync

    /**
     * Get a single phone-number batch by id. The enterprise is resolved server-side from the DIR
     * id.
     */
    fun retrieve(
        batchId: String,
        params: PhoneNumberBatchRetrieveParams,
    ): CompletableFuture<PhoneNumberBatchRetrieveResponse> =
        retrieve(batchId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        batchId: String,
        params: PhoneNumberBatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBatchRetrieveResponse> =
        retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberBatchRetrieveParams
    ): CompletableFuture<PhoneNumberBatchRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PhoneNumberBatchRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBatchRetrieveResponse>

    /**
     * List the phone-number batches submitted under a DIR. The enterprise is resolved server-side
     * from the DIR id.
     */
    fun list(dirId: String): CompletableFuture<PhoneNumberBatchListPageAsync> =
        list(dirId, PhoneNumberBatchListParams.none())

    /** @see list */
    fun list(
        dirId: String,
        params: PhoneNumberBatchListParams = PhoneNumberBatchListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBatchListPageAsync> =
        list(params.toBuilder().dirId(dirId).build(), requestOptions)

    /** @see list */
    fun list(
        dirId: String,
        params: PhoneNumberBatchListParams = PhoneNumberBatchListParams.none(),
    ): CompletableFuture<PhoneNumberBatchListPageAsync> = list(dirId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PhoneNumberBatchListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PhoneNumberBatchListPageAsync>

    /** @see list */
    fun list(params: PhoneNumberBatchListParams): CompletableFuture<PhoneNumberBatchListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        dirId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PhoneNumberBatchListPageAsync> =
        list(dirId, PhoneNumberBatchListParams.none(), requestOptions)

    /**
     * A view of [PhoneNumberBatchServiceAsync] that provides access to raw HTTP responses for each
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
        ): PhoneNumberBatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/phone_number_batches/{batch_id}`, but
         * is otherwise the same as [PhoneNumberBatchServiceAsync.retrieve].
         */
        fun retrieve(
            batchId: String,
            params: PhoneNumberBatchRetrieveParams,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchRetrieveResponse>> =
            retrieve(batchId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            batchId: String,
            params: PhoneNumberBatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchRetrieveResponse>> =
            retrieve(params.toBuilder().batchId(batchId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberBatchRetrieveParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PhoneNumberBatchRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /dir/{dir_id}/phone_number_batches`, but is
         * otherwise the same as [PhoneNumberBatchServiceAsync.list].
         */
        fun list(dirId: String): CompletableFuture<HttpResponseFor<PhoneNumberBatchListPageAsync>> =
            list(dirId, PhoneNumberBatchListParams.none())

        /** @see list */
        fun list(
            dirId: String,
            params: PhoneNumberBatchListParams = PhoneNumberBatchListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchListPageAsync>> =
            list(params.toBuilder().dirId(dirId).build(), requestOptions)

        /** @see list */
        fun list(
            dirId: String,
            params: PhoneNumberBatchListParams = PhoneNumberBatchListParams.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchListPageAsync>> =
            list(dirId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: PhoneNumberBatchListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchListPageAsync>>

        /** @see list */
        fun list(
            params: PhoneNumberBatchListParams
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            dirId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PhoneNumberBatchListPageAsync>> =
            list(dirId, PhoneNumberBatchListParams.none(), requestOptions)
    }
}
