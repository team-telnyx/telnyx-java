// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.storage.StorageListMigrationSourceCoverageParams
import com.telnyx.api.models.storage.StorageListMigrationSourceCoverageResponse
import com.telnyx.api.services.async.storage.BucketServiceAsync
import com.telnyx.api.services.async.storage.BucketServiceAsyncImpl
import com.telnyx.api.services.async.storage.MigrationServiceAsync
import com.telnyx.api.services.async.storage.MigrationServiceAsyncImpl
import com.telnyx.api.services.async.storage.MigrationSourceServiceAsync
import com.telnyx.api.services.async.storage.MigrationSourceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    override fun buckets(): BucketServiceAsync = buckets

    override fun migrationSources(): MigrationSourceServiceAsync = migrationSources

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

        override fun buckets(): BucketServiceAsync.WithRawResponse = buckets

        override fun migrationSources(): MigrationSourceServiceAsync.WithRawResponse =
            migrationSources

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
