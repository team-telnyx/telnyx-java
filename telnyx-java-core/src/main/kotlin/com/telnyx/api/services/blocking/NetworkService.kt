// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.networks.NetworkCreate
import com.telnyx.api.models.networks.NetworkCreateParams
import com.telnyx.api.models.networks.NetworkCreateResponse
import com.telnyx.api.models.networks.NetworkDeleteParams
import com.telnyx.api.models.networks.NetworkDeleteResponse
import com.telnyx.api.models.networks.NetworkListInterfacesParams
import com.telnyx.api.models.networks.NetworkListInterfacesResponse
import com.telnyx.api.models.networks.NetworkListParams
import com.telnyx.api.models.networks.NetworkListResponse
import com.telnyx.api.models.networks.NetworkRetrieveParams
import com.telnyx.api.models.networks.NetworkRetrieveResponse
import com.telnyx.api.models.networks.NetworkUpdateParams
import com.telnyx.api.models.networks.NetworkUpdateResponse
import com.telnyx.api.services.blocking.networks.DefaultGatewayService
import java.util.function.Consumer

interface NetworkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkService

    fun defaultGateway(): DefaultGatewayService

    /** Create a new Network. */
    fun create(params: NetworkCreateParams): NetworkCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NetworkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkCreateResponse

    /** @see create */
    fun create(
        networkCreate: NetworkCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkCreateResponse =
        create(NetworkCreateParams.builder().networkCreate(networkCreate).build(), requestOptions)

    /** @see create */
    fun create(networkCreate: NetworkCreate): NetworkCreateResponse =
        create(networkCreate, RequestOptions.none())

    /** Retrieve a Network. */
    fun retrieve(id: String): NetworkRetrieveResponse = retrieve(id, NetworkRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NetworkRetrieveParams = NetworkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NetworkRetrieveParams = NetworkRetrieveParams.none(),
    ): NetworkRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NetworkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: NetworkRetrieveParams): NetworkRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): NetworkRetrieveResponse =
        retrieve(id, NetworkRetrieveParams.none(), requestOptions)

    /** Update a Network. */
    fun update(pathId: String, params: NetworkUpdateParams): NetworkUpdateResponse =
        update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: NetworkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkUpdateResponse = update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: NetworkUpdateParams): NetworkUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NetworkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkUpdateResponse

    /** List all Networks. */
    fun list(): NetworkListResponse = list(NetworkListParams.none())

    /** @see list */
    fun list(
        params: NetworkListParams = NetworkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkListResponse

    /** @see list */
    fun list(params: NetworkListParams = NetworkListParams.none()): NetworkListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): NetworkListResponse =
        list(NetworkListParams.none(), requestOptions)

    /** Delete a Network. */
    fun delete(id: String): NetworkDeleteResponse = delete(id, NetworkDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NetworkDeleteParams = NetworkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NetworkDeleteParams = NetworkDeleteParams.none(),
    ): NetworkDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NetworkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkDeleteResponse

    /** @see delete */
    fun delete(params: NetworkDeleteParams): NetworkDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): NetworkDeleteResponse =
        delete(id, NetworkDeleteParams.none(), requestOptions)

    /** List all Interfaces for a Network. */
    fun listInterfaces(id: String): NetworkListInterfacesResponse =
        listInterfaces(id, NetworkListInterfacesParams.none())

    /** @see listInterfaces */
    fun listInterfaces(
        id: String,
        params: NetworkListInterfacesParams = NetworkListInterfacesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkListInterfacesResponse =
        listInterfaces(params.toBuilder().id(id).build(), requestOptions)

    /** @see listInterfaces */
    fun listInterfaces(
        id: String,
        params: NetworkListInterfacesParams = NetworkListInterfacesParams.none(),
    ): NetworkListInterfacesResponse = listInterfaces(id, params, RequestOptions.none())

    /** @see listInterfaces */
    fun listInterfaces(
        params: NetworkListInterfacesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkListInterfacesResponse

    /** @see listInterfaces */
    fun listInterfaces(params: NetworkListInterfacesParams): NetworkListInterfacesResponse =
        listInterfaces(params, RequestOptions.none())

    /** @see listInterfaces */
    fun listInterfaces(id: String, requestOptions: RequestOptions): NetworkListInterfacesResponse =
        listInterfaces(id, NetworkListInterfacesParams.none(), requestOptions)

    /** A view of [NetworkService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkService.WithRawResponse

        fun defaultGateway(): DefaultGatewayService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /networks`, but is otherwise the same as
         * [NetworkService.create].
         */
        @MustBeClosed
        fun create(params: NetworkCreateParams): HttpResponseFor<NetworkCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: NetworkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            networkCreate: NetworkCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkCreateResponse> =
            create(
                NetworkCreateParams.builder().networkCreate(networkCreate).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(networkCreate: NetworkCreate): HttpResponseFor<NetworkCreateResponse> =
            create(networkCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /networks/{id}`, but is otherwise the same as
         * [NetworkService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<NetworkRetrieveResponse> =
            retrieve(id, NetworkRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NetworkRetrieveParams = NetworkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: NetworkRetrieveParams = NetworkRetrieveParams.none(),
        ): HttpResponseFor<NetworkRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: NetworkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: NetworkRetrieveParams): HttpResponseFor<NetworkRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkRetrieveResponse> =
            retrieve(id, NetworkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /networks/{id}`, but is otherwise the same as
         * [NetworkService.update].
         */
        @MustBeClosed
        fun update(
            pathId: String,
            params: NetworkUpdateParams,
        ): HttpResponseFor<NetworkUpdateResponse> = update(pathId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            pathId: String,
            params: NetworkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkUpdateResponse> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: NetworkUpdateParams): HttpResponseFor<NetworkUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: NetworkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /networks`, but is otherwise the same as
         * [NetworkService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NetworkListResponse> = list(NetworkListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NetworkListParams = NetworkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: NetworkListParams = NetworkListParams.none()
        ): HttpResponseFor<NetworkListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NetworkListResponse> =
            list(NetworkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /networks/{id}`, but is otherwise the same as
         * [NetworkService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<NetworkDeleteResponse> =
            delete(id, NetworkDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NetworkDeleteParams = NetworkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: NetworkDeleteParams = NetworkDeleteParams.none(),
        ): HttpResponseFor<NetworkDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: NetworkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: NetworkDeleteParams): HttpResponseFor<NetworkDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkDeleteResponse> =
            delete(id, NetworkDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /networks/{id}/network_interfaces`, but is otherwise
         * the same as [NetworkService.listInterfaces].
         */
        @MustBeClosed
        fun listInterfaces(id: String): HttpResponseFor<NetworkListInterfacesResponse> =
            listInterfaces(id, NetworkListInterfacesParams.none())

        /** @see listInterfaces */
        @MustBeClosed
        fun listInterfaces(
            id: String,
            params: NetworkListInterfacesParams = NetworkListInterfacesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkListInterfacesResponse> =
            listInterfaces(params.toBuilder().id(id).build(), requestOptions)

        /** @see listInterfaces */
        @MustBeClosed
        fun listInterfaces(
            id: String,
            params: NetworkListInterfacesParams = NetworkListInterfacesParams.none(),
        ): HttpResponseFor<NetworkListInterfacesResponse> =
            listInterfaces(id, params, RequestOptions.none())

        /** @see listInterfaces */
        @MustBeClosed
        fun listInterfaces(
            params: NetworkListInterfacesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkListInterfacesResponse>

        /** @see listInterfaces */
        @MustBeClosed
        fun listInterfaces(
            params: NetworkListInterfacesParams
        ): HttpResponseFor<NetworkListInterfacesResponse> =
            listInterfaces(params, RequestOptions.none())

        /** @see listInterfaces */
        @MustBeClosed
        fun listInterfaces(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkListInterfacesResponse> =
            listInterfaces(id, NetworkListInterfacesParams.none(), requestOptions)
    }
}
