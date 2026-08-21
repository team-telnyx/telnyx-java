// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emailinboxes

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.threads.ThreadListPageAsync
import com.telnyx.sdk.models.emailinboxes.threads.ThreadListParams
import com.telnyx.sdk.models.emailinboxes.threads.ThreadRetrieveParams
import com.telnyx.sdk.models.emailinboxes.threads.ThreadRetrieveResponse
import com.telnyx.sdk.services.async.emailinboxes.threads.LabelServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
interface ThreadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadServiceAsync

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    fun labels(): LabelServiceAsync

    /**
     * Returns a bounded page of inbound and outbound thread messages interleaved in chronological
     * order using stable cursor pagination.
     */
    fun retrieve(
        threadId: String,
        params: ThreadRetrieveParams,
    ): CompletableFuture<ThreadRetrieveResponse> = retrieve(threadId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        threadId: String,
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadRetrieveResponse> =
        retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ThreadRetrieveParams): CompletableFuture<ThreadRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadRetrieveResponse>

    /** Lists thread summaries newest first using stable cursor pagination. */
    fun list(inboxId: String): CompletableFuture<ThreadListPageAsync> =
        list(inboxId, ThreadListParams.none())

    /** @see list */
    fun list(
        inboxId: String,
        params: ThreadListParams = ThreadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadListPageAsync> =
        list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see list */
    fun list(
        inboxId: String,
        params: ThreadListParams = ThreadListParams.none(),
    ): CompletableFuture<ThreadListPageAsync> = list(inboxId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ThreadListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadListPageAsync>

    /** @see list */
    fun list(params: ThreadListParams): CompletableFuture<ThreadListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        inboxId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadListPageAsync> =
        list(inboxId, ThreadListParams.none(), requestOptions)

    /**
     * A view of [ThreadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadServiceAsync.WithRawResponse

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        fun labels(): LabelServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/threads/{thread_id}`, but
         * is otherwise the same as [ThreadServiceAsync.retrieve].
         */
        fun retrieve(
            threadId: String,
            params: ThreadRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ThreadRetrieveResponse>> =
            retrieve(threadId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            threadId: String,
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadRetrieveResponse>> =
            retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ThreadRetrieveParams
        ): CompletableFuture<HttpResponseFor<ThreadRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/threads`, but is otherwise
         * the same as [ThreadServiceAsync.list].
         */
        fun list(inboxId: String): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> =
            list(inboxId, ThreadListParams.none())

        /** @see list */
        fun list(
            inboxId: String,
            params: ThreadListParams = ThreadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> =
            list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see list */
        fun list(
            inboxId: String,
            params: ThreadListParams = ThreadListParams.none(),
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> =
            list(inboxId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ThreadListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>>

        /** @see list */
        fun list(
            params: ThreadListParams
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            inboxId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadListPageAsync>> =
            list(inboxId, ThreadListParams.none(), requestOptions)
    }
}
