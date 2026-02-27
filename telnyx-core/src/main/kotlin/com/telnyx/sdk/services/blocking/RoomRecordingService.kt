// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.roomrecordings.RoomRecordingDeleteBulkParams
import com.telnyx.sdk.models.roomrecordings.RoomRecordingDeleteBulkResponse
import com.telnyx.sdk.models.roomrecordings.RoomRecordingDeleteParams
import com.telnyx.sdk.models.roomrecordings.RoomRecordingListPage
import com.telnyx.sdk.models.roomrecordings.RoomRecordingListParams
import com.telnyx.sdk.models.roomrecordings.RoomRecordingRetrieveParams
import com.telnyx.sdk.models.roomrecordings.RoomRecordingRetrieveResponse
import java.util.function.Consumer

/** Rooms Recordings operations. */
interface RoomRecordingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomRecordingService

    /** View a room recording. */
    fun retrieve(roomRecordingId: String): RoomRecordingRetrieveResponse =
        retrieve(roomRecordingId, RoomRecordingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomRecordingId: String,
        params: RoomRecordingRetrieveParams = RoomRecordingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomRecordingRetrieveResponse =
        retrieve(params.toBuilder().roomRecordingId(roomRecordingId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomRecordingId: String,
        params: RoomRecordingRetrieveParams = RoomRecordingRetrieveParams.none(),
    ): RoomRecordingRetrieveResponse = retrieve(roomRecordingId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoomRecordingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomRecordingRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RoomRecordingRetrieveParams): RoomRecordingRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        roomRecordingId: String,
        requestOptions: RequestOptions,
    ): RoomRecordingRetrieveResponse =
        retrieve(roomRecordingId, RoomRecordingRetrieveParams.none(), requestOptions)

    /** View a list of room recordings. */
    fun list(): RoomRecordingListPage = list(RoomRecordingListParams.none())

    /** @see list */
    fun list(
        params: RoomRecordingListParams = RoomRecordingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomRecordingListPage

    /** @see list */
    fun list(
        params: RoomRecordingListParams = RoomRecordingListParams.none()
    ): RoomRecordingListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RoomRecordingListPage =
        list(RoomRecordingListParams.none(), requestOptions)

    /** Synchronously delete a Room Recording. */
    fun delete(roomRecordingId: String) = delete(roomRecordingId, RoomRecordingDeleteParams.none())

    /** @see delete */
    fun delete(
        roomRecordingId: String,
        params: RoomRecordingDeleteParams = RoomRecordingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().roomRecordingId(roomRecordingId).build(), requestOptions)

    /** @see delete */
    fun delete(
        roomRecordingId: String,
        params: RoomRecordingDeleteParams = RoomRecordingDeleteParams.none(),
    ) = delete(roomRecordingId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RoomRecordingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: RoomRecordingDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(roomRecordingId: String, requestOptions: RequestOptions) =
        delete(roomRecordingId, RoomRecordingDeleteParams.none(), requestOptions)

    /** Delete several room recordings in a bulk. */
    fun deleteBulk(): RoomRecordingDeleteBulkResponse =
        deleteBulk(RoomRecordingDeleteBulkParams.none())

    /** @see deleteBulk */
    fun deleteBulk(
        params: RoomRecordingDeleteBulkParams = RoomRecordingDeleteBulkParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomRecordingDeleteBulkResponse

    /** @see deleteBulk */
    fun deleteBulk(
        params: RoomRecordingDeleteBulkParams = RoomRecordingDeleteBulkParams.none()
    ): RoomRecordingDeleteBulkResponse = deleteBulk(params, RequestOptions.none())

    /** @see deleteBulk */
    fun deleteBulk(requestOptions: RequestOptions): RoomRecordingDeleteBulkResponse =
        deleteBulk(RoomRecordingDeleteBulkParams.none(), requestOptions)

    /**
     * A view of [RoomRecordingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RoomRecordingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /room_recordings/{room_recording_id}`, but is
         * otherwise the same as [RoomRecordingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(roomRecordingId: String): HttpResponseFor<RoomRecordingRetrieveResponse> =
            retrieve(roomRecordingId, RoomRecordingRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomRecordingId: String,
            params: RoomRecordingRetrieveParams = RoomRecordingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomRecordingRetrieveResponse> =
            retrieve(params.toBuilder().roomRecordingId(roomRecordingId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomRecordingId: String,
            params: RoomRecordingRetrieveParams = RoomRecordingRetrieveParams.none(),
        ): HttpResponseFor<RoomRecordingRetrieveResponse> =
            retrieve(roomRecordingId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoomRecordingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomRecordingRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoomRecordingRetrieveParams
        ): HttpResponseFor<RoomRecordingRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomRecordingId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomRecordingRetrieveResponse> =
            retrieve(roomRecordingId, RoomRecordingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_recordings`, but is otherwise the same as
         * [RoomRecordingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<RoomRecordingListPage> = list(RoomRecordingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoomRecordingListParams = RoomRecordingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomRecordingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoomRecordingListParams = RoomRecordingListParams.none()
        ): HttpResponseFor<RoomRecordingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RoomRecordingListPage> =
            list(RoomRecordingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /room_recordings/{room_recording_id}`, but is
         * otherwise the same as [RoomRecordingService.delete].
         */
        @MustBeClosed
        fun delete(roomRecordingId: String): HttpResponse =
            delete(roomRecordingId, RoomRecordingDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            roomRecordingId: String,
            params: RoomRecordingDeleteParams = RoomRecordingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().roomRecordingId(roomRecordingId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            roomRecordingId: String,
            params: RoomRecordingDeleteParams = RoomRecordingDeleteParams.none(),
        ): HttpResponse = delete(roomRecordingId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RoomRecordingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RoomRecordingDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(roomRecordingId: String, requestOptions: RequestOptions): HttpResponse =
            delete(roomRecordingId, RoomRecordingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /room_recordings`, but is otherwise the same as
         * [RoomRecordingService.deleteBulk].
         */
        @MustBeClosed
        fun deleteBulk(): HttpResponseFor<RoomRecordingDeleteBulkResponse> =
            deleteBulk(RoomRecordingDeleteBulkParams.none())

        /** @see deleteBulk */
        @MustBeClosed
        fun deleteBulk(
            params: RoomRecordingDeleteBulkParams = RoomRecordingDeleteBulkParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomRecordingDeleteBulkResponse>

        /** @see deleteBulk */
        @MustBeClosed
        fun deleteBulk(
            params: RoomRecordingDeleteBulkParams = RoomRecordingDeleteBulkParams.none()
        ): HttpResponseFor<RoomRecordingDeleteBulkResponse> =
            deleteBulk(params, RequestOptions.none())

        /** @see deleteBulk */
        @MustBeClosed
        fun deleteBulk(
            requestOptions: RequestOptions
        ): HttpResponseFor<RoomRecordingDeleteBulkResponse> =
            deleteBulk(RoomRecordingDeleteBulkParams.none(), requestOptions)
    }
}
