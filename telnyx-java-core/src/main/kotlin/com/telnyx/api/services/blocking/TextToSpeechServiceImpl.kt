// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

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
import com.telnyx.api.core.http.json
import com.telnyx.api.core.http.parseable
import com.telnyx.api.core.prepare
import com.telnyx.api.models.texttospeech.TextToSpeechGenerateSpeechParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesParams
import com.telnyx.api.models.texttospeech.TextToSpeechListVoicesResponse
import java.util.function.Consumer

class TextToSpeechServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TextToSpeechService {

    private val withRawResponse: TextToSpeechService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TextToSpeechService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TextToSpeechService =
        TextToSpeechServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun generateSpeech(
        params: TextToSpeechGenerateSpeechParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /text-to-speech/speech
        withRawResponse().generateSpeech(params, requestOptions)

    override fun listVoices(
        params: TextToSpeechListVoicesParams,
        requestOptions: RequestOptions,
    ): TextToSpeechListVoicesResponse =
        // get /text-to-speech/voices
        withRawResponse().listVoices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TextToSpeechService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TextToSpeechService.WithRawResponse =
            TextToSpeechServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun generateSpeech(
            params: TextToSpeechGenerateSpeechParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("text-to-speech", "speech")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val listVoicesHandler: Handler<TextToSpeechListVoicesResponse> =
            jsonHandler<TextToSpeechListVoicesResponse>(clientOptions.jsonMapper)

        override fun listVoices(
            params: TextToSpeechListVoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TextToSpeechListVoicesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("text-to-speech", "voices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listVoicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
