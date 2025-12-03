// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.multipartFormData
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.faxes.FaxCreateParams
import com.telnyx.sdk.models.faxes.FaxCreateResponse
import com.telnyx.sdk.models.faxes.FaxDeleteParams
import com.telnyx.sdk.models.faxes.FaxListParams
import com.telnyx.sdk.models.faxes.FaxListResponse
import com.telnyx.sdk.models.faxes.FaxRetrieveParams
import com.telnyx.sdk.models.faxes.FaxRetrieveResponse
import com.telnyx.sdk.services.async.faxes.ActionServiceAsync
import com.telnyx.sdk.services.async.faxes.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FaxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FaxServiceAsync {

    private val withRawResponse: FaxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FaxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FaxServiceAsync =
        FaxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: FaxCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxCreateResponse> =
        // post /faxes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FaxRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxRetrieveResponse> =
        // get /faxes/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FaxListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FaxListResponse> =
        // get /faxes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: FaxDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /faxes/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FaxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FaxServiceAsync.WithRawResponse =
            FaxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<FaxCreateResponse> =
            jsonHandler<FaxCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: FaxCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("faxes")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
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

        private val retrieveHandler: Handler<FaxRetrieveResponse> =
            jsonHandler<FaxRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FaxRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("faxes", params._pathParam(0))
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

        private val listHandler: Handler<FaxListResponse> =
            jsonHandler<FaxListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FaxListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FaxListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("faxes")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: FaxDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("faxes", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
