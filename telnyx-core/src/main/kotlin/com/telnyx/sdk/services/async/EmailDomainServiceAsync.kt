// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emaildomains.EmailDomainCreateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainDeleteParams
import com.telnyx.sdk.models.emaildomains.EmailDomainListPageAsync
import com.telnyx.sdk.models.emaildomains.EmailDomainListParams
import com.telnyx.sdk.models.emaildomains.EmailDomainResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveDnsRecordsParams
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveDnsRecordsResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveHealthParams
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveHealthResponse
import com.telnyx.sdk.models.emaildomains.EmailDomainRetrieveParams
import com.telnyx.sdk.models.emaildomains.EmailDomainUpdateParams
import com.telnyx.sdk.models.emaildomains.EmailDomainVerifyParams
import com.telnyx.sdk.services.async.emaildomains.WebhookServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmailDomainServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailDomainServiceAsync

    /** Per-domain webhook endpoints with event subscriptions */
    fun webhooks(): WebhookServiceAsync

    /** Create an email domain */
    fun create(params: EmailDomainCreateParams): CompletableFuture<EmailDomainResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailDomainCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse>

    /**
     * Shared (`type: shared`) Telnyx-managed domains are included/readable for every account, in
     * addition to the account's own custom domains.
     */
    fun retrieve(id: String): CompletableFuture<EmailDomainResponse> =
        retrieve(id, EmailDomainRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
    ): CompletableFuture<EmailDomainResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmailDomainRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse>

    /** @see retrieve */
    fun retrieve(params: EmailDomainRetrieveParams): CompletableFuture<EmailDomainResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainResponse> =
        retrieve(id, EmailDomainRetrieveParams.none(), requestOptions)

    /** Update an email domain */
    fun update(id: String): CompletableFuture<EmailDomainResponse> =
        update(id, EmailDomainUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: EmailDomainUpdateParams = EmailDomainUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: EmailDomainUpdateParams = EmailDomainUpdateParams.none(),
    ): CompletableFuture<EmailDomainResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailDomainUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse>

    /** @see update */
    fun update(params: EmailDomainUpdateParams): CompletableFuture<EmailDomainResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<EmailDomainResponse> =
        update(id, EmailDomainUpdateParams.none(), requestOptions)

    /**
     * Shared (`type: shared`) Telnyx-managed domains are included/readable for every account, in
     * addition to the account's own custom domains.
     */
    fun list(): CompletableFuture<EmailDomainListPageAsync> = list(EmailDomainListParams.none())

    /** @see list */
    fun list(
        params: EmailDomainListParams = EmailDomainListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainListPageAsync>

    /** @see list */
    fun list(
        params: EmailDomainListParams = EmailDomainListParams.none()
    ): CompletableFuture<EmailDomainListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmailDomainListPageAsync> =
        list(EmailDomainListParams.none(), requestOptions)

    /** Delete an email domain */
    fun delete(id: String): CompletableFuture<EmailDomainResponse> =
        delete(id, EmailDomainDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
    ): CompletableFuture<EmailDomainResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: EmailDomainDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse>

    /** @see delete */
    fun delete(params: EmailDomainDeleteParams): CompletableFuture<EmailDomainResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<EmailDomainResponse> =
        delete(id, EmailDomainDeleteParams.none(), requestOptions)

    /** List DNS records for an email domain */
    fun retrieveDnsRecords(
        domainId: String
    ): CompletableFuture<EmailDomainRetrieveDnsRecordsResponse> =
        retrieveDnsRecords(domainId, EmailDomainRetrieveDnsRecordsParams.none())

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        domainId: String,
        params: EmailDomainRetrieveDnsRecordsParams = EmailDomainRetrieveDnsRecordsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainRetrieveDnsRecordsResponse> =
        retrieveDnsRecords(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        domainId: String,
        params: EmailDomainRetrieveDnsRecordsParams = EmailDomainRetrieveDnsRecordsParams.none(),
    ): CompletableFuture<EmailDomainRetrieveDnsRecordsResponse> =
        retrieveDnsRecords(domainId, params, RequestOptions.none())

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        params: EmailDomainRetrieveDnsRecordsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainRetrieveDnsRecordsResponse>

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        params: EmailDomainRetrieveDnsRecordsParams
    ): CompletableFuture<EmailDomainRetrieveDnsRecordsResponse> =
        retrieveDnsRecords(params, RequestOptions.none())

    /** @see retrieveDnsRecords */
    fun retrieveDnsRecords(
        domainId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainRetrieveDnsRecordsResponse> =
        retrieveDnsRecords(domainId, EmailDomainRetrieveDnsRecordsParams.none(), requestOptions)

    /** Returns a summary of domain health including verification status and usability. */
    fun retrieveHealth(id: String): CompletableFuture<EmailDomainRetrieveHealthResponse> =
        retrieveHealth(id, EmailDomainRetrieveHealthParams.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        id: String,
        params: EmailDomainRetrieveHealthParams = EmailDomainRetrieveHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainRetrieveHealthResponse> =
        retrieveHealth(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveHealth */
    fun retrieveHealth(
        id: String,
        params: EmailDomainRetrieveHealthParams = EmailDomainRetrieveHealthParams.none(),
    ): CompletableFuture<EmailDomainRetrieveHealthResponse> =
        retrieveHealth(id, params, RequestOptions.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        params: EmailDomainRetrieveHealthParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainRetrieveHealthResponse>

    /** @see retrieveHealth */
    fun retrieveHealth(
        params: EmailDomainRetrieveHealthParams
    ): CompletableFuture<EmailDomainRetrieveHealthResponse> =
        retrieveHealth(params, RequestOptions.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainRetrieveHealthResponse> =
        retrieveHealth(id, EmailDomainRetrieveHealthParams.none(), requestOptions)

    /** Verify DNS records for an email domain */
    fun verify(domainId: String): CompletableFuture<EmailDomainResponse> =
        verify(domainId, EmailDomainVerifyParams.none())

    /** @see verify */
    fun verify(
        domainId: String,
        params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse> =
        verify(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see verify */
    fun verify(
        domainId: String,
        params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
    ): CompletableFuture<EmailDomainResponse> = verify(domainId, params, RequestOptions.none())

    /** @see verify */
    fun verify(
        params: EmailDomainVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailDomainResponse>

    /** @see verify */
    fun verify(params: EmailDomainVerifyParams): CompletableFuture<EmailDomainResponse> =
        verify(params, RequestOptions.none())

    /** @see verify */
    fun verify(
        domainId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EmailDomainResponse> =
        verify(domainId, EmailDomainVerifyParams.none(), requestOptions)

    /**
     * A view of [EmailDomainServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmailDomainServiceAsync.WithRawResponse

        /** Per-domain webhook endpoints with event subscriptions */
        fun webhooks(): WebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_domains`, but is otherwise the same as
         * [EmailDomainServiceAsync.create].
         */
        fun create(
            params: EmailDomainCreateParams
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmailDomainCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>>

        /**
         * Returns a raw HTTP response for `get /email_domains/{id}`, but is otherwise the same as
         * [EmailDomainServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            retrieve(id, EmailDomainRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmailDomainRetrieveParams = EmailDomainRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmailDomainRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>>

        /** @see retrieve */
        fun retrieve(
            params: EmailDomainRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            retrieve(id, EmailDomainRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /email_domains/{id}`, but is otherwise the same as
         * [EmailDomainServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            update(id, EmailDomainUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: EmailDomainUpdateParams = EmailDomainUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: EmailDomainUpdateParams = EmailDomainUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EmailDomainUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>>

        /** @see update */
        fun update(
            params: EmailDomainUpdateParams
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            update(id, EmailDomainUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_domains`, but is otherwise the same as
         * [EmailDomainServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmailDomainListPageAsync>> =
            list(EmailDomainListParams.none())

        /** @see list */
        fun list(
            params: EmailDomainListParams = EmailDomainListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainListPageAsync>>

        /** @see list */
        fun list(
            params: EmailDomainListParams = EmailDomainListParams.none()
        ): CompletableFuture<HttpResponseFor<EmailDomainListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmailDomainListPageAsync>> =
            list(EmailDomainListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_domains/{id}`, but is otherwise the same
         * as [EmailDomainServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            delete(id, EmailDomainDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: EmailDomainDeleteParams = EmailDomainDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: EmailDomainDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>>

        /** @see delete */
        fun delete(
            params: EmailDomainDeleteParams
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            delete(id, EmailDomainDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_domains/{domain_id}/dns_records`, but is
         * otherwise the same as [EmailDomainServiceAsync.retrieveDnsRecords].
         */
        fun retrieveDnsRecords(
            domainId: String
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse>> =
            retrieveDnsRecords(domainId, EmailDomainRetrieveDnsRecordsParams.none())

        /** @see retrieveDnsRecords */
        fun retrieveDnsRecords(
            domainId: String,
            params: EmailDomainRetrieveDnsRecordsParams =
                EmailDomainRetrieveDnsRecordsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse>> =
            retrieveDnsRecords(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see retrieveDnsRecords */
        fun retrieveDnsRecords(
            domainId: String,
            params: EmailDomainRetrieveDnsRecordsParams = EmailDomainRetrieveDnsRecordsParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse>> =
            retrieveDnsRecords(domainId, params, RequestOptions.none())

        /** @see retrieveDnsRecords */
        fun retrieveDnsRecords(
            params: EmailDomainRetrieveDnsRecordsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse>>

        /** @see retrieveDnsRecords */
        fun retrieveDnsRecords(
            params: EmailDomainRetrieveDnsRecordsParams
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse>> =
            retrieveDnsRecords(params, RequestOptions.none())

        /** @see retrieveDnsRecords */
        fun retrieveDnsRecords(
            domainId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveDnsRecordsResponse>> =
            retrieveDnsRecords(domainId, EmailDomainRetrieveDnsRecordsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /email_domains/{id}/health`, but is otherwise the
         * same as [EmailDomainServiceAsync.retrieveHealth].
         */
        fun retrieveHealth(
            id: String
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveHealthResponse>> =
            retrieveHealth(id, EmailDomainRetrieveHealthParams.none())

        /** @see retrieveHealth */
        fun retrieveHealth(
            id: String,
            params: EmailDomainRetrieveHealthParams = EmailDomainRetrieveHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveHealthResponse>> =
            retrieveHealth(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveHealth */
        fun retrieveHealth(
            id: String,
            params: EmailDomainRetrieveHealthParams = EmailDomainRetrieveHealthParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveHealthResponse>> =
            retrieveHealth(id, params, RequestOptions.none())

        /** @see retrieveHealth */
        fun retrieveHealth(
            params: EmailDomainRetrieveHealthParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveHealthResponse>>

        /** @see retrieveHealth */
        fun retrieveHealth(
            params: EmailDomainRetrieveHealthParams
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveHealthResponse>> =
            retrieveHealth(params, RequestOptions.none())

        /** @see retrieveHealth */
        fun retrieveHealth(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainRetrieveHealthResponse>> =
            retrieveHealth(id, EmailDomainRetrieveHealthParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /email_domains/{domain_id}/verify`, but is
         * otherwise the same as [EmailDomainServiceAsync.verify].
         */
        fun verify(domainId: String): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            verify(domainId, EmailDomainVerifyParams.none())

        /** @see verify */
        fun verify(
            domainId: String,
            params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            verify(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see verify */
        fun verify(
            domainId: String,
            params: EmailDomainVerifyParams = EmailDomainVerifyParams.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            verify(domainId, params, RequestOptions.none())

        /** @see verify */
        fun verify(
            params: EmailDomainVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>>

        /** @see verify */
        fun verify(
            params: EmailDomainVerifyParams
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            verify(params, RequestOptions.none())

        /** @see verify */
        fun verify(
            domainId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmailDomainResponse>> =
            verify(domainId, EmailDomainVerifyParams.none(), requestOptions)
    }
}
