// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml

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
import com.telnyx.sdk.models.texml.calls.CallInitiateParams
import com.telnyx.sdk.models.texml.calls.CallInitiateResponse
import com.telnyx.sdk.models.texml.calls.CallUpdateParams
import com.telnyx.sdk.models.texml.calls.CallUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CallServiceAsync {

    private val withRawResponse: CallServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CallServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync =
        CallServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallUpdateResponse> =
        // post /texml/calls/{call_sid}/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun initiate(
        params: CallInitiateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallInitiateResponse> =
        // post /texml/calls/{application_id}
        withRawResponse().initiate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallServiceAsync.WithRawResponse =
            CallServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<CallUpdateResponse> =
            jsonHandler<CallUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callSid", params.callSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "calls", params._pathParam(0), "update")
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

        private val initiateHandler: Handler<CallInitiateResponse> =
            jsonHandler<CallInitiateResponse>(clientOptions.jsonMapper)

        override fun initiate(
            params: CallInitiateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallInitiateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("applicationId", params.applicationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "calls", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { initiateHandler.handle(it) }
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
