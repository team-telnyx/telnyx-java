// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerCreateParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerCreateResponse
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerDeleteParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerDeleteResponse
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerListParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerListResponse
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerRetrieveConfigParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerRetrieveParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerRetrieveResponse
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerUpdateParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerUpdateResponse
import java.util.function.Consumer

interface WireguardPeerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireguardPeerService

    /** Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created. */
    fun create(params: WireguardPeerCreateParams): WireguardPeerCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WireguardPeerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardPeerCreateResponse

    /** Retrieve the WireGuard peer. */
    fun retrieve(id: String): WireguardPeerRetrieveResponse =
        retrieve(id, WireguardPeerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WireguardPeerRetrieveParams = WireguardPeerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardPeerRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WireguardPeerRetrieveParams = WireguardPeerRetrieveParams.none(),
    ): WireguardPeerRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WireguardPeerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardPeerRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: WireguardPeerRetrieveParams): WireguardPeerRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): WireguardPeerRetrieveResponse =
        retrieve(id, WireguardPeerRetrieveParams.none(), requestOptions)

    /** Update the WireGuard peer. */
    fun update(id: String, params: WireguardPeerUpdateParams): WireguardPeerUpdateResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: WireguardPeerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardPeerUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: WireguardPeerUpdateParams): WireguardPeerUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WireguardPeerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardPeerUpdateResponse

    /** List all WireGuard peers. */
    fun list(): WireguardPeerListResponse = list(WireguardPeerListParams.none())

    /** @see list */
    fun list(
        params: WireguardPeerListParams = WireguardPeerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardPeerListResponse

    /** @see list */
    fun list(
        params: WireguardPeerListParams = WireguardPeerListParams.none()
    ): WireguardPeerListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WireguardPeerListResponse =
        list(WireguardPeerListParams.none(), requestOptions)

    /** Delete the WireGuard peer. */
    fun delete(id: String): WireguardPeerDeleteResponse =
        delete(id, WireguardPeerDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WireguardPeerDeleteParams = WireguardPeerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardPeerDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WireguardPeerDeleteParams = WireguardPeerDeleteParams.none(),
    ): WireguardPeerDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WireguardPeerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireguardPeerDeleteResponse

    /** @see delete */
    fun delete(params: WireguardPeerDeleteParams): WireguardPeerDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): WireguardPeerDeleteResponse =
        delete(id, WireguardPeerDeleteParams.none(), requestOptions)

    /** Retrieve Wireguard config template for Peer */
    fun retrieveConfig(id: String): String =
        retrieveConfig(id, WireguardPeerRetrieveConfigParams.none())

    /** @see retrieveConfig */
    fun retrieveConfig(
        id: String,
        params: WireguardPeerRetrieveConfigParams = WireguardPeerRetrieveConfigParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String = retrieveConfig(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveConfig */
    fun retrieveConfig(
        id: String,
        params: WireguardPeerRetrieveConfigParams = WireguardPeerRetrieveConfigParams.none(),
    ): String = retrieveConfig(id, params, RequestOptions.none())

    /** @see retrieveConfig */
    fun retrieveConfig(
        params: WireguardPeerRetrieveConfigParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see retrieveConfig */
    fun retrieveConfig(params: WireguardPeerRetrieveConfigParams): String =
        retrieveConfig(params, RequestOptions.none())

    /** @see retrieveConfig */
    fun retrieveConfig(id: String, requestOptions: RequestOptions): String =
        retrieveConfig(id, WireguardPeerRetrieveConfigParams.none(), requestOptions)

    /**
     * A view of [WireguardPeerService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WireguardPeerService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wireguard_peers`, but is otherwise the same as
         * [WireguardPeerService.create].
         */
        @MustBeClosed
        fun create(
            params: WireguardPeerCreateParams
        ): HttpResponseFor<WireguardPeerCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WireguardPeerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardPeerCreateResponse>

        /**
         * Returns a raw HTTP response for `get /wireguard_peers/{id}`, but is otherwise the same as
         * [WireguardPeerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<WireguardPeerRetrieveResponse> =
            retrieve(id, WireguardPeerRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WireguardPeerRetrieveParams = WireguardPeerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardPeerRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: WireguardPeerRetrieveParams = WireguardPeerRetrieveParams.none(),
        ): HttpResponseFor<WireguardPeerRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WireguardPeerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardPeerRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WireguardPeerRetrieveParams
        ): HttpResponseFor<WireguardPeerRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardPeerRetrieveResponse> =
            retrieve(id, WireguardPeerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /wireguard_peers/{id}`, but is otherwise the same
         * as [WireguardPeerService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: WireguardPeerUpdateParams,
        ): HttpResponseFor<WireguardPeerUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: WireguardPeerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardPeerUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: WireguardPeerUpdateParams
        ): HttpResponseFor<WireguardPeerUpdateResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WireguardPeerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardPeerUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /wireguard_peers`, but is otherwise the same as
         * [WireguardPeerService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WireguardPeerListResponse> =
            list(WireguardPeerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WireguardPeerListParams = WireguardPeerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardPeerListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WireguardPeerListParams = WireguardPeerListParams.none()
        ): HttpResponseFor<WireguardPeerListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WireguardPeerListResponse> =
            list(WireguardPeerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /wireguard_peers/{id}`, but is otherwise the same
         * as [WireguardPeerService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<WireguardPeerDeleteResponse> =
            delete(id, WireguardPeerDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WireguardPeerDeleteParams = WireguardPeerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardPeerDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: WireguardPeerDeleteParams = WireguardPeerDeleteParams.none(),
        ): HttpResponseFor<WireguardPeerDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WireguardPeerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireguardPeerDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: WireguardPeerDeleteParams
        ): HttpResponseFor<WireguardPeerDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireguardPeerDeleteResponse> =
            delete(id, WireguardPeerDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireguard_peers/{id}/config`, but is otherwise the
         * same as [WireguardPeerService.retrieveConfig].
         */
        @MustBeClosed
        fun retrieveConfig(id: String): HttpResponseFor<String> =
            retrieveConfig(id, WireguardPeerRetrieveConfigParams.none())

        /** @see retrieveConfig */
        @MustBeClosed
        fun retrieveConfig(
            id: String,
            params: WireguardPeerRetrieveConfigParams = WireguardPeerRetrieveConfigParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String> =
            retrieveConfig(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveConfig */
        @MustBeClosed
        fun retrieveConfig(
            id: String,
            params: WireguardPeerRetrieveConfigParams = WireguardPeerRetrieveConfigParams.none(),
        ): HttpResponseFor<String> = retrieveConfig(id, params, RequestOptions.none())

        /** @see retrieveConfig */
        @MustBeClosed
        fun retrieveConfig(
            params: WireguardPeerRetrieveConfigParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see retrieveConfig */
        @MustBeClosed
        fun retrieveConfig(params: WireguardPeerRetrieveConfigParams): HttpResponseFor<String> =
            retrieveConfig(params, RequestOptions.none())

        /** @see retrieveConfig */
        @MustBeClosed
        fun retrieveConfig(id: String, requestOptions: RequestOptions): HttpResponseFor<String> =
            retrieveConfig(id, WireguardPeerRetrieveConfigParams.none(), requestOptions)
    }
}
