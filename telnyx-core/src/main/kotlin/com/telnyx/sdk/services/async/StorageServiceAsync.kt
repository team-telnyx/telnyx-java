// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.StorageListMigrationSourceCoverageParams
import com.telnyx.sdk.models.storage.StorageListMigrationSourceCoverageResponse
import com.telnyx.sdk.services.async.storage.BucketServiceAsync
import com.telnyx.sdk.services.async.storage.MigrationServiceAsync
import com.telnyx.sdk.services.async.storage.MigrationSourceServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Migrate data from an external provider into Telnyx Cloud Storage */
interface StorageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StorageServiceAsync

    /** Presigned object URL operations */
    fun buckets(): BucketServiceAsync

    /** Migrate data from an external provider into Telnyx Cloud Storage */
    fun migrationSources(): MigrationSourceServiceAsync

    /** Migrate data from an external provider into Telnyx Cloud Storage */
    fun migrations(): MigrationServiceAsync

    /** List Migration Source coverage */
    fun listMigrationSourceCoverage():
        CompletableFuture<StorageListMigrationSourceCoverageResponse> =
        listMigrationSourceCoverage(StorageListMigrationSourceCoverageParams.none())

    /** @see listMigrationSourceCoverage */
    fun listMigrationSourceCoverage(
        params: StorageListMigrationSourceCoverageParams =
            StorageListMigrationSourceCoverageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StorageListMigrationSourceCoverageResponse>

    /** @see listMigrationSourceCoverage */
    fun listMigrationSourceCoverage(
        params: StorageListMigrationSourceCoverageParams =
            StorageListMigrationSourceCoverageParams.none()
    ): CompletableFuture<StorageListMigrationSourceCoverageResponse> =
        listMigrationSourceCoverage(params, RequestOptions.none())

    /** @see listMigrationSourceCoverage */
    fun listMigrationSourceCoverage(
        requestOptions: RequestOptions
    ): CompletableFuture<StorageListMigrationSourceCoverageResponse> =
        listMigrationSourceCoverage(StorageListMigrationSourceCoverageParams.none(), requestOptions)

    /**
     * A view of [StorageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StorageServiceAsync.WithRawResponse

        /** Presigned object URL operations */
        fun buckets(): BucketServiceAsync.WithRawResponse

        /** Migrate data from an external provider into Telnyx Cloud Storage */
        fun migrationSources(): MigrationSourceServiceAsync.WithRawResponse

        /** Migrate data from an external provider into Telnyx Cloud Storage */
        fun migrations(): MigrationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /storage/migration_source_coverage`, but is
         * otherwise the same as [StorageServiceAsync.listMigrationSourceCoverage].
         */
        fun listMigrationSourceCoverage():
            CompletableFuture<HttpResponseFor<StorageListMigrationSourceCoverageResponse>> =
            listMigrationSourceCoverage(StorageListMigrationSourceCoverageParams.none())

        /** @see listMigrationSourceCoverage */
        fun listMigrationSourceCoverage(
            params: StorageListMigrationSourceCoverageParams =
                StorageListMigrationSourceCoverageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StorageListMigrationSourceCoverageResponse>>

        /** @see listMigrationSourceCoverage */
        fun listMigrationSourceCoverage(
            params: StorageListMigrationSourceCoverageParams =
                StorageListMigrationSourceCoverageParams.none()
        ): CompletableFuture<HttpResponseFor<StorageListMigrationSourceCoverageResponse>> =
            listMigrationSourceCoverage(params, RequestOptions.none())

        /** @see listMigrationSourceCoverage */
        fun listMigrationSourceCoverage(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StorageListMigrationSourceCoverageResponse>> =
            listMigrationSourceCoverage(
                StorageListMigrationSourceCoverageParams.none(),
                requestOptions,
            )
    }
}
