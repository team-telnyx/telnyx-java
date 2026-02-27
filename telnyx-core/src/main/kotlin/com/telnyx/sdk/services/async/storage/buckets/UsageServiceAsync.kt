// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.buckets

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageParams
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageResponse
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetBucketUsageParams
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetBucketUsageResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Bucket Usage operations */
interface UsageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageServiceAsync

    /**
     * Returns the detail on API usage on a bucket of a particular time period, group by method
     * category.
     */
    fun getApiUsage(
        bucketName: String,
        params: UsageGetApiUsageParams,
    ): CompletableFuture<UsageGetApiUsageResponse> =
        getApiUsage(bucketName, params, RequestOptions.none())

    /** @see getApiUsage */
    fun getApiUsage(
        bucketName: String,
        params: UsageGetApiUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageGetApiUsageResponse> =
        getApiUsage(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see getApiUsage */
    fun getApiUsage(params: UsageGetApiUsageParams): CompletableFuture<UsageGetApiUsageResponse> =
        getApiUsage(params, RequestOptions.none())

    /** @see getApiUsage */
    fun getApiUsage(
        params: UsageGetApiUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageGetApiUsageResponse>

    /** Returns the amount of storage space and number of files a bucket takes up. */
    fun getBucketUsage(bucketName: String): CompletableFuture<UsageGetBucketUsageResponse> =
        getBucketUsage(bucketName, UsageGetBucketUsageParams.none())

    /** @see getBucketUsage */
    fun getBucketUsage(
        bucketName: String,
        params: UsageGetBucketUsageParams = UsageGetBucketUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageGetBucketUsageResponse> =
        getBucketUsage(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see getBucketUsage */
    fun getBucketUsage(
        bucketName: String,
        params: UsageGetBucketUsageParams = UsageGetBucketUsageParams.none(),
    ): CompletableFuture<UsageGetBucketUsageResponse> =
        getBucketUsage(bucketName, params, RequestOptions.none())

    /** @see getBucketUsage */
    fun getBucketUsage(
        params: UsageGetBucketUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageGetBucketUsageResponse>

    /** @see getBucketUsage */
    fun getBucketUsage(
        params: UsageGetBucketUsageParams
    ): CompletableFuture<UsageGetBucketUsageResponse> =
        getBucketUsage(params, RequestOptions.none())

    /** @see getBucketUsage */
    fun getBucketUsage(
        bucketName: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageGetBucketUsageResponse> =
        getBucketUsage(bucketName, UsageGetBucketUsageParams.none(), requestOptions)

    /** A view of [UsageServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /storage/buckets/{bucketName}/usage/api`, but is
         * otherwise the same as [UsageServiceAsync.getApiUsage].
         */
        fun getApiUsage(
            bucketName: String,
            params: UsageGetApiUsageParams,
        ): CompletableFuture<HttpResponseFor<UsageGetApiUsageResponse>> =
            getApiUsage(bucketName, params, RequestOptions.none())

        /** @see getApiUsage */
        fun getApiUsage(
            bucketName: String,
            params: UsageGetApiUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageGetApiUsageResponse>> =
            getApiUsage(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see getApiUsage */
        fun getApiUsage(
            params: UsageGetApiUsageParams
        ): CompletableFuture<HttpResponseFor<UsageGetApiUsageResponse>> =
            getApiUsage(params, RequestOptions.none())

        /** @see getApiUsage */
        fun getApiUsage(
            params: UsageGetApiUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageGetApiUsageResponse>>

        /**
         * Returns a raw HTTP response for `get /storage/buckets/{bucketName}/usage/storage`, but is
         * otherwise the same as [UsageServiceAsync.getBucketUsage].
         */
        fun getBucketUsage(
            bucketName: String
        ): CompletableFuture<HttpResponseFor<UsageGetBucketUsageResponse>> =
            getBucketUsage(bucketName, UsageGetBucketUsageParams.none())

        /** @see getBucketUsage */
        fun getBucketUsage(
            bucketName: String,
            params: UsageGetBucketUsageParams = UsageGetBucketUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageGetBucketUsageResponse>> =
            getBucketUsage(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see getBucketUsage */
        fun getBucketUsage(
            bucketName: String,
            params: UsageGetBucketUsageParams = UsageGetBucketUsageParams.none(),
        ): CompletableFuture<HttpResponseFor<UsageGetBucketUsageResponse>> =
            getBucketUsage(bucketName, params, RequestOptions.none())

        /** @see getBucketUsage */
        fun getBucketUsage(
            params: UsageGetBucketUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageGetBucketUsageResponse>>

        /** @see getBucketUsage */
        fun getBucketUsage(
            params: UsageGetBucketUsageParams
        ): CompletableFuture<HttpResponseFor<UsageGetBucketUsageResponse>> =
            getBucketUsage(params, RequestOptions.none())

        /** @see getBucketUsage */
        fun getBucketUsage(
            bucketName: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageGetBucketUsageResponse>> =
            getBucketUsage(bucketName, UsageGetBucketUsageParams.none(), requestOptions)
    }
}
