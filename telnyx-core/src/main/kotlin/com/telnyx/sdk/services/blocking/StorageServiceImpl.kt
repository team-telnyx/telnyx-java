// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.storage.StorageListMigrationSourceCoverageParams
import com.telnyx.sdk.models.storage.StorageListMigrationSourceCoverageResponse
import com.telnyx.sdk.services.blocking.storage.BucketService
import com.telnyx.sdk.services.blocking.storage.BucketServiceImpl
import com.telnyx.sdk.services.blocking.storage.MigrationService
import com.telnyx.sdk.services.blocking.storage.MigrationServiceImpl
import com.telnyx.sdk.services.blocking.storage.MigrationSourceService
import com.telnyx.sdk.services.blocking.storage.MigrationSourceServiceImpl
import java.util.function.Consumer

/** Migrate data from an external provider into Telnyx Cloud Storage */
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

    /** Presigned object URL operations */
    override fun buckets(): BucketService = buckets

    /** Migrate data from an external provider into Telnyx Cloud Storage */
    override fun migrationSources(): MigrationSourceService = migrationSources

    /** Migrate data from an external provider into Telnyx Cloud Storage */
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

        /** Presigned object URL operations */
        override fun buckets(): BucketService.WithRawResponse = buckets

        /** Migrate data from an external provider into Telnyx Cloud Storage */
        override fun migrationSources(): MigrationSourceService.WithRawResponse = migrationSources

        /** Migrate data from an external provider into Telnyx Cloud Storage */
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
