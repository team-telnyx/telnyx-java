// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

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
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.addresses.AddressCreateParams
import com.telnyx.api.models.addresses.AddressCreateResponse
import com.telnyx.api.models.addresses.AddressDeleteParams
import com.telnyx.api.models.addresses.AddressDeleteResponse
import com.telnyx.api.models.addresses.AddressListParams
import com.telnyx.api.models.addresses.AddressListResponse
import com.telnyx.api.models.addresses.AddressRetrieveParams
import com.telnyx.api.models.addresses.AddressRetrieveResponse
import com.telnyx.api.services.async.addresses.ActionServiceAsync
import com.telnyx.api.services.async.addresses.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AddressServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AddressServiceAsync {

    private val withRawResponse: AddressServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AddressServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AddressServiceAsync =
        AddressServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: AddressCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressCreateResponse> =
        // post /addresses
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AddressRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressRetrieveResponse> =
        // get /addresses/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AddressListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressListResponse> =
        // get /addresses
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AddressDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddressDeleteResponse> =
        // delete /addresses/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddressServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AddressServiceAsync.WithRawResponse =
            AddressServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<AddressCreateResponse> =
            jsonHandler<AddressCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AddressCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses")
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

        private val retrieveHandler: Handler<AddressRetrieveResponse> =
            jsonHandler<AddressRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AddressRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses", params._pathParam(0))
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

        private val listHandler: Handler<AddressListResponse> =
            jsonHandler<AddressListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AddressListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses")
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

        private val deleteHandler: Handler<AddressDeleteResponse> =
            jsonHandler<AddressDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AddressDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddressDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("addresses", params._pathParam(0))
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
