// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.buckets

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageParams
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetApiUsageResponse
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetBucketUsageParams
import com.telnyx.sdk.models.storage.buckets.usage.UsageGetBucketUsageResponse
import java.util.function.Consumer

/** Bucket Usage operations */
interface UsageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService

    /**
     * Returns the detail on API usage on a bucket of a particular time period, group by method
     * category.
     */
    fun getApiUsage(bucketName: String, params: UsageGetApiUsageParams): UsageGetApiUsageResponse =
        getApiUsage(bucketName, params, RequestOptions.none())

    /** @see getApiUsage */
    fun getApiUsage(
        bucketName: String,
        params: UsageGetApiUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageGetApiUsageResponse =
        getApiUsage(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see getApiUsage */
    fun getApiUsage(params: UsageGetApiUsageParams): UsageGetApiUsageResponse =
        getApiUsage(params, RequestOptions.none())

    /** @see getApiUsage */
    fun getApiUsage(
        params: UsageGetApiUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageGetApiUsageResponse

    /** Returns the amount of storage space and number of files a bucket takes up. */
    fun getBucketUsage(bucketName: String): UsageGetBucketUsageResponse =
        getBucketUsage(bucketName, UsageGetBucketUsageParams.none())

    /** @see getBucketUsage */
    fun getBucketUsage(
        bucketName: String,
        params: UsageGetBucketUsageParams = UsageGetBucketUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageGetBucketUsageResponse =
        getBucketUsage(params.toBuilder().bucketName(bucketName).build(), requestOptions)

    /** @see getBucketUsage */
    fun getBucketUsage(
        bucketName: String,
        params: UsageGetBucketUsageParams = UsageGetBucketUsageParams.none(),
    ): UsageGetBucketUsageResponse = getBucketUsage(bucketName, params, RequestOptions.none())

    /** @see getBucketUsage */
    fun getBucketUsage(
        params: UsageGetBucketUsageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageGetBucketUsageResponse

    /** @see getBucketUsage */
    fun getBucketUsage(params: UsageGetBucketUsageParams): UsageGetBucketUsageResponse =
        getBucketUsage(params, RequestOptions.none())

    /** @see getBucketUsage */
    fun getBucketUsage(
        bucketName: String,
        requestOptions: RequestOptions,
    ): UsageGetBucketUsageResponse =
        getBucketUsage(bucketName, UsageGetBucketUsageParams.none(), requestOptions)

    /** A view of [UsageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /storage/buckets/{bucketName}/usage/api`, but is
         * otherwise the same as [UsageService.getApiUsage].
         */
        @MustBeClosed
        fun getApiUsage(
            bucketName: String,
            params: UsageGetApiUsageParams,
        ): HttpResponseFor<UsageGetApiUsageResponse> =
            getApiUsage(bucketName, params, RequestOptions.none())

        /** @see getApiUsage */
        @MustBeClosed
        fun getApiUsage(
            bucketName: String,
            params: UsageGetApiUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageGetApiUsageResponse> =
            getApiUsage(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see getApiUsage */
        @MustBeClosed
        fun getApiUsage(params: UsageGetApiUsageParams): HttpResponseFor<UsageGetApiUsageResponse> =
            getApiUsage(params, RequestOptions.none())

        /** @see getApiUsage */
        @MustBeClosed
        fun getApiUsage(
            params: UsageGetApiUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageGetApiUsageResponse>

        /**
         * Returns a raw HTTP response for `get /storage/buckets/{bucketName}/usage/storage`, but is
         * otherwise the same as [UsageService.getBucketUsage].
         */
        @MustBeClosed
        fun getBucketUsage(bucketName: String): HttpResponseFor<UsageGetBucketUsageResponse> =
            getBucketUsage(bucketName, UsageGetBucketUsageParams.none())

        /** @see getBucketUsage */
        @MustBeClosed
        fun getBucketUsage(
            bucketName: String,
            params: UsageGetBucketUsageParams = UsageGetBucketUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageGetBucketUsageResponse> =
            getBucketUsage(params.toBuilder().bucketName(bucketName).build(), requestOptions)

        /** @see getBucketUsage */
        @MustBeClosed
        fun getBucketUsage(
            bucketName: String,
            params: UsageGetBucketUsageParams = UsageGetBucketUsageParams.none(),
        ): HttpResponseFor<UsageGetBucketUsageResponse> =
            getBucketUsage(bucketName, params, RequestOptions.none())

        /** @see getBucketUsage */
        @MustBeClosed
        fun getBucketUsage(
            params: UsageGetBucketUsageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageGetBucketUsageResponse>

        /** @see getBucketUsage */
        @MustBeClosed
        fun getBucketUsage(
            params: UsageGetBucketUsageParams
        ): HttpResponseFor<UsageGetBucketUsageResponse> =
            getBucketUsage(params, RequestOptions.none())

        /** @see getBucketUsage */
        @MustBeClosed
        fun getBucketUsage(
            bucketName: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageGetBucketUsageResponse> =
            getBucketUsage(bucketName, UsageGetBucketUsageParams.none(), requestOptions)
    }
}
