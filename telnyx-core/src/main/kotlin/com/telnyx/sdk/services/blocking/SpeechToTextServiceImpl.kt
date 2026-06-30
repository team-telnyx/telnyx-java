// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.handlers.errorBodyHandler
import com.telnyx.sdk.core.handlers.errorHandler
import com.telnyx.sdk.core.handlers.jsonHandler
import com.telnyx.sdk.core.http.HttpMethod
import com.telnyx.sdk.core.http.HttpRequest
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponse.Handler
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersParams
import com.telnyx.sdk.models.speechtotext.SpeechToTextListProvidersResponse
import java.util.function.Consumer

/** Discover available speech-to-text providers, models, and supported languages. */
class SpeechToTextServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpeechToTextService {

    private val withRawResponse: SpeechToTextService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpeechToTextService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeechToTextService =
        SpeechToTextServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listProviders(
        params: SpeechToTextListProvidersParams,
        requestOptions: RequestOptions,
    ): SpeechToTextListProvidersResponse =
        // get /speech-to-text/providers
        withRawResponse().listProviders(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpeechToTextService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeechToTextService.WithRawResponse =
            SpeechToTextServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listProvidersHandler: Handler<SpeechToTextListProvidersResponse> =
            jsonHandler<SpeechToTextListProvidersResponse>(clientOptions.jsonMapper)

        override fun listProviders(
            params: SpeechToTextListProvidersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SpeechToTextListProvidersResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(
                        if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl()
                        else "https://api.telnyx.com/v2"
                    )
                    .addPathSegments("speech-to-text", "providers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listProvidersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
