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
import com.telnyx.api.models.verifiednumbers.VerifiedNumberCreateParams
import com.telnyx.api.models.verifiednumbers.VerifiedNumberCreateResponse
import com.telnyx.api.models.verifiednumbers.VerifiedNumberDataWrapper
import com.telnyx.api.models.verifiednumbers.VerifiedNumberDeleteParams
import com.telnyx.api.models.verifiednumbers.VerifiedNumberListParams
import com.telnyx.api.models.verifiednumbers.VerifiedNumberListResponse
import com.telnyx.api.models.verifiednumbers.VerifiedNumberRetrieveParams
import com.telnyx.api.services.async.verifiednumbers.ActionServiceAsync
import com.telnyx.api.services.async.verifiednumbers.ActionServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VerifiedNumberServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VerifiedNumberServiceAsync {

    private val withRawResponse: VerifiedNumberServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionServiceAsync by lazy { ActionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VerifiedNumberServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VerifiedNumberServiceAsync =
        VerifiedNumberServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionServiceAsync = actions

    override fun create(
        params: VerifiedNumberCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifiedNumberCreateResponse> =
        // post /verified_numbers
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: VerifiedNumberRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        // get /verified_numbers/{phone_number}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VerifiedNumberListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifiedNumberListResponse> =
        // get /verified_numbers
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: VerifiedNumberDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerifiedNumberDataWrapper> =
        // delete /verified_numbers/{phone_number}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerifiedNumberServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val actions: ActionServiceAsync.WithRawResponse by lazy {
            ActionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerifiedNumberServiceAsync.WithRawResponse =
            VerifiedNumberServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionServiceAsync.WithRawResponse = actions

        private val createHandler: Handler<VerifiedNumberCreateResponse> =
            jsonHandler<VerifiedNumberCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: VerifiedNumberCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers")
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

        private val retrieveHandler: Handler<VerifiedNumberDataWrapper> =
            jsonHandler<VerifiedNumberDataWrapper>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VerifiedNumberRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers", params._pathParam(0))
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

        private val listHandler: Handler<VerifiedNumberListResponse> =
            jsonHandler<VerifiedNumberListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerifiedNumberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers")
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

        private val deleteHandler: Handler<VerifiedNumberDataWrapper> =
            jsonHandler<VerifiedNumberDataWrapper>(clientOptions.jsonMapper)

        override fun delete(
            params: VerifiedNumberDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberDataWrapper>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("verified_numbers", params._pathParam(0))
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
