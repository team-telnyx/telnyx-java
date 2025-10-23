// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.texml.accounts.calls

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
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonResponse
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RecordingsJsonServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RecordingsJsonServiceAsync {

    private val withRawResponse: RecordingsJsonServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecordingsJsonServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RecordingsJsonServiceAsync =
        RecordingsJsonServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun recordingsJson(
        params: RecordingsJsonRecordingsJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingsJsonRecordingsJsonResponse> =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json
        withRawResponse().recordingsJson(params, requestOptions).thenApply { it.parse() }

    override fun retrieveRecordingsJson(
        params: RecordingsJsonRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingsJsonRetrieveRecordingsJsonResponse> =
        // get /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json
        withRawResponse().retrieveRecordingsJson(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingsJsonServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingsJsonServiceAsync.WithRawResponse =
            RecordingsJsonServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val recordingsJsonHandler: Handler<RecordingsJsonRecordingsJsonResponse> =
            jsonHandler<RecordingsJsonRecordingsJsonResponse>(clientOptions.jsonMapper)

        override fun recordingsJson(
            params: RecordingsJsonRecordingsJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRecordingsJsonResponse>> {
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
                        "Recordings.json",
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
                            .use { recordingsJsonHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveRecordingsJsonHandler:
            Handler<RecordingsJsonRetrieveRecordingsJsonResponse> =
            jsonHandler<RecordingsJsonRetrieveRecordingsJsonResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordingsJson(
            params: RecordingsJsonRetrieveRecordingsJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse>> {
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
                        "Recordings.json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRecordingsJsonHandler.handle(it) }
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
