// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.models.ai.AiRetrieveModelsParams
import com.telnyx.sdk.models.ai.AiRetrieveModelsResponse
import com.telnyx.sdk.models.ai.AiSummarizeParams
import com.telnyx.sdk.models.ai.AiSummarizeResponse
import com.telnyx.sdk.services.async.ai.AssistantServiceAsync
import com.telnyx.sdk.services.async.ai.AssistantServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.AudioServiceAsync
import com.telnyx.sdk.services.async.ai.AudioServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.ChatServiceAsync
import com.telnyx.sdk.services.async.ai.ChatServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.ClusterServiceAsync
import com.telnyx.sdk.services.async.ai.ClusterServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.ConversationServiceAsync
import com.telnyx.sdk.services.async.ai.ConversationServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.EmbeddingServiceAsync
import com.telnyx.sdk.services.async.ai.EmbeddingServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.FineTuningServiceAsync
import com.telnyx.sdk.services.async.ai.FineTuningServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.IntegrationServiceAsync
import com.telnyx.sdk.services.async.ai.IntegrationServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.McpServerServiceAsync
import com.telnyx.sdk.services.async.ai.McpServerServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.MissionServiceAsync
import com.telnyx.sdk.services.async.ai.MissionServiceAsyncImpl
import com.telnyx.sdk.services.async.ai.OpenAIServiceAsync
import com.telnyx.sdk.services.async.ai.OpenAIServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Generate text with LLMs */
class AiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AiServiceAsync {

    private val withRawResponse: AiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val assistants: AssistantServiceAsync by lazy {
        AssistantServiceAsyncImpl(clientOptions)
    }

    private val audio: AudioServiceAsync by lazy { AudioServiceAsyncImpl(clientOptions) }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    private val clusters: ClusterServiceAsync by lazy { ClusterServiceAsyncImpl(clientOptions) }

    private val conversations: ConversationServiceAsync by lazy {
        ConversationServiceAsyncImpl(clientOptions)
    }

    private val embeddings: EmbeddingServiceAsync by lazy {
        EmbeddingServiceAsyncImpl(clientOptions)
    }

    private val fineTuning: FineTuningServiceAsync by lazy {
        FineTuningServiceAsyncImpl(clientOptions)
    }

    private val integrations: IntegrationServiceAsync by lazy {
        IntegrationServiceAsyncImpl(clientOptions)
    }

    private val mcpServers: McpServerServiceAsync by lazy {
        McpServerServiceAsyncImpl(clientOptions)
    }

    private val missions: MissionServiceAsync by lazy { MissionServiceAsyncImpl(clientOptions) }

    private val openai: OpenAIServiceAsync by lazy { OpenAIServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiServiceAsync =
        AiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Configure AI assistant specifications */
    override fun assistants(): AssistantServiceAsync = assistants

    /** Turn audio into text or text into audio. */
    override fun audio(): AudioServiceAsync = audio

    /** Generate text with LLMs */
    override fun chat(): ChatServiceAsync = chat

    /** Identify common themes and patterns in your embedded documents */
    override fun clusters(): ClusterServiceAsync = clusters

    /** Manage historical AI assistant conversations */
    override fun conversations(): ConversationServiceAsync = conversations

    /** Embed documents and perform text searches */
    override fun embeddings(): EmbeddingServiceAsync = embeddings

    override fun fineTuning(): FineTuningServiceAsync = fineTuning

    override fun integrations(): IntegrationServiceAsync = integrations

    override fun mcpServers(): McpServerServiceAsync = mcpServers

    override fun missions(): MissionServiceAsync = missions

    override fun openai(): OpenAIServiceAsync = openai

    override fun retrieveModels(
        params: AiRetrieveModelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AiRetrieveModelsResponse> =
        // get /ai/models
        withRawResponse().retrieveModels(params, requestOptions).thenApply { it.parse() }

    override fun summarize(
        params: AiSummarizeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AiSummarizeResponse> =
        // post /ai/summarize
        withRawResponse().summarize(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val assistants: AssistantServiceAsync.WithRawResponse by lazy {
            AssistantServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val audio: AudioServiceAsync.WithRawResponse by lazy {
            AudioServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val clusters: ClusterServiceAsync.WithRawResponse by lazy {
            ClusterServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val conversations: ConversationServiceAsync.WithRawResponse by lazy {
            ConversationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val embeddings: EmbeddingServiceAsync.WithRawResponse by lazy {
            EmbeddingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val fineTuning: FineTuningServiceAsync.WithRawResponse by lazy {
            FineTuningServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val integrations: IntegrationServiceAsync.WithRawResponse by lazy {
            IntegrationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val mcpServers: McpServerServiceAsync.WithRawResponse by lazy {
            McpServerServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val missions: MissionServiceAsync.WithRawResponse by lazy {
            MissionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val openai: OpenAIServiceAsync.WithRawResponse by lazy {
            OpenAIServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiServiceAsync.WithRawResponse =
            AiServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Configure AI assistant specifications */
        override fun assistants(): AssistantServiceAsync.WithRawResponse = assistants

        /** Turn audio into text or text into audio. */
        override fun audio(): AudioServiceAsync.WithRawResponse = audio

        /** Generate text with LLMs */
        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        /** Identify common themes and patterns in your embedded documents */
        override fun clusters(): ClusterServiceAsync.WithRawResponse = clusters

        /** Manage historical AI assistant conversations */
        override fun conversations(): ConversationServiceAsync.WithRawResponse = conversations

        /** Embed documents and perform text searches */
        override fun embeddings(): EmbeddingServiceAsync.WithRawResponse = embeddings

        override fun fineTuning(): FineTuningServiceAsync.WithRawResponse = fineTuning

        override fun integrations(): IntegrationServiceAsync.WithRawResponse = integrations

        override fun mcpServers(): McpServerServiceAsync.WithRawResponse = mcpServers

        override fun missions(): MissionServiceAsync.WithRawResponse = missions

        override fun openai(): OpenAIServiceAsync.WithRawResponse = openai

        private val retrieveModelsHandler: Handler<AiRetrieveModelsResponse> =
            jsonHandler<AiRetrieveModelsResponse>(clientOptions.jsonMapper)

        override fun retrieveModels(
            params: AiRetrieveModelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "models")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveModelsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val summarizeHandler: Handler<AiSummarizeResponse> =
            jsonHandler<AiSummarizeResponse>(clientOptions.jsonMapper)

        override fun summarize(
            params: AiSummarizeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AiSummarizeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "summarize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { summarizeHandler.handle(it) }
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
