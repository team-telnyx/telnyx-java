// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emaildomains.EmailDomainCreateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainDeleteParams
import com.telnyx.sdk.models.emaildomains.EmailDomainListPage
import com.telnyx.sdk.models.emaildomains.EmailDomainListParams
import com.telnyx.sdk.models.emaildomains.EmailDomainResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveDnsRecordsParams
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveDnsRecordsResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveHealthParams
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveHealthResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveParams
import com.telnyx.sdk.models.emaildomains.EmailDomainUpdateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainVerifyParams
import com.telnyx.sdk.services.blocking.emaildomains.WebhookService
import java.util.function.Consumer

interface EmailDomainService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailDomainService

    /** Per-domain webhook endpoints with event subscriptions */
    fun webhooks(): WebhookService

    /** Create an email domain */
    fun create(params: EmailDomainCreateParams): EmailDomainResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailDomainCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse

    /**
     * Shared (`type: shared`) Telnyx-managed domains are included/readable for every account, in
     * addition to the account's own custom domains.
     */
    fun retrieve(id: String): EmailDomainResponse = retrieve(id, EmailDomainRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
    ): EmailDomainResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailDomainRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse

    /** @see retrieve */
    fun retrieve(params: EmailDomainRetrieveParams): EmailDomainResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EmailDomainResponse =
        retrieve(id, EmailDomainRetrieveParams.none(), requestOptions)

    /** Update an email domain */
    fun update(id: String): EmailDomainResponse = update(id, EmailDomainUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: EmailDomainUpdateParams = EmailDomainUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: EmailDomainUpdateParams = EmailDomainUpdateParams.none(),
    ): EmailDomainResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailDomainUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse

    /** @see update */
    fun update(params: EmailDomainUpdateParams): EmailDomainResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): EmailDomainResponse =
        update(id, EmailDomainUpdateParams.none(), requestOptions)

    /**
     * Shared (`type: shared`) Telnyx-managed domains are included/readable for every account, in
     * addition to the account's own custom domains.
     */
    fun list(): EmailDomainListPage = list(EmailDomainListParams.none())

    /** @see list */
    fun list(
        params: EmailDomainListParams = EmailDomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainListPage

    /** @see list */
    fun list(params: EmailDomainListParams = EmailDomainListParams.none()): EmailDomainListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailDomainListPage =
        list(EmailDomainListParams.none(), requestOptions)

    /** Delete an email domain */
    fun delete(id: String): EmailDomainResponse = delete(id, EmailDomainDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
    ): EmailDomainResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailDomainDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse

    /** @see delete */
    fun delete(params: EmailDomainDeleteParams): EmailDomainResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): EmailDomainResponse =
        delete(id, EmailDomainDeleteParams.none(), requestOptions)

    /** List DNS records for an email domain */
    fun retrieveDnsRecords(domainId: String): EmailDomainRetrieveDnsRecordsResponse =
        retrieveDnsRecords(domainId, EmailDomainRetrieveDnsRecordsParams.none())

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        domainId: String,
        params: EmailDomainRetrieveDnsRecordsParams = EmailDomainRetrieveDnsRecordsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainRetrieveDnsRecordsResponse =
        retrieveDnsRecords(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        domainId: String,
        params: EmailDomainRetrieveDnsRecordsParams = EmailDomainRetrieveDnsRecordsParams.none(),
    ): EmailDomainRetrieveDnsRecordsResponse =
        retrieveDnsRecords(domainId, params, RequestOptions.none())

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        params: EmailDomainRetrieveDnsRecordsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainRetrieveDnsRecordsResponse

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        params: EmailDomainRetrieveDnsRecordsParams
    ): EmailDomainRetrieveDnsRecordsResponse = retrieveDnsRecords(params, RequestOptions.none())

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        domainId: String,
        requestOptions: RequestOptions,
    ): EmailDomainRetrieveDnsRecordsResponse =
        retrieveDnsRecords(domainId, EmailDomainRetrieveDnsRecordsParams.none(), requestOptions)

    /** Returns a summary of domain health including verification status and usability. */
    fun retrieveHealth(id: String): EmailDomainRetrieveHealthResponse =
        retrieveHealth(id, EmailDomainRetrieveHealthParams.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        id: String,
        params: EmailDomainRetrieveHealthParams = EmailDomainRetrieveHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainRetrieveHealthResponse =
        retrieveHealth(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveHealth */
    fun retrieveHealth(
        id: String,
        params: EmailDomainRetrieveHealthParams = EmailDomainRetrieveHealthParams.none(),
    ): EmailDomainRetrieveHealthResponse = retrieveHealth(id, params, RequestOptions.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        params: EmailDomainRetrieveHealthParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainRetrieveHealthResponse

    /** @see retrieveHealth */
    fun retrieveHealth(params: EmailDomainRetrieveHealthParams): EmailDomainRetrieveHealthResponse =
        retrieveHealth(params, RequestOptions.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        id: String,
        requestOptions: RequestOptions,
    ): EmailDomainRetrieveHealthResponse =
        retrieveHealth(id, EmailDomainRetrieveHealthParams.none(), requestOptions)

    /** Verify DNS records for an email domain */
    fun verify(domainId: String): EmailDomainResponse =
        verify(domainId, EmailDomainVerifyParams.none())

    /** @see verify */
    fun verify(
        domainId: String,
        params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse = verify(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see verify */
    fun verify(
        domainId: String,
        params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
    ): EmailDomainResponse = verify(domainId, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: EmailDomainVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailDomainResponse

    /** @see verify */
    fun verify(params: EmailDomainVerifyParams): EmailDomainResponse =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(domainId: String, requestOptions: RequestOptions): EmailDomainResponse =
        verify(domainId, EmailDomainVerifyParams.none(), requestOptions)

    /**
     * A view of [EmailDomainService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EmailDomainService.WithRawResponse

        /** Per-domain webhook endpoints with event subscriptions */
        fun webhooks(): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_domains`, but is otherwise the same as
         * [EmailDomainService.create].
         */
        @MustBeClosed
        fun create(params: EmailDomainCreateParams): HttpResponseFor<EmailDomainResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailDomainCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse>

        /**
         * Returns a raw HTTP response for `get /email_domains/{id}`, but is otherwise the same as
         * [EmailDomainService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<EmailDomainResponse> =
            retrieve(id, EmailDomainRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
        ): HttpResponseFor<EmailDomainResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmailDomainRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: EmailDomainRetrieveParams): HttpResponseFor<EmailDomainResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> =
            retrieve(id, EmailDomainRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email_domains/{id}`, but is otherwise the same as
         * [EmailDomainService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<EmailDomainResponse> =
            update(id, EmailDomainUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailDomainUpdateParams = EmailDomainUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: EmailDomainUpdateParams = EmailDomainUpdateParams.none(),
        ): HttpResponseFor<EmailDomainResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmailDomainUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: EmailDomainUpdateParams): HttpResponseFor<EmailDomainResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> =
            update(id, EmailDomainUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_domains`, but is otherwise the same as
         * [EmailDomainService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<EmailDomainListPage> = list(EmailDomainListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailDomainListParams = EmailDomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailDomainListParams = EmailDomainListParams.none()
        ): HttpResponseFor<EmailDomainListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailDomainListPage> =
            list(EmailDomainListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_domains/{id}`, but is otherwise the same
         * as [EmailDomainService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<EmailDomainResponse> =
            delete(id, EmailDomainDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
        ): HttpResponseFor<EmailDomainResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailDomainDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailDomainDeleteParams): HttpResponseFor<EmailDomainResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> =
            delete(id, EmailDomainDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_domains/{domain_id}/dns_records`, but is
         * otherwise the same as [EmailDomainService.retrieveDnsRecords].
         */
        @MustBeClosed
        fun retrieveDnsRecords(
            domainId: String
        ): HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse> =
            retrieveDnsRecords(domainId, EmailDomainRetrieveDnsRecordsParams.none())

        /** @see retrieveDnsRecords */
        @MustBeClosed
        fun retrieveDnsRecords(
            domainId: String,
            params: EmailDomainRetrieveDnsRecordsParams =
                EmailDomainRetrieveDnsRecordsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse> =
            retrieveDnsRecords(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see retrieveDnsRecords */
        @MustBeClosed
        fun retrieveDnsRecords(
            domainId: String,
            params: EmailDomainRetrieveDnsRecordsParams = EmailDomainRetrieveDnsRecordsParams.none(),
        ): HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse> =
            retrieveDnsRecords(domainId, params, RequestOptions.none())

        /** @see retrieveDnsRecords */
        @MustBeClosed
        fun retrieveDnsRecords(
            params: EmailDomainRetrieveDnsRecordsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse>

        /** @see retrieveDnsRecords */
        @MustBeClosed
        fun retrieveDnsRecords(
            params: EmailDomainRetrieveDnsRecordsParams
        ): HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse> =
            retrieveDnsRecords(params, RequestOptions.none())

        /** @see retrieveDnsRecords */
        @MustBeClosed
        fun retrieveDnsRecords(
            domainId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse> =
            retrieveDnsRecords(domainId, EmailDomainRetrieveDnsRecordsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_domains/{id}/health`, but is otherwise the
         * same as [EmailDomainService.retrieveHealth].
         */
        @MustBeClosed
        fun retrieveHealth(id: String): HttpResponseFor<EmailDomainRetrieveHealthResponse> =
            retrieveHealth(id, EmailDomainRetrieveHealthParams.none())

        /** @see retrieveHealth */
        @MustBeClosed
        fun retrieveHealth(
            id: String,
            params: EmailDomainRetrieveHealthParams = EmailDomainRetrieveHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainRetrieveHealthResponse> =
            retrieveHealth(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveHealth */
        @MustBeClosed
        fun retrieveHealth(
            id: String,
            params: EmailDomainRetrieveHealthParams = EmailDomainRetrieveHealthParams.none(),
        ): HttpResponseFor<EmailDomainRetrieveHealthResponse> =
            retrieveHealth(id, params, RequestOptions.none())

        /** @see retrieveHealth */
        @MustBeClosed
        fun retrieveHealth(
            params: EmailDomainRetrieveHealthParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainRetrieveHealthResponse>

        /** @see retrieveHealth */
        @MustBeClosed
        fun retrieveHealth(
            params: EmailDomainRetrieveHealthParams
        ): HttpResponseFor<EmailDomainRetrieveHealthResponse> =
            retrieveHealth(params, RequestOptions.none())

        /** @see retrieveHealth */
        @MustBeClosed
        fun retrieveHealth(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainRetrieveHealthResponse> =
            retrieveHealth(id, EmailDomainRetrieveHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email_domains/{domain_id}/verify`, but is
         * otherwise the same as [EmailDomainService.verify].
         */
        @MustBeClosed
        fun verify(domainId: String): HttpResponseFor<EmailDomainResponse> =
            verify(domainId, EmailDomainVerifyParams.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            domainId: String,
            params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse> =
            verify(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        fun verify(
            domainId: String,
            params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
        ): HttpResponseFor<EmailDomainResponse> = verify(domainId, params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            params: EmailDomainVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailDomainResponse>

        /** @see verify */
        @MustBeClosed
        fun verify(params: EmailDomainVerifyParams): HttpResponseFor<EmailDomainResponse> =
            verify(params, RequestOptions.none())

        /** @see verify */
        @MustBeClosed
        fun verify(
            domainId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmailDomainResponse> =
            verify(domainId, EmailDomainVerifyParams.none(), requestOptions)
    }
}
