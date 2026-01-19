// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.connections.ConnectionListActiveCallsPage
import com.telnyx.sdk.models.connections.ConnectionListActiveCallsParams
import com.telnyx.sdk.models.connections.ConnectionListPage
import com.telnyx.sdk.models.connections.ConnectionListParams
import com.telnyx.sdk.models.connections.ConnectionRetrieveParams
import com.telnyx.sdk.models.connections.ConnectionRetrieveResponse
import java.util.function.Consumer

interface ConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConnectionService

    /**
     * Retrieves the high-level details of an existing connection. To retrieve specific
     * authentication information, use the endpoint for the specific connection type.
     */
    fun retrieve(id: String): ConnectionRetrieveResponse =
        retrieve(id, ConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
    ): ConnectionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ConnectionRetrieveParams): ConnectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ConnectionRetrieveResponse =
        retrieve(id, ConnectionRetrieveParams.none(), requestOptions)

    /** Returns a list of your connections irrespective of type. */
    fun list(): ConnectionListPage = list(ConnectionListParams.none())

    /** @see list */
    fun list(
        params: ConnectionListParams = ConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionListPage

    /** @see list */
    fun list(params: ConnectionListParams = ConnectionListParams.none()): ConnectionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ConnectionListPage =
        list(ConnectionListParams.none(), requestOptions)

    /**
     * Lists all active calls for given connection. Acceptable connections are either SIP
     * connections with webhook_url or xml_request_url, call control or texml. Returned results are
     * cursor paginated.
     */
    fun listActiveCalls(connectionId: String): ConnectionListActiveCallsPage =
        listActiveCalls(connectionId, ConnectionListActiveCallsParams.none())

    /** @see listActiveCalls */
    fun listActiveCalls(
        connectionId: String,
        params: ConnectionListActiveCallsParams = ConnectionListActiveCallsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionListActiveCallsPage =
        listActiveCalls(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see listActiveCalls */
    fun listActiveCalls(
        connectionId: String,
        params: ConnectionListActiveCallsParams = ConnectionListActiveCallsParams.none(),
    ): ConnectionListActiveCallsPage = listActiveCalls(connectionId, params, RequestOptions.none())

    /** @see listActiveCalls */
    fun listActiveCalls(
        params: ConnectionListActiveCallsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionListActiveCallsPage

    /** @see listActiveCalls */
    fun listActiveCalls(params: ConnectionListActiveCallsParams): ConnectionListActiveCallsPage =
        listActiveCalls(params, RequestOptions.none())

    /** @see listActiveCalls */
    fun listActiveCalls(
        connectionId: String,
        requestOptions: RequestOptions,
    ): ConnectionListActiveCallsPage =
        listActiveCalls(connectionId, ConnectionListActiveCallsParams.none(), requestOptions)

    /** A view of [ConnectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /connections/{id}`, but is otherwise the same as
         * [ConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ConnectionRetrieveResponse> =
            retrieve(id, ConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
        ): HttpResponseFor<ConnectionRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ConnectionRetrieveParams
        ): HttpResponseFor<ConnectionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionRetrieveResponse> =
            retrieve(id, ConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /connections`, but is otherwise the same as
         * [ConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ConnectionListPage> = list(ConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConnectionListParams = ConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConnectionListParams = ConnectionListParams.none()
        ): HttpResponseFor<ConnectionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConnectionListPage> =
            list(ConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /connections/{connection_id}/active_calls`, but is
         * otherwise the same as [ConnectionService.listActiveCalls].
         */
        @MustBeClosed
        fun listActiveCalls(connectionId: String): HttpResponseFor<ConnectionListActiveCallsPage> =
            listActiveCalls(connectionId, ConnectionListActiveCallsParams.none())

        /** @see listActiveCalls */
        @MustBeClosed
        fun listActiveCalls(
            connectionId: String,
            params: ConnectionListActiveCallsParams = ConnectionListActiveCallsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionListActiveCallsPage> =
            listActiveCalls(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see listActiveCalls */
        @MustBeClosed
        fun listActiveCalls(
            connectionId: String,
            params: ConnectionListActiveCallsParams = ConnectionListActiveCallsParams.none(),
        ): HttpResponseFor<ConnectionListActiveCallsPage> =
            listActiveCalls(connectionId, params, RequestOptions.none())

        /** @see listActiveCalls */
        @MustBeClosed
        fun listActiveCalls(
            params: ConnectionListActiveCallsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionListActiveCallsPage>

        /** @see listActiveCalls */
        @MustBeClosed
        fun listActiveCalls(
            params: ConnectionListActiveCallsParams
        ): HttpResponseFor<ConnectionListActiveCallsPage> =
            listActiveCalls(params, RequestOptions.none())

        /** @see listActiveCalls */
        @MustBeClosed
        fun listActiveCalls(
            connectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionListActiveCallsPage> =
            listActiveCalls(connectionId, ConnectionListActiveCallsParams.none(), requestOptions)
    }
}
