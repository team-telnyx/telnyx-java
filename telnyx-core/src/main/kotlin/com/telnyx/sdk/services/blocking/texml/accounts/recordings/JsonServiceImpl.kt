// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.texml.accounts.recordings

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.checkRequired
import com.telnyx.sdk.core.handlers.emptyHandler
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
import com.telnyx.sdk.models.texml.accounts.TexmlGetCallRecordingResponseBody
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonDeleteRecordingSidJsonParams
import com.telnyx.sdk.models.texml.accounts.recordings.json.JsonRetrieveRecordingSidJsonParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JsonServiceImpl internal constructor(private val clientOptions: ClientOptions) : JsonService {

    private val withRawResponse: JsonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JsonService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonService =
        JsonServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun deleteRecordingSidJson(
        params: JsonDeleteRecordingSidJsonParams,
        requestOptions: RequestOptions,
    ) {
        // delete /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json
        withRawResponse().deleteRecordingSidJson(params, requestOptions)
    }

    override fun retrieveRecordingSidJson(
        params: JsonRetrieveRecordingSidJsonParams,
        requestOptions: RequestOptions,
    ): TexmlGetCallRecordingResponseBody =
        // get /texml/Accounts/{account_sid}/Recordings/{recording_sid}.json
        withRawResponse().retrieveRecordingSidJson(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JsonService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JsonService.WithRawResponse =
            JsonServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteRecordingSidJsonHandler: Handler<Void?> = emptyHandler()

        override fun deleteRecordingSidJson(
            params: JsonDeleteRecordingSidJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingSid", params.recordingSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Recordings",
                        "${params._pathParam(1)}.json",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteRecordingSidJsonHandler.handle(it) }
            }
        }

        private val retrieveRecordingSidJsonHandler: Handler<TexmlGetCallRecordingResponseBody> =
            jsonHandler<TexmlGetCallRecordingResponseBody>(clientOptions.jsonMapper)

        override fun retrieveRecordingSidJson(
            params: JsonRetrieveRecordingSidJsonParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TexmlGetCallRecordingResponseBody> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingSid", params.recordingSid().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Recordings",
                        "${params._pathParam(1)}.json",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveRecordingSidJsonHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
