// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emailinboxes

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.threads.ThreadListPage
import com.telnyx.sdk.models.emailinboxes.threads.ThreadListParams
import com.telnyx.sdk.models.emailinboxes.threads.ThreadRetrieveParams
import com.telnyx.sdk.models.emailinboxes.threads.ThreadRetrieveResponse
import com.telnyx.sdk.services.blocking.emailinboxes.threads.LabelService
import java.util.function.Consumer

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
interface ThreadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    fun labels(): LabelService

    /**
     * Returns a bounded page of inbound and outbound thread messages interleaved in chronological
     * order using stable cursor pagination.
     */
    fun retrieve(threadId: String, params: ThreadRetrieveParams): ThreadRetrieveResponse =
        retrieve(threadId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        threadId: String,
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadRetrieveResponse =
        retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ThreadRetrieveParams): ThreadRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadRetrieveResponse

    /** Lists thread summaries newest first using stable cursor pagination. */
    fun list(inboxId: String): ThreadListPage = list(inboxId, ThreadListParams.none())

    /** @see list */
    fun list(
        inboxId: String,
        params: ThreadListParams = ThreadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadListPage = list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

    /** @see list */
    fun list(inboxId: String, params: ThreadListParams = ThreadListParams.none()): ThreadListPage =
        list(inboxId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ThreadListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadListPage

    /** @see list */
    fun list(params: ThreadListParams): ThreadListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(inboxId: String, requestOptions: RequestOptions): ThreadListPage =
        list(inboxId, ThreadListParams.none(), requestOptions)

    /** A view of [ThreadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService.WithRawResponse

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        fun labels(): LabelService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/threads/{thread_id}`, but
         * is otherwise the same as [ThreadService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            threadId: String,
            params: ThreadRetrieveParams,
        ): HttpResponseFor<ThreadRetrieveResponse> =
            retrieve(threadId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            threadId: String,
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadRetrieveResponse> =
            retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ThreadRetrieveParams): HttpResponseFor<ThreadRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{inbox_id}/threads`, but is otherwise
         * the same as [ThreadService.list].
         */
        @MustBeClosed
        fun list(inboxId: String): HttpResponseFor<ThreadListPage> =
            list(inboxId, ThreadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            inboxId: String,
            params: ThreadListParams = ThreadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadListPage> =
            list(params.toBuilder().inboxId(inboxId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            inboxId: String,
            params: ThreadListParams = ThreadListParams.none(),
        ): HttpResponseFor<ThreadListPage> = list(inboxId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ThreadListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ThreadListParams): HttpResponseFor<ThreadListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(inboxId: String, requestOptions: RequestOptions): HttpResponseFor<ThreadListPage> =
            list(inboxId, ThreadListParams.none(), requestOptions)
    }
}
