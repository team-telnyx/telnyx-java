// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes.messages

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessageResponse
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionForwardParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyAllParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionServiceAsync

    /**
     * Sends from the inbox address through the standard email send pipeline to caller-supplied To,
     * Cc, and Bcc recipients. `to` must contain at least one recipient. Optional `text` and `html`
     * are prepended to a forwarded-message block containing the original metadata and available
     * body content. The subject is prefixed with `Fwd:` unless it already has that prefix.
     *
     * Threading headers are derived from the original message: `In-Reply-To` is set to its RFC
     * Message-ID, and `References` contains the original References values plus that Message-ID,
     * de-duplicated and limited to the most recent 20 values.
     */
    fun forward(
        messageId: String,
        params: ActionForwardParams,
    ): CompletableFuture<EmailMessageResponse> = forward(messageId, params, RequestOptions.none())

    /** @see forward */
    fun forward(
        messageId: String,
        params: ActionForwardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse> =
        forward(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see forward */
    fun forward(params: ActionForwardParams): CompletableFuture<EmailMessageResponse> =
        forward(params, RequestOptions.none())

    /** @see forward */
    fun forward(
        params: ActionForwardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse>

    /**
     * Sends from the inbox address through the standard email send pipeline. The recipient is the
     * original `Reply-To`, falling back to `From`; original Cc recipients are not included. The
     * subject is prefixed with `Re:` unless it already has that prefix.
     *
     * Threading headers are derived from the original message: `In-Reply-To` is set to its RFC
     * Message-ID, and `References` contains the original References values plus that Message-ID,
     * de-duplicated and limited to the most recent 20 values.
     */
    fun reply(
        messageId: String,
        params: ActionReplyParams,
    ): CompletableFuture<EmailMessageResponse> = reply(messageId, params, RequestOptions.none())

    /** @see reply */
    fun reply(
        messageId: String,
        params: ActionReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse> =
        reply(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see reply */
    fun reply(params: ActionReplyParams): CompletableFuture<EmailMessageResponse> =
        reply(params, RequestOptions.none())

    /** @see reply */
    fun reply(
        params: ActionReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse>

    /**
     * Sends from the inbox address through the standard email send pipeline. The To list starts
     * with the original `Reply-To` (or `From`) and includes original To recipients; the Cc list
     * includes original Cc recipients. The inbox address is excluded, and recipients are
     * de-duplicated case-insensitively across To and Cc. Bcc is always empty. The subject is
     * prefixed with `Re:` unless it already has that prefix.
     *
     * Threading headers are derived from the original message: `In-Reply-To` is set to its RFC
     * Message-ID, and `References` contains the original References values plus that Message-ID,
     * de-duplicated and limited to the most recent 20 values.
     */
    fun replyAll(
        messageId: String,
        params: ActionReplyAllParams,
    ): CompletableFuture<EmailMessageResponse> = replyAll(messageId, params, RequestOptions.none())

    /** @see replyAll */
    fun replyAll(
        messageId: String,
        params: ActionReplyAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse> =
        replyAll(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see replyAll */
    fun replyAll(params: ActionReplyAllParams): CompletableFuture<EmailMessageResponse> =
        replyAll(params, RequestOptions.none())

    /** @see replyAll */
    fun replyAll(
        params: ActionReplyAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailMessageResponse>

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /email_inboxes/{inbox_id}/messages/{message_id}/actions/forward`, but is otherwise the
         * same as [ActionServiceAsync.forward].
         */
        fun forward(
            messageId: String,
            params: ActionForwardParams,
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            forward(messageId, params, RequestOptions.none())

        /** @see forward */
        fun forward(
            messageId: String,
            params: ActionForwardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            forward(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see forward */
        fun forward(
            params: ActionForwardParams
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            forward(params, RequestOptions.none())

        /** @see forward */
        fun forward(
            params: ActionForwardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /email_inboxes/{inbox_id}/messages/{message_id}/actions/reply`, but is otherwise the same
         * as [ActionServiceAsync.reply].
         */
        fun reply(
            messageId: String,
            params: ActionReplyParams,
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            reply(messageId, params, RequestOptions.none())

        /** @see reply */
        fun reply(
            messageId: String,
            params: ActionReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            reply(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see reply */
        fun reply(
            params: ActionReplyParams
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            reply(params, RequestOptions.none())

        /** @see reply */
        fun reply(
            params: ActionReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /email_inboxes/{inbox_id}/messages/{message_id}/actions/reply_all`, but is otherwise the
         * same as [ActionServiceAsync.replyAll].
         */
        fun replyAll(
            messageId: String,
            params: ActionReplyAllParams,
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            replyAll(messageId, params, RequestOptions.none())

        /** @see replyAll */
        fun replyAll(
            messageId: String,
            params: ActionReplyAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            replyAll(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see replyAll */
        fun replyAll(
            params: ActionReplyAllParams
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>> =
            replyAll(params, RequestOptions.none())

        /** @see replyAll */
        fun replyAll(
            params: ActionReplyAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailMessageResponse>>
    }
}
