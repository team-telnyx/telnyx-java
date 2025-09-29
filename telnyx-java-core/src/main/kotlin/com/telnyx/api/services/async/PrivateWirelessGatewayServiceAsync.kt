// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.privatewirelessgateways.PrivateWirelessGatewayCreateParams
import com.telnyx.api.models.privatewirelessgateways.PrivateWirelessGatewayCreateResponse
import com.telnyx.api.models.privatewirelessgateways.PrivateWirelessGatewayDeleteParams
import com.telnyx.api.models.privatewirelessgateways.PrivateWirelessGatewayDeleteResponse
import com.telnyx.api.models.privatewirelessgateways.PrivateWirelessGatewayListParams
import com.telnyx.api.models.privatewirelessgateways.PrivateWirelessGatewayListResponse
import com.telnyx.api.models.privatewirelessgateways.PrivateWirelessGatewayRetrieveParams
import com.telnyx.api.models.privatewirelessgateways.PrivateWirelessGatewayRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PrivateWirelessGatewayServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivateWirelessGatewayServiceAsync

    /**
     * Asynchronously create a Private Wireless Gateway for SIM cards for a previously created
     * network. This operation may take several minutes so you can check the Private Wireless
     * Gateway status at the section Get a Private Wireless Gateway.
     */
    fun create(
        params: PrivateWirelessGatewayCreateParams
    ): CompletableFuture<PrivateWirelessGatewayCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PrivateWirelessGatewayCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateWirelessGatewayCreateResponse>

    /** Retrieve information about a Private Wireless Gateway. */
    fun retrieve(id: String): CompletableFuture<PrivateWirelessGatewayRetrieveResponse> =
        retrieve(id, PrivateWirelessGatewayRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PrivateWirelessGatewayRetrieveParams = PrivateWirelessGatewayRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateWirelessGatewayRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PrivateWirelessGatewayRetrieveParams = PrivateWirelessGatewayRetrieveParams.none(),
    ): CompletableFuture<PrivateWirelessGatewayRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PrivateWirelessGatewayRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateWirelessGatewayRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: PrivateWirelessGatewayRetrieveParams
    ): CompletableFuture<PrivateWirelessGatewayRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateWirelessGatewayRetrieveResponse> =
        retrieve(id, PrivateWirelessGatewayRetrieveParams.none(), requestOptions)

    /** Get all Private Wireless Gateways belonging to the user. */
    fun list(): CompletableFuture<PrivateWirelessGatewayListResponse> =
        list(PrivateWirelessGatewayListParams.none())

    /** @see list */
    fun list(
        params: PrivateWirelessGatewayListParams = PrivateWirelessGatewayListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateWirelessGatewayListResponse>

    /** @see list */
    fun list(
        params: PrivateWirelessGatewayListParams = PrivateWirelessGatewayListParams.none()
    ): CompletableFuture<PrivateWirelessGatewayListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<PrivateWirelessGatewayListResponse> =
        list(PrivateWirelessGatewayListParams.none(), requestOptions)

    /** Deletes the Private Wireless Gateway. */
    fun delete(id: String): CompletableFuture<PrivateWirelessGatewayDeleteResponse> =
        delete(id, PrivateWirelessGatewayDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PrivateWirelessGatewayDeleteParams = PrivateWirelessGatewayDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateWirelessGatewayDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PrivateWirelessGatewayDeleteParams = PrivateWirelessGatewayDeleteParams.none(),
    ): CompletableFuture<PrivateWirelessGatewayDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PrivateWirelessGatewayDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateWirelessGatewayDeleteResponse>

    /** @see delete */
    fun delete(
        params: PrivateWirelessGatewayDeleteParams
    ): CompletableFuture<PrivateWirelessGatewayDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrivateWirelessGatewayDeleteResponse> =
        delete(id, PrivateWirelessGatewayDeleteParams.none(), requestOptions)

    /**
     * A view of [PrivateWirelessGatewayServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivateWirelessGatewayServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /private_wireless_gateways`, but is otherwise the
         * same as [PrivateWirelessGatewayServiceAsync.create].
         */
        fun create(
            params: PrivateWirelessGatewayCreateParams
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PrivateWirelessGatewayCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /private_wireless_gateways/{id}`, but is otherwise
         * the same as [PrivateWirelessGatewayServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayRetrieveResponse>> =
            retrieve(id, PrivateWirelessGatewayRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PrivateWirelessGatewayRetrieveParams =
                PrivateWirelessGatewayRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PrivateWirelessGatewayRetrieveParams =
                PrivateWirelessGatewayRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PrivateWirelessGatewayRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PrivateWirelessGatewayRetrieveParams
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayRetrieveResponse>> =
            retrieve(id, PrivateWirelessGatewayRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /private_wireless_gateways`, but is otherwise the
         * same as [PrivateWirelessGatewayServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayListResponse>> =
            list(PrivateWirelessGatewayListParams.none())

        /** @see list */
        fun list(
            params: PrivateWirelessGatewayListParams = PrivateWirelessGatewayListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayListResponse>>

        /** @see list */
        fun list(
            params: PrivateWirelessGatewayListParams = PrivateWirelessGatewayListParams.none()
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayListResponse>> =
            list(PrivateWirelessGatewayListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /private_wireless_gateways/{id}`, but is
         * otherwise the same as [PrivateWirelessGatewayServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayDeleteResponse>> =
            delete(id, PrivateWirelessGatewayDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: PrivateWirelessGatewayDeleteParams = PrivateWirelessGatewayDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: PrivateWirelessGatewayDeleteParams = PrivateWirelessGatewayDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PrivateWirelessGatewayDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayDeleteResponse>>

        /** @see delete */
        fun delete(
            params: PrivateWirelessGatewayDeleteParams
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrivateWirelessGatewayDeleteResponse>> =
            delete(id, PrivateWirelessGatewayDeleteParams.none(), requestOptions)
    }
}
