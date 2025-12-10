// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryListPage
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryListParams
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryRetrieveParams
import com.telnyx.sdk.models.webhookdeliveries.WebhookDeliveryRetrieveResponse
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
    fun list(): WebhookDeliveryListPage = list(WebhookDeliveryListParams.none())

    /** @see list */
    fun list(
        params: WebhookDeliveryListParams = WebhookDeliveryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookDeliveryListPage

    /** @see list */
    fun list(
        params: WebhookDeliveryListParams = WebhookDeliveryListParams.none()
    ): WebhookDeliveryListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WebhookDeliveryListPage =
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
        fun list(): HttpResponseFor<WebhookDeliveryListPage> =
            list(WebhookDeliveryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookDeliveryListParams = WebhookDeliveryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookDeliveryListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookDeliveryListParams = WebhookDeliveryListParams.none()
        ): HttpResponseFor<WebhookDeliveryListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookDeliveryListPage> =
            list(WebhookDeliveryListParams.none(), requestOptions)
    }
}
