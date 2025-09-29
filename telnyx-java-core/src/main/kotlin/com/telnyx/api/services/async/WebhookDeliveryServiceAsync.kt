// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryListParams
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryListResponse
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryRetrieveParams
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryRetrieveResponse
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
    fun list(): CompletableFuture<WebhookDeliveryListResponse> =
        list(WebhookDeliveryListParams.none())

    /** @see list */
    fun list(
        params: WebhookDeliveryListParams = WebhookDeliveryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDeliveryListResponse>

    /** @see list */
    fun list(
        params: WebhookDeliveryListParams = WebhookDeliveryListParams.none()
    ): CompletableFuture<WebhookDeliveryListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookDeliveryListResponse> =
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
        fun list(): CompletableFuture<HttpResponseFor<WebhookDeliveryListResponse>> =
            list(WebhookDeliveryListParams.none())

        /** @see list */
        fun list(
            params: WebhookDeliveryListParams = WebhookDeliveryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryListResponse>>

        /** @see list */
        fun list(
            params: WebhookDeliveryListParams = WebhookDeliveryListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookDeliveryListResponse>> =
            list(WebhookDeliveryListParams.none(), requestOptions)
    }
}
