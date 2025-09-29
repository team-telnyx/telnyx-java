// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.storage.StorageListMigrationSourceCoverageParams
import com.telnyx.api.models.storage.StorageListMigrationSourceCoverageResponse
import com.telnyx.api.services.blocking.storage.BucketService
import com.telnyx.api.services.blocking.storage.BucketServiceImpl
import com.telnyx.api.services.blocking.storage.MigrationService
import com.telnyx.api.services.blocking.storage.MigrationServiceImpl
import com.telnyx.api.services.blocking.storage.MigrationSourceService
import com.telnyx.api.services.blocking.storage.MigrationSourceServiceImpl
import java.util.function.Consumer

class StorageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StorageService {

    private val withRawResponse: StorageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val buckets: BucketService by lazy { BucketServiceImpl(clientOptions) }

    private val migrationSources: MigrationSourceService by lazy {
        MigrationSourceServiceImpl(clientOptions)
    }

    private val migrations: MigrationService by lazy { MigrationServiceImpl(clientOptions) }

    override fun withRawResponse(): StorageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StorageService =
        StorageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun buckets(): BucketService = buckets

    override fun migrationSources(): MigrationSourceService = migrationSources

    override fun migrations(): MigrationService = migrations

    override fun listMigrationSourceCoverage(
        params: StorageListMigrationSourceCoverageParams,
        requestOptions: RequestOptions,
    ): StorageListMigrationSourceCoverageResponse =
        // get /storage/migration_source_coverage
        withRawResponse().listMigrationSourceCoverage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StorageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val buckets: BucketService.WithRawResponse by lazy {
            BucketServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val migrationSources: MigrationSourceService.WithRawResponse by lazy {
            MigrationSourceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val migrations: MigrationService.WithRawResponse by lazy {
            MigrationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StorageService.WithRawResponse =
            StorageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun buckets(): BucketService.WithRawResponse = buckets

        override fun migrationSources(): MigrationSourceService.WithRawResponse = migrationSources

        override fun migrations(): MigrationService.WithRawResponse = migrations

        private val listMigrationSourceCoverageHandler:
            Handler<StorageListMigrationSourceCoverageResponse> =
            jsonHandler<StorageListMigrationSourceCoverageResponse>(clientOptions.jsonMapper)

        override fun listMigrationSourceCoverage(
            params: StorageListMigrationSourceCoverageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StorageListMigrationSourceCoverageResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_source_coverage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
