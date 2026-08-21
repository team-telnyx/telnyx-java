// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emailinboxes.EmailInboxCreateParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxDeleteParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxListPage
import com.telnyx.sdk.models.emailinboxes.EmailInboxListParams
import com.telnyx.sdk.models.emailinboxes.EmailInboxResponse
import com.telnyx.sdk.models.emailinboxes.EmailInboxRetrieveParams
import com.telnyx.sdk.services.blocking.emailinboxes.DraftService
import com.telnyx.sdk.services.blocking.emailinboxes.FilterService
import com.telnyx.sdk.services.blocking.emailinboxes.MessageService
import com.telnyx.sdk.services.blocking.emailinboxes.ThreadService
import java.util.function.Consumer

/**
 * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or forward
 * messages.
 */
interface EmailInboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailInboxService

    /**
     * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an agent
     * inbox.
     */
    fun drafts(): DraftService

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    fun filters(): FilterService

    fun messages(): MessageService

    /**
     * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
     * forward messages.
     */
    fun threads(): ThreadService

    /**
     * Creates an inbox on an inbound-enabled domain. When `domain_id` is omitted, Telnyx allocates
     * the account's shared inbound subdomain so the inbox is immediately usable without customer
     * DNS setup. When `username` is omitted, a unique username is generated.
     */
    fun create(): EmailInboxResponse = create(EmailInboxCreateParams.none())

    /** @see create */
    fun create(
        params: EmailInboxCreateParams = EmailInboxCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailInboxResponse

    /** @see create */
    fun create(params: EmailInboxCreateParams = EmailInboxCreateParams.none()): EmailInboxResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): EmailInboxResponse =
        create(EmailInboxCreateParams.none(), requestOptions)

    /**
     * Returns an account-scoped, non-deleted inbox. Missing and foreign inboxes are
     * indistinguishable.
     */
    fun retrieve(id: String): EmailInboxResponse = retrieve(id, EmailInboxRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailInboxRetrieveParams = EmailInboxRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailInboxResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailInboxRetrieveParams = EmailInboxRetrieveParams.none(),
    ): EmailInboxResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailInboxRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailInboxResponse

    /** @see retrieve */
    fun retrieve(params: EmailInboxRetrieveParams): EmailInboxResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EmailInboxResponse =
        retrieve(id, EmailInboxRetrieveParams.none(), requestOptions)

    /** Lists the account's non-deleted inboxes newest first using stable cursor pagination. */
    fun list(): EmailInboxListPage = list(EmailInboxListParams.none())

    /** @see list */
    fun list(
        params: EmailInboxListParams = EmailInboxListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailInboxListPage

    /** @see list */
    fun list(params: EmailInboxListParams = EmailInboxListParams.none()): EmailInboxListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailInboxListPage =
        list(EmailInboxListParams.none(), requestOptions)

    /**
     * Soft-deletes an account-scoped inbox. Its address remains reserved and the inbox is no longer
     * returned by list or get operations.
     */
    fun delete(id: String) = delete(id, EmailInboxDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailInboxDeleteParams = EmailInboxDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: EmailInboxDeleteParams = EmailInboxDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailInboxDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: EmailInboxDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, EmailInboxDeleteParams.none(), requestOptions)

    /** A view of [EmailInboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailInboxService.WithRawResponse

        /**
         * Create, list, retrieve, update, delete, and send unsent draft messages belonging to an
         * agent inbox.
         */
        fun drafts(): DraftService.WithRawResponse

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        fun filters(): FilterService.WithRawResponse

        fun messages(): MessageService.WithRawResponse

        /**
         * Create and manage agent inboxes, retrieve inbound messages and threads, and reply to or
         * forward messages.
         */
        fun threads(): ThreadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_inboxes`, but is otherwise the same as
         * [EmailInboxService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<EmailInboxResponse> = create(EmailInboxCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailInboxCreateParams = EmailInboxCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailInboxResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailInboxCreateParams = EmailInboxCreateParams.none()
        ): HttpResponseFor<EmailInboxResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<EmailInboxResponse> =
            create(EmailInboxCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_inboxes/{id}`, but is otherwise the same as
         * [EmailInboxService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EmailInboxResponse> =
            retrieve(id, EmailInboxRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailInboxRetrieveParams = EmailInboxRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailInboxResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailInboxRetrieveParams = EmailInboxRetrieveParams.none(),
        ): HttpResponseFor<EmailInboxResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailInboxRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailInboxResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EmailInboxRetrieveParams): HttpResponseFor<EmailInboxResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailInboxResponse> =
            retrieve(id, EmailInboxRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_inboxes`, but is otherwise the same as
         * [EmailInboxService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EmailInboxListPage> = list(EmailInboxListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailInboxListParams = EmailInboxListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailInboxListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailInboxListParams = EmailInboxListParams.none()
        ): HttpResponseFor<EmailInboxListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailInboxListPage> =
            list(EmailInboxListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_inboxes/{id}`, but is otherwise the same
         * as [EmailInboxService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, EmailInboxDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailInboxDeleteParams = EmailInboxDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailInboxDeleteParams = EmailInboxDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailInboxDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailInboxDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, EmailInboxDeleteParams.none(), requestOptions)
    }
}
