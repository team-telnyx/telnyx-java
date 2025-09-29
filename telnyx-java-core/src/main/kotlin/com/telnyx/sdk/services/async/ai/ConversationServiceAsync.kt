// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.conversations.Conversation
import com.telnyx.sdk.models.ai.conversations.ConversationAddMessageParams
import com.telnyx.sdk.models.ai.conversations.ConversationAddMessageResponse
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
import com.telnyx.sdk.services.async.ai.conversations.InsightGroupServiceAsync
import com.telnyx.sdk.services.async.ai.conversations.InsightServiceAsync
import com.telnyx.sdk.services.async.ai.conversations.MessageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConversationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConversationServiceAsync

    fun insightGroups(): InsightGroupServiceAsync

    fun insights(): InsightServiceAsync

    fun messages(): MessageServiceAsync

    /** Create a new AI Conversation. */
    fun create(): CompletableFuture<Conversation> = create(ConversationCreateParams.none())

    /** @see create */
    fun create(
        params: ConversationCreateParams = ConversationCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Conversation>

    /** @see create */
    fun create(
        params: ConversationCreateParams = ConversationCreateParams.none()
    ): CompletableFuture<Conversation> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<Conversation> =
        create(ConversationCreateParams.none(), requestOptions)

    /** Retrieve a specific AI conversation by its ID. */
    fun retrieve(conversationId: String): CompletableFuture<ConversationRetrieveResponse> =
        retrieve(conversationId, ConversationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationRetrieveResponse> =
        retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
    ): CompletableFuture<ConversationRetrieveResponse> =
        retrieve(conversationId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConversationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: ConversationRetrieveParams
    ): CompletableFuture<ConversationRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationRetrieveResponse> =
        retrieve(conversationId, ConversationRetrieveParams.none(), requestOptions)

    /** Update metadata for a specific conversation. */
    fun update(conversationId: String): CompletableFuture<ConversationUpdateResponse> =
        update(conversationId, ConversationUpdateParams.none())

    /** @see update */
    fun update(
        conversationId: String,
        params: ConversationUpdateParams = ConversationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationUpdateResponse> =
        update(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see update */
    fun update(
        conversationId: String,
        params: ConversationUpdateParams = ConversationUpdateParams.none(),
    ): CompletableFuture<ConversationUpdateResponse> =
        update(conversationId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ConversationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationUpdateResponse>

    /** @see update */
    fun update(params: ConversationUpdateParams): CompletableFuture<ConversationUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationUpdateResponse> =
        update(conversationId, ConversationUpdateParams.none(), requestOptions)

    /**
     * Retrieve a list of all AI conversations configured by the user. Supports
     * [PostgREST-style query parameters](https://postgrest.org/en/stable/api.html#horizontal-filtering-rows)
     * for filtering. Examples are included for the standard metadata fields, but you can filter on
     * any field in the metadata JSON object. For example, to filter by a custom field
     * `metadata->custom_field`, use `metadata->custom_field=eq.value`.
     */
    fun list(): CompletableFuture<ConversationListResponse> = list(ConversationListParams.none())

    /** @see list */
    fun list(
        params: ConversationListParams = ConversationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationListResponse>

    /** @see list */
    fun list(
        params: ConversationListParams = ConversationListParams.none()
    ): CompletableFuture<ConversationListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ConversationListResponse> =
        list(ConversationListParams.none(), requestOptions)

    /** Delete a specific conversation by its ID. */
    fun delete(conversationId: String): CompletableFuture<Void?> =
        delete(conversationId, ConversationDeleteParams.none())

    /** @see delete */
    fun delete(
        conversationId: String,
        params: ConversationDeleteParams = ConversationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see delete */
    fun delete(
        conversationId: String,
        params: ConversationDeleteParams = ConversationDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(conversationId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConversationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ConversationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(conversationId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(conversationId, ConversationDeleteParams.none(), requestOptions)

    /**
     * Add a new message to the conversation. Used to insert a new messages to a conversation
     * manually ( without using chat endpoint )
     */
    fun addMessage(
        conversationId: String,
        params: ConversationAddMessageParams,
    ): CompletableFuture<ConversationAddMessageResponse> =
        addMessage(conversationId, params, RequestOptions.none())

    /** @see addMessage */
    fun addMessage(
        conversationId: String,
        params: ConversationAddMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationAddMessageResponse> =
        addMessage(params.toBuilder().conversationId(conversationId).build(), requestOptions)

    /** @see addMessage */
    fun addMessage(
        params: ConversationAddMessageParams
    ): CompletableFuture<ConversationAddMessageResponse> = addMessage(params, RequestOptions.none())

    /** @see addMessage */
    fun addMessage(
        params: ConversationAddMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationAddMessageResponse>

    /** Retrieve insights for a specific conversation */
    fun retrieveConversationsInsights(
        conversationId: String
    ): CompletableFuture<ConversationRetrieveConversationsInsightsResponse> =
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
    ): CompletableFuture<ConversationRetrieveConversationsInsightsResponse> =
        retrieveConversationsInsights(
            params.toBuilder().conversationId(conversationId).build(),
            requestOptions,
        )

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        conversationId: String,
        params: ConversationRetrieveConversationsInsightsParams =
            ConversationRetrieveConversationsInsightsParams.none(),
    ): CompletableFuture<ConversationRetrieveConversationsInsightsResponse> =
        retrieveConversationsInsights(conversationId, params, RequestOptions.none())

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        params: ConversationRetrieveConversationsInsightsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConversationRetrieveConversationsInsightsResponse>

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        params: ConversationRetrieveConversationsInsightsParams
    ): CompletableFuture<ConversationRetrieveConversationsInsightsResponse> =
        retrieveConversationsInsights(params, RequestOptions.none())

    /** @see retrieveConversationsInsights */
    fun retrieveConversationsInsights(
        conversationId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConversationRetrieveConversationsInsightsResponse> =
        retrieveConversationsInsights(
            conversationId,
            ConversationRetrieveConversationsInsightsParams.none(),
            requestOptions,
        )

    /**
     * A view of [ConversationServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConversationServiceAsync.WithRawResponse

        fun insightGroups(): InsightGroupServiceAsync.WithRawResponse

        fun insights(): InsightServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/conversations`, but is otherwise the same as
         * [ConversationServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<Conversation>> =
            create(ConversationCreateParams.none())

        /** @see create */
        fun create(
            params: ConversationCreateParams = ConversationCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Conversation>>

        /** @see create */
        fun create(
            params: ConversationCreateParams = ConversationCreateParams.none()
        ): CompletableFuture<HttpResponseFor<Conversation>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<Conversation>> =
            create(ConversationCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/conversations/{conversation_id}`, but is
         * otherwise the same as [ConversationServiceAsync.retrieve].
         */
        fun retrieve(
            conversationId: String
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(conversationId, ConversationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            params: ConversationRetrieveParams = ConversationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(conversationId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ConversationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ConversationRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveResponse>> =
            retrieve(conversationId, ConversationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /ai/conversations/{conversation_id}`, but is
         * otherwise the same as [ConversationServiceAsync.update].
         */
        fun update(
            conversationId: String
        ): CompletableFuture<HttpResponseFor<ConversationUpdateResponse>> =
            update(conversationId, ConversationUpdateParams.none())

        /** @see update */
        fun update(
            conversationId: String,
            params: ConversationUpdateParams = ConversationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationUpdateResponse>> =
            update(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see update */
        fun update(
            conversationId: String,
            params: ConversationUpdateParams = ConversationUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ConversationUpdateResponse>> =
            update(conversationId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ConversationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationUpdateResponse>>

        /** @see update */
        fun update(
            params: ConversationUpdateParams
        ): CompletableFuture<HttpResponseFor<ConversationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationUpdateResponse>> =
            update(conversationId, ConversationUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/conversations`, but is otherwise the same as
         * [ConversationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ConversationListResponse>> =
            list(ConversationListParams.none())

        /** @see list */
        fun list(
            params: ConversationListParams = ConversationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationListResponse>>

        /** @see list */
        fun list(
            params: ConversationListParams = ConversationListParams.none()
        ): CompletableFuture<HttpResponseFor<ConversationListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConversationListResponse>> =
            list(ConversationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/conversations/{conversation_id}`, but is
         * otherwise the same as [ConversationServiceAsync.delete].
         */
        fun delete(conversationId: String): CompletableFuture<HttpResponse> =
            delete(conversationId, ConversationDeleteParams.none())

        /** @see delete */
        fun delete(
            conversationId: String,
            params: ConversationDeleteParams = ConversationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see delete */
        fun delete(
            conversationId: String,
            params: ConversationDeleteParams = ConversationDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(conversationId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ConversationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ConversationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(conversationId, ConversationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/conversations/{conversation_id}/message`, but
         * is otherwise the same as [ConversationServiceAsync.addMessage].
         */
        fun addMessage(
            conversationId: String,
            params: ConversationAddMessageParams,
        ): CompletableFuture<HttpResponseFor<ConversationAddMessageResponse>> =
            addMessage(conversationId, params, RequestOptions.none())

        /** @see addMessage */
        fun addMessage(
            conversationId: String,
            params: ConversationAddMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationAddMessageResponse>> =
            addMessage(params.toBuilder().conversationId(conversationId).build(), requestOptions)

        /** @see addMessage */
        fun addMessage(
            params: ConversationAddMessageParams
        ): CompletableFuture<HttpResponseFor<ConversationAddMessageResponse>> =
            addMessage(params, RequestOptions.none())

        /** @see addMessage */
        fun addMessage(
            params: ConversationAddMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationAddMessageResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /ai/conversations/{conversation_id}/conversations-insights`, but is otherwise the same as
         * [ConversationServiceAsync.retrieveConversationsInsights].
         */
        fun retrieveConversationsInsights(
            conversationId: String
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveConversationsInsightsResponse>> =
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
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveConversationsInsightsResponse>> =
            retrieveConversationsInsights(
                params.toBuilder().conversationId(conversationId).build(),
                requestOptions,
            )

        /** @see retrieveConversationsInsights */
        fun retrieveConversationsInsights(
            conversationId: String,
            params: ConversationRetrieveConversationsInsightsParams =
                ConversationRetrieveConversationsInsightsParams.none(),
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveConversationsInsightsResponse>> =
            retrieveConversationsInsights(conversationId, params, RequestOptions.none())

        /** @see retrieveConversationsInsights */
        fun retrieveConversationsInsights(
            params: ConversationRetrieveConversationsInsightsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveConversationsInsightsResponse>>

        /** @see retrieveConversationsInsights */
        fun retrieveConversationsInsights(
            params: ConversationRetrieveConversationsInsightsParams
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveConversationsInsightsResponse>> =
            retrieveConversationsInsights(params, RequestOptions.none())

        /** @see retrieveConversationsInsights */
        fun retrieveConversationsInsights(
            conversationId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConversationRetrieveConversationsInsightsResponse>> =
            retrieveConversationsInsights(
                conversationId,
                ConversationRetrieveConversationsInsightsParams.none(),
                requestOptions,
            )
    }
}
