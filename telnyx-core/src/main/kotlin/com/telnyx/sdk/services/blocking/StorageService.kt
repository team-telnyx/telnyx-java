// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.storage.StorageListMigrationSourceCoverageParams
import com.telnyx.sdk.models.storage.StorageListMigrationSourceCoverageResponse
import com.telnyx.sdk.services.blocking.storage.BucketService
import com.telnyx.sdk.services.blocking.storage.MigrationService
import com.telnyx.sdk.services.blocking.storage.MigrationSourceService
import java.util.function.Consumer

interface StorageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StorageService

    fun buckets(): BucketService

    fun migrationSources(): MigrationSourceService

    fun migrations(): MigrationService

    /** List Migration Source coverage */
    fun listMigrationSourceCoverage(): StorageListMigrationSourceCoverageResponse =
        listMigrationSourceCoverage(StorageListMigrationSourceCoverageParams.none())

    /** @see listMigrationSourceCoverage */
    fun listMigrationSourceCoverage(
        params: StorageListMigrationSourceCoverageParams =
            StorageListMigrationSourceCoverageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StorageListMigrationSourceCoverageResponse

    /** @see listMigrationSourceCoverage */
    fun listMigrationSourceCoverage(
        params: StorageListMigrationSourceCoverageParams =
            StorageListMigrationSourceCoverageParams.none()
    ): StorageListMigrationSourceCoverageResponse =
        listMigrationSourceCoverage(params, RequestOptions.none())

    /** @see listMigrationSourceCoverage */
    fun listMigrationSourceCoverage(
        requestOptions: RequestOptions
    ): StorageListMigrationSourceCoverageResponse =
        listMigrationSourceCoverage(StorageListMigrationSourceCoverageParams.none(), requestOptions)

    /** A view of [StorageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StorageService.WithRawResponse

        fun buckets(): BucketService.WithRawResponse

        fun migrationSources(): MigrationSourceService.WithRawResponse

        fun migrations(): MigrationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /storage/migration_source_coverage`, but is
         * otherwise the same as [StorageService.listMigrationSourceCoverage].
         */
        @MustBeClosed
        fun listMigrationSourceCoverage():
            HttpResponseFor<StorageListMigrationSourceCoverageResponse> =
            listMigrationSourceCoverage(StorageListMigrationSourceCoverageParams.none())

        /** @see listMigrationSourceCoverage */
        @MustBeClosed
        fun listMigrationSourceCoverage(
            params: StorageListMigrationSourceCoverageParams =
                StorageListMigrationSourceCoverageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StorageListMigrationSourceCoverageResponse>

        /** @see listMigrationSourceCoverage */
        @MustBeClosed
        fun listMigrationSourceCoverage(
            params: StorageListMigrationSourceCoverageParams =
                StorageListMigrationSourceCoverageParams.none()
        ): HttpResponseFor<StorageListMigrationSourceCoverageResponse> =
            listMigrationSourceCoverage(params, RequestOptions.none())

        /** @see listMigrationSourceCoverage */
        @MustBeClosed
        fun listMigrationSourceCoverage(
            requestOptions: RequestOptions
        ): HttpResponseFor<StorageListMigrationSourceCoverageResponse> =
            listMigrationSourceCoverage(
                StorageListMigrationSourceCoverageParams.none(),
                requestOptions,
            )
    }
}
