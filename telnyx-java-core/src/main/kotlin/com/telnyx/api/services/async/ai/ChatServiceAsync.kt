// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.chat.ChatCreateCompletionParams
import com.telnyx.api.models.ai.chat.ChatCreateCompletionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync

    /**
     * Chat with a language model. This endpoint is consistent with the
     * [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat) and may be
     * used with the OpenAI JS or Python SDK.
     */
    fun createCompletion(
        params: ChatCreateCompletionParams
    ): CompletableFuture<ChatCreateCompletionResponse> =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCreateCompletionResponse>

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/chat/completions`, but is otherwise the same as
         * [ChatServiceAsync.createCompletion].
         */
        fun createCompletion(
            params: ChatCreateCompletionParams
        ): CompletableFuture<HttpResponseFor<ChatCreateCompletionResponse>> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCreateCompletionResponse>>
    }
}
