// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.emaildomains

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emaildomains.webhooks.EmailWebhookResponse
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookCreateParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookDeleteParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookListPage
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookListParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookRetrieveParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookUpdateParams
import java.util.function.Consumer

/** Per-domain webhook endpoints with event subscriptions */
interface WebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService

    /**
     * Creates a webhook endpoint subscribed to a specific allowlist of event types. Both `email.*`
     * events (published by email-api) and `email_domain.*` events (published by this service) flow
     * through the same webhooks.
     */
    fun create(domainId: String, params: WebhookCreateParams): EmailWebhookResponse =
        create(domainId, params, RequestOptions.none())

    /** @see create */
    fun create(
        domainId: String,
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailWebhookResponse = create(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see create */
    fun create(params: WebhookCreateParams): EmailWebhookResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailWebhookResponse

    /** Retrieve a webhook */
    fun retrieve(id: String, params: WebhookRetrieveParams): EmailWebhookResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailWebhookResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: WebhookRetrieveParams): EmailWebhookResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailWebhookResponse

    /**
     * Update a webhook's URL and/or event subscription. A webhook is bound to its domain —
     * `domain_id` is not mutable.
     */
    fun update(id: String, params: WebhookUpdateParams): EmailWebhookResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailWebhookResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: WebhookUpdateParams): EmailWebhookResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailWebhookResponse

    /** List webhooks for an email domain */
    fun list(domainId: String): WebhookListPage = list(domainId, WebhookListParams.none())

    /** @see list */
    fun list(
        domainId: String,
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListPage = list(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see list */
    fun list(
        domainId: String,
        params: WebhookListParams = WebhookListParams.none(),
    ): WebhookListPage = list(domainId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookListPage

    /** @see list */
    fun list(params: WebhookListParams): WebhookListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(domainId: String, requestOptions: RequestOptions): WebhookListPage =
        list(domainId, WebhookListParams.none(), requestOptions)

    /** Delete a webhook */
    fun delete(id: String, params: WebhookDeleteParams): EmailWebhookResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailWebhookResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: WebhookDeleteParams): EmailWebhookResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailWebhookResponse

    /** A view of [WebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_domains/{domain_id}/webhooks`, but is
         * otherwise the same as [WebhookService.create].
         */
        @MustBeClosed
        fun create(
            domainId: String,
            params: WebhookCreateParams,
        ): HttpResponseFor<EmailWebhookResponse> = create(domainId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            domainId: String,
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailWebhookResponse> =
            create(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: WebhookCreateParams): HttpResponseFor<EmailWebhookResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailWebhookResponse>

        /**
         * Returns a raw HTTP response for `get /email_domains/{domain_id}/webhooks/{id}`, but is
         * otherwise the same as [WebhookService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams,
        ): HttpResponseFor<EmailWebhookResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailWebhookResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: WebhookRetrieveParams): HttpResponseFor<EmailWebhookResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailWebhookResponse>

        /**
         * Returns a raw HTTP response for `patch /email_domains/{domain_id}/webhooks/{id}`, but is
         * otherwise the same as [WebhookService.update].
         */
        @MustBeClosed
        fun update(id: String, params: WebhookUpdateParams): HttpResponseFor<EmailWebhookResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailWebhookResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: WebhookUpdateParams): HttpResponseFor<EmailWebhookResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailWebhookResponse>

        /**
         * Returns a raw HTTP response for `get /email_domains/{domain_id}/webhooks`, but is
         * otherwise the same as [WebhookService.list].
         */
        @MustBeClosed
        fun list(domainId: String): HttpResponseFor<WebhookListPage> =
            list(domainId, WebhookListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            domainId: String,
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListPage> =
            list(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            domainId: String,
            params: WebhookListParams = WebhookListParams.none(),
        ): HttpResponseFor<WebhookListPage> = list(domainId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: WebhookListParams): HttpResponseFor<WebhookListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            domainId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookListPage> =
            list(domainId, WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_domains/{domain_id}/webhooks/{id}`, but is
         * otherwise the same as [WebhookService.delete].
         */
        @MustBeClosed
        fun delete(id: String, params: WebhookDeleteParams): HttpResponseFor<EmailWebhookResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailWebhookResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: WebhookDeleteParams): HttpResponseFor<EmailWebhookResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailWebhookResponse>
    }
}
