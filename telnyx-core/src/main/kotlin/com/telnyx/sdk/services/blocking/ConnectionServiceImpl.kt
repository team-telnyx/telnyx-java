// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.connections.ConnectionListActiveCallsPage
import com.telnyx.sdk.models.connections.ConnectionListActiveCallsPageResponse
import com.telnyx.sdk.models.connections.ConnectionListActiveCallsParams
import com.telnyx.sdk.models.connections.ConnectionListPage
import com.telnyx.sdk.models.connections.ConnectionListPageResponse
import com.telnyx.sdk.models.connections.ConnectionListParams
import com.telnyx.sdk.models.connections.ConnectionRetrieveParams
import com.telnyx.sdk.models.connections.ConnectionRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectionService {

    private val withRawResponse: ConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConnectionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectionService =
        ConnectionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): ConnectionRetrieveResponse =
        // get /connections/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ConnectionListParams,
        requestOptions: RequestOptions,
    ): ConnectionListPage =
        // get /connections
        withRawResponse().list(params, requestOptions).parse()

    override fun listActiveCalls(
        params: ConnectionListActiveCallsParams,
        requestOptions: RequestOptions,
    ): ConnectionListActiveCallsPage =
        // get /connections/{connection_id}/active_calls
        withRawResponse().listActiveCalls(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConnectionService.WithRawResponse =
            ConnectionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ConnectionRetrieveResponse> =
            jsonHandler<ConnectionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("connections", params._pathParam(0))
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

        private val listHandler: Handler<ConnectionListPageResponse> =
            jsonHandler<ConnectionListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("connections")
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
                    .let {
                        ConnectionListPage.builder()
                            .service(ConnectionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listActiveCallsHandler: Handler<ConnectionListActiveCallsPageResponse> =
            jsonHandler<ConnectionListActiveCallsPageResponse>(clientOptions.jsonMapper)

        override fun listActiveCalls(
            params: ConnectionListActiveCallsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionListActiveCallsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("connectionId", params.connectionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("connections", params._pathParam(0), "active_calls")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listActiveCallsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ConnectionListActiveCallsPage.builder()
                            .service(ConnectionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
