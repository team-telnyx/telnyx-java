// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceCreateParams
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceCreateResponse
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceDeleteParams
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceDeleteResponse
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceListParams
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceListResponse
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceRetrieveParams
import com.telnyx.api.models.wireguardinterfaces.WireguardInterfaceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WireguardInterfaceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WireguardInterfaceServiceAsync

    /**
     * Create a new WireGuard Interface. Current limitation of 10 interfaces per user can be
     * created.
     */
    fun create(): CompletableFuture<WireguardInterfaceCreateResponse> =
        create(WireguardInterfaceCreateParams.none())

    /** @see create */
    fun create(
        params: WireguardInterfaceCreateParams = WireguardInterfaceCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardInterfaceCreateResponse>

    /** @see create */
    fun create(
        params: WireguardInterfaceCreateParams = WireguardInterfaceCreateParams.none()
    ): CompletableFuture<WireguardInterfaceCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<WireguardInterfaceCreateResponse> =
        create(WireguardInterfaceCreateParams.none(), requestOptions)

    /** Retrieve a WireGuard Interfaces. */
    fun retrieve(id: String): CompletableFuture<WireguardInterfaceRetrieveResponse> =
        retrieve(id, WireguardInterfaceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WireguardInterfaceRetrieveParams = WireguardInterfaceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardInterfaceRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: WireguardInterfaceRetrieveParams = WireguardInterfaceRetrieveParams.none(),
    ): CompletableFuture<WireguardInterfaceRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WireguardInterfaceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardInterfaceRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: WireguardInterfaceRetrieveParams
    ): CompletableFuture<WireguardInterfaceRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireguardInterfaceRetrieveResponse> =
        retrieve(id, WireguardInterfaceRetrieveParams.none(), requestOptions)

    /** List all WireGuard Interfaces. */
    fun list(): CompletableFuture<WireguardInterfaceListResponse> =
        list(WireguardInterfaceListParams.none())

    /** @see list */
    fun list(
        params: WireguardInterfaceListParams = WireguardInterfaceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardInterfaceListResponse>

    /** @see list */
    fun list(
        params: WireguardInterfaceListParams = WireguardInterfaceListParams.none()
    ): CompletableFuture<WireguardInterfaceListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WireguardInterfaceListResponse> =
        list(WireguardInterfaceListParams.none(), requestOptions)

    /** Delete a WireGuard Interface. */
    fun delete(id: String): CompletableFuture<WireguardInterfaceDeleteResponse> =
        delete(id, WireguardInterfaceDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: WireguardInterfaceDeleteParams = WireguardInterfaceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardInterfaceDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: WireguardInterfaceDeleteParams = WireguardInterfaceDeleteParams.none(),
    ): CompletableFuture<WireguardInterfaceDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WireguardInterfaceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WireguardInterfaceDeleteResponse>

    /** @see delete */
    fun delete(
        params: WireguardInterfaceDeleteParams
    ): CompletableFuture<WireguardInterfaceDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WireguardInterfaceDeleteResponse> =
        delete(id, WireguardInterfaceDeleteParams.none(), requestOptions)

    /**
     * A view of [WireguardInterfaceServiceAsync] that provides access to raw HTTP responses for
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
        ): WireguardInterfaceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wireguard_interfaces`, but is otherwise the same
         * as [WireguardInterfaceServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<WireguardInterfaceCreateResponse>> =
            create(WireguardInterfaceCreateParams.none())

        /** @see create */
        fun create(
            params: WireguardInterfaceCreateParams = WireguardInterfaceCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceCreateResponse>>

        /** @see create */
        fun create(
            params: WireguardInterfaceCreateParams = WireguardInterfaceCreateParams.none()
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceCreateResponse>> =
            create(WireguardInterfaceCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireguard_interfaces/{id}`, but is otherwise the
         * same as [WireguardInterfaceServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceRetrieveResponse>> =
            retrieve(id, WireguardInterfaceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WireguardInterfaceRetrieveParams = WireguardInterfaceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: WireguardInterfaceRetrieveParams = WireguardInterfaceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WireguardInterfaceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: WireguardInterfaceRetrieveParams
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceRetrieveResponse>> =
            retrieve(id, WireguardInterfaceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wireguard_interfaces`, but is otherwise the same as
         * [WireguardInterfaceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WireguardInterfaceListResponse>> =
            list(WireguardInterfaceListParams.none())

        /** @see list */
        fun list(
            params: WireguardInterfaceListParams = WireguardInterfaceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceListResponse>>

        /** @see list */
        fun list(
            params: WireguardInterfaceListParams = WireguardInterfaceListParams.none()
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceListResponse>> =
            list(WireguardInterfaceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /wireguard_interfaces/{id}`, but is otherwise the
         * same as [WireguardInterfaceServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceDeleteResponse>> =
            delete(id, WireguardInterfaceDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: WireguardInterfaceDeleteParams = WireguardInterfaceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: WireguardInterfaceDeleteParams = WireguardInterfaceDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WireguardInterfaceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceDeleteResponse>>

        /** @see delete */
        fun delete(
            params: WireguardInterfaceDeleteParams
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WireguardInterfaceDeleteResponse>> =
            delete(id, WireguardInterfaceDeleteParams.none(), requestOptions)
    }
}
