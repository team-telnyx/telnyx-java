// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import com.telnyx.sdk.services.blocking.tunnels.ActionService
import java.util.function.Consumer

/** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
interface TunnelService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TunnelService

    /** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
    fun actions(): ActionService

    /**
     * Creates a tunnel and returns its `tunnel_token`. The token is the only credential the tunnel
     * process needs, and this response and `POST /tunnels/{id}/actions/rotate_token` are the only
     * ones that return it. A new tunnel is `inactive` until a tunnel process connects with the
     * token.
     */
    fun create(params: TunnelCreateParams): TunnelCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TunnelCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TunnelCreateResponse

    /**
     * Retrieves a tunnel with its status and the tunnel processes connected to it. The response
     * never includes `tunnel_token`.
     */
    fun retrieve(id: String): TunnelRetrieveResponse = retrieve(id, TunnelRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TunnelRetrieveParams = TunnelRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TunnelRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TunnelRetrieveParams = TunnelRetrieveParams.none(),
    ): TunnelRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TunnelRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TunnelRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TunnelRetrieveParams): TunnelRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TunnelRetrieveResponse =
        retrieve(id, TunnelRetrieveParams.none(), requestOptions)

    /**
     * Lists the tunnels on the account with their status and connected tunnel processes. Responses
     * never include `tunnel_token`.
     */
    fun list(): TunnelListResponse = list(TunnelListParams.none())

    /** @see list */
    fun list(
        params: TunnelListParams = TunnelListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TunnelListResponse

    /** @see list */
    fun list(params: TunnelListParams = TunnelListParams.none()): TunnelListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TunnelListResponse =
        list(TunnelListParams.none(), requestOptions)

    /**
     * Deletes a tunnel. A tunnel that a route names as its next hop cannot be deleted; delete those
     * routes first. Connected tunnel processes are disconnected and cannot reconnect with the
     * tunnel's token.
     */
    fun delete(id: String) = delete(id, TunnelDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TunnelDeleteParams = TunnelDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: TunnelDeleteParams = TunnelDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TunnelDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TunnelDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, TunnelDeleteParams.none(), requestOptions)

    /** A view of [TunnelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TunnelService.WithRawResponse

        /** Tunnels connect a Network to hosts behind a tunnel process within the user's network. */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /tunnels`, but is otherwise the same as
         * [TunnelService.create].
         */
        @MustBeClosed
        fun create(params: TunnelCreateParams): HttpResponseFor<TunnelCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TunnelCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TunnelCreateResponse>

        /**
         * Returns a raw HTTP response for `get /tunnels/{id}`, but is otherwise the same as
         * [TunnelService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TunnelRetrieveResponse> =
            retrieve(id, TunnelRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TunnelRetrieveParams = TunnelRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TunnelRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TunnelRetrieveParams = TunnelRetrieveParams.none(),
        ): HttpResponseFor<TunnelRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TunnelRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TunnelRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TunnelRetrieveParams): HttpResponseFor<TunnelRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TunnelRetrieveResponse> =
            retrieve(id, TunnelRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /tunnels`, but is otherwise the same as
         * [TunnelService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TunnelListResponse> = list(TunnelListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TunnelListParams = TunnelListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TunnelListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TunnelListParams = TunnelListParams.none()
        ): HttpResponseFor<TunnelListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TunnelListResponse> =
            list(TunnelListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /tunnels/{id}`, but is otherwise the same as
         * [TunnelService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, TunnelDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TunnelDeleteParams = TunnelDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: TunnelDeleteParams = TunnelDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TunnelDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TunnelDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, TunnelDeleteParams.none(), requestOptions)
    }
}
