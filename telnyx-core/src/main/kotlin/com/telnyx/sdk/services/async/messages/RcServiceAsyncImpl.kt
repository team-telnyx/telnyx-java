// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messages

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
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkParams
import com.telnyx.sdk.models.messages.rcs.RcGenerateDeeplinkResponse
import com.telnyx.sdk.models.messages.rcs.RcSendParams
import com.telnyx.sdk.models.messages.rcs.RcSendResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RcServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RcServiceAsync {

    private val withRawResponse: RcServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RcServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RcServiceAsync =
        RcServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun generateDeeplink(
        params: RcGenerateDeeplinkParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RcGenerateDeeplinkResponse> =
        // get /messages/rcs/deeplinks/{agent_id}
        withRawResponse().generateDeeplink(params, requestOptions).thenApply { it.parse() }

    override fun send(
        params: RcSendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RcSendResponse> =
        // post /messages/rcs
        withRawResponse().send(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RcServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RcServiceAsync.WithRawResponse =
            RcServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val generateDeeplinkHandler: Handler<RcGenerateDeeplinkResponse> =
            jsonHandler<RcGenerateDeeplinkResponse>(clientOptions.jsonMapper)

        override fun generateDeeplink(
            params: RcGenerateDeeplinkParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RcGenerateDeeplinkResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("agentId", params.agentId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", "rcs", "deeplinks", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateDeeplinkHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendHandler: Handler<RcSendResponse> =
            jsonHandler<RcSendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: RcSendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RcSendResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("messages", "rcs")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendHandler.handle(it) }
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
