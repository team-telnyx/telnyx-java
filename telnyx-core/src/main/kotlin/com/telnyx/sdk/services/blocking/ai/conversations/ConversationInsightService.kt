// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.conversations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesParams
import com.telnyx.sdk.models.ai.conversations.conversationinsights.ConversationInsightRetrieveAggregatesResponse
import java.util.function.Consumer

/** Manage historical AI assistant conversations */
interface ConversationInsightService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationInsightService

    /** Aggregate conversation insights by specified fields */
    fun retrieveAggregates(): ConversationInsightRetrieveAggregatesResponse =
        retrieveAggregates(ConversationInsightRetrieveAggregatesParams.none())

    /** @see retrieveAggregates */
    fun retrieveAggregates(
        params: ConversationInsightRetrieveAggregatesParams =
            ConversationInsightRetrieveAggregatesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationInsightRetrieveAggregatesResponse

    /** @see retrieveAggregates */
    fun retrieveAggregates(
        params: ConversationInsightRetrieveAggregatesParams =
            ConversationInsightRetrieveAggregatesParams.none()
    ): ConversationInsightRetrieveAggregatesResponse =
        retrieveAggregates(params, RequestOptions.none())

    /** @see retrieveAggregates */
    fun retrieveAggregates(
        requestOptions: RequestOptions
    ): ConversationInsightRetrieveAggregatesResponse =
        retrieveAggregates(ConversationInsightRetrieveAggregatesParams.none(), requestOptions)

    /**
     * A view of [ConversationInsightService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationInsightService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ai/conversations/conversation-insights/aggregates`,
         * but is otherwise the same as [ConversationInsightService.retrieveAggregates].
         */
        @MustBeClosed
        fun retrieveAggregates(): HttpResponseFor<ConversationInsightRetrieveAggregatesResponse> =
            retrieveAggregates(ConversationInsightRetrieveAggregatesParams.none())

        /** @see retrieveAggregates */
        @MustBeClosed
        fun retrieveAggregates(
            params: ConversationInsightRetrieveAggregatesParams =
                ConversationInsightRetrieveAggregatesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationInsightRetrieveAggregatesResponse>

        /** @see retrieveAggregates */
        @MustBeClosed
        fun retrieveAggregates(
            params: ConversationInsightRetrieveAggregatesParams =
                ConversationInsightRetrieveAggregatesParams.none()
        ): HttpResponseFor<ConversationInsightRetrieveAggregatesResponse> =
            retrieveAggregates(params, RequestOptions.none())

        /** @see retrieveAggregates */
        @MustBeClosed
        fun retrieveAggregates(
            requestOptions: RequestOptions
        ): HttpResponseFor<ConversationInsightRetrieveAggregatesResponse> =
            retrieveAggregates(ConversationInsightRetrieveAggregatesParams.none(), requestOptions)
    }
}
