// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.Conversation
import com.telnyx.sdk.models.ai.conversations.ConversationAddMessageParams
import com.telnyx.sdk.models.ai.conversations.ConversationCreateParams
import com.telnyx.sdk.models.ai.conversations.ConversationDeleteParams
import com.telnyx.sdk.models.ai.conversations.ConversationListParams
import com.telnyx.sdk.models.ai.conversations.ConversationListResponse
import com.telnyx.sdk.models.ai.conversations.ConversationRetrieveConversationsInsightsParams
import com.telnyx.sdk.models.ai.conversations.ConversationRetrieveConversationsInsightsResponse
import com.telnyx.sdk.models.ai.conversations.ConversationRetrieveParams
import com.telnyx.sdk.models.ai.conversations.ConversationRetrieveResponse
import com.telnyx.sdk.models.ai.conversations.ConversationUpdateParams
import com.telnyx.sdk.models.ai.conversations.ConversationUpdateResponse
import com.telnyx.sdk.services.blocking.ai.conversations.InsightGroupService
import com.telnyx.sdk.services.blocking.ai.conversations.InsightService
import com.telnyx.sdk.services.blocking.ai.conversations.MessageService
import java.util.function.Consumer

interface ConversationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationService

    fun insightGroups(): InsightGroupService

    fun insights(): InsightService

    fun messages(): MessageService

    /** Create a new AI Conversation. */
    fun create(): Conversation = create(ConversationCreateParams.none())

    /** @see create */
    fun create(
        params: ConversationCreateParams = ConversationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Conversation

    /** @see create */
    fun create(params: ConversationCreateParams = ConversationCreateParams.none()): Conversation =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): Conversation =
        create(ConversationCreateParams.none(), requestOptions)

    /** Retrieve a specific AI conversation by its ID. */
    fun retrieve(conversationId: String): ConversationRetrieveResponse =
        retrieve(conversationId, ConversationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationRetrieveResponse =
        retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
    ): ConversationRetrieveResponse = retrieve(conversationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConversationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ConversationRetrieveParams): ConversationRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        requestOptions: RequestOptions,
    ): ConversationRetrieveResponse =
        retrieve(conversationId, ConversationRetrieveParams.none(), requestOptions)

    /** Update metadata for a specific conversation. */
    fun update(conversationId: String): ConversationUpdateResponse =
        update(conversationId, ConversationUpdateParams.none())

    /** @see update */
    fun update(
        conversationId: String,
        params: ConversationUpdateParams = ConversationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationUpdateResponse =
        update(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see update */
    fun update(
        conversationId: String,
        params: ConversationUpdateParams = ConversationUpdateParams.none(),
    ): ConversationUpdateResponse = update(conversationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConversationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationUpdateResponse

    /** @see update */
    fun update(params: ConversationUpdateParams): ConversationUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(conversationId: String, requestOptions: RequestOptions): ConversationUpdateResponse =
        update(conversationId, ConversationUpdateParams.none(), requestOptions)

    /**
     * Retrieve a list of all AI conversations configured by the user. Supports
     * [PostgREST-style query parameters](https://postgrest.org/en/stable/api.html#horizontal-filtering-rows)
     * for filtering. Examples are included for the standard metadata fields, but you can filter on
     * any field in the metadata JSON object. For example, to filter by a custom field
     * `metadata->custom_field`, use `metadata->custom_field=eq.value`.
     */
    fun list(): ConversationListResponse = list(ConversationListParams.none())

    /** @see list */
    fun list(
        params: ConversationListParams = ConversationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationListResponse

    /** @see list */
    fun list(
        params: ConversationListParams = ConversationListParams.none()
    ): ConversationListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ConversationListResponse =
        list(ConversationListParams.none(), requestOptions)

    /** Delete a specific conversation by its ID. */
    fun delete(conversationId: String) = delete(conversationId, ConversationDeleteParams.none())

    /** @see delete */
    fun delete(
        conversationId: String,
        params: ConversationDeleteParams = ConversationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        conversationId: String,
        params: ConversationDeleteParams = ConversationDeleteParams.none(),
    ) = delete(conversationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConversationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: ConversationDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(conversationId: String, requestOptions: RequestOptions) =
        delete(conversationId, ConversationDeleteParams.none(), requestOptions)

    /**
     * Add a new message to the conversation. Used to insert a new messages to a conversation
     * manually ( without using chat endpoint )
     */
    fun addMessage(conversationId: String, params: ConversationAddMessageParams) =
        addMessage(conversationId, params, RequestOptions.none())

    /** @see addMessage */
    fun addMessage(
        conversationId: String,
        params: ConversationAddMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addMessage(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see addMessage */
    fun addMessage(params: ConversationAddMessageParams) = addMessage(params, RequestOptions.none())

    /** @see addMessage */
    fun addMessage(
        params: ConversationAddMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Retrieve insights for a specific conversation */
    fun retrieveConversationsInsights(
        conversationId: String
    ): ConversationRetrieveConversationsInsightsResponse =
        retrieveConversationsInsights(
            conversationId,
            ConversationRetrieveConversationsInsightsParams.none(),
        )

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        conversationId: String,
        params: ConversationRetrieveConversationsInsightsParams =
            ConversationRetrieveConversationsInsightsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationRetrieveConversationsInsightsResponse =
        retrieveConversationsInsights(
            params.toBuilder().conversationId(conversationId).build(),
            requestOptions,
        )

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        conversationId: String,
        params: ConversationRetrieveConversationsInsightsParams =
            ConversationRetrieveConversationsInsightsParams.none(),
    ): ConversationRetrieveConversationsInsightsResponse =
        retrieveConversationsInsights(conversationId, params, RequestOptions.none())

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        params: ConversationRetrieveConversationsInsightsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConversationRetrieveConversationsInsightsResponse

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        params: ConversationRetrieveConversationsInsightsParams
    ): ConversationRetrieveConversationsInsightsResponse =
        retrieveConversationsInsights(params, RequestOptions.none())

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        conversationId: String,
        requestOptions: RequestOptions,
    ): ConversationRetrieveConversationsInsightsResponse =
        retrieveConversationsInsights(
            conversationId,
            ConversationRetrieveConversationsInsightsParams.none(),
            requestOptions,
        )

    /**
     * A view of [ConversationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConversationService.WithRawResponse

        fun insightGroups(): InsightGroupService.WithRawResponse

        fun insights(): InsightService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/conversations`, but is otherwise the same as
         * [ConversationService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<Conversation> = create(ConversationCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ConversationCreateParams = ConversationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Conversation>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ConversationCreateParams = ConversationCreateParams.none()
        ): HttpResponseFor<Conversation> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<Conversation> =
            create(ConversationCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/conversations/{conversation_id}`, but is
         * otherwise the same as [ConversationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(conversationId: String): HttpResponseFor<ConversationRetrieveResponse> =
            retrieve(conversationId, ConversationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationRetrieveResponse> =
            retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
        ): HttpResponseFor<ConversationRetrieveResponse> =
            retrieve(conversationId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConversationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConversationRetrieveParams
        ): HttpResponseFor<ConversationRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationRetrieveResponse> =
            retrieve(conversationId, ConversationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/conversations/{conversation_id}`, but is
         * otherwise the same as [ConversationService.update].
         */
        @MustBeClosed
        fun update(conversationId: String): HttpResponseFor<ConversationUpdateResponse> =
            update(conversationId, ConversationUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            conversationId: String,
            params: ConversationUpdateParams = ConversationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationUpdateResponse> =
            update(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            conversationId: String,
            params: ConversationUpdateParams = ConversationUpdateParams.none(),
        ): HttpResponseFor<ConversationUpdateResponse> =
            update(conversationId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ConversationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: ConversationUpdateParams): HttpResponseFor<ConversationUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationUpdateResponse> =
            update(conversationId, ConversationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/conversations`, but is otherwise the same as
         * [ConversationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ConversationListResponse> = list(ConversationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConversationListParams = ConversationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConversationListParams = ConversationListParams.none()
        ): HttpResponseFor<ConversationListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConversationListResponse> =
            list(ConversationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/conversations/{conversation_id}`, but is
         * otherwise the same as [ConversationService.delete].
         */
        @MustBeClosed
        fun delete(conversationId: String): HttpResponse =
            delete(conversationId, ConversationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            conversationId: String,
            params: ConversationDeleteParams = ConversationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            conversationId: String,
            params: ConversationDeleteParams = ConversationDeleteParams.none(),
        ): HttpResponse = delete(conversationId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ConversationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ConversationDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(conversationId: String, requestOptions: RequestOptions): HttpResponse =
            delete(conversationId, ConversationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/conversations/{conversation_id}/message`, but
         * is otherwise the same as [ConversationService.addMessage].
         */
        @MustBeClosed
        fun addMessage(conversationId: String, params: ConversationAddMessageParams): HttpResponse =
            addMessage(conversationId, params, RequestOptions.none())

        /** @see addMessage */
        @MustBeClosed
        fun addMessage(
            conversationId: String,
            params: ConversationAddMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            addMessage(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see addMessage */
        @MustBeClosed
        fun addMessage(params: ConversationAddMessageParams): HttpResponse =
            addMessage(params, RequestOptions.none())

        /** @see addMessage */
        @MustBeClosed
        fun addMessage(
            params: ConversationAddMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /ai/conversations/{conversation_id}/conversations-insights`, but is otherwise the same as
         * [ConversationService.retrieveConversationsInsights].
         */
        @MustBeClosed
        fun retrieveConversationsInsights(
            conversationId: String
        ): HttpResponseFor<ConversationRetrieveConversationsInsightsResponse> =
            retrieveConversationsInsights(
                conversationId,
                ConversationRetrieveConversationsInsightsParams.none(),
            )

        /** @see retrieveConversationsInsights */
        @MustBeClosed
        fun retrieveConversationsInsights(
            conversationId: String,
            params: ConversationRetrieveConversationsInsightsParams =
                ConversationRetrieveConversationsInsightsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationRetrieveConversationsInsightsResponse> =
            retrieveConversationsInsights(
                params.toBuilder().conversationId(conversationId).build(),
                requestOptions,
            )

        /** @see retrieveConversationsInsights */
        @MustBeClosed
        fun retrieveConversationsInsights(
            conversationId: String,
            params: ConversationRetrieveConversationsInsightsParams =
                ConversationRetrieveConversationsInsightsParams.none(),
        ): HttpResponseFor<ConversationRetrieveConversationsInsightsResponse> =
            retrieveConversationsInsights(conversationId, params, RequestOptions.none())

        /** @see retrieveConversationsInsights */
        @MustBeClosed
        fun retrieveConversationsInsights(
            params: ConversationRetrieveConversationsInsightsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConversationRetrieveConversationsInsightsResponse>

        /** @see retrieveConversationsInsights */
        @MustBeClosed
        fun retrieveConversationsInsights(
            params: ConversationRetrieveConversationsInsightsParams
        ): HttpResponseFor<ConversationRetrieveConversationsInsightsResponse> =
            retrieveConversationsInsights(params, RequestOptions.none())

        /** @see retrieveConversationsInsights */
        @MustBeClosed
        fun retrieveConversationsInsights(
            conversationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConversationRetrieveConversationsInsightsResponse> =
            retrieveConversationsInsights(
                conversationId,
                ConversationRetrieveConversationsInsightsParams.none(),
                requestOptions,
            )
    }
}
