// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.embeddings

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketDeleteParams
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketListParams
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketListResponse
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketRetrieveParams
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Embed documents and perform text searches */
interface BucketServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BucketServiceAsync

    /** Get all embedded files for a given user bucket, including their processing status. */
    fun retrieve(bucketName: String): CompletableFuture<BucketRetrieveResponse> =
        retrieve(bucketName, BucketRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        params: BucketRetrieveParams = BucketRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BucketRetrieveResponse> =
        retrieve(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        params: BucketRetrieveParams = BucketRetrieveParams.none(),
    ): CompletableFuture<BucketRetrieveResponse> =
        retrieve(bucketName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BucketRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BucketRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: BucketRetrieveParams): CompletableFuture<BucketRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BucketRetrieveResponse> =
        retrieve(bucketName, BucketRetrieveParams.none(), requestOptions)

    /** Get all embedding buckets for a user. */
    fun list(): CompletableFuture<BucketListResponse> = list(BucketListParams.none())

    /** @see list */
    fun list(
        params: BucketListParams = BucketListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BucketListResponse>

    /** @see list */
    fun list(
        params: BucketListParams = BucketListParams.none()
    ): CompletableFuture<BucketListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BucketListResponse> =
        list(BucketListParams.none(), requestOptions)

    /**
     * Deletes an entire bucket's embeddings and disables the bucket for AI-use, returning it to
     * normal storage pricing.
     */
    fun delete(bucketName: String): CompletableFuture<Void?> =
        delete(bucketName, BucketDeleteParams.none())

    /** @see delete */
    fun delete(
        bucketName: String,
        params: BucketDeleteParams = BucketDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see delete */
    fun delete(
        bucketName: String,
        params: BucketDeleteParams = BucketDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(bucketName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BucketDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: BucketDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(bucketName: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(bucketName, BucketDeleteParams.none(), requestOptions)

    /**
     * A view of [BucketServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BucketServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/embeddings/buckets/{bucket_name}`, but is
         * otherwise the same as [BucketServiceAsync.retrieve].
         */
        fun retrieve(
            bucketName: String
        ): CompletableFuture<HttpResponseFor<BucketRetrieveResponse>> =
            retrieve(bucketName, BucketRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            bucketName: String,
            params: BucketRetrieveParams = BucketRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BucketRetrieveResponse>> =
            retrieve(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            bucketName: String,
            params: BucketRetrieveParams = BucketRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BucketRetrieveResponse>> =
            retrieve(bucketName, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BucketRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BucketRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: BucketRetrieveParams
        ): CompletableFuture<HttpResponseFor<BucketRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            bucketName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BucketRetrieveResponse>> =
            retrieve(bucketName, BucketRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/embeddings/buckets`, but is otherwise the same
         * as [BucketServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BucketListResponse>> =
            list(BucketListParams.none())

        /** @see list */
        fun list(
            params: BucketListParams = BucketListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BucketListResponse>>

        /** @see list */
        fun list(
            params: BucketListParams = BucketListParams.none()
        ): CompletableFuture<HttpResponseFor<BucketListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BucketListResponse>> =
            list(BucketListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/embeddings/buckets/{bucket_name}`, but is
         * otherwise the same as [BucketServiceAsync.delete].
         */
        fun delete(bucketName: String): CompletableFuture<HttpResponse> =
            delete(bucketName, BucketDeleteParams.none())

        /** @see delete */
        fun delete(
            bucketName: String,
            params: BucketDeleteParams = BucketDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see delete */
        fun delete(
            bucketName: String,
            params: BucketDeleteParams = BucketDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(bucketName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BucketDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: BucketDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            bucketName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(bucketName, BucketDeleteParams.none(), requestOptions)
    }
}
