// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes.messages

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.drafts.EmailMessageResponse
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionForwardParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyAllParams
import com.telnyx.sdk.models.emailinboxes.messages.actions.ActionReplyParams
import java.util.function.Consumer

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService

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
    fun forward(messageId: String, params: ActionForwardParams): EmailMessageResponse =
        forward(messageId, params, RequestOptions.none())

    /** @see forward */
    fun forward(
        messageId: String,
        params: ActionForwardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse =
        forward(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see forward */
    fun forward(params: ActionForwardParams): EmailMessageResponse =
        forward(params, RequestOptions.none())

    /** @see forward */
    fun forward(
        params: ActionForwardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse

    /**
     * Sends from the inbox address through the standard email send pipeline. The recipient is the
     * original `Reply-To`, falling back to `From`; original Cc recipients are not included. The
     * subject is prefixed with `Re:` unless it already has that prefix.
     *
     * Threading headers are derived from the original message: `In-Reply-To` is set to its RFC
     * Message-ID, and `References` contains the original References values plus that Message-ID,
     * de-duplicated and limited to the most recent 20 values.
     */
    fun reply(messageId: String, params: ActionReplyParams): EmailMessageResponse =
        reply(messageId, params, RequestOptions.none())

    /** @see reply */
    fun reply(
        messageId: String,
        params: ActionReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse = reply(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see reply */
    fun reply(params: ActionReplyParams): EmailMessageResponse =
        reply(params, RequestOptions.none())

    /** @see reply */
    fun reply(
        params: ActionReplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse

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
    fun replyAll(messageId: String, params: ActionReplyAllParams): EmailMessageResponse =
        replyAll(messageId, params, RequestOptions.none())

    /** @see replyAll */
    fun replyAll(
        messageId: String,
        params: ActionReplyAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse =
        replyAll(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see replyAll */
    fun replyAll(params: ActionReplyAllParams): EmailMessageResponse =
        replyAll(params, RequestOptions.none())

    /** @see replyAll */
    fun replyAll(
        params: ActionReplyAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailMessageResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /email_inboxes/{inbox_id}/messages/{message_id}/actions/forward`, but is otherwise the
         * same as [ActionService.forward].
         */
        @MustBeClosed
        fun forward(
            messageId: String,
            params: ActionForwardParams,
        ): HttpResponseFor<EmailMessageResponse> = forward(messageId, params, RequestOptions.none())

        /** @see forward */
        @MustBeClosed
        fun forward(
            messageId: String,
            params: ActionForwardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse> =
            forward(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see forward */
        @MustBeClosed
        fun forward(params: ActionForwardParams): HttpResponseFor<EmailMessageResponse> =
            forward(params, RequestOptions.none())

        /** @see forward */
        @MustBeClosed
        fun forward(
            params: ActionForwardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse>

        /**
         * Returns a raw HTTP response for `post
         * /email_inboxes/{inbox_id}/messages/{message_id}/actions/reply`, but is otherwise the same
         * as [ActionService.reply].
         */
        @MustBeClosed
        fun reply(
            messageId: String,
            params: ActionReplyParams,
        ): HttpResponseFor<EmailMessageResponse> = reply(messageId, params, RequestOptions.none())

        /** @see reply */
        @MustBeClosed
        fun reply(
            messageId: String,
            params: ActionReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse> =
            reply(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see reply */
        @MustBeClosed
        fun reply(params: ActionReplyParams): HttpResponseFor<EmailMessageResponse> =
            reply(params, RequestOptions.none())

        /** @see reply */
        @MustBeClosed
        fun reply(
            params: ActionReplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse>

        /**
         * Returns a raw HTTP response for `post
         * /email_inboxes/{inbox_id}/messages/{message_id}/actions/reply_all`, but is otherwise the
         * same as [ActionService.replyAll].
         */
        @MustBeClosed
        fun replyAll(
            messageId: String,
            params: ActionReplyAllParams,
        ): HttpResponseFor<EmailMessageResponse> =
            replyAll(messageId, params, RequestOptions.none())

        /** @see replyAll */
        @MustBeClosed
        fun replyAll(
            messageId: String,
            params: ActionReplyAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse> =
            replyAll(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see replyAll */
        @MustBeClosed
        fun replyAll(params: ActionReplyAllParams): HttpResponseFor<EmailMessageResponse> =
            replyAll(params, RequestOptions.none())

        /** @see replyAll */
        @MustBeClosed
        fun replyAll(
            params: ActionReplyAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailMessageResponse>
    }
}
