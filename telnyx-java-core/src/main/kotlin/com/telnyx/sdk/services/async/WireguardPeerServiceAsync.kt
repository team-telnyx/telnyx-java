// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WireguardPeerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireguardPeerServiceAsync

    /** Create a new WireGuard Peer. Current limitation of 5 peers per interface can be created. */
    fun create(params: WireguardPeerCreateParams): CompletableFuture<WireguardPeerCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WireguardPeerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardPeerCreateResponse>

    /** Retrieve the WireGuard peer. */
    fun retrieve(id: String): CompletableFuture<WireguardPeerRetrieveResponse> =
        retrieve(id, WireguardPeerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WireguardPeerRetrieveParams = WireguardPeerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardPeerRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WireguardPeerRetrieveParams = WireguardPeerRetrieveParams.none(),
    ): CompletableFuture<WireguardPeerRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WireguardPeerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardPeerRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: WireguardPeerRetrieveParams
    ): CompletableFuture<WireguardPeerRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireguardPeerRetrieveResponse> =
        retrieve(id, WireguardPeerRetrieveParams.none(), requestOptions)

    /** Update the WireGuard peer. */
    fun update(
        id: String,
        params: WireguardPeerUpdateParams,
    ): CompletableFuture<WireguardPeerUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: WireguardPeerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardPeerUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: WireguardPeerUpdateParams): CompletableFuture<WireguardPeerUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WireguardPeerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardPeerUpdateResponse>

    /** List all WireGuard peers. */
    fun list(): CompletableFuture<WireguardPeerListResponse> = list(WireguardPeerListParams.none())

    /** @see list */
    fun list(
        params: WireguardPeerListParams = WireguardPeerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardPeerListResponse>

    /** @see list */
    fun list(
        params: WireguardPeerListParams = WireguardPeerListParams.none()
    ): CompletableFuture<WireguardPeerListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WireguardPeerListResponse> =
        list(WireguardPeerListParams.none(), requestOptions)

    /** Delete the WireGuard peer. */
    fun delete(id: String): CompletableFuture<WireguardPeerDeleteResponse> =
        delete(id, WireguardPeerDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WireguardPeerDeleteParams = WireguardPeerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardPeerDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WireguardPeerDeleteParams = WireguardPeerDeleteParams.none(),
    ): CompletableFuture<WireguardPeerDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WireguardPeerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardPeerDeleteResponse>

    /** @see delete */
    fun delete(params: WireguardPeerDeleteParams): CompletableFuture<WireguardPeerDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireguardPeerDeleteResponse> =
        delete(id, WireguardPeerDeleteParams.none(), requestOptions)

    /** Retrieve Wireguard config template for Peer */
    fun retrieveConfig(id: String): CompletableFuture<String> =
        retrieveConfig(id, WireguardPeerRetrieveConfigParams.none())

    /** @see retrieveConfig */
    fun retrieveConfig(
        id: String,
        params: WireguardPeerRetrieveConfigParams = WireguardPeerRetrieveConfigParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> = retrieveConfig(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieveConfig */
    fun retrieveConfig(
        id: String,
        params: WireguardPeerRetrieveConfigParams = WireguardPeerRetrieveConfigParams.none(),
    ): CompletableFuture<String> = retrieveConfig(id, params, RequestOptions.none())

    /** @see retrieveConfig */
    fun retrieveConfig(
        params: WireguardPeerRetrieveConfigParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see retrieveConfig */
    fun retrieveConfig(params: WireguardPeerRetrieveConfigParams): CompletableFuture<String> =
        retrieveConfig(params, RequestOptions.none())

    /** @see retrieveConfig */
    fun retrieveConfig(id: String, requestOptions: RequestOptions): CompletableFuture<String> =
        retrieveConfig(id, WireguardPeerRetrieveConfigParams.none(), requestOptions)

    /**
     * A view of [WireguardPeerServiceAsync] that provides access to raw HTTP responses for each
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
        ): WireguardPeerServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wireguard_peers`, but is otherwise the same as
         * [WireguardPeerServiceAsync.create].
         */
        fun create(
            params: WireguardPeerCreateParams
        ): CompletableFuture<HttpResponseFor<WireguardPeerCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WireguardPeerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /wireguard_peers/{id}`, but is otherwise the same as
         * [WireguardPeerServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<WireguardPeerRetrieveResponse>> =
            retrieve(id, WireguardPeerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WireguardPeerRetrieveParams = WireguardPeerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WireguardPeerRetrieveParams = WireguardPeerRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WireguardPeerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WireguardPeerRetrieveParams
        ): CompletableFuture<HttpResponseFor<WireguardPeerRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireguardPeerRetrieveResponse>> =
            retrieve(id, WireguardPeerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /wireguard_peers/{id}`, but is otherwise the same
         * as [WireguardPeerServiceAsync.update].
         */
        fun update(
            id: String,
            params: WireguardPeerUpdateParams,
        ): CompletableFuture<HttpResponseFor<WireguardPeerUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: WireguardPeerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: WireguardPeerUpdateParams
        ): CompletableFuture<HttpResponseFor<WireguardPeerUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WireguardPeerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /wireguard_peers`, but is otherwise the same as
         * [WireguardPeerServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WireguardPeerListResponse>> =
            list(WireguardPeerListParams.none())

        /** @see list */
        fun list(
            params: WireguardPeerListParams = WireguardPeerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerListResponse>>

        /** @see list */
        fun list(
            params: WireguardPeerListParams = WireguardPeerListParams.none()
        ): CompletableFuture<HttpResponseFor<WireguardPeerListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WireguardPeerListResponse>> =
            list(WireguardPeerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /wireguard_peers/{id}`, but is otherwise the same
         * as [WireguardPeerServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<WireguardPeerDeleteResponse>> =
            delete(id, WireguardPeerDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: WireguardPeerDeleteParams = WireguardPeerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: WireguardPeerDeleteParams = WireguardPeerDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WireguardPeerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardPeerDeleteResponse>>

        /** @see delete */
        fun delete(
            params: WireguardPeerDeleteParams
        ): CompletableFuture<HttpResponseFor<WireguardPeerDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireguardPeerDeleteResponse>> =
            delete(id, WireguardPeerDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireguard_peers/{id}/config`, but is otherwise the
         * same as [WireguardPeerServiceAsync.retrieveConfig].
         */
        fun retrieveConfig(id: String): CompletableFuture<HttpResponseFor<String>> =
            retrieveConfig(id, WireguardPeerRetrieveConfigParams.none())

        /** @see retrieveConfig */
        fun retrieveConfig(
            id: String,
            params: WireguardPeerRetrieveConfigParams = WireguardPeerRetrieveConfigParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveConfig(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieveConfig */
        fun retrieveConfig(
            id: String,
            params: WireguardPeerRetrieveConfigParams = WireguardPeerRetrieveConfigParams.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveConfig(id, params, RequestOptions.none())

        /** @see retrieveConfig */
        fun retrieveConfig(
            params: WireguardPeerRetrieveConfigParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see retrieveConfig */
        fun retrieveConfig(
            params: WireguardPeerRetrieveConfigParams
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveConfig(params, RequestOptions.none())

        /** @see retrieveConfig */
        fun retrieveConfig(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> =
            retrieveConfig(id, WireguardPeerRetrieveConfigParams.none(), requestOptions)
    }
}
