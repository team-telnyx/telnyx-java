// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.drafts.EmailDraftResponse
import com.telnyx.sdk.models.emailinboxes.messages.MessageDraftsParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageListPageAsync
import com.telnyx.sdk.models.emailinboxes.messages.MessageListParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageUpdateParams
import com.telnyx.sdk.models.emailinboxes.messages.MessageUpdateResponse
import com.telnyx.sdk.services.async.emailinboxes.messages.ActionServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.messages.LabelServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    fun actions(): ActionServiceAsync

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    fun labels(): LabelServiceAsync

    /**
     * Updates the explicit read state of an account-scoped inbound message. Set `read_at` to `true`
     * to mark the message read at the server's current time, to an ISO 8601 timestamp to use that
     * timestamp, or to `null` to mark the message unread. Repeating the same update is idempotent.
     */
    fun update(
        messageId: String,
        params: MessageUpdateParams,
    ): CompletableFuture<MessageUpdateResponse> = update(messageId, params, RequestOptions.none())

    /** @see update */
    fun update(
        messageId: String,
        params: MessageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageUpdateResponse> =
        update(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see update */
    fun update(params: MessageUpdateParams): CompletableFuture<MessageUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: MessageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageUpdateResponse>

    /**
     * Lists inbound messages newest first. All access is scoped to the authenticated account.
     * `filter[search]` performs PostgreSQL full-text search over the subject, plain-text body, and
     * HTML body. Filters compose with stable cursor pagination.
     */
    fun list(inboxId: String): CompletableFuture<MessageListPageAsync> =
        list(inboxId, MessageListParams.none())

    /** @see list */
    fun list(
        inboxId: String,
        params: MessageListParams = MessageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListPageAsync> =
        list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see list */
    fun list(
        inboxId: String,
        params: MessageListParams = MessageListParams.none(),
    ): CompletableFuture<MessageListPageAsync> = list(inboxId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: MessageListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MessageListPageAsync>

    /** @see list */
    fun list(params: MessageListParams): CompletableFuture<MessageListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        inboxId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<MessageListPageAsync> =
        list(inboxId, MessageListParams.none(), requestOptions)

    /**
     * Creates an unsent reply draft for an inbound message. Unlike the `/actions/reply` endpoint,
     * which sends immediately, this stores a draft that can be reviewed and edited before sending.
     *
     * `reply_to_message_id` and `thread_id` are inherited from the parent message and cannot be set
     * by the caller. The recipient, `Re:` subject and `In-Reply-To`/`References` headers are
     * pre-filled from the parent using the same rules as a live reply, so sending the draft threads
     * identically. Supplying `to` or `subject` explicitly overrides the pre-filled value.
     */
    fun drafts(
        messageId: String,
        params: MessageDraftsParams,
    ): CompletableFuture<EmailDraftResponse> = drafts(messageId, params, RequestOptions.none())

    /** @see drafts */
    fun drafts(
        messageId: String,
        params: MessageDraftsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse> =
        drafts(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see drafts */
    fun drafts(params: MessageDraftsParams): CompletableFuture<EmailDraftResponse> =
        drafts(params, RequestOptions.none())

    /** @see drafts */
    fun drafts(
        params: MessageDraftsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDraftResponse>

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
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        fun labels(): LabelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /email_inboxes/{inbox_id}/messages/{message_id}`,
         * but is otherwise the same as [MessageServiceAsync.update].
         */
        fun update(
            messageId: String,
            params: MessageUpdateParams,
        ): CompletableFuture<HttpResponseFor<MessageUpdateResponse>> =
            update(messageId, params, RequestOptions.none())

        /** @see update */
        fun update(
            messageId: String,
            params: MessageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageUpdateResponse>> =
            update(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see update */
        fun update(
            params: MessageUpdateParams
        ): CompletableFuture<HttpResponseFor<MessageUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: MessageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/messages`, but is
         * otherwise the same as [MessageServiceAsync.list].
         */
        fun list(inboxId: String): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(inboxId, MessageListParams.none())

        /** @see list */
        fun list(
            inboxId: String,
            params: MessageListParams = MessageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see list */
        fun list(
            inboxId: String,
            params: MessageListParams = MessageListParams.none(),
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(inboxId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: MessageListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>>

        /** @see list */
        fun list(
            params: MessageListParams
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MessageListPageAsync>> =
            list(inboxId, MessageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /email_inboxes/{inbox_id}/messages/{message_id}/drafts`, but is otherwise the same as
         * [MessageServiceAsync.drafts].
         */
        fun drafts(
            messageId: String,
            params: MessageDraftsParams,
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            drafts(messageId, params, RequestOptions.none())

        /** @see drafts */
        fun drafts(
            messageId: String,
            params: MessageDraftsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            drafts(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see drafts */
        fun drafts(
            params: MessageDraftsParams
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>> =
            drafts(params, RequestOptions.none())

        /** @see drafts */
        fun drafts(
            params: MessageDraftsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDraftResponse>>
    }
}
