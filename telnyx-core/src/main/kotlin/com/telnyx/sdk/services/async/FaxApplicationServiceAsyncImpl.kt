// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.faxapplications.FaxApplicationCreateParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationCreateResponse
import com.telnyx.sdk.models.faxapplications.FaxApplicationDeleteParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationDeleteResponse
import com.telnyx.sdk.models.faxapplications.FaxApplicationListPageAsync
import com.telnyx.sdk.models.faxapplications.FaxApplicationListPageResponse
import com.telnyx.sdk.models.faxapplications.FaxApplicationListParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationRetrieveParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationRetrieveResponse
import com.telnyx.sdk.models.faxapplications.FaxApplicationUpdateParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Fax Applications operations */
class FaxApplicationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : FaxApplicationServiceAsync {

    private val withRawResponse: FaxApplicationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FaxApplicationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): FaxApplicationServiceAsync =
        FaxApplicationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FaxApplicationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxApplicationCreateResponse> =
        // post /fax_applications
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FaxApplicationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxApplicationRetrieveResponse> =
        // get /fax_applications/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FaxApplicationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxApplicationUpdateResponse> =
        // patch /fax_applications/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FaxApplicationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxApplicationListPageAsync> =
        // get /fax_applications
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FaxApplicationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxApplicationDeleteResponse> =
        // delete /fax_applications/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FaxApplicationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FaxApplicationServiceAsync.WithRawResponse =
            FaxApplicationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FaxApplicationCreateResponse> =
            jsonHandler<FaxApplicationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FaxApplicationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxApplicationCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications")
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

        private val retrieveHandler: Handler<FaxApplicationRetrieveResponse> =
            jsonHandler<FaxApplicationRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FaxApplicationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxApplicationRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications", params._pathParam(0))
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

        private val updateHandler: Handler<FaxApplicationUpdateResponse> =
            jsonHandler<FaxApplicationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FaxApplicationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxApplicationUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<FaxApplicationListPageResponse> =
            jsonHandler<FaxApplicationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FaxApplicationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxApplicationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications")
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
                            .let {
                                FaxApplicationListPageAsync.builder()
                                    .service(FaxApplicationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<FaxApplicationDeleteResponse> =
            jsonHandler<FaxApplicationDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FaxApplicationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxApplicationDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fax_applications", params._pathParam(0))
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
