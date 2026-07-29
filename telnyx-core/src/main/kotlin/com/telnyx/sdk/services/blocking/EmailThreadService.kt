// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.threads.InboundThreadListResponse
import com.telnyx.sdk.models.emailthreads.EmailThreadListParams
import com.telnyx.sdk.models.emailthreads.EmailThreadRetrieveParams
import com.telnyx.sdk.models.emailthreads.EmailThreadRetrieveResponse
import java.util.function.Consumer

/**
 * Account-wide conversation threads across every inbox, for agents operating many inboxes at once.
 */
interface EmailThreadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailThreadService

    /**
     * Returns a thread and a bounded page of its inbound and outbound messages, interleaved in
     * chronological order. The `inbox_id` returned by the list endpoint is required because a
     * thread ID can occur in multiple inboxes. Only messages matching that `(inbox_id, thread_id)`
     * pair are returned. Threads outside the account return an opaque 404.
     */
    fun retrieve(threadId: String, params: EmailThreadRetrieveParams): EmailThreadRetrieveResponse =
        retrieve(threadId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        threadId: String,
        params: EmailThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailThreadRetrieveResponse =
        retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: EmailThreadRetrieveParams): EmailThreadRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailThreadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailThreadRetrieveResponse

    /**
     * Lists thread summaries for the whole account, newest first, using stable cursor pagination.
     * An agent operating many inboxes gets every conversation in one call instead of one call per
     * inbox. Each thread carries its own `inbox_id` so a reply can be routed back to the right
     * inbox. Use `filter[inbox_id]` (repeatable) to narrow the result to specific inboxes. Because
     * a thread ID can be delivered to multiple inboxes, each result is identified by its
     * `(inbox_id, id)` pair.
     */
    fun list(): InboundThreadListResponse = list(EmailThreadListParams.none())

    /** @see list */
    fun list(
        params: EmailThreadListParams = EmailThreadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundThreadListResponse

    /** @see list */
    fun list(
        params: EmailThreadListParams = EmailThreadListParams.none()
    ): InboundThreadListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InboundThreadListResponse =
        list(EmailThreadListParams.none(), requestOptions)

    /**
     * A view of [EmailThreadService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailThreadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /email_threads/{thread_id}`, but is otherwise the
         * same as [EmailThreadService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            threadId: String,
            params: EmailThreadRetrieveParams,
        ): HttpResponseFor<EmailThreadRetrieveResponse> =
            retrieve(threadId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            threadId: String,
            params: EmailThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailThreadRetrieveResponse> =
            retrieve(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailThreadRetrieveParams
        ): HttpResponseFor<EmailThreadRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailThreadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailThreadRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /email_threads`, but is otherwise the same as
         * [EmailThreadService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InboundThreadListResponse> = list(EmailThreadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailThreadListParams = EmailThreadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundThreadListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailThreadListParams = EmailThreadListParams.none()
        ): HttpResponseFor<InboundThreadListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundThreadListResponse> =
            list(EmailThreadListParams.none(), requestOptions)
    }
}
