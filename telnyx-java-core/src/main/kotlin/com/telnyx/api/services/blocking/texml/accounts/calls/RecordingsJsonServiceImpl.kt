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
import com.telnyx.api.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonParams
import com.telnyx.api.models.texml.accounts.calls.recordingsjson.RecordingsJsonRecordingsJsonResponse
import com.telnyx.api.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonParams
import com.telnyx.api.models.texml.accounts.calls.recordingsjson.RecordingsJsonRetrieveRecordingsJsonResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RecordingsJsonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RecordingsJsonService {

    private val withRawResponse: RecordingsJsonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecordingsJsonService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecordingsJsonService =
        RecordingsJsonServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun recordingsJson(
        params: RecordingsJsonRecordingsJsonParams,
        requestOptions: RequestOptions,
    ): RecordingsJsonRecordingsJsonResponse =
        // post /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json
        withRawResponse().recordingsJson(params, requestOptions).parse()

    override fun retrieveRecordingsJson(
        params: RecordingsJsonRetrieveRecordingsJsonParams,
        requestOptions: RequestOptions,
    ): RecordingsJsonRetrieveRecordingsJsonResponse =
        // get /texml/Accounts/{account_sid}/Calls/{call_sid}/Recordings.json
        withRawResponse().retrieveRecordingsJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingsJsonService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingsJsonService.WithRawResponse =
            RecordingsJsonServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val recordingsJsonHandler: Handler<RecordingsJsonRecordingsJsonResponse> =
            jsonHandler<RecordingsJsonRecordingsJsonResponse>(clientOptions.jsonMapper)

        override fun recordingsJson(
            params: RecordingsJsonRecordingsJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingsJsonRecordingsJsonResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { recordingsJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<RecordingsJsonRetrieveRecordingsJsonResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
