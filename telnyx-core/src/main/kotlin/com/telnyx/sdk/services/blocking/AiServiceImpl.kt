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
import com.telnyx.sdk.core.http.json
import com.telnyx.sdk.core.http.parseable
import com.telnyx.sdk.core.prepare
import com.telnyx.sdk.models.ai.AiRetrieveModelsParams
import com.telnyx.sdk.models.ai.AiRetrieveModelsResponse
import com.telnyx.sdk.models.ai.AiSummarizeParams
import com.telnyx.sdk.models.ai.AiSummarizeResponse
import com.telnyx.sdk.services.blocking.ai.AssistantService
import com.telnyx.sdk.services.blocking.ai.AssistantServiceImpl
import com.telnyx.sdk.services.blocking.ai.AudioService
import com.telnyx.sdk.services.blocking.ai.AudioServiceImpl
import com.telnyx.sdk.services.blocking.ai.ChatService
import com.telnyx.sdk.services.blocking.ai.ChatServiceImpl
import com.telnyx.sdk.services.blocking.ai.ClusterService
import com.telnyx.sdk.services.blocking.ai.ClusterServiceImpl
import com.telnyx.sdk.services.blocking.ai.ConversationService
import com.telnyx.sdk.services.blocking.ai.ConversationServiceImpl
import com.telnyx.sdk.services.blocking.ai.EmbeddingService
import com.telnyx.sdk.services.blocking.ai.EmbeddingServiceImpl
import com.telnyx.sdk.services.blocking.ai.FineTuningService
import com.telnyx.sdk.services.blocking.ai.FineTuningServiceImpl
import com.telnyx.sdk.services.blocking.ai.IntegrationService
import com.telnyx.sdk.services.blocking.ai.IntegrationServiceImpl
import com.telnyx.sdk.services.blocking.ai.McpServerService
import com.telnyx.sdk.services.blocking.ai.McpServerServiceImpl
import com.telnyx.sdk.services.blocking.ai.MissionService
import com.telnyx.sdk.services.blocking.ai.MissionServiceImpl
import com.telnyx.sdk.services.blocking.ai.OpenAIService
import com.telnyx.sdk.services.blocking.ai.OpenAIServiceImpl
import java.util.function.Consumer

/** Generate text with LLMs */
class AiServiceImpl internal constructor(private val clientOptions: ClientOptions) : AiService {

    private val withRawResponse: AiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val assistants: AssistantService by lazy { AssistantServiceImpl(clientOptions) }

    private val audio: AudioService by lazy { AudioServiceImpl(clientOptions) }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptions) }

    private val clusters: ClusterService by lazy { ClusterServiceImpl(clientOptions) }

    private val conversations: ConversationService by lazy {
        ConversationServiceImpl(clientOptions)
    }

    private val embeddings: EmbeddingService by lazy { EmbeddingServiceImpl(clientOptions) }

    private val fineTuning: FineTuningService by lazy { FineTuningServiceImpl(clientOptions) }

    private val integrations: IntegrationService by lazy { IntegrationServiceImpl(clientOptions) }

    private val mcpServers: McpServerService by lazy { McpServerServiceImpl(clientOptions) }

    private val missions: MissionService by lazy { MissionServiceImpl(clientOptions) }

    private val openai: OpenAIService by lazy { OpenAIServiceImpl(clientOptions) }

    override fun withRawResponse(): AiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiService =
        AiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Configure AI assistant specifications */
    override fun assistants(): AssistantService = assistants

    /** Turn audio into text or text into audio. */
    override fun audio(): AudioService = audio

    /** Generate text with LLMs */
    override fun chat(): ChatService = chat

    /** Identify common themes and patterns in your embedded documents */
    override fun clusters(): ClusterService = clusters

    /** Manage historical AI assistant conversations */
    override fun conversations(): ConversationService = conversations

    /** Embed documents and perform text searches */
    override fun embeddings(): EmbeddingService = embeddings

    override fun fineTuning(): FineTuningService = fineTuning

    override fun integrations(): IntegrationService = integrations

    override fun mcpServers(): McpServerService = mcpServers

    override fun missions(): MissionService = missions

    override fun openai(): OpenAIService = openai

    override fun retrieveModels(
        params: AiRetrieveModelsParams,
        requestOptions: RequestOptions,
    ): AiRetrieveModelsResponse =
        // get /ai/models
        withRawResponse().retrieveModels(params, requestOptions).parse()

    override fun summarize(
        params: AiSummarizeParams,
        requestOptions: RequestOptions,
    ): AiSummarizeResponse =
        // post /ai/summarize
        withRawResponse().summarize(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AiService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val assistants: AssistantService.WithRawResponse by lazy {
            AssistantServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val audio: AudioService.WithRawResponse by lazy {
            AudioServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val clusters: ClusterService.WithRawResponse by lazy {
            ClusterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val conversations: ConversationService.WithRawResponse by lazy {
            ConversationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val embeddings: EmbeddingService.WithRawResponse by lazy {
            EmbeddingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val fineTuning: FineTuningService.WithRawResponse by lazy {
            FineTuningServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val integrations: IntegrationService.WithRawResponse by lazy {
            IntegrationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mcpServers: McpServerService.WithRawResponse by lazy {
            McpServerServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val missions: MissionService.WithRawResponse by lazy {
            MissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val openai: OpenAIService.WithRawResponse by lazy {
            OpenAIServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiService.WithRawResponse =
            AiServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Configure AI assistant specifications */
        override fun assistants(): AssistantService.WithRawResponse = assistants

        /** Turn audio into text or text into audio. */
        override fun audio(): AudioService.WithRawResponse = audio

        /** Generate text with LLMs */
        override fun chat(): ChatService.WithRawResponse = chat

        /** Identify common themes and patterns in your embedded documents */
        override fun clusters(): ClusterService.WithRawResponse = clusters

        /** Manage historical AI assistant conversations */
        override fun conversations(): ConversationService.WithRawResponse = conversations

        /** Embed documents and perform text searches */
        override fun embeddings(): EmbeddingService.WithRawResponse = embeddings

        override fun fineTuning(): FineTuningService.WithRawResponse = fineTuning

        override fun integrations(): IntegrationService.WithRawResponse = integrations

        override fun mcpServers(): McpServerService.WithRawResponse = mcpServers

        override fun missions(): MissionService.WithRawResponse = missions

        override fun openai(): OpenAIService.WithRawResponse = openai

        private val retrieveModelsHandler: Handler<AiRetrieveModelsResponse> =
            jsonHandler<AiRetrieveModelsResponse>(clientOptions.jsonMapper)

        override fun retrieveModels(
            params: AiRetrieveModelsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AiRetrieveModelsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "models")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveModelsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val summarizeHandler: Handler<AiSummarizeResponse> =
            jsonHandler<AiSummarizeResponse>(clientOptions.jsonMapper)

        override fun summarize(
            params: AiSummarizeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AiSummarizeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ai", "summarize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
