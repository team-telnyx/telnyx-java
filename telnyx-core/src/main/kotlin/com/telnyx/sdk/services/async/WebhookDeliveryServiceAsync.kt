// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryListPageAsync
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryListParams
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryRetrieveParams
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookDeliveryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookDeliveryServiceAsync

    /** Provides webhook_delivery debug data, such as timestamps, delivery status and attempts. */
    fun retrieve(id: String): CompletableFuture<WebhookDeliveryRetrieveResponse> =
        retrieve(id, WebhookDeliveryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WebhookDeliveryRetrieveParams = WebhookDeliveryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeliveryRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WebhookDeliveryRetrieveParams = WebhookDeliveryRetrieveParams.none(),
    ): CompletableFuture<WebhookDeliveryRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookDeliveryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeliveryRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: WebhookDeliveryRetrieveParams
    ): CompletableFuture<WebhookDeliveryRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDeliveryRetrieveResponse> =
        retrieve(id, WebhookDeliveryRetrieveParams.none(), requestOptions)

    /** Lists webhook_deliveries for the authenticated user */
    fun list(): CompletableFuture<WebhookDeliveryListPageAsync> =
        list(WebhookDeliveryListParams.none())

    /** @see list */
    fun list(
        params: WebhookDeliveryListParams = WebhookDeliveryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeliveryListPageAsync>

    /** @see list */
    fun list(
        params: WebhookDeliveryListParams = WebhookDeliveryListParams.none()
    ): CompletableFuture<WebhookDeliveryListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookDeliveryListPageAsync> =
        list(WebhookDeliveryListParams.none(), requestOptions)

    /**
     * A view of [WebhookDeliveryServiceAsync] that provides access to raw HTTP responses for each
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
        ): WebhookDeliveryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhook_deliveries/{id}`, but is otherwise the same
         * as [WebhookDeliveryServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryRetrieveResponse>> =
            retrieve(id, WebhookDeliveryRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WebhookDeliveryRetrieveParams = WebhookDeliveryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WebhookDeliveryRetrieveParams = WebhookDeliveryRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WebhookDeliveryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WebhookDeliveryRetrieveParams
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryRetrieveResponse>> =
            retrieve(id, WebhookDeliveryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhook_deliveries`, but is otherwise the same as
         * [WebhookDeliveryServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WebhookDeliveryListPageAsync>> =
            list(WebhookDeliveryListParams.none())

        /** @see list */
        fun list(
            params: WebhookDeliveryListParams = WebhookDeliveryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryListPageAsync>>

        /** @see list */
        fun list(
            params: WebhookDeliveryListParams = WebhookDeliveryListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryListPageAsync>> =
            list(WebhookDeliveryListParams.none(), requestOptions)
    }
}
