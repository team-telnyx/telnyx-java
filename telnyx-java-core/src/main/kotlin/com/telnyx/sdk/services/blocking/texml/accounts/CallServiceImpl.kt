// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts

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
import com.telnyx.sdk.models.texml.accounts.calls.CallCallsParams
import com.telnyx.sdk.models.texml.accounts.calls.CallCallsResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveCallsParams
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveCallsResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveParams
import com.telnyx.sdk.models.texml.accounts.calls.CallRetrieveResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallSiprecJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.CallSiprecJsonResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallStreamsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.CallStreamsJsonResponse
import com.telnyx.sdk.models.texml.accounts.calls.CallUpdateParams
import com.telnyx.sdk.models.texml.accounts.calls.CallUpdateResponse
import com.telnyx.sdk.services.blocking.texml.accounts.calls.RecordingService
import com.telnyx.sdk.services.blocking.texml.accounts.calls.RecordingServiceImpl
import com.telnyx.sdk.services.blocking.texml.accounts.calls.RecordingsJsonService
import com.telnyx.sdk.services.blocking.texml.accounts.calls.RecordingsJsonServiceImpl
import com.telnyx.sdk.services.blocking.texml.accounts.calls.SiprecService
import com.telnyx.sdk.services.blocking.texml.accounts.calls.SiprecServiceImpl
import com.telnyx.sdk.services.blocking.texml.accounts.calls.StreamService
import com.telnyx.sdk.services.blocking.texml.accounts.calls.StreamServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** TeXML REST Commands */
class CallServiceImpl internal constructor(private val clientOptions: ClientOptions) : CallService {

    private val withRawResponse: CallService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recordingsJson: RecordingsJsonService by lazy {
        RecordingsJsonServiceImpl(clientOptions)
    }

    private val recordings: RecordingService by lazy { RecordingServiceImpl(clientOptions) }

    private val siprec: SiprecService by lazy { SiprecServiceImpl(clientOptions) }

    private val streams: StreamService by lazy { StreamServiceImpl(clientOptions) }

    override fun withRawResponse(): CallService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CallService =
        CallServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** TeXML REST Commands */
    override fun recordingsJson(): RecordingsJsonService = recordingsJson

    /** TeXML REST Commands */
    override fun recordings(): RecordingService = recordings

    /** TeXML REST Commands */
    override fun siprec(): SiprecService = siprec

    /** TeXML REST Commands */
    override fun streams(): StreamService = streams

    override fun retrieve(
        params: CallRetrieveParams,
        requestOptions: RequestOptions,
    ): CallRetrieveResponse =
        // get /texml/Accounts/{account_sid}/Calls/{call_sid}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CallUpdateParams,
        requestOptions: RequestOptions,
    ): CallUpdateResponse =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}
        withRawResponse().update(params, requestOptions).parse()

    override fun calls(params: CallCallsParams, requestOptions: RequestOptions): CallCallsResponse =
        // post /texml/Accounts/{account_sid}/Calls
        withRawResponse().calls(params, requestOptions).parse()

    override fun retrieveCalls(
        params: CallRetrieveCallsParams,
        requestOptions: RequestOptions,
    ): CallRetrieveCallsResponse =
        // get /texml/Accounts/{account_sid}/Calls
        withRawResponse().retrieveCalls(params, requestOptions).parse()

    override fun siprecJson(
        params: CallSiprecJsonParams,
        requestOptions: RequestOptions,
    ): CallSiprecJsonResponse =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Siprec.json
        withRawResponse().siprecJson(params, requestOptions).parse()

    override fun streamsJson(
        params: CallStreamsJsonParams,
        requestOptions: RequestOptions,
    ): CallStreamsJsonResponse =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Streams.json
        withRawResponse().streamsJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CallService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val recordingsJson: RecordingsJsonService.WithRawResponse by lazy {
            RecordingsJsonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val recordings: RecordingService.WithRawResponse by lazy {
            RecordingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val siprec: SiprecService.WithRawResponse by lazy {
            SiprecServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val streams: StreamService.WithRawResponse by lazy {
            StreamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CallService.WithRawResponse =
            CallServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** TeXML REST Commands */
        override fun recordingsJson(): RecordingsJsonService.WithRawResponse = recordingsJson

        /** TeXML REST Commands */
        override fun recordings(): RecordingService.WithRawResponse = recordings

        /** TeXML REST Commands */
        override fun siprec(): SiprecService.WithRawResponse = siprec

        /** TeXML REST Commands */
        override fun streams(): StreamService.WithRawResponse = streams

        private val retrieveHandler: Handler<CallRetrieveResponse> =
            jsonHandler<CallRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CallRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallRetrieveResponse> {
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

        private val updateHandler: Handler<CallUpdateResponse> =
            jsonHandler<CallUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CallUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallUpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val callsHandler: Handler<CallCallsResponse> =
            jsonHandler<CallCallsResponse>(clientOptions.jsonMapper)

        override fun calls(
            params: CallCallsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallCallsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { callsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveCallsHandler: Handler<CallRetrieveCallsResponse> =
            jsonHandler<CallRetrieveCallsResponse>(clientOptions.jsonMapper)

        override fun retrieveCalls(
            params: CallRetrieveCallsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallRetrieveCallsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountSid", params.accountSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("texml", "Accounts", params._pathParam(0), "Calls")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveCallsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val siprecJsonHandler: Handler<CallSiprecJsonResponse> =
            jsonHandler<CallSiprecJsonResponse>(clientOptions.jsonMapper)

        override fun siprecJson(
            params: CallSiprecJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallSiprecJsonResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { siprecJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val streamsJsonHandler: Handler<CallStreamsJsonResponse> =
            jsonHandler<CallStreamsJsonResponse>(clientOptions.jsonMapper)

        override fun streamsJson(
            params: CallStreamsJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CallStreamsJsonResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
