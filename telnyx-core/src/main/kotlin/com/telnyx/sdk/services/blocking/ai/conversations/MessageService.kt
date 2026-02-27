// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.messages.MessageListParams
import com.telnyx.sdk.models.ai.conversations.messages.MessageListResponse
import java.util.function.Consumer

/** Manage historical AI assistant conversations */
interface MessageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService

    /**
     * Retrieve messages for a specific conversation, including tool calls made by the assistant.
     */
    fun list(conversationId: String): MessageListResponse =
        list(conversationId, MessageListParams.none())

    /** @see list */
    fun list(
        conversationId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse =
        list(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see list */
    fun list(
        conversationId: String,
        params: MessageListParams = MessageListParams.none(),
    ): MessageListResponse = list(conversationId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MessageListResponse

    /** @see list */
    fun list(params: MessageListParams): MessageListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(conversationId: String, requestOptions: RequestOptions): MessageListResponse =
        list(conversationId, MessageListParams.none(), requestOptions)

    /** A view of [MessageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/conversations/{conversation_id}/messages`, but
         * is otherwise the same as [MessageService.list].
         */
        @MustBeClosed
        fun list(conversationId: String): HttpResponseFor<MessageListResponse> =
            list(conversationId, MessageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            conversationId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse> =
            list(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            conversationId: String,
            params: MessageListParams = MessageListParams.none(),
        ): HttpResponseFor<MessageListResponse> =
            list(conversationId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MessageListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: MessageListParams): HttpResponseFor<MessageListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MessageListResponse> =
            list(conversationId, MessageListParams.none(), requestOptions)
    }
}
