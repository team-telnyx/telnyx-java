// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.storage.StorageListMigrationSourceCoverageParams
import com.telnyx.sdk.models.storage.StorageListMigrationSourceCoverageResponse
import com.telnyx.sdk.services.async.storage.BucketServiceAsync
import com.telnyx.sdk.services.async.storage.BucketServiceAsyncImpl
import com.telnyx.sdk.services.async.storage.MigrationServiceAsync
import com.telnyx.sdk.services.async.storage.MigrationServiceAsyncImpl
import com.telnyx.sdk.services.async.storage.MigrationSourceServiceAsync
import com.telnyx.sdk.services.async.storage.MigrationSourceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Migrate data from an external provider into Telnyx Cloud Storage */
class StorageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StorageServiceAsync {

    private val withRawResponse: StorageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val buckets: BucketServiceAsync by lazy { BucketServiceAsyncImpl(clientOptions) }

    private val migrationSources: MigrationSourceServiceAsync by lazy {
        MigrationSourceServiceAsyncImpl(clientOptions)
    }

    private val migrations: MigrationServiceAsync by lazy {
        MigrationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): StorageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StorageServiceAsync =
        StorageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Presigned object URL operations */
    override fun buckets(): BucketServiceAsync = buckets

    /** Migrate data from an external provider into Telnyx Cloud Storage */
    override fun migrationSources(): MigrationSourceServiceAsync = migrationSources

    /** Migrate data from an external provider into Telnyx Cloud Storage */
    override fun migrations(): MigrationServiceAsync = migrations

    override fun listMigrationSourceCoverage(
        params: StorageListMigrationSourceCoverageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StorageListMigrationSourceCoverageResponse> =
        // get /storage/migration_source_coverage
        withRawResponse().listMigrationSourceCoverage(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StorageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val buckets: BucketServiceAsync.WithRawResponse by lazy {
            BucketServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val migrationSources: MigrationSourceServiceAsync.WithRawResponse by lazy {
            MigrationSourceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val migrations: MigrationServiceAsync.WithRawResponse by lazy {
            MigrationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StorageServiceAsync.WithRawResponse =
            StorageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Presigned object URL operations */
        override fun buckets(): BucketServiceAsync.WithRawResponse = buckets

        /** Migrate data from an external provider into Telnyx Cloud Storage */
        override fun migrationSources(): MigrationSourceServiceAsync.WithRawResponse =
            migrationSources

        /** Migrate data from an external provider into Telnyx Cloud Storage */
        override fun migrations(): MigrationServiceAsync.WithRawResponse = migrations

        private val listMigrationSourceCoverageHandler:
            Handler<StorageListMigrationSourceCoverageResponse> =
            jsonHandler<StorageListMigrationSourceCoverageResponse>(clientOptions.jsonMapper)

        override fun listMigrationSourceCoverage(
            params: StorageListMigrationSourceCoverageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StorageListMigrationSourceCoverageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_source_coverage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listMigrationSourceCoverageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
