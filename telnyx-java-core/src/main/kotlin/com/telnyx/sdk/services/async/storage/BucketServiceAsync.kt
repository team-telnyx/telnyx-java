// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlParams
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlResponse
import com.telnyx.sdk.services.async.storage.buckets.SslCertificateServiceAsync
import com.telnyx.sdk.services.async.storage.buckets.UsageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    fun sslCertificate(): SslCertificateServiceAsync

    fun usage(): UsageServiceAsync

    /**
     * Returns a timed and authenticated URL to get an object. This is the equivalent to AWS S3’s
     * “presigned” URL. Please note that Telnyx performs authentication differently from AWS S3 and
     * you MUST NOT use the presign method of AWS s3api CLI or sdk to generate the presigned URL.
     *
     * Refer to: https://developers.telnyx.com/docs/cloud-storage/presigned-urls
     */
    fun createPresignedUrl(
        objectName: String,
        params: BucketCreatePresignedUrlParams,
    ): CompletableFuture<BucketCreatePresignedUrlResponse> =
        createPresignedUrl(objectName, params, RequestOptions.none())

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        objectName: String,
        params: BucketCreatePresignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BucketCreatePresignedUrlResponse> =
        createPresignedUrl(params.toBuilder().objectName(objectName).build(), requestOptions)

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        params: BucketCreatePresignedUrlParams
    ): CompletableFuture<BucketCreatePresignedUrlResponse> =
        createPresignedUrl(params, RequestOptions.none())

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        params: BucketCreatePresignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BucketCreatePresignedUrlResponse>

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

        fun sslCertificate(): SslCertificateServiceAsync.WithRawResponse

        fun usage(): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /storage/buckets/{bucketName}/{objectName}/presigned_url`, but is otherwise the same as
         * [BucketServiceAsync.createPresignedUrl].
         */
        fun createPresignedUrl(
            objectName: String,
            params: BucketCreatePresignedUrlParams,
        ): CompletableFuture<HttpResponseFor<BucketCreatePresignedUrlResponse>> =
            createPresignedUrl(objectName, params, RequestOptions.none())

        /** @see createPresignedUrl */
        fun createPresignedUrl(
            objectName: String,
            params: BucketCreatePresignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BucketCreatePresignedUrlResponse>> =
            createPresignedUrl(params.toBuilder().objectName(objectName).build(), requestOptions)

        /** @see createPresignedUrl */
        fun createPresignedUrl(
            params: BucketCreatePresignedUrlParams
        ): CompletableFuture<HttpResponseFor<BucketCreatePresignedUrlResponse>> =
            createPresignedUrl(params, RequestOptions.none())

        /** @see createPresignedUrl */
        fun createPresignedUrl(
            params: BucketCreatePresignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BucketCreatePresignedUrlResponse>>
    }
}
