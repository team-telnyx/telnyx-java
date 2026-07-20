// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesParams
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Manage historical AI assistant conversations */
interface ConversationInsightServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationInsightServiceAsync

    /** Aggregate conversation insights by specified fields */
    fun retrieveAggregates(): CompletableFuture<ConversationInsightRetrieveAggregatesResponse> =
        retrieveAggregates(ConversationInsightRetrieveAggregatesParams.none())

    /** @see retrieveAggregates */
    fun retrieveAggregates(
        params: ConversationInsightRetrieveAggregatesParams =
            ConversationInsightRetrieveAggregatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationInsightRetrieveAggregatesResponse>

    /** @see retrieveAggregates */
    fun retrieveAggregates(
        params: ConversationInsightRetrieveAggregatesParams =
            ConversationInsightRetrieveAggregatesParams.none()
    ): CompletableFuture<ConversationInsightRetrieveAggregatesResponse> =
        retrieveAggregates(params, RequestOptions.none())

    /** @see retrieveAggregates */
    fun retrieveAggregates(
        requestOptions: RequestOptions
    ): CompletableFuture<ConversationInsightRetrieveAggregatesResponse> =
        retrieveAggregates(ConversationInsightRetrieveAggregatesParams.none(), requestOptions)

    /**
     * A view of [ConversationInsightServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationInsightServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/conversations/conversation-insights/aggregates`,
         * but is otherwise the same as [ConversationInsightServiceAsync.retrieveAggregates].
         */
        fun retrieveAggregates():
            CompletableFuture<HttpResponseFor<ConversationInsightRetrieveAggregatesResponse>> =
            retrieveAggregates(ConversationInsightRetrieveAggregatesParams.none())

        /** @see retrieveAggregates */
        fun retrieveAggregates(
            params: ConversationInsightRetrieveAggregatesParams =
                ConversationInsightRetrieveAggregatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationInsightRetrieveAggregatesResponse>>

        /** @see retrieveAggregates */
        fun retrieveAggregates(
            params: ConversationInsightRetrieveAggregatesParams =
                ConversationInsightRetrieveAggregatesParams.none()
        ): CompletableFuture<HttpResponseFor<ConversationInsightRetrieveAggregatesResponse>> =
            retrieveAggregates(params, RequestOptions.none())

        /** @see retrieveAggregates */
        fun retrieveAggregates(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConversationInsightRetrieveAggregatesResponse>> =
            retrieveAggregates(ConversationInsightRetrieveAggregatesParams.none(), requestOptions)
    }
}
