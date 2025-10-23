// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.core.ClientOptions
import com.telnyx.sdk.core.RequestOptions
import com.telnyx.sdk.core.http.HttpResponseFor
import com.telnyx.sdk.models.roomparticipants.RoomParticipantListParams
import com.telnyx.sdk.models.roomparticipants.RoomParticipantListResponse
import com.telnyx.sdk.models.roomparticipants.RoomParticipantRetrieveParams
import com.telnyx.sdk.models.roomparticipants.RoomParticipantRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RoomParticipantServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RoomParticipantServiceAsync

    /** View a room participant. */
    fun retrieve(roomParticipantId: String): CompletableFuture<RoomParticipantRetrieveResponse> =
        retrieve(roomParticipantId, RoomParticipantRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        roomParticipantId: String,
        params: RoomParticipantRetrieveParams = RoomParticipantRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomParticipantRetrieveResponse> =
        retrieve(params.toBuilder().roomParticipantId(roomParticipantId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        roomParticipantId: String,
        params: RoomParticipantRetrieveParams = RoomParticipantRetrieveParams.none(),
    ): CompletableFuture<RoomParticipantRetrieveResponse> =
        retrieve(roomParticipantId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RoomParticipantRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomParticipantRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: RoomParticipantRetrieveParams
    ): CompletableFuture<RoomParticipantRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        roomParticipantId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<RoomParticipantRetrieveResponse> =
        retrieve(roomParticipantId, RoomParticipantRetrieveParams.none(), requestOptions)

    /** View a list of room participants. */
    fun list(): CompletableFuture<RoomParticipantListResponse> =
        list(RoomParticipantListParams.none())

    /** @see list */
    fun list(
        params: RoomParticipantListParams = RoomParticipantListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoomParticipantListResponse>

    /** @see list */
    fun list(
        params: RoomParticipantListParams = RoomParticipantListParams.none()
    ): CompletableFuture<RoomParticipantListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RoomParticipantListResponse> =
        list(RoomParticipantListParams.none(), requestOptions)

    /**
     * A view of [RoomParticipantServiceAsync] that provides access to raw HTTP responses for each
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
        ): RoomParticipantServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /room_participants/{room_participant_id}`, but is
         * otherwise the same as [RoomParticipantServiceAsync.retrieve].
         */
        fun retrieve(
            roomParticipantId: String
        ): CompletableFuture<HttpResponseFor<RoomParticipantRetrieveResponse>> =
            retrieve(roomParticipantId, RoomParticipantRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            roomParticipantId: String,
            params: RoomParticipantRetrieveParams = RoomParticipantRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomParticipantRetrieveResponse>> =
            retrieve(
                params.toBuilder().roomParticipantId(roomParticipantId).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            roomParticipantId: String,
            params: RoomParticipantRetrieveParams = RoomParticipantRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<RoomParticipantRetrieveResponse>> =
            retrieve(roomParticipantId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RoomParticipantRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomParticipantRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: RoomParticipantRetrieveParams
        ): CompletableFuture<HttpResponseFor<RoomParticipantRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            roomParticipantId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RoomParticipantRetrieveResponse>> =
            retrieve(roomParticipantId, RoomParticipantRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /room_participants`, but is otherwise the same as
         * [RoomParticipantServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RoomParticipantListResponse>> =
            list(RoomParticipantListParams.none())

        /** @see list */
        fun list(
            params: RoomParticipantListParams = RoomParticipantListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoomParticipantListResponse>>

        /** @see list */
        fun list(
            params: RoomParticipantListParams = RoomParticipantListParams.none()
        ): CompletableFuture<HttpResponseFor<RoomParticipantListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RoomParticipantListResponse>> =
            list(RoomParticipantListParams.none(), requestOptions)
    }
}
