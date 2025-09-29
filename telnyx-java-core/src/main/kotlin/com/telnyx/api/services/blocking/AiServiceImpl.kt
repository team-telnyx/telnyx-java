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
import com.telnyx.api.models.ai.AiRetrieveModelsParams
import com.telnyx.api.models.ai.AiRetrieveModelsResponse
import com.telnyx.api.models.ai.AiSummarizeParams
import com.telnyx.api.models.ai.AiSummarizeResponse
import com.telnyx.api.services.blocking.ai.AssistantService
import com.telnyx.api.services.blocking.ai.AssistantServiceImpl
import com.telnyx.api.services.blocking.ai.AudioService
import com.telnyx.api.services.blocking.ai.AudioServiceImpl
import com.telnyx.api.services.blocking.ai.ChatService
import com.telnyx.api.services.blocking.ai.ChatServiceImpl
import com.telnyx.api.services.blocking.ai.ClusterService
import com.telnyx.api.services.blocking.ai.ClusterServiceImpl
import com.telnyx.api.services.blocking.ai.ConversationService
import com.telnyx.api.services.blocking.ai.ConversationServiceImpl
import com.telnyx.api.services.blocking.ai.EmbeddingService
import com.telnyx.api.services.blocking.ai.EmbeddingServiceImpl
import com.telnyx.api.services.blocking.ai.FineTuningService
import com.telnyx.api.services.blocking.ai.FineTuningServiceImpl
import java.util.function.Consumer

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

    override fun withRawResponse(): AiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiService =
        AiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun assistants(): AssistantService = assistants

    override fun audio(): AudioService = audio

    override fun chat(): ChatService = chat

    override fun clusters(): ClusterService = clusters

    override fun conversations(): ConversationService = conversations

    override fun embeddings(): EmbeddingService = embeddings

    override fun fineTuning(): FineTuningService = fineTuning

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

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AiService.WithRawResponse =
            AiServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun assistants(): AssistantService.WithRawResponse = assistants

        override fun audio(): AudioService.WithRawResponse = audio

        override fun chat(): ChatService.WithRawResponse = chat

        override fun clusters(): ClusterService.WithRawResponse = clusters

        override fun conversations(): ConversationService.WithRawResponse = conversations

        override fun embeddings(): EmbeddingService.WithRawResponse = embeddings

        override fun fineTuning(): FineTuningService.WithRawResponse = fineTuning

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
