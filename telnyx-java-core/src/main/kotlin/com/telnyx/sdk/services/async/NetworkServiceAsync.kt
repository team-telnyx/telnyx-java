// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.networks.NetworkCreate
import com.telnyx.sdk.models.networks.NetworkCreateParams
import com.telnyx.sdk.models.networks.NetworkCreateResponse
import com.telnyx.sdk.models.networks.NetworkDeleteParams
import com.telnyx.sdk.models.networks.NetworkDeleteResponse
import com.telnyx.sdk.models.networks.NetworkListInterfacesParams
import com.telnyx.sdk.models.networks.NetworkListInterfacesResponse
import com.telnyx.sdk.models.networks.NetworkListParams
import com.telnyx.sdk.models.networks.NetworkListResponse
import com.telnyx.sdk.models.networks.NetworkRetrieveParams
import com.telnyx.sdk.models.networks.NetworkRetrieveResponse
import com.telnyx.sdk.models.networks.NetworkUpdateParams
import com.telnyx.sdk.models.networks.NetworkUpdateResponse
import com.telnyx.sdk.services.async.networks.DefaultGatewayServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NetworkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkServiceAsync

    fun defaultGateway(): DefaultGatewayServiceAsync

    /** Create a new Network. */
    fun create(params: NetworkCreateParams): CompletableFuture<NetworkCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NetworkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkCreateResponse>

    /** @see create */
    fun create(
        networkCreate: NetworkCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkCreateResponse> =
        create(NetworkCreateParams.builder().networkCreate(networkCreate).build(), requestOptions)

    /** @see create */
    fun create(networkCreate: NetworkCreate): CompletableFuture<NetworkCreateResponse> =
        create(networkCreate, RequestOptions.none())

    /** Retrieve a Network. */
    fun retrieve(id: String): CompletableFuture<NetworkRetrieveResponse> =
        retrieve(id, NetworkRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NetworkRetrieveParams = NetworkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: NetworkRetrieveParams = NetworkRetrieveParams.none(),
    ): CompletableFuture<NetworkRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: NetworkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: NetworkRetrieveParams): CompletableFuture<NetworkRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkRetrieveResponse> =
        retrieve(id, NetworkRetrieveParams.none(), requestOptions)

    /** Update a Network. */
    fun update(
        pathId: String,
        params: NetworkUpdateParams,
    ): CompletableFuture<NetworkUpdateResponse> = update(pathId, params, RequestOptions.none())

    /** @see update */
    fun update(
        pathId: String,
        params: NetworkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkUpdateResponse> =
        update(params.toBuilder().pathId(pathId).build(), requestOptions)

    /** @see update */
    fun update(params: NetworkUpdateParams): CompletableFuture<NetworkUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NetworkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkUpdateResponse>

    /** List all Networks. */
    fun list(): CompletableFuture<NetworkListResponse> = list(NetworkListParams.none())

    /** @see list */
    fun list(
        params: NetworkListParams = NetworkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkListResponse>

    /** @see list */
    fun list(
        params: NetworkListParams = NetworkListParams.none()
    ): CompletableFuture<NetworkListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<NetworkListResponse> =
        list(NetworkListParams.none(), requestOptions)

    /** Delete a Network. */
    fun delete(id: String): CompletableFuture<NetworkDeleteResponse> =
        delete(id, NetworkDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: NetworkDeleteParams = NetworkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: NetworkDeleteParams = NetworkDeleteParams.none(),
    ): CompletableFuture<NetworkDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: NetworkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkDeleteResponse>

    /** @see delete */
    fun delete(params: NetworkDeleteParams): CompletableFuture<NetworkDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkDeleteResponse> =
        delete(id, NetworkDeleteParams.none(), requestOptions)

    /** List all Interfaces for a Network. */
    fun listInterfaces(id: String): CompletableFuture<NetworkListInterfacesResponse> =
        listInterfaces(id, NetworkListInterfacesParams.none())

    /** @see listInterfaces */
    fun listInterfaces(
        id: String,
        params: NetworkListInterfacesParams = NetworkListInterfacesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkListInterfacesResponse> =
        listInterfaces(params.toBuilder().id(id).build(), requestOptions)

    /** @see listInterfaces */
    fun listInterfaces(
        id: String,
        params: NetworkListInterfacesParams = NetworkListInterfacesParams.none(),
    ): CompletableFuture<NetworkListInterfacesResponse> =
        listInterfaces(id, params, RequestOptions.none())

    /** @see listInterfaces */
    fun listInterfaces(
        params: NetworkListInterfacesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkListInterfacesResponse>

    /** @see listInterfaces */
    fun listInterfaces(
        params: NetworkListInterfacesParams
    ): CompletableFuture<NetworkListInterfacesResponse> =
        listInterfaces(params, RequestOptions.none())

    /** @see listInterfaces */
    fun listInterfaces(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkListInterfacesResponse> =
        listInterfaces(id, NetworkListInterfacesParams.none(), requestOptions)

    /**
     * A view of [NetworkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkServiceAsync.WithRawResponse

        fun defaultGateway(): DefaultGatewayServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /networks`, but is otherwise the same as
         * [NetworkServiceAsync.create].
         */
        fun create(
            params: NetworkCreateParams
        ): CompletableFuture<HttpResponseFor<NetworkCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NetworkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkCreateResponse>>

        /** @see create */
        fun create(
            networkCreate: NetworkCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkCreateResponse>> =
            create(
                NetworkCreateParams.builder().networkCreate(networkCreate).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            networkCreate: NetworkCreate
        ): CompletableFuture<HttpResponseFor<NetworkCreateResponse>> =
            create(networkCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /networks/{id}`, but is otherwise the same as
         * [NetworkServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<NetworkRetrieveResponse>> =
            retrieve(id, NetworkRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NetworkRetrieveParams = NetworkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: NetworkRetrieveParams = NetworkRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NetworkRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: NetworkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: NetworkRetrieveParams
        ): CompletableFuture<HttpResponseFor<NetworkRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkRetrieveResponse>> =
            retrieve(id, NetworkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /networks/{id}`, but is otherwise the same as
         * [NetworkServiceAsync.update].
         */
        fun update(
            pathId: String,
            params: NetworkUpdateParams,
        ): CompletableFuture<HttpResponseFor<NetworkUpdateResponse>> =
            update(pathId, params, RequestOptions.none())

        /** @see update */
        fun update(
            pathId: String,
            params: NetworkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkUpdateResponse>> =
            update(params.toBuilder().pathId(pathId).build(), requestOptions)

        /** @see update */
        fun update(
            params: NetworkUpdateParams
        ): CompletableFuture<HttpResponseFor<NetworkUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: NetworkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /networks`, but is otherwise the same as
         * [NetworkServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NetworkListResponse>> =
            list(NetworkListParams.none())

        /** @see list */
        fun list(
            params: NetworkListParams = NetworkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkListResponse>>

        /** @see list */
        fun list(
            params: NetworkListParams = NetworkListParams.none()
        ): CompletableFuture<HttpResponseFor<NetworkListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NetworkListResponse>> =
            list(NetworkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /networks/{id}`, but is otherwise the same as
         * [NetworkServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<NetworkDeleteResponse>> =
            delete(id, NetworkDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: NetworkDeleteParams = NetworkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: NetworkDeleteParams = NetworkDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<NetworkDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: NetworkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkDeleteResponse>>

        /** @see delete */
        fun delete(
            params: NetworkDeleteParams
        ): CompletableFuture<HttpResponseFor<NetworkDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkDeleteResponse>> =
            delete(id, NetworkDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /networks/{id}/network_interfaces`, but is otherwise
         * the same as [NetworkServiceAsync.listInterfaces].
         */
        fun listInterfaces(
            id: String
        ): CompletableFuture<HttpResponseFor<NetworkListInterfacesResponse>> =
            listInterfaces(id, NetworkListInterfacesParams.none())

        /** @see listInterfaces */
        fun listInterfaces(
            id: String,
            params: NetworkListInterfacesParams = NetworkListInterfacesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkListInterfacesResponse>> =
            listInterfaces(params.toBuilder().id(id).build(), requestOptions)

        /** @see listInterfaces */
        fun listInterfaces(
            id: String,
            params: NetworkListInterfacesParams = NetworkListInterfacesParams.none(),
        ): CompletableFuture<HttpResponseFor<NetworkListInterfacesResponse>> =
            listInterfaces(id, params, RequestOptions.none())

        /** @see listInterfaces */
        fun listInterfaces(
            params: NetworkListInterfacesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkListInterfacesResponse>>

        /** @see listInterfaces */
        fun listInterfaces(
            params: NetworkListInterfacesParams
        ): CompletableFuture<HttpResponseFor<NetworkListInterfacesResponse>> =
            listInterfaces(params, RequestOptions.none())

        /** @see listInterfaces */
        fun listInterfaces(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkListInterfacesResponse>> =
            listInterfaces(id, NetworkListInterfacesParams.none(), requestOptions)
    }
}
