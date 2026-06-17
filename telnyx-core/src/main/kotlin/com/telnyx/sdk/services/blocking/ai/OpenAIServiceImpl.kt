// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.ModelsResponse
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseParams
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseResponse
import com.telnyx.sdk.models.ai.openai.OpenAIListModelsParams
import com.telnyx.sdk.services.blocking.ai.openai.ChatService
import com.telnyx.sdk.services.blocking.ai.openai.ChatServiceImpl
import com.telnyx.sdk.services.blocking.ai.openai.EmbeddingService
import com.telnyx.sdk.services.blocking.ai.openai.EmbeddingServiceImpl
import java.util.function.Consumer

class OpenAIServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OpenAIService {

    private val withRawResponse: OpenAIService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val embeddings: EmbeddingService by lazy { EmbeddingServiceImpl(clientOptions) }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptions) }

    override fun withRawResponse(): OpenAIService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIService =
        OpenAIServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
    override fun embeddings(): EmbeddingService = embeddings

    override fun chat(): ChatService = chat

    override fun createResponse(
        params: OpenAICreateResponseParams,
        requestOptions: RequestOptions,
    ): OpenAICreateResponseResponse =
        // post /ai/openai/responses
        withRawResponse().createResponse(params, requestOptions).parse()

    override fun listModels(
        params: OpenAIListModelsParams,
        requestOptions: RequestOptions,
    ): ModelsResponse =
        // get /ai/openai/models
        withRawResponse().listModels(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenAIService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val embeddings: EmbeddingService.WithRawResponse by lazy {
            EmbeddingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenAIService.WithRawResponse =
            OpenAIServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
        override fun embeddings(): EmbeddingService.WithRawResponse = embeddings

        override fun chat(): ChatService.WithRawResponse = chat

        private val createResponseHandler: Handler<OpenAICreateResponseResponse> =
            jsonHandler<OpenAICreateResponseResponse>(clientOptions.jsonMapper)

        override fun createResponse(
            params: OpenAICreateResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenAICreateResponseResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "openai", "responses")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createResponseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listModelsHandler: Handler<ModelsResponse> =
            jsonHandler<ModelsResponse>(clientOptions.jsonMapper)

        override fun listModels(
            params: OpenAIListModelsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ModelsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "openai", "models")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listModelsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
