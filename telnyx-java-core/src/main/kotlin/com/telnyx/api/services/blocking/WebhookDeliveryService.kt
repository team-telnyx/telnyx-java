// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryListParams
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryListResponse
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryRetrieveParams
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryRetrieveResponse
import java.util.function.Consumer

interface WebhookDeliveryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookDeliveryService

    /** Provides webhook_delivery debug data, such as timestamps, delivery status and attempts. */
    fun retrieve(id: String): WebhookDeliveryRetrieveResponse =
        retrieve(id, WebhookDeliveryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WebhookDeliveryRetrieveParams = WebhookDeliveryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeliveryRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WebhookDeliveryRetrieveParams = WebhookDeliveryRetrieveParams.none(),
    ): WebhookDeliveryRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookDeliveryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeliveryRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: WebhookDeliveryRetrieveParams): WebhookDeliveryRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): WebhookDeliveryRetrieveResponse =
        retrieve(id, WebhookDeliveryRetrieveParams.none(), requestOptions)

    /** Lists webhook_deliveries for the authenticated user */
    fun list(): WebhookDeliveryListResponse = list(WebhookDeliveryListParams.none())

    /** @see list */
    fun list(
        params: WebhookDeliveryListParams = WebhookDeliveryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeliveryListResponse

    /** @see list */
    fun list(
        params: WebhookDeliveryListParams = WebhookDeliveryListParams.none()
    ): WebhookDeliveryListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WebhookDeliveryListResponse =
        list(WebhookDeliveryListParams.none(), requestOptions)

    /**
     * A view of [WebhookDeliveryService] that provides access to raw HTTP responses for each
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
        ): WebhookDeliveryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhook_deliveries/{id}`, but is otherwise the same
         * as [WebhookDeliveryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<WebhookDeliveryRetrieveResponse> =
            retrieve(id, WebhookDeliveryRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookDeliveryRetrieveParams = WebhookDeliveryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeliveryRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WebhookDeliveryRetrieveParams = WebhookDeliveryRetrieveParams.none(),
        ): HttpResponseFor<WebhookDeliveryRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WebhookDeliveryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeliveryRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WebhookDeliveryRetrieveParams
        ): HttpResponseFor<WebhookDeliveryRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookDeliveryRetrieveResponse> =
            retrieve(id, WebhookDeliveryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhook_deliveries`, but is otherwise the same as
         * [WebhookDeliveryService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WebhookDeliveryListResponse> =
            list(WebhookDeliveryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookDeliveryListParams = WebhookDeliveryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeliveryListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookDeliveryListParams = WebhookDeliveryListParams.none()
        ): HttpResponseFor<WebhookDeliveryListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookDeliveryListResponse> =
            list(WebhookDeliveryListParams.none(), requestOptions)
    }
}
