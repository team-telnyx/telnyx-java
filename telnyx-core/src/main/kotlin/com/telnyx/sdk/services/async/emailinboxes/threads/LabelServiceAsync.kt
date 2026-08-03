// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes.threads

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelCreateParams
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelCreateResponse
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelDeleteAllParams
import com.telnyx.sdk.models.emailinboxes.threads.labels.LabelDeleteAllResponse
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
     * Adds one or more mutable labels to a thread, letting an agent mark a whole conversation (for
     * example `needs_review`) without labelling each message individually.
     *
     * Thread labels are independent of message labels: labelling a thread does not label its
     * messages, and labelling a message does not label its thread. Idempotent and case-sensitive.
     */
    fun create(
        threadId: String,
        params: LabelCreateParams,
    ): CompletableFuture<LabelCreateResponse> = create(threadId, params, RequestOptions.none())

    /** @see create */
    fun create(
        threadId: String,
        params: LabelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelCreateResponse> =
        create(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see create */
    fun create(params: LabelCreateParams): CompletableFuture<LabelCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LabelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelCreateResponse>

    /**
     * Removes one or more labels from a thread. Idempotent — removing a label the thread does not
     * carry is a no-op and still returns 200.
     */
    fun deleteAll(
        threadId: String,
        params: LabelDeleteAllParams,
    ): CompletableFuture<LabelDeleteAllResponse> =
        deleteAll(threadId, params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        threadId: String,
        params: LabelDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelDeleteAllResponse> =
        deleteAll(params.toBuilder().threadId(threadId).build(), requestOptions)

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
         * /email_inboxes/{inbox_id}/threads/{thread_id}/labels`, but is otherwise the same as
         * [LabelServiceAsync.create].
         */
        fun create(
            threadId: String,
            params: LabelCreateParams,
        ): CompletableFuture<HttpResponseFor<LabelCreateResponse>> =
            create(threadId, params, RequestOptions.none())

        /** @see create */
        fun create(
            threadId: String,
            params: LabelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelCreateResponse>> =
            create(params.toBuilder().threadId(threadId).build(), requestOptions)

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
         * /email_inboxes/{inbox_id}/threads/{thread_id}/labels`, but is otherwise the same as
         * [LabelServiceAsync.deleteAll].
         */
        fun deleteAll(
            threadId: String,
            params: LabelDeleteAllParams,
        ): CompletableFuture<HttpResponseFor<LabelDeleteAllResponse>> =
            deleteAll(threadId, params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            threadId: String,
            params: LabelDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelDeleteAllResponse>> =
            deleteAll(params.toBuilder().threadId(threadId).build(), requestOptions)

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
