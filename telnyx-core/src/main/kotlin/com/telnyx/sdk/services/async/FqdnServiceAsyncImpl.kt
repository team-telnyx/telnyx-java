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
import com.telnyx.sdk.models.fqdns.FqdnCreateParams
import com.telnyx.sdk.models.fqdns.FqdnCreateResponse
import com.telnyx.sdk.models.fqdns.FqdnDeleteParams
import com.telnyx.sdk.models.fqdns.FqdnDeleteResponse
import com.telnyx.sdk.models.fqdns.FqdnListPageAsync
import com.telnyx.sdk.models.fqdns.FqdnListPageResponse
import com.telnyx.sdk.models.fqdns.FqdnListParams
import com.telnyx.sdk.models.fqdns.FqdnRetrieveParams
import com.telnyx.sdk.models.fqdns.FqdnRetrieveResponse
import com.telnyx.sdk.models.fqdns.FqdnUpdateParams
import com.telnyx.sdk.models.fqdns.FqdnUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FqdnServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FqdnServiceAsync {

    private val withRawResponse: FqdnServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FqdnServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FqdnServiceAsync =
        FqdnServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: FqdnCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnCreateResponse> =
        // post /fqdns
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FqdnRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnRetrieveResponse> =
        // get /fqdns/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FqdnUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnUpdateResponse> =
        // patch /fqdns/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FqdnListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnListPageAsync> =
        // get /fqdns
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FqdnDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FqdnDeleteResponse> =
        // delete /fqdns/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FqdnServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FqdnServiceAsync.WithRawResponse =
            FqdnServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<FqdnCreateResponse> =
            jsonHandler<FqdnCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FqdnCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns")
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

        private val retrieveHandler: Handler<FqdnRetrieveResponse> =
            jsonHandler<FqdnRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FqdnRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns", params._pathParam(0))
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

        private val updateHandler: Handler<FqdnUpdateResponse> =
            jsonHandler<FqdnUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: FqdnUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns", params._pathParam(0))
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

        private val listHandler: Handler<FqdnListPageResponse> =
            jsonHandler<FqdnListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FqdnListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns")
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
                                FqdnListPageAsync.builder()
                                    .service(FqdnServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<FqdnDeleteResponse> =
            jsonHandler<FqdnDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: FqdnDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FqdnDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("fqdns", params._pathParam(0))
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
