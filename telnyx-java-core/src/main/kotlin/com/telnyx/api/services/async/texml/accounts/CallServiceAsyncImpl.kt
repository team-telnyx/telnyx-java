// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts

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
import com.telnyx.api.models.texml.accounts.calls.CallCallsParams
import com.telnyx.api.models.texml.accounts.calls.CallCallsResponse
import com.telnyx.api.models.texml.accounts.calls.CallRetrieveCallsParams
import com.telnyx.api.models.texml.accounts.calls.CallRetrieveCallsResponse
import com.telnyx.api.models.texml.accounts.calls.CallRetrieveParams
import com.telnyx.api.models.texml.accounts.calls.CallRetrieveResponse
import com.telnyx.api.models.texml.accounts.calls.CallSiprecJsonParams
import com.telnyx.api.models.texml.accounts.calls.CallSiprecJsonResponse
import com.telnyx.api.models.texml.accounts.calls.CallStreamsJsonParams
import com.telnyx.api.models.texml.accounts.calls.CallStreamsJsonResponse
import com.telnyx.api.models.texml.accounts.calls.CallUpdateParams
import com.telnyx.api.models.texml.accounts.calls.CallUpdateResponse
import com.telnyx.api.services.async.texml.accounts.calls.RecordingServiceAsync
import com.telnyx.api.services.async.texml.accounts.calls.RecordingServiceAsyncImpl
import com.telnyx.api.services.async.texml.accounts.calls.RecordingsJsonServiceAsync
import com.telnyx.api.services.async.texml.accounts.calls.RecordingsJsonServiceAsyncImpl
import com.telnyx.api.services.async.texml.accounts.calls.SiprecServiceAsync
import com.telnyx.api.services.async.texml.accounts.calls.SiprecServiceAsyncImpl
import com.telnyx.api.services.async.texml.accounts.calls.StreamServiceAsync
import com.telnyx.api.services.async.texml.accounts.calls.StreamServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CallServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CallServiceAsync {

    private val withRawResponse: CallServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recordingsJson: RecordingsJsonServiceAsync by lazy {
        RecordingsJsonServiceAsyncImpl(clientOptions)
    }

    private val recordings: RecordingServiceAsync by lazy {
        RecordingServiceAsyncImpl(clientOptions)
    }

    private val siprec: SiprecServiceAsync by lazy { SiprecServiceAsyncImpl(clientOptions) }

    private val streams: StreamServiceAsync by lazy { StreamServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CallServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallServiceAsync =
        CallServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun recordingsJson(): RecordingsJsonServiceAsync = recordingsJson

    override fun recordings(): RecordingServiceAsync = recordings

    override fun siprec(): SiprecServiceAsync = siprec

    override fun streams(): StreamServiceAsync = streams

    override fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallRetrieveResponse> =
        // get /texml/Accounts/{account_sid}/Calls/{call_sid}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallUpdateResponse> =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun calls(
        params: CallCallsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallCallsResponse> =
        // post /texml/Accounts/{account_sid}/Calls
        withRawResponse().calls(params, requestOptions).thenApply { it.parse() }

    override fun retrieveCalls(
        params: CallRetrieveCallsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallRetrieveCallsResponse> =
        // get /texml/Accounts/{account_sid}/Calls
        withRawResponse().retrieveCalls(params, requestOptions).thenApply { it.parse() }

    override fun siprecJson(
        params: CallSiprecJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallSiprecJsonResponse> =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec.json
        withRawResponse().siprecJson(params, requestOptions).thenApply { it.parse() }

    override fun streamsJson(
        params: CallStreamsJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CallStreamsJsonResponse> =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Streams.json
        withRawResponse().streamsJson(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val recordingsJson: RecordingsJsonServiceAsync.WithRawResponse by lazy {
            RecordingsJsonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordings: RecordingServiceAsync.WithRawResponse by lazy {
            RecordingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val siprec: SiprecServiceAsync.WithRawResponse by lazy {
            SiprecServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val streams: StreamServiceAsync.WithRawResponse by lazy {
            StreamServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallServiceAsync.WithRawResponse =
            CallServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun recordingsJson(): RecordingsJsonServiceAsync.WithRawResponse = recordingsJson

        override fun recordings(): RecordingServiceAsync.WithRawResponse = recordings

        override fun siprec(): SiprecServiceAsync.WithRawResponse = siprec

        override fun streams(): StreamServiceAsync.WithRawResponse = streams

        private val retrieveHandler: Handler<CallRetrieveResponse> =
            jsonHandler<CallRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callSid", params.callSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Calls",
                        params._pathParam(1),
                    )
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
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Calls",
                        params._pathParam(1),
                    )
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

        private val callsHandler: Handler<CallCallsResponse> =
            jsonHandler<CallCallsResponse>(clientOptions.jsonMapper)

        override fun calls(
            params: CallCallsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallCallsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Calls")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { callsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveCallsHandler: Handler<CallRetrieveCallsResponse> =
            jsonHandler<CallRetrieveCallsResponse>(clientOptions.jsonMapper)

        override fun retrieveCalls(
            params: CallRetrieveCallsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallRetrieveCallsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Calls")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveCallsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val siprecJsonHandler: Handler<CallSiprecJsonResponse> =
            jsonHandler<CallSiprecJsonResponse>(clientOptions.jsonMapper)

        override fun siprecJson(
            params: CallSiprecJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallSiprecJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callSid", params.callSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Calls",
                        params._pathParam(1),
                        "Siprec.json",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { siprecJsonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val streamsJsonHandler: Handler<CallStreamsJsonResponse> =
            jsonHandler<CallStreamsJsonResponse>(clientOptions.jsonMapper)

        override fun streamsJson(
            params: CallStreamsJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CallStreamsJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("callSid", params.callSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Calls",
                        params._pathParam(1),
                        "Streams.json",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { streamsJsonHandler.handle(it) }
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
