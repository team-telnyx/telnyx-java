// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.integrations

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionDeleteParams
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionListParams
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionListResponse
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionRetrieveParams
import com.telnyx.sdk.models.ai.integrations.connections.ConnectionRetrieveResponse
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

    /** Get user setup integrations */
    fun retrieve(userConnectionId: String): CompletableFuture<ConnectionRetrieveResponse> =
        retrieve(userConnectionId, ConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        userConnectionId: String,
        params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionRetrieveResponse> =
        retrieve(params.toBuilder().userConnectionId(userConnectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        userConnectionId: String,
        params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
    ): CompletableFuture<ConnectionRetrieveResponse> =
        retrieve(userConnectionId, params, RequestOptions.none())

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
        userConnectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionRetrieveResponse> =
        retrieve(userConnectionId, ConnectionRetrieveParams.none(), requestOptions)

    /** List user setup integrations */
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

    /** Delete a specific integration connection. */
    fun delete(userConnectionId: String): CompletableFuture<Void?> =
        delete(userConnectionId, ConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        userConnectionId: String,
        params: ConnectionDeleteParams = ConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().userConnectionId(userConnectionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        userConnectionId: String,
        params: ConnectionDeleteParams = ConnectionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(userConnectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ConnectionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(userConnectionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(userConnectionId, ConnectionDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `get /ai/integrations/connections/{user_connection_id}`,
         * but is otherwise the same as [ConnectionServiceAsync.retrieve].
         */
        fun retrieve(
            userConnectionId: String
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(userConnectionId, ConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            userConnectionId: String,
            params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(params.toBuilder().userConnectionId(userConnectionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            userConnectionId: String,
            params: ConnectionRetrieveParams = ConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(userConnectionId, params, RequestOptions.none())

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
            userConnectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionRetrieveResponse>> =
            retrieve(userConnectionId, ConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ai/integrations/connections`, but is otherwise the
         * same as [ConnectionServiceAsync.list].
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
         * Returns a raw HTTP response for `delete
         * /ai/integrations/connections/{user_connection_id}`, but is otherwise the same as
         * [ConnectionServiceAsync.delete].
         */
        fun delete(userConnectionId: String): CompletableFuture<HttpResponse> =
            delete(userConnectionId, ConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            userConnectionId: String,
            params: ConnectionDeleteParams = ConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().userConnectionId(userConnectionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            userConnectionId: String,
            params: ConnectionDeleteParams = ConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(userConnectionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ConnectionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            userConnectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(userConnectionId, ConnectionDeleteParams.none(), requestOptions)
    }
}
