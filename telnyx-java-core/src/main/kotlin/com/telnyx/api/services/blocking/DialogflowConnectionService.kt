// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.api.core.ClientOptions
import com.telnyx.api.core.RequestOptions
import com.telnyx.api.core.http.HttpResponse
import com.telnyx.api.core.http.HttpResponseFor
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionCreateParams
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionCreateResponse
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionDeleteParams
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionRetrieveParams
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionRetrieveResponse
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionUpdateParams
import com.telnyx.api.models.dialogflowconnections.DialogflowConnectionUpdateResponse
import java.util.function.Consumer

interface DialogflowConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DialogflowConnectionService

    /** Save Dialogflow Credentiails to Telnyx, so it can be used with other Telnyx services. */
    fun create(
        connectionId: String,
        params: DialogflowConnectionCreateParams,
    ): DialogflowConnectionCreateResponse = create(connectionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        connectionId: String,
        params: DialogflowConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialogflowConnectionCreateResponse =
        create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see create */
    fun create(params: DialogflowConnectionCreateParams): DialogflowConnectionCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DialogflowConnectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialogflowConnectionCreateResponse

    /**
     * Return details of the Dialogflow connection associated with the given CallControl connection.
     */
    fun retrieve(connectionId: String): DialogflowConnectionRetrieveResponse =
        retrieve(connectionId, DialogflowConnectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        params: DialogflowConnectionRetrieveParams = DialogflowConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialogflowConnectionRetrieveResponse =
        retrieve(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        params: DialogflowConnectionRetrieveParams = DialogflowConnectionRetrieveParams.none(),
    ): DialogflowConnectionRetrieveResponse = retrieve(connectionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DialogflowConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialogflowConnectionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: DialogflowConnectionRetrieveParams): DialogflowConnectionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        connectionId: String,
        requestOptions: RequestOptions,
    ): DialogflowConnectionRetrieveResponse =
        retrieve(connectionId, DialogflowConnectionRetrieveParams.none(), requestOptions)

    /** Updates a stored Dialogflow Connection. */
    fun update(
        connectionId: String,
        params: DialogflowConnectionUpdateParams,
    ): DialogflowConnectionUpdateResponse = update(connectionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        connectionId: String,
        params: DialogflowConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialogflowConnectionUpdateResponse =
        update(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see update */
    fun update(params: DialogflowConnectionUpdateParams): DialogflowConnectionUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DialogflowConnectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DialogflowConnectionUpdateResponse

    /** Deletes a stored Dialogflow Connection. */
    fun delete(connectionId: String) = delete(connectionId, DialogflowConnectionDeleteParams.none())

    /** @see delete */
    fun delete(
        connectionId: String,
        params: DialogflowConnectionDeleteParams = DialogflowConnectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().connectionId(connectionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        connectionId: String,
        params: DialogflowConnectionDeleteParams = DialogflowConnectionDeleteParams.none(),
    ) = delete(connectionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DialogflowConnectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: DialogflowConnectionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(connectionId: String, requestOptions: RequestOptions) =
        delete(connectionId, DialogflowConnectionDeleteParams.none(), requestOptions)

    /**
     * A view of [DialogflowConnectionService] that provides access to raw HTTP responses for each
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
        ): DialogflowConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /dialogflow_connections/{connection_id}`, but is
         * otherwise the same as [DialogflowConnectionService.create].
         */
        @MustBeClosed
        fun create(
            connectionId: String,
            params: DialogflowConnectionCreateParams,
        ): HttpResponseFor<DialogflowConnectionCreateResponse> =
            create(connectionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            connectionId: String,
            params: DialogflowConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialogflowConnectionCreateResponse> =
            create(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: DialogflowConnectionCreateParams
        ): HttpResponseFor<DialogflowConnectionCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DialogflowConnectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialogflowConnectionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /dialogflow_connections/{connection_id}`, but is
         * otherwise the same as [DialogflowConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(connectionId: String): HttpResponseFor<DialogflowConnectionRetrieveResponse> =
            retrieve(connectionId, DialogflowConnectionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectionId: String,
            params: DialogflowConnectionRetrieveParams = DialogflowConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialogflowConnectionRetrieveResponse> =
            retrieve(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectionId: String,
            params: DialogflowConnectionRetrieveParams = DialogflowConnectionRetrieveParams.none(),
        ): HttpResponseFor<DialogflowConnectionRetrieveResponse> =
            retrieve(connectionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DialogflowConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialogflowConnectionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DialogflowConnectionRetrieveParams
        ): HttpResponseFor<DialogflowConnectionRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            connectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DialogflowConnectionRetrieveResponse> =
            retrieve(connectionId, DialogflowConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /dialogflow_connections/{connection_id}`, but is
         * otherwise the same as [DialogflowConnectionService.update].
         */
        @MustBeClosed
        fun update(
            connectionId: String,
            params: DialogflowConnectionUpdateParams,
        ): HttpResponseFor<DialogflowConnectionUpdateResponse> =
            update(connectionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            connectionId: String,
            params: DialogflowConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialogflowConnectionUpdateResponse> =
            update(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: DialogflowConnectionUpdateParams
        ): HttpResponseFor<DialogflowConnectionUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: DialogflowConnectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DialogflowConnectionUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /dialogflow_connections/{connection_id}`, but is
         * otherwise the same as [DialogflowConnectionService.delete].
         */
        @MustBeClosed
        fun delete(connectionId: String): HttpResponse =
            delete(connectionId, DialogflowConnectionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            connectionId: String,
            params: DialogflowConnectionDeleteParams = DialogflowConnectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().connectionId(connectionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            connectionId: String,
            params: DialogflowConnectionDeleteParams = DialogflowConnectionDeleteParams.none(),
        ): HttpResponse = delete(connectionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DialogflowConnectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: DialogflowConnectionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(connectionId: String, requestOptions: RequestOptions): HttpResponse =
            delete(connectionId, DialogflowConnectionDeleteParams.none(), requestOptions)
    }
}
