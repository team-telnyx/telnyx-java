// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.ai.chat.ChatCreateCompletionParams
import com.telnyx.api.models.ai.chat.ChatCreateCompletionResponse
import java.util.function.Consumer

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
     * Chat with a language model. This endpoint is consistent with the
     * [OpenAI Chat Completions API](https://platform.openai.com/docs/api-reference/chat) and may be
     * used with the OpenAI JS or Python SDK.
     */
    fun createCompletion(params: ChatCreateCompletionParams): ChatCreateCompletionResponse =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCreateCompletionResponse

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
        @MustBeClosed
        fun createCompletion(
            params: ChatCreateCompletionParams
        ): HttpResponseFor<ChatCreateCompletionResponse> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        @MustBeClosed
        fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCreateCompletionResponse>
    }
}
