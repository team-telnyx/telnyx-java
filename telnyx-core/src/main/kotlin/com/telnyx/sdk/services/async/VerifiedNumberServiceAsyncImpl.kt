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
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberCreateResponse
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberDataWrapper
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberDeleteParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberListPageAsync
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberListPageResponse
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberListParams
import com.telnyx.sdk.models.verifiednumbers.VerifiedNumberRetrieveParams
import com.telnyx.sdk.services.async.verifiednumbers.ActionServiceAsync
import com.telnyx.sdk.services.async.verifiednumbers.ActionServiceAsyncImpl
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
    ): CompletableFuture<VerifiedNumberListPageAsync> =
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

        private val listHandler: Handler<VerifiedNumberListPageResponse> =
            jsonHandler<VerifiedNumberListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerifiedNumberListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerifiedNumberListPageAsync>> {
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
                            .let {
                                VerifiedNumberListPageAsync.builder()
                                    .service(VerifiedNumberServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
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
