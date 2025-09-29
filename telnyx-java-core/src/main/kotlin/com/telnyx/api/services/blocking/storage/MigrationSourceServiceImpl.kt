// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.storage

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.storage.migrationsources.MigrationSourceCreateParams
import com.telnyx.api.models.storage.migrationsources.MigrationSourceCreateResponse
import com.telnyx.api.models.storage.migrationsources.MigrationSourceDeleteParams
import com.telnyx.api.models.storage.migrationsources.MigrationSourceDeleteResponse
import com.telnyx.api.models.storage.migrationsources.MigrationSourceListParams
import com.telnyx.api.models.storage.migrationsources.MigrationSourceListResponse
import com.telnyx.api.models.storage.migrationsources.MigrationSourceRetrieveParams
import com.telnyx.api.models.storage.migrationsources.MigrationSourceRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MigrationSourceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MigrationSourceService {

    private val withRawResponse: MigrationSourceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MigrationSourceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MigrationSourceService =
        MigrationSourceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MigrationSourceCreateParams,
        requestOptions: RequestOptions,
    ): MigrationSourceCreateResponse =
        // post /storage/migration_sources
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MigrationSourceRetrieveParams,
        requestOptions: RequestOptions,
    ): MigrationSourceRetrieveResponse =
        // get /storage/migration_sources/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: MigrationSourceListParams,
        requestOptions: RequestOptions,
    ): MigrationSourceListResponse =
        // get /storage/migration_sources
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: MigrationSourceDeleteParams,
        requestOptions: RequestOptions,
    ): MigrationSourceDeleteResponse =
        // delete /storage/migration_sources/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationSourceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MigrationSourceService.WithRawResponse =
            MigrationSourceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MigrationSourceCreateResponse> =
            jsonHandler<MigrationSourceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MigrationSourceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSourceCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_sources")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<MigrationSourceRetrieveResponse> =
            jsonHandler<MigrationSourceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MigrationSourceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSourceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_sources", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<MigrationSourceListResponse> =
            jsonHandler<MigrationSourceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MigrationSourceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSourceListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_sources")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<MigrationSourceDeleteResponse> =
            jsonHandler<MigrationSourceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MigrationSourceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MigrationSourceDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_sources", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
