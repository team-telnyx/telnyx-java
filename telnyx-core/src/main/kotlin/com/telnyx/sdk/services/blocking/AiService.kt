// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.AiRetrieveModelsParams
import com.telnyx.sdk.models.ai.AiRetrieveModelsResponse
import com.telnyx.sdk.models.ai.AiSummarizeParams
import com.telnyx.sdk.models.ai.AiSummarizeResponse
import com.telnyx.sdk.services.blocking.ai.AssistantService
import com.telnyx.sdk.services.blocking.ai.AudioService
import com.telnyx.sdk.services.blocking.ai.ChatService
import com.telnyx.sdk.services.blocking.ai.ClusterService
import com.telnyx.sdk.services.blocking.ai.ConversationService
import com.telnyx.sdk.services.blocking.ai.EmbeddingService
import com.telnyx.sdk.services.blocking.ai.FineTuningService
import com.telnyx.sdk.services.blocking.ai.IntegrationService
import com.telnyx.sdk.services.blocking.ai.McpServerService
import com.telnyx.sdk.services.blocking.ai.OpenAIService
import java.util.function.Consumer

interface AiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiService

    fun assistants(): AssistantService

    fun audio(): AudioService

    fun chat(): ChatService

    fun clusters(): ClusterService

    fun conversations(): ConversationService

    fun embeddings(): EmbeddingService

    fun fineTuning(): FineTuningService

    fun integrations(): IntegrationService

    fun mcpServers(): McpServerService

    fun openai(): OpenAIService

    /**
     * This endpoint returns a list of Open Source and OpenAI models that are available for use. <br
     * /><br /> **Note**: Model `id`'s will be in the form `{source}/{model_name}`. For example
     * `openai/gpt-4` or `mistralai/Mistral-7B-Instruct-v0.1` consistent with HuggingFace naming
     * conventions.
     */
    fun retrieveModels(): AiRetrieveModelsResponse = retrieveModels(AiRetrieveModelsParams.none())

    /** @see retrieveModels */
    fun retrieveModels(
        params: AiRetrieveModelsParams = AiRetrieveModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiRetrieveModelsResponse

    /** @see retrieveModels */
    fun retrieveModels(
        params: AiRetrieveModelsParams = AiRetrieveModelsParams.none()
    ): AiRetrieveModelsResponse = retrieveModels(params, RequestOptions.none())

    /** @see retrieveModels */
    fun retrieveModels(requestOptions: RequestOptions): AiRetrieveModelsResponse =
        retrieveModels(AiRetrieveModelsParams.none(), requestOptions)

    /**
     * Generate a summary of a file's contents.
     *
     * Supports the following text formats:
     * - PDF, HTML, txt, json, csv
     *
     * Supports the following media formats (billed for both the transcription and summary):
     * - flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm
     * - Up to 100 MB
     */
    fun summarize(params: AiSummarizeParams): AiSummarizeResponse =
        summarize(params, RequestOptions.none())

    /** @see summarize */
    fun summarize(
        params: AiSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AiSummarizeResponse

    /** A view of [AiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiService.WithRawResponse

        fun assistants(): AssistantService.WithRawResponse

        fun audio(): AudioService.WithRawResponse

        fun chat(): ChatService.WithRawResponse

        fun clusters(): ClusterService.WithRawResponse

        fun conversations(): ConversationService.WithRawResponse

        fun embeddings(): EmbeddingService.WithRawResponse

        fun fineTuning(): FineTuningService.WithRawResponse

        fun integrations(): IntegrationService.WithRawResponse

        fun mcpServers(): McpServerService.WithRawResponse

        fun openai(): OpenAIService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/models`, but is otherwise the same as
         * [AiService.retrieveModels].
         */
        @MustBeClosed
        fun retrieveModels(): HttpResponseFor<AiRetrieveModelsResponse> =
            retrieveModels(AiRetrieveModelsParams.none())

        /** @see retrieveModels */
        @MustBeClosed
        fun retrieveModels(
            params: AiRetrieveModelsParams = AiRetrieveModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiRetrieveModelsResponse>

        /** @see retrieveModels */
        @MustBeClosed
        fun retrieveModels(
            params: AiRetrieveModelsParams = AiRetrieveModelsParams.none()
        ): HttpResponseFor<AiRetrieveModelsResponse> = retrieveModels(params, RequestOptions.none())

        /** @see retrieveModels */
        @MustBeClosed
        fun retrieveModels(
            requestOptions: RequestOptions
        ): HttpResponseFor<AiRetrieveModelsResponse> =
            retrieveModels(AiRetrieveModelsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/summarize`, but is otherwise the same as
         * [AiService.summarize].
         */
        @MustBeClosed
        fun summarize(params: AiSummarizeParams): HttpResponseFor<AiSummarizeResponse> =
            summarize(params, RequestOptions.none())

        /** @see summarize */
        @MustBeClosed
        fun summarize(
            params: AiSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AiSummarizeResponse>
    }
}
