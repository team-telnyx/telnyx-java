// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.embeddings

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketDeleteParams
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketListParams
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketListResponse
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketRetrieveParams
import com.telnyx.sdk.models.ai.embeddings.buckets.BucketRetrieveResponse
import java.util.function.Consumer

/** Embed documents and perform text searches */
interface BucketService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BucketService

    /** Get all embedded files for a given user bucket, including their processing status. */
    fun retrieve(bucketName: String): BucketRetrieveResponse =
        retrieve(bucketName, BucketRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        params: BucketRetrieveParams = BucketRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BucketRetrieveResponse =
        retrieve(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bucketName: String,
        params: BucketRetrieveParams = BucketRetrieveParams.none(),
    ): BucketRetrieveResponse = retrieve(bucketName, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BucketRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BucketRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: BucketRetrieveParams): BucketRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(bucketName: String, requestOptions: RequestOptions): BucketRetrieveResponse =
        retrieve(bucketName, BucketRetrieveParams.none(), requestOptions)

    /** Get all embedding buckets for a user. */
    fun list(): BucketListResponse = list(BucketListParams.none())

    /** @see list */
    fun list(
        params: BucketListParams = BucketListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BucketListResponse

    /** @see list */
    fun list(params: BucketListParams = BucketListParams.none()): BucketListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BucketListResponse =
        list(BucketListParams.none(), requestOptions)

    /**
     * Deletes an entire bucket's embeddings and disables the bucket for AI-use, returning it to
     * normal storage pricing.
     */
    fun delete(bucketName: String) = delete(bucketName, BucketDeleteParams.none())

    /** @see delete */
    fun delete(
        bucketName: String,
        params: BucketDeleteParams = BucketDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see delete */
    fun delete(bucketName: String, params: BucketDeleteParams = BucketDeleteParams.none()) =
        delete(bucketName, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: BucketDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: BucketDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(bucketName: String, requestOptions: RequestOptions) =
        delete(bucketName, BucketDeleteParams.none(), requestOptions)

    /** A view of [BucketService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BucketService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/embeddings/buckets/{bucket_name}`, but is
         * otherwise the same as [BucketService.retrieve].
         */
        @MustBeClosed
        fun retrieve(bucketName: String): HttpResponseFor<BucketRetrieveResponse> =
            retrieve(bucketName, BucketRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bucketName: String,
            params: BucketRetrieveParams = BucketRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BucketRetrieveResponse> =
            retrieve(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bucketName: String,
            params: BucketRetrieveParams = BucketRetrieveParams.none(),
        ): HttpResponseFor<BucketRetrieveResponse> =
            retrieve(bucketName, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BucketRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BucketRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BucketRetrieveParams): HttpResponseFor<BucketRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bucketName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BucketRetrieveResponse> =
            retrieve(bucketName, BucketRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/embeddings/buckets`, but is otherwise the same
         * as [BucketService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BucketListResponse> = list(BucketListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BucketListParams = BucketListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BucketListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BucketListParams = BucketListParams.none()
        ): HttpResponseFor<BucketListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BucketListResponse> =
            list(BucketListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/embeddings/buckets/{bucket_name}`, but is
         * otherwise the same as [BucketService.delete].
         */
        @MustBeClosed
        fun delete(bucketName: String): HttpResponse = delete(bucketName, BucketDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            bucketName: String,
            params: BucketDeleteParams = BucketDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            bucketName: String,
            params: BucketDeleteParams = BucketDeleteParams.none(),
        ): HttpResponse = delete(bucketName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BucketDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: BucketDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(bucketName: String, requestOptions: RequestOptions): HttpResponse =
            delete(bucketName, BucketDeleteParams.none(), requestOptions)
    }
}
