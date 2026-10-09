// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai

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
import com.telnyx.sdk.models.ai.assistants.AssistantRestoreParams
import com.telnyx.sdk.models.ai.assistants.AssistantRetrieveParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsParams
import com.telnyx.sdk.models.ai.assistants.AssistantSendSmsResponse
import com.telnyx.sdk.models.ai.assistants.AssistantUpdateParams
import com.telnyx.sdk.models.ai.assistants.AssistantWhatsappParams
import com.telnyx.sdk.models.ai.assistants.AssistantWhatsappResponse
import com.telnyx.sdk.models.ai.assistants.AssistantsList
import com.telnyx.sdk.models.ai.assistants.InferenceEmbedding
import com.telnyx.sdk.services.async.ai.assistants.CanaryDeployServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.DeletedServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.InstructionServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.ScheduledEventServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.TagServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.TestServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.ToolServiceAsync
import com.telnyx.sdk.services.async.ai.assistants.VersionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Configure AI assistant specifications */
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

    /** Configure AI assistant specifications */
    fun tests(): TestServiceAsync

    /** Configure AI assistant specifications */
    fun canaryDeploys(): CanaryDeployServiceAsync

    /** Configure AI assistant specifications */
    fun scheduledEvents(): ScheduledEventServiceAsync

    /** Configure AI assistant specifications */
    fun tools(): ToolServiceAsync

    /** Configure AI assistant specifications */
    fun versions(): VersionServiceAsync

    /** Configure AI assistant specifications */
    fun tags(): TagServiceAsync

    /** Configure AI assistant specifications */
    fun instructions(): InstructionServiceAsync

    /** Configure AI assistant specifications */
    fun deleted(): DeletedServiceAsync

    /**
     * Creates a new AI assistant from the provided configuration, including its model,
     * instructions, and attached tools, and returns the created assistant.
     */
    fun create(params: AssistantCreateParams): CompletableFuture<InferenceEmbedding> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssistantCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding>

    /** Retrieve an AI Assistant configuration by `assistant_id`. */
    fun retrieve(assistantId: String): CompletableFuture<InferenceEmbedding> =
        retrieve(assistantId, AssistantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding> =
        retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
    ): CompletableFuture<InferenceEmbedding> = retrieve(assistantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AssistantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding>

    /** @see retrieve */
    fun retrieve(params: AssistantRetrieveParams): CompletableFuture<InferenceEmbedding> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferenceEmbedding> =
        retrieve(assistantId, AssistantRetrieveParams.none(), requestOptions)

    /**
     * Updates the specified AI assistant's attributes and returns the updated assistant. The
     * request can also control how the change is promoted across assistant versions.
     */
    fun update(assistantId: String): CompletableFuture<InferenceEmbedding> =
        update(assistantId, AssistantUpdateParams.none())

    /** @see update */
    fun update(
        assistantId: String,
        params: AssistantUpdateParams = AssistantUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding> =
        update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see update */
    fun update(
        assistantId: String,
        params: AssistantUpdateParams = AssistantUpdateParams.none(),
    ): CompletableFuture<InferenceEmbedding> = update(assistantId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AssistantUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding>

    /** @see update */
    fun update(params: AssistantUpdateParams): CompletableFuture<InferenceEmbedding> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferenceEmbedding> =
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

    /**
     * Delete an AI Assistant by `assistant_id`.
     *
     * By default this performs a soft delete: the assistant moves to the Recently Deleted list and
     * stays restorable for 30 days, after which it is permanently deleted automatically. The
     * assistant's versions and TeXML application are preserved during the retention window.
     *
     * Pass `hard_delete=true` to skip the retention window and permanently delete the assistant
     * immediately. A hard delete erases the assistant and all of its versions, and deletes its
     * TeXML application unless phone numbers are still assigned to it. It does not delete
     * conversations, recordings, shared tools the assistant referenced, or knowledge-base
     * embeddings.
     *
     * Deletion fails with `400` if other assistants reference this one through a handoff tool or a
     * conversation-flow edge — remove those references first.
     */
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
     * [create a conversation](https://developers.telnyx.com/api-reference/conversations/create-a-conversation),
     * [filter existing
     * conversations](https://developers.telnyx.com/api-reference/conversations/list-conversations),
     * [fetch messages for a conversation](https://developers.telnyx.com/api-reference/conversations/get-conversation-messages),
     * and
     * [manually add messages to a conversation](https://developers.telnyx.com/api-reference/conversations/create-message).
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
    fun clone(assistantId: String): CompletableFuture<InferenceEmbedding> =
        clone(assistantId, AssistantCloneParams.none())

    /** @see clone */
    fun clone(
        assistantId: String,
        params: AssistantCloneParams = AssistantCloneParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding> =
        clone(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see clone */
    fun clone(
        assistantId: String,
        params: AssistantCloneParams = AssistantCloneParams.none(),
    ): CompletableFuture<InferenceEmbedding> = clone(assistantId, params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: AssistantCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding>

    /** @see clone */
    fun clone(params: AssistantCloneParams): CompletableFuture<InferenceEmbedding> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferenceEmbedding> =
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
    fun imports(params: AssistantImportsParams): CompletableFuture<AssistantsList> =
        imports(params, RequestOptions.none())

    /** @see imports */
    fun imports(
        params: AssistantImportsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantsList>

    /**
     * Restore a soft-deleted assistant from the Recently Deleted list.
     *
     * The assistant becomes fully active again with its versions and TeXML application as they were
     * at deletion time. Restoring does not re-enable numbers or connections that were released
     * separately after the deletion.
     */
    fun restore(assistantId: String): CompletableFuture<InferenceEmbedding> =
        restore(assistantId, AssistantRestoreParams.none())

    /** @see restore */
    fun restore(
        assistantId: String,
        params: AssistantRestoreParams = AssistantRestoreParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding> =
        restore(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see restore */
    fun restore(
        assistantId: String,
        params: AssistantRestoreParams = AssistantRestoreParams.none(),
    ): CompletableFuture<InferenceEmbedding> = restore(assistantId, params, RequestOptions.none())

    /** @see restore */
    fun restore(
        params: AssistantRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InferenceEmbedding>

    /** @see restore */
    fun restore(params: AssistantRestoreParams): CompletableFuture<InferenceEmbedding> =
        restore(params, RequestOptions.none())

    /** @see restore */
    fun restore(
        assistantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InferenceEmbedding> =
        restore(assistantId, AssistantRestoreParams.none(), requestOptions)

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
    fun sendSms(
        assistantId: String,
        params: AssistantSendSmsParams,
    ): CompletableFuture<AssistantSendSmsResponse> =
        sendSms(assistantId, params, RequestOptions.none())

    /** @see sendSms */
    fun sendSms(
        assistantId: String,
        params: AssistantSendSmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantSendSmsResponse> =
        sendSms(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see sendSms */
    fun sendSms(params: AssistantSendSmsParams): CompletableFuture<AssistantSendSmsResponse> =
        sendSms(params, RequestOptions.none())

    /** @see sendSms */
    fun sendSms(
        params: AssistantSendSmsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantSendSmsResponse>

    /**
     * Start a WhatsApp conversation with a customer from the business side. This endpoint:
     * 1. Validates that `from` is a WhatsApp number on your account whose messaging profile has
     *    this assistant configured
     * 2. Creates a new `whatsapp_chat` conversation with the provided metadata
     * 3. Asks the assistant to pick one of its approved WhatsApp templates and fill its variables
     *    from `content`
     * 4. Sends the template from `from` to `to`
     * 5. Returns the conversation ID and the message ID
     *
     * When the customer replies, the reply is routed to the same conversation and the assistant
     * answers within the 24-hour customer service window. The assistant needs a `whatsapp_template`
     * tool with at least one approved template, data retention enabled and PII redaction disabled.
     */
    fun whatsapp(
        assistantId: String,
        params: AssistantWhatsappParams,
    ): CompletableFuture<AssistantWhatsappResponse> =
        whatsapp(assistantId, params, RequestOptions.none())

    /** @see whatsapp */
    fun whatsapp(
        assistantId: String,
        params: AssistantWhatsappParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantWhatsappResponse> =
        whatsapp(params.toBuilder().assistantId(assistantId).build(), requestOptions)

    /** @see whatsapp */
    fun whatsapp(params: AssistantWhatsappParams): CompletableFuture<AssistantWhatsappResponse> =
        whatsapp(params, RequestOptions.none())

    /** @see whatsapp */
    fun whatsapp(
        params: AssistantWhatsappParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssistantWhatsappResponse>

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

        /** Configure AI assistant specifications */
        fun tests(): TestServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun canaryDeploys(): CanaryDeployServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun scheduledEvents(): ScheduledEventServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun tools(): ToolServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun versions(): VersionServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun tags(): TagServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun instructions(): InstructionServiceAsync.WithRawResponse

        /** Configure AI assistant specifications */
        fun deleted(): DeletedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /ai/assistants`, but is otherwise the same as
         * [AssistantServiceAsync.create].
         */
        fun create(
            params: AssistantCreateParams
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AssistantCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>>

        /**
         * Returns a raw HTTP response for `get /ai/assistants/{assistant_id}`, but is otherwise the
         * same as [AssistantServiceAsync.retrieve].
         */
        fun retrieve(assistantId: String): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            retrieve(assistantId, AssistantRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            retrieve(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            params: AssistantRetrieveParams = AssistantRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            retrieve(assistantId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AssistantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>>

        /** @see retrieve */
        fun retrieve(
            params: AssistantRetrieveParams
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            retrieve(assistantId, AssistantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}`, but is otherwise
         * the same as [AssistantServiceAsync.update].
         */
        fun update(assistantId: String): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            update(assistantId, AssistantUpdateParams.none())

        /** @see update */
        fun update(
            assistantId: String,
            params: AssistantUpdateParams = AssistantUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            update(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see update */
        fun update(
            assistantId: String,
            params: AssistantUpdateParams = AssistantUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            update(assistantId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AssistantUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>>

        /** @see update */
        fun update(
            params: AssistantUpdateParams
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
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
        fun clone(assistantId: String): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            clone(assistantId, AssistantCloneParams.none())

        /** @see clone */
        fun clone(
            assistantId: String,
            params: AssistantCloneParams = AssistantCloneParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            clone(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see clone */
        fun clone(
            assistantId: String,
            params: AssistantCloneParams = AssistantCloneParams.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            clone(assistantId, params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: AssistantCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>>

        /** @see clone */
        fun clone(
            params: AssistantCloneParams
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
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
         * as [AssistantServiceAsync.imports].
         */
        fun imports(
            params: AssistantImportsParams
        ): CompletableFuture<HttpResponseFor<AssistantsList>> =
            imports(params, RequestOptions.none())

        /** @see imports */
        fun imports(
            params: AssistantImportsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantsList>>

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/restore`, but is
         * otherwise the same as [AssistantServiceAsync.restore].
         */
        fun restore(assistantId: String): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            restore(assistantId, AssistantRestoreParams.none())

        /** @see restore */
        fun restore(
            assistantId: String,
            params: AssistantRestoreParams = AssistantRestoreParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            restore(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see restore */
        fun restore(
            assistantId: String,
            params: AssistantRestoreParams = AssistantRestoreParams.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            restore(assistantId, params, RequestOptions.none())

        /** @see restore */
        fun restore(
            params: AssistantRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>>

        /** @see restore */
        fun restore(
            params: AssistantRestoreParams
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            restore(params, RequestOptions.none())

        /** @see restore */
        fun restore(
            assistantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InferenceEmbedding>> =
            restore(assistantId, AssistantRestoreParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/chat/sms`, but is
         * otherwise the same as [AssistantServiceAsync.sendSms].
         */
        fun sendSms(
            assistantId: String,
            params: AssistantSendSmsParams,
        ): CompletableFuture<HttpResponseFor<AssistantSendSmsResponse>> =
            sendSms(assistantId, params, RequestOptions.none())

        /** @see sendSms */
        fun sendSms(
            assistantId: String,
            params: AssistantSendSmsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantSendSmsResponse>> =
            sendSms(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see sendSms */
        fun sendSms(
            params: AssistantSendSmsParams
        ): CompletableFuture<HttpResponseFor<AssistantSendSmsResponse>> =
            sendSms(params, RequestOptions.none())

        /** @see sendSms */
        fun sendSms(
            params: AssistantSendSmsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantSendSmsResponse>>

        /**
         * Returns a raw HTTP response for `post /ai/assistants/{assistant_id}/chat/whatsapp`, but
         * is otherwise the same as [AssistantServiceAsync.whatsapp].
         */
        fun whatsapp(
            assistantId: String,
            params: AssistantWhatsappParams,
        ): CompletableFuture<HttpResponseFor<AssistantWhatsappResponse>> =
            whatsapp(assistantId, params, RequestOptions.none())

        /** @see whatsapp */
        fun whatsapp(
            assistantId: String,
            params: AssistantWhatsappParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantWhatsappResponse>> =
            whatsapp(params.toBuilder().assistantId(assistantId).build(), requestOptions)

        /** @see whatsapp */
        fun whatsapp(
            params: AssistantWhatsappParams
        ): CompletableFuture<HttpResponseFor<AssistantWhatsappResponse>> =
            whatsapp(params, RequestOptions.none())

        /** @see whatsapp */
        fun whatsapp(
            params: AssistantWhatsappParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssistantWhatsappResponse>>
    }
}
