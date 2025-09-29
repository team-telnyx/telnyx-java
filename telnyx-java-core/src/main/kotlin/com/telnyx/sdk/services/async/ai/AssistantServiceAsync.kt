// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.AssistantChatParams
import com.telnyx.sdk.models.ai.assistants.AssistantChatResponse
import com.telnyx.sdk.models.ai.assistants.AssistantCloneParams
import com.telnyx.sdk.models.ai.assistants.AssistantCloneResponse
import com.telnyx.sdk.models.ai.assistants.AssistantCreateParams
import com.telnyx.sdk.models.ai.assistants.AssistantCreateResponse
import com.telnyx.sdk.models.ai.assistants.AssistantDeleteParams
import com.telnyx.sdk.models.ai.assistants.AssistantDeleteResponse
import com.telnyx.sdk.models.ai.assistants.AssistantGetTexmlParams
import com.telnyx.sdk.models.ai.assistants.AssistantImportParams
import com.telnyx.sdk.models.ai.assistants.AssistantListParams
import com.telnyx.sdk.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.sdk.models.ai.assistants.AssistantRetrieveResponse
import com.telnyx.sdk.models.ai.assistants.AssistantUpdateParams
import com.telnyx.sdk.models.ai.assistants.AssistantUpdateResponse
import com.telnyx.sdk.models.ai.assistants.AssistantsList
import com.telnyx.sdk.services.async.ai.assistants.CanaryDeployServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.ScheduledEventServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.TestServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.ToolServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.VersionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssistantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssistantServiceAsync

    fun tests(): TestServiceAsync

    fun canaryDeploys(): CanaryDeployServiceAsync

    fun scheduledEvents(): ScheduledEventServiceAsync

    fun tools(): ToolServiceAsync

    fun versions(): VersionServiceAsync

    /** Create a new AI Assistant. */
    fun create(params: AssistantCreateParams): CompletableFuture<AssistantCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantCreateResponse>

    /** Retrieve an AI Assistant configuration by `assistant_id`. */
    fun retrieve(assistantId: String): CompletableFuture<AssistantRetrieveResponse> =
        retrieve(assistantId, AssistantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantRetrieveResponse> =
        retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
    ): CompletableFuture<AssistantRetrieveResponse> =
        retrieve(assistantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AssistantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AssistantRetrieveParams): CompletableFuture<AssistantRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantRetrieveResponse> =
        retrieve(assistantId, AssistantRetrieveParams.none(), requestOptions)

    /** Update an AI Assistant's attributes. */
    fun update(assistantId: String): CompletableFuture<AssistantUpdateResponse> =
        update(assistantId, AssistantUpdateParams.none())

    /** @see update */
    fun update(
        assistantId: String,
        params: AssistantUpdateParams = AssistantUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantUpdateResponse> =
        update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see update */
    fun update(
        assistantId: String,
        params: AssistantUpdateParams = AssistantUpdateParams.none(),
    ): CompletableFuture<AssistantUpdateResponse> =
        update(assistantId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssistantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantUpdateResponse>

    /** @see update */
    fun update(params: AssistantUpdateParams): CompletableFuture<AssistantUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantUpdateResponse> =
        update(assistantId, AssistantUpdateParams.none(), requestOptions)

    /** Retrieve a list of all AI Assistants configured by the user. */
    fun list(): CompletableFuture<AssistantsList> = list(AssistantListParams.none())

    /** @see list */
    fun list(
        params: AssistantListParams = AssistantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantsList>

    /** @see list */
    fun list(
        params: AssistantListParams = AssistantListParams.none()
    ): CompletableFuture<AssistantsList> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AssistantsList> =
        list(AssistantListParams.none(), requestOptions)

    /** Delete an AI Assistant by `assistant_id`. */
    fun delete(assistantId: String): CompletableFuture<AssistantDeleteResponse> =
        delete(assistantId, AssistantDeleteParams.none())

    /** @see delete */
    fun delete(
        assistantId: String,
        params: AssistantDeleteParams = AssistantDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantDeleteResponse> =
        delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see delete */
    fun delete(
        assistantId: String,
        params: AssistantDeleteParams = AssistantDeleteParams.none(),
    ): CompletableFuture<AssistantDeleteResponse> =
        delete(assistantId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantDeleteResponse>

    /** @see delete */
    fun delete(params: AssistantDeleteParams): CompletableFuture<AssistantDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantDeleteResponse> =
        delete(assistantId, AssistantDeleteParams.none(), requestOptions)

    /**
     * This endpoint allows a client to send a chat message to a specific AI Assistant. The
     * assistant processes the message and returns a relevant reply based on the current
     * conversation context. Refer to the Conversation API to
     * [create a conversation](https://developers.telnyx.com/api/inference/inference-embedding/create-new-conversation-public-conversations-post),
     * [filter existing
     * conversations](https://developers.telnyx.com/api/inference/inference-embedding/get-conversations-public-conversations-get),
     * [fetch messages for a conversation](https://developers.telnyx.com/api/inference/inference-embedding/get-conversations-public-conversation-id-messages-get),
     * and
     * [manually add messages to a conversation](https://developers.telnyx.com/api/inference/inference-embedding/add-new-message).
     */
    fun chat(
        assistantId: String,
        params: AssistantChatParams,
    ): CompletableFuture<AssistantChatResponse> = chat(assistantId, params, RequestOptions.none())

    /** @see chat */
    fun chat(
        assistantId: String,
        params: AssistantChatParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantChatResponse> =
        chat(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see chat */
    fun chat(params: AssistantChatParams): CompletableFuture<AssistantChatResponse> =
        chat(params, RequestOptions.none())

    /** @see chat */
    fun chat(
        params: AssistantChatParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantChatResponse>

    /** Clone an existing assistant, excluding telephony and messaging settings. */
    fun clone(assistantId: String): CompletableFuture<AssistantCloneResponse> =
        clone(assistantId, AssistantCloneParams.none())

    /** @see clone */
    fun clone(
        assistantId: String,
        params: AssistantCloneParams = AssistantCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantCloneResponse> =
        clone(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see clone */
    fun clone(
        assistantId: String,
        params: AssistantCloneParams = AssistantCloneParams.none(),
    ): CompletableFuture<AssistantCloneResponse> = clone(assistantId, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: AssistantCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantCloneResponse>

    /** @see clone */
    fun clone(params: AssistantCloneParams): CompletableFuture<AssistantCloneResponse> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssistantCloneResponse> =
        clone(assistantId, AssistantCloneParams.none(), requestOptions)

    /** Get an assistant texml by `assistant_id`. */
    fun getTexml(assistantId: String): CompletableFuture<String> =
        getTexml(assistantId, AssistantGetTexmlParams.none())

    /** @see getTexml */
    fun getTexml(
        assistantId: String,
        params: AssistantGetTexmlParams = AssistantGetTexmlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        getTexml(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see getTexml */
    fun getTexml(
        assistantId: String,
        params: AssistantGetTexmlParams = AssistantGetTexmlParams.none(),
    ): CompletableFuture<String> = getTexml(assistantId, params, RequestOptions.none())

    /** @see getTexml */
    fun getTexml(
        params: AssistantGetTexmlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see getTexml */
    fun getTexml(params: AssistantGetTexmlParams): CompletableFuture<String> =
        getTexml(params, RequestOptions.none())

    /** @see getTexml */
    fun getTexml(assistantId: String, requestOptions: RequestOptions): CompletableFuture<String> =
        getTexml(assistantId, AssistantGetTexmlParams.none(), requestOptions)

    /**
     * Import assistants from external providers. Any assistant that has already been imported will
     * be overwritten with its latest version from the importing provider.
     */
    fun import_(params: AssistantImportParams): CompletableFuture<AssistantsList> =
        import_(params, RequestOptions.none())

    /** @see import_ */
    fun import_(
        params: AssistantImportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantsList>

    /**
     * A view of [AssistantServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssistantServiceAsync.WithRawResponse

        fun tests(): TestServiceAsync.WithRawResponse

        fun canaryDeploys(): CanaryDeployServiceAsync.WithRawResponse

        fun scheduledEvents(): ScheduledEventServiceAsync.WithRawResponse

        fun tools(): ToolServiceAsync.WithRawResponse

        fun versions(): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.create].
         */
        fun create(
            params: AssistantCreateParams
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}`, but is otherwise the
         * same as [AssistantServiceAsync.retrieve].
         */
        fun retrieve(
            assistantId: String
        ): CompletableFuture<HttpResponseFor<AssistantRetrieveResponse>> =
            retrieve(assistantId, AssistantRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantRetrieveResponse>> =
            retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AssistantRetrieveResponse>> =
            retrieve(assistantId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AssistantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AssistantRetrieveParams
        ): CompletableFuture<HttpResponseFor<AssistantRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantRetrieveResponse>> =
            retrieve(assistantId, AssistantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantServiceAsync.update].
         */
        fun update(
            assistantId: String
        ): CompletableFuture<HttpResponseFor<AssistantUpdateResponse>> =
            update(assistantId, AssistantUpdateParams.none())

        /** @see update */
        fun update(
            assistantId: String,
            params: AssistantUpdateParams = AssistantUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantUpdateResponse>> =
            update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see update */
        fun update(
            assistantId: String,
            params: AssistantUpdateParams = AssistantUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AssistantUpdateResponse>> =
            update(assistantId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AssistantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantUpdateResponse>>

        /** @see update */
        fun update(
            params: AssistantUpdateParams
        ): CompletableFuture<HttpResponseFor<AssistantUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantUpdateResponse>> =
            update(assistantId, AssistantUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AssistantsList>> =
            list(AssistantListParams.none())

        /** @see list */
        fun list(
            params: AssistantListParams = AssistantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantsList>>

        /** @see list */
        fun list(
            params: AssistantListParams = AssistantListParams.none()
        ): CompletableFuture<HttpResponseFor<AssistantsList>> = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AssistantsList>> =
            list(AssistantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantServiceAsync.delete].
         */
        fun delete(
            assistantId: String
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(assistantId, AssistantDeleteParams.none())

        /** @see delete */
        fun delete(
            assistantId: String,
            params: AssistantDeleteParams = AssistantDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see delete */
        fun delete(
            assistantId: String,
            params: AssistantDeleteParams = AssistantDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(assistantId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AssistantDeleteParams
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantDeleteResponse>> =
            delete(assistantId, AssistantDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/chat`, but is
         * otherwise the same as [AssistantServiceAsync.chat].
         */
        fun chat(
            assistantId: String,
            params: AssistantChatParams,
        ): CompletableFuture<HttpResponseFor<AssistantChatResponse>> =
            chat(assistantId, params, RequestOptions.none())

        /** @see chat */
        fun chat(
            assistantId: String,
            params: AssistantChatParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantChatResponse>> =
            chat(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see chat */
        fun chat(
            params: AssistantChatParams
        ): CompletableFuture<HttpResponseFor<AssistantChatResponse>> =
            chat(params, RequestOptions.none())

        /** @see chat */
        fun chat(
            params: AssistantChatParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantChatResponse>>

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/clone`, but is
         * otherwise the same as [AssistantServiceAsync.clone].
         */
        fun clone(assistantId: String): CompletableFuture<HttpResponseFor<AssistantCloneResponse>> =
            clone(assistantId, AssistantCloneParams.none())

        /** @see clone */
        fun clone(
            assistantId: String,
            params: AssistantCloneParams = AssistantCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantCloneResponse>> =
            clone(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see clone */
        fun clone(
            assistantId: String,
            params: AssistantCloneParams = AssistantCloneParams.none(),
        ): CompletableFuture<HttpResponseFor<AssistantCloneResponse>> =
            clone(assistantId, params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: AssistantCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantCloneResponse>>

        /** @see clone */
        fun clone(
            params: AssistantCloneParams
        ): CompletableFuture<HttpResponseFor<AssistantCloneResponse>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssistantCloneResponse>> =
            clone(assistantId, AssistantCloneParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/texml`, but is
         * otherwise the same as [AssistantServiceAsync.getTexml].
         */
        fun getTexml(assistantId: String): CompletableFuture<HttpResponseFor<String>> =
            getTexml(assistantId, AssistantGetTexmlParams.none())

        /** @see getTexml */
        fun getTexml(
            assistantId: String,
            params: AssistantGetTexmlParams = AssistantGetTexmlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            getTexml(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see getTexml */
        fun getTexml(
            assistantId: String,
            params: AssistantGetTexmlParams = AssistantGetTexmlParams.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            getTexml(assistantId, params, RequestOptions.none())

        /** @see getTexml */
        fun getTexml(
            params: AssistantGetTexmlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see getTexml */
        fun getTexml(params: AssistantGetTexmlParams): CompletableFuture<HttpResponseFor<String>> =
            getTexml(params, RequestOptions.none())

        /** @see getTexml */
        fun getTexml(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> =
            getTexml(assistantId, AssistantGetTexmlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/import`, but is otherwise the same
         * as [AssistantServiceAsync.import_].
         */
        fun import_(
            params: AssistantImportParams
        ): CompletableFuture<HttpResponseFor<AssistantsList>> =
            import_(params, RequestOptions.none())

        /** @see import_ */
        fun import_(
            params: AssistantImportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantsList>>
    }
}
