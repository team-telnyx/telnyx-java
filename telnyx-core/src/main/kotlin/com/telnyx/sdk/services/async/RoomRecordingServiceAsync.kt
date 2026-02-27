// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.roomrecordings.RoomRecordingDeleteBulkParams
import com.telnyx.sdk.models.roomrecordings.RoomRecordingDeleteBulkResponse
import com.telnyx.sdk.models.roomrecordings.RoomRecordingDeleteParams
import com.telnyx.sdk.models.roomrecordings.RoomRecordingListPageAsync
import com.telnyx.sdk.models.roomrecordings.RoomRecordingListParams
import com.telnyx.sdk.models.roomrecordings.RoomRecordingRetrieveParams
import com.telnyx.sdk.models.roomrecordings.RoomRecordingRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Rooms Recordings operations. */
interface RoomRecordingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomRecordingServiceAsync

    /** View a room recording. */
    fun retrieve(roomRecordingId: String): CompletableFuture<RoomRecordingRetrieveResponse> =
        retrieve(roomRecordingId, RoomRecordingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomRecordingId: String,
        params: RoomRecordingRetrieveParams = RoomRecordingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomRecordingRetrieveResponse> =
        retrieve(params.toBuilder().roomRecordingId(roomRecordingId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomRecordingId: String,
        params: RoomRecordingRetrieveParams = RoomRecordingRetrieveParams.none(),
    ): CompletableFuture<RoomRecordingRetrieveResponse> =
        retrieve(roomRecordingId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoomRecordingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomRecordingRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RoomRecordingRetrieveParams
    ): CompletableFuture<RoomRecordingRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        roomRecordingId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoomRecordingRetrieveResponse> =
        retrieve(roomRecordingId, RoomRecordingRetrieveParams.none(), requestOptions)

    /** View a list of room recordings. */
    fun list(): CompletableFuture<RoomRecordingListPageAsync> = list(RoomRecordingListParams.none())

    /** @see list */
    fun list(
        params: RoomRecordingListParams = RoomRecordingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomRecordingListPageAsync>

    /** @see list */
    fun list(
        params: RoomRecordingListParams = RoomRecordingListParams.none()
    ): CompletableFuture<RoomRecordingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RoomRecordingListPageAsync> =
        list(RoomRecordingListParams.none(), requestOptions)

    /** Synchronously delete a Room Recording. */
    fun delete(roomRecordingId: String): CompletableFuture<Void?> =
        delete(roomRecordingId, RoomRecordingDeleteParams.none())

    /** @see delete */
    fun delete(
        roomRecordingId: String,
        params: RoomRecordingDeleteParams = RoomRecordingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().roomRecordingId(roomRecordingId).build(), requestOptions)

    /** @see delete */
    fun delete(
        roomRecordingId: String,
        params: RoomRecordingDeleteParams = RoomRecordingDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(roomRecordingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RoomRecordingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RoomRecordingDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(roomRecordingId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(roomRecordingId, RoomRecordingDeleteParams.none(), requestOptions)

    /** Delete several room recordings in a bulk. */
    fun deleteBulk(): CompletableFuture<RoomRecordingDeleteBulkResponse> =
        deleteBulk(RoomRecordingDeleteBulkParams.none())

    /** @see deleteBulk */
    fun deleteBulk(
        params: RoomRecordingDeleteBulkParams = RoomRecordingDeleteBulkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomRecordingDeleteBulkResponse>

    /** @see deleteBulk */
    fun deleteBulk(
        params: RoomRecordingDeleteBulkParams = RoomRecordingDeleteBulkParams.none()
    ): CompletableFuture<RoomRecordingDeleteBulkResponse> =
        deleteBulk(params, RequestOptions.none())

    /** @see deleteBulk */
    fun deleteBulk(
        requestOptions: RequestOptions
    ): CompletableFuture<RoomRecordingDeleteBulkResponse> =
        deleteBulk(RoomRecordingDeleteBulkParams.none(), requestOptions)

    /**
     * A view of [RoomRecordingServiceAsync] that provides access to raw HTTP responses for each
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
        ): RoomRecordingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /room_recordings/{room_recording_id}`, but is
         * otherwise the same as [RoomRecordingServiceAsync.retrieve].
         */
        fun retrieve(
            roomRecordingId: String
        ): CompletableFuture<HttpResponseFor<RoomRecordingRetrieveResponse>> =
            retrieve(roomRecordingId, RoomRecordingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            roomRecordingId: String,
            params: RoomRecordingRetrieveParams = RoomRecordingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomRecordingRetrieveResponse>> =
            retrieve(params.toBuilder().roomRecordingId(roomRecordingId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            roomRecordingId: String,
            params: RoomRecordingRetrieveParams = RoomRecordingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RoomRecordingRetrieveResponse>> =
            retrieve(roomRecordingId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RoomRecordingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomRecordingRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RoomRecordingRetrieveParams
        ): CompletableFuture<HttpResponseFor<RoomRecordingRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            roomRecordingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoomRecordingRetrieveResponse>> =
            retrieve(roomRecordingId, RoomRecordingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_recordings`, but is otherwise the same as
         * [RoomRecordingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RoomRecordingListPageAsync>> =
            list(RoomRecordingListParams.none())

        /** @see list */
        fun list(
            params: RoomRecordingListParams = RoomRecordingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomRecordingListPageAsync>>

        /** @see list */
        fun list(
            params: RoomRecordingListParams = RoomRecordingListParams.none()
        ): CompletableFuture<HttpResponseFor<RoomRecordingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoomRecordingListPageAsync>> =
            list(RoomRecordingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /room_recordings/{room_recording_id}`, but is
         * otherwise the same as [RoomRecordingServiceAsync.delete].
         */
        fun delete(roomRecordingId: String): CompletableFuture<HttpResponse> =
            delete(roomRecordingId, RoomRecordingDeleteParams.none())

        /** @see delete */
        fun delete(
            roomRecordingId: String,
            params: RoomRecordingDeleteParams = RoomRecordingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().roomRecordingId(roomRecordingId).build(), requestOptions)

        /** @see delete */
        fun delete(
            roomRecordingId: String,
            params: RoomRecordingDeleteParams = RoomRecordingDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(roomRecordingId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RoomRecordingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RoomRecordingDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            roomRecordingId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(roomRecordingId, RoomRecordingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /room_recordings`, but is otherwise the same as
         * [RoomRecordingServiceAsync.deleteBulk].
         */
        fun deleteBulk(): CompletableFuture<HttpResponseFor<RoomRecordingDeleteBulkResponse>> =
            deleteBulk(RoomRecordingDeleteBulkParams.none())

        /** @see deleteBulk */
        fun deleteBulk(
            params: RoomRecordingDeleteBulkParams = RoomRecordingDeleteBulkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomRecordingDeleteBulkResponse>>

        /** @see deleteBulk */
        fun deleteBulk(
            params: RoomRecordingDeleteBulkParams = RoomRecordingDeleteBulkParams.none()
        ): CompletableFuture<HttpResponseFor<RoomRecordingDeleteBulkResponse>> =
            deleteBulk(params, RequestOptions.none())

        /** @see deleteBulk */
        fun deleteBulk(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoomRecordingDeleteBulkResponse>> =
            deleteBulk(RoomRecordingDeleteBulkParams.none(), requestOptions)
    }
}
