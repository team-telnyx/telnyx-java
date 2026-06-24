// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.chat.ChatCompletionRequest
import com.telnyx.sdk.models.ai.chat.ChatCreateCompletionParams
import com.telnyx.sdk.models.ai.chat.ChatCreateCompletionResponse
import java.util.function.Consumer

/** Generate text with LLMs */
interface ChatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService

    /**
     * **Deprecated**: Use `POST /v2/ai/openai/chat/completions` instead. Chat with a language
     * model. This endpoint is consistent with the
     * [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat) and may be
     * used with the OpenAI JS or Python SDK.
     */
    @Deprecated("deprecated")
    fun createCompletion(params: ChatCreateCompletionParams): ChatCreateCompletionResponse =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    @Deprecated("deprecated")
    fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCreateCompletionResponse

    /** @see createCompletion */
    @Deprecated("deprecated")
    fun createCompletion(
        chatCompletionRequest: ChatCompletionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCreateCompletionResponse =
        createCompletion(
            ChatCreateCompletionParams.builder()
                .chatCompletionRequest(chatCompletionRequest)
                .build(),
            requestOptions,
        )

    /** @see createCompletion */
    @Deprecated("deprecated")
    fun createCompletion(
        chatCompletionRequest: ChatCompletionRequest
    ): ChatCreateCompletionResponse = createCompletion(chatCompletionRequest, RequestOptions.none())

    /** A view of [ChatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/chat/completions`, but is otherwise the same as
         * [ChatService.createCompletion].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createCompletion(
            params: ChatCreateCompletionParams
        ): HttpResponseFor<ChatCreateCompletionResponse> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCreateCompletionResponse>

        /** @see createCompletion */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createCompletion(
            chatCompletionRequest: ChatCompletionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCreateCompletionResponse> =
            createCompletion(
                ChatCreateCompletionParams.builder()
                    .chatCompletionRequest(chatCompletionRequest)
                    .build(),
                requestOptions,
            )

        /** @see createCompletion */
        @Deprecated("deprecated")
        @MustBeClosed
        fun createCompletion(
            chatCompletionRequest: ChatCompletionRequest
        ): HttpResponseFor<ChatCreateCompletionResponse> =
            createCompletion(chatCompletionRequest, RequestOptions.none())
    }
}
