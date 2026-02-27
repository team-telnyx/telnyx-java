// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.messages.MessageListParams
import com.telnyx.sdk.models.ai.conversations.messages.MessageListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage historical AI assistant conversations */
interface MessageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageServiceAsync

    /**
     * Retrieve messages for a specific conversation, including tool calls made by the assistant.
     */
    fun list(conversationId: String): CompletableFuture<MessageListResponse> =
        list(conversationId, MessageListParams.none())

    /** @see list */
    fun list(
        conversationId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse> =
        list(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see list */
    fun list(
        conversationId: String,
        params: MessageListParams = MessageListParams.none(),
    ): CompletableFuture<MessageListResponse> = list(conversationId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListResponse>

    /** @see list */
    fun list(params: MessageListParams): CompletableFuture<MessageListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListResponse> =
        list(conversationId, MessageListParams.none(), requestOptions)

    /**
     * A view of [MessageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/conversations/{conversation_id}/messages`, but
         * is otherwise the same as [MessageServiceAsync.list].
         */
        fun list(conversationId: String): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(conversationId, MessageListParams.none())

        /** @see list */
        fun list(
            conversationId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see list */
        fun list(
            conversationId: String,
            params: MessageListParams = MessageListParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(conversationId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListResponse>>

        /** @see list */
        fun list(
            params: MessageListParams
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListResponse>> =
            list(conversationId, MessageListParams.none(), requestOptions)
    }
}
