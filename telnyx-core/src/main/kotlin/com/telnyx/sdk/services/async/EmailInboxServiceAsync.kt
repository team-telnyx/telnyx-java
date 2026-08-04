// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.EmailInboxCreateParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxDeleteParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxListParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxListResponse
import com.telnyx.sdk.models.emailinboxes.EmailInboxResponse
import com.telnyx.sdk.models.emailinboxes.EmailInboxRetrieveParams
import com.telnyx.sdk.services.async.emailinboxes.DraftServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.FilterServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.MessageServiceAsync
import com.telnyx.sdk.services.async.emailinboxes.ThreadServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
interface EmailInboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailInboxServiceAsync

    /**
     * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an agent
     * inbox.
     */
    fun drafts(): DraftServiceAsync

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    fun filters(): FilterServiceAsync

    fun messages(): MessageServiceAsync

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    fun threads(): ThreadServiceAsync

    /**
     * Creates an inbox on an inbound-enabled domain. When `domain_id` is omitted, Telnyx allocates
     * the account's shared inbound subdomain so the inbox is immediately usable without customer
     * DNS setup. When `username` is omitted, a unique username is generated.
     */
    fun create(): CompletableFuture<EmailInboxResponse> = create(EmailInboxCreateParams.none())

    /** @see create */
    fun create(
        params: EmailInboxCreateParams = EmailInboxCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailInboxResponse>

    /** @see create */
    fun create(
        params: EmailInboxCreateParams = EmailInboxCreateParams.none()
    ): CompletableFuture<EmailInboxResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<EmailInboxResponse> =
        create(EmailInboxCreateParams.none(), requestOptions)

    /**
     * Returns an account-scoped, non-deleted inbox. Missing and foreign inboxes are
     * indistinguishable.
     */
    fun retrieve(id: String): CompletableFuture<EmailInboxResponse> =
        retrieve(id, EmailInboxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailInboxRetrieveParams = EmailInboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailInboxResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailInboxRetrieveParams = EmailInboxRetrieveParams.none(),
    ): CompletableFuture<EmailInboxResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailInboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailInboxResponse>

    /** @see retrieve */
    fun retrieve(params: EmailInboxRetrieveParams): CompletableFuture<EmailInboxResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailInboxResponse> =
        retrieve(id, EmailInboxRetrieveParams.none(), requestOptions)

    /** Lists the account's non-deleted inboxes newest first using stable cursor pagination. */
    fun list(): CompletableFuture<EmailInboxListResponse> = list(EmailInboxListParams.none())

    /** @see list */
    fun list(
        params: EmailInboxListParams = EmailInboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailInboxListResponse>

    /** @see list */
    fun list(
        params: EmailInboxListParams = EmailInboxListParams.none()
    ): CompletableFuture<EmailInboxListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailInboxListResponse> =
        list(EmailInboxListParams.none(), requestOptions)

    /**
     * Soft-deletes an account-scoped inbox. Its address remains reserved and the inbox is no longer
     * returned by list or get operations.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, EmailInboxDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailInboxDeleteParams = EmailInboxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailInboxDeleteParams = EmailInboxDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailInboxDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: EmailInboxDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, EmailInboxDeleteParams.none(), requestOptions)

    /**
     * A view of [EmailInboxServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailInboxServiceAsync.WithRawResponse

        /**
         * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an
         * agent inbox.
         */
        fun drafts(): DraftServiceAsync.WithRawResponse

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        fun filters(): FilterServiceAsync.WithRawResponse

        fun messages(): MessageServiceAsync.WithRawResponse

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        fun threads(): ThreadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_inboxes`, but is otherwise the same as
         * [EmailInboxServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<EmailInboxResponse>> =
            create(EmailInboxCreateParams.none())

        /** @see create */
        fun create(
            params: EmailInboxCreateParams = EmailInboxCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>>

        /** @see create */
        fun create(
            params: EmailInboxCreateParams = EmailInboxCreateParams.none()
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>> =
            create(EmailInboxCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{id}`, but is otherwise the same as
         * [EmailInboxServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EmailInboxResponse>> =
            retrieve(id, EmailInboxRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailInboxRetrieveParams = EmailInboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailInboxRetrieveParams = EmailInboxRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmailInboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmailInboxRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailInboxResponse>> =
            retrieve(id, EmailInboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_inboxes`, but is otherwise the same as
         * [EmailInboxServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailInboxListResponse>> =
            list(EmailInboxListParams.none())

        /** @see list */
        fun list(
            params: EmailInboxListParams = EmailInboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailInboxListResponse>>

        /** @see list */
        fun list(
            params: EmailInboxListParams = EmailInboxListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailInboxListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailInboxListResponse>> =
            list(EmailInboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_inboxes/{id}`, but is otherwise the same
         * as [EmailInboxServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, EmailInboxDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EmailInboxDeleteParams = EmailInboxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EmailInboxDeleteParams = EmailInboxDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailInboxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: EmailInboxDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, EmailInboxDeleteParams.none(), requestOptions)
    }
}
