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
import com.telnyx.sdk.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** TeXML REST Commands */
class RecordingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RecordingServiceAsync {

    private val withRawResponse: RecordingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecordingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingServiceAsync =
        RecordingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun recordingSidJson(
        params: RecordingRecordingSidJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RecordingRecordingSidJsonResponse> =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings/{recording_sid}.json
        withRawResponse().recordingSidJson(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingServiceAsync.WithRawResponse =
            RecordingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val recordingSidJsonHandler: Handler<RecordingRecordingSidJsonResponse> =
            jsonHandler<RecordingRecordingSidJsonResponse>(clientOptions.jsonMapper)

        override fun recordingSidJson(
            params: RecordingRecordingSidJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RecordingRecordingSidJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingSid", params.recordingSid().getOrNull())
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
                        "Recordings",
                        "${params._pathParam(2)}.json",
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
                            .use { recordingSidJsonHandler.handle(it) }
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
