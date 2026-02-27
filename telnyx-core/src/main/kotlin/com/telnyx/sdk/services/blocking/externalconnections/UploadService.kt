// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.externalconnections

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadListPage
import com.telnyx.sdk.models.externalconnections.uploads.UploadListParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadPendingCountParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadPendingCountResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRefreshStatusParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRefreshStatusResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryResponse
import java.util.function.Consumer

/** External Connections operations */
interface UploadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadService

    /**
     * Creates a new Upload request to Microsoft teams with the included phone numbers. Only one of
     * civic_address_id or location_id must be provided, not both. The maximum allowed phone numbers
     * for the numbers_ids array is 1000.
     */
    fun create(id: String, params: UploadCreateParams): UploadCreateResponse =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadCreateResponse = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: UploadCreateParams): UploadCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadCreateResponse

    /** Return the details of an Upload request and its phone numbers. */
    fun retrieve(ticketId: String, params: UploadRetrieveParams): UploadRetrieveResponse =
        retrieve(ticketId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        ticketId: String,
        params: UploadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadRetrieveResponse =
        retrieve(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: UploadRetrieveParams): UploadRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UploadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadRetrieveResponse

    /** Returns a list of your Upload requests for the given external connection. */
    fun list(id: String): UploadListPage = list(id, UploadListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: UploadListParams = UploadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadListPage = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: UploadListParams = UploadListParams.none()): UploadListPage =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: UploadListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadListPage

    /** @see list */
    fun list(params: UploadListParams): UploadListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): UploadListPage =
        list(id, UploadListParams.none(), requestOptions)

    /** Returns the count of all pending upload requests for the given external connection. */
    fun pendingCount(id: String): UploadPendingCountResponse =
        pendingCount(id, UploadPendingCountParams.none())

    /** @see pendingCount */
    fun pendingCount(
        id: String,
        params: UploadPendingCountParams = UploadPendingCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadPendingCountResponse = pendingCount(params.toBuilder().id(id).build(), requestOptions)

    /** @see pendingCount */
    fun pendingCount(
        id: String,
        params: UploadPendingCountParams = UploadPendingCountParams.none(),
    ): UploadPendingCountResponse = pendingCount(id, params, RequestOptions.none())

    /** @see pendingCount */
    fun pendingCount(
        params: UploadPendingCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadPendingCountResponse

    /** @see pendingCount */
    fun pendingCount(params: UploadPendingCountParams): UploadPendingCountResponse =
        pendingCount(params, RequestOptions.none())

    /** @see pendingCount */
    fun pendingCount(id: String, requestOptions: RequestOptions): UploadPendingCountResponse =
        pendingCount(id, UploadPendingCountParams.none(), requestOptions)

    /**
     * Forces a recheck of the status of all pending Upload requests for the given external
     * connection in the background.
     */
    fun refreshStatus(id: String): UploadRefreshStatusResponse =
        refreshStatus(id, UploadRefreshStatusParams.none())

    /** @see refreshStatus */
    fun refreshStatus(
        id: String,
        params: UploadRefreshStatusParams = UploadRefreshStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadRefreshStatusResponse =
        refreshStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see refreshStatus */
    fun refreshStatus(
        id: String,
        params: UploadRefreshStatusParams = UploadRefreshStatusParams.none(),
    ): UploadRefreshStatusResponse = refreshStatus(id, params, RequestOptions.none())

    /** @see refreshStatus */
    fun refreshStatus(
        params: UploadRefreshStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadRefreshStatusResponse

    /** @see refreshStatus */
    fun refreshStatus(params: UploadRefreshStatusParams): UploadRefreshStatusResponse =
        refreshStatus(params, RequestOptions.none())

    /** @see refreshStatus */
    fun refreshStatus(id: String, requestOptions: RequestOptions): UploadRefreshStatusResponse =
        refreshStatus(id, UploadRefreshStatusParams.none(), requestOptions)

    /**
     * If there were any errors during the upload process, this endpoint will retry the upload
     * request. In some cases this will reattempt the existing upload request, in other cases it may
     * create a new upload request. Please check the ticket_id in the response to determine if a new
     * upload request was created.
     */
    fun retry(ticketId: String, params: UploadRetryParams): UploadRetryResponse =
        retry(ticketId, params, RequestOptions.none())

    /** @see retry */
    fun retry(
        ticketId: String,
        params: UploadRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadRetryResponse = retry(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see retry */
    fun retry(params: UploadRetryParams): UploadRetryResponse = retry(params, RequestOptions.none())

    /** @see retry */
    fun retry(
        params: UploadRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadRetryResponse

    /** A view of [UploadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /external_connections/{id}/uploads`, but is
         * otherwise the same as [UploadService.create].
         */
        @MustBeClosed
        fun create(id: String, params: UploadCreateParams): HttpResponseFor<UploadCreateResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadCreateResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: UploadCreateParams): HttpResponseFor<UploadCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadCreateResponse>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/uploads/{ticket_id}`, but
         * is otherwise the same as [UploadService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            ticketId: String,
            params: UploadRetrieveParams,
        ): HttpResponseFor<UploadRetrieveResponse> =
            retrieve(ticketId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            ticketId: String,
            params: UploadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadRetrieveResponse> =
            retrieve(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: UploadRetrieveParams): HttpResponseFor<UploadRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UploadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/uploads`, but is
         * otherwise the same as [UploadService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<UploadListPage> = list(id, UploadListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: UploadListParams = UploadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadListPage> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: UploadListParams = UploadListParams.none(),
        ): HttpResponseFor<UploadListPage> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: UploadListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: UploadListParams): HttpResponseFor<UploadListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<UploadListPage> =
            list(id, UploadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/uploads/status`, but is
         * otherwise the same as [UploadService.pendingCount].
         */
        @MustBeClosed
        fun pendingCount(id: String): HttpResponseFor<UploadPendingCountResponse> =
            pendingCount(id, UploadPendingCountParams.none())

        /** @see pendingCount */
        @MustBeClosed
        fun pendingCount(
            id: String,
            params: UploadPendingCountParams = UploadPendingCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadPendingCountResponse> =
            pendingCount(params.toBuilder().id(id).build(), requestOptions)

        /** @see pendingCount */
        @MustBeClosed
        fun pendingCount(
            id: String,
            params: UploadPendingCountParams = UploadPendingCountParams.none(),
        ): HttpResponseFor<UploadPendingCountResponse> =
            pendingCount(id, params, RequestOptions.none())

        /** @see pendingCount */
        @MustBeClosed
        fun pendingCount(
            params: UploadPendingCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadPendingCountResponse>

        /** @see pendingCount */
        @MustBeClosed
        fun pendingCount(
            params: UploadPendingCountParams
        ): HttpResponseFor<UploadPendingCountResponse> = pendingCount(params, RequestOptions.none())

        /** @see pendingCount */
        @MustBeClosed
        fun pendingCount(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadPendingCountResponse> =
            pendingCount(id, UploadPendingCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /external_connections/{id}/uploads/refresh`, but is
         * otherwise the same as [UploadService.refreshStatus].
         */
        @MustBeClosed
        fun refreshStatus(id: String): HttpResponseFor<UploadRefreshStatusResponse> =
            refreshStatus(id, UploadRefreshStatusParams.none())

        /** @see refreshStatus */
        @MustBeClosed
        fun refreshStatus(
            id: String,
            params: UploadRefreshStatusParams = UploadRefreshStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadRefreshStatusResponse> =
            refreshStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see refreshStatus */
        @MustBeClosed
        fun refreshStatus(
            id: String,
            params: UploadRefreshStatusParams = UploadRefreshStatusParams.none(),
        ): HttpResponseFor<UploadRefreshStatusResponse> =
            refreshStatus(id, params, RequestOptions.none())

        /** @see refreshStatus */
        @MustBeClosed
        fun refreshStatus(
            params: UploadRefreshStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadRefreshStatusResponse>

        /** @see refreshStatus */
        @MustBeClosed
        fun refreshStatus(
            params: UploadRefreshStatusParams
        ): HttpResponseFor<UploadRefreshStatusResponse> =
            refreshStatus(params, RequestOptions.none())

        /** @see refreshStatus */
        @MustBeClosed
        fun refreshStatus(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadRefreshStatusResponse> =
            refreshStatus(id, UploadRefreshStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /external_connections/{id}/uploads/{ticket_id}/retry`, but is otherwise the same as
         * [UploadService.retry].
         */
        @MustBeClosed
        fun retry(
            ticketId: String,
            params: UploadRetryParams,
        ): HttpResponseFor<UploadRetryResponse> = retry(ticketId, params, RequestOptions.none())

        /** @see retry */
        @MustBeClosed
        fun retry(
            ticketId: String,
            params: UploadRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadRetryResponse> =
            retry(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see retry */
        @MustBeClosed
        fun retry(params: UploadRetryParams): HttpResponseFor<UploadRetryResponse> =
            retry(params, RequestOptions.none())

        /** @see retry */
        @MustBeClosed
        fun retry(
            params: UploadRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadRetryResponse>
    }
}
