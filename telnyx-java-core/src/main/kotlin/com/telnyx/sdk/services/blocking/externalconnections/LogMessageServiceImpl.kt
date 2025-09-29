// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

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
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageDismissParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageDismissResponse
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageListResponse
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageRetrieveParams
import com.telnyx.sdk.models.externalconnections.logmessages.LogMessageRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LogMessageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LogMessageService {

    private val withRawResponse: LogMessageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LogMessageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogMessageService =
        LogMessageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: LogMessageRetrieveParams,
        requestOptions: RequestOptions,
    ): LogMessageRetrieveResponse =
        // get /external_connections/log_messages/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: LogMessageListParams,
        requestOptions: RequestOptions,
    ): LogMessageListResponse =
        // get /external_connections/log_messages
        withRawResponse().list(params, requestOptions).parse()

    override fun dismiss(
        params: LogMessageDismissParams,
        requestOptions: RequestOptions,
    ): LogMessageDismissResponse =
        // delete /external_connections/log_messages/{id}
        withRawResponse().dismiss(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LogMessageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LogMessageService.WithRawResponse =
            LogMessageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<LogMessageRetrieveResponse> =
            jsonHandler<LogMessageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LogMessageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogMessageRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", "log_messages", params._pathParam(0))
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

        private val listHandler: Handler<LogMessageListResponse> =
            jsonHandler<LogMessageListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LogMessageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogMessageListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("external_connections", "log_messages")
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
            }
        }

        private val dismissHandler: Handler<LogMessageDismissResponse> =
            jsonHandler<LogMessageDismissResponse>(clientOptions.jsonMapper)

        override fun dismiss(
            params: LogMessageDismissParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogMessageDismissResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
