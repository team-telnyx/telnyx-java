// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.assistants.AssistantChatParams
import com.telnyx.sdk.models.ai.assistants.AssistantChatResponse
import com.telnyx.sdk.models.ai.assistants.AssistantCloneParams
import com.telnyx.sdk.models.ai.assistants.AssistantCreateParams
import com.telnyx.sdk.models.ai.assistants.AssistantDeleteParams
import com.telnyx.sdk.models.ai.assistants.AssistantDeleteResponse
import com.telnyx.sdk.models.ai.assistants.AssistantGetTexmlParams
import com.telnyx.sdk.models.ai.assistants.AssistantImportsParams
import com.telnyx.sdk.models.ai.assistants.AssistantListParams
import com.telnyx.sdk.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsResponse
import com.telnyx.sdk.models.ai.assistants.AssistantUpdateParams
import com.telnyx.sdk.models.ai.assistants.AssistantsList
import com.telnyx.sdk.models.ai.assistants.InferenceEmbedding
import com.telnyx.sdk.services.blocking.ai.assistants.CanaryDeployService
import com.telnyx.sdk.services.blocking.ai.assistants.ScheduledEventService
import com.telnyx.sdk.services.blocking.ai.assistants.TestService
import com.telnyx.sdk.services.blocking.ai.assistants.ToolService
import com.telnyx.sdk.services.blocking.ai.assistants.VersionService
import java.util.function.Consumer

