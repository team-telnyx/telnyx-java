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
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepareAsync
import com.telnyx.api.models.connections.ConnectionListActiveCallsParams
import com.telnyx.api.models.connections.ConnectionListActiveCallsResponse
import com.telnyx.api.models.connections.ConnectionListParams
import com.telnyx.api.models.connections.ConnectionListResponse
import com.telnyx.api.models.connections.ConnectionRetrieveParams
import com.telnyx.api.models.connections.ConnectionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConnectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectionServiceAsync {

    private val withRawResponse: ConnectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConnectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectionServiceAsync =
        ConnectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionRetrieveResponse> =
        // get /connections/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ConnectionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionListResponse> =
        // get /connections
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listActiveCalls(
        params: ConnectionListActiveCallsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionListActiveCallsResponse> =
        // get /connections/{connection_id}/active_calls
        withRawResponse().listActiveCalls(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConnectionServiceAsync.WithRawResponse =
            ConnectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ConnectionRetrieveResponse> =
            jsonHandler<ConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("connections", params._pathParam(0))
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

        private val listHandler: Handler<ConnectionListResponse> =
            jsonHandler<ConnectionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConnectionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("connections")
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

        private val listActiveCallsHandler: Handler<ConnectionListActiveCallsResponse> =
            jsonHandler<ConnectionListActiveCallsResponse>(clientOptions.jsonMapper)

        override fun listActiveCalls(
            params: ConnectionListActiveCallsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionListActiveCallsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("connections", params._pathParam(0), "active_calls")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listActiveCallsHandler.handle(it) }
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
