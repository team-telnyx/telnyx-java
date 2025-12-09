// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.externalconnections

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadCreateResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadListPageAsync
import com.telnyx.sdk.models.externalconnections.uploads.UploadListParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadPendingCountParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadPendingCountResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRefreshStatusParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRefreshStatusResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetrieveResponse
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryParams
import com.telnyx.sdk.models.externalconnections.uploads.UploadRetryResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UploadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadServiceAsync

    /**
     * Creates a new Upload request to Microsoft teams with the included phone numbers. Only one of
     * civic_address_id or location_id must be provided, not both. The maximum allowed phone numbers
     * for the numbers_ids array is 1000.
     */
    fun create(id: String, params: UploadCreateParams): CompletableFuture<UploadCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: UploadCreateParams): CompletableFuture<UploadCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadCreateResponse>

    /** Return the details of an Upload request and its phone numbers. */
    fun retrieve(
        ticketId: String,
        params: UploadRetrieveParams,
    ): CompletableFuture<UploadRetrieveResponse> = retrieve(ticketId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        ticketId: String,
        params: UploadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadRetrieveResponse> =
        retrieve(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: UploadRetrieveParams): CompletableFuture<UploadRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UploadRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadRetrieveResponse>

    /** Returns a list of your Upload requests for the given external connection. */
    fun list(id: String): CompletableFuture<UploadListPageAsync> = list(id, UploadListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: UploadListParams = UploadListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadListPageAsync> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: UploadListParams = UploadListParams.none(),
    ): CompletableFuture<UploadListPageAsync> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: UploadListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadListPageAsync>

    /** @see list */
    fun list(params: UploadListParams): CompletableFuture<UploadListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<UploadListPageAsync> =
        list(id, UploadListParams.none(), requestOptions)

    /** Returns the count of all pending upload requests for the given external connection. */
    fun pendingCount(id: String): CompletableFuture<UploadPendingCountResponse> =
        pendingCount(id, UploadPendingCountParams.none())

    /** @see pendingCount */
    fun pendingCount(
        id: String,
        params: UploadPendingCountParams = UploadPendingCountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadPendingCountResponse> =
        pendingCount(params.toBuilder().id(id).build(), requestOptions)

    /** @see pendingCount */
    fun pendingCount(
        id: String,
        params: UploadPendingCountParams = UploadPendingCountParams.none(),
    ): CompletableFuture<UploadPendingCountResponse> =
        pendingCount(id, params, RequestOptions.none())

    /** @see pendingCount */
    fun pendingCount(
        params: UploadPendingCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadPendingCountResponse>

    /** @see pendingCount */
    fun pendingCount(
        params: UploadPendingCountParams
    ): CompletableFuture<UploadPendingCountResponse> = pendingCount(params, RequestOptions.none())

    /** @see pendingCount */
    fun pendingCount(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UploadPendingCountResponse> =
        pendingCount(id, UploadPendingCountParams.none(), requestOptions)

    /**
     * Forces a recheck of the status of all pending Upload requests for the given external
     * connection in the background.
     */
    fun refreshStatus(id: String): CompletableFuture<UploadRefreshStatusResponse> =
        refreshStatus(id, UploadRefreshStatusParams.none())

    /** @see refreshStatus */
    fun refreshStatus(
        id: String,
        params: UploadRefreshStatusParams = UploadRefreshStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadRefreshStatusResponse> =
        refreshStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see refreshStatus */
    fun refreshStatus(
        id: String,
        params: UploadRefreshStatusParams = UploadRefreshStatusParams.none(),
    ): CompletableFuture<UploadRefreshStatusResponse> =
        refreshStatus(id, params, RequestOptions.none())

    /** @see refreshStatus */
    fun refreshStatus(
        params: UploadRefreshStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadRefreshStatusResponse>

    /** @see refreshStatus */
    fun refreshStatus(
        params: UploadRefreshStatusParams
    ): CompletableFuture<UploadRefreshStatusResponse> = refreshStatus(params, RequestOptions.none())

    /** @see refreshStatus */
    fun refreshStatus(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UploadRefreshStatusResponse> =
        refreshStatus(id, UploadRefreshStatusParams.none(), requestOptions)

    /**
     * If there were any errors during the upload process, this endpoint will retry the upload
     * request. In some cases this will reattempt the existing upload request, in other cases it may
     * create a new upload request. Please check the ticket_id in the response to determine if a new
     * upload request was created.
     */
    fun retry(ticketId: String, params: UploadRetryParams): CompletableFuture<UploadRetryResponse> =
        retry(ticketId, params, RequestOptions.none())

    /** @see retry */
    fun retry(
        ticketId: String,
        params: UploadRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadRetryResponse> =
        retry(params.toBuilder().ticketId(ticketId).build(), requestOptions)

    /** @see retry */
    fun retry(params: UploadRetryParams): CompletableFuture<UploadRetryResponse> =
        retry(params, RequestOptions.none())

    /** @see retry */
    fun retry(
        params: UploadRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadRetryResponse>

    /**
     * A view of [UploadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UploadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /external_connections/{id}/uploads`, but is
         * otherwise the same as [UploadServiceAsync.create].
         */
        fun create(
            id: String,
            params: UploadCreateParams,
        ): CompletableFuture<HttpResponseFor<UploadCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: UploadCreateParams
        ): CompletableFuture<HttpResponseFor<UploadCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/uploads/{ticket_id}`, but
         * is otherwise the same as [UploadServiceAsync.retrieve].
         */
        fun retrieve(
            ticketId: String,
            params: UploadRetrieveParams,
        ): CompletableFuture<HttpResponseFor<UploadRetrieveResponse>> =
            retrieve(ticketId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            ticketId: String,
            params: UploadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadRetrieveResponse>> =
            retrieve(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: UploadRetrieveParams
        ): CompletableFuture<HttpResponseFor<UploadRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UploadRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/uploads`, but is
         * otherwise the same as [UploadServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<UploadListPageAsync>> =
            list(id, UploadListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: UploadListParams = UploadListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadListPageAsync>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: UploadListParams = UploadListParams.none(),
        ): CompletableFuture<HttpResponseFor<UploadListPageAsync>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: UploadListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadListPageAsync>>

        /** @see list */
        fun list(
            params: UploadListParams
        ): CompletableFuture<HttpResponseFor<UploadListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadListPageAsync>> =
            list(id, UploadListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /external_connections/{id}/uploads/status`, but is
         * otherwise the same as [UploadServiceAsync.pendingCount].
         */
        fun pendingCount(
            id: String
        ): CompletableFuture<HttpResponseFor<UploadPendingCountResponse>> =
            pendingCount(id, UploadPendingCountParams.none())

        /** @see pendingCount */
        fun pendingCount(
            id: String,
            params: UploadPendingCountParams = UploadPendingCountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadPendingCountResponse>> =
            pendingCount(params.toBuilder().id(id).build(), requestOptions)

        /** @see pendingCount */
        fun pendingCount(
            id: String,
            params: UploadPendingCountParams = UploadPendingCountParams.none(),
        ): CompletableFuture<HttpResponseFor<UploadPendingCountResponse>> =
            pendingCount(id, params, RequestOptions.none())

        /** @see pendingCount */
        fun pendingCount(
            params: UploadPendingCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadPendingCountResponse>>

        /** @see pendingCount */
        fun pendingCount(
            params: UploadPendingCountParams
        ): CompletableFuture<HttpResponseFor<UploadPendingCountResponse>> =
            pendingCount(params, RequestOptions.none())

        /** @see pendingCount */
        fun pendingCount(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadPendingCountResponse>> =
            pendingCount(id, UploadPendingCountParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /external_connections/{id}/uploads/refresh`, but is
         * otherwise the same as [UploadServiceAsync.refreshStatus].
         */
        fun refreshStatus(
            id: String
        ): CompletableFuture<HttpResponseFor<UploadRefreshStatusResponse>> =
            refreshStatus(id, UploadRefreshStatusParams.none())

        /** @see refreshStatus */
        fun refreshStatus(
            id: String,
            params: UploadRefreshStatusParams = UploadRefreshStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadRefreshStatusResponse>> =
            refreshStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see refreshStatus */
        fun refreshStatus(
            id: String,
            params: UploadRefreshStatusParams = UploadRefreshStatusParams.none(),
        ): CompletableFuture<HttpResponseFor<UploadRefreshStatusResponse>> =
            refreshStatus(id, params, RequestOptions.none())

        /** @see refreshStatus */
        fun refreshStatus(
            params: UploadRefreshStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadRefreshStatusResponse>>

        /** @see refreshStatus */
        fun refreshStatus(
            params: UploadRefreshStatusParams
        ): CompletableFuture<HttpResponseFor<UploadRefreshStatusResponse>> =
            refreshStatus(params, RequestOptions.none())

        /** @see refreshStatus */
        fun refreshStatus(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadRefreshStatusResponse>> =
            refreshStatus(id, UploadRefreshStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /external_connections/{id}/uploads/{ticket_id}/retry`, but is otherwise the same as
         * [UploadServiceAsync.retry].
         */
        fun retry(
            ticketId: String,
            params: UploadRetryParams,
        ): CompletableFuture<HttpResponseFor<UploadRetryResponse>> =
            retry(ticketId, params, RequestOptions.none())

        /** @see retry */
        fun retry(
            ticketId: String,
            params: UploadRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadRetryResponse>> =
            retry(params.toBuilder().ticketId(ticketId).build(), requestOptions)

        /** @see retry */
        fun retry(
            params: UploadRetryParams
        ): CompletableFuture<HttpResponseFor<UploadRetryResponse>> =
            retry(params, RequestOptions.none())

        /** @see retry */
        fun retry(
            params: UploadRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadRetryResponse>>
    }
}
