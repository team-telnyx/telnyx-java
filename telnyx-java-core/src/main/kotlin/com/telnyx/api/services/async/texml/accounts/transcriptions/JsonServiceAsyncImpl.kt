// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.texml.accounts.transcriptions

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.checkRequired
import com.telnyx.api.core.handlers.emptyHandler
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
import com.telnyx.api.models.texml.accounts.transcriptions.json.JsonDeleteRecordingTranscriptionSidJsonParams
import com.telnyx.api.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonParams
import com.telnyx.api.models.texml.accounts.transcriptions.json.JsonRetrieveRecordingTranscriptionSidJsonResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class JsonServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JsonServiceAsync {

    private val withRawResponse: JsonServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JsonServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): JsonServiceAsync =
        JsonServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun deleteRecordingTranscriptionSidJson(
        params: JsonDeleteRecordingTranscriptionSidJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json
        withRawResponse().deleteRecordingTranscriptionSidJson(params, requestOptions).thenAccept {}

    override fun retrieveRecordingTranscriptionSidJson(
        params: JsonRetrieveRecordingTranscriptionSidJsonParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<JsonRetrieveRecordingTranscriptionSidJsonResponse> =
        // get /texml/Accounts/{account_sid}/Transcriptions/{recording_transcription_sid}.json
        withRawResponse().retrieveRecordingTranscriptionSidJson(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JsonServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JsonServiceAsync.WithRawResponse =
            JsonServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val deleteRecordingTranscriptionSidJsonHandler: Handler<Void?> = emptyHandler()

        override fun deleteRecordingTranscriptionSidJson(
            params: JsonDeleteRecordingTranscriptionSidJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "recordingTranscriptionSid",
                params.recordingTranscriptionSid().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Transcriptions",
                        "${params._pathParam(1)}.json",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteRecordingTranscriptionSidJsonHandler.handle(it) }
                    }
                }
        }

        private val retrieveRecordingTranscriptionSidJsonHandler:
            Handler<JsonRetrieveRecordingTranscriptionSidJsonResponse> =
            jsonHandler<JsonRetrieveRecordingTranscriptionSidJsonResponse>(clientOptions.jsonMapper)

        override fun retrieveRecordingTranscriptionSidJson(
            params: JsonRetrieveRecordingTranscriptionSidJsonParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<JsonRetrieveRecordingTranscriptionSidJsonResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "recordingTranscriptionSid",
                params.recordingTranscriptionSid().getOrNull(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "texml",
                        "Accounts",
                        params._pathParam(0),
                        "Transcriptions",
                        "${params._pathParam(1)}.json",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveRecordingTranscriptionSidJsonHandler.handle(it) }
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
