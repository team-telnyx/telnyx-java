// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

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
import com.telnyx.sdk.core.prepareAsync
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseParams
import com.telnyx.sdk.models.ai.openai.OpenAICreateResponseResponse
import com.telnyx.sdk.models.ai.openai.OpenAIListModelsParams
import com.telnyx.sdk.models.ai.openai.OpenAIListModelsResponse
import com.telnyx.sdk.services.async.ai.openai.ChatServiceAsync
import com.telnyx.sdk.services.async.ai.openai.ChatServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.openai.EmbeddingServiceAsync
import com.telnyx.sdk.services.async.ai.openai.EmbeddingServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class OpenAIServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OpenAIServiceAsync {

    private val withRawResponse: OpenAIServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val embeddings: EmbeddingServiceAsync by lazy {
        EmbeddingServiceAsyncImpl(clientOptions)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OpenAIServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIServiceAsync =
        OpenAIServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
    override fun embeddings(): EmbeddingServiceAsync = embeddings

    override fun chat(): ChatServiceAsync = chat

    override fun createResponse(
        params: OpenAICreateResponseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAICreateResponseResponse> =
        // post /ai/openai/responses
        withRawResponse().createResponse(params, requestOptions).thenApply { it.parse() }

    override fun listModels(
        params: OpenAIListModelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenAIListModelsResponse> =
        // get /ai/openai/models
        withRawResponse().listModels(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenAIServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val embeddings: EmbeddingServiceAsync.WithRawResponse by lazy {
            EmbeddingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenAIServiceAsync.WithRawResponse =
            OpenAIServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** OpenAI-compatible embeddings endpoints for generating vector representations of text */
        override fun embeddings(): EmbeddingServiceAsync.WithRawResponse = embeddings

        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        private val createResponseHandler: Handler<OpenAICreateResponseResponse> =
            jsonHandler<OpenAICreateResponseResponse>(clientOptions.jsonMapper)

        override fun createResponse(
            params: OpenAICreateResponseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAICreateResponseResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "openai", "responses")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createResponseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listModelsHandler: Handler<OpenAIListModelsResponse> =
            jsonHandler<OpenAIListModelsResponse>(clientOptions.jsonMapper)

        override fun listModels(
            params: OpenAIListModelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenAIListModelsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "openai", "models")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
