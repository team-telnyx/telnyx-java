// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.emaildomains

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.emaildomains.webhooks.EmailWebhookResponse
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookCreateParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookDeleteParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookListPageAsync
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookListParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookRetrieveParams
import com.telnyx.sdk.models.emaildomains.webhooks.WebhookUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Per-domain webhook endpoints with event subscriptions */
interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync

    /**
     * Creates a webhook endpoint subscribed to a specific allowlist of event types. Both `email.*`
     * events (published by email-api) and `email_domain.*` events (published by this service) flow
     * through the same webhooks.
     */
    fun create(
        domainId: String,
        params: WebhookCreateParams,
    ): CompletableFuture<EmailWebhookResponse> = create(domainId, params, RequestOptions.none())

    /** @see create */
    fun create(
        domainId: String,
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailWebhookResponse> =
        create(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see create */
    fun create(params: WebhookCreateParams): CompletableFuture<EmailWebhookResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailWebhookResponse>

    /** Retrieve a webhook */
    fun retrieve(
        id: String,
        params: WebhookRetrieveParams,
    ): CompletableFuture<EmailWebhookResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailWebhookResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: WebhookRetrieveParams): CompletableFuture<EmailWebhookResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailWebhookResponse>

    /**
     * Update a webhook's URL and/or event subscription. A webhook is bound to its domain —
     * `domain_id` is not mutable.
     */
    fun update(id: String, params: WebhookUpdateParams): CompletableFuture<EmailWebhookResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailWebhookResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: WebhookUpdateParams): CompletableFuture<EmailWebhookResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailWebhookResponse>

    /** List webhooks for an email domain */
    fun list(domainId: String): CompletableFuture<WebhookListPageAsync> =
        list(domainId, WebhookListParams.none())

    /** @see list */
    fun list(
        domainId: String,
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListPageAsync> =
        list(params.toBuilder().domainId(domainId).build(), requestOptions)

    /** @see list */
    fun list(
        domainId: String,
        params: WebhookListParams = WebhookListParams.none(),
    ): CompletableFuture<WebhookListPageAsync> = list(domainId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WebhookListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListPageAsync>

    /** @see list */
    fun list(params: WebhookListParams): CompletableFuture<WebhookListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        domainId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookListPageAsync> =
        list(domainId, WebhookListParams.none(), requestOptions)

    /** Delete a webhook */
    fun delete(id: String, params: WebhookDeleteParams): CompletableFuture<EmailWebhookResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailWebhookResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: WebhookDeleteParams): CompletableFuture<EmailWebhookResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmailWebhookResponse>

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /email_domains/{domain_id}/webhooks`, but is
         * otherwise the same as [WebhookServiceAsync.create].
         */
        fun create(
            domainId: String,
            params: WebhookCreateParams,
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            create(domainId, params, RequestOptions.none())

        /** @see create */
        fun create(
            domainId: String,
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            create(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see create */
        fun create(
            params: WebhookCreateParams
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>>

        /**
         * Returns a raw HTTP response for `get /email_domains/{domain_id}/webhooks/{id}`, but is
         * otherwise the same as [WebhookServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams,
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>>

        /**
         * Returns a raw HTTP response for `patch /email_domains/{domain_id}/webhooks/{id}`, but is
         * otherwise the same as [WebhookServiceAsync.update].
         */
        fun update(
            id: String,
            params: WebhookUpdateParams,
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: WebhookUpdateParams
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>>

        /**
         * Returns a raw HTTP response for `get /email_domains/{domain_id}/webhooks`, but is
         * otherwise the same as [WebhookServiceAsync.list].
         */
        fun list(domainId: String): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(domainId, WebhookListParams.none())

        /** @see list */
        fun list(
            domainId: String,
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(params.toBuilder().domainId(domainId).build(), requestOptions)

        /** @see list */
        fun list(
            domainId: String,
            params: WebhookListParams = WebhookListParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(domainId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: WebhookListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>>

        /** @see list */
        fun list(
            params: WebhookListParams
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            domainId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(domainId, WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /email_domains/{domain_id}/webhooks/{id}`, but is
         * otherwise the same as [WebhookServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: WebhookDeleteParams,
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: WebhookDeleteParams
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmailWebhookResponse>>
    }
}
