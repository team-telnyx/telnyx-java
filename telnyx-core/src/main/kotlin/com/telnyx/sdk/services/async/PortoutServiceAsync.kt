// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portouts.PortoutListPageAsync
import com.telnyx.sdk.models.portouts.PortoutListParams
import com.telnyx.sdk.models.portouts.PortoutListRejectionCodesParams
import com.telnyx.sdk.models.portouts.PortoutListRejectionCodesResponse
import com.telnyx.sdk.models.portouts.PortoutRetrieveParams
import com.telnyx.sdk.models.portouts.PortoutRetrieveResponse
import com.telnyx.sdk.models.portouts.PortoutUpdateStatusParams
import com.telnyx.sdk.models.portouts.PortoutUpdateStatusResponse
import com.telnyx.sdk.services.async.portouts.CommentServiceAsync
import com.telnyx.sdk.services.async.portouts.EventServiceAsync
import com.telnyx.sdk.services.async.portouts.ReportServiceAsync
import com.telnyx.sdk.services.async.portouts.SupportingDocumentServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PortoutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortoutServiceAsync

    fun events(): EventServiceAsync

    fun reports(): ReportServiceAsync

    fun comments(): CommentServiceAsync

    fun supportingDocuments(): SupportingDocumentServiceAsync

    /** Returns the portout request based on the ID provided */
    fun retrieve(id: String): CompletableFuture<PortoutRetrieveResponse> =
        retrieve(id, PortoutRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PortoutRetrieveParams = PortoutRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortoutRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PortoutRetrieveParams = PortoutRetrieveParams.none(),
    ): CompletableFuture<PortoutRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PortoutRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortoutRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: PortoutRetrieveParams): CompletableFuture<PortoutRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortoutRetrieveResponse> =
        retrieve(id, PortoutRetrieveParams.none(), requestOptions)

    /** Returns the portout requests according to filters */
    fun list(): CompletableFuture<PortoutListPageAsync> = list(PortoutListParams.none())

    /** @see list */
    fun list(
        params: PortoutListParams = PortoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortoutListPageAsync>

    /** @see list */
    fun list(
        params: PortoutListParams = PortoutListParams.none()
    ): CompletableFuture<PortoutListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PortoutListPageAsync> =
        list(PortoutListParams.none(), requestOptions)

    /** Given a port-out ID, list rejection codes that are eligible for that port-out */
    fun listRejectionCodes(
        portoutId: String
    ): CompletableFuture<PortoutListRejectionCodesResponse> =
        listRejectionCodes(portoutId, PortoutListRejectionCodesParams.none())

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        portoutId: String,
        params: PortoutListRejectionCodesParams = PortoutListRejectionCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortoutListRejectionCodesResponse> =
        listRejectionCodes(params.toBuilder().portoutId(portoutId).build(), requestOptions)

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        portoutId: String,
        params: PortoutListRejectionCodesParams = PortoutListRejectionCodesParams.none(),
    ): CompletableFuture<PortoutListRejectionCodesResponse> =
        listRejectionCodes(portoutId, params, RequestOptions.none())

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        params: PortoutListRejectionCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortoutListRejectionCodesResponse>

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        params: PortoutListRejectionCodesParams
    ): CompletableFuture<PortoutListRejectionCodesResponse> =
        listRejectionCodes(params, RequestOptions.none())

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        portoutId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PortoutListRejectionCodesResponse> =
        listRejectionCodes(portoutId, PortoutListRejectionCodesParams.none(), requestOptions)

    /** Authorize or reject portout request */
    fun updateStatus(
        status: PortoutUpdateStatusParams.Status,
        params: PortoutUpdateStatusParams,
    ): CompletableFuture<PortoutUpdateStatusResponse> =
        updateStatus(status, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        status: PortoutUpdateStatusParams.Status,
        params: PortoutUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortoutUpdateStatusResponse> =
        updateStatus(params.toBuilder().status(status).build(), requestOptions)

    /** @see updateStatus */
    fun updateStatus(
        params: PortoutUpdateStatusParams
    ): CompletableFuture<PortoutUpdateStatusResponse> = updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: PortoutUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortoutUpdateStatusResponse>

    /**
     * A view of [PortoutServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PortoutServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun reports(): ReportServiceAsync.WithRawResponse

        fun comments(): CommentServiceAsync.WithRawResponse

        fun supportingDocuments(): SupportingDocumentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /portouts/{id}`, but is otherwise the same as
         * [PortoutServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PortoutRetrieveResponse>> =
            retrieve(id, PortoutRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PortoutRetrieveParams = PortoutRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortoutRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PortoutRetrieveParams = PortoutRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PortoutRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PortoutRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortoutRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: PortoutRetrieveParams
        ): CompletableFuture<HttpResponseFor<PortoutRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortoutRetrieveResponse>> =
            retrieve(id, PortoutRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts`, but is otherwise the same as
         * [PortoutServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PortoutListPageAsync>> =
            list(PortoutListParams.none())

        /** @see list */
        fun list(
            params: PortoutListParams = PortoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortoutListPageAsync>>

        /** @see list */
        fun list(
            params: PortoutListParams = PortoutListParams.none()
        ): CompletableFuture<HttpResponseFor<PortoutListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PortoutListPageAsync>> =
            list(PortoutListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts/rejections/{portout_id}`, but is otherwise
         * the same as [PortoutServiceAsync.listRejectionCodes].
         */
        fun listRejectionCodes(
            portoutId: String
        ): CompletableFuture<HttpResponseFor<PortoutListRejectionCodesResponse>> =
            listRejectionCodes(portoutId, PortoutListRejectionCodesParams.none())

        /** @see listRejectionCodes */
        fun listRejectionCodes(
            portoutId: String,
            params: PortoutListRejectionCodesParams = PortoutListRejectionCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortoutListRejectionCodesResponse>> =
            listRejectionCodes(params.toBuilder().portoutId(portoutId).build(), requestOptions)

        /** @see listRejectionCodes */
        fun listRejectionCodes(
            portoutId: String,
            params: PortoutListRejectionCodesParams = PortoutListRejectionCodesParams.none(),
        ): CompletableFuture<HttpResponseFor<PortoutListRejectionCodesResponse>> =
            listRejectionCodes(portoutId, params, RequestOptions.none())

        /** @see listRejectionCodes */
        fun listRejectionCodes(
            params: PortoutListRejectionCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortoutListRejectionCodesResponse>>

        /** @see listRejectionCodes */
        fun listRejectionCodes(
            params: PortoutListRejectionCodesParams
        ): CompletableFuture<HttpResponseFor<PortoutListRejectionCodesResponse>> =
            listRejectionCodes(params, RequestOptions.none())

        /** @see listRejectionCodes */
        fun listRejectionCodes(
            portoutId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PortoutListRejectionCodesResponse>> =
            listRejectionCodes(portoutId, PortoutListRejectionCodesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /portouts/{id}/{status}`, but is otherwise the
         * same as [PortoutServiceAsync.updateStatus].
         */
        fun updateStatus(
            status: PortoutUpdateStatusParams.Status,
            params: PortoutUpdateStatusParams,
        ): CompletableFuture<HttpResponseFor<PortoutUpdateStatusResponse>> =
            updateStatus(status, params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            status: PortoutUpdateStatusParams.Status,
            params: PortoutUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortoutUpdateStatusResponse>> =
            updateStatus(params.toBuilder().status(status).build(), requestOptions)

        /** @see updateStatus */
        fun updateStatus(
            params: PortoutUpdateStatusParams
        ): CompletableFuture<HttpResponseFor<PortoutUpdateStatusResponse>> =
            updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        fun updateStatus(
            params: PortoutUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortoutUpdateStatusResponse>>
    }
}
