// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayCreateParams
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayCreateResponse
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayDeleteParams
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayDeleteResponse
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayListPage
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayListParams
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayRetrieveParams
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayRetrieveResponse
import java.util.function.Consumer

interface PrivateWirelessGatewayService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivateWirelessGatewayService

    /**
     * Asynchronously create a Private Wireless Gateway for SIM cards for a previously created
     * network. This operation may take several minutes so you can check the Private Wireless
     * Gateway status at the section Get a Private Wireless Gateway.
     */
    fun create(params: PrivateWirelessGatewayCreateParams): PrivateWirelessGatewayCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PrivateWirelessGatewayCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateWirelessGatewayCreateResponse

    /** Retrieve information about a Private Wireless Gateway. */
    fun retrieve(id: String): PrivateWirelessGatewayRetrieveResponse =
        retrieve(id, PrivateWirelessGatewayRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PrivateWirelessGatewayRetrieveParams = PrivateWirelessGatewayRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateWirelessGatewayRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PrivateWirelessGatewayRetrieveParams = PrivateWirelessGatewayRetrieveParams.none(),
    ): PrivateWirelessGatewayRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PrivateWirelessGatewayRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateWirelessGatewayRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: PrivateWirelessGatewayRetrieveParams
    ): PrivateWirelessGatewayRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): PrivateWirelessGatewayRetrieveResponse =
        retrieve(id, PrivateWirelessGatewayRetrieveParams.none(), requestOptions)

    /** Get all Private Wireless Gateways belonging to the user. */
    fun list(): PrivateWirelessGatewayListPage = list(PrivateWirelessGatewayListParams.none())

    /** @see list */
    fun list(
        params: PrivateWirelessGatewayListParams = PrivateWirelessGatewayListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateWirelessGatewayListPage

    /** @see list */
    fun list(
        params: PrivateWirelessGatewayListParams = PrivateWirelessGatewayListParams.none()
    ): PrivateWirelessGatewayListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PrivateWirelessGatewayListPage =
        list(PrivateWirelessGatewayListParams.none(), requestOptions)

    /** Deletes the Private Wireless Gateway. */
    fun delete(id: String): PrivateWirelessGatewayDeleteResponse =
        delete(id, PrivateWirelessGatewayDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: PrivateWirelessGatewayDeleteParams = PrivateWirelessGatewayDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateWirelessGatewayDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: PrivateWirelessGatewayDeleteParams = PrivateWirelessGatewayDeleteParams.none(),
    ): PrivateWirelessGatewayDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PrivateWirelessGatewayDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateWirelessGatewayDeleteResponse

    /** @see delete */
    fun delete(params: PrivateWirelessGatewayDeleteParams): PrivateWirelessGatewayDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): PrivateWirelessGatewayDeleteResponse =
        delete(id, PrivateWirelessGatewayDeleteParams.none(), requestOptions)

    /**
     * A view of [PrivateWirelessGatewayService] that provides access to raw HTTP responses for each
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
        ): PrivateWirelessGatewayService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /private_wireless_gateways`, but is otherwise the
         * same as [PrivateWirelessGatewayService.create].
         */
        @MustBeClosed
        fun create(
            params: PrivateWirelessGatewayCreateParams
        ): HttpResponseFor<PrivateWirelessGatewayCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PrivateWirelessGatewayCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateWirelessGatewayCreateResponse>

        /**
         * Returns a raw HTTP response for `get /private_wireless_gateways/{id}`, but is otherwise
         * the same as [PrivateWirelessGatewayService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PrivateWirelessGatewayRetrieveResponse> =
            retrieve(id, PrivateWirelessGatewayRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PrivateWirelessGatewayRetrieveParams =
                PrivateWirelessGatewayRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateWirelessGatewayRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PrivateWirelessGatewayRetrieveParams =
                PrivateWirelessGatewayRetrieveParams.none(),
        ): HttpResponseFor<PrivateWirelessGatewayRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PrivateWirelessGatewayRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateWirelessGatewayRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PrivateWirelessGatewayRetrieveParams
        ): HttpResponseFor<PrivateWirelessGatewayRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrivateWirelessGatewayRetrieveResponse> =
            retrieve(id, PrivateWirelessGatewayRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /private_wireless_gateways`, but is otherwise the
         * same as [PrivateWirelessGatewayService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PrivateWirelessGatewayListPage> =
            list(PrivateWirelessGatewayListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PrivateWirelessGatewayListParams = PrivateWirelessGatewayListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateWirelessGatewayListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PrivateWirelessGatewayListParams = PrivateWirelessGatewayListParams.none()
        ): HttpResponseFor<PrivateWirelessGatewayListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PrivateWirelessGatewayListPage> =
            list(PrivateWirelessGatewayListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /private_wireless_gateways/{id}`, but is
         * otherwise the same as [PrivateWirelessGatewayService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PrivateWirelessGatewayDeleteResponse> =
            delete(id, PrivateWirelessGatewayDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PrivateWirelessGatewayDeleteParams = PrivateWirelessGatewayDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateWirelessGatewayDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: PrivateWirelessGatewayDeleteParams = PrivateWirelessGatewayDeleteParams.none(),
        ): HttpResponseFor<PrivateWirelessGatewayDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PrivateWirelessGatewayDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateWirelessGatewayDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PrivateWirelessGatewayDeleteParams
        ): HttpResponseFor<PrivateWirelessGatewayDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrivateWirelessGatewayDeleteResponse> =
            delete(id, PrivateWirelessGatewayDeleteParams.none(), requestOptions)
    }
}
