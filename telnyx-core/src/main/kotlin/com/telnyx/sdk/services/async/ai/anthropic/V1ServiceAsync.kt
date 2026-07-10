// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.anthropic

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.anthropic.v1.V1MessagesParams
import com.telnyx.sdk.models.ai.anthropic.v1.V1MessagesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    /**
     * Send a message to a language model using the Anthropic Messages API format. This endpoint is
     * compatible with the [Anthropic Messages API](https://docs.anthropic.com/en/api/messages) and
     * may be used with the Anthropic JS or Python SDK by setting the base URL to
     * `https://api.telnyx.com/v2/ai/anthropic`.
     *
     * The endpoint translates Anthropic-format requests into Telnyx's inference internals, then
     * translates the response back to the Anthropic message shape. Streaming responses use
     * Anthropic SSE event types (`message_start`, `content_block_start`, `content_block_delta`,
     * `content_block_stop`, `message_delta`, `message_stop`).
     */
    fun messages(params: V1MessagesParams): CompletableFuture<V1MessagesResponse> =
        messages(params, RequestOptions.none())

    /** @see messages */
    fun messages(
        params: V1MessagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1MessagesResponse>

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/anthropic/v1/messages`, but is otherwise the
         * same as [V1ServiceAsync.messages].
         */
        fun messages(
            params: V1MessagesParams
        ): CompletableFuture<HttpResponseFor<V1MessagesResponse>> =
            messages(params, RequestOptions.none())

        /** @see messages */
        fun messages(
            params: V1MessagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1MessagesResponse>>
    }
}
