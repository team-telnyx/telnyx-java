// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponse
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.rooms.RoomCreateParams
import com.telnyx.sdk.models.rooms.RoomCreateResponse
import com.telnyx.sdk.models.rooms.RoomDeleteParams
import com.telnyx.sdk.models.rooms.RoomListParams
import com.telnyx.sdk.models.rooms.RoomListResponse
import com.telnyx.sdk.models.rooms.RoomRetrieveParams
import com.telnyx.sdk.models.rooms.RoomRetrieveResponse
import com.telnyx.sdk.models.rooms.RoomUpdateParams
import com.telnyx.sdk.models.rooms.RoomUpdateResponse
import com.telnyx.sdk.services.blocking.rooms.ActionService
import com.telnyx.sdk.services.blocking.rooms.SessionService
import java.util.function.Consumer

interface RoomService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomService

    fun actions(): ActionService

    fun sessions(): SessionService

    /** Synchronously create a Room. */
    fun create(): RoomCreateResponse = create(RoomCreateParams.none())

    /** @see create */
    fun create(
        params: RoomCreateParams = RoomCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomCreateResponse

    /** @see create */
    fun create(params: RoomCreateParams = RoomCreateParams.none()): RoomCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): RoomCreateResponse =
        create(RoomCreateParams.none(), requestOptions)

    /** View a room. */
    fun retrieve(roomId: String): RoomRetrieveResponse = retrieve(roomId, RoomRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomId: String,
        params: RoomRetrieveParams = RoomRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomRetrieveResponse = retrieve(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomId: String,
        params: RoomRetrieveParams = RoomRetrieveParams.none(),
    ): RoomRetrieveResponse = retrieve(roomId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoomRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: RoomRetrieveParams): RoomRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(roomId: String, requestOptions: RequestOptions): RoomRetrieveResponse =
        retrieve(roomId, RoomRetrieveParams.none(), requestOptions)

    /** Synchronously update a Room. */
    fun update(roomId: String): RoomUpdateResponse = update(roomId, RoomUpdateParams.none())

    /** @see update */
    fun update(
        roomId: String,
        params: RoomUpdateParams = RoomUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomUpdateResponse = update(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see update */
    fun update(
        roomId: String,
        params: RoomUpdateParams = RoomUpdateParams.none(),
    ): RoomUpdateResponse = update(roomId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RoomUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomUpdateResponse

    /** @see update */
    fun update(params: RoomUpdateParams): RoomUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(roomId: String, requestOptions: RequestOptions): RoomUpdateResponse =
        update(roomId, RoomUpdateParams.none(), requestOptions)

    /** View a list of rooms. */
    fun list(): RoomListResponse = list(RoomListParams.none())

    /** @see list */
    fun list(
        params: RoomListParams = RoomListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoomListResponse

    /** @see list */
    fun list(params: RoomListParams = RoomListParams.none()): RoomListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RoomListResponse =
        list(RoomListParams.none(), requestOptions)

    /**
     * Synchronously delete a Room. Participants from that room will be kicked out, they won't be
     * able to join that room anymore, and you won't be charged anymore for that room.
     */
    fun delete(roomId: String) = delete(roomId, RoomDeleteParams.none())

    /** @see delete */
    fun delete(
        roomId: String,
        params: RoomDeleteParams = RoomDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see delete */
    fun delete(roomId: String, params: RoomDeleteParams = RoomDeleteParams.none()) =
        delete(roomId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: RoomDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: RoomDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(roomId: String, requestOptions: RequestOptions) =
        delete(roomId, RoomDeleteParams.none(), requestOptions)

    /** A view of [RoomService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomService.WithRawResponse

        fun actions(): ActionService.WithRawResponse

        fun sessions(): SessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /rooms`, but is otherwise the same as
         * [RoomService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<RoomCreateResponse> = create(RoomCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RoomCreateParams = RoomCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: RoomCreateParams = RoomCreateParams.none()
        ): HttpResponseFor<RoomCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<RoomCreateResponse> =
            create(RoomCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rooms/{room_id}`, but is otherwise the same as
         * [RoomService.retrieve].
         */
        @MustBeClosed
        fun retrieve(roomId: String): HttpResponseFor<RoomRetrieveResponse> =
            retrieve(roomId, RoomRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomId: String,
            params: RoomRetrieveParams = RoomRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomRetrieveResponse> =
            retrieve(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomId: String,
            params: RoomRetrieveParams = RoomRetrieveParams.none(),
        ): HttpResponseFor<RoomRetrieveResponse> = retrieve(roomId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RoomRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RoomRetrieveParams): HttpResponseFor<RoomRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            roomId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomRetrieveResponse> =
            retrieve(roomId, RoomRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /rooms/{room_id}`, but is otherwise the same as
         * [RoomService.update].
         */
        @MustBeClosed
        fun update(roomId: String): HttpResponseFor<RoomUpdateResponse> =
            update(roomId, RoomUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            roomId: String,
            params: RoomUpdateParams = RoomUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomUpdateResponse> =
            update(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            roomId: String,
            params: RoomUpdateParams = RoomUpdateParams.none(),
        ): HttpResponseFor<RoomUpdateResponse> = update(roomId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RoomUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: RoomUpdateParams): HttpResponseFor<RoomUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            roomId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoomUpdateResponse> =
            update(roomId, RoomUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rooms`, but is otherwise the same as
         * [RoomService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<RoomListResponse> = list(RoomListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoomListParams = RoomListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoomListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RoomListParams = RoomListParams.none()
        ): HttpResponseFor<RoomListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RoomListResponse> =
            list(RoomListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /rooms/{room_id}`, but is otherwise the same as
         * [RoomService.delete].
         */
        @MustBeClosed
        fun delete(roomId: String): HttpResponse = delete(roomId, RoomDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            roomId: String,
            params: RoomDeleteParams = RoomDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            roomId: String,
            params: RoomDeleteParams = RoomDeleteParams.none(),
        ): HttpResponse = delete(roomId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RoomDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: RoomDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(roomId: String, requestOptions: RequestOptions): HttpResponse =
            delete(roomId, RoomDeleteParams.none(), requestOptions)
    }
}
