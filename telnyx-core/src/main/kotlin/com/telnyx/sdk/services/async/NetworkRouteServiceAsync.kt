// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.networkroutes.NetworkRouteCreateParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteCreateResponse
import com.telnyx.sdk.models.networkroutes.NetworkRouteDeleteParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteListParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteListResponse
import com.telnyx.sdk.models.networkroutes.NetworkRouteRetrieveParams
import com.telnyx.sdk.models.networkroutes.NetworkRouteRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Routes on a Network that send a CIDR to a next hop, such as a tunnel. */
interface NetworkRouteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkRouteServiceAsync

    /**
     * Adds a route to a Network. Traffic on the Network to an address in `cidr` goes via
     * `next_hop`. With a tunnel as the next hop, functions on the Network reach the CIDR through
     * the tunnel without a redeploy. A Network holds each CIDR once.
     */
    fun create(params: NetworkRouteCreateParams): CompletableFuture<NetworkRouteCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NetworkRouteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkRouteCreateResponse>

    /** Retrieves a route and its status. */
    fun retrieve(id: String): CompletableFuture<NetworkRouteRetrieveResponse> =
        retrieve(id, NetworkRouteRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NetworkRouteRetrieveParams = NetworkRouteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkRouteRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NetworkRouteRetrieveParams = NetworkRouteRetrieveParams.none(),
    ): CompletableFuture<NetworkRouteRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NetworkRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkRouteRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: NetworkRouteRetrieveParams
    ): CompletableFuture<NetworkRouteRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkRouteRetrieveResponse> =
        retrieve(id, NetworkRouteRetrieveParams.none(), requestOptions)

    /**
     * Lists the routes of the account's Networks. A Network's list is its effective route table:
     * the routes added with `POST /network_routes` (`origin` `static`) and the routes that its
     * attachments install (`origin` `attachment`). Lookup is longest prefix within the Network.
     */
    fun list(params: NetworkRouteListParams): CompletableFuture<NetworkRouteListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: NetworkRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkRouteListResponse>

    /**
     * Deletes a route that was added with `POST /network_routes`. Traffic to its CIDR stops going
     * via the next hop at once. Routes that an attachment installs (`origin` `attachment`) leave
     * with the attachment and cannot be deleted here.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, NetworkRouteDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NetworkRouteDeleteParams = NetworkRouteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NetworkRouteDeleteParams = NetworkRouteDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NetworkRouteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: NetworkRouteDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, NetworkRouteDeleteParams.none(), requestOptions)

    /**
     * A view of [NetworkRouteServiceAsync] that provides access to raw HTTP responses for each
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
        ): NetworkRouteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /network_routes`, but is otherwise the same as
         * [NetworkRouteServiceAsync.create].
         */
        fun create(
            params: NetworkRouteCreateParams
        ): CompletableFuture<HttpResponseFor<NetworkRouteCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NetworkRouteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkRouteCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /network_routes/{id}`, but is otherwise the same as
         * [NetworkRouteServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<NetworkRouteRetrieveResponse>> =
            retrieve(id, NetworkRouteRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NetworkRouteRetrieveParams = NetworkRouteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkRouteRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NetworkRouteRetrieveParams = NetworkRouteRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NetworkRouteRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NetworkRouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkRouteRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NetworkRouteRetrieveParams
        ): CompletableFuture<HttpResponseFor<NetworkRouteRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkRouteRetrieveResponse>> =
            retrieve(id, NetworkRouteRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /network_routes`, but is otherwise the same as
         * [NetworkRouteServiceAsync.list].
         */
        fun list(
            params: NetworkRouteListParams
        ): CompletableFuture<HttpResponseFor<NetworkRouteListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: NetworkRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkRouteListResponse>>

        /**
         * Returns a raw HTTP response for `delete /network_routes/{id}`, but is otherwise the same
         * as [NetworkRouteServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, NetworkRouteDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: NetworkRouteDeleteParams = NetworkRouteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: NetworkRouteDeleteParams = NetworkRouteDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NetworkRouteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: NetworkRouteDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, NetworkRouteDeleteParams.none(), requestOptions)
    }
}
