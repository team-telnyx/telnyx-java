// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.integrations

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionDeleteParams
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionListParams
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionListResponse
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionRetrieveParams
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionRetrieveResponse
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

    /** Get user setup integrations */
    fun retrieve(userConnectionId: String): ConnectionRetrieveResponse =
        retrieve(userConnectionId, ConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userConnectionId: String,
        params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionRetrieveResponse =
        retrieve(params.toBuilder().userConnectionId(userConnectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userConnectionId: String,
        params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
    ): ConnectionRetrieveResponse = retrieve(userConnectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ConnectionRetrieveParams): ConnectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        userConnectionId: String,
        requestOptions: RequestOptions,
    ): ConnectionRetrieveResponse =
        retrieve(userConnectionId, ConnectionRetrieveParams.none(), requestOptions)

    /** List user setup integrations */
    fun list(): ConnectionListResponse = list(ConnectionListParams.none())

    /** @see list */
    fun list(
        params: ConnectionListParams = ConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionListResponse

    /** @see list */
    fun list(params: ConnectionListParams = ConnectionListParams.none()): ConnectionListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ConnectionListResponse =
        list(ConnectionListParams.none(), requestOptions)

    /** Delete a specific integration connection. */
    fun delete(userConnectionId: String) = delete(userConnectionId, ConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        userConnectionId: String,
        params: ConnectionDeleteParams = ConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().userConnectionId(userConnectionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        userConnectionId: String,
        params: ConnectionDeleteParams = ConnectionDeleteParams.none(),
    ) = delete(userConnectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: ConnectionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(userConnectionId: String, requestOptions: RequestOptions) =
        delete(userConnectionId, ConnectionDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /ai/integrations/connections/{user_connection_id}`,
         * but is otherwise the same as [ConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(userConnectionId: String): HttpResponseFor<ConnectionRetrieveResponse> =
            retrieve(userConnectionId, ConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userConnectionId: String,
            params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionRetrieveResponse> =
            retrieve(params.toBuilder().userConnectionId(userConnectionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            userConnectionId: String,
            params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
        ): HttpResponseFor<ConnectionRetrieveResponse> =
            retrieve(userConnectionId, params, RequestOptions.none())

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
            userConnectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionRetrieveResponse> =
            retrieve(userConnectionId, ConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/integrations/connections`, but is otherwise the
         * same as [ConnectionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ConnectionListResponse> = list(ConnectionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConnectionListParams = ConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ConnectionListParams = ConnectionListParams.none()
        ): HttpResponseFor<ConnectionListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConnectionListResponse> =
            list(ConnectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /ai/integrations/connections/{user_connection_id}`, but is otherwise the same as
         * [ConnectionService.delete].
         */
        @MustBeClosed
        fun delete(userConnectionId: String): HttpResponse =
            delete(userConnectionId, ConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            userConnectionId: String,
            params: ConnectionDeleteParams = ConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().userConnectionId(userConnectionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            userConnectionId: String,
            params: ConnectionDeleteParams = ConnectionDeleteParams.none(),
        ): HttpResponse = delete(userConnectionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ConnectionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(userConnectionId: String, requestOptions: RequestOptions): HttpResponse =
            delete(userConnectionId, ConnectionDeleteParams.none(), requestOptions)
    }
}
