// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes.messages

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelCreateParams
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelCreateResponse
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelDeleteAllParams
import com.telnyx.sdk.models.emailinboxes.messages.labels.LabelDeleteAllResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
interface LabelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LabelServiceAsync

    /**
     * Adds one or more mutable labels to a message. Labels carry agent workflow state such as
     * `spam`, `needs_review`, or `processed`.
     *
     * Labels are **not** the same as the send-time `tags` on outbound messages: `tags` are
     * immutable and propagate to Email Detail Records and Mission Control for billing attribution,
     * while labels are mailbox state that never reaches the reporting contract.
     *
     * The operation is an idempotent set union — adding a label the message already carries is a
     * no-op and still returns 200. Labels are case-sensitive, and message labels are independent of
     * thread labels.
     */
    fun create(
        messageId: String,
        params: LabelCreateParams,
    ): CompletableFuture<LabelCreateResponse> = create(messageId, params, RequestOptions.none())

    /** @see create */
    fun create(
        messageId: String,
        params: LabelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelCreateResponse> =
        create(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see create */
    fun create(params: LabelCreateParams): CompletableFuture<LabelCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LabelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelCreateResponse>

    /**
     * Removes one or more labels from a message. Idempotent — removing a label the message does not
     * carry is a no-op and still returns 200. Removal is case-sensitive.
     */
    fun deleteAll(
        messageId: String,
        params: LabelDeleteAllParams,
    ): CompletableFuture<LabelDeleteAllResponse> =
        deleteAll(messageId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        messageId: String,
        params: LabelDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelDeleteAllResponse> =
        deleteAll(params.toBuilder().messageId(messageId).build(), requestOptions)

    /** @see deleteAll */
    fun deleteAll(params: LabelDeleteAllParams): CompletableFuture<LabelDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: LabelDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelDeleteAllResponse>

    /** A view of [LabelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LabelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /email_inboxes/{inbox_id}/messages/{message_id}/labels`, but is otherwise the same as
         * [LabelServiceAsync.create].
         */
        fun create(
            messageId: String,
            params: LabelCreateParams,
        ): CompletableFuture<HttpResponseFor<LabelCreateResponse>> =
            create(messageId, params, RequestOptions.none())

        /** @see create */
        fun create(
            messageId: String,
            params: LabelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelCreateResponse>> =
            create(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see create */
        fun create(
            params: LabelCreateParams
        ): CompletableFuture<HttpResponseFor<LabelCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LabelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /email_inboxes/{inbox_id}/messages/{message_id}/labels`, but is otherwise the same as
         * [LabelServiceAsync.deleteAll].
         */
        fun deleteAll(
            messageId: String,
            params: LabelDeleteAllParams,
        ): CompletableFuture<HttpResponseFor<LabelDeleteAllResponse>> =
            deleteAll(messageId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            messageId: String,
            params: LabelDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelDeleteAllResponse>> =
            deleteAll(params.toBuilder().messageId(messageId).build(), requestOptions)

        /** @see deleteAll */
        fun deleteAll(
            params: LabelDeleteAllParams
        ): CompletableFuture<HttpResponseFor<LabelDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: LabelDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelDeleteAllResponse>>
    }
}
