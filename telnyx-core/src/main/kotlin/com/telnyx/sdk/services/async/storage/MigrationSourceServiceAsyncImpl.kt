// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceCreateParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceCreateResponse
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceDeleteParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceDeleteResponse
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceListParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceListResponse
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceRetrieveParams
import com.telnyx.sdk.models.storage.migrationsources.MigrationSourceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MigrationSourceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MigrationSourceServiceAsync {

    private val withRawResponse: MigrationSourceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MigrationSourceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MigrationSourceServiceAsync =
        MigrationSourceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: MigrationSourceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationSourceCreateResponse> =
        // post /storage/migration_sources
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MigrationSourceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationSourceRetrieveResponse> =
        // get /storage/migration_sources/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MigrationSourceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationSourceListResponse> =
        // get /storage/migration_sources
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MigrationSourceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MigrationSourceDeleteResponse> =
        // delete /storage/migration_sources/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MigrationSourceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MigrationSourceServiceAsync.WithRawResponse =
            MigrationSourceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<MigrationSourceCreateResponse> =
            jsonHandler<MigrationSourceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: MigrationSourceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationSourceCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_sources")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<MigrationSourceRetrieveResponse> =
            jsonHandler<MigrationSourceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: MigrationSourceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationSourceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_sources", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<MigrationSourceListResponse> =
            jsonHandler<MigrationSourceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: MigrationSourceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationSourceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("storage", "migration_sources")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<MigrationSourceDeleteResponse> =
            jsonHandler<MigrationSourceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: MigrationSourceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MigrationSourceDeleteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
