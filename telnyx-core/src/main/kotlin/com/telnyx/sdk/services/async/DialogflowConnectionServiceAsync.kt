// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionCreateParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionDeleteParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionResponse
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionRetrieveParams
import com.telnyx.sdk.models.dialogflowconnections.DialogflowConnectionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Dialogflow Connection Operations. */
interface DialogflowConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DialogflowConnectionServiceAsync

    /** Save Dialogflow Credentiails to Telnyx, so it can be used with other Telnyx services. */
    fun create(
        connectionId: String,
        params: DialogflowConnectionCreateParams,
    ): CompletableFuture<DialogflowConnectionResponse> =
        create(connectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        connectionId: String,
        params: DialogflowConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialogflowConnectionResponse> =
        create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see create */
    fun create(
        params: DialogflowConnectionCreateParams
    ): CompletableFuture<DialogflowConnectionResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DialogflowConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialogflowConnectionResponse>

    /**
     * Return details of the Dialogflow connection associated with the given CallControl connection.
     */
    fun retrieve(connectionId: String): CompletableFuture<DialogflowConnectionResponse> =
        retrieve(connectionId, DialogflowConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        params: DialogflowConnectionRetrieveParams = DialogflowConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialogflowConnectionResponse> =
        retrieve(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        params: DialogflowConnectionRetrieveParams = DialogflowConnectionRetrieveParams.none(),
    ): CompletableFuture<DialogflowConnectionResponse> =
        retrieve(connectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DialogflowConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialogflowConnectionResponse>

    /** @see retrieve */
    fun retrieve(
        params: DialogflowConnectionRetrieveParams
    ): CompletableFuture<DialogflowConnectionResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DialogflowConnectionResponse> =
        retrieve(connectionId, DialogflowConnectionRetrieveParams.none(), requestOptions)

    /** Updates a stored Dialogflow Connection. */
    fun update(
        connectionId: String,
        params: DialogflowConnectionUpdateParams,
    ): CompletableFuture<DialogflowConnectionResponse> =
        update(connectionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        connectionId: String,
        params: DialogflowConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialogflowConnectionResponse> =
        update(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see update */
    fun update(
        params: DialogflowConnectionUpdateParams
    ): CompletableFuture<DialogflowConnectionResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DialogflowConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DialogflowConnectionResponse>

    /** Deletes a stored Dialogflow Connection. */
    fun delete(connectionId: String): CompletableFuture<Void?> =
        delete(connectionId, DialogflowConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        connectionId: String,
        params: DialogflowConnectionDeleteParams = DialogflowConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        connectionId: String,
        params: DialogflowConnectionDeleteParams = DialogflowConnectionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(connectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DialogflowConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: DialogflowConnectionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(connectionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(connectionId, DialogflowConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [DialogflowConnectionServiceAsync] that provides access to raw HTTP responses for
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
        ): DialogflowConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dialogflow_connections/{connection_id}`, but is
         * otherwise the same as [DialogflowConnectionServiceAsync.create].
         */
        fun create(
            connectionId: String,
            params: DialogflowConnectionCreateParams,
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            create(connectionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            connectionId: String,
            params: DialogflowConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: DialogflowConnectionCreateParams
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DialogflowConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>>

        /**
         * Returns a raw HTTP response for `get /dialogflow_connections/{connection_id}`, but is
         * otherwise the same as [DialogflowConnectionServiceAsync.retrieve].
         */
        fun retrieve(
            connectionId: String
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            retrieve(connectionId, DialogflowConnectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            connectionId: String,
            params: DialogflowConnectionRetrieveParams = DialogflowConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            retrieve(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            connectionId: String,
            params: DialogflowConnectionRetrieveParams = DialogflowConnectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            retrieve(connectionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DialogflowConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DialogflowConnectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            connectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            retrieve(connectionId, DialogflowConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /dialogflow_connections/{connection_id}`, but is
         * otherwise the same as [DialogflowConnectionServiceAsync.update].
         */
        fun update(
            connectionId: String,
            params: DialogflowConnectionUpdateParams,
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            update(connectionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            connectionId: String,
            params: DialogflowConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            update(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see update */
        fun update(
            params: DialogflowConnectionUpdateParams
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DialogflowConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DialogflowConnectionResponse>>

        /**
         * Returns a raw HTTP response for `delete /dialogflow_connections/{connection_id}`, but is
         * otherwise the same as [DialogflowConnectionServiceAsync.delete].
         */
        fun delete(connectionId: String): CompletableFuture<HttpResponse> =
            delete(connectionId, DialogflowConnectionDeleteParams.none())

        /** @see delete */
        fun delete(
            connectionId: String,
            params: DialogflowConnectionDeleteParams = DialogflowConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            connectionId: String,
            params: DialogflowConnectionDeleteParams = DialogflowConnectionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(connectionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DialogflowConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: DialogflowConnectionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            connectionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(connectionId, DialogflowConnectionDeleteParams.none(), requestOptions)
    }
}
