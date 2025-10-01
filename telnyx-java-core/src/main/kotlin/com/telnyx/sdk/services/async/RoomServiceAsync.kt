// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

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
import com.telnyx.sdk.services.async.rooms.ActionServiceAsync
import com.telnyx.sdk.services.async.rooms.SessionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RoomServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomServiceAsync

    fun actions(): ActionServiceAsync

    fun sessions(): SessionServiceAsync

    /** Synchronously create a Room. */
    fun create(): CompletableFuture<RoomCreateResponse> = create(RoomCreateParams.none())

    /** @see create */
    fun create(
        params: RoomCreateParams = RoomCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomCreateResponse>

    /** @see create */
    fun create(
        params: RoomCreateParams = RoomCreateParams.none()
    ): CompletableFuture<RoomCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<RoomCreateResponse> =
        create(RoomCreateParams.none(), requestOptions)

    /** View a room. */
    fun retrieve(roomId: String): CompletableFuture<RoomRetrieveResponse> =
        retrieve(roomId, RoomRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomId: String,
        params: RoomRetrieveParams = RoomRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomRetrieveResponse> =
        retrieve(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomId: String,
        params: RoomRetrieveParams = RoomRetrieveParams.none(),
    ): CompletableFuture<RoomRetrieveResponse> = retrieve(roomId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoomRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: RoomRetrieveParams): CompletableFuture<RoomRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        roomId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoomRetrieveResponse> =
        retrieve(roomId, RoomRetrieveParams.none(), requestOptions)

    /** Synchronously update a Room. */
    fun update(roomId: String): CompletableFuture<RoomUpdateResponse> =
        update(roomId, RoomUpdateParams.none())

    /** @see update */
    fun update(
        roomId: String,
        params: RoomUpdateParams = RoomUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomUpdateResponse> =
        update(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see update */
    fun update(
        roomId: String,
        params: RoomUpdateParams = RoomUpdateParams.none(),
    ): CompletableFuture<RoomUpdateResponse> = update(roomId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RoomUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomUpdateResponse>

    /** @see update */
    fun update(params: RoomUpdateParams): CompletableFuture<RoomUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        roomId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoomUpdateResponse> =
        update(roomId, RoomUpdateParams.none(), requestOptions)

    /** View a list of rooms. */
    fun list(): CompletableFuture<RoomListResponse> = list(RoomListParams.none())

    /** @see list */
    fun list(
        params: RoomListParams = RoomListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomListResponse>

    /** @see list */
    fun list(params: RoomListParams = RoomListParams.none()): CompletableFuture<RoomListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RoomListResponse> =
        list(RoomListParams.none(), requestOptions)

    /**
     * Synchronously delete a Room. Participants from that room will be kicked out, they won't be
     * able to join that room anymore, and you won't be charged anymore for that room.
     */
    fun delete(roomId: String): CompletableFuture<Void?> = delete(roomId, RoomDeleteParams.none())

    /** @see delete */
    fun delete(
        roomId: String,
        params: RoomDeleteParams = RoomDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().roomId(roomId).build(), requestOptions)

    /** @see delete */
    fun delete(
        roomId: String,
        params: RoomDeleteParams = RoomDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(roomId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RoomDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: RoomDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(roomId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(roomId, RoomDeleteParams.none(), requestOptions)

    /** A view of [RoomServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomServiceAsync.WithRawResponse

        fun actions(): ActionServiceAsync.WithRawResponse

        fun sessions(): SessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /rooms`, but is otherwise the same as
         * [RoomServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<RoomCreateResponse>> =
            create(RoomCreateParams.none())

        /** @see create */
        fun create(
            params: RoomCreateParams = RoomCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomCreateResponse>>

        /** @see create */
        fun create(
            params: RoomCreateParams = RoomCreateParams.none()
        ): CompletableFuture<HttpResponseFor<RoomCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoomCreateResponse>> =
            create(RoomCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rooms/{room_id}`, but is otherwise the same as
         * [RoomServiceAsync.retrieve].
         */
        fun retrieve(roomId: String): CompletableFuture<HttpResponseFor<RoomRetrieveResponse>> =
            retrieve(roomId, RoomRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            roomId: String,
            params: RoomRetrieveParams = RoomRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomRetrieveResponse>> =
            retrieve(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            roomId: String,
            params: RoomRetrieveParams = RoomRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RoomRetrieveResponse>> =
            retrieve(roomId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RoomRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RoomRetrieveParams
        ): CompletableFuture<HttpResponseFor<RoomRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            roomId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoomRetrieveResponse>> =
            retrieve(roomId, RoomRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /rooms/{room_id}`, but is otherwise the same as
         * [RoomServiceAsync.update].
         */
        fun update(roomId: String): CompletableFuture<HttpResponseFor<RoomUpdateResponse>> =
            update(roomId, RoomUpdateParams.none())

        /** @see update */
        fun update(
            roomId: String,
            params: RoomUpdateParams = RoomUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomUpdateResponse>> =
            update(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see update */
        fun update(
            roomId: String,
            params: RoomUpdateParams = RoomUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<RoomUpdateResponse>> =
            update(roomId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RoomUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomUpdateResponse>>

        /** @see update */
        fun update(
            params: RoomUpdateParams
        ): CompletableFuture<HttpResponseFor<RoomUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            roomId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoomUpdateResponse>> =
            update(roomId, RoomUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /rooms`, but is otherwise the same as
         * [RoomServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RoomListResponse>> =
            list(RoomListParams.none())

        /** @see list */
        fun list(
            params: RoomListParams = RoomListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomListResponse>>

        /** @see list */
        fun list(
            params: RoomListParams = RoomListParams.none()
        ): CompletableFuture<HttpResponseFor<RoomListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoomListResponse>> =
            list(RoomListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /rooms/{room_id}`, but is otherwise the same as
         * [RoomServiceAsync.delete].
         */
        fun delete(roomId: String): CompletableFuture<HttpResponse> =
            delete(roomId, RoomDeleteParams.none())

        /** @see delete */
        fun delete(
            roomId: String,
            params: RoomDeleteParams = RoomDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().roomId(roomId).build(), requestOptions)

        /** @see delete */
        fun delete(
            roomId: String,
            params: RoomDeleteParams = RoomDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(roomId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RoomDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: RoomDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            roomId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> = delete(roomId, RoomDeleteParams.none(), requestOptions)
    }
}
