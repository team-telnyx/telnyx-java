// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlParams
import com.telnyx.sdk.models.storage.buckets.BucketCreatePresignedUrlResponse
import com.telnyx.sdk.services.blocking.storage.buckets.SslCertificateService
import com.telnyx.sdk.services.blocking.storage.buckets.UsageService
import java.util.function.Consumer

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

    fun sslCertificate(): SslCertificateService

    fun usage(): UsageService

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
    ): BucketCreatePresignedUrlResponse =
        createPresignedUrl(objectName, params, RequestOptions.none())

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        objectName: String,
        params: BucketCreatePresignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BucketCreatePresignedUrlResponse =
        createPresignedUrl(params.toBuilder().objectName(objectName).build(), requestOptions)

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        params: BucketCreatePresignedUrlParams
    ): BucketCreatePresignedUrlResponse = createPresignedUrl(params, RequestOptions.none())

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        params: BucketCreatePresignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BucketCreatePresignedUrlResponse

    /** A view of [BucketService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BucketService.WithRawResponse

        fun sslCertificate(): SslCertificateService.WithRawResponse

        fun usage(): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /storage/buckets/{bucketName}/{objectName}/presigned_url`, but is otherwise the same as
         * [BucketService.createPresignedUrl].
         */
        @MustBeClosed
        fun createPresignedUrl(
            objectName: String,
            params: BucketCreatePresignedUrlParams,
        ): HttpResponseFor<BucketCreatePresignedUrlResponse> =
            createPresignedUrl(objectName, params, RequestOptions.none())

        /** @see createPresignedUrl */
        @MustBeClosed
        fun createPresignedUrl(
            objectName: String,
            params: BucketCreatePresignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BucketCreatePresignedUrlResponse> =
            createPresignedUrl(params.toBuilder().objectName(objectName).build(), requestOptions)

        /** @see createPresignedUrl */
        @MustBeClosed
        fun createPresignedUrl(
            params: BucketCreatePresignedUrlParams
        ): HttpResponseFor<BucketCreatePresignedUrlResponse> =
            createPresignedUrl(params, RequestOptions.none())

        /** @see createPresignedUrl */
        @MustBeClosed
        fun createPresignedUrl(
            params: BucketCreatePresignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BucketCreatePresignedUrlResponse>
    }
}