interface AssistantService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssistantService

    fun tests(): TestService

    fun canaryDeploys(): CanaryDeployService

    fun scheduledEvents(): ScheduledEventService

    fun tools(): ToolService

    fun versions(): VersionService

    /** Create a new AI Assistant. */
    fun create(params: AssistantCreateParams): InferenceEmbedding =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding

    /** Retrieve an AI Assistant configuration by `assistant_id`. */
    fun retrieve(assistantId: String): InferenceEmbedding =
        retrieve(assistantId, AssistantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding =
        retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
    ): InferenceEmbedding = retrieve(assistantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AssistantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding

    /** @see retrieve */
    fun retrieve(params: AssistantRetrieveParams): InferenceEmbedding =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(assistantId: String, requestOptions: RequestOptions): InferenceEmbedding =
        retrieve(assistantId, AssistantRetrieveParams.none(), requestOptions)

    /** Update an AI Assistant's attributes. */
    fun update(assistantId: String): InferenceEmbedding =
        update(assistantId, AssistantUpdateParams.none())

    /** @see update */
    fun update(
        assistantId: String,
        params: AssistantUpdateParams = AssistantUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding =
        update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see update */
    fun update(
        assistantId: String,
        params: AssistantUpdateParams = AssistantUpdateParams.none(),
    ): InferenceEmbedding = update(assistantId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssistantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding

    /** @see update */
    fun update(params: AssistantUpdateParams): InferenceEmbedding =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(assistantId: String, requestOptions: RequestOptions): InferenceEmbedding =
        update(assistantId, AssistantUpdateParams.none(), requestOptions)

    /** Retrieve a list of all AI Assistants configured by the user. */
    fun list(): AssistantsList = list(AssistantListParams.none())

    /** @see list */
    fun list(
        params: AssistantListParams = AssistantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantsList

    /** @see list */
    fun list(params: AssistantListParams = AssistantListParams.none()): AssistantsList =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AssistantsList =
        list(AssistantListParams.none(), requestOptions)

    /** Delete an AI Assistant by `assistant_id`. */
    fun delete(assistantId: String): AssistantDeleteResponse =
        delete(assistantId, AssistantDeleteParams.none())

    /** @see delete */
    fun delete(
        assistantId: String,
        params: AssistantDeleteParams = AssistantDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantDeleteResponse =
        delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see delete */
    fun delete(
        assistantId: String,
        params: AssistantDeleteParams = AssistantDeleteParams.none(),
    ): AssistantDeleteResponse = delete(assistantId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssistantDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantDeleteResponse

    /** @see delete */
    fun delete(params: AssistantDeleteParams): AssistantDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(assistantId: String, requestOptions: RequestOptions): AssistantDeleteResponse =
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
    fun chat(assistantId: String, params: AssistantChatParams): AssistantChatResponse =
        chat(assistantId, params, RequestOptions.none())

    /** @see chat */
    fun chat(
        assistantId: String,
        params: AssistantChatParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantChatResponse =
        chat(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see chat */
    fun chat(params: AssistantChatParams): AssistantChatResponse =
        chat(params, RequestOptions.none())

    /** @see chat */
    fun chat(
        params: AssistantChatParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantChatResponse

    /** Clone an existing assistant, excluding telephony and messaging settings. */
    fun clone(assistantId: String): InferenceEmbedding =
        clone(assistantId, AssistantCloneParams.none())

    /** @see clone */
    fun clone(
        assistantId: String,
        params: AssistantCloneParams = AssistantCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding =
        clone(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see clone */
    fun clone(
        assistantId: String,
        params: AssistantCloneParams = AssistantCloneParams.none(),
    ): InferenceEmbedding = clone(assistantId, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: AssistantCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InferenceEmbedding

    /** @see clone */
    fun clone(params: AssistantCloneParams): InferenceEmbedding =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(assistantId: String, requestOptions: RequestOptions): InferenceEmbedding =
        clone(assistantId, AssistantCloneParams.none(), requestOptions)

    /** Get an assistant texml by `assistant_id`. */
    fun getTexml(assistantId: String): String =
        getTexml(assistantId, AssistantGetTexmlParams.none())

    /** @see getTexml */
    fun getTexml(
        assistantId: String,
        params: AssistantGetTexmlParams = AssistantGetTexmlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = getTexml(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see getTexml */
    fun getTexml(
        assistantId: String,
        params: AssistantGetTexmlParams = AssistantGetTexmlParams.none(),
    ): String = getTexml(assistantId, params, RequestOptions.none())

    /** @see getTexml */
    fun getTexml(
        params: AssistantGetTexmlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see getTexml */
    fun getTexml(params: AssistantGetTexmlParams): String = getTexml(params, RequestOptions.none())

    /** @see getTexml */
    fun getTexml(assistantId: String, requestOptions: RequestOptions): String =
        getTexml(assistantId, AssistantGetTexmlParams.none(), requestOptions)

    /**
     * Import assistants from external providers. Any assistant that has already been imported will
     * be overwritten with its latest version from the importing provider.
     */
    fun imports(params: AssistantImportsParams): AssistantsList =
        imports(params, RequestOptions.none())

    /** @see imports */
    fun imports(
        params: AssistantImportsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantsList

    /**
     * Send an SMS message for an assistant. This endpoint:
     * 1. Validates the assistant exists and has messaging profile configured
     * 2. If should_create_conversation is true, creates a new conversation with metadata
     * 3. Sends the SMS message (If `text` is set, this will be sent. Otherwise, if this is the
     *    first message in the conversation and the assistant has a `greeting` configured, this will
     *    be sent. Otherwise the assistant will generate the text to send.)
     * 4. Updates conversation metadata if provided
     * 5. Returns the conversation ID
     */
    fun sendSms(assistantId: String, params: AssistantSendSmsParams): AssistantSendSmsResponse =
        sendSms(assistantId, params, RequestOptions.none())

    /** @see sendSms */
    fun sendSms(
        assistantId: String,
        params: AssistantSendSmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantSendSmsResponse =
        sendSms(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see sendSms */
    fun sendSms(params: AssistantSendSmsParams): AssistantSendSmsResponse =
        sendSms(params, RequestOptions.none())

    /** @see sendSms */
    fun sendSms(
        params: AssistantSendSmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AssistantSendSmsResponse

    /** A view of [AssistantService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssistantService.WithRawResponse

        fun tests(): TestService.WithRawResponse

        fun canaryDeploys(): CanaryDeployService.WithRawResponse

        fun scheduledEvents(): ScheduledEventService.WithRawResponse

        fun tools(): ToolService.WithRawResponse

        fun versions(): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants`, but is otherwise the same as
         * [AssistantService.create].
         */
        @MustBeClosed
        fun create(params: AssistantCreateParams): HttpResponseFor<InferenceEmbedding> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}`, but is otherwise the
         * same as [AssistantService.retrieve].
         */
        @MustBeClosed
        fun retrieve(assistantId: String): HttpResponseFor<InferenceEmbedding> =
            retrieve(assistantId, AssistantRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            assistantId: String,
            params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding> =
            retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            assistantId: String,
            params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
        ): HttpResponseFor<InferenceEmbedding> =
            retrieve(assistantId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AssistantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AssistantRetrieveParams): HttpResponseFor<InferenceEmbedding> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferenceEmbedding> =
            retrieve(assistantId, AssistantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantService.update].
         */
        @MustBeClosed
        fun update(assistantId: String): HttpResponseFor<InferenceEmbedding> =
            update(assistantId, AssistantUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            assistantId: String,
            params: AssistantUpdateParams = AssistantUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding> =
            update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            assistantId: String,
            params: AssistantUpdateParams = AssistantUpdateParams.none(),
        ): HttpResponseFor<InferenceEmbedding> = update(assistantId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AssistantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding>

        /** @see update */
        @MustBeClosed
        fun update(params: AssistantUpdateParams): HttpResponseFor<InferenceEmbedding> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferenceEmbedding> =
            update(assistantId, AssistantUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/assistants`, but is otherwise the same as
         * [AssistantService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AssistantsList> = list(AssistantListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssistantListParams = AssistantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantsList>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AssistantListParams = AssistantListParams.none()
        ): HttpResponseFor<AssistantsList> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AssistantsList> =
            list(AssistantListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /ai/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantService.delete].
         */
        @MustBeClosed
        fun delete(assistantId: String): HttpResponseFor<AssistantDeleteResponse> =
            delete(assistantId, AssistantDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            assistantId: String,
            params: AssistantDeleteParams = AssistantDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantDeleteResponse> =
            delete(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            assistantId: String,
            params: AssistantDeleteParams = AssistantDeleteParams.none(),
        ): HttpResponseFor<AssistantDeleteResponse> =
            delete(assistantId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AssistantDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AssistantDeleteParams): HttpResponseFor<AssistantDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssistantDeleteResponse> =
            delete(assistantId, AssistantDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/chat`, but is
         * otherwise the same as [AssistantService.chat].
         */
        @MustBeClosed
        fun chat(
            assistantId: String,
            params: AssistantChatParams,
        ): HttpResponseFor<AssistantChatResponse> = chat(assistantId, params, RequestOptions.none())

        /** @see chat */
        @MustBeClosed
        fun chat(
            assistantId: String,
            params: AssistantChatParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantChatResponse> =
            chat(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see chat */
        @MustBeClosed
        fun chat(params: AssistantChatParams): HttpResponseFor<AssistantChatResponse> =
            chat(params, RequestOptions.none())

        /** @see chat */
        @MustBeClosed
        fun chat(
            params: AssistantChatParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantChatResponse>

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/clone`, but is
         * otherwise the same as [AssistantService.clone].
         */
        @MustBeClosed
        fun clone(assistantId: String): HttpResponseFor<InferenceEmbedding> =
            clone(assistantId, AssistantCloneParams.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            assistantId: String,
            params: AssistantCloneParams = AssistantCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding> =
            clone(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see clone */
        @MustBeClosed
        fun clone(
            assistantId: String,
            params: AssistantCloneParams = AssistantCloneParams.none(),
        ): HttpResponseFor<InferenceEmbedding> = clone(assistantId, params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: AssistantCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InferenceEmbedding>

        /** @see clone */
        @MustBeClosed
        fun clone(params: AssistantCloneParams): HttpResponseFor<InferenceEmbedding> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            assistantId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InferenceEmbedding> =
            clone(assistantId, AssistantCloneParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}/texml`, but is
         * otherwise the same as [AssistantService.getTexml].
         */
        @MustBeClosed
        fun getTexml(assistantId: String): HttpResponseFor<String> =
            getTexml(assistantId, AssistantGetTexmlParams.none())

        /** @see getTexml */
        @MustBeClosed
        fun getTexml(
            assistantId: String,
            params: AssistantGetTexmlParams = AssistantGetTexmlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            getTexml(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see getTexml */
        @MustBeClosed
        fun getTexml(
            assistantId: String,
            params: AssistantGetTexmlParams = AssistantGetTexmlParams.none(),
        ): HttpResponseFor<String> = getTexml(assistantId, params, RequestOptions.none())

        /** @see getTexml */
        @MustBeClosed
        fun getTexml(
            params: AssistantGetTexmlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see getTexml */
        @MustBeClosed
        fun getTexml(params: AssistantGetTexmlParams): HttpResponseFor<String> =
            getTexml(params, RequestOptions.none())

        /** @see getTexml */
        @MustBeClosed
        fun getTexml(assistantId: String, requestOptions: RequestOptions): HttpResponseFor<String> =
            getTexml(assistantId, AssistantGetTexmlParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/import`, but is otherwise the same
         * as [AssistantService.imports].
         */
        @MustBeClosed
        fun imports(params: AssistantImportsParams): HttpResponseFor<AssistantsList> =
            imports(params, RequestOptions.none())

        /** @see imports */
        @MustBeClosed
        fun imports(
            params: AssistantImportsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantsList>

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/chat/sms`, but is
         * otherwise the same as [AssistantService.sendSms].
         */
        @MustBeClosed
        fun sendSms(
            assistantId: String,
            params: AssistantSendSmsParams,
        ): HttpResponseFor<AssistantSendSmsResponse> =
            sendSms(assistantId, params, RequestOptions.none())

        /** @see sendSms */
        @MustBeClosed
        fun sendSms(
            assistantId: String,
            params: AssistantSendSmsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantSendSmsResponse> =
            sendSms(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see sendSms */
        @MustBeClosed
        fun sendSms(params: AssistantSendSmsParams): HttpResponseFor<AssistantSendSmsResponse> =
            sendSms(params, RequestOptions.none())

        /** @see sendSms */
        @MustBeClosed
        fun sendSms(
            params: AssistantSendSmsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AssistantSendSmsResponse>
    }
}
