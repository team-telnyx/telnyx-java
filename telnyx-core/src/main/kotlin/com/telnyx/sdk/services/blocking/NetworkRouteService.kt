// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Routes on a Network that send a CIDR to a next hop, such as a tunnel. */
interface NetworkRouteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkRouteService

    /**
     * Adds a route to a Network. Traffic on the Network to an address in `cidr` goes via
     * `next_hop`. With a tunnel as the next hop, functions on the Network reach the CIDR through
     * the tunnel without a redeploy. A Network holds each CIDR once.
     */
    fun create(params: NetworkRouteCreateParams): NetworkRouteCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NetworkRouteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkRouteCreateResponse

    /** Retrieves a route and its status. */
    fun retrieve(id: String): NetworkRouteRetrieveResponse =
        retrieve(id, NetworkRouteRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NetworkRouteRetrieveParams = NetworkRouteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkRouteRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NetworkRouteRetrieveParams = NetworkRouteRetrieveParams.none(),
    ): NetworkRouteRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NetworkRouteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkRouteRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NetworkRouteRetrieveParams): NetworkRouteRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): NetworkRouteRetrieveResponse =
        retrieve(id, NetworkRouteRetrieveParams.none(), requestOptions)

    /**
     * Lists the routes of the account's Networks. A Network's list is its effective route table:
     * the routes added with `POST /network_routes` (`origin` `static`) and the routes that its
     * attachments install (`origin` `attachment`). Lookup is longest prefix within the Network.
     */
    fun list(params: NetworkRouteListParams): NetworkRouteListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: NetworkRouteListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkRouteListResponse

    /**
     * Deletes a route that was added with `POST /network_routes`. Traffic to its CIDR stops going
     * via the next hop at once. Routes that an attachment installs (`origin` `attachment`) leave
     * with the attachment and cannot be deleted here.
     */
    fun delete(id: String) = delete(id, NetworkRouteDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NetworkRouteDeleteParams = NetworkRouteDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: NetworkRouteDeleteParams = NetworkRouteDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NetworkRouteDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: NetworkRouteDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, NetworkRouteDeleteParams.none(), requestOptions)

    /**
     * A view of [NetworkRouteService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkRouteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /network_routes`, but is otherwise the same as
         * [NetworkRouteService.create].
         */
        @MustBeClosed
        fun create(params: NetworkRouteCreateParams): HttpResponseFor<NetworkRouteCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NetworkRouteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkRouteCreateResponse>

        /**
         * Returns a raw HTTP response for `get /network_routes/{id}`, but is otherwise the same as
         * [NetworkRouteService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<NetworkRouteRetrieveResponse> =
            retrieve(id, NetworkRouteRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NetworkRouteRetrieveParams = NetworkRouteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkRouteRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NetworkRouteRetrieveParams = NetworkRouteRetrieveParams.none(),
        ): HttpResponseFor<NetworkRouteRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NetworkRouteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkRouteRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NetworkRouteRetrieveParams
        ): HttpResponseFor<NetworkRouteRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkRouteRetrieveResponse> =
            retrieve(id, NetworkRouteRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /network_routes`, but is otherwise the same as
         * [NetworkRouteService.list].
         */
        @MustBeClosed
        fun list(params: NetworkRouteListParams): HttpResponseFor<NetworkRouteListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NetworkRouteListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkRouteListResponse>

        /**
         * Returns a raw HTTP response for `delete /network_routes/{id}`, but is otherwise the same
         * as [NetworkRouteService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponse = delete(id, NetworkRouteDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NetworkRouteDeleteParams = NetworkRouteDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NetworkRouteDeleteParams = NetworkRouteDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NetworkRouteDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: NetworkRouteDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, NetworkRouteDeleteParams.none(), requestOptions)
    }
}
