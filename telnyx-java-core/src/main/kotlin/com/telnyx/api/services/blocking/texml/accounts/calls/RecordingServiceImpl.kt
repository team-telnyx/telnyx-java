// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.texml.accounts.calls

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
import com.telnyx.api.core.prepare
import com.telnyx.api.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonParams
import com.telnyx.api.models.texml.accounts.calls.recordings.RecordingRecordingSidJsonResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RecordingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RecordingService {

    private val withRawResponse: RecordingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecordingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingService =
        RecordingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun recordingSidJson(
        params: RecordingRecordingSidJsonParams,
        requestOptions: RequestOptions,
    ): RecordingRecordingSidJsonResponse =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings/{recording_sid}.json
        withRawResponse().recordingSidJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingService.WithRawResponse =
            RecordingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val recordingSidJsonHandler: Handler<RecordingRecordingSidJsonResponse> =
            jsonHandler<RecordingRecordingSidJsonResponse>(clientOptions.jsonMapper)

        override fun recordingSidJson(
            params: RecordingRecordingSidJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingRecordingSidJsonResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
