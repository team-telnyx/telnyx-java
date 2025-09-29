// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

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
import com.telnyx.sdk.models.recordingtranscriptions.RecordingTranscriptionDeleteParams
import com.telnyx.sdk.models.recordingtranscriptions.RecordingTranscriptionDeleteResponse
import com.telnyx.sdk.models.recordingtranscriptions.RecordingTranscriptionListParams
import com.telnyx.sdk.models.recordingtranscriptions.RecordingTranscriptionListResponse
import com.telnyx.sdk.models.recordingtranscriptions.RecordingTranscriptionRetrieveParams
import com.telnyx.sdk.models.recordingtranscriptions.RecordingTranscriptionRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RecordingTranscriptionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : RecordingTranscriptionService {

    private val withRawResponse: RecordingTranscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RecordingTranscriptionService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): RecordingTranscriptionService =
        RecordingTranscriptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: RecordingTranscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): RecordingTranscriptionRetrieveResponse =
        // get /recording_transcriptions/{recording_transcription_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RecordingTranscriptionListParams,
        requestOptions: RequestOptions,
    ): RecordingTranscriptionListResponse =
        // get /recording_transcriptions
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: RecordingTranscriptionDeleteParams,
        requestOptions: RequestOptions,
    ): RecordingTranscriptionDeleteResponse =
        // delete /recording_transcriptions/{recording_transcription_id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecordingTranscriptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecordingTranscriptionService.WithRawResponse =
            RecordingTranscriptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<RecordingTranscriptionRetrieveResponse> =
            jsonHandler<RecordingTranscriptionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: RecordingTranscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingTranscriptionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingTranscriptionId", params.recordingTranscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recording_transcriptions", params._pathParam(0))
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

        private val listHandler: Handler<RecordingTranscriptionListResponse> =
            jsonHandler<RecordingTranscriptionListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: RecordingTranscriptionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingTranscriptionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recording_transcriptions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<RecordingTranscriptionDeleteResponse> =
            jsonHandler<RecordingTranscriptionDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: RecordingTranscriptionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RecordingTranscriptionDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("recordingTranscriptionId", params.recordingTranscriptionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("recording_transcriptions", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
