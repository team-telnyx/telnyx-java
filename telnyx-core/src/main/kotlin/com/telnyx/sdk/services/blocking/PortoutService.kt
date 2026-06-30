// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.portouts.PortoutListPage
import com.telnyx.sdk.models.portouts.PortoutListParams
import com.telnyx.sdk.models.portouts.PortoutListRejectionCodesParams
import com.telnyx.sdk.models.portouts.PortoutListRejectionCodesResponse
import com.telnyx.sdk.models.portouts.PortoutRetrieveParams
import com.telnyx.sdk.models.portouts.PortoutRetrieveResponse
import com.telnyx.sdk.models.portouts.PortoutUpdateStatusParams
import com.telnyx.sdk.models.portouts.PortoutUpdateStatusResponse
import com.telnyx.sdk.services.blocking.portouts.CommentService
import com.telnyx.sdk.services.blocking.portouts.EventService
import com.telnyx.sdk.services.blocking.portouts.ReportService
import com.telnyx.sdk.services.blocking.portouts.SupportingDocumentService
import java.util.function.Consumer

/** Number portout operations */
interface PortoutService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortoutService

    /** Number portout operations */
    fun events(): EventService

    /** Number portout operations */
    fun reports(): ReportService

    /** Number portout operations */
    fun comments(): CommentService

    /** Number portout operations */
    fun supportingDocuments(): SupportingDocumentService

    /** Returns the portout request based on the ID provided */
    fun retrieve(id: String): PortoutRetrieveResponse = retrieve(id, PortoutRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PortoutRetrieveParams = PortoutRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortoutRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PortoutRetrieveParams = PortoutRetrieveParams.none(),
    ): PortoutRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PortoutRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortoutRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: PortoutRetrieveParams): PortoutRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PortoutRetrieveResponse =
        retrieve(id, PortoutRetrieveParams.none(), requestOptions)

    /** Returns the portout requests according to filters */
    fun list(): PortoutListPage = list(PortoutListParams.none())

    /** @see list */
    fun list(
        params: PortoutListParams = PortoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortoutListPage

    /** @see list */
    fun list(params: PortoutListParams = PortoutListParams.none()): PortoutListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PortoutListPage =
        list(PortoutListParams.none(), requestOptions)

    /** Given a port-out ID, list rejection codes that are eligible for that port-out */
    fun listRejectionCodes(portoutId: String): PortoutListRejectionCodesResponse =
        listRejectionCodes(portoutId, PortoutListRejectionCodesParams.none())

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        portoutId: String,
        params: PortoutListRejectionCodesParams = PortoutListRejectionCodesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortoutListRejectionCodesResponse =
        listRejectionCodes(params.toBuilder().portoutId(portoutId).build(), requestOptions)

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        portoutId: String,
        params: PortoutListRejectionCodesParams = PortoutListRejectionCodesParams.none(),
    ): PortoutListRejectionCodesResponse =
        listRejectionCodes(portoutId, params, RequestOptions.none())

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        params: PortoutListRejectionCodesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortoutListRejectionCodesResponse

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        params: PortoutListRejectionCodesParams
    ): PortoutListRejectionCodesResponse = listRejectionCodes(params, RequestOptions.none())

    /** @see listRejectionCodes */
    fun listRejectionCodes(
        portoutId: String,
        requestOptions: RequestOptions,
    ): PortoutListRejectionCodesResponse =
        listRejectionCodes(portoutId, PortoutListRejectionCodesParams.none(), requestOptions)

    /** Authorize or reject portout request */
    fun updateStatus(
        status: PortoutUpdateStatusParams.Status,
        params: PortoutUpdateStatusParams,
    ): PortoutUpdateStatusResponse = updateStatus(status, params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        status: PortoutUpdateStatusParams.Status,
        params: PortoutUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortoutUpdateStatusResponse =
        updateStatus(params.toBuilder().status(status).build(), requestOptions)

    /** @see updateStatus */
    fun updateStatus(params: PortoutUpdateStatusParams): PortoutUpdateStatusResponse =
        updateStatus(params, RequestOptions.none())

    /** @see updateStatus */
    fun updateStatus(
        params: PortoutUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortoutUpdateStatusResponse

    /** A view of [PortoutService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PortoutService.WithRawResponse

        /** Number portout operations */
        fun events(): EventService.WithRawResponse

        /** Number portout operations */
        fun reports(): ReportService.WithRawResponse

        /** Number portout operations */
        fun comments(): CommentService.WithRawResponse

        /** Number portout operations */
        fun supportingDocuments(): SupportingDocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /portouts/{id}`, but is otherwise the same as
         * [PortoutService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PortoutRetrieveResponse> =
            retrieve(id, PortoutRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PortoutRetrieveParams = PortoutRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortoutRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PortoutRetrieveParams = PortoutRetrieveParams.none(),
        ): HttpResponseFor<PortoutRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PortoutRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortoutRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PortoutRetrieveParams): HttpResponseFor<PortoutRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortoutRetrieveResponse> =
            retrieve(id, PortoutRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts`, but is otherwise the same as
         * [PortoutService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PortoutListPage> = list(PortoutListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortoutListParams = PortoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortoutListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PortoutListParams = PortoutListParams.none()
        ): HttpResponseFor<PortoutListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PortoutListPage> =
            list(PortoutListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /portouts/rejections/{portout_id}`, but is otherwise
         * the same as [PortoutService.listRejectionCodes].
         */
        @MustBeClosed
        fun listRejectionCodes(
            portoutId: String
        ): HttpResponseFor<PortoutListRejectionCodesResponse> =
            listRejectionCodes(portoutId, PortoutListRejectionCodesParams.none())

        /** @see listRejectionCodes */
        @MustBeClosed
        fun listRejectionCodes(
            portoutId: String,
            params: PortoutListRejectionCodesParams = PortoutListRejectionCodesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortoutListRejectionCodesResponse> =
            listRejectionCodes(params.toBuilder().portoutId(portoutId).build(), requestOptions)

        /** @see listRejectionCodes */
        @MustBeClosed
        fun listRejectionCodes(
            portoutId: String,
            params: PortoutListRejectionCodesParams = PortoutListRejectionCodesParams.none(),
        ): HttpResponseFor<PortoutListRejectionCodesResponse> =
            listRejectionCodes(portoutId, params, RequestOptions.none())

        /** @see listRejectionCodes */
        @MustBeClosed
        fun listRejectionCodes(
            params: PortoutListRejectionCodesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortoutListRejectionCodesResponse>

        /** @see listRejectionCodes */
        @MustBeClosed
        fun listRejectionCodes(
            params: PortoutListRejectionCodesParams
        ): HttpResponseFor<PortoutListRejectionCodesResponse> =
            listRejectionCodes(params, RequestOptions.none())

        /** @see listRejectionCodes */
        @MustBeClosed
        fun listRejectionCodes(
            portoutId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PortoutListRejectionCodesResponse> =
            listRejectionCodes(portoutId, PortoutListRejectionCodesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /portouts/{id}/{status}`, but is otherwise the
         * same as [PortoutService.updateStatus].
         */
        @MustBeClosed
        fun updateStatus(
            status: PortoutUpdateStatusParams.Status,
            params: PortoutUpdateStatusParams,
        ): HttpResponseFor<PortoutUpdateStatusResponse> =
            updateStatus(status, params, RequestOptions.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            status: PortoutUpdateStatusParams.Status,
            params: PortoutUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortoutUpdateStatusResponse> =
            updateStatus(params.toBuilder().status(status).build(), requestOptions)

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            params: PortoutUpdateStatusParams
        ): HttpResponseFor<PortoutUpdateStatusResponse> =
            updateStatus(params, RequestOptions.none())

        /** @see updateStatus */
        @MustBeClosed
        fun updateStatus(
            params: PortoutUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortoutUpdateStatusResponse>
    }
}
