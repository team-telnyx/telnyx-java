// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.handlers.errorBodyHandler
import com.telnyx.api.core.handlers.errorHandler
import com.telnyx.api.core.handlers.jsonHandler
import com.telnyx.api.core.http.HttpMethod
import com.telnyx.api.core.http.HttpRequest
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponse.Handler
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.core.http.multipartFormData
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.ai.audio.AudioTranscribeParams
import com.telnyx.api.models.ai.audio.AudioTranscribeResponse
import java.util.function.Consumer

class AudioServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AudioService {

    private val withRawResponse: AudioService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AudioService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AudioService =
        AudioServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun transcribe(
        params: AudioTranscribeParams,
        requestOptions: RequestOptions,
    ): AudioTranscribeResponse =
        // post /ai/audio/transcriptions
        withRawResponse().transcribe(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AudioService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AudioService.WithRawResponse =
            AudioServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val transcribeHandler: Handler<AudioTranscribeResponse> =
            jsonHandler<AudioTranscribeResponse>(clientOptions.jsonMapper)

        override fun transcribe(
            params: AudioTranscribeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AudioTranscribeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "audio", "transcriptions")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transcribeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
