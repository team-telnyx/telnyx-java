// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.AiRetrieveModelsParams
import com.telnyx.sdk.models.ai.AiRetrieveModelsResponse
import com.telnyx.sdk.models.ai.AiSummarizeParams
import com.telnyx.sdk.models.ai.AiSummarizeResponse
import com.telnyx.sdk.services.async.ai.AssistantServiceAsync
import com.telnyx.sdk.services.async.ai.AudioServiceAsync
import com.telnyx.sdk.services.async.ai.ChatServiceAsync
import com.telnyx.sdk.services.async.ai.ClusterServiceAsync
import com.telnyx.sdk.services.async.ai.ConversationServiceAsync
import com.telnyx.sdk.services.async.ai.EmbeddingServiceAsync
import com.telnyx.sdk.services.async.ai.FineTuningServiceAsync
import com.telnyx.sdk.services.async.ai.IntegrationServiceAsync
import com.telnyx.sdk.services.async.ai.McpServerServiceAsync
import com.telnyx.sdk.services.async.ai.MissionServiceAsync
import com.telnyx.sdk.services.async.ai.OpenAIServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Generate text with LLMs */
interface AiServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiServiceAsync

    /** Configure AI assistant specifications */
    fun assistants(): AssistantServiceAsync

    /** Turn audio into text or text into audio. */
    fun audio(): AudioServiceAsync

    /** Generate text with LLMs */
    fun chat(): ChatServiceAsync

    /** Identify common themes and patterns in your embedded documents */
    fun clusters(): ClusterServiceAsync

    /** Manage historical AI assistant conversations */
    fun conversations(): ConversationServiceAsync

    /** Embed documents and perform text searches */
    fun embeddings(): EmbeddingServiceAsync

    fun fineTuning(): FineTuningServiceAsync

    fun integrations(): IntegrationServiceAsync

    fun mcpServers(): McpServerServiceAsync

    fun missions(): MissionServiceAsync

    fun openai(): OpenAIServiceAsync

    /**
     * This endpoint returns a list of Open Source and OpenAI models that are available for use. <br
     * /><br /> **Note**: Model `id`'s will be in the form `{source}/{model_name}`. For example
     * `openai/gpt-4` or `mistralai/Mistral-7B-Instruct-v0.1` consistent with HuggingFace naming
     * conventions.
     */
    fun retrieveModels(): CompletableFuture<AiRetrieveModelsResponse> =
        retrieveModels(AiRetrieveModelsParams.none())

    /** @see retrieveModels */
    fun retrieveModels(
        params: AiRetrieveModelsParams = AiRetrieveModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiRetrieveModelsResponse>

    /** @see retrieveModels */
    fun retrieveModels(
        params: AiRetrieveModelsParams = AiRetrieveModelsParams.none()
    ): CompletableFuture<AiRetrieveModelsResponse> = retrieveModels(params, RequestOptions.none())

    /** @see retrieveModels */
    fun retrieveModels(
        requestOptions: RequestOptions
    ): CompletableFuture<AiRetrieveModelsResponse> =
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
    fun summarize(params: AiSummarizeParams): CompletableFuture<AiSummarizeResponse> =
        summarize(params, RequestOptions.none())

    /** @see summarize */
    fun summarize(
        params: AiSummarizeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AiSummarizeResponse>

    /** A view of [AiServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AiServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun assistants(): AssistantServiceAsync.WithRawResponse

        /** Turn audio into text or text into audio. */
        fun audio(): AudioServiceAsync.WithRawResponse

        /** Generate text with LLMs */
        fun chat(): ChatServiceAsync.WithRawResponse

        /** Identify common themes and patterns in your embedded documents */
        fun clusters(): ClusterServiceAsync.WithRawResponse

        /** Manage historical AI assistant conversations */
        fun conversations(): ConversationServiceAsync.WithRawResponse

        /** Embed documents and perform text searches */
        fun embeddings(): EmbeddingServiceAsync.WithRawResponse

        fun fineTuning(): FineTuningServiceAsync.WithRawResponse

        fun integrations(): IntegrationServiceAsync.WithRawResponse

        fun mcpServers(): McpServerServiceAsync.WithRawResponse

        fun missions(): MissionServiceAsync.WithRawResponse

        fun openai(): OpenAIServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/models`, but is otherwise the same as
         * [AiServiceAsync.retrieveModels].
         */
        fun retrieveModels(): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>> =
            retrieveModels(AiRetrieveModelsParams.none())

        /** @see retrieveModels */
        fun retrieveModels(
            params: AiRetrieveModelsParams = AiRetrieveModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>>

        /** @see retrieveModels */
        fun retrieveModels(
            params: AiRetrieveModelsParams = AiRetrieveModelsParams.none()
        ): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>> =
            retrieveModels(params, RequestOptions.none())

        /** @see retrieveModels */
        fun retrieveModels(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AiRetrieveModelsResponse>> =
            retrieveModels(AiRetrieveModelsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/summarize`, but is otherwise the same as
         * [AiServiceAsync.summarize].
         */
        fun summarize(
            params: AiSummarizeParams
        ): CompletableFuture<HttpResponseFor<AiSummarizeResponse>> =
            summarize(params, RequestOptions.none())

        /** @see summarize */
        fun summarize(
            params: AiSummarizeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AiSummarizeResponse>>
    }
}
