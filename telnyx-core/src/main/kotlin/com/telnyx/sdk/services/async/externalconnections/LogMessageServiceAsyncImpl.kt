// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

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
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageDismissParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageDismissResponse
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListPageAsync
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListPageResponse
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageRetrieveParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LogMessageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LogMessageServiceAsync {

    private val withRawResponse: LogMessageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LogMessageServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogMessageServiceAsync =
        LogMessageServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: LogMessageRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogMessageRetrieveResponse> =
        // get /external_connections/log_messages/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: LogMessageListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogMessageListPageAsync> =
        // get /external_connections/log_messages
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun dismiss(
        params: LogMessageDismissParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LogMessageDismissResponse> =
        // delete /external_connections/log_messages/{id}
        withRawResponse().dismiss(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LogMessageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LogMessageServiceAsync.WithRawResponse =
            LogMessageServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<LogMessageRetrieveResponse> =
            jsonHandler<LogMessageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LogMessageRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogMessageRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", "log_messages", params._pathParam(0))
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

        private val listHandler: Handler<LogMessageListPageResponse> =
            jsonHandler<LogMessageListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LogMessageListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogMessageListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", "log_messages")
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
                                LogMessageListPageAsync.builder()
                                    .service(LogMessageServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val dismissHandler: Handler<LogMessageDismissResponse> =
            jsonHandler<LogMessageDismissResponse>(clientOptions.jsonMapper)

        override fun dismiss(
            params: LogMessageDismissParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LogMessageDismissResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", "log_messages", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { dismissHandler.handle(it) }
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
