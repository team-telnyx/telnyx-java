// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.tunnels.TunnelCreateParams
import com.telnyx.sdk.models.tunnels.TunnelCreateResponse
import com.telnyx.sdk.models.tunnels.TunnelDeleteParams
import com.telnyx.sdk.models.tunnels.TunnelListParams
import com.telnyx.sdk.models.tunnels.TunnelListResponse
import com.telnyx.sdk.models.tunnels.TunnelRetrieveParams
import com.telnyx.sdk.models.tunnels.TunnelRetrieveResponse
import com.telnyx.sdk.services.async.tunnels.ActionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
interface TunnelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TunnelServiceAsync

    /** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
    fun actions(): ActionServiceAsync

    /**
     * Creates a tunnel and returns its `tunnel_token`. The token is the only credential the tunnel
     * process needs, and this response and `POST /tunnels/{id}/actions/rotate_token` are the only
     * ones that return it. A new tunnel is `inactive` until a tunnel process connects with the
     * token.
     */
    fun create(params: TunnelCreateParams): CompletableFuture<TunnelCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TunnelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TunnelCreateResponse>

    /**
     * Retrieves a tunnel with its status and the tunnel processes connected to it. The response
     * never includes `tunnel_token`.
     */
    fun retrieve(id: String): CompletableFuture<TunnelRetrieveResponse> =
        retrieve(id, TunnelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TunnelRetrieveParams = TunnelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TunnelRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TunnelRetrieveParams = TunnelRetrieveParams.none(),
    ): CompletableFuture<TunnelRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TunnelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TunnelRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: TunnelRetrieveParams): CompletableFuture<TunnelRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TunnelRetrieveResponse> =
        retrieve(id, TunnelRetrieveParams.none(), requestOptions)

    /**
     * Lists the tunnels on the account with their status and connected tunnel processes. Responses
     * never include `tunnel_token`.
     */
    fun list(): CompletableFuture<TunnelListResponse> = list(TunnelListParams.none())

    /** @see list */
    fun list(
        params: TunnelListParams = TunnelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TunnelListResponse>

    /** @see list */
    fun list(
        params: TunnelListParams = TunnelListParams.none()
    ): CompletableFuture<TunnelListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TunnelListResponse> =
        list(TunnelListParams.none(), requestOptions)

    /**
     * Deletes a tunnel. A tunnel that a route names as its next hop cannot be deleted; delete those
     * routes first. Connected tunnel processes are disconnected and cannot reconnect with the
     * tunnel's token.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, TunnelDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TunnelDeleteParams = TunnelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TunnelDeleteParams = TunnelDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TunnelDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TunnelDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, TunnelDeleteParams.none(), requestOptions)

    /**
     * A view of [TunnelServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TunnelServiceAsync.WithRawResponse

        /** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tunnels`, but is otherwise the same as
         * [TunnelServiceAsync.create].
         */
        fun create(
            params: TunnelCreateParams
        ): CompletableFuture<HttpResponseFor<TunnelCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TunnelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TunnelCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /tunnels/{id}`, but is otherwise the same as
         * [TunnelServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TunnelRetrieveResponse>> =
            retrieve(id, TunnelRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TunnelRetrieveParams = TunnelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TunnelRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TunnelRetrieveParams = TunnelRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TunnelRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TunnelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TunnelRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TunnelRetrieveParams
        ): CompletableFuture<HttpResponseFor<TunnelRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TunnelRetrieveResponse>> =
            retrieve(id, TunnelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tunnels`, but is otherwise the same as
         * [TunnelServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TunnelListResponse>> =
            list(TunnelListParams.none())

        /** @see list */
        fun list(
            params: TunnelListParams = TunnelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TunnelListResponse>>

        /** @see list */
        fun list(
            params: TunnelListParams = TunnelListParams.none()
        ): CompletableFuture<HttpResponseFor<TunnelListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TunnelListResponse>> =
            list(TunnelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /tunnels/{id}`, but is otherwise the same as
         * [TunnelServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, TunnelDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TunnelDeleteParams = TunnelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TunnelDeleteParams = TunnelDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TunnelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TunnelDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, TunnelDeleteParams.none(), requestOptions)
    }
}
