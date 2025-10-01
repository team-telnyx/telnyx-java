// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.connections.ConnectionListActiveCallsParams
import com.telnyx.sdk.models.connections.ConnectionListActiveCallsResponse
import com.telnyx.sdk.models.connections.ConnectionListParams
import com.telnyx.sdk.models.connections.ConnectionListResponse
import com.telnyx.sdk.models.connections.ConnectionRetrieveParams
import com.telnyx.sdk.models.connections.ConnectionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectionServiceAsync

    /**
     * Retrieves the high-level details of an existing connection. To retrieve specific
     * authentication information, use the endpoint for the specific connection type.
     */
    fun retrieve(id: String): CompletableFuture<ConnectionRetrieveResponse> =
        retrieve(id, ConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
    ): CompletableFuture<ConnectionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ConnectionRetrieveParams): CompletableFuture<ConnectionRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionRetrieveResponse> =
        retrieve(id, ConnectionRetrieveParams.none(), requestOptions)

    /** Returns a list of your connections irrespective of type. */
    fun list(): CompletableFuture<ConnectionListResponse> = list(ConnectionListParams.none())

    /** @see list */
    fun list(
        params: ConnectionListParams = ConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionListResponse>

    /** @see list */
    fun list(
        params: ConnectionListParams = ConnectionListParams.none()
    ): CompletableFuture<ConnectionListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ConnectionListResponse> =
        list(ConnectionListParams.none(), requestOptions)

    /**
     * Lists all active calls for given connection. Acceptable connections are either SIP
     * connections with webhook_url or xml_request_url, call control or texml. Returned results are
     * cursor paginated.
     */
    fun listActiveCalls(
        connectionId: String
    ): CompletableFuture<ConnectionListActiveCallsResponse> =
        listActiveCalls(connectionId, ConnectionListActiveCallsParams.none())

    /** @see listActiveCalls */
    fun listActiveCalls(
        connectionId: String,
        params: ConnectionListActiveCallsParams = ConnectionListActiveCallsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionListActiveCallsResponse> =
        listActiveCalls(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see listActiveCalls */
    fun listActiveCalls(
        connectionId: String,
        params: ConnectionListActiveCallsParams = ConnectionListActiveCallsParams.none(),
    ): CompletableFuture<ConnectionListActiveCallsResponse> =
        listActiveCalls(connectionId, params, RequestOptions.none())

    /** @see listActiveCalls */
    fun listActiveCalls(
        params: ConnectionListActiveCallsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionListActiveCallsResponse>

    /** @see listActiveCalls */
    fun listActiveCalls(
        params: ConnectionListActiveCallsParams
    ): CompletableFuture<ConnectionListActiveCallsResponse> =
        listActiveCalls(params, RequestOptions.none())

    /** @see listActiveCalls */
    fun listActiveCalls(
        connectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionListActiveCallsResponse> =
        listActiveCalls(connectionId, ConnectionListActiveCallsParams.none(), requestOptions)

    /**
     * A view of [ConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /connections/{id}`, but is otherwise the same as
         * [ConnectionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(id, ConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(id, ConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /connections`, but is otherwise the same as
         * [ConnectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ConnectionListResponse>> =
            list(ConnectionListParams.none())

        /** @see list */
        fun list(
            params: ConnectionListParams = ConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionListResponse>>

        /** @see list */
        fun list(
            params: ConnectionListParams = ConnectionListParams.none()
        ): CompletableFuture<HttpResponseFor<ConnectionListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConnectionListResponse>> =
            list(ConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /connections/{connection_id}/active_calls`, but is
         * otherwise the same as [ConnectionServiceAsync.listActiveCalls].
         */
        fun listActiveCalls(
            connectionId: String
        ): CompletableFuture<HttpResponseFor<ConnectionListActiveCallsResponse>> =
            listActiveCalls(connectionId, ConnectionListActiveCallsParams.none())

        /** @see listActiveCalls */
        fun listActiveCalls(
            connectionId: String,
            params: ConnectionListActiveCallsParams = ConnectionListActiveCallsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionListActiveCallsResponse>> =
            listActiveCalls(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see listActiveCalls */
        fun listActiveCalls(
            connectionId: String,
            params: ConnectionListActiveCallsParams = ConnectionListActiveCallsParams.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionListActiveCallsResponse>> =
            listActiveCalls(connectionId, params, RequestOptions.none())

        /** @see listActiveCalls */
        fun listActiveCalls(
            params: ConnectionListActiveCallsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionListActiveCallsResponse>>

        /** @see listActiveCalls */
        fun listActiveCalls(
            params: ConnectionListActiveCallsParams
        ): CompletableFuture<HttpResponseFor<ConnectionListActiveCallsResponse>> =
            listActiveCalls(params, RequestOptions.none())

        /** @see listActiveCalls */
        fun listActiveCalls(
            connectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionListActiveCallsResponse>> =
            listActiveCalls(connectionId, ConnectionListActiveCallsParams.none(), requestOptions)
    }
}
